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
package com.amazonaws.services.elasticloadbalancing.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Load balancer name already exists for this account. Please choose another name.
 * </p>
 */        
public class DuplicateLoadBalancerNameException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new DuplicateLoadBalancerNameException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public DuplicateLoadBalancerNameException(String message) {
        super(message);
    }
    
}
    