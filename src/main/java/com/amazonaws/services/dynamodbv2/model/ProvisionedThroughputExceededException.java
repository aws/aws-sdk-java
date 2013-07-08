/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request rate is too high, or the request is too large, for the available throughput to accommodate. The AWS SDKs automatically retry requests that
 * receive this exception; therefore, your request will eventually succeed, unless the request is too large or your retry queue is too large to finish.
 * Reduce the frequency of requests by using the strategies listed in <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"> Error Retries and Exponential Backoff </a> in
 * the Amazon DynamoDB Developer Guide.
 * </p>
 */        
public class ProvisionedThroughputExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new ProvisionedThroughputExceededException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public ProvisionedThroughputExceededException(String message) {
        super(message);
    }
    
}
    