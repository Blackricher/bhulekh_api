package com.bhulekh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "up_village_master")
public class Up_village_master {

	@Id
	private int district_code;
	private String tehsil_code;
	private String pargana_code;
	private String village_code;
	private String district_code_census;
	private String tehsil_code_census;
	private String pargana_code_new;
	private String village_code_census;
	private String vname;
	private String db_district;
	private String flg_new_vname;
	private String vname_eng;
	private String flg_action_type;
	private String flg_new_census_code;
	private String flg_chakbandi;
	private String flg_survey;
	private String locked;
	private String flg_khatauni_type;
	private String revenue_village_name;
	private String flg_mapped;

	public Up_village_master() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Up_village_master(int district_code, String tehsil_code, String pargana_code, String village_code,
			String district_code_census, String tehsil_code_census, String pargana_code_new, String village_code_census,
			String vname, String db_district, String flg_new_vname, String vname_eng, String flg_action_type,
			String flg_new_census_code, String flg_chakbandi, String flg_survey, String locked,
			String flg_khatauni_type, String revenue_village_name, String flg_mapped) {
		super();
		this.district_code = district_code;
		this.tehsil_code = tehsil_code;
		this.pargana_code = pargana_code;
		this.village_code = village_code;
		this.district_code_census = district_code_census;
		this.tehsil_code_census = tehsil_code_census;
		this.pargana_code_new = pargana_code_new;
		this.village_code_census = village_code_census;
		this.vname = vname;
		this.db_district = db_district;
		this.flg_new_vname = flg_new_vname;
		this.vname_eng = vname_eng;
		this.flg_action_type = flg_action_type;
		this.flg_new_census_code = flg_new_census_code;
		this.flg_chakbandi = flg_chakbandi;
		this.flg_survey = flg_survey;
		this.locked = locked;
		this.flg_khatauni_type = flg_khatauni_type;
		this.revenue_village_name = revenue_village_name;
		this.flg_mapped = flg_mapped;
	}

	public int getDistrict_code() {
		return district_code;
	}

	public void setDistrict_code(int district_code) {
		this.district_code = district_code;
	}

	public String getTehsil_code() {
		return tehsil_code;
	}

	public void setTehsil_code(String tehsil_code) {
		this.tehsil_code = tehsil_code;
	}

	public String getPargana_code() {
		return pargana_code;
	}

	public void setPargana_code(String pargana_code) {
		this.pargana_code = pargana_code;
	}

	public String getVillage_code() {
		return village_code;
	}

	public void setVillage_code(String village_code) {
		this.village_code = village_code;
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

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getDb_district() {
		return db_district;
	}

	public void setDb_district(String db_district) {
		this.db_district = db_district;
	}

	public String getFlg_new_vname() {
		return flg_new_vname;
	}

	public void setFlg_new_vname(String flg_new_vname) {
		this.flg_new_vname = flg_new_vname;
	}

	public String getVname_eng() {
		return vname_eng;
	}

	public void setVname_eng(String vname_eng) {
		this.vname_eng = vname_eng;
	}

	public String getFlg_action_type() {
		return flg_action_type;
	}

	public void setFlg_action_type(String flg_action_type) {
		this.flg_action_type = flg_action_type;
	}

	public String getFlg_new_census_code() {
		return flg_new_census_code;
	}

	public void setFlg_new_census_code(String flg_new_census_code) {
		this.flg_new_census_code = flg_new_census_code;
	}

	public String getFlg_chakbandi() {
		return flg_chakbandi;
	}

	public void setFlg_chakbandi(String flg_chakbandi) {
		this.flg_chakbandi = flg_chakbandi;
	}

	public String getFlg_survey() {
		return flg_survey;
	}

	public void setFlg_survey(String flg_survey) {
		this.flg_survey = flg_survey;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public String getFlg_khatauni_type() {
		return flg_khatauni_type;
	}

	public void setFlg_khatauni_type(String flg_khatauni_type) {
		this.flg_khatauni_type = flg_khatauni_type;
	}

	public String getRevenue_village_name() {
		return revenue_village_name;
	}

	public void setRevenue_village_name(String revenue_village_name) {
		this.revenue_village_name = revenue_village_name;
	}

	public String getFlg_mapped() {
		return flg_mapped;
	}

	public void setFlg_mapped(String flg_mapped) {
		this.flg_mapped = flg_mapped;
	}

	@Override
	public String toString() {
		return "Up_village_master [district_code=" + district_code + ", tehsil_code=" + tehsil_code + ", pargana_code="
				+ pargana_code + ", village_code=" + village_code + ", district_code_census=" + district_code_census
				+ ", tehsil_code_census=" + tehsil_code_census + ", pargana_code_new=" + pargana_code_new
				+ ", village_code_census=" + village_code_census + ", vname=" + vname + ", db_district=" + db_district
				+ ", flg_new_vname=" + flg_new_vname + ", vname_eng=" + vname_eng + ", flg_action_type="
				+ flg_action_type + ", flg_new_census_code=" + flg_new_census_code + ", flg_chakbandi=" + flg_chakbandi
				+ ", flg_survey=" + flg_survey + ", locked=" + locked + ", flg_khatauni_type=" + flg_khatauni_type
				+ ", revenue_village_name=" + revenue_village_name + ", flg_mapped=" + flg_mapped + "]";
	}

}
