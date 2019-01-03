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
package com.amazonaws.services.apigatewayv2;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AmazonApiGatewayV2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon API Gateway V2
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonApiGatewayV2AsyncClient extends AmazonApiGatewayV2Client implements AmazonApiGatewayV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonApiGatewayV2AsyncClientBuilder asyncBuilder() {
        return AmazonApiGatewayV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AmazonApiGatewayV2 using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonApiGatewayV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateApiResult> createApiAsync(CreateApiRequest request) {

        return createApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiResult> createApiAsync(final CreateApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApiRequest, CreateApiResult> asyncHandler) {
        final CreateApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApiResult>() {
            @Override
            public CreateApiResult call() throws Exception {
                CreateApiResult result = null;

                try {
                    result = executeCreateApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateApiMappingResult> createApiMappingAsync(CreateApiMappingRequest request) {

        return createApiMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiMappingResult> createApiMappingAsync(final CreateApiMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateApiMappingRequest, CreateApiMappingResult> asyncHandler) {
        final CreateApiMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateApiMappingResult>() {
            @Override
            public CreateApiMappingResult call() throws Exception {
                CreateApiMappingResult result = null;

                try {
                    result = executeCreateApiMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(CreateAuthorizerRequest request) {

        return createAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAuthorizerResult> createAuthorizerAsync(final CreateAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAuthorizerRequest, CreateAuthorizerResult> asyncHandler) {
        final CreateAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAuthorizerResult>() {
            @Override
            public CreateAuthorizerResult call() throws Exception {
                CreateAuthorizerResult result = null;

                try {
                    result = executeCreateAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest request) {

        return createDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(final CreateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler) {
        final CreateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeploymentResult>() {
            @Override
            public CreateDeploymentResult call() throws Exception {
                CreateDeploymentResult result = null;

                try {
                    result = executeCreateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(CreateDomainNameRequest request) {

        return createDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDomainNameResult> createDomainNameAsync(final CreateDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDomainNameRequest, CreateDomainNameResult> asyncHandler) {
        final CreateDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDomainNameResult>() {
            @Override
            public CreateDomainNameResult call() throws Exception {
                CreateDomainNameResult result = null;

                try {
                    result = executeCreateDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationResult> createIntegrationAsync(CreateIntegrationRequest request) {

        return createIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationResult> createIntegrationAsync(final CreateIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIntegrationRequest, CreateIntegrationResult> asyncHandler) {
        final CreateIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIntegrationResult>() {
            @Override
            public CreateIntegrationResult call() throws Exception {
                CreateIntegrationResult result = null;

                try {
                    result = executeCreateIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationResponseResult> createIntegrationResponseAsync(CreateIntegrationResponseRequest request) {

        return createIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIntegrationResponseResult> createIntegrationResponseAsync(final CreateIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIntegrationResponseRequest, CreateIntegrationResponseResult> asyncHandler) {
        final CreateIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIntegrationResponseResult>() {
            @Override
            public CreateIntegrationResponseResult call() throws Exception {
                CreateIntegrationResponseResult result = null;

                try {
                    result = executeCreateIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(CreateModelRequest request) {

        return createModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateModelResult> createModelAsync(final CreateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateModelRequest, CreateModelResult> asyncHandler) {
        final CreateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateModelResult>() {
            @Override
            public CreateModelResult call() throws Exception {
                CreateModelResult result = null;

                try {
                    result = executeCreateModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest request) {

        return createRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(final CreateRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler) {
        final CreateRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRouteResult>() {
            @Override
            public CreateRouteResult call() throws Exception {
                CreateRouteResult result = null;

                try {
                    result = executeCreateRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResponseResult> createRouteResponseAsync(CreateRouteResponseRequest request) {

        return createRouteResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResponseResult> createRouteResponseAsync(final CreateRouteResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRouteResponseRequest, CreateRouteResponseResult> asyncHandler) {
        final CreateRouteResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRouteResponseResult>() {
            @Override
            public CreateRouteResponseResult call() throws Exception {
                CreateRouteResponseResult result = null;

                try {
                    result = executeCreateRouteResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest request) {

        return createStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(final CreateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler) {
        final CreateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStageResult>() {
            @Override
            public CreateStageResult call() throws Exception {
                CreateStageResult result = null;

                try {
                    result = executeCreateStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApiResult> deleteApiAsync(DeleteApiRequest request) {

        return deleteApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiResult> deleteApiAsync(final DeleteApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApiRequest, DeleteApiResult> asyncHandler) {
        final DeleteApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApiResult>() {
            @Override
            public DeleteApiResult call() throws Exception {
                DeleteApiResult result = null;

                try {
                    result = executeDeleteApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteApiMappingResult> deleteApiMappingAsync(DeleteApiMappingRequest request) {

        return deleteApiMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiMappingResult> deleteApiMappingAsync(final DeleteApiMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteApiMappingRequest, DeleteApiMappingResult> asyncHandler) {
        final DeleteApiMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteApiMappingResult>() {
            @Override
            public DeleteApiMappingResult call() throws Exception {
                DeleteApiMappingResult result = null;

                try {
                    result = executeDeleteApiMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(DeleteAuthorizerRequest request) {

        return deleteAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthorizerResult> deleteAuthorizerAsync(final DeleteAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAuthorizerRequest, DeleteAuthorizerResult> asyncHandler) {
        final DeleteAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAuthorizerResult>() {
            @Override
            public DeleteAuthorizerResult call() throws Exception {
                DeleteAuthorizerResult result = null;

                try {
                    result = executeDeleteAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(DeleteDeploymentRequest request) {

        return deleteDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeploymentResult> deleteDeploymentAsync(final DeleteDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeploymentRequest, DeleteDeploymentResult> asyncHandler) {
        final DeleteDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeploymentResult>() {
            @Override
            public DeleteDeploymentResult call() throws Exception {
                DeleteDeploymentResult result = null;

                try {
                    result = executeDeleteDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(DeleteDomainNameRequest request) {

        return deleteDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDomainNameResult> deleteDomainNameAsync(final DeleteDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDomainNameRequest, DeleteDomainNameResult> asyncHandler) {
        final DeleteDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDomainNameResult>() {
            @Override
            public DeleteDomainNameResult call() throws Exception {
                DeleteDomainNameResult result = null;

                try {
                    result = executeDeleteDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(DeleteIntegrationRequest request) {

        return deleteIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResult> deleteIntegrationAsync(final DeleteIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationRequest, DeleteIntegrationResult> asyncHandler) {
        final DeleteIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntegrationResult>() {
            @Override
            public DeleteIntegrationResult call() throws Exception {
                DeleteIntegrationResult result = null;

                try {
                    result = executeDeleteIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(DeleteIntegrationResponseRequest request) {

        return deleteIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIntegrationResponseResult> deleteIntegrationResponseAsync(final DeleteIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIntegrationResponseRequest, DeleteIntegrationResponseResult> asyncHandler) {
        final DeleteIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIntegrationResponseResult>() {
            @Override
            public DeleteIntegrationResponseResult call() throws Exception {
                DeleteIntegrationResponseResult result = null;

                try {
                    result = executeDeleteIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(DeleteModelRequest request) {

        return deleteModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteModelResult> deleteModelAsync(final DeleteModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteModelRequest, DeleteModelResult> asyncHandler) {
        final DeleteModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteModelResult>() {
            @Override
            public DeleteModelResult call() throws Exception {
                DeleteModelResult result = null;

                try {
                    result = executeDeleteModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest request) {

        return deleteRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(final DeleteRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler) {
        final DeleteRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRouteResult>() {
            @Override
            public DeleteRouteResult call() throws Exception {
                DeleteRouteResult result = null;

                try {
                    result = executeDeleteRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResponseResult> deleteRouteResponseAsync(DeleteRouteResponseRequest request) {

        return deleteRouteResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResponseResult> deleteRouteResponseAsync(final DeleteRouteResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRouteResponseRequest, DeleteRouteResponseResult> asyncHandler) {
        final DeleteRouteResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRouteResponseResult>() {
            @Override
            public DeleteRouteResponseResult call() throws Exception {
                DeleteRouteResponseResult result = null;

                try {
                    result = executeDeleteRouteResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest request) {

        return deleteStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(final DeleteStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler) {
        final DeleteStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStageResult>() {
            @Override
            public DeleteStageResult call() throws Exception {
                DeleteStageResult result = null;

                try {
                    result = executeDeleteStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApiResult> getApiAsync(GetApiRequest request) {

        return getApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiResult> getApiAsync(final GetApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApiRequest, GetApiResult> asyncHandler) {
        final GetApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApiResult>() {
            @Override
            public GetApiResult call() throws Exception {
                GetApiResult result = null;

                try {
                    result = executeGetApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApiMappingResult> getApiMappingAsync(GetApiMappingRequest request) {

        return getApiMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiMappingResult> getApiMappingAsync(final GetApiMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApiMappingRequest, GetApiMappingResult> asyncHandler) {
        final GetApiMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApiMappingResult>() {
            @Override
            public GetApiMappingResult call() throws Exception {
                GetApiMappingResult result = null;

                try {
                    result = executeGetApiMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApiMappingsResult> getApiMappingsAsync(GetApiMappingsRequest request) {

        return getApiMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApiMappingsResult> getApiMappingsAsync(final GetApiMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApiMappingsRequest, GetApiMappingsResult> asyncHandler) {
        final GetApiMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApiMappingsResult>() {
            @Override
            public GetApiMappingsResult call() throws Exception {
                GetApiMappingsResult result = null;

                try {
                    result = executeGetApiMappings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetApisResult> getApisAsync(GetApisRequest request) {

        return getApisAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetApisResult> getApisAsync(final GetApisRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetApisRequest, GetApisResult> asyncHandler) {
        final GetApisRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetApisResult>() {
            @Override
            public GetApisResult call() throws Exception {
                GetApisResult result = null;

                try {
                    result = executeGetApis(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(GetAuthorizerRequest request) {

        return getAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizerResult> getAuthorizerAsync(final GetAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthorizerRequest, GetAuthorizerResult> asyncHandler) {
        final GetAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAuthorizerResult>() {
            @Override
            public GetAuthorizerResult call() throws Exception {
                GetAuthorizerResult result = null;

                try {
                    result = executeGetAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(GetAuthorizersRequest request) {

        return getAuthorizersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizersResult> getAuthorizersAsync(final GetAuthorizersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthorizersRequest, GetAuthorizersResult> asyncHandler) {
        final GetAuthorizersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAuthorizersResult>() {
            @Override
            public GetAuthorizersResult call() throws Exception {
                GetAuthorizersResult result = null;

                try {
                    result = executeGetAuthorizers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest request) {

        return getDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(final GetDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler) {
        final GetDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentResult>() {
            @Override
            public GetDeploymentResult call() throws Exception {
                GetDeploymentResult result = null;

                try {
                    result = executeGetDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(GetDeploymentsRequest request) {

        return getDeploymentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentsResult> getDeploymentsAsync(final GetDeploymentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeploymentsRequest, GetDeploymentsResult> asyncHandler) {
        final GetDeploymentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeploymentsResult>() {
            @Override
            public GetDeploymentsResult call() throws Exception {
                GetDeploymentsResult result = null;

                try {
                    result = executeGetDeployments(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(GetDomainNameRequest request) {

        return getDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNameResult> getDomainNameAsync(final GetDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainNameRequest, GetDomainNameResult> asyncHandler) {
        final GetDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainNameResult>() {
            @Override
            public GetDomainNameResult call() throws Exception {
                GetDomainNameResult result = null;

                try {
                    result = executeGetDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(GetDomainNamesRequest request) {

        return getDomainNamesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDomainNamesResult> getDomainNamesAsync(final GetDomainNamesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDomainNamesRequest, GetDomainNamesResult> asyncHandler) {
        final GetDomainNamesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDomainNamesResult>() {
            @Override
            public GetDomainNamesResult call() throws Exception {
                GetDomainNamesResult result = null;

                try {
                    result = executeGetDomainNames(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(GetIntegrationRequest request) {

        return getIntegrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResult> getIntegrationAsync(final GetIntegrationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationRequest, GetIntegrationResult> asyncHandler) {
        final GetIntegrationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntegrationResult>() {
            @Override
            public GetIntegrationResult call() throws Exception {
                GetIntegrationResult result = null;

                try {
                    result = executeGetIntegration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(GetIntegrationResponseRequest request) {

        return getIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponseResult> getIntegrationResponseAsync(final GetIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationResponseRequest, GetIntegrationResponseResult> asyncHandler) {
        final GetIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntegrationResponseResult>() {
            @Override
            public GetIntegrationResponseResult call() throws Exception {
                GetIntegrationResponseResult result = null;

                try {
                    result = executeGetIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponsesResult> getIntegrationResponsesAsync(GetIntegrationResponsesRequest request) {

        return getIntegrationResponsesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationResponsesResult> getIntegrationResponsesAsync(final GetIntegrationResponsesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationResponsesRequest, GetIntegrationResponsesResult> asyncHandler) {
        final GetIntegrationResponsesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntegrationResponsesResult>() {
            @Override
            public GetIntegrationResponsesResult call() throws Exception {
                GetIntegrationResponsesResult result = null;

                try {
                    result = executeGetIntegrationResponses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationsResult> getIntegrationsAsync(GetIntegrationsRequest request) {

        return getIntegrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIntegrationsResult> getIntegrationsAsync(final GetIntegrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIntegrationsRequest, GetIntegrationsResult> asyncHandler) {
        final GetIntegrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIntegrationsResult>() {
            @Override
            public GetIntegrationsResult call() throws Exception {
                GetIntegrationsResult result = null;

                try {
                    result = executeGetIntegrations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelResult> getModelAsync(GetModelRequest request) {

        return getModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelResult> getModelAsync(final GetModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelRequest, GetModelResult> asyncHandler) {
        final GetModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelResult>() {
            @Override
            public GetModelResult call() throws Exception {
                GetModelResult result = null;

                try {
                    result = executeGetModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(GetModelTemplateRequest request) {

        return getModelTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelTemplateResult> getModelTemplateAsync(final GetModelTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelTemplateRequest, GetModelTemplateResult> asyncHandler) {
        final GetModelTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelTemplateResult>() {
            @Override
            public GetModelTemplateResult call() throws Exception {
                GetModelTemplateResult result = null;

                try {
                    result = executeGetModelTemplate(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(GetModelsRequest request) {

        return getModelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetModelsResult> getModelsAsync(final GetModelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetModelsRequest, GetModelsResult> asyncHandler) {
        final GetModelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetModelsResult>() {
            @Override
            public GetModelsResult call() throws Exception {
                GetModelsResult result = null;

                try {
                    result = executeGetModels(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRouteResult> getRouteAsync(GetRouteRequest request) {

        return getRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRouteResult> getRouteAsync(final GetRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRouteRequest, GetRouteResult> asyncHandler) {
        final GetRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRouteResult>() {
            @Override
            public GetRouteResult call() throws Exception {
                GetRouteResult result = null;

                try {
                    result = executeGetRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRouteResponseResult> getRouteResponseAsync(GetRouteResponseRequest request) {

        return getRouteResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRouteResponseResult> getRouteResponseAsync(final GetRouteResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRouteResponseRequest, GetRouteResponseResult> asyncHandler) {
        final GetRouteResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRouteResponseResult>() {
            @Override
            public GetRouteResponseResult call() throws Exception {
                GetRouteResponseResult result = null;

                try {
                    result = executeGetRouteResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRouteResponsesResult> getRouteResponsesAsync(GetRouteResponsesRequest request) {

        return getRouteResponsesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRouteResponsesResult> getRouteResponsesAsync(final GetRouteResponsesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRouteResponsesRequest, GetRouteResponsesResult> asyncHandler) {
        final GetRouteResponsesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRouteResponsesResult>() {
            @Override
            public GetRouteResponsesResult call() throws Exception {
                GetRouteResponsesResult result = null;

                try {
                    result = executeGetRouteResponses(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRoutesResult> getRoutesAsync(GetRoutesRequest request) {

        return getRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoutesResult> getRoutesAsync(final GetRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRoutesRequest, GetRoutesResult> asyncHandler) {
        final GetRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRoutesResult>() {
            @Override
            public GetRoutesResult call() throws Exception {
                GetRoutesResult result = null;

                try {
                    result = executeGetRoutes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest request) {

        return getStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(final GetStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler) {
        final GetStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStageResult>() {
            @Override
            public GetStageResult call() throws Exception {
                GetStageResult result = null;

                try {
                    result = executeGetStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(GetStagesRequest request) {

        return getStagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStagesResult> getStagesAsync(final GetStagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStagesRequest, GetStagesResult> asyncHandler) {
        final GetStagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStagesResult>() {
            @Override
            public GetStagesResult call() throws Exception {
                GetStagesResult result = null;

                try {
                    result = executeGetStages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApiResult> updateApiAsync(UpdateApiRequest request) {

        return updateApiAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiResult> updateApiAsync(final UpdateApiRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApiRequest, UpdateApiResult> asyncHandler) {
        final UpdateApiRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApiResult>() {
            @Override
            public UpdateApiResult call() throws Exception {
                UpdateApiResult result = null;

                try {
                    result = executeUpdateApi(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateApiMappingResult> updateApiMappingAsync(UpdateApiMappingRequest request) {

        return updateApiMappingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiMappingResult> updateApiMappingAsync(final UpdateApiMappingRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateApiMappingRequest, UpdateApiMappingResult> asyncHandler) {
        final UpdateApiMappingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateApiMappingResult>() {
            @Override
            public UpdateApiMappingResult call() throws Exception {
                UpdateApiMappingResult result = null;

                try {
                    result = executeUpdateApiMapping(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(UpdateAuthorizerRequest request) {

        return updateAuthorizerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthorizerResult> updateAuthorizerAsync(final UpdateAuthorizerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAuthorizerRequest, UpdateAuthorizerResult> asyncHandler) {
        final UpdateAuthorizerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAuthorizerResult>() {
            @Override
            public UpdateAuthorizerResult call() throws Exception {
                UpdateAuthorizerResult result = null;

                try {
                    result = executeUpdateAuthorizer(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(UpdateDeploymentRequest request) {

        return updateDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResult> updateDeploymentAsync(final UpdateDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResult> asyncHandler) {
        final UpdateDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeploymentResult>() {
            @Override
            public UpdateDeploymentResult call() throws Exception {
                UpdateDeploymentResult result = null;

                try {
                    result = executeUpdateDeployment(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(UpdateDomainNameRequest request) {

        return updateDomainNameAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDomainNameResult> updateDomainNameAsync(final UpdateDomainNameRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDomainNameRequest, UpdateDomainNameResult> asyncHandler) {
        final UpdateDomainNameRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDomainNameResult>() {
            @Override
            public UpdateDomainNameResult call() throws Exception {
                UpdateDomainNameResult result = null;

                try {
                    result = executeUpdateDomainName(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(UpdateIntegrationResponseRequest request) {

        return updateIntegrationResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIntegrationResponseResult> updateIntegrationResponseAsync(final UpdateIntegrationResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIntegrationResponseRequest, UpdateIntegrationResponseResult> asyncHandler) {
        final UpdateIntegrationResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIntegrationResponseResult>() {
            @Override
            public UpdateIntegrationResponseResult call() throws Exception {
                UpdateIntegrationResponseResult result = null;

                try {
                    result = executeUpdateIntegrationResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(UpdateModelRequest request) {

        return updateModelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateModelResult> updateModelAsync(final UpdateModelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateModelRequest, UpdateModelResult> asyncHandler) {
        final UpdateModelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateModelResult>() {
            @Override
            public UpdateModelResult call() throws Exception {
                UpdateModelResult result = null;

                try {
                    result = executeUpdateModel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest request) {

        return updateRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(final UpdateRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRouteRequest, UpdateRouteResult> asyncHandler) {
        final UpdateRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRouteResult>() {
            @Override
            public UpdateRouteResult call() throws Exception {
                UpdateRouteResult result = null;

                try {
                    result = executeUpdateRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRouteResponseResult> updateRouteResponseAsync(UpdateRouteResponseRequest request) {

        return updateRouteResponseAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRouteResponseResult> updateRouteResponseAsync(final UpdateRouteResponseRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRouteResponseRequest, UpdateRouteResponseResult> asyncHandler) {
        final UpdateRouteResponseRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRouteResponseResult>() {
            @Override
            public UpdateRouteResponseResult call() throws Exception {
                UpdateRouteResponseResult result = null;

                try {
                    result = executeUpdateRouteResponse(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest request) {

        return updateStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(final UpdateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler) {
        final UpdateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStageResult>() {
            @Override
            public UpdateStageResult call() throws Exception {
                UpdateStageResult result = null;

                try {
                    result = executeUpdateStage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
