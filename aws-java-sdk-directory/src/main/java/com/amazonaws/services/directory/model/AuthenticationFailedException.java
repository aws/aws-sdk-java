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
package com.amazonaws.services.directory.model;

import javax.annotation.Generated;

/**
 * <p>
 * An authentication error occurred.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationFailedException extends com.amazonaws.services.directory.model.AWSDirectoryServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier of the request that caused the exception.
     * </p>
     */
    private String requestId;

    /**
     * Constructs a new AuthenticationFailedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AuthenticationFailedException(String message) {
        super(message);
    }

    /**
     * <p>
     * The identifier of the request that caused the exception.
     * </p>
     * 
     * @param requestId
     *        The identifier of the request that caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The identifier of the request that caused the exception.
     * </p>
     * 
     * @return The identifier of the request that caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The identifier of the request that caused the exception.
     * </p>
     * 
     * @param requestId
     *        The identifier of the request that caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationFailedException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

}
