package com.service.banking.model.accountsModel;

import java.util.Date;

import com.service.banking.utils.DateFormater;

public class SendNocDetails {
   
	
	Integer id;
	String accountNumber;
	String name;
	String fatherNamme;
	String nocLetterReceivedOn;
	String toBranch;  // staff name
	String sendAt;
	String sendNarration;
	 int isDispatchToCustomer;
	 int isReturn;
	 
	 DateFormater dateFormater=new DateFormater(); 
	 
	public SendNocDetails() {
		super();
	}
	
	public SendNocDetails(Integer id, String accountNumber, String name, String fatherNamme, Date nocLetterReceivedOn,
			String toBranch, Date sendAt, String sendNarration, int isDispatchToCustomer, int isReturn) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
		this.fatherNamme = fatherNamme;
		this.nocLetterReceivedOn = dateFormater.getformatDate(nocLetterReceivedOn);
		this.toBranch = toBranch;
		this.sendAt = dateFormater.getformatDate(sendAt);
		this.sendNarration = sendNarration;
		this.isDispatchToCustomer = isDispatchToCustomer;
		this.isReturn = isReturn;
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
	public String getFatherNamme() {
		return fatherNamme;
	}
	public void setFatherNamme(String fatherNamme) {
		this.fatherNamme = fatherNamme;
	}
	public String getNocLetterReceivedOn() {
		return nocLetterReceivedOn;
	}
	public void setNocLetterReceivedOn(String nocLetterReceivedOn) {
		this.nocLetterReceivedOn = nocLetterReceivedOn;
	}
	public String getToBranch() {
		return toBranch;
	}
	public void setToBranch(String toBranch) {
		this.toBranch = toBranch;
	}
	public String getSendAt() {
		return sendAt;
	}
	public void setSendAt(String sendAt) {
		this.sendAt = sendAt;
	}
	public String getSendNarration() {
		return sendNarration;
	}
	public void setSendNarration(String sendNarration) {
		this.sendNarration = sendNarration;
	}
	public int getIsDispatchToCustomer() {
		return isDispatchToCustomer;
	}
	public void setIsDispatchToCustomer(int isDispatchToCustomer) {
		this.isDispatchToCustomer = isDispatchToCustomer;
	}
	public int getIsReturn() {
		return isReturn;
	}
	public void setIsReturn(int isReturn) {
		this.isReturn = isReturn;
	}
	 
	 
	 
}
