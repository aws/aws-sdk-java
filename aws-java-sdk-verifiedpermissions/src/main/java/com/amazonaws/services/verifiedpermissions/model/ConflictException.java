/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed because another request to modify a resource occurred at the same.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.verifiedpermissions.model.AmazonVerifiedPermissionsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The list of resources referenced with this failed request.
     * </p>
     */
    private java.util.List<ResourceConflict> resources;

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
     * The list of resources referenced with this failed request.
     * </p>
     * 
     * @return The list of resources referenced with this failed request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    public java.util.List<ResourceConflict> getResources() {
        return resources;
    }

    /**
     * <p>
     * The list of resources referenced with this failed request.
     * </p>
     * 
     * @param resources
     *        The list of resources referenced with this failed request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    public void setResources(java.util.Collection<ResourceConflict> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<ResourceConflict>(resources);
    }

    /**
     * <p>
     * The list of resources referenced with this failed request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The list of resources referenced with this failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResources(ResourceConflict... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<ResourceConflict>(resources.length));
        }
        for (ResourceConflict ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources referenced with this failed request.
     * </p>
     * 
     * @param resources
     *        The list of resources referenced with this failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResources(java.util.Collection<ResourceConflict> resources) {
        setResources(resources);
        return this;
    }

}
