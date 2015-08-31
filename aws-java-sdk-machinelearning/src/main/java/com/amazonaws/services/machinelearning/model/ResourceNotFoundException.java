/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.machinelearning.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * A specified resource cannot be located.
 * </p>
 */
public class ResourceNotFoundException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    private Integer code;

    /**
     * Constructs a new ResourceNotFoundException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * Sets the value of the Code property for this object.
     * 
     * @param code
     *        The new value for the Code property for this object.
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Returns the value of the Code property for this object.
     * 
     * @return The value of the Code property for this object.
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * Sets the value of the Code property for this object.
     * 
     * @param code
     *        The new value for the Code property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ResourceNotFoundException withCode(Integer code) {
        setCode(code);
        return this;
    }

}