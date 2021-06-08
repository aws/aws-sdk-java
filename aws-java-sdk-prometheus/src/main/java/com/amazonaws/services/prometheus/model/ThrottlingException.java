/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.prometheus.model.AmazonPrometheusException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Service Quotas requirement to identify originating quota.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Advice to clients on when the call can be safely retried.
     * </p>
     */
    private Integer retryAfterSeconds;
    /**
     * <p>
     * Service Quotas requirement to identify originating service.
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
     * Service Quotas requirement to identify originating quota.
     * </p>
     * 
     * @param quotaCode
     *        Service Quotas requirement to identify originating quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating quota.
     * </p>
     * 
     * @return Service Quotas requirement to identify originating quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating quota.
     * </p>
     * 
     * @param quotaCode
     *        Service Quotas requirement to identify originating quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Advice to clients on when the call can be safely retried.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Advice to clients on when the call can be safely retried.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * Advice to clients on when the call can be safely retried.
     * </p>
     * 
     * @return Advice to clients on when the call can be safely retried.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * Advice to clients on when the call can be safely retried.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Advice to clients on when the call can be safely retried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating service.
     * </p>
     * 
     * @param serviceCode
     *        Service Quotas requirement to identify originating service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating service.
     * </p>
     * 
     * @return Service Quotas requirement to identify originating service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating service.
     * </p>
     * 
     * @param serviceCode
     *        Service Quotas requirement to identify originating service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
