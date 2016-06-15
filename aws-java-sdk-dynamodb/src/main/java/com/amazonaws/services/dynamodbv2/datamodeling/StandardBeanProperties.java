/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.AnnotationMap;
import com.amazonaws.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 */
@SdkInternalApi
final class StandardBeanProperties {

    /**
     * Gets the bean properties for a given class.
     * @param objectType The class.
     * @return The bean properties.
     */
    static final <T,V> Map<String,BeanProperty<T,V>> of(final Class<T> objectType) {
        return new Builder<T,V>(objectType).build();
    }

    /**
     * Holds the reflection bean properties for a given property.
     */
    static final class BeanProperty<T,V> implements DynamoDBAutoGenerator<V> {
        private final DynamoDBAutoGenerator<V> generator;
        private final AnnotationMap annotations;
        private final Method getter, setter;
        private final Field field;

        /**
         * Constructs an object property mapping for the specified method.
         * @param getter The getter method.
         * @param setter The setter method.
         * @param field The field.
         * @param annotations The annotations map.
         */
        private BeanProperty(final Method getter, final Method setter, final Field field, final AnnotationMap annotations) {
            this.getter = getter;
            this.setter = setter;
            this.field = field;
            this.annotations = annotations;
            this.generator = annotations.autoGenerator(valueType());
        }

        /**
         * Gets the annotations map.
         * @return The annotations map.
         */
        final AnnotationMap annotations() {
            return this.annotations;
        }

        /**
         * Gets the getter method for this property.
         * @return The getter method.
         */
        final Method getter() {
            return this.getter;
        }

        /**
         * Gets the setter method for this property.
         * @return The setter method.
         */
        final Method setter() {
            if (this.setter == null) {
                throw new DynamoDBMappingException("no access to public/one-argument setter for " + getter);
            }
            return this.setter;
        }

        /**
         * Gets the field for this property.
         * @return The field.
         */
        final Field field() {
            return this.field;
        }

        /**
         * Gets the property's value type.
         * @return The value type.
         */
        final Class<V> valueType() {
            return (Class<V>)getter().getReturnType();
        }

        /**
         * Gets the field value from the object instance.
         * @param object The object instance.
         * @return The field value.
         */
        final V get(T object) {
            try {
                return (V)getter().invoke(object);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not invoke " + getter + " on " + object.getClass(), e);
            }
        }

        /**
         * Sets the field value on the object instance.
         * @param object The object instance.
         * @param value The field value.
         */
        final void set(T object, final V value) {
            try {
                setter().invoke(object, value);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not invoke " + setter + " on " + object.getClass(), e);
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final DynamoDBAutoGenerateStrategy getGenerateStrategy() {
            return generator == null ? null : generator.getGenerateStrategy();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final V generate(final V currentValue) {
            return generator.generate(currentValue);
        }
    }

    /**
     * {@link Bean} iterator.
     */
    static final class Builder<T,V> {
        private final Map<String,BeanProperty<T,V>> map = new LinkedHashMap<String,BeanProperty<T,V>>();
        private final Class<T> objectType;

        /**
         * Constructs a new bean property iterator.
         * @param objectType The object type.
         */
        private Builder(final Class<T> objectType) {
            this.objectType = objectType;
        }

        /**
         * Builds the bean property mappings.
         * @param clazz The object type.
         */
        private void build(final Class<T> clazz) {
            for (final Method m : clazz.getMethods()) {
                if (!m.getName().startsWith("get") && !m.getName().startsWith("is")) {
                    continue;
                } else if (m.getReturnType() == Void.TYPE || m.getParameterTypes().length != 0) {
                    continue;
                } else if (m.isBridge() || m.isSynthetic()) {
                    continue;
                } else if (m.getDeclaringClass() == Object.class) {
                    continue;
                } else if (m.getDeclaringClass() != clazz) {
                    final AnnotationMap annotations = StandardAnnotationMaps.of(m.getDeclaringClass());
                    if (annotations.table() == null && annotations.document() == null) {
                        continue;
                    }
                }
                build(m);
            }
        }

        /**
         * Builds the bean property mapping.
         * @param getter The getter method.
         */
        private void build(final Method getter) {
            final String upper, lower;
            try {
                upper = getter.getName().substring((getter.getName().startsWith("is") ? "is" : "get").length());
                lower = StringUtils.lowerCase(upper.substring(0, 1)) + upper.substring(1);
            } catch (final RuntimeException e) {
                throw new DynamoDBMappingException("getter must begin with 'get' or 'is', and contain at least one character: " + getter, e);
            }

            Field field = null;
            try {
                field = getter.getDeclaringClass().getDeclaredField(lower);
            } catch (final SecurityException e) {
                throw new DynamoDBMappingException("no access to field for " + getter, e);
            } catch (final NoSuchFieldException no) {}

            final AnnotationMap annotations = StandardAnnotationMaps.of(getter, field);
            if (annotations.ignored()) {
                return;
            }

            Method setter = null;
            try {
                setter = getter.getDeclaringClass().getMethod("set" + upper, getter.getReturnType());
            } catch (final Exception no) {}

            final BeanProperty<T,V> bean = new BeanProperty(getter, setter, field, annotations);

            final String name = annotations.attributeName(lower);
            if (map.put(name, bean) != null) {
                throw new DynamoDBMappingException("must not duplicate attribute named " + name);
            }
        }

        /**
         * Builds the bean properties.
         * @return The built bean properties.
         */
        public Map<String,BeanProperty<T,V>> build() {
            build(this.objectType);
            return this.map;
        }
    }

}
