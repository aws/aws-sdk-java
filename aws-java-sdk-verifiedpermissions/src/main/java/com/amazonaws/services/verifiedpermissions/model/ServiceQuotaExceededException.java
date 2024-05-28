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
package com.amazonaws.services.verifiedpermissions.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed because it would cause a service quota to be exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.verifiedpermissions.model.AmazonVerifiedPermissionsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique ID of the resource referenced in the failed request.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type of the resource referenced in the failed request.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     */
    private String quotaCode;

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
     * The unique ID of the resource referenced in the failed request.
     * </p>
     * 
     * @param resourceId
     *        The unique ID of the resource referenced in the failed request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique ID of the resource referenced in the failed request.
     * </p>
     * 
     * @return The unique ID of the resource referenced in the failed request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique ID of the resource referenced in the failed request.
     * </p>
     * 
     * @param resourceId
     *        The unique ID of the resource referenced in the failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type of the resource referenced in the failed request.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the resource referenced in the failed request.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of the resource referenced in the failed request.
     * </p>
     * 
     * @return The resource type of the resource referenced in the failed request.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of the resource referenced in the failed request.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the resource referenced in the failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the resource referenced in the failed request.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the resource referenced in the failed request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ServiceQuotaExceededException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     * 
     * @param serviceCode
     *        The code for the Amazon Web Service that owns the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     * 
     * @return The code for the Amazon Web Service that owns the quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the Amazon Web Service that owns the quota.
     * </p>
     * 
     * @param serviceCode
     *        The code for the Amazon Web Service that owns the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     * 
     * @param quotaCode
     *        The quota code recognized by the Amazon Web Services Service Quotas service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     * 
     * @return The quota code recognized by the Amazon Web Services Service Quotas service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota code recognized by the Amazon Web Services Service Quotas service.
     * </p>
     * 
     * @param quotaCode
     *        The quota code recognized by the Amazon Web Services Service Quotas service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

}
