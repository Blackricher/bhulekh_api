package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bhulekh.entity.Up_tehsil_master;
import com.bhulekh.models.Up_tehsil_masterModel;

import jakarta.transaction.Transactional;

@Repository
public interface Up_tehsil_masterRepo extends JpaRepository<Up_tehsil_master, String> {

	
	@Query(value = " select tname, tehsil_code_census,district_code_census, tname_eng from up_tehsil_master where district_code_census= :districtCodeCensus ", nativeQuery = true)
	List<Up_tehsil_masterModel> getTehsil(@Param("districtCodeCensus") String districtCodeCensus);

}
