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
package com.amazonaws.services.securitylake.model;

import javax.annotation.Generated;

/**
 * <p>
 * Occurs when a conflict with a previous successful write is detected. This generally occurs when the previous write
 * did not have time to propagate to the host serving the current request. A retry (with appropriate backoff logic) is
 * the recommended response to this exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.securitylake.model.AmazonSecurityLakeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A conflict occurred when prompting for the Resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type.
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
     * A conflict occurred when prompting for the Resource ID.
     * </p>
     * 
     * @param resourceId
     *        A conflict occurred when prompting for the Resource ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * A conflict occurred when prompting for the Resource ID.
     * </p>
     * 
     * @return A conflict occurred when prompting for the Resource ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * A conflict occurred when prompting for the Resource ID.
     * </p>
     * 
     * @param resourceId
     *        A conflict occurred when prompting for the Resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
