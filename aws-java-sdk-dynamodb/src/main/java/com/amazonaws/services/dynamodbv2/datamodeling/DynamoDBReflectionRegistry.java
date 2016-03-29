/*
 * Copyright 2015-2016 Amazon Technologies, Inc.
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

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.amazonaws.annotation.SdkInternalApi;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 */
@SdkInternalApi
final class DynamoDBReflectionRegistry {

    /**
     * Gets the properties of a given class.
     * @param clazz The class.
     * @return The properties.
     */
    final Collection<BeanProperty> beanPropertiesOf(final Class<?> clazz) {
        final Collection<BeanProperty> beanProperties = new ArrayList<BeanProperty>();
        for (final Method method : clazz.getMethods()) {
            if (isBeanPropertyGetter(method)) {
                beanProperties.add(new BeanProperty(method));
            }
        }
        return beanProperties;
    }

    /**
     * Determines if a given method is a getter.
     * @param method The method.
     * @return Tue if a getter, false otehrwise.
     */
    private static final boolean isBeanPropertyGetter(final Method method) {
        if (!method.getName().startsWith("get") && !method.getName().startsWith("is")) {
            return false;
        } else if (method.getParameterTypes().length != 0) {
            return false;
        } else if (method.isBridge()) {
            return false;
        } else if (method.isSynthetic()) {
            return false;
        } else if (Object.class.equals(method.getDeclaringClass())) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Holds the reflection properties for a given property.
     */
    static final class BeanProperty {
        private final Method getter;
        private final Method setter;
        private final Field field;
        private final Class<?> getterType;
        private final Class<?> setterType;
        private final String fieldName;

        /**
         * Constructs an object property mapping for the specified method.
         * @param getterMethod The getter method.
         */
        private BeanProperty(final Method getterMethod) {
            this.getter = getterMethod;
            this.setter = ReflectionUtils.getDeclaredSetterByGetter(getGetter());
            this.fieldName = ReflectionUtils.getFieldNameByGetter(getGetter(), true);
            this.field = ReflectionUtils.getClassFieldByName(getDeclaringType(), getFieldName());
            this.getterType = getGetter().getReturnType();
            this.setterType = (setter == null || setter.getParameterTypes().length != 1 ? null : setter.getParameterTypes()[0]);
        }

        /**
         * Gets the getter method for this property.
         * @return The getter method.
         */
        final Method getGetter() {
            return getter;
        }

        /**
         * Gets the setter method for this property.
         * @return The getter method.
         */
        final Method getSetter() {
            if (setter == null) {
                throw new DynamoDBMappingException("No access to public, one-argument method called " +
                    "set" + ReflectionUtils.getFieldNameByGetter(getGetter(), false) +
                    " on class " + getDeclaringType());
            }
            return setter;
        }

        /**
         * Gets the field.
         * @return The field.
         */
        final Field getField() {
            return field;
        }

        /**
         * Gets the value type of the getter.
         * @return The value type.
         */
        final Class<?> getGetterType() {
            return getterType;
        }

        /**
         * Gets the value type of the setter.
         * @return The value type.
         */
        final Class<?> getSetterType() {
            return setterType;
        }

        /**
         * Gets the field name.
         * @return The field name.
         */
        final String getFieldName() {
            return fieldName;
        }

        /**
         * Gets the declaring type.
         * @return The declaring type.
         */
        final Class<?> getDeclaringType() {
            return getGetter().getDeclaringClass();
        }

        /**
         * Tries to get the property value from the object.
         * @param target The target object.
         * @return The property value.
         */
        final Object getValueOf(final Object target) {
            try {
                return getGetter().invoke(target);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("Could not invoke " + getter + " on " + (target == null ? null : target.getClass()), e);
            }
        }

        /**
         * Tries to set the property value on the object.
         * @param target The target object.
         * @param value The value.
         */
        final void setValueOf(final Object target, final Object value) {
            final Method method = getSetter();
            try {
                method.invoke(target, value);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("Could not invoke " + method + " on " + (target == null ? null : target.getClass()), e);
            }
        }
    }

}
