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

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Interface for converting types.
 *
 * @param <S> The DynamoDB standard type.
 * @param <T> The object's field/property type.
 */
public interface DynamoDBTypeConverterFactory<S extends Object, T extends Object> {

    /**
     * Gets the type-converter matching the target conversion type.
     * @param sourceType The source conversion type.
     * @param targetType The target conversion type.
     * @return The type-converter, or null if no match.
     */
    DynamoDBTypeConverter<S,T> getConverter(Class<S> sourceType, Class<T> targetType);

    /**
     * Delegate factory.
     */
    public static class DelegateFactory<S,T> implements DynamoDBTypeConverterFactory<S,T> {
        private static final DynamoDBTypeConverterFactory<?,?> NIL = new DynamoDBTypeConverterFactory<Object,Object>() {
            public final DynamoDBTypeConverter<Object,Object> getConverter(final Class<Object> sourceType, final Class<Object> targetType) {
                return null;
            }
        };
        private final DynamoDBTypeConverterFactory<S,T> delegate;
        public DelegateFactory(final DynamoDBTypeConverterFactory<S,T> delegate) {
            this.delegate = delegate == null ? (DynamoDBTypeConverterFactory<S,T>)NIL : delegate;
        }
        @Override
        public DynamoDBTypeConverter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
            return this.delegate.getConverter(sourceType, targetType);
        }
    }

    /**
     * Delegate factory to allow selected types to be overriden.
     */
    @NotThreadSafe
    public static class OverrideFactory<S,T> extends DelegateFactory<S,T> {
        private final Map<Entry<Class<S>,Class<T>>,DynamoDBTypeConverter<S,T>> overrides = new LinkedHashMap<Entry<Class<S>,Class<T>>,DynamoDBTypeConverter<S,T>>();
        public OverrideFactory(final DynamoDBTypeConverterFactory<S,T> delegate) {
            super(delegate);
        }
        public <s extends S,t extends T> OverrideFactory<S,T> with(final Class<s> sourceType, final Class<t> targetType, final DynamoDBTypeConverter<s,t> converter) {
            this.overrides.put(new SimpleImmutableEntry((Class<S>)sourceType, (Class<T>)targetType), (DynamoDBTypeConverter<S,T>)converter);
            return this;
        }
        @Override
        public DynamoDBTypeConverter<S,T> getConverter(final Class<S> sourceType, final Class<T> targetType) {
            for (final Entry<Entry<Class<S>,Class<T>>,DynamoDBTypeConverter<S,T>> entry : this.overrides.entrySet()) {
                if (entry.getKey().getKey().isAssignableFrom(sourceType) && entry.getKey().getValue().isAssignableFrom(targetType)) {
                    return entry.getValue();
                }
            }
            return super.getConverter(sourceType, targetType);
        }
    }

}
