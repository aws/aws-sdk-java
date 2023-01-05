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
package com.amazonaws.services.inspector2;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;

/**
 * Abstract implementation of {@code AWSInspector2Async}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSInspector2Async extends AbstractAWSInspector2 implements AWSInspector2Async {

    protected AbstractAWSInspector2Async() {
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberResult> associateMemberAsync(AssociateMemberRequest request) {

        return associateMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberResult> associateMemberAsync(AssociateMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberRequest, AssociateMemberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetAccountStatusResult> batchGetAccountStatusAsync(BatchGetAccountStatusRequest request) {

        return batchGetAccountStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetAccountStatusResult> batchGetAccountStatusAsync(BatchGetAccountStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetAccountStatusRequest, BatchGetAccountStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetFreeTrialInfoResult> batchGetFreeTrialInfoAsync(BatchGetFreeTrialInfoRequest request) {

        return batchGetFreeTrialInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetFreeTrialInfoResult> batchGetFreeTrialInfoAsync(BatchGetFreeTrialInfoRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetFreeTrialInfoRequest, BatchGetFreeTrialInfoResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelFindingsReportResult> cancelFindingsReportAsync(CancelFindingsReportRequest request) {

        return cancelFindingsReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelFindingsReportResult> cancelFindingsReportAsync(CancelFindingsReportRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelFindingsReportRequest, CancelFindingsReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest request) {

        return createFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFindingsReportResult> createFindingsReportAsync(CreateFindingsReportRequest request) {

        return createFindingsReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFindingsReportResult> createFindingsReportAsync(CreateFindingsReportRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFindingsReportRequest, CreateFindingsReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest request) {

        return deleteFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler) {

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
    public java.util.concurrent.Future<DisableResult> disableAsync(DisableRequest request) {

        return disableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableResult> disableAsync(DisableRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableRequest, DisableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableDelegatedAdminAccountResult> disableDelegatedAdminAccountAsync(DisableDelegatedAdminAccountRequest request) {

        return disableDelegatedAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDelegatedAdminAccountResult> disableDelegatedAdminAccountAsync(DisableDelegatedAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableDelegatedAdminAccountRequest, DisableDelegatedAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest request) {

        return disassociateMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberRequest, DisassociateMemberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableResult> enableAsync(EnableRequest request) {

        return enableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableResult> enableAsync(EnableRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableRequest, EnableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableDelegatedAdminAccountResult> enableDelegatedAdminAccountAsync(EnableDelegatedAdminAccountRequest request) {

        return enableDelegatedAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDelegatedAdminAccountResult> enableDelegatedAdminAccountAsync(EnableDelegatedAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableDelegatedAdminAccountRequest, EnableDelegatedAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest request) {

        return getConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationRequest, GetConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDelegatedAdminAccountResult> getDelegatedAdminAccountAsync(GetDelegatedAdminAccountRequest request) {

        return getDelegatedAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDelegatedAdminAccountResult> getDelegatedAdminAccountAsync(GetDelegatedAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDelegatedAdminAccountRequest, GetDelegatedAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFindingsReportStatusResult> getFindingsReportStatusAsync(GetFindingsReportStatusRequest request) {

        return getFindingsReportStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsReportStatusResult> getFindingsReportStatusAsync(GetFindingsReportStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFindingsReportStatusRequest, GetFindingsReportStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request) {

        return getMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccountPermissionsResult> listAccountPermissionsAsync(ListAccountPermissionsRequest request) {

        return listAccountPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountPermissionsResult> listAccountPermissionsAsync(ListAccountPermissionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountPermissionsRequest, ListAccountPermissionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(ListCoverageRequest request) {

        return listCoverageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(ListCoverageRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCoverageRequest, ListCoverageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCoverageStatisticsResult> listCoverageStatisticsAsync(ListCoverageStatisticsRequest request) {

        return listCoverageStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoverageStatisticsResult> listCoverageStatisticsAsync(ListCoverageStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCoverageStatisticsRequest, ListCoverageStatisticsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDelegatedAdminAccountsResult> listDelegatedAdminAccountsAsync(ListDelegatedAdminAccountsRequest request) {

        return listDelegatedAdminAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDelegatedAdminAccountsResult> listDelegatedAdminAccountsAsync(ListDelegatedAdminAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDelegatedAdminAccountsRequest, ListDelegatedAdminAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest request) {

        return listFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingAggregationsResult> listFindingAggregationsAsync(ListFindingAggregationsRequest request) {

        return listFindingAggregationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingAggregationsResult> listFindingAggregationsAsync(ListFindingAggregationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingAggregationsRequest, ListFindingAggregationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUsageTotalsResult> listUsageTotalsAsync(ListUsageTotalsRequest request) {

        return listUsageTotalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsageTotalsResult> listUsageTotalsAsync(ListUsageTotalsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUsageTotalsRequest, ListUsageTotalsResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request) {

        return updateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationRequest, UpdateConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest request) {

        return updateFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFilterRequest, UpdateFilterResult> asyncHandler) {

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
