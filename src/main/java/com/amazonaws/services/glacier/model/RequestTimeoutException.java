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
package com.amazonaws.services.glacier.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * Returned if, when uploading an archive, Amazon Glacier times out while receiving the upload.
 * </p>
 */        
public class RequestTimeoutException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    private String type;
    
    private String code;
    
    /**
     * Constructs a new RequestTimeoutException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public RequestTimeoutException(String message) {
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
    /**
     * Returns the value of the Code property for this object.
     *
     * @return The value of the Code property for this object.         
     */
    public String getCode() {
        return code;
    }
        
    /**
     * Sets the value of the Code property for this object.
     *
     * @param code The new value for this object's Code property. 
     */
    public void setCode(String code) {
        this.code = code;
    }
}
    