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
 * This exception is thrown when an error occurs in the Amazon Web Services B2B Data Interchange service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerException extends com.amazonaws.services.b2bi.model.AWSB2BiException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The server attempts to retry a failed command.
     * </p>
     */
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
     * <p>
     * The server attempts to retry a failed command.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The server attempts to retry a failed command.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfterSeconds")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The server attempts to retry a failed command.
     * </p>
     * 
     * @return The server attempts to retry a failed command.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfterSeconds")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The server attempts to retry a failed command.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The server attempts to retry a failed command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
