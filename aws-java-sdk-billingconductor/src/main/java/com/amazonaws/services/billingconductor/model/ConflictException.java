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
package com.amazonaws.services.billingconductor.model;

import javax.annotation.Generated;

/**
 * <p>
 * You can cause an inconsistent state by updating or deleting a resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.billingconductor.model.AWSBillingConductorException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Identifier of the resource in use.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Type of the resource in use.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Reason for the inconsistent state.
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
     * Identifier of the resource in use.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Identifier of the resource in use.
     * </p>
     * 
     * @return Identifier of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Identifier of the resource in use.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Type of the resource in use.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of the resource in use.
     * </p>
     * 
     * @return Type of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of the resource in use.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Reason for the inconsistent state.
     * </p>
     * 
     * @param reason
     *        Reason for the inconsistent state.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Reason for the inconsistent state.
     * </p>
     * 
     * @return Reason for the inconsistent state.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Reason for the inconsistent state.
     * </p>
     * 
     * @param reason
     *        Reason for the inconsistent state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Reason for the inconsistent state.
     * </p>
     * 
     * @param reason
     *        Reason for the inconsistent state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(ConflictExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
