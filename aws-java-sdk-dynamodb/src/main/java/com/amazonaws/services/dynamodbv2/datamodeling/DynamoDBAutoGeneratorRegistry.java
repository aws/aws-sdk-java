/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.math.BigInteger;
import java.util.UUID;

/**
 * Helper for auto-generating attribute values.
 */
final class DynamoDBAutoGeneratorRegistry {

    /**
     * The default instance.
     */
    private static final DynamoDBAutoGeneratorRegistry INSTANCE = new DynamoDBAutoGeneratorRegistry();

    /**
     * Gets the default instance.
     * @return The default instance.
     */
    static final DynamoDBAutoGeneratorRegistry instance() {
        return INSTANCE;
    }

    /**
     * Gets the generator given the annotation and clazz.
     * @param clazz The class.
     * @return The generator.
     */
    final Generator<Object> generatorOf(final Generators type, final Class<?> clazz) {
        final Generator<? extends Object> result = type.generatorOf(clazz);
        return (Generator<Object>)result;
    }

    /**
     * Defines the generator categories.
     */
    static enum Generators implements GeneratorFactory {
        /**
         * The never generator.
         */
        NEVER {
            @Override
            public final Generator<? extends Object> generatorOf(final Class<?> clazz) {
                return NeverGenerator.INSTANCE;
            }
        },

        /**
         * The key generators.
         */
        KEY {
            @Override
            public final Generator<? extends Object> generatorOf(final Class<?> clazz) {
                if (String.class.isAssignableFrom(clazz)) {
                    return UuidStringKeyGenerator.INSTANCE;
                }
                return NeverKeyGenerator.INSTANCE;
            }
        },

        /**
         * The version generators.
         */
        VERSION {
            @Override
            public final Generator<? extends Object> generatorOf(final Class<?> clazz) {
                if (BigInteger.class.isAssignableFrom(clazz)) {
                    return BigIntegerVersionGenerator.INSTANCE;
                } else if (Byte.class.isAssignableFrom(clazz) || byte.class.isAssignableFrom(clazz)) {
                    return ByteVersionGenerator.INSTANCE;
                } else if (Integer.class.isAssignableFrom(clazz) || int.class.isAssignableFrom(clazz)) {
                    return IntegerVersionGenerator.INSTANCE;
                } else if (Long.class.isAssignableFrom(clazz) || long.class.isAssignableFrom(clazz)) {
                    return LongVersionGenerator.INSTANCE;
                }
                return NeverVersionGenerator.INSTANCE;
            }
        };
    }

    /**
     * Factory for returning generator instances.
     */
    static interface GeneratorFactory {
        /**
         * Gets the generator for the given class.
         * @param clazz The class.
         * @return The generator.
         */
        abstract public Generator<? extends Object> generatorOf(final Class<?> clazz);
    }

    /**
     * Generator for auto-generating attribute values.
     */
    static interface Generator<T> {
        /**
         * Determines if the value can be auto-generated for the object.
         * @param currentValue The current attribute value.
         * @return True if can be auto generated, false otherwise.
         */
        abstract public boolean canGenerate(T currentValue);

        /**
         * Generates a new attribute value for the target object.
         * @param currentValue The current attribute value.
         * @return The new attribute value.
         */
        abstract public T generate(T currentValue);
    }

    /**
     * Generator which never generates.
     */
    static final class NeverGenerator implements Generator<Object> {
        private static final Generator<Object> INSTANCE = new NeverGenerator();

        @Override
        public final boolean canGenerate(final Object currentValue) {
            return false;
        }

        @Override
        public final Object generate(final Object currentValue) {
            throw new DynamoDBMappingException("generate not supported for " + getClass().getName());
        }
    }

    /**
     * Base generator for keys.
     */
    static abstract class AbstractKeyGenerator<T> implements Generator<T> {
        @Override
        public final boolean canGenerate(final T currentValue) {
            return (currentValue == null);
        }
    }

    /**
     * Never generator for key.
     */
    static final class NeverKeyGenerator extends AbstractKeyGenerator<Object> {
        private static final Generator<Object> INSTANCE = new NeverKeyGenerator();

        @Override
        public final Object generate(final Object currentValue) {
            throw new DynamoDBMappingException("Unsupported type for @DynamoDBAutoGeneratedKey; only String allowed");
        }
    }

    /**
     * Key generator for UUID strings.
     */
    static final class UuidStringKeyGenerator extends AbstractKeyGenerator<String> {
        private static final Generator<String> INSTANCE = new UuidStringKeyGenerator();

        @Override
        public final String generate(final String currentValue) {
            return UUID.randomUUID().toString();
        }
    }

    /**
     * Base generator for versions.
     */
    static abstract class AbstractVersionGenerator<T> implements Generator<T> {
        @Override
        public final boolean canGenerate(final T currentValue) {
            return true;
        }
    }

    /**
     * Never generator for version.
     */
    static final class NeverVersionGenerator extends AbstractVersionGenerator<Object> {
        private static final Generator<Object> INSTANCE = new NeverVersionGenerator();

        @Override
        public final Object generate(final Object currentValue) {
            throw new DynamoDBMappingException("Unsupported type for @DynamoDBVersionAttribute; only BigInteger, Byte, Integer or Long allowed");
        }
    }

    /**
     * Version generator for {@code BigInteger} types.
     */
    static final class BigIntegerVersionGenerator extends AbstractVersionGenerator<BigInteger> {
        private static final Generator<BigInteger> INSTANCE = new BigIntegerVersionGenerator();

        @Override
        public final BigInteger generate(final BigInteger currentValue) {
            if (currentValue == null) {
                return BigInteger.ONE;
            }
            return currentValue.add(BigInteger.ONE);
        }
    }

    /**
     * Version generator for {@code Byte} types.
     */
    static final class ByteVersionGenerator extends AbstractVersionGenerator<Byte> {
        private static final Generator<Byte> INSTANCE = new ByteVersionGenerator();

        @Override
        public final Byte generate(final Byte currentValue) {
            if (currentValue == null) {
                return Byte.valueOf((byte)1);
            }
            // Mod MAX_VALUE since that's what the DynamoDBReflector used to do.
            return (byte)((currentValue + 1) % Byte.MAX_VALUE);
        }
    }

    /**
     * Version generator for {@code Integer} types.
     */
    static final class IntegerVersionGenerator extends AbstractVersionGenerator<Integer> {
        private static final Generator<Integer> INSTANCE = new IntegerVersionGenerator();

        @Override
        public final Integer generate(final Integer currentValue) {
            if (currentValue == null) {
                return Integer.valueOf(1);
            }
            return (int)(currentValue + 1);
        }
    }

    /**
     * Version generator for {@code Long} types.
     */
    static final class LongVersionGenerator extends AbstractVersionGenerator<Long> {
        private static final Generator<Long> INSTANCE = new LongVersionGenerator();

        @Override
        public final Long generate(final Long currentValue) {
            if (currentValue == null) {
                return Long.valueOf(1L);
            }
            return (long)(currentValue + 1L);
        }
    }

    /**
     * Version generator for {@code Short} types.
     */
    static final class ShortVersionGenerator extends AbstractVersionGenerator<Short> {
        private static final Generator<Short> INSTANCE = new ShortVersionGenerator();

        @Override
        public final Short generate(final Short currentValue) {
            if (currentValue == null) {
                return Short.valueOf((short)1);
            }
            return (short)(currentValue + 1);
        }
    }

}
