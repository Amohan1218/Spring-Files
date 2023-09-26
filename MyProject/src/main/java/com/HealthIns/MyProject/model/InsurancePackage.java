package com.HealthIns.MyProject.model;

import java.util.Date;

public class InsurancePackage {
	private int inspId;
    private String inspTitle;
    private String inspDesc;
    private String inspStatus;
    private double inspRangeStart;
    private double inspRangeEnd;
    private int inspAgeLimitStart;
    private int inspAgeLimitEnd;
    private Date inspCDate;
	
    public InsurancePackage() {
		super();
	}

	public InsurancePackage(int inspId, String inspTitle, String inspDesc, String inspStatus, double inspRangeStart,
			double inspRangeEnd, int inspAgeLimitStart, int inspAgeLimitEnd, Date inspCDate) {
		super();
		this.inspId = inspId;
		this.inspTitle = inspTitle;
		this.inspDesc = inspDesc;
		this.inspStatus = inspStatus;
		this.inspRangeStart = inspRangeStart;
		this.inspRangeEnd = inspRangeEnd;
		this.inspAgeLimitStart = inspAgeLimitStart;
		this.inspAgeLimitEnd = inspAgeLimitEnd;
		this.inspCDate = inspCDate;
	}

	@Override
	public String toString() {
		return "InsurancePackage [inspId=" + inspId + ", inspTitle=" + inspTitle + ", inspDesc=" + inspDesc
				+ ", inspStatus=" + inspStatus + ", inspRangeStart=" + inspRangeStart + ", inspRangeEnd=" + inspRangeEnd
				+ ", inspAgeLimitStart=" + inspAgeLimitStart + ", inspAgeLimitEnd=" + inspAgeLimitEnd + ", inspCDate="
				+ inspCDate + "]";
	}

	public int getInspId() {
		return inspId;
	}

	public void setInspId(int inspId) {
		this.inspId = inspId;
	}

	public String getInspTitle() {
		return inspTitle;
	}

	public void setInspTitle(String inspTitle) {
		this.inspTitle = inspTitle;
	}

	public String getInspDesc() {
		return inspDesc;
	}

	public void setInspDesc(String inspDesc) {
		this.inspDesc = inspDesc;
	}

	public String getInspStatus() {
		return inspStatus;
	}

	public void setInspStatus(String inspStatus) {
		this.inspStatus = inspStatus;
	}

	public double getInspRangeStart() {
		return inspRangeStart;
	}

	public void setInspRangeStart(double inspRangeStart) {
		this.inspRangeStart = inspRangeStart;
	}

	public double getInspRangeEnd() {
		return inspRangeEnd;
	}

	public void setInspRangeEnd(double inspRangeEnd) {
		this.inspRangeEnd = inspRangeEnd;
	}

	public int getInspAgeLimitStart() {
		return inspAgeLimitStart;
	}

	public void setInspAgeLimitStart(int inspAgeLimitStart) {
		this.inspAgeLimitStart = inspAgeLimitStart;
	}

	public int getInspAgeLimitEnd() {
		return inspAgeLimitEnd;
	}

	public void setInspAgeLimitEnd(int inspAgeLimitEnd) {
		this.inspAgeLimitEnd = inspAgeLimitEnd;
	}

	public Date getInspCDate() {
		return inspCDate;
	}

	public void setInspCDate(Date inspCDate) {
		this.inspCDate = inspCDate;
	}
    
}
