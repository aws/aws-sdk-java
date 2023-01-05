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
 * The resource that you want to tag couldn't be found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.chimesdkmeetings.model.AmazonChimeSDKMeetingsException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * The ID of the resource that couldn't be found.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The name of the resource that couldn't be found.
     * </p>
     */
    private String resourceName;

    /**
     * Constructs a new ResourceNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
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

    public ResourceNotFoundException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The ID of the resource that couldn't be found.
     * </p>
     * 
     * @param requestId
     *        The ID of the resource that couldn't be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The ID of the resource that couldn't be found.
     * </p>
     * 
     * @return The ID of the resource that couldn't be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The ID of the resource that couldn't be found.
     * </p>
     * 
     * @param requestId
     *        The ID of the resource that couldn't be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The name of the resource that couldn't be found.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource that couldn't be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource that couldn't be found.
     * </p>
     * 
     * @return The name of the resource that couldn't be found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource that couldn't be found.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource that couldn't be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
