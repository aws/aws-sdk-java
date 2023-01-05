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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSLicenseManagerUserSubscriptions}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSLicenseManagerUserSubscriptions implements AWSLicenseManagerUserSubscriptions {

    protected AbstractAWSLicenseManagerUserSubscriptions() {
    }

    @Override
    public AssociateUserResult associateUser(AssociateUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterIdentityProviderResult deregisterIdentityProvider(DeregisterIdentityProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DisassociateUserResult disassociateUser(DisassociateUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIdentityProvidersResult listIdentityProviders(ListIdentityProvidersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstancesResult listInstances(ListInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListProductSubscriptionsResult listProductSubscriptions(ListProductSubscriptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUserAssociationsResult listUserAssociations(ListUserAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterIdentityProviderResult registerIdentityProvider(RegisterIdentityProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartProductSubscriptionResult startProductSubscription(StartProductSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopProductSubscriptionResult stopProductSubscription(StopProductSubscriptionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateIdentityProviderSettingsResult updateIdentityProviderSettings(UpdateIdentityProviderSettingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
