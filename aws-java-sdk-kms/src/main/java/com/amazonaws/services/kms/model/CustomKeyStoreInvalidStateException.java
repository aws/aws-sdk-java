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
 * The request was rejected because of the <code>ConnectionState</code> of the custom key store. To get the
 * <code>ConnectionState</code> of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
 * </p>
 * <p>
 * This exception is thrown under the following conditions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You requested the <a>CreateKey</a> or <a>GenerateRandom</a> operation in a custom key store that is not connected.
 * These operations are valid only when the custom key store <code>ConnectionState</code> is <code>CONNECTED</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You requested the <a>UpdateCustomKeyStore</a> or <a>DeleteCustomKeyStore</a> operation on a custom key store that is
 * not disconnected. This operation is valid only when the custom key store <code>ConnectionState</code> is
 * <code>DISCONNECTED</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You requested the <a>ConnectCustomKeyStore</a> operation on a custom key store with a <code>ConnectionState</code> of
 * <code>DISCONNECTING</code> or <code>FAILED</code>. This operation is valid for all other <code>ConnectionState</code>
 * values.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomKeyStoreInvalidStateException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CustomKeyStoreInvalidStateException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CustomKeyStoreInvalidStateException(String message) {
        super(message);
    }

}
