package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Bed;

public interface BedRepository extends JpaRepository<Bed, Integer>{

@Query("""
	    SELECT b FROM Bed b
	    WHERE b.status = 'A'
	      AND b.sharing = :sharing
	      AND b.room.floor.building.hostel.id = :hostelId
		""")
	List<Bed> findAvailableBeds(@Param("hostelId") int hostelId, @Param("sharing") int sharing);

      List<Bed>  findByRoom_Id(int roomId);

	
	

	
	
	

}
