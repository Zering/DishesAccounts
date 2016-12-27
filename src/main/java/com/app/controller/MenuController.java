package com.app.controller;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.dto.MenuDetail;
import com.app.entity.Material;
import com.app.service.MenuServiceI;

@Controller
public class MenuController {
	
	private static Logger logger = LoggerFactory.getLogger(MenuController.class);

	@Autowired
	private MenuServiceI menuServiceI;

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String getMenuAndMaterials(Model model) {
		List<MenuDetail> menuDetails = menuServiceI.getMenuDetails();
		model.addAttribute("menues", menuDetails);
		return "menu";
	}

	@RequestMapping(value = "/insertMenu", method = RequestMethod.GET)
	public String skipToInsertMenu(Model model) {
		return "menuDetail";
	}

	@RequestMapping(value = "/insertMenu", method = RequestMethod.POST)
	public String insertMenuAndMaterials(MenuDetail menuDetail, Model model) {
		logger.info("传入的MenuDetail:{}",menuDetail);
		List<Material> materials = menuDetail.getMaterials();
		Iterator<Material> iterator = materials.iterator();
		while (iterator.hasNext()) {
			String materialName = iterator.next().getMaterialName();
			if (materialName == null 
					|| materialName.trim().isEmpty()) {
				iterator.remove();
			}
		}
		logger.info("记入数据库的MenuDetail:{}",menuDetail);
		menuServiceI.insertMenuAndMaterials(menuDetail);
		return "redirect:/menu";
	}
	
	
	@RequestMapping(value = "/getTodayPlans", method = RequestMethod.POST)
	@ResponseBody
	public List<MenuDetail> getTodayPlans() {
		List<MenuDetail> menuDetails = menuServiceI.getTodayPlans(); 
		logger.info("今日计划：{}",menuDetails);
		return menuDetails;
	}
}
