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
 * You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of service
 * resources or operations for your Amazon Web Services account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.deadline.model.AWSDeadlineException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * Identifies the quota that has been exceeded.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * A string that describes the reason the quota was exceeded.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The identifier of the affected resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the affected resource
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Identifies the service that exceeded the quota.
     * </p>
     */
    private String serviceCode;

    /**
     * Constructs a new ServiceQuotaExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceQuotaExceededException(String message) {
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

    public ServiceQuotaExceededException withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see ServiceQuotaExceededException#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException addContextEntry(String key, String value) {
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

    public ServiceQuotaExceededException clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * Identifies the quota that has been exceeded.
     * </p>
     * 
     * @param quotaCode
     *        Identifies the quota that has been exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Identifies the quota that has been exceeded.
     * </p>
     * 
     * @return Identifies the quota that has been exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Identifies the quota that has been exceeded.
     * </p>
     * 
     * @param quotaCode
     *        Identifies the quota that has been exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * A string that describes the reason the quota was exceeded.
     * </p>
     * 
     * @param reason
     *        A string that describes the reason the quota was exceeded.
     * @see ServiceQuotaExceededExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A string that describes the reason the quota was exceeded.
     * </p>
     * 
     * @return A string that describes the reason the quota was exceeded.
     * @see ServiceQuotaExceededExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A string that describes the reason the quota was exceeded.
     * </p>
     * 
     * @param reason
     *        A string that describes the reason the quota was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceQuotaExceededExceptionReason
     */

    public ServiceQuotaExceededException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A string that describes the reason the quota was exceeded.
     * </p>
     * 
     * @param reason
     *        A string that describes the reason the quota was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceQuotaExceededExceptionReason
     */

    public ServiceQuotaExceededException withReason(ServiceQuotaExceededExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the affected resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the affected resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the affected resource.
     * </p>
     * 
     * @return The identifier of the affected resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the affected resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the affected resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the affected resource
     * </p>
     * 
     * @param resourceType
     *        The type of the affected resource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the affected resource
     * </p>
     * 
     * @return The type of the affected resource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the affected resource
     * </p>
     * 
     * @param resourceType
     *        The type of the affected resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Identifies the service that exceeded the quota.
     * </p>
     * 
     * @param serviceCode
     *        Identifies the service that exceeded the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Identifies the service that exceeded the quota.
     * </p>
     * 
     * @return Identifies the service that exceeded the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Identifies the service that exceeded the quota.
     * </p>
     * 
     * @param serviceCode
     *        Identifies the service that exceeded the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
