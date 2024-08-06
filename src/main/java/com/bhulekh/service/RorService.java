package com.bhulekh.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Agri_t_charge_detailMode;
import com.bhulekh.models.Hissa_countModel;
import com.bhulekh.models.Lr_payblexDTO;
import com.bhulekh.models.Lr_payblexModel;
import com.bhulekh.models.RorResponse;
import com.bhulekh.models.Up_gata_detail_1Model;
import com.bhulekh.models.Up_gata_sequence_partModel;
import com.bhulekh.models.Up_hissa_detailModel;
import com.bhulekh.models.Up_hissa_detailNDModel;
import com.bhulekh.models.Up_khata_detailModel;
import com.bhulekh.models.Up_land_type_detailModel;
import com.bhulekh.models.Up_order_detailModel;
import com.bhulekh.models.Up_owner_detailModel;
import com.bhulekh.models.Up_r6_add_owner_detail_rtkModel;
import com.bhulekh.models.Up_r6_detail_rtkModel;
import com.bhulekh.models.Up_r6_detail_rtkOModel;
import com.bhulekh.models.Up_r6_detail_rtkSpecialModel;
import com.bhulekh.models.Up_r6_remove_owner_detail_rtkModel;
import com.bhulekh.models.Up_remark_detailModel;
import com.bhulekh.repository.Agri_t_charge_detailRepo;
import com.bhulekh.repository.Agri_t_decharge_detailRepo;
import com.bhulekh.repository.Up_gata_detailRepo;
import com.bhulekh.repository.Up_gata_land_revenueRepo;
import com.bhulekh.repository.Up_hissa_detailRepo;
import com.bhulekh.repository.Up_khata_detailRepo;
import com.bhulekh.repository.Up_order_detailRepo;
import com.bhulekh.repository.Up_owner_detailRepo;
import com.bhulekh.repository.Up_r6_add_owner_detail_rtkRepo;
import com.bhulekh.repository.Up_r6_detail_rtkRepo;
import com.bhulekh.repository.Up_r6_remove_owner_detail_rtkRepo;
import com.bhulekh.repository.Up_remark_detailRepo;
import com.bhulekh.service.Up_r6_detail_rtkService.ServiceResponse;


@Service
public class RorService {
@Autowired
private Up_hissa_detailRepo up_hissa_detailRepo;

@Autowired
private Up_gata_detailRepo up_gata_detailRepo;

@Autowired
private Up_r6_detail_rtkRepo up_r6_detail_rtkRepo;

@Autowired
private Up_khata_detailRepo up_khata_detailRepo;

@Autowired
private Up_hissa_detailService up_hissa_detailService;

@Autowired
private Up_owner_detailRepo up_owner_detailRepo;
@Autowired
private Up_r6_add_owner_detail_rtkRepo up_r6_add_owner_detail_rtkRepo;

@Autowired
private Up_gata_land_revenueRepo up_gata_land_revenueRepo;
@Autowired
private Up_r6_remove_owner_detail_rtkRepo up_r6_remove_owner_detail_rtkRepo;
@Autowired
private Agri_t_decharge_detailRepo agri_t_decharge_detailRepo;
@Autowired
private Agri_t_charge_detailRepo agri_t_charge_detailRepo;
@Autowired
private Up_r6_add_owner_detail_rtkService up_r6_add_owner_detail_rtkService;
@Autowired
private Up_remark_detailRepo up_remark_detailRepo;
@Autowired
private Up_order_detailRepo up_order_detailRepo;
@Autowired
private Up_khata_detail_Service up_khata_detail_Service;
@Autowired

private Up_land_type_detailService up_land_type_detailService;

public RorResponse getRor(String villageCodeCensus, String khataNumber, String uniqueCode) {
		 List<Up_gata_sequence_partModel> gataSeqList = getGataSeq(villageCodeCensus, uniqueCode);
		    ServiceResponse cnameResponse = getCname(villageCodeCensus, khataNumber, uniqueCode);
//		    List<Up_r6_detail_rtkOModel> orderNList = getOrderN(villageCodeCensus, khataNumber, uniqueCode);
		    List<Up_r6_detail_rtkOModel> orderNList = getOrderN(villageCodeCensus, khataNumber, uniqueCode);

	        List<String> orderNos = new ArrayList<>();
	        if (!orderNList.isEmpty()) {
	            for (Up_r6_detail_rtkOModel order : orderNList) {
	                orderNos.add(order.getOrder_no());
	            }
	        }

		       
		    List<Up_khata_detailModel> fasliYearList = getfasliYear(villageCodeCensus);
		    
		    String part = ""; // Extract from gataSeqList
		    String fasliYear = ""; // Extract from fasliYearList
		    String seqNo = ""; // Extract from gataSeqList
		    //String orderType = "";
		    String order_no = "";
		    if (!gataSeqList.isEmpty()) {
		        // Assuming the "part" is stored in the first element of the list
		        Up_gata_sequence_partModel firstGataSeq = gataSeqList.get(0);
		        part = firstGataSeq.getPart();
		        seqNo=firstGataSeq.getSeq_no();
		        System.out.println("seq"+seqNo);
		    }
		    
		    if (!fasliYearList.isEmpty()) {
		        Up_khata_detailModel firstFasliYear = fasliYearList.get(0);
		        String fullFasliYear = firstFasliYear.getFasli_year();
		        
		        // Check if the fasliYear string has at least three characters
		        if (fullFasliYear.length() >= 3) {
		            fasliYear = fullFasliYear.substring(0, fullFasliYear.length() - 3);
		        } else {
		            // Handle the case where the fasliYear string has less than three characters
		            // For example, set fasliYear to an empty string
		            fasliYear = ""; 
		        }

		    }

		    if (!orderNList.isEmpty()) {
		        
		        Up_r6_detail_rtkOModel firstOrder = orderNList.get(0);
		        
		        order_no = firstOrder.getOrder_no();
		    }

		        List<Hissa_countModel> counts = up_hissa_detailRepo.getCounts(villageCodeCensus, khataNumber);
		        
		        int count = counts.get(0).getCounts();
		        
	        if (count > 0) 
	        {
//		        if (counts.size() > 0){
		        //without ansh
		        	boolean Ansh=false;
		        	List<Up_owner_detailModel> names= up_owner_detailRepo.getWnAnsh(villageCodeCensus, khataNumber, part);
		        	 List<Up_gata_detail_1Model> khasra= up_gata_detailRepo.getKayr( villageCodeCensus,uniqueCode, part);
		        	 
//		        	 List<Up_r6_add_owner_detail_rtkModel> Aname = getAname(villageCodeCensus,khataNumber,uniqueCode,order_no);
//		        	  List<Up_r6_remove_owner_detail_rtkModel> Rname =getRname(villageCodeCensus,khataNumber,uniqueCode,order_no);
		        	 
		        	 List<Up_r6_add_owner_detail_rtkModel> Aname = new ArrayList<>();
		             for (String orderNo : orderNos) {
		                 Aname.addAll(getAname(villageCodeCensus, khataNumber, uniqueCode, orderNo));
		             }

		             List<Up_r6_remove_owner_detail_rtkModel> Rname = new ArrayList<>();
		             for (String orderNo : orderNos) {
		                 Rname.addAll(getRname(villageCodeCensus, khataNumber, uniqueCode, orderNo));
		             }

		        	   List<Up_r6_detail_rtkSpecialModel>SpecialOrder= getSpecialOrder( villageCodeCensus,khataNumber, uniqueCode);
		        	   List<Agri_t_charge_detailMode> charge=getCharge(villageCodeCensus,uniqueCode);    
		        	   List<Agri_t_charge_detailMode> Decharge=getDecharge(villageCodeCensus,uniqueCode);
		        	   List<Up_remark_detailModel>Remark= getRemarks(villageCodeCensus,khataNumber, uniqueCode);
		        	   ServiceResponse cnameResponse1 = getCname(villageCodeCensus,khataNumber,uniqueCode);
		        	   List<Up_land_type_detailModel> landDesc= up_land_type_detailService.getLandTypeDesc(uniqueCode);
		        		 List<Up_order_detailModel> OldOrder=getOldOrder(villageCodeCensus,khataNumber); 
		        			
		        		 List<Lr_payblexDTO> Lr_payblex= up_khata_detail_Service.getLr_payblex(villageCodeCensus,khataNumber,uniqueCode);

		        
		        	    RorResponse response = new RorResponse();
		        	    response.setCnameResponse1(cnameResponse);
		        	    response.setLr_payblexDTOs(Lr_payblex);
		        	    response.setNames(names);
		        	    response.setKhasra(khasra);
		        	    response.setAname(Aname);
		        	    response.setRname(Rname);
		        	    response.setSpecialOrder(SpecialOrder);
		        	    response.setCharge(charge);
		        	    response.setDecharge(Decharge);
		        	    response.setRemark(Remark);
		        	    response.setOldOrder(OldOrder);
		        	    response.setAnsh(Ansh);
		        	    response.setLandDesc(landDesc);
		        	    return response;
		        	
		        }
		      
		        else {
		        	//with ansh
		        	boolean Ansh=true;
		        	System.out.println("seqghfghgfh"+seqNo);
		        	System.out.println("seqghfgfasliYearhgfh"+fasliYear);
		        	
//		        	public List<Up_hissa_detailModel> getCheckDup(String villageCodeCensus,String fasliYear,String khataNumber,String seqNo,String uniqueCode) {
//		    			return up_hissa_detailRepo.getCheckDup(villageCodeCensus,fasliYear,khataNumber,seqNo,uniqueCode);
//		    		}
		        	List<Up_hissa_detailModel> names = up_hissa_detailRepo.getCheckDup(villageCodeCensus,fasliYear,khataNumber,seqNo,uniqueCode);
		        	boolean dupFlag = false;
		        	boolean noDupFlag = false;
		        	
		        	List<?> data1 = null;
		        	if (!names.isEmpty()) {
		        	    dupFlag = true;
		        	    List<Up_hissa_detailNDModel> name = up_hissa_detailRepo.getDupName(villageCodeCensus, fasliYear, khataNumber, seqNo, uniqueCode);
		        	    data1 = name;
		        	} else {
		        	    List<Up_hissa_detailNDModel> name = up_hissa_detailRepo.getNODupName(villageCodeCensus, fasliYear, khataNumber, seqNo, uniqueCode);
		        	    noDupFlag = true;
		        	    data1 = name;
		        	}

		        	HissaDetailResponse response1 = new HissaDetailResponse(data1, dupFlag, noDupFlag);

		        	

		            
		        	
		        	 List<Up_gata_detail_1Model> khasra= up_gata_detailRepo.getKayr( villageCodeCensus,uniqueCode, part);
//		        	 List<Up_r6_add_owner_detail_rtkModel> Aname = getAname(villageCodeCensus,khataNumber,uniqueCode,order_no);
//		        	  List<Up_r6_remove_owner_detail_rtkModel> Rname =getRname(villageCodeCensus,khataNumber,uniqueCode,order_no);
		        	 List<Up_r6_add_owner_detail_rtkModel> Aname = new ArrayList<>();
		             for (String orderNo : orderNos) {
		                 Aname.addAll(getAname(villageCodeCensus, khataNumber, uniqueCode, orderNo));
		             }

		             List<Up_r6_remove_owner_detail_rtkModel> Rname = new ArrayList<>();
		             for (String orderNo : orderNos) {
		                 Rname.addAll(getRname(villageCodeCensus, khataNumber, uniqueCode, orderNo));
		             }

		        	   List<Up_r6_detail_rtkSpecialModel>SpecialOrder= getSpecialOrder( villageCodeCensus,khataNumber,uniqueCode);
		        	   List<Agri_t_charge_detailMode> charge=getCharge(villageCodeCensus,uniqueCode);    
		        	   List<Agri_t_charge_detailMode> Decharge=getDecharge(villageCodeCensus,uniqueCode);
		        	   List<Up_remark_detailModel>Remark= getRemarks(villageCodeCensus,khataNumber,uniqueCode);
		        	   ServiceResponse cnameResponse1 = getCname(villageCodeCensus,khataNumber,uniqueCode);
		        	   
		        		 List<Up_order_detailModel> OldOrder=getOldOrder(villageCodeCensus,khataNumber); 
		        		 List<Lr_payblexDTO> Lr_payblex= up_khata_detail_Service.getLr_payblex(villageCodeCensus,khataNumber,uniqueCode);	
		        		 List<Up_land_type_detailModel> landDesc= up_land_type_detailService.getLandTypeDesc(uniqueCode);
	        	    

		        	    RorResponse response = new RorResponse();
		        	    
		        	    
		        	    
		        	    response.setLr_payblexDTOs(Lr_payblex);
		        	    response.setCnameResponse1(cnameResponse);
		        	    response.setAnsh(Ansh);
		        	    response.setKhasra(khasra);
		        	    response.setAname(Aname);
		        	    response.setRname(Rname);
		        	    response.setSpecialOrder(SpecialOrder);
		        	    response.setCharge(charge);
		        	    response.setDecharge(Decharge);
		        	    response.setRemark(Remark);
		        	    response.setOldOrder(OldOrder);
		        	    response.setResponse1(response1);
		        	    response.setLandDesc(landDesc);
		        	    return response;
		        
		        	
		        }
		    
		        
		        
		    }
	
	

		    public List<Up_remark_detailModel> getRemarks(String villageCodeCensus,String khataNumber,String uniqueCode) {
    			return up_remark_detailRepo.getRemarks(villageCodeCensus,khataNumber,uniqueCode);
    		}
public List<Agri_t_charge_detailMode> getCharge(String villageCodeCensus,String uniqueCode) {
	return agri_t_charge_detailRepo.getCharge(villageCodeCensus,uniqueCode);
}

public List<Up_order_detailModel> getOldOrder(String villageCodeCensus,String khataNumber) {
	return up_order_detailRepo.getOldOrder(villageCodeCensus,khataNumber);
}

public List<Agri_t_charge_detailMode> getDecharge(String villageCodeCensus,String uniqueCode) {
	return agri_t_decharge_detailRepo.getDecharge(villageCodeCensus,uniqueCode);
}
	//part/seq_no
	public List<Up_gata_sequence_partModel> getGataSeq(String villageCodeCensus, String uniqueCode) {
		return up_gata_detailRepo.getGataSeq(villageCodeCensus,uniqueCode);
	}
	
	//ordertype
	 public ServiceResponse getCname(String villageCodeCensus, String khataNumber, String uniqueCode) {
	        List<Up_r6_detail_rtkModel> data = up_r6_detail_rtkRepo.getCname(villageCodeCensus, khataNumber, uniqueCode);
	        boolean flag = !data.isEmpty(); // Set flag based on whether data is empty or not
	        return new ServiceResponse(data, flag);
	    }
	 //order_no
	 public List<Up_r6_detail_rtkOModel> getOrderN(String villageCodeCensus,String khataNumber,String uniqueCode) {
	        return up_r6_detail_rtkRepo.getOrderN(villageCodeCensus,khataNumber,uniqueCode);
	    }
	 
	 //to get the fasli year
	 public List<Up_khata_detailModel> getfasliYear(String villageCodeCensus) {
			return up_khata_detailRepo.getfasliYear(villageCodeCensus);
		}

	 public List<Up_r6_add_owner_detail_rtkModel> getAname(String villageCodeCensus,String khataNumber,String uniqueCode,String order_no) {
			return up_r6_add_owner_detail_rtkRepo.getAname(villageCodeCensus,khataNumber,uniqueCode,order_no);
		}
	
		public List<Up_r6_remove_owner_detail_rtkModel> getRname(String villageCodeCensus,String khataNumber,String uniqueCode,String order_no) {
			return up_r6_remove_owner_detail_rtkRepo.getRname(villageCodeCensus,khataNumber,uniqueCode,order_no);
		}
		
		public List<Up_r6_detail_rtkSpecialModel> getSpecialOrder(String villageCodeCensus,String khataNumber,String uniqueCode) {
	        return up_r6_detail_rtkRepo.getSpecialOrder(villageCodeCensus,khataNumber,uniqueCode);
	    }
		
		//to be remove
		public List<Up_hissa_detailModel> getCheckDup(String villageCodeCensus,String fasliYear,String khataNumber,String seqNo,String uniqueCode) {
			return up_hissa_detailRepo.getCheckDup(villageCodeCensus,fasliYear,khataNumber,seqNo,uniqueCode);
		}
		
	 public class ServiceResponse {
	        private List<Up_r6_detail_rtkModel> data;
	        private boolean flag;

	        public ServiceResponse(List<Up_r6_detail_rtkModel> data, boolean flag) {
	            this.data = data;
	            this.flag = flag;
	        }

	        public List<Up_r6_detail_rtkModel> getData() {
	            return data;
	        }

	        public void setData(List<Up_r6_detail_rtkModel> data) {
	            this.data = data;
	        }

	        public boolean isFlag() {
	            return flag;
	        }

	        public void setFlag(boolean flag) {
	            this.flag = flag;
	        }
	    }
	 
	 
	 public class HissaDetailResponse {
		    private List<?> data;
		    private boolean dupFlag;
		    private boolean noDupFlag;

		    public HissaDetailResponse(List<?> data, boolean dupFlag, boolean noDupFlag) {
		        this.data = data;
		        this.dupFlag = dupFlag;
		        this.noDupFlag = noDupFlag;
		    }

		    public List<?> getData() {
		        return data;
		    }

		    public void setData(List<?> data) {
		        this.data = data;
		    }

		    public boolean isDupFlag() {
		        return dupFlag;
		    }

		    public void setDupFlag(boolean dupFlag) {
		        this.dupFlag = dupFlag;
		    }

		    public boolean isNoDupFlag() {
		        return noDupFlag;
		    }

		    public void setNoDupFlag(boolean noDupFlag) {
		        this.noDupFlag = noDupFlag;
		    }
		}

}