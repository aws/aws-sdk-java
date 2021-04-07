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
package com.amazonaws.services.mgn.model;

import javax.annotation.Generated;

/**
 * <p>
 * The server encountered an unexpected condition that prevented it from fulfilling the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerException extends com.amazonaws.services.mgn.model.AWSmgnException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The server encountered an unexpected condition that prevented it from fulfilling the request. The request will be
     * retried again after x seconds.
     * </p>
     */
    private Long retryAfterSeconds;

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
     * The server encountered an unexpected condition that prevented it from fulfilling the request. The request will be
     * retried again after x seconds.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The server encountered an unexpected condition that prevented it from fulfilling the request. The request
     *        will be retried again after x seconds.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Long retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The server encountered an unexpected condition that prevented it from fulfilling the request. The request will be
     * retried again after x seconds.
     * </p>
     * 
     * @return The server encountered an unexpected condition that prevented it from fulfilling the request. The request
     *         will be retried again after x seconds.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Long getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The server encountered an unexpected condition that prevented it from fulfilling the request. The request will be
     * retried again after x seconds.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The server encountered an unexpected condition that prevented it from fulfilling the request. The request
     *        will be retried again after x seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerException withRetryAfterSeconds(Long retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
