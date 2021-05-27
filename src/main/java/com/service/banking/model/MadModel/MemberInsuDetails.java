package com.service.banking.model.MadModel;

import java.util.Date;

public class MemberInsuDetails {
	
    public String accountNumber;
    public String memberName;
    public int memberId;
    public String landmark;
    public String tehsil;
    public String city;
    public String district;
    public String state;
    public String currentAddress;
    public Integer id;
    public Date insuranceStartDate;
	public byte insuranceDuration;
	public String narration;
	public Date nextInsuranceDueDate;
	
	
	
	


	public MemberInsuDetails() {
		super();
	}


	public MemberInsuDetails(String accountNumber, String memberName, int memberId, String landmark, String tehsil,
			String city, String district, String state, String currentAddress, Integer id, Date insuranceStartDate,
			byte insuranceDuration, String narration, Date nextInsuranceDueDate) {
		super();
		this.accountNumber = accountNumber;
		this.memberName = memberName;
		this.memberId = memberId;
		this.landmark = landmark;
		this.tehsil = tehsil;
		this.city = city;
		this.district = district;
		this.state = state;
		this.currentAddress = currentAddress;
		this.id = id;
		this.insuranceStartDate = insuranceStartDate;
		this.insuranceDuration = insuranceDuration;
		this.narration = narration;
		this.nextInsuranceDueDate = nextInsuranceDueDate;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getMemberName() {
		return memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	public int getMemberId() {
		return memberId;
	}



	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}



	public String getLandmark() {
		return landmark;
	}



	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}



	public String getTehsil() {
		return tehsil;
	}



	public void setTehsil(String tehsil) {
		this.tehsil = tehsil;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCurrentAddress() {
		return currentAddress;
	}



	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Date getInsuranceStartDate() {
		return insuranceStartDate;
	}



	public void setInsuranceStartDate(Date insuranceStartDate) {
		this.insuranceStartDate = insuranceStartDate;
	}



	public byte getInsuranceDuration() {
		return insuranceDuration;
	}



	public void setInsuranceDuration(byte insuranceDuration) {
		this.insuranceDuration = insuranceDuration;
	}



	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public Date getNextInsuranceDueDate() {
		return nextInsuranceDueDate;
	}

	public void setNextInsuranceDueDate(Date nextInsuranceDueDate) {
		this.nextInsuranceDueDate = nextInsuranceDueDate;
	}


}
