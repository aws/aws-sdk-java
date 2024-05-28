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
package com.amazonaws.services.codegurusecurity.model;

import javax.annotation.Generated;

/**
 * <p>
 * You do not have sufficient access to perform this action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedException extends com.amazonaws.services.codegurusecurity.model.AmazonCodeGuruSecurityException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier for the error.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The identifier for the resource you don't have access to.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of resource you don't have access to.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new AccessDeniedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AccessDeniedException(String message) {
        super(message);
    }

    /**
     * <p>
     * The identifier for the error.
     * </p>
     * 
     * @param errorCode
     *        The identifier for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The identifier for the error.
     * </p>
     * 
     * @return The identifier for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The identifier for the error.
     * </p>
     * 
     * @param errorCode
     *        The identifier for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDeniedException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The identifier for the resource you don't have access to.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource you don't have access to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier for the resource you don't have access to.
     * </p>
     * 
     * @return The identifier for the resource you don't have access to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier for the resource you don't have access to.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the resource you don't have access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDeniedException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource you don't have access to.
     * </p>
     * 
     * @param resourceType
     *        The type of resource you don't have access to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource you don't have access to.
     * </p>
     * 
     * @return The type of resource you don't have access to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource you don't have access to.
     * </p>
     * 
     * @param resourceType
     *        The type of resource you don't have access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDeniedException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
