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
package com.amazonaws.services.route53recoverycluster.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request can't update that many routing control states at the same time. Try again with fewer routing control
 * states.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceLimitExceededException extends com.amazonaws.services.route53recoverycluster.model.AWSRoute53RecoveryClusterException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The resource identifier of the limit that was exceeded.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type of the limit that was exceeded.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The code of the limit that was exceeded.
     * </p>
     */
    private String limitCode;
    /**
     * <p>
     * The service code of the limit that was exceeded.
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
     * The resource identifier of the limit that was exceeded.
     * </p>
     * 
     * @param resourceId
     *        The resource identifier of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource identifier of the limit that was exceeded.
     * </p>
     * 
     * @return The resource identifier of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource identifier of the limit that was exceeded.
     * </p>
     * 
     * @param resourceId
     *        The resource identifier of the limit that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimitExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type of the limit that was exceeded.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type of the limit that was exceeded.
     * </p>
     * 
     * @return The resource type of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type of the limit that was exceeded.
     * </p>
     * 
     * @param resourceType
     *        The resource type of the limit that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimitExceededException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The code of the limit that was exceeded.
     * </p>
     * 
     * @param limitCode
     *        The code of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("limitCode")
    public void setLimitCode(String limitCode) {
        this.limitCode = limitCode;
    }

    /**
     * <p>
     * The code of the limit that was exceeded.
     * </p>
     * 
     * @return The code of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("limitCode")
    public String getLimitCode() {
        return this.limitCode;
    }

    /**
     * <p>
     * The code of the limit that was exceeded.
     * </p>
     * 
     * @param limitCode
     *        The code of the limit that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimitExceededException withLimitCode(String limitCode) {
        setLimitCode(limitCode);
        return this;
    }

    /**
     * <p>
     * The service code of the limit that was exceeded.
     * </p>
     * 
     * @param serviceCode
     *        The service code of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service code of the limit that was exceeded.
     * </p>
     * 
     * @return The service code of the limit that was exceeded.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCode")
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service code of the limit that was exceeded.
     * </p>
     * 
     * @param serviceCode
     *        The service code of the limit that was exceeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceLimitExceededException withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

}
