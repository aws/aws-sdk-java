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
package com.amazonaws.services.mediapackagev2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified resource doesn't exist.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.mediapackagev2.model.AWSMediaPackageV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The specified resource type wasn't found.
     * </p>
     */
    private String resourceTypeNotFound;

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
     * The specified resource type wasn't found.
     * </p>
     * 
     * @param resourceTypeNotFound
     *        The specified resource type wasn't found.
     * @see ResourceTypeNotFound
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceTypeNotFound")
    public void setResourceTypeNotFound(String resourceTypeNotFound) {
        this.resourceTypeNotFound = resourceTypeNotFound;
    }

    /**
     * <p>
     * The specified resource type wasn't found.
     * </p>
     * 
     * @return The specified resource type wasn't found.
     * @see ResourceTypeNotFound
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceTypeNotFound")
    public String getResourceTypeNotFound() {
        return this.resourceTypeNotFound;
    }

    /**
     * <p>
     * The specified resource type wasn't found.
     * </p>
     * 
     * @param resourceTypeNotFound
     *        The specified resource type wasn't found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeNotFound
     */

    public ResourceNotFoundException withResourceTypeNotFound(String resourceTypeNotFound) {
        setResourceTypeNotFound(resourceTypeNotFound);
        return this;
    }

    /**
     * <p>
     * The specified resource type wasn't found.
     * </p>
     * 
     * @param resourceTypeNotFound
     *        The specified resource type wasn't found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeNotFound
     */

    public ResourceNotFoundException withResourceTypeNotFound(ResourceTypeNotFound resourceTypeNotFound) {
        this.resourceTypeNotFound = resourceTypeNotFound.toString();
        return this;
    }

}
