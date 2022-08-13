package org.kgibank.anno;

public class MyData {

	@MyAnno
	public String defaultData;
	
	@MyAnno(value="이노테이션을 이용한 값")
	public String annoData;
}
