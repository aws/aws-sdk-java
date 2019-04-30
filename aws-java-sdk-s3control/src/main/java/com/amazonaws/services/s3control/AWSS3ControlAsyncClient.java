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
 * AWS S3 Control provides access to Amazon S3 control plane operations.
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
