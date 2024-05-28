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
package com.amazonaws.services.managedblockchainquery.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request or operation couldn't be performed because a service is throttling requests. The most common source of
 * throttling errors is when you create resources that exceed your service limit for this resource type. Request a limit
 * increase or delete unused resources, if possible.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.managedblockchainquery.model.AmazonManagedBlockchainQueryException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The container for the <code>serviceCode</code>.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The container for the <code>quotaCode</code>.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The container of the <code>retryAfterSeconds</code> value.
     * </p>
     */
    private Integer retryAfterSeconds;

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
     * The container for the <code>serviceCode</code>.
     * </p>
     * 
     * @param serviceCode
     *        The container for the <code>serviceCode</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The container for the <code>serviceCode</code>.
     * </p>
     * 
     * @return The container for the <code>serviceCode</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The container for the <code>serviceCode</code>.
     * </p>
     * 
     * @param serviceCode
     *        The container for the <code>serviceCode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The container for the <code>quotaCode</code>.
     * </p>
     * 
     * @param quotaCode
     *        The container for the <code>quotaCode</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The container for the <code>quotaCode</code>.
     * </p>
     * 
     * @return The container for the <code>quotaCode</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The container for the <code>quotaCode</code>.
     * </p>
     * 
     * @param quotaCode
     *        The container for the <code>quotaCode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The container of the <code>retryAfterSeconds</code> value.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The container of the <code>retryAfterSeconds</code> value.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The container of the <code>retryAfterSeconds</code> value.
     * </p>
     * 
     * @return The container of the <code>retryAfterSeconds</code> value.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The container of the <code>retryAfterSeconds</code> value.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The container of the <code>retryAfterSeconds</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
