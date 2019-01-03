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
package com.amazonaws.services.kafka.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returns information about an error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnauthorizedException extends com.amazonaws.services.kafka.model.AWSKafkaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The parameter that caused the error.
     * </p>
     */
    private String invalidParameter;

    /**
     * Constructs a new UnauthorizedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnauthorizedException(String message) {
        super(message);
    }

    /**
     * <p>
     * The parameter that caused the error.
     * </p>
     * 
     * @param invalidParameter
     *        The parameter that caused the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidParameter")
    public void setInvalidParameter(String invalidParameter) {
        this.invalidParameter = invalidParameter;
    }

    /**
     * <p>
     * The parameter that caused the error.
     * </p>
     * 
     * @return The parameter that caused the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("invalidParameter")
    public String getInvalidParameter() {
        return this.invalidParameter;
    }

    /**
     * <p>
     * The parameter that caused the error.
     * </p>
     * 
     * @param invalidParameter
     *        The parameter that caused the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnauthorizedException withInvalidParameter(String invalidParameter) {
        setInvalidParameter(invalidParameter);
        return this;
    }

}
