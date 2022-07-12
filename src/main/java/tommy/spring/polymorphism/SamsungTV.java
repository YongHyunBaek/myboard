package tommy.spring.polymorphism;

public class SamsungTV implements TV{
	
	public SamsungTV() {
		System.out.println("삼성TV 객체생성"); 
	}
	
	public void start() {
		System.out.println("객체 초기화 작업 처리");
	}
	
	public void stop() {
		System.out.println("객체 삭제 전에 처리할 로직 처리");
	}
	//기존 메서드 생략하면 오류 발생.	
	public void powerOn() {
		System.out.println("SasmsungTV 전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("SasmsungTV 전원을 끈다.");
	}
	public void volumeUp() {
		System.out.println("SasmsungTV 볼륨을 올린다.");
	}
	public void volumeDown() {
		System.out.println("SasmsungTV 볼륨을 내린다.");
	}
}
