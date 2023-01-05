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
package com.amazonaws.services.mgn.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request could not be completed because its exceeded the service quota.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.mgn.model.AWSmgnException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * Exceeded the service quota code.
     * </p>
     */
    private String quotaCode;
    /**
     * <p>
     * Exceeded the service quota value.
     * </p>
     */
    private Integer quotaValue;
    /**
     * <p>
     * Exceeded the service quota resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Exceeded the service quota resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Exceeded the service quota service code.
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
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Exceeded the service quota code.
     * </p>
     * 
     * @param quotaCode
     *        Exceeded the service quota code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public void setQuotaCode(String quotaCode) {
        this.quotaCode = quotaCode;
    }

    /**
     * <p>
     * Exceeded the service quota code.
     * </p>
     * 
     * @return Exceeded the service quota code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaCode")
    public String getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * <p>
     * Exceeded the service quota code.
     * </p>
     * 
     * @param quotaCode
     *        Exceeded the service quota code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaCode(String quotaCode) {
        setQuotaCode(quotaCode);
        return this;
    }

    /**
     * <p>
     * Exceeded the service quota value.
     * </p>
     * 
     * @param quotaValue
     *        Exceeded the service quota value.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaValue")
    public void setQuotaValue(Integer quotaValue) {
        this.quotaValue = quotaValue;
    }

    /**
     * <p>
     * Exceeded the service quota value.
     * </p>
     * 
     * @return Exceeded the service quota value.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("quotaValue")
    public Integer getQuotaValue() {
        return this.quotaValue;
    }

    /**
     * <p>
     * Exceeded the service quota value.
     * </p>
     * 
     * @param quotaValue
     *        Exceeded the service quota value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withQuotaValue(Integer quotaValue) {
        setQuotaValue(quotaValue);
        return this;
    }

    /**
     * <p>
     * Exceeded the service quota resource ID.
     * </p>
     * 
     * @param resourceId
     *        Exceeded the service quota resource ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Exceeded the service quota resource ID.
     * </p>
     * 
     * @return Exceeded the service quota resource ID.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Exceeded the service quota resource ID.
     * </p>
     * 
     * @param resourceId
     *        Exceeded the service quota resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Exceeded the service quota resource type.
     * </p>
     * 
     * @param resourceType
     *        Exceeded the service quota resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Exceeded the service quota resource type.
     * </p>
     * 
     * @return Exceeded the service quota resource type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Exceeded the service quota resource type.
     * </p>
     * 
     * @param resourceType
     *        Exceeded the service quota resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Exceeded the service quota service code.
     * </p>
     * 
     * @param serviceCode
     *        Exceeded the service quota service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * Exceeded the service quota service code.
     * </p>
     * 
     * @return Exceeded the service quota service code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * Exceeded the service quota service code.
     * </p>
     * 
     * @param serviceCode
     *        Exceeded the service quota service code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
