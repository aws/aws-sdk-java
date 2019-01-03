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
package com.amazonaws.services.sqs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified action violates a limit. For example, <code>ReceiveMessage</code> returns this error if the maximum
 * number of inflight messages is reached and <code>AddPermission</code> returns this error if the maximum number of
 * permissions for the queue is reached.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverLimitException extends com.amazonaws.services.sqs.model.AmazonSQSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new OverLimitException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OverLimitException(String message) {
        super(message);
    }

}
