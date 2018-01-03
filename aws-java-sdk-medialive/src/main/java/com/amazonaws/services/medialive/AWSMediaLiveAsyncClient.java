/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MediaLive asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * API for AWS Elemental MediaLive
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaLiveAsyncClient extends AWSMediaLiveClient implements AWSMediaLiveAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaLiveAsyncClientBuilder asyncBuilder() {
        return AWSMediaLiveAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaLive using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaLiveAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest request) {

        return createChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResult> createChannelAsync(final CreateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler) {
        final CreateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelResult>() {
            @Override
            public CreateChannelResult call() throws Exception {
                CreateChannelResult result = null;

                try {
                    result = executeCreateChannel(finalRequest);
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
    public java.util.concurrent.Future<CreateInputResult> createInputAsync(CreateInputRequest request) {

        return createInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInputResult> createInputAsync(final CreateInputRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInputRequest, CreateInputResult> asyncHandler) {
        final CreateInputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInputResult>() {
            @Override
            public CreateInputResult call() throws Exception {
                CreateInputResult result = null;

                try {
                    result = executeCreateInput(finalRequest);
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
    public java.util.concurrent.Future<CreateInputSecurityGroupResult> createInputSecurityGroupAsync(CreateInputSecurityGroupRequest request) {

        return createInputSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInputSecurityGroupResult> createInputSecurityGroupAsync(final CreateInputSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInputSecurityGroupRequest, CreateInputSecurityGroupResult> asyncHandler) {
        final CreateInputSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInputSecurityGroupResult>() {
            @Override
            public CreateInputSecurityGroupResult call() throws Exception {
                CreateInputSecurityGroupResult result = null;

                try {
                    result = executeCreateInputSecurityGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest request) {

        return deleteChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(final DeleteChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler) {
        final DeleteChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelResult>() {
            @Override
            public DeleteChannelResult call() throws Exception {
                DeleteChannelResult result = null;

                try {
                    result = executeDeleteChannel(finalRequest);
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
    public java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(DeleteInputRequest request) {

        return deleteInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInputResult> deleteInputAsync(final DeleteInputRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInputRequest, DeleteInputResult> asyncHandler) {
        final DeleteInputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInputResult>() {
            @Override
            public DeleteInputResult call() throws Exception {
                DeleteInputResult result = null;

                try {
                    result = executeDeleteInput(finalRequest);
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
    public java.util.concurrent.Future<DeleteInputSecurityGroupResult> deleteInputSecurityGroupAsync(DeleteInputSecurityGroupRequest request) {

        return deleteInputSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInputSecurityGroupResult> deleteInputSecurityGroupAsync(final DeleteInputSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInputSecurityGroupRequest, DeleteInputSecurityGroupResult> asyncHandler) {
        final DeleteInputSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInputSecurityGroupResult>() {
            @Override
            public DeleteInputSecurityGroupResult call() throws Exception {
                DeleteInputSecurityGroupResult result = null;

                try {
                    result = executeDeleteInputSecurityGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest request) {

        return describeChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(final DescribeChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler) {
        final DescribeChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelResult>() {
            @Override
            public DescribeChannelResult call() throws Exception {
                DescribeChannelResult result = null;

                try {
                    result = executeDescribeChannel(finalRequest);
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
    public java.util.concurrent.Future<DescribeInputResult> describeInputAsync(DescribeInputRequest request) {

        return describeInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInputResult> describeInputAsync(final DescribeInputRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInputRequest, DescribeInputResult> asyncHandler) {
        final DescribeInputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInputResult>() {
            @Override
            public DescribeInputResult call() throws Exception {
                DescribeInputResult result = null;

                try {
                    result = executeDescribeInput(finalRequest);
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
    public java.util.concurrent.Future<DescribeInputSecurityGroupResult> describeInputSecurityGroupAsync(DescribeInputSecurityGroupRequest request) {

        return describeInputSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInputSecurityGroupResult> describeInputSecurityGroupAsync(final DescribeInputSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInputSecurityGroupRequest, DescribeInputSecurityGroupResult> asyncHandler) {
        final DescribeInputSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInputSecurityGroupResult>() {
            @Override
            public DescribeInputSecurityGroupResult call() throws Exception {
                DescribeInputSecurityGroupResult result = null;

                try {
                    result = executeDescribeInputSecurityGroup(finalRequest);
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
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(final ListChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {
        final ListChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelsResult>() {
            @Override
            public ListChannelsResult call() throws Exception {
                ListChannelsResult result = null;

                try {
                    result = executeListChannels(finalRequest);
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
    public java.util.concurrent.Future<ListInputSecurityGroupsResult> listInputSecurityGroupsAsync(ListInputSecurityGroupsRequest request) {

        return listInputSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInputSecurityGroupsResult> listInputSecurityGroupsAsync(final ListInputSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInputSecurityGroupsRequest, ListInputSecurityGroupsResult> asyncHandler) {
        final ListInputSecurityGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInputSecurityGroupsResult>() {
            @Override
            public ListInputSecurityGroupsResult call() throws Exception {
                ListInputSecurityGroupsResult result = null;

                try {
                    result = executeListInputSecurityGroups(finalRequest);
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
    public java.util.concurrent.Future<ListInputsResult> listInputsAsync(ListInputsRequest request) {

        return listInputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInputsResult> listInputsAsync(final ListInputsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInputsRequest, ListInputsResult> asyncHandler) {
        final ListInputsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInputsResult>() {
            @Override
            public ListInputsResult call() throws Exception {
                ListInputsResult result = null;

                try {
                    result = executeListInputs(finalRequest);
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
    public java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest request) {

        return startChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartChannelResult> startChannelAsync(final StartChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartChannelRequest, StartChannelResult> asyncHandler) {
        final StartChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartChannelResult>() {
            @Override
            public StartChannelResult call() throws Exception {
                StartChannelResult result = null;

                try {
                    result = executeStartChannel(finalRequest);
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
    public java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest request) {

        return stopChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopChannelResult> stopChannelAsync(final StopChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopChannelRequest, StopChannelResult> asyncHandler) {
        final StopChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopChannelResult>() {
            @Override
            public StopChannelResult call() throws Exception {
                StopChannelResult result = null;

                try {
                    result = executeStopChannel(finalRequest);
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
