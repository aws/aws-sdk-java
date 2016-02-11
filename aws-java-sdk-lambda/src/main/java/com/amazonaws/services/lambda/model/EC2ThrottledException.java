/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * AWS Lambda was throttled by Amazon EC2 during Lambda function
 * initiatization using the execution role provided for the Lambda
 * function.
 * </p>
 */        
public class EC2ThrottledException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private String type;
    
    /**
     * Constructs a new EC2ThrottledException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public EC2ThrottledException(String message) {
        super(message);
    }
    
    /**
     * Returns the value of the Type property for this object.
     *
     * @return The value of the Type property for this object.         
     */
    public String getType() {
        return type;
    }
        
    /**
     * Sets the value of the Type property for this object.
     *
     * @param type The new value for this object's Type property. 
     */
    public void setType(String type) {
        this.type = type;
    }
}
    