package com.bhulekh.models;

import java.util.List;
import java.util.Map;

import com.bhulekh.service.RorService.HissaDetailResponse;
import com.bhulekh.service.RorService.ServiceResponse;

public class RorResponse {
    private List<Lr_payblexDTO> lr_payblexDTOs;
    private List<Up_gata_detail_1Model> khasra;
    private List<Up_r6_add_owner_detail_rtkModel> Aname;
    private List<Up_r6_remove_owner_detail_rtkModel> Rname;
    private List<Up_r6_detail_rtkSpecialModel> specialOrder;
    private List<Agri_t_charge_detailMode> charge;
    private List<Agri_t_charge_detailMode> decharge;
    private List<Up_remark_detailModel> remark;
    private List<Up_order_detailModel> oldOrder;
   private List<Up_owner_detailModel> names;
   List<Up_land_type_detailModel> landDesc;
  //private List<Up_hissa_detailNDModel> name;
  //private Map<String, Object> responseMap;
  ServiceResponse cnameResponse1;
  HissaDetailResponse response1;
  
  
   public List<Up_land_type_detailModel> getLandDesc() {
	return landDesc;
}
public void setLandDesc(List<Up_land_type_detailModel> landDesc) {
	this.landDesc = landDesc;
}
public HissaDetailResponse getResponse1() {
	return response1;
}
public void setResponse1(HissaDetailResponse response1) {
	this.response1 = response1;
}
public ServiceResponse getCnameResponse1() {
	return cnameResponse1;
}
public void setCnameResponse1(ServiceResponse cnameResponse1) {
	this.cnameResponse1 = cnameResponse1;
}
//public Map<String, Object> getResponseMap() {
//	return responseMap;
//}
//public void setResponseMap(Map<String, Object> responseMap) {
//	this.responseMap = responseMap;
//}

   private boolean Ansh;
   
	public boolean isAnsh() {
	return Ansh;
}
public void setAnsh(boolean ansh) {
	Ansh = ansh;
}



//	public List<Up_hissa_detailNDModel> getName() {
//	return name;
//}
//public void setName(List<Up_hissa_detailNDModel> name) {
//	this.name = name;
//}
	public List<Up_owner_detailModel> getNames() {
	return names;
}
public void setNames(List<Up_owner_detailModel> names) {
	this.names = names;
}
	public List<Lr_payblexDTO> getLr_payblexDTOs() {
		return lr_payblexDTOs;
	}
	public void setLr_payblexDTOs(List<Lr_payblexDTO> lr_payblexDTOs) {
		this.lr_payblexDTOs = lr_payblexDTOs;
	}
	public List<Up_gata_detail_1Model> getKhasra() {
		return khasra;
	}
	public void setKhasra(List<Up_gata_detail_1Model> khasra) {
		this.khasra = khasra;
	}
	public List<Up_r6_add_owner_detail_rtkModel> getAname() {
		return Aname;
	}
	public void setAname(List<Up_r6_add_owner_detail_rtkModel> aname) {
		Aname = aname;
	}
	public List<Up_r6_remove_owner_detail_rtkModel> getRname() {
		return Rname;
	}
	public void setRname(List<Up_r6_remove_owner_detail_rtkModel> rname) {
		Rname = rname;
	}
	public List<Up_r6_detail_rtkSpecialModel> getSpecialOrder() {
		return specialOrder;
	}
	public void setSpecialOrder(List<Up_r6_detail_rtkSpecialModel> specialOrder) {
		this.specialOrder = specialOrder;
	}
	public List<Agri_t_charge_detailMode> getCharge() {
		return charge;
	}
	public void setCharge(List<Agri_t_charge_detailMode> charge) {
		this.charge = charge;
	}
	public List<Agri_t_charge_detailMode> getDecharge() {
		return decharge;
	}
	public void setDecharge(List<Agri_t_charge_detailMode> decharge) {
		this.decharge = decharge;
	}
	public List<Up_remark_detailModel> getRemark() {
		return remark;
	}
	public void setRemark(List<Up_remark_detailModel> remark) {
		this.remark = remark;
	}
	public List<Up_order_detailModel> getOldOrder() {
		return oldOrder;
	}
	public void setOldOrder(List<Up_order_detailModel> oldOrder) {
		this.oldOrder = oldOrder;
	}

    // Add getters and setters for all the fields
    
}
