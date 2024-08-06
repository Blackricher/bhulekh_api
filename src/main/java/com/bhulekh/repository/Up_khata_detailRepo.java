package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bhulekh.entity.Up_khata_detail;
import com.bhulekh.models.Lr_payblexModel;
import com.bhulekh.models.Up_khata_detailModel;

@Repository
public interface Up_khata_detailRepo extends JpaRepository<Up_khata_detail, Integer> {

	@Query(value = "SELECT distinct fasli_year||'(c)' as fasli_year FROM up_khata_detail WHERE village_code_census = :villageCodeCensus "
			+ "UNION "
			+ "SELECT DISTINCT fasli_year||'(b)' as fasli_year FROM backup.up_khata_detail WHERE village_code_census = :villageCodeCensus ORDER BY fasli_year DESC", nativeQuery = true)
	List<Up_khata_detailModel> getfasliYear(@Param("villageCodeCensus") String villageCodeCensus);

//current fasli year
	@Query(value = "select k.part, k.khata_number, l.land_type, l.land_type_desc " + " from up_khata_detail k "
			+ " inner join up_gata_detail g on k.village_code_census=g.village_code_census and k.khata_number=g.khata_number "
			+ " inner join up_land_type_detail l on cast(l.land_type_id as text)=substring(cast(g.unique_code as text), 15,16) "
			+ " where k.village_code_census=:villageCodeCensus and cast(g.unique_code as Text)=:uniqueCode ", nativeQuery = true)
	List<Up_khata_detailModel> getkhataone(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("uniqueCode") String uniqueCode);

	@Query(value = " select k.land_revenue_payable, count(g.seq_no) as counts " + " from up_khata_detail k "
			+ " inner join up_gata_detail g on g.village_code_census=k.village_code_census and g.khata_number=k.khata_number "
			+ " where k.village_code_census=:villageCodeCensus and k.khata_number=:khataNumber "
			+ " group by k.land_revenue_payable  ", nativeQuery = true)
	List<Lr_payblexModel> getLr_payblex(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("khataNumber") String khataNumber);

}
