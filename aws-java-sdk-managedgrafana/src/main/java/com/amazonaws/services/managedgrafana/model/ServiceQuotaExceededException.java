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
package com.amazonaws.services.managedgrafana.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request would cause a service quota to be exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.managedgrafana.model.AmazonManagedGrafanaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the service quota that was exceeded.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The value of a parameter in the request caused an error.
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
     * The ID of the service quota that was exceeded.
     * </p>
     * 
     * @param quotaCode
     *        The ID of the service quota that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * The ID of the service quota that was exceeded.
     * </p>
     * 
     * @return The ID of the service quota that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * The ID of the service quota that was exceeded.
     * </p>
     * 
     * @param quotaCode
     *        The ID of the service quota that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     * 
     * @return The ID of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that is associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     * 
     * @return The type of the resource that is associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource that is associated with the error.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource that is associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The value of a parameter in the request caused an error.
     * </p>
     * 
     * @param serviceCode
     *        The value of a parameter in the request caused an error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The value of a parameter in the request caused an error.
     * </p>
     * 
     * @return The value of a parameter in the request caused an error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The value of a parameter in the request caused an error.
     * </p>
     * 
     * @param serviceCode
     *        The value of a parameter in the request caused an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
