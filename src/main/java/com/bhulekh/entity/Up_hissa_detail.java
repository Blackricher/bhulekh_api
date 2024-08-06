package com.bhulekh.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_hissa_detail")
public class Up_hissa_detail {
	@Id
	private int seq_no;
	private String district_code_census;
	private String tehsil_code_census;
	private String pargana_code_new;
	private String village_code_census;
	private String fasli_year;
	private String land_type;
	private String part;
	private String kval;
	private String khata_number;
	private String old_khata_number;
	private double land_revenue_payable;
	private String name;
	private String father;
	private String address;
	private int owner_no;
	private String caste;
	private String aadhar_no;
	private String mobile_no;
	private String khasra_no;
	private double area;
	private double hissa;
	private String hissa_reason;
	private String yr_co_ten;

	private long unique_gata_id;
	private Timestamp conversion_date;
	private String created_by;
	private Timestamp created_on;
	private String last_modified_by;
	private Timestamp last_modified_on;
	private String device_serialno;
	private Timestamp dsc_date;
	private String share;
	private String remark;
	private String pan_no;
	private String dob;
	private String gender;

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

	public String getFasli_year() {
		return fasli_year;
	}

	public void setFasli_year(String fasli_year) {
		this.fasli_year = fasli_year;
	}

	public String getLand_type() {
		return land_type;
	}

	public void setLand_type(String land_type) {
		this.land_type = land_type;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getKval() {
		return kval;
	}

	public void setKval(String kval) {
		this.kval = kval;
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

	public double getLand_revenue_payable() {
		return land_revenue_payable;
	}

	public void setLand_revenue_payable(double land_revenue_payable) {
		this.land_revenue_payable = land_revenue_payable;
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

	public int getOwner_no() {
		return owner_no;
	}

	public void setOwner_no(int owner_no) {
		this.owner_no = owner_no;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
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

	public String getKhasra_no() {
		return khasra_no;
	}

	public void setKhasra_no(String khasra_no) {
		this.khasra_no = khasra_no;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getHissa() {
		return hissa;
	}

	public void setHissa(double hissa) {
		this.hissa = hissa;
	}

	public String getHissa_reason() {
		return hissa_reason;
	}

	public void setHissa_reason(String hissa_reason) {
		this.hissa_reason = hissa_reason;
	}

	public String getYr_co_ten() {
		return yr_co_ten;
	}

	public void setYr_co_ten(String yr_co_ten) {
		this.yr_co_ten = yr_co_ten;
	}

	public long getUnique_gata_id() {
		return unique_gata_id;
	}

	public void setUnique_gata_id(long unique_gata_id) {
		this.unique_gata_id = unique_gata_id;
	}

	public Timestamp getConversion_date() {
		return conversion_date;
	}

	public void setConversion_date(Timestamp conversion_date) {
		this.conversion_date = conversion_date;
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

	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Up_hissa_detail(int seq_no, String district_code_census, String tehsil_code_census, String pargana_code_new,
			String village_code_census, String fasli_year, String land_type, String part, String kval,
			String khata_number, String old_khata_number, double land_revenue_payable, String name, String father,
			String address, int owner_no, String caste, String aadhar_no, String mobile_no, String khasra_no,
			double area, double hissa, String hissa_reason, String yr_co_ten, long unique_gata_id,
			Timestamp conversion_date, String created_by, Timestamp created_on, String last_modified_by,
			Timestamp last_modified_on, String device_serialno, Timestamp dsc_date, String share, String remark,
			String pan_no, String dob, String gender) {
		super();
		this.seq_no = seq_no;
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.pargana_code_new = pargana_code_new;
		this.village_code_census = village_code_census;
		this.fasli_year = fasli_year;
		this.land_type = land_type;
		this.part = part;
		this.kval = kval;
		this.khata_number = khata_number;
		this.old_khata_number = old_khata_number;
		this.land_revenue_payable = land_revenue_payable;
		this.name = name;
		this.father = father;
		this.address = address;
		this.owner_no = owner_no;
		this.caste = caste;
		this.aadhar_no = aadhar_no;
		this.mobile_no = mobile_no;
		this.khasra_no = khasra_no;
		this.area = area;
		this.hissa = hissa;
		this.hissa_reason = hissa_reason;
		this.yr_co_ten = yr_co_ten;
		this.unique_gata_id = unique_gata_id;
		this.conversion_date = conversion_date;
		this.created_by = created_by;
		this.created_on = created_on;
		this.last_modified_by = last_modified_by;
		this.last_modified_on = last_modified_on;
		this.device_serialno = device_serialno;
		this.dsc_date = dsc_date;
		this.share = share;
		this.remark = remark;
		this.pan_no = pan_no;
		this.dob = dob;
		this.gender = gender;
	}

	public Up_hissa_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Up_hissa_detail [seq_no=" + seq_no + ", district_code_census=" + district_code_census
				+ ", tehsil_code_census=" + tehsil_code_census + ", pargana_code_new=" + pargana_code_new
				+ ", village_code_census=" + village_code_census + ", fasli_year=" + fasli_year + ", land_type="
				+ land_type + ", part=" + part + ", kval=" + kval + ", khata_number=" + khata_number
				+ ", old_khata_number=" + old_khata_number + ", land_revenue_payable=" + land_revenue_payable
				+ ", name=" + name + ", father=" + father + ", address=" + address + ", owner_no=" + owner_no
				+ ", caste=" + caste + ", aadhar_no=" + aadhar_no + ", mobile_no=" + mobile_no + ", khasra_no="
				+ khasra_no + ", area=" + area + ", hissa=" + hissa + ", hissa_reason=" + hissa_reason + ", yr_co_ten="
				+ yr_co_ten + ", unique_gata_id=" + unique_gata_id + ", conversion_date=" + conversion_date
				+ ", created_by=" + created_by + ", created_on=" + created_on + ", last_modified_by=" + last_modified_by
				+ ", last_modified_on=" + last_modified_on + ", device_serialno=" + device_serialno + ", dsc_date="
				+ dsc_date + ", share=" + share + ", remark=" + remark + ", pan_no=" + pan_no + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}

}
