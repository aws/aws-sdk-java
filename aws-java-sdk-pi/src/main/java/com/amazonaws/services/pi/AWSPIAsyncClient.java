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
package com.amazonaws.services.pi;

import javax.annotation.Generated;

import com.amazonaws.services.pi.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS PI asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Performance Insights enables you to monitor and explore different dimensions of database load based on data
 * captured from a running RDS instance. The guide provides detailed information about Performance Insights data types,
 * parameters and errors. For more information about Performance Insights capabilities see <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon RDS Performance
 * Insights </a> in the <i>Amazon RDS User Guide</i>.
 * </p>
 * <p>
 * The AWS Performance Insights API provides visibility into the performance of your RDS instance, when Performance
 * Insights is enabled for supported engine types. While Amazon CloudWatch provides the authoritative source for AWS
 * service vended monitoring metrics, AWS Performance Insights offers a domain-specific view of database load measured
 * as Average Active Sessions and provided to API consumers as a 2-dimensional time-series dataset. The time dimension
 * of the data provides DB load data for each time point in the queried time range, and each time point decomposes
 * overall load in relation to the requested dimensions, such as SQL, Wait-event, User or Host, measured at that time
 * point.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPIAsyncClient extends AWSPIClient implements AWSPIAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSPIAsyncClientBuilder asyncBuilder() {
        return AWSPIAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS PI using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSPIAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(DescribeDimensionKeysRequest request) {

        return describeDimensionKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDimensionKeysResult> describeDimensionKeysAsync(final DescribeDimensionKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDimensionKeysRequest, DescribeDimensionKeysResult> asyncHandler) {
        final DescribeDimensionKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeDimensionKeysResult>() {
            @Override
            public DescribeDimensionKeysResult call() throws Exception {
                DescribeDimensionKeysResult result = null;

                try {
                    result = executeDescribeDimensionKeys(finalRequest);
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
    public java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(GetResourceMetricsRequest request) {

        return getResourceMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceMetricsResult> getResourceMetricsAsync(final GetResourceMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourceMetricsRequest, GetResourceMetricsResult> asyncHandler) {
        final GetResourceMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourceMetricsResult>() {
            @Override
            public GetResourceMetricsResult call() throws Exception {
                GetResourceMetricsResult result = null;

                try {
                    result = executeGetResourceMetrics(finalRequest);
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
