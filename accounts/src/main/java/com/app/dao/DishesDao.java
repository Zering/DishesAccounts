package com.app.dao;

import java.util.List;

import com.app.entity.Dishes;

public interface DishesDao {
	int insertDish(Dishes dishes);
//	List<Dishes> queryDishesList(@Param("offset") int offset,@Param("limit") int limit);
	List<Dishes> queryDishesList();
}
