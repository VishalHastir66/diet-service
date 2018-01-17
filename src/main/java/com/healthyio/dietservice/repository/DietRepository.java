package com.healthyio.dietservice.repository;

import com.healthyio.dietservice.bean.Diet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DietRepository extends JpaRepository<Diet,Integer>{

}
