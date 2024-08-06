package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Up_ss_detail;
import com.bhulekh.models.Up_ss_detailModel;

import jakarta.transaction.Transactional;

public interface Up_ss_detailRepo extends JpaRepository<Up_ss_detail, Integer> {

	
	@Query(value = " select distinct s.district_code_census,d.district_name_hindi FROM public.up_ss_detail s inner join up_district_master d on "
			+ " s.district_code_census=d.district_code_census ORDER BY d.district_name_hindi ", nativeQuery = true)
	List<Up_ss_detailModel> getAllDistrict(@Param("all") String all);

	@Query(value = " select distinct s.tehsil_code_census,t.tname FROM public.up_ss_detail s inner join up_district_master d on "
			+ " s.district_code_census=d.district_code_census "
			+ " inner join up_tehsil_master t on t.tehsil_code_census=s.tehsil_code_census where s.district_code_census=:districtCodeCensus ORDER BY t.tname  ", nativeQuery = true)
	List<Up_ss_detailModel> getAllTehsil(@Param("districtCodeCensus") String districtCodeCensus);

	@Query(value = " SELECT district_code_census,tehsil_code_census,village_code_census,seq_no,village_name, "
			+ " mohalla_name,thana,address,ward,city,pincode,khata_number,khasra_no, "
			+ " if_chak_old_khasra_no,gata_unique_code,irr_land,non_irr_land_house,non_irr_land_blank,tot_area, "
			+ " east,west,north,south,ss_entry_year,ss_person_name,ss_person_father_name,migration_date,migration_year, "
			+ " ss_area_complete,ss_area_part,remark_if_auc,ss_value,tenant_name,tenant_father_name,tenant_address,occupancy_base, "
			+ " occupancy_date,ss_court_case_remark,reserve_area,gov_land_area,auc_area,remark_for_auc, "
			+ " balance_rent,department " + " FROM public.up_ss_detail  where tehsil_code_census=:tehsilCodeCensus "
			+ " ORDER BY district_code_census ASC, tehsil_code_census ASC  ", nativeQuery = true)
	List<Up_ss_detailModel> getAllDetails(@Param("tehsilCodeCensus") String tehsilCodeCensus);

}
