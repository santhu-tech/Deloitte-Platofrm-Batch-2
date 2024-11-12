package com.SpringBoot.Ecommerce.ProductDB.Repository;

//to perform database operations ,saving,uodating,deleting

//retervies and Manages the data from the database

import com.SpringBoot.Ecommerce.ProductDB.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String>{
}
