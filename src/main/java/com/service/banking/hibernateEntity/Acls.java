package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Acls generated by hbm2java
 */
@Entity
@Table(name = "acls")
public class Acls implements java.io.Serializable {

	private Integer id;
	private Staffs staffs;
	private String class_;
	private Boolean canView;
	private Boolean isAllBranchAllowed;
	private Boolean allowAdd;
	private Boolean allowEdit;
	private Boolean allowDel;
	private Integer documentsId;

	public Acls() {
	}

	public Acls(Staffs staffs, String class_, Boolean canView, Boolean isAllBranchAllowed, Boolean allowAdd,
			Boolean allowEdit, Boolean allowDel, Integer documentsId) {
		this.staffs = staffs;
		this.class_ = class_;
		this.canView = canView;
		this.isAllBranchAllowed = isAllBranchAllowed;
		this.allowAdd = allowAdd;
		this.allowEdit = allowEdit;
		this.allowDel = allowDel;
		this.documentsId = documentsId;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_id")
	public Staffs getStaffs() {
		return this.staffs;
	}

	public void setStaffs(Staffs staffs) {
		this.staffs = staffs;
	}

	@Column(name = "class")
	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	@Column(name = "can_view")
	public Boolean getCanView() {
		return this.canView;
	}

	public void setCanView(Boolean canView) {
		this.canView = canView;
	}

	@Column(name = "is_all_branch_allowed")
	public Boolean getIsAllBranchAllowed() {
		return this.isAllBranchAllowed;
	}

	public void setIsAllBranchAllowed(Boolean isAllBranchAllowed) {
		this.isAllBranchAllowed = isAllBranchAllowed;
	}

	@Column(name = "allow_add")
	public Boolean getAllowAdd() {
		return this.allowAdd;
	}

	public void setAllowAdd(Boolean allowAdd) {
		this.allowAdd = allowAdd;
	}

	@Column(name = "allow_edit")
	public Boolean getAllowEdit() {
		return this.allowEdit;
	}

	public void setAllowEdit(Boolean allowEdit) {
		this.allowEdit = allowEdit;
	}

	@Column(name = "allow_del")
	public Boolean getAllowDel() {
		return this.allowDel;
	}

	public void setAllowDel(Boolean allowDel) {
		this.allowDel = allowDel;
	}

	@Column(name = "documents_id")
	public Integer getDocumentsId() {
		return this.documentsId;
	}

	public void setDocumentsId(Integer documentsId) {
		this.documentsId = documentsId;
	}

}
