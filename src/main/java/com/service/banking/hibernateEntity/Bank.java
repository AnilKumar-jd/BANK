package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bank generated by hbm2java
 */
@Entity
@Table(name = "bank")
public class Bank implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set bankBrancheses = new HashSet(0);

	public Bank() {
	}

	public Bank(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public Bank(String name, Set bankBrancheses) {
		this.name = name;
		this.bankBrancheses = bankBrancheses;
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

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bank")
	public Set<BankBranches> getBankBrancheses() {
		return this.bankBrancheses;
	}

	public void setBankBrancheses(Set bankBrancheses) {
		this.bankBrancheses = bankBrancheses;
	}

}
