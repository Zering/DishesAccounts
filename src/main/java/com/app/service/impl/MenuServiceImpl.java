package com.app.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.MaterialDao;
import com.app.dao.MenuDao;
import com.app.dto.MenuDetail;
import com.app.entity.Material;
import com.app.entity.Menu;
import com.app.service.MenuServiceI;

@Service
public class MenuServiceImpl implements MenuServiceI {
	
	private static Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);

	@Autowired
	private MenuDao menuDao;
	
	@Autowired
	private MaterialDao materialDao;

	
	@Override
	@Transactional
	public int insertMenuAndMaterials(MenuDetail menuDetail) {
		
		Menu menu = menuDetail.getMenu();
		int insertMenuResult = menuDao.insertMenuGetId(menu);
		List<Material> materails = menuDetail.getMaterials();
		if (insertMenuResult == 1) {
			int menuId = menu.getMenuId();
			for (Material materail : materails) {
				materail.setMenuId(menuId);
			}
			int insertMaterialsResult = materialDao.insertMaterails(materails);
			logger.info("insert menu:{}",menu);
			logger.info("insert materials:{}",materails);
			return insertMaterialsResult;
		}
		
		logger.error("insert menu defailed:{}",menu);
		logger.error("insert materials defailed:{}",materails);
		return 0;
	}


	@Override
	public List<MenuDetail> getMenuDetails() {
		List<MenuDetail> menuDetails = menuDao.getMenuDetails();
		logger.info("getMenuDetails:{}",menuDetails);
		return menuDetails;
	}

}
