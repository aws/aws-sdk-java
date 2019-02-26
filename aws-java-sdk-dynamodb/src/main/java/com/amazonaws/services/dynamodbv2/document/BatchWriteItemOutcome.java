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

import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.document.api.BatchWriteItemApi;
import com.amazonaws.services.dynamodbv2.document.spec.BatchWriteItemSpec;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;

/**
 * The outcome of a batch write-item operation from DynamoDB.
 */
public class BatchWriteItemOutcome {
    private final BatchWriteItemResult result;

    /**
     * @param result the low-level result; must not be null
     */
    public BatchWriteItemOutcome(BatchWriteItemResult result) {
        if (result == null)
            throw new IllegalArgumentException();
        this.result = result;
    }

    /**
     * Convenient method to return the low-level unprocessed items.
     * 
     * @see BatchWriteItemApi#batchWriteItemUnprocessed(Map)
     * @see BatchWriteItemSpec#withUnprocessedItems(Map)
     */
    public Map<String, List<WriteRequest>> getUnprocessedItems() {
        return result.getUnprocessedItems();
    }

    /**
     * Returns a non-null low-level result returned from the server side.
     */
    public BatchWriteItemResult getBatchWriteItemResult() {
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(result);
    }
}
