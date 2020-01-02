/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request must contain either a valid (registered) AWS access key ID or X.509 certificate.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MissingAuthenticationTokenException extends com.amazonaws.services.computeoptimizer.model.AWSComputeOptimizerException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new MissingAuthenticationTokenException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public MissingAuthenticationTokenException(String message) {
        super(message);
    }

}
