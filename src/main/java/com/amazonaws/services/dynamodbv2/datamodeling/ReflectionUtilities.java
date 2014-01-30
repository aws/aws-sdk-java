package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @author Danilo Valente - valente.danilo@gmail.com
 *
 */
class ReflectionUtilities {
	public static Field fieldByName(String name, Class<?> clazz){
		Field[] fields = clazz.getDeclaredFields();
		for (Integer i = 0; i < fields.length; i++){
			if (fields[i].getName().toLowerCase().equals(name.toLowerCase()))
				return fields[i];
		}
		return null;
	}
	
	public static Annotation annotationByType(Class<? extends Annotation> annotationType, Field field){
		Annotation[] annotations = field.getDeclaredAnnotations();
		for (Integer i = 0; i < annotations.length; i++){
			if (annotations[i].annotationType().equals(annotationType))
				return annotations[i];
		}
		return null;		
	}

	public static boolean getterHasAnnotation(Method getter, Class<? extends Annotation> annotation){
		String fieldName = "";
		if (getter.getName().startsWith("get"))
			fieldName = getter.getName().substring("get".length());
		else
			fieldName = getter.getName().substring("is".length());
		
		Field field = fieldByName(fieldName, getter.getDeclaringClass());
		return (getter.isAnnotationPresent(annotation) ||
				(field != null && annotationByType(annotation, field) != null));
	}
	
	static Annotation getGetterAnnotation(Method getter, Class<? extends Annotation> annotationClass){
		String fieldName = "";
		if (getter.getName().startsWith("get"))
			fieldName = getter.getName().substring("get".length());
		else
			fieldName = getter.getName().substring("is".length());
		
		Field field = fieldByName(fieldName, getter.getDeclaringClass());
		Annotation annotation = getter.getAnnotation(annotationClass);
		if (annotation == null){
			annotation = annotationByType(annotationClass, field); 
		}
		return annotation;
	}
}
