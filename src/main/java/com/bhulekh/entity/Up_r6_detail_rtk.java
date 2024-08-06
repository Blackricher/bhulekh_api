package com.bhulekh.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_r6_detail_rtk")
public class Up_r6_detail_rtk {
	@Id
	private int seq_no;
	private String district_code_census;
	private String tehsil_code_census;
	private String pargana_code_new;
	private String village_code_census;
	private String fasli_year;
	private String khata_number;

	private String khasra_no;
	private BigDecimal area;
	private BigDecimal hissa;
	private BigDecimal land_revenue_payable;
	private String order_type;
	private String order_no;
	private Date order_date;
	private String trans_type;
	private BigDecimal t_amount;
	private String transfer_no;
	private Date transfer_date;
	private Date r_date;
	private String challan_no;
	private String special_remark;
	private String order_desc;
	private String created_by;
	private Timestamp created_on;
	private String last_modified_by;
	private Timestamp last_modified_on;
	private String device_serialno;
	private Timestamp dsc_date;
	private long unique_code;
	private String ip_address;
	private String flg_parwana;
	private String land_type;

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

	public String getKhata_number() {
		return khata_number;
	}

	public void setKhata_number(String khata_number) {
		this.khata_number = khata_number;
	}

	public String getKhasra_no() {
		return khasra_no;
	}

	public void setKhasra_no(String khasra_no) {
		this.khasra_no = khasra_no;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public BigDecimal getHissa() {
		return hissa;
	}

	public void setHissa(BigDecimal hissa) {
		this.hissa = hissa;
	}

	public BigDecimal getLand_revenue_payable() {
		return land_revenue_payable;
	}

	public void setLand_revenue_payable(BigDecimal land_revenue_payable) {
		this.land_revenue_payable = land_revenue_payable;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getTrans_type() {
		return trans_type;
	}

	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}

	public BigDecimal getT_amount() {
		return t_amount;
	}

	public void setT_amount(BigDecimal t_amount) {
		this.t_amount = t_amount;
	}

	public String getTransfer_no() {
		return transfer_no;
	}

	public void setTransfer_no(String transfer_no) {
		this.transfer_no = transfer_no;
	}

	public Date getTransfer_date() {
		return transfer_date;
	}

	public void setTransfer_date(Date transfer_date) {
		this.transfer_date = transfer_date;
	}

	public Date getR_date() {
		return r_date;
	}

	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}

	public String getChallan_no() {
		return challan_no;
	}

	public void setChallan_no(String challan_no) {
		this.challan_no = challan_no;
	}

	public String getSpecial_remark() {
		return special_remark;
	}

	public void setSpecial_remark(String special_remark) {
		this.special_remark = special_remark;
	}

	public String getOrder_desc() {
		return order_desc;
	}

	public void setOrder_desc(String order_desc) {
		this.order_desc = order_desc;
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

	public long getUnique_code() {
		return unique_code;
	}

	public void setUnique_code(long unique_code) {
		this.unique_code = unique_code;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getFlg_parwana() {
		return flg_parwana;
	}

	public void setFlg_parwana(String flg_parwana) {
		this.flg_parwana = flg_parwana;
	}

	public String getLand_type() {
		return land_type;
	}

	public void setLand_type(String land_type) {
		this.land_type = land_type;
	}

	@Override
	public String toString() {
		return "Up_r6_detail_rtk [seq_no=" + seq_no + ", district_code_census=" + district_code_census
				+ ", tehsil_code_census=" + tehsil_code_census + ", pargana_code_new=" + pargana_code_new
				+ ", village_code_census=" + village_code_census + ", fasli_year=" + fasli_year + ", khata_number="
				+ khata_number + ", khasra_no=" + khasra_no + ", area=" + area + ", hissa=" + hissa
				+ ", land_revenue_payable=" + land_revenue_payable + ", order_type=" + order_type + ", order_no="
				+ order_no + ", order_date=" + order_date + ", trans_type=" + trans_type + ", t_amount=" + t_amount
				+ ", transfer_no=" + transfer_no + ", transfer_date=" + transfer_date + ", r_date=" + r_date
				+ ", challan_no=" + challan_no + ", special_remark=" + special_remark + ", order_desc=" + order_desc
				+ ", created_by=" + created_by + ", created_on=" + created_on + ", last_modified_by=" + last_modified_by
				+ ", last_modified_on=" + last_modified_on + ", device_serialno=" + device_serialno + ", dsc_date="
				+ dsc_date + ", unique_code=" + unique_code + ", ip_address=" + ip_address + ", flg_parwana="
				+ flg_parwana + ", land_type=" + land_type + "]";
	}

	public Up_r6_detail_rtk(int seq_no, String district_code_census, String tehsil_code_census, String pargana_code_new,
			String village_code_census, String fasli_year, String khata_number, String khasra_no, BigDecimal area,
			BigDecimal hissa, BigDecimal land_revenue_payable, String order_type, String order_no, Date order_date,
			String trans_type, BigDecimal t_amount, String transfer_no, Date transfer_date, Date r_date,
			String challan_no, String special_remark, String order_desc, String created_by, Timestamp created_on,
			String last_modified_by, Timestamp last_modified_on, String device_serialno, Timestamp dsc_date,
			long unique_code, String ip_address, String flg_parwana, String land_type) {
		super();
		this.seq_no = seq_no;
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.pargana_code_new = pargana_code_new;
		this.village_code_census = village_code_census;
		this.fasli_year = fasli_year;
		this.khata_number = khata_number;
		this.khasra_no = khasra_no;
		this.area = area;
		this.hissa = hissa;
		this.land_revenue_payable = land_revenue_payable;
		this.order_type = order_type;
		this.order_no = order_no;
		this.order_date = order_date;
		this.trans_type = trans_type;
		this.t_amount = t_amount;
		this.transfer_no = transfer_no;
		this.transfer_date = transfer_date;
		this.r_date = r_date;
		this.challan_no = challan_no;
		this.special_remark = special_remark;
		this.order_desc = order_desc;
		this.created_by = created_by;
		this.created_on = created_on;
		this.last_modified_by = last_modified_by;
		this.last_modified_on = last_modified_on;
		this.device_serialno = device_serialno;
		this.dsc_date = dsc_date;
		this.unique_code = unique_code;
		this.ip_address = ip_address;
		this.flg_parwana = flg_parwana;
		this.land_type = land_type;
	}

	public Up_r6_detail_rtk() {
		super();
		// TODO Auto-generated constructor stub
	}

}
