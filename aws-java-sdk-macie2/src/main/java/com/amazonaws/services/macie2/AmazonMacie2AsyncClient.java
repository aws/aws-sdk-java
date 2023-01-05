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
    public java.util.concurrent.Future<CreateAllowListResult> createAllowListAsync(CreateAllowListRequest request) {

        return createAllowListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAllowListResult> createAllowListAsync(final CreateAllowListRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAllowListRequest, CreateAllowListResult> asyncHandler) {
        final CreateAllowListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAllowListResult>() {
            @Override
            public CreateAllowListResult call() throws Exception {
                CreateAllowListResult result = null;

                try {
                    result = executeCreateAllowList(finalRequest);
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
    public java.util.concurrent.Future<DeleteAllowListResult> deleteAllowListAsync(DeleteAllowListRequest request) {

        return deleteAllowListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAllowListResult> deleteAllowListAsync(final DeleteAllowListRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAllowListRequest, DeleteAllowListResult> asyncHandler) {
        final DeleteAllowListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAllowListResult>() {
            @Override
            public DeleteAllowListResult call() throws Exception {
                DeleteAllowListResult result = null;

                try {
                    result = executeDeleteAllowList(finalRequest);
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
    public java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest request) {

        return disassociateFromAdministratorAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            final DisassociateFromAdministratorAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFromAdministratorAccountRequest, DisassociateFromAdministratorAccountResult> asyncHandler) {
        final DisassociateFromAdministratorAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFromAdministratorAccountResult>() {
            @Override
            public DisassociateFromAdministratorAccountResult call() throws Exception {
                DisassociateFromAdministratorAccountResult result = null;

                try {
                    result = executeDisassociateFromAdministratorAccount(finalRequest);
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
    public java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest request) {

        return getAdministratorAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(final GetAdministratorAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAdministratorAccountRequest, GetAdministratorAccountResult> asyncHandler) {
        final GetAdministratorAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAdministratorAccountResult>() {
            @Override
            public GetAdministratorAccountResult call() throws Exception {
                GetAdministratorAccountResult result = null;

                try {
                    result = executeGetAdministratorAccount(finalRequest);
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
    public java.util.concurrent.Future<GetAllowListResult> getAllowListAsync(GetAllowListRequest request) {

        return getAllowListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAllowListResult> getAllowListAsync(final GetAllowListRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAllowListRequest, GetAllowListResult> asyncHandler) {
        final GetAllowListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAllowListResult>() {
            @Override
            public GetAllowListResult call() throws Exception {
                GetAllowListResult result = null;

                try {
                    result = executeGetAllowList(finalRequest);
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
    public java.util.concurrent.Future<GetAutomatedDiscoveryConfigurationResult> getAutomatedDiscoveryConfigurationAsync(
            GetAutomatedDiscoveryConfigurationRequest request) {

        return getAutomatedDiscoveryConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAutomatedDiscoveryConfigurationResult> getAutomatedDiscoveryConfigurationAsync(
            final GetAutomatedDiscoveryConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAutomatedDiscoveryConfigurationRequest, GetAutomatedDiscoveryConfigurationResult> asyncHandler) {
        final GetAutomatedDiscoveryConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAutomatedDiscoveryConfigurationResult>() {
            @Override
            public GetAutomatedDiscoveryConfigurationResult call() throws Exception {
                GetAutomatedDiscoveryConfigurationResult result = null;

                try {
                    result = executeGetAutomatedDiscoveryConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetClassificationScopeResult> getClassificationScopeAsync(GetClassificationScopeRequest request) {

        return getClassificationScopeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClassificationScopeResult> getClassificationScopeAsync(final GetClassificationScopeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetClassificationScopeRequest, GetClassificationScopeResult> asyncHandler) {
        final GetClassificationScopeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetClassificationScopeResult>() {
            @Override
            public GetClassificationScopeResult call() throws Exception {
                GetClassificationScopeResult result = null;

                try {
                    result = executeGetClassificationScope(finalRequest);
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
    public java.util.concurrent.Future<GetFindingsPublicationConfigurationResult> getFindingsPublicationConfigurationAsync(
            GetFindingsPublicationConfigurationRequest request) {

        return getFindingsPublicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsPublicationConfigurationResult> getFindingsPublicationConfigurationAsync(
            final GetFindingsPublicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsPublicationConfigurationRequest, GetFindingsPublicationConfigurationResult> asyncHandler) {
        final GetFindingsPublicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsPublicationConfigurationResult>() {
            @Override
            public GetFindingsPublicationConfigurationResult call() throws Exception {
                GetFindingsPublicationConfigurationResult result = null;

                try {
                    result = executeGetFindingsPublicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetResourceProfileResult> getResourceProfileAsync(GetResourceProfileRequest request) {

        return getResourceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceProfileResult> getResourceProfileAsync(final GetResourceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceProfileRequest, GetResourceProfileResult> asyncHandler) {
        final GetResourceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceProfileResult>() {
            @Override
            public GetResourceProfileResult call() throws Exception {
                GetResourceProfileResult result = null;

                try {
                    result = executeGetResourceProfile(finalRequest);
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
    public java.util.concurrent.Future<GetRevealConfigurationResult> getRevealConfigurationAsync(GetRevealConfigurationRequest request) {

        return getRevealConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRevealConfigurationResult> getRevealConfigurationAsync(final GetRevealConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRevealConfigurationRequest, GetRevealConfigurationResult> asyncHandler) {
        final GetRevealConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRevealConfigurationResult>() {
            @Override
            public GetRevealConfigurationResult call() throws Exception {
                GetRevealConfigurationResult result = null;

                try {
                    result = executeGetRevealConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetSensitiveDataOccurrencesResult> getSensitiveDataOccurrencesAsync(GetSensitiveDataOccurrencesRequest request) {

        return getSensitiveDataOccurrencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveDataOccurrencesResult> getSensitiveDataOccurrencesAsync(final GetSensitiveDataOccurrencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSensitiveDataOccurrencesRequest, GetSensitiveDataOccurrencesResult> asyncHandler) {
        final GetSensitiveDataOccurrencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSensitiveDataOccurrencesResult>() {
            @Override
            public GetSensitiveDataOccurrencesResult call() throws Exception {
                GetSensitiveDataOccurrencesResult result = null;

                try {
                    result = executeGetSensitiveDataOccurrences(finalRequest);
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
    public java.util.concurrent.Future<GetSensitiveDataOccurrencesAvailabilityResult> getSensitiveDataOccurrencesAvailabilityAsync(
            GetSensitiveDataOccurrencesAvailabilityRequest request) {

        return getSensitiveDataOccurrencesAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSensitiveDataOccurrencesAvailabilityResult> getSensitiveDataOccurrencesAvailabilityAsync(
            final GetSensitiveDataOccurrencesAvailabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSensitiveDataOccurrencesAvailabilityRequest, GetSensitiveDataOccurrencesAvailabilityResult> asyncHandler) {
        final GetSensitiveDataOccurrencesAvailabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSensitiveDataOccurrencesAvailabilityResult>() {
            @Override
            public GetSensitiveDataOccurrencesAvailabilityResult call() throws Exception {
                GetSensitiveDataOccurrencesAvailabilityResult result = null;

                try {
                    result = executeGetSensitiveDataOccurrencesAvailability(finalRequest);
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
    public java.util.concurrent.Future<GetSensitivityInspectionTemplateResult> getSensitivityInspectionTemplateAsync(
            GetSensitivityInspectionTemplateRequest request) {

        return getSensitivityInspectionTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSensitivityInspectionTemplateResult> getSensitivityInspectionTemplateAsync(
            final GetSensitivityInspectionTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSensitivityInspectionTemplateRequest, GetSensitivityInspectionTemplateResult> asyncHandler) {
        final GetSensitivityInspectionTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSensitivityInspectionTemplateResult>() {
            @Override
            public GetSensitivityInspectionTemplateResult call() throws Exception {
                GetSensitivityInspectionTemplateResult result = null;

                try {
                    result = executeGetSensitivityInspectionTemplate(finalRequest);
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
    public java.util.concurrent.Future<ListAllowListsResult> listAllowListsAsync(ListAllowListsRequest request) {

        return listAllowListsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAllowListsResult> listAllowListsAsync(final ListAllowListsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAllowListsRequest, ListAllowListsResult> asyncHandler) {
        final ListAllowListsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAllowListsResult>() {
            @Override
            public ListAllowListsResult call() throws Exception {
                ListAllowListsResult result = null;

                try {
                    result = executeListAllowLists(finalRequest);
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
    public java.util.concurrent.Future<ListClassificationScopesResult> listClassificationScopesAsync(ListClassificationScopesRequest request) {

        return listClassificationScopesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClassificationScopesResult> listClassificationScopesAsync(final ListClassificationScopesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClassificationScopesRequest, ListClassificationScopesResult> asyncHandler) {
        final ListClassificationScopesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClassificationScopesResult>() {
            @Override
            public ListClassificationScopesResult call() throws Exception {
                ListClassificationScopesResult result = null;

                try {
                    result = executeListClassificationScopes(finalRequest);
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
    public java.util.concurrent.Future<ListManagedDataIdentifiersResult> listManagedDataIdentifiersAsync(ListManagedDataIdentifiersRequest request) {

        return listManagedDataIdentifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedDataIdentifiersResult> listManagedDataIdentifiersAsync(final ListManagedDataIdentifiersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListManagedDataIdentifiersRequest, ListManagedDataIdentifiersResult> asyncHandler) {
        final ListManagedDataIdentifiersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListManagedDataIdentifiersResult>() {
            @Override
            public ListManagedDataIdentifiersResult call() throws Exception {
                ListManagedDataIdentifiersResult result = null;

                try {
                    result = executeListManagedDataIdentifiers(finalRequest);
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
    public java.util.concurrent.Future<ListResourceProfileArtifactsResult> listResourceProfileArtifactsAsync(ListResourceProfileArtifactsRequest request) {

        return listResourceProfileArtifactsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfileArtifactsResult> listResourceProfileArtifactsAsync(final ListResourceProfileArtifactsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceProfileArtifactsRequest, ListResourceProfileArtifactsResult> asyncHandler) {
        final ListResourceProfileArtifactsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceProfileArtifactsResult>() {
            @Override
            public ListResourceProfileArtifactsResult call() throws Exception {
                ListResourceProfileArtifactsResult result = null;

                try {
                    result = executeListResourceProfileArtifacts(finalRequest);
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
    public java.util.concurrent.Future<ListResourceProfileDetectionsResult> listResourceProfileDetectionsAsync(ListResourceProfileDetectionsRequest request) {

        return listResourceProfileDetectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourceProfileDetectionsResult> listResourceProfileDetectionsAsync(
            final ListResourceProfileDetectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourceProfileDetectionsRequest, ListResourceProfileDetectionsResult> asyncHandler) {
        final ListResourceProfileDetectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourceProfileDetectionsResult>() {
            @Override
            public ListResourceProfileDetectionsResult call() throws Exception {
                ListResourceProfileDetectionsResult result = null;

                try {
                    result = executeListResourceProfileDetections(finalRequest);
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
    public java.util.concurrent.Future<ListSensitivityInspectionTemplatesResult> listSensitivityInspectionTemplatesAsync(
            ListSensitivityInspectionTemplatesRequest request) {

        return listSensitivityInspectionTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSensitivityInspectionTemplatesResult> listSensitivityInspectionTemplatesAsync(
            final ListSensitivityInspectionTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSensitivityInspectionTemplatesRequest, ListSensitivityInspectionTemplatesResult> asyncHandler) {
        final ListSensitivityInspectionTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSensitivityInspectionTemplatesResult>() {
            @Override
            public ListSensitivityInspectionTemplatesResult call() throws Exception {
                ListSensitivityInspectionTemplatesResult result = null;

                try {
                    result = executeListSensitivityInspectionTemplates(finalRequest);
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
    public java.util.concurrent.Future<PutFindingsPublicationConfigurationResult> putFindingsPublicationConfigurationAsync(
            PutFindingsPublicationConfigurationRequest request) {

        return putFindingsPublicationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFindingsPublicationConfigurationResult> putFindingsPublicationConfigurationAsync(
            final PutFindingsPublicationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutFindingsPublicationConfigurationRequest, PutFindingsPublicationConfigurationResult> asyncHandler) {
        final PutFindingsPublicationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutFindingsPublicationConfigurationResult>() {
            @Override
            public PutFindingsPublicationConfigurationResult call() throws Exception {
                PutFindingsPublicationConfigurationResult result = null;

                try {
                    result = executePutFindingsPublicationConfiguration(finalRequest);
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
    public java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest request) {

        return searchResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(final SearchResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchResourcesRequest, SearchResourcesResult> asyncHandler) {
        final SearchResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchResourcesResult>() {
            @Override
            public SearchResourcesResult call() throws Exception {
                SearchResourcesResult result = null;

                try {
                    result = executeSearchResources(finalRequest);
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
    public java.util.concurrent.Future<UpdateAllowListResult> updateAllowListAsync(UpdateAllowListRequest request) {

        return updateAllowListAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAllowListResult> updateAllowListAsync(final UpdateAllowListRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAllowListRequest, UpdateAllowListResult> asyncHandler) {
        final UpdateAllowListRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAllowListResult>() {
            @Override
            public UpdateAllowListResult call() throws Exception {
                UpdateAllowListResult result = null;

                try {
                    result = executeUpdateAllowList(finalRequest);
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
    public java.util.concurrent.Future<UpdateAutomatedDiscoveryConfigurationResult> updateAutomatedDiscoveryConfigurationAsync(
            UpdateAutomatedDiscoveryConfigurationRequest request) {

        return updateAutomatedDiscoveryConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAutomatedDiscoveryConfigurationResult> updateAutomatedDiscoveryConfigurationAsync(
            final UpdateAutomatedDiscoveryConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAutomatedDiscoveryConfigurationRequest, UpdateAutomatedDiscoveryConfigurationResult> asyncHandler) {
        final UpdateAutomatedDiscoveryConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAutomatedDiscoveryConfigurationResult>() {
            @Override
            public UpdateAutomatedDiscoveryConfigurationResult call() throws Exception {
                UpdateAutomatedDiscoveryConfigurationResult result = null;

                try {
                    result = executeUpdateAutomatedDiscoveryConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateClassificationScopeResult> updateClassificationScopeAsync(UpdateClassificationScopeRequest request) {

        return updateClassificationScopeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClassificationScopeResult> updateClassificationScopeAsync(final UpdateClassificationScopeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateClassificationScopeRequest, UpdateClassificationScopeResult> asyncHandler) {
        final UpdateClassificationScopeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateClassificationScopeResult>() {
            @Override
            public UpdateClassificationScopeResult call() throws Exception {
                UpdateClassificationScopeResult result = null;

                try {
                    result = executeUpdateClassificationScope(finalRequest);
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

    @Override
    public java.util.concurrent.Future<UpdateResourceProfileResult> updateResourceProfileAsync(UpdateResourceProfileRequest request) {

        return updateResourceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceProfileResult> updateResourceProfileAsync(final UpdateResourceProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceProfileRequest, UpdateResourceProfileResult> asyncHandler) {
        final UpdateResourceProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceProfileResult>() {
            @Override
            public UpdateResourceProfileResult call() throws Exception {
                UpdateResourceProfileResult result = null;

                try {
                    result = executeUpdateResourceProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateResourceProfileDetectionsResult> updateResourceProfileDetectionsAsync(
            UpdateResourceProfileDetectionsRequest request) {

        return updateResourceProfileDetectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResourceProfileDetectionsResult> updateResourceProfileDetectionsAsync(
            final UpdateResourceProfileDetectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResourceProfileDetectionsRequest, UpdateResourceProfileDetectionsResult> asyncHandler) {
        final UpdateResourceProfileDetectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResourceProfileDetectionsResult>() {
            @Override
            public UpdateResourceProfileDetectionsResult call() throws Exception {
                UpdateResourceProfileDetectionsResult result = null;

                try {
                    result = executeUpdateResourceProfileDetections(finalRequest);
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
    public java.util.concurrent.Future<UpdateRevealConfigurationResult> updateRevealConfigurationAsync(UpdateRevealConfigurationRequest request) {

        return updateRevealConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRevealConfigurationResult> updateRevealConfigurationAsync(final UpdateRevealConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRevealConfigurationRequest, UpdateRevealConfigurationResult> asyncHandler) {
        final UpdateRevealConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRevealConfigurationResult>() {
            @Override
            public UpdateRevealConfigurationResult call() throws Exception {
                UpdateRevealConfigurationResult result = null;

                try {
                    result = executeUpdateRevealConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateSensitivityInspectionTemplateResult> updateSensitivityInspectionTemplateAsync(
            UpdateSensitivityInspectionTemplateRequest request) {

        return updateSensitivityInspectionTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSensitivityInspectionTemplateResult> updateSensitivityInspectionTemplateAsync(
            final UpdateSensitivityInspectionTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSensitivityInspectionTemplateRequest, UpdateSensitivityInspectionTemplateResult> asyncHandler) {
        final UpdateSensitivityInspectionTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSensitivityInspectionTemplateResult>() {
            @Override
            public UpdateSensitivityInspectionTemplateResult call() throws Exception {
                UpdateSensitivityInspectionTemplateResult result = null;

                try {
                    result = executeUpdateSensitivityInspectionTemplate(finalRequest);
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
