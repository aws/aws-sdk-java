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

import java.util.List;
import java.util.Map;

import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.dynamodbv2.document.BatchWriteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.TableWriteItems;
import com.amazonaws.services.dynamodbv2.document.spec.BatchWriteItemSpec;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;

/**
 * DynamoDB BatchWriteItem API that can be used to put multiple items to and/or
 * delete multiple items from multiple tables in a single request-response
 * to/from DynamoDB.
 */
@ThreadSafe
public interface BatchWriteItemApi {

    /**
     * Used to perform a batch write operation to DynamoDB.
     * 
     * @param tableWriteItems
     *            the tables and the respective keys to delete from and/or the
     *            respective items to be put.
     */
    public BatchWriteItemOutcome batchWriteItem(
            TableWriteItems... tableWriteItems);

    /**
     * Used to perform a batch write operation to DynamoDB with full parameter
     * specification.
     */
    public BatchWriteItemOutcome batchWriteItem(BatchWriteItemSpec spec);

    /**
     * Used to perform a batch write operation for the unprocessed items
     * returned from a previous batch write operation.
     * 
     * @param unprocessedItems
     *            the unprocessed items returned from the result of a previous
     *            batch write operation
     * 
     * @see BatchWriteItemOutcome#getUnprocessedItems()
     */
    public BatchWriteItemOutcome batchWriteItemUnprocessed(
            Map<String, List<WriteRequest>> unprocessedItems);
}
