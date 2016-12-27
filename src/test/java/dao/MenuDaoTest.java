package dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.dao.MenuDao;
import com.app.dto.MenuDetail;
import com.app.entity.Menu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml"})
public class MenuDaoTest {

	@Autowired
	private MenuDao dao;
	
	@Test
	public void insertdao() {
		Menu menu = new Menu();
		menu.setMenuName("可乐鸡翅");
		dao.insertMenuGetId(menu);
		System.out.println(menu.getMenuId());
	}
	
	@Test
	public void getMenuDetails() {
		List<MenuDetail> menuDetails = dao.getMenuDetails();
		System.out.println(menuDetails);
	}
	
	@Test
	public void getTodayPlans() {
		List<MenuDetail> menuDetails = dao.getTodayPlans();
		System.out.println(menuDetails.size());
		System.out.println(menuDetails);
	}
}
