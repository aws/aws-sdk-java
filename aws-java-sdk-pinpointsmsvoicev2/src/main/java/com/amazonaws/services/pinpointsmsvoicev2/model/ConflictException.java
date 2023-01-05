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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import javax.annotation.Generated;

/**
 * <p>
 * Your request has conflicting operations. This can occur if you're trying to perform more than one operation on the
 * same resource at the same time or it could be that the requested action isn't valid for the current state or
 * configuration of the resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.pinpointsmsvoicev2.model.AmazonPinpointSMSVoiceV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The reason for the exception.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The type of resource that caused the exception.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     */
    private String resourceId;

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
     * The reason for the exception.
     * </p>
     * 
     * @param reason
     *        The reason for the exception.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * 
     * @return The reason for the exception.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * 
     * @param reason
     *        The reason for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the exception.
     * </p>
     * 
     * @param reason
     *        The reason for the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(ConflictExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The type of resource that caused the exception.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that caused the exception.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource that caused the exception.
     * </p>
     * 
     * @return The type of resource that caused the exception.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource that caused the exception.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource that caused the exception.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier of the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     * 
     * @return The unique identifier of the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique identifier of the request.
     * </p>
     * 
     * @param resourceId
     *        The unique identifier of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

}
