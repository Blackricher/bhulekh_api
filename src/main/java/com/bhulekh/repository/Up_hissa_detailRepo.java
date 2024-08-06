package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Up_hissa_detail;
import com.bhulekh.models.Hissa_countModel;
import com.bhulekh.models.Up_hissa_detailModel;
import com.bhulekh.models.Up_hissa_detailNDModel;

public interface Up_hissa_detailRepo extends JpaRepository<Up_hissa_detail, Integer> {

	@Query(value = " select count(*) as counts from up_hissa_detail  where village_code_census=:villageCodeCensus  and khata_number=:khataNumber and  remark in ('1','2','3','4') ", nativeQuery = true)
	List<Hissa_countModel> getCounts(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("khataNumber") String khataNumber);
	// if we get result from this query, then proceed without ansh otherwise proceed
	// with ansh

	// Proceed for name
	// check duplicate name

	@Query(value = " select name, father, count(1) as counts"
			+ " from up_hissa_detail where village_code_census =:villageCodeCensus and fasli_year=:fasliYear and  khata_number=:khataNumber "
			+ " and remark='0' and cast(seq_no as text)=:seqNo and cast(unique_gata_id as text)=:uniqueCode "
			+ " group by name, father having count(1)>1 ", nativeQuery = true)
	List<Up_hissa_detailModel> getCheckDup(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("fasliYear") String fasliYear, @Param("khataNumber") String khataNumber,
			@Param("seqNo") String seqNo, @Param("uniqueCode") String uniqueCode);

	// if duplicate found
	@Query(value = " select distinct khata_number, name, father, trim(address) as address, sum(hissa) as hissa, COALESCE(share,'-') as share "
			+ "	from up_hissa_detail where village_code_census =:villageCodeCensus and fasli_year=:fasliYear and  khata_number=:khataNumber "
			+ "	and remark='0' and cast(seq_no as text)=:seqNo and cast(unique_gata_id as text)=:uniqueCode "
			+ "	group by khata_number, name, father, trim(address), share " + "	order by name  ", nativeQuery = true)
	List<Up_hissa_detailNDModel> getDupName(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("fasliYear") String fasliYear, @Param("khataNumber") String khataNumber,
			@Param("seqNo") String seqNo, @Param("uniqueCode") String uniqueCode);

	// else

	@Query(value = " select distinct khata_number, name, father, address, COALESCE(caste,'-') as caste, COALESCE(substring(aadhar_no,9,4),'-') as aadhar_no, "
			+ "	khasra_no, area, hissa, COALESCE(share,'-') as share, seq_no, device_serialno, COALESCE(substring(pan_no,6,4),'-') as pan_no, COALESCE(dob,'-') as dob "
			+ "	from up_hissa_detail where village_code_census =:villageCodeCensus and fasli_year=:fasliYear and  khata_number=:khataNumber "
			+ "	and remark='0' and cast(seq_no as text)=:seqNo and cast(unique_gata_id as text)=:uniqueCode order by name, seq_no ", nativeQuery = true)
	List<Up_hissa_detailNDModel> getNODupName(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("fasliYear") String fasliYear, @Param("khataNumber") String khataNumber,
			@Param("seqNo") String seqNo, @Param("uniqueCode") String uniqueCode);

}
