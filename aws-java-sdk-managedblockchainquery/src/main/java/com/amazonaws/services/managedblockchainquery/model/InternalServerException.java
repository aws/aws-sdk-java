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
package com.amazonaws.services.managedblockchainquery.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request processing has failed because of an internal error in the service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerException extends com.amazonaws.services.managedblockchainquery.model.AmazonManagedBlockchainQueryException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Specifies the <code>retryAfterSeconds</code> value.
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
     * Specifies the <code>retryAfterSeconds</code> value.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Specifies the <code>retryAfterSeconds</code> value.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * Specifies the <code>retryAfterSeconds</code> value.
     * </p>
     * 
     * @return Specifies the <code>retryAfterSeconds</code> value.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * Specifies the <code>retryAfterSeconds</code> value.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Specifies the <code>retryAfterSeconds</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
