/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmessaging;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmessaging.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Chime SDK Messaging asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon Chime SDK Messaging APIs in this section allow software developers to send and receive messages in custom
 * messaging applications. These APIs depend on the frameworks provided by the Amazon Chime SDK Identity APIs. For more
 * information about the messaging APIs, see <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Messaging.html">Amazon
 * Chime SDK messaging</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKMessagingAsyncClient extends AmazonChimeSDKMessagingClient implements AmazonChimeSDKMessagingAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonChimeSDKMessagingAsyncClientBuilder asyncBuilder() {
        return AmazonChimeSDKMessagingAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Messaging using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMessagingAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Messaging using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonChimeSDKMessagingAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateChannelFlowResult> associateChannelFlowAsync(AssociateChannelFlowRequest request) {

        return associateChannelFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateChannelFlowResult> associateChannelFlowAsync(final AssociateChannelFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateChannelFlowRequest, AssociateChannelFlowResult> asyncHandler) {
        final AssociateChannelFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateChannelFlowResult>() {
            @Override
            public AssociateChannelFlowResult call() throws Exception {
                AssociateChannelFlowResult result = null;

                try {
                    result = executeAssociateChannelFlow(finalRequest);
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
    public java.util.concurrent.Future<BatchCreateChannelMembershipResult> batchCreateChannelMembershipAsync(BatchCreateChannelMembershipRequest request) {

        return batchCreateChannelMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateChannelMembershipResult> batchCreateChannelMembershipAsync(final BatchCreateChannelMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateChannelMembershipRequest, BatchCreateChannelMembershipResult> asyncHandler) {
        final BatchCreateChannelMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateChannelMembershipResult>() {
            @Override
            public BatchCreateChannelMembershipResult call() throws Exception {
                BatchCreateChannelMembershipResult result = null;

                try {
                    result = executeBatchCreateChannelMembership(finalRequest);
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
    public java.util.concurrent.Future<ChannelFlowCallbackResult> channelFlowCallbackAsync(ChannelFlowCallbackRequest request) {

        return channelFlowCallbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChannelFlowCallbackResult> channelFlowCallbackAsync(final ChannelFlowCallbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<ChannelFlowCallbackRequest, ChannelFlowCallbackResult> asyncHandler) {
        final ChannelFlowCallbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ChannelFlowCallbackResult>() {
            @Override
            public ChannelFlowCallbackResult call() throws Exception {
                ChannelFlowCallbackResult result = null;

                try {
                    result = executeChannelFlowCallback(finalRequest);
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
    public java.util.concurrent.Future<CreateChannelBanResult> createChannelBanAsync(CreateChannelBanRequest request) {

        return createChannelBanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelBanResult> createChannelBanAsync(final CreateChannelBanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelBanRequest, CreateChannelBanResult> asyncHandler) {
        final CreateChannelBanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelBanResult>() {
            @Override
            public CreateChannelBanResult call() throws Exception {
                CreateChannelBanResult result = null;

                try {
                    result = executeCreateChannelBan(finalRequest);
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
    public java.util.concurrent.Future<CreateChannelFlowResult> createChannelFlowAsync(CreateChannelFlowRequest request) {

        return createChannelFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelFlowResult> createChannelFlowAsync(final CreateChannelFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelFlowRequest, CreateChannelFlowResult> asyncHandler) {
        final CreateChannelFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelFlowResult>() {
            @Override
            public CreateChannelFlowResult call() throws Exception {
                CreateChannelFlowResult result = null;

                try {
                    result = executeCreateChannelFlow(finalRequest);
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
    public java.util.concurrent.Future<CreateChannelMembershipResult> createChannelMembershipAsync(CreateChannelMembershipRequest request) {

        return createChannelMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelMembershipResult> createChannelMembershipAsync(final CreateChannelMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelMembershipRequest, CreateChannelMembershipResult> asyncHandler) {
        final CreateChannelMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelMembershipResult>() {
            @Override
            public CreateChannelMembershipResult call() throws Exception {
                CreateChannelMembershipResult result = null;

                try {
                    result = executeCreateChannelMembership(finalRequest);
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
    public java.util.concurrent.Future<CreateChannelModeratorResult> createChannelModeratorAsync(CreateChannelModeratorRequest request) {

        return createChannelModeratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelModeratorResult> createChannelModeratorAsync(final CreateChannelModeratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChannelModeratorRequest, CreateChannelModeratorResult> asyncHandler) {
        final CreateChannelModeratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChannelModeratorResult>() {
            @Override
            public CreateChannelModeratorResult call() throws Exception {
                CreateChannelModeratorResult result = null;

                try {
                    result = executeCreateChannelModerator(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelBanResult> deleteChannelBanAsync(DeleteChannelBanRequest request) {

        return deleteChannelBanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelBanResult> deleteChannelBanAsync(final DeleteChannelBanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelBanRequest, DeleteChannelBanResult> asyncHandler) {
        final DeleteChannelBanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelBanResult>() {
            @Override
            public DeleteChannelBanResult call() throws Exception {
                DeleteChannelBanResult result = null;

                try {
                    result = executeDeleteChannelBan(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelFlowResult> deleteChannelFlowAsync(DeleteChannelFlowRequest request) {

        return deleteChannelFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelFlowResult> deleteChannelFlowAsync(final DeleteChannelFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelFlowRequest, DeleteChannelFlowResult> asyncHandler) {
        final DeleteChannelFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelFlowResult>() {
            @Override
            public DeleteChannelFlowResult call() throws Exception {
                DeleteChannelFlowResult result = null;

                try {
                    result = executeDeleteChannelFlow(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelMembershipResult> deleteChannelMembershipAsync(DeleteChannelMembershipRequest request) {

        return deleteChannelMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelMembershipResult> deleteChannelMembershipAsync(final DeleteChannelMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelMembershipRequest, DeleteChannelMembershipResult> asyncHandler) {
        final DeleteChannelMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelMembershipResult>() {
            @Override
            public DeleteChannelMembershipResult call() throws Exception {
                DeleteChannelMembershipResult result = null;

                try {
                    result = executeDeleteChannelMembership(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelMessageResult> deleteChannelMessageAsync(DeleteChannelMessageRequest request) {

        return deleteChannelMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelMessageResult> deleteChannelMessageAsync(final DeleteChannelMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelMessageRequest, DeleteChannelMessageResult> asyncHandler) {
        final DeleteChannelMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelMessageResult>() {
            @Override
            public DeleteChannelMessageResult call() throws Exception {
                DeleteChannelMessageResult result = null;

                try {
                    result = executeDeleteChannelMessage(finalRequest);
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
    public java.util.concurrent.Future<DeleteChannelModeratorResult> deleteChannelModeratorAsync(DeleteChannelModeratorRequest request) {

        return deleteChannelModeratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelModeratorResult> deleteChannelModeratorAsync(final DeleteChannelModeratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteChannelModeratorRequest, DeleteChannelModeratorResult> asyncHandler) {
        final DeleteChannelModeratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteChannelModeratorResult>() {
            @Override
            public DeleteChannelModeratorResult call() throws Exception {
                DeleteChannelModeratorResult result = null;

                try {
                    result = executeDeleteChannelModerator(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelBanResult> describeChannelBanAsync(DescribeChannelBanRequest request) {

        return describeChannelBanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelBanResult> describeChannelBanAsync(final DescribeChannelBanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelBanRequest, DescribeChannelBanResult> asyncHandler) {
        final DescribeChannelBanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelBanResult>() {
            @Override
            public DescribeChannelBanResult call() throws Exception {
                DescribeChannelBanResult result = null;

                try {
                    result = executeDescribeChannelBan(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelFlowResult> describeChannelFlowAsync(DescribeChannelFlowRequest request) {

        return describeChannelFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelFlowResult> describeChannelFlowAsync(final DescribeChannelFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelFlowRequest, DescribeChannelFlowResult> asyncHandler) {
        final DescribeChannelFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelFlowResult>() {
            @Override
            public DescribeChannelFlowResult call() throws Exception {
                DescribeChannelFlowResult result = null;

                try {
                    result = executeDescribeChannelFlow(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelMembershipResult> describeChannelMembershipAsync(DescribeChannelMembershipRequest request) {

        return describeChannelMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelMembershipResult> describeChannelMembershipAsync(final DescribeChannelMembershipRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelMembershipRequest, DescribeChannelMembershipResult> asyncHandler) {
        final DescribeChannelMembershipRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelMembershipResult>() {
            @Override
            public DescribeChannelMembershipResult call() throws Exception {
                DescribeChannelMembershipResult result = null;

                try {
                    result = executeDescribeChannelMembership(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelMembershipForAppInstanceUserResult> describeChannelMembershipForAppInstanceUserAsync(
            DescribeChannelMembershipForAppInstanceUserRequest request) {

        return describeChannelMembershipForAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelMembershipForAppInstanceUserResult> describeChannelMembershipForAppInstanceUserAsync(
            final DescribeChannelMembershipForAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelMembershipForAppInstanceUserRequest, DescribeChannelMembershipForAppInstanceUserResult> asyncHandler) {
        final DescribeChannelMembershipForAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelMembershipForAppInstanceUserResult>() {
            @Override
            public DescribeChannelMembershipForAppInstanceUserResult call() throws Exception {
                DescribeChannelMembershipForAppInstanceUserResult result = null;

                try {
                    result = executeDescribeChannelMembershipForAppInstanceUser(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelModeratedByAppInstanceUserResult> describeChannelModeratedByAppInstanceUserAsync(
            DescribeChannelModeratedByAppInstanceUserRequest request) {

        return describeChannelModeratedByAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelModeratedByAppInstanceUserResult> describeChannelModeratedByAppInstanceUserAsync(
            final DescribeChannelModeratedByAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelModeratedByAppInstanceUserRequest, DescribeChannelModeratedByAppInstanceUserResult> asyncHandler) {
        final DescribeChannelModeratedByAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelModeratedByAppInstanceUserResult>() {
            @Override
            public DescribeChannelModeratedByAppInstanceUserResult call() throws Exception {
                DescribeChannelModeratedByAppInstanceUserResult result = null;

                try {
                    result = executeDescribeChannelModeratedByAppInstanceUser(finalRequest);
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
    public java.util.concurrent.Future<DescribeChannelModeratorResult> describeChannelModeratorAsync(DescribeChannelModeratorRequest request) {

        return describeChannelModeratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeChannelModeratorResult> describeChannelModeratorAsync(final DescribeChannelModeratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeChannelModeratorRequest, DescribeChannelModeratorResult> asyncHandler) {
        final DescribeChannelModeratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeChannelModeratorResult>() {
            @Override
            public DescribeChannelModeratorResult call() throws Exception {
                DescribeChannelModeratorResult result = null;

                try {
                    result = executeDescribeChannelModerator(finalRequest);
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
    public java.util.concurrent.Future<DisassociateChannelFlowResult> disassociateChannelFlowAsync(DisassociateChannelFlowRequest request) {

        return disassociateChannelFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateChannelFlowResult> disassociateChannelFlowAsync(final DisassociateChannelFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateChannelFlowRequest, DisassociateChannelFlowResult> asyncHandler) {
        final DisassociateChannelFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateChannelFlowResult>() {
            @Override
            public DisassociateChannelFlowResult call() throws Exception {
                DisassociateChannelFlowResult result = null;

                try {
                    result = executeDisassociateChannelFlow(finalRequest);
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
    public java.util.concurrent.Future<GetChannelMembershipPreferencesResult> getChannelMembershipPreferencesAsync(
            GetChannelMembershipPreferencesRequest request) {

        return getChannelMembershipPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelMembershipPreferencesResult> getChannelMembershipPreferencesAsync(
            final GetChannelMembershipPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelMembershipPreferencesRequest, GetChannelMembershipPreferencesResult> asyncHandler) {
        final GetChannelMembershipPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelMembershipPreferencesResult>() {
            @Override
            public GetChannelMembershipPreferencesResult call() throws Exception {
                GetChannelMembershipPreferencesResult result = null;

                try {
                    result = executeGetChannelMembershipPreferences(finalRequest);
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
    public java.util.concurrent.Future<GetChannelMessageResult> getChannelMessageAsync(GetChannelMessageRequest request) {

        return getChannelMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelMessageResult> getChannelMessageAsync(final GetChannelMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelMessageRequest, GetChannelMessageResult> asyncHandler) {
        final GetChannelMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelMessageResult>() {
            @Override
            public GetChannelMessageResult call() throws Exception {
                GetChannelMessageResult result = null;

                try {
                    result = executeGetChannelMessage(finalRequest);
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
    public java.util.concurrent.Future<GetChannelMessageStatusResult> getChannelMessageStatusAsync(GetChannelMessageStatusRequest request) {

        return getChannelMessageStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelMessageStatusResult> getChannelMessageStatusAsync(final GetChannelMessageStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelMessageStatusRequest, GetChannelMessageStatusResult> asyncHandler) {
        final GetChannelMessageStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelMessageStatusResult>() {
            @Override
            public GetChannelMessageStatusResult call() throws Exception {
                GetChannelMessageStatusResult result = null;

                try {
                    result = executeGetChannelMessageStatus(finalRequest);
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
    public java.util.concurrent.Future<GetMessagingSessionEndpointResult> getMessagingSessionEndpointAsync(GetMessagingSessionEndpointRequest request) {

        return getMessagingSessionEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMessagingSessionEndpointResult> getMessagingSessionEndpointAsync(final GetMessagingSessionEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMessagingSessionEndpointRequest, GetMessagingSessionEndpointResult> asyncHandler) {
        final GetMessagingSessionEndpointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMessagingSessionEndpointResult>() {
            @Override
            public GetMessagingSessionEndpointResult call() throws Exception {
                GetMessagingSessionEndpointResult result = null;

                try {
                    result = executeGetMessagingSessionEndpoint(finalRequest);
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
    public java.util.concurrent.Future<ListChannelBansResult> listChannelBansAsync(ListChannelBansRequest request) {

        return listChannelBansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelBansResult> listChannelBansAsync(final ListChannelBansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelBansRequest, ListChannelBansResult> asyncHandler) {
        final ListChannelBansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelBansResult>() {
            @Override
            public ListChannelBansResult call() throws Exception {
                ListChannelBansResult result = null;

                try {
                    result = executeListChannelBans(finalRequest);
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
    public java.util.concurrent.Future<ListChannelFlowsResult> listChannelFlowsAsync(ListChannelFlowsRequest request) {

        return listChannelFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelFlowsResult> listChannelFlowsAsync(final ListChannelFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelFlowsRequest, ListChannelFlowsResult> asyncHandler) {
        final ListChannelFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelFlowsResult>() {
            @Override
            public ListChannelFlowsResult call() throws Exception {
                ListChannelFlowsResult result = null;

                try {
                    result = executeListChannelFlows(finalRequest);
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
    public java.util.concurrent.Future<ListChannelMembershipsResult> listChannelMembershipsAsync(ListChannelMembershipsRequest request) {

        return listChannelMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelMembershipsResult> listChannelMembershipsAsync(final ListChannelMembershipsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelMembershipsRequest, ListChannelMembershipsResult> asyncHandler) {
        final ListChannelMembershipsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelMembershipsResult>() {
            @Override
            public ListChannelMembershipsResult call() throws Exception {
                ListChannelMembershipsResult result = null;

                try {
                    result = executeListChannelMemberships(finalRequest);
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
    public java.util.concurrent.Future<ListChannelMembershipsForAppInstanceUserResult> listChannelMembershipsForAppInstanceUserAsync(
            ListChannelMembershipsForAppInstanceUserRequest request) {

        return listChannelMembershipsForAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelMembershipsForAppInstanceUserResult> listChannelMembershipsForAppInstanceUserAsync(
            final ListChannelMembershipsForAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelMembershipsForAppInstanceUserRequest, ListChannelMembershipsForAppInstanceUserResult> asyncHandler) {
        final ListChannelMembershipsForAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelMembershipsForAppInstanceUserResult>() {
            @Override
            public ListChannelMembershipsForAppInstanceUserResult call() throws Exception {
                ListChannelMembershipsForAppInstanceUserResult result = null;

                try {
                    result = executeListChannelMembershipsForAppInstanceUser(finalRequest);
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
    public java.util.concurrent.Future<ListChannelMessagesResult> listChannelMessagesAsync(ListChannelMessagesRequest request) {

        return listChannelMessagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelMessagesResult> listChannelMessagesAsync(final ListChannelMessagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelMessagesRequest, ListChannelMessagesResult> asyncHandler) {
        final ListChannelMessagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelMessagesResult>() {
            @Override
            public ListChannelMessagesResult call() throws Exception {
                ListChannelMessagesResult result = null;

                try {
                    result = executeListChannelMessages(finalRequest);
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
    public java.util.concurrent.Future<ListChannelModeratorsResult> listChannelModeratorsAsync(ListChannelModeratorsRequest request) {

        return listChannelModeratorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelModeratorsResult> listChannelModeratorsAsync(final ListChannelModeratorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelModeratorsRequest, ListChannelModeratorsResult> asyncHandler) {
        final ListChannelModeratorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelModeratorsResult>() {
            @Override
            public ListChannelModeratorsResult call() throws Exception {
                ListChannelModeratorsResult result = null;

                try {
                    result = executeListChannelModerators(finalRequest);
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
    public java.util.concurrent.Future<ListChannelsAssociatedWithChannelFlowResult> listChannelsAssociatedWithChannelFlowAsync(
            ListChannelsAssociatedWithChannelFlowRequest request) {

        return listChannelsAssociatedWithChannelFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsAssociatedWithChannelFlowResult> listChannelsAssociatedWithChannelFlowAsync(
            final ListChannelsAssociatedWithChannelFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelsAssociatedWithChannelFlowRequest, ListChannelsAssociatedWithChannelFlowResult> asyncHandler) {
        final ListChannelsAssociatedWithChannelFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelsAssociatedWithChannelFlowResult>() {
            @Override
            public ListChannelsAssociatedWithChannelFlowResult call() throws Exception {
                ListChannelsAssociatedWithChannelFlowResult result = null;

                try {
                    result = executeListChannelsAssociatedWithChannelFlow(finalRequest);
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
    public java.util.concurrent.Future<ListChannelsModeratedByAppInstanceUserResult> listChannelsModeratedByAppInstanceUserAsync(
            ListChannelsModeratedByAppInstanceUserRequest request) {

        return listChannelsModeratedByAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsModeratedByAppInstanceUserResult> listChannelsModeratedByAppInstanceUserAsync(
            final ListChannelsModeratedByAppInstanceUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListChannelsModeratedByAppInstanceUserRequest, ListChannelsModeratedByAppInstanceUserResult> asyncHandler) {
        final ListChannelsModeratedByAppInstanceUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListChannelsModeratedByAppInstanceUserResult>() {
            @Override
            public ListChannelsModeratedByAppInstanceUserResult call() throws Exception {
                ListChannelsModeratedByAppInstanceUserResult result = null;

                try {
                    result = executeListChannelsModeratedByAppInstanceUser(finalRequest);
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
    public java.util.concurrent.Future<ListSubChannelsResult> listSubChannelsAsync(ListSubChannelsRequest request) {

        return listSubChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubChannelsResult> listSubChannelsAsync(final ListSubChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubChannelsRequest, ListSubChannelsResult> asyncHandler) {
        final ListSubChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSubChannelsResult>() {
            @Override
            public ListSubChannelsResult call() throws Exception {
                ListSubChannelsResult result = null;

                try {
                    result = executeListSubChannels(finalRequest);
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
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
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
    public java.util.concurrent.Future<PutChannelMembershipPreferencesResult> putChannelMembershipPreferencesAsync(
            PutChannelMembershipPreferencesRequest request) {

        return putChannelMembershipPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutChannelMembershipPreferencesResult> putChannelMembershipPreferencesAsync(
            final PutChannelMembershipPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutChannelMembershipPreferencesRequest, PutChannelMembershipPreferencesResult> asyncHandler) {
        final PutChannelMembershipPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutChannelMembershipPreferencesResult>() {
            @Override
            public PutChannelMembershipPreferencesResult call() throws Exception {
                PutChannelMembershipPreferencesResult result = null;

                try {
                    result = executePutChannelMembershipPreferences(finalRequest);
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
    public java.util.concurrent.Future<RedactChannelMessageResult> redactChannelMessageAsync(RedactChannelMessageRequest request) {

        return redactChannelMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RedactChannelMessageResult> redactChannelMessageAsync(final RedactChannelMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<RedactChannelMessageRequest, RedactChannelMessageResult> asyncHandler) {
        final RedactChannelMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RedactChannelMessageResult>() {
            @Override
            public RedactChannelMessageResult call() throws Exception {
                RedactChannelMessageResult result = null;

                try {
                    result = executeRedactChannelMessage(finalRequest);
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
    public java.util.concurrent.Future<SearchChannelsResult> searchChannelsAsync(SearchChannelsRequest request) {

        return searchChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchChannelsResult> searchChannelsAsync(final SearchChannelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchChannelsRequest, SearchChannelsResult> asyncHandler) {
        final SearchChannelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchChannelsResult>() {
            @Override
            public SearchChannelsResult call() throws Exception {
                SearchChannelsResult result = null;

                try {
                    result = executeSearchChannels(finalRequest);
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
    public java.util.concurrent.Future<SendChannelMessageResult> sendChannelMessageAsync(SendChannelMessageRequest request) {

        return sendChannelMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendChannelMessageResult> sendChannelMessageAsync(final SendChannelMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendChannelMessageRequest, SendChannelMessageResult> asyncHandler) {
        final SendChannelMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendChannelMessageResult>() {
            @Override
            public SendChannelMessageResult call() throws Exception {
                SendChannelMessageResult result = null;

                try {
                    result = executeSendChannelMessage(finalRequest);
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
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
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
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest request) {

        return updateChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(final UpdateChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler) {
        final UpdateChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelResult>() {
            @Override
            public UpdateChannelResult call() throws Exception {
                UpdateChannelResult result = null;

                try {
                    result = executeUpdateChannel(finalRequest);
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
    public java.util.concurrent.Future<UpdateChannelFlowResult> updateChannelFlowAsync(UpdateChannelFlowRequest request) {

        return updateChannelFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelFlowResult> updateChannelFlowAsync(final UpdateChannelFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelFlowRequest, UpdateChannelFlowResult> asyncHandler) {
        final UpdateChannelFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelFlowResult>() {
            @Override
            public UpdateChannelFlowResult call() throws Exception {
                UpdateChannelFlowResult result = null;

                try {
                    result = executeUpdateChannelFlow(finalRequest);
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
    public java.util.concurrent.Future<UpdateChannelMessageResult> updateChannelMessageAsync(UpdateChannelMessageRequest request) {

        return updateChannelMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelMessageResult> updateChannelMessageAsync(final UpdateChannelMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelMessageRequest, UpdateChannelMessageResult> asyncHandler) {
        final UpdateChannelMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelMessageResult>() {
            @Override
            public UpdateChannelMessageResult call() throws Exception {
                UpdateChannelMessageResult result = null;

                try {
                    result = executeUpdateChannelMessage(finalRequest);
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
    public java.util.concurrent.Future<UpdateChannelReadMarkerResult> updateChannelReadMarkerAsync(UpdateChannelReadMarkerRequest request) {

        return updateChannelReadMarkerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelReadMarkerResult> updateChannelReadMarkerAsync(final UpdateChannelReadMarkerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelReadMarkerRequest, UpdateChannelReadMarkerResult> asyncHandler) {
        final UpdateChannelReadMarkerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelReadMarkerResult>() {
            @Override
            public UpdateChannelReadMarkerResult call() throws Exception {
                UpdateChannelReadMarkerResult result = null;

                try {
                    result = executeUpdateChannelReadMarker(finalRequest);
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
