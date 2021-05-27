package com.service.banking.model.accountsModel;

import java.util.Date;

public class SavingAccountDetails {



	public Integer id;
	public String accountNumber;
	public Date createdAt;
	public String memberName;
	public Integer memberNo;
	public String currentAddress;
	public Integer agentCodeNo;
	public String agentName;
	public Integer agentNo;
	public String agentCurrentAddress;
	public String nominee;
	public Short nomineeAge;
	public String relationWithNominee;
	public String currentInterest;
	public Date lastCurrentInterestUpdatedAt;
	public String teamName;
	
	
	
	public SavingAccountDetails() {
		super();
	}



	public SavingAccountDetails(Integer id, String accountNumber, Date createdAt, String memberName, Integer memberNo,
			String currentAddress, Integer agentCodeNo, String agentName, Integer agentNo, String agentCurrentAddress,
			String nominee, Short nomineeAge, String relationWithNominee, String currentInterest,
			Date lastCurrentInterestUpdatedAt, String teamName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.createdAt = createdAt;
		this.memberName = memberName;
		this.memberNo = memberNo;
		this.currentAddress = currentAddress;
		this.agentCodeNo = agentCodeNo;
		this.agentName = agentName;
		this.agentNo = agentNo;
		this.agentCurrentAddress = agentCurrentAddress;
		this.nominee = nominee;
		this.nomineeAge = nomineeAge;
		this.relationWithNominee = relationWithNominee;
		this.currentInterest = currentInterest;
		this.lastCurrentInterestUpdatedAt = lastCurrentInterestUpdatedAt;
		this.teamName = teamName;
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



	public Integer getAgentCodeNo() {
		return agentCodeNo;
	}



	public void setAgentCodeNo(Integer agentCodeNo) {
		this.agentCodeNo = agentCodeNo;
	}



	public String getAgentName() {
		return agentName;
	}



	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}



	public Integer getAgentNo() {
		return agentNo;
	}



	public void setAgentNo(Integer agentNo) {
		this.agentNo = agentNo;
	}



	public String getAgentCurrentAddress() {
		return agentCurrentAddress;
	}



	public void setAgentCurrentAddress(String agentCurrentAddress) {
		this.agentCurrentAddress = agentCurrentAddress;
	}



	public String getNominee() {
		return nominee;
	}



	public void setNominee(String nominee) {
		this.nominee = nominee;
	}



	public Short getNomineeAge() {
		return nomineeAge;
	}



	public void setNomineeAge(Short nomineeAge) {
		this.nomineeAge = nomineeAge;
	}



	public String getRelationWithNominee() {
		return relationWithNominee;
	}



	public void setRelationWithNominee(String relationWithNominee) {
		this.relationWithNominee = relationWithNominee;
	}



	public String getCurrentInterest() {
		return currentInterest;
	}



	public void setCurrentInterest(String currentInterest) {
		this.currentInterest = currentInterest;
	}



	public Date getLastCurrentInterestUpdatedAt() {
		return lastCurrentInterestUpdatedAt;
	}



	public void setLastCurrentInterestUpdatedAt(Date lastCurrentInterestUpdatedAt) {
		this.lastCurrentInterestUpdatedAt = lastCurrentInterestUpdatedAt;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}



}
