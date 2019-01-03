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
package com.amazonaws.services.macie.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInputException extends com.amazonaws.services.macie.model.AmazonMacieException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String fieldName;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * @param errorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidInputException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * @param fieldName
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @param fieldName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidInputException withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

}
