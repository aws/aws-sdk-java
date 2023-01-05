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
package com.amazonaws.services.detective.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request parameters are invalid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.detective.model.AmazonDetectiveException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code associated with the validation failure.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An explanation of why validation failed.
     * </p>
     */
    private String errorCodeReason;

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
     * The error code associated with the validation failure.
     * </p>
     * 
     * @param errorCode
     *        The error code associated with the validation failure.
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code associated with the validation failure.
     * </p>
     * 
     * @return The error code associated with the validation failure.
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code associated with the validation failure.
     * </p>
     * 
     * @param errorCode
     *        The error code associated with the validation failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ValidationException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code associated with the validation failure.
     * </p>
     * 
     * @param errorCode
     *        The error code associated with the validation failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ValidationException withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * An explanation of why validation failed.
     * </p>
     * 
     * @param errorCodeReason
     *        An explanation of why validation failed.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCodeReason")
    public void setErrorCodeReason(String errorCodeReason) {
        this.errorCodeReason = errorCodeReason;
    }

    /**
     * <p>
     * An explanation of why validation failed.
     * </p>
     * 
     * @return An explanation of why validation failed.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCodeReason")
    public String getErrorCodeReason() {
        return this.errorCodeReason;
    }

    /**
     * <p>
     * An explanation of why validation failed.
     * </p>
     * 
     * @param errorCodeReason
     *        An explanation of why validation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withErrorCodeReason(String errorCodeReason) {
        setErrorCodeReason(errorCodeReason);
        return this;
    }

}
