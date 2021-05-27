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
 * BikeSurrenderHistory generated by hbm2java
 */
@Entity
@Table(name = "bike_surrender_history")
public class BikeSurrenderHistory implements java.io.Serializable {

	private Integer id;
	private Integer accountId;
	private String type;
	private Date newDateValue;

	public BikeSurrenderHistory() {
	}

	public BikeSurrenderHistory(Integer accountId, String type, Date newDateValue) {
		this.accountId = accountId;
		this.type = type;
		this.newDateValue = newDateValue;
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

	@Column(name = "account_id")
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Column(name = "type")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "new_date_value", length = 19)
	public Date getNewDateValue() {
		return this.newDateValue;
	}

	public void setNewDateValue(Date newDateValue) {
		this.newDateValue = newDateValue;
	}

}
