package com.bhulekh.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agri_t_charge_detail")
public class Agri_t_charge_detail {
	@Id
	private int seq_no;
	private int charge_id;
	private String request_id;
	private String ifsc_code;
	private BigDecimal morgage_area;
	private BigDecimal morgage_amount;
	private String morgage_reason;
	private Integer age;
	private String address;
	private BigDecimal interest_rate;
	private Integer loan_duration;
	private Timestamp mortgage_date;
	private Timestamp created_on;
	private char flg_discharge;
	private Timestamp discharge_date;
	private String bank_account_number;
	private String aadhar_no;
	private String mobile_no;
	private String custom;
	private String witness_name_one;
	private String witness_father_one;
	private String witness_profession_one;
	private String witness_village_one;
	private String witness_post_one;
	private String witness_district_one;
	private String witness_name_two;
	private String witness_father_two;
	private String witness_profession_two;
	private String witness_village_two;
	private String witness_post_two;
	private String witness_district_two;
	private char action_bank;
	private char action_tehsil;
	private String device_serialno;
	private Timestamp dsc_date;
	private char action_rsix;
	private char action_reg_dept;
	private String stamp_number;
	private BigDecimal stamp_cost;
	private Date stamp_date;
	private byte[] witness_signature_one;
	private byte[] witness_thumb_left_one;
	private byte[] witness_thumb_right_one;
	private byte[] witness_signature_two;
	private byte[] witness_thumb_left_two;
	private byte[] witness_thumb_right_two;
	private byte[] customer_signature;
	private byte[] customer_left_thumb;
	private String tehsil_remark;

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

	public BigDecimal getMorgage_area() {
		return morgage_area;
	}

	public void setMorgage_area(BigDecimal morgage_area) {
		this.morgage_area = morgage_area;
	}

	public BigDecimal getMorgage_amount() {
		return morgage_amount;
	}

	public void setMorgage_amount(BigDecimal morgage_amount) {
		this.morgage_amount = morgage_amount;
	}

	public String getMorgage_reason() {
		return morgage_reason;
	}

	public void setMorgage_reason(String morgage_reason) {
		this.morgage_reason = morgage_reason;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(BigDecimal interest_rate) {
		this.interest_rate = interest_rate;
	}

	public Integer getLoan_duration() {
		return loan_duration;
	}

	public void setLoan_duration(Integer loan_duration) {
		this.loan_duration = loan_duration;
	}

	public Timestamp getMortgage_date() {
		return mortgage_date;
	}

	public void setMortgage_date(Timestamp mortgage_date) {
		this.mortgage_date = mortgage_date;
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

	public Timestamp getDischarge_date() {
		return discharge_date;
	}

	public void setDischarge_date(Timestamp discharge_date) {
		this.discharge_date = discharge_date;
	}

	public String getBank_account_number() {
		return bank_account_number;
	}

	public void setBank_account_number(String bank_account_number) {
		this.bank_account_number = bank_account_number;
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

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getWitness_name_one() {
		return witness_name_one;
	}

	public void setWitness_name_one(String witness_name_one) {
		this.witness_name_one = witness_name_one;
	}

	public String getWitness_father_one() {
		return witness_father_one;
	}

	public void setWitness_father_one(String witness_father_one) {
		this.witness_father_one = witness_father_one;
	}

	public String getWitness_profession_one() {
		return witness_profession_one;
	}

	public void setWitness_profession_one(String witness_profession_one) {
		this.witness_profession_one = witness_profession_one;
	}

	public String getWitness_village_one() {
		return witness_village_one;
	}

	public void setWitness_village_one(String witness_village_one) {
		this.witness_village_one = witness_village_one;
	}

	public String getWitness_post_one() {
		return witness_post_one;
	}

	public void setWitness_post_one(String witness_post_one) {
		this.witness_post_one = witness_post_one;
	}

	public String getWitness_district_one() {
		return witness_district_one;
	}

	public void setWitness_district_one(String witness_district_one) {
		this.witness_district_one = witness_district_one;
	}

	public String getWitness_name_two() {
		return witness_name_two;
	}

	public void setWitness_name_two(String witness_name_two) {
		this.witness_name_two = witness_name_two;
	}

	public String getWitness_father_two() {
		return witness_father_two;
	}

	public void setWitness_father_two(String witness_father_two) {
		this.witness_father_two = witness_father_two;
	}

	public String getWitness_profession_two() {
		return witness_profession_two;
	}

	public void setWitness_profession_two(String witness_profession_two) {
		this.witness_profession_two = witness_profession_two;
	}

	public String getWitness_village_two() {
		return witness_village_two;
	}

	public void setWitness_village_two(String witness_village_two) {
		this.witness_village_two = witness_village_two;
	}

	public String getWitness_post_two() {
		return witness_post_two;
	}

	public void setWitness_post_two(String witness_post_two) {
		this.witness_post_two = witness_post_two;
	}

	public String getWitness_district_two() {
		return witness_district_two;
	}

	public void setWitness_district_two(String witness_district_two) {
		this.witness_district_two = witness_district_two;
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

	public char getAction_rsix() {
		return action_rsix;
	}

	public void setAction_rsix(char action_rsix) {
		this.action_rsix = action_rsix;
	}

	public char getAction_reg_dept() {
		return action_reg_dept;
	}

	public void setAction_reg_dept(char action_reg_dept) {
		this.action_reg_dept = action_reg_dept;
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

	public Date getStamp_date() {
		return stamp_date;
	}

	public void setStamp_date(Date stamp_date) {
		this.stamp_date = stamp_date;
	}

	public byte[] getWitness_signature_one() {
		return witness_signature_one;
	}

	public void setWitness_signature_one(byte[] witness_signature_one) {
		this.witness_signature_one = witness_signature_one;
	}

	public byte[] getWitness_thumb_left_one() {
		return witness_thumb_left_one;
	}

	public void setWitness_thumb_left_one(byte[] witness_thumb_left_one) {
		this.witness_thumb_left_one = witness_thumb_left_one;
	}

	public byte[] getWitness_thumb_right_one() {
		return witness_thumb_right_one;
	}

	public void setWitness_thumb_right_one(byte[] witness_thumb_right_one) {
		this.witness_thumb_right_one = witness_thumb_right_one;
	}

	public byte[] getWitness_signature_two() {
		return witness_signature_two;
	}

	public void setWitness_signature_two(byte[] witness_signature_two) {
		this.witness_signature_two = witness_signature_two;
	}

	public byte[] getWitness_thumb_left_two() {
		return witness_thumb_left_two;
	}

	public void setWitness_thumb_left_two(byte[] witness_thumb_left_two) {
		this.witness_thumb_left_two = witness_thumb_left_two;
	}

	public byte[] getWitness_thumb_right_two() {
		return witness_thumb_right_two;
	}

	public void setWitness_thumb_right_two(byte[] witness_thumb_right_two) {
		this.witness_thumb_right_two = witness_thumb_right_two;
	}

	public byte[] getCustomer_signature() {
		return customer_signature;
	}

	public void setCustomer_signature(byte[] customer_signature) {
		this.customer_signature = customer_signature;
	}

	public byte[] getCustomer_left_thumb() {
		return customer_left_thumb;
	}

	public void setCustomer_left_thumb(byte[] customer_left_thumb) {
		this.customer_left_thumb = customer_left_thumb;
	}

	public String getTehsil_remark() {
		return tehsil_remark;
	}

	public void setTehsil_remark(String tehsil_remark) {
		this.tehsil_remark = tehsil_remark;
	}

	@Override
	public String toString() {
		return "Agri_t_charge_detail [seq_no=" + seq_no + ", charge_id=" + charge_id + ", request_id=" + request_id
				+ ", ifsc_code=" + ifsc_code + ", morgage_area=" + morgage_area + ", morgage_amount=" + morgage_amount
				+ ", morgage_reason=" + morgage_reason + ", age=" + age + ", address=" + address + ", interest_rate="
				+ interest_rate + ", loan_duration=" + loan_duration + ", mortgage_date=" + mortgage_date
				+ ", created_on=" + created_on + ", flg_discharge=" + flg_discharge + ", discharge_date="
				+ discharge_date + ", bank_account_number=" + bank_account_number + ", aadhar_no=" + aadhar_no
				+ ", mobile_no=" + mobile_no + ", custom=" + custom + ", witness_name_one=" + witness_name_one
				+ ", witness_father_one=" + witness_father_one + ", witness_profession_one=" + witness_profession_one
				+ ", witness_village_one=" + witness_village_one + ", witness_post_one=" + witness_post_one
				+ ", witness_district_one=" + witness_district_one + ", witness_name_two=" + witness_name_two
				+ ", witness_father_two=" + witness_father_two + ", witness_profession_two=" + witness_profession_two
				+ ", witness_village_two=" + witness_village_two + ", witness_post_two=" + witness_post_two
				+ ", witness_district_two=" + witness_district_two + ", action_bank=" + action_bank + ", action_tehsil="
				+ action_tehsil + ", device_serialno=" + device_serialno + ", dsc_date=" + dsc_date + ", action_rsix="
				+ action_rsix + ", action_reg_dept=" + action_reg_dept + ", stamp_number=" + stamp_number
				+ ", stamp_cost=" + stamp_cost + ", stamp_date=" + stamp_date + ", witness_signature_one="
				+ Arrays.toString(witness_signature_one) + ", witness_thumb_left_one="
				+ Arrays.toString(witness_thumb_left_one) + ", witness_thumb_right_one="
				+ Arrays.toString(witness_thumb_right_one) + ", witness_signature_two="
				+ Arrays.toString(witness_signature_two) + ", witness_thumb_left_two="
				+ Arrays.toString(witness_thumb_left_two) + ", witness_thumb_right_two="
				+ Arrays.toString(witness_thumb_right_two) + ", customer_signature="
				+ Arrays.toString(customer_signature) + ", customer_left_thumb=" + Arrays.toString(customer_left_thumb)
				+ ", tehsil_remark=" + tehsil_remark + "]";
	}

	public Agri_t_charge_detail(int seq_no, int charge_id, String request_id, String ifsc_code, BigDecimal morgage_area,
			BigDecimal morgage_amount, String morgage_reason, Integer age, String address, BigDecimal interest_rate,
			Integer loan_duration, Timestamp mortgage_date, Timestamp created_on, char flg_discharge,
			Timestamp discharge_date, String bank_account_number, String aadhar_no, String mobile_no, String custom,
			String witness_name_one, String witness_father_one, String witness_profession_one,
			String witness_village_one, String witness_post_one, String witness_district_one, String witness_name_two,
			String witness_father_two, String witness_profession_two, String witness_village_two,
			String witness_post_two, String witness_district_two, char action_bank, char action_tehsil,
			String device_serialno, Timestamp dsc_date, char action_rsix, char action_reg_dept, String stamp_number,
			BigDecimal stamp_cost, Date stamp_date, byte[] witness_signature_one, byte[] witness_thumb_left_one,
			byte[] witness_thumb_right_one, byte[] witness_signature_two, byte[] witness_thumb_left_two,
			byte[] witness_thumb_right_two, byte[] customer_signature, byte[] customer_left_thumb,
			String tehsil_remark) {
		super();
		this.seq_no = seq_no;
		this.charge_id = charge_id;
		this.request_id = request_id;
		this.ifsc_code = ifsc_code;
		this.morgage_area = morgage_area;
		this.morgage_amount = morgage_amount;
		this.morgage_reason = morgage_reason;
		this.age = age;
		this.address = address;
		this.interest_rate = interest_rate;
		this.loan_duration = loan_duration;
		this.mortgage_date = mortgage_date;
		this.created_on = created_on;
		this.flg_discharge = flg_discharge;
		this.discharge_date = discharge_date;
		this.bank_account_number = bank_account_number;
		this.aadhar_no = aadhar_no;
		this.mobile_no = mobile_no;
		this.custom = custom;
		this.witness_name_one = witness_name_one;
		this.witness_father_one = witness_father_one;
		this.witness_profession_one = witness_profession_one;
		this.witness_village_one = witness_village_one;
		this.witness_post_one = witness_post_one;
		this.witness_district_one = witness_district_one;
		this.witness_name_two = witness_name_two;
		this.witness_father_two = witness_father_two;
		this.witness_profession_two = witness_profession_two;
		this.witness_village_two = witness_village_two;
		this.witness_post_two = witness_post_two;
		this.witness_district_two = witness_district_two;
		this.action_bank = action_bank;
		this.action_tehsil = action_tehsil;
		this.device_serialno = device_serialno;
		this.dsc_date = dsc_date;
		this.action_rsix = action_rsix;
		this.action_reg_dept = action_reg_dept;
		this.stamp_number = stamp_number;
		this.stamp_cost = stamp_cost;
		this.stamp_date = stamp_date;
		this.witness_signature_one = witness_signature_one;
		this.witness_thumb_left_one = witness_thumb_left_one;
		this.witness_thumb_right_one = witness_thumb_right_one;
		this.witness_signature_two = witness_signature_two;
		this.witness_thumb_left_two = witness_thumb_left_two;
		this.witness_thumb_right_two = witness_thumb_right_two;
		this.customer_signature = customer_signature;
		this.customer_left_thumb = customer_left_thumb;
		this.tehsil_remark = tehsil_remark;
	}

	public Agri_t_charge_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
