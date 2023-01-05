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
 * The request was rejected because the proxy credentials failed to authenticate to the specified external key store
 * proxy. The specified external key store proxy rejected a status request from KMS due to invalid credentials. This can
 * indicate an error in the credentials or in the identification of the external key store proxy.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksProxyIncorrectAuthenticationCredentialException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksProxyIncorrectAuthenticationCredentialException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public XksProxyIncorrectAuthenticationCredentialException(String message) {
        super(message);
    }

}
