/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.amazonaws.util.StringUtils;

/**
 * @deprecated Replaced by {@link StandardBeanProperties}
 */
@Deprecated
class ReflectionUtils {

    /**
     * Returns the field name that corresponds to the given getter method,
     * according to the Java naming convention.
     *
     * @param getter
     *            The getter method.
     * @param forceCamelCase
     *            True if the returned field name should be in camel-case, i.e.
     *            the first letter is lower-cased.
     */
    static String getFieldNameByGetter(Method getter, boolean forceCamelCase) {
        String getterName = getter.getName();

        String fieldNameWithUpperCamelCase = "";
        if ( getterName.startsWith("get") ) {
            fieldNameWithUpperCamelCase = getterName.substring("get".length());
        } else if ( getterName.startsWith("is") ) {
            fieldNameWithUpperCamelCase = getterName.substring("is".length());
        }

        if (fieldNameWithUpperCamelCase.length() == 0) {
            throw new DynamoDBMappingException(
                    "Getter must begin with 'get' or 'is', and the field name must contain at least one character.");
        }

        if (forceCamelCase) {
            // Lowercase the first letter of the name
            return StringUtils.lowerCase(fieldNameWithUpperCamelCase.substring(0, 1)) + fieldNameWithUpperCamelCase.substring(1);
        } else {
            return fieldNameWithUpperCamelCase;
        }

    }

    /**
     * Returns the Field object for the specified field name declared in the
     * specified class. Returns null if no such field can be found.
     *
     * @param clazz
     *            The declaring class where the field will be reflected. This
     *            method will NOT attempt to reflect its superclass if such
     *            field is not found in this class.
     * @param fieldName
     *            The case-sensitive name of the field to be searched.
     */
    static Field getClassFieldByName(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (SecurityException e) {
            throw new DynamoDBMappingException(
                    "Denied access to the [" + fieldName + "] field in class [" + clazz + "].", e);
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    /**
     * This method searches for a specific type of annotation that is applied to
     * either the specified getter method or its corresponding class field.
     * Returns the annotation if it is found, else null.
     */
    static <T extends Annotation> T getAnnotationFromGetterOrField(
            Method getter, Class<T> annotationClass) {
        // Check annotation on the getter method
        T onGetter = getter.getAnnotation(annotationClass);
        if (onGetter != null) {
            return onGetter;
        }

        // Check annotation on the corresponding field
        String fieldName = getFieldNameByGetter(getter, true);
        // Only consider the field declared in the same class where getter is defined.
        Field field = getClassFieldByName(getter.getDeclaringClass(), fieldName);
        T onField = null;
        if (field != null) {
            onField = field.getAnnotation(annotationClass);
        }
        return onField;
    }

    /**
     * Returns true if an annotation for the specified type is found on the
     * getter method or its corresponding class field.
     */
    static <T extends Annotation> boolean getterOrFieldHasAnnotation(
            Method getter, Class<T> annotationClass) {
        return getAnnotationFromGetterOrField(getter, annotationClass) != null;
    }

}
