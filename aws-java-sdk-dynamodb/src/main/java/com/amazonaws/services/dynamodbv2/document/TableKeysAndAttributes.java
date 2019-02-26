/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Used to specify one or multiple primary keys of a specific table, the
 * attributes to be retrieved from that table, and the consistency of the read
 * operation in a <code>BatchGetItem</code> request.
 */
public class TableKeysAndAttributes {
    private final String tableName;
    private List<PrimaryKey> primaryKeys;
    private Set<String> attributeNames;
    private boolean consistentRead;

    private String projectionExpression;
    private Map<String,String> nameMap;

    public TableKeysAndAttributes(String tableName) {
        if (tableName == null || tableName.trim().length() == 0)
            throw new IllegalArgumentException("table name must not be null or empty");
        this.tableName = tableName;
    }

    /**
     * Return the list of primary keys (of the current table) to be included in
     * a batch get-item operation.
     */
    public List<PrimaryKey> getPrimaryKeys() {
        return primaryKeys;
    }

    /**
     * Used to specify multiple primary keys. A primary key could consist of
     * either a hash-key or both a hash-key and a range-key depending on the
     * schema of the table.
     */
    public TableKeysAndAttributes withPrimaryKeys(PrimaryKey... primaryKeys) {
        if (primaryKeys == null)
            this.primaryKeys = null;
        else {
            Set<String> pkNameSet = null;
            for (PrimaryKey pk : primaryKeys) {
                if (pkNameSet == null)
                    pkNameSet = pk.getComponentNameSet();
                else {
                    if (!pkNameSet.equals(pk.getComponentNameSet())) {
                        throw new IllegalArgumentException(
                            "primary key attribute names must be consistent for the specified primary keys");
                    }
                }
            }
            this.primaryKeys = new ArrayList<PrimaryKey>(Arrays.asList(primaryKeys));
        }
        return this;
    }

    /**
     * Used to specify multiple hash-only primary keys.
     * @param hashKeyName hash-only key name
     * @param hashKeyValues a list of hash key values
     */
    public TableKeysAndAttributes withHashOnlyKeys(String hashKeyName, Object ... hashKeyValues) {
        if (hashKeyName == null)
            throw new IllegalArgumentException();
        PrimaryKey[] primaryKeys = new PrimaryKey[hashKeyValues.length];
        for (int i=0; i < hashKeyValues.length; i++)
            primaryKeys[i] = new PrimaryKey(hashKeyName, hashKeyValues[i]);
        return withPrimaryKeys(primaryKeys);
    }

    /**
     * Used to specify multiple hash-and-range primary keys.
     * 
     * @param hashKeyName
     *            hash key name
     * @param rangeKeyName
     *            range key name
     * @param alternatingHashAndRangeKeyValues
     *            a list of alternating hash key value and range key value
     */
    public TableKeysAndAttributes withHashAndRangeKeys(
            String hashKeyName, String rangeKeyName, 
            Object... alternatingHashAndRangeKeyValues) {
        if (hashKeyName == null)
            throw new IllegalArgumentException("hash key name must be specified");
        if (rangeKeyName == null)
            throw new IllegalArgumentException("range key name must be specified");
        if (alternatingHashAndRangeKeyValues.length % 2 != 0)
            throw new IllegalArgumentException("number of hash and range key values must be the same");
        final int len = alternatingHashAndRangeKeyValues.length / 2;
        PrimaryKey[] primaryKeys = new PrimaryKey[len];
        for (int i=0; i < alternatingHashAndRangeKeyValues.length; i += 2) {
            primaryKeys[i >> 1] = new PrimaryKey(
                hashKeyName, alternatingHashAndRangeKeyValues[i],
                rangeKeyName, alternatingHashAndRangeKeyValues[i+1]);
        }
        return withPrimaryKeys(primaryKeys);
    }

    /**
     * Adds a primary key to be included in the batch get-item operation. A
     * primary key could consist of either a hash-key or both a
     * hash-key and a range-key depending on the schema of the table.
     */
    public TableKeysAndAttributes addPrimaryKey(PrimaryKey primaryKey) {
        if (primaryKey != null) {
            if (primaryKeys == null)
                primaryKeys = new ArrayList<PrimaryKey>();
            checkConsistency(primaryKey);
            this.primaryKeys.add(primaryKey);
        }
        return this;
    }

    private void checkConsistency(PrimaryKey primaryKey) {
        if (this.primaryKeys.size() > 0) {
            // use the first one as the representative
            final Set<String> nameSet = primaryKeys.get(0).getComponentNameSet();
            if (!nameSet.equals(primaryKey.getComponentNameSet()))
                throw new IllegalArgumentException(
                    "primary key must be added with consistent key attribute name(s)");
        }
    }

    /**
     * Adds a hash-only primary key to be included in the batch get-item
     * operation.
     * 
     * @param hashKeyName name of the hash key attribute name
     * @param hashKeyValue name of the hash key value
     * @return the current instance for method chaining purposes
     */
    public TableKeysAndAttributes addHashOnlyPrimaryKey(
            String hashKeyName, Object hashKeyValue) {
        this.addPrimaryKey(new PrimaryKey(hashKeyName, hashKeyValue));
        return this;
    }

    /**
     * Adds multiple hash-only primary keys to be included in the batch get-item
     * operation.
     * 
     * @param hashKeyName name of the hash key attribute name
     * @param hashKeyValues multiple hash key values
     * @return the current instance for method chaining purposes
     */
    public TableKeysAndAttributes addHashOnlyPrimaryKeys(String hashKeyName,
            Object ... hashKeyValues) {
        for (Object hashKeyValue: hashKeyValues) {
            this.addPrimaryKey(new PrimaryKey(hashKeyName, hashKeyValue));
        }
        return this;
    }

    /**
     * Adds multiple hash-and-range primary keys to be included in the batch
     * get-item operation.
     * 
     * @param hashKeyName
     *            name of the hash key attribute name
     * @param rangeKeyName
     *            name of the range key attribute name
     * @param alternatingHashRangeKeyValues
     *            used to specify multiple alternating hash key and range key
     *            values
     * @return the current instance for method chaining purposes
     */
    public TableKeysAndAttributes addHashAndRangePrimaryKeys(
            String hashKeyName, String rangeKeyName,
            Object ... alternatingHashRangeKeyValues) {
        if (alternatingHashRangeKeyValues.length % 2 != 0) {
            throw new IllegalArgumentException(
                "The multiple hash and range key values must alternate");
        }
        for (int i =0; i < alternatingHashRangeKeyValues.length; i+=2) {
            Object hashKeyValue = alternatingHashRangeKeyValues[i];
            Object rangeKeyValue = alternatingHashRangeKeyValues[i+1];
            this.addPrimaryKey(
                new PrimaryKey()
                    .addComponent(hashKeyName, hashKeyValue)
                    .addComponent(rangeKeyName, rangeKeyValue)
                );
        }
        return this;
    }

    /**
     * Adds a primary key (that consists of a hash-key and a range-key) to be
     * included in the batch get-item operation.
     * 
     * @param hashKeyName hash key attribute name
     * @param hashKeyValue hash key value
     * @param rangeKeyName range key attribute name
     * @param rangeKeyValue range key value
     * @return the current instance for method chaining purposes
     */
    public TableKeysAndAttributes addHashAndRangePrimaryKey(
            String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue) {
        this.addPrimaryKey(
            new PrimaryKey()
                .addComponent(hashKeyName, hashKeyValue)
                .addComponent(rangeKeyName, rangeKeyValue));
        return this;
    }

    /** @deprecated by {@link #withAttributeNames(String...)}. */
    @Deprecated
    public TableKeysAndAttributes withAttrbuteNames(String ... attributeNames) {
        return withAttributeNames(attributeNames);
    }

    /** @deprecated by {@link #withAttributeNames(List)}. */
    @Deprecated
    public TableKeysAndAttributes withAttrbuteNames(List<String> attributeNames) {
        return withAttributeNames(attributeNames);
    }

    /**
     * Used to specify the attributes to be retrieved in each item returned
     * from the batch get-item operation.
     * 
     * @param attributeNames names of the attributes to be retrieved in each
     * item returned from the batch get-item operation.
     * @return the current instance for method chaining purposes
     */
    public TableKeysAndAttributes withAttributeNames(String ... attributeNames) {
        if (attributeNames == null)
            this.attributeNames = null;
        else
            this.attributeNames = Collections.unmodifiableSet(
                new LinkedHashSet<String>(Arrays.asList(attributeNames)));
        return this;
    }

    public TableKeysAndAttributes withAttributeNames(List<String> attributeNames) {
        if (attributeNames == null)
            this.attributeNames = null;
        else
            this.attributeNames = Collections.unmodifiableSet(
                    new LinkedHashSet<String>(attributeNames));
        return this;
    }

    public Set<String> getAttributeNames() {
        return attributeNames;
    }

    public String getTableName() {
        return tableName;
    }

    public boolean isConsistentRead() {
        return consistentRead;
    }

    public TableKeysAndAttributes withConsistentRead(boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    public String getProjectionExpression() {
        return projectionExpression;
    }

    public TableKeysAndAttributes withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    public Map<String, String> getNameMap() {
        return nameMap;
    }

    public TableKeysAndAttributes withNameMap(Map<String, String> nameMap) {
        this.nameMap = nameMap == null 
            ? null : Collections.unmodifiableMap(new LinkedHashMap<String, String>(nameMap));
        return this;
    }
}
