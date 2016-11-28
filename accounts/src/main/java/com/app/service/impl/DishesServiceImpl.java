package com.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.app.dao.DishesDao;
import com.app.entity.Dishes;
import com.app.service.DishesServiceI;

@Service
public class DishesServiceImpl implements DishesServiceI {

	@Resource
	DishesDao dishesDao;
	
	@Override
	public int insertDish(Dishes dishes) {
		return dishesDao.insertDish(dishes);
	}

	@Override
	public List<Dishes> queryDishesList() {
//		return dishesDao.queryDishesList(0,5);
		return dishesDao.queryDishesList();
	}

}
