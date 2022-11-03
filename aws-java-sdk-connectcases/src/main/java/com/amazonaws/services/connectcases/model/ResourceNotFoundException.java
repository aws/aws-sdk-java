/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import javax.annotation.Generated;

/**
 * <p>
 * We couldn't find the requested resource. Check that your resources exists and were created in the same Amazon Web
 * Services Region as your request, and try your request again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.connectcases.model.AmazonConnectCasesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Unique identifier of the resource affected.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Type of the resource affected.
     * </p>
     */
    private String resourceType;

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
     * <p>
     * Unique identifier of the resource affected.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Unique identifier of the resource affected.
     * </p>
     * 
     * @return Unique identifier of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Unique identifier of the resource affected.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier of the resource affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Type of the resource affected.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of the resource affected.
     * </p>
     * 
     * @return Type of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of the resource affected.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
