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
package com.amazonaws.services.kms.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the custom key store contains AWS KMS customer master keys (CMKs). After verifying
 * that you do not need to use the CMKs, use the <a>ScheduleKeyDeletion</a> operation to delete the CMKs. After they are
 * deleted, you can delete the custom key store.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomKeyStoreHasCMKsException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CustomKeyStoreHasCMKsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CustomKeyStoreHasCMKsException(String message) {
        super(message);
    }

}
