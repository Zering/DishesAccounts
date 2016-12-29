package com.app.dao;

import java.util.List;

import com.app.dto.MenuDetail;

public interface TodayPlanDao {

	int insertTodayPlan(int menuId);

	List<MenuDetail> getTodayPlans();
}
