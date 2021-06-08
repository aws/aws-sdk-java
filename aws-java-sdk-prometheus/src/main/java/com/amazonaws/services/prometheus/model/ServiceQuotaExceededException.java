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
package com.amazonaws.services.prometheus.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request would cause a service quota to be exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.prometheus.model.AmazonPrometheusException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Service Quotas requirement to identify originating quota.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Identifier of the resource affected.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Type of the resource affected.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Service Quotas requirement to identify originating service.
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
     * Service Quotas requirement to identify originating quota.
     * </p>
     * 
     * @param quotaCode
     *        Service Quotas requirement to identify originating quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating quota.
     * </p>
     * 
     * @return Service Quotas requirement to identify originating quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating quota.
     * </p>
     * 
     * @param quotaCode
     *        Service Quotas requirement to identify originating quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Identifier of the resource affected.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Identifier of the resource affected.
     * </p>
     * 
     * @return Identifier of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Identifier of the resource affected.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Type of the resource affected.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of the resource affected.
     * </p>
     * 
     * @return Type of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of the resource affected.
     * </p>
     * 
     * @param resourceType
     *        Type of the resource affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating service.
     * </p>
     * 
     * @param serviceCode
     *        Service Quotas requirement to identify originating service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating service.
     * </p>
     * 
     * @return Service Quotas requirement to identify originating service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Service Quotas requirement to identify originating service.
     * </p>
     * 
     * @param serviceCode
     *        Service Quotas requirement to identify originating service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
