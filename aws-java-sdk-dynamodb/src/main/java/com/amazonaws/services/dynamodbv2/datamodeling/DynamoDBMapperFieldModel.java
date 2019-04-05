/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
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

    private final DynamoDBMapperFieldModel.Properties<V> properties;
    private final DynamoDBTypeConverter<AttributeValue,V> converter;
    private final DynamoDBAttributeType attributeType;
    private final DynamoDBMapperFieldModel.Reflect<T,V> reflect;

    /**
     * Creates a new field model instance.
     * @param builder The builder.
     */
    private DynamoDBMapperFieldModel(final DynamoDBMapperFieldModel.Builder<T,V> builder) {
        this.properties = builder.properties;
        this.converter = builder.converter;
        this.attributeType = builder.attributeType;
        this.reflect = builder.reflect;
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
        return attributeType;
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
        return reflect.get(object);
    }

    /**
     * Sets the value on the object instance.
     * @param object The object instance.
     * @param value The value.
     */
    public final void set(final T object, final V value) {
        reflect.set(object, value);
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
        return properties.autoGenerator().generate(currentValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final AttributeValue convert(final V object) {
        return converter.convert(object);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final V unconvert(final AttributeValue object) {
        return converter.unconvert(object);
    }

    /**
     * Get the current value from the object and convert it.
     * @param object The object instance.
     * @return The converted value.
     */
    public final AttributeValue getAndConvert(final T object) {
        return convert(get(object));
    }

    /**
     * Unconverts the value and sets it on the object.
     * @param object The object instance.
     * @param value The attribute value.
     */
    public final void unconvertAndSet(final T object, final AttributeValue value) {
        set(object, unconvert(value));
    }

    /**
     * Gets the DynamoDB attribute type.
     * @return The DynamoDB attribute type.
     */
    public final DynamoDBAttributeType attributeType() {
        return attributeType;
    }

    /**
     * Gets the key type.
     * @return The key type if a key field, null otherwise.
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
     * Returns true if the field has any indexes.
     * @return True if the propery matches.
     */
    public final boolean indexed() {
        return !properties.globalSecondaryIndexNames().isEmpty() || !properties.localSecondaryIndexNames().isEmpty();
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
     * {@link DynamoDBMapperFieldModel} builder.
     */
    static class Builder<T,V> {
        private final DynamoDBMapperFieldModel.Properties<V> properties;
        private DynamoDBTypeConverter<AttributeValue,V> converter;
        private DynamoDBMapperFieldModel.Reflect<T,V> reflect;
        private DynamoDBAttributeType attributeType;
        private Class<T> targetType;

        public Builder(Class<T> targetType, DynamoDBMapperFieldModel.Properties<V> properties) {
            this.properties = properties;
            this.targetType = targetType;
        }

        public final Builder<T,V> with(DynamoDBTypeConverter<AttributeValue,V> converter) {
            this.converter = converter;
            return this;
        }

        public final Builder<T,V> with(DynamoDBAttributeType attributeType) {
            this.attributeType = attributeType;
            return this;
        }

        public final Builder<T,V> with(DynamoDBMapperFieldModel.Reflect<T,V> reflect) {
            this.reflect = reflect;
            return this;
        }

        public final DynamoDBMapperFieldModel<T,V> build() {
            final DynamoDBMapperFieldModel<T,V> result = new DynamoDBMapperFieldModel<T,V>(this);
            if ((result.keyType() != null || result.indexed()) && !result.attributeType().name().matches("[BNS]")) {
                throw new DynamoDBMappingException(String.format(
                    "%s[%s]; only scalar (B, N, or S) type allowed for key",
                    targetType.getSimpleName(), result.name()
                ));
            } else if (result.keyType() != null && result.getGenerateStrategy() == ALWAYS) {
                throw new DynamoDBMappingException(String.format(
                    "%s[%s]; auto-generated key and ALWAYS not allowed",
                    targetType.getSimpleName(), result.name()
                ));
            }
            return result;
        }
    }

    /**
     * The field model properties.
     */
    static interface Properties<V> {
        public String attributeName();
        public KeyType keyType();
        public boolean versioned();
        public Map<KeyType,List<String>> globalSecondaryIndexNames();
        public List<String> localSecondaryIndexNames();
        public DynamoDBAutoGenerator<V> autoGenerator();

        static final class Immutable<V> implements Properties<V> {
            private final String attributeName;
            private final KeyType keyType;
            private final boolean versioned;
            private final Map<KeyType,List<String>> globalSecondaryIndexNames;
            private final List<String> localSecondaryIndexNames;
            private final DynamoDBAutoGenerator<V> autoGenerator;

            public Immutable(final Properties<V> properties) {
                this.attributeName = properties.attributeName();
                this.keyType = properties.keyType();
                this.versioned = properties.versioned();
                this.globalSecondaryIndexNames = properties.globalSecondaryIndexNames();
                this.localSecondaryIndexNames = properties.localSecondaryIndexNames();
                this.autoGenerator = properties.autoGenerator();
            }

            @Override
            public final String attributeName() {
                return this.attributeName;
            }

            @Override
            public final KeyType keyType() {
                return this.keyType;
            }

            @Override
            public final boolean versioned() {
                return this.versioned;
            }

            @Override
            public final Map<KeyType,List<String>> globalSecondaryIndexNames() {
                return this.globalSecondaryIndexNames;
            }

            @Override
            public final List<String> localSecondaryIndexNames() {
                return this.localSecondaryIndexNames;
            }

            @Override
            public final DynamoDBAutoGenerator<V> autoGenerator() {
                return this.autoGenerator;
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
