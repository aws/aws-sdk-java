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
package com.amazonaws.services.apigateway.model;

import javax.annotation.Generated;

/**
 * <p>
 * The requested service is not available. For details see the accompanying error message. Retry after the specified
 * time period.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUnavailableException extends com.amazonaws.services.apigateway.model.AmazonApiGatewayException {
    private static final long serialVersionUID = 1L;

    private String retryAfterSeconds;

    /**
     * Constructs a new ServiceUnavailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceUnavailableException(String message) {
        super(message);
    }

    /**
     * @param retryAfterSeconds
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(String retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public String getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * @param retryAfterSeconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUnavailableException withRetryAfterSeconds(String retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
