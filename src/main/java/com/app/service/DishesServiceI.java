package com.app.service;

import java.util.List;

import com.app.entity.Dishes;

public interface DishesServiceI {
	int insertDish(Dishes dishes);
	
	List<Dishes> queryDishesList();
}
