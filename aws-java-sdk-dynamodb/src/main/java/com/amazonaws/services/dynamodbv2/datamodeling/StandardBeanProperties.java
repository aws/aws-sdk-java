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
     * @param clazz The class.
     * @return The bean properties.
     */
    static final <T,V> Map<String,Bean<T,V>> of(final Class<T> clazz) {
        final Map<String,Bean<T,V>> map = new LinkedHashMap<String,Bean<T,V>>();
        for (final Method m : ReflectionUtils.getters(clazz)) {
            if (m.getDeclaringClass() != clazz) {
                final AnnotationMap annotations =  StandardAnnotationMaps.of(m.getDeclaringClass());
                if (annotations.table() == null && annotations.document() == null) {
                    continue;
                }
            }
            final String name = ReflectionUtils.getFieldNameByGetter(m, true);
            final Bean<T,V> bean = new Bean(m, new MethodReflect(m));
            flatten(bean, bean.annotations.attributeName(name), map);
        }
        return map;
    }

    /**
     * Flattens or adds the bean to the mapping.
     * @param bean The bean property.
     * @param name The attribute name override.
     * @param map The bean mappings.
     */
    private static <T,V> void flatten(Bean<T,V> bean, String name, final Map<String,Bean<T,V>> map) {
        if (bean.annotations.ignored()) {
            return;
        } else if (bean.annotations.flattened() != null) {
            final Map<String,String> attributes = bean.annotations.attributes();
            final Reflect<T,T> declaring = (Reflect<T,T>)bean.reflect;
            for (final Method m : ReflectionUtils.getters(bean.reflect.valueType())) {
                name = ReflectionUtils.getFieldNameByGetter(m, true);
                if ((name = attributes.remove(name)) != null) {
                    bean = new Bean(m, new DeclaringMethodReflect(m, declaring));
                    flatten(bean, name, map);
                }
            }
            if (!attributes.isEmpty()) { //<- this should be empty by now
                throw new DynamoDBMappingException("contains unknown flattened attribute(s): " + attributes);
            }
        } else if (map.put(name, bean) != null) {
            throw new DynamoDBMappingException("must not duplicate attribute named " + name);
        } else if (bean.annotations.keyType() != null && bean.getGenerateStrategy() == DynamoDBAutoGenerateStrategy.ALWAYS) {
            throw new DynamoDBMappingException("must not have auto-generated key with ALWAYS strategy");
        }
    }

    /**
     * Holds the reflection bean properties for a given property.
     */
    static final class Bean<T,V> implements DynamoDBAutoGenerator<V>, Reflect<T,V> {
        private final DynamoDBAutoGenerator<V> generator;
        private final MethodReflect<T,V> reflect;
        private final AnnotationMap annotations;

        /**
         * Constructs an object property mapping for the specified method.
         * @param getter The getter method.
         * @param reflect The reflection property.
         */
        private Bean(final Method getter, final MethodReflect<T,V> reflect) {
            this.annotations = StandardAnnotationMaps.of(getter, ReflectionUtils.getDeclaredFieldByGetter(getter));
            this.generator = annotations.autoGenerator(reflect.valueType());
            this.reflect = reflect;
        }

        /**
         * Gets the annotations map.
         * @return The annotations map.
         */
        final AnnotationMap annotations() {
            return this.annotations;
        }

        /**
         * Gets the property's value type.
         * @return The value type.
         */
        final Reflect<T,V> reflect() {
            return this.reflect;
        }

        /**
         * Gets the getter method for this property.
         * @return The getter method.
         */
        final Method getter() {
            return reflect.getter;
        }

        /**
         * Gets the setter method for this property.
         * @return The setter method.
         */
        final Method setter() {
            if (reflect.setter == null) {
                throw new DynamoDBMappingException("no access to public/one-argument setter for " + reflect.getter);
            }
            return reflect.setter;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public Class<V> valueType() {
            return reflect.valueType();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public V get(final T object) {
            return reflect.get(object);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void set(final T object, final V value) {
            reflect.set(object, value);
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
     * Get/set reflection operations.
     * @param <T> The object type.
     * @param <V> The value type.
     */
    static interface Reflect<T,V> {
        /**
         * Gets the property's value type.
         * @return The value type.
         */
        public Class<V> valueType();

        /**
         * Gets the value from the object instance.
         * @param object The object instance.
         * @return The value.
         */
        public V get(T object);

        /**
         * Sets the value on the object instance.
         * @param object The object instance.
         * @param value The value.
         */
        public void set(T object, V value);
    }

    /**
     * Get/set reflection operations.
     */
    private static class MethodReflect<T,V> implements Reflect<T,V> {
        private final Method getter, setter;
        private MethodReflect(final Method getter) {
            this.setter = ReflectionUtils.getDeclaredSetterByGetter(getter);
            this.getter = getter;
        }
        @Override
        public Class<V> valueType() {
            return (Class<V>)getter.getReturnType();
        }
        @Override
        public V get(final T object) {
            try {
                return (V)getter.invoke(object);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not invoke " + getter + " on " + object.getClass(), e);
            }
        }
        @Override
        public void set(T object, final V value) {
            try {
                setter.invoke(object, value);
            } catch (final Exception e) {
                if (setter == null) {
                    throw new DynamoDBMappingException("no access to public/one-argument setter for " + getter);
                }
                throw new DynamoDBMappingException("could not invoke " + setter + " on " + object.getClass(), e);
            }
        }
    }

    /**
     * Get/set reflection operations with a declaring property.
     */
    private static class DeclaringMethodReflect<T,V> extends MethodReflect<T,V> {
        private final Reflect<T,T> declaring;

        private DeclaringMethodReflect(final Method getter, final Reflect<T,T> declaring) {
            super(getter);
            this.declaring = declaring;
        }

        @Override
        public V get(final T object) {
            final T declaringObject = declaring.get(object);
            if (declaringObject == null) {
                return null;
            }
            return super.get(declaringObject);
        }

        @Override
        public void set(final T object, final V value) {
            T declaringObject = declaring.get(object);
            if (declaringObject == null) {
                try {
                    declaringObject = declaring.valueType().newInstance();
                } catch (final Exception e) {
                    throw new DynamoDBMappingException("could not instantiate " + declaring.valueType(), e);
                }
                declaring.set(object, declaringObject);
            }
            super.set(declaringObject, value);
        }
    }

}
