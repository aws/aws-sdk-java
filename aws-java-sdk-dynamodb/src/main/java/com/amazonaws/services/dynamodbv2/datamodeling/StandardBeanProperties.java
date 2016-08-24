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
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.FieldMap;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.TableMap;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardParameterTypes.ParamType;

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
     * Beans cache.
     */
    private static final ConcurrentMap<Class<?>,Beans<?>> CACHE = new ConcurrentHashMap<Class<?>,Beans<?>>();

    /**
     * Returns the bean mappings for a given class (caches the results).
     */
    static final <T> Beans<T> of(final Class<T> clazz) {
        if (!CACHE.containsKey(clazz)) {
            final Beans<T> beans = StandardBeanProperties.of(clazz, false);
            if (beans.annotations().typed() == false) {
                return beans; //<- don't cache un-modeled types
            }
            CACHE.putIfAbsent(clazz, beans);
        }
        return (Beans<T>)CACHE.get(clazz);
    }

    /**
     * Returns the bean mappings for a given class (does not cache).
     */
    static final <T> Beans<T> of(final Class<T> clazz, final boolean inherited) {
        return new Beans(StandardAnnotationMaps.of(clazz), map(clazz, inherited));
    }

    /**
     * Cache of {@link Bean} mappings by class type.
     */
    static final class Beans<T> extends DynamoDBMapperTableModel.Properties.Immutable<T> {
        private final Map<String,Bean<T,Object>> map;
        private final TableMap<T> annotations;

        /**
         * Constructs the bean mappings.
         */
        private Beans(final TableMap<T> annotations, final Map<String,Bean<T,Object>> map) {
            super(annotations);
            this.map = Collections.unmodifiableMap(map);
            this.annotations = annotations;
        }

        /**
         * Gets the annotations.
         */
        final TableMap<T> annotations() {
            return this.annotations;
        }

        /**
         * Gets the bean mappings.
         */
        final Map<String,Bean<T,Object>> map() {
            return this.map;
        }
    }

    /**
     * Holds the reflection bean properties for a given property.
     */
    static final class Bean<T,V> extends DynamoDBMapperFieldModel.Properties.Immutable<T,V> {
        private final FieldMap<T,V> annotations;
        private final Reflect<T,V> reflect;
        private final ParamType<V> type;
        private final Method getter;

        /**
         * Constructs an object property mapping for the specified method.
         */
        private Bean(final FieldMap<T,V> annotations, final Bean<T,T> declaring, final Method getter, final String name) {
            super(new DynamoDBMapperFieldModel.Properties.Buildable(annotations)
                .withId(new DynamoDBMapperFieldModel.Id(declaring.id(), name))
                .withAttributeName(name)
            );
            this.reflect = StandardMethodReflects.of(getter, declaring.reflect(), declaring.targetType());
            this.type = StandardParameterTypes.of(getter.getGenericReturnType());
            this.annotations = annotations;
            this.getter = getter;
        }

        /**
         * Constructs an object property mapping for the specified method.
         */
        private Bean(final FieldMap<T,V> annotations, final Method getter) {
            super(new DynamoDBMapperFieldModel.Properties.Buildable(annotations)
                .withId(new DynamoDBMapperFieldModel.Id(annotations.id(), annotations.attributeName()))
            );
            this.reflect = StandardMethodReflects.of(getter);
            this.type = StandardParameterTypes.of(getter.getGenericReturnType());
            this.annotations = annotations;
            this.getter = getter;
        }

        /**
         * Gets the annotations.
         */
        final FieldMap<T,V> annotations() {
            return this.annotations;
        }

        /**
         * Gets the property's value type.
         */
        final Reflect<T,V> reflect() {
            return this.reflect;
        }

        /**
         * Gets the parameter type.
         */
        final ParamType<V> type() {
            return this.type;
        }

        /**
         * Gets the getter method for this property.
         */
        @Deprecated
        final Method getter() {
            return this.getter;
        }
    }

    /**
     * Returns the bean mappings for a given class (does not cache).
     */
    private static final <T,V> Map<String,Bean<T,V>> map(final Class<T> clazz, final boolean inherited) {
        final Map<String,Bean<T,V>> map = new LinkedHashMap<String,Bean<T,V>>();
        for (final Method m : clazz.getMethods()) {
            if (isGetter(m) == false) {
                continue;
            } else if (!inherited && m.getDeclaringClass() != clazz && !StandardAnnotationMaps.of(m.getDeclaringClass()).typed()) {
                continue;
            }
            final FieldMap<T,V> annotations = StandardAnnotationMaps.of(clazz, m);
            if (annotations.ignored()) {
                continue;
            }
            flatten(new Bean(annotations, m), map);
        }
        return map;
    }

    /**
     * Flattens or adds the bean to the mapping.
     */
    private static final <T,V> void flatten(final Bean<T,V> bean, final Map<String,Bean<T,V>> map) {
        if (bean.annotations().flattened() == null) { //<- standard attribute
            if (map.put(bean.attributeName(), bean) != null) {
                throw new DynamoDBMappingException(bean.id().err("duplicate attribute name"));
            }
            return;
        }
        final Bean<T,T> declaring = (Bean<T,T>)bean; //<- cast to declaring type
        final Map<String,String> attributes = bean.annotations().attributes();
        for (final Method m : declaring.targetType().getMethods()) {
            if (isGetter(m) == false) {
                continue;
            }
            final FieldMap<T,V> annotations = StandardAnnotationMaps.of(declaring.targetType(), m);
            String name = annotations.attributeName();
            if (annotations.ignored() || (name = attributes.remove(name)) == null) {
                continue;
            }
            flatten(new Bean(annotations, declaring, m, name), map);
        }
        if (!attributes.isEmpty()) { //<- this should be empty by now
            throw new DynamoDBMappingException(bean.id().err("contains unknown flattened attribute(s): " + attributes));
        }
    }

    /**
     * Returns true if the method is a valid getter property.
     */
    private static final boolean isGetter(final Method method) {
        if (method.getName().matches("^(get|is).+") == false) {
            return false;
        } else if (method.getParameterTypes().length != 0) {
            return false;
        } else if (method.getReturnType() == Void.TYPE) {
            return false;
        } else if (method.isBridge()) {
            return false;
        } else if (method.isSynthetic()) {
            return false;
        } else if (method.getDeclaringClass() == Object.class) {
            return false;
        } else {
            return true;
        }
    }

}
