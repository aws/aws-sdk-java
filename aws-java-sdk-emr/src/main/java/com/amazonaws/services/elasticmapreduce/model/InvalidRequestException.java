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
package com.amazonaws.services.elasticmapreduce.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception occurs when there is something wrong with user input.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.elasticmapreduce.model.AmazonElasticMapReduceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     */
    private String emrErrorCode;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     * 
     * @param emrErrorCode
     *        The error code associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setEmrErrorCode(String emrErrorCode) {
        this.emrErrorCode = emrErrorCode;
    }

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     * 
     * @return The error code associated with the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getEmrErrorCode() {
        return this.emrErrorCode;
    }

    /**
     * <p>
     * The error code associated with the exception.
     * </p>
     * 
     * @param emrErrorCode
     *        The error code associated with the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withEmrErrorCode(String emrErrorCode) {
        setEmrErrorCode(emrErrorCode);
        return this;
    }

}
