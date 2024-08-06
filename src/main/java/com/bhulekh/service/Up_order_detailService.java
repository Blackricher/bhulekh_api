package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Up_order_detailModel;
import com.bhulekh.models.Up_r6_detail_rtkModel;
import com.bhulekh.repository.Up_order_detailRepo;
@Service
public class Up_order_detailService {

	@Autowired
	private Up_order_detailRepo up_order_detailRepo;
	public List<Up_order_detailModel> getOldOrder(String villageCodeCensus,String khata_number) {
		return up_order_detailRepo.getOldOrder(villageCodeCensus,khata_number);
	}
	
}
