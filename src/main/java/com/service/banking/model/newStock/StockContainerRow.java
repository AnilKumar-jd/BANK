package com.service.banking.model.newStock;

public class StockContainerRow {
  //sc.id,br.name,sct.name,sc.name
	Integer id;
	String branchName;
	String caintainerType;
	String name;
	
	
	
	public StockContainerRow() {
		super();
	}



	public StockContainerRow(Integer id, String branchName, String caintainerType, String name) {
		super();
		this.id = id;
		this.branchName = branchName;
		this.caintainerType = caintainerType;
		this.name = name;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getBranchName() {
		return branchName;
	}



	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}



	public String getCaintainerType() {
		return caintainerType;
	}



	public void setCaintainerType(String caintainerType) {
		this.caintainerType = caintainerType;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
