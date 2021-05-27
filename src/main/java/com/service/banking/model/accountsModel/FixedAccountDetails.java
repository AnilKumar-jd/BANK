package com.service.banking.model.accountsModel;

import java.math.BigDecimal;
import java.util.Date;

public class FixedAccountDetails {
	public Integer id;
	public String accountNumber;
	public Date createdAt;
	public String memberName;
	public Integer memberNo;
	public String currentAddress;
	public String schemeName;
	public BigDecimal currentBalanceCr;
	public Integer agentCodeNo;
	public String agentName;
	public Integer agentNo;
	public String agentCurrentAddress;
	public Integer collecterCodeNo;
	public String collecterName;
	public Integer collectorNo;
	public String collecterCurrentAddress;
	public String collecterLandmark;
	public Boolean collectorDeafulter;
	public Integer intrestToAccountId;
	public Integer maturityToAccountId;
	public String nominee;
	public Short nomineeAge;
	public String relationWithNominee;
	public String newOrRenew;
	public String teamName;
	
	
	public FixedAccountDetails() {
		super();
	}
	public FixedAccountDetails(Integer id, String accountNumber, Date createdAt, String memberName, Integer memberNo,
			String currentAddress, String schemeName, BigDecimal currentBalanceCr, Integer agentCodeNo,
			String agentName, Integer agentNo, String agentCurrentAddress, Integer collecterCodeNo,
			String collecterName, Integer collectorNo, String collecterCurrentAddress, String collecterLandmark,
			Boolean collectorDeafulter, Integer intrestToAccountId, Integer maturityToAccountId, String nominee,
			Short nomineeAge, String relationWithNominee, String newOrRenew, String teamName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.createdAt = createdAt;
		this.memberName = memberName;
		this.memberNo = memberNo;
		this.currentAddress = currentAddress;
		this.schemeName = schemeName;
		this.currentBalanceCr = currentBalanceCr;
		this.agentCodeNo = agentCodeNo;
		this.agentName = agentName;
		this.agentNo = agentNo;
		this.agentCurrentAddress = agentCurrentAddress;
		this.collecterCodeNo = collecterCodeNo;
		this.collecterName = collecterName;
		this.collectorNo = collectorNo;
		this.collecterCurrentAddress = collecterCurrentAddress;
		this.collecterLandmark = collecterLandmark;
		this.collectorDeafulter = collectorDeafulter;
		this.intrestToAccountId = intrestToAccountId;
		this.maturityToAccountId = maturityToAccountId;
		this.nominee = nominee;
		this.nomineeAge = nomineeAge;
		this.relationWithNominee = relationWithNominee;
		this.newOrRenew = newOrRenew;
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
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public BigDecimal getCurrentBalanceCr() {
		return currentBalanceCr;
	}
	public void setCurrentBalanceCr(BigDecimal currentBalanceCr) {
		this.currentBalanceCr = currentBalanceCr;
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
	public Integer getCollecterCodeNo() {
		return collecterCodeNo;
	}
	public void setCollecterCodeNo(Integer collecterCodeNo) {
		this.collecterCodeNo = collecterCodeNo;
	}
	public String getCollecterName() {
		return collecterName;
	}
	public void setCollecterName(String collecterName) {
		this.collecterName = collecterName;
	}
	public Integer getCollectorNo() {
		return collectorNo;
	}
	public void setCollectorNo(Integer collectorNo) {
		this.collectorNo = collectorNo;
	}
	public String getCollecterCurrentAddress() {
		return collecterCurrentAddress;
	}
	public void setCollecterCurrentAddress(String collecterCurrentAddress) {
		this.collecterCurrentAddress = collecterCurrentAddress;
	}
	public String getCollecterLandmark() {
		return collecterLandmark;
	}
	public void setCollecterLandmark(String collecterLandmark) {
		this.collecterLandmark = collecterLandmark;
	}
	public Boolean getCollectorDeafulter() {
		return collectorDeafulter;
	}
	public void setCollectorDeafulter(Boolean collectorDeafulter) {
		this.collectorDeafulter = collectorDeafulter;
	}
	public Integer getIntrestToAccountId() {
		return intrestToAccountId;
	}
	public void setIntrestToAccountId(Integer intrestToAccountId) {
		this.intrestToAccountId = intrestToAccountId;
	}
	public Integer getMaturityToAccountId() {
		return maturityToAccountId;
	}
	public void setMaturityToAccountId(Integer maturityToAccountId) {
		this.maturityToAccountId = maturityToAccountId;
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
	public String getNewOrRenew() {
		return newOrRenew;
	}
	public void setNewOrRenew(String newOrRenew) {
		this.newOrRenew = newOrRenew;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	
	

	
	
}
