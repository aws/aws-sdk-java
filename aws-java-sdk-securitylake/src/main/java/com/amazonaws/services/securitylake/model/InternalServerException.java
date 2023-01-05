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
package com.amazonaws.services.securitylake.model;

import javax.annotation.Generated;

/**
 * <p>
 * Internal service exceptions are sometimes caused by transient issues. Before you start troubleshooting, perform the
 * operation again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerException extends com.amazonaws.services.securitylake.model.AmazonSecurityLakeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Retry the request after the specified time.
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
     * Retry the request after the specified time.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Retry the request after the specified time.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * Retry the request after the specified time.
     * </p>
     * 
     * @return Retry the request after the specified time.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * Retry the request after the specified time.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Retry the request after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
