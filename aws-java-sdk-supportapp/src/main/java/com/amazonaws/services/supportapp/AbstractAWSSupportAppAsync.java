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
package com.amazonaws.services.supportapp;

import javax.annotation.Generated;

import com.amazonaws.services.supportapp.model.*;

/**
 * Abstract implementation of {@code AWSSupportAppAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSupportAppAsync extends AbstractAWSSupportApp implements AWSSupportAppAsync {

    protected AbstractAWSSupportAppAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest request) {

        return createSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSlackChannelConfigurationResult> createSlackChannelConfigurationAsync(
            CreateSlackChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSlackChannelConfigurationRequest, CreateSlackChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(DeleteAccountAliasRequest request) {

        return deleteAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountAliasResult> deleteAccountAliasAsync(DeleteAccountAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountAliasRequest, DeleteAccountAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest request) {

        return deleteSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackChannelConfigurationResult> deleteSlackChannelConfigurationAsync(
            DeleteSlackChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackChannelConfigurationRequest, DeleteSlackChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceConfigurationResult> deleteSlackWorkspaceConfigurationAsync(
            DeleteSlackWorkspaceConfigurationRequest request) {

        return deleteSlackWorkspaceConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSlackWorkspaceConfigurationResult> deleteSlackWorkspaceConfigurationAsync(
            DeleteSlackWorkspaceConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSlackWorkspaceConfigurationRequest, DeleteSlackWorkspaceConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountAliasResult> getAccountAliasAsync(GetAccountAliasRequest request) {

        return getAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountAliasResult> getAccountAliasAsync(GetAccountAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountAliasRequest, GetAccountAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSlackChannelConfigurationsResult> listSlackChannelConfigurationsAsync(ListSlackChannelConfigurationsRequest request) {

        return listSlackChannelConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSlackChannelConfigurationsResult> listSlackChannelConfigurationsAsync(ListSlackChannelConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSlackChannelConfigurationsRequest, ListSlackChannelConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSlackWorkspaceConfigurationsResult> listSlackWorkspaceConfigurationsAsync(
            ListSlackWorkspaceConfigurationsRequest request) {

        return listSlackWorkspaceConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSlackWorkspaceConfigurationsResult> listSlackWorkspaceConfigurationsAsync(
            ListSlackWorkspaceConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSlackWorkspaceConfigurationsRequest, ListSlackWorkspaceConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAccountAliasResult> putAccountAliasAsync(PutAccountAliasRequest request) {

        return putAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccountAliasResult> putAccountAliasAsync(PutAccountAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAccountAliasRequest, PutAccountAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterSlackWorkspaceForOrganizationResult> registerSlackWorkspaceForOrganizationAsync(
            RegisterSlackWorkspaceForOrganizationRequest request) {

        return registerSlackWorkspaceForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterSlackWorkspaceForOrganizationResult> registerSlackWorkspaceForOrganizationAsync(
            RegisterSlackWorkspaceForOrganizationRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterSlackWorkspaceForOrganizationRequest, RegisterSlackWorkspaceForOrganizationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest request) {

        return updateSlackChannelConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSlackChannelConfigurationResult> updateSlackChannelConfigurationAsync(
            UpdateSlackChannelConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSlackChannelConfigurationRequest, UpdateSlackChannelConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
