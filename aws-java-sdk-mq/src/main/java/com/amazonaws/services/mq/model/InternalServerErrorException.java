/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import javax.annotation.Generated;

/**
 * Returns information about an error.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerErrorException extends com.amazonaws.services.mq.model.AmazonMQException {
    private static final long serialVersionUID = 1L;

    /** The error attribute. */
    private String errorAttribute;

    /**
     * Constructs a new InternalServerErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServerErrorException(String message) {
        super(message);
    }

    /**
     * The error attribute.
     * 
     * @param errorAttribute
     *        The error attribute.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorAttribute")
    public void setErrorAttribute(String errorAttribute) {
        this.errorAttribute = errorAttribute;
    }

    /**
     * The error attribute.
     * 
     * @return The error attribute.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorAttribute")
    public String getErrorAttribute() {
        return this.errorAttribute;
    }

    /**
     * The error attribute.
     * 
     * @param errorAttribute
     *        The error attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerErrorException withErrorAttribute(String errorAttribute) {
        setErrorAttribute(errorAttribute);
        return this;
    }

}
