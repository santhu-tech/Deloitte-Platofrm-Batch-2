package com.springdatabase.EcomDB.Category.Service;

import com.springdatabase.EcomDB.Category.Error.CategoryNotFoundException;
import com.springdatabase.EcomDB.Category.Model.Category;

import java.util.List;

public interface CategoryService {
    public Category saveCategory(Category category);

    public List<Category> fetchCategoryList();

   //public Category fetchCategoryByID(Long categoryId);

     public Category fetchCategoryByID(Long CategoryId) throws CategoryNotFoundException;

    //public Category deleteCategory(Long id);
}
