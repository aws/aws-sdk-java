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
package com.amazonaws.services.directory.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * An authentication error occurred.
 * </p>
 */        
public class AuthenticationFailedException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private String requestId;
    
    /**
     * Constructs a new AuthenticationFailedException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public AuthenticationFailedException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the RequestId property for this object.
     *
     * @return The value of the RequestId property for this object.         
     */
    public String getRequestId() {
        return requestId;
    }
        
    /**
     * Sets the value of the RequestId property for this object.
     *
     * @param requestId The new value for this object's RequestId property. 
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
    