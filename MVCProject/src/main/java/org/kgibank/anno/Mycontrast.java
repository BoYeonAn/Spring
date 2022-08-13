package org.kgibank.anno;

import java.lang.reflect.Field;

public class Mycontrast {

	
	private <T> T runAnnotation(T obj)throws IllegalArgumentException, IllegalAccessException{
		
		Field[] fields = obj.getClass().getDeclaredFields();
		for(Field field : fields) {
			MyAnno anno = field.getAnnotation(MyAnno.class);
			if(anno != null && field.getType()==String.class) {
				field.setAccessible(true);
				field.set(obj, anno.value());
			}
		}
		return obj;
	}
	
	public <T> T getBean(Class c)throws InstantiationException, IllegalAccessException{
	T obj = (T)c.newInstance();
	obj = runAnnotation(obj);
	return obj;
}
}
