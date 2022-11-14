package com.test.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.test.demo.model.ItemDTO;

public interface AddDAO extends JpaRepository<ItemDTO, Integer>
{
	
	@Query("from ItemDTO order by price desc")
	List<ItemDTO> findByPrice();
	

}
