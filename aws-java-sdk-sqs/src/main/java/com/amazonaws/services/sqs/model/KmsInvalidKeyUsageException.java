/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected for one of the following reasons:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The KeyUsage value of the KMS key is incompatible with the API operation.
 * </p>
 * </li>
 * <li>
 * <p>
 * The encryption algorithm or signing algorithm specified for the operation is incompatible with the type of key
 * material in the KMS key (KeySpec).
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsInvalidKeyUsageException extends com.amazonaws.services.sqs.model.AmazonSQSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new KmsInvalidKeyUsageException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public KmsInvalidKeyUsageException(String message) {
        super(message);
    }

}
