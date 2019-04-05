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
package com.amazonaws.services.workspaces.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified resource is not available.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceUnavailableException extends com.amazonaws.services.workspaces.model.AmazonWorkspacesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier of the resource that is not available.
     * </p>
     */
    private String resourceId;

    /**
     * Constructs a new ResourceUnavailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceUnavailableException(String message) {
        super(message);
    }

    /**
     * <p>
     * The identifier of the resource that is not available.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource that is not available.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource that is not available.
     * </p>
     * 
     * @return The identifier of the resource that is not available.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource that is not available.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource that is not available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceUnavailableException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

}
