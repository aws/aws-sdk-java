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
package com.amazonaws.services.bcmdataexports.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied due to request throttling.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.bcmdataexports.model.AWSBCMDataExportsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The quota code that exceeded the throttling limit.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The service code that exceeded the throttling limit. It will always be “AWSBillingAndCostManagementDataExports”.
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
     * The quota code that exceeded the throttling limit.
     * </p>
     * 
     * @param quotaCode
     *        The quota code that exceeded the throttling limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota code that exceeded the throttling limit.
     * </p>
     * 
     * @return The quota code that exceeded the throttling limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota code that exceeded the throttling limit.
     * </p>
     * 
     * @param quotaCode
     *        The quota code that exceeded the throttling limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The service code that exceeded the throttling limit. It will always be “AWSBillingAndCostManagementDataExports”.
     * </p>
     * 
     * @param serviceCode
     *        The service code that exceeded the throttling limit. It will always be
     *        “AWSBillingAndCostManagementDataExports”.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code that exceeded the throttling limit. It will always be “AWSBillingAndCostManagementDataExports”.
     * </p>
     * 
     * @return The service code that exceeded the throttling limit. It will always be
     *         “AWSBillingAndCostManagementDataExports”.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code that exceeded the throttling limit. It will always be “AWSBillingAndCostManagementDataExports”.
     * </p>
     * 
     * @param serviceCode
     *        The service code that exceeded the throttling limit. It will always be
     *        “AWSBillingAndCostManagementDataExports”.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
