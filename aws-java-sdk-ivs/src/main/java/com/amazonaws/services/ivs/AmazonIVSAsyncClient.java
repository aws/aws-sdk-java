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
package com.amazonaws.services.ivs;

import javax.annotation.Generated;

import com.amazonaws.services.ivs.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon IVS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon Interactive Video Service (IVS) API is REST compatible, using a standard HTTP API and an AWS EventBridge
 * event stream for responses. JSON is used for both requests and responses, including errors.
 * </p>
 * <p>
 * The API is an AWS regional service, currently in these regions: us-west-2, us-east-1, and eu-west-1.
 * </p>
 * <p>
 * <i> <b>All API request parameters and URLs are case sensitive. </b> </i>
 * </p>
 * <p>
 * For a summary of notable documentation changes in each release, see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/doc-history.html"> Document History</a>.
 * </p>
 * <p>
 * <b>Service Endpoints</b>
 * </p>
 * <p>
 * The following are the Amazon IVS service endpoints (all HTTPS):
 * </p>
 * <p>
 * Region name: US West (Oregon)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>us-west-2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.us-west-2.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Region name: US East (Virginia)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>us-east-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.us-east-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Region name: EU West (Dublin)
 * </p>
 * <ul>
 * <li>
 * <p>
 * Region: <code>eu-west-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Endpoint: <code>ivs.eu-west-1.amazonaws.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Allowed Header Values</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <b>Accept:</b> </code> application/json
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Accept-Encoding:</b> </code> gzip, deflate
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Content-Type:</b> </code>application/json
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/getting-started.html"> Getting Started with Amazon IVS</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * Channel — Stores configuration data related to your live stream. You first create a channel and then use the
 * channel’s stream key to start your live stream. See the Channel endpoints for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * Stream key — An identifier assigned by Amazon IVS when you create a channel, which is then used to authorize
 * streaming. See the StreamKey endpoints for more information. <i> <b>Treat the stream key like a secret, since it
 * allows anyone to stream to the channel.</b> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * Playback key pair — Video playback may be restricted using playback-authorization tokens, which use public-key
 * encryption. A playback key pair is the public-private pair of keys used to sign and validate the
 * playback-authorization token. See the PlaybackKeyPair endpoints for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * Recording configuration — Stores configuration related to recording a live stream and where to store the recorded
 * content. Multiple channels can reference the same recording configuration. See the Recording Configuration endpoints
 * for more information.
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
 * information, including restrictions that apply to tags.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html"> Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resources support tagging: Channels, Stream Keys, Playback Key Pairs, and
 * Recording Configurations.
 * </p>
 * <p>
 * <b>Authentication versus Authorization</b>
 * </p>
 * <p>
 * Note the differences between these concepts:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Authentication</i> is about verifying identity. You need to be authenticated to sign Amazon IVS API requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Authorization</i> is about granting permissions. You need to be authorized to view <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Amazon IVS private channels</a>.
 * (Private channels are channels that are enabled for "playback authorization.")
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Authentication</b>
 * </p>
 * <p>
 * All Amazon IVS API requests must be authenticated with a signature. The AWS Command-Line Interface (CLI) and Amazon
 * IVS Player SDKs take care of signing the underlying API calls for you. However, if your application calls the Amazon
 * IVS API directly, it’s your responsibility to sign the requests.
 * </p>
 * <p>
 * You generate a signature using valid AWS credentials that have permission to perform the requested action. For
 * example, you must sign PutMetadata requests with a signature generated from an IAM user account that has the
 * <code>ivs:PutMetadata</code> permission.
 * </p>
 * <p>
 * For more information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Authentication and generating signatures — See <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating Requests
 * (AWS Signature Version 4)</a> in the <i>AWS General Reference</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Managing Amazon IVS permissions — See <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/security-iam.html">Identity and Access Management</a> on the
 * Security page of the <i>Amazon IVS User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Channel Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateChannel</a> — Creates a new channel and an associated stream key to start streaming.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetChannel</a> — Gets the channel configuration for the specified channel ARN (Amazon Resource Name).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetChannel</a> — Performs <a>GetChannel</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListChannels</a> — Gets summary information about all channels in your account, in the AWS region where the API
 * request is processed. This list can be filtered to match a specified name or recording-configuration ARN. Filters are
 * mutually exclusive and cannot be used together. If you try to use both filters, you will get an error (409 Conflict
 * Exception).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateChannel</a> — Updates a channel's configuration. This does not affect an ongoing stream of this channel. You
 * must stop and restart the stream for the changes to take effect.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteChannel</a> — Deletes the specified channel.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>StreamKey Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStreamKey</a> — Creates a stream key, used to initiate a stream, for the specified channel ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStreamKey</a> — Gets stream key information for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetStreamKey</a> — Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreamKeys</a> — Gets summary information about stream keys for the specified channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStreamKey</a> — Deletes the stream key for the specified ARN, so it can no longer be used to stream.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Stream Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetStream</a> — Gets information about the active (live) stream on a specified channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreams</a> — Gets summary information about live streams in your account, in the AWS region where the API
 * request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopStream</a> — Disconnects the incoming RTMPS stream for the specified channel. Can be used in conjunction with
 * <a>DeleteStreamKey</a> to prevent further streaming to a channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutMetadata</a> — Inserts metadata into the active stream of the specified channel. A maximum of 5 requests per
 * second per channel is allowed, each with a maximum 1 KB payload. (If 5 TPS is not sufficient for your needs, we
 * recommend batching your data into a single PutMetadata call.)
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>PlaybackKeyPair Endpoints</b>
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/ivs/latest/userguide/private-channels.html">Setting Up
 * Private Channels</a> in the <i>Amazon IVS User Guide</i>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ImportPlaybackKeyPair</a> — Imports the public portion of a new key pair and returns its <code>arn</code> and
 * <code>fingerprint</code>. The <code>privateKey</code> can then be used to generate viewer authorization tokens, to
 * grant viewers access to private channels (channels enabled for playback authorization).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetPlaybackKeyPair</a> — Gets a specified playback authorization key pair and returns the <code>arn</code> and
 * <code>fingerprint</code>. The <code>privateKey</code> held by the caller can be used to generate viewer authorization
 * tokens, to grant viewers access to private channels.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListPlaybackKeyPairs</a> — Gets summary information about playback key pairs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeletePlaybackKeyPair</a> — Deletes a specified authorization key pair. This invalidates future viewer tokens
 * generated using the key pair’s <code>privateKey</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>RecordingConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateRecordingConfiguration</a> — Creates a new recording configuration, used to enable recording to Amazon S3.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRecordingConfiguration</a> — Gets the recording-configuration metadata for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRecordingConfigurations</a> — Gets summary information about all recording configurations in your account, in
 * the AWS region where the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRecordingConfiguration</a> — Deletes the recording configuration for the specified ARN.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>AWS Tags Endpoints</b>
 * </p>
 * <ul>
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
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonIVSAsyncClient extends AmazonIVSClient implements AmazonIVSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonIVSAsyncClientBuilder asyncBuilder() {
        return AmazonIVSAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon IVS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonIVSAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon IVS using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonIVSAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(BatchGetChannelRequest request) {

        return batchGetChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(final BatchGetChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetChannelRequest, BatchGetChannelResult> asyncHandler) {
        final BatchGetChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetChannelResult>() {
            @Override
            public BatchGetChannelResult call() throws Exception {
                BatchGetChannelResult result = null;

                try {
                    result = executeBatchGetChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(BatchGetStreamKeyRequest request) {

        return batchGetStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(final BatchGetStreamKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetStreamKeyRequest, BatchGetStreamKeyResult> asyncHandler) {
        final BatchGetStreamKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetStreamKeyResult>() {
            @Override
            public BatchGetStreamKeyResult call() throws Exception {
                BatchGetStreamKeyResult result = null;

                try {
                    result = executeBatchGetStreamKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateRecordingConfigurationResult> createRecordingConfigurationAsync(CreateRecordingConfigurationRequest request) {

        return createRecordingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRecordingConfigurationResult> createRecordingConfigurationAsync(final CreateRecordingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRecordingConfigurationRequest, CreateRecordingConfigurationResult> asyncHandler) {
        final CreateRecordingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRecordingConfigurationResult>() {
            @Override
            public CreateRecordingConfigurationResult call() throws Exception {
                CreateRecordingConfigurationResult result = null;

                try {
                    result = executeCreateRecordingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(CreateStreamKeyRequest request) {

        return createStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(final CreateStreamKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamKeyRequest, CreateStreamKeyResult> asyncHandler) {
        final CreateStreamKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateStreamKeyResult>() {
            @Override
            public CreateStreamKeyResult call() throws Exception {
                CreateStreamKeyResult result = null;

                try {
                    result = executeCreateStreamKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeletePlaybackKeyPairResult> deletePlaybackKeyPairAsync(DeletePlaybackKeyPairRequest request) {

        return deletePlaybackKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlaybackKeyPairResult> deletePlaybackKeyPairAsync(final DeletePlaybackKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlaybackKeyPairRequest, DeletePlaybackKeyPairResult> asyncHandler) {
        final DeletePlaybackKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlaybackKeyPairResult>() {
            @Override
            public DeletePlaybackKeyPairResult call() throws Exception {
                DeletePlaybackKeyPairResult result = null;

                try {
                    result = executeDeletePlaybackKeyPair(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteRecordingConfigurationResult> deleteRecordingConfigurationAsync(DeleteRecordingConfigurationRequest request) {

        return deleteRecordingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecordingConfigurationResult> deleteRecordingConfigurationAsync(final DeleteRecordingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecordingConfigurationRequest, DeleteRecordingConfigurationResult> asyncHandler) {
        final DeleteRecordingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecordingConfigurationResult>() {
            @Override
            public DeleteRecordingConfigurationResult call() throws Exception {
                DeleteRecordingConfigurationResult result = null;

                try {
                    result = executeDeleteRecordingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(DeleteStreamKeyRequest request) {

        return deleteStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(final DeleteStreamKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamKeyRequest, DeleteStreamKeyResult> asyncHandler) {
        final DeleteStreamKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteStreamKeyResult>() {
            @Override
            public DeleteStreamKeyResult call() throws Exception {
                DeleteStreamKeyResult result = null;

                try {
                    result = executeDeleteStreamKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest request) {

        return getChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(final GetChannelRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler) {
        final GetChannelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetChannelResult>() {
            @Override
            public GetChannelResult call() throws Exception {
                GetChannelResult result = null;

                try {
                    result = executeGetChannel(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetPlaybackKeyPairResult> getPlaybackKeyPairAsync(GetPlaybackKeyPairRequest request) {

        return getPlaybackKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlaybackKeyPairResult> getPlaybackKeyPairAsync(final GetPlaybackKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPlaybackKeyPairRequest, GetPlaybackKeyPairResult> asyncHandler) {
        final GetPlaybackKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPlaybackKeyPairResult>() {
            @Override
            public GetPlaybackKeyPairResult call() throws Exception {
                GetPlaybackKeyPairResult result = null;

                try {
                    result = executeGetPlaybackKeyPair(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetRecordingConfigurationResult> getRecordingConfigurationAsync(GetRecordingConfigurationRequest request) {

        return getRecordingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordingConfigurationResult> getRecordingConfigurationAsync(final GetRecordingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecordingConfigurationRequest, GetRecordingConfigurationResult> asyncHandler) {
        final GetRecordingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecordingConfigurationResult>() {
            @Override
            public GetRecordingConfigurationResult call() throws Exception {
                GetRecordingConfigurationResult result = null;

                try {
                    result = executeGetRecordingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetStreamResult> getStreamAsync(GetStreamRequest request) {

        return getStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamResult> getStreamAsync(final GetStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamRequest, GetStreamResult> asyncHandler) {
        final GetStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamResult>() {
            @Override
            public GetStreamResult call() throws Exception {
                GetStreamResult result = null;

                try {
                    result = executeGetStream(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(GetStreamKeyRequest request) {

        return getStreamKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(final GetStreamKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetStreamKeyRequest, GetStreamKeyResult> asyncHandler) {
        final GetStreamKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetStreamKeyResult>() {
            @Override
            public GetStreamKeyResult call() throws Exception {
                GetStreamKeyResult result = null;

                try {
                    result = executeGetStreamKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ImportPlaybackKeyPairResult> importPlaybackKeyPairAsync(ImportPlaybackKeyPairRequest request) {

        return importPlaybackKeyPairAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportPlaybackKeyPairResult> importPlaybackKeyPairAsync(final ImportPlaybackKeyPairRequest request,
            final com.amazonaws.handlers.AsyncHandler<ImportPlaybackKeyPairRequest, ImportPlaybackKeyPairResult> asyncHandler) {
        final ImportPlaybackKeyPairRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ImportPlaybackKeyPairResult>() {
            @Override
            public ImportPlaybackKeyPairResult call() throws Exception {
                ImportPlaybackKeyPairResult result = null;

                try {
                    result = executeImportPlaybackKeyPair(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListPlaybackKeyPairsResult> listPlaybackKeyPairsAsync(ListPlaybackKeyPairsRequest request) {

        return listPlaybackKeyPairsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlaybackKeyPairsResult> listPlaybackKeyPairsAsync(final ListPlaybackKeyPairsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlaybackKeyPairsRequest, ListPlaybackKeyPairsResult> asyncHandler) {
        final ListPlaybackKeyPairsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPlaybackKeyPairsResult>() {
            @Override
            public ListPlaybackKeyPairsResult call() throws Exception {
                ListPlaybackKeyPairsResult result = null;

                try {
                    result = executeListPlaybackKeyPairs(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListRecordingConfigurationsResult> listRecordingConfigurationsAsync(ListRecordingConfigurationsRequest request) {

        return listRecordingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecordingConfigurationsResult> listRecordingConfigurationsAsync(final ListRecordingConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecordingConfigurationsRequest, ListRecordingConfigurationsResult> asyncHandler) {
        final ListRecordingConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecordingConfigurationsResult>() {
            @Override
            public ListRecordingConfigurationsResult call() throws Exception {
                ListRecordingConfigurationsResult result = null;

                try {
                    result = executeListRecordingConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(ListStreamKeysRequest request) {

        return listStreamKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(final ListStreamKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamKeysRequest, ListStreamKeysResult> asyncHandler) {
        final ListStreamKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamKeysResult>() {
            @Override
            public ListStreamKeysResult call() throws Exception {
                ListStreamKeysResult result = null;

                try {
                    result = executeListStreamKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(final ListStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {
        final ListStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStreamsResult>() {
            @Override
            public ListStreamsResult call() throws Exception {
                ListStreamsResult result = null;

                try {
                    result = executeListStreams(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(PutMetadataRequest request) {

        return putMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(final PutMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMetadataRequest, PutMetadataResult> asyncHandler) {
        final PutMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutMetadataResult>() {
            @Override
            public PutMetadataResult call() throws Exception {
                PutMetadataResult result = null;

                try {
                    result = executePutMetadata(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
    public java.util.concurrent.Future<StopStreamResult> stopStreamAsync(StopStreamRequest request) {

        return stopStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopStreamResult> stopStreamAsync(final StopStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopStreamRequest, StopStreamResult> asyncHandler) {
        final StopStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopStreamResult>() {
            @Override
            public StopStreamResult call() throws Exception {
                StopStreamResult result = null;

                try {
                    result = executeStopStream(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
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
