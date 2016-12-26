package dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.dao.MaterialDao;
import com.app.entity.Material;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-dao.xml"})
public class MaterialDaoTest {

	@Autowired
	private MaterialDao dao;
	
	@Test
	public void insertMaterials() {
		List<Material> materails = new ArrayList<>();
		Material materail1 = new Material();
		materail1.setMenuId(1003);
		materail1.setMaterialName("鸡翅");
		
		Material materail2 = new Material();
		materail2.setMenuId(1003);
		materail2.setMaterialName("可乐");
		
		Material materail3 = new Material();
		materail3.setMenuId(1003);
		materail3.setMaterialName("干辣椒");
		
		Material materail4 = new Material();
		materail4.setMenuId(1003);
		materail4.setMaterialName("老抽");
		
		materails.add(materail1);
		materails.add(materail2);
		materails.add(materail3);
		materails.add(materail4);
		
		dao.insertMaterails(materails);
	}
}
