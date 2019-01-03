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
package com.amazonaws.services.inspector.model;

import javax.annotation.Generated;

/**
 * <p>
 * The serice is temporary unavailable.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceTemporarilyUnavailableException extends com.amazonaws.services.inspector.model.AmazonInspectorException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * You can wait and then retry your request.
     * </p>
     */
    private Boolean canRetry;

    /**
     * Constructs a new ServiceTemporarilyUnavailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceTemporarilyUnavailableException(String message) {
        super(message);
    }

    /**
     * <p>
     * You can wait and then retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can wait and then retry your request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    public void setCanRetry(Boolean canRetry) {
        this.canRetry = canRetry;
    }

    /**
     * <p>
     * You can wait and then retry your request.
     * </p>
     * 
     * @return You can wait and then retry your request.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    public Boolean getCanRetry() {
        return this.canRetry;
    }

    /**
     * <p>
     * You can wait and then retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can wait and then retry your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceTemporarilyUnavailableException withCanRetry(Boolean canRetry) {
        setCanRetry(canRetry);
        return this;
    }

    /**
     * <p>
     * You can wait and then retry your request.
     * </p>
     * 
     * @return You can wait and then retry your request.
     */

    public Boolean isCanRetry() {
        return this.canRetry;
    }

}
