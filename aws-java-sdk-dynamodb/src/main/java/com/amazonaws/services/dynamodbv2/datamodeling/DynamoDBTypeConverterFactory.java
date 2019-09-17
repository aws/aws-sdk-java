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

import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * {@link DynamoDBTypeConverter} factory and supporting classes.
 *
 * <p>To override standard type-conversions,</p>
 * <pre class="brush: java">
 * DynamoDBMapperConfig config = DynamoDBMapperConfig.builder()
 *     .withTypeConverterFactory(DynamoDBTypeConverterFactory.standard().override()
 *         .with(String.class, MyObject.class, new StringToMyObjectConverter())
 *         .build())
 *     .build();
 * </pre>
 * <p>Then, on the property, specify the attribute binding,</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTyped(DynamoDBAttributeType.S)
 * public MyObject getMyObject()
 * </pre>
 *
 * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig
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
        private final ConverterMap overrides = new ConverterMap();
        private final DynamoDBTypeConverterFactory defaults;

        private Builder(DynamoDBTypeConverterFactory defaults) {
            this.defaults = defaults;
        }

        public <S,T> Builder with(Class<S> sourceType, Class<T> targetType, DynamoDBTypeConverter<? extends S,? extends T> converter) {
            if (Vector.SET.is(sourceType) || Vector.LIST.is(sourceType) || Vector.MAP.is(sourceType)) {
                throw new DynamoDBMappingException("type [" + sourceType + "] is not supported" +
                    "; type-converter factory only supports scalar conversions");
            }
            overrides.put(sourceType, targetType, converter);
            return this;
        }

        public DynamoDBTypeConverterFactory build() {
            return new OverrideFactory(defaults, overrides);
        }
    }

    /**
     * A delegating {@link DynamoDBTypeConverterFactory}.
     */
    public static class DelegateFactory extends DynamoDBTypeConverterFactory {
        private final DynamoDBTypeConverterFactory delegate;

        public DelegateFactory(DynamoDBTypeConverterFactory delegate) {
            this.delegate = delegate;
        }

        @Override
        public <S,T> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType) {
            return delegate.<S,T>getConverter(sourceType, targetType);
        }
    }

    /**
     * Delegate factory to allow selected types to be overriden.
     */
    private static class OverrideFactory extends DelegateFactory {
        private final ConverterMap overrides;

        public OverrideFactory(DynamoDBTypeConverterFactory defaults, ConverterMap overrides) {
            super(defaults);
            this.overrides = overrides;
        }

        @Override
        public <S,T> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType) {
            DynamoDBTypeConverter<S,T> converter = overrides.<S,T>get(sourceType, targetType);
            if (converter == null) {
                converter = super.<S,T>getConverter(sourceType, targetType);
            }
            return converter;
        }
    }

    /**
     * Map of source and target pairs to the converter.
     */
    private static final class ConverterMap extends LinkedHashMap<Key<?,?>,DynamoDBTypeConverter<?,?>> {
        private static final long serialVersionUID = -1L;

        public <S,T> void put(Class<S> sourceType, Class<T> targetType, DynamoDBTypeConverter<? extends S,? extends T> converter) {
            put(Key.of(sourceType, targetType), converter);
        }

        @SuppressWarnings("unchecked")
        public <S,T> DynamoDBTypeConverter<S,T> get(Class<S> sourceType, Class<T> targetType) {
            for (final Entry<Key<?,?>,DynamoDBTypeConverter<?,?>> entry : entrySet()) {
                if (entry.getKey().isAssignableFrom(sourceType, targetType)) {
                    return (DynamoDBTypeConverter<S,T>)entry.getValue();
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
