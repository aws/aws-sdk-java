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
package com.amazonaws.services.migrationhubconfig;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubconfig.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Migration Hub Config asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The AWS Migration Hub home region APIs are available specifically for working with your Migration Hub home region.
 * You can use these APIs to determine a home region, as well as to create and work with controls that describe the home
 * region.
 * </p>
 * <p>
 * You can use these APIs within your home region only. If you call these APIs from outside your home region, your calls
 * are rejected, except for the ability to register your agents and connectors.
 * </p>
 * <p>
 * You must call <code>GetHomeRegion</code> at least once before you call any other AWS Application Discovery Service
 * and AWS Migration Hub APIs, to obtain the account's Migration Hub home region.
 * </p>
 * <p>
 * The <code>StartDataCollection</code> API call in AWS Application Discovery Service allows your agents and connectors
 * to begin collecting data that flows directly into the home region, and it will prevent you from enabling data
 * collection information to be sent outside the home region.
 * </p>
 * <p>
 * For specific API usage, see the sections that follow in this AWS Migration Hub Home Region API reference.
 * </p>
 * <note>
 * <p>
 * The Migration Hub Home Region APIs do not support AWS Organizations.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubConfigAsyncClient extends AWSMigrationHubConfigClient implements AWSMigrationHubConfigAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMigrationHubConfigAsyncClientBuilder asyncBuilder() {
        return AWSMigrationHubConfigAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Migration Hub Config using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubConfigAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateHomeRegionControlResult> createHomeRegionControlAsync(CreateHomeRegionControlRequest request) {

        return createHomeRegionControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHomeRegionControlResult> createHomeRegionControlAsync(final CreateHomeRegionControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateHomeRegionControlRequest, CreateHomeRegionControlResult> asyncHandler) {
        final CreateHomeRegionControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateHomeRegionControlResult>() {
            @Override
            public CreateHomeRegionControlResult call() throws Exception {
                CreateHomeRegionControlResult result = null;

                try {
                    result = executeCreateHomeRegionControl(finalRequest);
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
    public java.util.concurrent.Future<DescribeHomeRegionControlsResult> describeHomeRegionControlsAsync(DescribeHomeRegionControlsRequest request) {

        return describeHomeRegionControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHomeRegionControlsResult> describeHomeRegionControlsAsync(final DescribeHomeRegionControlsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHomeRegionControlsRequest, DescribeHomeRegionControlsResult> asyncHandler) {
        final DescribeHomeRegionControlsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHomeRegionControlsResult>() {
            @Override
            public DescribeHomeRegionControlsResult call() throws Exception {
                DescribeHomeRegionControlsResult result = null;

                try {
                    result = executeDescribeHomeRegionControls(finalRequest);
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
    public java.util.concurrent.Future<GetHomeRegionResult> getHomeRegionAsync(GetHomeRegionRequest request) {

        return getHomeRegionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHomeRegionResult> getHomeRegionAsync(final GetHomeRegionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetHomeRegionRequest, GetHomeRegionResult> asyncHandler) {
        final GetHomeRegionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetHomeRegionResult>() {
            @Override
            public GetHomeRegionResult call() throws Exception {
                GetHomeRegionResult result = null;

                try {
                    result = executeGetHomeRegion(finalRequest);
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
