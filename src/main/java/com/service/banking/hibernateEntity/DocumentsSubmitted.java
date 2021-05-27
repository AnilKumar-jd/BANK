package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DocumentsSubmitted generated by hbm2java
 */
@Entity
@Table(name = "documents_submitted")
public class DocumentsSubmitted implements java.io.Serializable {

	private Integer id;
	private Agents agents;
	private AgentGuarantors agentGuarantors;
	private Dealers dealers;
	private Dsa dsa;
	private DsaGuarantors dsaGuarantors;
	private Members members;
	private Integer accountsId;
	private Integer documentsId;
	private String description;
	private Integer docImageId;
	private Date submittedOn;

	public DocumentsSubmitted() {
	}

	public DocumentsSubmitted(Agents agents, AgentGuarantors agentGuarantors, Dealers dealers, Dsa dsa,
			DsaGuarantors dsaGuarantors, Members members, Integer accountsId, Integer documentsId, String description,
			Integer docImageId, Date submittedOn) {
		this.agents = agents;
		this.agentGuarantors = agentGuarantors;
		this.dealers = dealers;
		this.dsa = dsa;
		this.dsaGuarantors = dsaGuarantors;
		this.members = members;
		this.accountsId = accountsId;
		this.documentsId = documentsId;
		this.description = description;
		this.docImageId = docImageId;
		this.submittedOn = submittedOn;
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
	@JoinColumn(name = "agent_id")
	public Agents getAgents() {
		return this.agents;
	}

	public void setAgents(Agents agents) {
		this.agents = agents;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agentguarantor_id")
	public AgentGuarantors getAgentGuarantors() {
		return this.agentGuarantors;
	}

	public void setAgentGuarantors(AgentGuarantors agentGuarantors) {
		this.agentGuarantors = agentGuarantors;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dealer_id")
	public Dealers getDealers() {
		return this.dealers;
	}

	public void setDealers(Dealers dealers) {
		this.dealers = dealers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dsa_id")
	public Dsa getDsa() {
		return this.dsa;
	}

	public void setDsa(Dsa dsa) {
		this.dsa = dsa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dsaguarantor_id")
	public DsaGuarantors getDsaGuarantors() {
		return this.dsaGuarantors;
	}

	public void setDsaGuarantors(DsaGuarantors dsaGuarantors) {
		this.dsaGuarantors = dsaGuarantors;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	public Members getMembers() {
		return this.members;
	}

	public void setMembers(Members members) {
		this.members = members;
	}

	@Column(name = "accounts_id")
	public Integer getAccountsId() {
		return this.accountsId;
	}

	public void setAccountsId(Integer accountsId) {
		this.accountsId = accountsId;
	}

	@Column(name = "documents_id")
	public Integer getDocumentsId() {
		return this.documentsId;
	}

	public void setDocumentsId(Integer documentsId) {
		this.documentsId = documentsId;
	}

	@Column(name = "Description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "doc_image_id")
	public Integer getDocImageId() {
		return this.docImageId;
	}

	public void setDocImageId(Integer docImageId) {
		this.docImageId = docImageId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "submitted_on", length = 10)
	public Date getSubmittedOn() {
		return this.submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

}
