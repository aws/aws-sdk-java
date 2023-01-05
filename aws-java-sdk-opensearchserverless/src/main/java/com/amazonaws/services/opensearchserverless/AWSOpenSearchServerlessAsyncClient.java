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
package com.amazonaws.services.opensearchserverless;

import javax.annotation.Generated;

import com.amazonaws.services.opensearchserverless.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing OpenSearch Service Serverless asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Use the Amazon OpenSearch Serverless API to create, configure, and manage OpenSearch Serverless collections and
 * security policies.
 * </p>
 * <p>
 * OpenSearch Serverless is an on-demand, pre-provisioned serverless configuration for Amazon OpenSearch Service.
 * OpenSearch Serverless removes the operational complexities of provisioning, configuring, and tuning your OpenSearch
 * clusters. It enables you to easily search and analyze petabytes of data without having to worry about the underlying
 * infrastructure and data management.
 * </p>
 * <p>
 * To learn more about OpenSearch Serverless, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-overview.html">What is Amazon
 * OpenSearch Serverless?</a>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOpenSearchServerlessAsyncClient extends AWSOpenSearchServerlessClient implements AWSOpenSearchServerlessAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSOpenSearchServerlessAsyncClientBuilder asyncBuilder() {
        return AWSOpenSearchServerlessAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpenSearch Service Serverless using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSOpenSearchServerlessAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on OpenSearch Service Serverless using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSOpenSearchServerlessAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetCollectionResult> batchGetCollectionAsync(BatchGetCollectionRequest request) {

        return batchGetCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetCollectionResult> batchGetCollectionAsync(final BatchGetCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetCollectionRequest, BatchGetCollectionResult> asyncHandler) {
        final BatchGetCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetCollectionResult>() {
            @Override
            public BatchGetCollectionResult call() throws Exception {
                BatchGetCollectionResult result = null;

                try {
                    result = executeBatchGetCollection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetVpcEndpointResult> batchGetVpcEndpointAsync(BatchGetVpcEndpointRequest request) {

        return batchGetVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetVpcEndpointResult> batchGetVpcEndpointAsync(final BatchGetVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetVpcEndpointRequest, BatchGetVpcEndpointResult> asyncHandler) {
        final BatchGetVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetVpcEndpointResult>() {
            @Override
            public BatchGetVpcEndpointResult call() throws Exception {
                BatchGetVpcEndpointResult result = null;

                try {
                    result = executeBatchGetVpcEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(CreateAccessPolicyRequest request) {

        return createAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPolicyResult> createAccessPolicyAsync(final CreateAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccessPolicyRequest, CreateAccessPolicyResult> asyncHandler) {
        final CreateAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccessPolicyResult>() {
            @Override
            public CreateAccessPolicyResult call() throws Exception {
                CreateAccessPolicyResult result = null;

                try {
                    result = executeCreateAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(CreateCollectionRequest request) {

        return createCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCollectionResult> createCollectionAsync(final CreateCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCollectionRequest, CreateCollectionResult> asyncHandler) {
        final CreateCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCollectionResult>() {
            @Override
            public CreateCollectionResult call() throws Exception {
                CreateCollectionResult result = null;

                try {
                    result = executeCreateCollection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityConfigResult> createSecurityConfigAsync(CreateSecurityConfigRequest request) {

        return createSecurityConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityConfigResult> createSecurityConfigAsync(final CreateSecurityConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSecurityConfigRequest, CreateSecurityConfigResult> asyncHandler) {
        final CreateSecurityConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSecurityConfigResult>() {
            @Override
            public CreateSecurityConfigResult call() throws Exception {
                CreateSecurityConfigResult result = null;

                try {
                    result = executeCreateSecurityConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityPolicyResult> createSecurityPolicyAsync(CreateSecurityPolicyRequest request) {

        return createSecurityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSecurityPolicyResult> createSecurityPolicyAsync(final CreateSecurityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSecurityPolicyRequest, CreateSecurityPolicyResult> asyncHandler) {
        final CreateSecurityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSecurityPolicyResult>() {
            @Override
            public CreateSecurityPolicyResult call() throws Exception {
                CreateSecurityPolicyResult result = null;

                try {
                    result = executeCreateSecurityPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(CreateVpcEndpointRequest request) {

        return createVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcEndpointResult> createVpcEndpointAsync(final CreateVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcEndpointRequest, CreateVpcEndpointResult> asyncHandler) {
        final CreateVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcEndpointResult>() {
            @Override
            public CreateVpcEndpointResult call() throws Exception {
                CreateVpcEndpointResult result = null;

                try {
                    result = executeCreateVpcEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(DeleteAccessPolicyRequest request) {

        return deleteAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPolicyResult> deleteAccessPolicyAsync(final DeleteAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessPolicyRequest, DeleteAccessPolicyResult> asyncHandler) {
        final DeleteAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessPolicyResult>() {
            @Override
            public DeleteAccessPolicyResult call() throws Exception {
                DeleteAccessPolicyResult result = null;

                try {
                    result = executeDeleteAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(DeleteCollectionRequest request) {

        return deleteCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCollectionResult> deleteCollectionAsync(final DeleteCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCollectionRequest, DeleteCollectionResult> asyncHandler) {
        final DeleteCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCollectionResult>() {
            @Override
            public DeleteCollectionResult call() throws Exception {
                DeleteCollectionResult result = null;

                try {
                    result = executeDeleteCollection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityConfigResult> deleteSecurityConfigAsync(DeleteSecurityConfigRequest request) {

        return deleteSecurityConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityConfigResult> deleteSecurityConfigAsync(final DeleteSecurityConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSecurityConfigRequest, DeleteSecurityConfigResult> asyncHandler) {
        final DeleteSecurityConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSecurityConfigResult>() {
            @Override
            public DeleteSecurityConfigResult call() throws Exception {
                DeleteSecurityConfigResult result = null;

                try {
                    result = executeDeleteSecurityConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityPolicyResult> deleteSecurityPolicyAsync(DeleteSecurityPolicyRequest request) {

        return deleteSecurityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSecurityPolicyResult> deleteSecurityPolicyAsync(final DeleteSecurityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSecurityPolicyRequest, DeleteSecurityPolicyResult> asyncHandler) {
        final DeleteSecurityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSecurityPolicyResult>() {
            @Override
            public DeleteSecurityPolicyResult call() throws Exception {
                DeleteSecurityPolicyResult result = null;

                try {
                    result = executeDeleteSecurityPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(DeleteVpcEndpointRequest request) {

        return deleteVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcEndpointResult> deleteVpcEndpointAsync(final DeleteVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcEndpointRequest, DeleteVpcEndpointResult> asyncHandler) {
        final DeleteVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcEndpointResult>() {
            @Override
            public DeleteVpcEndpointResult call() throws Exception {
                DeleteVpcEndpointResult result = null;

                try {
                    result = executeDeleteVpcEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccessPolicyResult> getAccessPolicyAsync(GetAccessPolicyRequest request) {

        return getAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPolicyResult> getAccessPolicyAsync(final GetAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessPolicyRequest, GetAccessPolicyResult> asyncHandler) {
        final GetAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessPolicyResult>() {
            @Override
            public GetAccessPolicyResult call() throws Exception {
                GetAccessPolicyResult result = null;

                try {
                    result = executeGetAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(final GetAccountSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {
        final GetAccountSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccountSettingsResult>() {
            @Override
            public GetAccountSettingsResult call() throws Exception {
                GetAccountSettingsResult result = null;

                try {
                    result = executeGetAccountSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPoliciesStatsResult> getPoliciesStatsAsync(GetPoliciesStatsRequest request) {

        return getPoliciesStatsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPoliciesStatsResult> getPoliciesStatsAsync(final GetPoliciesStatsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPoliciesStatsRequest, GetPoliciesStatsResult> asyncHandler) {
        final GetPoliciesStatsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPoliciesStatsResult>() {
            @Override
            public GetPoliciesStatsResult call() throws Exception {
                GetPoliciesStatsResult result = null;

                try {
                    result = executeGetPoliciesStats(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSecurityConfigResult> getSecurityConfigAsync(GetSecurityConfigRequest request) {

        return getSecurityConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityConfigResult> getSecurityConfigAsync(final GetSecurityConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSecurityConfigRequest, GetSecurityConfigResult> asyncHandler) {
        final GetSecurityConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSecurityConfigResult>() {
            @Override
            public GetSecurityConfigResult call() throws Exception {
                GetSecurityConfigResult result = null;

                try {
                    result = executeGetSecurityConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyResult> getSecurityPolicyAsync(GetSecurityPolicyRequest request) {

        return getSecurityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityPolicyResult> getSecurityPolicyAsync(final GetSecurityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSecurityPolicyRequest, GetSecurityPolicyResult> asyncHandler) {
        final GetSecurityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSecurityPolicyResult>() {
            @Override
            public GetSecurityPolicyResult call() throws Exception {
                GetSecurityPolicyResult result = null;

                try {
                    result = executeGetSecurityPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(ListAccessPoliciesRequest request) {

        return listAccessPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessPoliciesResult> listAccessPoliciesAsync(final ListAccessPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccessPoliciesRequest, ListAccessPoliciesResult> asyncHandler) {
        final ListAccessPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccessPoliciesResult>() {
            @Override
            public ListAccessPoliciesResult call() throws Exception {
                ListAccessPoliciesResult result = null;

                try {
                    result = executeListAccessPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(ListCollectionsRequest request) {

        return listCollectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCollectionsResult> listCollectionsAsync(final ListCollectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCollectionsRequest, ListCollectionsResult> asyncHandler) {
        final ListCollectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCollectionsResult>() {
            @Override
            public ListCollectionsResult call() throws Exception {
                ListCollectionsResult result = null;

                try {
                    result = executeListCollections(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSecurityConfigsResult> listSecurityConfigsAsync(ListSecurityConfigsRequest request) {

        return listSecurityConfigsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityConfigsResult> listSecurityConfigsAsync(final ListSecurityConfigsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityConfigsRequest, ListSecurityConfigsResult> asyncHandler) {
        final ListSecurityConfigsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityConfigsResult>() {
            @Override
            public ListSecurityConfigsResult call() throws Exception {
                ListSecurityConfigsResult result = null;

                try {
                    result = executeListSecurityConfigs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(ListSecurityPoliciesRequest request) {

        return listSecurityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityPoliciesResult> listSecurityPoliciesAsync(final ListSecurityPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityPoliciesRequest, ListSecurityPoliciesResult> asyncHandler) {
        final ListSecurityPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityPoliciesResult>() {
            @Override
            public ListSecurityPoliciesResult call() throws Exception {
                ListSecurityPoliciesResult result = null;

                try {
                    result = executeListSecurityPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(ListVpcEndpointsRequest request) {

        return listVpcEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVpcEndpointsResult> listVpcEndpointsAsync(final ListVpcEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVpcEndpointsRequest, ListVpcEndpointsResult> asyncHandler) {
        final ListVpcEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVpcEndpointsResult>() {
            @Override
            public ListVpcEndpointsResult call() throws Exception {
                ListVpcEndpointsResult result = null;

                try {
                    result = executeListVpcEndpoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(UpdateAccessPolicyRequest request) {

        return updateAccessPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccessPolicyResult> updateAccessPolicyAsync(final UpdateAccessPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccessPolicyRequest, UpdateAccessPolicyResult> asyncHandler) {
        final UpdateAccessPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccessPolicyResult>() {
            @Override
            public UpdateAccessPolicyResult call() throws Exception {
                UpdateAccessPolicyResult result = null;

                try {
                    result = executeUpdateAccessPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UpdateCollectionResult> updateCollectionAsync(UpdateCollectionRequest request) {

        return updateCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCollectionResult> updateCollectionAsync(final UpdateCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCollectionRequest, UpdateCollectionResult> asyncHandler) {
        final UpdateCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCollectionResult>() {
            @Override
            public UpdateCollectionResult call() throws Exception {
                UpdateCollectionResult result = null;

                try {
                    result = executeUpdateCollection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityConfigResult> updateSecurityConfigAsync(UpdateSecurityConfigRequest request) {

        return updateSecurityConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityConfigResult> updateSecurityConfigAsync(final UpdateSecurityConfigRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecurityConfigRequest, UpdateSecurityConfigResult> asyncHandler) {
        final UpdateSecurityConfigRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecurityConfigResult>() {
            @Override
            public UpdateSecurityConfigResult call() throws Exception {
                UpdateSecurityConfigResult result = null;

                try {
                    result = executeUpdateSecurityConfig(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityPolicyResult> updateSecurityPolicyAsync(UpdateSecurityPolicyRequest request) {

        return updateSecurityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityPolicyResult> updateSecurityPolicyAsync(final UpdateSecurityPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecurityPolicyRequest, UpdateSecurityPolicyResult> asyncHandler) {
        final UpdateSecurityPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecurityPolicyResult>() {
            @Override
            public UpdateSecurityPolicyResult call() throws Exception {
                UpdateSecurityPolicyResult result = null;

                try {
                    result = executeUpdateSecurityPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(UpdateVpcEndpointRequest request) {

        return updateVpcEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVpcEndpointResult> updateVpcEndpointAsync(final UpdateVpcEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVpcEndpointRequest, UpdateVpcEndpointResult> asyncHandler) {
        final UpdateVpcEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVpcEndpointResult>() {
            @Override
            public UpdateVpcEndpointResult call() throws Exception {
                UpdateVpcEndpointResult result = null;

                try {
                    result = executeUpdateVpcEndpoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
