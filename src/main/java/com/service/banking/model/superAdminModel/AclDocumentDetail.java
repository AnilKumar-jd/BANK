package com.service.banking.model.superAdminModel;

import org.hibernate.id.IntegralDataTypeHolder;

public class AclDocumentDetail {
	
	Integer id;
	String name;
	
	
	public AclDocumentDetail() {
		super();
	}
	public AclDocumentDetail(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	
	

}
