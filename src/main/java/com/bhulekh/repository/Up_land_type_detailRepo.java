package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Up_land_type_detail;

import com.bhulekh.models.Up_land_type_detailModel;


public interface Up_land_type_detailRepo extends JpaRepository<Up_land_type_detail, Integer> {

	
	@Query(value = " select land_type_desc, land_type from up_land_type_detail where land_type_id in " 
			+ " (select cast(substring(:uniqueCode, 15,16) as int)) " , nativeQuery = true)
	List<Up_land_type_detailModel> getLandTypeDesc(@Param("uniqueCode") String uniqueCode);
	
}