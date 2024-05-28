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
package com.amazonaws.services.costoptimizationhub.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input fails to satisfy the constraints specified by an Amazon Web Services service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.costoptimizationhub.model.AWSCostOptimizationHubException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The list of fields that are invalid.
     * </p>
     */
    private java.util.List<ValidationExceptionDetail> fields;
    /**
     * <p>
     * The reason for the validation exception.
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
     * The list of fields that are invalid.
     * </p>
     * 
     * @return The list of fields that are invalid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    public java.util.List<ValidationExceptionDetail> getFields() {
        return fields;
    }

    /**
     * <p>
     * The list of fields that are invalid.
     * </p>
     * 
     * @param fields
     *        The list of fields that are invalid.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    public void setFields(java.util.Collection<ValidationExceptionDetail> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<ValidationExceptionDetail>(fields);
    }

    /**
     * <p>
     * The list of fields that are invalid.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        The list of fields that are invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFields(ValidationExceptionDetail... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<ValidationExceptionDetail>(fields.length));
        }
        for (ValidationExceptionDetail ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of fields that are invalid.
     * </p>
     * 
     * @param fields
     *        The list of fields that are invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFields(java.util.Collection<ValidationExceptionDetail> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * The reason for the validation exception.
     * </p>
     * 
     * @param reason
     *        The reason for the validation exception.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the validation exception.
     * </p>
     * 
     * @return The reason for the validation exception.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the validation exception.
     * </p>
     * 
     * @param reason
     *        The reason for the validation exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the validation exception.
     * </p>
     * 
     * @param reason
     *        The reason for the validation exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
