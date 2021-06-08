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
package com.amazonaws.services.nimblestudio;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AmazonNimbleStudio asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonNimbleStudioAsyncClient extends AmazonNimbleStudioClient implements AmazonNimbleStudioAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonNimbleStudioAsyncClientBuilder asyncBuilder() {
        return AmazonNimbleStudioAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AmazonNimbleStudio using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonNimbleStudioAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AmazonNimbleStudio using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonNimbleStudioAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcceptEulasResult> acceptEulasAsync(AcceptEulasRequest request) {

        return acceptEulasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptEulasResult> acceptEulasAsync(final AcceptEulasRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptEulasRequest, AcceptEulasResult> asyncHandler) {
        final AcceptEulasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptEulasResult>() {
            @Override
            public AcceptEulasResult call() throws Exception {
                AcceptEulasResult result = null;

                try {
                    result = executeAcceptEulas(finalRequest);
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
    public java.util.concurrent.Future<CreateLaunchProfileResult> createLaunchProfileAsync(CreateLaunchProfileRequest request) {

        return createLaunchProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLaunchProfileResult> createLaunchProfileAsync(final CreateLaunchProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLaunchProfileRequest, CreateLaunchProfileResult> asyncHandler) {
        final CreateLaunchProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLaunchProfileResult>() {
            @Override
            public CreateLaunchProfileResult call() throws Exception {
                CreateLaunchProfileResult result = null;

                try {
                    result = executeCreateLaunchProfile(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamingImageResult> createStreamingImageAsync(CreateStreamingImageRequest request) {

        return createStreamingImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingImageResult> createStreamingImageAsync(final CreateStreamingImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingImageRequest, CreateStreamingImageResult> asyncHandler) {
        final CreateStreamingImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingImageResult>() {
            @Override
            public CreateStreamingImageResult call() throws Exception {
                CreateStreamingImageResult result = null;

                try {
                    result = executeCreateStreamingImage(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamingSessionResult> createStreamingSessionAsync(CreateStreamingSessionRequest request) {

        return createStreamingSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingSessionResult> createStreamingSessionAsync(final CreateStreamingSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingSessionRequest, CreateStreamingSessionResult> asyncHandler) {
        final CreateStreamingSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingSessionResult>() {
            @Override
            public CreateStreamingSessionResult call() throws Exception {
                CreateStreamingSessionResult result = null;

                try {
                    result = executeCreateStreamingSession(finalRequest);
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
    public java.util.concurrent.Future<CreateStreamingSessionStreamResult> createStreamingSessionStreamAsync(CreateStreamingSessionStreamRequest request) {

        return createStreamingSessionStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamingSessionStreamResult> createStreamingSessionStreamAsync(final CreateStreamingSessionStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamingSessionStreamRequest, CreateStreamingSessionStreamResult> asyncHandler) {
        final CreateStreamingSessionStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamingSessionStreamResult>() {
            @Override
            public CreateStreamingSessionStreamResult call() throws Exception {
                CreateStreamingSessionStreamResult result = null;

                try {
                    result = executeCreateStreamingSessionStream(finalRequest);
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
    public java.util.concurrent.Future<CreateStudioResult> createStudioAsync(CreateStudioRequest request) {

        return createStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStudioResult> createStudioAsync(final CreateStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStudioRequest, CreateStudioResult> asyncHandler) {
        final CreateStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStudioResult>() {
            @Override
            public CreateStudioResult call() throws Exception {
                CreateStudioResult result = null;

                try {
                    result = executeCreateStudio(finalRequest);
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
    public java.util.concurrent.Future<CreateStudioComponentResult> createStudioComponentAsync(CreateStudioComponentRequest request) {

        return createStudioComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStudioComponentResult> createStudioComponentAsync(final CreateStudioComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStudioComponentRequest, CreateStudioComponentResult> asyncHandler) {
        final CreateStudioComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStudioComponentResult>() {
            @Override
            public CreateStudioComponentResult call() throws Exception {
                CreateStudioComponentResult result = null;

                try {
                    result = executeCreateStudioComponent(finalRequest);
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
    public java.util.concurrent.Future<DeleteLaunchProfileResult> deleteLaunchProfileAsync(DeleteLaunchProfileRequest request) {

        return deleteLaunchProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchProfileResult> deleteLaunchProfileAsync(final DeleteLaunchProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchProfileRequest, DeleteLaunchProfileResult> asyncHandler) {
        final DeleteLaunchProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLaunchProfileResult>() {
            @Override
            public DeleteLaunchProfileResult call() throws Exception {
                DeleteLaunchProfileResult result = null;

                try {
                    result = executeDeleteLaunchProfile(finalRequest);
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
    public java.util.concurrent.Future<DeleteLaunchProfileMemberResult> deleteLaunchProfileMemberAsync(DeleteLaunchProfileMemberRequest request) {

        return deleteLaunchProfileMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLaunchProfileMemberResult> deleteLaunchProfileMemberAsync(final DeleteLaunchProfileMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLaunchProfileMemberRequest, DeleteLaunchProfileMemberResult> asyncHandler) {
        final DeleteLaunchProfileMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLaunchProfileMemberResult>() {
            @Override
            public DeleteLaunchProfileMemberResult call() throws Exception {
                DeleteLaunchProfileMemberResult result = null;

                try {
                    result = executeDeleteLaunchProfileMember(finalRequest);
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
    public java.util.concurrent.Future<DeleteStreamingImageResult> deleteStreamingImageAsync(DeleteStreamingImageRequest request) {

        return deleteStreamingImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamingImageResult> deleteStreamingImageAsync(final DeleteStreamingImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamingImageRequest, DeleteStreamingImageResult> asyncHandler) {
        final DeleteStreamingImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamingImageResult>() {
            @Override
            public DeleteStreamingImageResult call() throws Exception {
                DeleteStreamingImageResult result = null;

                try {
                    result = executeDeleteStreamingImage(finalRequest);
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
    public java.util.concurrent.Future<DeleteStreamingSessionResult> deleteStreamingSessionAsync(DeleteStreamingSessionRequest request) {

        return deleteStreamingSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamingSessionResult> deleteStreamingSessionAsync(final DeleteStreamingSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamingSessionRequest, DeleteStreamingSessionResult> asyncHandler) {
        final DeleteStreamingSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamingSessionResult>() {
            @Override
            public DeleteStreamingSessionResult call() throws Exception {
                DeleteStreamingSessionResult result = null;

                try {
                    result = executeDeleteStreamingSession(finalRequest);
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
    public java.util.concurrent.Future<DeleteStudioResult> deleteStudioAsync(DeleteStudioRequest request) {

        return deleteStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStudioResult> deleteStudioAsync(final DeleteStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStudioRequest, DeleteStudioResult> asyncHandler) {
        final DeleteStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStudioResult>() {
            @Override
            public DeleteStudioResult call() throws Exception {
                DeleteStudioResult result = null;

                try {
                    result = executeDeleteStudio(finalRequest);
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
    public java.util.concurrent.Future<DeleteStudioComponentResult> deleteStudioComponentAsync(DeleteStudioComponentRequest request) {

        return deleteStudioComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStudioComponentResult> deleteStudioComponentAsync(final DeleteStudioComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStudioComponentRequest, DeleteStudioComponentResult> asyncHandler) {
        final DeleteStudioComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStudioComponentResult>() {
            @Override
            public DeleteStudioComponentResult call() throws Exception {
                DeleteStudioComponentResult result = null;

                try {
                    result = executeDeleteStudioComponent(finalRequest);
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
    public java.util.concurrent.Future<DeleteStudioMemberResult> deleteStudioMemberAsync(DeleteStudioMemberRequest request) {

        return deleteStudioMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStudioMemberResult> deleteStudioMemberAsync(final DeleteStudioMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStudioMemberRequest, DeleteStudioMemberResult> asyncHandler) {
        final DeleteStudioMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStudioMemberResult>() {
            @Override
            public DeleteStudioMemberResult call() throws Exception {
                DeleteStudioMemberResult result = null;

                try {
                    result = executeDeleteStudioMember(finalRequest);
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
    public java.util.concurrent.Future<GetEulaResult> getEulaAsync(GetEulaRequest request) {

        return getEulaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEulaResult> getEulaAsync(final GetEulaRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEulaRequest, GetEulaResult> asyncHandler) {
        final GetEulaRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEulaResult>() {
            @Override
            public GetEulaResult call() throws Exception {
                GetEulaResult result = null;

                try {
                    result = executeGetEula(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchProfileResult> getLaunchProfileAsync(GetLaunchProfileRequest request) {

        return getLaunchProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchProfileResult> getLaunchProfileAsync(final GetLaunchProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchProfileRequest, GetLaunchProfileResult> asyncHandler) {
        final GetLaunchProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchProfileResult>() {
            @Override
            public GetLaunchProfileResult call() throws Exception {
                GetLaunchProfileResult result = null;

                try {
                    result = executeGetLaunchProfile(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchProfileDetailsResult> getLaunchProfileDetailsAsync(GetLaunchProfileDetailsRequest request) {

        return getLaunchProfileDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchProfileDetailsResult> getLaunchProfileDetailsAsync(final GetLaunchProfileDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchProfileDetailsRequest, GetLaunchProfileDetailsResult> asyncHandler) {
        final GetLaunchProfileDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchProfileDetailsResult>() {
            @Override
            public GetLaunchProfileDetailsResult call() throws Exception {
                GetLaunchProfileDetailsResult result = null;

                try {
                    result = executeGetLaunchProfileDetails(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchProfileInitializationResult> getLaunchProfileInitializationAsync(GetLaunchProfileInitializationRequest request) {

        return getLaunchProfileInitializationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchProfileInitializationResult> getLaunchProfileInitializationAsync(
            final GetLaunchProfileInitializationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchProfileInitializationRequest, GetLaunchProfileInitializationResult> asyncHandler) {
        final GetLaunchProfileInitializationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchProfileInitializationResult>() {
            @Override
            public GetLaunchProfileInitializationResult call() throws Exception {
                GetLaunchProfileInitializationResult result = null;

                try {
                    result = executeGetLaunchProfileInitialization(finalRequest);
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
    public java.util.concurrent.Future<GetLaunchProfileMemberResult> getLaunchProfileMemberAsync(GetLaunchProfileMemberRequest request) {

        return getLaunchProfileMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLaunchProfileMemberResult> getLaunchProfileMemberAsync(final GetLaunchProfileMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLaunchProfileMemberRequest, GetLaunchProfileMemberResult> asyncHandler) {
        final GetLaunchProfileMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLaunchProfileMemberResult>() {
            @Override
            public GetLaunchProfileMemberResult call() throws Exception {
                GetLaunchProfileMemberResult result = null;

                try {
                    result = executeGetLaunchProfileMember(finalRequest);
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
    public java.util.concurrent.Future<GetStreamingImageResult> getStreamingImageAsync(GetStreamingImageRequest request) {

        return getStreamingImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamingImageResult> getStreamingImageAsync(final GetStreamingImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamingImageRequest, GetStreamingImageResult> asyncHandler) {
        final GetStreamingImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamingImageResult>() {
            @Override
            public GetStreamingImageResult call() throws Exception {
                GetStreamingImageResult result = null;

                try {
                    result = executeGetStreamingImage(finalRequest);
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
    public java.util.concurrent.Future<GetStreamingSessionResult> getStreamingSessionAsync(GetStreamingSessionRequest request) {

        return getStreamingSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamingSessionResult> getStreamingSessionAsync(final GetStreamingSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamingSessionRequest, GetStreamingSessionResult> asyncHandler) {
        final GetStreamingSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamingSessionResult>() {
            @Override
            public GetStreamingSessionResult call() throws Exception {
                GetStreamingSessionResult result = null;

                try {
                    result = executeGetStreamingSession(finalRequest);
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
    public java.util.concurrent.Future<GetStreamingSessionStreamResult> getStreamingSessionStreamAsync(GetStreamingSessionStreamRequest request) {

        return getStreamingSessionStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamingSessionStreamResult> getStreamingSessionStreamAsync(final GetStreamingSessionStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamingSessionStreamRequest, GetStreamingSessionStreamResult> asyncHandler) {
        final GetStreamingSessionStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamingSessionStreamResult>() {
            @Override
            public GetStreamingSessionStreamResult call() throws Exception {
                GetStreamingSessionStreamResult result = null;

                try {
                    result = executeGetStreamingSessionStream(finalRequest);
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
    public java.util.concurrent.Future<GetStudioResult> getStudioAsync(GetStudioRequest request) {

        return getStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStudioResult> getStudioAsync(final GetStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStudioRequest, GetStudioResult> asyncHandler) {
        final GetStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStudioResult>() {
            @Override
            public GetStudioResult call() throws Exception {
                GetStudioResult result = null;

                try {
                    result = executeGetStudio(finalRequest);
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
    public java.util.concurrent.Future<GetStudioComponentResult> getStudioComponentAsync(GetStudioComponentRequest request) {

        return getStudioComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStudioComponentResult> getStudioComponentAsync(final GetStudioComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStudioComponentRequest, GetStudioComponentResult> asyncHandler) {
        final GetStudioComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStudioComponentResult>() {
            @Override
            public GetStudioComponentResult call() throws Exception {
                GetStudioComponentResult result = null;

                try {
                    result = executeGetStudioComponent(finalRequest);
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
    public java.util.concurrent.Future<GetStudioMemberResult> getStudioMemberAsync(GetStudioMemberRequest request) {

        return getStudioMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStudioMemberResult> getStudioMemberAsync(final GetStudioMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStudioMemberRequest, GetStudioMemberResult> asyncHandler) {
        final GetStudioMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStudioMemberResult>() {
            @Override
            public GetStudioMemberResult call() throws Exception {
                GetStudioMemberResult result = null;

                try {
                    result = executeGetStudioMember(finalRequest);
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
    public java.util.concurrent.Future<ListEulaAcceptancesResult> listEulaAcceptancesAsync(ListEulaAcceptancesRequest request) {

        return listEulaAcceptancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEulaAcceptancesResult> listEulaAcceptancesAsync(final ListEulaAcceptancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEulaAcceptancesRequest, ListEulaAcceptancesResult> asyncHandler) {
        final ListEulaAcceptancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEulaAcceptancesResult>() {
            @Override
            public ListEulaAcceptancesResult call() throws Exception {
                ListEulaAcceptancesResult result = null;

                try {
                    result = executeListEulaAcceptances(finalRequest);
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
    public java.util.concurrent.Future<ListEulasResult> listEulasAsync(ListEulasRequest request) {

        return listEulasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEulasResult> listEulasAsync(final ListEulasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEulasRequest, ListEulasResult> asyncHandler) {
        final ListEulasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEulasResult>() {
            @Override
            public ListEulasResult call() throws Exception {
                ListEulasResult result = null;

                try {
                    result = executeListEulas(finalRequest);
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
    public java.util.concurrent.Future<ListLaunchProfileMembersResult> listLaunchProfileMembersAsync(ListLaunchProfileMembersRequest request) {

        return listLaunchProfileMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchProfileMembersResult> listLaunchProfileMembersAsync(final ListLaunchProfileMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLaunchProfileMembersRequest, ListLaunchProfileMembersResult> asyncHandler) {
        final ListLaunchProfileMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLaunchProfileMembersResult>() {
            @Override
            public ListLaunchProfileMembersResult call() throws Exception {
                ListLaunchProfileMembersResult result = null;

                try {
                    result = executeListLaunchProfileMembers(finalRequest);
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
    public java.util.concurrent.Future<ListLaunchProfilesResult> listLaunchProfilesAsync(ListLaunchProfilesRequest request) {

        return listLaunchProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLaunchProfilesResult> listLaunchProfilesAsync(final ListLaunchProfilesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLaunchProfilesRequest, ListLaunchProfilesResult> asyncHandler) {
        final ListLaunchProfilesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLaunchProfilesResult>() {
            @Override
            public ListLaunchProfilesResult call() throws Exception {
                ListLaunchProfilesResult result = null;

                try {
                    result = executeListLaunchProfiles(finalRequest);
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
    public java.util.concurrent.Future<ListStreamingImagesResult> listStreamingImagesAsync(ListStreamingImagesRequest request) {

        return listStreamingImagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamingImagesResult> listStreamingImagesAsync(final ListStreamingImagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamingImagesRequest, ListStreamingImagesResult> asyncHandler) {
        final ListStreamingImagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamingImagesResult>() {
            @Override
            public ListStreamingImagesResult call() throws Exception {
                ListStreamingImagesResult result = null;

                try {
                    result = executeListStreamingImages(finalRequest);
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
    public java.util.concurrent.Future<ListStreamingSessionsResult> listStreamingSessionsAsync(ListStreamingSessionsRequest request) {

        return listStreamingSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamingSessionsResult> listStreamingSessionsAsync(final ListStreamingSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamingSessionsRequest, ListStreamingSessionsResult> asyncHandler) {
        final ListStreamingSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamingSessionsResult>() {
            @Override
            public ListStreamingSessionsResult call() throws Exception {
                ListStreamingSessionsResult result = null;

                try {
                    result = executeListStreamingSessions(finalRequest);
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
    public java.util.concurrent.Future<ListStudioComponentsResult> listStudioComponentsAsync(ListStudioComponentsRequest request) {

        return listStudioComponentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStudioComponentsResult> listStudioComponentsAsync(final ListStudioComponentsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStudioComponentsRequest, ListStudioComponentsResult> asyncHandler) {
        final ListStudioComponentsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStudioComponentsResult>() {
            @Override
            public ListStudioComponentsResult call() throws Exception {
                ListStudioComponentsResult result = null;

                try {
                    result = executeListStudioComponents(finalRequest);
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
    public java.util.concurrent.Future<ListStudioMembersResult> listStudioMembersAsync(ListStudioMembersRequest request) {

        return listStudioMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStudioMembersResult> listStudioMembersAsync(final ListStudioMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStudioMembersRequest, ListStudioMembersResult> asyncHandler) {
        final ListStudioMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStudioMembersResult>() {
            @Override
            public ListStudioMembersResult call() throws Exception {
                ListStudioMembersResult result = null;

                try {
                    result = executeListStudioMembers(finalRequest);
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
    public java.util.concurrent.Future<ListStudiosResult> listStudiosAsync(ListStudiosRequest request) {

        return listStudiosAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStudiosResult> listStudiosAsync(final ListStudiosRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStudiosRequest, ListStudiosResult> asyncHandler) {
        final ListStudiosRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStudiosResult>() {
            @Override
            public ListStudiosResult call() throws Exception {
                ListStudiosResult result = null;

                try {
                    result = executeListStudios(finalRequest);
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
    public java.util.concurrent.Future<PutLaunchProfileMembersResult> putLaunchProfileMembersAsync(PutLaunchProfileMembersRequest request) {

        return putLaunchProfileMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLaunchProfileMembersResult> putLaunchProfileMembersAsync(final PutLaunchProfileMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLaunchProfileMembersRequest, PutLaunchProfileMembersResult> asyncHandler) {
        final PutLaunchProfileMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLaunchProfileMembersResult>() {
            @Override
            public PutLaunchProfileMembersResult call() throws Exception {
                PutLaunchProfileMembersResult result = null;

                try {
                    result = executePutLaunchProfileMembers(finalRequest);
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
    public java.util.concurrent.Future<PutStudioMembersResult> putStudioMembersAsync(PutStudioMembersRequest request) {

        return putStudioMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutStudioMembersResult> putStudioMembersAsync(final PutStudioMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutStudioMembersRequest, PutStudioMembersResult> asyncHandler) {
        final PutStudioMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutStudioMembersResult>() {
            @Override
            public PutStudioMembersResult call() throws Exception {
                PutStudioMembersResult result = null;

                try {
                    result = executePutStudioMembers(finalRequest);
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
    public java.util.concurrent.Future<StartStudioSSOConfigurationRepairResult> startStudioSSOConfigurationRepairAsync(
            StartStudioSSOConfigurationRepairRequest request) {

        return startStudioSSOConfigurationRepairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartStudioSSOConfigurationRepairResult> startStudioSSOConfigurationRepairAsync(
            final StartStudioSSOConfigurationRepairRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartStudioSSOConfigurationRepairRequest, StartStudioSSOConfigurationRepairResult> asyncHandler) {
        final StartStudioSSOConfigurationRepairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartStudioSSOConfigurationRepairResult>() {
            @Override
            public StartStudioSSOConfigurationRepairResult call() throws Exception {
                StartStudioSSOConfigurationRepairResult result = null;

                try {
                    result = executeStartStudioSSOConfigurationRepair(finalRequest);
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
    public java.util.concurrent.Future<UpdateLaunchProfileResult> updateLaunchProfileAsync(UpdateLaunchProfileRequest request) {

        return updateLaunchProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchProfileResult> updateLaunchProfileAsync(final UpdateLaunchProfileRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLaunchProfileRequest, UpdateLaunchProfileResult> asyncHandler) {
        final UpdateLaunchProfileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLaunchProfileResult>() {
            @Override
            public UpdateLaunchProfileResult call() throws Exception {
                UpdateLaunchProfileResult result = null;

                try {
                    result = executeUpdateLaunchProfile(finalRequest);
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
    public java.util.concurrent.Future<UpdateLaunchProfileMemberResult> updateLaunchProfileMemberAsync(UpdateLaunchProfileMemberRequest request) {

        return updateLaunchProfileMemberAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLaunchProfileMemberResult> updateLaunchProfileMemberAsync(final UpdateLaunchProfileMemberRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLaunchProfileMemberRequest, UpdateLaunchProfileMemberResult> asyncHandler) {
        final UpdateLaunchProfileMemberRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLaunchProfileMemberResult>() {
            @Override
            public UpdateLaunchProfileMemberResult call() throws Exception {
                UpdateLaunchProfileMemberResult result = null;

                try {
                    result = executeUpdateLaunchProfileMember(finalRequest);
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
    public java.util.concurrent.Future<UpdateStreamingImageResult> updateStreamingImageAsync(UpdateStreamingImageRequest request) {

        return updateStreamingImageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStreamingImageResult> updateStreamingImageAsync(final UpdateStreamingImageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStreamingImageRequest, UpdateStreamingImageResult> asyncHandler) {
        final UpdateStreamingImageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStreamingImageResult>() {
            @Override
            public UpdateStreamingImageResult call() throws Exception {
                UpdateStreamingImageResult result = null;

                try {
                    result = executeUpdateStreamingImage(finalRequest);
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
    public java.util.concurrent.Future<UpdateStudioResult> updateStudioAsync(UpdateStudioRequest request) {

        return updateStudioAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStudioResult> updateStudioAsync(final UpdateStudioRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStudioRequest, UpdateStudioResult> asyncHandler) {
        final UpdateStudioRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStudioResult>() {
            @Override
            public UpdateStudioResult call() throws Exception {
                UpdateStudioResult result = null;

                try {
                    result = executeUpdateStudio(finalRequest);
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
    public java.util.concurrent.Future<UpdateStudioComponentResult> updateStudioComponentAsync(UpdateStudioComponentRequest request) {

        return updateStudioComponentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStudioComponentResult> updateStudioComponentAsync(final UpdateStudioComponentRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStudioComponentRequest, UpdateStudioComponentResult> asyncHandler) {
        final UpdateStudioComponentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStudioComponentResult>() {
            @Override
            public UpdateStudioComponentResult call() throws Exception {
                UpdateStudioComponentResult result = null;

                try {
                    result = executeUpdateStudioComponent(finalRequest);
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
