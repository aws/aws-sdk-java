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
package com.amazonaws.services.importexport.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The specified bucket does not exist. Create the specified bucket or
 * change the manifest's bucket, exportBucket, or logBucket field to a
 * bucket that the account, as specified by the manifest's Access Key ID,
 * has write permissions to.
 * </p>
 */        
public class NoSuchBucketException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new NoSuchBucketException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public NoSuchBucketException(String message) {
        super(message);
    }
    
}
    