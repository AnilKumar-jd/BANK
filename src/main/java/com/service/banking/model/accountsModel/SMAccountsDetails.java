package com.service.banking.model.accountsModel;

import java.time.LocalDateTime;
import java.util.Date;

public class SMAccountsDetails {
	
	
	public Integer id;
   	public String accountNumber;
   	public Date createdAt;
   	public String memberName;
   	public Integer memberNo;
   	public String currentAddress;
   	public String fatherName;
	public String branchName;
	public String schemeName;
	
	
	
	public SMAccountsDetails() {
		super();
	}
	public SMAccountsDetails(Integer id, String accountNumber, Date createdAt, String memberName, Integer memberNo,
			String currentAddress, String fatherName, String branchName, String schemeName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.createdAt = createdAt;
		this.memberName = memberName;
		this.memberNo = memberNo;
		this.currentAddress = currentAddress;
		this.fatherName = fatherName;
		this.branchName = branchName;
		this.schemeName = schemeName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	
	public Integer getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	   
   	
   	
   	
}
