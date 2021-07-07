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
package com.amazonaws.services.mq.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returns information about an error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.mq.model.AmazonMQException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The attribute which caused the error.
     * </p>
     */
    private String errorAttribute;

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
     * <p>
     * The attribute which caused the error.
     * </p>
     * 
     * @param errorAttribute
     *        The attribute which caused the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorAttribute")
    public void setErrorAttribute(String errorAttribute) {
        this.errorAttribute = errorAttribute;
    }

    /**
     * <p>
     * The attribute which caused the error.
     * </p>
     * 
     * @return The attribute which caused the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorAttribute")
    public String getErrorAttribute() {
        return this.errorAttribute;
    }

    /**
     * <p>
     * The attribute which caused the error.
     * </p>
     * 
     * @param errorAttribute
     *        The attribute which caused the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withErrorAttribute(String errorAttribute) {
        setErrorAttribute(errorAttribute);
        return this;
    }

}
