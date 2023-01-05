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
 * KMS was unable to reach the specified <code>XksProxyUriPath</code>. The path must be reachable before you create the
 * external key store or update its settings.
 * </p>
 * <p>
 * This exception is also thrown when the external key store proxy response to a <code>GetHealthStatus</code> request
 * indicates that all external key manager instances are unavailable.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksProxyUriUnreachableException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksProxyUriUnreachableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public XksProxyUriUnreachableException(String message) {
        super(message);
    }

}
