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
package com.amazonaws.services.apigatewayv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * A limit has been exceeded. See the accompanying error message for details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooManyRequestsException extends com.amazonaws.services.apigatewayv2.model.AmazonApiGatewayV2Exception {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The limit type.
     * </p>
     */
    private String limitType;

    /**
     * Constructs a new TooManyRequestsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TooManyRequestsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The limit type.
     * </p>
     * 
     * @param limitType
     *        The limit type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("limitType")
    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    /**
     * <p>
     * The limit type.
     * </p>
     * 
     * @return The limit type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("limitType")
    public String getLimitType() {
        return this.limitType;
    }

    /**
     * <p>
     * The limit type.
     * </p>
     * 
     * @param limitType
     *        The limit type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooManyRequestsException withLimitType(String limitType) {
        setLimitType(limitType);
        return this;
    }

}
