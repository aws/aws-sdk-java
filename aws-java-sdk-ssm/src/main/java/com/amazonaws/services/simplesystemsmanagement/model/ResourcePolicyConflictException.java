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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The hash provided in the call doesn't match the stored hash. This exception is thrown when trying to update an
 * obsolete policy version or when multiple requests to update a policy are sent.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicyConflictException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourcePolicyConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourcePolicyConflictException(String message) {
        super(message);
    }

}
