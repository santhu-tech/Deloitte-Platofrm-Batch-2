package com.springdatabase.EcomDB.Category.Service;

import com.springdatabase.EcomDB.Category.Error.CategoryNotFoundException;
import com.springdatabase.EcomDB.Category.Model.Category;
import com.springdatabase.EcomDB.Category.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> fetchCategoryList() {
        return categoryRepository.findAll();
    }

    @Override
    public Category fetchCategoryByID(Long categoryId) throws CategoryNotFoundException{
        Optional<Category> category=categoryRepository.findById(categoryId);
        if(!category.isPresent()){
            throw new CategoryNotFoundException("Category not found");
            //System.out.println("Department not available");
        }
        return category.get();
    }


}
