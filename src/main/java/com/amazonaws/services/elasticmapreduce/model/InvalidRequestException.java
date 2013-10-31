/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This exception occurs when there is something wrong with user input.
 * </p>
 */        
public class InvalidRequestException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private String errorCode;
    
    /**
     * Constructs a new InvalidRequestException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the ErrorCode property for this object.
     *
     * @return The value of the ErrorCode property for this object.         
     */
    public String getErrorCode() {
        return errorCode;
    }
        
    /**
     * Sets the value of the ErrorCode property for this object.
     *
     * @param errorCode The new value for this object's ErrorCode property. 
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
    