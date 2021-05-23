package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.model.Category;
@Repository
public interface ICategoryService {
    List<Category> findAll();

    Category save(Category category);

    Category update(Category category);

    void delete(Long[] ids);
}
