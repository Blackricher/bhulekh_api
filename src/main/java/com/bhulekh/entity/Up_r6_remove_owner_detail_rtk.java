package com.bhulekh.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_r6_remove_owner_detail_rtk")
public class Up_r6_remove_owner_detail_rtk {

	private String village_code_census;
	private String fasli_year;
	private String khata_number;
	@Id
	private int seq_no;
	private String order_no;
	private String rname;
	private String rfather;
	private String r_address;
	private long unique_code;
	private BigDecimal r_hissa;
	private BigDecimal r_hissa_diff;
	private String flg;
	private String flg_ansh;
	private Timestamp created_on;

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

	public int getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRfather() {
		return rfather;
	}

	public void setRfather(String rfather) {
		this.rfather = rfather;
	}

	public String getR_address() {
		return r_address;
	}

	public void setR_address(String r_address) {
		this.r_address = r_address;
	}

	public long getUnique_code() {
		return unique_code;
	}

	public void setUnique_code(long unique_code) {
		this.unique_code = unique_code;
	}

	public BigDecimal getR_hissa() {
		return r_hissa;
	}

	public void setR_hissa(BigDecimal r_hissa) {
		this.r_hissa = r_hissa;
	}

	public BigDecimal getR_hissa_diff() {
		return r_hissa_diff;
	}

	public void setR_hissa_diff(BigDecimal r_hissa_diff) {
		this.r_hissa_diff = r_hissa_diff;
	}

	public String getFlg() {
		return flg;
	}

	public void setFlg(String flg) {
		this.flg = flg;
	}

	public String getFlg_ansh() {
		return flg_ansh;
	}

	public void setFlg_ansh(String flg_ansh) {
		this.flg_ansh = flg_ansh;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	@Override
	public String toString() {
		return "Up_r6_remove_owner_detail_rtk [village_code_census=" + village_code_census + ", fasli_year="
				+ fasli_year + ", khata_number=" + khata_number + ", seq_no=" + seq_no + ", order_no=" + order_no
				+ ", rname=" + rname + ", rfather=" + rfather + ", r_address=" + r_address + ", unique_code="
				+ unique_code + ", r_hissa=" + r_hissa + ", r_hissa_diff=" + r_hissa_diff + ", flg=" + flg
				+ ", flg_ansh=" + flg_ansh + ", created_on=" + created_on + "]";
	}

	public Up_r6_remove_owner_detail_rtk(String village_code_census, String fasli_year, String khata_number, int seq_no,
			String order_no, String rname, String rfather, String r_address, long unique_code, BigDecimal r_hissa,
			BigDecimal r_hissa_diff, String flg, String flg_ansh, Timestamp created_on) {
		super();
		this.village_code_census = village_code_census;
		this.fasli_year = fasli_year;
		this.khata_number = khata_number;
		this.seq_no = seq_no;
		this.order_no = order_no;
		this.rname = rname;
		this.rfather = rfather;
		this.r_address = r_address;
		this.unique_code = unique_code;
		this.r_hissa = r_hissa;
		this.r_hissa_diff = r_hissa_diff;
		this.flg = flg;
		this.flg_ansh = flg_ansh;
		this.created_on = created_on;
	}

	public Up_r6_remove_owner_detail_rtk() {
		super();
		// TODO Auto-generated constructor stub
	}

}
