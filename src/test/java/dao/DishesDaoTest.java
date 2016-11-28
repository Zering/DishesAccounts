package dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.dao.DishesDao;
import com.app.entity.Dishes;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml"})
public class DishesDaoTest {

	@Resource
	DishesDao dao;
	
	@Test
	public void insertDishes() {
		Dishes dishes = new Dishes();
		dishes.setDishName("白菜");
		dishes.setPrice(4.4f);
		int result = dao.insertDish(dishes);
		System.out.println(result);
	}
}
