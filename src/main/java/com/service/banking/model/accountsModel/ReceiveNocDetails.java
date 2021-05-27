package com.service.banking.model.accountsModel;

import java.util.Date;

public class ReceiveNocDetails {

	Integer id;
	String accountNumber;
	String name;
	Date nocLetterReceivedOn;
	Date sendAt;
	String createdName;  // staff name
	String branchName;  // branch name
	String sendNarration;
	Date receivedAt;
	String recieveName;  // staff name
	String rcvbranchName;  //  branch name
	String receivedNarration;
	int isDispatchToCustomer;
	Date dispatchAt;
	String dispatchByName;
	String dispatchNarration;
	int isReturn;
	Date returnAt;
	String returnName;  //  name
	String returnNarration;
	String rtrn_rcvName;  //  name
	String returnReceivedNarration;
	String nocNotMadeDueTo;
	String nocHoldDueTo;
	
	
	public ReceiveNocDetails() {
		super();
	}
	public ReceiveNocDetails(Integer id, String accountNumber, String name, Date nocLetterReceivedOn, Date sendAt,
			String createdName, String branchName, String sendNarration, Date receivedAt, String recieveName,
			String rcvbranchName, String receivedNarration, int isDispatchToCustomer, Date dispatchAt,
			String dispatchByName, String dispatchNarration, int isReturn, Date returnAt, String returnName,
			String returnNarration, String rtrn_rcvName, String returnReceivedNarration, String nocNotMadeDueTo,
			String nocHoldDueTo) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
		this.nocLetterReceivedOn = nocLetterReceivedOn;
		this.sendAt = sendAt;
		this.createdName = createdName;
		this.branchName = branchName;
		this.sendNarration = sendNarration;
		this.receivedAt = receivedAt;
		this.recieveName = recieveName;
		this.rcvbranchName = rcvbranchName;
		this.receivedNarration = receivedNarration;
		this.isDispatchToCustomer = isDispatchToCustomer;
		this.dispatchAt = dispatchAt;
		this.dispatchByName = dispatchByName;
		this.dispatchNarration = dispatchNarration;
		this.isReturn = isReturn;
		this.returnAt = returnAt;
		this.returnName = returnName;
		this.returnNarration = returnNarration;
		this.rtrn_rcvName = rtrn_rcvName;
		this.returnReceivedNarration = returnReceivedNarration;
		this.nocNotMadeDueTo = nocNotMadeDueTo;
		this.nocHoldDueTo = nocHoldDueTo;
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
	public Date getNocLetterReceivedOn() {
		return nocLetterReceivedOn;
	}
	public void setNocLetterReceivedOn(Date nocLetterReceivedOn) {
		this.nocLetterReceivedOn = nocLetterReceivedOn;
	}
	public Date getSendAt() {
		return sendAt;
	}
	public void setSendAt(Date sendAt) {
		this.sendAt = sendAt;
	}
	public String getCreatedName() {
		return createdName;
	}
	public void setCreatedName(String createdName) {
		this.createdName = createdName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getSendNarration() {
		return sendNarration;
	}
	public void setSendNarration(String sendNarration) {
		this.sendNarration = sendNarration;
	}
	public Date getReceivedAt() {
		return receivedAt;
	}
	public void setReceivedAt(Date receivedAt) {
		this.receivedAt = receivedAt;
	}
	public String getRecieveName() {
		return recieveName;
	}
	public void setRecieveName(String recieveName) {
		this.recieveName = recieveName;
	}
	public String getRcvbranchName() {
		return rcvbranchName;
	}
	public void setRcvbranchName(String rcvbranchName) {
		this.rcvbranchName = rcvbranchName;
	}
	public String getReceivedNarration() {
		return receivedNarration;
	}
	public void setReceivedNarration(String receivedNarration) {
		this.receivedNarration = receivedNarration;
	}
	public int getIsDispatchToCustomer() {
		return isDispatchToCustomer;
	}
	public void setIsDispatchToCustomer(int isDispatchToCustomer) {
		this.isDispatchToCustomer = isDispatchToCustomer;
	}
	public Date getDispatchAt() {
		return dispatchAt;
	}
	public void setDispatchAt(Date dispatchAt) {
		this.dispatchAt = dispatchAt;
	}
	public String getDispatchByName() {
		return dispatchByName;
	}
	public void setDispatchByName(String dispatchByName) {
		this.dispatchByName = dispatchByName;
	}
	public String getDispatchNarration() {
		return dispatchNarration;
	}
	public void setDispatchNarration(String dispatchNarration) {
		this.dispatchNarration = dispatchNarration;
	}
	public int getIsReturn() {
		return isReturn;
	}
	public void setIsReturn(int isReturn) {
		this.isReturn = isReturn;
	}
	public Date getReturnAt() {
		return returnAt;
	}
	public void setReturnAt(Date returnAt) {
		this.returnAt = returnAt;
	}
	public String getReturnName() {
		return returnName;
	}
	public void setReturnName(String returnName) {
		this.returnName = returnName;
	}
	public String getReturnNarration() {
		return returnNarration;
	}
	public void setReturnNarration(String returnNarration) {
		this.returnNarration = returnNarration;
	}
	public String getRtrn_rcvName() {
		return rtrn_rcvName;
	}
	public void setRtrn_rcvName(String rtrn_rcvName) {
		this.rtrn_rcvName = rtrn_rcvName;
	}
	public String getReturnReceivedNarration() {
		return returnReceivedNarration;
	}
	public void setReturnReceivedNarration(String returnReceivedNarration) {
		this.returnReceivedNarration = returnReceivedNarration;
	}
	public String getNocNotMadeDueTo() {
		return nocNotMadeDueTo;
	}
	public void setNocNotMadeDueTo(String nocNotMadeDueTo) {
		this.nocNotMadeDueTo = nocNotMadeDueTo;
	}
	public String getNocHoldDueTo() {
		return nocHoldDueTo;
	}
	public void setNocHoldDueTo(String nocHoldDueTo) {
		this.nocHoldDueTo = nocHoldDueTo;
	}
	
	
		
	
}
