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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * Placeholder documentation for UnprocessableEntityException
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessableEntityException extends com.amazonaws.services.medialive.model.AWSMediaLiveException {
    private static final long serialVersionUID = 1L;

    /** A collection of validation error responses. */
    private java.util.List<ValidationError> validationErrors;

    /**
     * Constructs a new UnprocessableEntityException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnprocessableEntityException(String message) {
        super(message);
    }

    /**
     * A collection of validation error responses.
     * 
     * @return A collection of validation error responses.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("validationErrors")
    public java.util.List<ValidationError> getValidationErrors() {
        return validationErrors;
    }

    /**
     * A collection of validation error responses.
     * 
     * @param validationErrors
     *        A collection of validation error responses.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("validationErrors")
    public void setValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }

        this.validationErrors = new java.util.ArrayList<ValidationError>(validationErrors);
    }

    /**
     * A collection of validation error responses.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationErrors(java.util.Collection)} or {@link #withValidationErrors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationErrors
     *        A collection of validation error responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessableEntityException withValidationErrors(ValidationError... validationErrors) {
        if (this.validationErrors == null) {
            setValidationErrors(new java.util.ArrayList<ValidationError>(validationErrors.length));
        }
        for (ValidationError ele : validationErrors) {
            this.validationErrors.add(ele);
        }
        return this;
    }

    /**
     * A collection of validation error responses.
     * 
     * @param validationErrors
     *        A collection of validation error responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessableEntityException withValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        setValidationErrors(validationErrors);
        return this;
    }

}
