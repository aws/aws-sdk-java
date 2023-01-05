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
package com.amazonaws.services.managedgrafana.model;

import javax.annotation.Generated;

/**
 * <p>
 * The value of a parameter in the request caused an error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.managedgrafana.model.AmazonManagedGrafanaException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A list of fields that might be associated with the error.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fieldList;
    /**
     * <p>
     * The reason that the operation failed.
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
     * A list of fields that might be associated with the error.
     * </p>
     * 
     * @return A list of fields that might be associated with the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldList")
    public java.util.List<ValidationExceptionField> getFieldList() {
        return fieldList;
    }

    /**
     * <p>
     * A list of fields that might be associated with the error.
     * </p>
     * 
     * @param fieldList
     *        A list of fields that might be associated with the error.
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
     * A list of fields that might be associated with the error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldList(java.util.Collection)} or {@link #withFieldList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldList
     *        A list of fields that might be associated with the error.
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
     * A list of fields that might be associated with the error.
     * </p>
     * 
     * @param fieldList
     *        A list of fields that might be associated with the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        setFieldList(fieldList);
        return this;
    }

    /**
     * <p>
     * The reason that the operation failed.
     * </p>
     * 
     * @param reason
     *        The reason that the operation failed.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason that the operation failed.
     * </p>
     * 
     * @return The reason that the operation failed.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason that the operation failed.
     * </p>
     * 
     * @param reason
     *        The reason that the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason that the operation failed.
     * </p>
     * 
     * @param reason
     *        The reason that the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
