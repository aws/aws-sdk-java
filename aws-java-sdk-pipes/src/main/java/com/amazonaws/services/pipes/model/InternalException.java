/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception occurs due to unexpected causes.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalException extends com.amazonaws.services.pipes.model.AmazonPipesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The number of seconds to wait before retrying the action that caused the exception.
     * </p>
     */
    private Integer retryAfterSeconds;

    /**
     * Constructs a new InternalException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalException(String message) {
        super(message);
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the action that caused the exception.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the action that caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the action that caused the exception.
     * </p>
     * 
     * @return The number of seconds to wait before retrying the action that caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the action that caused the exception.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the action that caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
