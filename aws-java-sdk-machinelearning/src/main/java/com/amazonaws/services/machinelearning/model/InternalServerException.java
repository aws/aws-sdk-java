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
 * An error on the server occurred when trying to process a request.
 * </p>
 */        
public class InternalServerException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private Integer code;
    
    /**
     * Constructs a new InternalServerException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public InternalServerException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the Code property for this object.
     *
     * @return The value of the Code property for this object.         
     */
    public Integer getCode() {
        return code;
    }
        
    /**
     * Sets the value of the Code property for this object.
     *
     * @param code The new value for this object's Code property. 
     */
    public void setCode(Integer code) {
        this.code = code;
    }
}
    