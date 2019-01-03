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
package com.amazonaws.services.iot.model;

import javax.annotation.Generated;

/**
 * <p>
 * Unable to verify the CA certificate used to sign the device certificate you are attempting to register. This is
 * happens when you have registered more than one CA certificate that has the same subject field and public key.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateConflictException extends com.amazonaws.services.iot.model.AWSIotException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new CertificateConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public CertificateConflictException(String message) {
        super(message);
    }

}
