package com.app.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Dishes;
import com.app.service.DishesServiceI;

@Controller
public class DishesController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource
	private DishesServiceI dishesService;
	
	@RequestMapping(value="insert",method=RequestMethod.GET)
	public String insertPage(Dishes dishes,Model model) {
		return "detail";
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public String insertDish(Dishes dishes,Model model) {
		int result = dishesService.insertDish(dishes);
		if (result == 1) {
			logger.info("新增成功：{}",dishes);
		} else {
			logger.error("新增失败：{}",dishes);
		}
		return "redirect:/list";
	}
	
	@RequestMapping(value="list",method=RequestMethod.GET)
	public String queryDishesList(Model model) {
		List<Dishes> dishes = dishesService.queryDishesList();
		model.addAttribute("list", dishes);
		return "list";
	}
}
