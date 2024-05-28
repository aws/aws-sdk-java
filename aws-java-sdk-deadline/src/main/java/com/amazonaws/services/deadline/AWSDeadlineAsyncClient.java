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
package com.amazonaws.services.deadline;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSDeadlineCloud asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon Web Services Deadline Cloud API provides infrastructure and centralized management for your projects. Use
 * the Deadline Cloud API to onboard users, assign projects, and attach permissions specific to their job function.
 * </p>
 * <p>
 * With Deadline Cloud, content production teams can deploy resources for their workforce securely in the cloud,
 * reducing the costs of added physical infrastructure. Keep your content production operations secure, while allowing
 * your contributors to access the tools they need, such as scalable high-speed storage, licenses, and cost management
 * services.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSDeadlineAsyncClient extends AWSDeadlineClient implements AWSDeadlineAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSDeadlineAsyncClientBuilder asyncBuilder() {
        return AWSDeadlineAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSDeadlineCloud using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSDeadlineAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSDeadlineCloud using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSDeadlineAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateMemberToFarmResult> associateMemberToFarmAsync(AssociateMemberToFarmRequest request) {

        return associateMemberToFarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToFarmResult> associateMemberToFarmAsync(final AssociateMemberToFarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateMemberToFarmRequest, AssociateMemberToFarmResult> asyncHandler) {
        final AssociateMemberToFarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateMemberToFarmResult>() {
            @Override
            public AssociateMemberToFarmResult call() throws Exception {
                AssociateMemberToFarmResult result = null;

                try {
                    result = executeAssociateMemberToFarm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToFleetResult> associateMemberToFleetAsync(AssociateMemberToFleetRequest request) {

        return associateMemberToFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToFleetResult> associateMemberToFleetAsync(final AssociateMemberToFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateMemberToFleetRequest, AssociateMemberToFleetResult> asyncHandler) {
        final AssociateMemberToFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateMemberToFleetResult>() {
            @Override
            public AssociateMemberToFleetResult call() throws Exception {
                AssociateMemberToFleetResult result = null;

                try {
                    result = executeAssociateMemberToFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToJobResult> associateMemberToJobAsync(AssociateMemberToJobRequest request) {

        return associateMemberToJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToJobResult> associateMemberToJobAsync(final AssociateMemberToJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateMemberToJobRequest, AssociateMemberToJobResult> asyncHandler) {
        final AssociateMemberToJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateMemberToJobResult>() {
            @Override
            public AssociateMemberToJobResult call() throws Exception {
                AssociateMemberToJobResult result = null;

                try {
                    result = executeAssociateMemberToJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToQueueResult> associateMemberToQueueAsync(AssociateMemberToQueueRequest request) {

        return associateMemberToQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateMemberToQueueResult> associateMemberToQueueAsync(final AssociateMemberToQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateMemberToQueueRequest, AssociateMemberToQueueResult> asyncHandler) {
        final AssociateMemberToQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateMemberToQueueResult>() {
            @Override
            public AssociateMemberToQueueResult call() throws Exception {
                AssociateMemberToQueueResult result = null;

                try {
                    result = executeAssociateMemberToQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssumeFleetRoleForReadResult> assumeFleetRoleForReadAsync(AssumeFleetRoleForReadRequest request) {

        return assumeFleetRoleForReadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeFleetRoleForReadResult> assumeFleetRoleForReadAsync(final AssumeFleetRoleForReadRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeFleetRoleForReadRequest, AssumeFleetRoleForReadResult> asyncHandler) {
        final AssumeFleetRoleForReadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeFleetRoleForReadResult>() {
            @Override
            public AssumeFleetRoleForReadResult call() throws Exception {
                AssumeFleetRoleForReadResult result = null;

                try {
                    result = executeAssumeFleetRoleForRead(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssumeFleetRoleForWorkerResult> assumeFleetRoleForWorkerAsync(AssumeFleetRoleForWorkerRequest request) {

        return assumeFleetRoleForWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeFleetRoleForWorkerResult> assumeFleetRoleForWorkerAsync(final AssumeFleetRoleForWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeFleetRoleForWorkerRequest, AssumeFleetRoleForWorkerResult> asyncHandler) {
        final AssumeFleetRoleForWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeFleetRoleForWorkerResult>() {
            @Override
            public AssumeFleetRoleForWorkerResult call() throws Exception {
                AssumeFleetRoleForWorkerResult result = null;

                try {
                    result = executeAssumeFleetRoleForWorker(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssumeQueueRoleForReadResult> assumeQueueRoleForReadAsync(AssumeQueueRoleForReadRequest request) {

        return assumeQueueRoleForReadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeQueueRoleForReadResult> assumeQueueRoleForReadAsync(final AssumeQueueRoleForReadRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeQueueRoleForReadRequest, AssumeQueueRoleForReadResult> asyncHandler) {
        final AssumeQueueRoleForReadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeQueueRoleForReadResult>() {
            @Override
            public AssumeQueueRoleForReadResult call() throws Exception {
                AssumeQueueRoleForReadResult result = null;

                try {
                    result = executeAssumeQueueRoleForRead(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssumeQueueRoleForUserResult> assumeQueueRoleForUserAsync(AssumeQueueRoleForUserRequest request) {

        return assumeQueueRoleForUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeQueueRoleForUserResult> assumeQueueRoleForUserAsync(final AssumeQueueRoleForUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeQueueRoleForUserRequest, AssumeQueueRoleForUserResult> asyncHandler) {
        final AssumeQueueRoleForUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeQueueRoleForUserResult>() {
            @Override
            public AssumeQueueRoleForUserResult call() throws Exception {
                AssumeQueueRoleForUserResult result = null;

                try {
                    result = executeAssumeQueueRoleForUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<AssumeQueueRoleForWorkerResult> assumeQueueRoleForWorkerAsync(AssumeQueueRoleForWorkerRequest request) {

        return assumeQueueRoleForWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeQueueRoleForWorkerResult> assumeQueueRoleForWorkerAsync(final AssumeQueueRoleForWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeQueueRoleForWorkerRequest, AssumeQueueRoleForWorkerResult> asyncHandler) {
        final AssumeQueueRoleForWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssumeQueueRoleForWorkerResult>() {
            @Override
            public AssumeQueueRoleForWorkerResult call() throws Exception {
                AssumeQueueRoleForWorkerResult result = null;

                try {
                    result = executeAssumeQueueRoleForWorker(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetJobEntityResult> batchGetJobEntityAsync(BatchGetJobEntityRequest request) {

        return batchGetJobEntityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetJobEntityResult> batchGetJobEntityAsync(final BatchGetJobEntityRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetJobEntityRequest, BatchGetJobEntityResult> asyncHandler) {
        final BatchGetJobEntityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetJobEntityResult>() {
            @Override
            public BatchGetJobEntityResult call() throws Exception {
                BatchGetJobEntityResult result = null;

                try {
                    result = executeBatchGetJobEntity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CopyJobTemplateResult> copyJobTemplateAsync(CopyJobTemplateRequest request) {

        return copyJobTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyJobTemplateResult> copyJobTemplateAsync(final CopyJobTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CopyJobTemplateRequest, CopyJobTemplateResult> asyncHandler) {
        final CopyJobTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CopyJobTemplateResult>() {
            @Override
            public CopyJobTemplateResult call() throws Exception {
                CopyJobTemplateResult result = null;

                try {
                    result = executeCopyJobTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(CreateBudgetRequest request) {

        return createBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBudgetResult> createBudgetAsync(final CreateBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBudgetRequest, CreateBudgetResult> asyncHandler) {
        final CreateBudgetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBudgetResult>() {
            @Override
            public CreateBudgetResult call() throws Exception {
                CreateBudgetResult result = null;

                try {
                    result = executeCreateBudget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFarmResult> createFarmAsync(CreateFarmRequest request) {

        return createFarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFarmResult> createFarmAsync(final CreateFarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFarmRequest, CreateFarmResult> asyncHandler) {
        final CreateFarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFarmResult>() {
            @Override
            public CreateFarmResult call() throws Exception {
                CreateFarmResult result = null;

                try {
                    result = executeCreateFarm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {
        final CreateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result = null;

                try {
                    result = executeCreateFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(final CreateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {
        final CreateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateJobResult>() {
            @Override
            public CreateJobResult call() throws Exception {
                CreateJobResult result = null;

                try {
                    result = executeCreateJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseEndpointResult> createLicenseEndpointAsync(CreateLicenseEndpointRequest request) {

        return createLicenseEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLicenseEndpointResult> createLicenseEndpointAsync(final CreateLicenseEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLicenseEndpointRequest, CreateLicenseEndpointResult> asyncHandler) {
        final CreateLicenseEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLicenseEndpointResult>() {
            @Override
            public CreateLicenseEndpointResult call() throws Exception {
                CreateLicenseEndpointResult result = null;

                try {
                    result = executeCreateLicenseEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest request) {

        return createMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(final CreateMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler) {
        final CreateMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMonitorResult>() {
            @Override
            public CreateMonitorResult call() throws Exception {
                CreateMonitorResult result = null;

                try {
                    result = executeCreateMonitor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(CreateQueueRequest request) {

        return createQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueResult> createQueueAsync(final CreateQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler) {
        final CreateQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueueResult>() {
            @Override
            public CreateQueueResult call() throws Exception {
                CreateQueueResult result = null;

                try {
                    result = executeCreateQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateQueueEnvironmentResult> createQueueEnvironmentAsync(CreateQueueEnvironmentRequest request) {

        return createQueueEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueEnvironmentResult> createQueueEnvironmentAsync(final CreateQueueEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueueEnvironmentRequest, CreateQueueEnvironmentResult> asyncHandler) {
        final CreateQueueEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueueEnvironmentResult>() {
            @Override
            public CreateQueueEnvironmentResult call() throws Exception {
                CreateQueueEnvironmentResult result = null;

                try {
                    result = executeCreateQueueEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateQueueFleetAssociationResult> createQueueFleetAssociationAsync(CreateQueueFleetAssociationRequest request) {

        return createQueueFleetAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateQueueFleetAssociationResult> createQueueFleetAssociationAsync(final CreateQueueFleetAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateQueueFleetAssociationRequest, CreateQueueFleetAssociationResult> asyncHandler) {
        final CreateQueueFleetAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateQueueFleetAssociationResult>() {
            @Override
            public CreateQueueFleetAssociationResult call() throws Exception {
                CreateQueueFleetAssociationResult result = null;

                try {
                    result = executeCreateQueueFleetAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStorageProfileResult> createStorageProfileAsync(CreateStorageProfileRequest request) {

        return createStorageProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorageProfileResult> createStorageProfileAsync(final CreateStorageProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStorageProfileRequest, CreateStorageProfileResult> asyncHandler) {
        final CreateStorageProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStorageProfileResult>() {
            @Override
            public CreateStorageProfileResult call() throws Exception {
                CreateStorageProfileResult result = null;

                try {
                    result = executeCreateStorageProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(CreateWorkerRequest request) {

        return createWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWorkerResult> createWorkerAsync(final CreateWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWorkerRequest, CreateWorkerResult> asyncHandler) {
        final CreateWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWorkerResult>() {
            @Override
            public CreateWorkerResult call() throws Exception {
                CreateWorkerResult result = null;

                try {
                    result = executeCreateWorker(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(DeleteBudgetRequest request) {

        return deleteBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBudgetResult> deleteBudgetAsync(final DeleteBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBudgetRequest, DeleteBudgetResult> asyncHandler) {
        final DeleteBudgetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBudgetResult>() {
            @Override
            public DeleteBudgetResult call() throws Exception {
                DeleteBudgetResult result = null;

                try {
                    result = executeDeleteBudget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFarmResult> deleteFarmAsync(DeleteFarmRequest request) {

        return deleteFarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFarmResult> deleteFarmAsync(final DeleteFarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFarmRequest, DeleteFarmResult> asyncHandler) {
        final DeleteFarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFarmResult>() {
            @Override
            public DeleteFarmResult call() throws Exception {
                DeleteFarmResult result = null;

                try {
                    result = executeDeleteFarm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(final DeleteFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {
        final DeleteFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetResult>() {
            @Override
            public DeleteFleetResult call() throws Exception {
                DeleteFleetResult result = null;

                try {
                    result = executeDeleteFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLicenseEndpointResult> deleteLicenseEndpointAsync(DeleteLicenseEndpointRequest request) {

        return deleteLicenseEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLicenseEndpointResult> deleteLicenseEndpointAsync(final DeleteLicenseEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLicenseEndpointRequest, DeleteLicenseEndpointResult> asyncHandler) {
        final DeleteLicenseEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLicenseEndpointResult>() {
            @Override
            public DeleteLicenseEndpointResult call() throws Exception {
                DeleteLicenseEndpointResult result = null;

                try {
                    result = executeDeleteLicenseEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMeteredProductResult> deleteMeteredProductAsync(DeleteMeteredProductRequest request) {

        return deleteMeteredProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMeteredProductResult> deleteMeteredProductAsync(final DeleteMeteredProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMeteredProductRequest, DeleteMeteredProductResult> asyncHandler) {
        final DeleteMeteredProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMeteredProductResult>() {
            @Override
            public DeleteMeteredProductResult call() throws Exception {
                DeleteMeteredProductResult result = null;

                try {
                    result = executeDeleteMeteredProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest request) {

        return deleteMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(final DeleteMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler) {
        final DeleteMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMonitorResult>() {
            @Override
            public DeleteMonitorResult call() throws Exception {
                DeleteMonitorResult result = null;

                try {
                    result = executeDeleteMonitor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(DeleteQueueRequest request) {

        return deleteQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueResult> deleteQueueAsync(final DeleteQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, DeleteQueueResult> asyncHandler) {
        final DeleteQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQueueResult>() {
            @Override
            public DeleteQueueResult call() throws Exception {
                DeleteQueueResult result = null;

                try {
                    result = executeDeleteQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueEnvironmentResult> deleteQueueEnvironmentAsync(DeleteQueueEnvironmentRequest request) {

        return deleteQueueEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueEnvironmentResult> deleteQueueEnvironmentAsync(final DeleteQueueEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQueueEnvironmentRequest, DeleteQueueEnvironmentResult> asyncHandler) {
        final DeleteQueueEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQueueEnvironmentResult>() {
            @Override
            public DeleteQueueEnvironmentResult call() throws Exception {
                DeleteQueueEnvironmentResult result = null;

                try {
                    result = executeDeleteQueueEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueFleetAssociationResult> deleteQueueFleetAssociationAsync(DeleteQueueFleetAssociationRequest request) {

        return deleteQueueFleetAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteQueueFleetAssociationResult> deleteQueueFleetAssociationAsync(final DeleteQueueFleetAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteQueueFleetAssociationRequest, DeleteQueueFleetAssociationResult> asyncHandler) {
        final DeleteQueueFleetAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteQueueFleetAssociationResult>() {
            @Override
            public DeleteQueueFleetAssociationResult call() throws Exception {
                DeleteQueueFleetAssociationResult result = null;

                try {
                    result = executeDeleteQueueFleetAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageProfileResult> deleteStorageProfileAsync(DeleteStorageProfileRequest request) {

        return deleteStorageProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageProfileResult> deleteStorageProfileAsync(final DeleteStorageProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStorageProfileRequest, DeleteStorageProfileResult> asyncHandler) {
        final DeleteStorageProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStorageProfileResult>() {
            @Override
            public DeleteStorageProfileResult call() throws Exception {
                DeleteStorageProfileResult result = null;

                try {
                    result = executeDeleteStorageProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(DeleteWorkerRequest request) {

        return deleteWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWorkerResult> deleteWorkerAsync(final DeleteWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWorkerRequest, DeleteWorkerResult> asyncHandler) {
        final DeleteWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWorkerResult>() {
            @Override
            public DeleteWorkerResult call() throws Exception {
                DeleteWorkerResult result = null;

                try {
                    result = executeDeleteWorker(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromFarmResult> disassociateMemberFromFarmAsync(DisassociateMemberFromFarmRequest request) {

        return disassociateMemberFromFarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromFarmResult> disassociateMemberFromFarmAsync(final DisassociateMemberFromFarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromFarmRequest, DisassociateMemberFromFarmResult> asyncHandler) {
        final DisassociateMemberFromFarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMemberFromFarmResult>() {
            @Override
            public DisassociateMemberFromFarmResult call() throws Exception {
                DisassociateMemberFromFarmResult result = null;

                try {
                    result = executeDisassociateMemberFromFarm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromFleetResult> disassociateMemberFromFleetAsync(DisassociateMemberFromFleetRequest request) {

        return disassociateMemberFromFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromFleetResult> disassociateMemberFromFleetAsync(final DisassociateMemberFromFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromFleetRequest, DisassociateMemberFromFleetResult> asyncHandler) {
        final DisassociateMemberFromFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMemberFromFleetResult>() {
            @Override
            public DisassociateMemberFromFleetResult call() throws Exception {
                DisassociateMemberFromFleetResult result = null;

                try {
                    result = executeDisassociateMemberFromFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromJobResult> disassociateMemberFromJobAsync(DisassociateMemberFromJobRequest request) {

        return disassociateMemberFromJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromJobResult> disassociateMemberFromJobAsync(final DisassociateMemberFromJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromJobRequest, DisassociateMemberFromJobResult> asyncHandler) {
        final DisassociateMemberFromJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMemberFromJobResult>() {
            @Override
            public DisassociateMemberFromJobResult call() throws Exception {
                DisassociateMemberFromJobResult result = null;

                try {
                    result = executeDisassociateMemberFromJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromQueueResult> disassociateMemberFromQueueAsync(DisassociateMemberFromQueueRequest request) {

        return disassociateMemberFromQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMemberFromQueueResult> disassociateMemberFromQueueAsync(final DisassociateMemberFromQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMemberFromQueueRequest, DisassociateMemberFromQueueResult> asyncHandler) {
        final DisassociateMemberFromQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMemberFromQueueResult>() {
            @Override
            public DisassociateMemberFromQueueResult call() throws Exception {
                DisassociateMemberFromQueueResult result = null;

                try {
                    result = executeDisassociateMemberFromQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBudgetResult> getBudgetAsync(GetBudgetRequest request) {

        return getBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBudgetResult> getBudgetAsync(final GetBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBudgetRequest, GetBudgetResult> asyncHandler) {
        final GetBudgetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBudgetResult>() {
            @Override
            public GetBudgetResult call() throws Exception {
                GetBudgetResult result = null;

                try {
                    result = executeGetBudget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFarmResult> getFarmAsync(GetFarmRequest request) {

        return getFarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFarmResult> getFarmAsync(final GetFarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFarmRequest, GetFarmResult> asyncHandler) {
        final GetFarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFarmResult>() {
            @Override
            public GetFarmResult call() throws Exception {
                GetFarmResult result = null;

                try {
                    result = executeGetFarm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFleetResult> getFleetAsync(GetFleetRequest request) {

        return getFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFleetResult> getFleetAsync(final GetFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFleetRequest, GetFleetResult> asyncHandler) {
        final GetFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFleetResult>() {
            @Override
            public GetFleetResult call() throws Exception {
                GetFleetResult result = null;

                try {
                    result = executeGetFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(GetJobRequest request) {

        return getJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobResult> getJobAsync(final GetJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobRequest, GetJobResult> asyncHandler) {
        final GetJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobResult>() {
            @Override
            public GetJobResult call() throws Exception {
                GetJobResult result = null;

                try {
                    result = executeGetJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLicenseEndpointResult> getLicenseEndpointAsync(GetLicenseEndpointRequest request) {

        return getLicenseEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLicenseEndpointResult> getLicenseEndpointAsync(final GetLicenseEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLicenseEndpointRequest, GetLicenseEndpointResult> asyncHandler) {
        final GetLicenseEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLicenseEndpointResult>() {
            @Override
            public GetLicenseEndpointResult call() throws Exception {
                GetLicenseEndpointResult result = null;

                try {
                    result = executeGetLicenseEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(GetMonitorRequest request) {

        return getMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMonitorResult> getMonitorAsync(final GetMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMonitorRequest, GetMonitorResult> asyncHandler) {
        final GetMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMonitorResult>() {
            @Override
            public GetMonitorResult call() throws Exception {
                GetMonitorResult result = null;

                try {
                    result = executeGetMonitor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQueueResult> getQueueAsync(GetQueueRequest request) {

        return getQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueResult> getQueueAsync(final GetQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueueRequest, GetQueueResult> asyncHandler) {
        final GetQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueueResult>() {
            @Override
            public GetQueueResult call() throws Exception {
                GetQueueResult result = null;

                try {
                    result = executeGetQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQueueEnvironmentResult> getQueueEnvironmentAsync(GetQueueEnvironmentRequest request) {

        return getQueueEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueEnvironmentResult> getQueueEnvironmentAsync(final GetQueueEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueueEnvironmentRequest, GetQueueEnvironmentResult> asyncHandler) {
        final GetQueueEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueueEnvironmentResult>() {
            @Override
            public GetQueueEnvironmentResult call() throws Exception {
                GetQueueEnvironmentResult result = null;

                try {
                    result = executeGetQueueEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetQueueFleetAssociationResult> getQueueFleetAssociationAsync(GetQueueFleetAssociationRequest request) {

        return getQueueFleetAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueueFleetAssociationResult> getQueueFleetAssociationAsync(final GetQueueFleetAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetQueueFleetAssociationRequest, GetQueueFleetAssociationResult> asyncHandler) {
        final GetQueueFleetAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetQueueFleetAssociationResult>() {
            @Override
            public GetQueueFleetAssociationResult call() throws Exception {
                GetQueueFleetAssociationResult result = null;

                try {
                    result = executeGetQueueFleetAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request) {

        return getSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(final GetSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler) {
        final GetSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionResult>() {
            @Override
            public GetSessionResult call() throws Exception {
                GetSessionResult result = null;

                try {
                    result = executeGetSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSessionActionResult> getSessionActionAsync(GetSessionActionRequest request) {

        return getSessionActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionActionResult> getSessionActionAsync(final GetSessionActionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionActionRequest, GetSessionActionResult> asyncHandler) {
        final GetSessionActionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionActionResult>() {
            @Override
            public GetSessionActionResult call() throws Exception {
                GetSessionActionResult result = null;

                try {
                    result = executeGetSessionAction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSessionsStatisticsAggregationResult> getSessionsStatisticsAggregationAsync(
            GetSessionsStatisticsAggregationRequest request) {

        return getSessionsStatisticsAggregationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionsStatisticsAggregationResult> getSessionsStatisticsAggregationAsync(
            final GetSessionsStatisticsAggregationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionsStatisticsAggregationRequest, GetSessionsStatisticsAggregationResult> asyncHandler) {
        final GetSessionsStatisticsAggregationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSessionsStatisticsAggregationResult>() {
            @Override
            public GetSessionsStatisticsAggregationResult call() throws Exception {
                GetSessionsStatisticsAggregationResult result = null;

                try {
                    result = executeGetSessionsStatisticsAggregation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStepResult> getStepAsync(GetStepRequest request) {

        return getStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStepResult> getStepAsync(final GetStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStepRequest, GetStepResult> asyncHandler) {
        final GetStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStepResult>() {
            @Override
            public GetStepResult call() throws Exception {
                GetStepResult result = null;

                try {
                    result = executeGetStep(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStorageProfileResult> getStorageProfileAsync(GetStorageProfileRequest request) {

        return getStorageProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStorageProfileResult> getStorageProfileAsync(final GetStorageProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStorageProfileRequest, GetStorageProfileResult> asyncHandler) {
        final GetStorageProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStorageProfileResult>() {
            @Override
            public GetStorageProfileResult call() throws Exception {
                GetStorageProfileResult result = null;

                try {
                    result = executeGetStorageProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStorageProfileForQueueResult> getStorageProfileForQueueAsync(GetStorageProfileForQueueRequest request) {

        return getStorageProfileForQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStorageProfileForQueueResult> getStorageProfileForQueueAsync(final GetStorageProfileForQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStorageProfileForQueueRequest, GetStorageProfileForQueueResult> asyncHandler) {
        final GetStorageProfileForQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStorageProfileForQueueResult>() {
            @Override
            public GetStorageProfileForQueueResult call() throws Exception {
                GetStorageProfileForQueueResult result = null;

                try {
                    result = executeGetStorageProfileForQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTaskResult> getTaskAsync(GetTaskRequest request) {

        return getTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTaskResult> getTaskAsync(final GetTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTaskRequest, GetTaskResult> asyncHandler) {
        final GetTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTaskResult>() {
            @Override
            public GetTaskResult call() throws Exception {
                GetTaskResult result = null;

                try {
                    result = executeGetTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(GetWorkerRequest request) {

        return getWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWorkerResult> getWorkerAsync(final GetWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWorkerRequest, GetWorkerResult> asyncHandler) {
        final GetWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWorkerResult>() {
            @Override
            public GetWorkerResult call() throws Exception {
                GetWorkerResult result = null;

                try {
                    result = executeGetWorker(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAvailableMeteredProductsResult> listAvailableMeteredProductsAsync(ListAvailableMeteredProductsRequest request) {

        return listAvailableMeteredProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableMeteredProductsResult> listAvailableMeteredProductsAsync(final ListAvailableMeteredProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAvailableMeteredProductsRequest, ListAvailableMeteredProductsResult> asyncHandler) {
        final ListAvailableMeteredProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAvailableMeteredProductsResult>() {
            @Override
            public ListAvailableMeteredProductsResult call() throws Exception {
                ListAvailableMeteredProductsResult result = null;

                try {
                    result = executeListAvailableMeteredProducts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBudgetsResult> listBudgetsAsync(ListBudgetsRequest request) {

        return listBudgetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBudgetsResult> listBudgetsAsync(final ListBudgetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBudgetsRequest, ListBudgetsResult> asyncHandler) {
        final ListBudgetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBudgetsResult>() {
            @Override
            public ListBudgetsResult call() throws Exception {
                ListBudgetsResult result = null;

                try {
                    result = executeListBudgets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFarmMembersResult> listFarmMembersAsync(ListFarmMembersRequest request) {

        return listFarmMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFarmMembersResult> listFarmMembersAsync(final ListFarmMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFarmMembersRequest, ListFarmMembersResult> asyncHandler) {
        final ListFarmMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFarmMembersResult>() {
            @Override
            public ListFarmMembersResult call() throws Exception {
                ListFarmMembersResult result = null;

                try {
                    result = executeListFarmMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFarmsResult> listFarmsAsync(ListFarmsRequest request) {

        return listFarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFarmsResult> listFarmsAsync(final ListFarmsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFarmsRequest, ListFarmsResult> asyncHandler) {
        final ListFarmsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFarmsResult>() {
            @Override
            public ListFarmsResult call() throws Exception {
                ListFarmsResult result = null;

                try {
                    result = executeListFarms(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFleetMembersResult> listFleetMembersAsync(ListFleetMembersRequest request) {

        return listFleetMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetMembersResult> listFleetMembersAsync(final ListFleetMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetMembersRequest, ListFleetMembersResult> asyncHandler) {
        final ListFleetMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFleetMembersResult>() {
            @Override
            public ListFleetMembersResult call() throws Exception {
                ListFleetMembersResult result = null;

                try {
                    result = executeListFleetMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest request) {

        return listFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(final ListFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler) {
        final ListFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFleetsResult>() {
            @Override
            public ListFleetsResult call() throws Exception {
                ListFleetsResult result = null;

                try {
                    result = executeListFleets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListJobMembersResult> listJobMembersAsync(ListJobMembersRequest request) {

        return listJobMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobMembersResult> listJobMembersAsync(final ListJobMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobMembersRequest, ListJobMembersResult> asyncHandler) {
        final ListJobMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobMembersResult>() {
            @Override
            public ListJobMembersResult call() throws Exception {
                ListJobMembersResult result = null;

                try {
                    result = executeListJobMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(final ListJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {
        final ListJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListJobsResult>() {
            @Override
            public ListJobsResult call() throws Exception {
                ListJobsResult result = null;

                try {
                    result = executeListJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLicenseEndpointsResult> listLicenseEndpointsAsync(ListLicenseEndpointsRequest request) {

        return listLicenseEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLicenseEndpointsResult> listLicenseEndpointsAsync(final ListLicenseEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLicenseEndpointsRequest, ListLicenseEndpointsResult> asyncHandler) {
        final ListLicenseEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLicenseEndpointsResult>() {
            @Override
            public ListLicenseEndpointsResult call() throws Exception {
                ListLicenseEndpointsResult result = null;

                try {
                    result = executeListLicenseEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMeteredProductsResult> listMeteredProductsAsync(ListMeteredProductsRequest request) {

        return listMeteredProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMeteredProductsResult> listMeteredProductsAsync(final ListMeteredProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMeteredProductsRequest, ListMeteredProductsResult> asyncHandler) {
        final ListMeteredProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMeteredProductsResult>() {
            @Override
            public ListMeteredProductsResult call() throws Exception {
                ListMeteredProductsResult result = null;

                try {
                    result = executeListMeteredProducts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest request) {

        return listMonitorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(final ListMonitorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler) {
        final ListMonitorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMonitorsResult>() {
            @Override
            public ListMonitorsResult call() throws Exception {
                ListMonitorsResult result = null;

                try {
                    result = executeListMonitors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQueueEnvironmentsResult> listQueueEnvironmentsAsync(ListQueueEnvironmentsRequest request) {

        return listQueueEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueueEnvironmentsResult> listQueueEnvironmentsAsync(final ListQueueEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueueEnvironmentsRequest, ListQueueEnvironmentsResult> asyncHandler) {
        final ListQueueEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueueEnvironmentsResult>() {
            @Override
            public ListQueueEnvironmentsResult call() throws Exception {
                ListQueueEnvironmentsResult result = null;

                try {
                    result = executeListQueueEnvironments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQueueFleetAssociationsResult> listQueueFleetAssociationsAsync(ListQueueFleetAssociationsRequest request) {

        return listQueueFleetAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueueFleetAssociationsResult> listQueueFleetAssociationsAsync(final ListQueueFleetAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueueFleetAssociationsRequest, ListQueueFleetAssociationsResult> asyncHandler) {
        final ListQueueFleetAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueueFleetAssociationsResult>() {
            @Override
            public ListQueueFleetAssociationsResult call() throws Exception {
                ListQueueFleetAssociationsResult result = null;

                try {
                    result = executeListQueueFleetAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQueueMembersResult> listQueueMembersAsync(ListQueueMembersRequest request) {

        return listQueueMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueueMembersResult> listQueueMembersAsync(final ListQueueMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueueMembersRequest, ListQueueMembersResult> asyncHandler) {
        final ListQueueMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueueMembersResult>() {
            @Override
            public ListQueueMembersResult call() throws Exception {
                ListQueueMembersResult result = null;

                try {
                    result = executeListQueueMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(ListQueuesRequest request) {

        return listQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(final ListQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler) {
        final ListQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListQueuesResult>() {
            @Override
            public ListQueuesResult call() throws Exception {
                ListQueuesResult result = null;

                try {
                    result = executeListQueues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSessionActionsResult> listSessionActionsAsync(ListSessionActionsRequest request) {

        return listSessionActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSessionActionsResult> listSessionActionsAsync(final ListSessionActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSessionActionsRequest, ListSessionActionsResult> asyncHandler) {
        final ListSessionActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSessionActionsResult>() {
            @Override
            public ListSessionActionsResult call() throws Exception {
                ListSessionActionsResult result = null;

                try {
                    result = executeListSessionActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(ListSessionsRequest request) {

        return listSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(final ListSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSessionsRequest, ListSessionsResult> asyncHandler) {
        final ListSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSessionsResult>() {
            @Override
            public ListSessionsResult call() throws Exception {
                ListSessionsResult result = null;

                try {
                    result = executeListSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSessionsForWorkerResult> listSessionsForWorkerAsync(ListSessionsForWorkerRequest request) {

        return listSessionsForWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSessionsForWorkerResult> listSessionsForWorkerAsync(final ListSessionsForWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSessionsForWorkerRequest, ListSessionsForWorkerResult> asyncHandler) {
        final ListSessionsForWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSessionsForWorkerResult>() {
            @Override
            public ListSessionsForWorkerResult call() throws Exception {
                ListSessionsForWorkerResult result = null;

                try {
                    result = executeListSessionsForWorker(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStepConsumersResult> listStepConsumersAsync(ListStepConsumersRequest request) {

        return listStepConsumersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStepConsumersResult> listStepConsumersAsync(final ListStepConsumersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStepConsumersRequest, ListStepConsumersResult> asyncHandler) {
        final ListStepConsumersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStepConsumersResult>() {
            @Override
            public ListStepConsumersResult call() throws Exception {
                ListStepConsumersResult result = null;

                try {
                    result = executeListStepConsumers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStepDependenciesResult> listStepDependenciesAsync(ListStepDependenciesRequest request) {

        return listStepDependenciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStepDependenciesResult> listStepDependenciesAsync(final ListStepDependenciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStepDependenciesRequest, ListStepDependenciesResult> asyncHandler) {
        final ListStepDependenciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStepDependenciesResult>() {
            @Override
            public ListStepDependenciesResult call() throws Exception {
                ListStepDependenciesResult result = null;

                try {
                    result = executeListStepDependencies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(ListStepsRequest request) {

        return listStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(final ListStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler) {
        final ListStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStepsResult>() {
            @Override
            public ListStepsResult call() throws Exception {
                ListStepsResult result = null;

                try {
                    result = executeListSteps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStorageProfilesResult> listStorageProfilesAsync(ListStorageProfilesRequest request) {

        return listStorageProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStorageProfilesResult> listStorageProfilesAsync(final ListStorageProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStorageProfilesRequest, ListStorageProfilesResult> asyncHandler) {
        final ListStorageProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStorageProfilesResult>() {
            @Override
            public ListStorageProfilesResult call() throws Exception {
                ListStorageProfilesResult result = null;

                try {
                    result = executeListStorageProfiles(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStorageProfilesForQueueResult> listStorageProfilesForQueueAsync(ListStorageProfilesForQueueRequest request) {

        return listStorageProfilesForQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStorageProfilesForQueueResult> listStorageProfilesForQueueAsync(final ListStorageProfilesForQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStorageProfilesForQueueRequest, ListStorageProfilesForQueueResult> asyncHandler) {
        final ListStorageProfilesForQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStorageProfilesForQueueResult>() {
            @Override
            public ListStorageProfilesForQueueResult call() throws Exception {
                ListStorageProfilesForQueueResult result = null;

                try {
                    result = executeListStorageProfilesForQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(ListTasksRequest request) {

        return listTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTasksResult> listTasksAsync(final ListTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTasksRequest, ListTasksResult> asyncHandler) {
        final ListTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTasksResult>() {
            @Override
            public ListTasksResult call() throws Exception {
                ListTasksResult result = null;

                try {
                    result = executeListTasks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(ListWorkersRequest request) {

        return listWorkersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWorkersResult> listWorkersAsync(final ListWorkersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWorkersRequest, ListWorkersResult> asyncHandler) {
        final ListWorkersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWorkersResult>() {
            @Override
            public ListWorkersResult call() throws Exception {
                ListWorkersResult result = null;

                try {
                    result = executeListWorkers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutMeteredProductResult> putMeteredProductAsync(PutMeteredProductRequest request) {

        return putMeteredProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMeteredProductResult> putMeteredProductAsync(final PutMeteredProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMeteredProductRequest, PutMeteredProductResult> asyncHandler) {
        final PutMeteredProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMeteredProductResult>() {
            @Override
            public PutMeteredProductResult call() throws Exception {
                PutMeteredProductResult result = null;

                try {
                    result = executePutMeteredProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchJobsResult> searchJobsAsync(SearchJobsRequest request) {

        return searchJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchJobsResult> searchJobsAsync(final SearchJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchJobsRequest, SearchJobsResult> asyncHandler) {
        final SearchJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchJobsResult>() {
            @Override
            public SearchJobsResult call() throws Exception {
                SearchJobsResult result = null;

                try {
                    result = executeSearchJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchStepsResult> searchStepsAsync(SearchStepsRequest request) {

        return searchStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchStepsResult> searchStepsAsync(final SearchStepsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchStepsRequest, SearchStepsResult> asyncHandler) {
        final SearchStepsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchStepsResult>() {
            @Override
            public SearchStepsResult call() throws Exception {
                SearchStepsResult result = null;

                try {
                    result = executeSearchSteps(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchTasksResult> searchTasksAsync(SearchTasksRequest request) {

        return searchTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchTasksResult> searchTasksAsync(final SearchTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchTasksRequest, SearchTasksResult> asyncHandler) {
        final SearchTasksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchTasksResult>() {
            @Override
            public SearchTasksResult call() throws Exception {
                SearchTasksResult result = null;

                try {
                    result = executeSearchTasks(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchWorkersResult> searchWorkersAsync(SearchWorkersRequest request) {

        return searchWorkersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchWorkersResult> searchWorkersAsync(final SearchWorkersRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchWorkersRequest, SearchWorkersResult> asyncHandler) {
        final SearchWorkersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchWorkersResult>() {
            @Override
            public SearchWorkersResult call() throws Exception {
                SearchWorkersResult result = null;

                try {
                    result = executeSearchWorkers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartSessionsStatisticsAggregationResult> startSessionsStatisticsAggregationAsync(
            StartSessionsStatisticsAggregationRequest request) {

        return startSessionsStatisticsAggregationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSessionsStatisticsAggregationResult> startSessionsStatisticsAggregationAsync(
            final StartSessionsStatisticsAggregationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSessionsStatisticsAggregationRequest, StartSessionsStatisticsAggregationResult> asyncHandler) {
        final StartSessionsStatisticsAggregationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSessionsStatisticsAggregationResult>() {
            @Override
            public StartSessionsStatisticsAggregationResult call() throws Exception {
                StartSessionsStatisticsAggregationResult result = null;

                try {
                    result = executeStartSessionsStatisticsAggregation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(UpdateBudgetRequest request) {

        return updateBudgetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBudgetResult> updateBudgetAsync(final UpdateBudgetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBudgetRequest, UpdateBudgetResult> asyncHandler) {
        final UpdateBudgetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBudgetResult>() {
            @Override
            public UpdateBudgetResult call() throws Exception {
                UpdateBudgetResult result = null;

                try {
                    result = executeUpdateBudget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFarmResult> updateFarmAsync(UpdateFarmRequest request) {

        return updateFarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFarmResult> updateFarmAsync(final UpdateFarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFarmRequest, UpdateFarmResult> asyncHandler) {
        final UpdateFarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFarmResult>() {
            @Override
            public UpdateFarmResult call() throws Exception {
                UpdateFarmResult result = null;

                try {
                    result = executeUpdateFarm(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest request) {

        return updateFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(final UpdateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler) {
        final UpdateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetResult>() {
            @Override
            public UpdateFleetResult call() throws Exception {
                UpdateFleetResult result = null;

                try {
                    result = executeUpdateFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(UpdateJobRequest request) {

        return updateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(final UpdateJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler) {
        final UpdateJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateJobResult>() {
            @Override
            public UpdateJobResult call() throws Exception {
                UpdateJobResult result = null;

                try {
                    result = executeUpdateJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(UpdateMonitorRequest request) {

        return updateMonitorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMonitorResult> updateMonitorAsync(final UpdateMonitorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMonitorRequest, UpdateMonitorResult> asyncHandler) {
        final UpdateMonitorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMonitorResult>() {
            @Override
            public UpdateMonitorResult call() throws Exception {
                UpdateMonitorResult result = null;

                try {
                    result = executeUpdateMonitor(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(UpdateQueueRequest request) {

        return updateQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueResult> updateQueueAsync(final UpdateQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueRequest, UpdateQueueResult> asyncHandler) {
        final UpdateQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueResult>() {
            @Override
            public UpdateQueueResult call() throws Exception {
                UpdateQueueResult result = null;

                try {
                    result = executeUpdateQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueEnvironmentResult> updateQueueEnvironmentAsync(UpdateQueueEnvironmentRequest request) {

        return updateQueueEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueEnvironmentResult> updateQueueEnvironmentAsync(final UpdateQueueEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueEnvironmentRequest, UpdateQueueEnvironmentResult> asyncHandler) {
        final UpdateQueueEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueEnvironmentResult>() {
            @Override
            public UpdateQueueEnvironmentResult call() throws Exception {
                UpdateQueueEnvironmentResult result = null;

                try {
                    result = executeUpdateQueueEnvironment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueFleetAssociationResult> updateQueueFleetAssociationAsync(UpdateQueueFleetAssociationRequest request) {

        return updateQueueFleetAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateQueueFleetAssociationResult> updateQueueFleetAssociationAsync(final UpdateQueueFleetAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateQueueFleetAssociationRequest, UpdateQueueFleetAssociationResult> asyncHandler) {
        final UpdateQueueFleetAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateQueueFleetAssociationResult>() {
            @Override
            public UpdateQueueFleetAssociationResult call() throws Exception {
                UpdateQueueFleetAssociationResult result = null;

                try {
                    result = executeUpdateQueueFleetAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSessionResult> updateSessionAsync(UpdateSessionRequest request) {

        return updateSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSessionResult> updateSessionAsync(final UpdateSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSessionRequest, UpdateSessionResult> asyncHandler) {
        final UpdateSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSessionResult>() {
            @Override
            public UpdateSessionResult call() throws Exception {
                UpdateSessionResult result = null;

                try {
                    result = executeUpdateSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStepResult> updateStepAsync(UpdateStepRequest request) {

        return updateStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStepResult> updateStepAsync(final UpdateStepRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStepRequest, UpdateStepResult> asyncHandler) {
        final UpdateStepRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStepResult>() {
            @Override
            public UpdateStepResult call() throws Exception {
                UpdateStepResult result = null;

                try {
                    result = executeUpdateStep(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageProfileResult> updateStorageProfileAsync(UpdateStorageProfileRequest request) {

        return updateStorageProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStorageProfileResult> updateStorageProfileAsync(final UpdateStorageProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStorageProfileRequest, UpdateStorageProfileResult> asyncHandler) {
        final UpdateStorageProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStorageProfileResult>() {
            @Override
            public UpdateStorageProfileResult call() throws Exception {
                UpdateStorageProfileResult result = null;

                try {
                    result = executeUpdateStorageProfile(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(UpdateTaskRequest request) {

        return updateTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTaskResult> updateTaskAsync(final UpdateTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTaskRequest, UpdateTaskResult> asyncHandler) {
        final UpdateTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTaskResult>() {
            @Override
            public UpdateTaskResult call() throws Exception {
                UpdateTaskResult result = null;

                try {
                    result = executeUpdateTask(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(UpdateWorkerRequest request) {

        return updateWorkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkerResult> updateWorkerAsync(final UpdateWorkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkerRequest, UpdateWorkerResult> asyncHandler) {
        final UpdateWorkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkerResult>() {
            @Override
            public UpdateWorkerResult call() throws Exception {
                UpdateWorkerResult result = null;

                try {
                    result = executeUpdateWorker(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkerScheduleResult> updateWorkerScheduleAsync(UpdateWorkerScheduleRequest request) {

        return updateWorkerScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWorkerScheduleResult> updateWorkerScheduleAsync(final UpdateWorkerScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWorkerScheduleRequest, UpdateWorkerScheduleResult> asyncHandler) {
        final UpdateWorkerScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWorkerScheduleResult>() {
            @Override
            public UpdateWorkerScheduleResult call() throws Exception {
                UpdateWorkerScheduleResult result = null;

                try {
                    result = executeUpdateWorkerSchedule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
