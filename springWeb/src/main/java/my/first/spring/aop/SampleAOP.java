package my.first.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAOP {
	
	@Pointcut("execution(* my.first.spring.controller.*.*(..))")
	private void test() {}
	
	@Before("test()")
	public void prepare() throws Throwable {
		System.out.println("AOP Å×½ºÆ®");
	}
	
}
