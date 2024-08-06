package com.bhulekh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bhulekh.entity.RTK_Ansh_Log_Entity;

public interface Up_village_ansh_log_rtk_repo extends JpaRepository<RTK_Ansh_Log_Entity, String> {

	public interface ListOfAnshRTKWithCounter {
		public int getCounter();

		public String getFlgansh();
	}

	@Query(value = "select counter, flg_ansh as flgansh from up_village_ansh_log_rtk  where village_code_census= :villageCodeCensus", nativeQuery = true)
	List<ListOfAnshRTKWithCounter> findCounterRTKAnsh(String villageCodeCensus);
}
