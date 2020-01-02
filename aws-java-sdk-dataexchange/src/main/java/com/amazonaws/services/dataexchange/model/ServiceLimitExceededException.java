/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request has exceeded the quotas imposed by the service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLimitExceededException extends com.amazonaws.services.dataexchange.model.AWSDataExchangeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     */
    private String limitName;
    /**
     * <p>
     * The maximum value for the service-specific limit.
     * </p>
     */
    private Double limitValue;

    /**
     * Constructs a new ServiceLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceLimitExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     * 
     * @param limitName
     *        The name of the quota that was exceeded.
     * @see LimitName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitName")
    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     * 
     * @return The name of the quota that was exceeded.
     * @see LimitName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitName")
    public String getLimitName() {
        return this.limitName;
    }

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     * 
     * @param limitName
     *        The name of the quota that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LimitName
     */

    public ServiceLimitExceededException withLimitName(String limitName) {
        setLimitName(limitName);
        return this;
    }

    /**
     * <p>
     * The name of the quota that was exceeded.
     * </p>
     * 
     * @param limitName
     *        The name of the quota that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LimitName
     */

    public ServiceLimitExceededException withLimitName(LimitName limitName) {
        this.limitName = limitName.toString();
        return this;
    }

    /**
     * <p>
     * The maximum value for the service-specific limit.
     * </p>
     * 
     * @param limitValue
     *        The maximum value for the service-specific limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitValue")
    public void setLimitValue(Double limitValue) {
        this.limitValue = limitValue;
    }

    /**
     * <p>
     * The maximum value for the service-specific limit.
     * </p>
     * 
     * @return The maximum value for the service-specific limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitValue")
    public Double getLimitValue() {
        return this.limitValue;
    }

    /**
     * <p>
     * The maximum value for the service-specific limit.
     * </p>
     * 
     * @param limitValue
     *        The maximum value for the service-specific limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimitExceededException withLimitValue(Double limitValue) {
        setLimitValue(limitValue);
        return this;
    }

}
