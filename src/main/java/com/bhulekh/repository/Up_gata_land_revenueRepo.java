package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bhulekh.entity.Up_gata_land_revenue;
import com.bhulekh.models.Lr_payblex2Model;


@Repository
public interface Up_gata_land_revenueRepo extends JpaRepository<Up_gata_land_revenue, Integer> {


	@Query(value = "SELECT land_revenue FROM up_gata_land_revenue WHERE village_code_census = :villageCodeCensus AND cast(unique_code as text) = :uniqueCode", nativeQuery = true)
	String getLr_payblex2(@Param("villageCodeCensus") String villageCodeCensus, @Param("uniqueCode") String uniqueCode);

}

