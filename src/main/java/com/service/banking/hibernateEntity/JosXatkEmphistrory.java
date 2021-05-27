package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JosXatkEmphistrory generated by hbm2java
 */
@Entity
@Table(name = "jos_xatk_emphistrory")
public class JosXatkEmphistrory implements java.io.Serializable {

	private Integer id;
	private Date createdAt;
	private String post;
	private int branchId;
	private String remarks;

	public JosXatkEmphistrory() {
	}

	public JosXatkEmphistrory(Date createdAt, String post, int branchId, String remarks) {
		this.createdAt = createdAt;
		this.post = post;
		this.branchId = branchId;
		this.remarks = remarks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Created_At", nullable = false, length = 10)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "Post", nullable = false)
	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Column(name = "branch_id", nullable = false)
	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	@Column(name = "remarks", nullable = false, length = 65535)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}