/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticmapreduce.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This exception occurs when there is something wrong with user input.
 * </p>
 */
public class InvalidRequestException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    private String errorCode;

    /**
     * Constructs a new InvalidRequestException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     * 
     * @param errorCode
     *        The error code associated with the exception.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     * 
     * @return The error code associated with the exception.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     * 
     * @param errorCode
     *        The error code associated with the exception.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public InvalidRequestException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}