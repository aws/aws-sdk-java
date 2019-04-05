/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk;

import javax.annotation.Generated;

import com.amazonaws.services.mturk.model.*;

/**
 * Abstract implementation of {@code AmazonMTurkAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMTurkAsync extends AbstractAmazonMTurk implements AmazonMTurkAsync {

    protected AbstractAmazonMTurkAsync() {
    }

    @Override
    public java.util.concurrent.Future<AcceptQualificationRequestResult> acceptQualificationRequestAsync(AcceptQualificationRequestRequest request) {

        return acceptQualificationRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptQualificationRequestResult> acceptQualificationRequestAsync(AcceptQualificationRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<AcceptQualificationRequestRequest, AcceptQualificationRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ApproveAssignmentResult> approveAssignmentAsync(ApproveAssignmentRequest request) {

        return approveAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ApproveAssignmentResult> approveAssignmentAsync(ApproveAssignmentRequest request,
            com.amazonaws.handlers.AsyncHandler<ApproveAssignmentRequest, ApproveAssignmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AssociateQualificationWithWorkerResult> associateQualificationWithWorkerAsync(
            AssociateQualificationWithWorkerRequest request) {

        return associateQualificationWithWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateQualificationWithWorkerResult> associateQualificationWithWorkerAsync(
            AssociateQualificationWithWorkerRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateQualificationWithWorkerRequest, AssociateQualificationWithWorkerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAdditionalAssignmentsForHITResult> createAdditionalAssignmentsForHITAsync(
            CreateAdditionalAssignmentsForHITRequest request) {

        return createAdditionalAssignmentsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAdditionalAssignmentsForHITResult> createAdditionalAssignmentsForHITAsync(
            CreateAdditionalAssignmentsForHITRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAdditionalAssignmentsForHITRequest, CreateAdditionalAssignmentsForHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateHITResult> createHITAsync(CreateHITRequest request) {

        return createHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITResult> createHITAsync(CreateHITRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHITRequest, CreateHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateHITTypeResult> createHITTypeAsync(CreateHITTypeRequest request) {

        return createHITTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITTypeResult> createHITTypeAsync(CreateHITTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHITTypeRequest, CreateHITTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateHITWithHITTypeResult> createHITWithHITTypeAsync(CreateHITWithHITTypeRequest request) {

        return createHITWithHITTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHITWithHITTypeResult> createHITWithHITTypeAsync(CreateHITWithHITTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHITWithHITTypeRequest, CreateHITWithHITTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateQualificationTypeResult> createQualificationTypeAsync(CreateQualificationTypeRequest request) {

        return createQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQualificationTypeResult> createQualificationTypeAsync(CreateQualificationTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateQualificationTypeRequest, CreateQualificationTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerBlockResult> createWorkerBlockAsync(CreateWorkerBlockRequest request) {

        return createWorkerBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerBlockResult> createWorkerBlockAsync(CreateWorkerBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWorkerBlockRequest, CreateWorkerBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHITResult> deleteHITAsync(DeleteHITRequest request) {

        return deleteHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHITResult> deleteHITAsync(DeleteHITRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHITRequest, DeleteHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteQualificationTypeResult> deleteQualificationTypeAsync(DeleteQualificationTypeRequest request) {

        return deleteQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQualificationTypeResult> deleteQualificationTypeAsync(DeleteQualificationTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteQualificationTypeRequest, DeleteQualificationTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerBlockResult> deleteWorkerBlockAsync(DeleteWorkerBlockRequest request) {

        return deleteWorkerBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerBlockResult> deleteWorkerBlockAsync(DeleteWorkerBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkerBlockRequest, DeleteWorkerBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateQualificationFromWorkerResult> disassociateQualificationFromWorkerAsync(
            DisassociateQualificationFromWorkerRequest request) {

        return disassociateQualificationFromWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateQualificationFromWorkerResult> disassociateQualificationFromWorkerAsync(
            DisassociateQualificationFromWorkerRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateQualificationFromWorkerRequest, DisassociateQualificationFromWorkerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountBalanceResult> getAccountBalanceAsync(GetAccountBalanceRequest request) {

        return getAccountBalanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountBalanceResult> getAccountBalanceAsync(GetAccountBalanceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountBalanceRequest, GetAccountBalanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAssignmentResult> getAssignmentAsync(GetAssignmentRequest request) {

        return getAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAssignmentResult> getAssignmentAsync(GetAssignmentRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAssignmentRequest, GetAssignmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetFileUploadURLResult> getFileUploadURLAsync(GetFileUploadURLRequest request) {

        return getFileUploadURLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFileUploadURLResult> getFileUploadURLAsync(GetFileUploadURLRequest request,
            com.amazonaws.handlers.AsyncHandler<GetFileUploadURLRequest, GetFileUploadURLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHITResult> getHITAsync(GetHITRequest request) {

        return getHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHITResult> getHITAsync(GetHITRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHITRequest, GetHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQualificationScoreResult> getQualificationScoreAsync(GetQualificationScoreRequest request) {

        return getQualificationScoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQualificationScoreResult> getQualificationScoreAsync(GetQualificationScoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQualificationScoreRequest, GetQualificationScoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQualificationTypeResult> getQualificationTypeAsync(GetQualificationTypeRequest request) {

        return getQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQualificationTypeResult> getQualificationTypeAsync(GetQualificationTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQualificationTypeRequest, GetQualificationTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssignmentsForHITResult> listAssignmentsForHITAsync(ListAssignmentsForHITRequest request) {

        return listAssignmentsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssignmentsForHITResult> listAssignmentsForHITAsync(ListAssignmentsForHITRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssignmentsForHITRequest, ListAssignmentsForHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBonusPaymentsResult> listBonusPaymentsAsync(ListBonusPaymentsRequest request) {

        return listBonusPaymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBonusPaymentsResult> listBonusPaymentsAsync(ListBonusPaymentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBonusPaymentsRequest, ListBonusPaymentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListHITsResult> listHITsAsync(ListHITsRequest request) {

        return listHITsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHITsResult> listHITsAsync(ListHITsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHITsRequest, ListHITsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListHITsForQualificationTypeResult> listHITsForQualificationTypeAsync(ListHITsForQualificationTypeRequest request) {

        return listHITsForQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHITsForQualificationTypeResult> listHITsForQualificationTypeAsync(ListHITsForQualificationTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHITsForQualificationTypeRequest, ListHITsForQualificationTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListQualificationRequestsResult> listQualificationRequestsAsync(ListQualificationRequestsRequest request) {

        return listQualificationRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQualificationRequestsResult> listQualificationRequestsAsync(ListQualificationRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListQualificationRequestsRequest, ListQualificationRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListQualificationTypesResult> listQualificationTypesAsync(ListQualificationTypesRequest request) {

        return listQualificationTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQualificationTypesResult> listQualificationTypesAsync(ListQualificationTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListQualificationTypesRequest, ListQualificationTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReviewPolicyResultsForHITResult> listReviewPolicyResultsForHITAsync(ListReviewPolicyResultsForHITRequest request) {

        return listReviewPolicyResultsForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewPolicyResultsForHITResult> listReviewPolicyResultsForHITAsync(ListReviewPolicyResultsForHITRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReviewPolicyResultsForHITRequest, ListReviewPolicyResultsForHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReviewableHITsResult> listReviewableHITsAsync(ListReviewableHITsRequest request) {

        return listReviewableHITsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewableHITsResult> listReviewableHITsAsync(ListReviewableHITsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReviewableHITsRequest, ListReviewableHITsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkerBlocksResult> listWorkerBlocksAsync(ListWorkerBlocksRequest request) {

        return listWorkerBlocksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkerBlocksResult> listWorkerBlocksAsync(ListWorkerBlocksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkerBlocksRequest, ListWorkerBlocksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWorkersWithQualificationTypeResult> listWorkersWithQualificationTypeAsync(
            ListWorkersWithQualificationTypeRequest request) {

        return listWorkersWithQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkersWithQualificationTypeResult> listWorkersWithQualificationTypeAsync(
            ListWorkersWithQualificationTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWorkersWithQualificationTypeRequest, ListWorkersWithQualificationTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<NotifyWorkersResult> notifyWorkersAsync(NotifyWorkersRequest request) {

        return notifyWorkersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<NotifyWorkersResult> notifyWorkersAsync(NotifyWorkersRequest request,
            com.amazonaws.handlers.AsyncHandler<NotifyWorkersRequest, NotifyWorkersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectAssignmentResult> rejectAssignmentAsync(RejectAssignmentRequest request) {

        return rejectAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectAssignmentResult> rejectAssignmentAsync(RejectAssignmentRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectAssignmentRequest, RejectAssignmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RejectQualificationRequestResult> rejectQualificationRequestAsync(RejectQualificationRequestRequest request) {

        return rejectQualificationRequestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectQualificationRequestResult> rejectQualificationRequestAsync(RejectQualificationRequestRequest request,
            com.amazonaws.handlers.AsyncHandler<RejectQualificationRequestRequest, RejectQualificationRequestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendBonusResult> sendBonusAsync(SendBonusRequest request) {

        return sendBonusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBonusResult> sendBonusAsync(SendBonusRequest request,
            com.amazonaws.handlers.AsyncHandler<SendBonusRequest, SendBonusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendTestEventNotificationResult> sendTestEventNotificationAsync(SendTestEventNotificationRequest request) {

        return sendTestEventNotificationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendTestEventNotificationResult> sendTestEventNotificationAsync(SendTestEventNotificationRequest request,
            com.amazonaws.handlers.AsyncHandler<SendTestEventNotificationRequest, SendTestEventNotificationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateExpirationForHITResult> updateExpirationForHITAsync(UpdateExpirationForHITRequest request) {

        return updateExpirationForHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateExpirationForHITResult> updateExpirationForHITAsync(UpdateExpirationForHITRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateExpirationForHITRequest, UpdateExpirationForHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateHITReviewStatusResult> updateHITReviewStatusAsync(UpdateHITReviewStatusRequest request) {

        return updateHITReviewStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHITReviewStatusResult> updateHITReviewStatusAsync(UpdateHITReviewStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateHITReviewStatusRequest, UpdateHITReviewStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateHITTypeOfHITResult> updateHITTypeOfHITAsync(UpdateHITTypeOfHITRequest request) {

        return updateHITTypeOfHITAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHITTypeOfHITResult> updateHITTypeOfHITAsync(UpdateHITTypeOfHITRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateHITTypeOfHITRequest, UpdateHITTypeOfHITResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationSettingsResult> updateNotificationSettingsAsync(UpdateNotificationSettingsRequest request) {

        return updateNotificationSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationSettingsResult> updateNotificationSettingsAsync(UpdateNotificationSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateNotificationSettingsRequest, UpdateNotificationSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateQualificationTypeResult> updateQualificationTypeAsync(UpdateQualificationTypeRequest request) {

        return updateQualificationTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQualificationTypeResult> updateQualificationTypeAsync(UpdateQualificationTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateQualificationTypeRequest, UpdateQualificationTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
