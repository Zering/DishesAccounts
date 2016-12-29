package dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.dao.TodayPlanDao;
import com.app.dto.MenuDetail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class TodayPlanDaoTest {

	@Autowired
	private TodayPlanDao dao;
	@Test
	public void getTodayPlans() {
		List<MenuDetail> menuDetails = dao.getTodayPlans();
		System.out.println(menuDetails.size());
		System.out.println(menuDetails);
	}
	
}
