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
package com.amazonaws.services.sagemakerfeaturestoreruntime;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakerfeaturestoreruntime.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon SageMaker Feature Store Runtime asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Contains all data plane API operations and data types for the Amazon SageMaker Feature Store. Use this API to put,
 * delete, and retrieve (get) features from a feature store.
 * </p>
 * <p>
 * Use the following operations to configure your <code>OnlineStore</code> and <code>OfflineStore</code> features, and
 * to create and manage feature groups:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateFeatureGroup.html">CreateFeatureGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_DeleteFeatureGroup.html">DeleteFeatureGroup</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_DescribeFeatureGroup.html">DescribeFeatureGroup
 * </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_ListFeatureGroups.html">ListFeatureGroups</a>
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerFeatureStoreRuntimeAsyncClient extends AmazonSageMakerFeatureStoreRuntimeClient implements AmazonSageMakerFeatureStoreRuntimeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSageMakerFeatureStoreRuntimeAsyncClientBuilder asyncBuilder() {
        return AmazonSageMakerFeatureStoreRuntimeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SageMaker Feature Store Runtime using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerFeatureStoreRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SageMaker Feature Store Runtime using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonSageMakerFeatureStoreRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetRecordResult> batchGetRecordAsync(BatchGetRecordRequest request) {

        return batchGetRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetRecordResult> batchGetRecordAsync(final BatchGetRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetRecordRequest, BatchGetRecordResult> asyncHandler) {
        final BatchGetRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetRecordResult>() {
            @Override
            public BatchGetRecordResult call() throws Exception {
                BatchGetRecordResult result = null;

                try {
                    result = executeBatchGetRecord(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordResult> deleteRecordAsync(DeleteRecordRequest request) {

        return deleteRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordResult> deleteRecordAsync(final DeleteRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecordRequest, DeleteRecordResult> asyncHandler) {
        final DeleteRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecordResult>() {
            @Override
            public DeleteRecordResult call() throws Exception {
                DeleteRecordResult result = null;

                try {
                    result = executeDeleteRecord(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRecordResult> getRecordAsync(GetRecordRequest request) {

        return getRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordResult> getRecordAsync(final GetRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecordRequest, GetRecordResult> asyncHandler) {
        final GetRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecordResult>() {
            @Override
            public GetRecordResult call() throws Exception {
                GetRecordResult result = null;

                try {
                    result = executeGetRecord(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(PutRecordRequest request) {

        return putRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(final PutRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {
        final PutRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRecordResult>() {
            @Override
            public PutRecordResult call() throws Exception {
                PutRecordResult result = null;

                try {
                    result = executePutRecord(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
