package com.springdatabase.EcomDB.Category.Service;

import com.springdatabase.EcomDB.Category.Error.CategoryNotFoundException;
import com.springdatabase.EcomDB.Category.Model.Category;
import com.springdatabase.EcomDB.Category.Repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
//@ActiveProfiles("qa")
public class CategoryServiceTest {
    @Mock
    private CategoryRepository categoryRepository;

    private Category category;

    @InjectMocks
    private CategoryServiceImpl categoryServiceImpl;

   // private ExampleCategryServiceImpl exampleCategryServiceImpl;

    @BeforeEach
    void setUp() {
        // Initializes the mock objects
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFetchCategoryByID() {
        // Arrange
        Long categoryId = 1L;
        Category category = new Category();
        category.setId(categoryId);
        category.setName("Electronics");

        when(categoryRepository.findById(categoryId)).thenReturn(Optional.of(category));

        // Act
        Category fetchedCategory = null;
        try {
            fetchedCategory = categoryServiceImpl.fetchCategoryByID(categoryId);
        } catch (CategoryNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Assert
        assertNotNull(fetchedCategory);
        assertEquals(categoryId, fetchedCategory.getId());
        assertEquals("Electronics", fetchedCategory.getName());

        verify(categoryRepository, times(1)).findById(categoryId);
    }
}

