package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.News;

public interface INewsDao extends GenericDAO<News> {
	List<News>  findNByCategoryId(Long categoryId);
	List<News>  findAllNews();
	Long save(News news);
	void update(News news);
	void delete(Long id);
//	void deleteByCategoryId(Long id);
	List<News>  findNBy( String filed, Object... objects);
	News findOne(Long id);
	int getTotalItem();
}
