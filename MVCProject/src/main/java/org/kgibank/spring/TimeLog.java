package org.kgibank.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.Signature;

@Component
@Aspect
public class TimeLog {
	
		@Around(value="within(org.kgitbank.spring.HelloService)")
		public Object trace(ProceedingJoinPoint joinPoint)throws Throwable{
			Signature s = joinPoint.getSignature();
			String methodName = s.getName();
			System.out.println("[Log]Info->"+methodName+" : time check start");
			long startTime = System.nanoTime();
			Object result=null;
			try {
				result = joinPoint.proceed();
				
			}catch(Exception e) {
				System.out.println("[Log]Error ->" +e.getMessage());
				
			}finally {
				System.out.println("[Log]Info ->" +methodName+"End.");
			}
		long endTime=System.nanoTime();
		System.out.println("[Log]Info ->" +methodName+": time check end.");
		System.out.println("[Log]TimeInfo ->" +methodName+": processing time is"+(endTime-startTime)+"ns");
		return result;
		}
		
	}

