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
package com.amazonaws.services.b2bi.model;

import javax.annotation.Generated;

/**
 * <p>
 * Occurs when the calling command attempts to exceed one of the service quotas, for example trying to create a
 * capability when you already have the maximum number of capabilities allowed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.b2bi.model.AWSB2BiException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID for the resource that exceeded the quota, which caused the exception.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type (profile, partnership, transformer, or capability) that exceeded the quota, which caused the
     * exception.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The code responsible for exceeding the quota, which caused the exception.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The quota that was exceeded, which caused the exception.
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
     * The ID for the resource that exceeded the quota, which caused the exception.
     * </p>
     * 
     * @param resourceId
     *        The ID for the resource that exceeded the quota, which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID for the resource that exceeded the quota, which caused the exception.
     * </p>
     * 
     * @return The ID for the resource that exceeded the quota, which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID for the resource that exceeded the quota, which caused the exception.
     * </p>
     * 
     * @param resourceId
     *        The ID for the resource that exceeded the quota, which caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type (profile, partnership, transformer, or capability) that exceeded the quota, which caused the
     * exception.
     * </p>
     * 
     * @param resourceType
     *        The resource type (profile, partnership, transformer, or capability) that exceeded the quota, which caused
     *        the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (profile, partnership, transformer, or capability) that exceeded the quota, which caused the
     * exception.
     * </p>
     * 
     * @return The resource type (profile, partnership, transformer, or capability) that exceeded the quota, which
     *         caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type (profile, partnership, transformer, or capability) that exceeded the quota, which caused the
     * exception.
     * </p>
     * 
     * @param resourceType
     *        The resource type (profile, partnership, transformer, or capability) that exceeded the quota, which caused
     *        the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The code responsible for exceeding the quota, which caused the exception.
     * </p>
     * 
     * @param serviceCode
     *        The code responsible for exceeding the quota, which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code responsible for exceeding the quota, which caused the exception.
     * </p>
     * 
     * @return The code responsible for exceeding the quota, which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code responsible for exceeding the quota, which caused the exception.
     * </p>
     * 
     * @param serviceCode
     *        The code responsible for exceeding the quota, which caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The quota that was exceeded, which caused the exception.
     * </p>
     * 
     * @param quotaCode
     *        The quota that was exceeded, which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The quota that was exceeded, which caused the exception.
     * </p>
     * 
     * @return The quota that was exceeded, which caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The quota that was exceeded, which caused the exception.
     * </p>
     * 
     * @param quotaCode
     *        The quota that was exceeded, which caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

}
