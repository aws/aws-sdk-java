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
package com.amazonaws.services.pinpoint.model;

import javax.annotation.Generated;

/**
 * Simple message object.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestException extends com.amazonaws.services.pinpoint.model.AmazonPinpointException {
    private static final long serialVersionUID = 1L;

    /** The unique message body ID. */
    private String requestID;

    /**
     * Constructs a new BadRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * The unique message body ID.
     * 
     * @param requestID
     *        The unique message body ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestID")
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * The unique message body ID.
     * 
     * @return The unique message body ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestID")
    public String getRequestID() {
        return this.requestID;
    }

    /**
     * The unique message body ID.
     * 
     * @param requestID
     *        The unique message body ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException withRequestID(String requestID) {
        setRequestID(requestID);
        return this;
    }

}
