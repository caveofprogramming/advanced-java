package app;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Repository<T> {
	public void save(T t) {
		
		var clazz = t.getClass();
		
		var entities = clazz.getAnnotationsByType(Entity.class);
		
		var tableName = clazz.getSimpleName().toLowerCase();
		
		if(entities.length > 0) {
			tableName = entities[0].value();
		}
		
		System.out.println(tableName);
		
		var fields = clazz.getDeclaredFields();
		
		for(var field: fields) {
			var annotations = field.getAnnotationsByType(Field.class);
			
			if(annotations.length > 0) {
				System.out.println(field);
			}
		}
		
		// @formatter:off
		
		var fieldList = Arrays
			.stream(clazz.getDeclaredFields())
			.filter(f -> f.getAnnotationsByType(Field.class).length > 0)
			.collect(Collectors.toList());
		
		// @formatter:on
		
		System.out.println();
		
		System.out.println(fieldList);
	}
}
