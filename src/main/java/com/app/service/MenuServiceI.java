package com.app.service;

import java.util.List;

import com.app.dto.MenuDetail;

public interface MenuServiceI {

	int insertMenuAndMaterials(MenuDetail menuDetail);
	
	List<MenuDetail> getMenuDetails();
}
