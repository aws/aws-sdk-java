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
package com.amazonaws.services.storagegateway.model;

import javax.annotation.Generated;

/**
 * <p>
 * An internal server error has occurred because the service is unavailable. For more information, see the error and
 * message fields.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUnavailableErrorException extends com.amazonaws.services.storagegateway.model.AWSStorageGatewayException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A <a>StorageGatewayError</a> that provides more information about the cause of the error.
     * </p>
     */
    private StorageGatewayError error;

    /**
     * Constructs a new ServiceUnavailableErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceUnavailableErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * A <a>StorageGatewayError</a> that provides more information about the cause of the error.
     * </p>
     * 
     * @param error
     *        A <a>StorageGatewayError</a> that provides more information about the cause of the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public void setError(StorageGatewayError error) {
        this.error = error;
    }

    /**
     * <p>
     * A <a>StorageGatewayError</a> that provides more information about the cause of the error.
     * </p>
     * 
     * @return A <a>StorageGatewayError</a> that provides more information about the cause of the error.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    public StorageGatewayError getError() {
        return this.error;
    }

    /**
     * <p>
     * A <a>StorageGatewayError</a> that provides more information about the cause of the error.
     * </p>
     * 
     * @param error
     *        A <a>StorageGatewayError</a> that provides more information about the cause of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUnavailableErrorException withError(StorageGatewayError error) {
        setError(error);
        return this;
    }

}
