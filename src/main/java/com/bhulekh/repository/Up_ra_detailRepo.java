package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.bhulekh.entity.Up_ra_detail;

import com.bhulekh.models.Up_ra_detailModel;

public interface Up_ra_detailRepo extends JpaRepository<Up_ra_detail, Integer> {

	
	@Query(value = " select distinct s.district_code_census,d.district_name_hindi FROM public.up_ra_detail s "
			+ "inner join up_district_master d on "
			+ "s.district_code_census=d.district_code_census ORDER BY d.district_name_hindi  ", nativeQuery = true)
	List<Up_ra_detailModel> getAllRaDistrict(@Param("all") String all);

	
	
	@Query(value = " select distinct s.tehsil_code_census,t.tname FROM public.up_ra_detail s inner join up_district_master d on "
			+ " s.district_code_census=d.district_code_census "
			+ " inner join up_tehsil_master t on t.tehsil_code_census=s.tehsil_code_census where s.district_code_census=:districtCodeCensus "
			+ " ORDER BY t.tname ", nativeQuery = true)
	List<Up_ra_detailModel> getAllRaTehsil(@Param("districtCodeCensus") String districtCodeCensus);
	

	
//	@Query(value = " SELECT district_code_census,tehsil_code_census,seq_no,village_code_census,village_name,"
//			+ "	mohalla_name,address,pincode,bandobast_no,sampatti_area,east,west,north,south,go_used_land,go_used_land_order,"
//			+ "	possesion_type,possesion_type_text,used_type,used_type_text,go_possesion_land,go_possesion_land_order,"
//			+ "	possesion_auth,tenant_name,lease_start_date,lease_end_date,yearly_rent,balance_rent,department,actual_yearly_income,"
//			+ "	income_source,order_no_if_partition,order_no_if_partition_order,order_date_if_partition,name_if_partition,"
//			+ "	verification_date,verification_officer_name,verification_officer_post,physical_verification_date,physical_verification_officer_name,"
//			+ "	physical_verification_officer_post,thana,a2,a3,a4 "
//			+ "	FROM up_ra_detail  where tehsil_code_census=:tehsilCodeCensus "
//			+ "	ORDER BY tehsil_code_census ASC, seq_no ASC  ", nativeQuery = true)
//	List<Up_ra_detailModel> getAllRaDetails(@Param("tehsilCodeCensus") String tehsilCodeCensus);
//	
//	
	
	
	@Query(value = " SELECT district_code_census,tehsil_code_census,seq_no,village_code_census,village_name, "
			+ "	mohalla_name,address,pincode,bandobast_no,sampatti_area,east,west,north,south,go_used_land,go_used_land_order, "
			+ "	possesion_type,possesion_type_text,used_type,used_type_text,go_possesion_land,go_possesion_land_order, "
			+ "	possesion_auth,tenant_name,lease_start_date,lease_end_date,yearly_rent,balance_rent,department,actual_yearly_income, "
			+ "	income_source,order_no_if_partition,order_no_if_partition_order,order_date_if_partition,name_if_partition, "
			+ "	verification_date,verification_officer_name,verification_officer_post,physical_verification_date,physical_verification_officer_name, "
			+ "	physical_verification_officer_post,thana,a2,a3,a4,COALESCE(d.dept_desc, '-') as dept_desc "
			+ "	FROM up_ra_detail ra left join up_department_master d on d.dept_id = ra.department  where tehsil_code_census=:tehsilCodeCensus "
			+ "	ORDER BY tehsil_code_census ASC, seq_no ASC  ", nativeQuery = true)
List<Up_ra_detailModel> getAllRaDetails(@Param("tehsilCodeCensus") String tehsilCodeCensus);
	
	
}
