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
package com.amazonaws.services.cloudcontrolapi.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource handler has returned that the request couldn't be completed due to networking issues, such as a failure
 * to receive a response from the server.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFailureException extends com.amazonaws.services.cloudcontrolapi.model.AWSCloudControlApiException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new NetworkFailureException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NetworkFailureException(String message) {
        super(message);
    }

}
