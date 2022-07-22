package tommy.spring.web.board;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import tommy.spring.web.board.impl.BoardDAO;

public class GetBoardListController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 목록 검색 처리");
		// 1. 사용자 입력 정보 추출 : 검색 기능은 나중에 구현
		// 2. 데이터베이스 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		// 3. 응답 화면 구성
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", boardList); // Model 정보저장
//		mav.setViewName("getBoardList.jsp"); // View 정보저장, view리졸버 실습을위해 주석처리
		mav.setViewName("getBoardList"); // View 정보저장
		return mav;
	}
}
