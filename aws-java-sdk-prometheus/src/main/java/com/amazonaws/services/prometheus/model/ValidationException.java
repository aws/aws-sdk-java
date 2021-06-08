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
package com.amazonaws.services.prometheus.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input fails to satisfy the constraints specified by an AWS service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.prometheus.model.AmazonPrometheusException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The field that caused the error, if applicable. If more than one field caused the error, pick one and elaborate
     * in the message.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fieldList;
    /**
     * <p>
     * Reason the request failed validation.
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
     * The field that caused the error, if applicable. If more than one field caused the error, pick one and elaborate
     * in the message.
     * </p>
     * 
     * @return The field that caused the error, if applicable. If more than one field caused the error, pick one and
     *         elaborate in the message.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldList")
    public java.util.List<ValidationExceptionField> getFieldList() {
        return fieldList;
    }

    /**
     * <p>
     * The field that caused the error, if applicable. If more than one field caused the error, pick one and elaborate
     * in the message.
     * </p>
     * 
     * @param fieldList
     *        The field that caused the error, if applicable. If more than one field caused the error, pick one and
     *        elaborate in the message.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldList")
    public void setFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        if (fieldList == null) {
            this.fieldList = null;
            return;
        }

        this.fieldList = new java.util.ArrayList<ValidationExceptionField>(fieldList);
    }

    /**
     * <p>
     * The field that caused the error, if applicable. If more than one field caused the error, pick one and elaborate
     * in the message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldList(java.util.Collection)} or {@link #withFieldList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldList
     *        The field that caused the error, if applicable. If more than one field caused the error, pick one and
     *        elaborate in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFieldList(ValidationExceptionField... fieldList) {
        if (this.fieldList == null) {
            setFieldList(new java.util.ArrayList<ValidationExceptionField>(fieldList.length));
        }
        for (ValidationExceptionField ele : fieldList) {
            this.fieldList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field that caused the error, if applicable. If more than one field caused the error, pick one and elaborate
     * in the message.
     * </p>
     * 
     * @param fieldList
     *        The field that caused the error, if applicable. If more than one field caused the error, pick one and
     *        elaborate in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        setFieldList(fieldList);
        return this;
    }

    /**
     * <p>
     * Reason the request failed validation.
     * </p>
     * 
     * @param reason
     *        Reason the request failed validation.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Reason the request failed validation.
     * </p>
     * 
     * @return Reason the request failed validation.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Reason the request failed validation.
     * </p>
     * 
     * @param reason
     *        Reason the request failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Reason the request failed validation.
     * </p>
     * 
     * @param reason
     *        Reason the request failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
