package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Up_gata_detail;
import com.bhulekh.models.Up_gata_detailModel;
import com.bhulekh.models.Up_gata_detail_1Model;
import com.bhulekh.models.Up_gata_sequence_partModel;

import jakarta.transaction.Transactional;

public interface Up_gata_detailRepo extends JpaRepository<Up_gata_detail, Integer> {

	
	@Query(value = "select g.khasra_no, g.khata_number, g.area, o.name, g.unique_code "
			+ "from up_gata_detail g, up_owner_detail o "
			+ " where g.village_code_census = :villageCodeCensus and g.village_code_census=o.village_code_census and "
			+ " g.khata_number=o.khata_number and ((khasra_no = :khasra_no) "
			+ " or (khasra_no like  CONCAT(:khasra_no,'%') and isnumeric(substring(khasra_no,length(cast (:khasra_no as text))+1,1))=0)) order by khata_number, khasra_no, name ", nativeQuery = true)
	List<Up_gata_detailModel> getUniqueCode(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("khasra_no") String khasra_no);

	@Query(value = "select g.khasra_no, g.khata_number, g.area, o.name, g.unique_code "
			+ "from up_gata_detail g, up_owner_detail o "
			+ " where g.village_code_census = :villageCodeCensus and g.village_code_census=o.village_code_census and "
			+ " g.khata_number=o.khata_number and ((g.khata_number = :khata_number) "
			+ " or (g.khata_number like  CONCAT(:khata_number,'%') and isnumeric(substring(g.khata_number,length(cast (:khata_number as text))+1,1))=0)) order by khata_number, khasra_no, name ", nativeQuery = true)
	List<Up_gata_detailModel> getUniqueCodek(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("khata_number") String khata_number);

	@Query(value = " SELECT g.khasra_no, g.khata_number, g.area, o.name, g.unique_code "
			+ "	FROM up_gata_detail g, up_owner_detail o " + "	WHERE g.village_code_census =:villageCodeCensus "
			+ "	AND g.village_code_census = o.village_code_census " + "	AND g.khata_number = o.khata_number "
			+ "	AND o.name LIKE CONCAT(:name,'%') "
			+ "	ORDER BY g.khata_number, g.khasra_no, o.name", nativeQuery = true)
	List<Up_gata_detailModel> getUniqueCoden(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("name") String name);

	@Query(value = " select g.unique_code, g.khasra_no, g.area , l.land_type , substring(cast(g.unique_code as text),15,2) as lt, g.khata_number "
			+ "	from up_gata_detail g "
			+ "	inner join up_land_type_detail l on cast(l.land_type_id as text)=substring(cast(g.unique_code as text),15,2) "
			+ "	where g.village_code_census =:villageCodeCensus and l.land_type=:It  order by g.unique_code", nativeQuery = true)
	List<Up_gata_detailModel> getShreni(@Param("villageCodeCensus") String villageCodeCensus, @Param("It") String It);

	@Query(value = " select seq_no,khata_number, part from up_gata_detail where village_code_census=:villageCodeCensus and cast(unique_code as text)=:uniqueCode", nativeQuery = true)
	List<Up_gata_sequence_partModel> getGataSeq(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("uniqueCode") String uniqueCode);

	// to get khasra_no, area, yr_co_ten

	@Query(value = " select khasra_no,area,yr_co_ten from up_gata_detail where village_code_census =:villageCodeCensus and cast(unique_code as text)=:uniqueCode and part =:part order by seq_no ", nativeQuery = true)
	List<Up_gata_detail_1Model> getKayr(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("uniqueCode") String uniqueCode, @Param("part") String part);

	@Query(value = " select khasra_no,area,yr_co_ten from up_gata_detail where village_code_census =:villageCodeCensus and cast(unique_code as text)=:uniqueCode and part =:part order by seq_no ", nativeQuery = true)
	List<Up_gata_detail_1Model> getKayr(@Param("villageCodeCensus") String villageCodeCensus);

	public interface ListOfAreaKhasraUniqueCode {

		public String getKhata_number();

		public float getArea();

		public String getKhasra_no();

		public long getUnique_code();

		public int getSeq_no();

	}

	@Query(value = "select khata_number, khasra_no, unique_code, area, seq_no from up_gata_detail "
			+ "where village_code_census  = :villageCodeCensus  and unique_code in (select distinct unique_gata_id from up_hissa_detail "
			+ "where village_code_census  = :villageCodeCensus and remark in ('1','2','3','4'))", nativeQuery = true)
	List<ListOfAreaKhasraUniqueCode> findGataWithAreaUnique1(String villageCodeCensus);

	@Query(value = "select khata_number, khasra_no, unique_code, area, seq_no from up_gata_detail "
			+ "where village_code_census  = :villageCodeCensus  and khata_number in (select distinct khata_number from up_hissa_detail "
			+ "where village_code_census  = :villageCodeCensus and remark in ('1','2','3','4'))", nativeQuery = true)
	List<ListOfAreaKhasraUniqueCode> findGataWithAreaUnique2(String villageCodeCensus);

}
