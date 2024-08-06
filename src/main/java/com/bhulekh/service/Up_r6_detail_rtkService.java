//package com.bhulekh.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bhulekh.models.Up_r6_detail_rtkModel;
//import com.bhulekh.models.Up_r6_detail_rtkOModel;
//import com.bhulekh.models.Up_r6_detail_rtkSpecialModel;
//import com.bhulekh.repository.Up_r6_detail_rtkRepo;
//
//@Service
//public class Up_r6_detail_rtkService {
//	@Autowired
//	private Up_r6_detail_rtkRepo up_r6_detail_rtkRepo;
//
//	public List<Up_r6_detail_rtkModel> getCname(String villageCodeCensus,String khata_number,String unique_code) {
//		return up_r6_detail_rtkRepo.getCname(villageCodeCensus,khata_number,unique_code);
//	}
//	
//	
//	public List<Up_r6_detail_rtkOModel> getOrderN(String villageCodeCensus,String khata_number,String unique_code) {
//		return up_r6_detail_rtkRepo.getOrderN(villageCodeCensus,khata_number,unique_code);
//	}
//	
//	public List<Up_r6_detail_rtkSpecialModel> getSpecialOrder(String villageCodeCensus,String khata_number,String unique_code) {
//		return up_r6_detail_rtkRepo.getSpecialOrder(villageCodeCensus,khata_number,unique_code);
//	}
//
//}

package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_r6_detail_rtkModel;
import com.bhulekh.models.Up_r6_detail_rtkOModel;
import com.bhulekh.models.Up_r6_detail_rtkSpecialModel;
import com.bhulekh.repository.Up_r6_detail_rtkRepo;

@Service
public class Up_r6_detail_rtkService {
    @Autowired
    private Up_r6_detail_rtkRepo up_r6_detail_rtkRepo;

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

    public ServiceResponse getCname(String villageCodeCensus, String khataNumber, String uniqueCode) {
        List<Up_r6_detail_rtkModel> data = up_r6_detail_rtkRepo.getCname(villageCodeCensus, khataNumber, uniqueCode);
        boolean flag = !data.isEmpty(); // Set flag based on whether data is empty or not
        return new ServiceResponse(data, flag);
    }

    public List<Up_r6_detail_rtkOModel> getOrderN(String villageCodeCensus,String khata_number,String unique_code) {
        return up_r6_detail_rtkRepo.getOrderN(villageCodeCensus,khata_number,unique_code);
    }

    public List<Up_r6_detail_rtkSpecialModel> getSpecialOrder(String villageCodeCensus,String khata_number,String unique_code) {
        return up_r6_detail_rtkRepo.getSpecialOrder(villageCodeCensus,khata_number,unique_code);
    }
}
