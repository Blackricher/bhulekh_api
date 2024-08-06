package com.bhulekh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Lr_payblexDTO;
import com.bhulekh.models.Lr_payblexModel;
import com.bhulekh.repository.Up_gata_land_revenueRepo;
import com.bhulekh.repository.Up_khata_detailRepo;

@Service
public class Up_khata_detail_Service {

    @Autowired
    private Up_khata_detailRepo up_khata_detailRepo;

    @Autowired
    private Up_gata_land_revenueRepo up_gata_land_revenueRepo;

    public List<Lr_payblexDTO> getLr_payblex(String villageCodeCensus, String khataNumber, String uniqueCode) {
        // Execute the query to get lr_payblex
        List<Lr_payblexModel> lr_paybl = up_khata_detailRepo.getLr_payblex(villageCodeCensus, khataNumber);
        
      

        List<Lr_payblexDTO> lr_payblexDTOs = new ArrayList<>();
        
       
        // Check if result is not empty
        if (!lr_paybl.isEmpty()) {
            int count = lr_paybl.get(0).getCounts();
            System.out.println("iterateioncoutn"+count);

            if (count != 1) {
                // Execute the second query to get lr_payblex
            	 lr_payblexDTOs.clear();
            	String lr_payblexString = up_gata_land_revenueRepo.getLr_payblex2(villageCodeCensus, uniqueCode);
                // Check if lr_payblexString is not null and not empty
                if (lr_payblexString != null && !lr_payblexString.isEmpty()) {
                    try {
                        // Convert lr_payblexString to Float
                        Float lr_payblex = Float.parseFloat(lr_payblexString);

                        // Update the land_revenue_payable field in each DTO object
                        for (Lr_payblexModel lrModel : lr_paybl) {
                            Lr_payblexDTO dto = new Lr_payblexDTO();
                            dto.setCounts(lrModel.getCounts());
                            dto.setLand_revenue_payable(lr_payblex);
                            lr_payblexDTOs.add(dto);
                        }
                    } catch (NumberFormatException e) {
                        // Handle the case where lr_payblexString cannot be parsed to Float
                        // Log the error or take appropriate action
                        System.err.println("Error parsing lr_payblexString to Float: " + e.getMessage());
                    }}
//                } else {
//                    System.out.println("Query does not return any data for lr_payblexString");
//                }
            }
            else {
            	
            	System.out.println("i am else part of lr payblexModel Service");
            	 for (Lr_payblexModel lr_payblexModel : lr_paybl) {
                     Lr_payblexDTO lr_payblexDTO = new Lr_payblexDTO();
                     // Set properties of lr_payblexDTO from lr_payblexModel
                     lr_payblexDTO.setCounts(lr_payblexModel.getCounts());
                     lr_payblexDTO.setLand_revenue_payable(lr_payblexModel.getLand_revenue_payable());
                     
                     // Add lr_payblexDTO to the list
                     lr_payblexDTOs.add(lr_payblexDTO);
                 }
            }
        } 
        
        return lr_payblexDTOs; // Return the list of Lr_payblexDTO objects
    }
}
