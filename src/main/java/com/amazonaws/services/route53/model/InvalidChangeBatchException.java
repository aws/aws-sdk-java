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
package com.amazonaws.services.route53.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * This error contains a list of one or more error messages. Each error message indicates one error in the change batch. For more information, see <a
 * href="http://docs.amazonwebservices.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html#example_Errors"> Example InvalidChangeBatch
 * Errors </a> .
 * </p>
 */        
public class InvalidChangeBatchException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new InvalidChangeBatchException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public InvalidChangeBatchException(String message) {
        super(message);
    }
    
}
    