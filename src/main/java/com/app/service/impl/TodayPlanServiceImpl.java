package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.constant.InsertTodayPlanResult;
import com.app.dao.TodayPlanDao;
import com.app.dto.InsertResult;
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
	
	/**
	 * 添加计划前，检查今天是否已经添加过
	 */
	@Override
	public InsertResult<String> insertTodayPlan(int menuId) {
		int checkTodayPlan = dao.checkTodayPlan(menuId);
		if (checkTodayPlan >= 1) {
			return new InsertResult<String>(false, InsertTodayPlanResult.REPEAT);
		} else {
			int insertTodayPlan = dao.insertTodayPlan(menuId);
			if (insertTodayPlan == 1) {
				return new InsertResult<String>(true, InsertTodayPlanResult.SUCCESS);
			}
		}
		return new InsertResult<String>(false, InsertTodayPlanResult.FAIL);
	}

}
