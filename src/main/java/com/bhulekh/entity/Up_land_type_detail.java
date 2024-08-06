package com.bhulekh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "up_land_type_detail")
@Entity
public class Up_land_type_detail {

	private String land_type;
	private String part;
	private String land_type_desc;
	private String check_flag;
	@Id
	private Integer land_type_id;

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

	public String getLand_type_desc() {
		return land_type_desc;
	}

	public void setLand_type_desc(String land_type_desc) {
		this.land_type_desc = land_type_desc;
	}

	public String getCheck_flag() {
		return check_flag;
	}

	public void setCheck_flag(String check_flag) {
		this.check_flag = check_flag;
	}

	public Integer getLand_type_id() {
		return land_type_id;
	}

	public void setLand_type_id(Integer land_type_id) {
		this.land_type_id = land_type_id;
	}

	@Override
	public String toString() {
		return "Up_land_type_detail [land_type=" + land_type + ", part=" + part + ", land_type_desc=" + land_type_desc
				+ ", check_flag=" + check_flag + ", land_type_id=" + land_type_id + "]";
	}

	public Up_land_type_detail(String land_type, String part, String land_type_desc, String check_flag,
			Integer land_type_id) {
		super();
		this.land_type = land_type;
		this.part = part;
		this.land_type_desc = land_type_desc;
		this.check_flag = check_flag;
		this.land_type_id = land_type_id;
	}

	public Up_land_type_detail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
