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
package com.amazonaws.services.nimblestudio;

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

import com.amazonaws.services.nimblestudio.AmazonNimbleStudioClientBuilder;
import com.amazonaws.services.nimblestudio.waiters.AmazonNimbleStudioWaiters;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.services.nimblestudio.model.transform.*;

/**
 * Client for accessing AmazonNimbleStudio. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Welcome to the Amazon Nimble Studio API reference. This API reference provides methods, schema, resources,
 * parameters, and more to help you get the most out of Nimble Studio.
 * </p>
 * <p>
 * Nimble Studio is a virtual studio that empowers visual effects, animation, and interactive content teams to create
 * content securely within a scalable, private cloud service.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonNimbleStudioClient extends AmazonWebServiceClient implements AmazonNimbleStudio {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonNimbleStudio.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "nimble";

    private volatile AmazonNimbleStudioWaiters waiters;

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
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.nimblestudio.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.nimblestudio.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.nimblestudio.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.nimblestudio.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.nimblestudio.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.nimblestudio.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.nimblestudio.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.nimblestudio.model.AmazonNimbleStudioException.class));

    public static AmazonNimbleStudioClientBuilder builder() {
        return AmazonNimbleStudioClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AmazonNimbleStudio using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonNimbleStudioClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AmazonNimbleStudio using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonNimbleStudioClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("nimble.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/nimblestudio/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/nimblestudio/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accept EULAs.
     * </p>
     * 
     * @param acceptEulasRequest
     * @return Result of the AcceptEulas operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.AcceptEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/AcceptEulas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AcceptEulasResult acceptEulas(AcceptEulasRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptEulas(request);
    }

    @SdkInternalApi
    final AcceptEulasResult executeAcceptEulas(AcceptEulasRequest acceptEulasRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptEulasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptEulasRequest> request = null;
        Response<AcceptEulasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptEulasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptEulasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptEulas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptEulasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptEulasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a launch profile.
     * </p>
     * 
     * @param createLaunchProfileRequest
     * @return Result of the CreateLaunchProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.CreateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLaunchProfileResult createLaunchProfile(CreateLaunchProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLaunchProfile(request);
    }

    @SdkInternalApi
    final CreateLaunchProfileResult executeCreateLaunchProfile(CreateLaunchProfileRequest createLaunchProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createLaunchProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLaunchProfileRequest> request = null;
        Response<CreateLaunchProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLaunchProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLaunchProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLaunchProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLaunchProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLaunchProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a streaming image resource in a studio.
     * </p>
     * 
     * @param createStreamingImageRequest
     * @return Result of the CreateStreamingImage operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.CreateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateStreamingImageResult createStreamingImage(CreateStreamingImageRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamingImage(request);
    }

    @SdkInternalApi
    final CreateStreamingImageResult executeCreateStreamingImage(CreateStreamingImageRequest createStreamingImageRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamingImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingImageRequest> request = null;
        Response<CreateStreamingImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamingImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamingImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStreamingImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamingImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStreamingImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a streaming session in a studio.
     * </p>
     * <p>
     * After invoking this operation, you must poll GetStreamingSession until the streaming session is in the
     * <code>READY</code> state.
     * </p>
     * 
     * @param createStreamingSessionRequest
     * @return Result of the CreateStreamingSession operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.CreateStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateStreamingSessionResult createStreamingSession(CreateStreamingSessionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamingSession(request);
    }

    @SdkInternalApi
    final CreateStreamingSessionResult executeCreateStreamingSession(CreateStreamingSessionRequest createStreamingSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamingSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingSessionRequest> request = null;
        Response<CreateStreamingSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamingSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStreamingSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStreamingSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamingSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateStreamingSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a streaming session stream for a streaming session.
     * </p>
     * <p>
     * After invoking this API, invoke GetStreamingSessionStream with the returned streamId to poll the resource until
     * it is in the <code>READY</code> state.
     * </p>
     * 
     * @param createStreamingSessionStreamRequest
     * @return Result of the CreateStreamingSessionStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.CreateStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStreamingSessionStreamResult createStreamingSessionStream(CreateStreamingSessionStreamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStreamingSessionStream(request);
    }

    @SdkInternalApi
    final CreateStreamingSessionStreamResult executeCreateStreamingSessionStream(CreateStreamingSessionStreamRequest createStreamingSessionStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(createStreamingSessionStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStreamingSessionStreamRequest> request = null;
        Response<CreateStreamingSessionStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStreamingSessionStreamRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createStreamingSessionStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStreamingSessionStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStreamingSessionStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateStreamingSessionStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a new studio.
     * </p>
     * <p>
     * When creating a studio, two IAM roles must be provided: the admin role and the user role. These roles are assumed
     * by your users when they log in to the Nimble Studio portal.
     * </p>
     * <p>
     * The user role must have the <code>AmazonNimbleStudio-StudioUser</code> managed policy attached for the portal to
     * function properly.
     * </p>
     * <p>
     * The admin role must have the <code>AmazonNimbleStudio-StudioAdmin</code> managed policy attached for the portal
     * to function properly.
     * </p>
     * <p>
     * You may optionally specify a KMS key in the <code>StudioEncryptionConfiguration</code>.
     * </p>
     * <p>
     * In Nimble Studio, resource names, descriptions, initialization scripts, and other data you provide are always
     * encrypted at rest using an KMS key. By default, this key is owned by Amazon Web Services and managed on your
     * behalf. You may provide your own KMS key when calling <code>CreateStudio</code> to encrypt this data using a key
     * you own and manage.
     * </p>
     * <p>
     * When providing an KMS key during studio creation, Nimble Studio creates KMS grants in your account to provide
     * your studio user and admin roles access to these KMS keys.
     * </p>
     * <p>
     * If you delete this grant, the studio will no longer be accessible to your portal users.
     * </p>
     * <p>
     * If you delete the studio KMS key, your studio will no longer be accessible.
     * </p>
     * 
     * @param createStudioRequest
     * @return Result of the CreateStudio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.CreateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateStudioResult createStudio(CreateStudioRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStudio(request);
    }

    @SdkInternalApi
    final CreateStudioResult executeCreateStudio(CreateStudioRequest createStudioRequest) {

        ExecutionContext executionContext = createExecutionContext(createStudioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStudioRequest> request = null;
        Response<CreateStudioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStudioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStudioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStudio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStudioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateStudioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a studio component resource.
     * </p>
     * 
     * @param createStudioComponentRequest
     * @return Result of the CreateStudioComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.CreateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateStudioComponentResult createStudioComponent(CreateStudioComponentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStudioComponent(request);
    }

    @SdkInternalApi
    final CreateStudioComponentResult executeCreateStudioComponent(CreateStudioComponentRequest createStudioComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(createStudioComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStudioComponentRequest> request = null;
        Response<CreateStudioComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStudioComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createStudioComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStudioComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStudioComponentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateStudioComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently delete a launch profile.
     * </p>
     * 
     * @param deleteLaunchProfileRequest
     * @return Result of the DeleteLaunchProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.DeleteLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLaunchProfileResult deleteLaunchProfile(DeleteLaunchProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLaunchProfile(request);
    }

    @SdkInternalApi
    final DeleteLaunchProfileResult executeDeleteLaunchProfile(DeleteLaunchProfileRequest deleteLaunchProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLaunchProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLaunchProfileRequest> request = null;
        Response<DeleteLaunchProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLaunchProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLaunchProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLaunchProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLaunchProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLaunchProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a user from launch profile membership.
     * </p>
     * 
     * @param deleteLaunchProfileMemberRequest
     * @return Result of the DeleteLaunchProfileMember operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.DeleteLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteLaunchProfileMemberResult deleteLaunchProfileMember(DeleteLaunchProfileMemberRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLaunchProfileMember(request);
    }

    @SdkInternalApi
    final DeleteLaunchProfileMemberResult executeDeleteLaunchProfileMember(DeleteLaunchProfileMemberRequest deleteLaunchProfileMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLaunchProfileMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLaunchProfileMemberRequest> request = null;
        Response<DeleteLaunchProfileMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLaunchProfileMemberRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteLaunchProfileMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLaunchProfileMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLaunchProfileMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteLaunchProfileMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete streaming image.
     * </p>
     * 
     * @param deleteStreamingImageRequest
     * @return Result of the DeleteStreamingImage operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.DeleteStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteStreamingImageResult deleteStreamingImage(DeleteStreamingImageRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStreamingImage(request);
    }

    @SdkInternalApi
    final DeleteStreamingImageResult executeDeleteStreamingImage(DeleteStreamingImageRequest deleteStreamingImageRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamingImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamingImageRequest> request = null;
        Response<DeleteStreamingImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamingImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamingImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStreamingImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStreamingImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStreamingImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes streaming session resource.
     * </p>
     * <p>
     * After invoking this operation, use GetStreamingSession to poll the resource until it transitions to a
     * <code>DELETED</code> state.
     * </p>
     * <p>
     * A streaming session will count against your streaming session quota until it is marked <code>DELETED</code>.
     * </p>
     * 
     * @param deleteStreamingSessionRequest
     * @return Result of the DeleteStreamingSession operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.DeleteStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteStreamingSessionResult deleteStreamingSession(DeleteStreamingSessionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStreamingSession(request);
    }

    @SdkInternalApi
    final DeleteStreamingSessionResult executeDeleteStreamingSession(DeleteStreamingSessionRequest deleteStreamingSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStreamingSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStreamingSessionRequest> request = null;
        Response<DeleteStreamingSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStreamingSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStreamingSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStreamingSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStreamingSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteStreamingSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a studio resource.
     * </p>
     * 
     * @param deleteStudioRequest
     * @return Result of the DeleteStudio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.DeleteStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudio" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStudioResult deleteStudio(DeleteStudioRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStudio(request);
    }

    @SdkInternalApi
    final DeleteStudioResult executeDeleteStudio(DeleteStudioRequest deleteStudioRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStudioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStudioRequest> request = null;
        Response<DeleteStudioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStudioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStudioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStudio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStudioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStudioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a studio component resource.
     * </p>
     * 
     * @param deleteStudioComponentRequest
     * @return Result of the DeleteStudioComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.DeleteStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteStudioComponentResult deleteStudioComponent(DeleteStudioComponentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStudioComponent(request);
    }

    @SdkInternalApi
    final DeleteStudioComponentResult executeDeleteStudioComponent(DeleteStudioComponentRequest deleteStudioComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStudioComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStudioComponentRequest> request = null;
        Response<DeleteStudioComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStudioComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStudioComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStudioComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStudioComponentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteStudioComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a user from studio membership.
     * </p>
     * 
     * @param deleteStudioMemberRequest
     * @return Result of the DeleteStudioMember operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.DeleteStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteStudioMemberResult deleteStudioMember(DeleteStudioMemberRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStudioMember(request);
    }

    @SdkInternalApi
    final DeleteStudioMemberResult executeDeleteStudioMember(DeleteStudioMemberRequest deleteStudioMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStudioMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStudioMemberRequest> request = null;
        Response<DeleteStudioMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStudioMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteStudioMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStudioMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStudioMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteStudioMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get EULA.
     * </p>
     * 
     * @param getEulaRequest
     * @return Result of the GetEula operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetEula
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetEula" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetEulaResult getEula(GetEulaRequest request) {
        request = beforeClientExecution(request);
        return executeGetEula(request);
    }

    @SdkInternalApi
    final GetEulaResult executeGetEula(GetEulaRequest getEulaRequest) {

        ExecutionContext executionContext = createExecutionContext(getEulaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEulaRequest> request = null;
        Response<GetEulaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEulaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getEulaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetEula");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetEulaResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetEulaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a launch profile.
     * </p>
     * 
     * @param getLaunchProfileRequest
     * @return Result of the GetLaunchProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLaunchProfileResult getLaunchProfile(GetLaunchProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetLaunchProfile(request);
    }

    @SdkInternalApi
    final GetLaunchProfileResult executeGetLaunchProfile(GetLaunchProfileRequest getLaunchProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getLaunchProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLaunchProfileRequest> request = null;
        Response<GetLaunchProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLaunchProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLaunchProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLaunchProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLaunchProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLaunchProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Launch profile details include the launch profile resource and summary information of resources that are used by,
     * or available to, the launch profile. This includes the name and description of all studio components used by the
     * launch profiles, and the name and description of streaming images that can be used with this launch profile.
     * </p>
     * 
     * @param getLaunchProfileDetailsRequest
     * @return Result of the GetLaunchProfileDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetLaunchProfileDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileDetails" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLaunchProfileDetailsResult getLaunchProfileDetails(GetLaunchProfileDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLaunchProfileDetails(request);
    }

    @SdkInternalApi
    final GetLaunchProfileDetailsResult executeGetLaunchProfileDetails(GetLaunchProfileDetailsRequest getLaunchProfileDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLaunchProfileDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLaunchProfileDetailsRequest> request = null;
        Response<GetLaunchProfileDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLaunchProfileDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLaunchProfileDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLaunchProfileDetails");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLaunchProfileDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLaunchProfileDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a launch profile initialization.
     * </p>
     * 
     * @param getLaunchProfileInitializationRequest
     * @return Result of the GetLaunchProfileInitialization operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetLaunchProfileInitialization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileInitialization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLaunchProfileInitializationResult getLaunchProfileInitialization(GetLaunchProfileInitializationRequest request) {
        request = beforeClientExecution(request);
        return executeGetLaunchProfileInitialization(request);
    }

    @SdkInternalApi
    final GetLaunchProfileInitializationResult executeGetLaunchProfileInitialization(GetLaunchProfileInitializationRequest getLaunchProfileInitializationRequest) {

        ExecutionContext executionContext = createExecutionContext(getLaunchProfileInitializationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLaunchProfileInitializationRequest> request = null;
        Response<GetLaunchProfileInitializationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLaunchProfileInitializationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getLaunchProfileInitializationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLaunchProfileInitialization");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLaunchProfileInitializationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLaunchProfileInitializationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a user persona in launch profile membership.
     * </p>
     * 
     * @param getLaunchProfileMemberRequest
     * @return Result of the GetLaunchProfileMember operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetLaunchProfileMember" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetLaunchProfileMemberResult getLaunchProfileMember(GetLaunchProfileMemberRequest request) {
        request = beforeClientExecution(request);
        return executeGetLaunchProfileMember(request);
    }

    @SdkInternalApi
    final GetLaunchProfileMemberResult executeGetLaunchProfileMember(GetLaunchProfileMemberRequest getLaunchProfileMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(getLaunchProfileMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLaunchProfileMemberRequest> request = null;
        Response<GetLaunchProfileMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLaunchProfileMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLaunchProfileMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLaunchProfileMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLaunchProfileMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetLaunchProfileMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get streaming image.
     * </p>
     * 
     * @param getStreamingImageRequest
     * @return Result of the GetStreamingImage operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingImage" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStreamingImageResult getStreamingImage(GetStreamingImageRequest request) {
        request = beforeClientExecution(request);
        return executeGetStreamingImage(request);
    }

    @SdkInternalApi
    final GetStreamingImageResult executeGetStreamingImage(GetStreamingImageRequest getStreamingImageRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamingImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingImageRequest> request = null;
        Response<GetStreamingImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamingImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStreamingImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStreamingImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStreamingImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStreamingImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets StreamingSession resource.
     * </p>
     * <p>
     * Invoke this operation to poll for a streaming session state while creating or deleting a session.
     * </p>
     * 
     * @param getStreamingSessionRequest
     * @return Result of the GetStreamingSession operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStreamingSessionResult getStreamingSession(GetStreamingSessionRequest request) {
        request = beforeClientExecution(request);
        return executeGetStreamingSession(request);
    }

    @SdkInternalApi
    final GetStreamingSessionResult executeGetStreamingSession(GetStreamingSessionRequest getStreamingSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamingSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingSessionRequest> request = null;
        Response<GetStreamingSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamingSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStreamingSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStreamingSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStreamingSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStreamingSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets <code>StreamingSessionBackup</code> resource.
     * </p>
     * <p>
     * Invoke this operation to poll for a streaming session backup while stopping a streaming session.
     * </p>
     * 
     * @param getStreamingSessionBackupRequest
     * @return Result of the GetStreamingSessionBackup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @sample AmazonNimbleStudio.GetStreamingSessionBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSessionBackup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStreamingSessionBackupResult getStreamingSessionBackup(GetStreamingSessionBackupRequest request) {
        request = beforeClientExecution(request);
        return executeGetStreamingSessionBackup(request);
    }

    @SdkInternalApi
    final GetStreamingSessionBackupResult executeGetStreamingSessionBackup(GetStreamingSessionBackupRequest getStreamingSessionBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamingSessionBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingSessionBackupRequest> request = null;
        Response<GetStreamingSessionBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamingSessionBackupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getStreamingSessionBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStreamingSessionBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStreamingSessionBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetStreamingSessionBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a StreamingSessionStream for a streaming session.
     * </p>
     * <p>
     * Invoke this operation to poll the resource after invoking <code>CreateStreamingSessionStream</code>.
     * </p>
     * <p>
     * After the <code>StreamingSessionStream</code> changes to the <code>READY</code> state, the url property will
     * contain a stream to be used with the DCV streaming client.
     * </p>
     * 
     * @param getStreamingSessionStreamRequest
     * @return Result of the GetStreamingSessionStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetStreamingSessionStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStreamingSessionStream"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetStreamingSessionStreamResult getStreamingSessionStream(GetStreamingSessionStreamRequest request) {
        request = beforeClientExecution(request);
        return executeGetStreamingSessionStream(request);
    }

    @SdkInternalApi
    final GetStreamingSessionStreamResult executeGetStreamingSessionStream(GetStreamingSessionStreamRequest getStreamingSessionStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(getStreamingSessionStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStreamingSessionStreamRequest> request = null;
        Response<GetStreamingSessionStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStreamingSessionStreamRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getStreamingSessionStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStreamingSessionStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStreamingSessionStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetStreamingSessionStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a studio resource.
     * </p>
     * 
     * @param getStudioRequest
     * @return Result of the GetStudio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudio" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStudioResult getStudio(GetStudioRequest request) {
        request = beforeClientExecution(request);
        return executeGetStudio(request);
    }

    @SdkInternalApi
    final GetStudioResult executeGetStudio(GetStudioRequest getStudioRequest) {

        ExecutionContext executionContext = createExecutionContext(getStudioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStudioRequest> request = null;
        Response<GetStudioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStudioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStudioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStudio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStudioResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStudioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a studio component resource.
     * </p>
     * 
     * @param getStudioComponentRequest
     * @return Result of the GetStudioComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioComponent" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStudioComponentResult getStudioComponent(GetStudioComponentRequest request) {
        request = beforeClientExecution(request);
        return executeGetStudioComponent(request);
    }

    @SdkInternalApi
    final GetStudioComponentResult executeGetStudioComponent(GetStudioComponentRequest getStudioComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(getStudioComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStudioComponentRequest> request = null;
        Response<GetStudioComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStudioComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStudioComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStudioComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStudioComponentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStudioComponentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get a user's membership in a studio.
     * </p>
     * 
     * @param getStudioMemberRequest
     * @return Result of the GetStudioMember operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.GetStudioMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/GetStudioMember" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStudioMemberResult getStudioMember(GetStudioMemberRequest request) {
        request = beforeClientExecution(request);
        return executeGetStudioMember(request);
    }

    @SdkInternalApi
    final GetStudioMemberResult executeGetStudioMember(GetStudioMemberRequest getStudioMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(getStudioMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStudioMemberRequest> request = null;
        Response<GetStudioMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStudioMemberRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStudioMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetStudioMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStudioMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStudioMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List EULA acceptances.
     * </p>
     * 
     * @param listEulaAcceptancesRequest
     * @return Result of the ListEulaAcceptances operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListEulaAcceptances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulaAcceptances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEulaAcceptancesResult listEulaAcceptances(ListEulaAcceptancesRequest request) {
        request = beforeClientExecution(request);
        return executeListEulaAcceptances(request);
    }

    @SdkInternalApi
    final ListEulaAcceptancesResult executeListEulaAcceptances(ListEulaAcceptancesRequest listEulaAcceptancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listEulaAcceptancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEulaAcceptancesRequest> request = null;
        Response<ListEulaAcceptancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEulaAcceptancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEulaAcceptancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEulaAcceptances");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEulaAcceptancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEulaAcceptancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List EULAs.
     * </p>
     * 
     * @param listEulasRequest
     * @return Result of the ListEulas operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListEulas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListEulas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListEulasResult listEulas(ListEulasRequest request) {
        request = beforeClientExecution(request);
        return executeListEulas(request);
    }

    @SdkInternalApi
    final ListEulasResult executeListEulas(ListEulasRequest listEulasRequest) {

        ExecutionContext executionContext = createExecutionContext(listEulasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEulasRequest> request = null;
        Response<ListEulasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEulasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEulasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEulas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEulasResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEulasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get all users in a given launch profile membership.
     * </p>
     * 
     * @param listLaunchProfileMembersRequest
     * @return Result of the ListLaunchProfileMembers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfileMembers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListLaunchProfileMembersResult listLaunchProfileMembers(ListLaunchProfileMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListLaunchProfileMembers(request);
    }

    @SdkInternalApi
    final ListLaunchProfileMembersResult executeListLaunchProfileMembers(ListLaunchProfileMembersRequest listLaunchProfileMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listLaunchProfileMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLaunchProfileMembersRequest> request = null;
        Response<ListLaunchProfileMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLaunchProfileMembersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listLaunchProfileMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLaunchProfileMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLaunchProfileMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListLaunchProfileMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all the launch profiles a studio.
     * </p>
     * 
     * @param listLaunchProfilesRequest
     * @return Result of the ListLaunchProfiles operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListLaunchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListLaunchProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListLaunchProfilesResult listLaunchProfiles(ListLaunchProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeListLaunchProfiles(request);
    }

    @SdkInternalApi
    final ListLaunchProfilesResult executeListLaunchProfiles(ListLaunchProfilesRequest listLaunchProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(listLaunchProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListLaunchProfilesRequest> request = null;
        Response<ListLaunchProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListLaunchProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listLaunchProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListLaunchProfiles");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListLaunchProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListLaunchProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the streaming image resources available to this studio.
     * </p>
     * <p>
     * This list will contain both images provided by Amazon Web Services, as well as streaming images that you have
     * created in your studio.
     * </p>
     * 
     * @param listStreamingImagesRequest
     * @return Result of the ListStreamingImages operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListStreamingImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingImages" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStreamingImagesResult listStreamingImages(ListStreamingImagesRequest request) {
        request = beforeClientExecution(request);
        return executeListStreamingImages(request);
    }

    @SdkInternalApi
    final ListStreamingImagesResult executeListStreamingImages(ListStreamingImagesRequest listStreamingImagesRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamingImagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamingImagesRequest> request = null;
        Response<ListStreamingImagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamingImagesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamingImagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreamingImages");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamingImagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStreamingImagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the backups of a streaming session in a studio.
     * </p>
     * 
     * @param listStreamingSessionBackupsRequest
     * @return Result of the ListStreamingSessionBackups operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @sample AmazonNimbleStudio.ListStreamingSessionBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingSessionBackups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListStreamingSessionBackupsResult listStreamingSessionBackups(ListStreamingSessionBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeListStreamingSessionBackups(request);
    }

    @SdkInternalApi
    final ListStreamingSessionBackupsResult executeListStreamingSessionBackups(ListStreamingSessionBackupsRequest listStreamingSessionBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamingSessionBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamingSessionBackupsRequest> request = null;
        Response<ListStreamingSessionBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamingSessionBackupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listStreamingSessionBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreamingSessionBackups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamingSessionBackupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListStreamingSessionBackupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the streaming sessions in a studio.
     * </p>
     * 
     * @param listStreamingSessionsRequest
     * @return Result of the ListStreamingSessions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListStreamingSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingSessions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStreamingSessionsResult listStreamingSessions(ListStreamingSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeListStreamingSessions(request);
    }

    @SdkInternalApi
    final ListStreamingSessionsResult executeListStreamingSessions(ListStreamingSessionsRequest listStreamingSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStreamingSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamingSessionsRequest> request = null;
        Response<ListStreamingSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamingSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStreamingSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStreamingSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStreamingSessionsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListStreamingSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the <code>StudioComponents</code> in a studio.
     * </p>
     * 
     * @param listStudioComponentsRequest
     * @return Result of the ListStudioComponents operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListStudioComponents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioComponents" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListStudioComponentsResult listStudioComponents(ListStudioComponentsRequest request) {
        request = beforeClientExecution(request);
        return executeListStudioComponents(request);
    }

    @SdkInternalApi
    final ListStudioComponentsResult executeListStudioComponents(ListStudioComponentsRequest listStudioComponentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listStudioComponentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStudioComponentsRequest> request = null;
        Response<ListStudioComponentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStudioComponentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStudioComponentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStudioComponents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStudioComponentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStudioComponentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get all users in a given studio membership.
     * </p>
     * <note>
     * <p>
     * <code>ListStudioMembers</code> only returns admin members.
     * </p>
     * </note>
     * 
     * @param listStudioMembersRequest
     * @return Result of the ListStudioMembers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStudioMembersResult listStudioMembers(ListStudioMembersRequest request) {
        request = beforeClientExecution(request);
        return executeListStudioMembers(request);
    }

    @SdkInternalApi
    final ListStudioMembersResult executeListStudioMembers(ListStudioMembersRequest listStudioMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(listStudioMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStudioMembersRequest> request = null;
        Response<ListStudioMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStudioMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStudioMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStudioMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStudioMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStudioMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List studios in your Amazon Web Services accounts in the requested Amazon Web Services Region.
     * </p>
     * 
     * @param listStudiosRequest
     * @return Result of the ListStudios operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListStudios
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudios" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListStudiosResult listStudios(ListStudiosRequest request) {
        request = beforeClientExecution(request);
        return executeListStudios(request);
    }

    @SdkInternalApi
    final ListStudiosResult executeListStudios(ListStudiosRequest listStudiosRequest) {

        ExecutionContext executionContext = createExecutionContext(listStudiosRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStudiosRequest> request = null;
        Response<ListStudiosResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStudiosRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listStudiosRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListStudios");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListStudiosResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListStudiosResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the tags for a resource, given its Amazon Resource Names (ARN).
     * </p>
     * <p>
     * This operation supports ARNs for all resource types in Nimble Studio that support tags, including studio, studio
     * component, launch profile, streaming image, and streaming session. All resources that can be tagged will contain
     * an ARN property, so you do not have to create this ARN yourself.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
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
     * Add/update users with given persona to launch profile membership.
     * </p>
     * 
     * @param putLaunchProfileMembersRequest
     * @return Result of the PutLaunchProfileMembers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.PutLaunchProfileMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutLaunchProfileMembers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public PutLaunchProfileMembersResult putLaunchProfileMembers(PutLaunchProfileMembersRequest request) {
        request = beforeClientExecution(request);
        return executePutLaunchProfileMembers(request);
    }

    @SdkInternalApi
    final PutLaunchProfileMembersResult executePutLaunchProfileMembers(PutLaunchProfileMembersRequest putLaunchProfileMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(putLaunchProfileMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutLaunchProfileMembersRequest> request = null;
        Response<PutLaunchProfileMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutLaunchProfileMembersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putLaunchProfileMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutLaunchProfileMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutLaunchProfileMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutLaunchProfileMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add/update users with given persona to studio membership.
     * </p>
     * 
     * @param putStudioMembersRequest
     * @return Result of the PutStudioMembers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.PutStudioMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/PutStudioMembers" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutStudioMembersResult putStudioMembers(PutStudioMembersRequest request) {
        request = beforeClientExecution(request);
        return executePutStudioMembers(request);
    }

    @SdkInternalApi
    final PutStudioMembersResult executePutStudioMembers(PutStudioMembersRequest putStudioMembersRequest) {

        ExecutionContext executionContext = createExecutionContext(putStudioMembersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutStudioMembersRequest> request = null;
        Response<PutStudioMembersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutStudioMembersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putStudioMembersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutStudioMembers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutStudioMembersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutStudioMembersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transitions sessions from the <code>STOPPED</code> state into the <code>READY</code> state. The
     * <code>START_IN_PROGRESS</code> state is the intermediate state between the <code>STOPPED</code> and
     * <code>READY</code> states.
     * </p>
     * 
     * @param startStreamingSessionRequest
     * @return Result of the StartStreamingSession operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.StartStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StartStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartStreamingSessionResult startStreamingSession(StartStreamingSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStartStreamingSession(request);
    }

    @SdkInternalApi
    final StartStreamingSessionResult executeStartStreamingSession(StartStreamingSessionRequest startStreamingSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(startStreamingSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStreamingSessionRequest> request = null;
        Response<StartStreamingSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStreamingSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startStreamingSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartStreamingSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartStreamingSessionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartStreamingSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Repairs the IAM Identity Center configuration for a given studio.
     * </p>
     * <p>
     * If the studio has a valid IAM Identity Center configuration currently associated with it, this operation will
     * fail with a validation error.
     * </p>
     * <p>
     * If the studio does not have a valid IAM Identity Center configuration currently associated with it, then a new
     * IAM Identity Center application is created for the studio and the studio is changed to the <code>READY</code>
     * state.
     * </p>
     * <p>
     * After the IAM Identity Center application is repaired, you must use the Amazon Nimble Studio console to add
     * administrators and users to your studio.
     * </p>
     * 
     * @param startStudioSSOConfigurationRepairRequest
     * @return Result of the StartStudioSSOConfigurationRepair operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.StartStudioSSOConfigurationRepair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StartStudioSSOConfigurationRepair"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartStudioSSOConfigurationRepairResult startStudioSSOConfigurationRepair(StartStudioSSOConfigurationRepairRequest request) {
        request = beforeClientExecution(request);
        return executeStartStudioSSOConfigurationRepair(request);
    }

    @SdkInternalApi
    final StartStudioSSOConfigurationRepairResult executeStartStudioSSOConfigurationRepair(
            StartStudioSSOConfigurationRepairRequest startStudioSSOConfigurationRepairRequest) {

        ExecutionContext executionContext = createExecutionContext(startStudioSSOConfigurationRepairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartStudioSSOConfigurationRepairRequest> request = null;
        Response<StartStudioSSOConfigurationRepairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartStudioSSOConfigurationRepairRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startStudioSSOConfigurationRepairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartStudioSSOConfigurationRepair");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartStudioSSOConfigurationRepairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartStudioSSOConfigurationRepairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Transitions sessions from the <code>READY</code> state into the <code>STOPPED</code> state. The
     * <code>STOP_IN_PROGRESS</code> state is the intermediate state between the <code>READY</code> and
     * <code>STOPPED</code> states.
     * </p>
     * 
     * @param stopStreamingSessionRequest
     * @return Result of the StopStreamingSession operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.StopStreamingSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StopStreamingSession" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopStreamingSessionResult stopStreamingSession(StopStreamingSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStopStreamingSession(request);
    }

    @SdkInternalApi
    final StopStreamingSessionResult executeStopStreamingSession(StopStreamingSessionRequest stopStreamingSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopStreamingSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopStreamingSessionRequest> request = null;
        Response<StopStreamingSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopStreamingSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopStreamingSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopStreamingSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopStreamingSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopStreamingSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates tags for a resource, given its ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
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
     * Deletes the tags for a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
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
     * Update a launch profile.
     * </p>
     * 
     * @param updateLaunchProfileRequest
     * @return Result of the UpdateLaunchProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.UpdateLaunchProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfile" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLaunchProfileResult updateLaunchProfile(UpdateLaunchProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLaunchProfile(request);
    }

    @SdkInternalApi
    final UpdateLaunchProfileResult executeUpdateLaunchProfile(UpdateLaunchProfileRequest updateLaunchProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLaunchProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLaunchProfileRequest> request = null;
        Response<UpdateLaunchProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLaunchProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLaunchProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLaunchProfile");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLaunchProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLaunchProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a user persona in launch profile membership.
     * </p>
     * 
     * @param updateLaunchProfileMemberRequest
     * @return Result of the UpdateLaunchProfileMember operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.UpdateLaunchProfileMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateLaunchProfileMember"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLaunchProfileMemberResult updateLaunchProfileMember(UpdateLaunchProfileMemberRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLaunchProfileMember(request);
    }

    @SdkInternalApi
    final UpdateLaunchProfileMemberResult executeUpdateLaunchProfileMember(UpdateLaunchProfileMemberRequest updateLaunchProfileMemberRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLaunchProfileMemberRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLaunchProfileMemberRequest> request = null;
        Response<UpdateLaunchProfileMemberResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLaunchProfileMemberRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLaunchProfileMemberRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLaunchProfileMember");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLaunchProfileMemberResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLaunchProfileMemberResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update streaming image.
     * </p>
     * 
     * @param updateStreamingImageRequest
     * @return Result of the UpdateStreamingImage operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.UpdateStreamingImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStreamingImage" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateStreamingImageResult updateStreamingImage(UpdateStreamingImageRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStreamingImage(request);
    }

    @SdkInternalApi
    final UpdateStreamingImageResult executeUpdateStreamingImage(UpdateStreamingImageRequest updateStreamingImageRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStreamingImageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStreamingImageRequest> request = null;
        Response<UpdateStreamingImageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStreamingImageRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStreamingImageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStreamingImage");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStreamingImageResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStreamingImageResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a Studio resource.
     * </p>
     * <p>
     * Currently, this operation only supports updating the displayName of your studio.
     * </p>
     * 
     * @param updateStudioRequest
     * @return Result of the UpdateStudio operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.UpdateStudio
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudio" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateStudioResult updateStudio(UpdateStudioRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStudio(request);
    }

    @SdkInternalApi
    final UpdateStudioResult executeUpdateStudio(UpdateStudioRequest updateStudioRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStudioRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStudioRequest> request = null;
        Response<UpdateStudioResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStudioRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStudioRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStudio");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStudioResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateStudioResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a studio component resource.
     * </p>
     * 
     * @param updateStudioComponentRequest
     * @return Result of the UpdateStudioComponent operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         Another operation is in progress.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You are not authorized to perform this operation. Check your IAM policies, and ensure that you are using
     *         the correct access keys.
     * @throws InternalServerErrorException
     *         An internal error has occurred. Please retry your request.
     * @throws ServiceQuotaExceededException
     *         Your current quota does not allow you to perform the request action. You can request increases for some
     *         quotas, and other quotas cannot be increased.</p>
     *         <p>
     *         Please use Amazon Web Services Service Quotas to request an increase.
     * @sample AmazonNimbleStudio.UpdateStudioComponent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/UpdateStudioComponent" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateStudioComponentResult updateStudioComponent(UpdateStudioComponentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStudioComponent(request);
    }

    @SdkInternalApi
    final UpdateStudioComponentResult executeUpdateStudioComponent(UpdateStudioComponentRequest updateStudioComponentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStudioComponentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStudioComponentRequest> request = null;
        Response<UpdateStudioComponentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStudioComponentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateStudioComponentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "nimble");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStudioComponent");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStudioComponentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateStudioComponentResultJsonUnmarshaller());
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
    public AmazonNimbleStudioWaiters waiters() {
        if (waiters == null) {
            synchronized (this) {
                if (waiters == null) {
                    waiters = new AmazonNimbleStudioWaiters(this);
                }
            }
        }
        return waiters;
    }

    @Override
    public void shutdown() {
        super.shutdown();
        if (waiters != null) {
            waiters.shutdown();
        }
    }

}
