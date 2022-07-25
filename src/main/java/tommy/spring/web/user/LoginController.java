package tommy.spring.web.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.web.servlet.mvc.Controller;
import tommy.spring.web.user.impl.UserDAO;

@Controller
public class LoginController {
//	@Override
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		vo.setId("test");
		vo.setPassword("test");
		return "login.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		System.out.println("로그인 인증 처리");
		UserVO user = userDAO.getUser(vo);
		// 1. 사용자 입력 정보 추출
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		// 2. 데이터베이스 연동 처리
//		UserVO vo = new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//		UserDAO userDAO = new UserDAO();
//		UserVO user = userDAO.getUser(vo);
//		// 	3. 화면 네비게이션
//		ModelAndView mav = new ModelAndView();
		if (user != null) {
			session.setAttribute("userName", user.getName());
//				mav.setViewName("getBoardList.do");
			// ViewResolver 활용을위해 25번줄과 29번줄 주석처리
//				mav.setViewName("redirect:getBoardList.do");
			return "getBoardList.do";
		} else {
//				mav.setViewName("login.jsp");
//				mav.setViewName("redirect:login.jsp");
			return "login.jsp";
		}
//		return mav;
	}
}
