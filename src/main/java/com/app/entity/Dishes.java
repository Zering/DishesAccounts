package com.app.entity;

import java.util.Date;

public class Dishes {

	private int dishId;
	private String dishName;
	private float price;
	private Date createTime;

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Dishes [dishId=" + dishId + ", dishName=" + dishName + ", price=" + price + ", createTime=" + createTime
				+ "]";
	}

}
