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
package com.amazonaws.services.ssmcontacts.model;

import javax.annotation.Generated;

/**
 * <p>
 * Updating or deleting a resource causes an inconsistent state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.ssmcontacts.model.AWSSSMContactsException {
    private static final long serialVersionUID = 1L;

    /** Identifier of the resource in use */
    private String resourceId;
    /** Type of the resource in use */
    private String resourceType;
    /**
     * List of dependent entities containing information on relation type and resourceArns linked to the resource in use
     */
    private java.util.List<DependentEntity> dependentEntities;

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
     * Identifier of the resource in use
     * 
     * @param resourceId
     *        Identifier of the resource in use
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Identifier of the resource in use
     * 
     * @return Identifier of the resource in use
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Identifier of the resource in use
     * 
     * @param resourceId
     *        Identifier of the resource in use
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * Type of the resource in use
     * 
     * @param resourceType
     *        Type of the resource in use
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Type of the resource in use
     * 
     * @return Type of the resource in use
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Type of the resource in use
     * 
     * @param resourceType
     *        Type of the resource in use
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * List of dependent entities containing information on relation type and resourceArns linked to the resource in use
     * 
     * @return List of dependent entities containing information on relation type and resourceArns linked to the
     *         resource in use
     */

    @com.fasterxml.jackson.annotation.JsonProperty("DependentEntities")
    public java.util.List<DependentEntity> getDependentEntities() {
        return dependentEntities;
    }

    /**
     * List of dependent entities containing information on relation type and resourceArns linked to the resource in use
     * 
     * @param dependentEntities
     *        List of dependent entities containing information on relation type and resourceArns linked to the resource
     *        in use
     */

    @com.fasterxml.jackson.annotation.JsonProperty("DependentEntities")
    public void setDependentEntities(java.util.Collection<DependentEntity> dependentEntities) {
        if (dependentEntities == null) {
            this.dependentEntities = null;
            return;
        }

        this.dependentEntities = new java.util.ArrayList<DependentEntity>(dependentEntities);
    }

    /**
     * List of dependent entities containing information on relation type and resourceArns linked to the resource in use
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependentEntities(java.util.Collection)} or {@link #withDependentEntities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dependentEntities
     *        List of dependent entities containing information on relation type and resourceArns linked to the resource
     *        in use
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withDependentEntities(DependentEntity... dependentEntities) {
        if (this.dependentEntities == null) {
            setDependentEntities(new java.util.ArrayList<DependentEntity>(dependentEntities.length));
        }
        for (DependentEntity ele : dependentEntities) {
            this.dependentEntities.add(ele);
        }
        return this;
    }

    /**
     * List of dependent entities containing information on relation type and resourceArns linked to the resource in use
     * 
     * @param dependentEntities
     *        List of dependent entities containing information on relation type and resourceArns linked to the resource
     *        in use
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withDependentEntities(java.util.Collection<DependentEntity> dependentEntities) {
        setDependentEntities(dependentEntities);
        return this;
    }

}
