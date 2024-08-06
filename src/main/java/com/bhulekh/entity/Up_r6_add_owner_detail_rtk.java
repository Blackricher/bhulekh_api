package com.bhulekh.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_r6_add_owner_detail_rtk")
public class Up_r6_add_owner_detail_rtk {

	private String village_code_census;
	private String fasli_year;
	private String khata_number;
	@Id
	private int seq_no;
	private String order_no;
	private String aname;
	private String afather;
	private String a_address;
	private long unique_code;
	private BigDecimal a_hissa;
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

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAfather() {
		return afather;
	}

	public void setAfather(String afather) {
		this.afather = afather;
	}

	public String getA_address() {
		return a_address;
	}

	public void setA_address(String a_address) {
		this.a_address = a_address;
	}

	public long getUnique_code() {
		return unique_code;
	}

	public void setUnique_code(long unique_code) {
		this.unique_code = unique_code;
	}

	public BigDecimal getA_hissa() {
		return a_hissa;
	}

	public void setA_hissa(BigDecimal a_hissa) {
		this.a_hissa = a_hissa;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	@Override
	public String toString() {
		return "Up_r6_add_owner_detail_rtk [village_code_census=" + village_code_census + ", fasli_year=" + fasli_year
				+ ", khata_number=" + khata_number + ", seq_no=" + seq_no + ", order_no=" + order_no + ", aname="
				+ aname + ", afather=" + afather + ", a_address=" + a_address + ", unique_code=" + unique_code
				+ ", a_hissa=" + a_hissa + ", created_on=" + created_on + "]";
	}

	public Up_r6_add_owner_detail_rtk(String village_code_census, String fasli_year, String khata_number, int seq_no,
			String order_no, String aname, String afather, String a_address, long unique_code, BigDecimal a_hissa,
			Timestamp created_on) {
		super();
		this.village_code_census = village_code_census;
		this.fasli_year = fasli_year;
		this.khata_number = khata_number;
		this.seq_no = seq_no;
		this.order_no = order_no;
		this.aname = aname;
		this.afather = afather;
		this.a_address = a_address;
		this.unique_code = unique_code;
		this.a_hissa = a_hissa;
		this.created_on = created_on;
	}

	public Up_r6_add_owner_detail_rtk() {
		super();
		// TODO Auto-generated constructor stub
	}

}
