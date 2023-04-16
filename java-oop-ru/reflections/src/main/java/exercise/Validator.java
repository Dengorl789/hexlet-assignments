package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
	public static List<String> validate(Address address) {
		var validationList = new ArrayList<String>();
		Field[] fields = address.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			try {
				String value = (String) field.get(address);
				if (field.isAnnotationPresent(NotNull.class) && value == null) {
					validationList.add(field.getName());
				}
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
		return validationList;
	}

//	public static Map<String, List<String>> advancedValidate (Address address) {
//		Map<String, List<String>> validationMap = new HashMap<>();
//		Field[] fields = address.getClass().getDeclaredFields();
//		for (Field field : fields) {
//			field.setAccessible(true);
//			try {
//				String value = (String) field.get(address);
//				if (field.isAnnotationPresent(NotNull.class) && value == null) {
//					validationMap.put(field.getName(), List.of("can not be null"));
//				}
//				if (field.isAnnotationPresent(MinLength.class) && field.isAnnotationPresent(NotNull.class)) {
//					validationMap.put(field.getName(), List.of(
//							"length less than 5",
//							"can not be null"));
//				}
//			} catch (IllegalAccessException e) {
//				throw new RuntimeException(e);
//			}
//		}
//
//		return validationMap;
//	}
}
// END
