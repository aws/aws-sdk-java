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
 * when such events occur. You can use AWS IoT Events Data API commands to send inputs to detectors, list detectors, and
 * view or update a detector's status.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/what-is-iotevents.html">What is AWS IoT Events?</a>
 * in the <i>AWS IoT Events Developer Guide</i>.
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
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT Events Data using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIoTEventsDataAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchAcknowledgeAlarmResult> batchAcknowledgeAlarmAsync(BatchAcknowledgeAlarmRequest request) {

        return batchAcknowledgeAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchAcknowledgeAlarmResult> batchAcknowledgeAlarmAsync(final BatchAcknowledgeAlarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchAcknowledgeAlarmRequest, BatchAcknowledgeAlarmResult> asyncHandler) {
        final BatchAcknowledgeAlarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchAcknowledgeAlarmResult>() {
            @Override
            public BatchAcknowledgeAlarmResult call() throws Exception {
                BatchAcknowledgeAlarmResult result = null;

                try {
                    result = executeBatchAcknowledgeAlarm(finalRequest);
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
    public java.util.concurrent.Future<BatchDisableAlarmResult> batchDisableAlarmAsync(BatchDisableAlarmRequest request) {

        return batchDisableAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisableAlarmResult> batchDisableAlarmAsync(final BatchDisableAlarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisableAlarmRequest, BatchDisableAlarmResult> asyncHandler) {
        final BatchDisableAlarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisableAlarmResult>() {
            @Override
            public BatchDisableAlarmResult call() throws Exception {
                BatchDisableAlarmResult result = null;

                try {
                    result = executeBatchDisableAlarm(finalRequest);
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
    public java.util.concurrent.Future<BatchEnableAlarmResult> batchEnableAlarmAsync(BatchEnableAlarmRequest request) {

        return batchEnableAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchEnableAlarmResult> batchEnableAlarmAsync(final BatchEnableAlarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchEnableAlarmRequest, BatchEnableAlarmResult> asyncHandler) {
        final BatchEnableAlarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchEnableAlarmResult>() {
            @Override
            public BatchEnableAlarmResult call() throws Exception {
                BatchEnableAlarmResult result = null;

                try {
                    result = executeBatchEnableAlarm(finalRequest);
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
    public java.util.concurrent.Future<BatchResetAlarmResult> batchResetAlarmAsync(BatchResetAlarmRequest request) {

        return batchResetAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchResetAlarmResult> batchResetAlarmAsync(final BatchResetAlarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchResetAlarmRequest, BatchResetAlarmResult> asyncHandler) {
        final BatchResetAlarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchResetAlarmResult>() {
            @Override
            public BatchResetAlarmResult call() throws Exception {
                BatchResetAlarmResult result = null;

                try {
                    result = executeBatchResetAlarm(finalRequest);
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
    public java.util.concurrent.Future<BatchSnoozeAlarmResult> batchSnoozeAlarmAsync(BatchSnoozeAlarmRequest request) {

        return batchSnoozeAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchSnoozeAlarmResult> batchSnoozeAlarmAsync(final BatchSnoozeAlarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchSnoozeAlarmRequest, BatchSnoozeAlarmResult> asyncHandler) {
        final BatchSnoozeAlarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchSnoozeAlarmResult>() {
            @Override
            public BatchSnoozeAlarmResult call() throws Exception {
                BatchSnoozeAlarmResult result = null;

                try {
                    result = executeBatchSnoozeAlarm(finalRequest);
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
    public java.util.concurrent.Future<DescribeAlarmResult> describeAlarmAsync(DescribeAlarmRequest request) {

        return describeAlarmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAlarmResult> describeAlarmAsync(final DescribeAlarmRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAlarmRequest, DescribeAlarmResult> asyncHandler) {
        final DescribeAlarmRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAlarmResult>() {
            @Override
            public DescribeAlarmResult call() throws Exception {
                DescribeAlarmResult result = null;

                try {
                    result = executeDescribeAlarm(finalRequest);
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
    public java.util.concurrent.Future<ListAlarmsResult> listAlarmsAsync(ListAlarmsRequest request) {

        return listAlarmsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAlarmsResult> listAlarmsAsync(final ListAlarmsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAlarmsRequest, ListAlarmsResult> asyncHandler) {
        final ListAlarmsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAlarmsResult>() {
            @Override
            public ListAlarmsResult call() throws Exception {
                ListAlarmsResult result = null;

                try {
                    result = executeListAlarms(finalRequest);
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
