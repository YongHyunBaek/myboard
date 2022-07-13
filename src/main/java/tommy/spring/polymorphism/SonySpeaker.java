package tommy.spring.polymorphism;

//import org.springframework.stereotype.Component;

//@Component("sony") //  어노테이션과xml설정 병행을 위하여 주석처리
//5 주석하면 Speaker 타입 객체 2개 SonySpeaker,AppleSpeaker 가 생성되는것을 막을 수 있음.
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
			System.out.println("===> SonySpeaker 객체 생성");
		}
		public void volumeUp() {
			System.out.println("SonySpeaker---소리 올린다.");
		}
		public void volumeDown() {
			System.out.println("SonySpeaker---소리 내린다.");
		}
	}

