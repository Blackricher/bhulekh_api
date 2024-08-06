package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Up_r6_detail_rtk;
import com.bhulekh.models.Up_r6_detail_rtkModel;
import com.bhulekh.models.Up_r6_detail_rtkOModel;
import com.bhulekh.models.Up_r6_detail_rtkSpecialModel;


public interface Up_r6_detail_rtkRepo extends JpaRepository<Up_r6_detail_rtk, Integer> {

	
	
	// to get flgOrd,countCourt,court_name,court_name1

	@Query(value = " select distinct o.order_type_desc, r.order_no, to_char(r.order_date,'DD-MM-YYYY') as order_date, r.created_on, to_char(r.order_date,'YYYY') as order_year, "
			+ "	s.alias, to_char(r.dsc_date,'DD-MM-YYYY') as dsc_date, l.transfer_type_desc, u.designation "
			+ "	from up_r6_detail_rtk r "
			+ "	left join up_order_type o on o.order_code=r.order_type "
			+ "	left join signature_detail s on r.tehsil_code_census=s.tehsil_code_census and r.device_serialno=s.device_serialno "
			+ "	left join up_land_transfer_type l on cast(l.sr_no as text)=r.trans_type "
			+ "	left join up_user_info u on u.username = s.op_code "
			+ "	where r.village_code_census =:villageCodeCensus and r.khata_number=:khataNumber and cast(r.unique_code as text)=:uniqueCode and r.order_type not in ('24') "
			+ "	and r.trans_type not in ('1','2','7','15','16','17','18','19','20') "
			+ "	order by r.created_on  ", nativeQuery = true)
	List<Up_r6_detail_rtkModel> getCname(@Param("villageCodeCensus") String villageCodeCensus,@Param("khataNumber") String khataNumber,@Param("uniqueCode") String uniqueCode);

	
	//For column 11-16
// to get order_no

//	@Query(value = " select distinct order_no, to_char(dsc_date, 'YYYY-MM-DD HH24:MI') as dsc_date"
//			+ "from up_r6_detail_rtk  "
//			+ "where village_code_census =:villageCodeCensus  and khata_number=:khata_number and cast(unique_code as text)=:unique_code and trans_type not in ('1','2','7','15','16','17','18','19','20') order by to_char(dsc_date, 'YYYY-MM-DD HH24:MI') ", nativeQuery = true)
//	List<Up_r6_detail_rtkOModel> getOrderN(@Param("villageCodeCensus") String villageCodeCensus,@Param("khata_number") String khata_number,@Param("unique_code") String unique_code);
//
//	
	@Query(value = "SELECT DISTINCT order_no, to_char(dsc_date, 'YYYY-MM-DD HH24:MI') AS dsc_date "
			+ "FROM up_r6_detail_rtk " + "WHERE village_code_census = :villageCodeCensus "
			+ "AND khata_number = :khataNumber " + "AND CAST(unique_code AS bigint) = CAST(:uniqueCode AS bigint) "
			+ "AND trans_type NOT IN ('1','2','7','15','16','17','18','19','20') "
			+ "ORDER BY to_char(dsc_date, 'YYYY-MM-DD HH24:MI')", nativeQuery = true)
	List<Up_r6_detail_rtkOModel> getOrderN(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("khataNumber") String khataNumber, @Param("uniqueCode") String uniqueCode);
	
	
	//to get special order
	@Query(value = " select distinct l.transfer_type_desc, r.special_remark, to_char(r.created_on,'DD-MM-YYYY') as created_on, s.alias, to_char(r.dsc_date,'DD-MM-YYYY') as dsc_date "
			+ "from up_r6_detail_rtk r "
			+ "left join up_land_transfer_type l on cast(l.sr_no as text)=r.trans_type "
			+ "left join signature_detail s on r.tehsil_code_census=s.tehsil_code_census and r.device_serialno=s.device_serialno "
			+ "where r.village_code_census=:villageCodeCensus and cast(r.unique_code as text)=:uniqueCode and r.trans_type in ('1','2','7','15','16','17','18','19','20') "
			+ " union "
			+ "select 'गाटा संशोधन' as transfer_type_desc, 'आदेश संख्या ' ||order_no || ' दिनांक ' || to_char(order_date,'DD-MM-YYYY') ||' के अनुसार गाटा का संशोधन किया गया है ' as special_remark, to_char(updated_on,'DD-MM-YYYY') as created_on, updated_by as alias, to_char(updated_on,'DD-MM-YYYY') as dsc_date "
			+ "from up_gata_detail_update_log where village_code_census =:villageCodeCensus and khata_number=:khataNumber and seq_no = ( "
			+ "select seq_no from up_gata_detail where village_code_census =:villageCodeCensus and khata_number=:khataNumber and cast(unique_code as text)=:uniqueCode ) "
			+ "union "
			+ "select 'अंश संशोधन' as transfer_type_desc, 'आदेश संख्या ' ||a.order_no || ' दिनांक ' || to_char(a.order_date,'DD-MM-YYYY') ||' के अनुसार अंश का संशोधन किया गया है ' as special_remark, "
			+ "to_char(a.updated_on,'DD-MM-YYYY') as created_on, b.name as alias, to_char(a.updated_on,'DD-MM-YYYY') as dsc_date "
			+ "from order_log_update_hissa a "
			+ "inner join up_user_info b on b.username=a.updated_by "
			+ "where a.village_code_census =:villageCodeCensus and cast(a.unique_gata_id as text)=:uniqueCode "
			+ "order by created_on ", nativeQuery = true)
	List<Up_r6_detail_rtkSpecialModel> getSpecialOrder(@Param("villageCodeCensus") String villageCodeCensus,@Param("khataNumber") String khata_number,@Param("uniqueCode") String uniqueCode);

}
