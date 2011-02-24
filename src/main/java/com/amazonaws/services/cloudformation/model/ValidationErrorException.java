/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified stack or resource does not exist. In the case of
 * <code>DescribeStackResources</code> , this error is returned if you
 * specify both <code>StackName</code> and
 * <code>PhysicalResourceId</code> in the same request.
 * </p>
 */        
public class ValidationErrorException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new ValidationErrorException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public ValidationErrorException(String message) {
        super(message);
    }
    
}
    