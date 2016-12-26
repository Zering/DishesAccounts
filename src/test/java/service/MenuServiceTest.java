package service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.dto.MenuDetail;
import com.app.entity.Material;
import com.app.entity.Menu;
import com.app.service.MenuServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class MenuServiceTest {
	
	private static Logger logger = LoggerFactory.getLogger(MenuServiceTest.class);

	@Autowired
	private MenuServiceI menuServiceI;
	
	@Test
	public void insertMenuAndMaterials() {
		Menu menu = new Menu();
		menu.setMenuName("小炒肉");
		
		List<Material> materials = new ArrayList<>();
		Material material1 = new Material();
		material1.setMaterialName("猪肉");
		
		Material material2 = new Material();
		material2.setMaterialName("尖椒");
		
		Material material3 = new Material();
		material3.setMaterialName("大葱");
		
		materials.add(material1);
		materials.add(material2);
		materials.add(material3);
		
		MenuDetail menuDetail = new MenuDetail();
		menuDetail.setMenu(menu);
		menuDetail.setMaterials(materials);
		
		menuServiceI.insertMenuAndMaterials(menuDetail);
		
		logger.info("添加菜单和用料：{}",menuDetail);
	}
}
