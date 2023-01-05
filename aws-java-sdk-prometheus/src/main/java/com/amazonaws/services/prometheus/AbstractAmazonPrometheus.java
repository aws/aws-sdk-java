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
package com.amazonaws.services.prometheus;

import javax.annotation.Generated;

import com.amazonaws.services.prometheus.model.*;
import com.amazonaws.*;
import com.amazonaws.services.prometheus.waiters.AmazonPrometheusWaiters;

/**
 * Abstract implementation of {@code AmazonPrometheus}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPrometheus implements AmazonPrometheus {

    protected AbstractAmazonPrometheus() {
    }

    @Override
    public CreateAlertManagerDefinitionResult createAlertManagerDefinition(CreateAlertManagerDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLoggingConfigurationResult createLoggingConfiguration(CreateLoggingConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRuleGroupsNamespaceResult createRuleGroupsNamespace(CreateRuleGroupsNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateWorkspaceResult createWorkspace(CreateWorkspaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAlertManagerDefinitionResult deleteAlertManagerDefinition(DeleteAlertManagerDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteRuleGroupsNamespaceResult deleteRuleGroupsNamespace(DeleteRuleGroupsNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteWorkspaceResult deleteWorkspace(DeleteWorkspaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAlertManagerDefinitionResult describeAlertManagerDefinition(DescribeAlertManagerDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeLoggingConfigurationResult describeLoggingConfiguration(DescribeLoggingConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRuleGroupsNamespaceResult describeRuleGroupsNamespace(DescribeRuleGroupsNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeWorkspaceResult describeWorkspace(DescribeWorkspaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRuleGroupsNamespacesResult listRuleGroupsNamespaces(ListRuleGroupsNamespacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListWorkspacesResult listWorkspaces(ListWorkspacesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutAlertManagerDefinitionResult putAlertManagerDefinition(PutAlertManagerDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRuleGroupsNamespaceResult putRuleGroupsNamespace(PutRuleGroupsNamespaceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateLoggingConfigurationResult updateLoggingConfiguration(UpdateLoggingConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateWorkspaceAliasResult updateWorkspaceAlias(UpdateWorkspaceAliasRequest request) {
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

    @Override
    public AmazonPrometheusWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
