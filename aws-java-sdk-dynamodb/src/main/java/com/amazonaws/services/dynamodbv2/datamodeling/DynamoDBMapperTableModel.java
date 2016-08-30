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
import static com.amazonaws.services.dynamodbv2.model.ProjectionType.KEYS_ONLY;

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
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Table model.
 *
 * @param <T> The object type.
 */
public final class DynamoDBMapperTableModel<T> implements DynamoDBTypeConverter<Map<String,AttributeValue>,T>  {

    private final Map<String,GlobalSecondaryIndex> globalSecondaryIndexes;
    private final Map<String,LocalSecondaryIndex> localSecondaryIndexes;
    private final Map<String,DynamoDBMapperFieldModel<T,Object>> fields;
    private final Map<KeyType,DynamoDBMapperFieldModel<T,Object>> keys;
    private final DynamoDBMapperTableModel.Properties<T> properties;

    /**
     * Constructs a new table model for the specified class.
     * @param builder The builder.
     */
    private DynamoDBMapperTableModel(final DynamoDBMapperTableModel.Builder<T> builder) {
        this.properties = new DynamoDBMapperTableModel.Properties.Immutable(builder);
        this.globalSecondaryIndexes = builder.globalSecondaryIndexes();
        this.localSecondaryIndexes = builder.localSecondaryIndexes();
        this.fields = Collections.unmodifiableMap(builder.fields);
        this.keys = Collections.unmodifiableMap(builder.keys);
    }

    /**
     * Gets the ID.
     * @return The ID.
     */
    final DynamoDBMapperTableModel.Id<T> id() {
        return properties.id();
    }

    /**
     * Gets the object type.
     * @return The object type.
     */
    public Class<T> targetType() {
        return properties.targetType();
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
            throw new DynamoDBMappingException(id().err("does not map %s on model", attributeName));
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
            throw new DynamoDBMappingException(id().err("does not map %s key on model", keyType));
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
        if (globalSecondaryIndexes.isEmpty()) {
            return null;
        }
        final Collection<GlobalSecondaryIndex> copies = new ArrayList(globalSecondaryIndexes.size());
        for (final String indexName : globalSecondaryIndexes.keySet()) {
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
        if (!globalSecondaryIndexes.containsKey(indexName)) {
            return null;
        }
        final GlobalSecondaryIndex gsi = globalSecondaryIndexes.get(indexName);
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
        if (localSecondaryIndexes.isEmpty()) {
            return null;
        }
        final Collection<LocalSecondaryIndex> copies = new ArrayList(localSecondaryIndexes.size());
        for (final String indexName : localSecondaryIndexes.keySet()) {
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
        if (!localSecondaryIndexes.containsKey(indexName)) {
            return null;
        }
        final LocalSecondaryIndex lsi = localSecondaryIndexes.get(indexName);
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
        final Map<String,AttributeValue> map = new LinkedHashMap<String,AttributeValue>();
        for (final DynamoDBMapperFieldModel<T,Object> field : fields()) {
            final AttributeValue value = field.convert(field.get(object));
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
            throw new DynamoDBMappingException(id().err("could not instantiate %s", targetType()));
        }
        if (!object.isEmpty()) {
            for (final DynamoDBMapperFieldModel<T,Object> field : fields()) {
                final AttributeValue value = object.get(field.name());
                if (value != null) {
                    field.set(result, field.unconvert(value));
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
    public <H,R> T asKey(final H hashKey, final R rangeKey) {
        final T object;
        try {
            object = targetType().newInstance();
        } catch (final Exception e) {
            throw new DynamoDBMappingException(id().err("could not instantiate %s", targetType()));
        }
        if (hashKey != null) {
            final DynamoDBMapperFieldModel<T,H> hk = hashKey();
            hk.set(object, hashKey);
        }
        if (rangeKey != null) {
            final DynamoDBMapperFieldModel<T,R> rk = rangeKey();
            rk.set(object, rangeKey);
        }
        return object;
    }

    /**
     * Creates a new key map from the specified object.
     * @param <H> The hash key type.
     * @param <R> The range key type.
     * @param object The object instance.
     * @return The key map.
     */
    public <H,R> DynamoDBMapperTableModel<T>.Key<H,R> convertKey(final T key) {
        final DynamoDBMapperFieldModel<T,H> hk = hashKey();
        final DynamoDBMapperFieldModel<T,R> rk = rangeKeyIfExists();
        return new Key().withHashKey(hk.get(key)).withRangeKey(rk == null ? (R)null : rk.get(key));
    }

    /**
     * Creates a new key map from the specified hash and range key.
     * @param <H> The hash key type.
     * @param <R> The range key type.
     * @param hashKey The hash key.
     * @param rangeKey The range key (optional if not present on table).
     * @return The key map.
     */
    public <H,R> DynamoDBMapperTableModel<T>.Key<H,R> convertKey(final H hashKey, final R rangeKey) {
        return new Key().withHashKey(hashKey).withRangeKey(rangeKey);
    }

    /**
     * Holds the hash and range key attribute value map.
     */
    public final class Key<H,R> extends LinkedHashMap<String,AttributeValue> {
        private Key() {
            super(4);
        }
        private Key<H,R> withHashKey(final H hashKey) {
            if (hashKey != null) {
                final DynamoDBMapperFieldModel<T,H> hk = DynamoDBMapperTableModel.this.<H>hashKey();
                put(hk.name(), hk.convert(hashKey));
            } else {
                throw new DynamoDBMappingException(hashKey().id().err("no HASH key value present"));
            }
            return this;
        }
        private Key<H,R> withRangeKey(final R rangeKey) {
            if (rangeKey != null) {
                final DynamoDBMapperFieldModel<T,R> rk = DynamoDBMapperTableModel.this.<R>rangeKey();
                put(rk.name(), rk.convert(rangeKey));
            } else if (DynamoDBMapperTableModel.this.rangeKeyIfExists() != null) {
                throw new DynamoDBMappingException(rangeKey().id().err("no RANGE key value present"));
            }
            return this;
        }
    }

    /**
     * The table identifier for formatting error messages.
     */
    public static class Id<T> {
        private final Class<T> type;

        /**
         * Constructs a new identifier.
         */
        public Id(final Class<T> type) {
            this.type = type;
        }

        /**
         * Constructs a new identifier from an existing.
         */
        public Id(final Id<T> id) {
            this(id.type);
        }

        /**
         * Formats an exception message with the identifier.
         */
        public final String err(String message, final Object ... args) {
            if (message != null && args.length > 0) {
                try {
                    message = String.format(message, args);
                } catch (final RuntimeException no) {}
            }
            return new StringBuilder().append(this).append(": ").append(message).toString();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean equals(final Object o) {
            return o instanceof Id && ((Id)o).type == type;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public int hashCode() {
            return type.hashCode();
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public String toString() {
            return type.getSimpleName();
        }
    }

    /**
     * {@link DynamoDBMapperTableModel} builder.
     */
    static class Builder<T> extends DynamoDBMapperTableModel.Properties.Buildable<T> {
        private final Map<String,DynamoDBMapperFieldModel<T,Object>> fields;
        private final Map<KeyType,DynamoDBMapperFieldModel<T,Object>> keys;

        /**
         * Constructs a new builder with the optional defaults.
         */
        public Builder(final DynamoDBMapperTableModel.Properties<T> ... defaults) {
            super(defaults);
            this.fields = new LinkedHashMap<String,DynamoDBMapperFieldModel<T,Object>>();
            this.keys = new EnumMap<KeyType,DynamoDBMapperFieldModel<T,Object>>(KeyType.class);
        }

        /**
         * Adds a field model to this builder.
         */
        public final Builder<T> with(final DynamoDBMapperFieldModel field) {
            if (fields.put(field.name(), field) != null) {
                throw new DynamoDBMappingException(field.id().err(
                    "must not duplicate attribute name"));
            }
            if (field.keyType() != null && keys.put(field.keyType(), field) != null) {
                throw new DynamoDBMappingException(field.id().err(
                    "must not specify multiple %s key(s)", field.keyType()));
            }
            return this;
        }

        /**
         * Builds the GSI mappings.
         */
        public final Map<String,GlobalSecondaryIndex> globalSecondaryIndexes() {
            final Map<String,GlobalSecondaryIndex> map = new LinkedHashMap<String,GlobalSecondaryIndex>();
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.globalSecondaryIndexNames(HASH)) {
                    final GlobalSecondaryIndex gsi = new GlobalSecondaryIndex().withIndexName(indexName);
                    if (map.put(indexName, gsi) != null) {
                        throw new DynamoDBMappingException(field.id().err(
                            "must not contain duplicate GSI named %s", indexName));
                    }
                    gsi.withProjection(new Projection().withProjectionType(KEYS_ONLY));
                    gsi.withKeySchema(new KeySchemaElement(field.name(), HASH));
                }
            }
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.globalSecondaryIndexNames(RANGE)) {
                    final GlobalSecondaryIndex gsi = map.get(indexName);
                    if (gsi == null) {
                        throw new DynamoDBMappingException(field.id().err(
                            "no HASH key present for GSI named %s", indexName));
                    }
                    gsi.withKeySchema(new KeySchemaElement(field.name(), RANGE));
                }
            }
            if (!map.isEmpty()) {
                return Collections.unmodifiableMap(map);
            }
            return Collections.emptyMap();
        }

        /**
         * Builds the LSI mappings.
         */
        public final Map<String,LocalSecondaryIndex> localSecondaryIndexes() {
            final Map<String,LocalSecondaryIndex> map = new LinkedHashMap<String,LocalSecondaryIndex>();
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.localSecondaryIndexNames()) {
                    final LocalSecondaryIndex lsi = new LocalSecondaryIndex().withIndexName(indexName);
                    if (map.put(indexName, lsi) != null) {
                        throw new DynamoDBMappingException(field.id().err(
                            "must not contain duplicate LSI named %s", indexName));
                    }
                    lsi.withProjection(new Projection().withProjectionType(KEYS_ONLY));
                    lsi.withKeySchema(new KeySchemaElement(keys.get(HASH).name(), HASH));
                    lsi.withKeySchema(new KeySchemaElement(field.name(), RANGE));
                }
            }
            if (!map.isEmpty()) {
                return Collections.unmodifiableMap(map);
            }
            return Collections.emptyMap();
        }

        /**
         * Builds the instance.
         */
        public final DynamoDBMapperTableModel<T> build() {
            if (tableName() != null && keys.get(HASH) == null) {
                throw new DynamoDBMappingException(id().err("does not map HASH key on model"));
            }
            return new DynamoDBMapperTableModel(this);
        }
    }

    /**
     * The table model properties.
     */
    static interface Properties<T> {
        public DynamoDBMapperTableModel.Id<T> id();
        public Class<T> targetType();
        public String tableName();

        /**
         * Immutable properties.
         */
        static class Immutable<T> implements Properties<T> {
            private DynamoDBMapperTableModel.Id<T> id;
            private Class<T> targetType;
            private String tableName;

            /**
             * Initialize this properties with the specified defaults.
             */
            public Immutable(final Properties<T> ... defaults) {
                for (final Properties<T> d : defaults) {
                    this.targetType = d.targetType();
                    this.tableName = d.tableName();
                    this.id = d.id();
                }
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final DynamoDBMapperTableModel.Id<T> id() {
                return this.id;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final Class<T> targetType() {
                return this.targetType;
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public final String tableName() {
                return this.tableName;
            }
        }

        /**
         * Properties builder.
         */
        static class Buildable<T> extends Immutable<T> {
            /**
             * Populates the builder properties with the specified defaults.
             */
            public Buildable(final Properties<T> ... defaults) {
                super(defaults);
            }

            /**
             * Sets the target type.
             */
            public final Buildable<T> withId(final DynamoDBMapperTableModel.Id<T> id) {
                super.id = id;
                return this;
            }

            /**
             * Sets the target type.
             */
            public final Buildable<T> withTargetType(final Class<T> targetType) {
                super.targetType = targetType;
                return this;
            }

            /**
             * Sets the table name.
             */
            public final Buildable<T> withTableName(final String tableName) {
                super.tableName = tableName;
                return this;
            }
        }
    }

}
