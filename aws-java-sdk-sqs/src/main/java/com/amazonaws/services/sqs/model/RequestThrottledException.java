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
package com.amazonaws.services.sqs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to request throttling.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The rate of requests per second exceeds the Amazon Web Services KMS request quota for an account and Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * A burst or sustained high rate of requests to change the state of the same KMS key. This condition is often known as
 * a "hot key."
 * </p>
 * </li>
 * <li>
 * <p>
 * Requests for operations on KMS keys in a Amazon Web Services CloudHSM key store might be throttled at a
 * lower-than-expected rate when the Amazon Web Services CloudHSM cluster associated with the Amazon Web Services
 * CloudHSM key store is processing numerous commands, including those unrelated to the Amazon Web Services CloudHSM key
 * store.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestThrottledException extends com.amazonaws.services.sqs.model.AmazonSQSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new RequestThrottledException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RequestThrottledException(String message) {
        super(message);
    }

}
