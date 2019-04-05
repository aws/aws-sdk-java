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
package com.amazonaws.services.iotjobsdataplane;

import javax.annotation.Generated;

import com.amazonaws.services.iotjobsdataplane.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS IoT Jobs Data Plane asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS IoT Jobs is a service that allows you to define a set of jobs — remote operations that are sent to and executed
 * on one or more devices connected to AWS IoT. For example, you can define a job that instructs a set of devices to
 * download and install application or firmware updates, reboot, rotate certificates, or perform remote troubleshooting
 * operations.
 * </p>
 * <p>
 * To create a job, you make a job document which is a description of the remote operations to be performed, and you
 * specify a list of targets that should perform the operations. The targets can be individual things, thing groups or
 * both.
 * </p>
 * <p>
 * AWS IoT Jobs sends a message to inform the targets that a job is available. The target starts the execution of the
 * job by downloading the job document, performing the operations it specifies, and reporting its progress to AWS IoT.
 * The Jobs service provides commands to track the progress of a job on a specific target and for all the targets of the
 * job
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIoTJobsDataPlaneAsyncClient extends AWSIoTJobsDataPlaneClient implements AWSIoTJobsDataPlaneAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIoTJobsDataPlaneAsyncClientBuilder asyncBuilder() {
        return AWSIoTJobsDataPlaneAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS IoT Jobs Data Plane using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIoTJobsDataPlaneAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(DescribeJobExecutionRequest request) {

        return describeJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobExecutionResult> describeJobExecutionAsync(final DescribeJobExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeJobExecutionRequest, DescribeJobExecutionResult> asyncHandler) {
        final DescribeJobExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeJobExecutionResult>() {
            @Override
            public DescribeJobExecutionResult call() throws Exception {
                DescribeJobExecutionResult result = null;

                try {
                    result = executeDescribeJobExecution(finalRequest);
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
    public java.util.concurrent.Future<GetPendingJobExecutionsResult> getPendingJobExecutionsAsync(GetPendingJobExecutionsRequest request) {

        return getPendingJobExecutionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPendingJobExecutionsResult> getPendingJobExecutionsAsync(final GetPendingJobExecutionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPendingJobExecutionsRequest, GetPendingJobExecutionsResult> asyncHandler) {
        final GetPendingJobExecutionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPendingJobExecutionsResult>() {
            @Override
            public GetPendingJobExecutionsResult call() throws Exception {
                GetPendingJobExecutionsResult result = null;

                try {
                    result = executeGetPendingJobExecutions(finalRequest);
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
    public java.util.concurrent.Future<StartNextPendingJobExecutionResult> startNextPendingJobExecutionAsync(StartNextPendingJobExecutionRequest request) {

        return startNextPendingJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartNextPendingJobExecutionResult> startNextPendingJobExecutionAsync(final StartNextPendingJobExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartNextPendingJobExecutionRequest, StartNextPendingJobExecutionResult> asyncHandler) {
        final StartNextPendingJobExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartNextPendingJobExecutionResult>() {
            @Override
            public StartNextPendingJobExecutionResult call() throws Exception {
                StartNextPendingJobExecutionResult result = null;

                try {
                    result = executeStartNextPendingJobExecution(finalRequest);
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
    public java.util.concurrent.Future<UpdateJobExecutionResult> updateJobExecutionAsync(UpdateJobExecutionRequest request) {

        return updateJobExecutionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobExecutionResult> updateJobExecutionAsync(final UpdateJobExecutionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateJobExecutionRequest, UpdateJobExecutionResult> asyncHandler) {
        final UpdateJobExecutionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateJobExecutionResult>() {
            @Override
            public UpdateJobExecutionResult call() throws Exception {
                UpdateJobExecutionResult result = null;

                try {
                    result = executeUpdateJobExecution(finalRequest);
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
