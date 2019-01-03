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
package com.amazonaws.services.appsync;

import javax.annotation.Generated;

import com.amazonaws.services.appsync.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWSAppSync asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS AppSync provides API actions for creating and interacting with data sources using GraphQL from your application.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppSyncAsyncClient extends AWSAppSyncClient implements AWSAppSyncAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAppSyncAsyncClientBuilder asyncBuilder() {
        return AWSAppSyncAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWSAppSync using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAppSyncAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
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
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(CreateApiKeyRequest request) {

        return createApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiKeyResult> createApiKeyAsync(final CreateApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApiKeyRequest, CreateApiKeyResult> asyncHandler) {
        final CreateApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApiKeyResult>() {
            @Override
            public CreateApiKeyResult call() throws Exception {
                CreateApiKeyResult result = null;

                try {
                    result = executeCreateApiKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest request) {

        return createFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFunctionResult> createFunctionAsync(final CreateFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler) {
        final CreateFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFunctionResult>() {
            @Override
            public CreateFunctionResult call() throws Exception {
                CreateFunctionResult result = null;

                try {
                    result = executeCreateFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGraphqlApiResult> createGraphqlApiAsync(CreateGraphqlApiRequest request) {

        return createGraphqlApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGraphqlApiResult> createGraphqlApiAsync(final CreateGraphqlApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGraphqlApiRequest, CreateGraphqlApiResult> asyncHandler) {
        final CreateGraphqlApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGraphqlApiResult>() {
            @Override
            public CreateGraphqlApiResult call() throws Exception {
                CreateGraphqlApiResult result = null;

                try {
                    result = executeCreateGraphqlApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateResolverResult> createResolverAsync(CreateResolverRequest request) {

        return createResolverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResolverResult> createResolverAsync(final CreateResolverRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResolverRequest, CreateResolverResult> asyncHandler) {
        final CreateResolverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResolverResult>() {
            @Override
            public CreateResolverResult call() throws Exception {
                CreateResolverResult result = null;

                try {
                    result = executeCreateResolver(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateTypeResult> createTypeAsync(CreateTypeRequest request) {

        return createTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTypeResult> createTypeAsync(final CreateTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTypeRequest, CreateTypeResult> asyncHandler) {
        final CreateTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTypeResult>() {
            @Override
            public CreateTypeResult call() throws Exception {
                CreateTypeResult result = null;

                try {
                    result = executeCreateType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(DeleteApiKeyRequest request) {

        return deleteApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiKeyResult> deleteApiKeyAsync(final DeleteApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApiKeyRequest, DeleteApiKeyResult> asyncHandler) {
        final DeleteApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApiKeyResult>() {
            @Override
            public DeleteApiKeyResult call() throws Exception {
                DeleteApiKeyResult result = null;

                try {
                    result = executeDeleteApiKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(DeleteFunctionRequest request) {

        return deleteFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFunctionResult> deleteFunctionAsync(final DeleteFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFunctionRequest, DeleteFunctionResult> asyncHandler) {
        final DeleteFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFunctionResult>() {
            @Override
            public DeleteFunctionResult call() throws Exception {
                DeleteFunctionResult result = null;

                try {
                    result = executeDeleteFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGraphqlApiResult> deleteGraphqlApiAsync(DeleteGraphqlApiRequest request) {

        return deleteGraphqlApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGraphqlApiResult> deleteGraphqlApiAsync(final DeleteGraphqlApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGraphqlApiRequest, DeleteGraphqlApiResult> asyncHandler) {
        final DeleteGraphqlApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGraphqlApiResult>() {
            @Override
            public DeleteGraphqlApiResult call() throws Exception {
                DeleteGraphqlApiResult result = null;

                try {
                    result = executeDeleteGraphqlApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverResult> deleteResolverAsync(DeleteResolverRequest request) {

        return deleteResolverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResolverResult> deleteResolverAsync(final DeleteResolverRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResolverRequest, DeleteResolverResult> asyncHandler) {
        final DeleteResolverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResolverResult>() {
            @Override
            public DeleteResolverResult call() throws Exception {
                DeleteResolverResult result = null;

                try {
                    result = executeDeleteResolver(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteTypeResult> deleteTypeAsync(DeleteTypeRequest request) {

        return deleteTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTypeResult> deleteTypeAsync(final DeleteTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTypeRequest, DeleteTypeResult> asyncHandler) {
        final DeleteTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTypeResult>() {
            @Override
            public DeleteTypeResult call() throws Exception {
                DeleteTypeResult result = null;

                try {
                    result = executeDeleteType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest request) {

        return getDataSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(final GetDataSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler) {
        final GetDataSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDataSourceResult>() {
            @Override
            public GetDataSourceResult call() throws Exception {
                GetDataSourceResult result = null;

                try {
                    result = executeGetDataSource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest request) {

        return getFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFunctionResult> getFunctionAsync(final GetFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler) {
        final GetFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFunctionResult>() {
            @Override
            public GetFunctionResult call() throws Exception {
                GetFunctionResult result = null;

                try {
                    result = executeGetFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGraphqlApiResult> getGraphqlApiAsync(GetGraphqlApiRequest request) {

        return getGraphqlApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGraphqlApiResult> getGraphqlApiAsync(final GetGraphqlApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGraphqlApiRequest, GetGraphqlApiResult> asyncHandler) {
        final GetGraphqlApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGraphqlApiResult>() {
            @Override
            public GetGraphqlApiResult call() throws Exception {
                GetGraphqlApiResult result = null;

                try {
                    result = executeGetGraphqlApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIntrospectionSchemaResult> getIntrospectionSchemaAsync(GetIntrospectionSchemaRequest request) {

        return getIntrospectionSchemaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntrospectionSchemaResult> getIntrospectionSchemaAsync(final GetIntrospectionSchemaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntrospectionSchemaRequest, GetIntrospectionSchemaResult> asyncHandler) {
        final GetIntrospectionSchemaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntrospectionSchemaResult>() {
            @Override
            public GetIntrospectionSchemaResult call() throws Exception {
                GetIntrospectionSchemaResult result = null;

                try {
                    result = executeGetIntrospectionSchema(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetResolverResult> getResolverAsync(GetResolverRequest request) {

        return getResolverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResolverResult> getResolverAsync(final GetResolverRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResolverRequest, GetResolverResult> asyncHandler) {
        final GetResolverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResolverResult>() {
            @Override
            public GetResolverResult call() throws Exception {
                GetResolverResult result = null;

                try {
                    result = executeGetResolver(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSchemaCreationStatusResult> getSchemaCreationStatusAsync(GetSchemaCreationStatusRequest request) {

        return getSchemaCreationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSchemaCreationStatusResult> getSchemaCreationStatusAsync(final GetSchemaCreationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSchemaCreationStatusRequest, GetSchemaCreationStatusResult> asyncHandler) {
        final GetSchemaCreationStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSchemaCreationStatusResult>() {
            @Override
            public GetSchemaCreationStatusResult call() throws Exception {
                GetSchemaCreationStatusResult result = null;

                try {
                    result = executeGetSchemaCreationStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetTypeResult> getTypeAsync(GetTypeRequest request) {

        return getTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTypeResult> getTypeAsync(final GetTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTypeRequest, GetTypeResult> asyncHandler) {
        final GetTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTypeResult>() {
            @Override
            public GetTypeResult call() throws Exception {
                GetTypeResult result = null;

                try {
                    result = executeGetType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListApiKeysResult> listApiKeysAsync(ListApiKeysRequest request) {

        return listApiKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApiKeysResult> listApiKeysAsync(final ListApiKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListApiKeysRequest, ListApiKeysResult> asyncHandler) {
        final ListApiKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListApiKeysResult>() {
            @Override
            public ListApiKeysResult call() throws Exception {
                ListApiKeysResult result = null;

                try {
                    result = executeListApiKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest request) {

        return listFunctionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFunctionsResult> listFunctionsAsync(final ListFunctionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler) {
        final ListFunctionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFunctionsResult>() {
            @Override
            public ListFunctionsResult call() throws Exception {
                ListFunctionsResult result = null;

                try {
                    result = executeListFunctions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListGraphqlApisResult> listGraphqlApisAsync(ListGraphqlApisRequest request) {

        return listGraphqlApisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGraphqlApisResult> listGraphqlApisAsync(final ListGraphqlApisRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGraphqlApisRequest, ListGraphqlApisResult> asyncHandler) {
        final ListGraphqlApisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGraphqlApisResult>() {
            @Override
            public ListGraphqlApisResult call() throws Exception {
                ListGraphqlApisResult result = null;

                try {
                    result = executeListGraphqlApis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolversResult> listResolversAsync(ListResolversRequest request) {

        return listResolversAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolversResult> listResolversAsync(final ListResolversRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolversRequest, ListResolversResult> asyncHandler) {
        final ListResolversRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolversResult>() {
            @Override
            public ListResolversResult call() throws Exception {
                ListResolversResult result = null;

                try {
                    result = executeListResolvers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListResolversByFunctionResult> listResolversByFunctionAsync(ListResolversByFunctionRequest request) {

        return listResolversByFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResolversByFunctionResult> listResolversByFunctionAsync(final ListResolversByFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResolversByFunctionRequest, ListResolversByFunctionResult> asyncHandler) {
        final ListResolversByFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResolversByFunctionResult>() {
            @Override
            public ListResolversByFunctionResult call() throws Exception {
                ListResolversByFunctionResult result = null;

                try {
                    result = executeListResolversByFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTypesResult> listTypesAsync(ListTypesRequest request) {

        return listTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTypesResult> listTypesAsync(final ListTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTypesRequest, ListTypesResult> asyncHandler) {
        final ListTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTypesResult>() {
            @Override
            public ListTypesResult call() throws Exception {
                ListTypesResult result = null;

                try {
                    result = executeListTypes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartSchemaCreationResult> startSchemaCreationAsync(StartSchemaCreationRequest request) {

        return startSchemaCreationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSchemaCreationResult> startSchemaCreationAsync(final StartSchemaCreationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSchemaCreationRequest, StartSchemaCreationResult> asyncHandler) {
        final StartSchemaCreationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSchemaCreationResult>() {
            @Override
            public StartSchemaCreationResult call() throws Exception {
                StartSchemaCreationResult result = null;

                try {
                    result = executeStartSchemaCreation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(UpdateApiKeyRequest request) {

        return updateApiKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiKeyResult> updateApiKeyAsync(final UpdateApiKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApiKeyRequest, UpdateApiKeyResult> asyncHandler) {
        final UpdateApiKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApiKeyResult>() {
            @Override
            public UpdateApiKeyResult call() throws Exception {
                UpdateApiKeyResult result = null;

                try {
                    result = executeUpdateApiKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(UpdateFunctionRequest request) {

        return updateFunctionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFunctionResult> updateFunctionAsync(final UpdateFunctionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFunctionRequest, UpdateFunctionResult> asyncHandler) {
        final UpdateFunctionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFunctionResult>() {
            @Override
            public UpdateFunctionResult call() throws Exception {
                UpdateFunctionResult result = null;

                try {
                    result = executeUpdateFunction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGraphqlApiResult> updateGraphqlApiAsync(UpdateGraphqlApiRequest request) {

        return updateGraphqlApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGraphqlApiResult> updateGraphqlApiAsync(final UpdateGraphqlApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGraphqlApiRequest, UpdateGraphqlApiResult> asyncHandler) {
        final UpdateGraphqlApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGraphqlApiResult>() {
            @Override
            public UpdateGraphqlApiResult call() throws Exception {
                UpdateGraphqlApiResult result = null;

                try {
                    result = executeUpdateGraphqlApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverResult> updateResolverAsync(UpdateResolverRequest request) {

        return updateResolverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResolverResult> updateResolverAsync(final UpdateResolverRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResolverRequest, UpdateResolverResult> asyncHandler) {
        final UpdateResolverRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResolverResult>() {
            @Override
            public UpdateResolverResult call() throws Exception {
                UpdateResolverResult result = null;

                try {
                    result = executeUpdateResolver(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateTypeResult> updateTypeAsync(UpdateTypeRequest request) {

        return updateTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTypeResult> updateTypeAsync(final UpdateTypeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTypeRequest, UpdateTypeResult> asyncHandler) {
        final UpdateTypeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTypeResult>() {
            @Override
            public UpdateTypeResult call() throws Exception {
                UpdateTypeResult result = null;

                try {
                    result = executeUpdateType(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
