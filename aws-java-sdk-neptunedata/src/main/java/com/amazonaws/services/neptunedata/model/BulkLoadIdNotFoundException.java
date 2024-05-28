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
package com.amazonaws.services.neptunedata.model;

import javax.annotation.Generated;

/**
 * <p>
 * Raised when a specified bulk-load job ID cannot be found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkLoadIdNotFoundException extends com.amazonaws.services.neptunedata.model.AmazonNeptunedataException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A detailed message describing the problem.
     * </p>
     */
    private String detailedMessage;
    /**
     * <p>
     * The bulk-load job ID that could not be found.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status code returned with the exception.
     * </p>
     */
    private String code;

    /**
     * Constructs a new BulkLoadIdNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BulkLoadIdNotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * A detailed message describing the problem.
     * </p>
     * 
     * @param detailedMessage
     *        A detailed message describing the problem.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("detailedMessage")
    public void setDetailedMessage(String detailedMessage) {
        this.detailedMessage = detailedMessage;
    }

    /**
     * <p>
     * A detailed message describing the problem.
     * </p>
     * 
     * @return A detailed message describing the problem.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("detailedMessage")
    public String getDetailedMessage() {
        return this.detailedMessage;
    }

    /**
     * <p>
     * A detailed message describing the problem.
     * </p>
     * 
     * @param detailedMessage
     *        A detailed message describing the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkLoadIdNotFoundException withDetailedMessage(String detailedMessage) {
        setDetailedMessage(detailedMessage);
        return this;
    }

    /**
     * <p>
     * The bulk-load job ID that could not be found.
     * </p>
     * 
     * @param requestId
     *        The bulk-load job ID that could not be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The bulk-load job ID that could not be found.
     * </p>
     * 
     * @return The bulk-load job ID that could not be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The bulk-load job ID that could not be found.
     * </p>
     * 
     * @param requestId
     *        The bulk-load job ID that could not be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkLoadIdNotFoundException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status code returned with the exception.
     * </p>
     * 
     * @param code
     *        The HTTP status code returned with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The HTTP status code returned with the exception.
     * </p>
     * 
     * @return The HTTP status code returned with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The HTTP status code returned with the exception.
     * </p>
     * 
     * @param code
     *        The HTTP status code returned with the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkLoadIdNotFoundException withCode(String code) {
        setCode(code);
        return this;
    }

}
