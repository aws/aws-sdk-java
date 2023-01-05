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
 * The request was rejected because the concatenation of the <code>XksProxyUriEndpoint</code> is already associated with
 * an external key store in the Amazon Web Services account and Region. Each external key store in an account and Region
 * must use a unique external key store proxy address.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class XksProxyUriEndpointInUseException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new XksProxyUriEndpointInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public XksProxyUriEndpointInUseException(String message) {
        super(message);
    }

}
