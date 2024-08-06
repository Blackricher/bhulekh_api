package com.bhulekh.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_gata_land_revenue")
public class Up_gata_land_revenue {

	@Column(name = "village_code_census")
	private String villageCodeCensus;

	@Column(name = "unique_code")
	private Long uniqueCode;

	@Id
	@Column(name = "land_revenue")
	private Integer landRevenue;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "ip_address")
	private String ipAddress;

	private String c1;
	private String c2;
	private String c3;
	private String c4;

	public String getVillageCodeCensus() {
		return villageCodeCensus;
	}

	public void setVillageCodeCensus(String villageCodeCensus) {
		this.villageCodeCensus = villageCodeCensus;
	}

	public Long getUniqueCode() {
		return uniqueCode;
	}

	public void setUniqueCode(Long uniqueCode) {
		this.uniqueCode = uniqueCode;
	}

	public Integer getLandRevenue() {
		return landRevenue;
	}

	public void setLandRevenue(Integer landRevenue) {
		this.landRevenue = landRevenue;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getC4() {
		return c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	@Override
	public String toString() {
		return "Up_gata_land_revenue [villageCodeCensus=" + villageCodeCensus + ", uniqueCode=" + uniqueCode
				+ ", landRevenue=" + landRevenue + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", ipAddress=" + ipAddress + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + ", c4=" + c4 + "]";
	}

	public Up_gata_land_revenue(String villageCodeCensus, Long uniqueCode, Integer landRevenue, String createdBy,
			Timestamp createdOn, String ipAddress, String c1, String c2, String c3, String c4) {
		super();
		this.villageCodeCensus = villageCodeCensus;
		this.uniqueCode = uniqueCode;
		this.landRevenue = landRevenue;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.ipAddress = ipAddress;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
	}

	public Up_gata_land_revenue() {
		super();
		// TODO Auto-generated constructor stub
	}

}
