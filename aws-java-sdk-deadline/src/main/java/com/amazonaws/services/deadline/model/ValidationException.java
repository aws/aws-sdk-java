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
package com.amazonaws.services.deadline.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request isn't valid. This can occur if your request contains malformed JSON or unsupported characters.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationException extends com.amazonaws.services.deadline.model.AWSDeadlineException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * A list of fields that failed validation.
     * </p>
     */
    private java.util.List<ValidationExceptionField> fieldList;
    /**
     * <p>
     * The reason that the request failed validation.
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
     * Information about the resources in use when the exception was thrown.
     * </p>
     * 
     * @return Information about the resources in use when the exception was thrown.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     * 
     * @param context
     *        Information about the resources in use when the exception was thrown.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     * 
     * @param context
     *        Information about the resources in use when the exception was thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see ValidationException#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * A list of fields that failed validation.
     * </p>
     * 
     * @return A list of fields that failed validation.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("fieldList")
    public java.util.List<ValidationExceptionField> getFieldList() {
        return fieldList;
    }

    /**
     * <p>
     * A list of fields that failed validation.
     * </p>
     * 
     * @param fieldList
     *        A list of fields that failed validation.
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
     * A list of fields that failed validation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldList(java.util.Collection)} or {@link #withFieldList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldList
     *        A list of fields that failed validation.
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
     * A list of fields that failed validation.
     * </p>
     * 
     * @param fieldList
     *        A list of fields that failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationException withFieldList(java.util.Collection<ValidationExceptionField> fieldList) {
        setFieldList(fieldList);
        return this;
    }

    /**
     * <p>
     * The reason that the request failed validation.
     * </p>
     * 
     * @param reason
     *        The reason that the request failed validation.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason that the request failed validation.
     * </p>
     * 
     * @return The reason that the request failed validation.
     * @see ValidationExceptionReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason that the request failed validation.
     * </p>
     * 
     * @param reason
     *        The reason that the request failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason that the request failed validation.
     * </p>
     * 
     * @param reason
     *        The reason that the request failed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationExceptionReason
     */

    public ValidationException withReason(ValidationExceptionReason reason) {
        this.reason = reason.toString();
        return this;
    }

}
