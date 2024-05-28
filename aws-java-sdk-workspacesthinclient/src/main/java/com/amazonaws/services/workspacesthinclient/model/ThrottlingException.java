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
package com.amazonaws.services.workspacesthinclient.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.workspacesthinclient.model.AmazonWorkSpacesThinClientException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The code for the service in <a
     * href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The code for the quota in <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service
     * Quotas</a>.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
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
     * The code for the service in <a
     * href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service in <a
     *        href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the service in <a
     * href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     * </p>
     * 
     * @return The code for the service in <a
     *         href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the service in <a
     * href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service in <a
     *        href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The code for the quota in <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service
     * Quotas</a>.
     * </p>
     * 
     * @param quotaCode
     *        The code for the quota in <a
     *        href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The code for the quota in <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service
     * Quotas</a>.
     * </p>
     * 
     * @return The code for the quota in <a
     *         href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The code for the quota in <a href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service
     * Quotas</a>.
     * </p>
     * 
     * @param quotaCode
     *        The code for the quota in <a
     *        href="https://docs.aws.amazon.com/servicequotas/latest/userguide/intro.html">Service Quotas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the next request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
     * </p>
     * 
     * @return The number of seconds to wait before retrying the next request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Retry-After")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the next request.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
