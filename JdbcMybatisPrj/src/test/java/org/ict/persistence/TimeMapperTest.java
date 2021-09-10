package org.ict.persistence;

import org.ict.mapper.TimeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTest {
	
	@Autowired
	private TimeMapper timeMapper;
	
	
	//@Test
	public void testGetTime() {
		log.info("현재 시간 조회중...");
		log.info(timeMapper.getTime());
	}
	
	//@Test
	public void testGetTime2() {
		log.info("getTime2가 얻어온 시간");
		log.info(timeMapper.getTime2());
	}
	
	// xml에서 연결된 쿼리문을 실제로 실행하여, 선언된 메서드를 최종적으로 동작시킨다. 
	@Test
	public void testGetTime3() {
		log.info("getTime3가 얻어온 시간");
		log.info(timeMapper.getTime3());
	}

}
