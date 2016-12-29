package com.app.service;

import java.util.List;

import com.app.dto.MenuDetail;

public interface TodayPlanServiceI {

	int insertTodayPlan(int menuId);
	
	List<MenuDetail> getTodayPlans();
}
