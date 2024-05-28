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
package com.amazonaws.services.mediapackagev2;

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

import com.amazonaws.services.mediapackagev2.AWSMediaPackageV2ClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.services.mediapackagev2.model.transform.*;

/**
 * Client for accessing mediapackagev2. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <note>
 * <p>
 * This guide is intended for creating AWS Elemental MediaPackage resources in MediaPackage Version 2 (v2) starting from
 * May 2023. To get started with MediaPackage v2, create your MediaPackage resources. There isn't an automated process
 * to migrate your resources from MediaPackage v1 to MediaPackage v2.
 * </p>
 * <p>
 * The names of the entities that you use to access this API, like URLs and ARNs, all have the versioning information
 * added, like "v2", to distinguish from the prior version. If you used MediaPackage prior to this release, you can't
 * use the MediaPackage v2 CLI or the MediaPackage v2 API to access any MediaPackage v1 resources.
 * </p>
 * <p>
 * If you created resources in MediaPackage v1, use video on demand (VOD) workflows, and aren't looking to migrate to
 * MediaPackage v2 yet, see the <a
 * href="https://docs.aws.amazon.com/mediapackage/latest/apireference/what-is.html">MediaPackage v1 Live API
 * Reference</a>.
 * </p>
 * </note>
 * <p>
 * This is the AWS Elemental MediaPackage v2 Live REST API Reference. It describes all the MediaPackage API operations
 * for live content in detail, and provides sample requests, responses, and errors for the supported web services
 * protocols.
 * </p>
 * <p>
 * We assume that you have the IAM permissions that you need to use MediaPackage via the REST API. We also assume that
 * you are familiar with the features and operations of MediaPackage, as described in the AWS Elemental MediaPackage
 * User Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaPackageV2Client extends AmazonWebServiceClient implements AWSMediaPackageV2 {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMediaPackageV2.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mediapackagev2";

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
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagev2.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagev2.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagev2.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagev2.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagev2.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagev2.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.mediapackagev2.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.mediapackagev2.model.AWSMediaPackageV2Exception.class));

    public static AWSMediaPackageV2ClientBuilder builder() {
        return AWSMediaPackageV2ClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on mediapackagev2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageV2Client(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on mediapackagev2 using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMediaPackageV2Client(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mediapackagev2.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/mediapackagev2/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/mediapackagev2/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Create a channel to start receiving content streams. The channel represents the input to MediaPackage for
     * incoming live content from an encoder such as AWS Elemental MediaLive. The channel receives content, and after
     * packaging it, outputs it through an origin endpoint to downstream devices (such as video players or CDNs) that
     * request the content. You can create only one channel with each request. We recommend that you spread out channels
     * between channel groups, such as putting redundant channels in the same AWS Region in different channel groups.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateChannelResult createChannel(CreateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannel(request);
    }

    @SdkInternalApi
    final CreateChannelResult executeCreateChannel(CreateChannelRequest createChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelRequest> request = null;
        Response<CreateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a channel group to group your channels and origin endpoints. A channel group is the top-level resource
     * that consists of channels and origin endpoints that are associated with it and that provides predictable URLs for
     * stream delivery. All channels and origin endpoints within the channel group are guaranteed to share the DNS. You
     * can create only one channel group with each request.
     * </p>
     * 
     * @param createChannelGroupRequest
     * @return Result of the CreateChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.CreateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateChannelGroupResult createChannelGroup(CreateChannelGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateChannelGroup(request);
    }

    @SdkInternalApi
    final CreateChannelGroupResult executeCreateChannelGroup(CreateChannelGroupRequest createChannelGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createChannelGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateChannelGroupRequest> request = null;
        Response<CreateChannelGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateChannelGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createChannelGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateChannelGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateChannelGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateChannelGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The endpoint is attached to a channel, and represents the output of the live content. You can associate multiple
     * endpoints to a single channel. Each endpoint gives players and downstream CDNs (such as Amazon CloudFront) access
     * to the content for playback. Content can't be served from a channel until it has an endpoint. You can create only
     * one endpoint with each request.
     * </p>
     * 
     * @param createOriginEndpointRequest
     * @return Result of the CreateOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateOriginEndpointResult createOriginEndpoint(CreateOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateOriginEndpoint(request);
    }

    @SdkInternalApi
    final CreateOriginEndpointResult executeCreateOriginEndpoint(CreateOriginEndpointRequest createOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateOriginEndpointRequest> request = null;
        Response<CreateOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateOriginEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a channel to stop AWS Elemental MediaPackage from receiving further content. You must delete the channel's
     * origin endpoints before you can delete the channel.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteChannelResult deleteChannel(DeleteChannelRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannel(request);
    }

    @SdkInternalApi
    final DeleteChannelResult executeDeleteChannel(DeleteChannelRequest deleteChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelRequest> request = null;
        Response<DeleteChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a channel group. You must delete the channel group's channels and origin endpoints before you can delete
     * the channel group. If you delete a channel group, you'll lose access to the egress domain and will have to create
     * a new channel group to replace it.
     * </p>
     * 
     * @param deleteChannelGroupRequest
     * @return Result of the DeleteChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelGroupResult deleteChannelGroup(DeleteChannelGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelGroup(request);
    }

    @SdkInternalApi
    final DeleteChannelGroupResult executeDeleteChannelGroup(DeleteChannelGroupRequest deleteChannelGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelGroupRequest> request = null;
        Response<DeleteChannelGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a channel policy.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @return Result of the DeleteChannelPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteChannelPolicyResult deleteChannelPolicy(DeleteChannelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteChannelPolicy(request);
    }

    @SdkInternalApi
    final DeleteChannelPolicyResult executeDeleteChannelPolicy(DeleteChannelPolicyRequest deleteChannelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteChannelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteChannelPolicyRequest> request = null;
        Response<DeleteChannelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteChannelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteChannelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteChannelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteChannelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteChannelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Origin endpoints can serve content until they're deleted. Delete the endpoint if it should no longer respond to
     * playback requests. You must delete all endpoints from a channel before you can delete the channel.
     * </p>
     * 
     * @param deleteOriginEndpointRequest
     * @return Result of the DeleteOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOriginEndpointResult deleteOriginEndpoint(DeleteOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOriginEndpoint(request);
    }

    @SdkInternalApi
    final DeleteOriginEndpointResult executeDeleteOriginEndpoint(DeleteOriginEndpointRequest deleteOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOriginEndpointRequest> request = null;
        Response<DeleteOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteOriginEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an origin endpoint policy.
     * </p>
     * 
     * @param deleteOriginEndpointPolicyRequest
     * @return Result of the DeleteOriginEndpointPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.DeleteOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/DeleteOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteOriginEndpointPolicyResult deleteOriginEndpointPolicy(DeleteOriginEndpointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteOriginEndpointPolicy(request);
    }

    @SdkInternalApi
    final DeleteOriginEndpointPolicyResult executeDeleteOriginEndpointPolicy(DeleteOriginEndpointPolicyRequest deleteOriginEndpointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteOriginEndpointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteOriginEndpointPolicyRequest> request = null;
        Response<DeleteOriginEndpointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteOriginEndpointPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteOriginEndpointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteOriginEndpointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteOriginEndpointPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteOriginEndpointPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified channel that's configured in AWS Elemental MediaPackage, including the origin endpoints
     * that are associated with it.
     * </p>
     * 
     * @param getChannelRequest
     * @return Result of the GetChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetChannelResult getChannel(GetChannelRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannel(request);
    }

    @SdkInternalApi
    final GetChannelResult executeGetChannel(GetChannelRequest getChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelRequest> request = null;
        Response<GetChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified channel group that's configured in AWS Elemental MediaPackage, including the channels and
     * origin endpoints that are associated with it.
     * </p>
     * 
     * @param getChannelGroupRequest
     * @return Result of the GetChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetChannelGroupResult getChannelGroup(GetChannelGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannelGroup(request);
    }

    @SdkInternalApi
    final GetChannelGroupResult executeGetChannelGroup(GetChannelGroupRequest getChannelGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelGroupRequest> request = null;
        Response<GetChannelGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannelGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified channel policy that's configured in AWS Elemental MediaPackage. With policies, you can
     * specify who has access to AWS resources and what actions they can perform on those resources.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @return Result of the GetChannelPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetChannelPolicyResult getChannelPolicy(GetChannelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetChannelPolicy(request);
    }

    @SdkInternalApi
    final GetChannelPolicyResult executeGetChannelPolicy(GetChannelPolicyRequest getChannelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getChannelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetChannelPolicyRequest> request = null;
        Response<GetChannelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetChannelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getChannelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetChannelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetChannelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetChannelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified origin endpoint that's configured in AWS Elemental MediaPackage to obtain its playback
     * URL and to view the packaging settings that it's currently using.
     * </p>
     * 
     * @param getOriginEndpointRequest
     * @return Result of the GetOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOriginEndpointResult getOriginEndpoint(GetOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetOriginEndpoint(request);
    }

    @SdkInternalApi
    final GetOriginEndpointResult executeGetOriginEndpoint(GetOriginEndpointRequest getOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOriginEndpointRequest> request = null;
        Response<GetOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOriginEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the specified origin endpoint policy that's configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param getOriginEndpointPolicyRequest
     * @return Result of the GetOriginEndpointPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.GetOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/GetOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOriginEndpointPolicyResult getOriginEndpointPolicy(GetOriginEndpointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetOriginEndpointPolicy(request);
    }

    @SdkInternalApi
    final GetOriginEndpointPolicyResult executeGetOriginEndpointPolicy(GetOriginEndpointPolicyRequest getOriginEndpointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getOriginEndpointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOriginEndpointPolicyRequest> request = null;
        Response<GetOriginEndpointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOriginEndpointPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOriginEndpointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetOriginEndpointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOriginEndpointPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOriginEndpointPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all channel groups that are configured in AWS Elemental MediaPackage, including the channels and origin
     * endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelGroupsRequest
     * @return Result of the ListChannelGroups operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.ListChannelGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannelGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListChannelGroupsResult listChannelGroups(ListChannelGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannelGroups(request);
    }

    @SdkInternalApi
    final ListChannelGroupsResult executeListChannelGroups(ListChannelGroupsRequest listChannelGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelGroupsRequest> request = null;
        Response<ListChannelGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannelGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all channels in a specific channel group that are configured in AWS Elemental MediaPackage, including
     * the origin endpoints that are associated with it.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListChannels" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListChannelsResult listChannels(ListChannelsRequest request) {
        request = beforeClientExecution(request);
        return executeListChannels(request);
    }

    @SdkInternalApi
    final ListChannelsResult executeListChannels(ListChannelsRequest listChannelsRequest) {

        ExecutionContext executionContext = createExecutionContext(listChannelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListChannelsRequest> request = null;
        Response<ListChannelsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListChannelsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listChannelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListChannels");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListChannelsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListChannelsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all origin endpoints in a specific channel that are configured in AWS Elemental MediaPackage.
     * </p>
     * 
     * @param listOriginEndpointsRequest
     * @return Result of the ListOriginEndpoints operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOriginEndpointsResult listOriginEndpoints(ListOriginEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListOriginEndpoints(request);
    }

    @SdkInternalApi
    final ListOriginEndpointsResult executeListOriginEndpoints(ListOriginEndpointsRequest listOriginEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listOriginEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOriginEndpointsRequest> request = null;
        Response<ListOriginEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOriginEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listOriginEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOriginEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOriginEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListOriginEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
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
     * Attaches an IAM policy to the specified channel. With policies, you can specify who has access to AWS resources
     * and what actions they can perform on those resources. You can attach only one policy with each request.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @return Result of the PutChannelPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutChannelPolicyResult putChannelPolicy(PutChannelPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutChannelPolicy(request);
    }

    @SdkInternalApi
    final PutChannelPolicyResult executePutChannelPolicy(PutChannelPolicyRequest putChannelPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putChannelPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutChannelPolicyRequest> request = null;
        Response<PutChannelPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutChannelPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putChannelPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutChannelPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutChannelPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutChannelPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches an IAM policy to the specified origin endpoint. You can attach only one policy with each request.
     * </p>
     * 
     * @param putOriginEndpointPolicyRequest
     * @return Result of the PutOriginEndpointPolicy operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.PutOriginEndpointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/PutOriginEndpointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutOriginEndpointPolicyResult putOriginEndpointPolicy(PutOriginEndpointPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutOriginEndpointPolicy(request);
    }

    @SdkInternalApi
    final PutOriginEndpointPolicyResult executePutOriginEndpointPolicy(PutOriginEndpointPolicyRequest putOriginEndpointPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putOriginEndpointPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutOriginEndpointPolicyRequest> request = null;
        Response<PutOriginEndpointPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutOriginEndpointPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putOriginEndpointPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutOriginEndpointPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutOriginEndpointPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutOriginEndpointPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns one of more tags (key-value pairs) to the specified MediaPackage resource.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by
     * granting a user permission to access or change only resources with certain tag values. You can use the
     * TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this
     * tag is appended to the list of tags associated with the resource. If you specify a tag key that is already
     * associated with the resource, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
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
     * Removes one or more tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @sample AWSMediaPackageV2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
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
     * Update the specified channel. You can edit if MediaPackage sends ingest or egress access logs to the CloudWatch
     * log group, if content will be encrypted, the description on a channel, and your channel's policy settings. You
     * can't edit the name of the channel or CloudFront distribution details.
     * </p>
     * <p>
     * Any edits you make that impact the video output may not be reflected for a few minutes.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannel" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateChannelResult updateChannel(UpdateChannelRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannel(request);
    }

    @SdkInternalApi
    final UpdateChannelResult executeUpdateChannel(UpdateChannelRequest updateChannelRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelRequest> request = null;
        Response<UpdateChannelResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannel");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the specified channel group. You can edit the description on a channel group for easier identification
     * later from the AWS Elemental MediaPackage console. You can't edit the name of the channel group.
     * </p>
     * <p>
     * Any edits you make that impact the video output may not be reflected for a few minutes.
     * </p>
     * 
     * @param updateChannelGroupRequest
     * @return Result of the UpdateChannelGroup operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @sample AWSMediaPackageV2.UpdateChannelGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannelGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateChannelGroupResult updateChannelGroup(UpdateChannelGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateChannelGroup(request);
    }

    @SdkInternalApi
    final UpdateChannelGroupResult executeUpdateChannelGroup(UpdateChannelGroupRequest updateChannelGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateChannelGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateChannelGroupRequest> request = null;
        Response<UpdateChannelGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateChannelGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateChannelGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateChannelGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateChannelGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateChannelGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the specified origin endpoint. Edit the packaging preferences on an endpoint to optimize the viewing
     * experience. You can't edit the name of the endpoint.
     * </p>
     * <p>
     * Any edits you make that impact the video output may not be reflected for a few minutes.
     * </p>
     * 
     * @param updateOriginEndpointRequest
     * @return Result of the UpdateOriginEndpoint operation returned by the service.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         Indicates that an error from the service occurred while trying to process a request.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation. The user or role that is making the
     *         request must have at least one IAM permissions policy attached that grants the required permissions. For
     *         more information, see Access Management in the IAM User Guide.
     * @throws ValidationException
     *         The input failed to meet the constraints specified by the AWS service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded.
     * @sample AWSMediaPackageV2.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateOriginEndpointResult updateOriginEndpoint(UpdateOriginEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateOriginEndpoint(request);
    }

    @SdkInternalApi
    final UpdateOriginEndpointResult executeUpdateOriginEndpoint(UpdateOriginEndpointRequest updateOriginEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateOriginEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateOriginEndpointRequest> request = null;
        Response<UpdateOriginEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateOriginEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateOriginEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "MediaPackageV2");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateOriginEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateOriginEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateOriginEndpointResultJsonUnmarshaller());
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
