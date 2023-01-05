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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Inspector2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Inspector is a vulnerability discovery service that automates continuous scanning for security vulnerabilities
 * within your Amazon EC2 and Amazon ECR environments.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSInspector2AsyncClient extends AWSInspector2Client implements AWSInspector2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSInspector2AsyncClientBuilder asyncBuilder() {
        return AWSInspector2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Inspector2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSInspector2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Inspector2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSInspector2AsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateMemberResult> associateMemberAsync(AssociateMemberRequest request) {

        return associateMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberResult> associateMemberAsync(final AssociateMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateMemberRequest, AssociateMemberResult> asyncHandler) {
        final AssociateMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateMemberResult>() {
            @Override
            public AssociateMemberResult call() throws Exception {
                AssociateMemberResult result = null;

                try {
                    result = executeAssociateMember(finalRequest);
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
    public java.util.concurrent.Future<BatchGetAccountStatusResult> batchGetAccountStatusAsync(BatchGetAccountStatusRequest request) {

        return batchGetAccountStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetAccountStatusResult> batchGetAccountStatusAsync(final BatchGetAccountStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetAccountStatusRequest, BatchGetAccountStatusResult> asyncHandler) {
        final BatchGetAccountStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetAccountStatusResult>() {
            @Override
            public BatchGetAccountStatusResult call() throws Exception {
                BatchGetAccountStatusResult result = null;

                try {
                    result = executeBatchGetAccountStatus(finalRequest);
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
    public java.util.concurrent.Future<BatchGetFreeTrialInfoResult> batchGetFreeTrialInfoAsync(BatchGetFreeTrialInfoRequest request) {

        return batchGetFreeTrialInfoAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetFreeTrialInfoResult> batchGetFreeTrialInfoAsync(final BatchGetFreeTrialInfoRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetFreeTrialInfoRequest, BatchGetFreeTrialInfoResult> asyncHandler) {
        final BatchGetFreeTrialInfoRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetFreeTrialInfoResult>() {
            @Override
            public BatchGetFreeTrialInfoResult call() throws Exception {
                BatchGetFreeTrialInfoResult result = null;

                try {
                    result = executeBatchGetFreeTrialInfo(finalRequest);
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
    public java.util.concurrent.Future<CancelFindingsReportResult> cancelFindingsReportAsync(CancelFindingsReportRequest request) {

        return cancelFindingsReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelFindingsReportResult> cancelFindingsReportAsync(final CancelFindingsReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelFindingsReportRequest, CancelFindingsReportResult> asyncHandler) {
        final CancelFindingsReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelFindingsReportResult>() {
            @Override
            public CancelFindingsReportResult call() throws Exception {
                CancelFindingsReportResult result = null;

                try {
                    result = executeCancelFindingsReport(finalRequest);
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
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest request) {

        return createFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFilterResult> createFilterAsync(final CreateFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler) {
        final CreateFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFilterResult>() {
            @Override
            public CreateFilterResult call() throws Exception {
                CreateFilterResult result = null;

                try {
                    result = executeCreateFilter(finalRequest);
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
    public java.util.concurrent.Future<CreateFindingsReportResult> createFindingsReportAsync(CreateFindingsReportRequest request) {

        return createFindingsReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFindingsReportResult> createFindingsReportAsync(final CreateFindingsReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFindingsReportRequest, CreateFindingsReportResult> asyncHandler) {
        final CreateFindingsReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFindingsReportResult>() {
            @Override
            public CreateFindingsReportResult call() throws Exception {
                CreateFindingsReportResult result = null;

                try {
                    result = executeCreateFindingsReport(finalRequest);
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
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest request) {

        return deleteFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(final DeleteFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler) {
        final DeleteFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFilterResult>() {
            @Override
            public DeleteFilterResult call() throws Exception {
                DeleteFilterResult result = null;

                try {
                    result = executeDeleteFilter(finalRequest);
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
    public java.util.concurrent.Future<DisableResult> disableAsync(DisableRequest request) {

        return disableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableResult> disableAsync(final DisableRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableRequest, DisableResult> asyncHandler) {
        final DisableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableResult>() {
            @Override
            public DisableResult call() throws Exception {
                DisableResult result = null;

                try {
                    result = executeDisable(finalRequest);
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
    public java.util.concurrent.Future<DisableDelegatedAdminAccountResult> disableDelegatedAdminAccountAsync(DisableDelegatedAdminAccountRequest request) {

        return disableDelegatedAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableDelegatedAdminAccountResult> disableDelegatedAdminAccountAsync(final DisableDelegatedAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableDelegatedAdminAccountRequest, DisableDelegatedAdminAccountResult> asyncHandler) {
        final DisableDelegatedAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableDelegatedAdminAccountResult>() {
            @Override
            public DisableDelegatedAdminAccountResult call() throws Exception {
                DisableDelegatedAdminAccountResult result = null;

                try {
                    result = executeDisableDelegatedAdminAccount(finalRequest);
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
    public java.util.concurrent.Future<EnableResult> enableAsync(EnableRequest request) {

        return enableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableResult> enableAsync(final EnableRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableRequest, EnableResult> asyncHandler) {
        final EnableRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableResult>() {
            @Override
            public EnableResult call() throws Exception {
                EnableResult result = null;

                try {
                    result = executeEnable(finalRequest);
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
    public java.util.concurrent.Future<EnableDelegatedAdminAccountResult> enableDelegatedAdminAccountAsync(EnableDelegatedAdminAccountRequest request) {

        return enableDelegatedAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableDelegatedAdminAccountResult> enableDelegatedAdminAccountAsync(final EnableDelegatedAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableDelegatedAdminAccountRequest, EnableDelegatedAdminAccountResult> asyncHandler) {
        final EnableDelegatedAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableDelegatedAdminAccountResult>() {
            @Override
            public EnableDelegatedAdminAccountResult call() throws Exception {
                EnableDelegatedAdminAccountResult result = null;

                try {
                    result = executeEnableDelegatedAdminAccount(finalRequest);
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
    public java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest request) {

        return getConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(final GetConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationRequest, GetConfigurationResult> asyncHandler) {
        final GetConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationResult>() {
            @Override
            public GetConfigurationResult call() throws Exception {
                GetConfigurationResult result = null;

                try {
                    result = executeGetConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetDelegatedAdminAccountResult> getDelegatedAdminAccountAsync(GetDelegatedAdminAccountRequest request) {

        return getDelegatedAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDelegatedAdminAccountResult> getDelegatedAdminAccountAsync(final GetDelegatedAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDelegatedAdminAccountRequest, GetDelegatedAdminAccountResult> asyncHandler) {
        final GetDelegatedAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDelegatedAdminAccountResult>() {
            @Override
            public GetDelegatedAdminAccountResult call() throws Exception {
                GetDelegatedAdminAccountResult result = null;

                try {
                    result = executeGetDelegatedAdminAccount(finalRequest);
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
    public java.util.concurrent.Future<GetFindingsReportStatusResult> getFindingsReportStatusAsync(GetFindingsReportStatusRequest request) {

        return getFindingsReportStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsReportStatusResult> getFindingsReportStatusAsync(final GetFindingsReportStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsReportStatusRequest, GetFindingsReportStatusResult> asyncHandler) {
        final GetFindingsReportStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsReportStatusResult>() {
            @Override
            public GetFindingsReportStatusResult call() throws Exception {
                GetFindingsReportStatusResult result = null;

                try {
                    result = executeGetFindingsReportStatus(finalRequest);
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
    public java.util.concurrent.Future<ListAccountPermissionsResult> listAccountPermissionsAsync(ListAccountPermissionsRequest request) {

        return listAccountPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountPermissionsResult> listAccountPermissionsAsync(final ListAccountPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccountPermissionsRequest, ListAccountPermissionsResult> asyncHandler) {
        final ListAccountPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccountPermissionsResult>() {
            @Override
            public ListAccountPermissionsResult call() throws Exception {
                ListAccountPermissionsResult result = null;

                try {
                    result = executeListAccountPermissions(finalRequest);
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
    public java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(ListCoverageRequest request) {

        return listCoverageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(final ListCoverageRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCoverageRequest, ListCoverageResult> asyncHandler) {
        final ListCoverageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCoverageResult>() {
            @Override
            public ListCoverageResult call() throws Exception {
                ListCoverageResult result = null;

                try {
                    result = executeListCoverage(finalRequest);
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
    public java.util.concurrent.Future<ListCoverageStatisticsResult> listCoverageStatisticsAsync(ListCoverageStatisticsRequest request) {

        return listCoverageStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCoverageStatisticsResult> listCoverageStatisticsAsync(final ListCoverageStatisticsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCoverageStatisticsRequest, ListCoverageStatisticsResult> asyncHandler) {
        final ListCoverageStatisticsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCoverageStatisticsResult>() {
            @Override
            public ListCoverageStatisticsResult call() throws Exception {
                ListCoverageStatisticsResult result = null;

                try {
                    result = executeListCoverageStatistics(finalRequest);
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
    public java.util.concurrent.Future<ListDelegatedAdminAccountsResult> listDelegatedAdminAccountsAsync(ListDelegatedAdminAccountsRequest request) {

        return listDelegatedAdminAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDelegatedAdminAccountsResult> listDelegatedAdminAccountsAsync(final ListDelegatedAdminAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDelegatedAdminAccountsRequest, ListDelegatedAdminAccountsResult> asyncHandler) {
        final ListDelegatedAdminAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDelegatedAdminAccountsResult>() {
            @Override
            public ListDelegatedAdminAccountsResult call() throws Exception {
                ListDelegatedAdminAccountsResult result = null;

                try {
                    result = executeListDelegatedAdminAccounts(finalRequest);
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
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest request) {

        return listFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(final ListFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler) {
        final ListFiltersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFiltersResult>() {
            @Override
            public ListFiltersResult call() throws Exception {
                ListFiltersResult result = null;

                try {
                    result = executeListFilters(finalRequest);
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
    public java.util.concurrent.Future<ListFindingAggregationsResult> listFindingAggregationsAsync(ListFindingAggregationsRequest request) {

        return listFindingAggregationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingAggregationsResult> listFindingAggregationsAsync(final ListFindingAggregationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingAggregationsRequest, ListFindingAggregationsResult> asyncHandler) {
        final ListFindingAggregationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingAggregationsResult>() {
            @Override
            public ListFindingAggregationsResult call() throws Exception {
                ListFindingAggregationsResult result = null;

                try {
                    result = executeListFindingAggregations(finalRequest);
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
    public java.util.concurrent.Future<ListUsageTotalsResult> listUsageTotalsAsync(ListUsageTotalsRequest request) {

        return listUsageTotalsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsageTotalsResult> listUsageTotalsAsync(final ListUsageTotalsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsageTotalsRequest, ListUsageTotalsResult> asyncHandler) {
        final ListUsageTotalsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsageTotalsResult>() {
            @Override
            public ListUsageTotalsResult call() throws Exception {
                ListUsageTotalsResult result = null;

                try {
                    result = executeListUsageTotals(finalRequest);
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
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request) {

        return updateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(final UpdateConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationRequest, UpdateConfigurationResult> asyncHandler) {
        final UpdateConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationResult>() {
            @Override
            public UpdateConfigurationResult call() throws Exception {
                UpdateConfigurationResult result = null;

                try {
                    result = executeUpdateConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest request) {

        return updateFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(final UpdateFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFilterRequest, UpdateFilterResult> asyncHandler) {
        final UpdateFilterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFilterResult>() {
            @Override
            public UpdateFilterResult call() throws Exception {
                UpdateFilterResult result = null;

                try {
                    result = executeUpdateFilter(finalRequest);
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
