package com.bhulekh.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_owner_detail")
public class Up_owner_detail {
	@Id
	private int seq_no;
	private String district_code_census;
	private String tehsil_code_census;
	private String pargana_code_new;
	private String village_code_census;
	private String village_code;
	private String kval;
	private String part;
	private String khata_number;
	private String old_khata_number;
	private String name;
	private String father;
	private String address;
	private String caste;
	private double hissa;

	private Integer owner_no;
	private Timestamp conversion_date;
	private String m_admn_flag;
	private String created_by;
	private Timestamp created_on;
	private String last_modified_by;
	private Timestamp last_modified_on;
	private String aadhar_no;
	private String mobile_no;
	private String device_serialno;
	private Timestamp dsc_date;

	public int getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}

	public String getDistrict_code_census() {
		return district_code_census;
	}

	public void setDistrict_code_census(String district_code_census) {
		this.district_code_census = district_code_census;
	}

	public String getTehsil_code_census() {
		return tehsil_code_census;
	}

	public void setTehsil_code_census(String tehsil_code_census) {
		this.tehsil_code_census = tehsil_code_census;
	}

	public String getPargana_code_new() {
		return pargana_code_new;
	}

	public void setPargana_code_new(String pargana_code_new) {
		this.pargana_code_new = pargana_code_new;
	}

	public String getVillage_code_census() {
		return village_code_census;
	}

	public void setVillage_code_census(String village_code_census) {
		this.village_code_census = village_code_census;
	}

	public String getVillage_code() {
		return village_code;
	}

	public void setVillage_code(String village_code) {
		this.village_code = village_code;
	}

	public String getKval() {
		return kval;
	}

	public void setKval(String kval) {
		this.kval = kval;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getKhata_number() {
		return khata_number;
	}

	public void setKhata_number(String khata_number) {
		this.khata_number = khata_number;
	}

	public String getOld_khata_number() {
		return old_khata_number;
	}

	public void setOld_khata_number(String old_khata_number) {
		this.old_khata_number = old_khata_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public double getHissa() {
		return hissa;
	}

	public void setHissa(double hissa) {
		this.hissa = hissa;
	}

	public Integer getOwner_no() {
		return owner_no;
	}

	public void setOwner_no(Integer owner_no) {
		this.owner_no = owner_no;
	}

	public Timestamp getConversion_date() {
		return conversion_date;
	}

	public void setConversion_date(Timestamp conversion_date) {
		this.conversion_date = conversion_date;
	}

	public String getM_admn_flag() {
		return m_admn_flag;
	}

	public void setM_admn_flag(String m_admn_flag) {
		this.m_admn_flag = m_admn_flag;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	public String getLast_modified_by() {
		return last_modified_by;
	}

	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}

	public Timestamp getLast_modified_on() {
		return last_modified_on;
	}

	public void setLast_modified_on(Timestamp last_modified_on) {
		this.last_modified_on = last_modified_on;
	}

	public String getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getDevice_serialno() {
		return device_serialno;
	}

	public void setDevice_serialno(String device_serialno) {
		this.device_serialno = device_serialno;
	}

	public Timestamp getDsc_date() {
		return dsc_date;
	}

	public void setDsc_date(Timestamp dsc_date) {
		this.dsc_date = dsc_date;
	}

	@Override
	public String toString() {
		return "Up_owner_detail [seq_no=" + seq_no + ", district_code_census=" + district_code_census
				+ ", tehsil_code_census=" + tehsil_code_census + ", pargana_code_new=" + pargana_code_new
				+ ", village_code_census=" + village_code_census + ", village_code=" + village_code + ", kval=" + kval
				+ ", part=" + part + ", khata_number=" + khata_number + ", old_khata_number=" + old_khata_number
				+ ", name=" + name + ", father=" + father + ", address=" + address + ", caste=" + caste + ", hissa="
				+ hissa + ", owner_no=" + owner_no + ", conversion_date=" + conversion_date + ", m_admn_flag="
				+ m_admn_flag + ", created_by=" + created_by + ", created_on=" + created_on + ", last_modified_by="
				+ last_modified_by + ", last_modified_on=" + last_modified_on + ", aadhar_no=" + aadhar_no
				+ ", mobile_no=" + mobile_no + ", device_serialno=" + device_serialno + ", dsc_date=" + dsc_date + "]";
	}

	public Up_owner_detail(int seq_no, String district_code_census, String tehsil_code_census, String pargana_code_new,
			String village_code_census, String village_code, String kval, String part, String khata_number,
			String old_khata_number, String name, String father, String address, String caste, double hissa,
			Integer owner_no, Timestamp conversion_date, String m_admn_flag, String created_by, Timestamp created_on,
			String last_modified_by, Timestamp last_modified_on, String aadhar_no, String mobile_no,
			String device_serialno, Timestamp dsc_date) {
		super();
		this.seq_no = seq_no;
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.pargana_code_new = pargana_code_new;
		this.village_code_census = village_code_census;
		this.village_code = village_code;
		this.kval = kval;
		this.part = part;
		this.khata_number = khata_number;
		this.old_khata_number = old_khata_number;
		this.name = name;
		this.father = father;
		this.address = address;
		this.caste = caste;
		this.hissa = hissa;
		this.owner_no = owner_no;
		this.conversion_date = conversion_date;
		this.m_admn_flag = m_admn_flag;
		this.created_by = created_by;
		this.created_on = created_on;
		this.last_modified_by = last_modified_by;
		this.last_modified_on = last_modified_on;
		this.aadhar_no = aadhar_no;
		this.mobile_no = mobile_no;
		this.device_serialno = device_serialno;
		this.dsc_date = dsc_date;
	}

	public Up_owner_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
