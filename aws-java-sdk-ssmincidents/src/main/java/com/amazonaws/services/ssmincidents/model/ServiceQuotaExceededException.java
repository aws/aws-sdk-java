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
package com.amazonaws.services.ssmincidents.model;

import javax.annotation.Generated;

/**
 * <p>
 * Request would cause a service quota to be exceeded.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.ssmincidents.model.AWSSSMIncidentsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Originating quota code
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * The identifier for the requested resource
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The resource type
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Originating service code
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
     * Originating quota code
     * </p>
     * 
     * @param quotaCode
     *        Originating quota code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Originating quota code
     * </p>
     * 
     * @return Originating quota code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Originating quota code
     * </p>
     * 
     * @param quotaCode
     *        Originating quota code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * The identifier for the requested resource
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the requested resource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceIdentifier")
    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the requested resource
     * </p>
     * 
     * @return The identifier for the requested resource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceIdentifier")
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier for the requested resource
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier for the requested resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @param resourceType
     *        The resource type
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @return The resource type
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @param resourceType
     *        The resource type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @param resourceType
     *        The resource type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ServiceQuotaExceededException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @param serviceCode
     *        Originating service code
     * @see ServiceCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @return Originating service code
     * @see ServiceCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @param serviceCode
     *        Originating service code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceCode
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * Originating service code
     * </p>
     * 
     * @param serviceCode
     *        Originating service code
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceCode
     */

    public ServiceQuotaExceededException withServiceCode(ServiceCode serviceCode) {
        this.serviceCode = serviceCode.toString();
        return this;
    }

}
