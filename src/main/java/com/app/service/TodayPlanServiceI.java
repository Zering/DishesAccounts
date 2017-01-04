package com.app.service;

import java.util.List;

import com.app.dto.InsertResult;
import com.app.dto.MenuDetail;

public interface TodayPlanServiceI {

	InsertResult<String> insertTodayPlan(int menuId);
	
	List<MenuDetail> getTodayPlans();
}
