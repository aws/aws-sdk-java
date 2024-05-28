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
package com.amazonaws.services.finspace.model;

import javax.annotation.Generated;

/**
 * <p>
 * There was a conflict with this action, and it could not be completed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.finspace.model.AWSfinspaceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     */
    private String reason;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     * 
     * @param reason
     *        The reason for the conflict exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     * 
     * @return The reason for the conflict exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the conflict exception.
     * </p>
     * 
     * @param reason
     *        The reason for the conflict exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withReason(String reason) {
        setReason(reason);
        return this;
    }

}
