package com.HealthIns.MyProject.model;

import java.util.Date;

public class InsCompPolicy {
	private int iplcId;
    private int iplcCustId;
    private Date iplcCDate;
    private double iplcSumAssured;
    private Date iplcApplicableDate;
    private int iplcInspId;
    private double iplcYrlyPremAmount;
    private Date iplcExpDate;
    private int iplcAgntId;
	
    public InsCompPolicy() {
		super();
	}

	public InsCompPolicy(int iplcId, int iplcCustId, Date iplcCDate, double iplcSumAssured, Date iplcApplicableDate,
			int iplcInspId, double iplcYrlyPremAmount, Date iplcExpDate, int iplcAgntId) {
		super();
		this.iplcId = iplcId;
		this.iplcCustId = iplcCustId;
		this.iplcCDate = iplcCDate;
		this.iplcSumAssured = iplcSumAssured;
		this.iplcApplicableDate = iplcApplicableDate;
		this.iplcInspId = iplcInspId;
		this.iplcYrlyPremAmount = iplcYrlyPremAmount;
		this.iplcExpDate = iplcExpDate;
		this.iplcAgntId = iplcAgntId;
	}

	@Override
	public String toString() {
		return "InsCompPolicy [iplcId=" + iplcId + ", iplcCustId=" + iplcCustId + ", iplcCDate=" + iplcCDate
				+ ", iplcSumAssured=" + iplcSumAssured + ", iplcApplicableDate=" + iplcApplicableDate + ", iplcInspId="
				+ iplcInspId + ", iplcYrlyPremAmount=" + iplcYrlyPremAmount + ", iplcExpDate=" + iplcExpDate
				+ ", iplcAgntId=" + iplcAgntId + "]";
	}

	public int getIplcId() {
		return iplcId;
	}

	public void setIplcId(int iplcId) {
		this.iplcId = iplcId;
	}

	public int getIplcCustId() {
		return iplcCustId;
	}

	public void setIplcCustId(int iplcCustId) {
		this.iplcCustId = iplcCustId;
	}

	public Date getIplcCDate() {
		return iplcCDate;
	}

	public void setIplcCDate(Date iplcCDate) {
		this.iplcCDate = iplcCDate;
	}

	public double getIplcSumAssured() {
		return iplcSumAssured;
	}

	public void setIplcSumAssured(double iplcSumAssured) {
		this.iplcSumAssured = iplcSumAssured;
	}

	public Date getIplcApplicableDate() {
		return iplcApplicableDate;
	}

	public void setIplcApplicableDate(Date iplcApplicableDate) {
		this.iplcApplicableDate = iplcApplicableDate;
	}

	public int getIplcInspId() {
		return iplcInspId;
	}

	public void setIplcInspId(int iplcInspId) {
		this.iplcInspId = iplcInspId;
	}

	public double getIplcYrlyPremAmount() {
		return iplcYrlyPremAmount;
	}

	public void setIplcYrlyPremAmount(double iplcYrlyPremAmount) {
		this.iplcYrlyPremAmount = iplcYrlyPremAmount;
	}

	public Date getIplcExpDate() {
		return iplcExpDate;
	}

	public void setIplcExpDate(Date iplcExpDate) {
		this.iplcExpDate = iplcExpDate;
	}

	public int getIplcAgntId() {
		return iplcAgntId;
	}

	public void setIplcAgntId(int iplcAgntId) {
		this.iplcAgntId = iplcAgntId;
	}
}
