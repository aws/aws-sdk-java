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

import com.amazonaws.services.dynamodbv2.document.BatchGetItemOutcome;
import com.amazonaws.services.dynamodbv2.document.TableKeysAndAttributes;
import com.amazonaws.services.dynamodbv2.document.spec.BatchGetItemSpec;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;

/**
 * DynamoDB BatchGetItem API that can be used to retrieve multiple items from
 * multiple tables in one request/response by specifying one or multiple primary
 * keys per table in the request.
 */
@ThreadSafe
public interface BatchGetItemApi {
    /**
     * Used to perform a batch get-item operation from DynamoDB.
     * 
     * @param returnConsumedCapacity
     *            returned capacity to be returned
     * @param tableKeyAndAttributes
     *            the tables, keys, and attributes specification to be used to
     *            retrieve the items.
     */
    public BatchGetItemOutcome batchGetItem(
            ReturnConsumedCapacity returnConsumedCapacity,
            TableKeysAndAttributes... tableKeyAndAttributes);

    /**
     * Used to perform a batch get-item operation from DynamoDB.
     * 
     * @param tableKeyAndAttributes
     *            the tables, keys, and attributes specification to be used to
     *            retrieve the items.
     */
    public BatchGetItemOutcome batchGetItem(
            TableKeysAndAttributes... tableKeyAndAttributes);

    /**
     * Used to perform a batch get-item operation from DynamoDB with full
     * parameter specification.
     */
    public BatchGetItemOutcome batchGetItem(BatchGetItemSpec spec);

    /**
     * Used to perform a batch get-item for the unprocessed keys returned from a
     * previous batch get-item operation.
     * 
     * @param returnConsumedCapacity
     *            returned capacity to be returned
     * @param unprocessedKeys
     *            the unprocessed keys returned from the result of a previous
     *            batch-get-item operation.
     * 
     * @see BatchGetItemOutcome#getUnprocessedKeys()
     */
    public BatchGetItemOutcome batchGetItemUnprocessed(
            ReturnConsumedCapacity returnConsumedCapacity,
            Map<String, KeysAndAttributes> unprocessedKeys);

    /**
     * Used to perform a batch get-item for the unprocessed keys returned from a
     * previous batch get-item operation.
     * 
     * @param unprocessedKeys
     *            the unprocessed keys returned from the result of a previous
     *            batch-get-item operation.
     * 
     * @see BatchGetItemOutcome#getUnprocessedKeys()
     */
    public BatchGetItemOutcome batchGetItemUnprocessed(
            Map<String, KeysAndAttributes> unprocessedKeys);
}
