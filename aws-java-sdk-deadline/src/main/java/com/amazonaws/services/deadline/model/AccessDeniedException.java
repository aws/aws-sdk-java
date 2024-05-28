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
 * You don't have permission to perform the action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedException extends com.amazonaws.services.deadline.model.AWSDeadlineException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Information about the resources in use when the exception was thrown.
     * </p>
     */
    private java.util.Map<String, String> context;

    /**
     * Constructs a new AccessDeniedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AccessDeniedException(String message) {
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

    public AccessDeniedException withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see AccessDeniedException#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AccessDeniedException addContextEntry(String key, String value) {
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

    public AccessDeniedException clearContextEntries() {
        this.context = null;
        return this;
    }

}
