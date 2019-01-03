/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dlm.model;

import javax.annotation.Generated;

/**
 * <p>
 * Bad request. The request is missing required parameters or has invalid parameters.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.dlm.model.AmazonDLMException {
    private static final long serialVersionUID = 1L;

    private String code;
    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     */
    private java.util.List<String> requiredParameters;
    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     */
    private java.util.List<String> mutuallyExclusiveParameters;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     * 
     * @return The request omitted one or more required parameters.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequiredParameters")
    public java.util.List<String> getRequiredParameters() {
        return requiredParameters;
    }

    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     * 
     * @param requiredParameters
     *        The request omitted one or more required parameters.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("RequiredParameters")
    public void setRequiredParameters(java.util.Collection<String> requiredParameters) {
        if (requiredParameters == null) {
            this.requiredParameters = null;
            return;
        }

        this.requiredParameters = new java.util.ArrayList<String>(requiredParameters);
    }

    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredParameters(java.util.Collection)} or {@link #withRequiredParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param requiredParameters
     *        The request omitted one or more required parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withRequiredParameters(String... requiredParameters) {
        if (this.requiredParameters == null) {
            setRequiredParameters(new java.util.ArrayList<String>(requiredParameters.length));
        }
        for (String ele : requiredParameters) {
            this.requiredParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request omitted one or more required parameters.
     * </p>
     * 
     * @param requiredParameters
     *        The request omitted one or more required parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withRequiredParameters(java.util.Collection<String> requiredParameters) {
        setRequiredParameters(requiredParameters);
        return this;
    }

    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     * 
     * @return The request included parameters that cannot be provided together.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("MutuallyExclusiveParameters")
    public java.util.List<String> getMutuallyExclusiveParameters() {
        return mutuallyExclusiveParameters;
    }

    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     * 
     * @param mutuallyExclusiveParameters
     *        The request included parameters that cannot be provided together.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("MutuallyExclusiveParameters")
    public void setMutuallyExclusiveParameters(java.util.Collection<String> mutuallyExclusiveParameters) {
        if (mutuallyExclusiveParameters == null) {
            this.mutuallyExclusiveParameters = null;
            return;
        }

        this.mutuallyExclusiveParameters = new java.util.ArrayList<String>(mutuallyExclusiveParameters);
    }

    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMutuallyExclusiveParameters(java.util.Collection)} or
     * {@link #withMutuallyExclusiveParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param mutuallyExclusiveParameters
     *        The request included parameters that cannot be provided together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withMutuallyExclusiveParameters(String... mutuallyExclusiveParameters) {
        if (this.mutuallyExclusiveParameters == null) {
            setMutuallyExclusiveParameters(new java.util.ArrayList<String>(mutuallyExclusiveParameters.length));
        }
        for (String ele : mutuallyExclusiveParameters) {
            this.mutuallyExclusiveParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request included parameters that cannot be provided together.
     * </p>
     * 
     * @param mutuallyExclusiveParameters
     *        The request included parameters that cannot be provided together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withMutuallyExclusiveParameters(java.util.Collection<String> mutuallyExclusiveParameters) {
        setMutuallyExclusiveParameters(mutuallyExclusiveParameters);
        return this;
    }

}
