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
package com.amazonaws.services.mainframemodernization.model;

import javax.annotation.Generated;

/**
 * <p>
 * One or more quotas for Amazon Web Services Mainframe Modernization exceeds the limit.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.mainframemodernization.model.AWSMainframeModernizationException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier of the exceeded quota.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The ID of the resource that is exceeding the quota limit.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of resource that is exceeding the quota limit for Amazon Web Services Mainframe Modernization.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A code that identifies the service that the exceeded quota belongs to.
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
     * The identifier of the exceeded quota.
     * </p>
     * 
     * @param quotaCode
     *        The identifier of the exceeded quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The identifier of the exceeded quota.
     * </p>
     * 
     * @return The identifier of the exceeded quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The identifier of the exceeded quota.
     * </p>
     * 
     * @param quotaCode
     *        The identifier of the exceeded quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The ID of the resource that is exceeding the quota limit.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that is exceeding the quota limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource that is exceeding the quota limit.
     * </p>
     * 
     * @return The ID of the resource that is exceeding the quota limit.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource that is exceeding the quota limit.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that is exceeding the quota limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource that is exceeding the quota limit for Amazon Web Services Mainframe Modernization.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that is exceeding the quota limit for Amazon Web Services Mainframe Modernization.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource that is exceeding the quota limit for Amazon Web Services Mainframe Modernization.
     * </p>
     * 
     * @return The type of resource that is exceeding the quota limit for Amazon Web Services Mainframe Modernization.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource that is exceeding the quota limit for Amazon Web Services Mainframe Modernization.
     * </p>
     * 
     * @param resourceType
     *        The type of resource that is exceeding the quota limit for Amazon Web Services Mainframe Modernization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A code that identifies the service that the exceeded quota belongs to.
     * </p>
     * 
     * @param serviceCode
     *        A code that identifies the service that the exceeded quota belongs to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * A code that identifies the service that the exceeded quota belongs to.
     * </p>
     * 
     * @return A code that identifies the service that the exceeded quota belongs to.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * A code that identifies the service that the exceeded quota belongs to.
     * </p>
     * 
     * @param serviceCode
     *        A code that identifies the service that the exceeded quota belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
