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
package com.amazonaws.services.cloudhsm.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Indicates that an exception occurred in the AWS CloudHSM service.
 * </p>
 */        
public class CloudHsmServiceException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private Boolean retryable;
    
    /**
     * Constructs a new CloudHsmServiceException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public CloudHsmServiceException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the Retryable property for this object.
     *
     * @return The value of the Retryable property for this object.         
     */
    public Boolean getRetryable() {
        return retryable;
    }
        
    /**
     * Sets the value of the Retryable property for this object.
     *
     * @param retryable The new value for this object's Retryable property. 
     */
    public void setRetryable(Boolean retryable) {
        this.retryable = retryable;
    }
}
    