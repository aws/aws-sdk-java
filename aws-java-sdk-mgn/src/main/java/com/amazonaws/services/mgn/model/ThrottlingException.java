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
package com.amazonaws.services.mgn.model;

import javax.annotation.Generated;

/**
 * <p>
 * Reached throttling quota exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.mgn.model.AWSmgnException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Reached throttling quota exception.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Reached throttling quota exception will retry after x seconds.
     * </p>
     */
    private String retryAfterSeconds;
    /**
     * <p>
     * Reached throttling quota exception service code.
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
     * Reached throttling quota exception.
     * </p>
     * 
     * @param quotaCode
     *        Reached throttling quota exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Reached throttling quota exception.
     * </p>
     * 
     * @return Reached throttling quota exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Reached throttling quota exception.
     * </p>
     * 
     * @param quotaCode
     *        Reached throttling quota exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Reached throttling quota exception will retry after x seconds.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Reached throttling quota exception will retry after x seconds.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(String retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * Reached throttling quota exception will retry after x seconds.
     * </p>
     * 
     * @return Reached throttling quota exception will retry after x seconds.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public String getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * Reached throttling quota exception will retry after x seconds.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Reached throttling quota exception will retry after x seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(String retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * Reached throttling quota exception service code.
     * </p>
     * 
     * @param serviceCode
     *        Reached throttling quota exception service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Reached throttling quota exception service code.
     * </p>
     * 
     * @return Reached throttling quota exception service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Reached throttling quota exception service code.
     * </p>
     * 
     * @param serviceCode
     *        Reached throttling quota exception service code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
