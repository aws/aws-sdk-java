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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request was denied because the request was throttled.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.migrationhubrefactorspaces.model.AWSMigrationHubRefactorSpacesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The number of seconds to wait before retrying.
     * </p>
     */
    private Integer retryAfterSeconds;
    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
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
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     * 
     * @param quotaCode
     *        Service quota requirement to identify originating quota. Reached throttling quota exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     * 
     * @return Service quota requirement to identify originating quota. Reached throttling quota exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     * 
     * @param quotaCode
     *        Service quota requirement to identify originating quota. Reached throttling quota exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying.
     * </p>
     * 
     * @return The number of seconds to wait before retrying.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
     * </p>
     * 
     * @param serviceCode
     *        Service quota requirement to identify originating service. Reached throttling quota exception service
     *        code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
     * </p>
     * 
     * @return Service quota requirement to identify originating service. Reached throttling quota exception service
     *         code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
     * </p>
     * 
     * @param serviceCode
     *        Service quota requirement to identify originating service. Reached throttling quota exception service
     *        code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
