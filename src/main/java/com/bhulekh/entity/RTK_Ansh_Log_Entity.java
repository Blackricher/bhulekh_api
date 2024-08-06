package com.bhulekh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_village_ansh_log_rtk")
public class RTK_Ansh_Log_Entity {

	private String district_code_census;
	private String tehsil_code_census;
	@Id
	private String village_code_census;
	private int counter;
	private String flg_ansh;

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

	public String getVillage_code_census() {
		return village_code_census;
	}

	public void setVillage_code_census(String village_code_census) {
		this.village_code_census = village_code_census;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getFlg_ansh() {
		return flg_ansh;
	}

	public void setFlg_ansh(String flg_ansh) {
		this.flg_ansh = flg_ansh;
	}

}
