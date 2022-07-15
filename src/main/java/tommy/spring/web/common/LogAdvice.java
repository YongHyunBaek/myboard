package tommy.spring.web.common;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
@Aspect // Asepct = Pointcut + Advice
public class LogAdvice {
@Pointcut("execution(* tommy.spring.web..*Impl.*(..))")
		public void allPointcut() { //포인트컷
		}
		@Before("allPointcut()") //어드바이스
		public void printLog() {
				System.out.println("[공통 로그] : 비즈니스 로직 수행 전 동작");
		}
}
