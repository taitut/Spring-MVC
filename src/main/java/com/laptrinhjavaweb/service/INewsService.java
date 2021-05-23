package com.laptrinhjavaweb.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.laptrinhjavaweb.model.News;
@Repository
public interface INewsService {
    List<News> findByCategoryId(Long categoryId);

    News save(News news);

    News update(News news);

    void delete(Long[] ids);

    News findOne(Long id);

    List<News> findAllNews();

    List<News> findNBy(String filed, Object... objects);

    int getTotalItem();
}
