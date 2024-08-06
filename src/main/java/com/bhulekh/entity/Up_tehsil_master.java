package com.bhulekh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_tehsil_master")
public class Up_tehsil_master {

	private String district_code_census;
	@Id
	private String tehsil_code_census;
	private String tname;
	private String tname_eng;

	public Up_tehsil_master() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Up_tehsil_master(String district_code_census, String tehsil_code_census, String tname, String tname_eng) {
		super();
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.tname = tname;
		this.tname_eng = tname_eng;
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

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTname_eng() {
		return tname_eng;
	}

	public void setTname_eng(String tname_eng) {
		this.tname_eng = tname_eng;
	}

	@Override
	public String toString() {
		return "Up_tehsil_master [district_code_census=" + district_code_census + ", tehsil_code_census="
				+ tehsil_code_census + ", tname=" + tname + ", tname_eng=" + tname_eng + "]";
	}

}
