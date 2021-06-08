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
package com.amazonaws.services.wellarchitected.model;

import javax.annotation.Generated;

/**
 * <p>
 * The user has reached their resource quota.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.wellarchitected.model.AWSWellArchitectedException {
    private static final long serialVersionUID = 1L;

    private String resourceId;

    private String resourceType;

    private String quotaCode;

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
     * @param resourceId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @param resourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * @param resourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @param resourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * @param quotaCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * @param quotaCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * @param serviceCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @param serviceCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
