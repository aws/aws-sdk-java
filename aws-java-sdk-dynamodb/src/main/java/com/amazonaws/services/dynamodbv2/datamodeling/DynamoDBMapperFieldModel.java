/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy.ALWAYS;
import static com.amazonaws.services.dynamodbv2.datamodeling.StandardTypeConverters.Vector.LIST;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.BEGINS_WITH;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.BETWEEN;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.CONTAINS;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.EQ;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.GE;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.GT;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.IN;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.NULL;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.LE;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.LT;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.NE;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.NOT_CONTAINS;
import static com.amazonaws.services.dynamodbv2.model.ComparisonOperator.NOT_NULL;
import static com.amazonaws.services.dynamodbv2.model.KeyType.HASH;
import static com.amazonaws.services.dynamodbv2.model.KeyType.RANGE;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.KeyType;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Field model.
 *
 * @param <T> The object type.
 * @param <V> The field model type.
 */
public class DynamoDBMapperFieldModel<T,V> implements DynamoDBAutoGenerator<V>, DynamoDBTypeConverter<AttributeValue,V> {

    public static enum DynamoDBAttributeType { B, N, S, BS, NS, SS, BOOL, NULL, L, M; };

    private final DynamoDBTypeConverter<AttributeValue,V> attributeValueConverter;
    private final DynamoDBMapperFieldModel.Properties<T,V> properties;
    private final DynamoDBMapperFieldModel.Reflect<T,V> reflect;

    /**
     * Creates a new field model instance.
     * @param builder The builder.
     */
    private DynamoDBMapperFieldModel(final DynamoDBMapperFieldModel.Builder<T,V> builder) {
        this.properties = new DynamoDBMapperFieldModel.Properties.Immutable(builder);
        this.attributeValueConverter = builder.attributeValueConverter;
        this.reflect = builder.reflect;
    }

    /**
     * Gets the ID.
     * @return The ID.
     */
    final DynamoDBMapperFieldModel.Id<T> id() {
        return properties.id();
    }

    /**
     * @deprecated replaced by {@link DynamoDBMapperFieldModel#name}
     */
    @Deprecated
    public String getDynamoDBAttributeName() {
        return properties.attributeName();
    }

    /**
     * @deprecated replaced by {@link DynamoDBMapperFieldModel#attributeType}
     */
    @Deprecated
    public DynamoDBAttributeType getDynamoDBAttributeType() {
        return properties.attributeType();
    }

    /**
     * Gets the attribute name.
     * @return The attribute name.
     */
    public final String name() {
        return properties.attributeName();
    }

    /**
     * Gets the value from the object instance.
     * @param object The object instance.
     * @return The value.
     */
    public final V get(final T object) {
        try {
            return reflect.get(object);
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id().err("could not get"), e);
        }
    }

    /**
     * Sets the value on the object instance.
     * @param object The object instance.
     * @param value The value.
     */
    public final void set(final T object, final V value) {
        try {
            reflect.set(object, value);
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id().err("could not set"), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final DynamoDBAutoGenerateStrategy getGenerateStrategy() {
        if (properties.autoGenerator() != null) {
            return properties.autoGenerator().getGenerateStrategy();
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final V generate(final V currentValue) {
        try {
            return properties.autoGenerator().generate(currentValue);
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id().err("could not generate"), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final AttributeValue convert(final V object) {
        try {
            return attributeValueConverter.convert(object);
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id().err("could not convert"), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final V unconvert(final AttributeValue object) {
        try {
            return attributeValueConverter.unconvert(object);
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id().err("could not unconvert"), e);
        }
    }

    /**
     * Gets the DynamoDB attribute type.
     * @return The DynamoDB attribute type.
     */
    public final DynamoDBAttributeType attributeType() {
        return properties.attributeType();
    }

    /**
     * Gets the key type.
     * @return The key type, or null if not a key.
     */
    public final KeyType keyType() {
        return properties.keyType();
    }

    /**
     * Indicates if this attribute is a version attribute.
     * @return True if it is, false otherwise.
     */
    public final boolean versioned() {
        return properties.versioned();
    }

    /**
     * Gets the global secondary indexes.
     * @param keyType The key type.
     * @return The list of global secondary indexes.
     */
    public final List<String> globalSecondaryIndexNames(final KeyType keyType) {
        if (properties.globalSecondaryIndexNames().containsKey(keyType)) {
            return properties.globalSecondaryIndexNames().get(keyType);
        }
        return Collections.emptyList();
    }

    /**
     * Gets the local secondary indexes.
     * @return The list of local secondary indexes.
     */
    public final List<String> localSecondaryIndexNames() {
        return properties.localSecondaryIndexNames();
    }

    /**
     * Returns true if the field matches any key or index key.
     * @param keyTypes The key types.
     * @return True if matching any key type.
     */
    public final boolean anyKey(final KeyType ... keyTypes) {
        for (final KeyType k : (keyTypes.length == 0 ? KeyType.values() : keyTypes)) {
            if (keyType() == k) {
                return true;
            } else if (!globalSecondaryIndexNames(k).isEmpty()) {
                return true;
            } else if (RANGE == k && !localSecondaryIndexNames().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Creates an expectation that the value should exist.
     * @param value The value.
     * @return The expected value.
     * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression#withExpectedEntry
     * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDeleteExpression#withExpectedEntry
     * @see com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue
     */
    public final ExpectedAttributeValue expectedExists(final V value) {
        return new ExpectedAttributeValue().withExists(true).withValue(convert(value));
    }

    /**
     * Creates an expectation that the value should not exist.
     * @return The expected value.
     * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression#withExpectedEntry
     * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDeleteExpression#withExpectedEntry
     * @see com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue
     */
    public final ExpectedAttributeValue expectedNotExists() {
        return new ExpectedAttributeValue().withExists(false);
    }

    /**
     * Creates an expectation that the value should exist if the value is not
     * null or an expectation that the value should not exist otherwise.
     * @param value The value.
     * @return The expected value.
     * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression#withExpectedEntry
     * @see com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDeleteExpression#withExpectedEntry
     * @see com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue
     */
    public final ExpectedAttributeValue expectedIfExists(final V value) {
        return value == null ? expectedNotExists() : expectedExists(value);
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#BEGINS_WITH
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition beginsWith(final V value) {
        return new Condition().withComparisonOperator(BEGINS_WITH).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified values.
     * @param lo The start of the range (inclusive).
     * @param hi The end of the range (inclusive).
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#BETWEEN
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition between(final V lo, final V hi) {
        return new Condition().withComparisonOperator(BETWEEN).withAttributeValueList(convert(lo), convert(hi));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#CONTAINS
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition contains(final V value) {
        return new Condition().withComparisonOperator(CONTAINS).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#EQ
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition eq(final V value) {
        return new Condition().withComparisonOperator(EQ).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#GE
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition ge(final V value) {
        return new Condition().withComparisonOperator(GE).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#GT
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition gt(final V value) {
        return new Condition().withComparisonOperator(GT).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified values.
     * @param values The values.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#IN
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition in(final Collection<V> values) {
        return new Condition().withComparisonOperator(IN).withAttributeValueList(LIST.convert(values, this));
    }

    /**
     * Creates a condition which filters on the specified values.
     * @param values The values.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#IN
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition in(final V ... values) {
        return in(Arrays.asList(values));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NULL
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition isNull() {
        return new Condition().withComparisonOperator(NULL);
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#LE
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition le(final V value) {
        return new Condition().withComparisonOperator(LE).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#LT
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition lt(final V value) {
        return new Condition().withComparisonOperator(LT).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NE
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition ne(final V value) {
        return new Condition().withComparisonOperator(NE).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NOT_CONTAINS
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition notContains(final V value) {
        return new Condition().withComparisonOperator(NOT_CONTAINS).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NOT_NULL
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition notNull() {
        return new Condition().withComparisonOperator(NOT_NULL);
    }

    /**
     * Creates a condition which filters on any non-null argument; if {@code lo}
     * is null a {@code LE} condition is applied on {@code hi}, if {@code hi}
     * is null a {@code GE} condition is applied on {@code lo}.
     * @param lo The start of the range (inclusive).
     * @param hi The end of the range (inclusive).
     * @return The condition or null if both arguments are null.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#BETWEEN
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#EQ
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#GE
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#LE
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition betweenAny(final V lo, final V hi) {
        return lo == null ? (hi == null ? null : le(hi)) : (hi == null ? ge(lo) : (lo.equals(hi) ? eq(lo) : between(lo,hi)));
    }

    /**
     * The field's "global" identifier.
     */
    public static final class Id<T> extends DynamoDBMapperTableModel.Id<T> {
        private final String name;

        /**
         * Construts a new field identifier.
         */
        public Id(final Class<T> type, final String name) {
            super(type);
            this.name = name;
        }

        /**
         * Constructs a new identifier from an existing one.
         */
        public Id(final Id<T> id, final String name) {
            super(id);
            this.name = name;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final boolean equals(final Object o) {
            return o instanceof Id && super.equals(o) && ((Id)o).name.equals(name);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final int hashCode() {
            return super.hashCode() ^ name.hashCode();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final String toString() {
            return new StringBuilder().append(super.toString()).append("[").append(name).append("]").toString();
        }
    }

    /**
     * {@link DynamoDBMapperFieldModel} builder.
     */
    static class Builder<T,V> extends DynamoDBMapperFieldModel.Properties.Buildable<T,V> {
        private DynamoDBTypeConverter<AttributeValue,V> attributeValueConverter;
        private DynamoDBMapperFieldModel.Reflect<T,V> reflect;

        /**
         * Constructs a new builder with the optional defaults.
         */
        public Builder(final DynamoDBMapperFieldModel.Properties<T,V> ... defaults) {
            super(defaults);
        }

        /**
         * Sets the attribute value converter.
         */
        public final Builder<T,V> with(final DynamoDBTypeConverter<AttributeValue,V> attributeValueConverter) {
            this.attributeValueConverter = attributeValueConverter;
            return this;
        }

        /**
         * Sets the model's reflection property.
         */
        public final Builder<T,V> with(final DynamoDBMapperFieldModel.Reflect<T,V> reflect) {
            this.reflect = reflect;
            return this;
        }

        /**
         * Builds the instance.
         */
        public final DynamoDBMapperFieldModel<T,V> build() {
            if (keyType() != null) {
                if (attributeType().name().matches("[BNS]") == false) {
                    throw new DynamoDBMappingException(id().err(
                        "must be scalar (B, N, or S) for key but is %s", attributeType()));
                } else if (autoGenerator() != null && autoGenerator().getGenerateStrategy() == ALWAYS) {
                    throw new DynamoDBMappingException(id().err(
                        "must not have auto-generated key with ALWAYS strategy"));
                }
            }
            return new DynamoDBMapperFieldModel<T,V>(this);
        }
    }

    /**
     * The field model properties.
     */
    static interface Properties<T,V> {
        public DynamoDBMapperFieldModel.Id<T> id();
        public Class<V> targetType();
        public String attributeName();
        public DynamoDBAttributeType attributeType();
        public KeyType keyType();
        public boolean versioned();
        public Map<KeyType,List<String>> globalSecondaryIndexNames();
        public List<String> localSecondaryIndexNames();
        public DynamoDBAutoGenerator<V> autoGenerator();
        public <S> DynamoDBTypeConverter<S,V> typeConverter();

        /**
         * Immutable properties.
         */
        static class Immutable<T,V> implements Properties<T,V> {
            private static final Properties<Object,Object> EMPTY = new Immutable<Object,Object>();
            static final <T,V> Properties<T,V> empty() {
                return (Properties<T,V>)Immutable.EMPTY;
            }

            private DynamoDBMapperFieldModel.Id<T> id;
            private Class<V> targetType;
            private String attributeName;
            private DynamoDBAttributeType attributeType;
            private KeyType keyType;
            private boolean versioned;
            private Map<KeyType,List<String>> globalSecondaryIndexNames;
            private List<String> localSecondaryIndexNames;
            private DynamoDBAutoGenerator<V> autoGenerator;
            private DynamoDBTypeConverter<?,V> typeConverter;

            /**
             * Populates the builder properties with the specified defaults.
             */
            public Immutable(final Properties<T,V> ... defaults) {
                this.globalSecondaryIndexNames = Collections.emptyMap();
                this.localSecondaryIndexNames = Collections.emptyList();
                for (final Properties<T,V> d : defaults) {
                    this.targetType = d.targetType();
                    this.attributeName = d.attributeName();
                    this.attributeType = d.attributeType();
                    this.keyType = d.keyType();
                    this.versioned = d.versioned();
                    this.globalSecondaryIndexNames = d.globalSecondaryIndexNames();
                    this.localSecondaryIndexNames = d.localSecondaryIndexNames();
                    this.autoGenerator = d.autoGenerator();
                    this.typeConverter = d.typeConverter();
                    this.id = d.id();
                }
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final DynamoDBMapperFieldModel.Id<T> id() {
                return this.id;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final Class<V> targetType() {
                return this.targetType;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final String attributeName() {
                return this.attributeName;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final DynamoDBAttributeType attributeType() {
                return this.attributeType;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final KeyType keyType() {
                return this.keyType;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final boolean versioned() {
                return this.versioned;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final Map<KeyType,List<String>> globalSecondaryIndexNames() {
                return this.globalSecondaryIndexNames;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final List<String> localSecondaryIndexNames() {
                return this.localSecondaryIndexNames;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final DynamoDBAutoGenerator<V> autoGenerator() {
                return this.autoGenerator;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final <S> DynamoDBTypeConverter<S,V> typeConverter() {
                return (DynamoDBTypeConverter<S,V>)this.typeConverter;
            }
        }

        /**
         * Properties builder.
         */
        static class Buildable<T,V> extends Immutable<T,V> {
            /**
             * Populates the builder properties with the specified defaults.
             */
            public Buildable(final Properties<T,V> ... defaults) {
                super(defaults);
            }

            /**
             * Sets the property identifier.
             */
            public final Buildable<T,V> withId(final DynamoDBMapperFieldModel.Id<T> id) {
                super.id = id;
                return this;
            }

            /**
             * Sets the target type.
             */
            public final Buildable<T,V> withTargetType(final Class<V> targetType) {
                super.targetType = targetType;
                return this;
            }

            /**
             * Sets the attribute name.
             */
            public final Buildable<T,V> withAttributeName(final String attributeName) {
                super.attributeName = attributeName;
                return this;
            }

            /**
             * Sets the scalar attribute type.
             */
            public final Buildable<T,V> withAttributeType(final DynamoDBAttributeType attributeType) {
                super.attributeType = attributeType;
                return this;
            }

            /**
             * Sets the key type.
             */
            public final Buildable<T,V> withKeyType(final KeyType keyType) {
                super.keyType = keyType;
                return this;
            }

            /**
             * Sets the key type.
             */
            public final Buildable<T,V> withVersioned(final boolean versioned) {
                super.versioned = versioned;
                return this;
            }

            /**
             * Sets the global secondary index names.
             */
            public final Buildable<T,V> withGlobalSecondaryIndexNames(final Map<KeyType,List<String>> names) {
                super.globalSecondaryIndexNames = names;
                return this;
            }

            /**
             * Sets the local secondary index names.
             */
            public final Buildable<T,V> withLocalSecondaryIndexNames(final List<String> names) {
                super.localSecondaryIndexNames = names;
                return this;
            }

            /**
             * Sets the auto-generator.
             */
            public final Buildable<T,V> withAutoGenerator(final DynamoDBAutoGenerator<V> autoGenerator) {
                super.autoGenerator = autoGenerator;
                return this;
            }

            /**
             * Sets the type-converter.
             */
            public final Buildable<T,V> withTypeConverter(final DynamoDBTypeConverter<?,V> typeConverter) {
                super.typeConverter = typeConverter;
                return this;
            }
        }
    }

    /**
     * Get/set reflection operations.
     * @param <T> The object type.
     * @param <V> The value type.
     */
    static interface Reflect<T,V> {
        public V get(T object);
        public void set(T object, V value);
    }

}
