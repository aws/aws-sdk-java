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
package com.amazonaws.services.dlm.model;

import javax.annotation.Generated;

/**
 * <p>
 * A requested resource was not found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.dlm.model.AmazonDLMException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * Value is the type of resource that was not found.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Value is a list of resource IDs that were not found.
     * </p>
     */
    private java.util.List<String> resourceIds;

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
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Value is the type of resource that was not found.
     * </p>
     * 
     * @param resourceType
     *        Value is the type of resource that was not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Value is the type of resource that was not found.
     * </p>
     * 
     * @return Value is the type of resource that was not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Value is the type of resource that was not found.
     * </p>
     * 
     * @param resourceType
     *        Value is the type of resource that was not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Value is a list of resource IDs that were not found.
     * </p>
     * 
     * @return Value is a list of resource IDs that were not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceIds")
    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * Value is a list of resource IDs that were not found.
     * </p>
     * 
     * @param resourceIds
     *        Value is a list of resource IDs that were not found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceIds")
    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * Value is a list of resource IDs that were not found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        Value is a list of resource IDs that were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Value is a list of resource IDs that were not found.
     * </p>
     * 
     * @param resourceIds
     *        Value is a list of resource IDs that were not found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

}
