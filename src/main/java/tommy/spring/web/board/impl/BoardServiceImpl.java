package tommy.spring.web.board.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tommy.spring.web.board.BoardService;
import tommy.spring.web.board.BoardVO;

@Service("boardService") // 비즈니스 로직 처리를 위해 어노테이션 추가
public class BoardServiceImpl implements BoardService {
	@Autowired

	private BoardDAOJPA boardDAO;
	
//	private BoardDAOMyBatis boardDAO;
//	private BoardDAOSpring boardDAO;
	public BoardServiceImpl() {

	}

	@Override
	public void updateBoard(BoardVO vo) {

		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {

		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {

		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {

		return boardDAO.getBoardList(vo);
	}

	@Override
	@Transactional
	public void insertBoard(BoardVO vo) {

		boardDAO.insertBoard(vo);
	}

}
