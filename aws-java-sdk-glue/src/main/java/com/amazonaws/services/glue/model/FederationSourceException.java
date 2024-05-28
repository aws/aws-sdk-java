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
 * A federation source failed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederationSourceException extends com.amazonaws.services.glue.model.AWSGlueException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code of the problem.
     * </p>
     */
    private String federationSourceErrorCode;

    /**
     * Constructs a new FederationSourceException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FederationSourceException(String message) {
        super(message);
    }

    /**
     * <p>
     * The error code of the problem.
     * </p>
     * 
     * @param federationSourceErrorCode
     *        The error code of the problem.
     * @see FederationSourceErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FederationSourceErrorCode")
    public void setFederationSourceErrorCode(String federationSourceErrorCode) {
        this.federationSourceErrorCode = federationSourceErrorCode;
    }

    /**
     * <p>
     * The error code of the problem.
     * </p>
     * 
     * @return The error code of the problem.
     * @see FederationSourceErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("FederationSourceErrorCode")
    public String getFederationSourceErrorCode() {
        return this.federationSourceErrorCode;
    }

    /**
     * <p>
     * The error code of the problem.
     * </p>
     * 
     * @param federationSourceErrorCode
     *        The error code of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationSourceErrorCode
     */

    public FederationSourceException withFederationSourceErrorCode(String federationSourceErrorCode) {
        setFederationSourceErrorCode(federationSourceErrorCode);
        return this;
    }

    /**
     * <p>
     * The error code of the problem.
     * </p>
     * 
     * @param federationSourceErrorCode
     *        The error code of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationSourceErrorCode
     */

    public FederationSourceException withFederationSourceErrorCode(FederationSourceErrorCode federationSourceErrorCode) {
        this.federationSourceErrorCode = federationSourceErrorCode.toString();
        return this;
    }

}
