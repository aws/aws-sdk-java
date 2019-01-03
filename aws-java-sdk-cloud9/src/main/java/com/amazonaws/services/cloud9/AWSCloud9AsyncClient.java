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
package com.amazonaws.services.cloud9;

import javax.annotation.Generated;

import com.amazonaws.services.cloud9.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Cloud9 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Cloud9</fullname>
 * <p>
 * AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
 * cloud.
 * </p>
 * <p>
 * For more information about AWS Cloud9, see the <a href="https://docs.aws.amazon.com/cloud9/latest/user-guide">AWS
 * Cloud9 User Guide</a>.
 * </p>
 * <p>
 * AWS Cloud9 supports these operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateEnvironmentEC2</code>: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
 * and then connects from the instance to the environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateEnvironmentMembership</code>: Adds an environment member to an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironment</code>: Deletes an environment. If an Amazon EC2 instance is connected to the environment,
 * also terminates the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteEnvironmentMembership</code>: Deletes an environment member from an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentMemberships</code>: Gets information about environment members for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironments</code>: Gets information about environments.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeEnvironmentStatus</code>: Gets status information for an environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ListEnvironments</code>: Gets a list of environment identifiers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironment</code>: Changes the settings of an existing environment.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateEnvironmentMembership</code>: Changes the settings of an existing environment member for an environment.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCloud9AsyncClient extends AWSCloud9Client implements AWSCloud9Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCloud9AsyncClientBuilder asyncBuilder() {
        return AWSCloud9AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Cloud9 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCloud9AsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateEnvironmentEC2Result> createEnvironmentEC2Async(CreateEnvironmentEC2Request request) {

        return createEnvironmentEC2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentEC2Result> createEnvironmentEC2Async(final CreateEnvironmentEC2Request request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentEC2Request, CreateEnvironmentEC2Result> asyncHandler) {
        final CreateEnvironmentEC2Request finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentEC2Result>() {
            @Override
            public CreateEnvironmentEC2Result call() throws Exception {
                CreateEnvironmentEC2Result result = null;

                try {
                    result = executeCreateEnvironmentEC2(finalRequest);
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
    public java.util.concurrent.Future<CreateEnvironmentMembershipResult> createEnvironmentMembershipAsync(CreateEnvironmentMembershipRequest request) {

        return createEnvironmentMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentMembershipResult> createEnvironmentMembershipAsync(final CreateEnvironmentMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEnvironmentMembershipRequest, CreateEnvironmentMembershipResult> asyncHandler) {
        final CreateEnvironmentMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEnvironmentMembershipResult>() {
            @Override
            public CreateEnvironmentMembershipResult call() throws Exception {
                CreateEnvironmentMembershipResult result = null;

                try {
                    result = executeCreateEnvironmentMembership(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(final DeleteEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {
        final DeleteEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentResult>() {
            @Override
            public DeleteEnvironmentResult call() throws Exception {
                DeleteEnvironmentResult result = null;

                try {
                    result = executeDeleteEnvironment(finalRequest);
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
    public java.util.concurrent.Future<DeleteEnvironmentMembershipResult> deleteEnvironmentMembershipAsync(DeleteEnvironmentMembershipRequest request) {

        return deleteEnvironmentMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentMembershipResult> deleteEnvironmentMembershipAsync(final DeleteEnvironmentMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentMembershipRequest, DeleteEnvironmentMembershipResult> asyncHandler) {
        final DeleteEnvironmentMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEnvironmentMembershipResult>() {
            @Override
            public DeleteEnvironmentMembershipResult call() throws Exception {
                DeleteEnvironmentMembershipResult result = null;

                try {
                    result = executeDeleteEnvironmentMembership(finalRequest);
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
    public java.util.concurrent.Future<DescribeEnvironmentMembershipsResult> describeEnvironmentMembershipsAsync(DescribeEnvironmentMembershipsRequest request) {

        return describeEnvironmentMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentMembershipsResult> describeEnvironmentMembershipsAsync(
            final DescribeEnvironmentMembershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentMembershipsRequest, DescribeEnvironmentMembershipsResult> asyncHandler) {
        final DescribeEnvironmentMembershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentMembershipsResult>() {
            @Override
            public DescribeEnvironmentMembershipsResult call() throws Exception {
                DescribeEnvironmentMembershipsResult result = null;

                try {
                    result = executeDescribeEnvironmentMemberships(finalRequest);
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
    public java.util.concurrent.Future<DescribeEnvironmentStatusResult> describeEnvironmentStatusAsync(DescribeEnvironmentStatusRequest request) {

        return describeEnvironmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentStatusResult> describeEnvironmentStatusAsync(final DescribeEnvironmentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentStatusRequest, DescribeEnvironmentStatusResult> asyncHandler) {
        final DescribeEnvironmentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentStatusResult>() {
            @Override
            public DescribeEnvironmentStatusResult call() throws Exception {
                DescribeEnvironmentStatusResult result = null;

                try {
                    result = executeDescribeEnvironmentStatus(finalRequest);
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
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest request) {

        return describeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(final DescribeEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler) {
        final DescribeEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEnvironmentsResult>() {
            @Override
            public DescribeEnvironmentsResult call() throws Exception {
                DescribeEnvironmentsResult result = null;

                try {
                    result = executeDescribeEnvironments(finalRequest);
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
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(final ListEnvironmentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {
        final ListEnvironmentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnvironmentsResult>() {
            @Override
            public ListEnvironmentsResult call() throws Exception {
                ListEnvironmentsResult result = null;

                try {
                    result = executeListEnvironments(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(final UpdateEnvironmentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {
        final UpdateEnvironmentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentResult>() {
            @Override
            public UpdateEnvironmentResult call() throws Exception {
                UpdateEnvironmentResult result = null;

                try {
                    result = executeUpdateEnvironment(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnvironmentMembershipResult> updateEnvironmentMembershipAsync(UpdateEnvironmentMembershipRequest request) {

        return updateEnvironmentMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentMembershipResult> updateEnvironmentMembershipAsync(final UpdateEnvironmentMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentMembershipRequest, UpdateEnvironmentMembershipResult> asyncHandler) {
        final UpdateEnvironmentMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnvironmentMembershipResult>() {
            @Override
            public UpdateEnvironmentMembershipResult call() throws Exception {
                UpdateEnvironmentMembershipResult result = null;

                try {
                    result = executeUpdateEnvironmentMembership(finalRequest);
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
