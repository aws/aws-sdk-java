/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Information about any problems encountered while processing an upload
 * request.
 * </p>
 */        
public class DocumentServiceException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private String status;
    
    /**
     * Constructs a new DocumentServiceException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public DocumentServiceException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the Status property for this object.
     *
     * @return The value of the Status property for this object.         
     */
    public String getStatus() {
        return status;
    }
        
    /**
     * Sets the value of the Status property for this object.
     *
     * @param status The new value for this object's Status property. 
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
    