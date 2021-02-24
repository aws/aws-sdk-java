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
package com.amazonaws.services.ecrpublic;

import javax.annotation.Generated;

import com.amazonaws.services.ecrpublic.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon ECR Public asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic Container Registry Public</fullname>
 * <p>
 * Amazon Elastic Container Registry (Amazon ECR) is a managed container image registry service. Amazon ECR provides
 * both public and private registries to host your container images. You can use the familiar Docker CLI, or their
 * preferred client, to push, pull, and manage images. Amazon ECR provides a secure, scalable, and reliable registry for
 * your Docker or Open Container Initiative (OCI) images. Amazon ECR supports public repositories with this API. For
 * information about the Amazon ECR API for private repositories, see <a
 * href="https://docs.aws.amazon.com/AmazonECR/latest/APIReference/Welcome.html">Amazon Elastic Container Registry API
 * Reference</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonECRPublicAsyncClient extends AmazonECRPublicClient implements AmazonECRPublicAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonECRPublicAsyncClientBuilder asyncBuilder() {
        return AmazonECRPublicAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR Public using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonECRPublicAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon ECR Public using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonECRPublicAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(BatchCheckLayerAvailabilityRequest request) {

        return batchCheckLayerAvailabilityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCheckLayerAvailabilityResult> batchCheckLayerAvailabilityAsync(final BatchCheckLayerAvailabilityRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCheckLayerAvailabilityRequest, BatchCheckLayerAvailabilityResult> asyncHandler) {
        final BatchCheckLayerAvailabilityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCheckLayerAvailabilityResult>() {
            @Override
            public BatchCheckLayerAvailabilityResult call() throws Exception {
                BatchCheckLayerAvailabilityResult result = null;

                try {
                    result = executeBatchCheckLayerAvailability(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(BatchDeleteImageRequest request) {

        return batchDeleteImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteImageResult> batchDeleteImageAsync(final BatchDeleteImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteImageRequest, BatchDeleteImageResult> asyncHandler) {
        final BatchDeleteImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteImageResult>() {
            @Override
            public BatchDeleteImageResult call() throws Exception {
                BatchDeleteImageResult result = null;

                try {
                    result = executeBatchDeleteImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(CompleteLayerUploadRequest request) {

        return completeLayerUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CompleteLayerUploadResult> completeLayerUploadAsync(final CompleteLayerUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<CompleteLayerUploadRequest, CompleteLayerUploadResult> asyncHandler) {
        final CompleteLayerUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CompleteLayerUploadResult>() {
            @Override
            public CompleteLayerUploadResult call() throws Exception {
                CompleteLayerUploadResult result = null;

                try {
                    result = executeCompleteLayerUpload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(CreateRepositoryRequest request) {

        return createRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResult> createRepositoryAsync(final CreateRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResult> asyncHandler) {
        final CreateRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRepositoryResult>() {
            @Override
            public CreateRepositoryResult call() throws Exception {
                CreateRepositoryResult result = null;

                try {
                    result = executeCreateRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(DeleteRepositoryRequest request) {

        return deleteRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResult> deleteRepositoryAsync(final DeleteRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResult> asyncHandler) {
        final DeleteRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRepositoryResult>() {
            @Override
            public DeleteRepositoryResult call() throws Exception {
                DeleteRepositoryResult result = null;

                try {
                    result = executeDeleteRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(DeleteRepositoryPolicyRequest request) {

        return deleteRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryPolicyResult> deleteRepositoryPolicyAsync(final DeleteRepositoryPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRepositoryPolicyRequest, DeleteRepositoryPolicyResult> asyncHandler) {
        final DeleteRepositoryPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRepositoryPolicyResult>() {
            @Override
            public DeleteRepositoryPolicyResult call() throws Exception {
                DeleteRepositoryPolicyResult result = null;

                try {
                    result = executeDeleteRepositoryPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImageTagsResult> describeImageTagsAsync(DescribeImageTagsRequest request) {

        return describeImageTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImageTagsResult> describeImageTagsAsync(final DescribeImageTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImageTagsRequest, DescribeImageTagsResult> asyncHandler) {
        final DescribeImageTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImageTagsResult>() {
            @Override
            public DescribeImageTagsResult call() throws Exception {
                DescribeImageTagsResult result = null;

                try {
                    result = executeDescribeImageTags(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest request) {

        return describeImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(final DescribeImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler) {
        final DescribeImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeImagesResult>() {
            @Override
            public DescribeImagesResult call() throws Exception {
                DescribeImagesResult result = null;

                try {
                    result = executeDescribeImages(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistriesResult> describeRegistriesAsync(DescribeRegistriesRequest request) {

        return describeRegistriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRegistriesResult> describeRegistriesAsync(final DescribeRegistriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRegistriesRequest, DescribeRegistriesResult> asyncHandler) {
        final DescribeRegistriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRegistriesResult>() {
            @Override
            public DescribeRegistriesResult call() throws Exception {
                DescribeRegistriesResult result = null;

                try {
                    result = executeDescribeRegistries(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(DescribeRepositoriesRequest request) {

        return describeRepositoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoriesResult> describeRepositoriesAsync(final DescribeRepositoriesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRepositoriesRequest, DescribeRepositoriesResult> asyncHandler) {
        final DescribeRepositoriesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRepositoriesResult>() {
            @Override
            public DescribeRepositoriesResult call() throws Exception {
                DescribeRepositoriesResult result = null;

                try {
                    result = executeDescribeRepositories(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(GetAuthorizationTokenRequest request) {

        return getAuthorizationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAuthorizationTokenResult> getAuthorizationTokenAsync(final GetAuthorizationTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAuthorizationTokenRequest, GetAuthorizationTokenResult> asyncHandler) {
        final GetAuthorizationTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAuthorizationTokenResult>() {
            @Override
            public GetAuthorizationTokenResult call() throws Exception {
                GetAuthorizationTokenResult result = null;

                try {
                    result = executeGetAuthorizationToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRegistryCatalogDataResult> getRegistryCatalogDataAsync(GetRegistryCatalogDataRequest request) {

        return getRegistryCatalogDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegistryCatalogDataResult> getRegistryCatalogDataAsync(final GetRegistryCatalogDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegistryCatalogDataRequest, GetRegistryCatalogDataResult> asyncHandler) {
        final GetRegistryCatalogDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegistryCatalogDataResult>() {
            @Override
            public GetRegistryCatalogDataResult call() throws Exception {
                GetRegistryCatalogDataResult result = null;

                try {
                    result = executeGetRegistryCatalogData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryCatalogDataResult> getRepositoryCatalogDataAsync(GetRepositoryCatalogDataRequest request) {

        return getRepositoryCatalogDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryCatalogDataResult> getRepositoryCatalogDataAsync(final GetRepositoryCatalogDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryCatalogDataRequest, GetRepositoryCatalogDataResult> asyncHandler) {
        final GetRepositoryCatalogDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryCatalogDataResult>() {
            @Override
            public GetRepositoryCatalogDataResult call() throws Exception {
                GetRepositoryCatalogDataResult result = null;

                try {
                    result = executeGetRepositoryCatalogData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(GetRepositoryPolicyRequest request) {

        return getRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryPolicyResult> getRepositoryPolicyAsync(final GetRepositoryPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRepositoryPolicyRequest, GetRepositoryPolicyResult> asyncHandler) {
        final GetRepositoryPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRepositoryPolicyResult>() {
            @Override
            public GetRepositoryPolicyResult call() throws Exception {
                GetRepositoryPolicyResult result = null;

                try {
                    result = executeGetRepositoryPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(InitiateLayerUploadRequest request) {

        return initiateLayerUploadAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitiateLayerUploadResult> initiateLayerUploadAsync(final InitiateLayerUploadRequest request,
            final com.amazonaws.handlers.AsyncHandler<InitiateLayerUploadRequest, InitiateLayerUploadResult> asyncHandler) {
        final InitiateLayerUploadRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InitiateLayerUploadResult>() {
            @Override
            public InitiateLayerUploadResult call() throws Exception {
                InitiateLayerUploadResult result = null;

                try {
                    result = executeInitiateLayerUpload(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<PutImageResult> putImageAsync(PutImageRequest request) {

        return putImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutImageResult> putImageAsync(final PutImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutImageRequest, PutImageResult> asyncHandler) {
        final PutImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutImageResult>() {
            @Override
            public PutImageResult call() throws Exception {
                PutImageResult result = null;

                try {
                    result = executePutImage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRegistryCatalogDataResult> putRegistryCatalogDataAsync(PutRegistryCatalogDataRequest request) {

        return putRegistryCatalogDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRegistryCatalogDataResult> putRegistryCatalogDataAsync(final PutRegistryCatalogDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRegistryCatalogDataRequest, PutRegistryCatalogDataResult> asyncHandler) {
        final PutRegistryCatalogDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRegistryCatalogDataResult>() {
            @Override
            public PutRegistryCatalogDataResult call() throws Exception {
                PutRegistryCatalogDataResult result = null;

                try {
                    result = executePutRegistryCatalogData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryCatalogDataResult> putRepositoryCatalogDataAsync(PutRepositoryCatalogDataRequest request) {

        return putRepositoryCatalogDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryCatalogDataResult> putRepositoryCatalogDataAsync(final PutRepositoryCatalogDataRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRepositoryCatalogDataRequest, PutRepositoryCatalogDataResult> asyncHandler) {
        final PutRepositoryCatalogDataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRepositoryCatalogDataResult>() {
            @Override
            public PutRepositoryCatalogDataResult call() throws Exception {
                PutRepositoryCatalogDataResult result = null;

                try {
                    result = executePutRepositoryCatalogData(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(SetRepositoryPolicyRequest request) {

        return setRepositoryPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetRepositoryPolicyResult> setRepositoryPolicyAsync(final SetRepositoryPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetRepositoryPolicyRequest, SetRepositoryPolicyResult> asyncHandler) {
        final SetRepositoryPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SetRepositoryPolicyResult>() {
            @Override
            public SetRepositoryPolicyResult call() throws Exception {
                SetRepositoryPolicyResult result = null;

                try {
                    result = executeSetRepositoryPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(UploadLayerPartRequest request) {

        return uploadLayerPartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadLayerPartResult> uploadLayerPartAsync(final UploadLayerPartRequest request,
            final com.amazonaws.handlers.AsyncHandler<UploadLayerPartRequest, UploadLayerPartResult> asyncHandler) {
        final UploadLayerPartRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UploadLayerPartResult>() {
            @Override
            public UploadLayerPartResult call() throws Exception {
                UploadLayerPartResult result = null;

                try {
                    result = executeUploadLayerPart(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
