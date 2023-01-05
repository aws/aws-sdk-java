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
package com.amazonaws.services.backupgateway.model;

import javax.annotation.Generated;

/**
 * <p>
 * A resource that is required for the action wasn't found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.backupgateway.model.AWSBackupGatewayException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A description of which resource wasn't found.
     * </p>
     */
    private String errorCode;

    /**
     * Constructs a new ResourceNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * A description of which resource wasn't found.
     * </p>
     * 
     * @param errorCode
     *        A description of which resource wasn't found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * A description of which resource wasn't found.
     * </p>
     * 
     * @return A description of which resource wasn't found.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * A description of which resource wasn't found.
     * </p>
     * 
     * @param errorCode
     *        A description of which resource wasn't found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceNotFoundException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}
