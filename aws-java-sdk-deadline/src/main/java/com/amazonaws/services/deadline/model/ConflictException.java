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
package com.amazonaws.services.deadline.model;

import javax.annotation.Generated;

/**
 * <p>
 * Your request has conflicting operations. This can occur if you're trying to perform more than one operation on the
 * same resource at the same time.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.deadline.model.AWSDeadlineException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * A description of the error.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The identifier of the resource in use.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the resource in use.
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
     * Information about the resources in use when the exception was thrown.
     * </p>
     * 
     * @return Information about the resources in use when the exception was thrown.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     * 
     * @param context
     *        Information about the resources in use when the exception was thrown.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     * 
     * @param context
     *        Information about the resources in use when the exception was thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see ConflictException#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * A description of the error.
     * </p>
     * 
     * @param reason
     *        A description of the error.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A description of the error.
     * </p>
     * 
     * @return A description of the error.
     * @see ConflictExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A description of the error.
     * </p>
     * 
     * @param reason
     *        A description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A description of the error.
     * </p>
     * 
     * @param reason
     *        A description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionReason
     */

    public ConflictException withReason(ConflictExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the resource in use.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource in use.
     * </p>
     * 
     * @return The identifier of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource in use.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the resource in use.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource in use.
     * </p>
     * 
     * @return The type of the resource in use.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource in use.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
