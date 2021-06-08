/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * <p>
 * That resource is already in use. Please try another.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInUseException extends com.amazonaws.services.connect.model.AmazonConnectException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The identifier for the resource.
     * </p>
     */
    private String resourceId;

    /**
     * Constructs a new ResourceInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceInUseException(String message) {
        super(message);
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceInUseException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceInUseException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * 
     * @return The identifier for the resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInUseException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

}
