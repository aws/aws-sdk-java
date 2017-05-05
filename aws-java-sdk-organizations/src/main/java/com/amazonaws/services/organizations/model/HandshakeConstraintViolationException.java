/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import javax.annotation.Generated;

/**
 * <p>
 * The requested operation would violate the constraint identified in the reason code.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HandshakeConstraintViolationException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    private String reason;

    /**
     * Constructs a new HandshakeConstraintViolationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public HandshakeConstraintViolationException(String message) {
        super(message);
    }

    /**
     * @param reason
     * @see HandshakeConstraintViolationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see HandshakeConstraintViolationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandshakeConstraintViolationExceptionReason
     */

    public HandshakeConstraintViolationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @see HandshakeConstraintViolationExceptionReason
     */

    public void setReason(HandshakeConstraintViolationExceptionReason reason) {
        this.reason = reason.toString();
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandshakeConstraintViolationExceptionReason
     */

    public HandshakeConstraintViolationException withReason(HandshakeConstraintViolationExceptionReason reason) {
        setReason(reason);
        return this;
    }

}
