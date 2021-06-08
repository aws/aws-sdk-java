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
package com.amazonaws.services.identitystore;

import javax.annotation.Generated;

import com.amazonaws.services.identitystore.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing IdentityStore asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSIdentityStoreAsyncClient extends AWSIdentityStoreClient implements AWSIdentityStoreAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSIdentityStoreAsyncClientBuilder asyncBuilder() {
        return AWSIdentityStoreAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IdentityStore using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSIdentityStoreAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on IdentityStore using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSIdentityStoreAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest request) {

        return describeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(final DescribeGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler) {
        final DescribeGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGroupResult>() {
            @Override
            public DescribeGroupResult call() throws Exception {
                DescribeGroupResult result = null;

                try {
                    result = executeDescribeGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(final DescribeUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {
        final DescribeUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeUserResult>() {
            @Override
            public DescribeUserResult call() throws Exception {
                DescribeUserResult result = null;

                try {
                    result = executeDescribeUser(finalRequest);
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
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(final ListGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {
        final ListGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGroupsResult>() {
            @Override
            public ListGroupsResult call() throws Exception {
                ListGroupsResult result = null;

                try {
                    result = executeListGroups(finalRequest);
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
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(final ListUsersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {
        final ListUsersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListUsersResult>() {
            @Override
            public ListUsersResult call() throws Exception {
                ListUsersResult result = null;

                try {
                    result = executeListUsers(finalRequest);
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
