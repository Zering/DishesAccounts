package com.app.constant;

public class InsertTodayPlanResult {

	private InsertTodayPlanResult() {
		throw new AssertionError("InsertTodayPlanResult is a Constant Class,"
				+ "you shouldn't instance it");
	}
	
	public static final String SUCCESS = "添加成功";
	public static final String REPEAT = "已经添加过计划，请不要重复添加";
	public static final String FAIL = "添加失败";
}
