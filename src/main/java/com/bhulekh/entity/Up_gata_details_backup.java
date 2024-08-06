package com.bhulekh.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "backup.up_gata_detail")
public class Up_gata_details_backup {

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
	private String khasra_no;
	private float area;
	private String yr_co_ten;

	private String m_admn_flag;
	private String created_by;

	private String last_modified_by;

	private long unique_code;
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String device_serialno;

	@Column(name = "last_modified_on", columnDefinition = "timestamp(3) without time zone")
	private LocalDateTime last_modified_on;

	@Column(name = "conversion_date", columnDefinition = "timestamp(3) without time zone")
	private LocalDateTime conversionDate;

	@Column(name = "created_on", columnDefinition = "timestamp(3) without time zone")
	private LocalDateTime createdOn;

	@Column(name = "dsc_date", columnDefinition = "timestamp(3) without time zone")
	private LocalDateTime dscDate;

	public Up_gata_details_backup(int seq_no, String district_code_census, String tehsil_code_census,
			String pargana_code_new, String village_code_census, String village_code, String kval, String part,
			String khata_number, String old_khata_number, String khasra_no, float area, String yr_co_ten,
			String m_admn_flag, String created_by, String last_modified_by, long unique_code, String c1, String c2,
			String c3, String c4, String device_serialno, LocalDateTime last_modified_on, LocalDateTime conversionDate,
			LocalDateTime createdOn, LocalDateTime dscDate) {
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
		this.khasra_no = khasra_no;
		this.area = area;
		this.yr_co_ten = yr_co_ten;
		this.m_admn_flag = m_admn_flag;
		this.created_by = created_by;
		this.last_modified_by = last_modified_by;
		this.unique_code = unique_code;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.device_serialno = device_serialno;
		this.last_modified_on = last_modified_on;
		this.conversionDate = conversionDate;
		this.createdOn = createdOn;
		this.dscDate = dscDate;
	}

	public Up_gata_details_backup() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getKhasra_no() {
		return khasra_no;
	}

	public void setKhasra_no(String khasra_no) {
		this.khasra_no = khasra_no;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public String getYr_co_ten() {
		return yr_co_ten;
	}

	public void setYr_co_ten(String yr_co_ten) {
		this.yr_co_ten = yr_co_ten;
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

	public String getLast_modified_by() {
		return last_modified_by;
	}

	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}

	public long getUnique_code() {
		return unique_code;
	}

	public void setUnique_code(long unique_code) {
		this.unique_code = unique_code;
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

	public String getDevice_serialno() {
		return device_serialno;
	}

	public void setDevice_serialno(String device_serialno) {
		this.device_serialno = device_serialno;
	}

	public LocalDateTime getLast_modified_on() {
		return last_modified_on;
	}

	public void setLast_modified_on(LocalDateTime last_modified_on) {
		this.last_modified_on = last_modified_on;
	}

	public LocalDateTime getConversionDate() {
		return conversionDate;
	}

	public void setConversionDate(LocalDateTime conversionDate) {
		this.conversionDate = conversionDate;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getDscDate() {
		return dscDate;
	}

	public void setDscDate(LocalDateTime dscDate) {
		this.dscDate = dscDate;
	}

	@Override
	public String toString() {
		return "Up_gata_detail [seq_no=" + seq_no + ", district_code_census=" + district_code_census
				+ ", tehsil_code_census=" + tehsil_code_census + ", pargana_code_new=" + pargana_code_new
				+ ", village_code_census=" + village_code_census + ", village_code=" + village_code + ", kval=" + kval
				+ ", part=" + part + ", khata_number=" + khata_number + ", old_khata_number=" + old_khata_number
				+ ", khasra_no=" + khasra_no + ", area=" + area + ", yr_co_ten=" + yr_co_ten + ", m_admn_flag="
				+ m_admn_flag + ", created_by=" + created_by + ", last_modified_by=" + last_modified_by
				+ ", unique_code=" + unique_code + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + ", c4=" + c4
				+ ", device_serialno=" + device_serialno + ", last_modified_on=" + last_modified_on
				+ ", conversionDate=" + conversionDate + ", createdOn=" + createdOn + ", dscDate=" + dscDate + "]";
	}

}
