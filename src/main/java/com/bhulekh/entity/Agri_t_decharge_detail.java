package com.bhulekh.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agri_t_decharge_detail")
public class Agri_t_decharge_detail {
	@Id
	private int seq_no;
	private int charge_id;
	private String request_id;
	private String ifsc_code;
	private String loan_date;
	private String interest_amount;
	private String payment_amount;
	private String payment_date;
	private Timestamp created_on;
	private char flg_discharge;
	private char action_bank;
	private char action_tehsil;
	private String device_serialno;
	private Timestamp dsc_date;
	private char action_reg_dept;
	private String tehsil_remark;
	private String stamp_number;
	private BigDecimal stamp_cost;
	private String stamp_date;
	private char action_rsix;
	private String registration_number;
	private String registration_date;

	public int getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}

	public int getCharge_id() {
		return charge_id;
	}

	public void setCharge_id(int charge_id) {
		this.charge_id = charge_id;
	}

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getLoan_date() {
		return loan_date;
	}

	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}

	public String getInterest_amount() {
		return interest_amount;
	}

	public void setInterest_amount(String interest_amount) {
		this.interest_amount = interest_amount;
	}

	public String getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(String payment_amount) {
		this.payment_amount = payment_amount;
	}

	public String getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	public char getFlg_discharge() {
		return flg_discharge;
	}

	public void setFlg_discharge(char flg_discharge) {
		this.flg_discharge = flg_discharge;
	}

	public char getAction_bank() {
		return action_bank;
	}

	public void setAction_bank(char action_bank) {
		this.action_bank = action_bank;
	}

	public char getAction_tehsil() {
		return action_tehsil;
	}

	public void setAction_tehsil(char action_tehsil) {
		this.action_tehsil = action_tehsil;
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

	public char getAction_reg_dept() {
		return action_reg_dept;
	}

	public void setAction_reg_dept(char action_reg_dept) {
		this.action_reg_dept = action_reg_dept;
	}

	public String getTehsil_remark() {
		return tehsil_remark;
	}

	public void setTehsil_remark(String tehsil_remark) {
		this.tehsil_remark = tehsil_remark;
	}

	public String getStamp_number() {
		return stamp_number;
	}

	public void setStamp_number(String stamp_number) {
		this.stamp_number = stamp_number;
	}

	public BigDecimal getStamp_cost() {
		return stamp_cost;
	}

	public void setStamp_cost(BigDecimal stamp_cost) {
		this.stamp_cost = stamp_cost;
	}

	public String getStamp_date() {
		return stamp_date;
	}

	public void setStamp_date(String stamp_date) {
		this.stamp_date = stamp_date;
	}

	public char getAction_rsix() {
		return action_rsix;
	}

	public void setAction_rsix(char action_rsix) {
		this.action_rsix = action_rsix;
	}

	public String getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	@Override
	public String toString() {
		return "Agri_t_decharge_detail [seq_no=" + seq_no + ", charge_id=" + charge_id + ", request_id=" + request_id
				+ ", ifsc_code=" + ifsc_code + ", loan_date=" + loan_date + ", interest_amount=" + interest_amount
				+ ", payment_amount=" + payment_amount + ", payment_date=" + payment_date + ", created_on=" + created_on
				+ ", flg_discharge=" + flg_discharge + ", action_bank=" + action_bank + ", action_tehsil="
				+ action_tehsil + ", device_serialno=" + device_serialno + ", dsc_date=" + dsc_date
				+ ", action_reg_dept=" + action_reg_dept + ", tehsil_remark=" + tehsil_remark + ", stamp_number="
				+ stamp_number + ", stamp_cost=" + stamp_cost + ", stamp_date=" + stamp_date + ", action_rsix="
				+ action_rsix + ", registration_number=" + registration_number + ", registration_date="
				+ registration_date + "]";
	}

	public Agri_t_decharge_detail(int seq_no, int charge_id, String request_id, String ifsc_code, String loan_date,
			String interest_amount, String payment_amount, String payment_date, Timestamp created_on,
			char flg_discharge, char action_bank, char action_tehsil, String device_serialno, Timestamp dsc_date,
			char action_reg_dept, String tehsil_remark, String stamp_number, BigDecimal stamp_cost, String stamp_date,
			char action_rsix, String registration_number, String registration_date) {
		super();
		this.seq_no = seq_no;
		this.charge_id = charge_id;
		this.request_id = request_id;
		this.ifsc_code = ifsc_code;
		this.loan_date = loan_date;
		this.interest_amount = interest_amount;
		this.payment_amount = payment_amount;
		this.payment_date = payment_date;
		this.created_on = created_on;
		this.flg_discharge = flg_discharge;
		this.action_bank = action_bank;
		this.action_tehsil = action_tehsil;
		this.device_serialno = device_serialno;
		this.dsc_date = dsc_date;
		this.action_reg_dept = action_reg_dept;
		this.tehsil_remark = tehsil_remark;
		this.stamp_number = stamp_number;
		this.stamp_cost = stamp_cost;
		this.stamp_date = stamp_date;
		this.action_rsix = action_rsix;
		this.registration_number = registration_number;
		this.registration_date = registration_date;
	}

	public Agri_t_decharge_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
