package com.service.banking.model.hodAuthorityModel;

import java.util.Date;

public class AssociationDetails {
	// ms.id, ms.name ,angt.accountNumber,angt.username
	// ,angt.agentCode,angt.gaurantor1address ,magnt.fromDate,magnt.toDate

	int id;
	String name;
	String accountNumber;
	String username;
	String agentCode;
	String gaurantor1address;
	Date fromDate;
	Date toDate;

	String fatherName;
	String memberName;

	public AssociationDetails(int id, String name, String accountNumber, String fatherName, String memberName,
			Date fromDate, Date toDate) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.fatherName = fatherName;
		this.memberName = memberName;
	}

	public AssociationDetails() {
		super();
	}

	public AssociationDetails(int id, String name, String accountNumber, String username, String agentCode,
			String gaurantor1address, Date fromDate, Date toDate) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.username = username;
		this.agentCode = agentCode;
		this.gaurantor1address = gaurantor1address;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the agentCode
	 */
	public String getAgentCode() {
		return agentCode;
	}

	/**
	 * @param agentCode the agentCode to set
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	/**
	 * @return the gaurantor1address
	 */
	public String getGaurantor1address() {
		return gaurantor1address;
	}

	/**
	 * @param gaurantor1address the gaurantor1address to set
	 */
	public void setGaurantor1address(String gaurantor1address) {
		this.gaurantor1address = gaurantor1address;
	}

	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
