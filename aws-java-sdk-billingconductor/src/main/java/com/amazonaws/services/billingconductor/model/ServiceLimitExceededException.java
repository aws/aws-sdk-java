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
package com.amazonaws.services.billingconductor.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request would cause a service limit to exceed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLimitExceededException extends com.amazonaws.services.billingconductor.model.AWSBillingConductorException {
    private static final long serialVersionUID = 1L;

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
     * The unique code identifier of the service limit that is being exceeded.
     * </p>
     */
    private String limitCode;
    /**
     * <p>
     * The unique code for the service of the limit that is being exceeded.
     * </p>
     */
    private String serviceCode;

    /**
     * Constructs a new ServiceLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceLimitExceededException(String message) {
        super(message);
    }

    /**
     * <p>
     * Identifier of the resource affected.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource affected.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
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

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceId")
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

    public ServiceLimitExceededException withResourceId(String resourceId) {
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

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
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

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
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

    public ServiceLimitExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The unique code identifier of the service limit that is being exceeded.
     * </p>
     * 
     * @param limitCode
     *        The unique code identifier of the service limit that is being exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitCode")
    public void setLimitCode(String limitCode) {
        this.limitCode = limitCode;
    }

    /**
     * <p>
     * The unique code identifier of the service limit that is being exceeded.
     * </p>
     * 
     * @return The unique code identifier of the service limit that is being exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LimitCode")
    public String getLimitCode() {
        return this.limitCode;
    }

    /**
     * <p>
     * The unique code identifier of the service limit that is being exceeded.
     * </p>
     * 
     * @param limitCode
     *        The unique code identifier of the service limit that is being exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimitExceededException withLimitCode(String limitCode) {
        setLimitCode(limitCode);
        return this;
    }

    /**
     * <p>
     * The unique code for the service of the limit that is being exceeded.
     * </p>
     * 
     * @param serviceCode
     *        The unique code for the service of the limit that is being exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The unique code for the service of the limit that is being exceeded.
     * </p>
     * 
     * @return The unique code for the service of the limit that is being exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The unique code for the service of the limit that is being exceeded.
     * </p>
     * 
     * @param serviceCode
     *        The unique code for the service of the limit that is being exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimitExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
