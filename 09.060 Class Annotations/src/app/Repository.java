package app;

public class Repository<T> {
	public void save(T t) {

		var clazz = t.getClass();
		var classAnnotations = clazz.getAnnotationsByType(Entity.class);

		var tableName = clazz.getSimpleName().toLowerCase();

		if (classAnnotations.length > 0 && classAnnotations[0].value().length() > 0) {
			tableName = classAnnotations[0].value();
		}

		System.out.println(tableName);

		var fields = clazz.getDeclaredFields();

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

			System.out.println(fieldName + " " + isKey);
		}

	}
}
