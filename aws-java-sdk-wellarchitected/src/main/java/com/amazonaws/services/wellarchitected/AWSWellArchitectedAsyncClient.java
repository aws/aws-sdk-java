/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Well-Architected asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Well-Architected Tool</fullname>
 * <p>
 * This is the <i>Well-Architected Tool API Reference</i>. The WA Tool API provides programmatic access to the <a
 * href="http://aws.amazon.com/well-architected-tool">Well-Architected Tool</a> in the <a
 * href="https://console.aws.amazon.com/wellarchitected">Amazon Web Services Management Console</a>. For information
 * about the Well-Architected Tool, see the <a
 * href="https://docs.aws.amazon.com/wellarchitected/latest/userguide/intro.html">Well-Architected Tool User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSWellArchitectedAsyncClient extends AWSWellArchitectedClient implements AWSWellArchitectedAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSWellArchitectedAsyncClientBuilder asyncBuilder() {
        return AWSWellArchitectedAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Well-Architected using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSWellArchitectedAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Well-Architected using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSWellArchitectedAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateLensesResult> associateLensesAsync(AssociateLensesRequest request) {

        return associateLensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLensesResult> associateLensesAsync(final AssociateLensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLensesRequest, AssociateLensesResult> asyncHandler) {
        final AssociateLensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLensesResult>() {
            @Override
            public AssociateLensesResult call() throws Exception {
                AssociateLensesResult result = null;

                try {
                    result = executeAssociateLenses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateProfilesResult> associateProfilesAsync(AssociateProfilesRequest request) {

        return associateProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateProfilesResult> associateProfilesAsync(final AssociateProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateProfilesRequest, AssociateProfilesResult> asyncHandler) {
        final AssociateProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateProfilesResult>() {
            @Override
            public AssociateProfilesResult call() throws Exception {
                AssociateProfilesResult result = null;

                try {
                    result = executeAssociateProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLensShareResult> createLensShareAsync(CreateLensShareRequest request) {

        return createLensShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLensShareResult> createLensShareAsync(final CreateLensShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLensShareRequest, CreateLensShareResult> asyncHandler) {
        final CreateLensShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLensShareResult>() {
            @Override
            public CreateLensShareResult call() throws Exception {
                CreateLensShareResult result = null;

                try {
                    result = executeCreateLensShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLensVersionResult> createLensVersionAsync(CreateLensVersionRequest request) {

        return createLensVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLensVersionResult> createLensVersionAsync(final CreateLensVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLensVersionRequest, CreateLensVersionResult> asyncHandler) {
        final CreateLensVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLensVersionResult>() {
            @Override
            public CreateLensVersionResult call() throws Exception {
                CreateLensVersionResult result = null;

                try {
                    result = executeCreateLensVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMilestoneResult> createMilestoneAsync(CreateMilestoneRequest request) {

        return createMilestoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMilestoneResult> createMilestoneAsync(final CreateMilestoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMilestoneRequest, CreateMilestoneResult> asyncHandler) {
        final CreateMilestoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMilestoneResult>() {
            @Override
            public CreateMilestoneResult call() throws Exception {
                CreateMilestoneResult result = null;

                try {
                    result = executeCreateMilestone(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(CreateProfileRequest request) {

        return createProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileResult> createProfileAsync(final CreateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfileRequest, CreateProfileResult> asyncHandler) {
        final CreateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfileResult>() {
            @Override
            public CreateProfileResult call() throws Exception {
                CreateProfileResult result = null;

                try {
                    result = executeCreateProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateProfileShareResult> createProfileShareAsync(CreateProfileShareRequest request) {

        return createProfileShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateProfileShareResult> createProfileShareAsync(final CreateProfileShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateProfileShareRequest, CreateProfileShareResult> asyncHandler) {
        final CreateProfileShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateProfileShareResult>() {
            @Override
            public CreateProfileShareResult call() throws Exception {
                CreateProfileShareResult result = null;

                try {
                    result = executeCreateProfileShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateReviewTemplateResult> createReviewTemplateAsync(CreateReviewTemplateRequest request) {

        return createReviewTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReviewTemplateResult> createReviewTemplateAsync(final CreateReviewTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReviewTemplateRequest, CreateReviewTemplateResult> asyncHandler) {
        final CreateReviewTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReviewTemplateResult>() {
            @Override
            public CreateReviewTemplateResult call() throws Exception {
                CreateReviewTemplateResult result = null;

                try {
                    result = executeCreateReviewTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateShareResult> createTemplateShareAsync(CreateTemplateShareRequest request) {

        return createTemplateShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateShareResult> createTemplateShareAsync(final CreateTemplateShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTemplateShareRequest, CreateTemplateShareResult> asyncHandler) {
        final CreateTemplateShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTemplateShareResult>() {
            @Override
            public CreateTemplateShareResult call() throws Exception {
                CreateTemplateShareResult result = null;

                try {
                    result = executeCreateTemplateShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkloadResult> createWorkloadAsync(CreateWorkloadRequest request) {

        return createWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkloadResult> createWorkloadAsync(final CreateWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkloadRequest, CreateWorkloadResult> asyncHandler) {
        final CreateWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkloadResult>() {
            @Override
            public CreateWorkloadResult call() throws Exception {
                CreateWorkloadResult result = null;

                try {
                    result = executeCreateWorkload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkloadShareResult> createWorkloadShareAsync(CreateWorkloadShareRequest request) {

        return createWorkloadShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkloadShareResult> createWorkloadShareAsync(final CreateWorkloadShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkloadShareRequest, CreateWorkloadShareResult> asyncHandler) {
        final CreateWorkloadShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkloadShareResult>() {
            @Override
            public CreateWorkloadShareResult call() throws Exception {
                CreateWorkloadShareResult result = null;

                try {
                    result = executeCreateWorkloadShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLensResult> deleteLensAsync(DeleteLensRequest request) {

        return deleteLensAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLensResult> deleteLensAsync(final DeleteLensRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLensRequest, DeleteLensResult> asyncHandler) {
        final DeleteLensRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLensResult>() {
            @Override
            public DeleteLensResult call() throws Exception {
                DeleteLensResult result = null;

                try {
                    result = executeDeleteLens(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLensShareResult> deleteLensShareAsync(DeleteLensShareRequest request) {

        return deleteLensShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLensShareResult> deleteLensShareAsync(final DeleteLensShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLensShareRequest, DeleteLensShareResult> asyncHandler) {
        final DeleteLensShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLensShareResult>() {
            @Override
            public DeleteLensShareResult call() throws Exception {
                DeleteLensShareResult result = null;

                try {
                    result = executeDeleteLensShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(DeleteProfileRequest request) {

        return deleteProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileResult> deleteProfileAsync(final DeleteProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileRequest, DeleteProfileResult> asyncHandler) {
        final DeleteProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileResult>() {
            @Override
            public DeleteProfileResult call() throws Exception {
                DeleteProfileResult result = null;

                try {
                    result = executeDeleteProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileShareResult> deleteProfileShareAsync(DeleteProfileShareRequest request) {

        return deleteProfileShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteProfileShareResult> deleteProfileShareAsync(final DeleteProfileShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteProfileShareRequest, DeleteProfileShareResult> asyncHandler) {
        final DeleteProfileShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteProfileShareResult>() {
            @Override
            public DeleteProfileShareResult call() throws Exception {
                DeleteProfileShareResult result = null;

                try {
                    result = executeDeleteProfileShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteReviewTemplateResult> deleteReviewTemplateAsync(DeleteReviewTemplateRequest request) {

        return deleteReviewTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReviewTemplateResult> deleteReviewTemplateAsync(final DeleteReviewTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReviewTemplateRequest, DeleteReviewTemplateResult> asyncHandler) {
        final DeleteReviewTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReviewTemplateResult>() {
            @Override
            public DeleteReviewTemplateResult call() throws Exception {
                DeleteReviewTemplateResult result = null;

                try {
                    result = executeDeleteReviewTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateShareResult> deleteTemplateShareAsync(DeleteTemplateShareRequest request) {

        return deleteTemplateShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateShareResult> deleteTemplateShareAsync(final DeleteTemplateShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTemplateShareRequest, DeleteTemplateShareResult> asyncHandler) {
        final DeleteTemplateShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTemplateShareResult>() {
            @Override
            public DeleteTemplateShareResult call() throws Exception {
                DeleteTemplateShareResult result = null;

                try {
                    result = executeDeleteTemplateShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkloadResult> deleteWorkloadAsync(DeleteWorkloadRequest request) {

        return deleteWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkloadResult> deleteWorkloadAsync(final DeleteWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkloadRequest, DeleteWorkloadResult> asyncHandler) {
        final DeleteWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkloadResult>() {
            @Override
            public DeleteWorkloadResult call() throws Exception {
                DeleteWorkloadResult result = null;

                try {
                    result = executeDeleteWorkload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkloadShareResult> deleteWorkloadShareAsync(DeleteWorkloadShareRequest request) {

        return deleteWorkloadShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkloadShareResult> deleteWorkloadShareAsync(final DeleteWorkloadShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkloadShareRequest, DeleteWorkloadShareResult> asyncHandler) {
        final DeleteWorkloadShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkloadShareResult>() {
            @Override
            public DeleteWorkloadShareResult call() throws Exception {
                DeleteWorkloadShareResult result = null;

                try {
                    result = executeDeleteWorkloadShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateLensesResult> disassociateLensesAsync(DisassociateLensesRequest request) {

        return disassociateLensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLensesResult> disassociateLensesAsync(final DisassociateLensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLensesRequest, DisassociateLensesResult> asyncHandler) {
        final DisassociateLensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLensesResult>() {
            @Override
            public DisassociateLensesResult call() throws Exception {
                DisassociateLensesResult result = null;

                try {
                    result = executeDisassociateLenses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateProfilesResult> disassociateProfilesAsync(DisassociateProfilesRequest request) {

        return disassociateProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateProfilesResult> disassociateProfilesAsync(final DisassociateProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateProfilesRequest, DisassociateProfilesResult> asyncHandler) {
        final DisassociateProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateProfilesResult>() {
            @Override
            public DisassociateProfilesResult call() throws Exception {
                DisassociateProfilesResult result = null;

                try {
                    result = executeDisassociateProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExportLensResult> exportLensAsync(ExportLensRequest request) {

        return exportLensAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportLensResult> exportLensAsync(final ExportLensRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportLensRequest, ExportLensResult> asyncHandler) {
        final ExportLensRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportLensResult>() {
            @Override
            public ExportLensResult call() throws Exception {
                ExportLensResult result = null;

                try {
                    result = executeExportLens(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAnswerResult> getAnswerAsync(GetAnswerRequest request) {

        return getAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAnswerResult> getAnswerAsync(final GetAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAnswerRequest, GetAnswerResult> asyncHandler) {
        final GetAnswerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAnswerResult>() {
            @Override
            public GetAnswerResult call() throws Exception {
                GetAnswerResult result = null;

                try {
                    result = executeGetAnswer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConsolidatedReportResult> getConsolidatedReportAsync(GetConsolidatedReportRequest request) {

        return getConsolidatedReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConsolidatedReportResult> getConsolidatedReportAsync(final GetConsolidatedReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConsolidatedReportRequest, GetConsolidatedReportResult> asyncHandler) {
        final GetConsolidatedReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConsolidatedReportResult>() {
            @Override
            public GetConsolidatedReportResult call() throws Exception {
                GetConsolidatedReportResult result = null;

                try {
                    result = executeGetConsolidatedReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest request) {

        return getGlobalSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(final GetGlobalSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGlobalSettingsRequest, GetGlobalSettingsResult> asyncHandler) {
        final GetGlobalSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGlobalSettingsResult>() {
            @Override
            public GetGlobalSettingsResult call() throws Exception {
                GetGlobalSettingsResult result = null;

                try {
                    result = executeGetGlobalSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLensResult> getLensAsync(GetLensRequest request) {

        return getLensAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLensResult> getLensAsync(final GetLensRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLensRequest, GetLensResult> asyncHandler) {
        final GetLensRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLensResult>() {
            @Override
            public GetLensResult call() throws Exception {
                GetLensResult result = null;

                try {
                    result = executeGetLens(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLensReviewResult> getLensReviewAsync(GetLensReviewRequest request) {

        return getLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLensReviewResult> getLensReviewAsync(final GetLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLensReviewRequest, GetLensReviewResult> asyncHandler) {
        final GetLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLensReviewResult>() {
            @Override
            public GetLensReviewResult call() throws Exception {
                GetLensReviewResult result = null;

                try {
                    result = executeGetLensReview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLensReviewReportResult> getLensReviewReportAsync(GetLensReviewReportRequest request) {

        return getLensReviewReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLensReviewReportResult> getLensReviewReportAsync(final GetLensReviewReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLensReviewReportRequest, GetLensReviewReportResult> asyncHandler) {
        final GetLensReviewReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLensReviewReportResult>() {
            @Override
            public GetLensReviewReportResult call() throws Exception {
                GetLensReviewReportResult result = null;

                try {
                    result = executeGetLensReviewReport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLensVersionDifferenceResult> getLensVersionDifferenceAsync(GetLensVersionDifferenceRequest request) {

        return getLensVersionDifferenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLensVersionDifferenceResult> getLensVersionDifferenceAsync(final GetLensVersionDifferenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLensVersionDifferenceRequest, GetLensVersionDifferenceResult> asyncHandler) {
        final GetLensVersionDifferenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLensVersionDifferenceResult>() {
            @Override
            public GetLensVersionDifferenceResult call() throws Exception {
                GetLensVersionDifferenceResult result = null;

                try {
                    result = executeGetLensVersionDifference(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMilestoneResult> getMilestoneAsync(GetMilestoneRequest request) {

        return getMilestoneAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMilestoneResult> getMilestoneAsync(final GetMilestoneRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMilestoneRequest, GetMilestoneResult> asyncHandler) {
        final GetMilestoneRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMilestoneResult>() {
            @Override
            public GetMilestoneResult call() throws Exception {
                GetMilestoneResult result = null;

                try {
                    result = executeGetMilestone(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(GetProfileRequest request) {

        return getProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileResult> getProfileAsync(final GetProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileRequest, GetProfileResult> asyncHandler) {
        final GetProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileResult>() {
            @Override
            public GetProfileResult call() throws Exception {
                GetProfileResult result = null;

                try {
                    result = executeGetProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetProfileTemplateResult> getProfileTemplateAsync(GetProfileTemplateRequest request) {

        return getProfileTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProfileTemplateResult> getProfileTemplateAsync(final GetProfileTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetProfileTemplateRequest, GetProfileTemplateResult> asyncHandler) {
        final GetProfileTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetProfileTemplateResult>() {
            @Override
            public GetProfileTemplateResult call() throws Exception {
                GetProfileTemplateResult result = null;

                try {
                    result = executeGetProfileTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetReviewTemplateResult> getReviewTemplateAsync(GetReviewTemplateRequest request) {

        return getReviewTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReviewTemplateResult> getReviewTemplateAsync(final GetReviewTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReviewTemplateRequest, GetReviewTemplateResult> asyncHandler) {
        final GetReviewTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReviewTemplateResult>() {
            @Override
            public GetReviewTemplateResult call() throws Exception {
                GetReviewTemplateResult result = null;

                try {
                    result = executeGetReviewTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetReviewTemplateAnswerResult> getReviewTemplateAnswerAsync(GetReviewTemplateAnswerRequest request) {

        return getReviewTemplateAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReviewTemplateAnswerResult> getReviewTemplateAnswerAsync(final GetReviewTemplateAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReviewTemplateAnswerRequest, GetReviewTemplateAnswerResult> asyncHandler) {
        final GetReviewTemplateAnswerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReviewTemplateAnswerResult>() {
            @Override
            public GetReviewTemplateAnswerResult call() throws Exception {
                GetReviewTemplateAnswerResult result = null;

                try {
                    result = executeGetReviewTemplateAnswer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetReviewTemplateLensReviewResult> getReviewTemplateLensReviewAsync(GetReviewTemplateLensReviewRequest request) {

        return getReviewTemplateLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReviewTemplateLensReviewResult> getReviewTemplateLensReviewAsync(final GetReviewTemplateLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReviewTemplateLensReviewRequest, GetReviewTemplateLensReviewResult> asyncHandler) {
        final GetReviewTemplateLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReviewTemplateLensReviewResult>() {
            @Override
            public GetReviewTemplateLensReviewResult call() throws Exception {
                GetReviewTemplateLensReviewResult result = null;

                try {
                    result = executeGetReviewTemplateLensReview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(GetWorkloadRequest request) {

        return getWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkloadResult> getWorkloadAsync(final GetWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkloadRequest, GetWorkloadResult> asyncHandler) {
        final GetWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkloadResult>() {
            @Override
            public GetWorkloadResult call() throws Exception {
                GetWorkloadResult result = null;

                try {
                    result = executeGetWorkload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportLensResult> importLensAsync(ImportLensRequest request) {

        return importLensAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportLensResult> importLensAsync(final ImportLensRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportLensRequest, ImportLensResult> asyncHandler) {
        final ImportLensRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportLensResult>() {
            @Override
            public ImportLensResult call() throws Exception {
                ImportLensResult result = null;

                try {
                    result = executeImportLens(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAnswersResult> listAnswersAsync(ListAnswersRequest request) {

        return listAnswersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnswersResult> listAnswersAsync(final ListAnswersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnswersRequest, ListAnswersResult> asyncHandler) {
        final ListAnswersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnswersResult>() {
            @Override
            public ListAnswersResult call() throws Exception {
                ListAnswersResult result = null;

                try {
                    result = executeListAnswers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCheckDetailsResult> listCheckDetailsAsync(ListCheckDetailsRequest request) {

        return listCheckDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCheckDetailsResult> listCheckDetailsAsync(final ListCheckDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCheckDetailsRequest, ListCheckDetailsResult> asyncHandler) {
        final ListCheckDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCheckDetailsResult>() {
            @Override
            public ListCheckDetailsResult call() throws Exception {
                ListCheckDetailsResult result = null;

                try {
                    result = executeListCheckDetails(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCheckSummariesResult> listCheckSummariesAsync(ListCheckSummariesRequest request) {

        return listCheckSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCheckSummariesResult> listCheckSummariesAsync(final ListCheckSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCheckSummariesRequest, ListCheckSummariesResult> asyncHandler) {
        final ListCheckSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCheckSummariesResult>() {
            @Override
            public ListCheckSummariesResult call() throws Exception {
                ListCheckSummariesResult result = null;

                try {
                    result = executeListCheckSummaries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLensReviewImprovementsResult> listLensReviewImprovementsAsync(ListLensReviewImprovementsRequest request) {

        return listLensReviewImprovementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLensReviewImprovementsResult> listLensReviewImprovementsAsync(final ListLensReviewImprovementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLensReviewImprovementsRequest, ListLensReviewImprovementsResult> asyncHandler) {
        final ListLensReviewImprovementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLensReviewImprovementsResult>() {
            @Override
            public ListLensReviewImprovementsResult call() throws Exception {
                ListLensReviewImprovementsResult result = null;

                try {
                    result = executeListLensReviewImprovements(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLensReviewsResult> listLensReviewsAsync(ListLensReviewsRequest request) {

        return listLensReviewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLensReviewsResult> listLensReviewsAsync(final ListLensReviewsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLensReviewsRequest, ListLensReviewsResult> asyncHandler) {
        final ListLensReviewsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLensReviewsResult>() {
            @Override
            public ListLensReviewsResult call() throws Exception {
                ListLensReviewsResult result = null;

                try {
                    result = executeListLensReviews(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLensSharesResult> listLensSharesAsync(ListLensSharesRequest request) {

        return listLensSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLensSharesResult> listLensSharesAsync(final ListLensSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLensSharesRequest, ListLensSharesResult> asyncHandler) {
        final ListLensSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLensSharesResult>() {
            @Override
            public ListLensSharesResult call() throws Exception {
                ListLensSharesResult result = null;

                try {
                    result = executeListLensShares(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLensesResult> listLensesAsync(ListLensesRequest request) {

        return listLensesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLensesResult> listLensesAsync(final ListLensesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLensesRequest, ListLensesResult> asyncHandler) {
        final ListLensesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLensesResult>() {
            @Override
            public ListLensesResult call() throws Exception {
                ListLensesResult result = null;

                try {
                    result = executeListLenses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMilestonesResult> listMilestonesAsync(ListMilestonesRequest request) {

        return listMilestonesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMilestonesResult> listMilestonesAsync(final ListMilestonesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMilestonesRequest, ListMilestonesResult> asyncHandler) {
        final ListMilestonesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMilestonesResult>() {
            @Override
            public ListMilestonesResult call() throws Exception {
                ListMilestonesResult result = null;

                try {
                    result = executeListMilestones(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(ListNotificationsRequest request) {

        return listNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationsResult> listNotificationsAsync(final ListNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotificationsRequest, ListNotificationsResult> asyncHandler) {
        final ListNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotificationsResult>() {
            @Override
            public ListNotificationsResult call() throws Exception {
                ListNotificationsResult result = null;

                try {
                    result = executeListNotifications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProfileNotificationsResult> listProfileNotificationsAsync(ListProfileNotificationsRequest request) {

        return listProfileNotificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileNotificationsResult> listProfileNotificationsAsync(final ListProfileNotificationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileNotificationsRequest, ListProfileNotificationsResult> asyncHandler) {
        final ListProfileNotificationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileNotificationsResult>() {
            @Override
            public ListProfileNotificationsResult call() throws Exception {
                ListProfileNotificationsResult result = null;

                try {
                    result = executeListProfileNotifications(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProfileSharesResult> listProfileSharesAsync(ListProfileSharesRequest request) {

        return listProfileSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfileSharesResult> listProfileSharesAsync(final ListProfileSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfileSharesRequest, ListProfileSharesResult> asyncHandler) {
        final ListProfileSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfileSharesResult>() {
            @Override
            public ListProfileSharesResult call() throws Exception {
                ListProfileSharesResult result = null;

                try {
                    result = executeListProfileShares(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(ListProfilesRequest request) {

        return listProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListProfilesResult> listProfilesAsync(final ListProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListProfilesRequest, ListProfilesResult> asyncHandler) {
        final ListProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListProfilesResult>() {
            @Override
            public ListProfilesResult call() throws Exception {
                ListProfilesResult result = null;

                try {
                    result = executeListProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListReviewTemplateAnswersResult> listReviewTemplateAnswersAsync(ListReviewTemplateAnswersRequest request) {

        return listReviewTemplateAnswersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewTemplateAnswersResult> listReviewTemplateAnswersAsync(final ListReviewTemplateAnswersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReviewTemplateAnswersRequest, ListReviewTemplateAnswersResult> asyncHandler) {
        final ListReviewTemplateAnswersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReviewTemplateAnswersResult>() {
            @Override
            public ListReviewTemplateAnswersResult call() throws Exception {
                ListReviewTemplateAnswersResult result = null;

                try {
                    result = executeListReviewTemplateAnswers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListReviewTemplatesResult> listReviewTemplatesAsync(ListReviewTemplatesRequest request) {

        return listReviewTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReviewTemplatesResult> listReviewTemplatesAsync(final ListReviewTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReviewTemplatesRequest, ListReviewTemplatesResult> asyncHandler) {
        final ListReviewTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReviewTemplatesResult>() {
            @Override
            public ListReviewTemplatesResult call() throws Exception {
                ListReviewTemplatesResult result = null;

                try {
                    result = executeListReviewTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListShareInvitationsResult> listShareInvitationsAsync(ListShareInvitationsRequest request) {

        return listShareInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListShareInvitationsResult> listShareInvitationsAsync(final ListShareInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListShareInvitationsRequest, ListShareInvitationsResult> asyncHandler) {
        final ListShareInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListShareInvitationsResult>() {
            @Override
            public ListShareInvitationsResult call() throws Exception {
                ListShareInvitationsResult result = null;

                try {
                    result = executeListShareInvitations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTemplateSharesResult> listTemplateSharesAsync(ListTemplateSharesRequest request) {

        return listTemplateSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateSharesResult> listTemplateSharesAsync(final ListTemplateSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplateSharesRequest, ListTemplateSharesResult> asyncHandler) {
        final ListTemplateSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplateSharesResult>() {
            @Override
            public ListTemplateSharesResult call() throws Exception {
                ListTemplateSharesResult result = null;

                try {
                    result = executeListTemplateShares(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadSharesResult> listWorkloadSharesAsync(ListWorkloadSharesRequest request) {

        return listWorkloadSharesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadSharesResult> listWorkloadSharesAsync(final ListWorkloadSharesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkloadSharesRequest, ListWorkloadSharesResult> asyncHandler) {
        final ListWorkloadSharesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkloadSharesResult>() {
            @Override
            public ListWorkloadSharesResult call() throws Exception {
                ListWorkloadSharesResult result = null;

                try {
                    result = executeListWorkloadShares(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(ListWorkloadsRequest request) {

        return listWorkloadsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkloadsResult> listWorkloadsAsync(final ListWorkloadsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkloadsRequest, ListWorkloadsResult> asyncHandler) {
        final ListWorkloadsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkloadsResult>() {
            @Override
            public ListWorkloadsResult call() throws Exception {
                ListWorkloadsResult result = null;

                try {
                    result = executeListWorkloads(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAnswerResult> updateAnswerAsync(UpdateAnswerRequest request) {

        return updateAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnswerResult> updateAnswerAsync(final UpdateAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnswerRequest, UpdateAnswerResult> asyncHandler) {
        final UpdateAnswerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnswerResult>() {
            @Override
            public UpdateAnswerResult call() throws Exception {
                UpdateAnswerResult result = null;

                try {
                    result = executeUpdateAnswer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest request) {

        return updateGlobalSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(final UpdateGlobalSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGlobalSettingsRequest, UpdateGlobalSettingsResult> asyncHandler) {
        final UpdateGlobalSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGlobalSettingsResult>() {
            @Override
            public UpdateGlobalSettingsResult call() throws Exception {
                UpdateGlobalSettingsResult result = null;

                try {
                    result = executeUpdateGlobalSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(UpdateIntegrationRequest request) {

        return updateIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResult> updateIntegrationAsync(final UpdateIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIntegrationRequest, UpdateIntegrationResult> asyncHandler) {
        final UpdateIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIntegrationResult>() {
            @Override
            public UpdateIntegrationResult call() throws Exception {
                UpdateIntegrationResult result = null;

                try {
                    result = executeUpdateIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLensReviewResult> updateLensReviewAsync(UpdateLensReviewRequest request) {

        return updateLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLensReviewResult> updateLensReviewAsync(final UpdateLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLensReviewRequest, UpdateLensReviewResult> asyncHandler) {
        final UpdateLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLensReviewResult>() {
            @Override
            public UpdateLensReviewResult call() throws Exception {
                UpdateLensReviewResult result = null;

                try {
                    result = executeUpdateLensReview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(UpdateProfileRequest request) {

        return updateProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateProfileResult> updateProfileAsync(final UpdateProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateProfileRequest, UpdateProfileResult> asyncHandler) {
        final UpdateProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateProfileResult>() {
            @Override
            public UpdateProfileResult call() throws Exception {
                UpdateProfileResult result = null;

                try {
                    result = executeUpdateProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateReviewTemplateResult> updateReviewTemplateAsync(UpdateReviewTemplateRequest request) {

        return updateReviewTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReviewTemplateResult> updateReviewTemplateAsync(final UpdateReviewTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReviewTemplateRequest, UpdateReviewTemplateResult> asyncHandler) {
        final UpdateReviewTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReviewTemplateResult>() {
            @Override
            public UpdateReviewTemplateResult call() throws Exception {
                UpdateReviewTemplateResult result = null;

                try {
                    result = executeUpdateReviewTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateReviewTemplateAnswerResult> updateReviewTemplateAnswerAsync(UpdateReviewTemplateAnswerRequest request) {

        return updateReviewTemplateAnswerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReviewTemplateAnswerResult> updateReviewTemplateAnswerAsync(final UpdateReviewTemplateAnswerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReviewTemplateAnswerRequest, UpdateReviewTemplateAnswerResult> asyncHandler) {
        final UpdateReviewTemplateAnswerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReviewTemplateAnswerResult>() {
            @Override
            public UpdateReviewTemplateAnswerResult call() throws Exception {
                UpdateReviewTemplateAnswerResult result = null;

                try {
                    result = executeUpdateReviewTemplateAnswer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateReviewTemplateLensReviewResult> updateReviewTemplateLensReviewAsync(UpdateReviewTemplateLensReviewRequest request) {

        return updateReviewTemplateLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReviewTemplateLensReviewResult> updateReviewTemplateLensReviewAsync(
            final UpdateReviewTemplateLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReviewTemplateLensReviewRequest, UpdateReviewTemplateLensReviewResult> asyncHandler) {
        final UpdateReviewTemplateLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReviewTemplateLensReviewResult>() {
            @Override
            public UpdateReviewTemplateLensReviewResult call() throws Exception {
                UpdateReviewTemplateLensReviewResult result = null;

                try {
                    result = executeUpdateReviewTemplateLensReview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateShareInvitationResult> updateShareInvitationAsync(UpdateShareInvitationRequest request) {

        return updateShareInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateShareInvitationResult> updateShareInvitationAsync(final UpdateShareInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateShareInvitationRequest, UpdateShareInvitationResult> asyncHandler) {
        final UpdateShareInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateShareInvitationResult>() {
            @Override
            public UpdateShareInvitationResult call() throws Exception {
                UpdateShareInvitationResult result = null;

                try {
                    result = executeUpdateShareInvitation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkloadResult> updateWorkloadAsync(UpdateWorkloadRequest request) {

        return updateWorkloadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkloadResult> updateWorkloadAsync(final UpdateWorkloadRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkloadRequest, UpdateWorkloadResult> asyncHandler) {
        final UpdateWorkloadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkloadResult>() {
            @Override
            public UpdateWorkloadResult call() throws Exception {
                UpdateWorkloadResult result = null;

                try {
                    result = executeUpdateWorkload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkloadShareResult> updateWorkloadShareAsync(UpdateWorkloadShareRequest request) {

        return updateWorkloadShareAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkloadShareResult> updateWorkloadShareAsync(final UpdateWorkloadShareRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkloadShareRequest, UpdateWorkloadShareResult> asyncHandler) {
        final UpdateWorkloadShareRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkloadShareResult>() {
            @Override
            public UpdateWorkloadShareResult call() throws Exception {
                UpdateWorkloadShareResult result = null;

                try {
                    result = executeUpdateWorkloadShare(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpgradeLensReviewResult> upgradeLensReviewAsync(UpgradeLensReviewRequest request) {

        return upgradeLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeLensReviewResult> upgradeLensReviewAsync(final UpgradeLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradeLensReviewRequest, UpgradeLensReviewResult> asyncHandler) {
        final UpgradeLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradeLensReviewResult>() {
            @Override
            public UpgradeLensReviewResult call() throws Exception {
                UpgradeLensReviewResult result = null;

                try {
                    result = executeUpgradeLensReview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpgradeProfileVersionResult> upgradeProfileVersionAsync(UpgradeProfileVersionRequest request) {

        return upgradeProfileVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeProfileVersionResult> upgradeProfileVersionAsync(final UpgradeProfileVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradeProfileVersionRequest, UpgradeProfileVersionResult> asyncHandler) {
        final UpgradeProfileVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradeProfileVersionResult>() {
            @Override
            public UpgradeProfileVersionResult call() throws Exception {
                UpgradeProfileVersionResult result = null;

                try {
                    result = executeUpgradeProfileVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpgradeReviewTemplateLensReviewResult> upgradeReviewTemplateLensReviewAsync(
            UpgradeReviewTemplateLensReviewRequest request) {

        return upgradeReviewTemplateLensReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpgradeReviewTemplateLensReviewResult> upgradeReviewTemplateLensReviewAsync(
            final UpgradeReviewTemplateLensReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpgradeReviewTemplateLensReviewRequest, UpgradeReviewTemplateLensReviewResult> asyncHandler) {
        final UpgradeReviewTemplateLensReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpgradeReviewTemplateLensReviewResult>() {
            @Override
            public UpgradeReviewTemplateLensReviewResult call() throws Exception {
                UpgradeReviewTemplateLensReviewResult result = null;

                try {
                    result = executeUpgradeReviewTemplateLensReview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
