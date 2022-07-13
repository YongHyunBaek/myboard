package tommy.spring.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
@SuppressWarnings("deprecation")
public class MyLifeBeanMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
//ApplicaionContext 인페를 사용 라이프사이클 예제를 위해 9~12,19 주석		
//			FileSystemResource resource = 
//					new FileSystemResource("src/main/resources/applicationContext.xml");
//			XmlBeanFactory factory = new XmlBeanFactory(resource);
//			factory.addBeanPostProcessor(new CustomBeanPostProcessor());
// ApplicationContext는 BeanPostProcessor를 자동으로 읽어 들인다.따라서 앞 예제의
// CustomBeanPostProcessor클래스의 addBeanPostProcessor() 메소드 코드를 삭제
// 하고 대신에 설정파일에 CustomBeanPostProcessor를 빈으로 등록한다.		    
			MyLifeBean bean = (MyLifeBean) factory.getBean("myLifeBean");
			bean.sayHello();
//			factory.destroyBean("myLifeBean", bean); ApplicaionContext  실습을위해 주석
			factory.close();
		}
}

