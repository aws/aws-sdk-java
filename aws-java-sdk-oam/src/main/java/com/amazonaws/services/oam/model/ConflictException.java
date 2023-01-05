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
package com.amazonaws.services.oam.model;

import javax.annotation.Generated;

/**
 * <p>
 * A resource was in an inconsistent state during an update or a deletion.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.oam.model.AWSOAMException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the exception.
     * </p>
     */
    private String amznErrorType;

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
     * The name of the exception.
     * </p>
     * 
     * @param amznErrorType
     *        The name of the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("x-amzn-ErrorType")
    public void setAmznErrorType(String amznErrorType) {
        this.amznErrorType = amznErrorType;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @return The name of the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("x-amzn-ErrorType")
    public String getAmznErrorType() {
        return this.amznErrorType;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * 
     * @param amznErrorType
     *        The name of the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withAmznErrorType(String amznErrorType) {
        setAmznErrorType(amznErrorType);
        return this;
    }

}
