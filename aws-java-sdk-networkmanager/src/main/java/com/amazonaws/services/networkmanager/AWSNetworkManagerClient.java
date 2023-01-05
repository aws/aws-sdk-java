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
package com.amazonaws.services.networkmanager;

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

import com.amazonaws.services.networkmanager.AWSNetworkManagerClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.services.networkmanager.model.transform.*;

/**
 * Client for accessing NetworkManager. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * Amazon Web Services enables you to centrally manage your Amazon Web Services Cloud WAN core network and your Transit
 * Gateway network across Amazon Web Services accounts, Regions, and on-premises locations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSNetworkManagerClient extends AmazonWebServiceClient implements AWSNetworkManager {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSNetworkManager.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "networkmanager";

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
                                    com.amazonaws.services.networkmanager.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CoreNetworkPolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkmanager.model.transform.CoreNetworkPolicyExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.networkmanager.model.AWSNetworkManagerException.class));

    public static AWSNetworkManagerClientBuilder builder() {
        return AWSNetworkManagerClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on NetworkManager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSNetworkManagerClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on NetworkManager using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSNetworkManagerClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("networkmanager.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/networkmanager/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/networkmanager/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts a core network attachment request.
     * </p>
     * <p>
     * Once the attachment request is accepted by a core network owner, the attachment is created and connected to a
     * core network.
     * </p>
     * 
     * @param acceptAttachmentRequest
     * @return Result of the AcceptAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AcceptAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AcceptAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptAttachmentResult acceptAttachment(AcceptAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptAttachment(request);
    }

    @SdkInternalApi
    final AcceptAttachmentResult executeAcceptAttachment(AcceptAttachmentRequest acceptAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptAttachmentRequest> request = null;
        Response<AcceptAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(acceptAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AcceptAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a core network Connect peer with a device and optionally, with a link.
     * </p>
     * <p>
     * If you specify a link, it must be associated with the specified device. You can only associate core network
     * Connect peers that have been created on a core network Connect attachment on a core network.
     * </p>
     * 
     * @param associateConnectPeerRequest
     * @return Result of the AssociateConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateConnectPeerResult associateConnectPeer(AssociateConnectPeerRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateConnectPeer(request);
    }

    @SdkInternalApi
    final AssociateConnectPeerResult executeAssociateConnectPeer(AssociateConnectPeerRequest associateConnectPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(associateConnectPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateConnectPeerRequest> request = null;
        Response<AssociateConnectPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateConnectPeerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateConnectPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateConnectPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateConnectPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateConnectPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be
     * associated with the specified device.
     * </p>
     * <p>
     * You can only associate customer gateways that are connected to a VPN attachment on a transit gateway or core
     * network registered in your global network. When you register a transit gateway or core network, customer gateways
     * that are connected to the transit gateway are automatically included in the global network. To list customer
     * gateways that are connected to a transit gateway, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnConnections.html"
     * >DescribeVpnConnections</a> EC2 API and filter by <code>transit-gateway-id</code>.
     * </p>
     * <p>
     * You cannot associate a customer gateway with more than one device and link.
     * </p>
     * 
     * @param associateCustomerGatewayRequest
     * @return Result of the AssociateCustomerGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateCustomerGatewayResult associateCustomerGateway(AssociateCustomerGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateCustomerGateway(request);
    }

    @SdkInternalApi
    final AssociateCustomerGatewayResult executeAssociateCustomerGateway(AssociateCustomerGatewayRequest associateCustomerGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(associateCustomerGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateCustomerGatewayRequest> request = null;
        Response<AssociateCustomerGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateCustomerGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateCustomerGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateCustomerGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateCustomerGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateCustomerGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a link to a device. A device can be associated to multiple links and a link can be associated to
     * multiple devices. The device and link must be in the same global network and the same site.
     * </p>
     * 
     * @param associateLinkRequest
     * @return Result of the AssociateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateLink" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateLinkResult associateLink(AssociateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateLink(request);
    }

    @SdkInternalApi
    final AssociateLinkResult executeAssociateLink(AssociateLinkRequest associateLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(associateLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateLinkRequest> request = null;
        Response<AssociateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a transit gateway Connect peer with a device, and optionally, with a link. If you specify a link, it
     * must be associated with the specified device.
     * </p>
     * <p>
     * You can only associate transit gateway Connect peers that have been created on a transit gateway that's
     * registered in your global network.
     * </p>
     * <p>
     * You cannot associate a transit gateway Connect peer with more than one device and link.
     * </p>
     * 
     * @param associateTransitGatewayConnectPeerRequest
     * @return Result of the AssociateTransitGatewayConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateTransitGatewayConnectPeerResult associateTransitGatewayConnectPeer(AssociateTransitGatewayConnectPeerRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateTransitGatewayConnectPeer(request);
    }

    @SdkInternalApi
    final AssociateTransitGatewayConnectPeerResult executeAssociateTransitGatewayConnectPeer(
            AssociateTransitGatewayConnectPeerRequest associateTransitGatewayConnectPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(associateTransitGatewayConnectPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateTransitGatewayConnectPeerRequest> request = null;
        Response<AssociateTransitGatewayConnectPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateTransitGatewayConnectPeerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateTransitGatewayConnectPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateTransitGatewayConnectPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateTransitGatewayConnectPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateTransitGatewayConnectPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a core network Connect attachment from a specified core network attachment.
     * </p>
     * <p>
     * A core network Connect attachment is a GRE-based tunnel attachment that you can use to establish a connection
     * between a core network and an appliance. A core network Connect attachment uses an existing VPC attachment as the
     * underlying transport mechanism.
     * </p>
     * 
     * @param createConnectAttachmentRequest
     * @return Result of the CreateConnectAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConnectAttachmentResult createConnectAttachment(CreateConnectAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnectAttachment(request);
    }

    @SdkInternalApi
    final CreateConnectAttachmentResult executeCreateConnectAttachment(CreateConnectAttachmentRequest createConnectAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectAttachmentRequest> request = null;
        Response<CreateConnectAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConnectAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnectAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConnectAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a core network Connect peer for a specified core network connect attachment between a core network and an
     * appliance. The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
     * </p>
     * 
     * @param createConnectPeerRequest
     * @return Result of the CreateConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConnectPeerResult createConnectPeer(CreateConnectPeerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnectPeer(request);
    }

    @SdkInternalApi
    final CreateConnectPeerResult executeCreateConnectPeer(CreateConnectPeerRequest createConnectPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectPeerRequest> request = null;
        Response<CreateConnectPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectPeerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnectPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a connection between two devices. The devices can be a physical or virtual appliance that connects to a
     * third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an
     * on-premises network.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConnectionResult createConnection(CreateConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConnection(request);
    }

    @SdkInternalApi
    final CreateConnectionResult executeCreateConnection(CreateConnectionRequest createConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(createConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConnectionRequest> request = null;
        Response<CreateConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a core network as part of your global network, and optionally, with a core network policy.
     * </p>
     * 
     * @param createCoreNetworkRequest
     * @return Result of the CreateCoreNetwork operation returned by the service.
     * @throws CoreNetworkPolicyException
     *         Describes a core network policy exception.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCoreNetworkResult createCoreNetwork(CreateCoreNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCoreNetwork(request);
    }

    @SdkInternalApi
    final CreateCoreNetworkResult executeCreateCoreNetwork(CreateCoreNetworkRequest createCoreNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createCoreNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCoreNetworkRequest> request = null;
        Response<CreateCoreNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCoreNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCoreNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCoreNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCoreNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCoreNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site
     * is used for visualization in the Network Manager console.
     * </p>
     * 
     * @param createDeviceRequest
     * @return Result of the CreateDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDeviceResult createDevice(CreateDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDevice(request);
    }

    @SdkInternalApi
    final CreateDeviceResult executeCreateDevice(CreateDeviceRequest createDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(createDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDeviceRequest> request = null;
        Response<CreateDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new, empty global network.
     * </p>
     * 
     * @param createGlobalNetworkRequest
     * @return Result of the CreateGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateGlobalNetworkResult createGlobalNetwork(CreateGlobalNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateGlobalNetwork(request);
    }

    @SdkInternalApi
    final CreateGlobalNetworkResult executeCreateGlobalNetwork(CreateGlobalNetworkRequest createGlobalNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(createGlobalNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateGlobalNetworkRequest> request = null;
        Response<CreateGlobalNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateGlobalNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createGlobalNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateGlobalNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateGlobalNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateGlobalNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new link for a specified site.
     * </p>
     * 
     * @param createLinkRequest
     * @return Result of the CreateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLinkResult createLink(CreateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLink(request);
    }

    @SdkInternalApi
    final CreateLinkResult executeCreateLink(CreateLinkRequest createLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(createLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLinkRequest> request = null;
        Response<CreateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new site in a global network.
     * </p>
     * 
     * @param createSiteRequest
     * @return Result of the CreateSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSiteResult createSite(CreateSiteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSite(request);
    }

    @SdkInternalApi
    final CreateSiteResult executeCreateSite(CreateSiteRequest createSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(createSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSiteRequest> request = null;
        Response<CreateSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
     * </p>
     * 
     * @param createSiteToSiteVpnAttachmentRequest
     * @return Result of the CreateSiteToSiteVpnAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSiteToSiteVpnAttachmentResult createSiteToSiteVpnAttachment(CreateSiteToSiteVpnAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSiteToSiteVpnAttachment(request);
    }

    @SdkInternalApi
    final CreateSiteToSiteVpnAttachmentResult executeCreateSiteToSiteVpnAttachment(CreateSiteToSiteVpnAttachmentRequest createSiteToSiteVpnAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createSiteToSiteVpnAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSiteToSiteVpnAttachmentRequest> request = null;
        Response<CreateSiteToSiteVpnAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSiteToSiteVpnAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createSiteToSiteVpnAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSiteToSiteVpnAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSiteToSiteVpnAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateSiteToSiteVpnAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a transit gateway peering connection.
     * </p>
     * 
     * @param createTransitGatewayPeeringRequest
     * @return Result of the CreateTransitGatewayPeering operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTransitGatewayPeeringResult createTransitGatewayPeering(CreateTransitGatewayPeeringRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTransitGatewayPeering(request);
    }

    @SdkInternalApi
    final CreateTransitGatewayPeeringResult executeCreateTransitGatewayPeering(CreateTransitGatewayPeeringRequest createTransitGatewayPeeringRequest) {

        ExecutionContext executionContext = createExecutionContext(createTransitGatewayPeeringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTransitGatewayPeeringRequest> request = null;
        Response<CreateTransitGatewayPeeringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTransitGatewayPeeringRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createTransitGatewayPeeringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTransitGatewayPeering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTransitGatewayPeeringResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateTransitGatewayPeeringResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a transit gateway route table attachment.
     * </p>
     * 
     * @param createTransitGatewayRouteTableAttachmentRequest
     * @return Result of the CreateTransitGatewayRouteTableAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateTransitGatewayRouteTableAttachmentResult createTransitGatewayRouteTableAttachment(CreateTransitGatewayRouteTableAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateTransitGatewayRouteTableAttachment(request);
    }

    @SdkInternalApi
    final CreateTransitGatewayRouteTableAttachmentResult executeCreateTransitGatewayRouteTableAttachment(
            CreateTransitGatewayRouteTableAttachmentRequest createTransitGatewayRouteTableAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createTransitGatewayRouteTableAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTransitGatewayRouteTableAttachmentRequest> request = null;
        Response<CreateTransitGatewayRouteTableAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTransitGatewayRouteTableAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createTransitGatewayRouteTableAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateTransitGatewayRouteTableAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateTransitGatewayRouteTableAttachmentResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateTransitGatewayRouteTableAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a VPC attachment on an edge location of a core network.
     * </p>
     * 
     * @param createVpcAttachmentRequest
     * @return Result of the CreateVpcAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateVpcAttachmentResult createVpcAttachment(CreateVpcAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVpcAttachment(request);
    }

    @SdkInternalApi
    final CreateVpcAttachmentResult executeCreateVpcAttachment(CreateVpcAttachmentRequest createVpcAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(createVpcAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVpcAttachmentRequest> request = null;
        Response<CreateVpcAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVpcAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVpcAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVpcAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVpcAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVpcAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an attachment. Supports all attachment types.
     * </p>
     * 
     * @param deleteAttachmentRequest
     * @return Result of the DeleteAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAttachmentResult deleteAttachment(DeleteAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAttachment(request);
    }

    @SdkInternalApi
    final DeleteAttachmentResult executeDeleteAttachment(DeleteAttachmentRequest deleteAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAttachmentRequest> request = null;
        Response<DeleteAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Connect peer.
     * </p>
     * 
     * @param deleteConnectPeerRequest
     * @return Result of the DeleteConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConnectPeerResult deleteConnectPeer(DeleteConnectPeerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnectPeer(request);
    }

    @SdkInternalApi
    final DeleteConnectPeerResult executeDeleteConnectPeer(DeleteConnectPeerRequest deleteConnectPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectPeerRequest> request = null;
        Response<DeleteConnectPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectPeerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnectPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified connection in your global network.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConnectionResult deleteConnection(DeleteConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConnection(request);
    }

    @SdkInternalApi
    final DeleteConnectionResult executeDeleteConnection(DeleteConnectionRequest deleteConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConnectionRequest> request = null;
        Response<DeleteConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a core network along with all core network policies. This can only be done if there are no attachments on
     * a core network.
     * </p>
     * 
     * @param deleteCoreNetworkRequest
     * @return Result of the DeleteCoreNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCoreNetworkResult deleteCoreNetwork(DeleteCoreNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCoreNetwork(request);
    }

    @SdkInternalApi
    final DeleteCoreNetworkResult executeDeleteCoreNetwork(DeleteCoreNetworkRequest deleteCoreNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCoreNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCoreNetworkRequest> request = null;
        Response<DeleteCoreNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCoreNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCoreNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCoreNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCoreNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCoreNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a policy version from a core network. You can't delete the current LIVE policy.
     * </p>
     * 
     * @param deleteCoreNetworkPolicyVersionRequest
     * @return Result of the DeleteCoreNetworkPolicyVersion operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.DeleteCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCoreNetworkPolicyVersionResult deleteCoreNetworkPolicyVersion(DeleteCoreNetworkPolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCoreNetworkPolicyVersion(request);
    }

    @SdkInternalApi
    final DeleteCoreNetworkPolicyVersionResult executeDeleteCoreNetworkPolicyVersion(DeleteCoreNetworkPolicyVersionRequest deleteCoreNetworkPolicyVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCoreNetworkPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCoreNetworkPolicyVersionRequest> request = null;
        Response<DeleteCoreNetworkPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCoreNetworkPolicyVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCoreNetworkPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCoreNetworkPolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCoreNetworkPolicyVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCoreNetworkPolicyVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeviceResult deleteDevice(DeleteDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDevice(request);
    }

    @SdkInternalApi
    final DeleteDeviceResult executeDeleteDevice(DeleteDeviceRequest deleteDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceRequest> request = null;
        Response<DeleteDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites),
     * deregister all transit gateways, and delete any core networks.
     * </p>
     * 
     * @param deleteGlobalNetworkRequest
     * @return Result of the DeleteGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteGlobalNetworkResult deleteGlobalNetwork(DeleteGlobalNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteGlobalNetwork(request);
    }

    @SdkInternalApi
    final DeleteGlobalNetworkResult executeDeleteGlobalNetwork(DeleteGlobalNetworkRequest deleteGlobalNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteGlobalNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteGlobalNetworkRequest> request = null;
        Response<DeleteGlobalNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteGlobalNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteGlobalNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteGlobalNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteGlobalNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteGlobalNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
     * </p>
     * 
     * @param deleteLinkRequest
     * @return Result of the DeleteLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLinkResult deleteLink(DeleteLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLink(request);
    }

    @SdkInternalApi
    final DeleteLinkResult executeDeleteLink(DeleteLinkRequest deleteLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLinkRequest> request = null;
        Response<DeleteLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing peering connection.
     * </p>
     * 
     * @param deletePeeringRequest
     * @return Result of the DeletePeering operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeletePeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeletePeering" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeletePeeringResult deletePeering(DeletePeeringRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePeering(request);
    }

    @SdkInternalApi
    final DeletePeeringResult executeDeletePeering(DeletePeeringRequest deletePeeringRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePeeringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePeeringRequest> request = null;
        Response<DeletePeeringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePeeringRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePeeringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePeering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePeeringResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePeeringResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a resource policy for the specified resource. This revokes the access of the principals specified in the
     * resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourcePolicy(request);
    }

    @SdkInternalApi
    final DeleteResourcePolicyResult executeDeleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourcePolicyRequest> request = null;
        Response<DeleteResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing site. The site cannot be associated with any device or link.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSiteResult deleteSite(DeleteSiteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSite(request);
    }

    @SdkInternalApi
    final DeleteSiteResult executeDeleteSite(DeleteSiteRequest deleteSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSiteRequest> request = null;
        Response<DeleteSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or
     * modify any of its attachments. This action removes any customer gateway associations.
     * </p>
     * 
     * @param deregisterTransitGatewayRequest
     * @return Result of the DeregisterTransitGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeregisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeregisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterTransitGatewayResult deregisterTransitGateway(DeregisterTransitGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterTransitGateway(request);
    }

    @SdkInternalApi
    final DeregisterTransitGatewayResult executeDeregisterTransitGateway(DeregisterTransitGatewayRequest deregisterTransitGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterTransitGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTransitGatewayRequest> request = null;
        Response<DeregisterTransitGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTransitGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterTransitGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterTransitGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterTransitGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterTransitGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more global networks. By default, all global networks are described. To describe the objects in
     * your global network, you must use the appropriate <code>Get*</code> action. For example, to list the transit
     * gateways in your global network, use <a>GetTransitGatewayRegistrations</a>.
     * </p>
     * 
     * @param describeGlobalNetworksRequest
     * @return Result of the DescribeGlobalNetworks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DescribeGlobalNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DescribeGlobalNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeGlobalNetworksResult describeGlobalNetworks(DescribeGlobalNetworksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeGlobalNetworks(request);
    }

    @SdkInternalApi
    final DescribeGlobalNetworksResult executeDescribeGlobalNetworks(DescribeGlobalNetworksRequest describeGlobalNetworksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeGlobalNetworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeGlobalNetworksRequest> request = null;
        Response<DescribeGlobalNetworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeGlobalNetworksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeGlobalNetworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeGlobalNetworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeGlobalNetworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeGlobalNetworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a core network Connect peer from a device and a link.
     * </p>
     * 
     * @param disassociateConnectPeerRequest
     * @return Result of the DisassociateConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateConnectPeerResult disassociateConnectPeer(DisassociateConnectPeerRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateConnectPeer(request);
    }

    @SdkInternalApi
    final DisassociateConnectPeerResult executeDisassociateConnectPeer(DisassociateConnectPeerRequest disassociateConnectPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateConnectPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateConnectPeerRequest> request = null;
        Response<DisassociateConnectPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateConnectPeerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateConnectPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateConnectPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateConnectPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateConnectPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a customer gateway from a device and a link.
     * </p>
     * 
     * @param disassociateCustomerGatewayRequest
     * @return Result of the DisassociateCustomerGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateCustomerGatewayResult disassociateCustomerGateway(DisassociateCustomerGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateCustomerGateway(request);
    }

    @SdkInternalApi
    final DisassociateCustomerGatewayResult executeDisassociateCustomerGateway(DisassociateCustomerGatewayRequest disassociateCustomerGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateCustomerGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateCustomerGatewayRequest> request = null;
        Response<DisassociateCustomerGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateCustomerGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateCustomerGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateCustomerGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateCustomerGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateCustomerGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates an existing device from a link. You must first disassociate any customer gateways that are
     * associated with the link.
     * </p>
     * 
     * @param disassociateLinkRequest
     * @return Result of the DisassociateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateLink"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateLinkResult disassociateLink(DisassociateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateLink(request);
    }

    @SdkInternalApi
    final DisassociateLinkResult executeDisassociateLink(DisassociateLinkRequest disassociateLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateLinkRequest> request = null;
        Response<DisassociateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateLinkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a transit gateway Connect peer from a device and link.
     * </p>
     * 
     * @param disassociateTransitGatewayConnectPeerRequest
     * @return Result of the DisassociateTransitGatewayConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateTransitGatewayConnectPeerResult disassociateTransitGatewayConnectPeer(DisassociateTransitGatewayConnectPeerRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateTransitGatewayConnectPeer(request);
    }

    @SdkInternalApi
    final DisassociateTransitGatewayConnectPeerResult executeDisassociateTransitGatewayConnectPeer(
            DisassociateTransitGatewayConnectPeerRequest disassociateTransitGatewayConnectPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateTransitGatewayConnectPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateTransitGatewayConnectPeerRequest> request = null;
        Response<DisassociateTransitGatewayConnectPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateTransitGatewayConnectPeerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateTransitGatewayConnectPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateTransitGatewayConnectPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateTransitGatewayConnectPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateTransitGatewayConnectPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Executes a change set on your core network. Deploys changes globally based on the policy submitted..
     * </p>
     * 
     * @param executeCoreNetworkChangeSetRequest
     * @return Result of the ExecuteCoreNetworkChangeSet operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.ExecuteCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ExecuteCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ExecuteCoreNetworkChangeSetResult executeCoreNetworkChangeSet(ExecuteCoreNetworkChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeExecuteCoreNetworkChangeSet(request);
    }

    @SdkInternalApi
    final ExecuteCoreNetworkChangeSetResult executeExecuteCoreNetworkChangeSet(ExecuteCoreNetworkChangeSetRequest executeCoreNetworkChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(executeCoreNetworkChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ExecuteCoreNetworkChangeSetRequest> request = null;
        Response<ExecuteCoreNetworkChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ExecuteCoreNetworkChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(executeCoreNetworkChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ExecuteCoreNetworkChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ExecuteCoreNetworkChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ExecuteCoreNetworkChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a core network Connect attachment.
     * </p>
     * 
     * @param getConnectAttachmentRequest
     * @return Result of the GetConnectAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConnectAttachmentResult getConnectAttachment(GetConnectAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnectAttachment(request);
    }

    @SdkInternalApi
    final GetConnectAttachmentResult executeGetConnectAttachment(GetConnectAttachmentRequest getConnectAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectAttachmentRequest> request = null;
        Response<GetConnectAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnectAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a core network Connect peer.
     * </p>
     * 
     * @param getConnectPeerRequest
     * @return Result of the GetConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetConnectPeerResult getConnectPeer(GetConnectPeerRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnectPeer(request);
    }

    @SdkInternalApi
    final GetConnectPeerResult executeGetConnectPeer(GetConnectPeerRequest getConnectPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectPeerRequest> request = null;
        Response<GetConnectPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectPeerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnectPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a core network Connect peer associations.
     * </p>
     * 
     * @param getConnectPeerAssociationsRequest
     * @return Result of the GetConnectPeerAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnectPeerAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConnectPeerAssociationsResult getConnectPeerAssociations(GetConnectPeerAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnectPeerAssociations(request);
    }

    @SdkInternalApi
    final GetConnectPeerAssociationsResult executeGetConnectPeerAssociations(GetConnectPeerAssociationsRequest getConnectPeerAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectPeerAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectPeerAssociationsRequest> request = null;
        Response<GetConnectPeerAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectPeerAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConnectPeerAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnectPeerAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectPeerAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConnectPeerAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more of your connections in a global network.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return Result of the GetConnections operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnections" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetConnectionsResult getConnections(GetConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnections(request);
    }

    @SdkInternalApi
    final GetConnectionsResult executeGetConnections(GetConnectionsRequest getConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionsRequest> request = null;
        Response<GetConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the LIVE policy for a core network.
     * </p>
     * 
     * @param getCoreNetworkRequest
     * @return Result of the GetCoreNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetCoreNetworkResult getCoreNetwork(GetCoreNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeGetCoreNetwork(request);
    }

    @SdkInternalApi
    final GetCoreNetworkResult executeGetCoreNetwork(GetCoreNetworkRequest getCoreNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(getCoreNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCoreNetworkRequest> request = null;
        Response<GetCoreNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCoreNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCoreNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCoreNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCoreNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCoreNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a core network change event.
     * </p>
     * 
     * @param getCoreNetworkChangeEventsRequest
     * @return Result of the GetCoreNetworkChangeEvents operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetworkChangeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCoreNetworkChangeEventsResult getCoreNetworkChangeEvents(GetCoreNetworkChangeEventsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCoreNetworkChangeEvents(request);
    }

    @SdkInternalApi
    final GetCoreNetworkChangeEventsResult executeGetCoreNetworkChangeEvents(GetCoreNetworkChangeEventsRequest getCoreNetworkChangeEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCoreNetworkChangeEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCoreNetworkChangeEventsRequest> request = null;
        Response<GetCoreNetworkChangeEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCoreNetworkChangeEventsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCoreNetworkChangeEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCoreNetworkChangeEvents");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCoreNetworkChangeEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCoreNetworkChangeEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a change set between the LIVE core network policy and a submitted policy.
     * </p>
     * 
     * @param getCoreNetworkChangeSetRequest
     * @return Result of the GetCoreNetworkChangeSet operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCoreNetworkChangeSetResult getCoreNetworkChangeSet(GetCoreNetworkChangeSetRequest request) {
        request = beforeClientExecution(request);
        return executeGetCoreNetworkChangeSet(request);
    }

    @SdkInternalApi
    final GetCoreNetworkChangeSetResult executeGetCoreNetworkChangeSet(GetCoreNetworkChangeSetRequest getCoreNetworkChangeSetRequest) {

        ExecutionContext executionContext = createExecutionContext(getCoreNetworkChangeSetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCoreNetworkChangeSetRequest> request = null;
        Response<GetCoreNetworkChangeSetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCoreNetworkChangeSetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCoreNetworkChangeSetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCoreNetworkChangeSet");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCoreNetworkChangeSetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCoreNetworkChangeSetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns details about a core network policy. You can get details about your current live policy or any previous
     * policy version.
     * </p>
     * 
     * @param getCoreNetworkPolicyRequest
     * @return Result of the GetCoreNetworkPolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCoreNetworkPolicyResult getCoreNetworkPolicy(GetCoreNetworkPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetCoreNetworkPolicy(request);
    }

    @SdkInternalApi
    final GetCoreNetworkPolicyResult executeGetCoreNetworkPolicy(GetCoreNetworkPolicyRequest getCoreNetworkPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getCoreNetworkPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCoreNetworkPolicyRequest> request = null;
        Response<GetCoreNetworkPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCoreNetworkPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCoreNetworkPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCoreNetworkPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCoreNetworkPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCoreNetworkPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the association information for customer gateways that are associated with devices and links in your global
     * network.
     * </p>
     * 
     * @param getCustomerGatewayAssociationsRequest
     * @return Result of the GetCustomerGatewayAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCustomerGatewayAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCustomerGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetCustomerGatewayAssociationsResult getCustomerGatewayAssociations(GetCustomerGatewayAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetCustomerGatewayAssociations(request);
    }

    @SdkInternalApi
    final GetCustomerGatewayAssociationsResult executeGetCustomerGatewayAssociations(GetCustomerGatewayAssociationsRequest getCustomerGatewayAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getCustomerGatewayAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCustomerGatewayAssociationsRequest> request = null;
        Response<GetCustomerGatewayAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCustomerGatewayAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getCustomerGatewayAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCustomerGatewayAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCustomerGatewayAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetCustomerGatewayAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more of your devices in a global network.
     * </p>
     * 
     * @param getDevicesRequest
     * @return Result of the GetDevices operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetDevices" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDevicesResult getDevices(GetDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevices(request);
    }

    @SdkInternalApi
    final GetDevicesResult executeGetDevices(GetDevicesRequest getDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(getDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDevicesRequest> request = null;
        Response<GetDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDevicesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
     * </p>
     * 
     * @param getLinkAssociationsRequest
     * @return Result of the GetLinkAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetLinkAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinkAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetLinkAssociationsResult getLinkAssociations(GetLinkAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetLinkAssociations(request);
    }

    @SdkInternalApi
    final GetLinkAssociationsResult executeGetLinkAssociations(GetLinkAssociationsRequest getLinkAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getLinkAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLinkAssociationsRequest> request = null;
        Response<GetLinkAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLinkAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLinkAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLinkAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLinkAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLinkAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more links in a specified global network.
     * </p>
     * <p>
     * If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type
     * and provider in the same request.
     * </p>
     * 
     * @param getLinksRequest
     * @return Result of the GetLinks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinks" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetLinksResult getLinks(GetLinksRequest request) {
        request = beforeClientExecution(request);
        return executeGetLinks(request);
    }

    @SdkInternalApi
    final GetLinksResult executeGetLinks(GetLinksRequest getLinksRequest) {

        ExecutionContext executionContext = createExecutionContext(getLinksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetLinksRequest> request = null;
        Response<GetLinksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetLinksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getLinksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetLinks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetLinksResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetLinksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the count of network resources, by resource type, for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceCountsRequest
     * @return Result of the GetNetworkResourceCounts operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkResourceCountsResult getNetworkResourceCounts(GetNetworkResourceCountsRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkResourceCounts(request);
    }

    @SdkInternalApi
    final GetNetworkResourceCountsResult executeGetNetworkResourceCounts(GetNetworkResourceCountsRequest getNetworkResourceCountsRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkResourceCountsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkResourceCountsRequest> request = null;
        Response<GetNetworkResourceCountsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkResourceCountsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getNetworkResourceCountsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkResourceCounts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkResourceCountsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetNetworkResourceCountsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the network resource relationships for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceRelationshipsRequest
     * @return Result of the GetNetworkResourceRelationships operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkResourceRelationships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceRelationships"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkResourceRelationshipsResult getNetworkResourceRelationships(GetNetworkResourceRelationshipsRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkResourceRelationships(request);
    }

    @SdkInternalApi
    final GetNetworkResourceRelationshipsResult executeGetNetworkResourceRelationships(
            GetNetworkResourceRelationshipsRequest getNetworkResourceRelationshipsRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkResourceRelationshipsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkResourceRelationshipsRequest> request = null;
        Response<GetNetworkResourceRelationshipsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkResourceRelationshipsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getNetworkResourceRelationshipsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkResourceRelationships");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkResourceRelationshipsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetNetworkResourceRelationshipsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the network resources for the specified global network.
     * </p>
     * <p>
     * The results include information from the corresponding Describe call for the resource, minus any sensitive
     * information such as pre-shared keys.
     * </p>
     * 
     * @param getNetworkResourcesRequest
     * @return Result of the GetNetworkResources operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkResourcesResult getNetworkResources(GetNetworkResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkResources(request);
    }

    @SdkInternalApi
    final GetNetworkResourcesResult executeGetNetworkResources(GetNetworkResourcesRequest getNetworkResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkResourcesRequest> request = null;
        Response<GetNetworkResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkResourcesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the network routes of the specified global network.
     * </p>
     * 
     * @param getNetworkRoutesRequest
     * @return Result of the GetNetworkRoutes operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkRoutesResult getNetworkRoutes(GetNetworkRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkRoutes(request);
    }

    @SdkInternalApi
    final GetNetworkRoutesResult executeGetNetworkRoutes(GetNetworkRoutesRequest getNetworkRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkRoutesRequest> request = null;
        Response<GetNetworkRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkRoutesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkRoutesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkRoutesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the network telemetry of the specified global network.
     * </p>
     * 
     * @param getNetworkTelemetryRequest
     * @return Result of the GetNetworkTelemetry operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkTelemetry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkTelemetry"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetNetworkTelemetryResult getNetworkTelemetry(GetNetworkTelemetryRequest request) {
        request = beforeClientExecution(request);
        return executeGetNetworkTelemetry(request);
    }

    @SdkInternalApi
    final GetNetworkTelemetryResult executeGetNetworkTelemetry(GetNetworkTelemetryRequest getNetworkTelemetryRequest) {

        ExecutionContext executionContext = createExecutionContext(getNetworkTelemetryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetNetworkTelemetryRequest> request = null;
        Response<GetNetworkTelemetryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetNetworkTelemetryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getNetworkTelemetryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetNetworkTelemetry");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetNetworkTelemetryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetNetworkTelemetryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResourcePolicy(request);
    }

    @SdkInternalApi
    final GetResourcePolicyResult executeGetResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResourcePolicyRequest> request = null;
        Response<GetResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the specified route analysis.
     * </p>
     * 
     * @param getRouteAnalysisRequest
     * @return Result of the GetRouteAnalysis operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRouteAnalysisResult getRouteAnalysis(GetRouteAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeGetRouteAnalysis(request);
    }

    @SdkInternalApi
    final GetRouteAnalysisResult executeGetRouteAnalysis(GetRouteAnalysisRequest getRouteAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(getRouteAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRouteAnalysisRequest> request = null;
        Response<GetRouteAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRouteAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRouteAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRouteAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRouteAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRouteAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a site-to-site VPN attachment.
     * </p>
     * 
     * @param getSiteToSiteVpnAttachmentRequest
     * @return Result of the GetSiteToSiteVpnAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetSiteToSiteVpnAttachmentResult getSiteToSiteVpnAttachment(GetSiteToSiteVpnAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetSiteToSiteVpnAttachment(request);
    }

    @SdkInternalApi
    final GetSiteToSiteVpnAttachmentResult executeGetSiteToSiteVpnAttachment(GetSiteToSiteVpnAttachmentRequest getSiteToSiteVpnAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getSiteToSiteVpnAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSiteToSiteVpnAttachmentRequest> request = null;
        Response<GetSiteToSiteVpnAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSiteToSiteVpnAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getSiteToSiteVpnAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSiteToSiteVpnAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSiteToSiteVpnAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetSiteToSiteVpnAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more of your sites in a global network.
     * </p>
     * 
     * @param getSitesRequest
     * @return Result of the GetSites operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSites" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetSitesResult getSites(GetSitesRequest request) {
        request = beforeClientExecution(request);
        return executeGetSites(request);
    }

    @SdkInternalApi
    final GetSitesResult executeGetSites(GetSitesRequest getSitesRequest) {

        ExecutionContext executionContext = createExecutionContext(getSitesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSitesRequest> request = null;
        Response<GetSitesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSitesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSitesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSites");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSitesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSitesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about one or more of your transit gateway Connect peer associations in a global network.
     * </p>
     * 
     * @param getTransitGatewayConnectPeerAssociationsRequest
     * @return Result of the GetTransitGatewayConnectPeerAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayConnectPeerAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTransitGatewayConnectPeerAssociationsResult getTransitGatewayConnectPeerAssociations(GetTransitGatewayConnectPeerAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransitGatewayConnectPeerAssociations(request);
    }

    @SdkInternalApi
    final GetTransitGatewayConnectPeerAssociationsResult executeGetTransitGatewayConnectPeerAssociations(
            GetTransitGatewayConnectPeerAssociationsRequest getTransitGatewayConnectPeerAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransitGatewayConnectPeerAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransitGatewayConnectPeerAssociationsRequest> request = null;
        Response<GetTransitGatewayConnectPeerAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransitGatewayConnectPeerAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTransitGatewayConnectPeerAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransitGatewayConnectPeerAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransitGatewayConnectPeerAssociationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetTransitGatewayConnectPeerAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a transit gateway peer.
     * </p>
     * 
     * @param getTransitGatewayPeeringRequest
     * @return Result of the GetTransitGatewayPeering operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTransitGatewayPeeringResult getTransitGatewayPeering(GetTransitGatewayPeeringRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransitGatewayPeering(request);
    }

    @SdkInternalApi
    final GetTransitGatewayPeeringResult executeGetTransitGatewayPeering(GetTransitGatewayPeeringRequest getTransitGatewayPeeringRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransitGatewayPeeringRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransitGatewayPeeringRequest> request = null;
        Response<GetTransitGatewayPeeringResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransitGatewayPeeringRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTransitGatewayPeeringRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransitGatewayPeering");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransitGatewayPeeringResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTransitGatewayPeeringResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about the transit gateway registrations in a specified global network.
     * </p>
     * 
     * @param getTransitGatewayRegistrationsRequest
     * @return Result of the GetTransitGatewayRegistrations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTransitGatewayRegistrationsResult getTransitGatewayRegistrations(GetTransitGatewayRegistrationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransitGatewayRegistrations(request);
    }

    @SdkInternalApi
    final GetTransitGatewayRegistrationsResult executeGetTransitGatewayRegistrations(GetTransitGatewayRegistrationsRequest getTransitGatewayRegistrationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransitGatewayRegistrationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransitGatewayRegistrationsRequest> request = null;
        Response<GetTransitGatewayRegistrationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransitGatewayRegistrationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTransitGatewayRegistrationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransitGatewayRegistrations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransitGatewayRegistrationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTransitGatewayRegistrationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a transit gateway route table attachment.
     * </p>
     * 
     * @param getTransitGatewayRouteTableAttachmentRequest
     * @return Result of the GetTransitGatewayRouteTableAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetTransitGatewayRouteTableAttachmentResult getTransitGatewayRouteTableAttachment(GetTransitGatewayRouteTableAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetTransitGatewayRouteTableAttachment(request);
    }

    @SdkInternalApi
    final GetTransitGatewayRouteTableAttachmentResult executeGetTransitGatewayRouteTableAttachment(
            GetTransitGatewayRouteTableAttachmentRequest getTransitGatewayRouteTableAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getTransitGatewayRouteTableAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTransitGatewayRouteTableAttachmentRequest> request = null;
        Response<GetTransitGatewayRouteTableAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTransitGatewayRouteTableAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getTransitGatewayRouteTableAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetTransitGatewayRouteTableAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTransitGatewayRouteTableAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetTransitGatewayRouteTableAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a VPC attachment.
     * </p>
     * 
     * @param getVpcAttachmentRequest
     * @return Result of the GetVpcAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetVpcAttachmentResult getVpcAttachment(GetVpcAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeGetVpcAttachment(request);
    }

    @SdkInternalApi
    final GetVpcAttachmentResult executeGetVpcAttachment(GetVpcAttachmentRequest getVpcAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(getVpcAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetVpcAttachmentRequest> request = null;
        Response<GetVpcAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetVpcAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getVpcAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetVpcAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetVpcAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetVpcAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of core network attachments.
     * </p>
     * 
     * @param listAttachmentsRequest
     * @return Result of the ListAttachments operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListAttachments" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAttachmentsResult listAttachments(ListAttachmentsRequest request) {
        request = beforeClientExecution(request);
        return executeListAttachments(request);
    }

    @SdkInternalApi
    final ListAttachmentsResult executeListAttachments(ListAttachmentsRequest listAttachmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAttachmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachmentsRequest> request = null;
        Response<ListAttachmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachmentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAttachmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAttachments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAttachmentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAttachmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of core network Connect peers.
     * </p>
     * 
     * @param listConnectPeersRequest
     * @return Result of the ListConnectPeers operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListConnectPeers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListConnectPeers"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConnectPeersResult listConnectPeers(ListConnectPeersRequest request) {
        request = beforeClientExecution(request);
        return executeListConnectPeers(request);
    }

    @SdkInternalApi
    final ListConnectPeersResult executeListConnectPeers(ListConnectPeersRequest listConnectPeersRequest) {

        ExecutionContext executionContext = createExecutionContext(listConnectPeersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConnectPeersRequest> request = null;
        Response<ListConnectPeersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConnectPeersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listConnectPeersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConnectPeers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListConnectPeersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListConnectPeersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of core network policy versions.
     * </p>
     * 
     * @param listCoreNetworkPolicyVersionsRequest
     * @return Result of the ListCoreNetworkPolicyVersions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListCoreNetworkPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworkPolicyVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCoreNetworkPolicyVersionsResult listCoreNetworkPolicyVersions(ListCoreNetworkPolicyVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListCoreNetworkPolicyVersions(request);
    }

    @SdkInternalApi
    final ListCoreNetworkPolicyVersionsResult executeListCoreNetworkPolicyVersions(ListCoreNetworkPolicyVersionsRequest listCoreNetworkPolicyVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCoreNetworkPolicyVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCoreNetworkPolicyVersionsRequest> request = null;
        Response<ListCoreNetworkPolicyVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCoreNetworkPolicyVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCoreNetworkPolicyVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCoreNetworkPolicyVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCoreNetworkPolicyVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCoreNetworkPolicyVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of owned and shared core networks.
     * </p>
     * 
     * @param listCoreNetworksRequest
     * @return Result of the ListCoreNetworks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListCoreNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCoreNetworksResult listCoreNetworks(ListCoreNetworksRequest request) {
        request = beforeClientExecution(request);
        return executeListCoreNetworks(request);
    }

    @SdkInternalApi
    final ListCoreNetworksResult executeListCoreNetworks(ListCoreNetworksRequest listCoreNetworksRequest) {

        ExecutionContext executionContext = createExecutionContext(listCoreNetworksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCoreNetworksRequest> request = null;
        Response<ListCoreNetworksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCoreNetworksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCoreNetworksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCoreNetworks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCoreNetworksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCoreNetworksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the status of the Service Linked Role (SLR) deployment for the accounts in a given Amazon Web Services
     * Organization.
     * </p>
     * 
     * @param listOrganizationServiceAccessStatusRequest
     * @return Result of the ListOrganizationServiceAccessStatus operation returned by the service.
     * @sample AWSNetworkManager.ListOrganizationServiceAccessStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListOrganizationServiceAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListOrganizationServiceAccessStatusResult listOrganizationServiceAccessStatus(ListOrganizationServiceAccessStatusRequest request) {
        request = beforeClientExecution(request);
        return executeListOrganizationServiceAccessStatus(request);
    }

    @SdkInternalApi
    final ListOrganizationServiceAccessStatusResult executeListOrganizationServiceAccessStatus(
            ListOrganizationServiceAccessStatusRequest listOrganizationServiceAccessStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(listOrganizationServiceAccessStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListOrganizationServiceAccessStatusRequest> request = null;
        Response<ListOrganizationServiceAccessStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListOrganizationServiceAccessStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listOrganizationServiceAccessStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListOrganizationServiceAccessStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListOrganizationServiceAccessStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListOrganizationServiceAccessStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the peerings for a core network.
     * </p>
     * 
     * @param listPeeringsRequest
     * @return Result of the ListPeerings operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListPeerings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListPeerings" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListPeeringsResult listPeerings(ListPeeringsRequest request) {
        request = beforeClientExecution(request);
        return executeListPeerings(request);
    }

    @SdkInternalApi
    final ListPeeringsResult executeListPeerings(ListPeeringsRequest listPeeringsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPeeringsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPeeringsRequest> request = null;
        Response<ListPeeringsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPeeringsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPeeringsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPeerings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPeeringsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPeeringsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
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
     * Creates a new, immutable version of a core network policy. A subsequent change set is created showing the
     * differences between the LIVE policy and the submitted policy.
     * </p>
     * 
     * @param putCoreNetworkPolicyRequest
     * @return Result of the PutCoreNetworkPolicy operation returned by the service.
     * @throws CoreNetworkPolicyException
     *         Describes a core network policy exception.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.PutCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutCoreNetworkPolicyResult putCoreNetworkPolicy(PutCoreNetworkPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutCoreNetworkPolicy(request);
    }

    @SdkInternalApi
    final PutCoreNetworkPolicyResult executePutCoreNetworkPolicy(PutCoreNetworkPolicyRequest putCoreNetworkPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putCoreNetworkPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutCoreNetworkPolicyRequest> request = null;
        Response<PutCoreNetworkPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutCoreNetworkPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putCoreNetworkPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutCoreNetworkPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutCoreNetworkPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutCoreNetworkPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates or updates a resource policy.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResourcePolicy(request);
    }

    @SdkInternalApi
    final PutResourcePolicyResult executePutResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourcePolicyRequest> request = null;
        Response<PutResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a transit gateway in your global network. The transit gateway can be in any Amazon Web Services Region,
     * but it must be owned by the same Amazon Web Services account that owns the global network. You cannot register a
     * transit gateway in more than one global network.
     * </p>
     * 
     * @param registerTransitGatewayRequest
     * @return Result of the RegisterTransitGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.RegisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RegisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterTransitGatewayResult registerTransitGateway(RegisterTransitGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterTransitGateway(request);
    }

    @SdkInternalApi
    final RegisterTransitGatewayResult executeRegisterTransitGateway(RegisterTransitGatewayRequest registerTransitGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(registerTransitGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTransitGatewayRequest> request = null;
        Response<RegisterTransitGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTransitGatewayRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerTransitGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterTransitGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterTransitGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterTransitGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Rejects a core network attachment request.
     * </p>
     * 
     * @param rejectAttachmentRequest
     * @return Result of the RejectAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.RejectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RejectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RejectAttachmentResult rejectAttachment(RejectAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeRejectAttachment(request);
    }

    @SdkInternalApi
    final RejectAttachmentResult executeRejectAttachment(RejectAttachmentRequest rejectAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectAttachmentRequest> request = null;
        Response<RejectAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RejectAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectAttachmentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a previous policy version as a new, immutable version of a core network policy. A subsequent change set
     * is created showing the differences between the LIVE policy and restored policy.
     * </p>
     * 
     * @param restoreCoreNetworkPolicyVersionRequest
     * @return Result of the RestoreCoreNetworkPolicyVersion operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.RestoreCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RestoreCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RestoreCoreNetworkPolicyVersionResult restoreCoreNetworkPolicyVersion(RestoreCoreNetworkPolicyVersionRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreCoreNetworkPolicyVersion(request);
    }

    @SdkInternalApi
    final RestoreCoreNetworkPolicyVersionResult executeRestoreCoreNetworkPolicyVersion(
            RestoreCoreNetworkPolicyVersionRequest restoreCoreNetworkPolicyVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreCoreNetworkPolicyVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreCoreNetworkPolicyVersionRequest> request = null;
        Response<RestoreCoreNetworkPolicyVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreCoreNetworkPolicyVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(restoreCoreNetworkPolicyVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreCoreNetworkPolicyVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreCoreNetworkPolicyVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RestoreCoreNetworkPolicyVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the Network Manager service for an Amazon Web Services Organization. This can only be called by a
     * management account within the organization.
     * </p>
     * 
     * @param startOrganizationServiceAccessUpdateRequest
     * @return Result of the StartOrganizationServiceAccessUpdate operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.StartOrganizationServiceAccessUpdate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartOrganizationServiceAccessUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartOrganizationServiceAccessUpdateResult startOrganizationServiceAccessUpdate(StartOrganizationServiceAccessUpdateRequest request) {
        request = beforeClientExecution(request);
        return executeStartOrganizationServiceAccessUpdate(request);
    }

    @SdkInternalApi
    final StartOrganizationServiceAccessUpdateResult executeStartOrganizationServiceAccessUpdate(
            StartOrganizationServiceAccessUpdateRequest startOrganizationServiceAccessUpdateRequest) {

        ExecutionContext executionContext = createExecutionContext(startOrganizationServiceAccessUpdateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartOrganizationServiceAccessUpdateRequest> request = null;
        Response<StartOrganizationServiceAccessUpdateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartOrganizationServiceAccessUpdateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startOrganizationServiceAccessUpdateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartOrganizationServiceAccessUpdate");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartOrganizationServiceAccessUpdateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartOrganizationServiceAccessUpdateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts analyzing the routing path between the specified source and destination. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/route-analyzer.html">Route Analyzer</a>.
     * </p>
     * 
     * @param startRouteAnalysisRequest
     * @return Result of the StartRouteAnalysis operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.StartRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartRouteAnalysisResult startRouteAnalysis(StartRouteAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeStartRouteAnalysis(request);
    }

    @SdkInternalApi
    final StartRouteAnalysisResult executeStartRouteAnalysis(StartRouteAnalysisRequest startRouteAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(startRouteAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartRouteAnalysisRequest> request = null;
        Response<StartRouteAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartRouteAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startRouteAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartRouteAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartRouteAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartRouteAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tags a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
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
     * Removes tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
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
     * Updates the information for an existing connection. To remove information for any of the parameters, specify an
     * empty string.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return Result of the UpdateConnection operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConnectionResult updateConnection(UpdateConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConnection(request);
    }

    @SdkInternalApi
    final UpdateConnectionResult executeUpdateConnection(UpdateConnectionRequest updateConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConnectionRequest> request = null;
        Response<UpdateConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the description of a core network.
     * </p>
     * 
     * @param updateCoreNetworkRequest
     * @return Result of the UpdateCoreNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCoreNetworkResult updateCoreNetwork(UpdateCoreNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCoreNetwork(request);
    }

    @SdkInternalApi
    final UpdateCoreNetworkResult executeUpdateCoreNetwork(UpdateCoreNetworkRequest updateCoreNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCoreNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCoreNetworkRequest> request = null;
        Response<UpdateCoreNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCoreNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCoreNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCoreNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCoreNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCoreNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details for an existing device. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDeviceResult updateDevice(UpdateDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDevice(request);
    }

    @SdkInternalApi
    final UpdateDeviceResult executeUpdateDevice(UpdateDeviceRequest updateDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceRequest> request = null;
        Response<UpdateDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDevice");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
     * </p>
     * 
     * @param updateGlobalNetworkRequest
     * @return Result of the UpdateGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateGlobalNetworkResult updateGlobalNetwork(UpdateGlobalNetworkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateGlobalNetwork(request);
    }

    @SdkInternalApi
    final UpdateGlobalNetworkResult executeUpdateGlobalNetwork(UpdateGlobalNetworkRequest updateGlobalNetworkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateGlobalNetworkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateGlobalNetworkRequest> request = null;
        Response<UpdateGlobalNetworkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateGlobalNetworkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateGlobalNetworkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateGlobalNetwork");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateGlobalNetworkResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateGlobalNetworkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the details for an existing link. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateLinkRequest
     * @return Result of the UpdateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLinkResult updateLink(UpdateLinkRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLink(request);
    }

    @SdkInternalApi
    final UpdateLinkResult executeUpdateLink(UpdateLinkRequest updateLinkRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLinkRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLinkRequest> request = null;
        Response<UpdateLinkResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLinkRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLinkRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLink");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLinkResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLinkResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the resource metadata for the specified global network.
     * </p>
     * 
     * @param updateNetworkResourceMetadataRequest
     * @return Result of the UpdateNetworkResourceMetadata operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateNetworkResourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateNetworkResourceMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateNetworkResourceMetadataResult updateNetworkResourceMetadata(UpdateNetworkResourceMetadataRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateNetworkResourceMetadata(request);
    }

    @SdkInternalApi
    final UpdateNetworkResourceMetadataResult executeUpdateNetworkResourceMetadata(UpdateNetworkResourceMetadataRequest updateNetworkResourceMetadataRequest) {

        ExecutionContext executionContext = createExecutionContext(updateNetworkResourceMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateNetworkResourceMetadataRequest> request = null;
        Response<UpdateNetworkResourceMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateNetworkResourceMetadataRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateNetworkResourceMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateNetworkResourceMetadata");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateNetworkResourceMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateNetworkResourceMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the information for an existing site. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateSiteRequest
     * @return Result of the UpdateSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSiteResult updateSite(UpdateSiteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSite(request);
    }

    @SdkInternalApi
    final UpdateSiteResult executeUpdateSite(UpdateSiteRequest updateSiteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSiteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSiteRequest> request = null;
        Response<UpdateSiteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSiteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSiteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSite");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSiteResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSiteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a VPC attachment.
     * </p>
     * 
     * @param updateVpcAttachmentRequest
     * @return Result of the UpdateVpcAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVpcAttachmentResult updateVpcAttachment(UpdateVpcAttachmentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVpcAttachment(request);
    }

    @SdkInternalApi
    final UpdateVpcAttachmentResult executeUpdateVpcAttachment(UpdateVpcAttachmentRequest updateVpcAttachmentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVpcAttachmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVpcAttachmentRequest> request = null;
        Response<UpdateVpcAttachmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVpcAttachmentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVpcAttachmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "NetworkManager");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVpcAttachment");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVpcAttachmentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVpcAttachmentResultJsonUnmarshaller());
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
