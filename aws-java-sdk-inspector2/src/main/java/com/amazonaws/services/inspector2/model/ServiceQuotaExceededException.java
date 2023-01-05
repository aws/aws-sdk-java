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
package com.amazonaws.services.inspector2.model;

import javax.annotation.Generated;

/**
 * <p>
 * You have exceeded your service quota. To perform the requested action, remove some of the relevant resources, or use
 * Service Quotas to request a service quota increase.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.inspector2.model.AWSInspector2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the resource that exceeds a service quota.
     * </p>
     */
    private String resourceId;

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
     * The ID of the resource that exceeds a service quota.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that exceeds a service quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource that exceeds a service quota.
     * </p>
     * 
     * @return The ID of the resource that exceeds a service quota.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource that exceeds a service quota.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that exceeds a service quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

}
