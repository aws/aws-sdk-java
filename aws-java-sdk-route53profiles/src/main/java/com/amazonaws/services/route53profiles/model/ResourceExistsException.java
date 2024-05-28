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
package com.amazonaws.services.route53profiles.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource you are trying to associate, has already been associated.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceExistsException extends com.amazonaws.services.route53profiles.model.AWSRoute53ProfilesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource type that caused the resource exists exception.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new ResourceExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The resource type that caused the resource exists exception.
     * </p>
     * 
     * @param resourceType
     *        The resource type that caused the resource exists exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type that caused the resource exists exception.
     * </p>
     * 
     * @return The resource type that caused the resource exists exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type that caused the resource exists exception.
     * </p>
     * 
     * @param resourceType
     *        The resource type that caused the resource exists exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceExistsException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
