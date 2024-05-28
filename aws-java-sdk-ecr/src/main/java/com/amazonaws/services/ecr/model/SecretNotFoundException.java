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
package com.amazonaws.services.ecr.model;

import javax.annotation.Generated;

/**
 * <p>
 * The ARN of the secret specified in the pull through cache rule was not found. Update the pull through cache rule with
 * a valid secret ARN and try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretNotFoundException extends com.amazonaws.services.ecr.model.AmazonECRException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SecretNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SecretNotFoundException(String message) {
        super(message);
    }

}
