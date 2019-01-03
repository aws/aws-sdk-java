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
package com.amazonaws.services.lambda.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request body could not be parsed as JSON.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestContentException extends com.amazonaws.services.lambda.model.AWSLambdaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The exception type.
     * </p>
     */
    private String type;

    /**
     * Constructs a new InvalidRequestContentException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestContentException(String message) {
        super(message);
    }

    /**
     * <p>
     * The exception type.
     * </p>
     * 
     * @param type
     *        The exception type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The exception type.
     * </p>
     * 
     * @return The exception type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The exception type.
     * </p>
     * 
     * @param type
     *        The exception type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestContentException withType(String type) {
        setType(type);
        return this;
    }

}
