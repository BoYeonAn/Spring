package org.kgibank.anno;

public class AnnoMain {
	
	public static void main(String[] args)throws InstantiationException, IllegalAccessException {
		
		MyContext con= new MyContext();
		MyData data= con.getBean(MyData.class);
		System.out.println(data.annoData);
		System.out.println(data.defaultData);
	}
	
}
