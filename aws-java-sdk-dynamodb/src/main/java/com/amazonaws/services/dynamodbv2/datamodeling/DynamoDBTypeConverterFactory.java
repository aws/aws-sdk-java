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

import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Interface for converting types.
 */
public abstract class DynamoDBTypeConverterFactory {

    /**
     * Gets the type-converter matching the target conversion type.
     * @param <S> The DynamoDB standard type.
     * @param <T> The object's field/property type.
     * @param sourceType The source conversion type.
     * @param targetType The target conversion type.
     * @return The type-converter, or null if no match.
     */
    public abstract <S,T> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType);

    /**
     * Creates a type-converter factory builder using this factory as defaults.
     */
    public final Builder override() {
        return new Builder(this);
    }

    /**
     * Returns the standard type-converter factory. To override, the factory,
     * @see DynamoDBTypeConverterFactory#override
     */
    public static final DynamoDBTypeConverterFactory standard() {
        return StandardTypeConverters.factory();
    }

    /**
     * Builder for overriding type-converters.
     */
    public static final class Builder {
        private final ConverterMap<Object,Object> overrides = new ConverterMap<Object,Object>();
        private final DynamoDBTypeConverterFactory defaults;

        private Builder(DynamoDBTypeConverterFactory defaults) {
            this.defaults = defaults;
        }

        @SuppressWarnings("unchecked")
        public <S,T> Builder with(Class<S> sourceType, Class<T> targetType, DynamoDBTypeConverter<? extends S,? extends T> converter) {
            if (Vector.SET.is(sourceType) || Vector.LIST.is(sourceType) || Vector.MAP.is(sourceType)) {
                throw new DynamoDBMappingException("type [" + sourceType + "] is not supported" +
                    "; type-converter factory only supports scalar conversions");
            }
            ((ConverterMap<S,T>)overrides).put(sourceType, targetType, converter);
            return this;
        }

        public DynamoDBTypeConverterFactory build() {
            return new OverrideFactory(this);
        }
    }

    /**
     * A delegating {@link DynamoDBTypeConverterFactory}.
     */
    public static abstract class DelegateFactory extends DynamoDBTypeConverterFactory {
        private final DynamoDBTypeConverterFactory delegate;

        protected DelegateFactory(DynamoDBTypeConverterFactory delegate) {
            this.delegate = delegate;
        }

        @Override
        public <S,T> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType) {
            return delegate.getConverter(sourceType, targetType);
        }
    }

    /**
     * Delegate factory to allow selected types to be overriden.
     */
    private static final class OverrideFactory extends DelegateFactory {
        private final ConverterMap<Object,Object> overrides;

        private OverrideFactory(Builder builder) {
            super(builder.defaults);
            this.overrides = builder.overrides;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <S,T> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType) {
            DynamoDBTypeConverter<S,T> converter = ((ConverterMap<S,T>)overrides).get(sourceType, targetType);
            if (converter == null) {
                return super.getConverter(sourceType, targetType);
            }
            return converter;
        }
    }

    /**
     * Map of source and target pairs to the converter.
     */
    private static final class ConverterMap<S,T> extends LinkedHashMap<Key<S,T>,DynamoDBTypeConverter<S,T>> {
        private static final long serialVersionUID = -1L;

        @SuppressWarnings("unchecked")
        public void put(Class<S> sourceType, Class<T> targetType, DynamoDBTypeConverter<? extends S,? extends T> converter) {
            put(Key.<S,T>of(sourceType, targetType), (DynamoDBTypeConverter<S,T>)converter);
        }

        public DynamoDBTypeConverter<S,T> get(Class<S> sourceType, Class<T> targetType) {
            for (final Entry<Key<S,T>,DynamoDBTypeConverter<S,T>> entry : entrySet()) {
                if (entry.getKey().isAssignableFrom(sourceType, targetType)) {
                    return entry.getValue();
                }
            }
            return null;
        }
    }

    /**
     * Source and target conversion type pair.
     */
    private static final class Key<S,T> extends SimpleImmutableEntry<Class<S>,Class<T>> {
        private static final long serialVersionUID = -1L;

        private Key(Class<S> sourceType, Class<T> targetType) {
            super(sourceType, targetType);
        }

        public boolean isAssignableFrom(Class<?> sourceType, Class<?> targetType) {
            return getKey().isAssignableFrom(sourceType) && getValue().isAssignableFrom(targetType);
        }

        public static <S,T> Key<S,T> of(Class<S> sourceType, Class<T> targetType) {
            return new Key<S,T>(sourceType, targetType);
        }
    }

}
