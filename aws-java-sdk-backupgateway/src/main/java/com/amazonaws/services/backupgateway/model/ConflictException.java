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
 * The operation cannot proceed because it is not supported.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.backupgateway.model.AWSBackupGatewayException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A description of why the operation is not supported.
     * </p>
     */
    private String errorCode;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * A description of why the operation is not supported.
     * </p>
     * 
     * @param errorCode
     *        A description of why the operation is not supported.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * A description of why the operation is not supported.
     * </p>
     * 
     * @return A description of why the operation is not supported.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * A description of why the operation is not supported.
     * </p>
     * 
     * @param errorCode
     *        A description of why the operation is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}
