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
package com.amazonaws.services.redshift.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified HSM configuration is not in the <i>available</i> state, or it is still in use by one or more Amazon Redshift clusters.
 * </p>
 */        
public class InvalidHsmConfigurationStateException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new InvalidHsmConfigurationStateException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public InvalidHsmConfigurationStateException(String message) {
        super(message);
    }
    
}
    