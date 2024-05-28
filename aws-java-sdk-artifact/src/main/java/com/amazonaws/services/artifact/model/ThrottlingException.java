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
package com.amazonaws.services.artifact.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.artifact.model.AWSArtifactException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Code for the affected quota.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Number of seconds in which the caller can retry the request.
     * </p>
     */
    private Integer retryAfterSeconds;
    /**
     * <p>
     * Code for the affected service.
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
     * Code for the affected quota.
     * </p>
     * 
     * @param quotaCode
     *        Code for the affected quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Code for the affected quota.
     * </p>
     * 
     * @return Code for the affected quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Code for the affected quota.
     * </p>
     * 
     * @param quotaCode
     *        Code for the affected quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Number of seconds in which the caller can retry the request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Number of seconds in which the caller can retry the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * Number of seconds in which the caller can retry the request.
     * </p>
     * 
     * @return Number of seconds in which the caller can retry the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * Number of seconds in which the caller can retry the request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        Number of seconds in which the caller can retry the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * Code for the affected service.
     * </p>
     * 
     * @param serviceCode
     *        Code for the affected service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Code for the affected service.
     * </p>
     * 
     * @return Code for the affected service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Code for the affected service.
     * </p>
     * 
     * @param serviceCode
     *        Code for the affected service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
