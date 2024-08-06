package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bhulekh.entity.Agri_t_decharge_detail;
import com.bhulekh.models.Agri_t_charge_detailMode;

import jakarta.transaction.Transactional;

public interface Agri_t_decharge_detailRepo extends JpaRepository<Agri_t_decharge_detail, Integer> {

	
	@Query(value = " select b.bank_name, c.ifsc_code, to_char(c.dsc_date, 'DD-MM-YYYY') as dsc_date, "
			+ " c.payment_amount, c.request_id, STRING_AGG(trim(o.name)||'('||trim(o.father)||')', ', ') as pname "
			+ " from agri_t_decharge_detail c "
			+ " inner join bank_branch_user_info b on cast(b.serial_no as varchar)=c.ifsc_code "
			+ " inner join agri_t_request_detail_gata g on g.request_id=c.request_id "
			+ " inner join agri_t_request_detail_owner o on o.request_id=c.request_id "
			+ " inner join up_r6_detail_rtk r on r.village_code_census=g.village_code_census and r.unique_code=g.gata_unique_code and r.order_no=c.request_id "
			+ " and g.village_code_census=:villageCodeCensus and cast(g.gata_unique_code as text)=:uniqueCode "
			+ " where c.action_bank='D' and c.action_tehsil = '1' and c.action_rsix='1' "
			+ " group by b.bank_name, c.ifsc_code, c.dsc_date, c.payment_amount, c.request_id ", nativeQuery = true)
	List<Agri_t_charge_detailMode> getDecharge(@Param("villageCodeCensus") String villageCodeCensus,
			@Param("uniqueCode") String uniqueCode);

}
