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
 * JosXschemesOld generated by hbm2java
 */
@Entity
@Table(name = "jos_xschemes_old")
public class JosXschemesOld implements java.io.Serializable {

	private Integer id;
	private String name;
	private Double minLimit;
	private Double maxLimit;
	private String interest;
	private String interestMode;
	private String interestRateMode;
	private Boolean loanType;
	private String accountOpenningCommission;
	private Double commission;
	private Boolean activeStatus;
	private int branchId;
	private Date createdAt;
	private Date updatedAt;
	private Double processingFees;
	private int balanceSheetId;
	private String postingMode;
	private String premiumMode;
	private Boolean createDefaultAccount;
	private String schemeType;
	private Boolean interestToAnotherAccount;
	private Integer numberOfPremiums;
	private Integer maturityPeriod;
	private String interestToAnotherAccountPercent;
	private Byte isDepriciable;
	private String depriciationPercentBeforeSep;
	private String depriciationPercentAfterSep;
	private Boolean processingFeesinPercent;
	private Boolean published;
	private Float schemePoints;
	private String agentSponsorCommission;
	private String collectorCommissionRate;
	private String reducingOrFlatRate;

	public JosXschemesOld() {
	}

	public JosXschemesOld(int branchId, int balanceSheetId) {
		this.branchId = branchId;
		this.balanceSheetId = balanceSheetId;
	}

	public JosXschemesOld(String name, Double minLimit, Double maxLimit, String interest, String interestMode,
			String interestRateMode, Boolean loanType, String accountOpenningCommission, Double commission,
			Boolean activeStatus, int branchId, Date createdAt, Date updatedAt, Double processingFees,
			int balanceSheetId, String postingMode, String premiumMode, Boolean createDefaultAccount, String schemeType,
			Boolean interestToAnotherAccount, Integer numberOfPremiums, Integer maturityPeriod,
			String interestToAnotherAccountPercent, Byte isDepriciable, String depriciationPercentBeforeSep,
			String depriciationPercentAfterSep, Boolean processingFeesinPercent, Boolean published, Float schemePoints,
			String agentSponsorCommission, String collectorCommissionRate, String reducingOrFlatRate) {
		this.name = name;
		this.minLimit = minLimit;
		this.maxLimit = maxLimit;
		this.interest = interest;
		this.interestMode = interestMode;
		this.interestRateMode = interestRateMode;
		this.loanType = loanType;
		this.accountOpenningCommission = accountOpenningCommission;
		this.commission = commission;
		this.activeStatus = activeStatus;
		this.branchId = branchId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.processingFees = processingFees;
		this.balanceSheetId = balanceSheetId;
		this.postingMode = postingMode;
		this.premiumMode = premiumMode;
		this.createDefaultAccount = createDefaultAccount;
		this.schemeType = schemeType;
		this.interestToAnotherAccount = interestToAnotherAccount;
		this.numberOfPremiums = numberOfPremiums;
		this.maturityPeriod = maturityPeriod;
		this.interestToAnotherAccountPercent = interestToAnotherAccountPercent;
		this.isDepriciable = isDepriciable;
		this.depriciationPercentBeforeSep = depriciationPercentBeforeSep;
		this.depriciationPercentAfterSep = depriciationPercentAfterSep;
		this.processingFeesinPercent = processingFeesinPercent;
		this.published = published;
		this.schemePoints = schemePoints;
		this.agentSponsorCommission = agentSponsorCommission;
		this.collectorCommissionRate = collectorCommissionRate;
		this.reducingOrFlatRate = reducingOrFlatRate;
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

	@Column(name = "Name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "MinLimit", precision = 22, scale = 0)
	public Double getMinLimit() {
		return this.minLimit;
	}

	public void setMinLimit(Double minLimit) {
		this.minLimit = minLimit;
	}

	@Column(name = "MaxLimit", precision = 22, scale = 0)
	public Double getMaxLimit() {
		return this.maxLimit;
	}

	public void setMaxLimit(Double maxLimit) {
		this.maxLimit = maxLimit;
	}

	@Column(name = "Interest", length = 45)
	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Column(name = "InterestMode", length = 45)
	public String getInterestMode() {
		return this.interestMode;
	}

	public void setInterestMode(String interestMode) {
		this.interestMode = interestMode;
	}

	@Column(name = "InterestRateMode", length = 45)
	public String getInterestRateMode() {
		return this.interestRateMode;
	}

	public void setInterestRateMode(String interestRateMode) {
		this.interestRateMode = interestRateMode;
	}

	@Column(name = "LoanType")
	public Boolean getLoanType() {
		return this.loanType;
	}

	public void setLoanType(Boolean loanType) {
		this.loanType = loanType;
	}

	@Column(name = "AccountOpenningCommission", length = 200)
	public String getAccountOpenningCommission() {
		return this.accountOpenningCommission;
	}

	public void setAccountOpenningCommission(String accountOpenningCommission) {
		this.accountOpenningCommission = accountOpenningCommission;
	}

	@Column(name = "Commission", precision = 22, scale = 0)
	public Double getCommission() {
		return this.commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	@Column(name = "ActiveStatus")
	public Boolean getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Column(name = "branch_id", nullable = false)
	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
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

	@Column(name = "ProcessingFees", precision = 22, scale = 0)
	public Double getProcessingFees() {
		return this.processingFees;
	}

	public void setProcessingFees(Double processingFees) {
		this.processingFees = processingFees;
	}

	@Column(name = "balance_sheet_id", nullable = false)
	public int getBalanceSheetId() {
		return this.balanceSheetId;
	}

	public void setBalanceSheetId(int balanceSheetId) {
		this.balanceSheetId = balanceSheetId;
	}

	@Column(name = "PostingMode", length = 45)
	public String getPostingMode() {
		return this.postingMode;
	}

	public void setPostingMode(String postingMode) {
		this.postingMode = postingMode;
	}

	@Column(name = "PremiumMode", length = 45)
	public String getPremiumMode() {
		return this.premiumMode;
	}

	public void setPremiumMode(String premiumMode) {
		this.premiumMode = premiumMode;
	}

	@Column(name = "CreateDefaultAccount")
	public Boolean getCreateDefaultAccount() {
		return this.createDefaultAccount;
	}

	public void setCreateDefaultAccount(Boolean createDefaultAccount) {
		this.createDefaultAccount = createDefaultAccount;
	}

	@Column(name = "SchemeType", length = 45)
	public String getSchemeType() {
		return this.schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	@Column(name = "InterestToAnotherAccount")
	public Boolean getInterestToAnotherAccount() {
		return this.interestToAnotherAccount;
	}

	public void setInterestToAnotherAccount(Boolean interestToAnotherAccount) {
		this.interestToAnotherAccount = interestToAnotherAccount;
	}

	@Column(name = "NumberOfPremiums")
	public Integer getNumberOfPremiums() {
		return this.numberOfPremiums;
	}

	public void setNumberOfPremiums(Integer numberOfPremiums) {
		this.numberOfPremiums = numberOfPremiums;
	}

	@Column(name = "MaturityPeriod")
	public Integer getMaturityPeriod() {
		return this.maturityPeriod;
	}

	public void setMaturityPeriod(Integer maturityPeriod) {
		this.maturityPeriod = maturityPeriod;
	}

	@Column(name = "InterestToAnotherAccountPercent", length = 45)
	public String getInterestToAnotherAccountPercent() {
		return this.interestToAnotherAccountPercent;
	}

	public void setInterestToAnotherAccountPercent(String interestToAnotherAccountPercent) {
		this.interestToAnotherAccountPercent = interestToAnotherAccountPercent;
	}

	@Column(name = "isDepriciable")
	public Byte getIsDepriciable() {
		return this.isDepriciable;
	}

	public void setIsDepriciable(Byte isDepriciable) {
		this.isDepriciable = isDepriciable;
	}

	@Column(name = "DepriciationPercentBeforeSep", length = 45)
	public String getDepriciationPercentBeforeSep() {
		return this.depriciationPercentBeforeSep;
	}

	public void setDepriciationPercentBeforeSep(String depriciationPercentBeforeSep) {
		this.depriciationPercentBeforeSep = depriciationPercentBeforeSep;
	}

	@Column(name = "DepriciationPercentAfterSep", length = 45)
	public String getDepriciationPercentAfterSep() {
		return this.depriciationPercentAfterSep;
	}

	public void setDepriciationPercentAfterSep(String depriciationPercentAfterSep) {
		this.depriciationPercentAfterSep = depriciationPercentAfterSep;
	}

	@Column(name = "ProcessingFeesinPercent")
	public Boolean getProcessingFeesinPercent() {
		return this.processingFeesinPercent;
	}

	public void setProcessingFeesinPercent(Boolean processingFeesinPercent) {
		this.processingFeesinPercent = processingFeesinPercent;
	}

	@Column(name = "published")
	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	@Column(name = "SchemePoints", precision = 11, scale = 0)
	public Float getSchemePoints() {
		return this.schemePoints;
	}

	public void setSchemePoints(Float schemePoints) {
		this.schemePoints = schemePoints;
	}

	@Column(name = "AgentSponsorCommission", length = 2500)
	public String getAgentSponsorCommission() {
		return this.agentSponsorCommission;
	}

	public void setAgentSponsorCommission(String agentSponsorCommission) {
		this.agentSponsorCommission = agentSponsorCommission;
	}

	@Column(name = "CollectorCommissionRate")
	public String getCollectorCommissionRate() {
		return this.collectorCommissionRate;
	}

	public void setCollectorCommissionRate(String collectorCommissionRate) {
		this.collectorCommissionRate = collectorCommissionRate;
	}

	@Column(name = "ReducingOrFlatRate", length = 45)
	public String getReducingOrFlatRate() {
		return this.reducingOrFlatRate;
	}

	public void setReducingOrFlatRate(String reducingOrFlatRate) {
		this.reducingOrFlatRate = reducingOrFlatRate;
	}

}
