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
package com.amazonaws.services.dynamodbv2.document.api;

import java.util.Map;

import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.dynamodbv2.document.GetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;

/**
 * A Table-centric GetItem API.
 * <p>
 * In general, all getter methods in this library incur no network.
 * <code>GetItemApi</code> is the only exception due to the fact that the
 * web service API is indistinguishable from a Java getter method.
 */
@ThreadSafe
public interface GetItemApi {

    /**
     * Retrieves an item and the associated information by primary key. Incurs
     * network access.
     *
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(PrimaryKey primaryKey);

    /**
     * Retrieves an item and the associated information by primary key when the
     * primary key is a hash-only key. Incurs network access.
     *
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(KeyAttribute... primaryKeyComponents);

    /**
     * Retrieves an item and the associated information by primary key when the
     * primary key is a hash-only key. Incurs network access.
     *
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(String hashKeyName, Object hashKeyValue);

    /**
     * Retrieves an item and the associated information by primary key when the
     * primary key consists of both a hash-key and a range-key. Incurs network
     * access.
     *
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue);

    /**
     * Retrieves an item and the associated information using projection
     * expression. Incurs network access.
     *
     * @param projectionExpression
     *            projection expression, example: "a.b , c[0].e"
     *
     * @param nameMap
     *            actual values for the attribute-name place holders; can be
     *            null if there is no attribute-name placeholder.
     *
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(PrimaryKey primaryKey,
            String projectionExpression, Map<String, String> nameMap);

    /**
     * Retrieves an item and the associated information via the specified hash
     * key using projection expression. Incurs network access.
     * 
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(String hashKeyName, Object hashKeyValue,
            String projectionExpression, Map<String, String> nameMap);

    /**
     * Retrieves an item and the associated information via the specified hash
     * key and range key using projection expression. Incurs network access.
     * 
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue,
            String projectionExpression, Map<String, String> nameMap);

    /**
     * Retrieves an item via the specified hash key using projection expression.
     * Incurs network access.
     * 
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(String hashKeyName, Object hashKeyValue,
            String projectionExpression, Map<String, String> nameMap);

    /**
     * Retrieves an item via the specified hash key and range key using
     * projection expression. Incurs network access.
     * 
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue,
            String projectionExpression, Map<String, String> nameMap);

    /**
     * Retrieves an item and the associated information by specifying all the
     * details. Incurs network access.
     *
     * @return the (non-null) result of item retrieval.
     */
    public GetItemOutcome getItemOutcome(GetItemSpec spec);

    /**
     * Retrieves an item by primary key; or null if the item doesn't exist.
     * Incurs network access.
     *
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(PrimaryKey primaryKey);

    /**
     * Retrieves an item by primary key. Incurs network access.
     *
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(KeyAttribute... primaryKeyComponents);

    /**
     * Retrieves an item by primary key when the primary key is a hash-only key.
     * Incurs network access.
     *
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(String hashKeyName, Object hashKey);

    /**
     * Retrieves an item by primary key when the primary key consists of both a
     * hash-key and a range-key. Incurs network access.
     *
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue);
    
    /**
     * Retrieves an item using projection expression. Incurs network access.
     *
     * @param projectionExpression
     *            projection expression, example: "a.b , c[0].e"
     *
     * @param nameMap
     *            actual values for the attribute-name place holders; can be
     *            null if there is no attribute-name placeholder.
     *
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(PrimaryKey primaryKey, String projectionExpression,
            Map<String, String> nameMap);

    /**
     * Retrieves an item by specifying all the details. Incurs network access.
     * 
     * @return the retrieved item; or null if the item doesn't exist.
     */
    public Item getItem(GetItemSpec spec);
}
