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
 * The request issuer does not have permission to access this resource or perform this operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedException extends com.amazonaws.services.detective.model.AmazonDetectiveException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The SDK default error code associated with the access denied exception.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The SDK default explanation of why access was denied.
     * </p>
     */
    private String errorCodeReason;
    /**
     * <p>
     * The error code associated with the access denied exception.
     * </p>
     */
    private String subErrorCode;
    /**
     * <p>
     * An explanation of why access was denied.
     * </p>
     */
    private String subErrorCodeReason;

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
     * The SDK default error code associated with the access denied exception.
     * </p>
     * 
     * @param errorCode
     *        The SDK default error code associated with the access denied exception.
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The SDK default error code associated with the access denied exception.
     * </p>
     * 
     * @return The SDK default error code associated with the access denied exception.
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The SDK default error code associated with the access denied exception.
     * </p>
     * 
     * @param errorCode
     *        The SDK default error code associated with the access denied exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public AccessDeniedException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The SDK default error code associated with the access denied exception.
     * </p>
     * 
     * @param errorCode
     *        The SDK default error code associated with the access denied exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public AccessDeniedException withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The SDK default explanation of why access was denied.
     * </p>
     * 
     * @param errorCodeReason
     *        The SDK default explanation of why access was denied.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCodeReason")
    public void setErrorCodeReason(String errorCodeReason) {
        this.errorCodeReason = errorCodeReason;
    }

    /**
     * <p>
     * The SDK default explanation of why access was denied.
     * </p>
     * 
     * @return The SDK default explanation of why access was denied.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCodeReason")
    public String getErrorCodeReason() {
        return this.errorCodeReason;
    }

    /**
     * <p>
     * The SDK default explanation of why access was denied.
     * </p>
     * 
     * @param errorCodeReason
     *        The SDK default explanation of why access was denied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDeniedException withErrorCodeReason(String errorCodeReason) {
        setErrorCodeReason(errorCodeReason);
        return this;
    }

    /**
     * <p>
     * The error code associated with the access denied exception.
     * </p>
     * 
     * @param subErrorCode
     *        The error code associated with the access denied exception.
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SubErrorCode")
    public void setSubErrorCode(String subErrorCode) {
        this.subErrorCode = subErrorCode;
    }

    /**
     * <p>
     * The error code associated with the access denied exception.
     * </p>
     * 
     * @return The error code associated with the access denied exception.
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SubErrorCode")
    public String getSubErrorCode() {
        return this.subErrorCode;
    }

    /**
     * <p>
     * The error code associated with the access denied exception.
     * </p>
     * 
     * @param subErrorCode
     *        The error code associated with the access denied exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public AccessDeniedException withSubErrorCode(String subErrorCode) {
        setSubErrorCode(subErrorCode);
        return this;
    }

    /**
     * <p>
     * The error code associated with the access denied exception.
     * </p>
     * 
     * @param subErrorCode
     *        The error code associated with the access denied exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public AccessDeniedException withSubErrorCode(ErrorCode subErrorCode) {
        this.subErrorCode = subErrorCode.toString();
        return this;
    }

    /**
     * <p>
     * An explanation of why access was denied.
     * </p>
     * 
     * @param subErrorCodeReason
     *        An explanation of why access was denied.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SubErrorCodeReason")
    public void setSubErrorCodeReason(String subErrorCodeReason) {
        this.subErrorCodeReason = subErrorCodeReason;
    }

    /**
     * <p>
     * An explanation of why access was denied.
     * </p>
     * 
     * @return An explanation of why access was denied.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("SubErrorCodeReason")
    public String getSubErrorCodeReason() {
        return this.subErrorCodeReason;
    }

    /**
     * <p>
     * An explanation of why access was denied.
     * </p>
     * 
     * @param subErrorCodeReason
     *        An explanation of why access was denied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDeniedException withSubErrorCodeReason(String subErrorCodeReason) {
        setSubErrorCodeReason(subErrorCodeReason);
        return this;
    }

}
