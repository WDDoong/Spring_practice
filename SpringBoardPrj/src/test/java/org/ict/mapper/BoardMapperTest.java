package org.ict.mapper;

import org.ict.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	// 변수 선언 후 자동 주입
	@Autowired
	private BoardMapper boardMapper;
	
	// 테스트 메서드
	// @Test
	public void testGetList() {
		log.info(boardMapper.getList());
	}
	
	// insert를 실행할 테스트 코드
	//@Test
	public void testInsert() {
		// 글 입력을 위해서 BoardVO 타입을 매개로 사용함
		// 따라서 BoardVO를 만들어놓고
		// setter로 글 제목, 글 본문, 글쓴이 만 저장해둔채로
		// mapper.insert(vo);를 호출해서 실행여부를 확인하면 됨.
		
		// 위 설명을 토대로 아래 vo에 6번글에 대한 제목 본문 글쓴이를 넣고
		// 호출한다음 실제로 DB에 글이 들어갔는지 확인합니다.
		BoardVO vo = new BoardVO();
		vo.setTitle("새 글");
		vo.setContent("새글");
		vo.setWriter("새 글쓴이");
		
		boardMapper.insert(vo);
	
	}
	
	@Test
	public void testSelect() {
		boardMapper.select(6L);
	}
	
	

}
