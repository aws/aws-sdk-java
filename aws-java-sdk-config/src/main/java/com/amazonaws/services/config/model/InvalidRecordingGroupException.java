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
package com.amazonaws.services.config.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * AWS Config throws an exception if the recording group does not contain
 * a valid list of resource types. Invalid values could also be
 * incorrectly formatted.
 * </p>
 */        
public class InvalidRecordingGroupException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new InvalidRecordingGroupException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public InvalidRecordingGroupException(String message) {
        super(message);
    }
    
}
    