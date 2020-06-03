package app;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Repository<T> {
	public void save(T t) {

		var clazz = t.getClass();
		var classAnnotations = clazz.getAnnotationsByType(Entity.class);

		var tableName = clazz.getSimpleName().toLowerCase();

		if (classAnnotations.length > 0 && classAnnotations[0].value().length() > 0) {
			tableName = classAnnotations[0].value();
		}

		var fields = clazz.getDeclaredFields();

		ArrayList<String> fieldList = new ArrayList<>();

		for (var field : fields) {
			var annotations = field.getAnnotationsByType(Field.class);

			if (annotations.length == 0) {
				continue;
			}

			var annotation = annotations[0];

			var fieldName = annotation.columnName();
			var isKey = annotation.isKey();

			if (fieldName.length() == 0) {
				fieldName = field.getName();
			}

			if (!isKey) {
				fieldList.add(fieldName);
			}
		}

		String sqlFields = fieldList.stream().collect(Collectors.joining(","));
		String sqlPlaceholders = fieldList.stream().map(s -> "?").collect(Collectors.joining(","));

		String sql = String.format("insert into %s (%s) values (%s)", tableName, sqlFields, sqlPlaceholders);
		
		System.out.println(sql);

	}
}
