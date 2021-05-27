package com.service.banking.model.newStock;

import java.math.BigDecimal;

import com.service.banking.hibernateEntity.Branches;
import com.service.banking.hibernateEntity.StocknewContainer;
import com.service.banking.hibernateEntity.StocknewContainerrow;
import com.service.banking.hibernateEntity.StocknewItems;
import com.service.banking.hibernateEntity.StocknewMembers;
import com.service.banking.hibernateEntity.StocknewTransactiontemplate;

public class TransactionDeatils {
	
	
	
	public Integer id;
	public String transTemplateName;
	public String fromBrnchName;
	public String fromMemberName;
	public String fromContName;
	public String fromContRowName;
	public String toBrnchName;
	public String toMemberName;
	public String toContName;
	public String toContRowName;
	public String itemName;
	public String qty;
	public BigDecimal rate;
	public String narration;
	public String createdAt;
	
	
	public TransactionDeatils() {
		super();
	}
	public TransactionDeatils(Integer id, String transTemplateName, String fromBrnchName, String fromMemberName,
			String fromContName, String fromContRowName, String toBrnchName, String toMemberName, String toContName,
			String toContRowName, String itemName, String qty, BigDecimal rate, String narration, String createdAt) {
		super();
		this.id = id;
		this.transTemplateName = transTemplateName;
		this.fromBrnchName = fromBrnchName;
		this.fromMemberName = fromMemberName;
		this.fromContName = fromContName;
		this.fromContRowName = fromContRowName;
		this.toBrnchName = toBrnchName;
		this.toMemberName = toMemberName;
		this.toContName = toContName;
		this.toContRowName = toContRowName;
		this.itemName = itemName;
		this.qty = qty;
		this.rate = rate;
		this.narration = narration;
		this.createdAt = createdAt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTransTemplateName() {
		return transTemplateName;
	}
	public void setTransTemplateName(String transTemplateName) {
		this.transTemplateName = transTemplateName;
	}
	public String getFromBrnchName() {
		return fromBrnchName;
	}
	public void setFromBrnchName(String fromBrnchName) {
		this.fromBrnchName = fromBrnchName;
	}
	public String getFromMemberName() {
		return fromMemberName;
	}
	public void setFromMemberName(String fromMemberName) {
		this.fromMemberName = fromMemberName;
	}
	public String getFromContName() {
		return fromContName;
	}
	public void setFromContName(String fromContName) {
		this.fromContName = fromContName;
	}
	public String getFromContRowName() {
		return fromContRowName;
	}
	public void setFromContRowName(String fromContRowName) {
		this.fromContRowName = fromContRowName;
	}
	public String getToBrnchName() {
		return toBrnchName;
	}
	public void setToBrnchName(String toBrnchName) {
		this.toBrnchName = toBrnchName;
	}
	public String getToMemberName() {
		return toMemberName;
	}
	public void setToMemberName(String toMemberName) {
		this.toMemberName = toMemberName;
	}
	public String getToContName() {
		return toContName;
	}
	public void setToContName(String toContName) {
		this.toContName = toContName;
	}
	public String getToContRowName() {
		return toContRowName;
	}
	public void setToContRowName(String toContRowName) {
		this.toContRowName = toContRowName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
}
