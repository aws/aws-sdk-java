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
package com.amazonaws.services.connectwisdom.model;

import javax.annotation.Generated;

/**
 * <p>
 * Amazon Connect Wisdom throws this exception if you have too many tags in your tag set.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyTagsException extends com.amazonaws.services.connectwisdom.model.AmazonConnectWisdomException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The specified resource name.
     * </p>
     */
    private String resourceName;

    /**
     * Constructs a new TooManyTagsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyTagsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The specified resource name.
     * </p>
     * 
     * @param resourceName
     *        The specified resource name.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The specified resource name.
     * </p>
     * 
     * @return The specified resource name.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The specified resource name.
     * </p>
     * 
     * @param resourceName
     *        The specified resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooManyTagsException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
