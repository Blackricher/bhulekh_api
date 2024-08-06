package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.bhulekh.entity.Up_order_detail;
import com.bhulekh.models.Up_order_detailModel;

public interface Up_order_detailRepo extends JpaRepository<Up_order_detail, Integer> {

	//to get old order detail

	@Query(value = " select order_desc from up_order_detail where village_code_census=:villageCodeCensus and khata_number=:khataNumber order by seq_no ", nativeQuery = true)
	List<Up_order_detailModel> getOldOrder(@Param("villageCodeCensus") String villageCodeCensus,@Param("khataNumber") String khataNumber);

}


