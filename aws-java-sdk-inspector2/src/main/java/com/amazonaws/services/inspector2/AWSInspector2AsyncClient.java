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
 * within your Amazon EC2, Amazon ECR, and Amazon Web Services Lambda environments.
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
    public java.util.concurrent.Future<BatchGetCodeSnippetResult> batchGetCodeSnippetAsync(BatchGetCodeSnippetRequest request) {

        return batchGetCodeSnippetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCodeSnippetResult> batchGetCodeSnippetAsync(final BatchGetCodeSnippetRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetCodeSnippetRequest, BatchGetCodeSnippetResult> asyncHandler) {
        final BatchGetCodeSnippetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetCodeSnippetResult>() {
            @Override
            public BatchGetCodeSnippetResult call() throws Exception {
                BatchGetCodeSnippetResult result = null;

                try {
                    result = executeBatchGetCodeSnippet(finalRequest);
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
    public java.util.concurrent.Future<BatchGetFindingDetailsResult> batchGetFindingDetailsAsync(BatchGetFindingDetailsRequest request) {

        return batchGetFindingDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetFindingDetailsResult> batchGetFindingDetailsAsync(final BatchGetFindingDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetFindingDetailsRequest, BatchGetFindingDetailsResult> asyncHandler) {
        final BatchGetFindingDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetFindingDetailsResult>() {
            @Override
            public BatchGetFindingDetailsResult call() throws Exception {
                BatchGetFindingDetailsResult result = null;

                try {
                    result = executeBatchGetFindingDetails(finalRequest);
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
    public java.util.concurrent.Future<BatchGetMemberEc2DeepInspectionStatusResult> batchGetMemberEc2DeepInspectionStatusAsync(
            BatchGetMemberEc2DeepInspectionStatusRequest request) {

        return batchGetMemberEc2DeepInspectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetMemberEc2DeepInspectionStatusResult> batchGetMemberEc2DeepInspectionStatusAsync(
            final BatchGetMemberEc2DeepInspectionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetMemberEc2DeepInspectionStatusRequest, BatchGetMemberEc2DeepInspectionStatusResult> asyncHandler) {
        final BatchGetMemberEc2DeepInspectionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetMemberEc2DeepInspectionStatusResult>() {
            @Override
            public BatchGetMemberEc2DeepInspectionStatusResult call() throws Exception {
                BatchGetMemberEc2DeepInspectionStatusResult result = null;

                try {
                    result = executeBatchGetMemberEc2DeepInspectionStatus(finalRequest);
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
    public java.util.concurrent.Future<BatchUpdateMemberEc2DeepInspectionStatusResult> batchUpdateMemberEc2DeepInspectionStatusAsync(
            BatchUpdateMemberEc2DeepInspectionStatusRequest request) {

        return batchUpdateMemberEc2DeepInspectionStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateMemberEc2DeepInspectionStatusResult> batchUpdateMemberEc2DeepInspectionStatusAsync(
            final BatchUpdateMemberEc2DeepInspectionStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateMemberEc2DeepInspectionStatusRequest, BatchUpdateMemberEc2DeepInspectionStatusResult> asyncHandler) {
        final BatchUpdateMemberEc2DeepInspectionStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateMemberEc2DeepInspectionStatusResult>() {
            @Override
            public BatchUpdateMemberEc2DeepInspectionStatusResult call() throws Exception {
                BatchUpdateMemberEc2DeepInspectionStatusResult result = null;

                try {
                    result = executeBatchUpdateMemberEc2DeepInspectionStatus(finalRequest);
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
    public java.util.concurrent.Future<CancelSbomExportResult> cancelSbomExportAsync(CancelSbomExportRequest request) {

        return cancelSbomExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelSbomExportResult> cancelSbomExportAsync(final CancelSbomExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelSbomExportRequest, CancelSbomExportResult> asyncHandler) {
        final CancelSbomExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelSbomExportResult>() {
            @Override
            public CancelSbomExportResult call() throws Exception {
                CancelSbomExportResult result = null;

                try {
                    result = executeCancelSbomExport(finalRequest);
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
    public java.util.concurrent.Future<CreateCisScanConfigurationResult> createCisScanConfigurationAsync(CreateCisScanConfigurationRequest request) {

        return createCisScanConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCisScanConfigurationResult> createCisScanConfigurationAsync(final CreateCisScanConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCisScanConfigurationRequest, CreateCisScanConfigurationResult> asyncHandler) {
        final CreateCisScanConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCisScanConfigurationResult>() {
            @Override
            public CreateCisScanConfigurationResult call() throws Exception {
                CreateCisScanConfigurationResult result = null;

                try {
                    result = executeCreateCisScanConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateSbomExportResult> createSbomExportAsync(CreateSbomExportRequest request) {

        return createSbomExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSbomExportResult> createSbomExportAsync(final CreateSbomExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSbomExportRequest, CreateSbomExportResult> asyncHandler) {
        final CreateSbomExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSbomExportResult>() {
            @Override
            public CreateSbomExportResult call() throws Exception {
                CreateSbomExportResult result = null;

                try {
                    result = executeCreateSbomExport(finalRequest);
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
    public java.util.concurrent.Future<DeleteCisScanConfigurationResult> deleteCisScanConfigurationAsync(DeleteCisScanConfigurationRequest request) {

        return deleteCisScanConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCisScanConfigurationResult> deleteCisScanConfigurationAsync(final DeleteCisScanConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCisScanConfigurationRequest, DeleteCisScanConfigurationResult> asyncHandler) {
        final DeleteCisScanConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCisScanConfigurationResult>() {
            @Override
            public DeleteCisScanConfigurationResult call() throws Exception {
                DeleteCisScanConfigurationResult result = null;

                try {
                    result = executeDeleteCisScanConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetCisScanReportResult> getCisScanReportAsync(GetCisScanReportRequest request) {

        return getCisScanReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCisScanReportResult> getCisScanReportAsync(final GetCisScanReportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCisScanReportRequest, GetCisScanReportResult> asyncHandler) {
        final GetCisScanReportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCisScanReportResult>() {
            @Override
            public GetCisScanReportResult call() throws Exception {
                GetCisScanReportResult result = null;

                try {
                    result = executeGetCisScanReport(finalRequest);
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
    public java.util.concurrent.Future<GetCisScanResultDetailsResult> getCisScanResultDetailsAsync(GetCisScanResultDetailsRequest request) {

        return getCisScanResultDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCisScanResultDetailsResult> getCisScanResultDetailsAsync(final GetCisScanResultDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCisScanResultDetailsRequest, GetCisScanResultDetailsResult> asyncHandler) {
        final GetCisScanResultDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCisScanResultDetailsResult>() {
            @Override
            public GetCisScanResultDetailsResult call() throws Exception {
                GetCisScanResultDetailsResult result = null;

                try {
                    result = executeGetCisScanResultDetails(finalRequest);
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
    public java.util.concurrent.Future<GetEc2DeepInspectionConfigurationResult> getEc2DeepInspectionConfigurationAsync(
            GetEc2DeepInspectionConfigurationRequest request) {

        return getEc2DeepInspectionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEc2DeepInspectionConfigurationResult> getEc2DeepInspectionConfigurationAsync(
            final GetEc2DeepInspectionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEc2DeepInspectionConfigurationRequest, GetEc2DeepInspectionConfigurationResult> asyncHandler) {
        final GetEc2DeepInspectionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEc2DeepInspectionConfigurationResult>() {
            @Override
            public GetEc2DeepInspectionConfigurationResult call() throws Exception {
                GetEc2DeepInspectionConfigurationResult result = null;

                try {
                    result = executeGetEc2DeepInspectionConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetEncryptionKeyResult> getEncryptionKeyAsync(GetEncryptionKeyRequest request) {

        return getEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEncryptionKeyResult> getEncryptionKeyAsync(final GetEncryptionKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEncryptionKeyRequest, GetEncryptionKeyResult> asyncHandler) {
        final GetEncryptionKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEncryptionKeyResult>() {
            @Override
            public GetEncryptionKeyResult call() throws Exception {
                GetEncryptionKeyResult result = null;

                try {
                    result = executeGetEncryptionKey(finalRequest);
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
    public java.util.concurrent.Future<GetSbomExportResult> getSbomExportAsync(GetSbomExportRequest request) {

        return getSbomExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSbomExportResult> getSbomExportAsync(final GetSbomExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSbomExportRequest, GetSbomExportResult> asyncHandler) {
        final GetSbomExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSbomExportResult>() {
            @Override
            public GetSbomExportResult call() throws Exception {
                GetSbomExportResult result = null;

                try {
                    result = executeGetSbomExport(finalRequest);
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
    public java.util.concurrent.Future<ListCisScanConfigurationsResult> listCisScanConfigurationsAsync(ListCisScanConfigurationsRequest request) {

        return listCisScanConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCisScanConfigurationsResult> listCisScanConfigurationsAsync(final ListCisScanConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCisScanConfigurationsRequest, ListCisScanConfigurationsResult> asyncHandler) {
        final ListCisScanConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCisScanConfigurationsResult>() {
            @Override
            public ListCisScanConfigurationsResult call() throws Exception {
                ListCisScanConfigurationsResult result = null;

                try {
                    result = executeListCisScanConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListCisScanResultsAggregatedByChecksResult> listCisScanResultsAggregatedByChecksAsync(
            ListCisScanResultsAggregatedByChecksRequest request) {

        return listCisScanResultsAggregatedByChecksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCisScanResultsAggregatedByChecksResult> listCisScanResultsAggregatedByChecksAsync(
            final ListCisScanResultsAggregatedByChecksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCisScanResultsAggregatedByChecksRequest, ListCisScanResultsAggregatedByChecksResult> asyncHandler) {
        final ListCisScanResultsAggregatedByChecksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCisScanResultsAggregatedByChecksResult>() {
            @Override
            public ListCisScanResultsAggregatedByChecksResult call() throws Exception {
                ListCisScanResultsAggregatedByChecksResult result = null;

                try {
                    result = executeListCisScanResultsAggregatedByChecks(finalRequest);
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
    public java.util.concurrent.Future<ListCisScanResultsAggregatedByTargetResourceResult> listCisScanResultsAggregatedByTargetResourceAsync(
            ListCisScanResultsAggregatedByTargetResourceRequest request) {

        return listCisScanResultsAggregatedByTargetResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCisScanResultsAggregatedByTargetResourceResult> listCisScanResultsAggregatedByTargetResourceAsync(
            final ListCisScanResultsAggregatedByTargetResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCisScanResultsAggregatedByTargetResourceRequest, ListCisScanResultsAggregatedByTargetResourceResult> asyncHandler) {
        final ListCisScanResultsAggregatedByTargetResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCisScanResultsAggregatedByTargetResourceResult>() {
            @Override
            public ListCisScanResultsAggregatedByTargetResourceResult call() throws Exception {
                ListCisScanResultsAggregatedByTargetResourceResult result = null;

                try {
                    result = executeListCisScanResultsAggregatedByTargetResource(finalRequest);
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
    public java.util.concurrent.Future<ListCisScansResult> listCisScansAsync(ListCisScansRequest request) {

        return listCisScansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCisScansResult> listCisScansAsync(final ListCisScansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCisScansRequest, ListCisScansResult> asyncHandler) {
        final ListCisScansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCisScansResult>() {
            @Override
            public ListCisScansResult call() throws Exception {
                ListCisScansResult result = null;

                try {
                    result = executeListCisScans(finalRequest);
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
    public java.util.concurrent.Future<ResetEncryptionKeyResult> resetEncryptionKeyAsync(ResetEncryptionKeyRequest request) {

        return resetEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetEncryptionKeyResult> resetEncryptionKeyAsync(final ResetEncryptionKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResetEncryptionKeyRequest, ResetEncryptionKeyResult> asyncHandler) {
        final ResetEncryptionKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResetEncryptionKeyResult>() {
            @Override
            public ResetEncryptionKeyResult call() throws Exception {
                ResetEncryptionKeyResult result = null;

                try {
                    result = executeResetEncryptionKey(finalRequest);
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
    public java.util.concurrent.Future<SearchVulnerabilitiesResult> searchVulnerabilitiesAsync(SearchVulnerabilitiesRequest request) {

        return searchVulnerabilitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchVulnerabilitiesResult> searchVulnerabilitiesAsync(final SearchVulnerabilitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchVulnerabilitiesRequest, SearchVulnerabilitiesResult> asyncHandler) {
        final SearchVulnerabilitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchVulnerabilitiesResult>() {
            @Override
            public SearchVulnerabilitiesResult call() throws Exception {
                SearchVulnerabilitiesResult result = null;

                try {
                    result = executeSearchVulnerabilities(finalRequest);
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
    public java.util.concurrent.Future<SendCisSessionHealthResult> sendCisSessionHealthAsync(SendCisSessionHealthRequest request) {

        return sendCisSessionHealthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCisSessionHealthResult> sendCisSessionHealthAsync(final SendCisSessionHealthRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCisSessionHealthRequest, SendCisSessionHealthResult> asyncHandler) {
        final SendCisSessionHealthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendCisSessionHealthResult>() {
            @Override
            public SendCisSessionHealthResult call() throws Exception {
                SendCisSessionHealthResult result = null;

                try {
                    result = executeSendCisSessionHealth(finalRequest);
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
    public java.util.concurrent.Future<SendCisSessionTelemetryResult> sendCisSessionTelemetryAsync(SendCisSessionTelemetryRequest request) {

        return sendCisSessionTelemetryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendCisSessionTelemetryResult> sendCisSessionTelemetryAsync(final SendCisSessionTelemetryRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendCisSessionTelemetryRequest, SendCisSessionTelemetryResult> asyncHandler) {
        final SendCisSessionTelemetryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendCisSessionTelemetryResult>() {
            @Override
            public SendCisSessionTelemetryResult call() throws Exception {
                SendCisSessionTelemetryResult result = null;

                try {
                    result = executeSendCisSessionTelemetry(finalRequest);
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
    public java.util.concurrent.Future<StartCisSessionResult> startCisSessionAsync(StartCisSessionRequest request) {

        return startCisSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCisSessionResult> startCisSessionAsync(final StartCisSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCisSessionRequest, StartCisSessionResult> asyncHandler) {
        final StartCisSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCisSessionResult>() {
            @Override
            public StartCisSessionResult call() throws Exception {
                StartCisSessionResult result = null;

                try {
                    result = executeStartCisSession(finalRequest);
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
    public java.util.concurrent.Future<StopCisSessionResult> stopCisSessionAsync(StopCisSessionRequest request) {

        return stopCisSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCisSessionResult> stopCisSessionAsync(final StopCisSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCisSessionRequest, StopCisSessionResult> asyncHandler) {
        final StopCisSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCisSessionResult>() {
            @Override
            public StopCisSessionResult call() throws Exception {
                StopCisSessionResult result = null;

                try {
                    result = executeStopCisSession(finalRequest);
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
    public java.util.concurrent.Future<UpdateCisScanConfigurationResult> updateCisScanConfigurationAsync(UpdateCisScanConfigurationRequest request) {

        return updateCisScanConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCisScanConfigurationResult> updateCisScanConfigurationAsync(final UpdateCisScanConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCisScanConfigurationRequest, UpdateCisScanConfigurationResult> asyncHandler) {
        final UpdateCisScanConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCisScanConfigurationResult>() {
            @Override
            public UpdateCisScanConfigurationResult call() throws Exception {
                UpdateCisScanConfigurationResult result = null;

                try {
                    result = executeUpdateCisScanConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateEc2DeepInspectionConfigurationResult> updateEc2DeepInspectionConfigurationAsync(
            UpdateEc2DeepInspectionConfigurationRequest request) {

        return updateEc2DeepInspectionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEc2DeepInspectionConfigurationResult> updateEc2DeepInspectionConfigurationAsync(
            final UpdateEc2DeepInspectionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEc2DeepInspectionConfigurationRequest, UpdateEc2DeepInspectionConfigurationResult> asyncHandler) {
        final UpdateEc2DeepInspectionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEc2DeepInspectionConfigurationResult>() {
            @Override
            public UpdateEc2DeepInspectionConfigurationResult call() throws Exception {
                UpdateEc2DeepInspectionConfigurationResult result = null;

                try {
                    result = executeUpdateEc2DeepInspectionConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateEncryptionKeyResult> updateEncryptionKeyAsync(UpdateEncryptionKeyRequest request) {

        return updateEncryptionKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEncryptionKeyResult> updateEncryptionKeyAsync(final UpdateEncryptionKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEncryptionKeyRequest, UpdateEncryptionKeyResult> asyncHandler) {
        final UpdateEncryptionKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEncryptionKeyResult>() {
            @Override
            public UpdateEncryptionKeyResult call() throws Exception {
                UpdateEncryptionKeyResult result = null;

                try {
                    result = executeUpdateEncryptionKey(finalRequest);
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
    public java.util.concurrent.Future<UpdateOrgEc2DeepInspectionConfigurationResult> updateOrgEc2DeepInspectionConfigurationAsync(
            UpdateOrgEc2DeepInspectionConfigurationRequest request) {

        return updateOrgEc2DeepInspectionConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrgEc2DeepInspectionConfigurationResult> updateOrgEc2DeepInspectionConfigurationAsync(
            final UpdateOrgEc2DeepInspectionConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOrgEc2DeepInspectionConfigurationRequest, UpdateOrgEc2DeepInspectionConfigurationResult> asyncHandler) {
        final UpdateOrgEc2DeepInspectionConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOrgEc2DeepInspectionConfigurationResult>() {
            @Override
            public UpdateOrgEc2DeepInspectionConfigurationResult call() throws Exception {
                UpdateOrgEc2DeepInspectionConfigurationResult result = null;

                try {
                    result = executeUpdateOrgEc2DeepInspectionConfiguration(finalRequest);
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
