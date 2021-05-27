package com.service.banking.model.hodAuthorityModel;

import java.math.BigDecimal;
import java.util.Date;

import com.service.banking.hibernateEntity.Accounts;
import com.service.banking.hibernateEntity.Agents;
import com.service.banking.hibernateEntity.Transactions;

public class AgentTdsDetail {
	
	private Integer id;
	private Agents agents;
	private Date createdAt;
	private BigDecimal totalCommission;
	private BigDecimal tds;
	private BigDecimal netCommission;

}
