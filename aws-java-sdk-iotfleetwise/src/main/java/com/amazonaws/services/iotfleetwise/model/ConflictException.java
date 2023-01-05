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
package com.amazonaws.services.iotfleetwise.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request has conflicting operations. This can occur if you're trying to perform more than one operation on the
 * same resource at the same time.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.iotfleetwise.model.AWSIoTFleetWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource on which there are conflicting operations.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The type of resource on which there are conflicting operations..
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
     * The resource on which there are conflicting operations.
     * </p>
     * 
     * @param resource
     *        The resource on which there are conflicting operations.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource on which there are conflicting operations.
     * </p>
     * 
     * @return The resource on which there are conflicting operations.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource on which there are conflicting operations.
     * </p>
     * 
     * @param resource
     *        The resource on which there are conflicting operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The type of resource on which there are conflicting operations..
     * </p>
     * 
     * @param resourceType
     *        The type of resource on which there are conflicting operations..
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource on which there are conflicting operations..
     * </p>
     * 
     * @return The type of resource on which there are conflicting operations..
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource on which there are conflicting operations..
     * </p>
     * 
     * @param resourceType
     *        The type of resource on which there are conflicting operations..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
