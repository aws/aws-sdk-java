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
 * The request was rejected because the state of the specified resource is not valid for this request.
 * </p>
 * <p>
 * This exceptions means one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The key state of the KMS key is not compatible with the operation.
 * </p>
 * <p>
 * To find the key state, use the <a>DescribeKey</a> operation. For more information about which key states are
 * compatible with each KMS operation, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key states of KMS keys</a> in the <i>
 * <i>Key Management Service Developer Guide</i> </i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For cryptographic operations on KMS keys in custom key stores, this exception represents a general failure with many
 * possible causes. To identify the cause, see the error message that accompanies the exception.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KMSInvalidStateException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new KMSInvalidStateException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public KMSInvalidStateException(String message) {
        super(message);
    }

}
