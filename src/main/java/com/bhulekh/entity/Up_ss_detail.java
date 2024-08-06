package com.bhulekh.entity;

import java.sql.Timestamp;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_ss_detail")
public class Up_ss_detail {

	@Id
	@Column(name = "seq_no", nullable = false)
	private Integer seqNo;

	@Column(name = "district_code_census", nullable = false, length = 3)
	private String districtCodeCensus;

	@Column(name = "tehsil_code_census", nullable = false, length = 5)
	private String tehsilCodeCensus;

	@Column(name = "village_code_census", length = 20)
	private String villageCodeCensus;

	@Column(name = "village_name", length = 100)
	private String villageName;

	@Column(name = "mohalla_name", length = 100)
	private String mohallaName;

	@Column(name = "thana", length = 100)
	private String thana;

	@Column(name = "address", length = 100)
	private String address;

	@Column(name = "ward", length = 100)
	private String ward;

	@Column(name = "city", length = 50)
	private String city;

	@Column(name = "pincode", length = 6)
	private String pincode;

	@Column(name = "khata_number", length = 10)
	private String khataNumber;

	@Column(name = "khasra_no", length = 15)
	private String khasraNo;

	@Column(name = "if_chak_old_khasra_no", length = 15)
	private String ifChakOldKhasraNo;

	@Column(name = "gata_unique_code")
	private Long gataUniqueCode;

	@Column(name = "irr_land", precision = 18, scale = 4)
	private Double irrLand;

	@Column(name = "non_irr_land_house", precision = 18, scale = 4)
	private Double nonIrrLandHouse;

	@Column(name = "non_irr_land_blank", precision = 18, scale = 4)
	private Double nonIrrLandBlank;

	@Column(name = "tot_area", precision = 18, scale = 4)
	private Double totArea;

	@Column(name = "east", length = 100)
	private String east;

	@Column(name = "west", length = 100)
	private String west;

	@Column(name = "north", length = 100)
	private String north;

	@Column(name = "south", length = 100)
	private String south;

	@Column(name = "ss_entry_year", length = 4)
	private String ssEntryYear;

	@Column(name = "ss_person_name", length = 100)
	private String ssPersonName;

	@Column(name = "ss_person_father_name", length = 100)
	private String ssPersonFatherName;

	@Column(name = "migration_date", length = 20)
	private String migrationDate;

	@Column(name = "migration_year", length = 4)
	private String migrationYear;

	@Column(name = "ss_area_complete", precision = 18, scale = 4)
	private Double ssAreaComplete;

	@Column(name = "ss_area_part", precision = 18, scale = 4)
	private Double ssAreaPart;

	@Column(name = "remark_if_auc", length = 200)
	private String remarkIfAuc;

	@Column(name = "ss_value", precision = 18, scale = 2)
	private Double ssValue;

	@Column(name = "tenant_name", length = 100)
	private String tenantName;

	@Column(name = "tenant_father_name", length = 100)
	private String tenantFatherName;

	@Column(name = "tenant_address", length = 100)
	private String tenantAddress;

	@Column(name = "occupancy_base", length = 100)
	private String occupancyBase;

	@Column(name = "occupancy_date", length = 20)
	private String occupancyDate;

	@Column(name = "ss_court_case_remark", length = 200)
	private String ssCourtCaseRemark;

	@Column(name = "reserve_area", precision = 18, scale = 4)
	private Double reserveArea;

	@Column(name = "gov_land_area", precision = 18, scale = 4)
	private Double govLandArea;

	@Column(name = "auc_area", precision = 18, scale = 4)
	private Double aucArea;

	@Column(name = "remark_for_auc", length = 200)
	private String remarkForAuc;

	@Lob
	@Column(name = "photo")
	private byte[] photo;

	@Column(name = "created_by", length = 50)
	private String createdBy;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "last_modified_by", length = 50)
	private String lastModifiedBy;

	@Column(name = "last_modified_on")
	private Timestamp lastModifiedOn;

	@Column(name = "balance_rent", precision = 18, scale = 2)
	private Double balanceRent;

	@Column(name = "department", length = 3)
	private String department;

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

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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

	public String getThana() {
		return thana;
	}

	public void setThana(String thana) {
		this.thana = thana;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getKhataNumber() {
		return khataNumber;
	}

	public void setKhataNumber(String khataNumber) {
		this.khataNumber = khataNumber;
	}

	public String getKhasraNo() {
		return khasraNo;
	}

	public void setKhasraNo(String khasraNo) {
		this.khasraNo = khasraNo;
	}

	public String getIfChakOldKhasraNo() {
		return ifChakOldKhasraNo;
	}

	public void setIfChakOldKhasraNo(String ifChakOldKhasraNo) {
		this.ifChakOldKhasraNo = ifChakOldKhasraNo;
	}

	public Long getGataUniqueCode() {
		return gataUniqueCode;
	}

	public void setGataUniqueCode(Long gataUniqueCode) {
		this.gataUniqueCode = gataUniqueCode;
	}

	public Double getIrrLand() {
		return irrLand;
	}

	public void setIrrLand(Double irrLand) {
		this.irrLand = irrLand;
	}

	public Double getNonIrrLandHouse() {
		return nonIrrLandHouse;
	}

	public void setNonIrrLandHouse(Double nonIrrLandHouse) {
		this.nonIrrLandHouse = nonIrrLandHouse;
	}

	public Double getNonIrrLandBlank() {
		return nonIrrLandBlank;
	}

	public void setNonIrrLandBlank(Double nonIrrLandBlank) {
		this.nonIrrLandBlank = nonIrrLandBlank;
	}

	public Double getTotArea() {
		return totArea;
	}

	public void setTotArea(Double totArea) {
		this.totArea = totArea;
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

	public String getSsEntryYear() {
		return ssEntryYear;
	}

	public void setSsEntryYear(String ssEntryYear) {
		this.ssEntryYear = ssEntryYear;
	}

	public String getSsPersonName() {
		return ssPersonName;
	}

	public void setSsPersonName(String ssPersonName) {
		this.ssPersonName = ssPersonName;
	}

	public String getSsPersonFatherName() {
		return ssPersonFatherName;
	}

	public void setSsPersonFatherName(String ssPersonFatherName) {
		this.ssPersonFatherName = ssPersonFatherName;
	}

	public String getMigrationDate() {
		return migrationDate;
	}

	public void setMigrationDate(String migrationDate) {
		this.migrationDate = migrationDate;
	}

	public String getMigrationYear() {
		return migrationYear;
	}

	public void setMigrationYear(String migrationYear) {
		this.migrationYear = migrationYear;
	}

	public Double getSsAreaComplete() {
		return ssAreaComplete;
	}

	public void setSsAreaComplete(Double ssAreaComplete) {
		this.ssAreaComplete = ssAreaComplete;
	}

	public Double getSsAreaPart() {
		return ssAreaPart;
	}

	public void setSsAreaPart(Double ssAreaPart) {
		this.ssAreaPart = ssAreaPart;
	}

	public String getRemarkIfAuc() {
		return remarkIfAuc;
	}

	public void setRemarkIfAuc(String remarkIfAuc) {
		this.remarkIfAuc = remarkIfAuc;
	}

	public Double getSsValue() {
		return ssValue;
	}

	public void setSsValue(Double ssValue) {
		this.ssValue = ssValue;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantFatherName() {
		return tenantFatherName;
	}

	public void setTenantFatherName(String tenantFatherName) {
		this.tenantFatherName = tenantFatherName;
	}

	public String getTenantAddress() {
		return tenantAddress;
	}

	public void setTenantAddress(String tenantAddress) {
		this.tenantAddress = tenantAddress;
	}

	public String getOccupancyBase() {
		return occupancyBase;
	}

	public void setOccupancyBase(String occupancyBase) {
		this.occupancyBase = occupancyBase;
	}

	public String getOccupancyDate() {
		return occupancyDate;
	}

	public void setOccupancyDate(String occupancyDate) {
		this.occupancyDate = occupancyDate;
	}

	public String getSsCourtCaseRemark() {
		return ssCourtCaseRemark;
	}

	public void setSsCourtCaseRemark(String ssCourtCaseRemark) {
		this.ssCourtCaseRemark = ssCourtCaseRemark;
	}

	public Double getReserveArea() {
		return reserveArea;
	}

	public void setReserveArea(Double reserveArea) {
		this.reserveArea = reserveArea;
	}

	public Double getGovLandArea() {
		return govLandArea;
	}

	public void setGovLandArea(Double govLandArea) {
		this.govLandArea = govLandArea;
	}

	public Double getAucArea() {
		return aucArea;
	}

	public void setAucArea(Double aucArea) {
		this.aucArea = aucArea;
	}

	public String getRemarkForAuc() {
		return remarkForAuc;
	}

	public void setRemarkForAuc(String remarkForAuc) {
		this.remarkForAuc = remarkForAuc;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
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

	public Double getBalanceRent() {
		return balanceRent;
	}

	public void setBalanceRent(Double balanceRent) {
		this.balanceRent = balanceRent;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Up_ss_detail(String districtCodeCensus, String tehsilCodeCensus, String villageCodeCensus, Integer seqNo,
			String villageName, String mohallaName, String thana, String address, String ward, String city,
			String pincode, String khataNumber, String khasraNo, String ifChakOldKhasraNo, Long gataUniqueCode,
			Double irrLand, Double nonIrrLandHouse, Double nonIrrLandBlank, Double totArea, String east, String west,
			String north, String south, String ssEntryYear, String ssPersonName, String ssPersonFatherName,
			String migrationDate, String migrationYear, Double ssAreaComplete, Double ssAreaPart, String remarkIfAuc,
			Double ssValue, String tenantName, String tenantFatherName, String tenantAddress, String occupancyBase,
			String occupancyDate, String ssCourtCaseRemark, Double reserveArea, Double govLandArea, Double aucArea,
			String remarkForAuc, byte[] photo, String createdBy, Timestamp createdOn, String lastModifiedBy,
			Timestamp lastModifiedOn, Double balanceRent, String department) {
		super();

		this.districtCodeCensus = districtCodeCensus;
		this.tehsilCodeCensus = tehsilCodeCensus;
		this.villageCodeCensus = villageCodeCensus;
		this.seqNo = seqNo;
		this.villageName = villageName;
		this.mohallaName = mohallaName;
		this.thana = thana;
		this.address = address;
		this.ward = ward;
		this.city = city;
		this.pincode = pincode;
		this.khataNumber = khataNumber;
		this.khasraNo = khasraNo;
		this.ifChakOldKhasraNo = ifChakOldKhasraNo;
		this.gataUniqueCode = gataUniqueCode;
		this.irrLand = irrLand;
		this.nonIrrLandHouse = nonIrrLandHouse;
		this.nonIrrLandBlank = nonIrrLandBlank;
		this.totArea = totArea;
		this.east = east;
		this.west = west;
		this.north = north;
		this.south = south;
		this.ssEntryYear = ssEntryYear;
		this.ssPersonName = ssPersonName;
		this.ssPersonFatherName = ssPersonFatherName;
		this.migrationDate = migrationDate;
		this.migrationYear = migrationYear;
		this.ssAreaComplete = ssAreaComplete;
		this.ssAreaPart = ssAreaPart;
		this.remarkIfAuc = remarkIfAuc;
		this.ssValue = ssValue;
		this.tenantName = tenantName;
		this.tenantFatherName = tenantFatherName;
		this.tenantAddress = tenantAddress;
		this.occupancyBase = occupancyBase;
		this.occupancyDate = occupancyDate;
		this.ssCourtCaseRemark = ssCourtCaseRemark;
		this.reserveArea = reserveArea;
		this.govLandArea = govLandArea;
		this.aucArea = aucArea;
		this.remarkForAuc = remarkForAuc;
		this.photo = photo;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedOn = lastModifiedOn;
		this.balanceRent = balanceRent;
		this.department = department;
	}

	public Up_ss_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Up_ss_detail [districtCodeCensus=" + districtCodeCensus + ", tehsilCodeCensus=" + tehsilCodeCensus
				+ ", villageCodeCensus=" + villageCodeCensus + ", seqNo=" + seqNo + ", villageName=" + villageName
				+ ", mohallaName=" + mohallaName + ", thana=" + thana + ", address=" + address + ", ward=" + ward
				+ ", city=" + city + ", pincode=" + pincode + ", khataNumber=" + khataNumber + ", khasraNo=" + khasraNo
				+ ", ifChakOldKhasraNo=" + ifChakOldKhasraNo + ", gataUniqueCode=" + gataUniqueCode + ", irrLand="
				+ irrLand + ", nonIrrLandHouse=" + nonIrrLandHouse + ", nonIrrLandBlank=" + nonIrrLandBlank
				+ ", totArea=" + totArea + ", east=" + east + ", west=" + west + ", north=" + north + ", south=" + south
				+ ", ssEntryYear=" + ssEntryYear + ", ssPersonName=" + ssPersonName + ", ssPersonFatherName="
				+ ssPersonFatherName + ", migrationDate=" + migrationDate + ", migrationYear=" + migrationYear
				+ ", ssAreaComplete=" + ssAreaComplete + ", ssAreaPart=" + ssAreaPart + ", remarkIfAuc=" + remarkIfAuc
				+ ", ssValue=" + ssValue + ", tenantName=" + tenantName + ", tenantFatherName=" + tenantFatherName
				+ ", tenantAddress=" + tenantAddress + ", occupancyBase=" + occupancyBase + ", occupancyDate="
				+ occupancyDate + ", ssCourtCaseRemark=" + ssCourtCaseRemark + ", reserveArea=" + reserveArea
				+ ", govLandArea=" + govLandArea + ", aucArea=" + aucArea + ", remarkForAuc=" + remarkForAuc
				+ ", photo=" + Arrays.toString(photo) + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedOn=" + lastModifiedOn + ", balanceRent="
				+ balanceRent + ", department=" + department + "]";
	}

}
