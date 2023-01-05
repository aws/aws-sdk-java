/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input does not satisfy the constraints specified by an Amazon Web Services service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.stepfunctions.model.AWSStepFunctionsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The input does not satisfy the constraints specified by an Amazon Web Services service.
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
     * The input does not satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param reason
     *        The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The input does not satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @return The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The input does not satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param reason
     *        The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The input does not satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param reason
     *        The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
