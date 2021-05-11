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
package com.amazonaws.services.ssmcontacts.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.ssmcontacts.model.AWSSSMContactsException {
    private static final long serialVersionUID = 1L;

    /** Service Quotas requirement to identify originating service */
    private String quotaCode;
    /** Service Quotas requirement to identify originating quota */
    private String serviceCode;
    /** Advice to clients on when the call can be safely retried */
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
     * Service Quotas requirement to identify originating service
     * 
     * @param quotaCode
     *        Service Quotas requirement to identify originating service
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * Service Quotas requirement to identify originating service
     * 
     * @return Service Quotas requirement to identify originating service
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * Service Quotas requirement to identify originating service
     * 
     * @param quotaCode
     *        Service Quotas requirement to identify originating service
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * Service Quotas requirement to identify originating quota
     * 
     * @param serviceCode
     *        Service Quotas requirement to identify originating quota
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * Service Quotas requirement to identify originating quota
     * 
     * @return Service Quotas requirement to identify originating quota
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * Service Quotas requirement to identify originating quota
     * 
     * @param serviceCode
     *        Service Quotas requirement to identify originating quota
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * Advice to clients on when the call can be safely retried
     * 
     * @param retryAfterSeconds
     *        Advice to clients on when the call can be safely retried
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RetryAfterSeconds")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * Advice to clients on when the call can be safely retried
     * 
     * @return Advice to clients on when the call can be safely retried
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RetryAfterSeconds")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * Advice to clients on when the call can be safely retried
     * 
     * @param retryAfterSeconds
     *        Advice to clients on when the call can be safely retried
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
