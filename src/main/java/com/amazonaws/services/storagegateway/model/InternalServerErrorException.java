/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * An internal server error has occured during the request. See the error and message fields for more information.
 * </p>
 */        
public class InternalServerErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private StorageGatewayError error;
    
    /**
     * Constructs a new InternalServerErrorException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public InternalServerErrorException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the Error property for this object.
     *
     * @return The value of the Error property for this object.         
     */
    public StorageGatewayError getError() {
        return error;
    }
        
    /**
     * Sets the value of the Error property for this object.
     *
     * @param error The new value for this object's Error property. 
     */
    public void setError(StorageGatewayError error) {
        this.error = error;
    }
}
    