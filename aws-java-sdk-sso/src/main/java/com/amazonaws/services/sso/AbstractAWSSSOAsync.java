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
package com.amazonaws.services.sso;

import javax.annotation.Generated;

import com.amazonaws.services.sso.model.*;

/**
 * Abstract implementation of {@code AWSSSOAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSSOAsync extends AbstractAWSSSO implements AWSSSOAsync {

    protected AbstractAWSSSOAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetRoleCredentialsResult> getRoleCredentialsAsync(GetRoleCredentialsRequest request) {

        return getRoleCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoleCredentialsResult> getRoleCredentialsAsync(GetRoleCredentialsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRoleCredentialsRequest, GetRoleCredentialsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccountRolesResult> listAccountRolesAsync(ListAccountRolesRequest request) {

        return listAccountRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountRolesResult> listAccountRolesAsync(ListAccountRolesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountRolesRequest, ListAccountRolesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest request) {

        return listAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountsRequest, ListAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<LogoutResult> logoutAsync(LogoutRequest request) {

        return logoutAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LogoutResult> logoutAsync(LogoutRequest request,
            com.amazonaws.handlers.AsyncHandler<LogoutRequest, LogoutResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
