/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.FieldMap;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.TableMap;
import com.amazonaws.util.StringUtils;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 */
@SdkInternalApi
final class StandardBeanProperties {

    /**
     * Returns the bean mappings for a given class (caches the results).
     */
    @SuppressWarnings("unchecked")
    static final <T> Beans<T> of(Class<T> clazz) {
        return ((CachedBeans<T>)CachedBeans.CACHE).getBeans(clazz);
    }

    /**
     * Cache of {@link Beans} by class type.
     */
    private static final class CachedBeans<T> {
        private static final CachedBeans<Object> CACHE = new CachedBeans<Object>();
        private final ConcurrentMap<Class<T>,Beans<T>> cache = new ConcurrentHashMap<Class<T>,Beans<T>>();

        private final Beans<T> getBeans(Class<T> clazz) {
            if (!cache.containsKey(clazz)) {
                final TableMap<T> annotations = StandardAnnotationMaps.<T>of(clazz);
                final BeanMap<T,Object> map = new BeanMap<T,Object>(clazz, false);
                cache.putIfAbsent(clazz, new Beans<T>(annotations, map));
            }
            return cache.get(clazz);
        }
    }

    /**
     * Cache of {@link Bean} mappings by class type.
     */
    static final class Beans<T> {
        private final DynamoDBMapperTableModel.Properties<T> properties;
        private final Map<String,Bean<T,Object>> map;

        private Beans(TableMap<T> annotations, Map<String,Bean<T,Object>> map) {
            this.properties = new DynamoDBMapperTableModel.Properties.Immutable<T>(annotations);
            this.map = Collections.unmodifiableMap(map);
        }

        final DynamoDBMapperTableModel.Properties<T> properties() {
            return this.properties;
        }

        final Map<String,Bean<T,Object>> map() {
            return this.map;
        }
    }

    /**
     * Holds the reflection bean properties for a given property.
     */
    static final class Bean<T,V> {
        private final DynamoDBMapperFieldModel.Properties<V> properties;
        private final ConvertibleType<V> type;
        private final Reflect<T,V> reflect;

        private Bean(FieldMap<V> annotations, Reflect<T,V> reflect, Method getter) {
            this.properties = new DynamoDBMapperFieldModel.Properties.Immutable<V>(annotations);
            this.type = ConvertibleType.<V>of(getter, annotations);
            this.reflect = reflect;
        }

        final DynamoDBMapperFieldModel.Properties<V> properties() {
            return this.properties;
        }

        final ConvertibleType<V> type() {
            return this.type;
        }

        final Reflect<T,V> reflect() {
            return this.reflect;
        }
    }

    /**
     * Get/set reflection operations.
     */
    static final class MethodReflect<T,V> implements Reflect<T,V> {
        private final Method getter, setter;

        private MethodReflect(Method getter) {
            this.setter = setterOf(getter);
            this.getter = getter;
        }

        @Override
        public V get(T object) {
            try {
                return (V)getter.invoke(object);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not invoke " + getter + " on " + object.getClass(), e);
            }
        }

        @Override
        public void set(T object, V value) {
            try {
                setter.invoke(object, value);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not invoke " + setter + " on " + object.getClass() +
                    " with value " + value + " of type " + (value == null ? null : value.getClass()), e);
            }
        }

        static Method setterOf(Method getter) {
            try {
                final String name = "set" + getter.getName().replaceFirst("^(get|is)","");
                return getter.getDeclaringClass().getMethod(name, getter.getReturnType());
            } catch (final Exception no) {}
            return null;
        }
    }

    /**
     * Get/set reflection operations with a declaring property.
     */
    static final class DeclaringReflect<T,V> implements Reflect<T,V> {
        private final Reflect<T,V> reflect;
        private final Reflect<T,T> declaring;
        private final Class<T> targetType;

        private DeclaringReflect(Method getter, Reflect<T,T> declaring, Class<T> targetType) {
            this.reflect = new MethodReflect<T,V>(getter);
            this.declaring = declaring;
            this.targetType = targetType;
        }

        @Override
        public V get(T object) {
            final T declaringObject = declaring.get(object);
            if (declaringObject == null) {
                return null;
            }
            return reflect.get(declaringObject);
        }

        @Override
        public void set(T object, V value) {
            T declaringObject = declaring.get(object);
            if (declaringObject == null) {
                declaring.set(object, (declaringObject = newInstance(targetType)));
            }
            reflect.set(declaringObject, value);
        }

        static <T> T newInstance(Class<T> targetType) {
            try {
                return targetType.newInstance();
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not instantiate " + targetType, e);
            }
        }
    }

    /**
     * {@link Map} of {@link Bean}
     */
    static final class BeanMap<T,V> extends LinkedHashMap<String,Bean<T,V>> {
        private final Class<T> clazz;

        BeanMap(Class<T> clazz, boolean inherited) {
            this.clazz = clazz;
            putAll(clazz, inherited);
        }

        private void putAll(Class<T> clazz, boolean inherited) {
            for (final Method method : clazz.getMethods()) {
                if (canMap(method, inherited)) {
                    final FieldMap<V> annotations = StandardAnnotationMaps.<V>of(method, null);
                    if (!annotations.ignored()) {
                        final Reflect<T,V> reflect = new MethodReflect<T,V>(method);
                        putOrFlatten(annotations, reflect, method);
                    }
                }
            }
        }

        private void putOrFlatten(FieldMap<V> annotations, Reflect<T,V> reflect, Method getter) {
            if (annotations.flattened()) {
                flatten((Class<T>)annotations.targetType(), annotations.attributes(), (Reflect<T,T>)reflect);
            } else {
                final Bean<T,V> bean = new Bean<T,V>(annotations, reflect, getter);
                if (put(bean.properties().attributeName(), bean) != null) {
                    throw new DynamoDBMappingException("duplicate attribute name " + bean.properties().attributeName());
                }
            }
        }

        private void flatten(Class<T> targetType, Map<String,String> attributes, Reflect<T,T> declaring) {
            for (final Method method : targetType.getMethods()) {
                if (canMap(method, true)) {
                    String name = fieldNameOf(method);
                    if ((name = attributes.remove(name)) == null) {
                        continue;
                    }
                    final FieldMap<V> annotations = StandardAnnotationMaps.<V>of(method, name);
                    if (!annotations.ignored()) {
                        final Reflect<T,V> reflect = new DeclaringReflect<T,V>(method, declaring, targetType);
                        putOrFlatten(annotations, reflect, method);
                    }
                }
            }
            if (!attributes.isEmpty()) { //<- this should be empty by now
                throw new DynamoDBMappingException("contains unknown flattened attribute(s): " + attributes);
            }
        }

        private boolean canMap(Method method, boolean inherited) {
            if (method.getName().matches("^(get|is).+") == false) {
                return false;
            } else if (method.getParameterTypes().length != 0) {
                return false;
            } else if (method.isBridge() || method.isSynthetic()) {
                return false;
            } else if (method.getDeclaringClass() == Object.class) {
                return false;
            } else if (!inherited && method.getDeclaringClass() != this.clazz &&
                StandardAnnotationMaps.of(method.getDeclaringClass()).attributeType() == null) {
                return false;
            } else {
                return true;
            }
        }
    }

    /**
     * Gets the field name given the getter method.
     */
    static final String fieldNameOf(Method getter) {
        final String name = getter.getName().replaceFirst("^(get|is)","");
        return StringUtils.lowerCase(name.substring(0, 1)) + name.substring(1);
    }

}
