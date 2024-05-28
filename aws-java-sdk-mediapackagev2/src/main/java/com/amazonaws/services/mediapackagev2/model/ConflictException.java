/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import javax.annotation.Generated;

/**
 * <p>
 * Updating or deleting this resource can cause an inconsistent state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.mediapackagev2.model.AWSMediaPackageV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of ConflictException.
     * </p>
     */
    private String conflictExceptionType;

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
     * The type of ConflictException.
     * </p>
     * 
     * @param conflictExceptionType
     *        The type of ConflictException.
     * @see ConflictExceptionType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictExceptionType")
    public void setConflictExceptionType(String conflictExceptionType) {
        this.conflictExceptionType = conflictExceptionType;
    }

    /**
     * <p>
     * The type of ConflictException.
     * </p>
     * 
     * @return The type of ConflictException.
     * @see ConflictExceptionType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ConflictExceptionType")
    public String getConflictExceptionType() {
        return this.conflictExceptionType;
    }

    /**
     * <p>
     * The type of ConflictException.
     * </p>
     * 
     * @param conflictExceptionType
     *        The type of ConflictException.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionType
     */

    public ConflictException withConflictExceptionType(String conflictExceptionType) {
        setConflictExceptionType(conflictExceptionType);
        return this;
    }

    /**
     * <p>
     * The type of ConflictException.
     * </p>
     * 
     * @param conflictExceptionType
     *        The type of ConflictException.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConflictExceptionType
     */

    public ConflictException withConflictExceptionType(ConflictExceptionType conflictExceptionType) {
        this.conflictExceptionType = conflictExceptionType.toString();
        return this;
    }

}
