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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request would cause a service quota to be exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.migrationhubrefactorspaces.model.AWSMigrationHubRefactorSpacesException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
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
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     * 
     * @param quotaCode
     *        Service quota requirement to identify originating quota. Reached throttling quota exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     * 
     * @return Service quota requirement to identify originating quota. Reached throttling quota exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("QuotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating quota. Reached throttling quota exception.
     * </p>
     * 
     * @param quotaCode
     *        Service quota requirement to identify originating quota. Reached throttling quota exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @return The type of resource.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource.
     * </p>
     * 
     * @param resourceType
     *        The type of resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
     * </p>
     * 
     * @param serviceCode
     *        Service quota requirement to identify originating service. Reached throttling quota exception service
     *        code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
     * </p>
     * 
     * @return Service quota requirement to identify originating service. Reached throttling quota exception service
     *         code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Service quota requirement to identify originating service. Reached throttling quota exception service code.
     * </p>
     * 
     * @param serviceCode
     *        Service quota requirement to identify originating service. Reached throttling quota exception service
     *        code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
