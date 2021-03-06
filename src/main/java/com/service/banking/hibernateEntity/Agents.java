package com.service.banking.hibernateEntity;
// Generated Feb 20, 2020 6:19:12 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Agents generated by hbm2java
 */
@Entity
@Table(name = "agents")
public class Agents implements java.io.Serializable {

	private Integer id;
	private int memberId;
	private Boolean activeStatus;
	private Date createdAt;
	private Date updatedAt;
	private String accountNumber;
	private String gaurantor1name;
	private String gaurantor1fatherHusbandName;
	private String gaurantor1address;
	private String gaurantor1occupation;
	private String gaurantor2name;
	private String gaurantor2fatherHusbandName;
	private String gaurantor2address;
	private String gaurantor2occupation;
	private Integer sponsorId;
	private String agentCode;
	private String path;
	private Integer legCount;
	private Integer rank;
	private Integer treeId;
	private Integer businessCreditPoints;
	private Integer cumulativeBusinessCreditPoints;
	private Integer rank1Count;
	private Integer rank2Count;
	private Integer rank3Count;
	private Integer rank4Count;
	private Integer rank5Count;
	private Integer rank6Count;
	private Integer rank7Count;
	private Integer rank8Count;
	private Integer rank9Count;
	private Integer rank10Count;
	private Integer rank11Count;
	private Integer rank12Count;
	private Integer rank13Count;
	private Integer rank14Count;
	private Integer rank15Count;
	private Integer rank16Count;
	private Integer rank17Count;
	private Integer rank18Count;
	private Integer rank19Count;
	private Integer rank20Count;
	private Integer accountId;
	private Integer cadreId;
	private Integer currentIndividualCrpb;
	private Integer currentIndividualCrpbOld;
	private String username;
	private String password;
	private String addedBy;
	private Integer codeNo;
	private Integer moId;
	private Set agentTdses = new HashSet(0);
	private Set documentsSubmitteds = new HashSet(0);
	private Set agentGuarantorses = new HashSet(0);

	public Agents() {
	}

	public Agents(int memberId, String addedBy) {
		this.memberId = memberId;
		this.addedBy = addedBy;
	}

	public Agents(int memberId, Boolean activeStatus, Date createdAt, Date updatedAt, String accountNumber,
			String gaurantor1name, String gaurantor1fatherHusbandName, String gaurantor1address,
			String gaurantor1occupation, String gaurantor2name, String gaurantor2fatherHusbandName,
			String gaurantor2address, String gaurantor2occupation, Integer sponsorId, String agentCode, String path,
			Integer legCount, Integer rank, Integer treeId, Integer businessCreditPoints,
			Integer cumulativeBusinessCreditPoints, Integer rank1Count, Integer rank2Count, Integer rank3Count,
			Integer rank4Count, Integer rank5Count, Integer rank6Count, Integer rank7Count, Integer rank8Count,
			Integer rank9Count, Integer rank10Count, Integer rank11Count, Integer rank12Count, Integer rank13Count,
			Integer rank14Count, Integer rank15Count, Integer rank16Count, Integer rank17Count, Integer rank18Count,
			Integer rank19Count, Integer rank20Count, Integer accountId, Integer cadreId, Integer currentIndividualCrpb,
			Integer currentIndividualCrpbOld, String username, String password, String addedBy, Integer codeNo,
			Integer moId, Set agentTdses, Set documentsSubmitteds, Set agentGuarantorses) {
		this.memberId = memberId;
		this.activeStatus = activeStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.accountNumber = accountNumber;
		this.gaurantor1name = gaurantor1name;
		this.gaurantor1fatherHusbandName = gaurantor1fatherHusbandName;
		this.gaurantor1address = gaurantor1address;
		this.gaurantor1occupation = gaurantor1occupation;
		this.gaurantor2name = gaurantor2name;
		this.gaurantor2fatherHusbandName = gaurantor2fatherHusbandName;
		this.gaurantor2address = gaurantor2address;
		this.gaurantor2occupation = gaurantor2occupation;
		this.sponsorId = sponsorId;
		this.agentCode = agentCode;
		this.path = path;
		this.legCount = legCount;
		this.rank = rank;
		this.treeId = treeId;
		this.businessCreditPoints = businessCreditPoints;
		this.cumulativeBusinessCreditPoints = cumulativeBusinessCreditPoints;
		this.rank1Count = rank1Count;
		this.rank2Count = rank2Count;
		this.rank3Count = rank3Count;
		this.rank4Count = rank4Count;
		this.rank5Count = rank5Count;
		this.rank6Count = rank6Count;
		this.rank7Count = rank7Count;
		this.rank8Count = rank8Count;
		this.rank9Count = rank9Count;
		this.rank10Count = rank10Count;
		this.rank11Count = rank11Count;
		this.rank12Count = rank12Count;
		this.rank13Count = rank13Count;
		this.rank14Count = rank14Count;
		this.rank15Count = rank15Count;
		this.rank16Count = rank16Count;
		this.rank17Count = rank17Count;
		this.rank18Count = rank18Count;
		this.rank19Count = rank19Count;
		this.rank20Count = rank20Count;
		this.accountId = accountId;
		this.cadreId = cadreId;
		this.currentIndividualCrpb = currentIndividualCrpb;
		this.currentIndividualCrpbOld = currentIndividualCrpbOld;
		this.username = username;
		this.password = password;
		this.addedBy = addedBy;
		this.codeNo = codeNo;
		this.moId = moId;
		this.agentTdses = agentTdses;
		this.documentsSubmitteds = documentsSubmitteds;
		this.agentGuarantorses = agentGuarantorses;
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

	@Column(name = "member_id", nullable = false)
	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	@Column(name = "ActiveStatus")
	public Boolean getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "AccountNumber", length = 100)
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Column(name = "Gaurantor1Name", length = 100)
	public String getGaurantor1name() {
		return this.gaurantor1name;
	}

	public void setGaurantor1name(String gaurantor1name) {
		this.gaurantor1name = gaurantor1name;
	}

	@Column(name = "Gaurantor1FatherHusbandName", length = 100)
	public String getGaurantor1fatherHusbandName() {
		return this.gaurantor1fatherHusbandName;
	}

	public void setGaurantor1fatherHusbandName(String gaurantor1fatherHusbandName) {
		this.gaurantor1fatherHusbandName = gaurantor1fatherHusbandName;
	}

	@Column(name = "Gaurantor1Address", length = 200)
	public String getGaurantor1address() {
		return this.gaurantor1address;
	}

	public void setGaurantor1address(String gaurantor1address) {
		this.gaurantor1address = gaurantor1address;
	}

	@Column(name = "Gaurantor1Occupation", length = 100)
	public String getGaurantor1occupation() {
		return this.gaurantor1occupation;
	}

	public void setGaurantor1occupation(String gaurantor1occupation) {
		this.gaurantor1occupation = gaurantor1occupation;
	}

	@Column(name = "Gaurantor2Name", length = 100)
	public String getGaurantor2name() {
		return this.gaurantor2name;
	}

	public void setGaurantor2name(String gaurantor2name) {
		this.gaurantor2name = gaurantor2name;
	}

	@Column(name = "Gaurantor2FatherHusbandName", length = 100)
	public String getGaurantor2fatherHusbandName() {
		return this.gaurantor2fatherHusbandName;
	}

	public void setGaurantor2fatherHusbandName(String gaurantor2fatherHusbandName) {
		this.gaurantor2fatherHusbandName = gaurantor2fatherHusbandName;
	}

	@Column(name = "Gaurantor2Address", length = 200)
	public String getGaurantor2address() {
		return this.gaurantor2address;
	}

	public void setGaurantor2address(String gaurantor2address) {
		this.gaurantor2address = gaurantor2address;
	}

	@Column(name = "Gaurantor2Occupation", length = 100)
	public String getGaurantor2occupation() {
		return this.gaurantor2occupation;
	}

	public void setGaurantor2occupation(String gaurantor2occupation) {
		this.gaurantor2occupation = gaurantor2occupation;
	}

	@Column(name = "sponsor_id")
	public Integer getSponsorId() {
		return this.sponsorId;
	}

	public void setSponsorId(Integer sponsorId) {
		this.sponsorId = sponsorId;
	}

	@Column(name = "AgentCode", length = 20)
	public String getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	@Column(name = "Path", length = 200)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "LegCount")
	public Integer getLegCount() {
		return this.legCount;
	}

	public void setLegCount(Integer legCount) {
		this.legCount = legCount;
	}

	@Column(name = "Rank")
	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@Column(name = "Tree_id")
	public Integer getTreeId() {
		return this.treeId;
	}

	public void setTreeId(Integer treeId) {
		this.treeId = treeId;
	}

	@Column(name = "BusinessCreditPoints")
	public Integer getBusinessCreditPoints() {
		return this.businessCreditPoints;
	}

	public void setBusinessCreditPoints(Integer businessCreditPoints) {
		this.businessCreditPoints = businessCreditPoints;
	}

	@Column(name = "CumulativeBusinessCreditPoints")
	public Integer getCumulativeBusinessCreditPoints() {
		return this.cumulativeBusinessCreditPoints;
	}

	public void setCumulativeBusinessCreditPoints(Integer cumulativeBusinessCreditPoints) {
		this.cumulativeBusinessCreditPoints = cumulativeBusinessCreditPoints;
	}

	@Column(name = "Rank_1_Count")
	public Integer getRank1Count() {
		return this.rank1Count;
	}

	public void setRank1Count(Integer rank1Count) {
		this.rank1Count = rank1Count;
	}

	@Column(name = "Rank_2_Count")
	public Integer getRank2Count() {
		return this.rank2Count;
	}

	public void setRank2Count(Integer rank2Count) {
		this.rank2Count = rank2Count;
	}

	@Column(name = "Rank_3_Count")
	public Integer getRank3Count() {
		return this.rank3Count;
	}

	public void setRank3Count(Integer rank3Count) {
		this.rank3Count = rank3Count;
	}

	@Column(name = "Rank_4_Count")
	public Integer getRank4Count() {
		return this.rank4Count;
	}

	public void setRank4Count(Integer rank4Count) {
		this.rank4Count = rank4Count;
	}

	@Column(name = "Rank_5_Count")
	public Integer getRank5Count() {
		return this.rank5Count;
	}

	public void setRank5Count(Integer rank5Count) {
		this.rank5Count = rank5Count;
	}

	@Column(name = "Rank_6_Count")
	public Integer getRank6Count() {
		return this.rank6Count;
	}

	public void setRank6Count(Integer rank6Count) {
		this.rank6Count = rank6Count;
	}

	@Column(name = "Rank_7_Count")
	public Integer getRank7Count() {
		return this.rank7Count;
	}

	public void setRank7Count(Integer rank7Count) {
		this.rank7Count = rank7Count;
	}

	@Column(name = "Rank_8_Count")
	public Integer getRank8Count() {
		return this.rank8Count;
	}

	public void setRank8Count(Integer rank8Count) {
		this.rank8Count = rank8Count;
	}

	@Column(name = "Rank_9_Count")
	public Integer getRank9Count() {
		return this.rank9Count;
	}

	public void setRank9Count(Integer rank9Count) {
		this.rank9Count = rank9Count;
	}

	@Column(name = "Rank_10_Count")
	public Integer getRank10Count() {
		return this.rank10Count;
	}

	public void setRank10Count(Integer rank10Count) {
		this.rank10Count = rank10Count;
	}

	@Column(name = "Rank_11_Count")
	public Integer getRank11Count() {
		return this.rank11Count;
	}

	public void setRank11Count(Integer rank11Count) {
		this.rank11Count = rank11Count;
	}

	@Column(name = "Rank_12_Count")
	public Integer getRank12Count() {
		return this.rank12Count;
	}

	public void setRank12Count(Integer rank12Count) {
		this.rank12Count = rank12Count;
	}

	@Column(name = "Rank_13_Count")
	public Integer getRank13Count() {
		return this.rank13Count;
	}

	public void setRank13Count(Integer rank13Count) {
		this.rank13Count = rank13Count;
	}

	@Column(name = "Rank_14_Count")
	public Integer getRank14Count() {
		return this.rank14Count;
	}

	public void setRank14Count(Integer rank14Count) {
		this.rank14Count = rank14Count;
	}

	@Column(name = "Rank_15_Count")
	public Integer getRank15Count() {
		return this.rank15Count;
	}

	public void setRank15Count(Integer rank15Count) {
		this.rank15Count = rank15Count;
	}

	@Column(name = "Rank_16_Count")
	public Integer getRank16Count() {
		return this.rank16Count;
	}

	public void setRank16Count(Integer rank16Count) {
		this.rank16Count = rank16Count;
	}

	@Column(name = "Rank_17_Count")
	public Integer getRank17Count() {
		return this.rank17Count;
	}

	public void setRank17Count(Integer rank17Count) {
		this.rank17Count = rank17Count;
	}

	@Column(name = "Rank_18_Count")
	public Integer getRank18Count() {
		return this.rank18Count;
	}

	public void setRank18Count(Integer rank18Count) {
		this.rank18Count = rank18Count;
	}

	@Column(name = "Rank_19_Count")
	public Integer getRank19Count() {
		return this.rank19Count;
	}

	public void setRank19Count(Integer rank19Count) {
		this.rank19Count = rank19Count;
	}

	@Column(name = "Rank_20_Count")
	public Integer getRank20Count() {
		return this.rank20Count;
	}

	public void setRank20Count(Integer rank20Count) {
		this.rank20Count = rank20Count;
	}

	@Column(name = "account_id")
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Column(name = "cadre_id")
	public Integer getCadreId() {
		return this.cadreId;
	}

	public void setCadreId(Integer cadreId) {
		this.cadreId = cadreId;
	}

	@Column(name = "current_individual_crpb")
	public Integer getCurrentIndividualCrpb() {
		return this.currentIndividualCrpb;
	}

	public void setCurrentIndividualCrpb(Integer currentIndividualCrpb) {
		this.currentIndividualCrpb = currentIndividualCrpb;
	}

	@Column(name = "current_individual_crpb_old")
	public Integer getCurrentIndividualCrpbOld() {
		return this.currentIndividualCrpbOld;
	}

	public void setCurrentIndividualCrpbOld(Integer currentIndividualCrpbOld) {
		this.currentIndividualCrpbOld = currentIndividualCrpbOld;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "added_by", nullable = false)
	public String getAddedBy() {
		return this.addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	@Column(name = "code_no")
	public Integer getCodeNo() {
		return this.codeNo;
	}

	public void setCodeNo(Integer codeNo) {
		this.codeNo = codeNo;
	}

	@Column(name = "mo_id")
	public Integer getMoId() {
		return this.moId;
	}

	public void setMoId(Integer moId) {
		this.moId = moId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agents")
	public Set<AgentTds> getAgentTdses() {
		return this.agentTdses;
	}

	public void setAgentTdses(Set agentTdses) {
		this.agentTdses = agentTdses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agents")
	public Set<DocumentsSubmitted> getDocumentsSubmitteds() {
		return this.documentsSubmitteds;
	}

	public void setDocumentsSubmitteds(Set documentsSubmitteds) {
		this.documentsSubmitteds = documentsSubmitteds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agents")
	public Set<AgentGuarantors> getAgentGuarantorses() {
		return this.agentGuarantorses;
	}

	public void setAgentGuarantorses(Set agentGuarantorses) {
		this.agentGuarantorses = agentGuarantorses;
	}

}
