/*package com.springdatabase.EcomDB.Category.Service;

import com.springdatabase.EcomDB.Category.Model.Category;
import com.springdatabase.EcomDB.Category.Repository.CategoryRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

//@ExtendWith(SpringExtension.class)
//@RunWith(MockitoJUnitRunner.class)
class CategoryServiceImplTest {
    //@Nested
    //
    // class CategoryServiceImplTest{

    @Mock
    private CategoryRepository categoryRepository;
    private Category category;
    @InjectMocks
    //@Autowired
    private CategoryServiceImpl categoryServiceImpl;


    @Before
    public void setUp() {
        category = new Category();
        category.setId(1L);
        category.setName("Electronics");
        category.setDescription("Electronic items");
    }

    @Test

    public void testSaveCategory() {
        Mockito.when(categoryRepository.save(Mockito.any(Category.class))).thenReturn(category);

        Category savedCategory = categoryServiceImpl.saveCategory(category);
        assertNotNull(savedCategory);
        assertEquals("Electronics", savedCategory.getName());
    }
}*/

////
///*        @Test
//        public void testFetchCategoryByID() throws CategoryNotFoundException {
//            Mockito.when(categoryRepository.findById(1L)).thenReturn(Optional.ofNullable(category));
//
//            Category fetchedCategory = categoryServiceImpl.fetchCategoryByID(1L);
//
//           assertNotNull(fetchedCategory);
//            assertEquals("Electronics", fetchedCategory.getName());
//            verify(categoryRepository, times(1)).findById(1L);
//        }*/
//
////        @Test
////        public void testFetchCategoryByName() {
////            Mockito.when(categoryRepository.findByName("Electronics")).thenReturn(category);
////
////            Category fetchedCategory = categoryServiceImpl.fetchCategoryByName("Electronics");
////
////            assertNotNull(fetchedCategory);
////            assertEquals("Electronics", fetchedCategory.getName());
////        }
////
////        @Test
////        public void testDeleteCategoryById() {
////            categoryServiceImpl.deleteCategoryById(1L);
////            Mockito.verify(categoryRepository, Mockito.times(1)).deleteById(1L);
////        }
//    }
//
////    private Category fetchCategoryByID(long l) {
////    }
//
////}
