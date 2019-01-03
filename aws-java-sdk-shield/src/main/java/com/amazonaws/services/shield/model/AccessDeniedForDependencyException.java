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
package com.amazonaws.services.shield.model;

import javax.annotation.Generated;

/**
 * <p>
 * In order to grant the necessary access to the DDoS Response Team, the user submitting <code>AssociateDRTRole</code>
 * must have the <code>iam:PassRole</code> permission. This error indicates the user did not have the appropriate
 * permissions. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a User Permissions to
 * Pass a Role to an AWS Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedForDependencyException extends com.amazonaws.services.shield.model.AWSShieldException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AccessDeniedForDependencyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AccessDeniedForDependencyException(String message) {
        super(message);
    }

}
