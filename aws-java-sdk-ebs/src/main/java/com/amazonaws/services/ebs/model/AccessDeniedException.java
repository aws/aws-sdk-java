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
package com.amazonaws.services.ebs.model;

import javax.annotation.Generated;

/**
 * <p>
 * You do not have sufficient access to perform this action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedException extends com.amazonaws.services.ebs.model.AmazonEBSException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The reason for the exception.
     * </p>
     */
    private String reason;

    /**
     * Constructs a new AccessDeniedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AccessDeniedException(String message) {
        super(message);
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * 
     * @param reason
     *        The reason for the exception.
     * @see AccessDeniedExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * 
     * @return The reason for the exception.
     * @see AccessDeniedExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * 
     * @param reason
     *        The reason for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDeniedExceptionReason
     */

    public AccessDeniedException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * 
     * @param reason
     *        The reason for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDeniedExceptionReason
     */

    public AccessDeniedException withReason(AccessDeniedExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
