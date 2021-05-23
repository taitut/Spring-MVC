package com.laptrinhjavaweb.service.Ipl;

import java.sql.Timestamp;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.laptrinhjavaweb.dao.ICategory;

import com.laptrinhjavaweb.dao.INewsDao;
import com.laptrinhjavaweb.Pageble.Pageble;
import com.laptrinhjavaweb.model.Category;
import com.laptrinhjavaweb.model.News;
import com.laptrinhjavaweb.service.INewsService;

public class newsServiceIpl implements INewsService {
    @Autowired
    private INewsDao newDao;
    @Autowired
    private ICategory categoryDao;
    @Autowired


    @Override
    public List<News> findByCategoryId(Long categoryId) {
        return newDao.findNByCategoryId(categoryId);
    }

    @Override
    public News save(News news) {
        news.setCreateDate(new Timestamp(System.currentTimeMillis()));
        Category category = categoryDao.findOneByCode(news.getCategoryCode());
        news.setCatgoryId(category.getId());
        Long newsId = newDao.save(news);
        System.out.println(newsId);
        return newDao.findOne(newsId);
    }

    @Override
    public News update(News news) {

        News oldNews = newDao.findOne(news.getId());
        news.setCreateDate(oldNews.getCreateDate());
        news.setCreatedBy(oldNews.getCreatedBy());
        Category category = categoryDao.findOneByCode(news.getCategoryCode());
        news.setModifiedDate(new Timestamp(System.currentTimeMillis()));
        news.setCatgoryId(category.getId());
        newDao.update(news);
        return newDao.findOne(news.getId());
    }


    @Override
    public List<News> findAllNews() {

        return newDao.findAllNews();
    }

    @Override
    public List<News> findNBy(String filed, Object... objects) {

        return newDao.findNBy(filed, objects);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
        
            newDao.delete(id);
        }
    }

    @Override
    public News findOne(Long id) {
        News news = newDao.findOne(id);
        Category category = categoryDao.findOne(news.getCatgoryId());
        news.setCategoryCode(category.getCode());
        return news;
    }

    @Override
    public int getTotalItem() {
        return newDao.getTotalItem();
    }


}
