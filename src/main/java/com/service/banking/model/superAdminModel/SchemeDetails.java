package com.service.banking.model.superAdminModel;

import java.math.BigDecimal;
import java.util.Date;

public class SchemeDetails {
	
	private Integer id;
	private String name;
	private Boolean activeStatus;
	private String interest;
	private Integer maturityPeriod;
	private String schemeGroup;
	private Double minLimit;
	private Double maxLimit;
	private Integer crpb;
	private Double commission;
	private String interestMode;
	private String interestRateMode;
	private String accountOpenningCommission;
	private String collectorCommissionRate;
	private Integer percentLoanOnDeposit;
	private Integer noLoanOnDepositTill;
	private String preMatureInterests;
	private Date validTill;
	private BigDecimal matureInterestsForUncompleteProduct;
	private Integer headId;
	
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
	private String interestToAnotherAccountPercent;
	private Byte isDepriciable;
	private String depriciationPercentBeforeSep;
	private String depriciationPercentAfterSep;
	private Boolean processingFeesinPercent;
	private Boolean published;
	private Float schemePoints;
	private String agentSponsorCommission;

	private String reducingOrFlatRate;
	private String type;



	private Integer panelty;
	private Integer paneltyGrace;


}
