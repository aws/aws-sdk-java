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
package com.amazonaws.services.resourceexplorer2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request failed because it exceeds a service quota.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.resourceexplorer2.model.AWSResourceExplorer2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the service quota that was exceeded by the request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current value for the quota that the request tried to exceed.
     * </p>
     */
    private String value;

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
     * The name of the service quota that was exceeded by the request.
     * </p>
     * 
     * @param name
     *        The name of the service quota that was exceeded by the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service quota that was exceeded by the request.
     * </p>
     * 
     * @return The name of the service quota that was exceeded by the request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Name")
    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service quota that was exceeded by the request.
     * </p>
     * 
     * @param name
     *        The name of the service quota that was exceeded by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current value for the quota that the request tried to exceed.
     * </p>
     * 
     * @param value
     *        The current value for the quota that the request tried to exceed.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value for the quota that the request tried to exceed.
     * </p>
     * 
     * @return The current value for the quota that the request tried to exceed.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Value")
    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current value for the quota that the request tried to exceed.
     * </p>
     * 
     * @param value
     *        The current value for the quota that the request tried to exceed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceQuotaExceededException withValue(String value) {
        setValue(value);
        return this;
    }

}
