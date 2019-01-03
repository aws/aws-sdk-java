/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when a resource is not found by the AWS Transfer for SFTP service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.transfer.model.AWSTransferException {
    private static final long serialVersionUID = 1L;

    private String resource;

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
     * @param resource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Resource")
    public String getResource() {
        return this.resource;
    }

    /**
     * @param resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * @param resourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @param resourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
