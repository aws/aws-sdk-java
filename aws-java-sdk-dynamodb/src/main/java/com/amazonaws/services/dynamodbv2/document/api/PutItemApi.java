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

import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;

/**
 * A Table-centric PutItem API.
 */
@ThreadSafe
public interface PutItemApi {
    /**
     * Unconditional put.
     */
    public PutItemOutcome putItem(Item item);

    /**
     * Conditional put.
     */
    public PutItemOutcome putItem(Item item, Expected ... expected);

    /**
     * Conditional put via condition expression.
     */
    public PutItemOutcome putItem(Item item, String conditionExpression,
            Map<String, String> nameMap, Map<String, Object> valueMap);

    /** Puts an item by specifying all the details. */
    public PutItemOutcome putItem(PutItemSpec spec);
}
