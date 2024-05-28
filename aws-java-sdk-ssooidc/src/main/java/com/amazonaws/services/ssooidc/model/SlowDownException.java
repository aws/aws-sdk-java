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
package com.amazonaws.services.ssooidc.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that the client is making the request too frequently and is more than the service can handle.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlowDownException extends com.amazonaws.services.ssooidc.model.AWSSSOOIDCException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Single error code. For this exception the value will be <code>slow_down</code>.
     * </p>
     */
    private String error;
    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     */
    private String error_description;

    /**
     * Constructs a new SlowDownException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SlowDownException(String message) {
        super(message);
    }

    /**
     * <p>
     * Single error code. For this exception the value will be <code>slow_down</code>.
     * </p>
     * 
     * @param error
     *        Single error code. For this exception the value will be <code>slow_down</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * Single error code. For this exception the value will be <code>slow_down</code>.
     * </p>
     * 
     * @return Single error code. For this exception the value will be <code>slow_down</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * Single error code. For this exception the value will be <code>slow_down</code>.
     * </p>
     * 
     * @param error
     *        Single error code. For this exception the value will be <code>slow_down</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlowDownException withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     * 
     * @param error_description
     *        Human-readable text providing additional information, used to assist the client developer in understanding
     *        the error that occurred.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error_description")
    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     * 
     * @return Human-readable text providing additional information, used to assist the client developer in
     *         understanding the error that occurred.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error_description")
    public String getError_description() {
        return this.error_description;
    }

    /**
     * <p>
     * Human-readable text providing additional information, used to assist the client developer in understanding the
     * error that occurred.
     * </p>
     * 
     * @param error_description
     *        Human-readable text providing additional information, used to assist the client developer in understanding
     *        the error that occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlowDownException withError_description(String error_description) {
        setError_description(error_description);
        return this;
    }

}
