/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The transaction with the given request token is already in progress.
 * </p>
 * <p>
 * Recommended Settings
 * </p>
 * <note>
 * <p>
 * This is a general recommendation for handling the <code>TransactionInProgressException</code>. These settings help
 * ensure that the client retries will trigger completion of the ongoing <code>TransactWriteItems</code> request.
 * </p>
 * </note>
 * <ul>
 * <li>
 * <p>
 * Set <code>clientExecutionTimeout</code> to a value that allows at least one retry to be processed after 5 seconds
 * have elapsed since the first attempt for the <code>TransactWriteItems</code> operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * Set <code>socketTimeout</code> to a value a little lower than the <code>requestTimeout</code> setting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>requestTimeout</code> should be set based on the time taken for the individual retries of a single HTTP request
 * for your use case, but setting it to 1 second or higher should work well to reduce chances of retries and
 * <code>TransactionInProgressException</code> errors.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use exponential backoff when retrying and tune backoff if needed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Assuming <a href=
 * "https://github.com/aws/aws-sdk-java/blob/fd409dee8ae23fb8953e0bb4dbde65536a7e0514/aws-java-sdk-core/src/main/java/com/amazonaws/retry/PredefinedRetryPolicies.java#L97"
 * >default retry policy</a>, example timeout settings based on the guidelines above are as follows:
 * </p>
 * <p>
 * Example timeline:
 * </p>
 * <ul>
 * <li>
 * <p>
 * 0-1000 first attempt
 * </p>
 * </li>
 * <li>
 * <p>
 * 1000-1500 first sleep/delay (default retry policy uses 500 ms as base delay for 4xx errors)
 * </p>
 * </li>
 * <li>
 * <p>
 * 1500-2500 second attempt
 * </p>
 * </li>
 * <li>
 * <p>
 * 2500-3500 second sleep/delay (500 * 2, exponential backoff)
 * </p>
 * </li>
 * <li>
 * <p>
 * 3500-4500 third attempt
 * </p>
 * </li>
 * <li>
 * <p>
 * 4500-6500 third sleep/delay (500 * 2^2)
 * </p>
 * </li>
 * <li>
 * <p>
 * 6500-7500 fourth attempt (this can trigger inline recovery since 5 seconds have elapsed since the first attempt
 * reached TC)
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransactionInProgressException extends com.amazonaws.services.dynamodbv2.model.AmazonDynamoDBException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TransactionInProgressException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TransactionInProgressException(String message) {
        super(message);
    }

}
