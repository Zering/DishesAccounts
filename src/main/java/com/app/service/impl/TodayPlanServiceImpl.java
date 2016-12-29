package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.TodayPlanDao;
import com.app.dto.MenuDetail;
import com.app.service.TodayPlanServiceI;

@Service
public class TodayPlanServiceImpl implements TodayPlanServiceI {

	@Autowired
	private TodayPlanDao dao;
	

	@Override
	public List<MenuDetail> getTodayPlans() {
		return dao.getTodayPlans();
	}
	
	@Override
	public int insertTodayPlan(int menuId) {
		return dao.insertTodayPlan(menuId);
	}

}
