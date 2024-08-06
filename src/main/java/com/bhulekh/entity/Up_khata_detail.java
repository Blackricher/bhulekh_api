package com.bhulekh.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "up_khata_detail")
@Entity
public class Up_khata_detail {
	@Id
	private Integer seq_no;
	private String district_code_census;
	private String tehsil_code_census;
	private String pargana_code_new;
	private String village_code_census;
	private String vill_no;
	private String fasli_year;
	private String land_type;
	private String part;
	private String village_code;
	private String kval;
	private String khata_number;
	private String old_khata_number;
	private BigDecimal land_revenue_payable;
	private Integer tot_no_holders;
	private Integer tot_no_plots;
	private BigDecimal tot_area;
	private Integer tot_no_orders;

	private Timestamp conversion_date;
	private String m_admn_flag;
	private String created_by;
	private Timestamp created_on;
	private String last_modified_by;
	private Timestamp last_modified_on;
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

	public String getVill_no() {
		return vill_no;
	}

	public void setVill_no(String vill_no) {
		this.vill_no = vill_no;
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

	public BigDecimal getLand_revenue_payable() {
		return land_revenue_payable;
	}

	public void setLand_revenue_payable(BigDecimal land_revenue_payable) {
		this.land_revenue_payable = land_revenue_payable;
	}

	public Integer getTot_no_holders() {
		return tot_no_holders;
	}

	public void setTot_no_holders(Integer tot_no_holders) {
		this.tot_no_holders = tot_no_holders;
	}

	public Integer getTot_no_plots() {
		return tot_no_plots;
	}

	public void setTot_no_plots(Integer tot_no_plots) {
		this.tot_no_plots = tot_no_plots;
	}

	public BigDecimal getTot_area() {
		return tot_area;
	}

	public void setTot_area(BigDecimal tot_area) {
		this.tot_area = tot_area;
	}

	public Integer getTot_no_orders() {
		return tot_no_orders;
	}

	public void setTot_no_orders(Integer tot_no_orders) {
		this.tot_no_orders = tot_no_orders;
	}

	public Integer getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(Integer seq_no) {
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
		return "Up_khata_detail [ district_code_census=" + district_code_census + ", tehsil_code_census="
				+ tehsil_code_census + ", pargana_code_new=" + pargana_code_new + ", village_code_census="
				+ village_code_census + ", vill_no=" + vill_no + ", fasli_year=" + fasli_year + ", land_type="
				+ land_type + ", part=" + part + ", village_code=" + village_code + ", kval=" + kval + ", khata_number="
				+ khata_number + ", old_khata_number=" + old_khata_number + ", land_revenue_payable="
				+ land_revenue_payable + ", tot_no_holders=" + tot_no_holders + ", tot_no_plots=" + tot_no_plots
				+ ", tot_area=" + tot_area + ", tot_no_orders=" + tot_no_orders + ", seq_no=" + seq_no
				+ ", conversion_date=" + conversion_date + ", m_admn_flag=" + m_admn_flag + ", created_by=" + created_by
				+ ", created_on=" + created_on + ", last_modified_by=" + last_modified_by + ", last_modified_on="
				+ last_modified_on + ", device_serialno=" + device_serialno + ", dsc_date=" + dsc_date + "]";
	}

	public Up_khata_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Up_khata_detail(String district_code_census, String tehsil_code_census, String pargana_code_new,
			String village_code_census, String vill_no, String fasli_year, String land_type, String part,
			String village_code, String kval, String khata_number, String old_khata_number,
			BigDecimal land_revenue_payable, Integer tot_no_holders, Integer tot_no_plots, BigDecimal tot_area,
			Integer tot_no_orders, Integer seq_no, Timestamp conversion_date, String m_admn_flag, String created_by,
			Timestamp created_on, String last_modified_by, Timestamp last_modified_on, String device_serialno,
			Timestamp dsc_date) {
		super();

		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.pargana_code_new = pargana_code_new;
		this.village_code_census = village_code_census;
		this.vill_no = vill_no;
		this.fasli_year = fasli_year;
		this.land_type = land_type;
		this.part = part;
		this.village_code = village_code;
		this.kval = kval;
		this.khata_number = khata_number;
		this.old_khata_number = old_khata_number;
		this.land_revenue_payable = land_revenue_payable;
		this.tot_no_holders = tot_no_holders;
		this.tot_no_plots = tot_no_plots;
		this.tot_area = tot_area;
		this.tot_no_orders = tot_no_orders;
		this.seq_no = seq_no;
		this.conversion_date = conversion_date;
		this.m_admn_flag = m_admn_flag;
		this.created_by = created_by;
		this.created_on = created_on;
		this.last_modified_by = last_modified_by;
		this.last_modified_on = last_modified_on;
		this.device_serialno = device_serialno;
		this.dsc_date = dsc_date;
	}

}
