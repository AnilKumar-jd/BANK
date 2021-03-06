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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * StockRows generated by hbm2java
 */
@Entity
@Table(name = "stock_rows")
public class StockRows implements java.io.Serializable {

	private Integer id;
	private Branches branches;
	private StockContainers stockContainers;
	private String name;
	private Set stockTransactionsesForFromRowId = new HashSet(0);
	private Set stockTransactionsesForToRowId = new HashSet(0);
	private Set stockContainerrowitemqties = new HashSet(0);

	public StockRows() {
	}

	public StockRows(Branches branches, StockContainers stockContainers, String name,
			Set stockTransactionsesForFromRowId, Set stockTransactionsesForToRowId, Set stockContainerrowitemqties) {
		this.branches = branches;
		this.stockContainers = stockContainers;
		this.name = name;
		this.stockTransactionsesForFromRowId = stockTransactionsesForFromRowId;
		this.stockTransactionsesForToRowId = stockTransactionsesForToRowId;
		this.stockContainerrowitemqties = stockContainerrowitemqties;
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
	@JoinColumn(name = "branch_id")
	public Branches getBranches() {
		return this.branches;
	}

	public void setBranches(Branches branches) {
		this.branches = branches;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "container_id")
	public StockContainers getStockContainers() {
		return this.stockContainers;
	}

	public void setStockContainers(StockContainers stockContainers) {
		this.stockContainers = stockContainers;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stockRowsByFromRowId")
	public Set<StockTransactions> getStockTransactionsesForFromRowId() {
		return this.stockTransactionsesForFromRowId;
	}

	public void setStockTransactionsesForFromRowId(Set stockTransactionsesForFromRowId) {
		this.stockTransactionsesForFromRowId = stockTransactionsesForFromRowId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stockRowsByToRowId")
	public Set<StockTransactions> getStockTransactionsesForToRowId() {
		return this.stockTransactionsesForToRowId;
	}

	public void setStockTransactionsesForToRowId(Set stockTransactionsesForToRowId) {
		this.stockTransactionsesForToRowId = stockTransactionsesForToRowId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stockRows")
	public Set<StockContainerrowitemqty> getStockContainerrowitemqties() {
		return this.stockContainerrowitemqties;
	}

	public void setStockContainerrowitemqties(Set stockContainerrowitemqties) {
		this.stockContainerrowitemqties = stockContainerrowitemqties;
	}

}
