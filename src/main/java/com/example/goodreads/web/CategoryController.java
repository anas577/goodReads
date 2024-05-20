package com.example.goodreads.web;


import com.example.goodreads.dao.entities.Category;
import com.example.goodreads.service.CategoryManager;
import com.example.goodreads.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryManager categoryService;


    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@RequestParam int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Category addCategory(@RequestParam Category category) {
        return categoryService.addCategory(category);
    }

    @PutMapping
    public Category updateCategory(@RequestParam Category category) {
        return categoryService.updateCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@RequestParam int id) {
         categoryService.deleteCategoryById(id);
    }

}
