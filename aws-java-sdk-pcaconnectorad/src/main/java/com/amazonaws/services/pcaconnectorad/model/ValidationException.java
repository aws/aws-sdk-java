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
package com.amazonaws.services.pcaconnectorad.model;

import javax.annotation.Generated;

/**
 * <p>
 * An input validation error occurred. For example, invalid characters in a template name, or if a pagination token is
 * invalid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.pcaconnectorad.model.AWSPcaConnectorAdException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The reason for the validation error. This won't be return for every validation exception.
     * </p>
     */
    private String reason;

    /**
     * Constructs a new ValidationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ValidationException(String message) {
        super(message);
    }

    /**
     * <p>
     * The reason for the validation error. This won't be return for every validation exception.
     * </p>
     * 
     * @param reason
     *        The reason for the validation error. This won't be return for every validation exception.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the validation error. This won't be return for every validation exception.
     * </p>
     * 
     * @return The reason for the validation error. This won't be return for every validation exception.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the validation error. This won't be return for every validation exception.
     * </p>
     * 
     * @param reason
     *        The reason for the validation error. This won't be return for every validation exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the validation error. This won't be return for every validation exception.
     * </p>
     * 
     * @param reason
     *        The reason for the validation error. This won't be return for every validation exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
