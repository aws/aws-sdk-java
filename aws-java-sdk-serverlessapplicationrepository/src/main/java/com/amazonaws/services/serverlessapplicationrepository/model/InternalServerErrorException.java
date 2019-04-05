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
package com.amazonaws.services.serverlessapplicationrepository.model;

import javax.annotation.Generated;

/**
 * <p>
 * The AWS Serverless Application Repository service encountered an internal error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerErrorException extends com.amazonaws.services.serverlessapplicationrepository.model.AWSServerlessApplicationRepositoryException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * 500
     * </p>
     */
    private String errorCode;

    /**
     * Constructs a new InternalServerErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServerErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * 500
     * </p>
     * 
     * @param errorCode
     *        500
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * 500
     * </p>
     * 
     * @return 500
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * 500
     * </p>
     * 
     * @param errorCode
     *        500
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalServerErrorException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}
