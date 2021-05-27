package com.service.banking.model.superAdminModel;

import org.hibernate.id.IntegralDataTypeHolder;

public class ShareCertificateDetail {
	
	Integer id;
	Integer name;
	
	
	public ShareCertificateDetail(Integer id, Integer name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public ShareCertificateDetail() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getName() {
		return name;
	}
	public void setName(Integer name) {
		this.name = name;
	}

	
	 
}
