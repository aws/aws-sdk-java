/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You get this exception when you call <code>CreateReturnShippingLabel</code> more than once when other requests are
 * not completed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.snowball.model.AmazonSnowballException {
    private static final long serialVersionUID = 1L;

    private String conflictResource;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * @param conflictResource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictResource")
    public void setConflictResource(String conflictResource) {
        this.conflictResource = conflictResource;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictResource")
    public String getConflictResource() {
        return this.conflictResource;
    }

    /**
     * @param conflictResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withConflictResource(String conflictResource) {
        setConflictResource(conflictResource);
        return this;
    }

}
