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
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MediaLive using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMediaLiveAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptInputDeviceTransferResult> acceptInputDeviceTransferAsync(AcceptInputDeviceTransferRequest request) {

        return acceptInputDeviceTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptInputDeviceTransferResult> acceptInputDeviceTransferAsync(final AcceptInputDeviceTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptInputDeviceTransferRequest, AcceptInputDeviceTransferResult> asyncHandler) {
        final AcceptInputDeviceTransferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptInputDeviceTransferResult>() {
            @Override
            public AcceptInputDeviceTransferResult call() throws Exception {
                AcceptInputDeviceTransferResult result = null;

                try {
                    result = executeAcceptInputDeviceTransfer(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteResult> batchDeleteAsync(BatchDeleteRequest request) {

        return batchDeleteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteResult> batchDeleteAsync(final BatchDeleteRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteRequest, BatchDeleteResult> asyncHandler) {
        final BatchDeleteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteResult>() {
            @Override
            public BatchDeleteResult call() throws Exception {
                BatchDeleteResult result = null;

                try {
                    result = executeBatchDelete(finalRequest);
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
    public java.util.concurrent.Future<BatchStartResult> batchStartAsync(BatchStartRequest request) {

        return batchStartAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchStartResult> batchStartAsync(final BatchStartRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchStartRequest, BatchStartResult> asyncHandler) {
        final BatchStartRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchStartResult>() {
            @Override
            public BatchStartResult call() throws Exception {
                BatchStartResult result = null;

                try {
                    result = executeBatchStart(finalRequest);
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
    public java.util.concurrent.Future<BatchStopResult> batchStopAsync(BatchStopRequest request) {

        return batchStopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchStopResult> batchStopAsync(final BatchStopRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchStopRequest, BatchStopResult> asyncHandler) {
        final BatchStopRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchStopResult>() {
            @Override
            public BatchStopResult call() throws Exception {
                BatchStopResult result = null;

                try {
                    result = executeBatchStop(finalRequest);
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
    public java.util.concurrent.Future<BatchUpdateScheduleResult> batchUpdateScheduleAsync(BatchUpdateScheduleRequest request) {

        return batchUpdateScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateScheduleResult> batchUpdateScheduleAsync(final BatchUpdateScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateScheduleRequest, BatchUpdateScheduleResult> asyncHandler) {
        final BatchUpdateScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateScheduleResult>() {
            @Override
            public BatchUpdateScheduleResult call() throws Exception {
                BatchUpdateScheduleResult result = null;

                try {
                    result = executeBatchUpdateSchedule(finalRequest);
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
    public java.util.concurrent.Future<CancelInputDeviceTransferResult> cancelInputDeviceTransferAsync(CancelInputDeviceTransferRequest request) {

        return cancelInputDeviceTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelInputDeviceTransferResult> cancelInputDeviceTransferAsync(final CancelInputDeviceTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelInputDeviceTransferRequest, CancelInputDeviceTransferResult> asyncHandler) {
        final CancelInputDeviceTransferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelInputDeviceTransferResult>() {
            @Override
            public CancelInputDeviceTransferResult call() throws Exception {
                CancelInputDeviceTransferResult result = null;

                try {
                    result = executeCancelInputDeviceTransfer(finalRequest);
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
    public java.util.concurrent.Future<ClaimDeviceResult> claimDeviceAsync(ClaimDeviceRequest request) {

        return claimDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ClaimDeviceResult> claimDeviceAsync(final ClaimDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ClaimDeviceRequest, ClaimDeviceResult> asyncHandler) {
        final ClaimDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ClaimDeviceResult>() {
            @Override
            public ClaimDeviceResult call() throws Exception {
                ClaimDeviceResult result = null;

                try {
                    result = executeClaimDevice(finalRequest);
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
    public java.util.concurrent.Future<CreateCloudWatchAlarmTemplateResult> createCloudWatchAlarmTemplateAsync(CreateCloudWatchAlarmTemplateRequest request) {

        return createCloudWatchAlarmTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudWatchAlarmTemplateResult> createCloudWatchAlarmTemplateAsync(
            final CreateCloudWatchAlarmTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCloudWatchAlarmTemplateRequest, CreateCloudWatchAlarmTemplateResult> asyncHandler) {
        final CreateCloudWatchAlarmTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCloudWatchAlarmTemplateResult>() {
            @Override
            public CreateCloudWatchAlarmTemplateResult call() throws Exception {
                CreateCloudWatchAlarmTemplateResult result = null;

                try {
                    result = executeCreateCloudWatchAlarmTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateCloudWatchAlarmTemplateGroupResult> createCloudWatchAlarmTemplateGroupAsync(
            CreateCloudWatchAlarmTemplateGroupRequest request) {

        return createCloudWatchAlarmTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCloudWatchAlarmTemplateGroupResult> createCloudWatchAlarmTemplateGroupAsync(
            final CreateCloudWatchAlarmTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCloudWatchAlarmTemplateGroupRequest, CreateCloudWatchAlarmTemplateGroupResult> asyncHandler) {
        final CreateCloudWatchAlarmTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCloudWatchAlarmTemplateGroupResult>() {
            @Override
            public CreateCloudWatchAlarmTemplateGroupResult call() throws Exception {
                CreateCloudWatchAlarmTemplateGroupResult result = null;

                try {
                    result = executeCreateCloudWatchAlarmTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateEventBridgeRuleTemplateResult> createEventBridgeRuleTemplateAsync(CreateEventBridgeRuleTemplateRequest request) {

        return createEventBridgeRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventBridgeRuleTemplateResult> createEventBridgeRuleTemplateAsync(
            final CreateEventBridgeRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventBridgeRuleTemplateRequest, CreateEventBridgeRuleTemplateResult> asyncHandler) {
        final CreateEventBridgeRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventBridgeRuleTemplateResult>() {
            @Override
            public CreateEventBridgeRuleTemplateResult call() throws Exception {
                CreateEventBridgeRuleTemplateResult result = null;

                try {
                    result = executeCreateEventBridgeRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<CreateEventBridgeRuleTemplateGroupResult> createEventBridgeRuleTemplateGroupAsync(
            CreateEventBridgeRuleTemplateGroupRequest request) {

        return createEventBridgeRuleTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventBridgeRuleTemplateGroupResult> createEventBridgeRuleTemplateGroupAsync(
            final CreateEventBridgeRuleTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventBridgeRuleTemplateGroupRequest, CreateEventBridgeRuleTemplateGroupResult> asyncHandler) {
        final CreateEventBridgeRuleTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventBridgeRuleTemplateGroupResult>() {
            @Override
            public CreateEventBridgeRuleTemplateGroupResult call() throws Exception {
                CreateEventBridgeRuleTemplateGroupResult result = null;

                try {
                    result = executeCreateEventBridgeRuleTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateMultiplexResult> createMultiplexAsync(CreateMultiplexRequest request) {

        return createMultiplexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMultiplexResult> createMultiplexAsync(final CreateMultiplexRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMultiplexRequest, CreateMultiplexResult> asyncHandler) {
        final CreateMultiplexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMultiplexResult>() {
            @Override
            public CreateMultiplexResult call() throws Exception {
                CreateMultiplexResult result = null;

                try {
                    result = executeCreateMultiplex(finalRequest);
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
    public java.util.concurrent.Future<CreateMultiplexProgramResult> createMultiplexProgramAsync(CreateMultiplexProgramRequest request) {

        return createMultiplexProgramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMultiplexProgramResult> createMultiplexProgramAsync(final CreateMultiplexProgramRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMultiplexProgramRequest, CreateMultiplexProgramResult> asyncHandler) {
        final CreateMultiplexProgramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMultiplexProgramResult>() {
            @Override
            public CreateMultiplexProgramResult call() throws Exception {
                CreateMultiplexProgramResult result = null;

                try {
                    result = executeCreateMultiplexProgram(finalRequest);
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
    public java.util.concurrent.Future<CreatePartnerInputResult> createPartnerInputAsync(CreatePartnerInputRequest request) {

        return createPartnerInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePartnerInputResult> createPartnerInputAsync(final CreatePartnerInputRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePartnerInputRequest, CreatePartnerInputResult> asyncHandler) {
        final CreatePartnerInputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePartnerInputResult>() {
            @Override
            public CreatePartnerInputResult call() throws Exception {
                CreatePartnerInputResult result = null;

                try {
                    result = executeCreatePartnerInput(finalRequest);
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
    public java.util.concurrent.Future<CreateSignalMapResult> createSignalMapAsync(CreateSignalMapRequest request) {

        return createSignalMapAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSignalMapResult> createSignalMapAsync(final CreateSignalMapRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSignalMapRequest, CreateSignalMapResult> asyncHandler) {
        final CreateSignalMapRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSignalMapResult>() {
            @Override
            public CreateSignalMapResult call() throws Exception {
                CreateSignalMapResult result = null;

                try {
                    result = executeCreateSignalMap(finalRequest);
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
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {
        final CreateTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTagsResult>() {
            @Override
            public CreateTagsResult call() throws Exception {
                CreateTagsResult result = null;

                try {
                    result = executeCreateTags(finalRequest);
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
    public java.util.concurrent.Future<DeleteCloudWatchAlarmTemplateResult> deleteCloudWatchAlarmTemplateAsync(DeleteCloudWatchAlarmTemplateRequest request) {

        return deleteCloudWatchAlarmTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudWatchAlarmTemplateResult> deleteCloudWatchAlarmTemplateAsync(
            final DeleteCloudWatchAlarmTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCloudWatchAlarmTemplateRequest, DeleteCloudWatchAlarmTemplateResult> asyncHandler) {
        final DeleteCloudWatchAlarmTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCloudWatchAlarmTemplateResult>() {
            @Override
            public DeleteCloudWatchAlarmTemplateResult call() throws Exception {
                DeleteCloudWatchAlarmTemplateResult result = null;

                try {
                    result = executeDeleteCloudWatchAlarmTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteCloudWatchAlarmTemplateGroupResult> deleteCloudWatchAlarmTemplateGroupAsync(
            DeleteCloudWatchAlarmTemplateGroupRequest request) {

        return deleteCloudWatchAlarmTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCloudWatchAlarmTemplateGroupResult> deleteCloudWatchAlarmTemplateGroupAsync(
            final DeleteCloudWatchAlarmTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCloudWatchAlarmTemplateGroupRequest, DeleteCloudWatchAlarmTemplateGroupResult> asyncHandler) {
        final DeleteCloudWatchAlarmTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCloudWatchAlarmTemplateGroupResult>() {
            @Override
            public DeleteCloudWatchAlarmTemplateGroupResult call() throws Exception {
                DeleteCloudWatchAlarmTemplateGroupResult result = null;

                try {
                    result = executeDeleteCloudWatchAlarmTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventBridgeRuleTemplateResult> deleteEventBridgeRuleTemplateAsync(DeleteEventBridgeRuleTemplateRequest request) {

        return deleteEventBridgeRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventBridgeRuleTemplateResult> deleteEventBridgeRuleTemplateAsync(
            final DeleteEventBridgeRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventBridgeRuleTemplateRequest, DeleteEventBridgeRuleTemplateResult> asyncHandler) {
        final DeleteEventBridgeRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventBridgeRuleTemplateResult>() {
            @Override
            public DeleteEventBridgeRuleTemplateResult call() throws Exception {
                DeleteEventBridgeRuleTemplateResult result = null;

                try {
                    result = executeDeleteEventBridgeRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventBridgeRuleTemplateGroupResult> deleteEventBridgeRuleTemplateGroupAsync(
            DeleteEventBridgeRuleTemplateGroupRequest request) {

        return deleteEventBridgeRuleTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventBridgeRuleTemplateGroupResult> deleteEventBridgeRuleTemplateGroupAsync(
            final DeleteEventBridgeRuleTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventBridgeRuleTemplateGroupRequest, DeleteEventBridgeRuleTemplateGroupResult> asyncHandler) {
        final DeleteEventBridgeRuleTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventBridgeRuleTemplateGroupResult>() {
            @Override
            public DeleteEventBridgeRuleTemplateGroupResult call() throws Exception {
                DeleteEventBridgeRuleTemplateGroupResult result = null;

                try {
                    result = executeDeleteEventBridgeRuleTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteMultiplexResult> deleteMultiplexAsync(DeleteMultiplexRequest request) {

        return deleteMultiplexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMultiplexResult> deleteMultiplexAsync(final DeleteMultiplexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMultiplexRequest, DeleteMultiplexResult> asyncHandler) {
        final DeleteMultiplexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMultiplexResult>() {
            @Override
            public DeleteMultiplexResult call() throws Exception {
                DeleteMultiplexResult result = null;

                try {
                    result = executeDeleteMultiplex(finalRequest);
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
    public java.util.concurrent.Future<DeleteMultiplexProgramResult> deleteMultiplexProgramAsync(DeleteMultiplexProgramRequest request) {

        return deleteMultiplexProgramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMultiplexProgramResult> deleteMultiplexProgramAsync(final DeleteMultiplexProgramRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMultiplexProgramRequest, DeleteMultiplexProgramResult> asyncHandler) {
        final DeleteMultiplexProgramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMultiplexProgramResult>() {
            @Override
            public DeleteMultiplexProgramResult call() throws Exception {
                DeleteMultiplexProgramResult result = null;

                try {
                    result = executeDeleteMultiplexProgram(finalRequest);
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
    public java.util.concurrent.Future<DeleteReservationResult> deleteReservationAsync(DeleteReservationRequest request) {

        return deleteReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReservationResult> deleteReservationAsync(final DeleteReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReservationRequest, DeleteReservationResult> asyncHandler) {
        final DeleteReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReservationResult>() {
            @Override
            public DeleteReservationResult call() throws Exception {
                DeleteReservationResult result = null;

                try {
                    result = executeDeleteReservation(finalRequest);
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
    public java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(DeleteScheduleRequest request) {

        return deleteScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduleResult> deleteScheduleAsync(final DeleteScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResult> asyncHandler) {
        final DeleteScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScheduleResult>() {
            @Override
            public DeleteScheduleResult call() throws Exception {
                DeleteScheduleResult result = null;

                try {
                    result = executeDeleteSchedule(finalRequest);
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
    public java.util.concurrent.Future<DeleteSignalMapResult> deleteSignalMapAsync(DeleteSignalMapRequest request) {

        return deleteSignalMapAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSignalMapResult> deleteSignalMapAsync(final DeleteSignalMapRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSignalMapRequest, DeleteSignalMapResult> asyncHandler) {
        final DeleteSignalMapRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSignalMapResult>() {
            @Override
            public DeleteSignalMapResult call() throws Exception {
                DeleteSignalMapResult result = null;

                try {
                    result = executeDeleteSignalMap(finalRequest);
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
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {
        final DeleteTagsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTagsResult>() {
            @Override
            public DeleteTagsResult call() throws Exception {
                DeleteTagsResult result = null;

                try {
                    result = executeDeleteTags(finalRequest);
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
    public java.util.concurrent.Future<DescribeAccountConfigurationResult> describeAccountConfigurationAsync(DescribeAccountConfigurationRequest request) {

        return describeAccountConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountConfigurationResult> describeAccountConfigurationAsync(final DescribeAccountConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAccountConfigurationRequest, DescribeAccountConfigurationResult> asyncHandler) {
        final DescribeAccountConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAccountConfigurationResult>() {
            @Override
            public DescribeAccountConfigurationResult call() throws Exception {
                DescribeAccountConfigurationResult result = null;

                try {
                    result = executeDescribeAccountConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DescribeInputDeviceResult> describeInputDeviceAsync(DescribeInputDeviceRequest request) {

        return describeInputDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInputDeviceResult> describeInputDeviceAsync(final DescribeInputDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInputDeviceRequest, DescribeInputDeviceResult> asyncHandler) {
        final DescribeInputDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInputDeviceResult>() {
            @Override
            public DescribeInputDeviceResult call() throws Exception {
                DescribeInputDeviceResult result = null;

                try {
                    result = executeDescribeInputDevice(finalRequest);
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
    public java.util.concurrent.Future<DescribeInputDeviceThumbnailResult> describeInputDeviceThumbnailAsync(DescribeInputDeviceThumbnailRequest request) {

        return describeInputDeviceThumbnailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInputDeviceThumbnailResult> describeInputDeviceThumbnailAsync(final DescribeInputDeviceThumbnailRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInputDeviceThumbnailRequest, DescribeInputDeviceThumbnailResult> asyncHandler) {
        final DescribeInputDeviceThumbnailRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInputDeviceThumbnailResult>() {
            @Override
            public DescribeInputDeviceThumbnailResult call() throws Exception {
                DescribeInputDeviceThumbnailResult result = null;

                try {
                    result = executeDescribeInputDeviceThumbnail(finalRequest);
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
    public java.util.concurrent.Future<DescribeMultiplexResult> describeMultiplexAsync(DescribeMultiplexRequest request) {

        return describeMultiplexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMultiplexResult> describeMultiplexAsync(final DescribeMultiplexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMultiplexRequest, DescribeMultiplexResult> asyncHandler) {
        final DescribeMultiplexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMultiplexResult>() {
            @Override
            public DescribeMultiplexResult call() throws Exception {
                DescribeMultiplexResult result = null;

                try {
                    result = executeDescribeMultiplex(finalRequest);
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
    public java.util.concurrent.Future<DescribeMultiplexProgramResult> describeMultiplexProgramAsync(DescribeMultiplexProgramRequest request) {

        return describeMultiplexProgramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMultiplexProgramResult> describeMultiplexProgramAsync(final DescribeMultiplexProgramRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMultiplexProgramRequest, DescribeMultiplexProgramResult> asyncHandler) {
        final DescribeMultiplexProgramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMultiplexProgramResult>() {
            @Override
            public DescribeMultiplexProgramResult call() throws Exception {
                DescribeMultiplexProgramResult result = null;

                try {
                    result = executeDescribeMultiplexProgram(finalRequest);
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
    public java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(DescribeOfferingRequest request) {

        return describeOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(final DescribeOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOfferingRequest, DescribeOfferingResult> asyncHandler) {
        final DescribeOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOfferingResult>() {
            @Override
            public DescribeOfferingResult call() throws Exception {
                DescribeOfferingResult result = null;

                try {
                    result = executeDescribeOffering(finalRequest);
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
    public java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(DescribeReservationRequest request) {

        return describeReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(final DescribeReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservationRequest, DescribeReservationResult> asyncHandler) {
        final DescribeReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservationResult>() {
            @Override
            public DescribeReservationResult call() throws Exception {
                DescribeReservationResult result = null;

                try {
                    result = executeDescribeReservation(finalRequest);
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
    public java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(DescribeScheduleRequest request) {

        return describeScheduleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScheduleResult> describeScheduleAsync(final DescribeScheduleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScheduleRequest, DescribeScheduleResult> asyncHandler) {
        final DescribeScheduleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScheduleResult>() {
            @Override
            public DescribeScheduleResult call() throws Exception {
                DescribeScheduleResult result = null;

                try {
                    result = executeDescribeSchedule(finalRequest);
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
    public java.util.concurrent.Future<DescribeThumbnailsResult> describeThumbnailsAsync(DescribeThumbnailsRequest request) {

        return describeThumbnailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeThumbnailsResult> describeThumbnailsAsync(final DescribeThumbnailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeThumbnailsRequest, DescribeThumbnailsResult> asyncHandler) {
        final DescribeThumbnailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeThumbnailsResult>() {
            @Override
            public DescribeThumbnailsResult call() throws Exception {
                DescribeThumbnailsResult result = null;

                try {
                    result = executeDescribeThumbnails(finalRequest);
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
    public java.util.concurrent.Future<GetCloudWatchAlarmTemplateResult> getCloudWatchAlarmTemplateAsync(GetCloudWatchAlarmTemplateRequest request) {

        return getCloudWatchAlarmTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudWatchAlarmTemplateResult> getCloudWatchAlarmTemplateAsync(final GetCloudWatchAlarmTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudWatchAlarmTemplateRequest, GetCloudWatchAlarmTemplateResult> asyncHandler) {
        final GetCloudWatchAlarmTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudWatchAlarmTemplateResult>() {
            @Override
            public GetCloudWatchAlarmTemplateResult call() throws Exception {
                GetCloudWatchAlarmTemplateResult result = null;

                try {
                    result = executeGetCloudWatchAlarmTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetCloudWatchAlarmTemplateGroupResult> getCloudWatchAlarmTemplateGroupAsync(
            GetCloudWatchAlarmTemplateGroupRequest request) {

        return getCloudWatchAlarmTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCloudWatchAlarmTemplateGroupResult> getCloudWatchAlarmTemplateGroupAsync(
            final GetCloudWatchAlarmTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCloudWatchAlarmTemplateGroupRequest, GetCloudWatchAlarmTemplateGroupResult> asyncHandler) {
        final GetCloudWatchAlarmTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCloudWatchAlarmTemplateGroupResult>() {
            @Override
            public GetCloudWatchAlarmTemplateGroupResult call() throws Exception {
                GetCloudWatchAlarmTemplateGroupResult result = null;

                try {
                    result = executeGetCloudWatchAlarmTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<GetEventBridgeRuleTemplateResult> getEventBridgeRuleTemplateAsync(GetEventBridgeRuleTemplateRequest request) {

        return getEventBridgeRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventBridgeRuleTemplateResult> getEventBridgeRuleTemplateAsync(final GetEventBridgeRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventBridgeRuleTemplateRequest, GetEventBridgeRuleTemplateResult> asyncHandler) {
        final GetEventBridgeRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventBridgeRuleTemplateResult>() {
            @Override
            public GetEventBridgeRuleTemplateResult call() throws Exception {
                GetEventBridgeRuleTemplateResult result = null;

                try {
                    result = executeGetEventBridgeRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<GetEventBridgeRuleTemplateGroupResult> getEventBridgeRuleTemplateGroupAsync(
            GetEventBridgeRuleTemplateGroupRequest request) {

        return getEventBridgeRuleTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventBridgeRuleTemplateGroupResult> getEventBridgeRuleTemplateGroupAsync(
            final GetEventBridgeRuleTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEventBridgeRuleTemplateGroupRequest, GetEventBridgeRuleTemplateGroupResult> asyncHandler) {
        final GetEventBridgeRuleTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEventBridgeRuleTemplateGroupResult>() {
            @Override
            public GetEventBridgeRuleTemplateGroupResult call() throws Exception {
                GetEventBridgeRuleTemplateGroupResult result = null;

                try {
                    result = executeGetEventBridgeRuleTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<GetSignalMapResult> getSignalMapAsync(GetSignalMapRequest request) {

        return getSignalMapAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSignalMapResult> getSignalMapAsync(final GetSignalMapRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSignalMapRequest, GetSignalMapResult> asyncHandler) {
        final GetSignalMapRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSignalMapResult>() {
            @Override
            public GetSignalMapResult call() throws Exception {
                GetSignalMapResult result = null;

                try {
                    result = executeGetSignalMap(finalRequest);
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
    public java.util.concurrent.Future<ListCloudWatchAlarmTemplateGroupsResult> listCloudWatchAlarmTemplateGroupsAsync(
            ListCloudWatchAlarmTemplateGroupsRequest request) {

        return listCloudWatchAlarmTemplateGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCloudWatchAlarmTemplateGroupsResult> listCloudWatchAlarmTemplateGroupsAsync(
            final ListCloudWatchAlarmTemplateGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCloudWatchAlarmTemplateGroupsRequest, ListCloudWatchAlarmTemplateGroupsResult> asyncHandler) {
        final ListCloudWatchAlarmTemplateGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCloudWatchAlarmTemplateGroupsResult>() {
            @Override
            public ListCloudWatchAlarmTemplateGroupsResult call() throws Exception {
                ListCloudWatchAlarmTemplateGroupsResult result = null;

                try {
                    result = executeListCloudWatchAlarmTemplateGroups(finalRequest);
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
    public java.util.concurrent.Future<ListCloudWatchAlarmTemplatesResult> listCloudWatchAlarmTemplatesAsync(ListCloudWatchAlarmTemplatesRequest request) {

        return listCloudWatchAlarmTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCloudWatchAlarmTemplatesResult> listCloudWatchAlarmTemplatesAsync(final ListCloudWatchAlarmTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCloudWatchAlarmTemplatesRequest, ListCloudWatchAlarmTemplatesResult> asyncHandler) {
        final ListCloudWatchAlarmTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCloudWatchAlarmTemplatesResult>() {
            @Override
            public ListCloudWatchAlarmTemplatesResult call() throws Exception {
                ListCloudWatchAlarmTemplatesResult result = null;

                try {
                    result = executeListCloudWatchAlarmTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListEventBridgeRuleTemplateGroupsResult> listEventBridgeRuleTemplateGroupsAsync(
            ListEventBridgeRuleTemplateGroupsRequest request) {

        return listEventBridgeRuleTemplateGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventBridgeRuleTemplateGroupsResult> listEventBridgeRuleTemplateGroupsAsync(
            final ListEventBridgeRuleTemplateGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventBridgeRuleTemplateGroupsRequest, ListEventBridgeRuleTemplateGroupsResult> asyncHandler) {
        final ListEventBridgeRuleTemplateGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventBridgeRuleTemplateGroupsResult>() {
            @Override
            public ListEventBridgeRuleTemplateGroupsResult call() throws Exception {
                ListEventBridgeRuleTemplateGroupsResult result = null;

                try {
                    result = executeListEventBridgeRuleTemplateGroups(finalRequest);
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
    public java.util.concurrent.Future<ListEventBridgeRuleTemplatesResult> listEventBridgeRuleTemplatesAsync(ListEventBridgeRuleTemplatesRequest request) {

        return listEventBridgeRuleTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventBridgeRuleTemplatesResult> listEventBridgeRuleTemplatesAsync(final ListEventBridgeRuleTemplatesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventBridgeRuleTemplatesRequest, ListEventBridgeRuleTemplatesResult> asyncHandler) {
        final ListEventBridgeRuleTemplatesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventBridgeRuleTemplatesResult>() {
            @Override
            public ListEventBridgeRuleTemplatesResult call() throws Exception {
                ListEventBridgeRuleTemplatesResult result = null;

                try {
                    result = executeListEventBridgeRuleTemplates(finalRequest);
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
    public java.util.concurrent.Future<ListInputDeviceTransfersResult> listInputDeviceTransfersAsync(ListInputDeviceTransfersRequest request) {

        return listInputDeviceTransfersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInputDeviceTransfersResult> listInputDeviceTransfersAsync(final ListInputDeviceTransfersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInputDeviceTransfersRequest, ListInputDeviceTransfersResult> asyncHandler) {
        final ListInputDeviceTransfersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInputDeviceTransfersResult>() {
            @Override
            public ListInputDeviceTransfersResult call() throws Exception {
                ListInputDeviceTransfersResult result = null;

                try {
                    result = executeListInputDeviceTransfers(finalRequest);
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
    public java.util.concurrent.Future<ListInputDevicesResult> listInputDevicesAsync(ListInputDevicesRequest request) {

        return listInputDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInputDevicesResult> listInputDevicesAsync(final ListInputDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInputDevicesRequest, ListInputDevicesResult> asyncHandler) {
        final ListInputDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInputDevicesResult>() {
            @Override
            public ListInputDevicesResult call() throws Exception {
                ListInputDevicesResult result = null;

                try {
                    result = executeListInputDevices(finalRequest);
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
    public java.util.concurrent.Future<ListMultiplexProgramsResult> listMultiplexProgramsAsync(ListMultiplexProgramsRequest request) {

        return listMultiplexProgramsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMultiplexProgramsResult> listMultiplexProgramsAsync(final ListMultiplexProgramsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMultiplexProgramsRequest, ListMultiplexProgramsResult> asyncHandler) {
        final ListMultiplexProgramsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMultiplexProgramsResult>() {
            @Override
            public ListMultiplexProgramsResult call() throws Exception {
                ListMultiplexProgramsResult result = null;

                try {
                    result = executeListMultiplexPrograms(finalRequest);
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
    public java.util.concurrent.Future<ListMultiplexesResult> listMultiplexesAsync(ListMultiplexesRequest request) {

        return listMultiplexesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMultiplexesResult> listMultiplexesAsync(final ListMultiplexesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMultiplexesRequest, ListMultiplexesResult> asyncHandler) {
        final ListMultiplexesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMultiplexesResult>() {
            @Override
            public ListMultiplexesResult call() throws Exception {
                ListMultiplexesResult result = null;

                try {
                    result = executeListMultiplexes(finalRequest);
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
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest request) {

        return listOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(final ListOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler) {
        final ListOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOfferingsResult>() {
            @Override
            public ListOfferingsResult call() throws Exception {
                ListOfferingsResult result = null;

                try {
                    result = executeListOfferings(finalRequest);
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
    public java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(ListReservationsRequest request) {

        return listReservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(final ListReservationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReservationsRequest, ListReservationsResult> asyncHandler) {
        final ListReservationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReservationsResult>() {
            @Override
            public ListReservationsResult call() throws Exception {
                ListReservationsResult result = null;

                try {
                    result = executeListReservations(finalRequest);
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
    public java.util.concurrent.Future<ListSignalMapsResult> listSignalMapsAsync(ListSignalMapsRequest request) {

        return listSignalMapsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSignalMapsResult> listSignalMapsAsync(final ListSignalMapsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSignalMapsRequest, ListSignalMapsResult> asyncHandler) {
        final ListSignalMapsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSignalMapsResult>() {
            @Override
            public ListSignalMapsResult call() throws Exception {
                ListSignalMapsResult result = null;

                try {
                    result = executeListSignalMaps(finalRequest);
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
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest request) {

        return purchaseOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(final PurchaseOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler) {
        final PurchaseOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseOfferingResult>() {
            @Override
            public PurchaseOfferingResult call() throws Exception {
                PurchaseOfferingResult result = null;

                try {
                    result = executePurchaseOffering(finalRequest);
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
    public java.util.concurrent.Future<RebootInputDeviceResult> rebootInputDeviceAsync(RebootInputDeviceRequest request) {

        return rebootInputDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootInputDeviceResult> rebootInputDeviceAsync(final RebootInputDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RebootInputDeviceRequest, RebootInputDeviceResult> asyncHandler) {
        final RebootInputDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RebootInputDeviceResult>() {
            @Override
            public RebootInputDeviceResult call() throws Exception {
                RebootInputDeviceResult result = null;

                try {
                    result = executeRebootInputDevice(finalRequest);
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
    public java.util.concurrent.Future<RejectInputDeviceTransferResult> rejectInputDeviceTransferAsync(RejectInputDeviceTransferRequest request) {

        return rejectInputDeviceTransferAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RejectInputDeviceTransferResult> rejectInputDeviceTransferAsync(final RejectInputDeviceTransferRequest request,
            final com.amazonaws.handlers.AsyncHandler<RejectInputDeviceTransferRequest, RejectInputDeviceTransferResult> asyncHandler) {
        final RejectInputDeviceTransferRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RejectInputDeviceTransferResult>() {
            @Override
            public RejectInputDeviceTransferResult call() throws Exception {
                RejectInputDeviceTransferResult result = null;

                try {
                    result = executeRejectInputDeviceTransfer(finalRequest);
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
    public java.util.concurrent.Future<RestartChannelPipelinesResult> restartChannelPipelinesAsync(RestartChannelPipelinesRequest request) {

        return restartChannelPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestartChannelPipelinesResult> restartChannelPipelinesAsync(final RestartChannelPipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<RestartChannelPipelinesRequest, RestartChannelPipelinesResult> asyncHandler) {
        final RestartChannelPipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RestartChannelPipelinesResult>() {
            @Override
            public RestartChannelPipelinesResult call() throws Exception {
                RestartChannelPipelinesResult result = null;

                try {
                    result = executeRestartChannelPipelines(finalRequest);
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
    public java.util.concurrent.Future<StartDeleteMonitorDeploymentResult> startDeleteMonitorDeploymentAsync(StartDeleteMonitorDeploymentRequest request) {

        return startDeleteMonitorDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartDeleteMonitorDeploymentResult> startDeleteMonitorDeploymentAsync(final StartDeleteMonitorDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartDeleteMonitorDeploymentRequest, StartDeleteMonitorDeploymentResult> asyncHandler) {
        final StartDeleteMonitorDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartDeleteMonitorDeploymentResult>() {
            @Override
            public StartDeleteMonitorDeploymentResult call() throws Exception {
                StartDeleteMonitorDeploymentResult result = null;

                try {
                    result = executeStartDeleteMonitorDeployment(finalRequest);
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
    public java.util.concurrent.Future<StartInputDeviceResult> startInputDeviceAsync(StartInputDeviceRequest request) {

        return startInputDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInputDeviceResult> startInputDeviceAsync(final StartInputDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInputDeviceRequest, StartInputDeviceResult> asyncHandler) {
        final StartInputDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartInputDeviceResult>() {
            @Override
            public StartInputDeviceResult call() throws Exception {
                StartInputDeviceResult result = null;

                try {
                    result = executeStartInputDevice(finalRequest);
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
    public java.util.concurrent.Future<StartInputDeviceMaintenanceWindowResult> startInputDeviceMaintenanceWindowAsync(
            StartInputDeviceMaintenanceWindowRequest request) {

        return startInputDeviceMaintenanceWindowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartInputDeviceMaintenanceWindowResult> startInputDeviceMaintenanceWindowAsync(
            final StartInputDeviceMaintenanceWindowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartInputDeviceMaintenanceWindowRequest, StartInputDeviceMaintenanceWindowResult> asyncHandler) {
        final StartInputDeviceMaintenanceWindowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartInputDeviceMaintenanceWindowResult>() {
            @Override
            public StartInputDeviceMaintenanceWindowResult call() throws Exception {
                StartInputDeviceMaintenanceWindowResult result = null;

                try {
                    result = executeStartInputDeviceMaintenanceWindow(finalRequest);
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
    public java.util.concurrent.Future<StartMonitorDeploymentResult> startMonitorDeploymentAsync(StartMonitorDeploymentRequest request) {

        return startMonitorDeploymentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMonitorDeploymentResult> startMonitorDeploymentAsync(final StartMonitorDeploymentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMonitorDeploymentRequest, StartMonitorDeploymentResult> asyncHandler) {
        final StartMonitorDeploymentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMonitorDeploymentResult>() {
            @Override
            public StartMonitorDeploymentResult call() throws Exception {
                StartMonitorDeploymentResult result = null;

                try {
                    result = executeStartMonitorDeployment(finalRequest);
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
    public java.util.concurrent.Future<StartMultiplexResult> startMultiplexAsync(StartMultiplexRequest request) {

        return startMultiplexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMultiplexResult> startMultiplexAsync(final StartMultiplexRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMultiplexRequest, StartMultiplexResult> asyncHandler) {
        final StartMultiplexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMultiplexResult>() {
            @Override
            public StartMultiplexResult call() throws Exception {
                StartMultiplexResult result = null;

                try {
                    result = executeStartMultiplex(finalRequest);
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
    public java.util.concurrent.Future<StartUpdateSignalMapResult> startUpdateSignalMapAsync(StartUpdateSignalMapRequest request) {

        return startUpdateSignalMapAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartUpdateSignalMapResult> startUpdateSignalMapAsync(final StartUpdateSignalMapRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartUpdateSignalMapRequest, StartUpdateSignalMapResult> asyncHandler) {
        final StartUpdateSignalMapRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartUpdateSignalMapResult>() {
            @Override
            public StartUpdateSignalMapResult call() throws Exception {
                StartUpdateSignalMapResult result = null;

                try {
                    result = executeStartUpdateSignalMap(finalRequest);
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

    @Override
    public java.util.concurrent.Future<StopInputDeviceResult> stopInputDeviceAsync(StopInputDeviceRequest request) {

        return stopInputDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopInputDeviceResult> stopInputDeviceAsync(final StopInputDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopInputDeviceRequest, StopInputDeviceResult> asyncHandler) {
        final StopInputDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopInputDeviceResult>() {
            @Override
            public StopInputDeviceResult call() throws Exception {
                StopInputDeviceResult result = null;

                try {
                    result = executeStopInputDevice(finalRequest);
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
    public java.util.concurrent.Future<StopMultiplexResult> stopMultiplexAsync(StopMultiplexRequest request) {

        return stopMultiplexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopMultiplexResult> stopMultiplexAsync(final StopMultiplexRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopMultiplexRequest, StopMultiplexResult> asyncHandler) {
        final StopMultiplexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopMultiplexResult>() {
            @Override
            public StopMultiplexResult call() throws Exception {
                StopMultiplexResult result = null;

                try {
                    result = executeStopMultiplex(finalRequest);
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
    public java.util.concurrent.Future<TransferInputDeviceResult> transferInputDeviceAsync(TransferInputDeviceRequest request) {

        return transferInputDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TransferInputDeviceResult> transferInputDeviceAsync(final TransferInputDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TransferInputDeviceRequest, TransferInputDeviceResult> asyncHandler) {
        final TransferInputDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TransferInputDeviceResult>() {
            @Override
            public TransferInputDeviceResult call() throws Exception {
                TransferInputDeviceResult result = null;

                try {
                    result = executeTransferInputDevice(finalRequest);
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
    public java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(UpdateAccountConfigurationRequest request) {

        return updateAccountConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountConfigurationResult> updateAccountConfigurationAsync(final UpdateAccountConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAccountConfigurationRequest, UpdateAccountConfigurationResult> asyncHandler) {
        final UpdateAccountConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAccountConfigurationResult>() {
            @Override
            public UpdateAccountConfigurationResult call() throws Exception {
                UpdateAccountConfigurationResult result = null;

                try {
                    result = executeUpdateAccountConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateChannelClassResult> updateChannelClassAsync(UpdateChannelClassRequest request) {

        return updateChannelClassAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelClassResult> updateChannelClassAsync(final UpdateChannelClassRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateChannelClassRequest, UpdateChannelClassResult> asyncHandler) {
        final UpdateChannelClassRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateChannelClassResult>() {
            @Override
            public UpdateChannelClassResult call() throws Exception {
                UpdateChannelClassResult result = null;

                try {
                    result = executeUpdateChannelClass(finalRequest);
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
    public java.util.concurrent.Future<UpdateCloudWatchAlarmTemplateResult> updateCloudWatchAlarmTemplateAsync(UpdateCloudWatchAlarmTemplateRequest request) {

        return updateCloudWatchAlarmTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudWatchAlarmTemplateResult> updateCloudWatchAlarmTemplateAsync(
            final UpdateCloudWatchAlarmTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCloudWatchAlarmTemplateRequest, UpdateCloudWatchAlarmTemplateResult> asyncHandler) {
        final UpdateCloudWatchAlarmTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCloudWatchAlarmTemplateResult>() {
            @Override
            public UpdateCloudWatchAlarmTemplateResult call() throws Exception {
                UpdateCloudWatchAlarmTemplateResult result = null;

                try {
                    result = executeUpdateCloudWatchAlarmTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateCloudWatchAlarmTemplateGroupResult> updateCloudWatchAlarmTemplateGroupAsync(
            UpdateCloudWatchAlarmTemplateGroupRequest request) {

        return updateCloudWatchAlarmTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCloudWatchAlarmTemplateGroupResult> updateCloudWatchAlarmTemplateGroupAsync(
            final UpdateCloudWatchAlarmTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCloudWatchAlarmTemplateGroupRequest, UpdateCloudWatchAlarmTemplateGroupResult> asyncHandler) {
        final UpdateCloudWatchAlarmTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCloudWatchAlarmTemplateGroupResult>() {
            @Override
            public UpdateCloudWatchAlarmTemplateGroupResult call() throws Exception {
                UpdateCloudWatchAlarmTemplateGroupResult result = null;

                try {
                    result = executeUpdateCloudWatchAlarmTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateEventBridgeRuleTemplateResult> updateEventBridgeRuleTemplateAsync(UpdateEventBridgeRuleTemplateRequest request) {

        return updateEventBridgeRuleTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventBridgeRuleTemplateResult> updateEventBridgeRuleTemplateAsync(
            final UpdateEventBridgeRuleTemplateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventBridgeRuleTemplateRequest, UpdateEventBridgeRuleTemplateResult> asyncHandler) {
        final UpdateEventBridgeRuleTemplateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventBridgeRuleTemplateResult>() {
            @Override
            public UpdateEventBridgeRuleTemplateResult call() throws Exception {
                UpdateEventBridgeRuleTemplateResult result = null;

                try {
                    result = executeUpdateEventBridgeRuleTemplate(finalRequest);
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
    public java.util.concurrent.Future<UpdateEventBridgeRuleTemplateGroupResult> updateEventBridgeRuleTemplateGroupAsync(
            UpdateEventBridgeRuleTemplateGroupRequest request) {

        return updateEventBridgeRuleTemplateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventBridgeRuleTemplateGroupResult> updateEventBridgeRuleTemplateGroupAsync(
            final UpdateEventBridgeRuleTemplateGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEventBridgeRuleTemplateGroupRequest, UpdateEventBridgeRuleTemplateGroupResult> asyncHandler) {
        final UpdateEventBridgeRuleTemplateGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEventBridgeRuleTemplateGroupResult>() {
            @Override
            public UpdateEventBridgeRuleTemplateGroupResult call() throws Exception {
                UpdateEventBridgeRuleTemplateGroupResult result = null;

                try {
                    result = executeUpdateEventBridgeRuleTemplateGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateInputResult> updateInputAsync(UpdateInputRequest request) {

        return updateInputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInputResult> updateInputAsync(final UpdateInputRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInputRequest, UpdateInputResult> asyncHandler) {
        final UpdateInputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInputResult>() {
            @Override
            public UpdateInputResult call() throws Exception {
                UpdateInputResult result = null;

                try {
                    result = executeUpdateInput(finalRequest);
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
    public java.util.concurrent.Future<UpdateInputDeviceResult> updateInputDeviceAsync(UpdateInputDeviceRequest request) {

        return updateInputDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInputDeviceResult> updateInputDeviceAsync(final UpdateInputDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInputDeviceRequest, UpdateInputDeviceResult> asyncHandler) {
        final UpdateInputDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInputDeviceResult>() {
            @Override
            public UpdateInputDeviceResult call() throws Exception {
                UpdateInputDeviceResult result = null;

                try {
                    result = executeUpdateInputDevice(finalRequest);
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
    public java.util.concurrent.Future<UpdateInputSecurityGroupResult> updateInputSecurityGroupAsync(UpdateInputSecurityGroupRequest request) {

        return updateInputSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInputSecurityGroupResult> updateInputSecurityGroupAsync(final UpdateInputSecurityGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInputSecurityGroupRequest, UpdateInputSecurityGroupResult> asyncHandler) {
        final UpdateInputSecurityGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInputSecurityGroupResult>() {
            @Override
            public UpdateInputSecurityGroupResult call() throws Exception {
                UpdateInputSecurityGroupResult result = null;

                try {
                    result = executeUpdateInputSecurityGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateMultiplexResult> updateMultiplexAsync(UpdateMultiplexRequest request) {

        return updateMultiplexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMultiplexResult> updateMultiplexAsync(final UpdateMultiplexRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMultiplexRequest, UpdateMultiplexResult> asyncHandler) {
        final UpdateMultiplexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMultiplexResult>() {
            @Override
            public UpdateMultiplexResult call() throws Exception {
                UpdateMultiplexResult result = null;

                try {
                    result = executeUpdateMultiplex(finalRequest);
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
    public java.util.concurrent.Future<UpdateMultiplexProgramResult> updateMultiplexProgramAsync(UpdateMultiplexProgramRequest request) {

        return updateMultiplexProgramAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMultiplexProgramResult> updateMultiplexProgramAsync(final UpdateMultiplexProgramRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMultiplexProgramRequest, UpdateMultiplexProgramResult> asyncHandler) {
        final UpdateMultiplexProgramRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMultiplexProgramResult>() {
            @Override
            public UpdateMultiplexProgramResult call() throws Exception {
                UpdateMultiplexProgramResult result = null;

                try {
                    result = executeUpdateMultiplexProgram(finalRequest);
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
    public java.util.concurrent.Future<UpdateReservationResult> updateReservationAsync(UpdateReservationRequest request) {

        return updateReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReservationResult> updateReservationAsync(final UpdateReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReservationRequest, UpdateReservationResult> asyncHandler) {
        final UpdateReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReservationResult>() {
            @Override
            public UpdateReservationResult call() throws Exception {
                UpdateReservationResult result = null;

                try {
                    result = executeUpdateReservation(finalRequest);
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
