package com.service.banking.model.printingModel;

import org.hibernate.id.IntegralDataTypeHolder;

public class FDAccountDetails {
	
	Integer id;
	String accountNumber;
	String name;
	String fatherName;
	
	
	
	public FDAccountDetails() {
		super();
	}
	public FDAccountDetails(Integer id, String accountNumber, String name, String fatherName) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
		this.fatherName = fatherName;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	

}