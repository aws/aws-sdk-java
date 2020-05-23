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
package com.amazonaws.services.macie2;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;

/**
 * Abstract implementation of {@code AmazonMacie2Async}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMacie2Async extends AbstractAmazonMacie2 implements AmazonMacie2Async {

    protected AbstractAmazonMacie2Async() {
    }

    @Override
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest request) {

        return acceptInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest request) {

        return archiveFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ArchiveFindingsRequest, ArchiveFindingsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchGetCustomDataIdentifiersResult> batchGetCustomDataIdentifiersAsync(BatchGetCustomDataIdentifiersRequest request) {

        return batchGetCustomDataIdentifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCustomDataIdentifiersResult> batchGetCustomDataIdentifiersAsync(BatchGetCustomDataIdentifiersRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchGetCustomDataIdentifiersRequest, BatchGetCustomDataIdentifiersResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateClassificationJobResult> createClassificationJobAsync(CreateClassificationJobRequest request) {

        return createClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClassificationJobResult> createClassificationJobAsync(CreateClassificationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClassificationJobRequest, CreateClassificationJobResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateCustomDataIdentifierResult> createCustomDataIdentifierAsync(CreateCustomDataIdentifierRequest request) {

        return createCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomDataIdentifierResult> createCustomDataIdentifierAsync(CreateCustomDataIdentifierRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCustomDataIdentifierRequest, CreateCustomDataIdentifierResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFindingsFilterResult> createFindingsFilterAsync(CreateFindingsFilterRequest request) {

        return createFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFindingsFilterResult> createFindingsFilterAsync(CreateFindingsFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFindingsFilterRequest, CreateFindingsFilterResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInvitationsResult> createInvitationsAsync(CreateInvitationsRequest request) {

        return createInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInvitationsResult> createInvitationsAsync(CreateInvitationsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInvitationsRequest, CreateInvitationsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest request) {

        return createMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMemberRequest, CreateMemberResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest request) {

        return createSampleFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSampleFindingsRequest, CreateSampleFindingsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest request) {

        return declineInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomDataIdentifierResult> deleteCustomDataIdentifierAsync(DeleteCustomDataIdentifierRequest request) {

        return deleteCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomDataIdentifierResult> deleteCustomDataIdentifierAsync(DeleteCustomDataIdentifierRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomDataIdentifierRequest, DeleteCustomDataIdentifierResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFindingsFilterResult> deleteFindingsFilterAsync(DeleteFindingsFilterRequest request) {

        return deleteFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFindingsFilterResult> deleteFindingsFilterAsync(DeleteFindingsFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFindingsFilterRequest, DeleteFindingsFilterResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest request) {

        return deleteInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest request) {

        return deleteMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBucketsResult> describeBucketsAsync(DescribeBucketsRequest request) {

        return describeBucketsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBucketsResult> describeBucketsAsync(DescribeBucketsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBucketsRequest, DescribeBucketsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClassificationJobResult> describeClassificationJobAsync(DescribeClassificationJobRequest request) {

        return describeClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClassificationJobResult> describeClassificationJobAsync(DescribeClassificationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClassificationJobRequest, DescribeClassificationJobResult> asyncHandler) {

        throw new UnsupportedOperationException();
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

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableMacieResult> disableMacieAsync(DisableMacieRequest request) {

        return disableMacieAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableMacieResult> disableMacieAsync(DisableMacieRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableMacieRequest, DisableMacieResult> asyncHandler) {

        throw new UnsupportedOperationException();
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

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(DisassociateFromMasterAccountRequest request) {

        return disassociateFromMasterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(DisassociateFromMasterAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest request) {

        return disassociateMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberRequest, DisassociateMemberResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableMacieResult> enableMacieAsync(EnableMacieRequest request) {

        return enableMacieAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableMacieResult> enableMacieAsync(EnableMacieRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableMacieRequest, EnableMacieResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(EnableOrganizationAdminAccountRequest request) {

        return enableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(EnableOrganizationAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBucketStatisticsResult> getBucketStatisticsAsync(GetBucketStatisticsRequest request) {

        return getBucketStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketStatisticsResult> getBucketStatisticsAsync(GetBucketStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBucketStatisticsRequest, GetBucketStatisticsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetClassificationExportConfigurationResult> getClassificationExportConfigurationAsync(
            GetClassificationExportConfigurationRequest request) {

        return getClassificationExportConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClassificationExportConfigurationResult> getClassificationExportConfigurationAsync(
            GetClassificationExportConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetClassificationExportConfigurationRequest, GetClassificationExportConfigurationResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCustomDataIdentifierResult> getCustomDataIdentifierAsync(GetCustomDataIdentifierRequest request) {

        return getCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomDataIdentifierResult> getCustomDataIdentifierAsync(GetCustomDataIdentifierRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCustomDataIdentifierRequest, GetCustomDataIdentifierResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFindingStatisticsResult> getFindingStatisticsAsync(GetFindingStatisticsRequest request) {

        return getFindingStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingStatisticsResult> getFindingStatisticsAsync(GetFindingStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFindingStatisticsRequest, GetFindingStatisticsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request) {

        return getFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFindingsFilterResult> getFindingsFilterAsync(GetFindingsFilterRequest request) {

        return getFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsFilterResult> getFindingsFilterAsync(GetFindingsFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFindingsFilterRequest, GetFindingsFilterResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest request) {

        return getInvitationsCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMacieSessionResult> getMacieSessionAsync(GetMacieSessionRequest request) {

        return getMacieSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMacieSessionResult> getMacieSessionAsync(GetMacieSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMacieSessionRequest, GetMacieSessionResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest request) {

        return getMasterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request) {

        return getMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest request) {

        return getUsageStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUsageStatisticsRequest, GetUsageStatisticsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUsageTotalsResult> getUsageTotalsAsync(GetUsageTotalsRequest request) {

        return getUsageTotalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageTotalsResult> getUsageTotalsAsync(GetUsageTotalsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUsageTotalsRequest, GetUsageTotalsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClassificationJobsResult> listClassificationJobsAsync(ListClassificationJobsRequest request) {

        return listClassificationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClassificationJobsResult> listClassificationJobsAsync(ListClassificationJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClassificationJobsRequest, ListClassificationJobsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCustomDataIdentifiersResult> listCustomDataIdentifiersAsync(ListCustomDataIdentifiersRequest request) {

        return listCustomDataIdentifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomDataIdentifiersResult> listCustomDataIdentifiersAsync(ListCustomDataIdentifiersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCustomDataIdentifiersRequest, ListCustomDataIdentifiersResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingsFiltersResult> listFindingsFiltersAsync(ListFindingsFiltersRequest request) {

        return listFindingsFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsFiltersResult> listFindingsFiltersAsync(ListFindingsFiltersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingsFiltersRequest, ListFindingsFiltersResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request) {

        return listInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request) {

        return listMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(ListOrganizationAdminAccountsRequest request) {

        return listOrganizationAdminAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(ListOrganizationAdminAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutClassificationExportConfigurationResult> putClassificationExportConfigurationAsync(
            PutClassificationExportConfigurationRequest request) {

        return putClassificationExportConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutClassificationExportConfigurationResult> putClassificationExportConfigurationAsync(
            PutClassificationExportConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutClassificationExportConfigurationRequest, PutClassificationExportConfigurationResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TestCustomDataIdentifierResult> testCustomDataIdentifierAsync(TestCustomDataIdentifierRequest request) {

        return testCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestCustomDataIdentifierResult> testCustomDataIdentifierAsync(TestCustomDataIdentifierRequest request,
            com.amazonaws.handlers.AsyncHandler<TestCustomDataIdentifierRequest, TestCustomDataIdentifierResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest request) {

        return unarchiveFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UnarchiveFindingsRequest, UnarchiveFindingsResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateClassificationJobResult> updateClassificationJobAsync(UpdateClassificationJobRequest request) {

        return updateClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClassificationJobResult> updateClassificationJobAsync(UpdateClassificationJobRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateClassificationJobRequest, UpdateClassificationJobResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsFilterResult> updateFindingsFilterAsync(UpdateFindingsFilterRequest request) {

        return updateFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsFilterResult> updateFindingsFilterAsync(UpdateFindingsFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsFilterRequest, UpdateFindingsFilterResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMacieSessionResult> updateMacieSessionAsync(UpdateMacieSessionRequest request) {

        return updateMacieSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMacieSessionResult> updateMacieSessionAsync(UpdateMacieSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMacieSessionRequest, UpdateMacieSessionResult> asyncHandler) {

        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateMemberSessionResult> updateMemberSessionAsync(UpdateMemberSessionRequest request) {

        return updateMemberSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMemberSessionResult> updateMemberSessionAsync(UpdateMemberSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateMemberSessionRequest, UpdateMemberSessionResult> asyncHandler) {

        throw new UnsupportedOperationException();
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

        throw new UnsupportedOperationException();
    }

}
