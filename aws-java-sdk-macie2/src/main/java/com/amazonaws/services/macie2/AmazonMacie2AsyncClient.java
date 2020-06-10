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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Macie 2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Macie
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonMacie2AsyncClient extends AmazonMacie2Client implements AmazonMacie2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonMacie2AsyncClientBuilder asyncBuilder() {
        return AmazonMacie2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Macie 2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonMacie2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Macie 2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonMacie2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest request) {

        return acceptInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(final AcceptInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler) {
        final AcceptInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptInvitationResult>() {
            @Override
            public AcceptInvitationResult call() throws Exception {
                AcceptInvitationResult result = null;

                try {
                    result = executeAcceptInvitation(finalRequest);
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
    public java.util.concurrent.Future<BatchGetCustomDataIdentifiersResult> batchGetCustomDataIdentifiersAsync(BatchGetCustomDataIdentifiersRequest request) {

        return batchGetCustomDataIdentifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCustomDataIdentifiersResult> batchGetCustomDataIdentifiersAsync(
            final BatchGetCustomDataIdentifiersRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetCustomDataIdentifiersRequest, BatchGetCustomDataIdentifiersResult> asyncHandler) {
        final BatchGetCustomDataIdentifiersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetCustomDataIdentifiersResult>() {
            @Override
            public BatchGetCustomDataIdentifiersResult call() throws Exception {
                BatchGetCustomDataIdentifiersResult result = null;

                try {
                    result = executeBatchGetCustomDataIdentifiers(finalRequest);
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
    public java.util.concurrent.Future<CreateClassificationJobResult> createClassificationJobAsync(CreateClassificationJobRequest request) {

        return createClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClassificationJobResult> createClassificationJobAsync(final CreateClassificationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClassificationJobRequest, CreateClassificationJobResult> asyncHandler) {
        final CreateClassificationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClassificationJobResult>() {
            @Override
            public CreateClassificationJobResult call() throws Exception {
                CreateClassificationJobResult result = null;

                try {
                    result = executeCreateClassificationJob(finalRequest);
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
    public java.util.concurrent.Future<CreateCustomDataIdentifierResult> createCustomDataIdentifierAsync(CreateCustomDataIdentifierRequest request) {

        return createCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomDataIdentifierResult> createCustomDataIdentifierAsync(final CreateCustomDataIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomDataIdentifierRequest, CreateCustomDataIdentifierResult> asyncHandler) {
        final CreateCustomDataIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomDataIdentifierResult>() {
            @Override
            public CreateCustomDataIdentifierResult call() throws Exception {
                CreateCustomDataIdentifierResult result = null;

                try {
                    result = executeCreateCustomDataIdentifier(finalRequest);
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
    public java.util.concurrent.Future<CreateFindingsFilterResult> createFindingsFilterAsync(CreateFindingsFilterRequest request) {

        return createFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFindingsFilterResult> createFindingsFilterAsync(final CreateFindingsFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFindingsFilterRequest, CreateFindingsFilterResult> asyncHandler) {
        final CreateFindingsFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFindingsFilterResult>() {
            @Override
            public CreateFindingsFilterResult call() throws Exception {
                CreateFindingsFilterResult result = null;

                try {
                    result = executeCreateFindingsFilter(finalRequest);
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
    public java.util.concurrent.Future<CreateInvitationsResult> createInvitationsAsync(CreateInvitationsRequest request) {

        return createInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInvitationsResult> createInvitationsAsync(final CreateInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInvitationsRequest, CreateInvitationsResult> asyncHandler) {
        final CreateInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInvitationsResult>() {
            @Override
            public CreateInvitationsResult call() throws Exception {
                CreateInvitationsResult result = null;

                try {
                    result = executeCreateInvitations(finalRequest);
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
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest request) {

        return createMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMemberResult> createMemberAsync(final CreateMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMemberRequest, CreateMemberResult> asyncHandler) {
        final CreateMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMemberResult>() {
            @Override
            public CreateMemberResult call() throws Exception {
                CreateMemberResult result = null;

                try {
                    result = executeCreateMember(finalRequest);
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
    public java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest request) {

        return createSampleFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(final CreateSampleFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSampleFindingsRequest, CreateSampleFindingsResult> asyncHandler) {
        final CreateSampleFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSampleFindingsResult>() {
            @Override
            public CreateSampleFindingsResult call() throws Exception {
                CreateSampleFindingsResult result = null;

                try {
                    result = executeCreateSampleFindings(finalRequest);
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
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest request) {

        return declineInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(final DeclineInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler) {
        final DeclineInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeclineInvitationsResult>() {
            @Override
            public DeclineInvitationsResult call() throws Exception {
                DeclineInvitationsResult result = null;

                try {
                    result = executeDeclineInvitations(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomDataIdentifierResult> deleteCustomDataIdentifierAsync(DeleteCustomDataIdentifierRequest request) {

        return deleteCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomDataIdentifierResult> deleteCustomDataIdentifierAsync(final DeleteCustomDataIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomDataIdentifierRequest, DeleteCustomDataIdentifierResult> asyncHandler) {
        final DeleteCustomDataIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomDataIdentifierResult>() {
            @Override
            public DeleteCustomDataIdentifierResult call() throws Exception {
                DeleteCustomDataIdentifierResult result = null;

                try {
                    result = executeDeleteCustomDataIdentifier(finalRequest);
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
    public java.util.concurrent.Future<DeleteFindingsFilterResult> deleteFindingsFilterAsync(DeleteFindingsFilterRequest request) {

        return deleteFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFindingsFilterResult> deleteFindingsFilterAsync(final DeleteFindingsFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFindingsFilterRequest, DeleteFindingsFilterResult> asyncHandler) {
        final DeleteFindingsFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFindingsFilterResult>() {
            @Override
            public DeleteFindingsFilterResult call() throws Exception {
                DeleteFindingsFilterResult result = null;

                try {
                    result = executeDeleteFindingsFilter(finalRequest);
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
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest request) {

        return deleteInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(final DeleteInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler) {
        final DeleteInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInvitationsResult>() {
            @Override
            public DeleteInvitationsResult call() throws Exception {
                DeleteInvitationsResult result = null;

                try {
                    result = executeDeleteInvitations(finalRequest);
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
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest request) {

        return deleteMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(final DeleteMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler) {
        final DeleteMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMemberResult>() {
            @Override
            public DeleteMemberResult call() throws Exception {
                DeleteMemberResult result = null;

                try {
                    result = executeDeleteMember(finalRequest);
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
    public java.util.concurrent.Future<DescribeBucketsResult> describeBucketsAsync(DescribeBucketsRequest request) {

        return describeBucketsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBucketsResult> describeBucketsAsync(final DescribeBucketsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBucketsRequest, DescribeBucketsResult> asyncHandler) {
        final DescribeBucketsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBucketsResult>() {
            @Override
            public DescribeBucketsResult call() throws Exception {
                DescribeBucketsResult result = null;

                try {
                    result = executeDescribeBuckets(finalRequest);
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
    public java.util.concurrent.Future<DescribeClassificationJobResult> describeClassificationJobAsync(DescribeClassificationJobRequest request) {

        return describeClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClassificationJobResult> describeClassificationJobAsync(final DescribeClassificationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClassificationJobRequest, DescribeClassificationJobResult> asyncHandler) {
        final DescribeClassificationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClassificationJobResult>() {
            @Override
            public DescribeClassificationJobResult call() throws Exception {
                DescribeClassificationJobResult result = null;

                try {
                    result = executeDescribeClassificationJob(finalRequest);
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
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest request) {

        return describeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            final DescribeOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler) {
        final DescribeOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationConfigurationResult>() {
            @Override
            public DescribeOrganizationConfigurationResult call() throws Exception {
                DescribeOrganizationConfigurationResult result = null;

                try {
                    result = executeDescribeOrganizationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DisableMacieResult> disableMacieAsync(DisableMacieRequest request) {

        return disableMacieAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableMacieResult> disableMacieAsync(final DisableMacieRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableMacieRequest, DisableMacieResult> asyncHandler) {
        final DisableMacieRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableMacieResult>() {
            @Override
            public DisableMacieResult call() throws Exception {
                DisableMacieResult result = null;

                try {
                    result = executeDisableMacie(finalRequest);
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
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest request) {

        return disableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            final DisableOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler) {
        final DisableOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableOrganizationAdminAccountResult>() {
            @Override
            public DisableOrganizationAdminAccountResult call() throws Exception {
                DisableOrganizationAdminAccountResult result = null;

                try {
                    result = executeDisableOrganizationAdminAccount(finalRequest);
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
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(DisassociateFromMasterAccountRequest request) {

        return disassociateFromMasterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            final DisassociateFromMasterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler) {
        final DisassociateFromMasterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFromMasterAccountResult>() {
            @Override
            public DisassociateFromMasterAccountResult call() throws Exception {
                DisassociateFromMasterAccountResult result = null;

                try {
                    result = executeDisassociateFromMasterAccount(finalRequest);
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
    public java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest request) {

        return disassociateMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(final DisassociateMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMemberRequest, DisassociateMemberResult> asyncHandler) {
        final DisassociateMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMemberResult>() {
            @Override
            public DisassociateMemberResult call() throws Exception {
                DisassociateMemberResult result = null;

                try {
                    result = executeDisassociateMember(finalRequest);
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
    public java.util.concurrent.Future<EnableMacieResult> enableMacieAsync(EnableMacieRequest request) {

        return enableMacieAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableMacieResult> enableMacieAsync(final EnableMacieRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableMacieRequest, EnableMacieResult> asyncHandler) {
        final EnableMacieRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableMacieResult>() {
            @Override
            public EnableMacieResult call() throws Exception {
                EnableMacieResult result = null;

                try {
                    result = executeEnableMacie(finalRequest);
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
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(EnableOrganizationAdminAccountRequest request) {

        return enableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            final EnableOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler) {
        final EnableOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableOrganizationAdminAccountResult>() {
            @Override
            public EnableOrganizationAdminAccountResult call() throws Exception {
                EnableOrganizationAdminAccountResult result = null;

                try {
                    result = executeEnableOrganizationAdminAccount(finalRequest);
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
    public java.util.concurrent.Future<GetBucketStatisticsResult> getBucketStatisticsAsync(GetBucketStatisticsRequest request) {

        return getBucketStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketStatisticsResult> getBucketStatisticsAsync(final GetBucketStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBucketStatisticsRequest, GetBucketStatisticsResult> asyncHandler) {
        final GetBucketStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBucketStatisticsResult>() {
            @Override
            public GetBucketStatisticsResult call() throws Exception {
                GetBucketStatisticsResult result = null;

                try {
                    result = executeGetBucketStatistics(finalRequest);
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
    public java.util.concurrent.Future<GetClassificationExportConfigurationResult> getClassificationExportConfigurationAsync(
            GetClassificationExportConfigurationRequest request) {

        return getClassificationExportConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClassificationExportConfigurationResult> getClassificationExportConfigurationAsync(
            final GetClassificationExportConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClassificationExportConfigurationRequest, GetClassificationExportConfigurationResult> asyncHandler) {
        final GetClassificationExportConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClassificationExportConfigurationResult>() {
            @Override
            public GetClassificationExportConfigurationResult call() throws Exception {
                GetClassificationExportConfigurationResult result = null;

                try {
                    result = executeGetClassificationExportConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetCustomDataIdentifierResult> getCustomDataIdentifierAsync(GetCustomDataIdentifierRequest request) {

        return getCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomDataIdentifierResult> getCustomDataIdentifierAsync(final GetCustomDataIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCustomDataIdentifierRequest, GetCustomDataIdentifierResult> asyncHandler) {
        final GetCustomDataIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCustomDataIdentifierResult>() {
            @Override
            public GetCustomDataIdentifierResult call() throws Exception {
                GetCustomDataIdentifierResult result = null;

                try {
                    result = executeGetCustomDataIdentifier(finalRequest);
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
    public java.util.concurrent.Future<GetFindingStatisticsResult> getFindingStatisticsAsync(GetFindingStatisticsRequest request) {

        return getFindingStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingStatisticsResult> getFindingStatisticsAsync(final GetFindingStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingStatisticsRequest, GetFindingStatisticsResult> asyncHandler) {
        final GetFindingStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingStatisticsResult>() {
            @Override
            public GetFindingStatisticsResult call() throws Exception {
                GetFindingStatisticsResult result = null;

                try {
                    result = executeGetFindingStatistics(finalRequest);
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
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request) {

        return getFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(final GetFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler) {
        final GetFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsResult>() {
            @Override
            public GetFindingsResult call() throws Exception {
                GetFindingsResult result = null;

                try {
                    result = executeGetFindings(finalRequest);
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
    public java.util.concurrent.Future<GetFindingsFilterResult> getFindingsFilterAsync(GetFindingsFilterRequest request) {

        return getFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsFilterResult> getFindingsFilterAsync(final GetFindingsFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsFilterRequest, GetFindingsFilterResult> asyncHandler) {
        final GetFindingsFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsFilterResult>() {
            @Override
            public GetFindingsFilterResult call() throws Exception {
                GetFindingsFilterResult result = null;

                try {
                    result = executeGetFindingsFilter(finalRequest);
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
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest request) {

        return getInvitationsCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(final GetInvitationsCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler) {
        final GetInvitationsCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInvitationsCountResult>() {
            @Override
            public GetInvitationsCountResult call() throws Exception {
                GetInvitationsCountResult result = null;

                try {
                    result = executeGetInvitationsCount(finalRequest);
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
    public java.util.concurrent.Future<GetMacieSessionResult> getMacieSessionAsync(GetMacieSessionRequest request) {

        return getMacieSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMacieSessionResult> getMacieSessionAsync(final GetMacieSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMacieSessionRequest, GetMacieSessionResult> asyncHandler) {
        final GetMacieSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMacieSessionResult>() {
            @Override
            public GetMacieSessionResult call() throws Exception {
                GetMacieSessionResult result = null;

                try {
                    result = executeGetMacieSession(finalRequest);
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
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest request) {

        return getMasterAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(final GetMasterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler) {
        final GetMasterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMasterAccountResult>() {
            @Override
            public GetMasterAccountResult call() throws Exception {
                GetMasterAccountResult result = null;

                try {
                    result = executeGetMasterAccount(finalRequest);
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
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest request) {

        return getMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMemberResult> getMemberAsync(final GetMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler) {
        final GetMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMemberResult>() {
            @Override
            public GetMemberResult call() throws Exception {
                GetMemberResult result = null;

                try {
                    result = executeGetMember(finalRequest);
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
    public java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest request) {

        return getUsageStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(final GetUsageStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsageStatisticsRequest, GetUsageStatisticsResult> asyncHandler) {
        final GetUsageStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsageStatisticsResult>() {
            @Override
            public GetUsageStatisticsResult call() throws Exception {
                GetUsageStatisticsResult result = null;

                try {
                    result = executeGetUsageStatistics(finalRequest);
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
    public java.util.concurrent.Future<GetUsageTotalsResult> getUsageTotalsAsync(GetUsageTotalsRequest request) {

        return getUsageTotalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUsageTotalsResult> getUsageTotalsAsync(final GetUsageTotalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetUsageTotalsRequest, GetUsageTotalsResult> asyncHandler) {
        final GetUsageTotalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetUsageTotalsResult>() {
            @Override
            public GetUsageTotalsResult call() throws Exception {
                GetUsageTotalsResult result = null;

                try {
                    result = executeGetUsageTotals(finalRequest);
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
    public java.util.concurrent.Future<ListClassificationJobsResult> listClassificationJobsAsync(ListClassificationJobsRequest request) {

        return listClassificationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClassificationJobsResult> listClassificationJobsAsync(final ListClassificationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClassificationJobsRequest, ListClassificationJobsResult> asyncHandler) {
        final ListClassificationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClassificationJobsResult>() {
            @Override
            public ListClassificationJobsResult call() throws Exception {
                ListClassificationJobsResult result = null;

                try {
                    result = executeListClassificationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListCustomDataIdentifiersResult> listCustomDataIdentifiersAsync(ListCustomDataIdentifiersRequest request) {

        return listCustomDataIdentifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomDataIdentifiersResult> listCustomDataIdentifiersAsync(final ListCustomDataIdentifiersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomDataIdentifiersRequest, ListCustomDataIdentifiersResult> asyncHandler) {
        final ListCustomDataIdentifiersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomDataIdentifiersResult>() {
            @Override
            public ListCustomDataIdentifiersResult call() throws Exception {
                ListCustomDataIdentifiersResult result = null;

                try {
                    result = executeListCustomDataIdentifiers(finalRequest);
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
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(final ListFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {
        final ListFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingsResult>() {
            @Override
            public ListFindingsResult call() throws Exception {
                ListFindingsResult result = null;

                try {
                    result = executeListFindings(finalRequest);
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
    public java.util.concurrent.Future<ListFindingsFiltersResult> listFindingsFiltersAsync(ListFindingsFiltersRequest request) {

        return listFindingsFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsFiltersResult> listFindingsFiltersAsync(final ListFindingsFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingsFiltersRequest, ListFindingsFiltersResult> asyncHandler) {
        final ListFindingsFiltersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingsFiltersResult>() {
            @Override
            public ListFindingsFiltersResult call() throws Exception {
                ListFindingsFiltersResult result = null;

                try {
                    result = executeListFindingsFilters(finalRequest);
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
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request) {

        return listInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(final ListInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler) {
        final ListInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInvitationsResult>() {
            @Override
            public ListInvitationsResult call() throws Exception {
                ListInvitationsResult result = null;

                try {
                    result = executeListInvitations(finalRequest);
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
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request) {

        return listMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(final ListMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler) {
        final ListMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMembersResult>() {
            @Override
            public ListMembersResult call() throws Exception {
                ListMembersResult result = null;

                try {
                    result = executeListMembers(finalRequest);
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
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(ListOrganizationAdminAccountsRequest request) {

        return listOrganizationAdminAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            final ListOrganizationAdminAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler) {
        final ListOrganizationAdminAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationAdminAccountsResult>() {
            @Override
            public ListOrganizationAdminAccountsResult call() throws Exception {
                ListOrganizationAdminAccountsResult result = null;

                try {
                    result = executeListOrganizationAdminAccounts(finalRequest);
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
    public java.util.concurrent.Future<PutClassificationExportConfigurationResult> putClassificationExportConfigurationAsync(
            PutClassificationExportConfigurationRequest request) {

        return putClassificationExportConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutClassificationExportConfigurationResult> putClassificationExportConfigurationAsync(
            final PutClassificationExportConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutClassificationExportConfigurationRequest, PutClassificationExportConfigurationResult> asyncHandler) {
        final PutClassificationExportConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutClassificationExportConfigurationResult>() {
            @Override
            public PutClassificationExportConfigurationResult call() throws Exception {
                PutClassificationExportConfigurationResult result = null;

                try {
                    result = executePutClassificationExportConfiguration(finalRequest);
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
    public java.util.concurrent.Future<TestCustomDataIdentifierResult> testCustomDataIdentifierAsync(TestCustomDataIdentifierRequest request) {

        return testCustomDataIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestCustomDataIdentifierResult> testCustomDataIdentifierAsync(final TestCustomDataIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestCustomDataIdentifierRequest, TestCustomDataIdentifierResult> asyncHandler) {
        final TestCustomDataIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestCustomDataIdentifierResult>() {
            @Override
            public TestCustomDataIdentifierResult call() throws Exception {
                TestCustomDataIdentifierResult result = null;

                try {
                    result = executeTestCustomDataIdentifier(finalRequest);
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
    public java.util.concurrent.Future<UpdateClassificationJobResult> updateClassificationJobAsync(UpdateClassificationJobRequest request) {

        return updateClassificationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClassificationJobResult> updateClassificationJobAsync(final UpdateClassificationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClassificationJobRequest, UpdateClassificationJobResult> asyncHandler) {
        final UpdateClassificationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClassificationJobResult>() {
            @Override
            public UpdateClassificationJobResult call() throws Exception {
                UpdateClassificationJobResult result = null;

                try {
                    result = executeUpdateClassificationJob(finalRequest);
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
    public java.util.concurrent.Future<UpdateFindingsFilterResult> updateFindingsFilterAsync(UpdateFindingsFilterRequest request) {

        return updateFindingsFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsFilterResult> updateFindingsFilterAsync(final UpdateFindingsFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFindingsFilterRequest, UpdateFindingsFilterResult> asyncHandler) {
        final UpdateFindingsFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFindingsFilterResult>() {
            @Override
            public UpdateFindingsFilterResult call() throws Exception {
                UpdateFindingsFilterResult result = null;

                try {
                    result = executeUpdateFindingsFilter(finalRequest);
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
    public java.util.concurrent.Future<UpdateMacieSessionResult> updateMacieSessionAsync(UpdateMacieSessionRequest request) {

        return updateMacieSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMacieSessionResult> updateMacieSessionAsync(final UpdateMacieSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMacieSessionRequest, UpdateMacieSessionResult> asyncHandler) {
        final UpdateMacieSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMacieSessionResult>() {
            @Override
            public UpdateMacieSessionResult call() throws Exception {
                UpdateMacieSessionResult result = null;

                try {
                    result = executeUpdateMacieSession(finalRequest);
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
    public java.util.concurrent.Future<UpdateMemberSessionResult> updateMemberSessionAsync(UpdateMemberSessionRequest request) {

        return updateMemberSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMemberSessionResult> updateMemberSessionAsync(final UpdateMemberSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMemberSessionRequest, UpdateMemberSessionResult> asyncHandler) {
        final UpdateMemberSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMemberSessionResult>() {
            @Override
            public UpdateMemberSessionResult call() throws Exception {
                UpdateMemberSessionResult result = null;

                try {
                    result = executeUpdateMemberSession(finalRequest);
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
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest request) {

        return updateOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            final UpdateOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler) {
        final UpdateOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOrganizationConfigurationResult>() {
            @Override
            public UpdateOrganizationConfigurationResult call() throws Exception {
                UpdateOrganizationConfigurationResult result = null;

                try {
                    result = executeUpdateOrganizationConfiguration(finalRequest);
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
