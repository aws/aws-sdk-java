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
package com.amazonaws.services.secretsmanager.model;

import javax.annotation.Generated;

/**
 * <p>
 * A parameter value is not valid for the current state of the resource.
 * </p>
 * <p>
 * Possible causes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The secret is scheduled for deletion.
 * </p>
 * </li>
 * <li>
 * <p>
 * You tried to enable rotation on a secret that doesn't already have a Lambda function ARN configured and you didn't
 * include such an ARN as a parameter in this call.
 * </p>
 * </li>
 * <li>
 * <p>
 * The secret is managed by another service, and you must use that service to update it. For more information, see <a
 * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets managed by
 * other Amazon Web Services services</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.secretsmanager.model.AWSSecretsManagerException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

}
