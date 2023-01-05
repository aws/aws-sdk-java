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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The API encountered an unexpected error and couldn't complete the request. You might be able to successfully issue
 * the request again in the future.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerException extends com.amazonaws.services.pinpointsmsvoicev2.model.AmazonPinpointSMSVoiceV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     */
    private String requestId;

    /**
     * Constructs a new InternalServerException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServerException(String message) {
        super(message);
    }

    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     * 
     * @param requestId
     *        The unique identifier of the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     * 
     * @return The unique identifier of the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     * 
     * @param requestId
     *        The unique identifier of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

}
