/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.shield.model;

import javax.annotation.Generated;

/**
 * <p>
 * Exception that indicates that the parameters passed to the API are invalid. If available, this exception includes
 * details in additional properties.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidParameterException extends com.amazonaws.services.shield.model.AWSShieldException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Fields that caused the exception.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fields;

    /**
     * Constructs a new InvalidParameterException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidParameterException(String message) {
        super(message);
    }

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     * 
     * @param reason
     *        Additional information about the exception.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     * 
     * @return Additional information about the exception.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     * 
     * @param reason
     *        Additional information about the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public InvalidParameterException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Additional information about the exception.
     * </p>
     * 
     * @param reason
     *        Additional information about the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public InvalidParameterException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * Fields that caused the exception.
     * </p>
     * 
     * @return Fields that caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    public java.util.List<ValidationExceptionField> getFields() {
        return fields;
    }

    /**
     * <p>
     * Fields that caused the exception.
     * </p>
     * 
     * @param fields
     *        Fields that caused the exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    public void setFields(java.util.Collection<ValidationExceptionField> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<ValidationExceptionField>(fields);
    }

    /**
     * <p>
     * Fields that caused the exception.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        Fields that caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidParameterException withFields(ValidationExceptionField... fields) {
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
     * Fields that caused the exception.
     * </p>
     * 
     * @param fields
     *        Fields that caused the exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidParameterException withFields(java.util.Collection<ValidationExceptionField> fields) {
        setFields(fields);
        return this;
    }

}
