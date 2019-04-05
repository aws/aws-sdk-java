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
package com.amazonaws.services.securitytoken;

import javax.annotation.Generated;

import com.amazonaws.services.securitytoken.model.*;

/**
 * Abstract implementation of {@code AWSSecurityTokenServiceAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSecurityTokenServiceAsync extends AbstractAWSSecurityTokenService implements AWSSecurityTokenServiceAsync {

    protected AbstractAWSSecurityTokenServiceAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleResult> assumeRoleAsync(AssumeRoleRequest request) {

        return assumeRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleResult> assumeRoleAsync(AssumeRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<AssumeRoleRequest, AssumeRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(AssumeRoleWithSAMLRequest request) {

        return assumeRoleWithSAMLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(AssumeRoleWithSAMLRequest request,
            com.amazonaws.handlers.AsyncHandler<AssumeRoleWithSAMLRequest, AssumeRoleWithSAMLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(AssumeRoleWithWebIdentityRequest request) {

        return assumeRoleWithWebIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(AssumeRoleWithWebIdentityRequest request,
            com.amazonaws.handlers.AsyncHandler<AssumeRoleWithWebIdentityRequest, AssumeRoleWithWebIdentityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(DecodeAuthorizationMessageRequest request) {

        return decodeAuthorizationMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(DecodeAuthorizationMessageRequest request,
            com.amazonaws.handlers.AsyncHandler<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCallerIdentityResult> getCallerIdentityAsync(GetCallerIdentityRequest request) {

        return getCallerIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCallerIdentityResult> getCallerIdentityAsync(GetCallerIdentityRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCallerIdentityRequest, GetCallerIdentityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(GetFederationTokenRequest request) {

        return getFederationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(GetFederationTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(GetSessionTokenRequest request) {

        return getSessionTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(GetSessionTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSessionTokenRequest, GetSessionTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetSessionToken operation.
     *
     * @see #getSessionTokenAsync(GetSessionTokenRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync() {

        return getSessionTokenAsync(new GetSessionTokenRequest());
    }

    /**
     * Simplified method form for invoking the GetSessionToken operation with an AsyncHandler.
     *
     * @see #getSessionTokenAsync(GetSessionTokenRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(
            com.amazonaws.handlers.AsyncHandler<GetSessionTokenRequest, GetSessionTokenResult> asyncHandler) {

        return getSessionTokenAsync(new GetSessionTokenRequest(), asyncHandler);
    }

}
