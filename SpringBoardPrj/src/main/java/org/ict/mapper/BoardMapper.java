package org.ict.mapper;

import java.util.List;

import org.ict.domain.BoardVO;

public interface BoardMapper {
	
	// board_tb1에서 글번호 3번 이하만 조회하는 쿼리문을
	// 어노테이션을 이용해 작성해주세요.
	// @Select("SELECT * FROM board_tb1 WHERE bno <= 3")
	public List<BoardVO> getList();
	
	// insert구문 실행용으로 메서드를 선언합니다.
	// VO내부에 적혀있는 정보를 이용해 insert를 합니다.
	public void insert(BoardVO vo);

	// 글 번호 (Long bno)를 파라미터로 받아
	// 해당 글 번호에 해당하는 글을 리턴해 보여주는 메서드를 작성해주세요.
	// 메서드 이름은 select입니다.
	// xml파일에 쿼리문도 작성해보겠습니다.
	public BoardVO select(Long bno);
}
