package com.service.banking.model.superAdminModel;

public class MeberDetail {
	
    Integer id;
	String name;
	Integer memberNo;
	String currentAddress;
	String landmark;
	boolean isDefaulter;
	
	public MeberDetail() {
		super();
	}


	public MeberDetail(Integer id, String name, Integer memberNo, String currentAddress, 
			boolean isDefaulter,String landmark) {
		super();
		this.id = id;
		this.name = name;
		this.memberNo = memberNo;
		this.currentAddress = currentAddress;
		this.isDefaulter = isDefaulter;
		this.landmark = landmark;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public boolean isDefaulter() {
		return isDefaulter;
	}


	public void setDefaulter(boolean isDefaulter) {
		this.isDefaulter = isDefaulter;
	}
	
	
	
}
