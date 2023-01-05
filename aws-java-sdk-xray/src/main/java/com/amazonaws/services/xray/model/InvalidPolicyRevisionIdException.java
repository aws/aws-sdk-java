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
package com.amazonaws.services.xray.model;

import javax.annotation.Generated;

/**
 * <p>
 * A policy revision id was provided which does not match the latest policy revision. This exception is also if a policy
 * revision id of 0 is provided via <code>PutResourcePolicy</code> and a policy with the same name already exists.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidPolicyRevisionIdException extends com.amazonaws.services.xray.model.AWSXRayException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidPolicyRevisionIdException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidPolicyRevisionIdException(String message) {
        super(message);
    }

}
