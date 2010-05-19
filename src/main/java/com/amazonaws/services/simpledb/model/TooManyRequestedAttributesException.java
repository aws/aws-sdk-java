/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Too many attributes requested.
 * </p>
 */        
public class TooManyRequestedAttributesException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private Float boxUsage;
    
    /**
     * Constructs a new TooManyRequestedAttributesException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public TooManyRequestedAttributesException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the BoxUsage property for this object.
     *
     * @return The value of the BoxUsage property for this object.         
     */
    public Float getBoxUsage() {
        return boxUsage;
    }
        
    /**
     * Sets the value of the BoxUsage property for this object.
     *
     * @param boxUsage The new value for this object's BoxUsage property. 
     */
    public void setBoxUsage(Float boxUsage) {
        this.boxUsage = boxUsage;
    }
}
    