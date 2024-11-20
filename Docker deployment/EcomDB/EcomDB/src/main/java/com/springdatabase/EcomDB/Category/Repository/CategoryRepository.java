package com.springdatabase.EcomDB.Category.Repository;

import com.springdatabase.EcomDB.Category.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
   // public Category fetchCategoryById(long l);
}
