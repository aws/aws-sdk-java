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
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request is not valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.connect.model.AmazonConnectException {
    private static final long serialVersionUID = 1L;

    private InvalidRequestExceptionReason reason;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * @param reason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(InvalidRequestExceptionReason reason) {
        this.reason = reason;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public InvalidRequestExceptionReason getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withReason(InvalidRequestExceptionReason reason) {
        setReason(reason);
        return this;
    }

}
