/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend;

import javax.annotation.Generated;

import com.amazonaws.services.amplifybackend.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AmplifyBackend asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Amplify Admin API
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAmplifyBackendAsyncClient extends AWSAmplifyBackendClient implements AWSAmplifyBackendAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAmplifyBackendAsyncClientBuilder asyncBuilder() {
        return AWSAmplifyBackendAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AmplifyBackend using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAmplifyBackendAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AmplifyBackend using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSAmplifyBackendAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CloneBackendResult> cloneBackendAsync(CloneBackendRequest request) {

        return cloneBackendAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloneBackendResult> cloneBackendAsync(final CloneBackendRequest request,
            final com.amazonaws.handlers.AsyncHandler<CloneBackendRequest, CloneBackendResult> asyncHandler) {
        final CloneBackendRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CloneBackendResult>() {
            @Override
            public CloneBackendResult call() throws Exception {
                CloneBackendResult result = null;

                try {
                    result = executeCloneBackend(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBackendResult> createBackendAsync(CreateBackendRequest request) {

        return createBackendAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendResult> createBackendAsync(final CreateBackendRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackendRequest, CreateBackendResult> asyncHandler) {
        final CreateBackendRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackendResult>() {
            @Override
            public CreateBackendResult call() throws Exception {
                CreateBackendResult result = null;

                try {
                    result = executeCreateBackend(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBackendAPIResult> createBackendAPIAsync(CreateBackendAPIRequest request) {

        return createBackendAPIAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendAPIResult> createBackendAPIAsync(final CreateBackendAPIRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackendAPIRequest, CreateBackendAPIResult> asyncHandler) {
        final CreateBackendAPIRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackendAPIResult>() {
            @Override
            public CreateBackendAPIResult call() throws Exception {
                CreateBackendAPIResult result = null;

                try {
                    result = executeCreateBackendAPI(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBackendAuthResult> createBackendAuthAsync(CreateBackendAuthRequest request) {

        return createBackendAuthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendAuthResult> createBackendAuthAsync(final CreateBackendAuthRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackendAuthRequest, CreateBackendAuthResult> asyncHandler) {
        final CreateBackendAuthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackendAuthResult>() {
            @Override
            public CreateBackendAuthResult call() throws Exception {
                CreateBackendAuthResult result = null;

                try {
                    result = executeCreateBackendAuth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBackendConfigResult> createBackendConfigAsync(CreateBackendConfigRequest request) {

        return createBackendConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBackendConfigResult> createBackendConfigAsync(final CreateBackendConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBackendConfigRequest, CreateBackendConfigResult> asyncHandler) {
        final CreateBackendConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBackendConfigResult>() {
            @Override
            public CreateBackendConfigResult call() throws Exception {
                CreateBackendConfigResult result = null;

                try {
                    result = executeCreateBackendConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(CreateTokenRequest request) {

        return createTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTokenResult> createTokenAsync(final CreateTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTokenRequest, CreateTokenResult> asyncHandler) {
        final CreateTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTokenResult>() {
            @Override
            public CreateTokenResult call() throws Exception {
                CreateTokenResult result = null;

                try {
                    result = executeCreateToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendResult> deleteBackendAsync(DeleteBackendRequest request) {

        return deleteBackendAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendResult> deleteBackendAsync(final DeleteBackendRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackendRequest, DeleteBackendResult> asyncHandler) {
        final DeleteBackendRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackendResult>() {
            @Override
            public DeleteBackendResult call() throws Exception {
                DeleteBackendResult result = null;

                try {
                    result = executeDeleteBackend(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendAPIResult> deleteBackendAPIAsync(DeleteBackendAPIRequest request) {

        return deleteBackendAPIAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendAPIResult> deleteBackendAPIAsync(final DeleteBackendAPIRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackendAPIRequest, DeleteBackendAPIResult> asyncHandler) {
        final DeleteBackendAPIRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackendAPIResult>() {
            @Override
            public DeleteBackendAPIResult call() throws Exception {
                DeleteBackendAPIResult result = null;

                try {
                    result = executeDeleteBackendAPI(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendAuthResult> deleteBackendAuthAsync(DeleteBackendAuthRequest request) {

        return deleteBackendAuthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackendAuthResult> deleteBackendAuthAsync(final DeleteBackendAuthRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBackendAuthRequest, DeleteBackendAuthResult> asyncHandler) {
        final DeleteBackendAuthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBackendAuthResult>() {
            @Override
            public DeleteBackendAuthResult call() throws Exception {
                DeleteBackendAuthResult result = null;

                try {
                    result = executeDeleteBackendAuth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(DeleteTokenRequest request) {

        return deleteTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTokenResult> deleteTokenAsync(final DeleteTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTokenRequest, DeleteTokenResult> asyncHandler) {
        final DeleteTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTokenResult>() {
            @Override
            public DeleteTokenResult call() throws Exception {
                DeleteTokenResult result = null;

                try {
                    result = executeDeleteToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GenerateBackendAPIModelsResult> generateBackendAPIModelsAsync(GenerateBackendAPIModelsRequest request) {

        return generateBackendAPIModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateBackendAPIModelsResult> generateBackendAPIModelsAsync(final GenerateBackendAPIModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateBackendAPIModelsRequest, GenerateBackendAPIModelsResult> asyncHandler) {
        final GenerateBackendAPIModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GenerateBackendAPIModelsResult>() {
            @Override
            public GenerateBackendAPIModelsResult call() throws Exception {
                GenerateBackendAPIModelsResult result = null;

                try {
                    result = executeGenerateBackendAPIModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBackendResult> getBackendAsync(GetBackendRequest request) {

        return getBackendAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackendResult> getBackendAsync(final GetBackendRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackendRequest, GetBackendResult> asyncHandler) {
        final GetBackendRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackendResult>() {
            @Override
            public GetBackendResult call() throws Exception {
                GetBackendResult result = null;

                try {
                    result = executeGetBackend(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBackendAPIResult> getBackendAPIAsync(GetBackendAPIRequest request) {

        return getBackendAPIAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackendAPIResult> getBackendAPIAsync(final GetBackendAPIRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackendAPIRequest, GetBackendAPIResult> asyncHandler) {
        final GetBackendAPIRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackendAPIResult>() {
            @Override
            public GetBackendAPIResult call() throws Exception {
                GetBackendAPIResult result = null;

                try {
                    result = executeGetBackendAPI(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBackendAPIModelsResult> getBackendAPIModelsAsync(GetBackendAPIModelsRequest request) {

        return getBackendAPIModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackendAPIModelsResult> getBackendAPIModelsAsync(final GetBackendAPIModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackendAPIModelsRequest, GetBackendAPIModelsResult> asyncHandler) {
        final GetBackendAPIModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackendAPIModelsResult>() {
            @Override
            public GetBackendAPIModelsResult call() throws Exception {
                GetBackendAPIModelsResult result = null;

                try {
                    result = executeGetBackendAPIModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBackendAuthResult> getBackendAuthAsync(GetBackendAuthRequest request) {

        return getBackendAuthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackendAuthResult> getBackendAuthAsync(final GetBackendAuthRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackendAuthRequest, GetBackendAuthResult> asyncHandler) {
        final GetBackendAuthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackendAuthResult>() {
            @Override
            public GetBackendAuthResult call() throws Exception {
                GetBackendAuthResult result = null;

                try {
                    result = executeGetBackendAuth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBackendJobResult> getBackendJobAsync(GetBackendJobRequest request) {

        return getBackendJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBackendJobResult> getBackendJobAsync(final GetBackendJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBackendJobRequest, GetBackendJobResult> asyncHandler) {
        final GetBackendJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBackendJobResult>() {
            @Override
            public GetBackendJobResult call() throws Exception {
                GetBackendJobResult result = null;

                try {
                    result = executeGetBackendJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTokenResult> getTokenAsync(GetTokenRequest request) {

        return getTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTokenResult> getTokenAsync(final GetTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTokenRequest, GetTokenResult> asyncHandler) {
        final GetTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTokenResult>() {
            @Override
            public GetTokenResult call() throws Exception {
                GetTokenResult result = null;

                try {
                    result = executeGetToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ImportBackendAuthResult> importBackendAuthAsync(ImportBackendAuthRequest request) {

        return importBackendAuthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportBackendAuthResult> importBackendAuthAsync(final ImportBackendAuthRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportBackendAuthRequest, ImportBackendAuthResult> asyncHandler) {
        final ImportBackendAuthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportBackendAuthResult>() {
            @Override
            public ImportBackendAuthResult call() throws Exception {
                ImportBackendAuthResult result = null;

                try {
                    result = executeImportBackendAuth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBackendJobsResult> listBackendJobsAsync(ListBackendJobsRequest request) {

        return listBackendJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBackendJobsResult> listBackendJobsAsync(final ListBackendJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBackendJobsRequest, ListBackendJobsResult> asyncHandler) {
        final ListBackendJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBackendJobsResult>() {
            @Override
            public ListBackendJobsResult call() throws Exception {
                ListBackendJobsResult result = null;

                try {
                    result = executeListBackendJobs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveAllBackendsResult> removeAllBackendsAsync(RemoveAllBackendsRequest request) {

        return removeAllBackendsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAllBackendsResult> removeAllBackendsAsync(final RemoveAllBackendsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveAllBackendsRequest, RemoveAllBackendsResult> asyncHandler) {
        final RemoveAllBackendsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveAllBackendsResult>() {
            @Override
            public RemoveAllBackendsResult call() throws Exception {
                RemoveAllBackendsResult result = null;

                try {
                    result = executeRemoveAllBackends(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RemoveBackendConfigResult> removeBackendConfigAsync(RemoveBackendConfigRequest request) {

        return removeBackendConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveBackendConfigResult> removeBackendConfigAsync(final RemoveBackendConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveBackendConfigRequest, RemoveBackendConfigResult> asyncHandler) {
        final RemoveBackendConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveBackendConfigResult>() {
            @Override
            public RemoveBackendConfigResult call() throws Exception {
                RemoveBackendConfigResult result = null;

                try {
                    result = executeRemoveBackendConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendAPIResult> updateBackendAPIAsync(UpdateBackendAPIRequest request) {

        return updateBackendAPIAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendAPIResult> updateBackendAPIAsync(final UpdateBackendAPIRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBackendAPIRequest, UpdateBackendAPIResult> asyncHandler) {
        final UpdateBackendAPIRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBackendAPIResult>() {
            @Override
            public UpdateBackendAPIResult call() throws Exception {
                UpdateBackendAPIResult result = null;

                try {
                    result = executeUpdateBackendAPI(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendAuthResult> updateBackendAuthAsync(UpdateBackendAuthRequest request) {

        return updateBackendAuthAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendAuthResult> updateBackendAuthAsync(final UpdateBackendAuthRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBackendAuthRequest, UpdateBackendAuthResult> asyncHandler) {
        final UpdateBackendAuthRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBackendAuthResult>() {
            @Override
            public UpdateBackendAuthResult call() throws Exception {
                UpdateBackendAuthResult result = null;

                try {
                    result = executeUpdateBackendAuth(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendConfigResult> updateBackendConfigAsync(UpdateBackendConfigRequest request) {

        return updateBackendConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendConfigResult> updateBackendConfigAsync(final UpdateBackendConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBackendConfigRequest, UpdateBackendConfigResult> asyncHandler) {
        final UpdateBackendConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBackendConfigResult>() {
            @Override
            public UpdateBackendConfigResult call() throws Exception {
                UpdateBackendConfigResult result = null;

                try {
                    result = executeUpdateBackendConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendJobResult> updateBackendJobAsync(UpdateBackendJobRequest request) {

        return updateBackendJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBackendJobResult> updateBackendJobAsync(final UpdateBackendJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBackendJobRequest, UpdateBackendJobResult> asyncHandler) {
        final UpdateBackendJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBackendJobResult>() {
            @Override
            public UpdateBackendJobResult call() throws Exception {
                UpdateBackendJobResult result = null;

                try {
                    result = executeUpdateBackendJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
