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
package com.amazonaws.services.devopsguru.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to a request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.devopsguru.model.AmazonDevOpsGuruException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The code of the quota that was exceeded, causing the throttling exception.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The code of the service that caused the throttling exception.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The number of seconds after which the action that caused the throttling exception can be retried.
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
     * The code of the quota that was exceeded, causing the throttling exception.
     * </p>
     * 
     * @param quotaCode
     *        The code of the quota that was exceeded, causing the throttling exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The code of the quota that was exceeded, causing the throttling exception.
     * </p>
     * 
     * @return The code of the quota that was exceeded, causing the throttling exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The code of the quota that was exceeded, causing the throttling exception.
     * </p>
     * 
     * @param quotaCode
     *        The code of the quota that was exceeded, causing the throttling exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The code of the service that caused the throttling exception.
     * </p>
     * 
     * @param serviceCode
     *        The code of the service that caused the throttling exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code of the service that caused the throttling exception.
     * </p>
     * 
     * @return The code of the service that caused the throttling exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code of the service that caused the throttling exception.
     * </p>
     * 
     * @param serviceCode
     *        The code of the service that caused the throttling exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds after which the action that caused the throttling exception can be retried.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds after which the action that caused the throttling exception can be retried.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the action that caused the throttling exception can be retried.
     * </p>
     * 
     * @return The number of seconds after which the action that caused the throttling exception can be retried.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds after which the action that caused the throttling exception can be retried.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds after which the action that caused the throttling exception can be retried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
