package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Hostel;
import java.util.List;


public interface HostelRepository extends JpaRepository<Hostel, Integer>{

	
	List<Hostel> findHostelByOrganization_Id(int organizationId);

}
