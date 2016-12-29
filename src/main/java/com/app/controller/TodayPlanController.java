package com.app.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.dto.MenuDetail;
import com.app.service.TodayPlanServiceI;

@Controller
public class TodayPlanController {
	
	private static Logger logger = LoggerFactory.getLogger(TodayPlanController.class);

	@Autowired
	private TodayPlanServiceI service;
	
	
	@RequestMapping(value = "/getTodayPlans", method = RequestMethod.POST)
	@ResponseBody
	public List<MenuDetail> getTodayPlans() {
		List<MenuDetail> menuDetails = service.getTodayPlans();
		logger.info("今日计划：{}", menuDetails);
		return menuDetails;
	}

	@RequestMapping(value = "insertTodayPlan", method = RequestMethod.POST)
	@ResponseBody
	public int insertTodayPlan(@Param(value = "menuId") int menuId) {
		System.out.println("insert menuId:" + menuId);
		return service.insertTodayPlan(menuId);
	}
}
