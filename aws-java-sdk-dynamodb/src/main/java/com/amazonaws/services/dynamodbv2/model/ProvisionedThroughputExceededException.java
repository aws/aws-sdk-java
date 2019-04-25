/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * Your request rate is too high. The AWS SDKs for DynamoDB automatically retry requests that receive this exception.
 * Your request is eventually successful, unless your retry queue is too large to finish. Reduce the frequency of
 * requests and use exponential backoff. For more information, go to <a href=
 * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Programming.Errors.html#Programming.Errors.RetryAndBackoff"
 * >Error Retries and Exponential Backoff</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedThroughputExceededException extends com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ProvisionedThroughputExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ProvisionedThroughputExceededException(String message) {
        super(message);
    }

}
