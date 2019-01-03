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
package com.amazonaws.services.organizations.model;

import javax.annotation.Generated;

/**
 * <p>
 * A handshake with the same action and target already exists. For example, if you invited an account to join your
 * organization, the invited account might already have a pending invitation from this organization. If you intend to
 * resend an invitation to an account, ensure that existing handshakes that might be considered duplicates are canceled
 * or declined.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DuplicateHandshakeException extends com.amazonaws.services.organizations.model.AWSOrganizationsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DuplicateHandshakeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DuplicateHandshakeException(String message) {
        super(message);
    }

}
