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

import java.lang.reflect.Method;

/**
 * Reflection assistant for {@link DynamoDBMapper}
 */
@SdkInternalApi
final class StandardMethodReflects {

    /**
     * Gets the method reflector for the given getter.
     */
    static final <T,V> Reflect<T,V> of(final Method getter) {
        Method setter = null;
        try {
            final String name = "set" + getter.getName().replaceFirst("^(get|is)","");
            setter = getter.getDeclaringClass().getMethod(name, getter.getReturnType());
        } catch (final Exception no) {}
        return new MethodReflect<T,V>(getter, setter);
    }

    /**
     * Gets the method reflector for the given getter and declaring reflector.
     */
    static final <T,V> Reflect<T,V> of(final Method getter, final Reflect<T,T> declaring, final Class<T> targetType) {
        final Reflect<T,V> reflect = StandardMethodReflects.of(getter);
        return new DeclaringReflect<T,V>(reflect, declaring, targetType);
    }

    /**
     * Get/set reflection operations.
     */
    static final class MethodReflect<T,V> implements Reflect<T,V> {
        private final Method getter, setter;

        /**
         * Constructs the method reflector.
         */
        private MethodReflect(final Method getter, final Method setter) {
            this.getter = getter;
            this.setter = setter;
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
    static final class DeclaringReflect<T,V> implements Reflect<T,V> {
        private final Reflect<T,V> reflect;
        private final Reflect<T,T> declaring;
        private final Class<T> targetType;

        /**
         * Constructs the declaring method reflector.
         */
        private DeclaringReflect(final Reflect<T,V> reflect, final Reflect<T,T> declaring, final Class<T> targetType) {
            this.reflect = reflect;
            this.declaring = declaring;
            this.targetType = targetType;
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
            return reflect.get(declaringObject);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final void set(final T object, final V value) {
            T declaringObject = declaring.get(object);
            if (declaringObject == null) {
                try {
                    declaringObject = targetType.newInstance();
                } catch (final Exception e) {
                    throw new DynamoDBMappingException("could not instantiate " + targetType, e);
                }
                declaring.set(object, declaringObject);
            }
            reflect.set(declaringObject, value);
        }
    }

}
