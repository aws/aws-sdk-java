/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    private final Map<String,DynamoDBMapperFieldModel<T,Object>> versions;
    private final Map<String,DynamoDBMapperFieldModel<T,Object>> fields;
    private final Map<KeyType,DynamoDBMapperFieldModel<T,Object>> keys;
    private final DynamoDBMapperTableModel.Properties<T> properties;
    private final Class<T> targetType;

    /**
     * Constructs a new table model for the specified class.
     * @param builder The builder.
     */
    private DynamoDBMapperTableModel(final DynamoDBMapperTableModel.Builder<T> builder) {
        this.globalSecondaryIndexes = builder.globalSecondaryIndexes();
        this.localSecondaryIndexes = builder.localSecondaryIndexes();
        this.versions = builder.versions();
        this.fields = builder.fields();
        this.keys = builder.keys();
        this.properties = builder.properties;
        this.targetType = builder.targetType;
    }

    /**
     * Gets the object type.
     * @return The object type.
     */
    public Class<T> targetType() {
        return this.targetType;
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
    @SuppressWarnings("unchecked")
    public <V> DynamoDBMapperFieldModel<T,V> field(final String attributeName) {
        final DynamoDBMapperFieldModel<T,V> field = (DynamoDBMapperFieldModel<T,V>)fields.get(attributeName);
        if (field == null) {
            throw new DynamoDBMappingException(
                targetType.getSimpleName() + "[" + attributeName + "]; no mapping for attribute by name"
            );
        }
        return field;
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
    @SuppressWarnings("unchecked")
    public <H> DynamoDBMapperFieldModel<T,H> hashKey() {
        final DynamoDBMapperFieldModel<T,H> field = (DynamoDBMapperFieldModel<T,H>)keys.get(HASH);
        if (field == null) {
            throw new DynamoDBMappingException(
                targetType.getSimpleName() + "; no mapping for HASH key"
            );
        }
        return field;
    }

    /**
     * Gets the range key field model for the specified type.
     * @param <R> The range key type.
     * @return The range key field model.
     * @throws DynamoDBMappingException If the range key is not present.
     */
    @SuppressWarnings("unchecked")
    public <R> DynamoDBMapperFieldModel<T,R> rangeKey() {
        final DynamoDBMapperFieldModel<T,R> field = (DynamoDBMapperFieldModel<T,R>)keys.get(RANGE);
        if (field == null) {
            throw new DynamoDBMappingException(
                targetType.getSimpleName() + "; no mapping for RANGE key"
            );
        }
        return field;
    }

    /**
     * Gets the range key field model for the specified type.
     * @param <R> The range key type.
     * @return The range key field model, or null if not present.
     */
    @SuppressWarnings("unchecked")
    public <R> DynamoDBMapperFieldModel<T,R> rangeKeyIfExists() {
        return (DynamoDBMapperFieldModel<T,R>)keys.get(RANGE);
    }

    /**
     * Gets all the version fields for the given class.
     * @return The field models.
     */
    public Collection<DynamoDBMapperFieldModel<T,Object>> versions() {
        return versions.values();
    }

    /**
     * Indicates if this table has any versioned attributes.
     * @return True if any versioned attributes, false otherwise.
     */
    public boolean versioned() {
        return !versions.isEmpty();
    }

    /**
     * Gets the global secondary indexes for the given class.
     * @return The map of index name to GlobalSecondaryIndexes.
     */
    public Collection<GlobalSecondaryIndex> globalSecondaryIndexes() {
        if (globalSecondaryIndexes.isEmpty()) {
            return null;
        }
        final Collection<GlobalSecondaryIndex> copies = new ArrayList<GlobalSecondaryIndex>(globalSecondaryIndexes.size());
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
        final Collection<LocalSecondaryIndex> copies = new ArrayList<LocalSecondaryIndex>(localSecondaryIndexes.size());
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
            try {
                final AttributeValue value = field.getAndConvert(object);
                if (value != null) {
                    map.put(field.name(), value);
                }
            } catch (final RuntimeException e) {
                throw new DynamoDBMappingException(
                    targetType.getSimpleName() + "[" + field.name() + "]; could not convert attribute", e
                );
            }
        }
        return map;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T unconvert(final Map<String,AttributeValue> object) {
        final T result = StandardBeanProperties.DeclaringReflect.<T>newInstance(targetType);
        if (!object.isEmpty()) {
            for (final DynamoDBMapperFieldModel<T,Object> field : fields()) {
                try {
                    final AttributeValue value = object.get(field.name());
                    if (value != null) {
                        field.unconvertAndSet(result, value);
                    }
                } catch (final RuntimeException e) {
                    throw new DynamoDBMappingException(
                        targetType.getSimpleName() + "[" + field.name() + "]; could not unconvert attribute", e
                    );
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
    public <H,R> T createKey(final H hashKey, final R rangeKey) {
        final T key = StandardBeanProperties.DeclaringReflect.<T>newInstance(targetType);
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
     * Creates a new key map from the specified object.
     * @param <H> The hash key type.
     * @param <R> The range key type.
     * @param object The object instance.
     * @return The key map.
     */
    public <H,R> Map<String,AttributeValue> convertKey(final T key) {
        final DynamoDBMapperFieldModel<T,H> hk = this.<H>hashKey();
        final DynamoDBMapperFieldModel<T,R> rk = this.<R>rangeKeyIfExists();
        return this.<H,R>convertKey(hk.get(key), (rk == null ? (R)null : rk.get(key)));
    }

    /**
     * Creates a new key map from the specified hash and range key.
     * @param <H> The hash key type.
     * @param <R> The range key type.
     * @param hashKey The hash key.
     * @param rangeKey The range key (optional if not present on table).
     * @return The key map.
     */
    public <H,R> Map<String,AttributeValue> convertKey(final H hashKey, final R rangeKey) {
        final Map<String,AttributeValue> key = new LinkedHashMap<String,AttributeValue>(4);
        final DynamoDBMapperFieldModel<T,H> hk = this.<H>hashKey();
        final AttributeValue hkValue = hashKey == null ? null : hk.convert(hashKey);
        if (hkValue != null) {
            key.put(hk.name(), hkValue);
        } else {
            throw new DynamoDBMappingException(
                targetType.getSimpleName() + "[" + hk.name() + "]; no HASH key value present"
            );
        }
        final DynamoDBMapperFieldModel<T,R> rk = this.<R>rangeKeyIfExists();
        final AttributeValue rkValue = rangeKey == null ? null : rk.convert(rangeKey);
        if (rkValue != null) {
            key.put(rk.name(), rkValue);
        } else if (rk != null) {
            throw new DynamoDBMappingException(
                targetType.getSimpleName() + "[" + rk.name() + "]; no RANGE key value present"
            );
        }
        return key;
    }

    /**
     * {@link DynamoDBMapperTableModel} builder.
     */
    static class Builder<T> {
        private final Map<String,DynamoDBMapperFieldModel<T,Object>> versions;
        private final Map<String,DynamoDBMapperFieldModel<T,Object>> fields;
        private final Map<KeyType,DynamoDBMapperFieldModel<T,Object>> keys;
        private final Properties properties;
        private final Class<T> targetType;

        public Builder(Class<T> targetType, Properties<T> properties) {
            this.versions = new LinkedHashMap<String,DynamoDBMapperFieldModel<T,Object>>(4);
            this.fields = new LinkedHashMap<String,DynamoDBMapperFieldModel<T,Object>>();
            this.keys = new EnumMap<KeyType,DynamoDBMapperFieldModel<T,Object>>(KeyType.class);
            this.properties = properties;
            this.targetType = targetType;
        }

        public Builder<T> with(final DynamoDBMapperFieldModel<T,Object> field) {
            fields.put(field.name(), field);
            if (field.keyType() != null) {
                keys.put(field.keyType(), field);
            }
            if (field.versioned()) {
                versions.put(field.name(), field);
            }
            return this;
        }

        public Map<String,GlobalSecondaryIndex> globalSecondaryIndexes() {
            final Map<String,GlobalSecondaryIndex> map = new LinkedHashMap<String,GlobalSecondaryIndex>();
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.globalSecondaryIndexNames(HASH)) {
                    final GlobalSecondaryIndex gsi = new GlobalSecondaryIndex().withIndexName(indexName);
                    if (map.put(indexName, gsi) != null) {
                        throw new DynamoDBMappingException(
                            targetType.getSimpleName() + "[" + field.name() + "]; must not duplicate GSI " + indexName
                        );
                    }
                    gsi.withProjection(new Projection().withProjectionType(KEYS_ONLY));
                    gsi.withKeySchema(new KeySchemaElement(field.name(), HASH));
                }
            }
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.globalSecondaryIndexNames(RANGE)) {
                    final GlobalSecondaryIndex gsi = map.get(indexName);
                    if (gsi == null) {
                        throw new DynamoDBMappingException(
                            targetType.getSimpleName() + "[" + field.name() + "]; no HASH key for GSI " + indexName
                        );
                    }
                    gsi.withKeySchema(new KeySchemaElement(field.name(), RANGE));
                }
            }
            if (map.isEmpty()) {
                return Collections.<String,GlobalSecondaryIndex>emptyMap();
            }
            return Collections.unmodifiableMap(map);
        }

        public Map<String,LocalSecondaryIndex> localSecondaryIndexes() {
            final Map<String,LocalSecondaryIndex> map = new LinkedHashMap<String,LocalSecondaryIndex>();
            for (final DynamoDBMapperFieldModel<T,Object> field : fields.values()) {
                for (final String indexName : field.localSecondaryIndexNames()) {
                    final LocalSecondaryIndex lsi = new LocalSecondaryIndex().withIndexName(indexName);
                    if (map.put(indexName, lsi) != null) {
                        throw new DynamoDBMappingException(
                            targetType.getSimpleName() + "[" + field.name() + "]; must not duplicate LSI " + indexName
                        );
                    }
                    lsi.withProjection(new Projection().withProjectionType(KEYS_ONLY));
                    lsi.withKeySchema(new KeySchemaElement(keys.get(HASH).name(), HASH));
                    lsi.withKeySchema(new KeySchemaElement(field.name(), RANGE));
                }
            }
            if (map.isEmpty()) {
                return Collections.<String,LocalSecondaryIndex>emptyMap();
            }
            return Collections.unmodifiableMap(map);
        }

        private Map<String,DynamoDBMapperFieldModel<T,Object>> versions() {
            if (versions.isEmpty()) {
                return Collections.<String,DynamoDBMapperFieldModel<T,Object>>emptyMap();
            }
            return Collections.unmodifiableMap(versions);
        }

        public Map<String,DynamoDBMapperFieldModel<T,Object>> fields() {
            if (fields.isEmpty()) {
                return Collections.<String,DynamoDBMapperFieldModel<T,Object>>emptyMap();
            }
            return Collections.unmodifiableMap(fields);
        }

        public Map<KeyType,DynamoDBMapperFieldModel<T,Object>> keys() {
            if (keys.isEmpty()) {
                return Collections.<KeyType,DynamoDBMapperFieldModel<T,Object>>emptyMap();
            }
            return Collections.unmodifiableMap(keys);
        }

        public DynamoDBMapperTableModel<T> build() {
            final DynamoDBMapperTableModel<T> result = new DynamoDBMapperTableModel<T>(this);
            if (properties.tableName() != null) {
                result.hashKey(); //<- make sure the hash key is present
            }
            return result;
        }
    }

    /**
     * The table model properties.
     */
    static interface Properties<T> {
        public String tableName();

        static final class Immutable<T> implements Properties<T> {
            private final String tableName;

            public Immutable(final Properties<T> properties) {
                this.tableName = properties.tableName();
            }

            @Override
            public String tableName() {
                return this.tableName;
            }
        }
    }

}
