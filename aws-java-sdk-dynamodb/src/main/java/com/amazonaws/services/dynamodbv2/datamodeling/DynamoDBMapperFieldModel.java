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

import static com.amazonaws.services.dynamodbv2.model.KeyType.HASH;
import static com.amazonaws.services.dynamodbv2.model.KeyType.RANGE;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

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

    private final Id<T> id;
    private final Reflect<T,V> reflect;
    private final DynamoDBTypeConverter<AttributeValue,V> converter;
    private final DynamoDBAttributeType dynamoDBAttributeType;
    private final Properties<V> properties;

    @Deprecated
    private ArgumentMarshaller argumentMarshaller;

    /**
     * {@deprecated}
     */
    @Deprecated
    public DynamoDBMapperFieldModel(
            String dynamoDBAttributeName,
            DynamoDBAttributeType dynamoDBAttributeType,
            ArgumentMarshaller argumentMarshaller) {
        this.id = new Id((Class<T>)Void.class, dynamoDBAttributeName);
        this.properties = new Properties.Builder().withAttributeName(dynamoDBAttributeName);
        this.reflect = null;
        this.converter = null;
        this.dynamoDBAttributeType = dynamoDBAttributeType;
        this.argumentMarshaller = argumentMarshaller;
    }

    /**
     * Creates a new field model instance.
     * @param builder The builder.
     */
    private DynamoDBMapperFieldModel(final Builder<T,V> builder) {
        this.id = builder.id;
        this.properties = builder.properties;
        this.reflect = builder.reflect;
        this.converter = builder.converter;
        this.dynamoDBAttributeType = builder.dynamoDBAttributeType;
    }

    /**
     * Returns the name of the DynamoDB attribute this mapped field will be
     * stored as.
     */
    public String getDynamoDBAttributeName() {
        return properties.attributeName();
    }

    /**
     * Returns the type of the DynamoDB attribute this mapped field will be
     * stored as.
     */
    public DynamoDBAttributeType getDynamoDBAttributeType() {
        return dynamoDBAttributeType;
    }

    /**
     * (Internal usage only)
     * Returns the argument marshaller that is bound to this mapped field.
     */
    @Deprecated
    ArgumentMarshaller getArgumentMarshaller() {
        return argumentMarshaller;
    }

    /**
     * Gets the ID.
     * @return The ID.
     */
    public final Id<T> id() {
        return id;
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
            throw new DynamoDBMappingException(id.format("could not get"), e);
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
            throw new DynamoDBMappingException(id.format("could not set"), e);
        }
    }

    /**
     * Determines if the mapping value can be auto-generated.
     * @param object The object instance.
     * @param saveBehavior The save behaviour.
     * @param model The table model.
     * @return True if can be auto-generated, false otherwise.
     */
    public final boolean canGenerate(final T object, final SaveBehavior saveBehavior, final DynamoDBMapperTableModel<T> model) {
        if (getGenerateStrategy() == null) {
            return false;
        } else if (DynamoDBAutoGenerateStrategy.ALWAYS == getGenerateStrategy()) {
            return true;
        } else if (get(object) != null) {
            return false;
        } else if (anyKey()) {
            return true;
        } else if (saveBehavior == SaveBehavior.CLOBBER || saveBehavior == SaveBehavior.UPDATE) {
            return true;
        } else if (model != null && model.anyKeyGeneratable(object, saveBehavior)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Indicates if this attribute is a version attribute.
     * @return True if it is, false otherwise.
     */
    public final boolean versioned() {
        if (properties.autoGenerator() != null) {
            return properties.autoGenerator().getClass() == DynamoDBVersionAttribute.Generator.class;
        }
        return false;
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
            throw new DynamoDBMappingException(id.format("could not generate"), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final AttributeValue convert(final V object) {
        try {
            return converter.convert(object);
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id.format("could not convert"), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final V unconvert(final AttributeValue object) {
        try {
            return converter.unconvert(object);
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id.format("could not unconvert"), e);
        }
    }

    /**
     * Gets the key type.
     * @return The key type, or null if not a key.
     */
    public final KeyType keyType() {
        return properties.keyType();
    }

    /**
     * Gets the global secondary indexes.
     * @param keyType The key type.
     * @return The list of global secondary indexes.
     */
    public final List<String> globalSecondaryIndexNames(final KeyType keyType) {
        return properties.globalSecondaryIndexNames(keyType);
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
    public final boolean anyKey(KeyType ... keyTypes) {
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
     * Gets the attribute deinition for this field.
     * @return The attribute definition.
     */
    public final AttributeDefinition definition() {
        try {
            return new AttributeDefinition(name(), ScalarAttributeType.valueOf(getDynamoDBAttributeType().name()));
        } catch (final RuntimeException e) {
            throw new DynamoDBMappingException(id.format("must be scalar (B, N, or S) but is " + getDynamoDBAttributeType()), e);
        }
    }

    /**
     * Get the current value from the object and generates a new value.
     * @param object The object instance.
     * @return The generated value.
     */
    public final AttributeValue generateAndConvert(final T object) {
        return convert(generate(get(object)));
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
     * Converts the object values into {@code AttributeValue}s.
     * @param values The object values.
     * @return The attribute values.
     */
    public final Collection<AttributeValue> convertAll(final Collection<V> values) {
        final Collection<AttributeValue> converted = new ArrayList<AttributeValue>(values.size());
        for (final V value : values) {
            converted.add(convert(value));
        }
        return converted;
    }

    /**
     * Unconverts the {@code AttributeValue}s into the object value.
     * @param values The attribute values.
     * @return The field model values.
     */
    public final Collection<V> unconvertAll(final Collection<AttributeValue> values) {
        final Collection<V> unconverted = new ArrayList<V>(values.size());
        for (final AttributeValue value : values) {
            unconverted.add(unconvert(value));
        }
        return unconverted;
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
        return new Condition().withComparisonOperator(ComparisonOperator.BEGINS_WITH).withAttributeValueList(convert(value));
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
        return new Condition().withComparisonOperator(ComparisonOperator.BETWEEN).withAttributeValueList(convert(lo), convert(hi));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#CONTAINS
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition contains(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.CONTAINS).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#EQ
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition eq(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.EQ).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#GE
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition ge(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.GE).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#GT
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition gt(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.GT).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified values.
     * @param values The values.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#IN
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition in(final V ... values) {
        return new Condition().withComparisonOperator(ComparisonOperator.IN).withAttributeValueList(convertAll(Arrays.asList(values)));
    }

    /**
     * Creates a condition which filters on the specified values.
     * @param values The values.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#IN
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition in(final Collection<V> values) {
        return new Condition().withComparisonOperator(ComparisonOperator.IN).withAttributeValueList(convertAll(values));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NULL
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition isNull() {
        return new Condition().withComparisonOperator(ComparisonOperator.NULL);
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#LE
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition le(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.LE).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#LT
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition lt(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.LT).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NE
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition ne(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.NE).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @param value The value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NOT_CONTAINS
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition notContains(final V value) {
        return new Condition().withComparisonOperator(ComparisonOperator.NOT_CONTAINS).withAttributeValueList(convert(value));
    }

    /**
     * Creates a condition which filters on the specified value.
     * @return The condition.
     * @see com.amazonaws.services.dynamodbv2.model.ComparisonOperator#NOT_NULL
     * @see com.amazonaws.services.dynamodbv2.model.Condition
     */
    public final Condition notNull() {
        return new Condition().withComparisonOperator(ComparisonOperator.NOT_NULL);
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
    public static final class Id<T> {
        private final Class<T> type;
        private final String name;

        /**
         * Construts a new field identifier.
         * @param type The object type.
         * @param name The attribute name.
         */
        public Id(final Class<T> type, final String name) {
            this.type = type;
            this.name = name;
        }

        /**
         * Gets the attribute name.
         * @return The attribute name.
         */
        public String name() {
            return this.name;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final boolean equals(final Object o) {
            return o instanceof Id && ((Id)o).type == type && ((Id)o).name.equals(name);
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final int hashCode() {
            return type.hashCode() ^ name.hashCode();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public final String toString() {
            return new StringBuilder().append(type.getName()).append("[").append(name).append("]").toString();
        }

        /**
         * Formats an exception message with the identifier.
         * @param message The exception message.
         * @param args Optional formatting arguments.
         * @return The formatted message.
         */
        public final String format(String message, final Object ... args) {
            if (message != null && args.length > 0) {
                try {
                    message = String.format(message, args);
                } catch (final RuntimeException no) {}
            }
            return new StringBuilder().append("Field ").append(this).append(" ").append(message).toString();
        }
    }

    /**
     * Get/set reflection operations.
     * @param <T> The object type.
     * @param <V> The value type.
     */
    static interface Reflect<T,V> {
        public Class<V> targetType();
        public V get(T object);
        public void set(T object, V value);
    }

    /**
     * The field model properties.
     */
    static interface Properties<V> {
        public Class<V> targetType();
        public String attributeName();
        public KeyType keyType();
        public List<String> globalSecondaryIndexNames(KeyType keyType);
        public List<String> localSecondaryIndexNames();
        public DynamoDBAutoGenerator<V> autoGenerator();

        /**
         * Properties builder.
         */
        static final class Builder<V> implements Properties<V> {
            private Map<KeyType,List<String>> gsis = Collections.emptyMap();
            private List<String> lsis = Collections.emptyList();
            private DynamoDBAutoGenerator<V> autoGenerator;
            private String attributeName;
            private Class<V> targetType;
            private KeyType keyType;

            /**
             * Populates the builder properties with the specified defaults.
             * @param defaults The default properties.
             * @return This builder instance for chaining.
             */
            public Builder<V> with(final Properties<V> defaults) {
                this.targetType = defaults.targetType();
                this.attributeName = defaults.attributeName();
                this.keyType = defaults.keyType();
                this.autoGenerator = defaults.autoGenerator();
                this.lsis = defaults.localSecondaryIndexNames();
                for (final KeyType keyType : KeyType.values()) {
                    final List<String> names = defaults.globalSecondaryIndexNames(keyType);
                    if (!names.isEmpty()) {
                        if (this.gsis.isEmpty()) {
                            this.gsis = new LinkedHashMap<KeyType,List<String>>();
                        }
                        this.gsis.put(keyType, names);
                    }
                }
                return this;
            }

            /**
             * Sets the target type.
             * @param targetType The target type.
             * @return This builder instance for chaining.
             */
            public Builder<V> withTargetType(final Class<V> targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * Sets the attribute name.
             * @param attributeName The attribute name.
             * @return This builder instance for chaining.
             */
            public Builder<V> withAttributeName(final String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public Class<V> targetType() {
                return targetType;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public String attributeName() {
                return attributeName;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public KeyType keyType() {
                return keyType;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public List<String> globalSecondaryIndexNames(final KeyType keyType) {
                return gsis.containsKey(keyType) ? gsis.get(keyType) : Collections.<String>emptyList();
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public List<String> localSecondaryIndexNames() {
                return lsis;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public DynamoDBAutoGenerator<V> autoGenerator() {
                return autoGenerator;
            }
        }
    }

    /**
     * {@link DynamoDBMapperFieldModel} builder.
     */
    static final class Builder<T,V> {
        private final Id<T> id;
        private final Properties.Builder<V> properties;
        private DynamoDBTypeConverter<AttributeValue,V> converter;
        private DynamoDBAttributeType dynamoDBAttributeType;
        private Reflect<T,V> reflect;

        /**
         * Construts a new builder.
         * @param type The object type.
         * @param name The attribute name.
         * @param defaults The default properties.
         */
        public Builder(final Id<T> id, final Properties<V> defaults) {
            this.properties = new Properties.Builder().with(defaults).withAttributeName(id.name());
            this.id = id;
        }

        /**
         * Sets the object's reflection property.
         * @param reflect The object's refleciton property.
         * @return This builder instance for chaining.
         */
        public Builder<T,V> with(final Reflect<T,V> reflect) {
            this.reflect = reflect;
            return this;
        }

        /**
         * Sets the attribute value converter.
         * @param converter The attribute value converter.
         * @return This builder instance for chaining.
         */
        public Builder<T,V> with(final DynamoDBTypeConverter<AttributeValue,V> converter) {
            this.converter = converter;
            return this;
        }

        /**
         * Sets the DynamoDB attribute type.
         * @param dynanmoDBAttributeType The DynamoDB attribute type.
         * @return This builder instance for chaining.
         */
        public Builder<T,V> with(final DynamoDBAttributeType dynamoDBAttributeType) {
            this.dynamoDBAttributeType = dynamoDBAttributeType;
            return this;
        }

        /**
         * Builds the instance.
         * @return The built instance.
         */
        public final DynamoDBMapperFieldModel<T,V> build() {
            final DynamoDBMapperFieldModel<T,V> field = new DynamoDBMapperFieldModel<T,V>(this);
            if (field.keyType() != null && field.getGenerateStrategy() == DynamoDBAutoGenerateStrategy.ALWAYS) {
                throw new DynamoDBMappingException(id.format("must not have auto-generated key with ALWAYS strategy"));
            }
            return field;
        }
    }

}
