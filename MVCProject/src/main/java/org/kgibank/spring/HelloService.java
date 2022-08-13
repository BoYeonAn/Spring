package org.kgibank.spring;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String sayHello(String name){
		return "안녕하세요"+name+"님.";
	}
}