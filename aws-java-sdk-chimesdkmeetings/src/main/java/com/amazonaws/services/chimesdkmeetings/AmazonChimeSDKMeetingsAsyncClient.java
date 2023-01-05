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
package com.amazonaws.services.chimesdkmeetings;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmeetings.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Chime SDK Meetings asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon Chime SDK meetings APIs in this section allow software developers to create Amazon Chime SDK meetings, set
 * the AWS Regions for meetings, create and manage users, and send and receive meeting notifications. For more
 * information about the meeting APIs, see <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Meetings.html">Amazon
 * Chime SDK meetings</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKMeetingsAsyncClient extends AmazonChimeSDKMeetingsClient implements AmazonChimeSDKMeetingsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonChimeSDKMeetingsAsyncClientBuilder asyncBuilder() {
        return AmazonChimeSDKMeetingsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Meetings using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMeetingsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Meetings using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonChimeSDKMeetingsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest request) {

        return batchCreateAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(final BatchCreateAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchCreateAttendeeRequest, BatchCreateAttendeeResult> asyncHandler) {
        final BatchCreateAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchCreateAttendeeResult>() {
            @Override
            public BatchCreateAttendeeResult call() throws Exception {
                BatchCreateAttendeeResult result = null;

                try {
                    result = executeBatchCreateAttendee(finalRequest);
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
    public java.util.concurrent.Future<BatchUpdateAttendeeCapabilitiesExceptResult> batchUpdateAttendeeCapabilitiesExceptAsync(
            BatchUpdateAttendeeCapabilitiesExceptRequest request) {

        return batchUpdateAttendeeCapabilitiesExceptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateAttendeeCapabilitiesExceptResult> batchUpdateAttendeeCapabilitiesExceptAsync(
            final BatchUpdateAttendeeCapabilitiesExceptRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateAttendeeCapabilitiesExceptRequest, BatchUpdateAttendeeCapabilitiesExceptResult> asyncHandler) {
        final BatchUpdateAttendeeCapabilitiesExceptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateAttendeeCapabilitiesExceptResult>() {
            @Override
            public BatchUpdateAttendeeCapabilitiesExceptResult call() throws Exception {
                BatchUpdateAttendeeCapabilitiesExceptResult result = null;

                try {
                    result = executeBatchUpdateAttendeeCapabilitiesExcept(finalRequest);
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
    public java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest request) {

        return createAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(final CreateAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAttendeeRequest, CreateAttendeeResult> asyncHandler) {
        final CreateAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAttendeeResult>() {
            @Override
            public CreateAttendeeResult call() throws Exception {
                CreateAttendeeResult result = null;

                try {
                    result = executeCreateAttendee(finalRequest);
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
    public java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest request) {

        return createMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(final CreateMeetingRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMeetingRequest, CreateMeetingResult> asyncHandler) {
        final CreateMeetingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMeetingResult>() {
            @Override
            public CreateMeetingResult call() throws Exception {
                CreateMeetingResult result = null;

                try {
                    result = executeCreateMeeting(finalRequest);
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
    public java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(CreateMeetingWithAttendeesRequest request) {

        return createMeetingWithAttendeesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(final CreateMeetingWithAttendeesRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMeetingWithAttendeesRequest, CreateMeetingWithAttendeesResult> asyncHandler) {
        final CreateMeetingWithAttendeesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMeetingWithAttendeesResult>() {
            @Override
            public CreateMeetingWithAttendeesResult call() throws Exception {
                CreateMeetingWithAttendeesResult result = null;

                try {
                    result = executeCreateMeetingWithAttendees(finalRequest);
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
    public java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest request) {

        return deleteAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(final DeleteAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAttendeeRequest, DeleteAttendeeResult> asyncHandler) {
        final DeleteAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAttendeeResult>() {
            @Override
            public DeleteAttendeeResult call() throws Exception {
                DeleteAttendeeResult result = null;

                try {
                    result = executeDeleteAttendee(finalRequest);
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
    public java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest request) {

        return deleteMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(final DeleteMeetingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMeetingRequest, DeleteMeetingResult> asyncHandler) {
        final DeleteMeetingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMeetingResult>() {
            @Override
            public DeleteMeetingResult call() throws Exception {
                DeleteMeetingResult result = null;

                try {
                    result = executeDeleteMeeting(finalRequest);
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
    public java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest request) {

        return getAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(final GetAttendeeRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAttendeeRequest, GetAttendeeResult> asyncHandler) {
        final GetAttendeeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAttendeeResult>() {
            @Override
            public GetAttendeeResult call() throws Exception {
                GetAttendeeResult result = null;

                try {
                    result = executeGetAttendee(finalRequest);
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
    public java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest request) {

        return getMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(final GetMeetingRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMeetingRequest, GetMeetingResult> asyncHandler) {
        final GetMeetingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMeetingResult>() {
            @Override
            public GetMeetingResult call() throws Exception {
                GetMeetingResult result = null;

                try {
                    result = executeGetMeeting(finalRequest);
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
    public java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest request) {

        return listAttendeesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(final ListAttendeesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAttendeesRequest, ListAttendeesResult> asyncHandler) {
        final ListAttendeesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAttendeesResult>() {
            @Override
            public ListAttendeesResult call() throws Exception {
                ListAttendeesResult result = null;

                try {
                    result = executeListAttendees(finalRequest);
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
    public java.util.concurrent.Future<StartMeetingTranscriptionResult> startMeetingTranscriptionAsync(StartMeetingTranscriptionRequest request) {

        return startMeetingTranscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMeetingTranscriptionResult> startMeetingTranscriptionAsync(final StartMeetingTranscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMeetingTranscriptionRequest, StartMeetingTranscriptionResult> asyncHandler) {
        final StartMeetingTranscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMeetingTranscriptionResult>() {
            @Override
            public StartMeetingTranscriptionResult call() throws Exception {
                StartMeetingTranscriptionResult result = null;

                try {
                    result = executeStartMeetingTranscription(finalRequest);
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
    public java.util.concurrent.Future<StopMeetingTranscriptionResult> stopMeetingTranscriptionAsync(StopMeetingTranscriptionRequest request) {

        return stopMeetingTranscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopMeetingTranscriptionResult> stopMeetingTranscriptionAsync(final StopMeetingTranscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopMeetingTranscriptionRequest, StopMeetingTranscriptionResult> asyncHandler) {
        final StopMeetingTranscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopMeetingTranscriptionResult>() {
            @Override
            public StopMeetingTranscriptionResult call() throws Exception {
                StopMeetingTranscriptionResult result = null;

                try {
                    result = executeStopMeetingTranscription(finalRequest);
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
    public java.util.concurrent.Future<UpdateAttendeeCapabilitiesResult> updateAttendeeCapabilitiesAsync(UpdateAttendeeCapabilitiesRequest request) {

        return updateAttendeeCapabilitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAttendeeCapabilitiesResult> updateAttendeeCapabilitiesAsync(final UpdateAttendeeCapabilitiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAttendeeCapabilitiesRequest, UpdateAttendeeCapabilitiesResult> asyncHandler) {
        final UpdateAttendeeCapabilitiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAttendeeCapabilitiesResult>() {
            @Override
            public UpdateAttendeeCapabilitiesResult call() throws Exception {
                UpdateAttendeeCapabilitiesResult result = null;

                try {
                    result = executeUpdateAttendeeCapabilities(finalRequest);
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
