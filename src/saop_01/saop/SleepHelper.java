package saop_01.saop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice {

	   public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {  
	        System.out.println("˯��ǰҪ���·���");  
	    }  
	  
	    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {  
	        System.out.println("�𴲺�Ҫ���·���");  
	    }  
	  
	    
}
