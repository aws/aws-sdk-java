/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Returned if the specified file system does not have a replication configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationNotFoundException extends com.amazonaws.services.elasticfilesystem.model.AmazonElasticFileSystemException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * ReplicationNotFound
     * </p>
     */
    private String errorCode;

    /**
     * Constructs a new ReplicationNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ReplicationNotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * ReplicationNotFound
     * </p>
     * 
     * @param errorCode
     *        ReplicationNotFound
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * ReplicationNotFound
     * </p>
     * 
     * @return ReplicationNotFound
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * ReplicationNotFound
     * </p>
     * 
     * @param errorCode
     *        ReplicationNotFound
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationNotFoundException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}
