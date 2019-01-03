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
package com.amazonaws.services.mediastoredata;

import javax.annotation.Generated;

import com.amazonaws.services.mediastoredata.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaStore Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
 * fundamental entities that are stored in AWS Elemental MediaStore.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaStoreDataAsyncClient extends AWSMediaStoreDataClient implements AWSMediaStoreDataAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaStoreDataAsyncClientBuilder asyncBuilder() {
        return AWSMediaStoreDataAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaStore Data using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaStoreDataAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request) {

        return deleteObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(final DeleteObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler) {
        final DeleteObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteObjectResult>() {
            @Override
            public DeleteObjectResult call() throws Exception {
                DeleteObjectResult result = null;

                try {
                    result = executeDeleteObject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeObjectResult> describeObjectAsync(DescribeObjectRequest request) {

        return describeObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeObjectResult> describeObjectAsync(final DescribeObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeObjectRequest, DescribeObjectResult> asyncHandler) {
        final DescribeObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeObjectResult>() {
            @Override
            public DescribeObjectResult call() throws Exception {
                DescribeObjectResult result = null;

                try {
                    result = executeDescribeObject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetObjectResult> getObjectAsync(GetObjectRequest request) {

        return getObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetObjectResult> getObjectAsync(final GetObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetObjectRequest, GetObjectResult> asyncHandler) {
        final GetObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetObjectResult>() {
            @Override
            public GetObjectResult call() throws Exception {
                GetObjectResult result = null;

                try {
                    result = executeGetObject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListItemsResult> listItemsAsync(ListItemsRequest request) {

        return listItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListItemsResult> listItemsAsync(final ListItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListItemsRequest, ListItemsResult> asyncHandler) {
        final ListItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListItemsResult>() {
            @Override
            public ListItemsResult call() throws Exception {
                ListItemsResult result = null;

                try {
                    result = executeListItems(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest request) {

        return putObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(final PutObjectRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutObjectRequest, PutObjectResult> asyncHandler) {
        final PutObjectRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutObjectResult>() {
            @Override
            public PutObjectResult call() throws Exception {
                PutObjectResult result = null;

                try {
                    result = executePutObject(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
