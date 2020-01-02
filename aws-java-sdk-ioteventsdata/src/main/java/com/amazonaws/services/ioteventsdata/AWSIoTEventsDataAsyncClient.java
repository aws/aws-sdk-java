/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ioteventsdata;

import javax.annotation.Generated;

import com.amazonaws.services.ioteventsdata.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT Events Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS IoT Events monitors your equipment or device fleets for failures or changes in operation, and triggers actions
 * when such events occur. AWS IoT Events Data API commands enable you to send inputs to detectors, list detectors, and
 * view or update a detector's status.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTEventsDataAsyncClient extends AWSIoTEventsDataClient implements AWSIoTEventsDataAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTEventsDataAsyncClientBuilder asyncBuilder() {
        return AWSIoTEventsDataAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT Events Data using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTEventsDataAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(BatchPutMessageRequest request) {

        return batchPutMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutMessageResult> batchPutMessageAsync(final BatchPutMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutMessageRequest, BatchPutMessageResult> asyncHandler) {
        final BatchPutMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutMessageResult>() {
            @Override
            public BatchPutMessageResult call() throws Exception {
                BatchPutMessageResult result = null;

                try {
                    result = executeBatchPutMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateDetectorResult> batchUpdateDetectorAsync(BatchUpdateDetectorRequest request) {

        return batchUpdateDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateDetectorResult> batchUpdateDetectorAsync(final BatchUpdateDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateDetectorRequest, BatchUpdateDetectorResult> asyncHandler) {
        final BatchUpdateDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateDetectorResult>() {
            @Override
            public BatchUpdateDetectorResult call() throws Exception {
                BatchUpdateDetectorResult result = null;

                try {
                    result = executeBatchUpdateDetector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(DescribeDetectorRequest request) {

        return describeDetectorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDetectorResult> describeDetectorAsync(final DescribeDetectorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDetectorRequest, DescribeDetectorResult> asyncHandler) {
        final DescribeDetectorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDetectorResult>() {
            @Override
            public DescribeDetectorResult call() throws Exception {
                DescribeDetectorResult result = null;

                try {
                    result = executeDescribeDetector(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest request) {

        return listDetectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(final ListDetectorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDetectorsRequest, ListDetectorsResult> asyncHandler) {
        final ListDetectorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDetectorsResult>() {
            @Override
            public ListDetectorsResult call() throws Exception {
                ListDetectorsResult result = null;

                try {
                    result = executeListDetectors(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
