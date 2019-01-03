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
 * The resource that you tried to create already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceExistsException extends com.amazonaws.services.route53resolver.model.AmazonRoute53ResolverException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * For a <code>ResourceExistsException</code> error, the type of resource that the error applies to.
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
     * For a <code>ResourceExistsException</code> error, the type of resource that the error applies to.
     * </p>
     * 
     * @param resourceType
     *        For a <code>ResourceExistsException</code> error, the type of resource that the error applies to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * For a <code>ResourceExistsException</code> error, the type of resource that the error applies to.
     * </p>
     * 
     * @return For a <code>ResourceExistsException</code> error, the type of resource that the error applies to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * For a <code>ResourceExistsException</code> error, the type of resource that the error applies to.
     * </p>
     * 
     * @param resourceType
     *        For a <code>ResourceExistsException</code> error, the type of resource that the error applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceExistsException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
