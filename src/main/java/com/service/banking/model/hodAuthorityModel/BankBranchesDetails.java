package com.service.banking.model.hodAuthorityModel;

public class BankBranchesDetails {
	
	
	private Integer branchId;
	private String branchName;
	private String bankName;
	private String ifsc;
	
	public BankBranchesDetails() {
	}
	
	
	

	public BankBranchesDetails(Integer branchId, String branchName, String ifsc) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.ifsc = ifsc;
	}




	public BankBranchesDetails(Integer branchId, String branchName, String bankName, String ifsc) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.bankName = bankName;
		this.ifsc = ifsc;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	

	
}


