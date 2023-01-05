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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSSupportApp}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSupportApp implements AWSSupportApp {

    protected AbstractAWSSupportApp() {
    }

    @Override
    public CreateSlackChannelConfigurationResult createSlackChannelConfiguration(CreateSlackChannelConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAccountAliasResult deleteAccountAlias(DeleteAccountAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSlackChannelConfigurationResult deleteSlackChannelConfiguration(DeleteSlackChannelConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSlackWorkspaceConfigurationResult deleteSlackWorkspaceConfiguration(DeleteSlackWorkspaceConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountAliasResult getAccountAlias(GetAccountAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSlackChannelConfigurationsResult listSlackChannelConfigurations(ListSlackChannelConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSlackWorkspaceConfigurationsResult listSlackWorkspaceConfigurations(ListSlackWorkspaceConfigurationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutAccountAliasResult putAccountAlias(PutAccountAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterSlackWorkspaceForOrganizationResult registerSlackWorkspaceForOrganization(RegisterSlackWorkspaceForOrganizationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSlackChannelConfigurationResult updateSlackChannelConfiguration(UpdateSlackChannelConfigurationRequest request) {
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
