/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request couldn't be completed because it conflicted with the current state of the resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.dataexchange.model.AWSDataExchangeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier for the resource with the conflict.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * The unique identifier for the resource with the conflict.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the resource with the conflict.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique identifier for the resource with the conflict.
     * </p>
     * 
     * @return The unique identifier for the resource with the conflict.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique identifier for the resource with the conflict.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the resource with the conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource with the conflict.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     * 
     * @return The type of the resource with the conflict.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource with the conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource with the conflict.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource with the conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

}
