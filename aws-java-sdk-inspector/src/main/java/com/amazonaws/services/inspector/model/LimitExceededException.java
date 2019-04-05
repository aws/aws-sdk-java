/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because it attempted to create resources beyond the current AWS account limits. The error
 * code describes the limit exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LimitExceededException extends com.amazonaws.services.inspector.model.AmazonInspectorException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     */
    private Boolean canRetry;
    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     */
    private String inspectorErrorCode;

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
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
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

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
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
     * @return Returns a reference to this object so that method calls can be chained together.
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

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @see LimitExceededErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setInspectorErrorCode(String inspectorErrorCode) {
        this.inspectorErrorCode = inspectorErrorCode;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @return Code that indicates the type of error that is generated.
     * @see LimitExceededErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getInspectorErrorCode() {
        return this.inspectorErrorCode;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LimitExceededErrorCode
     */

    public LimitExceededException withInspectorErrorCode(String inspectorErrorCode) {
        setInspectorErrorCode(inspectorErrorCode);
        return this;
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @see LimitExceededErrorCode
     */

    public void setInspectorErrorCode(LimitExceededErrorCode inspectorErrorCode) {
        withInspectorErrorCode(inspectorErrorCode);
    }

    /**
     * <p>
     * Code that indicates the type of error that is generated.
     * </p>
     * 
     * @param inspectorErrorCode
     *        Code that indicates the type of error that is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LimitExceededErrorCode
     */

    public LimitExceededException withInspectorErrorCode(LimitExceededErrorCode inspectorErrorCode) {
        this.inspectorErrorCode = inspectorErrorCode.toString();
        return this;
    }

}
