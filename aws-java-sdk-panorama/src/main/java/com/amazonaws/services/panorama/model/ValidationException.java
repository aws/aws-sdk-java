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
package com.amazonaws.services.panorama.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request contains an invalid parameter value.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.panorama.model.AWSPanoramaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     */
    private java.util.List<ValidationExceptionErrorArgument> errorArguments;
    /**
     * <p>
     * A unique ID for the error.
     * </p>
     */
    private String errorId;
    /**
     * <p>
     * A list of request parameters that failed validation.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fields;
    /**
     * <p>
     * The reason that validation failed.
     * </p>
     */
    private String reason;

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
     * A list of attributes that led to the exception and their values.
     * </p>
     * 
     * @return A list of attributes that led to the exception and their values.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorArguments")
    public java.util.List<ValidationExceptionErrorArgument> getErrorArguments() {
        return errorArguments;
    }

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     * 
     * @param errorArguments
     *        A list of attributes that led to the exception and their values.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorArguments")
    public void setErrorArguments(java.util.Collection<ValidationExceptionErrorArgument> errorArguments) {
        if (errorArguments == null) {
            this.errorArguments = null;
            return;
        }

        this.errorArguments = new java.util.ArrayList<ValidationExceptionErrorArgument>(errorArguments);
    }

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorArguments(java.util.Collection)} or {@link #withErrorArguments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param errorArguments
     *        A list of attributes that led to the exception and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withErrorArguments(ValidationExceptionErrorArgument... errorArguments) {
        if (this.errorArguments == null) {
            setErrorArguments(new java.util.ArrayList<ValidationExceptionErrorArgument>(errorArguments.length));
        }
        for (ValidationExceptionErrorArgument ele : errorArguments) {
            this.errorArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes that led to the exception and their values.
     * </p>
     * 
     * @param errorArguments
     *        A list of attributes that led to the exception and their values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withErrorArguments(java.util.Collection<ValidationExceptionErrorArgument> errorArguments) {
        setErrorArguments(errorArguments);
        return this;
    }

    /**
     * <p>
     * A unique ID for the error.
     * </p>
     * 
     * @param errorId
     *        A unique ID for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorId")
    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    /**
     * <p>
     * A unique ID for the error.
     * </p>
     * 
     * @return A unique ID for the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorId")
    public String getErrorId() {
        return this.errorId;
    }

    /**
     * <p>
     * A unique ID for the error.
     * </p>
     * 
     * @param errorId
     *        A unique ID for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withErrorId(String errorId) {
        setErrorId(errorId);
        return this;
    }

    /**
     * <p>
     * A list of request parameters that failed validation.
     * </p>
     * 
     * @return A list of request parameters that failed validation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Fields")
    public java.util.List<ValidationExceptionField> getFields() {
        return fields;
    }

    /**
     * <p>
     * A list of request parameters that failed validation.
     * </p>
     * 
     * @param fields
     *        A list of request parameters that failed validation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Fields")
    public void setFields(java.util.Collection<ValidationExceptionField> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<ValidationExceptionField>(fields);
    }

    /**
     * <p>
     * A list of request parameters that failed validation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        A list of request parameters that failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFields(ValidationExceptionField... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<ValidationExceptionField>(fields.length));
        }
        for (ValidationExceptionField ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of request parameters that failed validation.
     * </p>
     * 
     * @param fields
     *        A list of request parameters that failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFields(java.util.Collection<ValidationExceptionField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * The reason that validation failed.
     * </p>
     * 
     * @param reason
     *        The reason that validation failed.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason that validation failed.
     * </p>
     * 
     * @return The reason that validation failed.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason that validation failed.
     * </p>
     * 
     * @param reason
     *        The reason that validation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason that validation failed.
     * </p>
     * 
     * @param reason
     *        The reason that validation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
