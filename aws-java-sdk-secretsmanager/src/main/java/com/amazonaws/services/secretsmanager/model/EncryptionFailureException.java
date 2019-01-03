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
package com.amazonaws.services.secretsmanager.model;

import javax.annotation.Generated;

/**
 * <p>
 * Secrets Manager can't encrypt the protected secret text using the provided KMS key. Check that the customer master
 * key (CMK) is available, enabled, and not in an invalid state. For more information, see <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects Use of a Customer
 * Master Key</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionFailureException extends com.amazonaws.services.secretsmanager.model.AWSSecretsManagerException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new EncryptionFailureException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public EncryptionFailureException(String message) {
        super(message);
    }

}
