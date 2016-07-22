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

import static com.amazonaws.services.dynamodbv2.model.KeyType.HASH;
import static com.amazonaws.services.dynamodbv2.model.KeyType.RANGE;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.Id;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GlobalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.LocalSecondaryIndex;
import com.amazonaws.services.dynamodbv2.model.Projection;
import com.amazonaws.services.dynamodbv2.model.ProjectionType;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Table model.
 *
 * @param <T> The object type.
 */
public final class DynamoDBMapperTableModel<T> implements DynamoDBTypeConverter<Map<String,AttributeValue>,T>  {

    private final Map<String,DynamoDBMapperFieldModel<T,Object>> fields;
    private final Map<KeyType,DynamoDBMapperFieldModel<T,Object>> keys;
    private final Map<String,GlobalSecondaryIndex> gsis;
    private final Map<String,LocalSecondaryIndex> lsis;
    private final Properties<T> properties;

    /**
     * Constructs a new table model for the specified class.
     * @param builder The builder.
     */
    private DynamoDBMapperTableModel(final DynamoDBMapperTableModel.Builder<T> builder) {
        this.properties = builder.properties;
        this.fields = builder.fields;
        this.keys = builder.keys;
        this.gsis = builder.globalSecondaryIndexes();
        this.lsis = builder.localSecondaryIndexes();
    }

    /**
     * Gets the object type.
     * @return The object type.
     */
    public Class<T> targetType() {
        return properties.targetType();
    }

    /**
     * Gets the table name.
     * @return The table name.
     */
    public String tableName() {
        return properties.tableName();
    }

    /**
     * Gets all the field models for the given class.
     * @return The field models.
     */
    public Collection<DynamoDBMapperFieldModel<T,Object>> fields() {
        return fields.values();
    }

    /**
     * Gets the field model for a given attribute.
     * @param <V> The field model's value type.
     * @param attributeName The attribute name.
     * @return The field model.
     */
    public <V> DynamoDBMapperFieldModel<T,V> field(final String attributeName) {
        if (!fields.containsKey(attributeName)) {
            throw new DynamoDBMappingException((new Id(targetType(), attributeName)).format("not mapped on object model"));
        }
        return (DynamoDBMapperFieldModel<T,V>)fields.get(attributeName);
    }

    /**
     * Gets the field model for a given key type.
     * @param <V> The field model's value type.
     * @param keyType The key type.
     * @return The field model.
     */
    public <V> DynamoDBMapperFieldModel<T,V> field(final KeyType keyType) {
        if (!keys.containsKey(keyType)) {
            throw new DynamoDBMappingException(new Id(targetType(), keyType.name()).format("not mapped on object model"));
        }
        return (DynamoDBMapperFieldModel<T,V>)keys.get(keyType);
    }

    /**
     * Gets all the key field models for the given class.
     * @return The field models.
     */
    public Collection<DynamoDBMapperFieldModel<T,Object>> keys() {
        return keys.values();
    }

    /**
     * Gets the hash key field model for the specified type.
     * @param <H> The hash key type.
     * @return The hash key field model.
     * @throws DynamoDBMappingException If the hash key is not present.
     */
    public <H> DynamoDBMapperFieldModel<T,H> hashKey() {
        return (DynamoDBMapperFieldModel<T,H>)field(HASH);
    }

    /**
     * Gets the range key field model for the specified type.
     * @param <R> The range key type.
     * @return The range key field model.
     * @throws DynamoDBMappingException If the range key is not present.
     */
    public <R> DynamoDBMapperFieldModel<T,R> rangeKey() {
        return (DynamoDBMapperFieldModel<T,R>)field(RANGE);
    }

    /**
     * Gets the range key field model for the specified type.
     * @param <R> The range key type.
     * @return The range key field model, or null if not present.
     */
    public <R> DynamoDBMapperFieldModel<T,R> rangeKeyIfExists() {
        return (DynamoDBMapperFieldModel<T,R>)keys.get(RANGE);
    }

    /**
     * Gets the global secondary indexes for the given class.
     * @return The map of index name to GlobalSecondaryIndexes.
     */
    public Collection<GlobalSecondaryIndex> globalSecondaryIndexes() {
        if (gsis.isEmpty()) {
            return Collections.emptyList();
        }
        final Collection<GlobalSecondaryIndex> copies = new ArrayList<GlobalSecondaryIndex>(gsis.size());
        for (final String indexName : gsis.keySet()) {
            copies.add(globalSecondaryIndex(indexName));
        }
        return copies;
    }

    /**
     * Gets the global secondary index.
     * @param indexName The index name.
     * @return The global secondary index or null.
     */
    public GlobalSecondaryIndex globalSecondaryIndex(final String indexName) {
        if (!gsis.containsKey(indexName)) {
            return null;
        }
        final GlobalSecondaryIndex gsi = gsis.get(indexName);
        final GlobalSecondaryIndex copy = new GlobalSecondaryIndex().withIndexName(gsi.getIndexName());
        copy.withProjection(new Projection().withProjectionType(gsi.getProjection().getProjectionType()));
        for (final KeySchemaElement key : gsi.getKeySchema()) {
            copy.withKeySchema(new KeySchemaElement(key.getAttributeName(), key.getKeyType()));
        }
        return copy;
    }

    /**
     * Gets the local secondary indexes for the given class.
     * @param indexNames The index names.
     * @return The map of index name to LocalSecondaryIndexes.
     */
    public Collection<LocalSecondaryIndex> localSecondaryIndexes() {
        if (lsis.isEmpty()) {
            return Collections.emptyList();
        }
        final Collection<LocalSecondaryIndex> copies = new ArrayList<LocalSecondaryIndex>(lsis.size());
        for (final String indexName : lsis.keySet()) {
            copies.add(localSecondaryIndex(indexName));
        }
        return copies;
    }

    /**
     * Gets the local secondary index by name.
     * @param indexNames The index name.
     * @return The local secondary index, or null.
     */
    public LocalSecondaryIndex localSecondaryIndex(final String indexName) {
        if (!lsis.containsKey(indexName)) {
            return null;
        }
        final LocalSecondaryIndex lsi = lsis.get(indexName);
        final LocalSecondaryIndex copy = new LocalSecondaryIndex().withIndexName(lsi.getIndexName());
        copy.withProjection(new Projection().withProjectionType(lsi.getProjection().getProjectionType()));
        for (final KeySchemaElement key : lsi.getKeySchema()) {
            copy.withKeySchema(new KeySchemaElement(key.getAttributeName(), key.getKeyType()));
        }
        return copy;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,AttributeValue> convert(final T object) {
        if (object == null) {
            return null;
        }
        final Map<String,AttributeValue> map = new LinkedHashMap<String,AttributeValue>();
        for (final DynamoDBMapperFieldModel<T,Object> field : fields()) {
            final AttributeValue value = field.getAndConvert(object);
            if (value != null) {
                map.put(field.name(), value);
            }
        }
        return map;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T unconvert(final Map<String,AttributeValue> object) {
        final T result;
        try {
            result = targetType().newInstance();
        } catch (final Exception e) {
            throw new DynamoDBMappingException("could not instantiate " + targetType(), e);
        }
        if (object != null && !object.isEmpty()) {
            for (final DynamoDBMapperFieldModel<T,Object> field : fields()) {
                final AttributeValue value = object.get(field.name());
                if (value != null) {
                    field.unconvertAndSet(result, value);
                }
            }
        }
        return result;
    }

    /**
     * Creates a new object instance with the keys populated.
     * @param <H> The hash key type.
     * @param <R> The range key type.
     * @param hashKey The hash key.
     * @param rangeKey The range key (optional if not present on table).
     * @return The new instance.
     */
    public <H,R> T newKey(final H hashKey, final R rangeKey) {
        final T key;
        try {
            key = targetType().newInstance();
        } catch (final Exception e) {
            throw new DynamoDBMappingException("could not instantiate " + targetType(), e);
        }
        if (hashKey != null) {
            final DynamoDBMapperFieldModel<T,H> hk = hashKey();
            hk.set(key, hashKey);
        }
        if (rangeKey != null) {
            final DynamoDBMapperFieldModel<T,R> rk = rangeKey();
            rk.set(key, rangeKey);
        }
        return key;
    }

    /**
     * Creates a new key map from the specified hash and range key.
     * @param <H> The hash key type.
     * @param <R> The range key type.
     * @param hashKey The hash key.
     * @param rangeKey The range key (optional if not present on table).
     * @return The key map.
     */
    public <H,R> Map<String,AttributeValue> mapKey(final H hashKey, final R rangeKey) {
        final Map<String,AttributeValue> key = new LinkedHashMap<String,AttributeValue>(4);
        if (hashKey != null) {
            final DynamoDBMapperFieldModel<T,H> hk = hashKey();
            key.put(hk.name(), hk.convert(hashKey));
        }
        if (rangeKey != null) {
            final DynamoDBMapperFieldModel<T,R> rk = rangeKey();
            key.put(rk.name(), rk.convert(rangeKey));
        }
        if (key.isEmpty()) {
            throw new DynamoDBMappingException("no key(s) present on " + targetType());
        }
        return key;
    }

    /**
     * Creates a new key map from the specified object.
     * @param <H> The hash key type.
     * @param <R> The range key type.
     * @param object The object instance.
     * @return The key map.
     */
    public <H,R> Map<String,AttributeValue> mapKey(final T object) {
        final Map<String,AttributeValue> key = new LinkedHashMap<String,AttributeValue>(4);
        for (final DynamoDBMapperFieldModel<T,Object> field : keys()) {
            final AttributeValue value = field.getAndConvert(object);
            if (value == null) {
                throw new DynamoDBMappingException(field.id().format("must not have null value for %s key", field.keyType()));
            }
            key.put(field.name(), value);
        }
        if (key.isEmpty()) {
            throw new DynamoDBMappingException("no key(s) present on " + targetType());
        }
        return key;
    }

    /**
     * Determnes if any of the primary keys require auto-generation.
     * @param object The object instance.
     * @param saveBehavior The save behaviour.
     * @return True if any keys should be auto-generated.
     */
    public boolean anyKeyGeneratable(final T object, final SaveBehavior saveBehavior) {
        if (keys().isEmpty()) {
            throw new DynamoDBMappingException("no key(s) present on " + targetType());
        }
        for (final DynamoDBMapperFieldModel<T,Object> field : keys()) {
            if (field.canGenerate(object, saveBehavior, null)) {
                return true;
            }
        }
        return false;
    }

    /**
     * The table model properties.
     */
    static interface Properties<T> {
        public Class<T> targetType();
        public String tableName();

         /**
          * Properties builder.
          */
        static final class Builder<T> implements Properties<T> {
            private Class<T> targetType;
            private String tableName;

            /**
             * Populates the builder properties with the specified defaults.
             * @param defaults The default properties.
             * @return This builder instance for chaining.
             */
            public Builder<T> with(final Properties<T> defaults) {
                this.targetType = defaults.targetType();
                this.tableName = defaults.tableName();
                return this;
            }

            /**
             * Sets the target type.
             * @param targetType The target type.
             * @return This builder instance for chaining.
             */
            public Builder<T> withTargetType(final Class<T> targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * Sets the table name.
             * @param tableName The table name.
             * @return This builder instance for chaining.
             */
            public Builder<T> withTableName(final String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public Class<T> targetType() {
                return targetType;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public String tableName() {
                return tableName;
            }
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} builder.
     */
    static class Builder<T> {
        private final Map<String,DynamoDBMapperFieldModel<T,Object>> fields;
        private final Map<KeyType,DynamoDBMapperFieldModel<T,Object>> keys;
        private final Properties.Builder<T> properties;

        /**
         * Construts a new builder.
         * @param defaults The default properties.
         */
        public Builder(final Properties<T> defaults) {
            this.fields = new LinkedHashMap<String,DynamoDBMapperFieldModel<T,Object>>();
            this.keys = new LinkedHashMap<KeyType,DynamoDBMapperFieldModel<T,Object>>(4);
            this.properties = new Properties.Builder().with(defaults);
        }

        /**
         * Sets the table name.
         * @param tableName The table name.
         * @return This builder instance for chaining.
         */
        public Builder<T> withTableName(final String tableName) {
            this.properties.withTableName(tableName);
            return this;
        }

        /**
         * Adds a field model to this builder.
         * @param field The field model.
         * @return This builder instance for chaining.
         */
        public Builder<T> with(final DynamoDBMapperFieldModel field) {
            if (fields.put(field.name(), field) != null) {
                throw new DynamoDBMappingException(field.id().format("must not duplicate attribute name"));
            }
            if (field.keyType() != null && keys.put(field.keyType(), field) != null) {
                throw new DynamoDBMappingException(field.id().format("must not specify multiple %s key(s)", field.keyType()));
            }
            return this;
        }

        /**
         * Builds the GSI mappings.
         * @return The mappings.
         */
        public Map<String,GlobalSecondaryIndex> globalSecondaryIndexes() {
            final Map<String,GlobalSecondaryIndex> map = new LinkedHashMap<String,GlobalSecondaryIndex>();
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.globalSecondaryIndexNames(HASH)) {
                    final GlobalSecondaryIndex gsi = new GlobalSecondaryIndex().withIndexName(indexName);
                    if (map.put(indexName, gsi) != null) {
                        throw new DynamoDBMappingException(field.id().format("must not contain duplicate GSI named %s", indexName));
                    }
                    gsi.withProjection(new Projection().withProjectionType(ProjectionType.KEYS_ONLY));
                    gsi.withKeySchema(new KeySchemaElement(field.name(), HASH));
                }
            }
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.globalSecondaryIndexNames(RANGE)) {
                    final GlobalSecondaryIndex gsi = map.get(indexName);
                    if (gsi == null) {
                        throw new DynamoDBMappingException(field.id().format("no HASH key present for GSI named %s", indexName));
                    }
                    gsi.withKeySchema(new KeySchemaElement(field.name(), RANGE));
                }
            }
            return Collections.unmodifiableMap(map);
        }

        /**
         * Builds the LSI mappings.
         * @return The mappings.
         */
        public Map<String,LocalSecondaryIndex> localSecondaryIndexes() {
            final Map<String,LocalSecondaryIndex> map = new LinkedHashMap<String,LocalSecondaryIndex>();
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.localSecondaryIndexNames()) {
                    final LocalSecondaryIndex lsi = new LocalSecondaryIndex().withIndexName(indexName);
                    if (map.put(indexName, lsi) != null) {
                        throw new DynamoDBMappingException(field.id().format("must not contain duplicate LocalSecondaryIndexes named %s", indexName));
                    }
                    lsi.withProjection(new Projection().withProjectionType(ProjectionType.KEYS_ONLY));
                    lsi.withKeySchema(new KeySchemaElement(keys.get(HASH).name(), HASH));
                    lsi.withKeySchema(new KeySchemaElement(field.name(), RANGE));
                }
            }
            return Collections.unmodifiableMap(map);
        }

        /**
         * Builds the instance.
         * @return The built instance.
         */
        public final DynamoDBMapperTableModel<T> build() {
            return new DynamoDBMapperTableModel(this);
        }
    }

}
