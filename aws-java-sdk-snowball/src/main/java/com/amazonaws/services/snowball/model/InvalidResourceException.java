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
package com.amazonaws.services.snowball.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified resource can't be found. Check the information you provided in your last request, and try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidResourceException extends com.amazonaws.services.snowball.model.AmazonSnowballException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The provided resource value is invalid.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new InvalidResourceException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidResourceException(String message) {
        super(message);
    }

    /**
     * <p>
     * The provided resource value is invalid.
     * </p>
     * 
     * @param resourceType
     *        The provided resource value is invalid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The provided resource value is invalid.
     * </p>
     * 
     * @return The provided resource value is invalid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The provided resource value is invalid.
     * </p>
     * 
     * @param resourceType
     *        The provided resource value is invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidResourceException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

}
