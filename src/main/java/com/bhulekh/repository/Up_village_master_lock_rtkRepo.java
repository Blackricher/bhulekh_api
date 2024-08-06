package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.bhulekh.entity.Up_village_master_lock_rtk;

import com.bhulekh.models.Up_village_master_lock_rtkModel;

public interface Up_village_master_lock_rtkRepo extends JpaRepository<Up_village_master_lock_rtk, String> {

	
	@Query(value = " select status from up_village_master_lock_rtk where village_code_census =:villageCodeCensus and status='3'  ", nativeQuery = true)
	List<Up_village_master_lock_rtkModel> getStatus(@Param("villageCodeCensus") String villageCodeCensus);
	
}