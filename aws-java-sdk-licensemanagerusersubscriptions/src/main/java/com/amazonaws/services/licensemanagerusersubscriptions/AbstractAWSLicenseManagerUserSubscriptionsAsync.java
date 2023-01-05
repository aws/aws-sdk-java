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
package com.amazonaws.services.licensemanagerusersubscriptions;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerusersubscriptions.model.*;

/**
 * Abstract implementation of {@code AWSLicenseManagerUserSubscriptionsAsync}. Convenient method forms pass through to
 * the corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLicenseManagerUserSubscriptionsAsync extends AbstractAWSLicenseManagerUserSubscriptions implements
        AWSLicenseManagerUserSubscriptionsAsync {

    protected AbstractAWSLicenseManagerUserSubscriptionsAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateUserResult> associateUserAsync(AssociateUserRequest request) {

        return associateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateUserResult> associateUserAsync(AssociateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateUserRequest, AssociateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterIdentityProviderResult> deregisterIdentityProviderAsync(DeregisterIdentityProviderRequest request) {

        return deregisterIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterIdentityProviderResult> deregisterIdentityProviderAsync(DeregisterIdentityProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterIdentityProviderRequest, DeregisterIdentityProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserResult> disassociateUserAsync(DisassociateUserRequest request) {

        return disassociateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateUserResult> disassociateUserAsync(DisassociateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateUserRequest, DisassociateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest request) {

        return listIdentityProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIdentityProvidersRequest, ListIdentityProvidersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListProductSubscriptionsResult> listProductSubscriptionsAsync(ListProductSubscriptionsRequest request) {

        return listProductSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProductSubscriptionsResult> listProductSubscriptionsAsync(ListProductSubscriptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListProductSubscriptionsRequest, ListProductSubscriptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUserAssociationsResult> listUserAssociationsAsync(ListUserAssociationsRequest request) {

        return listUserAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserAssociationsResult> listUserAssociationsAsync(ListUserAssociationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUserAssociationsRequest, ListUserAssociationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterIdentityProviderResult> registerIdentityProviderAsync(RegisterIdentityProviderRequest request) {

        return registerIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterIdentityProviderResult> registerIdentityProviderAsync(RegisterIdentityProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterIdentityProviderRequest, RegisterIdentityProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartProductSubscriptionResult> startProductSubscriptionAsync(StartProductSubscriptionRequest request) {

        return startProductSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartProductSubscriptionResult> startProductSubscriptionAsync(StartProductSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartProductSubscriptionRequest, StartProductSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopProductSubscriptionResult> stopProductSubscriptionAsync(StopProductSubscriptionRequest request) {

        return stopProductSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopProductSubscriptionResult> stopProductSubscriptionAsync(StopProductSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopProductSubscriptionRequest, StopProductSubscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderSettingsResult> updateIdentityProviderSettingsAsync(UpdateIdentityProviderSettingsRequest request) {

        return updateIdentityProviderSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIdentityProviderSettingsResult> updateIdentityProviderSettingsAsync(UpdateIdentityProviderSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderSettingsRequest, UpdateIdentityProviderSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
