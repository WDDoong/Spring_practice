package org.ict.dao;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


// 마이바티스 사용을 위한 코드

// 의존성 주입으로 생성한 Connection pool관련 변수를 가져오기 위해서
// root-context.xml의 위치를 지정해줍니다.
@RunWith(SpringJUnit4ClassRunner.class)
// Beans Graph 내부에 설정되어있는 dataSource를 쓰기 위해 위치 설정
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MybatisTest {
	
	// Connection => OJDBC
	// DataSource = Hikari CP
	// SqlSessionFactory => Mybatis
	
	
	
	// 자동 주입(ContextConfiguration에 설정된 공장 주소에서 맞는 자료형을 넣어줌)
	
	// 메서드 내부에서 DB접속에 필요한 최소한의 변수만 생성해놓고
	// 연결 여부만 확인하기 때문에 서버를 켜고 끌 필요가 없습니다.
	
	// @Autowired는 변수/생성자에 일일이 붙여주어야 합니다.
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testMyBatis() {
		try (SqlSession session = sqlSessionFactory.openSession();
		Connection con = session.getConnection();){
			log.info(session);
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}



