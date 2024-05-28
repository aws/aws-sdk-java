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
package com.amazonaws.services.entityresolution.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because it attempted to create resources beyond the current Entity Resolution account
 * limits. The error message describes the limit exceeded. <code>HTTP Status Code: 402</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExceedsLimitException extends com.amazonaws.services.entityresolution.model.AWSEntityResolutionException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the quota that has been breached.
     * </p>
     */
    private String quotaName;
    /**
     * <p>
     * The current quota value for the customers.
     * </p>
     */
    private Integer quotaValue;

    /**
     * Constructs a new ExceedsLimitException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ExceedsLimitException(String message) {
        super(message);
    }

    /**
     * <p>
     * The name of the quota that has been breached.
     * </p>
     * 
     * @param quotaName
     *        The name of the quota that has been breached.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaName")
    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    /**
     * <p>
     * The name of the quota that has been breached.
     * </p>
     * 
     * @return The name of the quota that has been breached.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaName")
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * <p>
     * The name of the quota that has been breached.
     * </p>
     * 
     * @param quotaName
     *        The name of the quota that has been breached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExceedsLimitException withQuotaName(String quotaName) {
        setQuotaName(quotaName);
        return this;
    }

    /**
     * <p>
     * The current quota value for the customers.
     * </p>
     * 
     * @param quotaValue
     *        The current quota value for the customers.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaValue")
    public void setQuotaValue(Integer quotaValue) {
        this.quotaValue = quotaValue;
    }

    /**
     * <p>
     * The current quota value for the customers.
     * </p>
     * 
     * @return The current quota value for the customers.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaValue")
    public Integer getQuotaValue() {
        return this.quotaValue;
    }

    /**
     * <p>
     * The current quota value for the customers.
     * </p>
     * 
     * @param quotaValue
     *        The current quota value for the customers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExceedsLimitException withQuotaValue(Integer quotaValue) {
        setQuotaValue(quotaValue);
        return this;
    }

}
