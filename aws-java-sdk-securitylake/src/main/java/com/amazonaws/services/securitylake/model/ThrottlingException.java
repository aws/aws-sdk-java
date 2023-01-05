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
package com.amazonaws.services.securitylake.model;

import javax.annotation.Generated;

/**
 * <p>
 * The limit on the number of requests per second was exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.securitylake.model.AmazonSecurityLakeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * That the rate of requests to Security Lake is exceeding the request quotas for your Amazon Web Services account.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Retry the request after the specified time.
     * </p>
     */
    private Integer retryAfterSeconds;
    /**
     * <p>
     * The code for the service in Service Quotas.
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
     * That the rate of requests to Security Lake is exceeding the request quotas for your Amazon Web Services account.
     * </p>
     * 
     * @param quotaCode
     *        That the rate of requests to Security Lake is exceeding the request quotas for your Amazon Web Services
     *        account.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * That the rate of requests to Security Lake is exceeding the request quotas for your Amazon Web Services account.
     * </p>
     * 
     * @return That the rate of requests to Security Lake is exceeding the request quotas for your Amazon Web Services
     *         account.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * That the rate of requests to Security Lake is exceeding the request quotas for your Amazon Web Services account.
     * </p>
     * 
     * @param quotaCode
     *        That the rate of requests to Security Lake is exceeding the request quotas for your Amazon Web Services
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Retry the request after the specified time.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Retry the request after the specified time.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * Retry the request after the specified time.
     * </p>
     * 
     * @return Retry the request after the specified time.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * Retry the request after the specified time.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Retry the request after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * The code for the service in Service Quotas.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service in Service Quotas.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the service in Service Quotas.
     * </p>
     * 
     * @return The code for the service in Service Quotas.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the service in Service Quotas.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service in Service Quotas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
