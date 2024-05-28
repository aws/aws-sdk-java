/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input failed to meet the constraints specified by the AWS service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.mediapackagev2.model.AWSMediaPackageV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of ValidationException.
     * </p>
     */
    private String validationExceptionType;

    /**
     * Constructs a new ValidationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ValidationException(String message) {
        super(message);
    }

    /**
     * <p>
     * The type of ValidationException.
     * </p>
     * 
     * @param validationExceptionType
     *        The type of ValidationException.
     * @see ValidationExceptionType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ValidationExceptionType")
    public void setValidationExceptionType(String validationExceptionType) {
        this.validationExceptionType = validationExceptionType;
    }

    /**
     * <p>
     * The type of ValidationException.
     * </p>
     * 
     * @return The type of ValidationException.
     * @see ValidationExceptionType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ValidationExceptionType")
    public String getValidationExceptionType() {
        return this.validationExceptionType;
    }

    /**
     * <p>
     * The type of ValidationException.
     * </p>
     * 
     * @param validationExceptionType
     *        The type of ValidationException.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionType
     */

    public ValidationException withValidationExceptionType(String validationExceptionType) {
        setValidationExceptionType(validationExceptionType);
        return this;
    }

    /**
     * <p>
     * The type of ValidationException.
     * </p>
     * 
     * @param validationExceptionType
     *        The type of ValidationException.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionType
     */

    public ValidationException withValidationExceptionType(ValidationExceptionType validationExceptionType) {
        this.validationExceptionType = validationExceptionType.toString();
        return this;
    }

}
