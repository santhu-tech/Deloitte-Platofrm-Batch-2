package com.springdatabase.EcomDB.Category.Service;

import com.springdatabase.EcomDB.Category.Error.CategoryNotFoundException;
import com.springdatabase.EcomDB.Category.Model.Category;
import com.springdatabase.EcomDB.Category.Repository.CategoryRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@ActiveProfiles("qa")
class CatService {
    @Autowired
    private CategoryService categoryService;

    @MockBean
    private CategoryRepository categoryRepository;

    @BeforeEach
    void setUp() {

        Category category=Category.builder()
                .Id(1001L)
//                .name("Iphne")
//                .description("It's mobile category")
               .build();
//        Mockito.when(categoryRepository.fetchCategoryById(1000L)).thenReturn(category);
     //  Category category=new Category(1L,"san","available");
    }
    //@BeforeAll{

    // }
    //@AfterAll

    //@AfterEach

    @Test
    public void IdFoundTest() throws CategoryNotFoundException {
       // Long categoryId=1001L;
        List<Category> found=categoryService.fetchCategoryList();
      // assertEquals(categoryId,found.getId());

    }
    //@Test 1

   // @Test 2

    //@Test 3


}
