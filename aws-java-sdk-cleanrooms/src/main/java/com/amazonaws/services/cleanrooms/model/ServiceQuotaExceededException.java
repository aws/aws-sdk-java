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
package com.amazonaws.services.cleanrooms.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request denied because service quota has been exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.cleanrooms.model.AWSCleanRoomsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the quota.
     * </p>
     */
    private String quotaName;
    /**
     * <p>
     * The value of the quota.
     * </p>
     */
    private Double quotaValue;

    /**
     * Constructs a new ServiceQuotaExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceQuotaExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * The name of the quota.
     * </p>
     * 
     * @param quotaName
     *        The name of the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaName")
    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    /**
     * <p>
     * The name of the quota.
     * </p>
     * 
     * @return The name of the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaName")
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * <p>
     * The name of the quota.
     * </p>
     * 
     * @param quotaName
     *        The name of the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaName(String quotaName) {
        setQuotaName(quotaName);
        return this;
    }

    /**
     * <p>
     * The value of the quota.
     * </p>
     * 
     * @param quotaValue
     *        The value of the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaValue")
    public void setQuotaValue(Double quotaValue) {
        this.quotaValue = quotaValue;
    }

    /**
     * <p>
     * The value of the quota.
     * </p>
     * 
     * @return The value of the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaValue")
    public Double getQuotaValue() {
        return this.quotaValue;
    }

    /**
     * <p>
     * The value of the quota.
     * </p>
     * 
     * @param quotaValue
     *        The value of the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaValue(Double quotaValue) {
        setQuotaValue(quotaValue);
        return this;
    }

}
