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
package com.amazonaws.services.panorama.model;

import javax.annotation.Generated;

/**
 * <p>
 * The target resource is in use.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.panorama.model.AWSPanoramaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     */
    private java.util.List<ConflictExceptionErrorArgument> errorArguments;
    /**
     * <p>
     * A unique ID for the error.
     * </p>
     */
    private String errorId;
    /**
     * <p>
     * The resource's ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource's type.
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
     * A list of attributes that led to the exception and their values.
     * </p>
     * 
     * @return A list of attributes that led to the exception and their values.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorArguments")
    public java.util.List<ConflictExceptionErrorArgument> getErrorArguments() {
        return errorArguments;
    }

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     * 
     * @param errorArguments
     *        A list of attributes that led to the exception and their values.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorArguments")
    public void setErrorArguments(java.util.Collection<ConflictExceptionErrorArgument> errorArguments) {
        if (errorArguments == null) {
            this.errorArguments = null;
            return;
        }

        this.errorArguments = new java.util.ArrayList<ConflictExceptionErrorArgument>(errorArguments);
    }

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorArguments(java.util.Collection)} or {@link #withErrorArguments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param errorArguments
     *        A list of attributes that led to the exception and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withErrorArguments(ConflictExceptionErrorArgument... errorArguments) {
        if (this.errorArguments == null) {
            setErrorArguments(new java.util.ArrayList<ConflictExceptionErrorArgument>(errorArguments.length));
        }
        for (ConflictExceptionErrorArgument ele : errorArguments) {
            this.errorArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     * 
     * @param errorArguments
     *        A list of attributes that led to the exception and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withErrorArguments(java.util.Collection<ConflictExceptionErrorArgument> errorArguments) {
        setErrorArguments(errorArguments);
        return this;
    }

    /**
     * <p>
     * A unique ID for the error.
     * </p>
     * 
     * @param errorId
     *        A unique ID for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorId")
    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    /**
     * <p>
     * A unique ID for the error.
     * </p>
     * 
     * @return A unique ID for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorId")
    public String getErrorId() {
        return this.errorId;
    }

    /**
     * <p>
     * A unique ID for the error.
     * </p>
     * 
     * @param errorId
     *        A unique ID for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withErrorId(String errorId) {
        setErrorId(errorId);
        return this;
    }

    /**
     * <p>
     * The resource's ID.
     * </p>
     * 
     * @param resourceId
     *        The resource's ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource's ID.
     * </p>
     * 
     * @return The resource's ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource's ID.
     * </p>
     * 
     * @param resourceId
     *        The resource's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource's type.
     * </p>
     * 
     * @param resourceType
     *        The resource's type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource's type.
     * </p>
     * 
     * @return The resource's type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource's type.
     * </p>
     * 
     * @param resourceType
     *        The resource's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
