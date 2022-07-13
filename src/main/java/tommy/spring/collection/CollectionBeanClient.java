package tommy.spring.collection;

import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
//			List<String> addressList = bean.getAddressList();
//				for (String address : addressList) {
//					System.out.println(address.toString());
//		=====================================================>위에List실습 후 주석
//		Map<String, String> addressList = bean.getAddressList();
//		for( String key : addressList.keySet() ){
//		System.out.println(String.format("키 : %s, 값 : %s", key, addressList.get(key)) );
//		}
//		=====================================================>위에map실습 후 주석
//		Properties addressList = bean.getAddressList();
//			for( String key : addressList.stringPropertyNames() ){
//					System.out.println(String.format("키 : %s, 값 : %s", key, addressList.get(key)) );
//		}
//		결과 map 과 동일함
//		=====================================================>위에Properties실습 후 주석		
		Set<String> addressList = bean.getAddressList();
		for (String key : addressList) {
		System.out.println(key);
		}
		factory.close();
		
	}
}


