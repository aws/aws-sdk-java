/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtraildata;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtraildata.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS CloudTrail Data Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The CloudTrail Data Service lets you ingest events into CloudTrail from any source in your hybrid environments, such
 * as in-house or SaaS applications hosted on-premises or in the cloud, virtual machines, or containers. You can store,
 * access, analyze, troubleshoot and take action on this data without maintaining multiple log aggregators and reporting
 * tools. After you run <code>PutAuditEvents</code> to ingest your application activity into CloudTrail, you can use
 * CloudTrail Lake to search, query, and analyze the data that is logged from your applications.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloudTrailDataAsyncClient extends AWSCloudTrailDataClient implements AWSCloudTrailDataAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCloudTrailDataAsyncClientBuilder asyncBuilder() {
        return AWSCloudTrailDataAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudTrail Data Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCloudTrailDataAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CloudTrail Data Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSCloudTrailDataAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<PutAuditEventsResult> putAuditEventsAsync(PutAuditEventsRequest request) {

        return putAuditEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAuditEventsResult> putAuditEventsAsync(final PutAuditEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutAuditEventsRequest, PutAuditEventsResult> asyncHandler) {
        final PutAuditEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutAuditEventsResult>() {
            @Override
            public PutAuditEventsResult call() throws Exception {
                PutAuditEventsResult result = null;

                try {
                    result = executePutAuditEvents(finalRequest);
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
