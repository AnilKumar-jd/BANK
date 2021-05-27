package com.service.banking.model.accountsModel;

import java.math.BigDecimal;
import java.util.Date;

public class OtherAccountDetails {
 
	 //a.id,a.accountNumber,a.createdAt ,m.name ,m.memberNo ,m.currentAddress,m.landmark,M.isDefaulter,schm.name
	 
	    public Integer id;
		public String accountNumber;
		public Date createdAt;
		public String memberName;
		public Integer memberNo;
		public String currentAddress;
		public String landmark;
		public Boolean Deafulter;
		public String schemeName;
		
		
		public OtherAccountDetails() {
			super();
		}
		public OtherAccountDetails(Integer id, String accountNumber, Date createdAt, String memberName,
				Integer memberNo, String currentAddress, String landmark, Boolean deafulter, String schemeName) {
			super();
			this.id = id;
			this.accountNumber = accountNumber;
			this.createdAt = createdAt;
			this.memberName = memberName;
			this.memberNo = memberNo;
			this.currentAddress = currentAddress;
			this.landmark = landmark;
			Deafulter = deafulter;
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
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public Boolean getDeafulter() {
			return Deafulter;
		}
		public void setDeafulter(Boolean deafulter) {
			Deafulter = deafulter;
		}
		public String getSchemeName() {
			return schemeName;
		}
		public void setSchemeName(String schemeName) {
			this.schemeName = schemeName;
		}

		
		
	
	
}
