package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Up_r6_add_owner_detail_rtk;
import com.bhulekh.models.Up_r6_add_owner_detail_rtkModel;

public interface Up_r6_add_owner_detail_rtkRepo extends JpaRepository<Up_r6_add_owner_detail_rtk, Integer> {

	
	
	// For column 11-16(third part)


	@Query(value = " select aname, afather, a_address, a_hissa, order_no from up_r6_add_owner_detail_rtk " +
	" where village_code_census =:villageCodeCensus and khata_number=:khataNumber and cast(unique_code as text)=:uniqueCode and order_no =:order_no order by order_no, seq_no  ", nativeQuery = true)
	List<Up_r6_add_owner_detail_rtkModel> getAname(@Param("villageCodeCensus") String villageCodeCensus,@Param("khataNumber") String khataNumber,@Param("uniqueCode") String uniqueCode,@Param("order_no") String order_no);

}
