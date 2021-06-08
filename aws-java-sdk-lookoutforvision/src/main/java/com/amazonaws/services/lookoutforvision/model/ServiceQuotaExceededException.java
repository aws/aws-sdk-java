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
package com.amazonaws.services.lookoutforvision.model;

import javax.annotation.Generated;

/**
 * <p>
 * A service quota was exceeded the allowed limit. For more information, see Limits in Amazon Lookout for Vision in the
 * Amazon Lookout for Vision Developer Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.lookoutforvision.model.AmazonLookoutforVisionException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the resource.
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
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @return The type of the resource.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ServiceQuotaExceededException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
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

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
