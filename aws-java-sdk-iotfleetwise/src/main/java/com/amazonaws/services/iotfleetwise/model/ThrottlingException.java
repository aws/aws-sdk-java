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
package com.amazonaws.services.iotfleetwise.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request couldn't be completed due to throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.iotfleetwise.model.AWSIoTFleetWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The quota identifier of the applied throttling rules for this request.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The code for the service that couldn't be completed due to throttling.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The number of seconds to wait before retrying the command.
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
     * The quota identifier of the applied throttling rules for this request.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier of the applied throttling rules for this request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota identifier of the applied throttling rules for this request.
     * </p>
     * 
     * @return The quota identifier of the applied throttling rules for this request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota identifier of the applied throttling rules for this request.
     * </p>
     * 
     * @param quotaCode
     *        The quota identifier of the applied throttling rules for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The code for the service that couldn't be completed due to throttling.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service that couldn't be completed due to throttling.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the service that couldn't be completed due to throttling.
     * </p>
     * 
     * @return The code for the service that couldn't be completed due to throttling.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the service that couldn't be completed due to throttling.
     * </p>
     * 
     * @param serviceCode
     *        The code for the service that couldn't be completed due to throttling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the command.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the command.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfterSeconds")
    public void setRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the command.
     * </p>
     * 
     * @return The number of seconds to wait before retrying the command.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfterSeconds")
    public Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before retrying the command.
     * </p>
     * 
     * @param retryAfterSeconds
     *        The number of seconds to wait before retrying the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withRetryAfterSeconds(Integer retryAfterSeconds) {
        setRetryAfterSeconds(retryAfterSeconds);
        return this;
    }

}
