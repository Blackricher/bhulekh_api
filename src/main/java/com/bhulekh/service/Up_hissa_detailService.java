package com.bhulekh.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.bhulekh.models.Hissa_countModel;
import com.bhulekh.models.Up_hissa_detailModel;
import com.bhulekh.models.Up_hissa_detailNDModel;
import com.bhulekh.models.Up_owner_detailModel;
import com.bhulekh.repository.Up_hissa_detailRepo;
import com.bhulekh.repository.Up_owner_detailRepo;

@Service
public class Up_hissa_detailService {

    @Autowired
    private Up_hissa_detailRepo up_hissa_detailRepo;
    @Autowired
    private Up_owner_detailRepo up_owner_detailRepo;
    


    public ResponseEntity<?> getCounts(String villageCodeCensus, String khataNumber, String part, String fasliYear, String seqNo, String uniqueCode) {
        List<Hissa_countModel> counts = up_hissa_detailRepo.getCounts(villageCodeCensus, khataNumber);
       // boolean dataFound = false;
        boolean dupFlag = false;
        boolean noDupFlag = false;
        List<?> data = null;
        if (!counts.isEmpty()) {
           // dataFound = true;
        	List<Up_owner_detailModel> names= up_owner_detailRepo.getWnAnsh(villageCodeCensus, khataNumber, part);
        	data=names;
        } else {
            List<Up_hissa_detailModel> names = up_hissa_detailRepo.getCheckDup(villageCodeCensus, fasliYear, khataNumber, seqNo, uniqueCode);
            if (!names.isEmpty()) {
            	dupFlag = true;
               List<Up_hissa_detailNDModel> name= up_hissa_detailRepo.getDupName(villageCodeCensus, fasliYear, khataNumber, seqNo, uniqueCode);
               data=name;
            } else {
               List<Up_hissa_detailNDModel>name= up_hissa_detailRepo.getNODupName(villageCodeCensus, fasliYear, khataNumber, seqNo, uniqueCode);
                noDupFlag = true;
                data=name;
            }
        }

        // Create a map to hold both the flag and the data
        Map<String, Object> responseMap = new HashMap<>();
       // responseMap.put("dataFound", dataFound);
        responseMap.put("dupFlag", dupFlag);
        responseMap.put("noDupFlag", noDupFlag);
        responseMap.put("counts", data);

        return ResponseEntity.ok(responseMap);
    }
}
