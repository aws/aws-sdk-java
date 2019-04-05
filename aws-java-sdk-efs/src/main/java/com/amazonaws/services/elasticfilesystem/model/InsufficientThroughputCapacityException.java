/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticfilesystem.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returned if there's not enough capacity to provision additional throughput. This value might be returned when you try
 * to create a file system in provisioned throughput mode, when you attempt to increase the provisioned throughput of an
 * existing file system, or when you attempt to change an existing file system from bursting to provisioned throughput
 * mode.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsufficientThroughputCapacityException extends com.amazonaws.services.elasticfilesystem.model.AmazonElasticFileSystemException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    /**
     * Constructs a new InsufficientThroughputCapacityException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InsufficientThroughputCapacityException(String message) {
        super(message);
    }

    /**
     * @param errorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsufficientThroughputCapacityException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}
