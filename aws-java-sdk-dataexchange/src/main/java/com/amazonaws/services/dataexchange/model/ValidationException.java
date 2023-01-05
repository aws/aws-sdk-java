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
package com.amazonaws.services.dataexchange.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was invalid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.dataexchange.model.AWSDataExchangeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     */
    private String exceptionCause;

    /**
     * Constructs a new ValidationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ValidationException(String message) {
        super(message);
    }

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     * 
     * @param exceptionCause
     *        The unique identifier for the resource that couldn't be found.
     * @see ExceptionCause
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ExceptionCause")
    public void setExceptionCause(String exceptionCause) {
        this.exceptionCause = exceptionCause;
    }

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     * 
     * @return The unique identifier for the resource that couldn't be found.
     * @see ExceptionCause
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ExceptionCause")
    public String getExceptionCause() {
        return this.exceptionCause;
    }

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     * 
     * @param exceptionCause
     *        The unique identifier for the resource that couldn't be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExceptionCause
     */

    public ValidationException withExceptionCause(String exceptionCause) {
        setExceptionCause(exceptionCause);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the resource that couldn't be found.
     * </p>
     * 
     * @param exceptionCause
     *        The unique identifier for the resource that couldn't be found.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExceptionCause
     */

    public ValidationException withExceptionCause(ExceptionCause exceptionCause) {
        this.exceptionCause = exceptionCause.toString();
        return this;
    }

}
