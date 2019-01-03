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
package com.amazonaws.services.mq.model;

import javax.annotation.Generated;

/**
 * Returns information about an error.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnauthorizedException extends com.amazonaws.services.mq.model.AmazonMQException {
    private static final long serialVersionUID = 1L;

    /** The attribute which caused the error. */
    private String errorAttribute;

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
     * The attribute which caused the error.
     * 
     * @param errorAttribute
     *        The attribute which caused the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorAttribute")
    public void setErrorAttribute(String errorAttribute) {
        this.errorAttribute = errorAttribute;
    }

    /**
     * The attribute which caused the error.
     * 
     * @return The attribute which caused the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorAttribute")
    public String getErrorAttribute() {
        return this.errorAttribute;
    }

    /**
     * The attribute which caused the error.
     * 
     * @param errorAttribute
     *        The attribute which caused the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnauthorizedException withErrorAttribute(String errorAttribute) {
        setErrorAttribute(errorAttribute);
        return this;
    }

}
