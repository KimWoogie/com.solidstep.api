package com.solidstep.api.ssr.utils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solidstep.api.ssr.constants.SSRApiConstants;
import com.solidstep.api.ssr.exception.SSRApiRuntimeException;

public class SSRApiUtils {

	public static boolean isEmptyJsonValue(String jsonValue){
		if("null".equals(jsonValue) || "".equals(jsonValue) || jsonValue == null){
			return true;
		}
		return false;
	}
	
	public static String replaceLFCRtoEmptyString(String value){
		String replaceValue = value;
		replaceValue = replaceValue.replaceAll("\r\n", " ");
		replaceValue = replaceValue.replaceAll("\n", " ");
		replaceValue = replaceValue.replaceAll(System.getProperty("line.separator"), " ");
		return replaceValue;
	}
	
	@SuppressWarnings("all")
	public static List<Map<String, Object>> exceptFieldsOfObject(Object requestObject, String[] exceptFieldNames){
		Class<? extends Object> clazz = requestObject.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String methodPrefix = SSRApiConstants.OBJECT_REFLECTION_GETTER_PREFIX;
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		for(Field field : fields){
			String fieldName = field.getName();
			if(!isInArray(fieldName, exceptFieldNames)){
				try {
					Method method = clazz.getMethod(methodPrefix + firstCharaterToUpperCase(fieldName), null);
					Object invokeResult = method.invoke(requestObject, null);
					if(invokeResult != null){
						Map<String, Object> resultMap = new HashMap<String, Object>();
						resultMap.put(fieldName, invokeResult);
						resultList.add(resultMap);
					}
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return resultList;
	}
	
	@SuppressWarnings("all")
	public static List<Map<String, Object>> extractFieldsAndValues(Object targetObject){
		Class<? extends Object> clazz = targetObject.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String methodPrefix = SSRApiConstants.OBJECT_REFLECTION_GETTER_PREFIX;
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		for(Field field : fields){
			String fieldName = field.getName();
			try {
				Method method = clazz.getMethod(methodPrefix + firstCharaterToUpperCase(fieldName), null);
				Object invokeResult = method.invoke(targetObject, null);
				Map<String, Object> resultMap = new HashMap<String, Object>();
				resultMap.put(fieldName, invokeResult);
				resultList.add(resultMap);
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}
	
	public static String firstCharaterToUpperCase(String source){
		char firstCharacter = source.charAt(0);
		source = String.valueOf(firstCharacter).toUpperCase().concat(source.substring(1));
		return source;
	}
	
	public static boolean isInArray(String source, String[] array){
		for(String target : array){
			if(target.equals(source)){
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("all")
	public static Object getValueOfObject(Object targetObject, String targetFieldName){
		Class<? extends Object> clazz = targetObject.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String methodPrefix = SSRApiConstants.OBJECT_REFLECTION_GETTER_PREFIX;
		for(Field field : fields){
			String fieldName = field.getName();
			if(fieldName.equals(targetFieldName)){
				try {
					Method method = clazz.getMethod(methodPrefix + firstCharaterToUpperCase(fieldName), null);
					Object invokeResult = method.invoke(targetObject, null);
					return invokeResult;
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				
			}
		}
		return null;
	}
	
	@SuppressWarnings("all")
	public static void setValueOfObject(Object targetObject, String targetFieldName, Object setValue, Class parameterClass){
		Class<? extends Object> clazz = targetObject.getClass();
		Field[] fields = clazz.getDeclaredFields();
		String methodPrefix = SSRApiConstants.OBJECT_REFLECTION_SETTER_PREFIX;
		for(Field field : fields){
			String fieldName = field.getName();
			if(fieldName.equals(targetFieldName)){
				try {
					Method method = clazz.getMethod(methodPrefix + firstCharaterToUpperCase(fieldName), parameterClass);
					method.invoke(targetObject, setValue);
					return;
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@SuppressWarnings("all")
	public static boolean hasFieldOfObject(Object targetObject, String targetFieldName){
		Class<? extends Object> clazz = targetObject.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields){
			String fieldName = field.getName();
			if(fieldName.equals(targetFieldName)){
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public static List<?> jsonArrayToCollectionList(Object clazz, String jsonString){
		List<Object> resultList = null;
		ObjectMapper objectMapper = null;
		try {
			objectMapper = new ObjectMapper();
			resultList = new ArrayList<Object>();
			JSONArray jsonArray = new JSONArray(jsonString);
			int length = jsonArray.length();
			for (int i = 0; i < length; i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				Iterator<String> keys = jsonObject.keys();
				while (keys.hasNext()) {
					String key = (String) keys.next();
					String value = jsonObject.getString(key);
					if(SSRApiUtils.isEmptyJsonValue(value)){
						jsonObject.put(key, "");
					}else{
						if(key.endsWith(SSRApiConstants.SSR_EPOCH_TIME_POSTPIX)){
							jsonObject.put(key, new BigDecimal(value).toString());
						}else{
							jsonObject.put(key, SSRApiUtils.replaceLFCRtoEmptyString(value));
						}
					}
				}
				Object readValue = objectMapper.readValue(jsonObject.toString(), (Class<Object>) clazz);
				resultList.add(readValue);
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return resultList;
	}

	public static JSONArray addAttributeToJsonArrayString(String jsonArrayString, String[] attributeNames) {
		if(StringUtils.isEmpty(jsonArrayString)){
			return null;
		}
		
		JSONArray jsonArray = null;
		try {
			jsonArray = new JSONArray(jsonArrayString);
			int length = jsonArray.length();
			for(int i=0; i<length; i++){
				for(String attributeName : attributeNames){
					jsonArray.getJSONObject(i).put(attributeName, "");
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return jsonArray;
	}

	public static JSONObject addAttributeToJsonObjectString(String jsonObjectString, String[] attributeNames) {
		if(StringUtils.isEmpty(jsonObjectString)){
			return null;
		}
		
		JSONObject jsonObject = null;
		try {
			jsonObject = new JSONObject(jsonObjectString);
			for(String attributeName : attributeNames){
				jsonObject.put(attributeName, "");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return jsonObject;
	}
	
	public static void initialize(Object ssrRequest){
		if(SSRApiUtils.hasFieldOfObject(ssrRequest, SSRApiConstants.SSR_API_PARAMETER_KEY_LIMIT)){
			Object limitObject = SSRApiUtils.getValueOfObject(ssrRequest, SSRApiConstants.SSR_API_PARAMETER_KEY_LIMIT);
			if(limitObject == null){
				SSRApiUtils.setValueOfObject(ssrRequest, SSRApiConstants.SSR_API_PARAMETER_KEY_LIMIT, String.valueOf(SSRApiConstants.SSR_API_RESULT_DEFAULT_LIMITS), String.class);
			}
			
			if(limitObject != null){
				if(limitObject instanceof String){
					int limitInt = Integer.parseInt((String) limitObject);
					if(limitInt > SSRApiConstants.SSR_API_RESULT_MAX_LIMITS){
						throw new SSRApiRuntimeException("[It was occurred when calling SSR API.] infomation : "+ssrRequest.toString());
					}
				}
			}
		}
		
		if(SSRApiUtils.hasFieldOfObject(ssrRequest, SSRApiConstants.SSR_API_PARAMETER_KEY_OFFSET)){
			Object offsetObject = SSRApiUtils.getValueOfObject(ssrRequest, SSRApiConstants.SSR_API_PARAMETER_KEY_OFFSET);
			if(offsetObject == null){
				SSRApiUtils.setValueOfObject(ssrRequest, SSRApiConstants.SSR_API_PARAMETER_KEY_OFFSET, String.valueOf(SSRApiConstants.SSR_API_RESULT_DEFAULT_OFFSET), String.class);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Object> listResultObjectMapping(Object clazz, String jsonString, String ssrApiResultKey){
		if(ssrApiResultKey == null){
			throw new SSRApiRuntimeException("[ssrApiResultKey] field is mandatory.");
		}
		
		List<Object> resultList = null;
		try {
			JSONObject jsonObject = new JSONObject(jsonString);
			String listResultKey = ssrApiResultKey;
			if(jsonObject.has(listResultKey)){
				ObjectMapper objectMapper = new ObjectMapper();
				resultList = new ArrayList<Object>();
				JSONArray jsonArray = jsonObject.getJSONArray(listResultKey);
				int length = jsonArray.length();
				for(int i=0;i<length;i++){
					JSONObject rowJSONData = jsonArray.getJSONObject(i);
					Iterator<String> rowJSONDataKeysIterator = rowJSONData.keys();
					List<String> rowJSONKeyList = new ArrayList<String>();
					while(rowJSONDataKeysIterator.hasNext()){
						String rowJSONKey = rowJSONDataKeysIterator.next();
						rowJSONKeyList.add(rowJSONKey);
						String jsonValue = rowJSONData.getString(rowJSONKey).trim();
						if(SSRApiUtils.isEmptyJsonValue(jsonValue)){
							rowJSONData.put(rowJSONKey, "");
						}else{
							rowJSONData.put(rowJSONKey, SSRApiUtils.replaceLFCRtoEmptyString(jsonValue));
						}
					}
					
					Object readValue = objectMapper.readValue(rowJSONData.toString(), (Class<Object>) clazz);
					resultList.add(readValue);
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultList;
	}
	
	@SuppressWarnings("unchecked")
	public static Object oneResultObjectMapping(Object clazz, String jsonString, String ssrApiResultKey){
		if(ssrApiResultKey == null){
			throw new SSRApiRuntimeException("[ssrApiResultKey] field is mandatory.");
		}
		
		Object readValue = null;
		try {
			JSONObject jsonObject = new JSONObject(jsonString);
			String listResultKey = ssrApiResultKey;
			if(jsonObject.has(listResultKey)){
				JSONObject resultJSONObject = jsonObject.getJSONObject(listResultKey);
				ObjectMapper objectMapper = new ObjectMapper();
				readValue = objectMapper.readValue(resultJSONObject.toString(), (Class<Object>) clazz);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readValue;
	}
	
	public static JSONObject resultInfoGenerate(String jsonString){
		JSONObject jsonObject = null;
		JSONObject infoJsonObject = null;
		try {
			jsonObject = new JSONObject(jsonString);
			String resultInfoKey = SSRApiConstants.SSR_API_RESULT_INFO_KEY;
			if(jsonObject.has(resultInfoKey)){
				infoJsonObject = jsonObject.getJSONObject(resultInfoKey);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return infoJsonObject;
	}
	
	public static String resultErrorInfo(String jsonString){
		JSONObject jsonObject = null;
		String errInfoString = null;
		try {
			jsonObject = new JSONObject(jsonString);
			String resultInfoKey = SSRApiConstants.SSR_API_RESULT_INFO_KEY_ERRINFO;
			if(jsonObject.has(resultInfoKey)){
				errInfoString = jsonObject.getString(resultInfoKey);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return errInfoString;
	}
}