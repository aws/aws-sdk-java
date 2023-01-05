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
package com.amazonaws.services.iotfleetwise.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input fails to satisfy the constraints specified by an Amazon Web Services service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.iotfleetwise.model.AWSIoTFleetWiseException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fieldList;

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
     * The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param reason
     *        The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @return The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param reason
     *        The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param reason
     *        The reason the input failed to satisfy the constraints specified by an Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @return The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldList")
    public java.util.List<ValidationExceptionField> getFieldList() {
        return fieldList;
    }

    /**
     * <p>
     * The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param fieldList
     *        The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
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
     * The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldList(java.util.Collection)} or {@link #withFieldList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldList
     *        The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
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
     * The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
     * </p>
     * 
     * @param fieldList
     *        The list of fields that fail to satisfy the constraints specified by an Amazon Web Services service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        setFieldList(fieldList);
        return this;
    }

}
