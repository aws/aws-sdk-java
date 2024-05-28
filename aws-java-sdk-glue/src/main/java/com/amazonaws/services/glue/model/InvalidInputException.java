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
package com.amazonaws.services.glue.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input provided was not valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInputException extends com.amazonaws.services.glue.model.AWSGlueException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Indicates whether or not the exception relates to a federated source.
     * </p>
     */
    private Boolean fromFederationSource;

    /**
     * Constructs a new InvalidInputException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInputException(String message) {
        super(message);
    }

    /**
     * <p>
     * Indicates whether or not the exception relates to a federated source.
     * </p>
     * 
     * @param fromFederationSource
     *        Indicates whether or not the exception relates to a federated source.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FromFederationSource")
    public void setFromFederationSource(Boolean fromFederationSource) {
        this.fromFederationSource = fromFederationSource;
    }

    /**
     * <p>
     * Indicates whether or not the exception relates to a federated source.
     * </p>
     * 
     * @return Indicates whether or not the exception relates to a federated source.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FromFederationSource")
    public Boolean getFromFederationSource() {
        return this.fromFederationSource;
    }

    /**
     * <p>
     * Indicates whether or not the exception relates to a federated source.
     * </p>
     * 
     * @param fromFederationSource
     *        Indicates whether or not the exception relates to a federated source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidInputException withFromFederationSource(Boolean fromFederationSource) {
        setFromFederationSource(fromFederationSource);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not the exception relates to a federated source.
     * </p>
     * 
     * @return Indicates whether or not the exception relates to a federated source.
     */

    public Boolean isFromFederationSource() {
        return this.fromFederationSource;
    }

}
