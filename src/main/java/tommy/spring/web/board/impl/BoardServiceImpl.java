package tommy.spring.web.board.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tommy.spring.web.board.BoardService;
import tommy.spring.web.board.BoardVO;
@Service("boardService") //비즈니스 로직 처리를 위해 어노테이션 추가 
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;

//	private BoardDAOSpring boardDAO;
	public BoardServiceImpl() {
	
	}
//	@Override
//	public void insertBoard(BoardVO vo) {
////			if(vo.getSeq() == 0) {
////				throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
////			}
//			boardDAO.insertBoard(vo);
//			boardDAO.insertBoard(vo); // 1000번 글 등록 성공
//			boardDAO.insertBoard(vo); // Exception 발생 21~22 예제 실행 후 원상복구 주석 처리하기
//	}
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
	public void insertBoard(BoardVO vo) {
			
		  boardDAO.insertBoard(vo);
	}
	
}
