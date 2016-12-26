package com.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.app.dao.DishesDao;
import com.app.entity.Dishes;
import com.app.service.DishesServiceI;

@Service
public class DishesServiceImpl implements DishesServiceI {
	
	private static Logger logger = LoggerFactory.getLogger(DishesServiceImpl.class);

	@Resource
	DishesDao dishesDao;
	
	@Override
	public int insertDish(Dishes dishes) {
		logger.info("添加Dishes：{}",dishes);
		return dishesDao.insertDish(dishes);
	}

	@Override
	public List<Dishes> queryDishesList() {
		List<Dishes> dishes = dishesDao.queryDishesList();
		logger.info("查询Dishes：{}",dishes);
		return dishes;
	}

}
