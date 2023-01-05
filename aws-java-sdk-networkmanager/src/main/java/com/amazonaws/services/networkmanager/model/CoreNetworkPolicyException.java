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
package com.amazonaws.services.networkmanager.model;

import javax.annotation.Generated;

/**
 * <p>
 * Describes a core network policy exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkPolicyException extends com.amazonaws.services.networkmanager.model.AWSNetworkManagerException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Describes a core network policy exception.
     * </p>
     */
    private java.util.List<CoreNetworkPolicyError> errors;

    /**
     * Constructs a new CoreNetworkPolicyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CoreNetworkPolicyException(String message) {
        super(message);
    }

    /**
     * <p>
     * Describes a core network policy exception.
     * </p>
     * 
     * @return Describes a core network policy exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Errors")
    public java.util.List<CoreNetworkPolicyError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Describes a core network policy exception.
     * </p>
     * 
     * @param errors
     *        Describes a core network policy exception.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Errors")
    public void setErrors(java.util.Collection<CoreNetworkPolicyError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<CoreNetworkPolicyError>(errors);
    }

    /**
     * <p>
     * Describes a core network policy exception.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Describes a core network policy exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicyException withErrors(CoreNetworkPolicyError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<CoreNetworkPolicyError>(errors.length));
        }
        for (CoreNetworkPolicyError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes a core network policy exception.
     * </p>
     * 
     * @param errors
     *        Describes a core network policy exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkPolicyException withErrors(java.util.Collection<CoreNetworkPolicyError> errors) {
        setErrors(errors);
        return this;
    }

}
