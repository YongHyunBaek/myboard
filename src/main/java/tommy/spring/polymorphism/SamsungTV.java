package tommy.spring.polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price; // 다중 변수 매핑을 위하여 int price 추가

	public SamsungTV() {
		System.out.println("삼성TV 객체생성");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 메서드 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice() 메서드 호출");
		this.price = price;
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션");
		this.speaker = speaker;
	}

	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션 - 다중매핑");
		this.speaker = speaker;
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV 전원을 켠다. (가격 : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV 전원을 끈다.");
	}

	public void volumeUp() {
//		speaker= new SonySpeaker(); //1번예제 실행 후 삭제
		speaker.volumeUp();
	}

	public void volumeDown() {
//		speaker = new SonySpeaker();// 1번예제 실행 후 삭제
		speaker.volumeDown();
	}

}
