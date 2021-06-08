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
package com.amazonaws.services.iotwireless.model;

import javax.annotation.Generated;

/**
 * <p>
 * Adding, updating, or deleting the resource can cause an inconsistent state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.iotwireless.model.AWSIoTWirelessException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Id of the resource in the conflicting operation.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Type of the resource in the conflicting operation.
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
     * Id of the resource in the conflicting operation.
     * </p>
     * 
     * @param resourceId
     *        Id of the resource in the conflicting operation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Id of the resource in the conflicting operation.
     * </p>
     * 
     * @return Id of the resource in the conflicting operation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Id of the resource in the conflicting operation.
     * </p>
     * 
     * @param resourceId
     *        Id of the resource in the conflicting operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Type of the resource in the conflicting operation.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource in the conflicting operation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of the resource in the conflicting operation.
     * </p>
     * 
     * @return Type of the resource in the conflicting operation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of the resource in the conflicting operation.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource in the conflicting operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
