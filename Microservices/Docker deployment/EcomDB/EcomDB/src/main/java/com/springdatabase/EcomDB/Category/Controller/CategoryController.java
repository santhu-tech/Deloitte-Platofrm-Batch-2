package com.springdatabase.EcomDB.Category.Controller;

import com.springdatabase.EcomDB.Category.Error.CategoryNotFoundException;
import com.springdatabase.EcomDB.Category.Model.Category;
import com.springdatabase.EcomDB.Category.Service.CategoryService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CategoryController {
    @Autowired
     private CategoryService categoryService;

    private final Logger LOGGER= LoggerFactory.getLogger((CategoryController.class));
    @PostMapping("/categories")
    public Category saveCategory(@Valid @RequestBody Category category){
        LOGGER.info("Inside the Category");
        return categoryService.saveCategory(category);
    }

    @GetMapping("/categories")
    public List<Category> fetchCategoryList() throws CategoryNotFoundException{
        LOGGER.info("Inside the Category of get request");
        return categoryService.fetchCategoryList();
    }

    /*@GetMapping("/categories")
    public ResponseEntity<List<Category>> fetchCategoryList() {
        LOGGER.info("Inside the Category of get request");
        return ResponseEntity.ok(categoryService.fetchCategoryList());
    } */

    @GetMapping("/categories/{id}")
    public Category fetchCategoryById(@PathVariable("id") Long categoryId) throws CategoryNotFoundException {
        return categoryService.fetchCategoryByID(categoryId);
    }

   /* @GetMapping("/categories/{id}")
    public <Category> fetchCategoryById(@PathVariable("id") Long categoryId){
      //  return new ResponseEntity<Category> (categoryService.fetchCategoryByID(categoryId), HttpStatus.OK);
        return categoryService.fetchCategoryByID(categoryId);
    }*/

    //deletebyid
    //update
    //fetchcatalogByName

/*@GetMapping("/exampleendpoint")
    public String Example(){
        logger.info("Endpoints");
        logger.debug("");
        return "" ;
    }*/
}
