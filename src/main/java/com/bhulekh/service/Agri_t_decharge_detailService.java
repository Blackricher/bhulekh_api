package com.bhulekh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhulekh.models.Agri_t_charge_detailMode;

import com.bhulekh.repository.Agri_t_decharge_detailRepo;

@Service
public class Agri_t_decharge_detailService {

	@Autowired
	private Agri_t_decharge_detailRepo agri_t_decharge_detailRepo;

	public List<Agri_t_charge_detailMode> getDecharge(String villageCodeCensus,String uniqueCode) {
		return agri_t_decharge_detailRepo.getDecharge(villageCodeCensus,uniqueCode);
	}
}
