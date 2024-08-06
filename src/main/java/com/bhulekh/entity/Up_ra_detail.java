package com.bhulekh.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_ra_detail")
public class Up_ra_detail {

	@Id
	@Column(name = "seq_no", nullable = false)
	private Integer seqNo;

	@Column(name = "district_code_census", length = 3)
	private String districtCodeCensus;

	@Column(name = "tehsil_code_census", length = 5, nullable = false)
	private String tehsilCodeCensus;

	@Column(name = "village_code_census", length = 6)
	private String villageCodeCensus;

	@Column(name = "village_name", length = 100)
	private String villageName;

	@Column(name = "mohalla_name", length = 100)
	private String mohallaName;

	@Column(name = "address", length = 100)
	private String address;

	@Column(name = "pincode", length = 6)
	private String pincode;

	@Column(name = "bandobast_no", length = 15)
	private String bandobastNo;

	@Column(name = "sampatti_area", precision = 18, scale = 4)
	private BigDecimal sampattiArea;

	@Column(name = "east", length = 100)
	private String east;

	@Column(name = "west", length = 100)
	private String west;

	@Column(name = "north", length = 100)
	private String north;

	@Column(name = "south", length = 100)
	private String south;

	@Column(name = "go_used_land", length = 30)
	private String goUsedLand;

	@Lob
	@Column(name = "go_used_land_order")
	private byte[] goUsedLandOrder;

	@Column(name = "possesion_type", length = 1)
	private String possesionType;

	@Column(name = "possesion_type_text", length = 100)
	private String possesionTypeText;

	@Column(name = "used_type", length = 1)
	private String usedType;

	@Column(name = "used_type_text", length = 100)
	private String usedTypeText;

	@Column(name = "go_possesion_land", length = 30)
	private String goPossesionLand;

	@Lob
	@Column(name = "go_possesion_land_order")
	private byte[] goPossesionLandOrder;

	@Column(name = "possesion_auth", length = 100)
	private String possesionAuth;

	@Column(name = "tenant_name", length = 100)
	private String tenantName;

	@Column(name = "lease_start_date", length = 20)
	private String leaseStartDate;

	@Column(name = "lease_end_date", length = 20)
	private String leaseEndDate;

	@Column(name = "yearly_rent", precision = 18, scale = 2)
	private BigDecimal yearlyRent;

	@Column(name = "balance_rent", precision = 18, scale = 2)
	private BigDecimal balanceRent;

	@Column(name = "department", length = 100)
	private String department;

	@Column(name = "actual_yearly_income", precision = 18, scale = 2)
	private BigDecimal actualYearlyIncome;

	@Column(name = "income_source", length = 100)
	private String incomeSource;

	@Column(name = "order_no_if_partition", length = 30)
	private String orderNoIfPartition;

	@Lob
	@Column(name = "order_no_if_partition_order")
	private byte[] orderNoIfPartitionOrder;

	@Column(name = "order_date_if_partition", length = 20)
	private String orderDateIfPartition;

	@Column(name = "name_if_partition", length = 100)
	private String nameIfPartition;

	@Column(name = "verification_date", length = 20)
	private String verificationDate;

	@Column(name = "verification_officer_name", length = 100)
	private String verificationOfficerName;

	@Column(name = "verification_officer_post", length = 100)
	private String verificationOfficerPost;

	@Column(name = "physical_verification_date", length = 20)
	private String physicalVerificationDate;

	@Column(name = "physical_verification_officer_name", length = 100)
	private String physicalVerificationOfficerName;

	@Column(name = "physical_verification_officer_post", length = 100)
	private String physicalVerificationOfficerPost;

	@Column(name = "thana", length = 100)
	private String thana;

	@Column(name = "a2", length = 20)
	private String a2;

	@Column(name = "a3", length = 20)
	private String a3;

	@Column(name = "a4", length = 20)
	private String a4;

	@Column(name = "created_by", length = 50)
	private String createdBy;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "last_modified_by", length = 50)
	private String lastModifiedBy;

	@Column(name = "last_modified_on")
	private Timestamp lastModifiedOn;

	public Up_ra_detail(Integer seqNo, String districtCodeCensus, String tehsilCodeCensus, String villageCodeCensus,
			String villageName, String mohallaName, String address, String pincode, String bandobastNo,
			BigDecimal sampattiArea, String east, String west, String north, String south, String goUsedLand,
			byte[] goUsedLandOrder, String possesionType, String possesionTypeText, String usedType,
			String usedTypeText, String goPossesionLand, byte[] goPossesionLandOrder, String possesionAuth,
			String tenantName, String leaseStartDate, String leaseEndDate, BigDecimal yearlyRent,
			BigDecimal balanceRent, String department, BigDecimal actualYearlyIncome, String incomeSource,
			String orderNoIfPartition, byte[] orderNoIfPartitionOrder, String orderDateIfPartition,
			String nameIfPartition, String verificationDate, String verificationOfficerName,
			String verificationOfficerPost, String physicalVerificationDate, String physicalVerificationOfficerName,
			String physicalVerificationOfficerPost, String thana, String a2, String a3, String a4, String createdBy,
			Timestamp createdOn, String lastModifiedBy, Timestamp lastModifiedOn) {
		super();
		this.seqNo = seqNo;
		this.districtCodeCensus = districtCodeCensus;
		this.tehsilCodeCensus = tehsilCodeCensus;
		this.villageCodeCensus = villageCodeCensus;
		this.villageName = villageName;
		this.mohallaName = mohallaName;
		this.address = address;
		this.pincode = pincode;
		this.bandobastNo = bandobastNo;
		this.sampattiArea = sampattiArea;
		this.east = east;
		this.west = west;
		this.north = north;
		this.south = south;
		this.goUsedLand = goUsedLand;
		this.goUsedLandOrder = goUsedLandOrder;
		this.possesionType = possesionType;
		this.possesionTypeText = possesionTypeText;
		this.usedType = usedType;
		this.usedTypeText = usedTypeText;
		this.goPossesionLand = goPossesionLand;
		this.goPossesionLandOrder = goPossesionLandOrder;
		this.possesionAuth = possesionAuth;
		this.tenantName = tenantName;
		this.leaseStartDate = leaseStartDate;
		this.leaseEndDate = leaseEndDate;
		this.yearlyRent = yearlyRent;
		this.balanceRent = balanceRent;
		this.department = department;
		this.actualYearlyIncome = actualYearlyIncome;
		this.incomeSource = incomeSource;
		this.orderNoIfPartition = orderNoIfPartition;
		this.orderNoIfPartitionOrder = orderNoIfPartitionOrder;
		this.orderDateIfPartition = orderDateIfPartition;
		this.nameIfPartition = nameIfPartition;
		this.verificationDate = verificationDate;
		this.verificationOfficerName = verificationOfficerName;
		this.verificationOfficerPost = verificationOfficerPost;
		this.physicalVerificationDate = physicalVerificationDate;
		this.physicalVerificationOfficerName = physicalVerificationOfficerName;
		this.physicalVerificationOfficerPost = physicalVerificationOfficerPost;
		this.thana = thana;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedOn = lastModifiedOn;
	}

	public Up_ra_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public String getDistrictCodeCensus() {
		return districtCodeCensus;
	}

	public void setDistrictCodeCensus(String districtCodeCensus) {
		this.districtCodeCensus = districtCodeCensus;
	}

	public String getTehsilCodeCensus() {
		return tehsilCodeCensus;
	}

	public void setTehsilCodeCensus(String tehsilCodeCensus) {
		this.tehsilCodeCensus = tehsilCodeCensus;
	}

	public String getVillageCodeCensus() {
		return villageCodeCensus;
	}

	public void setVillageCodeCensus(String villageCodeCensus) {
		this.villageCodeCensus = villageCodeCensus;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getMohallaName() {
		return mohallaName;
	}

	public void setMohallaName(String mohallaName) {
		this.mohallaName = mohallaName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getBandobastNo() {
		return bandobastNo;
	}

	public void setBandobastNo(String bandobastNo) {
		this.bandobastNo = bandobastNo;
	}

	public BigDecimal getSampattiArea() {
		return sampattiArea;
	}

	public void setSampattiArea(BigDecimal sampattiArea) {
		this.sampattiArea = sampattiArea;
	}

	public String getEast() {
		return east;
	}

	public void setEast(String east) {
		this.east = east;
	}

	public String getWest() {
		return west;
	}

	public void setWest(String west) {
		this.west = west;
	}

	public String getNorth() {
		return north;
	}

	public void setNorth(String north) {
		this.north = north;
	}

	public String getSouth() {
		return south;
	}

	public void setSouth(String south) {
		this.south = south;
	}

	public String getGoUsedLand() {
		return goUsedLand;
	}

	public void setGoUsedLand(String goUsedLand) {
		this.goUsedLand = goUsedLand;
	}

	public byte[] getGoUsedLandOrder() {
		return goUsedLandOrder;
	}

	public void setGoUsedLandOrder(byte[] goUsedLandOrder) {
		this.goUsedLandOrder = goUsedLandOrder;
	}

	public String getPossesionType() {
		return possesionType;
	}

	public void setPossesionType(String possesionType) {
		this.possesionType = possesionType;
	}

	public String getPossesionTypeText() {
		return possesionTypeText;
	}

	public void setPossesionTypeText(String possesionTypeText) {
		this.possesionTypeText = possesionTypeText;
	}

	public String getUsedType() {
		return usedType;
	}

	public void setUsedType(String usedType) {
		this.usedType = usedType;
	}

	public String getUsedTypeText() {
		return usedTypeText;
	}

	public void setUsedTypeText(String usedTypeText) {
		this.usedTypeText = usedTypeText;
	}

	public String getGoPossesionLand() {
		return goPossesionLand;
	}

	public void setGoPossesionLand(String goPossesionLand) {
		this.goPossesionLand = goPossesionLand;
	}

	public byte[] getGoPossesionLandOrder() {
		return goPossesionLandOrder;
	}

	public void setGoPossesionLandOrder(byte[] goPossesionLandOrder) {
		this.goPossesionLandOrder = goPossesionLandOrder;
	}

	public String getPossesionAuth() {
		return possesionAuth;
	}

	public void setPossesionAuth(String possesionAuth) {
		this.possesionAuth = possesionAuth;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getLeaseStartDate() {
		return leaseStartDate;
	}

	public void setLeaseStartDate(String leaseStartDate) {
		this.leaseStartDate = leaseStartDate;
	}

	public String getLeaseEndDate() {
		return leaseEndDate;
	}

	public void setLeaseEndDate(String leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	public BigDecimal getYearlyRent() {
		return yearlyRent;
	}

	public void setYearlyRent(BigDecimal yearlyRent) {
		this.yearlyRent = yearlyRent;
	}

	public BigDecimal getBalanceRent() {
		return balanceRent;
	}

	public void setBalanceRent(BigDecimal balanceRent) {
		this.balanceRent = balanceRent;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public BigDecimal getActualYearlyIncome() {
		return actualYearlyIncome;
	}

	public void setActualYearlyIncome(BigDecimal actualYearlyIncome) {
		this.actualYearlyIncome = actualYearlyIncome;
	}

	public String getIncomeSource() {
		return incomeSource;
	}

	public void setIncomeSource(String incomeSource) {
		this.incomeSource = incomeSource;
	}

	public String getOrderNoIfPartition() {
		return orderNoIfPartition;
	}

	public void setOrderNoIfPartition(String orderNoIfPartition) {
		this.orderNoIfPartition = orderNoIfPartition;
	}

	public byte[] getOrderNoIfPartitionOrder() {
		return orderNoIfPartitionOrder;
	}

	public void setOrderNoIfPartitionOrder(byte[] orderNoIfPartitionOrder) {
		this.orderNoIfPartitionOrder = orderNoIfPartitionOrder;
	}

	public String getOrderDateIfPartition() {
		return orderDateIfPartition;
	}

	public void setOrderDateIfPartition(String orderDateIfPartition) {
		this.orderDateIfPartition = orderDateIfPartition;
	}

	public String getNameIfPartition() {
		return nameIfPartition;
	}

	public void setNameIfPartition(String nameIfPartition) {
		this.nameIfPartition = nameIfPartition;
	}

	public String getVerificationDate() {
		return verificationDate;
	}

	public void setVerificationDate(String verificationDate) {
		this.verificationDate = verificationDate;
	}

	public String getVerificationOfficerName() {
		return verificationOfficerName;
	}

	public void setVerificationOfficerName(String verificationOfficerName) {
		this.verificationOfficerName = verificationOfficerName;
	}

	public String getVerificationOfficerPost() {
		return verificationOfficerPost;
	}

	public void setVerificationOfficerPost(String verificationOfficerPost) {
		this.verificationOfficerPost = verificationOfficerPost;
	}

	public String getPhysicalVerificationDate() {
		return physicalVerificationDate;
	}

	public void setPhysicalVerificationDate(String physicalVerificationDate) {
		this.physicalVerificationDate = physicalVerificationDate;
	}

	public String getPhysicalVerificationOfficerName() {
		return physicalVerificationOfficerName;
	}

	public void setPhysicalVerificationOfficerName(String physicalVerificationOfficerName) {
		this.physicalVerificationOfficerName = physicalVerificationOfficerName;
	}

	public String getPhysicalVerificationOfficerPost() {
		return physicalVerificationOfficerPost;
	}

	public void setPhysicalVerificationOfficerPost(String physicalVerificationOfficerPost) {
		this.physicalVerificationOfficerPost = physicalVerificationOfficerPost;
	}

	public String getThana() {
		return thana;
	}

	public void setThana(String thana) {
		this.thana = thana;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	public String getA4() {
		return a4;
	}

	public void setA4(String a4) {
		this.a4 = a4;
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

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Timestamp getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(Timestamp lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	@Override
	public String toString() {
		return "Up_ra_detail [seqNo=" + seqNo + ", districtCodeCensus=" + districtCodeCensus + ", tehsilCodeCensus="
				+ tehsilCodeCensus + ", villageCodeCensus=" + villageCodeCensus + ", villageName=" + villageName
				+ ", mohallaName=" + mohallaName + ", address=" + address + ", pincode=" + pincode + ", bandobastNo="
				+ bandobastNo + ", sampattiArea=" + sampattiArea + ", east=" + east + ", west=" + west + ", north="
				+ north + ", south=" + south + ", goUsedLand=" + goUsedLand + ", goUsedLandOrder="
				+ Arrays.toString(goUsedLandOrder) + ", possesionType=" + possesionType + ", possesionTypeText="
				+ possesionTypeText + ", usedType=" + usedType + ", usedTypeText=" + usedTypeText + ", goPossesionLand="
				+ goPossesionLand + ", goPossesionLandOrder=" + Arrays.toString(goPossesionLandOrder)
				+ ", possesionAuth=" + possesionAuth + ", tenantName=" + tenantName + ", leaseStartDate="
				+ leaseStartDate + ", leaseEndDate=" + leaseEndDate + ", yearlyRent=" + yearlyRent + ", balanceRent="
				+ balanceRent + ", department=" + department + ", actualYearlyIncome=" + actualYearlyIncome
				+ ", incomeSource=" + incomeSource + ", orderNoIfPartition=" + orderNoIfPartition
				+ ", orderNoIfPartitionOrder=" + Arrays.toString(orderNoIfPartitionOrder) + ", orderDateIfPartition="
				+ orderDateIfPartition + ", nameIfPartition=" + nameIfPartition + ", verificationDate="
				+ verificationDate + ", verificationOfficerName=" + verificationOfficerName
				+ ", verificationOfficerPost=" + verificationOfficerPost + ", physicalVerificationDate="
				+ physicalVerificationDate + ", physicalVerificationOfficerName=" + physicalVerificationOfficerName
				+ ", physicalVerificationOfficerPost=" + physicalVerificationOfficerPost + ", thana=" + thana + ", a2="
				+ a2 + ", a3=" + a3 + ", a4=" + a4 + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedOn=" + lastModifiedOn + "]";
	}

}
