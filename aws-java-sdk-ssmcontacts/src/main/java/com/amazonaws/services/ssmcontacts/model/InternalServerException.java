/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import javax.annotation.Generated;

/**
 * <p>
 * Unexpected error occurred while processing the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerException extends com.amazonaws.services.ssmcontacts.model.AWSSSMContactsException {
    private static final long serialVersionUID = 1L;

    /** Advice to clients on when the call can be safely retried */
    private Integer retryAfterSeconds;

    /**
     * Constructs a new InternalServerException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServerException(String message) {
        super(message);
    }

    /**
     * Advice to clients on when the call can be safely retried
     * 
     * @param retryAfterSeconds
     *        Advice to clients on when the call can be safely retried
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RetryAfterSeconds")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * Advice to clients on when the call can be safely retried
     * 
     * @return Advice to clients on when the call can be safely retried
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RetryAfterSeconds")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * Advice to clients on when the call can be safely retried
     * 
     * @param retryAfterSeconds
     *        Advice to clients on when the call can be safely retried
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
