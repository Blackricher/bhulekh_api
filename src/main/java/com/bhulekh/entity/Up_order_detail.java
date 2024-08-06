package com.bhulekh.entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_order_detail")
public class Up_order_detail {

	private String district_code_census;
	private String tehsil_code_census;
	private String pargana_code_new;
	private String village_code_census;
	private String village_code;
	private String kval;
	private String part;
	private String khata_number;
	private String old_khata_number;
	private String order_desc;
	private String remark;
	@Id
	private int seq_no;
	private Timestamp conversion_date;
	private String m_admn_flag;
	private String created_by;
	private Timestamp created_on;
	private String last_modified_by;
	private Timestamp last_modified_on;
	private Date order_date;
	private String order_no;
	private String device_serialno;
	private Timestamp dsc_date;

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

	public String getOrder_desc() {
		return order_desc;
	}

	public void setOrder_desc(String order_desc) {
		this.order_desc = order_desc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
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

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
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
		return "Up_order_detail [district_code_census=" + district_code_census + ", tehsil_code_census="
				+ tehsil_code_census + ", pargana_code_new=" + pargana_code_new + ", village_code_census="
				+ village_code_census + ", village_code=" + village_code + ", kval=" + kval + ", part=" + part
				+ ", khata_number=" + khata_number + ", old_khata_number=" + old_khata_number + ", order_desc="
				+ order_desc + ", remark=" + remark + ", seq_no=" + seq_no + ", conversion_date=" + conversion_date
				+ ", m_admn_flag=" + m_admn_flag + ", created_by=" + created_by + ", created_on=" + created_on
				+ ", last_modified_by=" + last_modified_by + ", last_modified_on=" + last_modified_on + ", order_date="
				+ order_date + ", order_no=" + order_no + ", device_serialno=" + device_serialno + ", dsc_date="
				+ dsc_date + "]";
	}

	public Up_order_detail(String district_code_census, String tehsil_code_census, String pargana_code_new,
			String village_code_census, String village_code, String kval, String part, String khata_number,
			String old_khata_number, String order_desc, String remark, int seq_no, Timestamp conversion_date,
			String m_admn_flag, String created_by, Timestamp created_on, String last_modified_by,
			Timestamp last_modified_on, Date order_date, String order_no, String device_serialno, Timestamp dsc_date) {
		super();
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.pargana_code_new = pargana_code_new;
		this.village_code_census = village_code_census;
		this.village_code = village_code;
		this.kval = kval;
		this.part = part;
		this.khata_number = khata_number;
		this.old_khata_number = old_khata_number;
		this.order_desc = order_desc;
		this.remark = remark;
		this.seq_no = seq_no;
		this.conversion_date = conversion_date;
		this.m_admn_flag = m_admn_flag;
		this.created_by = created_by;
		this.created_on = created_on;
		this.last_modified_by = last_modified_by;
		this.last_modified_on = last_modified_on;
		this.order_date = order_date;
		this.order_no = order_no;
		this.device_serialno = device_serialno;
		this.dsc_date = dsc_date;
	}

	public Up_order_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
