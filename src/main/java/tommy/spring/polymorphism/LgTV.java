package tommy.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")

public class LgTV implements TV {
	@Autowired 
//	@Qualifier("apple") //10 번줄이 없을경우
	//org.springframework.beans.factory.NoUniqueBeanDefinitionException 오류 발생
	//9~10번 예제 실습 완료후 주석처리
//	@Resource(name="apple") // 객체의 이름을 이용하여 의존성 주입 처리 11,12의 결과와 
	//동일하면 주석처리
	private Speaker speaker;
	public LgTV() {
		System.out.println("LgTV 객체 생성");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
		public void volumeDown() {
		speaker.volumeDown();
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTv 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV 전원을 끈다.");
	}
	
}
