package com.service.banking.model.newStock;

import java.util.HashSet;
import java.util.Set;

import com.service.banking.hibernateEntity.StocknewCategory;

public class StockNewItemDetails {
	
	//si.id,sc.name ,si.name ,si.code ,sc.allowedInTransactions ,si.description ,si.isActive ,si.isFixedAsset
	
	public Integer id;
	//public StocknewCategory stocknewCategory;
	public String name;
	public String catName;
	public String code;
	public String allowedInTransactions;
	public String description;
	public Boolean isActive;
	public Boolean isFixedAsset;
	public String currentLocation;
	
	
	
	public StockNewItemDetails() {
		super();
	}
	public StockNewItemDetails(Integer id, String name, String catName, String code, String allowedInTransactions,
			String description, Boolean isActive, Boolean isFixedAsset) {
		super();
		this.id = id;
		this.name = name;
		this.catName = catName;
		this.code = code;
		this.allowedInTransactions = allowedInTransactions;
		this.description = description;
		this.isActive = isActive;
		this.isFixedAsset = isFixedAsset;
	}
	

	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
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
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAllowedInTransactions() {
		return allowedInTransactions;
	}
	public void setAllowedInTransactions(String allowedInTransactions) {
		this.allowedInTransactions = allowedInTransactions;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Boolean getIsFixedAsset() {
		return isFixedAsset;
	}
	public void setIsFixedAsset(Boolean isFixedAsset) {
		this.isFixedAsset = isFixedAsset;
	}
	
	
	


}
