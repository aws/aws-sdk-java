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
package com.amazonaws.services.gamelift.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed because Amazon GameLift has not yet finished validating this compute. We recommend attempting 8
 * to 10 retries over 3 to 5 minutes with <a
 * href="http://aws.amazon.com/blogs/https:/aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/"
 * >exponential backoffs and jitter</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotReadyException extends com.amazonaws.services.gamelift.model.AmazonGameLiftException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new NotReadyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NotReadyException(String message) {
        super(message);
    }

}
