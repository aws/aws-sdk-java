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
package com.amazonaws.services.ivsrealtime;

import javax.annotation.Generated;

import com.amazonaws.services.ivsrealtime.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ivsrealtime asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon Interactive Video Service (IVS) real-time API is REST compatible, using a standard HTTP API and an AWS
 * EventBridge event stream for responses. JSON is used for both requests and responses, including errors.
 * </p>
 * <p>
 * Terminology:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <i>stage</i> is a virtual space where participants can exchange video in real time.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant token</i> is a token that authenticates a participant when they join a stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant object</i> represents participants (people) in the stage and contains information about them. When a
 * token is created, it includes a participant ID; when a participant uses that token to join a stage, the participant
 * is associated with that participant ID. There is a 1:1 mapping between participant tokens and participants.
 * </p>
 * </li>
 * <li>
 * <p>
 * Server-side composition: The <i>composition</i> process composites participants of a stage into a single video and
 * forwards it to a set of outputs (e.g., IVS channels). Composition endpoints support this process.
 * </p>
 * </li>
 * <li>
 * <p>
 * Server-side composition: A <i>composition</i> controls the look of the outputs, including how participants are
 * positioned in the video.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/getting-started.html">Getting Started with Amazon IVS
 * Real-Time Streaming</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Stage</b> — A stage is a virtual space where participants can exchange video in real time.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging</b>
 * </p>
 * <p>
 * A <i>tag</i> is a metadata label that you assign to an AWS resource. A tag comprises a <i>key</i> and a <i>value</i>,
 * both set by you. For example, you might set a tag as <code>topic:nature</code> to label a particular video category.
 * See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for more
 * information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS stages
 * has no service-specific constraints beyond what is documented there.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS real-time API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resource supports tagging: Stage.
 * </p>
 * <p>
 * At most 50 tags can be applied to a resource.
 * </p>
 * <p>
 * <b>Stages Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateParticipantToken</a> — Creates an additional token for a specified stage. This can be done after stage
 * creation or when tokens expire.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStage</a> — Creates a new stage (and optionally participant tokens).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStage</a> — Shuts down and deletes the specified stage (disconnecting all participants).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectParticipant</a> — Disconnects a specified participant and revokes the participant permanently from a
 * specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetParticipant</a> — Gets information about the specified participant token.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStage</a> — Gets information for the specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStageSession</a> — Gets information for the specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipantEvents</a> — Lists events for a specified participant that occurred during a specified stage
 * session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipants</a> — Lists all participants in a specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStages</a> — Gets summary information about all stages in your account, in the AWS region where the API
 * request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStageSessions</a> — Gets all sessions for a specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateStage</a> — Updates a stage’s configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Composition Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetComposition</a> — Gets information about the specified Composition resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListCompositions</a> — Gets summary information about all Compositions in your account, in the AWS region where
 * the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartComposition</a> — Starts a Composition from a stage based on the configuration provided in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopComposition</a> — Stops and deletes a Composition resource. Any broadcast from the Composition resource is
 * stopped.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>EncoderConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateEncoderConfiguration</a> — Creates an EncoderConfiguration object.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteEncoderConfiguration</a> — Deletes an EncoderConfiguration resource. Ensures that no Compositions are using
 * this template; otherwise, returns an error.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetEncoderConfiguration</a> — Gets information about the specified EncoderConfiguration resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListEncoderConfigurations</a> — Gets summary information about all EncoderConfigurations in your account, in the
 * AWS region where the API request is processed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>StorageConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStorageConfiguration</a> — Creates a new storage configuration, used to enable recording to Amazon S3.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStorageConfiguration</a> — Deletes the storage configuration for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStorageConfiguration</a> — Gets the storage configuration for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStorageConfigurations</a> — Gets summary information about all storage configurations in your account, in the
 * AWS region where the API request is processed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tags Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for the AWS resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from the resource with the specified ARN.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonIVSRealTimeAsyncClient extends AmazonIVSRealTimeClient implements AmazonIVSRealTimeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonIVSRealTimeAsyncClientBuilder asyncBuilder() {
        return AmazonIVSRealTimeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ivsrealtime using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonIVSRealTimeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ivsrealtime using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonIVSRealTimeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateEncoderConfigurationResult> createEncoderConfigurationAsync(CreateEncoderConfigurationRequest request) {

        return createEncoderConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEncoderConfigurationResult> createEncoderConfigurationAsync(final CreateEncoderConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEncoderConfigurationRequest, CreateEncoderConfigurationResult> asyncHandler) {
        final CreateEncoderConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEncoderConfigurationResult>() {
            @Override
            public CreateEncoderConfigurationResult call() throws Exception {
                CreateEncoderConfigurationResult result = null;

                try {
                    result = executeCreateEncoderConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateParticipantTokenResult> createParticipantTokenAsync(CreateParticipantTokenRequest request) {

        return createParticipantTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParticipantTokenResult> createParticipantTokenAsync(final CreateParticipantTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateParticipantTokenRequest, CreateParticipantTokenResult> asyncHandler) {
        final CreateParticipantTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateParticipantTokenResult>() {
            @Override
            public CreateParticipantTokenResult call() throws Exception {
                CreateParticipantTokenResult result = null;

                try {
                    result = executeCreateParticipantToken(finalRequest);
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
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest request) {

        return createStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStageResult> createStageAsync(final CreateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler) {
        final CreateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStageResult>() {
            @Override
            public CreateStageResult call() throws Exception {
                CreateStageResult result = null;

                try {
                    result = executeCreateStage(finalRequest);
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
    public java.util.concurrent.Future<CreateStorageConfigurationResult> createStorageConfigurationAsync(CreateStorageConfigurationRequest request) {

        return createStorageConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStorageConfigurationResult> createStorageConfigurationAsync(final CreateStorageConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStorageConfigurationRequest, CreateStorageConfigurationResult> asyncHandler) {
        final CreateStorageConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStorageConfigurationResult>() {
            @Override
            public CreateStorageConfigurationResult call() throws Exception {
                CreateStorageConfigurationResult result = null;

                try {
                    result = executeCreateStorageConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteEncoderConfigurationResult> deleteEncoderConfigurationAsync(DeleteEncoderConfigurationRequest request) {

        return deleteEncoderConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEncoderConfigurationResult> deleteEncoderConfigurationAsync(final DeleteEncoderConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEncoderConfigurationRequest, DeleteEncoderConfigurationResult> asyncHandler) {
        final DeleteEncoderConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEncoderConfigurationResult>() {
            @Override
            public DeleteEncoderConfigurationResult call() throws Exception {
                DeleteEncoderConfigurationResult result = null;

                try {
                    result = executeDeleteEncoderConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest request) {

        return deleteStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(final DeleteStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler) {
        final DeleteStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStageResult>() {
            @Override
            public DeleteStageResult call() throws Exception {
                DeleteStageResult result = null;

                try {
                    result = executeDeleteStage(finalRequest);
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
    public java.util.concurrent.Future<DeleteStorageConfigurationResult> deleteStorageConfigurationAsync(DeleteStorageConfigurationRequest request) {

        return deleteStorageConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStorageConfigurationResult> deleteStorageConfigurationAsync(final DeleteStorageConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStorageConfigurationRequest, DeleteStorageConfigurationResult> asyncHandler) {
        final DeleteStorageConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStorageConfigurationResult>() {
            @Override
            public DeleteStorageConfigurationResult call() throws Exception {
                DeleteStorageConfigurationResult result = null;

                try {
                    result = executeDeleteStorageConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest request) {

        return disconnectParticipantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(final DisconnectParticipantRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler) {
        final DisconnectParticipantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectParticipantResult>() {
            @Override
            public DisconnectParticipantResult call() throws Exception {
                DisconnectParticipantResult result = null;

                try {
                    result = executeDisconnectParticipant(finalRequest);
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
    public java.util.concurrent.Future<GetCompositionResult> getCompositionAsync(GetCompositionRequest request) {

        return getCompositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCompositionResult> getCompositionAsync(final GetCompositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCompositionRequest, GetCompositionResult> asyncHandler) {
        final GetCompositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCompositionResult>() {
            @Override
            public GetCompositionResult call() throws Exception {
                GetCompositionResult result = null;

                try {
                    result = executeGetComposition(finalRequest);
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
    public java.util.concurrent.Future<GetEncoderConfigurationResult> getEncoderConfigurationAsync(GetEncoderConfigurationRequest request) {

        return getEncoderConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEncoderConfigurationResult> getEncoderConfigurationAsync(final GetEncoderConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEncoderConfigurationRequest, GetEncoderConfigurationResult> asyncHandler) {
        final GetEncoderConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEncoderConfigurationResult>() {
            @Override
            public GetEncoderConfigurationResult call() throws Exception {
                GetEncoderConfigurationResult result = null;

                try {
                    result = executeGetEncoderConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetParticipantResult> getParticipantAsync(GetParticipantRequest request) {

        return getParticipantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetParticipantResult> getParticipantAsync(final GetParticipantRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetParticipantRequest, GetParticipantResult> asyncHandler) {
        final GetParticipantRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetParticipantResult>() {
            @Override
            public GetParticipantResult call() throws Exception {
                GetParticipantResult result = null;

                try {
                    result = executeGetParticipant(finalRequest);
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
    public java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest request) {

        return getStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageResult> getStageAsync(final GetStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler) {
        final GetStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStageResult>() {
            @Override
            public GetStageResult call() throws Exception {
                GetStageResult result = null;

                try {
                    result = executeGetStage(finalRequest);
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
    public java.util.concurrent.Future<GetStageSessionResult> getStageSessionAsync(GetStageSessionRequest request) {

        return getStageSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStageSessionResult> getStageSessionAsync(final GetStageSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStageSessionRequest, GetStageSessionResult> asyncHandler) {
        final GetStageSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStageSessionResult>() {
            @Override
            public GetStageSessionResult call() throws Exception {
                GetStageSessionResult result = null;

                try {
                    result = executeGetStageSession(finalRequest);
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
    public java.util.concurrent.Future<GetStorageConfigurationResult> getStorageConfigurationAsync(GetStorageConfigurationRequest request) {

        return getStorageConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStorageConfigurationResult> getStorageConfigurationAsync(final GetStorageConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStorageConfigurationRequest, GetStorageConfigurationResult> asyncHandler) {
        final GetStorageConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStorageConfigurationResult>() {
            @Override
            public GetStorageConfigurationResult call() throws Exception {
                GetStorageConfigurationResult result = null;

                try {
                    result = executeGetStorageConfiguration(finalRequest);
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
    public java.util.concurrent.Future<ListCompositionsResult> listCompositionsAsync(ListCompositionsRequest request) {

        return listCompositionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCompositionsResult> listCompositionsAsync(final ListCompositionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCompositionsRequest, ListCompositionsResult> asyncHandler) {
        final ListCompositionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCompositionsResult>() {
            @Override
            public ListCompositionsResult call() throws Exception {
                ListCompositionsResult result = null;

                try {
                    result = executeListCompositions(finalRequest);
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
    public java.util.concurrent.Future<ListEncoderConfigurationsResult> listEncoderConfigurationsAsync(ListEncoderConfigurationsRequest request) {

        return listEncoderConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEncoderConfigurationsResult> listEncoderConfigurationsAsync(final ListEncoderConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEncoderConfigurationsRequest, ListEncoderConfigurationsResult> asyncHandler) {
        final ListEncoderConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEncoderConfigurationsResult>() {
            @Override
            public ListEncoderConfigurationsResult call() throws Exception {
                ListEncoderConfigurationsResult result = null;

                try {
                    result = executeListEncoderConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListParticipantEventsResult> listParticipantEventsAsync(ListParticipantEventsRequest request) {

        return listParticipantEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListParticipantEventsResult> listParticipantEventsAsync(final ListParticipantEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListParticipantEventsRequest, ListParticipantEventsResult> asyncHandler) {
        final ListParticipantEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListParticipantEventsResult>() {
            @Override
            public ListParticipantEventsResult call() throws Exception {
                ListParticipantEventsResult result = null;

                try {
                    result = executeListParticipantEvents(finalRequest);
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
    public java.util.concurrent.Future<ListParticipantsResult> listParticipantsAsync(ListParticipantsRequest request) {

        return listParticipantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListParticipantsResult> listParticipantsAsync(final ListParticipantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListParticipantsRequest, ListParticipantsResult> asyncHandler) {
        final ListParticipantsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListParticipantsResult>() {
            @Override
            public ListParticipantsResult call() throws Exception {
                ListParticipantsResult result = null;

                try {
                    result = executeListParticipants(finalRequest);
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
    public java.util.concurrent.Future<ListStageSessionsResult> listStageSessionsAsync(ListStageSessionsRequest request) {

        return listStageSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStageSessionsResult> listStageSessionsAsync(final ListStageSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStageSessionsRequest, ListStageSessionsResult> asyncHandler) {
        final ListStageSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStageSessionsResult>() {
            @Override
            public ListStageSessionsResult call() throws Exception {
                ListStageSessionsResult result = null;

                try {
                    result = executeListStageSessions(finalRequest);
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
    public java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest request) {

        return listStagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStagesResult> listStagesAsync(final ListStagesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStagesRequest, ListStagesResult> asyncHandler) {
        final ListStagesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStagesResult>() {
            @Override
            public ListStagesResult call() throws Exception {
                ListStagesResult result = null;

                try {
                    result = executeListStages(finalRequest);
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
    public java.util.concurrent.Future<ListStorageConfigurationsResult> listStorageConfigurationsAsync(ListStorageConfigurationsRequest request) {

        return listStorageConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStorageConfigurationsResult> listStorageConfigurationsAsync(final ListStorageConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStorageConfigurationsRequest, ListStorageConfigurationsResult> asyncHandler) {
        final ListStorageConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStorageConfigurationsResult>() {
            @Override
            public ListStorageConfigurationsResult call() throws Exception {
                ListStorageConfigurationsResult result = null;

                try {
                    result = executeListStorageConfigurations(finalRequest);
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
    public java.util.concurrent.Future<StartCompositionResult> startCompositionAsync(StartCompositionRequest request) {

        return startCompositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartCompositionResult> startCompositionAsync(final StartCompositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartCompositionRequest, StartCompositionResult> asyncHandler) {
        final StartCompositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartCompositionResult>() {
            @Override
            public StartCompositionResult call() throws Exception {
                StartCompositionResult result = null;

                try {
                    result = executeStartComposition(finalRequest);
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
    public java.util.concurrent.Future<StopCompositionResult> stopCompositionAsync(StopCompositionRequest request) {

        return stopCompositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopCompositionResult> stopCompositionAsync(final StopCompositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopCompositionRequest, StopCompositionResult> asyncHandler) {
        final StopCompositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopCompositionResult>() {
            @Override
            public StopCompositionResult call() throws Exception {
                StopCompositionResult result = null;

                try {
                    result = executeStopComposition(finalRequest);
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
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest request) {

        return updateStageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStageResult> updateStageAsync(final UpdateStageRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler) {
        final UpdateStageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStageResult>() {
            @Override
            public UpdateStageResult call() throws Exception {
                UpdateStageResult result = null;

                try {
                    result = executeUpdateStage(finalRequest);
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
