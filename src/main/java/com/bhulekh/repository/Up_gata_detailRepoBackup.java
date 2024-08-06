package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Up_gata_details_backup;
import com.bhulekh.models.Up_gata_detailModel;

import jakarta.transaction.Transactional;

public interface Up_gata_detailRepoBackup extends JpaRepository<Up_gata_details_backup, Integer> {

	
	@Query(value = "select g.khasra_no, g.khata_number, g.area, o.name, g.unique_code "
			+ "from backup.up_gata_detail g, up_owner_detail o "
			+ " where g.village_code_census = :villageCodeCensus and g.village_code_census=o.village_code_census and "
			+ " g.khata_number=o.khata_number and ((khasra_no = :khasra_no) "
			+ " or (khasra_no like  CONCAT(:khasra_no,'%') and isnumeric(substring(khasra_no,length(cast (:khasra_no as text))+1,1))=0)) and fasli_year =:fasli_year order by khata_number, khasra_no, name ", nativeQuery = true)
	List<Up_gata_detailModel> getUniqueCodeB(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("khasra_no") String khasra_no, @Param("fasli_year") String fasli_year);

	@Query(value = "select g.khasra_no, g.khata_number, g.area, o.name, g.unique_code "
			+ "from backup.up_gata_detail g, up_owner_detail o "
			+ " where g.village_code_census = :villageCodeCensus and g.village_code_census=o.village_code_census and "
			+ " g.khata_number=o.khata_number and ((g.khata_number = :khata_number) "
			+ " or (g.khata_number like  CONCAT(:khata_number,'%') and isnumeric(substring(g.khata_number,length(cast (:khata_number as text))+1,1))=0))and fasli_year =:fasli_year  order by khata_number, khasra_no, name ", nativeQuery = true)
	List<Up_gata_detailModel> getUniqueCodekB(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("khata_number") String khata_number, @Param("fasli_year") String fasli_year);

	@Query(value = " SELECT g.khasra_no, g.khata_number, g.area, o.name, g.unique_code "
			+ "	FROM backup.up_gata_detail g, up_owner_detail o "
			+ "	WHERE g.village_code_census =:villageCodeCensus "
			+ "	AND g.village_code_census = o.village_code_census " + "	AND g.khata_number = o.khata_number "
			+ "	AND o.name LIKE CONCAT(:name,'%') and fasli_year =:fasli_year"
			+ "	ORDER BY g.khata_number, g.khasra_no, o.name", nativeQuery = true)
	List<Up_gata_detailModel> getUniqueCodenB(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("name") String name, @Param("fasli_year") String fasli_year);

	@Query(value = " select g.unique_code, g.khasra_no, g.area , l.land_type , substring(cast(g.unique_code as text),15,2) as lt, g.khata_number "
			+ "	from backup.up_gata_detail g "
			+ "	inner join up_land_type_detail l on cast(l.land_type_id as text)=substring(cast(g.unique_code as text),15,2) "
			+ "	where g.village_code_census =:villageCodeCensus and l.land_type=:lt and fasli_year =:fasli_year  order by g.unique_code", nativeQuery = true)
	List<Up_gata_detailModel> getShreniB(@Param("villageCodeCensus") String villageCodeCensus, @Param("lt") String lt,
			@Param("fasli_year") String fasli_year);

}
