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
package com.amazonaws.services.ssmcontacts.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request references a resource that doesn't exist.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.ssmcontacts.model.AWSSSMContactsException {
    private static final long serialVersionUID = 1L;

    /** Hypothetical resource identifier that was not found */
    private String resourceId;
    /** Hypothetical resource type that was not found */
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
     * Hypothetical resource identifier that was not found
     * 
     * @param resourceId
     *        Hypothetical resource identifier that was not found
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Hypothetical resource identifier that was not found
     * 
     * @return Hypothetical resource identifier that was not found
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Hypothetical resource identifier that was not found
     * 
     * @param resourceId
     *        Hypothetical resource identifier that was not found
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * Hypothetical resource type that was not found
     * 
     * @param resourceType
     *        Hypothetical resource type that was not found
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Hypothetical resource type that was not found
     * 
     * @return Hypothetical resource type that was not found
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Hypothetical resource type that was not found
     * 
     * @param resourceType
     *        Hypothetical resource type that was not found
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
