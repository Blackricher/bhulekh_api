package com.bhulekh.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.bhulekh.entity.Up_khata_detail_backup;
import com.bhulekh.models.Up_khata_detailModel;


public interface Up_khata_detailRepoBackup extends JpaRepository<Up_khata_detail_backup, Integer> {

	
	
//backup fasli year
@Query(value = "select k.part, k.khata_number, k.land_type, l.land_type_desc "
		+ "from backup.up_khata_detail k "
		+ "inner join up_land_type_detail l on l.land_type=k.land_type "
		+ "where k.village_code_census=:villageCodeCensus and k.fasli_year=:fasli_year and k.khata_number=:khata_number ", nativeQuery = true)
List<Up_khata_detailModel> getkhatatwo(@Param("villageCodeCensus") String villageCodeCensus,@Param("fasli_year") String fasli_year,@Param("khata_number") String khata_number);

}