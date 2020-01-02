/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import javax.annotation.Generated;

/**
 * <p>
 * Provides information about an API request or response.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyRequestsException extends com.amazonaws.services.pinpoint.model.AmazonPinpointException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     */
    private String requestID;

    /**
     * Constructs a new TooManyRequestsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyRequestsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request or response.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestID")
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     * 
     * @return The unique identifier for the request or response.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestID")
    public String getRequestID() {
        return this.requestID;
    }

    /**
     * <p>
     * The unique identifier for the request or response.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request or response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooManyRequestsException withRequestID(String requestID) {
        setRequestID(requestID);
        return this;
    }

}
