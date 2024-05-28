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
package com.amazonaws.services.rdsdata.model;

import javax.annotation.Generated;

/**
 * <p>
 * There was a problem with the Secrets Manager secret used with the request, caused by one of the following conditions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * RDS Data API timed out retrieving the secret.
 * </p>
 * </li>
 * <li>
 * <p>
 * The secret provided wasn't found.
 * </p>
 * </li>
 * <li>
 * <p>
 * The secret couldn't be decrypted.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretsErrorException extends com.amazonaws.services.rdsdata.model.AWSRDSDataException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SecretsErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SecretsErrorException(String message) {
        super(message);
    }

}
