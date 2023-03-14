package com.solidstep.api.ssr.constants;

public enum SSRExcelReportType {
	
	ALL_REPORT("1")
	,SUMMURY_REPORT("2")
	,GROUP_REPORT("3")
	,SEVERAL_REPORT("4")
	;
	
	private final String reportType;

	private SSRExcelReportType(String reportType) {
		this.reportType= reportType;
	}

	private String getValue() {
		return this.reportType;
	}
	
	public static SSRExcelReportType getSSRExcelReportType(String reportType) {
		SSRExcelReportType[] values = values();
		for (SSRExcelReportType ssrExcelReportType : values) {
			if(ssrExcelReportType.getValue().equals(reportType))
				return ssrExcelReportType;
		}
		return ALL_REPORT;
	}
}
