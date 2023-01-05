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
package com.amazonaws.services.appconfigdata.model;

import javax.annotation.Generated;

/**
 * <p>
 * The requested resource could not be found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.appconfigdata.model.AWSAppConfigDataException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of resource that was not found.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A map indicating which parameters in the request reference the resource that was not found.
     * </p>
     */
    private java.util.Map<String, String> referencedBy;

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
     * The type of resource that was not found.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that was not found.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource that was not found.
     * </p>
     * 
     * @return The type of resource that was not found.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource that was not found.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that was not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource that was not found.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that was not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceNotFoundException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * A map indicating which parameters in the request reference the resource that was not found.
     * </p>
     * 
     * @return A map indicating which parameters in the request reference the resource that was not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ReferencedBy")
    public java.util.Map<String, String> getReferencedBy() {
        return referencedBy;
    }

    /**
     * <p>
     * A map indicating which parameters in the request reference the resource that was not found.
     * </p>
     * 
     * @param referencedBy
     *        A map indicating which parameters in the request reference the resource that was not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ReferencedBy")
    public void setReferencedBy(java.util.Map<String, String> referencedBy) {
        this.referencedBy = referencedBy;
    }

    /**
     * <p>
     * A map indicating which parameters in the request reference the resource that was not found.
     * </p>
     * 
     * @param referencedBy
     *        A map indicating which parameters in the request reference the resource that was not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withReferencedBy(java.util.Map<String, String> referencedBy) {
        setReferencedBy(referencedBy);
        return this;
    }

    /**
     * Add a single ReferencedBy entry
     *
     * @see ResourceNotFoundException#withReferencedBy
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException addReferencedByEntry(String key, String value) {
        if (null == this.referencedBy) {
            this.referencedBy = new java.util.HashMap<String, String>();
        }
        if (this.referencedBy.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.referencedBy.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ReferencedBy.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException clearReferencedByEntries() {
        this.referencedBy = null;
        return this;
    }

}
