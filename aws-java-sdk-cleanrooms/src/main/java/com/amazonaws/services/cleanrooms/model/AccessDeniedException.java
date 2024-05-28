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
package com.amazonaws.services.cleanrooms.model;

import javax.annotation.Generated;

/**
 * <p>
 * Caller does not have sufficient access to perform this action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedException extends com.amazonaws.services.cleanrooms.model.AWSCleanRoomsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A reason code for the exception.
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
     * A reason code for the exception.
     * </p>
     * 
     * @param reason
     *        A reason code for the exception.
     * @see AccessDeniedExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A reason code for the exception.
     * </p>
     * 
     * @return A reason code for the exception.
     * @see AccessDeniedExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A reason code for the exception.
     * </p>
     * 
     * @param reason
     *        A reason code for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDeniedExceptionReason
     */

    public AccessDeniedException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A reason code for the exception.
     * </p>
     * 
     * @param reason
     *        A reason code for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessDeniedExceptionReason
     */

    public AccessDeniedException withReason(AccessDeniedExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
