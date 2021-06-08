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
package com.amazonaws.services.nimblestudio.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingException extends com.amazonaws.services.nimblestudio.model.AmazonNimbleStudioException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A more specific error code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The exception context.
     * </p>
     */
    private java.util.Map<String, String> context;

    /**
     * Constructs a new ThrottlingException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ThrottlingException(String message) {
        super(message);
    }

    /**
     * <p>
     * A more specific error code.
     * </p>
     * 
     * @param code
     *        A more specific error code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * A more specific error code.
     * </p>
     * 
     * @return A more specific error code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * A more specific error code.
     * </p>
     * 
     * @param code
     *        A more specific error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The exception context.
     * </p>
     * 
     * @return The exception context.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * The exception context.
     * </p>
     * 
     * @param context
     *        The exception context.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("context")
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * The exception context.
     * </p>
     * 
     * @param context
     *        The exception context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see ThrottlingException#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ThrottlingException addContextEntry(String key, String value) {
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

    public ThrottlingException clearContextEntries() {
        this.context = null;
        return this;
    }

}
