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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.ivsrealtime.AmazonIVSRealTimeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.ivsrealtime.model.*;

import com.amazonaws.services.ivsrealtime.model.transform.*;

/**
 * Client for accessing ivsrealtime. All service calls made using this client are blocking, and will not return until
 * the service call completes.
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
public class AmazonIVSRealTimeClient extends AmazonWebServiceClient implements AmazonIVSRealTime {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonIVSRealTime.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ivs";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivsrealtime.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PendingVerification").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivsrealtime.model.transform.PendingVerificationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivsrealtime.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivsrealtime.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivsrealtime.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivsrealtime.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.ivsrealtime.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.ivsrealtime.model.AmazonIVSRealTimeException.class));

    public static AmazonIVSRealTimeClientBuilder builder() {
        return AmazonIVSRealTimeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on ivsrealtime using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonIVSRealTimeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on ivsrealtime using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonIVSRealTimeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("ivsrealtime.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/ivsrealtime/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/ivsrealtime/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an EncoderConfiguration object.
     * </p>
     * 
     * @param createEncoderConfigurationRequest
     * @return Result of the CreateEncoderConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEncoderConfigurationResult createEncoderConfiguration(CreateEncoderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEncoderConfiguration(request);
    }

    @SdkInternalApi
    final CreateEncoderConfigurationResult executeCreateEncoderConfiguration(CreateEncoderConfigurationRequest createEncoderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createEncoderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEncoderConfigurationRequest> request = null;
        Response<CreateEncoderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEncoderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createEncoderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEncoderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEncoderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateEncoderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an additional token for a specified stage. This can be done after stage creation or when tokens expire.
     * Tokens always are scoped to the stage for which they are created.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS and never used directly by your application.
     * </p>
     * 
     * @param createParticipantTokenRequest
     * @return Result of the CreateParticipantToken operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateParticipantToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateParticipantToken"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateParticipantTokenResult createParticipantToken(CreateParticipantTokenRequest request) {
        request = beforeClientExecution(request);
        return executeCreateParticipantToken(request);
    }

    @SdkInternalApi
    final CreateParticipantTokenResult executeCreateParticipantToken(CreateParticipantTokenRequest createParticipantTokenRequest) {

        ExecutionContext executionContext = createExecutionContext(createParticipantTokenRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateParticipantTokenRequest> request = null;
        Response<CreateParticipantTokenResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateParticipantTokenRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createParticipantTokenRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateParticipantToken");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateParticipantTokenResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateParticipantTokenResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new stage (and optionally participant tokens).
     * </p>
     * 
     * @param createStageRequest
     * @return Result of the CreateStage operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStageResult createStage(CreateStageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStage(request);
    }

    @SdkInternalApi
    final CreateStageResult executeCreateStage(CreateStageRequest createStageRequest) {

        ExecutionContext executionContext = createExecutionContext(createStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStageRequest> request = null;
        Response<CreateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new storage configuration, used to enable recording to Amazon S3. When a StorageConfiguration is
     * created, IVS will modify the S3 bucketPolicy of the provided bucket. This will ensure that IVS has sufficient
     * permissions to write content to the provided bucket.
     * </p>
     * 
     * @param createStorageConfigurationRequest
     * @return Result of the CreateStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStorageConfigurationResult createStorageConfiguration(CreateStorageConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStorageConfiguration(request);
    }

    @SdkInternalApi
    final CreateStorageConfigurationResult executeCreateStorageConfiguration(CreateStorageConfigurationRequest createStorageConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(createStorageConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorageConfigurationRequest> request = null;
        Response<CreateStorageConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorageConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createStorageConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStorageConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStorageConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateStorageConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an EncoderConfiguration resource. Ensures that no Compositions are using this template; otherwise,
     * returns an error.
     * </p>
     * 
     * @param deleteEncoderConfigurationRequest
     * @return Result of the DeleteEncoderConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.DeleteEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEncoderConfigurationResult deleteEncoderConfiguration(DeleteEncoderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEncoderConfiguration(request);
    }

    @SdkInternalApi
    final DeleteEncoderConfigurationResult executeDeleteEncoderConfiguration(DeleteEncoderConfigurationRequest deleteEncoderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEncoderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEncoderConfigurationRequest> request = null;
        Response<DeleteEncoderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEncoderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteEncoderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEncoderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEncoderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteEncoderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Shuts down and deletes the specified stage (disconnecting all participants).
     * </p>
     * 
     * @param deleteStageRequest
     * @return Result of the DeleteStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStageResult deleteStage(DeleteStageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStage(request);
    }

    @SdkInternalApi
    final DeleteStageResult executeDeleteStage(DeleteStageRequest deleteStageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStageRequest> request = null;
        Response<DeleteStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the storage configuration for the specified ARN.
     * </p>
     * <p>
     * If you try to delete a storage configuration that is used by a Composition, you will get an error (409
     * ConflictException). To avoid this, for all Compositions that reference the storage configuration, first use
     * <a>StopComposition</a> and wait for it to complete, then use DeleteStorageConfiguration.
     * </p>
     * 
     * @param deleteStorageConfigurationRequest
     * @return Result of the DeleteStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.DeleteStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStorageConfigurationResult deleteStorageConfiguration(DeleteStorageConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageConfiguration(request);
    }

    @SdkInternalApi
    final DeleteStorageConfigurationResult executeDeleteStorageConfiguration(DeleteStorageConfigurationRequest deleteStorageConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageConfigurationRequest> request = null;
        Response<DeleteStorageConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteStorageConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStorageConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteStorageConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disconnects a specified participant and revokes the participant permanently from a specified stage.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return Result of the DisconnectParticipant operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisconnectParticipantResult disconnectParticipant(DisconnectParticipantRequest request) {
        request = beforeClientExecution(request);
        return executeDisconnectParticipant(request);
    }

    @SdkInternalApi
    final DisconnectParticipantResult executeDisconnectParticipant(DisconnectParticipantRequest disconnectParticipantRequest) {

        ExecutionContext executionContext = createExecutionContext(disconnectParticipantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisconnectParticipantRequest> request = null;
        Response<DisconnectParticipantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisconnectParticipantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disconnectParticipantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisconnectParticipant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisconnectParticipantResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DisconnectParticipantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about the specified Composition resource.
     * </p>
     * 
     * @param getCompositionRequest
     * @return Result of the GetComposition operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.GetComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetComposition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCompositionResult getComposition(GetCompositionRequest request) {
        request = beforeClientExecution(request);
        return executeGetComposition(request);
    }

    @SdkInternalApi
    final GetCompositionResult executeGetComposition(GetCompositionRequest getCompositionRequest) {

        ExecutionContext executionContext = createExecutionContext(getCompositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCompositionRequest> request = null;
        Response<GetCompositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCompositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCompositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetComposition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCompositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCompositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified EncoderConfiguration resource.
     * </p>
     * 
     * @param getEncoderConfigurationRequest
     * @return Result of the GetEncoderConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.GetEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetEncoderConfigurationResult getEncoderConfiguration(GetEncoderConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetEncoderConfiguration(request);
    }

    @SdkInternalApi
    final GetEncoderConfigurationResult executeGetEncoderConfiguration(GetEncoderConfigurationRequest getEncoderConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getEncoderConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEncoderConfigurationRequest> request = null;
        Response<GetEncoderConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEncoderConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getEncoderConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEncoderConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEncoderConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetEncoderConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified participant token.
     * </p>
     * 
     * @param getParticipantRequest
     * @return Result of the GetParticipant operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetParticipant" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetParticipantResult getParticipant(GetParticipantRequest request) {
        request = beforeClientExecution(request);
        return executeGetParticipant(request);
    }

    @SdkInternalApi
    final GetParticipantResult executeGetParticipant(GetParticipantRequest getParticipantRequest) {

        ExecutionContext executionContext = createExecutionContext(getParticipantRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParticipantRequest> request = null;
        Response<GetParticipantResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParticipantRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getParticipantRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetParticipant");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetParticipantResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetParticipantResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information for the specified stage.
     * </p>
     * 
     * @param getStageRequest
     * @return Result of the GetStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStageResult getStage(GetStageRequest request) {
        request = beforeClientExecution(request);
        return executeGetStage(request);
    }

    @SdkInternalApi
    final GetStageResult executeGetStage(GetStageRequest getStageRequest) {

        ExecutionContext executionContext = createExecutionContext(getStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStageRequest> request = null;
        Response<GetStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStageResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information for the specified stage session.
     * </p>
     * 
     * @param getStageSessionRequest
     * @return Result of the GetStageSession operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetStageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStageSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetStageSessionResult getStageSession(GetStageSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetStageSession(request);
    }

    @SdkInternalApi
    final GetStageSessionResult executeGetStageSession(GetStageSessionRequest getStageSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getStageSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStageSessionRequest> request = null;
        Response<GetStageSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStageSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStageSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStageSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStageSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStageSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the storage configuration for the specified ARN.
     * </p>
     * 
     * @param getStorageConfigurationRequest
     * @return Result of the GetStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.GetStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStorageConfigurationResult getStorageConfiguration(GetStorageConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeGetStorageConfiguration(request);
    }

    @SdkInternalApi
    final GetStorageConfigurationResult executeGetStorageConfiguration(GetStorageConfigurationRequest getStorageConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(getStorageConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStorageConfigurationRequest> request = null;
        Response<GetStorageConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStorageConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getStorageConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStorageConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStorageConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetStorageConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all Compositions in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listCompositionsRequest
     * @return Result of the ListCompositions operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListCompositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListCompositions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListCompositionsResult listCompositions(ListCompositionsRequest request) {
        request = beforeClientExecution(request);
        return executeListCompositions(request);
    }

    @SdkInternalApi
    final ListCompositionsResult executeListCompositions(ListCompositionsRequest listCompositionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCompositionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCompositionsRequest> request = null;
        Response<ListCompositionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCompositionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCompositionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCompositions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCompositionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCompositionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all EncoderConfigurations in your account, in the AWS region where the API request
     * is processed.
     * </p>
     * 
     * @param listEncoderConfigurationsRequest
     * @return Result of the ListEncoderConfigurations operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListEncoderConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListEncoderConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEncoderConfigurationsResult listEncoderConfigurations(ListEncoderConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListEncoderConfigurations(request);
    }

    @SdkInternalApi
    final ListEncoderConfigurationsResult executeListEncoderConfigurations(ListEncoderConfigurationsRequest listEncoderConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEncoderConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEncoderConfigurationsRequest> request = null;
        Response<ListEncoderConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEncoderConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listEncoderConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEncoderConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEncoderConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEncoderConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists events for a specified participant that occurred during a specified stage session.
     * </p>
     * 
     * @param listParticipantEventsRequest
     * @return Result of the ListParticipantEvents operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListParticipantEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipantEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListParticipantEventsResult listParticipantEvents(ListParticipantEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListParticipantEvents(request);
    }

    @SdkInternalApi
    final ListParticipantEventsResult executeListParticipantEvents(ListParticipantEventsRequest listParticipantEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listParticipantEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListParticipantEventsRequest> request = null;
        Response<ListParticipantEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListParticipantEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listParticipantEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListParticipantEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListParticipantEventsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListParticipantEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all participants in a specified stage session.
     * </p>
     * 
     * @param listParticipantsRequest
     * @return Result of the ListParticipants operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListParticipants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipants" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListParticipantsResult listParticipants(ListParticipantsRequest request) {
        request = beforeClientExecution(request);
        return executeListParticipants(request);
    }

    @SdkInternalApi
    final ListParticipantsResult executeListParticipants(ListParticipantsRequest listParticipantsRequest) {

        ExecutionContext executionContext = createExecutionContext(listParticipantsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListParticipantsRequest> request = null;
        Response<ListParticipantsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListParticipantsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listParticipantsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListParticipants");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListParticipantsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListParticipantsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets all sessions for a specified stage.
     * </p>
     * 
     * @param listStageSessionsRequest
     * @return Result of the ListStageSessions operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListStageSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStageSessions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStageSessionsResult listStageSessions(ListStageSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeListStageSessions(request);
    }

    @SdkInternalApi
    final ListStageSessionsResult executeListStageSessions(ListStageSessionsRequest listStageSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStageSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStageSessionsRequest> request = null;
        Response<ListStageSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStageSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStageSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStageSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStageSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStageSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all stages in your account, in the AWS region where the API request is processed.
     * </p>
     * 
     * @param listStagesRequest
     * @return Result of the ListStages operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStagesResult listStages(ListStagesRequest request) {
        request = beforeClientExecution(request);
        return executeListStages(request);
    }

    @SdkInternalApi
    final ListStagesResult executeListStages(ListStagesRequest listStagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStagesRequest> request = null;
        Response<ListStagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStagesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets summary information about all storage configurations in your account, in the AWS region where the API
     * request is processed.
     * </p>
     * 
     * @param listStorageConfigurationsRequest
     * @return Result of the ListStorageConfigurations operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListStorageConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStorageConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStorageConfigurationsResult listStorageConfigurations(ListStorageConfigurationsRequest request) {
        request = beforeClientExecution(request);
        return executeListStorageConfigurations(request);
    }

    @SdkInternalApi
    final ListStorageConfigurationsResult executeListStorageConfigurations(ListStorageConfigurationsRequest listStorageConfigurationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStorageConfigurationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStorageConfigurationsRequest> request = null;
        Response<ListStorageConfigurationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStorageConfigurationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listStorageConfigurationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStorageConfigurations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStorageConfigurationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListStorageConfigurationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a Composition from a stage based on the configuration provided in the request.
     * </p>
     * <p>
     * A Composition is an ephemeral resource that exists after this endpoint returns successfully. Composition stops
     * and the resource is deleted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <a>StopComposition</a> is called.
     * </p>
     * </li>
     * <li>
     * <p>
     * After a 1-minute timeout, when all participants are disconnected from the stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * After a 1-minute timeout, if there are no participants in the stage when StartComposition is called.
     * </p>
     * </li>
     * <li>
     * <p>
     * When broadcasting to the IVS channel fails and all retries are exhausted.
     * </p>
     * </li>
     * <li>
     * <p>
     * When broadcasting is disconnected and all attempts to reconnect are exhausted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startCompositionRequest
     * @return Result of the StartComposition operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.StartComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StartComposition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartCompositionResult startComposition(StartCompositionRequest request) {
        request = beforeClientExecution(request);
        return executeStartComposition(request);
    }

    @SdkInternalApi
    final StartCompositionResult executeStartComposition(StartCompositionRequest startCompositionRequest) {

        ExecutionContext executionContext = createExecutionContext(startCompositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartCompositionRequest> request = null;
        Response<StartCompositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartCompositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startCompositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartComposition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartCompositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartCompositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops and deletes a Composition resource. Any broadcast from the Composition resource is stopped.
     * </p>
     * 
     * @param stopCompositionRequest
     * @return Result of the StopComposition operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.StopComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StopComposition" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopCompositionResult stopComposition(StopCompositionRequest request) {
        request = beforeClientExecution(request);
        return executeStopComposition(request);
    }

    @SdkInternalApi
    final StopCompositionResult executeStopComposition(StopCompositionRequest stopCompositionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopCompositionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopCompositionRequest> request = null;
        Response<StopCompositionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopCompositionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopCompositionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopComposition");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopCompositionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopCompositionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a stage’s configuration.
     * </p>
     * 
     * @param updateStageRequest
     * @return Result of the UpdateStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStageResult updateStage(UpdateStageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStage(request);
    }

    @SdkInternalApi
    final UpdateStageResult executeUpdateStage(UpdateStageRequest updateStageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStageRequest> request = null;
        Response<UpdateStageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "IVS RealTime");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
