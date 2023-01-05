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
package com.amazonaws.services.chimesdkmediapipelines.model;

import javax.annotation.Generated;

/**
 * <p>
 * One or more of the resources in the request does not exist in the system.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotFoundException extends com.amazonaws.services.chimesdkmediapipelines.model.AmazonChimeSDKMediaPipelinesException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * The request id associated with the call responsible for the exception.
     * </p>
     */
    private String requestId;

    /**
     * Constructs a new NotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NotFoundException(String message) {
        super(message);
    }

    /**
     * @param code
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     * @see ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public NotFoundException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public NotFoundException withCode(ErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * The request id associated with the call responsible for the exception.
     * </p>
     * 
     * @param requestId
     *        The request id associated with the call responsible for the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request id associated with the call responsible for the exception.
     * </p>
     * 
     * @return The request id associated with the call responsible for the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request id associated with the call responsible for the exception.
     * </p>
     * 
     * @param requestId
     *        The request id associated with the call responsible for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotFoundException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

}
