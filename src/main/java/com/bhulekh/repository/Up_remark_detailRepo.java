package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.bhulekh.entity.Up_remark_detail;
import com.bhulekh.models.Up_remark_detailModel;

public interface Up_remark_detailRepo extends JpaRepository<Up_remark_detail, Integer> {

	
	@Query(value = " select a.remark_desc, a.alias, a.dsc_date, a.designation from "
			+ "			(select r.remark_desc, s.alias, to_char(r.dsc_date,'DD-MM-YYYY') as dsc_date, u.designation "
			+ "			from up_remark_detail r"
			+ "			left join signature_detail s on r.tehsil_code_census=s.tehsil_code_census and r.device_serialno=s.device_serialno "
			+ "			left join up_user_info u on u.username = s.op_code "
			+ "			where r.village_code_census=:villageCodeCensus and r.khata_number=:khataNumber "
			+ "			UNION"
			+ "			select r.special_remark as remark_desc, s.alias, to_char(r.dsc_date,'DD-MM-YYYY') as dsc_date, u.designation"
			+ "			from up_r6_detail_rtk r"
			+ "			left join signature_detail s on r.tehsil_code_census=s.tehsil_code_census and r.device_serialno=s.device_serialno"
			+ "			left join up_user_info u on u.username = s.op_code"
			+ "			where r.village_code_census=:villageCodeCensus and cast(r.unique_code as text)=:uniqueCode and r.order_type='24' and r.flg_parwana is null"
			+ "			) as a order by a.dsc_date " , nativeQuery = true)
	List<Up_remark_detailModel> getRemarks(@Param("villageCodeCensus") String villageCodeCensus,@Param("khataNumber") String khataNumber,@Param("uniqueCode") String uniqueCode);

	
}
