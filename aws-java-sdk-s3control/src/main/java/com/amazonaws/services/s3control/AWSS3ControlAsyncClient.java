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
package com.amazonaws.services.s3control;

import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS S3 Control asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS S3 Control provides access to Amazon S3 control plane actions.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSS3ControlAsyncClient extends AWSS3ControlClient implements AWSS3ControlAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSS3ControlAsyncClientBuilder asyncBuilder() {
        return AWSS3ControlAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS S3 Control using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSS3ControlAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS S3 Control using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSS3ControlAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest request) {

        return createAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(final CreateAccessPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAccessPointRequest, CreateAccessPointResult> asyncHandler) {
        final CreateAccessPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAccessPointResult>() {
            @Override
            public CreateAccessPointResult call() throws Exception {
                CreateAccessPointResult result = null;

                try {
                    result = executeCreateAccessPoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBucketResult> createBucketAsync(CreateBucketRequest request) {

        return createBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBucketResult> createBucketAsync(final CreateBucketRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBucketRequest, CreateBucketResult> asyncHandler) {
        final CreateBucketRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBucketResult>() {
            @Override
            public CreateBucketResult call() throws Exception {
                CreateBucketResult result = null;

                try {
                    result = executeCreateBucket(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest request) {

        return deleteAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(final DeleteAccessPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessPointRequest, DeleteAccessPointResult> asyncHandler) {
        final DeleteAccessPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessPointResult>() {
            @Override
            public DeleteAccessPointResult call() throws Exception {
                DeleteAccessPointResult result = null;

                try {
                    result = executeDeleteAccessPoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(DeleteAccessPointPolicyRequest request) {

        return deleteAccessPointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(final DeleteAccessPointPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAccessPointPolicyRequest, DeleteAccessPointPolicyResult> asyncHandler) {
        final DeleteAccessPointPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAccessPointPolicyResult>() {
            @Override
            public DeleteAccessPointPolicyResult call() throws Exception {
                DeleteAccessPointPolicyResult result = null;

                try {
                    result = executeDeleteAccessPointPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(DeleteBucketRequest request) {

        return deleteBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(final DeleteBucketRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBucketRequest, DeleteBucketResult> asyncHandler) {
        final DeleteBucketRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBucketResult>() {
            @Override
            public DeleteBucketResult call() throws Exception {
                DeleteBucketResult result = null;

                try {
                    result = executeDeleteBucket(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketLifecycleConfigurationResult> deleteBucketLifecycleConfigurationAsync(
            DeleteBucketLifecycleConfigurationRequest request) {

        return deleteBucketLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketLifecycleConfigurationResult> deleteBucketLifecycleConfigurationAsync(
            final DeleteBucketLifecycleConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBucketLifecycleConfigurationRequest, DeleteBucketLifecycleConfigurationResult> asyncHandler) {
        final DeleteBucketLifecycleConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBucketLifecycleConfigurationResult>() {
            @Override
            public DeleteBucketLifecycleConfigurationResult call() throws Exception {
                DeleteBucketLifecycleConfigurationResult result = null;

                try {
                    result = executeDeleteBucketLifecycleConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketPolicyResult> deleteBucketPolicyAsync(DeleteBucketPolicyRequest request) {

        return deleteBucketPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketPolicyResult> deleteBucketPolicyAsync(final DeleteBucketPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBucketPolicyRequest, DeleteBucketPolicyResult> asyncHandler) {
        final DeleteBucketPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBucketPolicyResult>() {
            @Override
            public DeleteBucketPolicyResult call() throws Exception {
                DeleteBucketPolicyResult result = null;

                try {
                    result = executeDeleteBucketPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketTaggingResult> deleteBucketTaggingAsync(DeleteBucketTaggingRequest request) {

        return deleteBucketTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketTaggingResult> deleteBucketTaggingAsync(final DeleteBucketTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBucketTaggingRequest, DeleteBucketTaggingResult> asyncHandler) {
        final DeleteBucketTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBucketTaggingResult>() {
            @Override
            public DeleteBucketTaggingResult call() throws Exception {
                DeleteBucketTaggingResult result = null;

                try {
                    result = executeDeleteBucketTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(DeleteJobTaggingRequest request) {

        return deleteJobTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(final DeleteJobTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteJobTaggingRequest, DeleteJobTaggingResult> asyncHandler) {
        final DeleteJobTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteJobTaggingResult>() {
            @Override
            public DeleteJobTaggingResult call() throws Exception {
                DeleteJobTaggingResult result = null;

                try {
                    result = executeDeleteJobTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(DeletePublicAccessBlockRequest request) {

        return deletePublicAccessBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(final DeletePublicAccessBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePublicAccessBlockRequest, DeletePublicAccessBlockResult> asyncHandler) {
        final DeletePublicAccessBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePublicAccessBlockResult>() {
            @Override
            public DeletePublicAccessBlockResult call() throws Exception {
                DeletePublicAccessBlockResult result = null;

                try {
                    result = executeDeletePublicAccessBlock(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageLensConfigurationResult> deleteStorageLensConfigurationAsync(DeleteStorageLensConfigurationRequest request) {

        return deleteStorageLensConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageLensConfigurationResult> deleteStorageLensConfigurationAsync(
            final DeleteStorageLensConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStorageLensConfigurationRequest, DeleteStorageLensConfigurationResult> asyncHandler) {
        final DeleteStorageLensConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStorageLensConfigurationResult>() {
            @Override
            public DeleteStorageLensConfigurationResult call() throws Exception {
                DeleteStorageLensConfigurationResult result = null;

                try {
                    result = executeDeleteStorageLensConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageLensConfigurationTaggingResult> deleteStorageLensConfigurationTaggingAsync(
            DeleteStorageLensConfigurationTaggingRequest request) {

        return deleteStorageLensConfigurationTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageLensConfigurationTaggingResult> deleteStorageLensConfigurationTaggingAsync(
            final DeleteStorageLensConfigurationTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStorageLensConfigurationTaggingRequest, DeleteStorageLensConfigurationTaggingResult> asyncHandler) {
        final DeleteStorageLensConfigurationTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStorageLensConfigurationTaggingResult>() {
            @Override
            public DeleteStorageLensConfigurationTaggingResult call() throws Exception {
                DeleteStorageLensConfigurationTaggingResult result = null;

                try {
                    result = executeDeleteStorageLensConfigurationTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request) {

        return describeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(final DescribeJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler) {
        final DescribeJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobResult>() {
            @Override
            public DescribeJobResult call() throws Exception {
                DescribeJobResult result = null;

                try {
                    result = executeDescribeJob(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(GetAccessPointRequest request) {

        return getAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(final GetAccessPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessPointRequest, GetAccessPointResult> asyncHandler) {
        final GetAccessPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessPointResult>() {
            @Override
            public GetAccessPointResult call() throws Exception {
                GetAccessPointResult result = null;

                try {
                    result = executeGetAccessPoint(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(GetAccessPointPolicyRequest request) {

        return getAccessPointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(final GetAccessPointPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyRequest, GetAccessPointPolicyResult> asyncHandler) {
        final GetAccessPointPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessPointPolicyResult>() {
            @Override
            public GetAccessPointPolicyResult call() throws Exception {
                GetAccessPointPolicyResult result = null;

                try {
                    result = executeGetAccessPointPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(GetAccessPointPolicyStatusRequest request) {

        return getAccessPointPolicyStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(final GetAccessPointPolicyStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyStatusRequest, GetAccessPointPolicyStatusResult> asyncHandler) {
        final GetAccessPointPolicyStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAccessPointPolicyStatusResult>() {
            @Override
            public GetAccessPointPolicyStatusResult call() throws Exception {
                GetAccessPointPolicyStatusResult result = null;

                try {
                    result = executeGetAccessPointPolicyStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBucketResult> getBucketAsync(GetBucketRequest request) {

        return getBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketResult> getBucketAsync(final GetBucketRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBucketRequest, GetBucketResult> asyncHandler) {
        final GetBucketRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBucketResult>() {
            @Override
            public GetBucketResult call() throws Exception {
                GetBucketResult result = null;

                try {
                    result = executeGetBucket(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBucketLifecycleConfigurationResult> getBucketLifecycleConfigurationAsync(
            GetBucketLifecycleConfigurationRequest request) {

        return getBucketLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketLifecycleConfigurationResult> getBucketLifecycleConfigurationAsync(
            final GetBucketLifecycleConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBucketLifecycleConfigurationRequest, GetBucketLifecycleConfigurationResult> asyncHandler) {
        final GetBucketLifecycleConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBucketLifecycleConfigurationResult>() {
            @Override
            public GetBucketLifecycleConfigurationResult call() throws Exception {
                GetBucketLifecycleConfigurationResult result = null;

                try {
                    result = executeGetBucketLifecycleConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBucketPolicyResult> getBucketPolicyAsync(GetBucketPolicyRequest request) {

        return getBucketPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketPolicyResult> getBucketPolicyAsync(final GetBucketPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBucketPolicyRequest, GetBucketPolicyResult> asyncHandler) {
        final GetBucketPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBucketPolicyResult>() {
            @Override
            public GetBucketPolicyResult call() throws Exception {
                GetBucketPolicyResult result = null;

                try {
                    result = executeGetBucketPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetBucketTaggingResult> getBucketTaggingAsync(GetBucketTaggingRequest request) {

        return getBucketTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketTaggingResult> getBucketTaggingAsync(final GetBucketTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetBucketTaggingRequest, GetBucketTaggingResult> asyncHandler) {
        final GetBucketTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetBucketTaggingResult>() {
            @Override
            public GetBucketTaggingResult call() throws Exception {
                GetBucketTaggingResult result = null;

                try {
                    result = executeGetBucketTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(GetJobTaggingRequest request) {

        return getJobTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(final GetJobTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetJobTaggingRequest, GetJobTaggingResult> asyncHandler) {
        final GetJobTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetJobTaggingResult>() {
            @Override
            public GetJobTaggingResult call() throws Exception {
                GetJobTaggingResult result = null;

                try {
                    result = executeGetJobTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest request) {

        return getPublicAccessBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(final GetPublicAccessBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPublicAccessBlockRequest, GetPublicAccessBlockResult> asyncHandler) {
        final GetPublicAccessBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPublicAccessBlockResult>() {
            @Override
            public GetPublicAccessBlockResult call() throws Exception {
                GetPublicAccessBlockResult result = null;

                try {
                    result = executeGetPublicAccessBlock(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStorageLensConfigurationResult> getStorageLensConfigurationAsync(GetStorageLensConfigurationRequest request) {

        return getStorageLensConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStorageLensConfigurationResult> getStorageLensConfigurationAsync(final GetStorageLensConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStorageLensConfigurationRequest, GetStorageLensConfigurationResult> asyncHandler) {
        final GetStorageLensConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStorageLensConfigurationResult>() {
            @Override
            public GetStorageLensConfigurationResult call() throws Exception {
                GetStorageLensConfigurationResult result = null;

                try {
                    result = executeGetStorageLensConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetStorageLensConfigurationTaggingResult> getStorageLensConfigurationTaggingAsync(
            GetStorageLensConfigurationTaggingRequest request) {

        return getStorageLensConfigurationTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStorageLensConfigurationTaggingResult> getStorageLensConfigurationTaggingAsync(
            final GetStorageLensConfigurationTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStorageLensConfigurationTaggingRequest, GetStorageLensConfigurationTaggingResult> asyncHandler) {
        final GetStorageLensConfigurationTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStorageLensConfigurationTaggingResult>() {
            @Override
            public GetStorageLensConfigurationTaggingResult call() throws Exception {
                GetStorageLensConfigurationTaggingResult result = null;

                try {
                    result = executeGetStorageLensConfigurationTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(ListAccessPointsRequest request) {

        return listAccessPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(final ListAccessPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAccessPointsRequest, ListAccessPointsResult> asyncHandler) {
        final ListAccessPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAccessPointsResult>() {
            @Override
            public ListAccessPointsResult call() throws Exception {
                ListAccessPointsResult result = null;

                try {
                    result = executeListAccessPoints(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
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
    public java.util.concurrent.Future<ListRegionalBucketsResult> listRegionalBucketsAsync(ListRegionalBucketsRequest request) {

        return listRegionalBucketsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegionalBucketsResult> listRegionalBucketsAsync(final ListRegionalBucketsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRegionalBucketsRequest, ListRegionalBucketsResult> asyncHandler) {
        final ListRegionalBucketsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRegionalBucketsResult>() {
            @Override
            public ListRegionalBucketsResult call() throws Exception {
                ListRegionalBucketsResult result = null;

                try {
                    result = executeListRegionalBuckets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStorageLensConfigurationsResult> listStorageLensConfigurationsAsync(ListStorageLensConfigurationsRequest request) {

        return listStorageLensConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStorageLensConfigurationsResult> listStorageLensConfigurationsAsync(
            final ListStorageLensConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStorageLensConfigurationsRequest, ListStorageLensConfigurationsResult> asyncHandler) {
        final ListStorageLensConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStorageLensConfigurationsResult>() {
            @Override
            public ListStorageLensConfigurationsResult call() throws Exception {
                ListStorageLensConfigurationsResult result = null;

                try {
                    result = executeListStorageLensConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(PutAccessPointPolicyRequest request) {

        return putAccessPointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(final PutAccessPointPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAccessPointPolicyRequest, PutAccessPointPolicyResult> asyncHandler) {
        final PutAccessPointPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAccessPointPolicyResult>() {
            @Override
            public PutAccessPointPolicyResult call() throws Exception {
                PutAccessPointPolicyResult result = null;

                try {
                    result = executePutAccessPointPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutBucketLifecycleConfigurationResult> putBucketLifecycleConfigurationAsync(
            PutBucketLifecycleConfigurationRequest request) {

        return putBucketLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBucketLifecycleConfigurationResult> putBucketLifecycleConfigurationAsync(
            final PutBucketLifecycleConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBucketLifecycleConfigurationRequest, PutBucketLifecycleConfigurationResult> asyncHandler) {
        final PutBucketLifecycleConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBucketLifecycleConfigurationResult>() {
            @Override
            public PutBucketLifecycleConfigurationResult call() throws Exception {
                PutBucketLifecycleConfigurationResult result = null;

                try {
                    result = executePutBucketLifecycleConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutBucketPolicyResult> putBucketPolicyAsync(PutBucketPolicyRequest request) {

        return putBucketPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBucketPolicyResult> putBucketPolicyAsync(final PutBucketPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBucketPolicyRequest, PutBucketPolicyResult> asyncHandler) {
        final PutBucketPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBucketPolicyResult>() {
            @Override
            public PutBucketPolicyResult call() throws Exception {
                PutBucketPolicyResult result = null;

                try {
                    result = executePutBucketPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutBucketTaggingResult> putBucketTaggingAsync(PutBucketTaggingRequest request) {

        return putBucketTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBucketTaggingResult> putBucketTaggingAsync(final PutBucketTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutBucketTaggingRequest, PutBucketTaggingResult> asyncHandler) {
        final PutBucketTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutBucketTaggingResult>() {
            @Override
            public PutBucketTaggingResult call() throws Exception {
                PutBucketTaggingResult result = null;

                try {
                    result = executePutBucketTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(PutJobTaggingRequest request) {

        return putJobTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(final PutJobTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutJobTaggingRequest, PutJobTaggingResult> asyncHandler) {
        final PutJobTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutJobTaggingResult>() {
            @Override
            public PutJobTaggingResult call() throws Exception {
                PutJobTaggingResult result = null;

                try {
                    result = executePutJobTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest request) {

        return putPublicAccessBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(final PutPublicAccessBlockRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPublicAccessBlockRequest, PutPublicAccessBlockResult> asyncHandler) {
        final PutPublicAccessBlockRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPublicAccessBlockResult>() {
            @Override
            public PutPublicAccessBlockResult call() throws Exception {
                PutPublicAccessBlockResult result = null;

                try {
                    result = executePutPublicAccessBlock(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutStorageLensConfigurationResult> putStorageLensConfigurationAsync(PutStorageLensConfigurationRequest request) {

        return putStorageLensConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutStorageLensConfigurationResult> putStorageLensConfigurationAsync(final PutStorageLensConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutStorageLensConfigurationRequest, PutStorageLensConfigurationResult> asyncHandler) {
        final PutStorageLensConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutStorageLensConfigurationResult>() {
            @Override
            public PutStorageLensConfigurationResult call() throws Exception {
                PutStorageLensConfigurationResult result = null;

                try {
                    result = executePutStorageLensConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutStorageLensConfigurationTaggingResult> putStorageLensConfigurationTaggingAsync(
            PutStorageLensConfigurationTaggingRequest request) {

        return putStorageLensConfigurationTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutStorageLensConfigurationTaggingResult> putStorageLensConfigurationTaggingAsync(
            final PutStorageLensConfigurationTaggingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutStorageLensConfigurationTaggingRequest, PutStorageLensConfigurationTaggingResult> asyncHandler) {
        final PutStorageLensConfigurationTaggingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutStorageLensConfigurationTaggingResult>() {
            @Override
            public PutStorageLensConfigurationTaggingResult call() throws Exception {
                PutStorageLensConfigurationTaggingResult result = null;

                try {
                    result = executePutStorageLensConfigurationTagging(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(UpdateJobPriorityRequest request) {

        return updateJobPriorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(final UpdateJobPriorityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobPriorityRequest, UpdateJobPriorityResult> asyncHandler) {
        final UpdateJobPriorityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateJobPriorityResult>() {
            @Override
            public UpdateJobPriorityResult call() throws Exception {
                UpdateJobPriorityResult result = null;

                try {
                    result = executeUpdateJobPriority(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(UpdateJobStatusRequest request) {

        return updateJobStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(final UpdateJobStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobStatusRequest, UpdateJobStatusResult> asyncHandler) {
        final UpdateJobStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateJobStatusResult>() {
            @Override
            public UpdateJobStatusResult call() throws Exception {
                UpdateJobStatusResult result = null;

                try {
                    result = executeUpdateJobStatus(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
