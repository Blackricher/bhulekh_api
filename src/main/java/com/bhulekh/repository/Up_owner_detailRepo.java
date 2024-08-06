package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.bhulekh.entity.Up_owner_detail;
import com.bhulekh.models.Up_owner_detailModel;

public interface Up_owner_detailRepo extends JpaRepository<Up_owner_detail, Integer> {
	
//Proceed without ansh
			@Query(value = " select name,father,address from up_owner_detail where village_code_census =:villageCodeCensus and khata_number= :khataNumber and part =:part order by owner_no ", nativeQuery = true)
			List<Up_owner_detailModel> getWnAnsh(@Param("villageCodeCensus") String villageCodeCensus,@Param("khataNumber") String khataNumber,@Param("part") String part);

}
