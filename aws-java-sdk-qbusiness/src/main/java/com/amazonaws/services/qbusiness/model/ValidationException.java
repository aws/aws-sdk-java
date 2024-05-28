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
package com.amazonaws.services.qbusiness.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input and try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.qbusiness.model.AWSQBusinessException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The reason for the <code>ValidationException</code>.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The input field(s) that failed validation.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fields;

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
     * The reason for the <code>ValidationException</code>.
     * </p>
     * 
     * @param reason
     *        The reason for the <code>ValidationException</code>.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the <code>ValidationException</code>.
     * </p>
     * 
     * @return The reason for the <code>ValidationException</code>.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the <code>ValidationException</code>.
     * </p>
     * 
     * @param reason
     *        The reason for the <code>ValidationException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the <code>ValidationException</code>.
     * </p>
     * 
     * @param reason
     *        The reason for the <code>ValidationException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The input field(s) that failed validation.
     * </p>
     * 
     * @return The input field(s) that failed validation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    public java.util.List<ValidationExceptionField> getFields() {
        return fields;
    }

    /**
     * <p>
     * The input field(s) that failed validation.
     * </p>
     * 
     * @param fields
     *        The input field(s) that failed validation.
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
     * The input field(s) that failed validation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        The input field(s) that failed validation.
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
     * The input field(s) that failed validation.
     * </p>
     * 
     * @param fields
     *        The input field(s) that failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFields(java.util.Collection<ValidationExceptionField> fields) {
        setFields(fields);
        return this;
    }

}
