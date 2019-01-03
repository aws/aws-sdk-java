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
 * The request was rejected because the specified custom key store name is already assigned to another custom key store
 * in the account. Try again with a custom key store name that is unique in the account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomKeyStoreNameInUseException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CustomKeyStoreNameInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CustomKeyStoreNameInUseException(String message) {
        super(message);
    }

}
