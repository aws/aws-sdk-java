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
package com.amazonaws.services.securitytoken.model;

import javax.annotation.Generated;

/**
 * <p>
 * The identity provider (IdP) reported that authentication failed. This might be because the claim is invalid.
 * </p>
 * <p>
 * If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that the claim
 * has expired or has been explicitly revoked.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IDPRejectedClaimException extends com.amazonaws.services.securitytoken.model.AWSSecurityTokenServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new IDPRejectedClaimException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public IDPRejectedClaimException(String message) {
        super(message);
    }

}
