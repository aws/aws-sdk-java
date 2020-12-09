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
package com.amazonaws.services.auditmanager;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;

/**
 * Abstract implementation of {@code AWSAuditManagerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSAuditManagerAsync extends AbstractAWSAuditManager implements AWSAuditManagerAsync {

    protected AbstractAWSAuditManagerAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateAssessmentReportEvidenceFolderResult> associateAssessmentReportEvidenceFolderAsync(
            AssociateAssessmentReportEvidenceFolderRequest request) {

        return associateAssessmentReportEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateAssessmentReportEvidenceFolderResult> associateAssessmentReportEvidenceFolderAsync(
            AssociateAssessmentReportEvidenceFolderRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateAssessmentReportEvidenceFolderRequest, AssociateAssessmentReportEvidenceFolderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateAssessmentReportEvidenceResult> batchAssociateAssessmentReportEvidenceAsync(
            BatchAssociateAssessmentReportEvidenceRequest request) {

        return batchAssociateAssessmentReportEvidenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAssociateAssessmentReportEvidenceResult> batchAssociateAssessmentReportEvidenceAsync(
            BatchAssociateAssessmentReportEvidenceRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateAssessmentReportEvidenceRequest, BatchAssociateAssessmentReportEvidenceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchCreateDelegationByAssessmentResult> batchCreateDelegationByAssessmentAsync(
            BatchCreateDelegationByAssessmentRequest request) {

        return batchCreateDelegationByAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateDelegationByAssessmentResult> batchCreateDelegationByAssessmentAsync(
            BatchCreateDelegationByAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchCreateDelegationByAssessmentRequest, BatchCreateDelegationByAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDelegationByAssessmentResult> batchDeleteDelegationByAssessmentAsync(
            BatchDeleteDelegationByAssessmentRequest request) {

        return batchDeleteDelegationByAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteDelegationByAssessmentResult> batchDeleteDelegationByAssessmentAsync(
            BatchDeleteDelegationByAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteDelegationByAssessmentRequest, BatchDeleteDelegationByAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateAssessmentReportEvidenceResult> batchDisassociateAssessmentReportEvidenceAsync(
            BatchDisassociateAssessmentReportEvidenceRequest request) {

        return batchDisassociateAssessmentReportEvidenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisassociateAssessmentReportEvidenceResult> batchDisassociateAssessmentReportEvidenceAsync(
            BatchDisassociateAssessmentReportEvidenceRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateAssessmentReportEvidenceRequest, BatchDisassociateAssessmentReportEvidenceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchImportEvidenceToAssessmentControlResult> batchImportEvidenceToAssessmentControlAsync(
            BatchImportEvidenceToAssessmentControlRequest request) {

        return batchImportEvidenceToAssessmentControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchImportEvidenceToAssessmentControlResult> batchImportEvidenceToAssessmentControlAsync(
            BatchImportEvidenceToAssessmentControlRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchImportEvidenceToAssessmentControlRequest, BatchImportEvidenceToAssessmentControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(CreateAssessmentRequest request) {

        return createAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentResult> createAssessmentAsync(CreateAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentRequest, CreateAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentFrameworkResult> createAssessmentFrameworkAsync(CreateAssessmentFrameworkRequest request) {

        return createAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentFrameworkResult> createAssessmentFrameworkAsync(CreateAssessmentFrameworkRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentFrameworkRequest, CreateAssessmentFrameworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentReportResult> createAssessmentReportAsync(CreateAssessmentReportRequest request) {

        return createAssessmentReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentReportResult> createAssessmentReportAsync(CreateAssessmentReportRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentReportRequest, CreateAssessmentReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateControlResult> createControlAsync(CreateControlRequest request) {

        return createControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateControlResult> createControlAsync(CreateControlRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateControlRequest, CreateControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(DeleteAssessmentRequest request) {

        return deleteAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentResult> deleteAssessmentAsync(DeleteAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRequest, DeleteAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentFrameworkResult> deleteAssessmentFrameworkAsync(DeleteAssessmentFrameworkRequest request) {

        return deleteAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentFrameworkResult> deleteAssessmentFrameworkAsync(DeleteAssessmentFrameworkRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentFrameworkRequest, DeleteAssessmentFrameworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentReportResult> deleteAssessmentReportAsync(DeleteAssessmentReportRequest request) {

        return deleteAssessmentReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAssessmentReportResult> deleteAssessmentReportAsync(DeleteAssessmentReportRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentReportRequest, DeleteAssessmentReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteControlResult> deleteControlAsync(DeleteControlRequest request) {

        return deleteControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteControlResult> deleteControlAsync(DeleteControlRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteControlRequest, DeleteControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterAccountResult> deregisterAccountAsync(DeregisterAccountRequest request) {

        return deregisterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterAccountResult> deregisterAccountAsync(DeregisterAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterAccountRequest, DeregisterAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterOrganizationAdminAccountResult> deregisterOrganizationAdminAccountAsync(
            DeregisterOrganizationAdminAccountRequest request) {

        return deregisterOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterOrganizationAdminAccountResult> deregisterOrganizationAdminAccountAsync(
            DeregisterOrganizationAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterOrganizationAdminAccountRequest, DeregisterOrganizationAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateAssessmentReportEvidenceFolderResult> disassociateAssessmentReportEvidenceFolderAsync(
            DisassociateAssessmentReportEvidenceFolderRequest request) {

        return disassociateAssessmentReportEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateAssessmentReportEvidenceFolderResult> disassociateAssessmentReportEvidenceFolderAsync(
            DisassociateAssessmentReportEvidenceFolderRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateAssessmentReportEvidenceFolderRequest, DisassociateAssessmentReportEvidenceFolderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountStatusResult> getAccountStatusAsync(GetAccountStatusRequest request) {

        return getAccountStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountStatusResult> getAccountStatusAsync(GetAccountStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountStatusRequest, GetAccountStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest request) {

        return getAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentResult> getAssessmentAsync(GetAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentRequest, GetAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentFrameworkResult> getAssessmentFrameworkAsync(GetAssessmentFrameworkRequest request) {

        return getAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentFrameworkResult> getAssessmentFrameworkAsync(GetAssessmentFrameworkRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentFrameworkRequest, GetAssessmentFrameworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentReportUrlResult> getAssessmentReportUrlAsync(GetAssessmentReportUrlRequest request) {

        return getAssessmentReportUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssessmentReportUrlResult> getAssessmentReportUrlAsync(GetAssessmentReportUrlRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssessmentReportUrlRequest, GetAssessmentReportUrlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetChangeLogsResult> getChangeLogsAsync(GetChangeLogsRequest request) {

        return getChangeLogsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeLogsResult> getChangeLogsAsync(GetChangeLogsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetChangeLogsRequest, GetChangeLogsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetControlResult> getControlAsync(GetControlRequest request) {

        return getControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetControlResult> getControlAsync(GetControlRequest request,
            com.amazonaws.handlers.AsyncHandler<GetControlRequest, GetControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDelegationsResult> getDelegationsAsync(GetDelegationsRequest request) {

        return getDelegationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDelegationsResult> getDelegationsAsync(GetDelegationsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDelegationsRequest, GetDelegationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceResult> getEvidenceAsync(GetEvidenceRequest request) {

        return getEvidenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceResult> getEvidenceAsync(GetEvidenceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceRequest, GetEvidenceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceByEvidenceFolderResult> getEvidenceByEvidenceFolderAsync(GetEvidenceByEvidenceFolderRequest request) {

        return getEvidenceByEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceByEvidenceFolderResult> getEvidenceByEvidenceFolderAsync(GetEvidenceByEvidenceFolderRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceByEvidenceFolderRequest, GetEvidenceByEvidenceFolderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFolderResult> getEvidenceFolderAsync(GetEvidenceFolderRequest request) {

        return getEvidenceFolderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFolderResult> getEvidenceFolderAsync(GetEvidenceFolderRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceFolderRequest, GetEvidenceFolderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentResult> getEvidenceFoldersByAssessmentAsync(GetEvidenceFoldersByAssessmentRequest request) {

        return getEvidenceFoldersByAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentResult> getEvidenceFoldersByAssessmentAsync(GetEvidenceFoldersByAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceFoldersByAssessmentRequest, GetEvidenceFoldersByAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentControlResult> getEvidenceFoldersByAssessmentControlAsync(
            GetEvidenceFoldersByAssessmentControlRequest request) {

        return getEvidenceFoldersByAssessmentControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEvidenceFoldersByAssessmentControlResult> getEvidenceFoldersByAssessmentControlAsync(
            GetEvidenceFoldersByAssessmentControlRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEvidenceFoldersByAssessmentControlRequest, GetEvidenceFoldersByAssessmentControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationAdminAccountResult> getOrganizationAdminAccountAsync(GetOrganizationAdminAccountRequest request) {

        return getOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOrganizationAdminAccountResult> getOrganizationAdminAccountAsync(GetOrganizationAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOrganizationAdminAccountRequest, GetOrganizationAdminAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServicesInScopeResult> getServicesInScopeAsync(GetServicesInScopeRequest request) {

        return getServicesInScopeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServicesInScopeResult> getServicesInScopeAsync(GetServicesInScopeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServicesInScopeRequest, GetServicesInScopeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSettingsResult> getSettingsAsync(GetSettingsRequest request) {

        return getSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSettingsResult> getSettingsAsync(GetSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSettingsRequest, GetSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentFrameworksResult> listAssessmentFrameworksAsync(ListAssessmentFrameworksRequest request) {

        return listAssessmentFrameworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentFrameworksResult> listAssessmentFrameworksAsync(ListAssessmentFrameworksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentFrameworksRequest, ListAssessmentFrameworksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentReportsResult> listAssessmentReportsAsync(ListAssessmentReportsRequest request) {

        return listAssessmentReportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentReportsResult> listAssessmentReportsAsync(ListAssessmentReportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentReportsRequest, ListAssessmentReportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(ListAssessmentsRequest request) {

        return listAssessmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentsResult> listAssessmentsAsync(ListAssessmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentsRequest, ListAssessmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListControlsResult> listControlsAsync(ListControlsRequest request) {

        return listControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListControlsResult> listControlsAsync(ListControlsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListControlsRequest, ListControlsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeywordsForDataSourceResult> listKeywordsForDataSourceAsync(ListKeywordsForDataSourceRequest request) {

        return listKeywordsForDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeywordsForDataSourceResult> listKeywordsForDataSourceAsync(ListKeywordsForDataSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeywordsForDataSourceRequest, ListKeywordsForDataSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest request) {

        return listNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler) {

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
    public java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest request) {

        return registerAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAccountResult> registerAccountAsync(RegisterAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterAccountRequest, RegisterAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterOrganizationAdminAccountResult> registerOrganizationAdminAccountAsync(
            RegisterOrganizationAdminAccountRequest request) {

        return registerOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterOrganizationAdminAccountResult> registerOrganizationAdminAccountAsync(
            RegisterOrganizationAdminAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterOrganizationAdminAccountRequest, RegisterOrganizationAdminAccountResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(UpdateAssessmentRequest request) {

        return updateAssessmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentResult> updateAssessmentAsync(UpdateAssessmentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentRequest, UpdateAssessmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlResult> updateAssessmentControlAsync(UpdateAssessmentControlRequest request) {

        return updateAssessmentControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlResult> updateAssessmentControlAsync(UpdateAssessmentControlRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentControlRequest, UpdateAssessmentControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlSetStatusResult> updateAssessmentControlSetStatusAsync(
            UpdateAssessmentControlSetStatusRequest request) {

        return updateAssessmentControlSetStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentControlSetStatusResult> updateAssessmentControlSetStatusAsync(
            UpdateAssessmentControlSetStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentControlSetStatusRequest, UpdateAssessmentControlSetStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentFrameworkResult> updateAssessmentFrameworkAsync(UpdateAssessmentFrameworkRequest request) {

        return updateAssessmentFrameworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentFrameworkResult> updateAssessmentFrameworkAsync(UpdateAssessmentFrameworkRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentFrameworkRequest, UpdateAssessmentFrameworkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentStatusResult> updateAssessmentStatusAsync(UpdateAssessmentStatusRequest request) {

        return updateAssessmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAssessmentStatusResult> updateAssessmentStatusAsync(UpdateAssessmentStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentStatusRequest, UpdateAssessmentStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateControlResult> updateControlAsync(UpdateControlRequest request) {

        return updateControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateControlResult> updateControlAsync(UpdateControlRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateControlRequest, UpdateControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSettingsResult> updateSettingsAsync(UpdateSettingsRequest request) {

        return updateSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSettingsResult> updateSettingsAsync(UpdateSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSettingsRequest, UpdateSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ValidateAssessmentReportIntegrityResult> validateAssessmentReportIntegrityAsync(
            ValidateAssessmentReportIntegrityRequest request) {

        return validateAssessmentReportIntegrityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateAssessmentReportIntegrityResult> validateAssessmentReportIntegrityAsync(
            ValidateAssessmentReportIntegrityRequest request,
            com.amazonaws.handlers.AsyncHandler<ValidateAssessmentReportIntegrityRequest, ValidateAssessmentReportIntegrityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
