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
package com.amazonaws.services.amplifybackend.model;

import javax.annotation.Generated;

/**
 * <p>
 * An error returned when a specific resource type is not found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotFoundException extends com.amazonaws.services.amplifybackend.model.AWSAmplifyBackendException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of resource that is not found.
     * </p>
     */
    private String resourceType;

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
     * <p>
     * The type of resource that is not found.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that is not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource that is not found.
     * </p>
     * 
     * @return The type of resource that is not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource that is not found.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that is not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
