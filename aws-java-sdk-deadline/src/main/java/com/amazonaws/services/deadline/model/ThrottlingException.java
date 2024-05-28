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
 * Your request exceeded a request rate quota.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.deadline.model.AWSDeadlineException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * Identifies the quota that is being throttled.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The number of seconds a client should wait before retrying the request.
     * </p>
     */
    private Integer retryAfterSeconds;
    /**
     * <p>
     * Identifies the service that is being throttled.
     * </p>
     */
    private String serviceCode;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ThrottlingException(String message) {
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

    public ThrottlingException withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see ThrottlingException#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException addContextEntry(String key, String value) {
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

    public ThrottlingException clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * Identifies the quota that is being throttled.
     * </p>
     * 
     * @param quotaCode
     *        Identifies the quota that is being throttled.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Identifies the quota that is being throttled.
     * </p>
     * 
     * @return Identifies the quota that is being throttled.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Identifies the quota that is being throttled.
     * </p>
     * 
     * @param quotaCode
     *        Identifies the quota that is being throttled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds a client should wait before retrying the request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds a client should wait before retrying the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds a client should wait before retrying the request.
     * </p>
     * 
     * @return The number of seconds a client should wait before retrying the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds a client should wait before retrying the request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds a client should wait before retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * Identifies the service that is being throttled.
     * </p>
     * 
     * @param serviceCode
     *        Identifies the service that is being throttled.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Identifies the service that is being throttled.
     * </p>
     * 
     * @return Identifies the service that is being throttled.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Identifies the service that is being throttled.
     * </p>
     * 
     * @param serviceCode
     *        Identifies the service that is being throttled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
