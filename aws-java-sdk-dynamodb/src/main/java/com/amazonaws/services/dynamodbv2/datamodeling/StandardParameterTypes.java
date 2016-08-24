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
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Scalar;
import com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Generic type helper.
 */
@SdkInternalApi
final class StandardParameterTypes {

    /**
     * Creates a new parameter type given the generic type.
     */
    static final <T> ParamType<T> of(final Type type, Type ... paramTypes) {
        if (type instanceof Class) {
            if (paramTypes.length == 0 && Vector.SET.is((Class<?>)type)) {
                paramTypes = new Type[]{Object.class};
            }
            return new ParamType((Class<T>)type, type, paramTypes);
        } else if (type instanceof ParameterizedType) {
            if (paramTypes.length == 0) {
                paramTypes = ((ParameterizedType)type).getActualTypeArguments();
            }
            return new ParamType((Class<T>)((ParameterizedType)type).getRawType(), type, paramTypes);
        } else if (type.toString().equals("byte[]")) {
            return new ParamType((Class<T>)byte[].class, type, paramTypes);
        } else {
            return new ParamType((Class<T>)Object.class, type, paramTypes);
        }
    }

    /**
     * Creates a new parameter type based on the generic source type of the
     * type-converter instance.
     */
    static final <T> ParamType<T> of(final DynamoDBTypeConverter<?,T> converter) {
        final Class<?> converterType = converter.getClass();
        if (!converterType.isInterface()) {
            for (Class<?> c = converterType; Object.class != c; c = c.getSuperclass()) {
                for (final Type genericType : c.getGenericInterfaces()) {
                    final ParamType<T> t = StandardParameterTypes.of(genericType);
                    if (DynamoDBTypeConverter.class.isAssignableFrom(t.type())) {
                        if (t.params.length == 2 && t.param(0).type() != Object.class) {
                            return t.param(0);
                        }
                    }
                }
            }
            final ParamType<T> t = StandardParameterTypes.of(converterType.getGenericSuperclass());
            if (DynamoDBTypeConverter.class.isAssignableFrom(t.type())) {
                if (t.params.length > 0 && t.param(0).type() != Object.class) {
                    return t.param(0);
                }
            }
        }
        throw new DynamoDBMappingException("could not resolve type of " + converterType);
    }

    /**
     * Parameterized type.
     */
    static final class ParamType<T> {
        private final ParamType<T>[] params;
        private final Type genericType;
        private final Class<T> type;
        private final Scalar scalar;

        /**
         * Constructs a new parameter type.
         */
        private ParamType(final Class<T> type, final Type genericType, final Type ... paramTypes) {
            this.params = new ParamType[paramTypes.length];
            for (int i = 0; i < paramTypes.length; i++) {
                this.params[i] = StandardParameterTypes.of(paramTypes[i]);
            }
            this.genericType = genericType;
            this.type = type;
            this.scalar = Scalar.of(type);
        }

        /**
         * Gets the scalar parameter types.
         */
        final <t> ParamType<t> param(final int index) {
            return this.params.length > index ? (ParamType<t>)this.params[index] : null;
        }

        /**
         * Gets the raw scalar type.
         */
        final Class<T> type() {
            return this.type;
        }

        /**
         * Gets the scalar type.
         */
        final Scalar scalar() {
            return this.scalar;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            return new StringBuilder().append(scalar).append("[").append(genericType).append("]").toString();
        }
    }

}
