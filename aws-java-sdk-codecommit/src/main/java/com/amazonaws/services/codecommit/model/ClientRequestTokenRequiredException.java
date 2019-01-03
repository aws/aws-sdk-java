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
package com.amazonaws.services.codecommit.model;

import javax.annotation.Generated;

/**
 * <p>
 * A client request token is required. A client request token is an unique, client-generated idempotency token that when
 * provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with
 * the same parameters and a token is included, the request will return information about the initial request that used
 * that token.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientRequestTokenRequiredException extends com.amazonaws.services.codecommit.model.AWSCodeCommitException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ClientRequestTokenRequiredException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ClientRequestTokenRequiredException(String message) {
        super(message);
    }

}
