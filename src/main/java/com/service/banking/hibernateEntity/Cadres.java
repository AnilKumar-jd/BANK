package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cadres generated by hbm2java
 */
@Entity
@Table(name = "cadres")
public class Cadres implements java.io.Serializable {

	private Integer id;
	private String name;
	private Integer percentageShare;
	private String totalCrpb;
	private String reqUnder;
	private Integer nextcadreId;

	public Cadres() {
	}

	public Cadres(String name, Integer percentageShare, String totalCrpb, String reqUnder, Integer nextcadreId) {
		this.name = name;
		this.percentageShare = percentageShare;
		this.totalCrpb = totalCrpb;
		this.reqUnder = reqUnder;
		this.nextcadreId = nextcadreId;
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

	@Column(name = "percentage_share")
	public Integer getPercentageShare() {
		return this.percentageShare;
	}

	public void setPercentageShare(Integer percentageShare) {
		this.percentageShare = percentageShare;
	}

	@Column(name = "total_crpb")
	public String getTotalCrpb() {
		return this.totalCrpb;
	}

	public void setTotalCrpb(String totalCrpb) {
		this.totalCrpb = totalCrpb;
	}

	@Column(name = "req_under")
	public String getReqUnder() {
		return this.reqUnder;
	}

	public void setReqUnder(String reqUnder) {
		this.reqUnder = reqUnder;
	}

	@Column(name = "nextcadre_id")
	public Integer getNextcadreId() {
		return this.nextcadreId;
	}

	public void setNextcadreId(Integer nextcadreId) {
		this.nextcadreId = nextcadreId;
	}

}
