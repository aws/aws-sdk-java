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
package com.amazonaws.services.timestreaminfluxdb.model;

import javax.annotation.Generated;

/**
 * <p>
 * The requested resource was not found or does not exist.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.timestreaminfluxdb.model.AWSTimestreamInfluxDBException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier for the Timestream for InfluxDB resource associated with the request.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of Timestream for InfluxDB resource associated with the request.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new ResourceNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * The identifier for the Timestream for InfluxDB resource associated with the request.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the Timestream for InfluxDB resource associated with the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier for the Timestream for InfluxDB resource associated with the request.
     * </p>
     * 
     * @return The identifier for the Timestream for InfluxDB resource associated with the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier for the Timestream for InfluxDB resource associated with the request.
     * </p>
     * 
     * @param resourceId
     *        The identifier for the Timestream for InfluxDB resource associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of Timestream for InfluxDB resource associated with the request.
     * </p>
     * 
     * @param resourceType
     *        The type of Timestream for InfluxDB resource associated with the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of Timestream for InfluxDB resource associated with the request.
     * </p>
     * 
     * @return The type of Timestream for InfluxDB resource associated with the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of Timestream for InfluxDB resource associated with the request.
     * </p>
     * 
     * @param resourceType
     *        The type of Timestream for InfluxDB resource associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
