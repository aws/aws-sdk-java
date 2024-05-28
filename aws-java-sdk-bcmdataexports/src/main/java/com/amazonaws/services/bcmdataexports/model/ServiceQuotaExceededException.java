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
 * You've reached the limit on the number of resources you can create, or exceeded the size of an individual resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.bcmdataexports.model.AWSBCMDataExportsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The quota code that was exceeded.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The identifier of the resource that exceeded quota.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the resource that exceeded quota.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The service code that exceeded quota. It will always be “AWSBillingAndCostManagementDataExports”.
     * </p>
     */
    private String serviceCode;

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
     * The quota code that was exceeded.
     * </p>
     * 
     * @param quotaCode
     *        The quota code that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota code that was exceeded.
     * </p>
     * 
     * @return The quota code that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota code that was exceeded.
     * </p>
     * 
     * @param quotaCode
     *        The quota code that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The identifier of the resource that exceeded quota.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource that exceeded quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource that exceeded quota.
     * </p>
     * 
     * @return The identifier of the resource that exceeded quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource that exceeded quota.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource that exceeded quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the resource that exceeded quota.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that exceeded quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that exceeded quota.
     * </p>
     * 
     * @return The type of the resource that exceeded quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource that exceeded quota.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that exceeded quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The service code that exceeded quota. It will always be “AWSBillingAndCostManagementDataExports”.
     * </p>
     * 
     * @param serviceCode
     *        The service code that exceeded quota. It will always be “AWSBillingAndCostManagementDataExports”.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code that exceeded quota. It will always be “AWSBillingAndCostManagementDataExports”.
     * </p>
     * 
     * @return The service code that exceeded quota. It will always be “AWSBillingAndCostManagementDataExports”.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code that exceeded quota. It will always be “AWSBillingAndCostManagementDataExports”.
     * </p>
     * 
     * @param serviceCode
     *        The service code that exceeded quota. It will always be “AWSBillingAndCostManagementDataExports”.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
