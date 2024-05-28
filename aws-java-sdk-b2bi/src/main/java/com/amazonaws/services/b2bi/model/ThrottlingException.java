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
package com.amazonaws.services.b2bi.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to throttling: the data speed and rendering may be limited depending on various parameters
 * and conditions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.b2bi.model.AWSB2BiException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The server attempts to retry a command that was throttled.
     * </p>
     */
    private Integer retryAfterSeconds;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ThrottlingException(String message) {
        super(message);
    }

    /**
     * <p>
     * The server attempts to retry a command that was throttled.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The server attempts to retry a command that was throttled.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfterSeconds")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The server attempts to retry a command that was throttled.
     * </p>
     * 
     * @return The server attempts to retry a command that was throttled.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfterSeconds")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The server attempts to retry a command that was throttled.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The server attempts to retry a command that was throttled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
