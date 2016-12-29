package com.app.dao;

import java.util.List;

import com.app.dto.MenuDetail;
import com.app.entity.Menu;

public interface MenuDao {

	//返回自增的menu_id,取用方法menu.getMenuId()
	int insertMenuGetId(Menu menu);
	
	List<MenuDetail> getMenuDetails();
	
}
