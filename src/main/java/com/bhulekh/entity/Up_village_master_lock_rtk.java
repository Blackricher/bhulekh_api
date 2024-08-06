package com.bhulekh.entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_village_master_lock_rtk")
public class Up_village_master_lock_rtk {

	@Column(name = "district_code_census")
	@Id
	private String districtCodeCensus;

	@Column(name = "tehsil_code_census")
	private String tehsilCodeCensus;

	@Column(name = "village_code_census")
	private String villageCodeCensus;

	private String status;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_on")
	private Timestamp createdOn;

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "last_modified_on")
	private Timestamp lastModifiedOn;

	@Column(name = "created_ip_address")
	private String createdIpAddress;

	private String flg1;
	private String flg2;
	private String flg3;

	@Column(name = "modified_ip_address")
	private String modifiedIpAddress;

	@Column(name = "rk_unlock_by")
	private String rkUnlockBy;

	@Column(name = "rk_unlock_on")
	private Timestamp rkUnlockOn;

	@Column(name = "rk_unlock_ip")
	private String rkUnlockIp;

	@Column(name = "sdm_unlock_by")
	private String sdmUnlockBy;

	@Column(name = "sdm_unlock_on")
	private Timestamp sdmUnlockOn;

	@Column(name = "sdm_unlock_ip")
	private String sdmUnlockIp;

	@Column(name = "dm_unlock_date")
	private Date dmUnlockDate;

	@Column(name = "check_person_name")
	private String checkPersonName;

	@Column(name = "check_person_date")
	private Date checkPersonDate;

	@Column(name = "dm_unlock_by")
	private String dmUnlockBy;

	@Column(name = "dm_unlock_ip")
	private String dmUnlockIp;

	@Column(name = "dm_unlock_on")
	private Timestamp dmUnlockOn;

	@Column(name = "dm_letter_no")
	private String dmLetterNo;

	@Column(name = "dm_lock_by")
	private String dmLockBy;

	@Column(name = "dm_lock_ip")
	private String dmLockIp;

	@Column(name = "dm_lock_on")
	private Timestamp dmLockOn;

	@Column(name = "dm_return_by")
	private String dmReturnBy;

	@Column(name = "dm_return_ip")
	private String dmReturnIp;

	@Column(name = "dm_return_remark")
	private String dmReturnRemark;

	@Column(name = "dm_return_on")
	private Timestamp dmReturnOn;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getCreatedIpAddress() {
		return createdIpAddress;
	}

	public void setCreatedIpAddress(String createdIpAddress) {
		this.createdIpAddress = createdIpAddress;
	}

	public String getFlg1() {
		return flg1;
	}

	public void setFlg1(String flg1) {
		this.flg1 = flg1;
	}

	public String getFlg2() {
		return flg2;
	}

	public void setFlg2(String flg2) {
		this.flg2 = flg2;
	}

	public String getFlg3() {
		return flg3;
	}

	public void setFlg3(String flg3) {
		this.flg3 = flg3;
	}

	public String getModifiedIpAddress() {
		return modifiedIpAddress;
	}

	public void setModifiedIpAddress(String modifiedIpAddress) {
		this.modifiedIpAddress = modifiedIpAddress;
	}

	public String getRkUnlockBy() {
		return rkUnlockBy;
	}

	public void setRkUnlockBy(String rkUnlockBy) {
		this.rkUnlockBy = rkUnlockBy;
	}

	public Timestamp getRkUnlockOn() {
		return rkUnlockOn;
	}

	public void setRkUnlockOn(Timestamp rkUnlockOn) {
		this.rkUnlockOn = rkUnlockOn;
	}

	public String getRkUnlockIp() {
		return rkUnlockIp;
	}

	public void setRkUnlockIp(String rkUnlockIp) {
		this.rkUnlockIp = rkUnlockIp;
	}

	public String getSdmUnlockBy() {
		return sdmUnlockBy;
	}

	public void setSdmUnlockBy(String sdmUnlockBy) {
		this.sdmUnlockBy = sdmUnlockBy;
	}

	public Timestamp getSdmUnlockOn() {
		return sdmUnlockOn;
	}

	public void setSdmUnlockOn(Timestamp sdmUnlockOn) {
		this.sdmUnlockOn = sdmUnlockOn;
	}

	public String getSdmUnlockIp() {
		return sdmUnlockIp;
	}

	public void setSdmUnlockIp(String sdmUnlockIp) {
		this.sdmUnlockIp = sdmUnlockIp;
	}

	public Date getDmUnlockDate() {
		return dmUnlockDate;
	}

	public void setDmUnlockDate(Date dmUnlockDate) {
		this.dmUnlockDate = dmUnlockDate;
	}

	public String getCheckPersonName() {
		return checkPersonName;
	}

	public void setCheckPersonName(String checkPersonName) {
		this.checkPersonName = checkPersonName;
	}

	public Date getCheckPersonDate() {
		return checkPersonDate;
	}

	public void setCheckPersonDate(Date checkPersonDate) {
		this.checkPersonDate = checkPersonDate;
	}

	public String getDmUnlockBy() {
		return dmUnlockBy;
	}

	public void setDmUnlockBy(String dmUnlockBy) {
		this.dmUnlockBy = dmUnlockBy;
	}

	public String getDmUnlockIp() {
		return dmUnlockIp;
	}

	public void setDmUnlockIp(String dmUnlockIp) {
		this.dmUnlockIp = dmUnlockIp;
	}

	public Timestamp getDmUnlockOn() {
		return dmUnlockOn;
	}

	public void setDmUnlockOn(Timestamp dmUnlockOn) {
		this.dmUnlockOn = dmUnlockOn;
	}

	public String getDmLetterNo() {
		return dmLetterNo;
	}

	public void setDmLetterNo(String dmLetterNo) {
		this.dmLetterNo = dmLetterNo;
	}

	public String getDmLockBy() {
		return dmLockBy;
	}

	public void setDmLockBy(String dmLockBy) {
		this.dmLockBy = dmLockBy;
	}

	public String getDmLockIp() {
		return dmLockIp;
	}

	public void setDmLockIp(String dmLockIp) {
		this.dmLockIp = dmLockIp;
	}

	public Timestamp getDmLockOn() {
		return dmLockOn;
	}

	public void setDmLockOn(Timestamp dmLockOn) {
		this.dmLockOn = dmLockOn;
	}

	public String getDmReturnBy() {
		return dmReturnBy;
	}

	public void setDmReturnBy(String dmReturnBy) {
		this.dmReturnBy = dmReturnBy;
	}

	public String getDmReturnIp() {
		return dmReturnIp;
	}

	public void setDmReturnIp(String dmReturnIp) {
		this.dmReturnIp = dmReturnIp;
	}

	public String getDmReturnRemark() {
		return dmReturnRemark;
	}

	public void setDmReturnRemark(String dmReturnRemark) {
		this.dmReturnRemark = dmReturnRemark;
	}

	public Timestamp getDmReturnOn() {
		return dmReturnOn;
	}

	public void setDmReturnOn(Timestamp dmReturnOn) {
		this.dmReturnOn = dmReturnOn;
	}

	public Up_village_master_lock_rtk(String districtCodeCensus, String tehsilCodeCensus, String villageCodeCensus,
			String status, String createdBy, Timestamp createdOn, String lastModifiedBy, Timestamp lastModifiedOn,
			String createdIpAddress, String flg1, String flg2, String flg3, String modifiedIpAddress, String rkUnlockBy,
			Timestamp rkUnlockOn, String rkUnlockIp, String sdmUnlockBy, Timestamp sdmUnlockOn, String sdmUnlockIp,
			Date dmUnlockDate, String checkPersonName, Date checkPersonDate, String dmUnlockBy, String dmUnlockIp,
			Timestamp dmUnlockOn, String dmLetterNo, String dmLockBy, String dmLockIp, Timestamp dmLockOn,
			String dmReturnBy, String dmReturnIp, String dmReturnRemark, Timestamp dmReturnOn) {
		super();
		this.districtCodeCensus = districtCodeCensus;
		this.tehsilCodeCensus = tehsilCodeCensus;
		this.villageCodeCensus = villageCodeCensus;
		this.status = status;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedOn = lastModifiedOn;
		this.createdIpAddress = createdIpAddress;
		this.flg1 = flg1;
		this.flg2 = flg2;
		this.flg3 = flg3;
		this.modifiedIpAddress = modifiedIpAddress;
		this.rkUnlockBy = rkUnlockBy;
		this.rkUnlockOn = rkUnlockOn;
		this.rkUnlockIp = rkUnlockIp;
		this.sdmUnlockBy = sdmUnlockBy;
		this.sdmUnlockOn = sdmUnlockOn;
		this.sdmUnlockIp = sdmUnlockIp;
		this.dmUnlockDate = dmUnlockDate;
		this.checkPersonName = checkPersonName;
		this.checkPersonDate = checkPersonDate;
		this.dmUnlockBy = dmUnlockBy;
		this.dmUnlockIp = dmUnlockIp;
		this.dmUnlockOn = dmUnlockOn;
		this.dmLetterNo = dmLetterNo;
		this.dmLockBy = dmLockBy;
		this.dmLockIp = dmLockIp;
		this.dmLockOn = dmLockOn;
		this.dmReturnBy = dmReturnBy;
		this.dmReturnIp = dmReturnIp;
		this.dmReturnRemark = dmReturnRemark;
		this.dmReturnOn = dmReturnOn;
	}

	@Override
	public String toString() {
		return "Up_village_master_lock_rtk [districtCodeCensus=" + districtCodeCensus + ", tehsilCodeCensus="
				+ tehsilCodeCensus + ", villageCodeCensus=" + villageCodeCensus + ", status=" + status + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedOn="
				+ lastModifiedOn + ", createdIpAddress=" + createdIpAddress + ", flg1=" + flg1 + ", flg2=" + flg2
				+ ", flg3=" + flg3 + ", modifiedIpAddress=" + modifiedIpAddress + ", rkUnlockBy=" + rkUnlockBy
				+ ", rkUnlockOn=" + rkUnlockOn + ", rkUnlockIp=" + rkUnlockIp + ", sdmUnlockBy=" + sdmUnlockBy
				+ ", sdmUnlockOn=" + sdmUnlockOn + ", sdmUnlockIp=" + sdmUnlockIp + ", dmUnlockDate=" + dmUnlockDate
				+ ", checkPersonName=" + checkPersonName + ", checkPersonDate=" + checkPersonDate + ", dmUnlockBy="
				+ dmUnlockBy + ", dmUnlockIp=" + dmUnlockIp + ", dmUnlockOn=" + dmUnlockOn + ", dmLetterNo="
				+ dmLetterNo + ", dmLockBy=" + dmLockBy + ", dmLockIp=" + dmLockIp + ", dmLockOn=" + dmLockOn
				+ ", dmReturnBy=" + dmReturnBy + ", dmReturnIp=" + dmReturnIp + ", dmReturnRemark=" + dmReturnRemark
				+ ", dmReturnOn=" + dmReturnOn + "]";
	}

	public Up_village_master_lock_rtk() {
		super();
		// TODO Auto-generated constructor stub
	}

}