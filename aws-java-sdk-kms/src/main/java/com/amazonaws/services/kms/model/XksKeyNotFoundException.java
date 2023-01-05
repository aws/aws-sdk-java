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
package com.amazonaws.services.kms.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the external key store proxy could not find the external key. This exception is
 * thrown when the value of the <code>XksKeyId</code> parameter doesn't identify a key in the external key manager
 * associated with the external key proxy.
 * </p>
 * <p>
 * Verify that the <code>XksKeyId</code> represents an existing key in the external key manager. Use the key identifier
 * that the external key store proxy uses to identify the key. For details, see the documentation provided with your
 * external key store proxy or key manager.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksKeyNotFoundException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksKeyNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public XksKeyNotFoundException(String message) {
        super(message);
    }

}
