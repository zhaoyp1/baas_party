package baas_party;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.baas.party.bean.Individual;
import com.asiainfo.baas.party.dao.IndividualMapper;
import com.asiainfo.baas.party.util.CommonUtil;

@RunWith(SpringJUnit4ClassRunner.class)
// 整合
@ContextConfiguration(locations = "classpath:applicationContext.xml")
// 加载配置
public class TestIndividualDao {

	@Autowired
	private IndividualMapper mapper;

	@Test
	public void testCreateIndividual() {
		Individual individual = new Individual();
		individual.setIndividualId(CommonUtil.getGenerateId());
		individual.setBirthday(new Date());
		mapper.createIndividual(individual);

	}

	@Test
	public void testGetIndividualById() {
		Individual individual = new Individual();
		individual.setIndividualId("769190b1-b9c3-4d98-80e0-4da9c0b88078");
		individual.setBirthday(new Date());
		Individual ret = mapper.getIndividualById("769190b1-b9c3-4d98-80e0-4da9c0b88078");
		System.out.println(ret);
	}
	
	@Test
	public void testUpdateIndividual() {
		Individual individual = new Individual();
		individual.setIndividualId("769190b1-b9c3-4d98-80e0-4da9c0b88078");
		individual.setBirthday(new Date());
		
		individual.setSex("2");
		 mapper.updateIndividual(individual);
	}

}
