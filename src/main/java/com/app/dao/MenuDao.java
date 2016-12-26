package com.app.dao;

import java.util.List;

import com.app.dto.MenuDetail;
import com.app.entity.Menu;

public interface MenuDao {

	//返回自增的menu_id
	int insertMenuGetId(Menu menu);
	
	List<MenuDetail> getMenuDetails();
}
