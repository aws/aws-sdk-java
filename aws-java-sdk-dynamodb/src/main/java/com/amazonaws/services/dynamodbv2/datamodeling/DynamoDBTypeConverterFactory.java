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

import com.amazonaws.annotation.NotThreadSafe;

import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Interface for converting types.
 */
public interface DynamoDBTypeConverterFactory {

    /**
     * Gets the type-converter matching the target conversion type.
     * @param <S> The DynamoDB standard type.
     * @param <T> The object's field/property type.
     * @param sourceType The source conversion type.
     * @param targetType The target conversion type.
     * @return The type-converter, or null if no match.
     */
    <S,T> DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType);

    /**
     * Delegate factory to allow selected types to be overriden.
     */
    @NotThreadSafe
    public static class OverrideFactory implements DynamoDBTypeConverterFactory {
        private final Map<Key<?,?>,DynamoDBTypeConverter<?,?>> overrides = new LinkedHashMap<Key<?,?>,DynamoDBTypeConverter<?,?>>();
        private final DynamoDBTypeConverterFactory delegate;

        /**
         * Constructs a new override factory with the delegate as fallback.
         */
        public OverrideFactory(final DynamoDBTypeConverterFactory delegate) {
            this.delegate = delegate;
        }

        /**
         * Adds or replaces the source to target conversion override.
         */
        public <S,T> OverrideFactory with(final Class<S> sourceType, final Class<T> targetType, final DynamoDBTypeConverter<S,T> converter) {
            this.overrides.put(new Key(sourceType, targetType), converter);
            return this;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public <S,T> DynamoDBTypeConverter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
            for (final Map.Entry<Key<?,?>,DynamoDBTypeConverter<?,?>> entry : this.overrides.entrySet()) {
                if (entry.getKey().isAssignableFrom(sourceType, targetType)) {
                    return (DynamoDBTypeConverter<S,T>)entry.getValue();
                }
            }
            return this.delegate.getConverter(sourceType, targetType);
        }

        /**
         * Joins the source and target converters.
         */
        public static final <S,T,U> DynamoDBTypeConverter<S,U> join(final DynamoDBTypeConverter<S,T> source, final DynamoDBTypeConverter<T,U> target) {
            return new DynamoDBTypeConverter<S,U>() {
                public final S convert(final U o) {
                    final T object = o == null ? null : target.convert(o);
                    return object == null ? null : source.convert(object);
                }
                public final U unconvert(final S o) {
                    final T object = o == null ? null : source.unconvert(o);
                    return object == null ? null : target.unconvert(object);
                }
            };
        }

        /**
         * Source and target conversion type pair.
         */
        public static final class Key<S,T> extends AbstractMap.SimpleImmutableEntry<Class<S>,Class<T>> {
            public Key(final Class<S> sourceType, final Class<T> targetType) {
                super(sourceType, targetType);
            }
            public boolean isAssignableFrom(final Class<?> sourceType, final Class<?> targetType) {
                return getKey().isAssignableFrom(sourceType) && getValue().isAssignableFrom(targetType);
            }
        }
    }

}
