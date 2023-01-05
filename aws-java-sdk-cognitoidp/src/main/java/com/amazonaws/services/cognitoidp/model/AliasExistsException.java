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
package com.amazonaws.services.cognitoidp.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when a user tries to confirm the account with an email address or phone number that has
 * already been supplied as an alias for a different user profile. This exception indicates that an account with this
 * email address or phone already exists in a user pool that you've configured to use email address or phone number as a
 * sign-in alias.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AliasExistsException extends com.amazonaws.services.cognitoidp.model.AWSCognitoIdentityProviderException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AliasExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AliasExistsException(String message) {
        super(message);
    }

}
