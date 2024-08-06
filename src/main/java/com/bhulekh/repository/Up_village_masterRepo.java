package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bhulekh.entity.Up_village_master;
import com.bhulekh.models.Up_village_masterModel;
import com.bhulekh.models.Up_villagelistModel;

import jakarta.transaction.Transactional;

@Repository
public interface Up_village_masterRepo extends JpaRepository<Up_village_master, Integer> {

	
	@Query(value = " select village_code_census, vname, up_pargana_master.pname, flg_chakbandi, flg_survey, up_pargana_master.pargana_code_new, vname_eng "
			+ " from up_village_master, up_pargana_master where  up_village_master.district_code_census = :districtCodeCensus and up_village_master.tehsil_code_census = :tehsilCodeCensus "
			+ " AND up_pargana_master.district_code_census=up_village_master.district_code_census AND "
			+ " up_pargana_master.tehsil_code_census=up_village_master.tehsil_code_census AND up_pargana_master.pargana_code_new=up_village_master.pargana_code_new "
			+ " order by vname ", nativeQuery = true)
	List<Up_village_masterModel> getVillages(@Param("districtCodeCensus") String districtCodeCensus,
			@Param("tehsilCodeCensus") String tehsilCodeCensus);

	// fillVillageAnshNew
	@Transactional
	@Query(value = " select v.village_code_census, v.vname, p.pname, v.flg_chakbandi, v.flg_survey, p.pargana_code_new, v.vname_eng from up_village_master v "
			+ "inner join up_pargana_master p on p.district_code_census=v.district_code_census AND p.tehsil_code_census=v.tehsil_code_census AND p.pargana_code_new=v.pargana_code_new "
			+ "where v.district_code_census = :districtCodeCensus and v.tehsil_code_census = :tehsilCodeCensus and v.locked='M' "
			+ "AND v.village_code_census in (select distinct village_code_census from up_village_master_lock_rtk where district_code_census= :districtCodeCensus and tehsil_code_census= :tehsilCodeCensus and (status ='3' or flg1 = '1')) "
			+ "order by v.vname ", nativeQuery = true)
	List<Up_village_masterModel> getVillagesRtk(@Param("districtCodeCensus") String districtCodeCensus,
			@Param("tehsilCodeCensus") String tehsilCodeCensus);

	@Query(value = "select v.village_code_census, v.vname, v.vname_eng, l.village_code_lgd from up_village_master v  "
			+ "left join all_village_lgd_up l on v.revenue_village_name = l.census_code_2011 "
			+ "where v.tehsil_code_census =:tehsilCodeCensus ", nativeQuery = true)
	List<Up_villagelistModel> getVillagelist(@Param("tehsilCodeCensus") String tehsilCodeCensus);

	@Query(value = "SELECT v.village_code_census, v.vname, v.vname_eng, l.village_code_lgd FROM up_village_master v "
			+ "LEFT JOIN all_village_lgd_up l ON v.revenue_village_name = l.census_code_2011 "
			+ "WHERE v.tehsil_code_census = :tehsilCodeCensus "
			+ "AND (:chakbandi IS NULL OR v.flg_chakbandi = :chakbandi) "
			+ "AND (:survey IS NULL OR v.flg_survey = :survey)", nativeQuery = true)
	List<Up_villagelistModel> getVillagelist(@Param("tehsilCodeCensus") String tehsilCodeCensus,
			@Param("chakbandi") String chakbandi, @Param("survey") String survey);

}
