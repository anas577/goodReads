package com.example.goodreads.service;

import com.example.goodreads.dao.entities.Category;

import java.util.List;

public interface CategoryManager {
    public Category addCategory(Category category);
    public Category updateCategory(Category category);
    public boolean deleteCategoryById(int id);
    public boolean deleteCategory(Category category);
    public Category getCategoryById(int id);
    public List<Category> getAllCategories();
}
