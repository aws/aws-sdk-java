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

/**
 * Abstract implementation of {@code AmazonPrometheusAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPrometheusAsync extends AbstractAmazonPrometheus implements AmazonPrometheusAsync {

    protected AbstractAmazonPrometheusAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAlertManagerDefinitionResult> createAlertManagerDefinitionAsync(CreateAlertManagerDefinitionRequest request) {

        return createAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAlertManagerDefinitionResult> createAlertManagerDefinitionAsync(CreateAlertManagerDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAlertManagerDefinitionRequest, CreateAlertManagerDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(CreateLoggingConfigurationRequest request) {

        return createLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(CreateLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLoggingConfigurationRequest, CreateLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupsNamespaceResult> createRuleGroupsNamespaceAsync(CreateRuleGroupsNamespaceRequest request) {

        return createRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupsNamespaceResult> createRuleGroupsNamespaceAsync(CreateRuleGroupsNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRuleGroupsNamespaceRequest, CreateRuleGroupsNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest request) {

        return createWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkspaceResult> createWorkspaceAsync(CreateWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertManagerDefinitionResult> deleteAlertManagerDefinitionAsync(DeleteAlertManagerDefinitionRequest request) {

        return deleteAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAlertManagerDefinitionResult> deleteAlertManagerDefinitionAsync(DeleteAlertManagerDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAlertManagerDefinitionRequest, DeleteAlertManagerDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request) {

        return deleteLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupsNamespaceResult> deleteRuleGroupsNamespaceAsync(DeleteRuleGroupsNamespaceRequest request) {

        return deleteRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupsNamespaceResult> deleteRuleGroupsNamespaceAsync(DeleteRuleGroupsNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupsNamespaceRequest, DeleteRuleGroupsNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest request) {

        return deleteWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkspaceResult> deleteWorkspaceAsync(DeleteWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAlertManagerDefinitionResult> describeAlertManagerDefinitionAsync(DescribeAlertManagerDefinitionRequest request) {

        return describeAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlertManagerDefinitionResult> describeAlertManagerDefinitionAsync(DescribeAlertManagerDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAlertManagerDefinitionRequest, DescribeAlertManagerDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(DescribeLoggingConfigurationRequest request) {

        return describeLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLoggingConfigurationResult> describeLoggingConfigurationAsync(DescribeLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLoggingConfigurationRequest, DescribeLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleGroupsNamespaceResult> describeRuleGroupsNamespaceAsync(DescribeRuleGroupsNamespaceRequest request) {

        return describeRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleGroupsNamespaceResult> describeRuleGroupsNamespaceAsync(DescribeRuleGroupsNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleGroupsNamespaceRequest, DescribeRuleGroupsNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest request) {

        return describeWorkspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeWorkspaceResult> describeWorkspaceAsync(DescribeWorkspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkspaceRequest, DescribeWorkspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsNamespacesResult> listRuleGroupsNamespacesAsync(ListRuleGroupsNamespacesRequest request) {

        return listRuleGroupsNamespacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsNamespacesResult> listRuleGroupsNamespacesAsync(ListRuleGroupsNamespacesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRuleGroupsNamespacesRequest, ListRuleGroupsNamespacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest request) {

        return listWorkspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkspacesResult> listWorkspacesAsync(ListWorkspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAlertManagerDefinitionResult> putAlertManagerDefinitionAsync(PutAlertManagerDefinitionRequest request) {

        return putAlertManagerDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAlertManagerDefinitionResult> putAlertManagerDefinitionAsync(PutAlertManagerDefinitionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAlertManagerDefinitionRequest, PutAlertManagerDefinitionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRuleGroupsNamespaceResult> putRuleGroupsNamespaceAsync(PutRuleGroupsNamespaceRequest request) {

        return putRuleGroupsNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRuleGroupsNamespaceResult> putRuleGroupsNamespaceAsync(PutRuleGroupsNamespaceRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRuleGroupsNamespaceRequest, PutRuleGroupsNamespaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request) {

        return updateLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest request) {

        return updateWorkspaceAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkspaceAliasResult> updateWorkspaceAliasAsync(UpdateWorkspaceAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkspaceAliasRequest, UpdateWorkspaceAliasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
