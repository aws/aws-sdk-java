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
package com.amazonaws.services.cleanrooms.model;

import javax.annotation.Generated;

/**
 * <p>
 * Updating or deleting a resource can cause an inconsistent state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.cleanrooms.model.AWSCleanRoomsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the conflicting resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the conflicting resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A reason code for the exception.
     * </p>
     */
    private String reason;

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
     * The ID of the conflicting resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the conflicting resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the conflicting resource.
     * </p>
     * 
     * @return The ID of the conflicting resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the conflicting resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the conflicting resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the conflicting resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the conflicting resource.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the conflicting resource.
     * </p>
     * 
     * @return The type of the conflicting resource.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the conflicting resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the conflicting resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the conflicting resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the conflicting resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * A reason code for the exception.
     * </p>
     * 
     * @param reason
     *        A reason code for the exception.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A reason code for the exception.
     * </p>
     * 
     * @return A reason code for the exception.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A reason code for the exception.
     * </p>
     * 
     * @param reason
     *        A reason code for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A reason code for the exception.
     * </p>
     * 
     * @param reason
     *        A reason code for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(ConflictExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
