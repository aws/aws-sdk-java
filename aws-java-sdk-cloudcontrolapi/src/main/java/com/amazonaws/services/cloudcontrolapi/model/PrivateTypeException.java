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
 * Cloud Control API hasn't received a valid response from the resource handler, due to a configuration error. This
 * includes issues such as the resource handler returning an invalid response, or timing out.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivateTypeException extends com.amazonaws.services.cloudcontrolapi.model.AWSCloudControlApiException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new PrivateTypeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public PrivateTypeException(String message) {
        super(message);
    }

}
