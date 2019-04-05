/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.dynamodbv2.datamodeling;

import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.util.ValidationUtils;


/**
 * Container object that has information about the batch load request made to DynamoDB.
 *
 * @author avinam
 */
public class BatchLoadContext {
    /**
     * The BatchGetItemResult returned by the DynamoDB client.
     */
    private BatchGetItemResult batchGetItemResult;
    /**
     * The BatchGetItemRequest.
     */
    private final BatchGetItemRequest batchGetItemRequest;
    /**
     * The number of times the request has been retried.
     */
    private int retriesAttempted;

    /**
     * Instantiates a new BatchLoadContext.
     *  @param batchGetItemRequest  see {@link BatchGetItemRequest}.
     * */
    public BatchLoadContext(BatchGetItemRequest batchGetItemRequest) {
        this.batchGetItemRequest = ValidationUtils.assertNotNull(batchGetItemRequest, "batchGetItemRequest");
        this.batchGetItemResult = null;
        this.retriesAttempted = 0;
    }

    /**
     * @return the BatchGetItemResult
     */
    public BatchGetItemResult getBatchGetItemResult() {
        return batchGetItemResult;
    }

    /**
     * @return the BatchGetItemResult
     */
    public void setBatchGetItemResult(BatchGetItemResult batchGetItemResult) {
        this.batchGetItemResult = batchGetItemResult;
    }


    /**
     * @return the BatchGetItemRequest.
     */
    public BatchGetItemRequest getBatchGetItemRequest() {
        return batchGetItemRequest;
    }

    /**
     * Gets the retriesAttempted.
     *
     * @return the retriesAttempted
     */
    public int getRetriesAttempted() {
        return retriesAttempted;
    }

    /**
     * Sets retriesAttempted.
     *
     * @param retriesAttempted the number of retries attempted
     */
    public void setRetriesAttempted(int retriesAttempted) {
        this.retriesAttempted = retriesAttempted;
    }
}
