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
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Used to specify items to be put and/or primary keys to be deleted from a
 * specific table in a <code>BatchWriteItem</code> request.
 */
public class TableWriteItems {
    private final String tableName;
    private List<PrimaryKey> primaryKeysToDelete;
    private Collection<Item> itemsToPut;

    public TableWriteItems(String tableName) {
        if (tableName == null || tableName.trim().length() == 0)
            throw new IllegalArgumentException("table name must not be null or empty");
        this.tableName = tableName;
    }

    /**
     * Return the list of primary keys (of the current table) to be deleted in
     * a batch write operation.
     */
    public List<PrimaryKey> getPrimaryKeysToDelete() {
        return primaryKeysToDelete;
    }

    /**
     * Used to specify multiple primary keys to be deleted from the current
     * table. A primary key could consist of either a hash-key or both a
     * hash-key and a range-key depending on the schema of the table.
     */
    public TableWriteItems withPrimaryKeysToDelete(
            PrimaryKey... primaryKeysToDelete) {
        if (primaryKeysToDelete == null)
            this.primaryKeysToDelete = null;
        else {
            Set<String> pkNameSet = null;
            for (PrimaryKey pk : primaryKeysToDelete) {
                if (pkNameSet == null)
                    pkNameSet = pk.getComponentNameSet();
                else {
                    if (!pkNameSet.equals(pk.getComponentNameSet())) {
                        throw new IllegalArgumentException(
                            "primary key attribute names must be consistent for the specified primary keys");
                    }
                }
            }
            this.primaryKeysToDelete = new ArrayList<PrimaryKey>(
                    Arrays.asList(primaryKeysToDelete));
        }
        return this;
    }

    /**
     * Used to specify multiple hash-only primary keys to be deleted from the
     * current table.
     * 
     * @param hashKeyName
     *            hash-only key name
     * @param hashKeyValues
     *            a list of hash key values
     */
    public TableWriteItems withHashOnlyKeysToDelete(String hashKeyName,
            Object... hashKeyValues) {
        if (hashKeyName == null)
            throw new IllegalArgumentException();
        PrimaryKey[] primaryKeys = new PrimaryKey[hashKeyValues.length];
        for (int i=0; i < hashKeyValues.length; i++)
            primaryKeys[i] = new PrimaryKey(hashKeyName, hashKeyValues[i]);
        return withPrimaryKeysToDelete(primaryKeys);
    }

    /**
     * Used to specify multiple hash-and-range primary keys to be deleted
     * from the current table.
     * 
     * @param hashKeyName
     *            hash key name
     * @param rangeKeyName
     *            range key name
     * @param alternatingHashAndRangeKeyValues
     *            a list of alternating hash key value and range key value
     */
    public TableWriteItems withHashAndRangeKeysToDelete(
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
        return withPrimaryKeysToDelete(primaryKeys);
    }

    /**
     * Adds a primary key to be deleted in a batch write-item operation. A
     * primary key could consist of either a hash-key or both a
     * hash-key and a range-key depending on the schema of the table.
     */
    public TableWriteItems addPrimaryKeyToDelete(PrimaryKey primaryKey) {
        if (primaryKey != null) {
            if (primaryKeysToDelete == null)
                primaryKeysToDelete = new ArrayList<PrimaryKey>();
            checkConsistency(primaryKey);
            this.primaryKeysToDelete.add(primaryKey);
        }
        return this;
    }

    private void checkConsistency(PrimaryKey primaryKey) {
        if (this.primaryKeysToDelete.size() > 0) {
            // use the first one as the representative
            final Set<String> nameSet = primaryKeysToDelete.get(0).getComponentNameSet();
            if (!nameSet.equals(primaryKey.getComponentNameSet()))
                throw new IllegalArgumentException(
                    "primary key must be added with consistent key attribute name(s)");
        }
    }

    /**
     * Adds a hash-only primary key to be deleted in a batch write
     * operation.
     * 
     * @param hashKeyName name of the hash key attribute name
     * @param hashKeyValue name of the hash key value
     * @return the current instance for method chaining purposes
     */
    public TableWriteItems addHashOnlyPrimaryKeyToDelete(
            String hashKeyName, Object hashKeyValue) {
        this.addPrimaryKeyToDelete(new PrimaryKey(hashKeyName, hashKeyValue));
        return this;
    }

    /**
     * Adds multiple hash-only primary keys to be deleted in a batch write
     * operation.
     * 
     * @param hashKeyName name of the hash key attribute name
     * @param hashKeyValues multiple hash key values
     * @return the current instance for method chaining purposes
     */
    public TableWriteItems addHashOnlyPrimaryKeysToDelete(String hashKeyName,
            Object ... hashKeyValues) {
        for (Object hashKeyValue: hashKeyValues) {
            this.addPrimaryKeyToDelete(new PrimaryKey(hashKeyName, hashKeyValue));
        }
        return this;
    }

    /**
     * Adds multiple hash-and-range primary keys to be deleted in a batch
     * write operation.
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
    public TableWriteItems addHashAndRangePrimaryKeysToDelete(
            String hashKeyName, String rangeKeyName,
            Object ... alternatingHashRangeKeyValues) {
        if (alternatingHashRangeKeyValues.length % 2 != 0) {
            throw new IllegalArgumentException(
                "The multiple hash and range key values must alternate");
        }
        for (int i =0; i < alternatingHashRangeKeyValues.length; i+=2) {
            Object hashKeyValue = alternatingHashRangeKeyValues[i];
            Object rangeKeyValue = alternatingHashRangeKeyValues[i+1];
            this.addPrimaryKeyToDelete(
                new PrimaryKey()
                    .addComponent(hashKeyName, hashKeyValue)
                    .addComponent(rangeKeyName, rangeKeyValue)
                );
        }
        return this;
    }

    /**
     * Adds a primary key (that consists of a hash-key and a range-key) to be
     * deleted in a batch write operation.
     * 
     * @param hashKeyName hash key attribute name
     * @param hashKeyValue hash key value
     * @param rangeKeyName range key attribute name
     * @param rangeKeyValue range key value
     * @return the current instance for method chaining purposes
     */
    public TableWriteItems addHashAndRangePrimaryKeyToDelete(
            String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue) {
        this.addPrimaryKeyToDelete(
            new PrimaryKey()
                .addComponent(hashKeyName, hashKeyValue)
                .addComponent(rangeKeyName, rangeKeyValue));
        return this;
    }

    /**
     * Used to specify the items to be put in the current table in a batch write
     * operation.
     * 
     * @return the current instance for method chaining purposes
     */
    public TableWriteItems withItemsToPut(Item ... itemsToPut) {
        if (itemsToPut == null)
            this.itemsToPut = null;
        else
            this.itemsToPut = new ArrayList<Item>(Arrays.asList(itemsToPut));
        return this;
    }

    /**
     * Used to specify the collection of items to be put in the current table in
     * a batch write operation.
     * 
     * @return the current instance for method chaining purposes
     */
    public TableWriteItems withItemsToPut(Collection<Item> itemsToPut) {
        if (itemsToPut == null)
            this.itemsToPut = null;
        else
            this.itemsToPut = new ArrayList<Item>(itemsToPut);
        return this;
    }

    /**
     * Returns the collection of items to be put in the current table in
     * a batch write operation.
     */
    public Collection<Item> getItemsToPut() {
        return itemsToPut == null
             ? null
             : Collections.unmodifiableCollection(itemsToPut);
    }

    public String getTableName() {
        return tableName;
    }

    /**
     * Adds an item to be put to the current table in a batch write operation.
     */
    public TableWriteItems addItemToPut(Item item) {
        if (item != null) {
            if (itemsToPut == null)
                itemsToPut = new ArrayList<Item>();
            this.itemsToPut.add(item);
        }
        return this;
    }
}
