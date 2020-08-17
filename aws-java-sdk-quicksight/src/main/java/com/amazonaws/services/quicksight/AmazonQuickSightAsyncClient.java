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
package com.amazonaws.services.quicksight;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon QuickSight asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon QuickSight API Reference</fullname>
 * <p>
 * Amazon QuickSight is a fully managed, serverless business intelligence service for the AWS Cloud that makes it easy
 * to extend data and insights to every user in your organization. This API reference contains documentation for a
 * programming interface that you can use to manage Amazon QuickSight.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonQuickSightAsyncClient extends AmazonQuickSightClient implements AmazonQuickSightAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonQuickSightAsyncClientBuilder asyncBuilder() {
        return AmazonQuickSightAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon QuickSight using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonQuickSightAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon QuickSight using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonQuickSightAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CancelIngestionResult> cancelIngestionAsync(CancelIngestionRequest request) {

        return cancelIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelIngestionResult> cancelIngestionAsync(final CancelIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelIngestionRequest, CancelIngestionResult> asyncHandler) {
        final CancelIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelIngestionResult>() {
            @Override
            public CancelIngestionResult call() throws Exception {
                CancelIngestionResult result = null;

                try {
                    result = executeCancelIngestion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAccountCustomizationResult> createAccountCustomizationAsync(CreateAccountCustomizationRequest request) {

        return createAccountCustomizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccountCustomizationResult> createAccountCustomizationAsync(final CreateAccountCustomizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccountCustomizationRequest, CreateAccountCustomizationResult> asyncHandler) {
        final CreateAccountCustomizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccountCustomizationResult>() {
            @Override
            public CreateAccountCustomizationResult call() throws Exception {
                CreateAccountCustomizationResult result = null;

                try {
                    result = executeCreateAccountCustomization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAnalysisResult> createAnalysisAsync(CreateAnalysisRequest request) {

        return createAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAnalysisResult> createAnalysisAsync(final CreateAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAnalysisRequest, CreateAnalysisResult> asyncHandler) {
        final CreateAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAnalysisResult>() {
            @Override
            public CreateAnalysisResult call() throws Exception {
                CreateAnalysisResult result = null;

                try {
                    result = executeCreateAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(CreateDashboardRequest request) {

        return createDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDashboardResult> createDashboardAsync(final CreateDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDashboardRequest, CreateDashboardResult> asyncHandler) {
        final CreateDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDashboardResult>() {
            @Override
            public CreateDashboardResult call() throws Exception {
                CreateDashboardResult result = null;

                try {
                    result = executeCreateDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(CreateDataSetRequest request) {

        return createDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSetResult> createDataSetAsync(final CreateDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSetRequest, CreateDataSetResult> asyncHandler) {
        final CreateDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSetResult>() {
            @Override
            public CreateDataSetResult call() throws Exception {
                CreateDataSetResult result = null;

                try {
                    result = executeCreateDataSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest request) {

        return createDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(final CreateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler) {
        final CreateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDataSourceResult>() {
            @Override
            public CreateDataSourceResult call() throws Exception {
                CreateDataSourceResult result = null;

                try {
                    result = executeCreateDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(final CreateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {
        final CreateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupResult>() {
            @Override
            public CreateGroupResult call() throws Exception {
                CreateGroupResult result = null;

                try {
                    result = executeCreateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest request) {

        return createGroupMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(final CreateGroupMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGroupMembershipRequest, CreateGroupMembershipResult> asyncHandler) {
        final CreateGroupMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGroupMembershipResult>() {
            @Override
            public CreateGroupMembershipResult call() throws Exception {
                CreateGroupMembershipResult result = null;

                try {
                    result = executeCreateGroupMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIAMPolicyAssignmentResult> createIAMPolicyAssignmentAsync(CreateIAMPolicyAssignmentRequest request) {

        return createIAMPolicyAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIAMPolicyAssignmentResult> createIAMPolicyAssignmentAsync(final CreateIAMPolicyAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIAMPolicyAssignmentRequest, CreateIAMPolicyAssignmentResult> asyncHandler) {
        final CreateIAMPolicyAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIAMPolicyAssignmentResult>() {
            @Override
            public CreateIAMPolicyAssignmentResult call() throws Exception {
                CreateIAMPolicyAssignmentResult result = null;

                try {
                    result = executeCreateIAMPolicyAssignment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(CreateIngestionRequest request) {

        return createIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIngestionResult> createIngestionAsync(final CreateIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIngestionRequest, CreateIngestionResult> asyncHandler) {
        final CreateIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIngestionResult>() {
            @Override
            public CreateIngestionResult call() throws Exception {
                CreateIngestionResult result = null;

                try {
                    result = executeCreateIngestion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(CreateNamespaceRequest request) {

        return createNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNamespaceResult> createNamespaceAsync(final CreateNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNamespaceRequest, CreateNamespaceResult> asyncHandler) {
        final CreateNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNamespaceResult>() {
            @Override
            public CreateNamespaceResult call() throws Exception {
                CreateNamespaceResult result = null;

                try {
                    result = executeCreateNamespace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(CreateTemplateRequest request) {

        return createTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateResult> createTemplateAsync(final CreateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTemplateRequest, CreateTemplateResult> asyncHandler) {
        final CreateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTemplateResult>() {
            @Override
            public CreateTemplateResult call() throws Exception {
                CreateTemplateResult result = null;

                try {
                    result = executeCreateTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateAliasResult> createTemplateAliasAsync(CreateTemplateAliasRequest request) {

        return createTemplateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTemplateAliasResult> createTemplateAliasAsync(final CreateTemplateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTemplateAliasRequest, CreateTemplateAliasResult> asyncHandler) {
        final CreateTemplateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTemplateAliasResult>() {
            @Override
            public CreateTemplateAliasResult call() throws Exception {
                CreateTemplateAliasResult result = null;

                try {
                    result = executeCreateTemplateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateThemeResult> createThemeAsync(CreateThemeRequest request) {

        return createThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThemeResult> createThemeAsync(final CreateThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThemeRequest, CreateThemeResult> asyncHandler) {
        final CreateThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThemeResult>() {
            @Override
            public CreateThemeResult call() throws Exception {
                CreateThemeResult result = null;

                try {
                    result = executeCreateTheme(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateThemeAliasResult> createThemeAliasAsync(CreateThemeAliasRequest request) {

        return createThemeAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateThemeAliasResult> createThemeAliasAsync(final CreateThemeAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateThemeAliasRequest, CreateThemeAliasResult> asyncHandler) {
        final CreateThemeAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateThemeAliasResult>() {
            @Override
            public CreateThemeAliasResult call() throws Exception {
                CreateThemeAliasResult result = null;

                try {
                    result = executeCreateThemeAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountCustomizationResult> deleteAccountCustomizationAsync(DeleteAccountCustomizationRequest request) {

        return deleteAccountCustomizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountCustomizationResult> deleteAccountCustomizationAsync(final DeleteAccountCustomizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccountCustomizationRequest, DeleteAccountCustomizationResult> asyncHandler) {
        final DeleteAccountCustomizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccountCustomizationResult>() {
            @Override
            public DeleteAccountCustomizationResult call() throws Exception {
                DeleteAccountCustomizationResult result = null;

                try {
                    result = executeDeleteAccountCustomization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalysisResult> deleteAnalysisAsync(DeleteAnalysisRequest request) {

        return deleteAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAnalysisResult> deleteAnalysisAsync(final DeleteAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAnalysisRequest, DeleteAnalysisResult> asyncHandler) {
        final DeleteAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAnalysisResult>() {
            @Override
            public DeleteAnalysisResult call() throws Exception {
                DeleteAnalysisResult result = null;

                try {
                    result = executeDeleteAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(DeleteDashboardRequest request) {

        return deleteDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDashboardResult> deleteDashboardAsync(final DeleteDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDashboardRequest, DeleteDashboardResult> asyncHandler) {
        final DeleteDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDashboardResult>() {
            @Override
            public DeleteDashboardResult call() throws Exception {
                DeleteDashboardResult result = null;

                try {
                    result = executeDeleteDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(DeleteDataSetRequest request) {

        return deleteDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSetResult> deleteDataSetAsync(final DeleteDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataSetRequest, DeleteDataSetResult> asyncHandler) {
        final DeleteDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataSetResult>() {
            @Override
            public DeleteDataSetResult call() throws Exception {
                DeleteDataSetResult result = null;

                try {
                    result = executeDeleteDataSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest request) {

        return deleteDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(final DeleteDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler) {
        final DeleteDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDataSourceResult>() {
            @Override
            public DeleteDataSourceResult call() throws Exception {
                DeleteDataSourceResult result = null;

                try {
                    result = executeDeleteDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(final DeleteGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {
        final DeleteGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupResult>() {
            @Override
            public DeleteGroupResult call() throws Exception {
                DeleteGroupResult result = null;

                try {
                    result = executeDeleteGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest request) {

        return deleteGroupMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(final DeleteGroupMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGroupMembershipRequest, DeleteGroupMembershipResult> asyncHandler) {
        final DeleteGroupMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGroupMembershipResult>() {
            @Override
            public DeleteGroupMembershipResult call() throws Exception {
                DeleteGroupMembershipResult result = null;

                try {
                    result = executeDeleteGroupMembership(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIAMPolicyAssignmentResult> deleteIAMPolicyAssignmentAsync(DeleteIAMPolicyAssignmentRequest request) {

        return deleteIAMPolicyAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIAMPolicyAssignmentResult> deleteIAMPolicyAssignmentAsync(final DeleteIAMPolicyAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIAMPolicyAssignmentRequest, DeleteIAMPolicyAssignmentResult> asyncHandler) {
        final DeleteIAMPolicyAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIAMPolicyAssignmentResult>() {
            @Override
            public DeleteIAMPolicyAssignmentResult call() throws Exception {
                DeleteIAMPolicyAssignmentResult result = null;

                try {
                    result = executeDeleteIAMPolicyAssignment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest request) {

        return deleteNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(final DeleteNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler) {
        final DeleteNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNamespaceResult>() {
            @Override
            public DeleteNamespaceResult call() throws Exception {
                DeleteNamespaceResult result = null;

                try {
                    result = executeDeleteNamespace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(DeleteTemplateRequest request) {

        return deleteTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateResult> deleteTemplateAsync(final DeleteTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTemplateRequest, DeleteTemplateResult> asyncHandler) {
        final DeleteTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTemplateResult>() {
            @Override
            public DeleteTemplateResult call() throws Exception {
                DeleteTemplateResult result = null;

                try {
                    result = executeDeleteTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateAliasResult> deleteTemplateAliasAsync(DeleteTemplateAliasRequest request) {

        return deleteTemplateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTemplateAliasResult> deleteTemplateAliasAsync(final DeleteTemplateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTemplateAliasRequest, DeleteTemplateAliasResult> asyncHandler) {
        final DeleteTemplateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTemplateAliasResult>() {
            @Override
            public DeleteTemplateAliasResult call() throws Exception {
                DeleteTemplateAliasResult result = null;

                try {
                    result = executeDeleteTemplateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(DeleteThemeRequest request) {

        return deleteThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThemeResult> deleteThemeAsync(final DeleteThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThemeRequest, DeleteThemeResult> asyncHandler) {
        final DeleteThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThemeResult>() {
            @Override
            public DeleteThemeResult call() throws Exception {
                DeleteThemeResult result = null;

                try {
                    result = executeDeleteTheme(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteThemeAliasResult> deleteThemeAliasAsync(DeleteThemeAliasRequest request) {

        return deleteThemeAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThemeAliasResult> deleteThemeAliasAsync(final DeleteThemeAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteThemeAliasRequest, DeleteThemeAliasResult> asyncHandler) {
        final DeleteThemeAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteThemeAliasResult>() {
            @Override
            public DeleteThemeAliasResult call() throws Exception {
                DeleteThemeAliasResult result = null;

                try {
                    result = executeDeleteThemeAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(final DeleteUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {
        final DeleteUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserResult>() {
            @Override
            public DeleteUserResult call() throws Exception {
                DeleteUserResult result = null;

                try {
                    result = executeDeleteUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteUserByPrincipalIdResult> deleteUserByPrincipalIdAsync(DeleteUserByPrincipalIdRequest request) {

        return deleteUserByPrincipalIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserByPrincipalIdResult> deleteUserByPrincipalIdAsync(final DeleteUserByPrincipalIdRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteUserByPrincipalIdRequest, DeleteUserByPrincipalIdResult> asyncHandler) {
        final DeleteUserByPrincipalIdRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteUserByPrincipalIdResult>() {
            @Override
            public DeleteUserByPrincipalIdResult call() throws Exception {
                DeleteUserByPrincipalIdResult result = null;

                try {
                    result = executeDeleteUserByPrincipalId(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountCustomizationResult> describeAccountCustomizationAsync(DescribeAccountCustomizationRequest request) {

        return describeAccountCustomizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountCustomizationResult> describeAccountCustomizationAsync(final DescribeAccountCustomizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountCustomizationRequest, DescribeAccountCustomizationResult> asyncHandler) {
        final DescribeAccountCustomizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountCustomizationResult>() {
            @Override
            public DescribeAccountCustomizationResult call() throws Exception {
                DescribeAccountCustomizationResult result = null;

                try {
                    result = executeDescribeAccountCustomization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(DescribeAccountSettingsRequest request) {

        return describeAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountSettingsResult> describeAccountSettingsAsync(final DescribeAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountSettingsRequest, DescribeAccountSettingsResult> asyncHandler) {
        final DescribeAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountSettingsResult>() {
            @Override
            public DescribeAccountSettingsResult call() throws Exception {
                DescribeAccountSettingsResult result = null;

                try {
                    result = executeDescribeAccountSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAnalysisResult> describeAnalysisAsync(DescribeAnalysisRequest request) {

        return describeAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnalysisResult> describeAnalysisAsync(final DescribeAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAnalysisRequest, DescribeAnalysisResult> asyncHandler) {
        final DescribeAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAnalysisResult>() {
            @Override
            public DescribeAnalysisResult call() throws Exception {
                DescribeAnalysisResult result = null;

                try {
                    result = executeDescribeAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAnalysisPermissionsResult> describeAnalysisPermissionsAsync(DescribeAnalysisPermissionsRequest request) {

        return describeAnalysisPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAnalysisPermissionsResult> describeAnalysisPermissionsAsync(final DescribeAnalysisPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAnalysisPermissionsRequest, DescribeAnalysisPermissionsResult> asyncHandler) {
        final DescribeAnalysisPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAnalysisPermissionsResult>() {
            @Override
            public DescribeAnalysisPermissionsResult call() throws Exception {
                DescribeAnalysisPermissionsResult result = null;

                try {
                    result = executeDescribeAnalysisPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(DescribeDashboardRequest request) {

        return describeDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDashboardResult> describeDashboardAsync(final DescribeDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDashboardRequest, DescribeDashboardResult> asyncHandler) {
        final DescribeDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDashboardResult>() {
            @Override
            public DescribeDashboardResult call() throws Exception {
                DescribeDashboardResult result = null;

                try {
                    result = executeDescribeDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDashboardPermissionsResult> describeDashboardPermissionsAsync(DescribeDashboardPermissionsRequest request) {

        return describeDashboardPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDashboardPermissionsResult> describeDashboardPermissionsAsync(final DescribeDashboardPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDashboardPermissionsRequest, DescribeDashboardPermissionsResult> asyncHandler) {
        final DescribeDashboardPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDashboardPermissionsResult>() {
            @Override
            public DescribeDashboardPermissionsResult call() throws Exception {
                DescribeDashboardPermissionsResult result = null;

                try {
                    result = executeDescribeDashboardPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSetResult> describeDataSetAsync(DescribeDataSetRequest request) {

        return describeDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSetResult> describeDataSetAsync(final DescribeDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataSetRequest, DescribeDataSetResult> asyncHandler) {
        final DescribeDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataSetResult>() {
            @Override
            public DescribeDataSetResult call() throws Exception {
                DescribeDataSetResult result = null;

                try {
                    result = executeDescribeDataSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSetPermissionsResult> describeDataSetPermissionsAsync(DescribeDataSetPermissionsRequest request) {

        return describeDataSetPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSetPermissionsResult> describeDataSetPermissionsAsync(final DescribeDataSetPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataSetPermissionsRequest, DescribeDataSetPermissionsResult> asyncHandler) {
        final DescribeDataSetPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataSetPermissionsResult>() {
            @Override
            public DescribeDataSetPermissionsResult call() throws Exception {
                DescribeDataSetPermissionsResult result = null;

                try {
                    result = executeDescribeDataSetPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(DescribeDataSourceRequest request) {

        return describeDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourceResult> describeDataSourceAsync(final DescribeDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataSourceRequest, DescribeDataSourceResult> asyncHandler) {
        final DescribeDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataSourceResult>() {
            @Override
            public DescribeDataSourceResult call() throws Exception {
                DescribeDataSourceResult result = null;

                try {
                    result = executeDescribeDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourcePermissionsResult> describeDataSourcePermissionsAsync(DescribeDataSourcePermissionsRequest request) {

        return describeDataSourcePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDataSourcePermissionsResult> describeDataSourcePermissionsAsync(
            final DescribeDataSourcePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDataSourcePermissionsRequest, DescribeDataSourcePermissionsResult> asyncHandler) {
        final DescribeDataSourcePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDataSourcePermissionsResult>() {
            @Override
            public DescribeDataSourcePermissionsResult call() throws Exception {
                DescribeDataSourcePermissionsResult result = null;

                try {
                    result = executeDescribeDataSourcePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest request) {

        return describeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(final DescribeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler) {
        final DescribeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGroupResult>() {
            @Override
            public DescribeGroupResult call() throws Exception {
                DescribeGroupResult result = null;

                try {
                    result = executeDescribeGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeIAMPolicyAssignmentResult> describeIAMPolicyAssignmentAsync(DescribeIAMPolicyAssignmentRequest request) {

        return describeIAMPolicyAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIAMPolicyAssignmentResult> describeIAMPolicyAssignmentAsync(final DescribeIAMPolicyAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIAMPolicyAssignmentRequest, DescribeIAMPolicyAssignmentResult> asyncHandler) {
        final DescribeIAMPolicyAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIAMPolicyAssignmentResult>() {
            @Override
            public DescribeIAMPolicyAssignmentResult call() throws Exception {
                DescribeIAMPolicyAssignmentResult result = null;

                try {
                    result = executeDescribeIAMPolicyAssignment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeIngestionResult> describeIngestionAsync(DescribeIngestionRequest request) {

        return describeIngestionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeIngestionResult> describeIngestionAsync(final DescribeIngestionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeIngestionRequest, DescribeIngestionResult> asyncHandler) {
        final DescribeIngestionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeIngestionResult>() {
            @Override
            public DescribeIngestionResult call() throws Exception {
                DescribeIngestionResult result = null;

                try {
                    result = executeDescribeIngestion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(DescribeNamespaceRequest request) {

        return describeNamespaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(final DescribeNamespaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNamespaceRequest, DescribeNamespaceResult> asyncHandler) {
        final DescribeNamespaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNamespaceResult>() {
            @Override
            public DescribeNamespaceResult call() throws Exception {
                DescribeNamespaceResult result = null;

                try {
                    result = executeDescribeNamespace(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTemplateResult> describeTemplateAsync(DescribeTemplateRequest request) {

        return describeTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTemplateResult> describeTemplateAsync(final DescribeTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTemplateRequest, DescribeTemplateResult> asyncHandler) {
        final DescribeTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTemplateResult>() {
            @Override
            public DescribeTemplateResult call() throws Exception {
                DescribeTemplateResult result = null;

                try {
                    result = executeDescribeTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTemplateAliasResult> describeTemplateAliasAsync(DescribeTemplateAliasRequest request) {

        return describeTemplateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTemplateAliasResult> describeTemplateAliasAsync(final DescribeTemplateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTemplateAliasRequest, DescribeTemplateAliasResult> asyncHandler) {
        final DescribeTemplateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTemplateAliasResult>() {
            @Override
            public DescribeTemplateAliasResult call() throws Exception {
                DescribeTemplateAliasResult result = null;

                try {
                    result = executeDescribeTemplateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeTemplatePermissionsResult> describeTemplatePermissionsAsync(DescribeTemplatePermissionsRequest request) {

        return describeTemplatePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTemplatePermissionsResult> describeTemplatePermissionsAsync(final DescribeTemplatePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTemplatePermissionsRequest, DescribeTemplatePermissionsResult> asyncHandler) {
        final DescribeTemplatePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTemplatePermissionsResult>() {
            @Override
            public DescribeTemplatePermissionsResult call() throws Exception {
                DescribeTemplatePermissionsResult result = null;

                try {
                    result = executeDescribeTemplatePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeThemeResult> describeThemeAsync(DescribeThemeRequest request) {

        return describeThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThemeResult> describeThemeAsync(final DescribeThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThemeRequest, DescribeThemeResult> asyncHandler) {
        final DescribeThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThemeResult>() {
            @Override
            public DescribeThemeResult call() throws Exception {
                DescribeThemeResult result = null;

                try {
                    result = executeDescribeTheme(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeThemeAliasResult> describeThemeAliasAsync(DescribeThemeAliasRequest request) {

        return describeThemeAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThemeAliasResult> describeThemeAliasAsync(final DescribeThemeAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThemeAliasRequest, DescribeThemeAliasResult> asyncHandler) {
        final DescribeThemeAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThemeAliasResult>() {
            @Override
            public DescribeThemeAliasResult call() throws Exception {
                DescribeThemeAliasResult result = null;

                try {
                    result = executeDescribeThemeAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeThemePermissionsResult> describeThemePermissionsAsync(DescribeThemePermissionsRequest request) {

        return describeThemePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThemePermissionsResult> describeThemePermissionsAsync(final DescribeThemePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThemePermissionsRequest, DescribeThemePermissionsResult> asyncHandler) {
        final DescribeThemePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThemePermissionsResult>() {
            @Override
            public DescribeThemePermissionsResult call() throws Exception {
                DescribeThemePermissionsResult result = null;

                try {
                    result = executeDescribeThemePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDashboardEmbedUrlResult> getDashboardEmbedUrlAsync(GetDashboardEmbedUrlRequest request) {

        return getDashboardEmbedUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDashboardEmbedUrlResult> getDashboardEmbedUrlAsync(final GetDashboardEmbedUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDashboardEmbedUrlRequest, GetDashboardEmbedUrlResult> asyncHandler) {
        final GetDashboardEmbedUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDashboardEmbedUrlResult>() {
            @Override
            public GetDashboardEmbedUrlResult call() throws Exception {
                GetDashboardEmbedUrlResult result = null;

                try {
                    result = executeGetDashboardEmbedUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSessionEmbedUrlResult> getSessionEmbedUrlAsync(GetSessionEmbedUrlRequest request) {

        return getSessionEmbedUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionEmbedUrlResult> getSessionEmbedUrlAsync(final GetSessionEmbedUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionEmbedUrlRequest, GetSessionEmbedUrlResult> asyncHandler) {
        final GetSessionEmbedUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionEmbedUrlResult>() {
            @Override
            public GetSessionEmbedUrlResult call() throws Exception {
                GetSessionEmbedUrlResult result = null;

                try {
                    result = executeGetSessionEmbedUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAnalysesResult> listAnalysesAsync(ListAnalysesRequest request) {

        return listAnalysesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAnalysesResult> listAnalysesAsync(final ListAnalysesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAnalysesRequest, ListAnalysesResult> asyncHandler) {
        final ListAnalysesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAnalysesResult>() {
            @Override
            public ListAnalysesResult call() throws Exception {
                ListAnalysesResult result = null;

                try {
                    result = executeListAnalyses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDashboardVersionsResult> listDashboardVersionsAsync(ListDashboardVersionsRequest request) {

        return listDashboardVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDashboardVersionsResult> listDashboardVersionsAsync(final ListDashboardVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDashboardVersionsRequest, ListDashboardVersionsResult> asyncHandler) {
        final ListDashboardVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDashboardVersionsResult>() {
            @Override
            public ListDashboardVersionsResult call() throws Exception {
                ListDashboardVersionsResult result = null;

                try {
                    result = executeListDashboardVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(ListDashboardsRequest request) {

        return listDashboardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDashboardsResult> listDashboardsAsync(final ListDashboardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDashboardsRequest, ListDashboardsResult> asyncHandler) {
        final ListDashboardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDashboardsResult>() {
            @Override
            public ListDashboardsResult call() throws Exception {
                ListDashboardsResult result = null;

                try {
                    result = executeListDashboards(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(ListDataSetsRequest request) {

        return listDataSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSetsResult> listDataSetsAsync(final ListDataSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSetsRequest, ListDataSetsResult> asyncHandler) {
        final ListDataSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSetsResult>() {
            @Override
            public ListDataSetsResult call() throws Exception {
                ListDataSetsResult result = null;

                try {
                    result = executeListDataSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest request) {

        return listDataSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(final ListDataSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler) {
        final ListDataSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDataSourcesResult>() {
            @Override
            public ListDataSourcesResult call() throws Exception {
                ListDataSourcesResult result = null;

                try {
                    result = executeListDataSources(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest request) {

        return listGroupMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(final ListGroupMembershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupMembershipsRequest, ListGroupMembershipsResult> asyncHandler) {
        final ListGroupMembershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupMembershipsResult>() {
            @Override
            public ListGroupMembershipsResult call() throws Exception {
                ListGroupMembershipsResult result = null;

                try {
                    result = executeListGroupMemberships(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIAMPolicyAssignmentsResult> listIAMPolicyAssignmentsAsync(ListIAMPolicyAssignmentsRequest request) {

        return listIAMPolicyAssignmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIAMPolicyAssignmentsResult> listIAMPolicyAssignmentsAsync(final ListIAMPolicyAssignmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIAMPolicyAssignmentsRequest, ListIAMPolicyAssignmentsResult> asyncHandler) {
        final ListIAMPolicyAssignmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIAMPolicyAssignmentsResult>() {
            @Override
            public ListIAMPolicyAssignmentsResult call() throws Exception {
                ListIAMPolicyAssignmentsResult result = null;

                try {
                    result = executeListIAMPolicyAssignments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIAMPolicyAssignmentsForUserResult> listIAMPolicyAssignmentsForUserAsync(
            ListIAMPolicyAssignmentsForUserRequest request) {

        return listIAMPolicyAssignmentsForUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIAMPolicyAssignmentsForUserResult> listIAMPolicyAssignmentsForUserAsync(
            final ListIAMPolicyAssignmentsForUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIAMPolicyAssignmentsForUserRequest, ListIAMPolicyAssignmentsForUserResult> asyncHandler) {
        final ListIAMPolicyAssignmentsForUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIAMPolicyAssignmentsForUserResult>() {
            @Override
            public ListIAMPolicyAssignmentsForUserResult call() throws Exception {
                ListIAMPolicyAssignmentsForUserResult result = null;

                try {
                    result = executeListIAMPolicyAssignmentsForUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(ListIngestionsRequest request) {

        return listIngestionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIngestionsResult> listIngestionsAsync(final ListIngestionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIngestionsRequest, ListIngestionsResult> asyncHandler) {
        final ListIngestionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIngestionsResult>() {
            @Override
            public ListIngestionsResult call() throws Exception {
                ListIngestionsResult result = null;

                try {
                    result = executeListIngestions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest request) {

        return listNamespacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(final ListNamespacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNamespacesRequest, ListNamespacesResult> asyncHandler) {
        final ListNamespacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNamespacesResult>() {
            @Override
            public ListNamespacesResult call() throws Exception {
                ListNamespacesResult result = null;

                try {
                    result = executeListNamespaces(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListTemplateAliasesResult> listTemplateAliasesAsync(ListTemplateAliasesRequest request) {

        return listTemplateAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateAliasesResult> listTemplateAliasesAsync(final ListTemplateAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplateAliasesRequest, ListTemplateAliasesResult> asyncHandler) {
        final ListTemplateAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplateAliasesResult>() {
            @Override
            public ListTemplateAliasesResult call() throws Exception {
                ListTemplateAliasesResult result = null;

                try {
                    result = executeListTemplateAliases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTemplateVersionsResult> listTemplateVersionsAsync(ListTemplateVersionsRequest request) {

        return listTemplateVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplateVersionsResult> listTemplateVersionsAsync(final ListTemplateVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplateVersionsRequest, ListTemplateVersionsResult> asyncHandler) {
        final ListTemplateVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplateVersionsResult>() {
            @Override
            public ListTemplateVersionsResult call() throws Exception {
                ListTemplateVersionsResult result = null;

                try {
                    result = executeListTemplateVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest request) {

        return listTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(final ListTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler) {
        final ListTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTemplatesResult>() {
            @Override
            public ListTemplatesResult call() throws Exception {
                ListTemplatesResult result = null;

                try {
                    result = executeListTemplates(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListThemeAliasesResult> listThemeAliasesAsync(ListThemeAliasesRequest request) {

        return listThemeAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThemeAliasesResult> listThemeAliasesAsync(final ListThemeAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThemeAliasesRequest, ListThemeAliasesResult> asyncHandler) {
        final ListThemeAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThemeAliasesResult>() {
            @Override
            public ListThemeAliasesResult call() throws Exception {
                ListThemeAliasesResult result = null;

                try {
                    result = executeListThemeAliases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListThemeVersionsResult> listThemeVersionsAsync(ListThemeVersionsRequest request) {

        return listThemeVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThemeVersionsResult> listThemeVersionsAsync(final ListThemeVersionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThemeVersionsRequest, ListThemeVersionsResult> asyncHandler) {
        final ListThemeVersionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThemeVersionsResult>() {
            @Override
            public ListThemeVersionsResult call() throws Exception {
                ListThemeVersionsResult result = null;

                try {
                    result = executeListThemeVersions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListThemesResult> listThemesAsync(ListThemesRequest request) {

        return listThemesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListThemesResult> listThemesAsync(final ListThemesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListThemesRequest, ListThemesResult> asyncHandler) {
        final ListThemesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListThemesResult>() {
            @Override
            public ListThemesResult call() throws Exception {
                ListThemesResult result = null;

                try {
                    result = executeListThemes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupsResult> listUserGroupsAsync(ListUserGroupsRequest request) {

        return listUserGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupsResult> listUserGroupsAsync(final ListUserGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUserGroupsRequest, ListUserGroupsResult> asyncHandler) {
        final ListUserGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUserGroupsResult>() {
            @Override
            public ListUserGroupsResult call() throws Exception {
                ListUserGroupsResult result = null;

                try {
                    result = executeListUserGroups(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RegisterUserResult> registerUserAsync(RegisterUserRequest request) {

        return registerUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterUserResult> registerUserAsync(final RegisterUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterUserRequest, RegisterUserResult> asyncHandler) {
        final RegisterUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterUserResult>() {
            @Override
            public RegisterUserResult call() throws Exception {
                RegisterUserResult result = null;

                try {
                    result = executeRegisterUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RestoreAnalysisResult> restoreAnalysisAsync(RestoreAnalysisRequest request) {

        return restoreAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreAnalysisResult> restoreAnalysisAsync(final RestoreAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestoreAnalysisRequest, RestoreAnalysisResult> asyncHandler) {
        final RestoreAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestoreAnalysisResult>() {
            @Override
            public RestoreAnalysisResult call() throws Exception {
                RestoreAnalysisResult result = null;

                try {
                    result = executeRestoreAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchAnalysesResult> searchAnalysesAsync(SearchAnalysesRequest request) {

        return searchAnalysesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchAnalysesResult> searchAnalysesAsync(final SearchAnalysesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchAnalysesRequest, SearchAnalysesResult> asyncHandler) {
        final SearchAnalysesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchAnalysesResult>() {
            @Override
            public SearchAnalysesResult call() throws Exception {
                SearchAnalysesResult result = null;

                try {
                    result = executeSearchAnalyses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchDashboardsResult> searchDashboardsAsync(SearchDashboardsRequest request) {

        return searchDashboardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchDashboardsResult> searchDashboardsAsync(final SearchDashboardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchDashboardsRequest, SearchDashboardsResult> asyncHandler) {
        final SearchDashboardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchDashboardsResult>() {
            @Override
            public SearchDashboardsResult call() throws Exception {
                SearchDashboardsResult result = null;

                try {
                    result = executeSearchDashboards(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAccountCustomizationResult> updateAccountCustomizationAsync(UpdateAccountCustomizationRequest request) {

        return updateAccountCustomizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountCustomizationResult> updateAccountCustomizationAsync(final UpdateAccountCustomizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountCustomizationRequest, UpdateAccountCustomizationResult> asyncHandler) {
        final UpdateAccountCustomizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountCustomizationResult>() {
            @Override
            public UpdateAccountCustomizationResult call() throws Exception {
                UpdateAccountCustomizationResult result = null;

                try {
                    result = executeUpdateAccountCustomization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest request) {

        return updateAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(final UpdateAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler) {
        final UpdateAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountSettingsResult>() {
            @Override
            public UpdateAccountSettingsResult call() throws Exception {
                UpdateAccountSettingsResult result = null;

                try {
                    result = executeUpdateAccountSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAnalysisResult> updateAnalysisAsync(UpdateAnalysisRequest request) {

        return updateAnalysisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnalysisResult> updateAnalysisAsync(final UpdateAnalysisRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnalysisRequest, UpdateAnalysisResult> asyncHandler) {
        final UpdateAnalysisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnalysisResult>() {
            @Override
            public UpdateAnalysisResult call() throws Exception {
                UpdateAnalysisResult result = null;

                try {
                    result = executeUpdateAnalysis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAnalysisPermissionsResult> updateAnalysisPermissionsAsync(UpdateAnalysisPermissionsRequest request) {

        return updateAnalysisPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAnalysisPermissionsResult> updateAnalysisPermissionsAsync(final UpdateAnalysisPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAnalysisPermissionsRequest, UpdateAnalysisPermissionsResult> asyncHandler) {
        final UpdateAnalysisPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAnalysisPermissionsResult>() {
            @Override
            public UpdateAnalysisPermissionsResult call() throws Exception {
                UpdateAnalysisPermissionsResult result = null;

                try {
                    result = executeUpdateAnalysisPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(UpdateDashboardRequest request) {

        return updateDashboardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardResult> updateDashboardAsync(final UpdateDashboardRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDashboardRequest, UpdateDashboardResult> asyncHandler) {
        final UpdateDashboardRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDashboardResult>() {
            @Override
            public UpdateDashboardResult call() throws Exception {
                UpdateDashboardResult result = null;

                try {
                    result = executeUpdateDashboard(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardPermissionsResult> updateDashboardPermissionsAsync(UpdateDashboardPermissionsRequest request) {

        return updateDashboardPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardPermissionsResult> updateDashboardPermissionsAsync(final UpdateDashboardPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDashboardPermissionsRequest, UpdateDashboardPermissionsResult> asyncHandler) {
        final UpdateDashboardPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDashboardPermissionsResult>() {
            @Override
            public UpdateDashboardPermissionsResult call() throws Exception {
                UpdateDashboardPermissionsResult result = null;

                try {
                    result = executeUpdateDashboardPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardPublishedVersionResult> updateDashboardPublishedVersionAsync(
            UpdateDashboardPublishedVersionRequest request) {

        return updateDashboardPublishedVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDashboardPublishedVersionResult> updateDashboardPublishedVersionAsync(
            final UpdateDashboardPublishedVersionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDashboardPublishedVersionRequest, UpdateDashboardPublishedVersionResult> asyncHandler) {
        final UpdateDashboardPublishedVersionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDashboardPublishedVersionResult>() {
            @Override
            public UpdateDashboardPublishedVersionResult call() throws Exception {
                UpdateDashboardPublishedVersionResult result = null;

                try {
                    result = executeUpdateDashboardPublishedVersion(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(UpdateDataSetRequest request) {

        return updateDataSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSetResult> updateDataSetAsync(final UpdateDataSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSetRequest, UpdateDataSetResult> asyncHandler) {
        final UpdateDataSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSetResult>() {
            @Override
            public UpdateDataSetResult call() throws Exception {
                UpdateDataSetResult result = null;

                try {
                    result = executeUpdateDataSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSetPermissionsResult> updateDataSetPermissionsAsync(UpdateDataSetPermissionsRequest request) {

        return updateDataSetPermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSetPermissionsResult> updateDataSetPermissionsAsync(final UpdateDataSetPermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSetPermissionsRequest, UpdateDataSetPermissionsResult> asyncHandler) {
        final UpdateDataSetPermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSetPermissionsResult>() {
            @Override
            public UpdateDataSetPermissionsResult call() throws Exception {
                UpdateDataSetPermissionsResult result = null;

                try {
                    result = executeUpdateDataSetPermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest request) {

        return updateDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(final UpdateDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler) {
        final UpdateDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSourceResult>() {
            @Override
            public UpdateDataSourceResult call() throws Exception {
                UpdateDataSourceResult result = null;

                try {
                    result = executeUpdateDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourcePermissionsResult> updateDataSourcePermissionsAsync(UpdateDataSourcePermissionsRequest request) {

        return updateDataSourcePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDataSourcePermissionsResult> updateDataSourcePermissionsAsync(final UpdateDataSourcePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDataSourcePermissionsRequest, UpdateDataSourcePermissionsResult> asyncHandler) {
        final UpdateDataSourcePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDataSourcePermissionsResult>() {
            @Override
            public UpdateDataSourcePermissionsResult call() throws Exception {
                UpdateDataSourcePermissionsResult result = null;

                try {
                    result = executeUpdateDataSourcePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(final UpdateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {
        final UpdateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGroupResult>() {
            @Override
            public UpdateGroupResult call() throws Exception {
                UpdateGroupResult result = null;

                try {
                    result = executeUpdateGroup(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateIAMPolicyAssignmentResult> updateIAMPolicyAssignmentAsync(UpdateIAMPolicyAssignmentRequest request) {

        return updateIAMPolicyAssignmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIAMPolicyAssignmentResult> updateIAMPolicyAssignmentAsync(final UpdateIAMPolicyAssignmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIAMPolicyAssignmentRequest, UpdateIAMPolicyAssignmentResult> asyncHandler) {
        final UpdateIAMPolicyAssignmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIAMPolicyAssignmentResult>() {
            @Override
            public UpdateIAMPolicyAssignmentResult call() throws Exception {
                UpdateIAMPolicyAssignmentResult result = null;

                try {
                    result = executeUpdateIAMPolicyAssignment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(UpdateTemplateRequest request) {

        return updateTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateResult> updateTemplateAsync(final UpdateTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTemplateRequest, UpdateTemplateResult> asyncHandler) {
        final UpdateTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTemplateResult>() {
            @Override
            public UpdateTemplateResult call() throws Exception {
                UpdateTemplateResult result = null;

                try {
                    result = executeUpdateTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateAliasResult> updateTemplateAliasAsync(UpdateTemplateAliasRequest request) {

        return updateTemplateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplateAliasResult> updateTemplateAliasAsync(final UpdateTemplateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTemplateAliasRequest, UpdateTemplateAliasResult> asyncHandler) {
        final UpdateTemplateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTemplateAliasResult>() {
            @Override
            public UpdateTemplateAliasResult call() throws Exception {
                UpdateTemplateAliasResult result = null;

                try {
                    result = executeUpdateTemplateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplatePermissionsResult> updateTemplatePermissionsAsync(UpdateTemplatePermissionsRequest request) {

        return updateTemplatePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTemplatePermissionsResult> updateTemplatePermissionsAsync(final UpdateTemplatePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTemplatePermissionsRequest, UpdateTemplatePermissionsResult> asyncHandler) {
        final UpdateTemplatePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTemplatePermissionsResult>() {
            @Override
            public UpdateTemplatePermissionsResult call() throws Exception {
                UpdateTemplatePermissionsResult result = null;

                try {
                    result = executeUpdateTemplatePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(UpdateThemeRequest request) {

        return updateThemeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThemeResult> updateThemeAsync(final UpdateThemeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThemeRequest, UpdateThemeResult> asyncHandler) {
        final UpdateThemeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThemeResult>() {
            @Override
            public UpdateThemeResult call() throws Exception {
                UpdateThemeResult result = null;

                try {
                    result = executeUpdateTheme(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateThemeAliasResult> updateThemeAliasAsync(UpdateThemeAliasRequest request) {

        return updateThemeAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThemeAliasResult> updateThemeAliasAsync(final UpdateThemeAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThemeAliasRequest, UpdateThemeAliasResult> asyncHandler) {
        final UpdateThemeAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThemeAliasResult>() {
            @Override
            public UpdateThemeAliasResult call() throws Exception {
                UpdateThemeAliasResult result = null;

                try {
                    result = executeUpdateThemeAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateThemePermissionsResult> updateThemePermissionsAsync(UpdateThemePermissionsRequest request) {

        return updateThemePermissionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThemePermissionsResult> updateThemePermissionsAsync(final UpdateThemePermissionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateThemePermissionsRequest, UpdateThemePermissionsResult> asyncHandler) {
        final UpdateThemePermissionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateThemePermissionsResult>() {
            @Override
            public UpdateThemePermissionsResult call() throws Exception {
                UpdateThemePermissionsResult result = null;

                try {
                    result = executeUpdateThemePermissions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(final UpdateUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {
        final UpdateUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateUserResult>() {
            @Override
            public UpdateUserResult call() throws Exception {
                UpdateUserResult result = null;

                try {
                    result = executeUpdateUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
