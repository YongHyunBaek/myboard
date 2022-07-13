package tommy.spring.polymorphism;

//import org.springframework.stereotype.Component;

//@Component("apple") 어노테이션과xml설정 병행을 위하여 주석처리
//5 주석하면 Speaker 타입 객체 2개 SonySpeaker,AppleSpeaker 가 생성되는것을 막을 수 있음. 
public class AppleSpeaker implements Speaker {
		public AppleSpeaker() {
				System.out.println("AppleSpeaker 객체 생성");
		}
		@Override
		public void volumeUp() {
			System.out.println("AppleSpeaker -- 소리 올린다.");
		}
		@Override
		public void volumeDown() {
			System.out.println("AppleSpeaker -- 소리 내린다.");
		}

}
