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
package com.amazonaws.services.redshiftdataapi.model;

import javax.annotation.Generated;

/**
 * <p>
 * The Amazon Redshift Data API operation failed due to a missing resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.redshiftdataapi.model.AWSRedshiftDataAPIException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Resource identifier associated with the exception.
     * </p>
     */
    private String resourceId;

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
     * Resource identifier associated with the exception.
     * </p>
     * 
     * @param resourceId
     *        Resource identifier associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Resource identifier associated with the exception.
     * </p>
     * 
     * @return Resource identifier associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Resource identifier associated with the exception.
     * </p>
     * 
     * @param resourceId
     *        Resource identifier associated with the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

}
