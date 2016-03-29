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

package com.amazonaws.services.inspector.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request was rejected because it attempted to create resources beyond the
 * current AWS account limits. The error code describes the limit exceeded.
 * </p>
 */
public class LimitExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private String errorCode;
    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    private Boolean canRetry;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param errorCode
     *        Code that indicates the type of error that is generated.
     * @see LimitExceededErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @return Code that indicates the type of error that is generated.
     * @see LimitExceededErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param errorCode
     *        Code that indicates the type of error that is generated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LimitExceededErrorCode
     */

    public LimitExceededException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param errorCode
     *        Code that indicates the type of error that is generated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LimitExceededErrorCode
     */

    public void setErrorCode(LimitExceededErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param errorCode
     *        Code that indicates the type of error that is generated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see LimitExceededErrorCode
     */

    public LimitExceededException withErrorCode(LimitExceededErrorCode errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     */

    public void setCanRetry(Boolean canRetry) {
        this.canRetry = canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    public Boolean getCanRetry() {
        return this.canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public LimitExceededException withCanRetry(Boolean canRetry) {
        setCanRetry(canRetry);
        return this;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    public Boolean isCanRetry() {
        return this.canRetry;
    }

}