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
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Reflect;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.FieldMap;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardParameterTypes.ParamType;
import com.amazonaws.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Collection;
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
     * Gets the bean properties for a given class.
     * @param clazz The class.
     * @return The bean properties.
     */
    static final <T,V> Map<String,Bean<T,V>> of(final Class<T> clazz) {
        return ((Beans<T,V>)Beans.CACHE).of(clazz);
    }

    /**
     * Cache of {@link Bean} mappings by class type.
     */
    static final class Beans<T,V> {
        private static final Beans<?,?> CACHE = new Beans();
        private final ConcurrentMap<Class<T>,Map<String,Bean<T,V>>> cache = new ConcurrentHashMap<Class<T>,Map<String,Bean<T,V>>>();
        public final Map<String,Bean<T,V>> of(final Class<T> clazz) {
            if (!cache.containsKey(clazz)) {
                cache.putIfAbsent(clazz, new Builder(clazz, false).build());
            }
            return cache.get(clazz);
        }
    }

    /**
     * Holds the reflection bean properties for a given property.
     */
    static final class Bean<T,V> implements Reflect<T,V> {
        private final MethodReflect<T,V> reflect;
        private final FieldMap<V> annotations;
        private final ParamType<V> type;
        private final Id<T> id;

        /**
         * Constructs an object property mapping for the specified method.
         * @param reflect The reflection property.
         * @param annotations The annotations.
         * @param id The field identifier.
         */
        private Bean(final MethodReflect<T,V> reflect, final FieldMap<V> annotations, final Id<T> id) {
            this.type = StandardParameterTypes.of(reflect.getter.getGenericReturnType());
            this.annotations = annotations;
            this.reflect = reflect;
            this.id = id;
        }

        /**
         * Gets the ID.
         * @return The ID.
         */
        final Id<T> id() {
            return this.id;
        }

        /**
         * Gets the annotations.
         * @return The annotations.
         */
        final FieldMap<V> annotations() {
            return this.annotations;
        }

        /**
         * Gets the parameter type.
         * @return The parameter type.
         */
        final ParamType<V> type() {
            return this.type;
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
    }

    /**
     * Get/set reflection operations.
     */
    private static class MethodReflect<T,V> implements Reflect<T,V> {
        private final Method getter, setter;

        /**
         * Constructs a new method reflection property.
         * @param getter The getter method.
         */
        private MethodReflect(final Method getter) {
            this.setter = declaredSetterOf(getter);
            this.getter = getter;
        }

        /**
         * Gets the target type.
         * @return The target type.
         */
        public final Class<V> targetType() {
            return (Class<V>)getter.getReturnType();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public V get(final T object) {
            try {
                return (V)getter.invoke(object);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not invoke " + getter + " on " + object.getClass(), e);
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void set(T object, final V value) {
            try {
                setter.invoke(object, value);
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not invoke " + setter + " on " + object.getClass(), e);
            }
        }
    }

    /**
     * Get/set reflection operations with a declaring property.
     */
    private static final class DeclaringMethodReflect<T,V> extends MethodReflect<T,V> {
        private final MethodReflect<T,T> declaring;

        /**
         * Constructs a new declaring method reflection property.
         * @param getter The getter method.
         * @param declaring The declaring reflection property.
         */
        private DeclaringMethodReflect(final Method getter, final MethodReflect<T,T> declaring) {
            super(getter);
            this.declaring = declaring;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final V get(final T object) {
            final T declaringObject = declaring.get(object);
            if (declaringObject == null) {
                return null;
            }
            return super.get(declaringObject);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final void set(final T object, final V value) {
            T declaringObject = declaring.get(object);
            if (declaringObject == null) {
                try {
                    declaringObject = declaring.targetType().newInstance();
                } catch (final Exception e) {
                    throw new DynamoDBMappingException("could not instantiate " + declaring.targetType(), e);
                }
                declaring.set(object, declaringObject);
            }
            super.set(declaringObject, value);
        }
    }

    /**
     * {@link Bean} properties builder.
     */
    static final class Builder<T,V> {
        private final Map<String,Bean<T,V>> map = new LinkedHashMap<String,Bean<T,V>>();
        private final Class<T> targetType;
        private final boolean inherited;

        /**
         * Constructs a new builder instance.
         * @param targetType The object type.
         * @param inherited Indicates if we should ignore table/document restrictions.
         */
        Builder(final Class<T> targetType, final boolean inherited) {
            this.targetType = targetType;
            this.inherited = inherited;
        }

        /**
         * Builds the bean properties mapping.
         * @return The built bean properties mapping.
         */
        public Map<String,Bean<T,V>> build() {
            for (final Method m : this.targetType.getMethods()) {
                if (!isGetter(m)) {
                    continue;
                } else if (!inherited && m.getDeclaringClass() != this.targetType) {
                    if (!StandardAnnotationMaps.of(m.getDeclaringClass()).typed()) {
                        continue;
                    }
                }
                flatten(new MethodReflect(m), null);
            }
            return Collections.unmodifiableMap(this.map);
        }

        /**
         * Flattens or adds the bean to the mapping.
         * @param bean The bean property.
         * @param name The attribute name override.
         */
        private void flatten(final MethodReflect<T,V> reflect, String name) {
            final FieldMap<V> annotations = StandardAnnotationMaps.of(reflect.getter);
            if (annotations.ignore() != null) {
                return;
            }
            final Id<T> id = new Id(this.targetType, name == null ? annotations.attributeName() : name);
            if (annotations.flattened() == null) {
                if (this.map.put(id.name(), new Bean(reflect, annotations, id)) != null) {
                    throw new DynamoDBMappingException(id.format("duplicate attribute name"));
                }
            } else {
                final Map<String,String> attributes = annotations.attributes();
                for (final Method m : reflect.targetType().getMethods()) {
                    if (isGetter(m) && (name = attributes.remove(nameOf(m, null))) != null) {
                        flatten(new DeclaringMethodReflect(m, (MethodReflect<T,T>)reflect), name);
                    }
                }
                if (!attributes.isEmpty()) { //<- this should be empty by now
                    throw new DynamoDBMappingException(id.format("contains unknown flattened attribute(s): " + attributes));
                }
            }
        }
    }

    /**
     * Returns true if the method is a valid getter property.
     * @param method The getter method.
     * @return True if a getter method, false otherwise.
     */
    static final boolean isGetter(final Method method) {
        if (!method.getName().startsWith("get") && !method.getName().startsWith("is")) {
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

    /**
     * Gets the property name of the specified getter method.
     * @param getter The getter method.
     * @param prefix An optional prefix to apply (for setter method).
     * @return The property name.
     */
    static final String nameOf(final Method getter, final String prefix) {
        String name = getter.getName();
        name = name.substring(name.startsWith("is") ? "is".length() : "get".length());
        if (name.length() == 0) {
            throw new DynamoDBMappingException("getter must begin with 'get' or 'is', and contain at least one character: " + getter);
        } else if (prefix == null) {
            return StringUtils.lowerCase(name.substring(0, 1)) + name.substring(1);
        } else {
            return prefix + name;
        }
    }

    /**
     * Gets the declared field from the getter method.
     * @param getter The getter method.
     * @return The field, or null if none.
     */
    static final Field declaredFieldOf(final Method getter) {
        final String name = nameOf(getter, null);
        try {
            return getter.getDeclaringClass().getDeclaredField(name);
        } catch (final SecurityException e) {
            throw new DynamoDBMappingException("no access to field " + name + " for " + getter, e);
        } catch (final NoSuchFieldException no) {}
        return null;
    }

    /**
     * Gets the declared setter from the getter method.
     * @param getter The getter method.
     * @return The setter, or null if none.
     */
    static final Method declaredSetterOf(final Method getter) {
        final String name = nameOf(getter, "set");
        try {
            return getter.getDeclaringClass().getMethod(name, getter.getReturnType());
        } catch (final Exception no) {}
        return null;
    }

}
