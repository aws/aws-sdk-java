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
package com.amazonaws.services.guardduty.model;

import javax.annotation.Generated;

/**
 * Error response object.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestException extends com.amazonaws.services.guardduty.model.AmazonGuardDutyException {
    private static final long serialVersionUID = 1L;

    /** The error type. */
    private String type;

    /**
     * Constructs a new BadRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * The error type.
     * 
     * @param type
     *        The error type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("__type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The error type.
     * 
     * @return The error type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("__type")
    public String getType() {
        return this.type;
    }

    /**
     * The error type.
     * 
     * @param type
     *        The error type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException withType(String type) {
        setType(type);
        return this;
    }

}
