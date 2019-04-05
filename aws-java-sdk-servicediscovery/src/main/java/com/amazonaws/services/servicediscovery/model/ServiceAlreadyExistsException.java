/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import javax.annotation.Generated;

/**
 * <p>
 * The service can't be created because a service with the same name already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceAlreadyExistsException extends com.amazonaws.services.servicediscovery.model.AWSServiceDiscoveryException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the service.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The ID of the existing service.
     * </p>
     */
    private String serviceId;

    /**
     * Constructs a new ServiceAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the service.
     * </p>
     * 
     * @param creatorRequestId
     *        The <code>CreatorRequestId</code> that was used to create the service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("CreatorRequestId")
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the service.
     * </p>
     * 
     * @return The <code>CreatorRequestId</code> that was used to create the service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("CreatorRequestId")
    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * The <code>CreatorRequestId</code> that was used to create the service.
     * </p>
     * 
     * @param creatorRequestId
     *        The <code>CreatorRequestId</code> that was used to create the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAlreadyExistsException withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The ID of the existing service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the existing service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceId")
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the existing service.
     * </p>
     * 
     * @return The ID of the existing service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ServiceId")
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the existing service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the existing service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAlreadyExistsException withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

}
