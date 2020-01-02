/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssooidc;

import javax.annotation.Generated;

import com.amazonaws.services.ssooidc.model.*;

/**
 * Abstract implementation of {@code AWSSSOOIDCAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSSOOIDCAsync extends AbstractAWSSSOOIDC implements AWSSSOOIDCAsync {

    protected AbstractAWSSSOOIDCAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest request) {

        return createTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTokenRequest, CreateTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterClientResult> registerClientAsync(RegisterClientRequest request) {

        return registerClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterClientResult> registerClientAsync(RegisterClientRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterClientRequest, RegisterClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartDeviceAuthorizationResult> startDeviceAuthorizationAsync(StartDeviceAuthorizationRequest request) {

        return startDeviceAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeviceAuthorizationResult> startDeviceAuthorizationAsync(StartDeviceAuthorizationRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
