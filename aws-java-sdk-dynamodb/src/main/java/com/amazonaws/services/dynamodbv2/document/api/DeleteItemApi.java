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

import com.amazonaws.services.dynamodbv2.document.DeleteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;

/**
 * A Table-centric DeleteItem API.
 */
@ThreadSafe
public interface DeleteItemApi {
    /** Deletes an item by primary key. */
    public DeleteItemOutcome deleteItem(KeyAttribute ... primaryKeyComponents);

    /** Deletes an item by primary key. */
    public DeleteItemOutcome deleteItem(PrimaryKey primaryKey);

    /** Deletes an item by hash-only primary key. */
    public DeleteItemOutcome deleteItem(String hashKeyName, Object hashKeyValue);

    /** Deletes an item by hash key-and-range primary key. */
    public DeleteItemOutcome deleteItem(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue);

    /**
     * Conditional delete with the specified primary key and expected
     * conditions.
     */
    public DeleteItemOutcome deleteItem(PrimaryKey primaryKey,
            Expected... expected);

    /**
     * Conditional delete with the specified hash-only primary key and expected
     * conditions.
     */
    public DeleteItemOutcome deleteItem(String hashKeyName, Object hashKeyValue,
            Expected... expected);

    /**
     * Conditional delete with the specified hash-and-range primary key and
     * expected conditions.
     */
    public DeleteItemOutcome deleteItem(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue,
            Expected... expected);

    /**
     * Conditional delete with the specified primary key and condition
     * expression.
     */
    public DeleteItemOutcome deleteItem(PrimaryKey primaryKey,
            String conditionExpression,
            Map<String, String> nameMap,
            Map<String, Object> valueMap);

    /**
     * Conditional delete with the specified hash-only primary key and condition
     * expression.
     */
    public DeleteItemOutcome deleteItem(String hashKeyName, Object hashKeyValue,
            String conditionExpression,
            Map<String, String> nameMap,
            Map<String, Object> valueMap);

    /**
     * Conditional delete with the specified hash-and-range primary key and
     * condition expression.
     */
    public DeleteItemOutcome deleteItem(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue,
            String conditionExpression,
            Map<String, String> nameMap,
            Map<String, Object> valueMap);

    /** Deletes an item by specifying all the details. */
    public DeleteItemOutcome deleteItem(DeleteItemSpec spec);
}
