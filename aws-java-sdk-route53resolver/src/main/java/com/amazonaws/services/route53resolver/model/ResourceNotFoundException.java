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
package com.amazonaws.services.route53resolver.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified resource doesn't exist.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.route53resolver.model.AmazonRoute53ResolverException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * For a <code>ResourceNotFoundException</code> error, the type of resource that doesn't exist.
     * </p>
     */
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
     * <p>
     * For a <code>ResourceNotFoundException</code> error, the type of resource that doesn't exist.
     * </p>
     * 
     * @param resourceType
     *        For a <code>ResourceNotFoundException</code> error, the type of resource that doesn't exist.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * For a <code>ResourceNotFoundException</code> error, the type of resource that doesn't exist.
     * </p>
     * 
     * @return For a <code>ResourceNotFoundException</code> error, the type of resource that doesn't exist.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * For a <code>ResourceNotFoundException</code> error, the type of resource that doesn't exist.
     * </p>
     * 
     * @param resourceType
     *        For a <code>ResourceNotFoundException</code> error, the type of resource that doesn't exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
