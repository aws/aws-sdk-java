/*
 * Copyright 2014-2015 Amazon Technologies, Inc.
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

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Helper class for incrementing version attributes.
 */
class VersionIncrementor {

    private final Map<Method, Incrementor> cache =
            new HashMap<Method, Incrementor>();

    /**
     * Increments a version attribute.
     *
     * @param getter the attribute getter method
     * @param object the current value of the attribute
     * @return the incremented value of the attribute
     */
    public Object increment(Method getter, Object object) {
        Incrementor incrementor = getIncrementor(getter);
        return incrementor.increment(object);
    }

    private Incrementor getIncrementor(Method getter) {
        synchronized (cache) {
            Incrementor result = cache.get(getter);
            if (result != null) {
                return result;
            }

            Class<?> returnType = getter.getReturnType();
            if (matches(returnType, BigInteger.class)) {
                result = BIG_INTEGER;

            } else if (matches(returnType, Long.class, long.class)) {
                result = LONG;

            } else if (matches(returnType, Integer.class, int.class)) {
                result = INTEGER;

            } else if (matches(returnType, Short.class, short.class)) {
                result = SHORT;

            } else if (matches(returnType, Byte.class, byte.class)) {
                result = BYTE;

            } else {
                throw new DynamoDBMappingException(
                        "Unsupported parameter type for "
                        + DynamoDBVersionAttribute.class + ": " + returnType
                        + ". Must be a whole-number type.");
            }

            cache.put(getter, result);
            return result;
        }
    }

    private static boolean matches(Class<?> needle, Class<?>... haystack) {
        for (Class<?> clazz : haystack) {
            if (clazz.isAssignableFrom(needle)) {
                return true;
            }
        }
        return false;
    }

    private static interface Incrementor {
        Object increment(Object o);
    }

    private static final Incrementor BIG_INTEGER = new Incrementor() {
        @Override
        public Object increment(Object o) {
            if (o == null) {
                return BigInteger.ONE;
            }
            return ((BigInteger) o).add(BigInteger.ONE);
        }
    };

    private static final Incrementor LONG = new Incrementor() {
        @Override
        public Object increment(Object o) {
            if (o == null) {
                return Long.valueOf(1);
            }

            long next = ((Long) o) + 1L;
            return next;
        }
    };

    private static final Incrementor INTEGER = new Incrementor() {
        @Override
        public Object increment(Object o) {
            if (o == null) {
                return Integer.valueOf(1);
            }

            int next = ((Integer) o) + 1;
            return next;
        }
    };

    private static final Incrementor SHORT = new Incrementor() {
        @Override
        public Object increment(Object o) {
            if (o == null) {
                return Short.valueOf((short) 1);
            }

            short next = (short) (((Short) o) + 1);
            return next;
        }
    };

    private static final Incrementor BYTE = new Incrementor() {
        @Override
        public Object increment(Object o) {
            if (o == null) {
                return Byte.valueOf((byte) 1);
            }

            // Mod MAX_VALUE since that's what the DynamoDBReflector used to
            // do.
            byte next = (byte) ((((Byte) o) + 1) % Byte.MAX_VALUE);
            return next;
        }
    };
}
