package tommy.spring.web.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tommy.spring.web.user.UserService;
import tommy.spring.web.user.UserVO;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
// 어노테이션 예제 실행시 코드는 변경된것 없고 8번 @Service("userService")와 10번 @Autowired만 추가함
// 그리고 UserDAO 클래스에 관련 어노테이션 추가.
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
			this.userDAO = userDAO;
	}
	@Override
	public UserVO getUser(UserVO vo) {
			return userDAO.getUser(vo);
	}

}
