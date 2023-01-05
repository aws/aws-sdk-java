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
package com.amazonaws.services.drs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.drs.model.AWSdrsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Quota code.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The number of seconds after which the request should be safe to retry.
     * </p>
     */
    private String retryAfterSeconds;
    /**
     * <p>
     * Service code.
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
     * Quota code.
     * </p>
     * 
     * @param quotaCode
     *        Quota code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Quota code.
     * </p>
     * 
     * @return Quota code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Quota code.
     * </p>
     * 
     * @param quotaCode
     *        Quota code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds after which the request should be safe to retry.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds after which the request should be safe to retry.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(String retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the request should be safe to retry.
     * </p>
     * 
     * @return The number of seconds after which the request should be safe to retry.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public String getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the request should be safe to retry.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds after which the request should be safe to retry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(String retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * Service code.
     * </p>
     * 
     * @param serviceCode
     *        Service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Service code.
     * </p>
     * 
     * @return Service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Service code.
     * </p>
     * 
     * @param serviceCode
     *        Service code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
