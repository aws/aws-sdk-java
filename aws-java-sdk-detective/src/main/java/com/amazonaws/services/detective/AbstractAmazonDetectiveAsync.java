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
package com.amazonaws.services.detective;

import javax.annotation.Generated;

import com.amazonaws.services.detective.model.*;

/**
 * Abstract implementation of {@code AmazonDetectiveAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDetectiveAsync extends AbstractAmazonDetective implements AmazonDetectiveAsync {

    protected AbstractAmazonDetectiveAsync() {
    }

    @Override
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest request) {

        return acceptInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetGraphMemberDatasourcesResult> batchGetGraphMemberDatasourcesAsync(BatchGetGraphMemberDatasourcesRequest request) {

        return batchGetGraphMemberDatasourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetGraphMemberDatasourcesResult> batchGetGraphMemberDatasourcesAsync(BatchGetGraphMemberDatasourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetGraphMemberDatasourcesRequest, BatchGetGraphMemberDatasourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetMembershipDatasourcesResult> batchGetMembershipDatasourcesAsync(BatchGetMembershipDatasourcesRequest request) {

        return batchGetMembershipDatasourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetMembershipDatasourcesResult> batchGetMembershipDatasourcesAsync(BatchGetMembershipDatasourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetMembershipDatasourcesRequest, BatchGetMembershipDatasourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGraphResult> createGraphAsync(CreateGraphRequest request) {

        return createGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGraphResult> createGraphAsync(CreateGraphRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGraphRequest, CreateGraphResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest request) {

        return createMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGraphResult> deleteGraphAsync(DeleteGraphRequest request) {

        return deleteGraphAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGraphResult> deleteGraphAsync(DeleteGraphRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGraphRequest, DeleteGraphResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest request) {

        return deleteMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest request) {

        return describeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest request) {

        return disableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateMembershipResult> disassociateMembershipAsync(DisassociateMembershipRequest request) {

        return disassociateMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMembershipResult> disassociateMembershipAsync(DisassociateMembershipRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateMembershipRequest, DisassociateMembershipResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(EnableOrganizationAdminAccountRequest request) {

        return enableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(EnableOrganizationAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest request) {

        return getMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatasourcePackagesResult> listDatasourcePackagesAsync(ListDatasourcePackagesRequest request) {

        return listDatasourcePackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatasourcePackagesResult> listDatasourcePackagesAsync(ListDatasourcePackagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatasourcePackagesRequest, ListDatasourcePackagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGraphsResult> listGraphsAsync(ListGraphsRequest request) {

        return listGraphsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGraphsResult> listGraphsAsync(ListGraphsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGraphsRequest, ListGraphsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request) {

        return listInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request) {

        return listMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(ListOrganizationAdminAccountsRequest request) {

        return listOrganizationAdminAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(ListOrganizationAdminAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler) {

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
    public java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest request) {

        return rejectInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectInvitationResult> rejectInvitationAsync(RejectInvitationRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectInvitationRequest, RejectInvitationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartMonitoringMemberResult> startMonitoringMemberAsync(StartMonitoringMemberRequest request) {

        return startMonitoringMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMonitoringMemberResult> startMonitoringMemberAsync(StartMonitoringMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<StartMonitoringMemberRequest, StartMonitoringMemberResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDatasourcePackagesResult> updateDatasourcePackagesAsync(UpdateDatasourcePackagesRequest request) {

        return updateDatasourcePackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDatasourcePackagesResult> updateDatasourcePackagesAsync(UpdateDatasourcePackagesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasourcePackagesRequest, UpdateDatasourcePackagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest request) {

        return updateOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
