package tommy.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import tommy.spring.web.user.impl.UserDAO;

public class LoginController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
		// 	1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// 2. 데이터베이스 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		// 	3. 화면 네비게이션
		ModelAndView mav = new ModelAndView();
		if (user != null) {
//				mav.setViewName("getBoardList.do");
			//ViewResolver 활용을위해 25번줄과 29번줄 주석처리 
				mav.setViewName("redirect:getBoardList.do");
		} else {
//				mav.setViewName("login.jsp");
				mav.setViewName("redirect:login.jsp");
		}
		return mav;
	}
}
