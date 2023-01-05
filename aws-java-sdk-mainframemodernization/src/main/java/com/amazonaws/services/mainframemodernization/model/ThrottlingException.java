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
package com.amazonaws.services.mainframemodernization.model;

import javax.annotation.Generated;

/**
 * <p>
 * The number of requests made exceeds the limit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.mainframemodernization.model.AWSMainframeModernizationException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier of the throttled reuqest.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The number of seconds to wait before retrying the request.
     * </p>
     */
    private Integer retryAfterSeconds;
    /**
     * <p>
     * The identifier of the service that the throttled request was made to.
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
     * The identifier of the throttled reuqest.
     * </p>
     * 
     * @param quotaCode
     *        The identifier of the throttled reuqest.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The identifier of the throttled reuqest.
     * </p>
     * 
     * @return The identifier of the throttled reuqest.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The identifier of the throttled reuqest.
     * </p>
     * 
     * @param quotaCode
     *        The identifier of the throttled reuqest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the request.
     * </p>
     * 
     * @return The number of seconds to wait before retrying the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

    /**
     * <p>
     * The identifier of the service that the throttled request was made to.
     * </p>
     * 
     * @param serviceCode
     *        The identifier of the service that the throttled request was made to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The identifier of the service that the throttled request was made to.
     * </p>
     * 
     * @return The identifier of the service that the throttled request was made to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The identifier of the service that the throttled request was made to.
     * </p>
     * 
     * @param serviceCode
     *        The identifier of the service that the throttled request was made to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
