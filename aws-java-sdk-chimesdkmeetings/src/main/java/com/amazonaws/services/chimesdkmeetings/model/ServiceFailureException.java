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
package com.amazonaws.services.chimesdkmeetings.model;

import javax.annotation.Generated;

/**
 * <p>
 * The service encountered an unexpected error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceFailureException extends com.amazonaws.services.chimesdkmeetings.model.AmazonChimeSDKMeetingsException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * The ID of the failed request.
     * </p>
     */
    private String requestId;

    /**
     * Constructs a new ServiceFailureException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceFailureException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceFailureException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The ID of the failed request.
     * </p>
     * 
     * @param requestId
     *        The ID of the failed request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The ID of the failed request.
     * </p>
     * 
     * @return The ID of the failed request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The ID of the failed request.
     * </p>
     * 
     * @param requestId
     *        The ID of the failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceFailureException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

}
