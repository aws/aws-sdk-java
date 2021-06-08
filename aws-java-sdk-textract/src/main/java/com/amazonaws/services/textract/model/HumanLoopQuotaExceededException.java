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
package com.amazonaws.services.textract.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates you have exceeded the maximum number of active human in the loop workflows available
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopQuotaExceededException extends com.amazonaws.services.textract.model.AmazonTextractException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The quota code.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The service code.
     * </p>
     */
    private String serviceCode;

    /**
     * Constructs a new HumanLoopQuotaExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public HumanLoopQuotaExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The quota code.
     * </p>
     * 
     * @param quotaCode
     *        The quota code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota code.
     * </p>
     * 
     * @return The quota code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota code.
     * </p>
     * 
     * @param quotaCode
     *        The quota code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The service code.
     * </p>
     * 
     * @param serviceCode
     *        The service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code.
     * </p>
     * 
     * @return The service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code.
     * </p>
     * 
     * @param serviceCode
     *        The service code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
