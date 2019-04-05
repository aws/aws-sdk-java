/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect;

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

import com.amazonaws.services.directconnect.AmazonDirectConnectClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.services.directconnect.model.transform.*;

/**
 * Client for accessing AWS Direct Connect. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
 * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. With this
 * connection in place, you can create virtual interfaces directly to the AWS cloud (for example, to Amazon EC2 and
 * Amazon S3) and to Amazon VPC, bypassing Internet service providers in your network path. A connection provides access
 * to all AWS Regions except the China (Beijing) and (China) Ningxia Regions. AWS resources in the China Regions can
 * only be accessed through locations associated with those Regions.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonDirectConnectClient extends AmazonWebServiceClient implements AmazonDirectConnect {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDirectConnect.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "directconnect";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateTagKeysException").withModeledClass(
                                    com.amazonaws.services.directconnect.model.DuplicateTagKeysException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withModeledClass(
                                    com.amazonaws.services.directconnect.model.TooManyTagsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectConnectServerException").withModeledClass(
                                    com.amazonaws.services.directconnect.model.DirectConnectServerException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DirectConnectClientException").withModeledClass(
                                    com.amazonaws.services.directconnect.model.DirectConnectClientException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.directconnect.model.AmazonDirectConnectException.class));

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonDirectConnectClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonDirectConnectClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect. A credentials provider chain will be
     * used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Direct Connect (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonDirectConnectClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDirectConnectClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonDirectConnectClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonDirectConnectClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonDirectConnectClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect using the specified AWS account
     * credentials and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Direct Connect (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonDirectConnectClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDirectConnectClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect using the specified AWS account
     * credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonDirectConnectClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect using the specified AWS account
     * credentials provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Direct Connect (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonDirectConnectClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect using the specified AWS account
     * credentials provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to AWS Direct Connect (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonDirectConnectClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonDirectConnectClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonDirectConnectClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonDirectConnectClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AmazonDirectConnectClientBuilder builder() {
        return AmazonDirectConnectClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDirectConnectClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Direct Connect using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonDirectConnectClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://directconnect.us-east-1.amazonaws.com/");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/directconnect/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/directconnect/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Accepts a proposal request to attach a virtual private gateway to a Direct Connect gateway.
     * </p>
     * 
     * @param acceptDirectConnectGatewayAssociationProposalRequest
     * @return Result of the AcceptDirectConnectGatewayAssociationProposal operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AcceptDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AcceptDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AcceptDirectConnectGatewayAssociationProposalResult acceptDirectConnectGatewayAssociationProposal(
            AcceptDirectConnectGatewayAssociationProposalRequest request) {
        request = beforeClientExecution(request);
        return executeAcceptDirectConnectGatewayAssociationProposal(request);
    }

    @SdkInternalApi
    final AcceptDirectConnectGatewayAssociationProposalResult executeAcceptDirectConnectGatewayAssociationProposal(
            AcceptDirectConnectGatewayAssociationProposalRequest acceptDirectConnectGatewayAssociationProposalRequest) {

        ExecutionContext executionContext = createExecutionContext(acceptDirectConnectGatewayAssociationProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AcceptDirectConnectGatewayAssociationProposalRequest> request = null;
        Response<AcceptDirectConnectGatewayAssociationProposalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AcceptDirectConnectGatewayAssociationProposalRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(acceptDirectConnectGatewayAssociationProposalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AcceptDirectConnectGatewayAssociationProposal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AcceptDirectConnectGatewayAssociationProposalResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AcceptDirectConnectGatewayAssociationProposalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecated. Use <a>AllocateHostedConnection</a> instead.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified
     * interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     * @return Result of the AllocateConnectionOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocateConnectionOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateConnectionOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest request) {
        request = beforeClientExecution(request);
        return executeAllocateConnectionOnInterconnect(request);
    }

    @SdkInternalApi
    final AllocateConnectionOnInterconnectResult executeAllocateConnectionOnInterconnect(
            AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest) {

        ExecutionContext executionContext = createExecutionContext(allocateConnectionOnInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateConnectionOnInterconnectRequest> request = null;
        Response<AllocateConnectionOnInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateConnectionOnInterconnectRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(allocateConnectionOnInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AllocateConnectionOnInterconnect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AllocateConnectionOnInterconnectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AllocateConnectionOnInterconnectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the
     * specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and
     * the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     * @return Result of the AllocateHostedConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeAllocateHostedConnection(request);
    }

    @SdkInternalApi
    final AllocateHostedConnectionResult executeAllocateHostedConnection(AllocateHostedConnectionRequest allocateHostedConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(allocateHostedConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateHostedConnectionRequest> request = null;
        Response<AllocateHostedConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateHostedConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(allocateHostedConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AllocateHostedConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AllocateHostedConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AllocateHostedConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provisions a private virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the owner using
     * <a>ConfirmPrivateVirtualInterface</a>. Until then, the virtual interface is in the <code>Confirming</code> state
     * and is not available to handle traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     * @return Result of the AllocatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeAllocatePrivateVirtualInterface(request);
    }

    @SdkInternalApi
    final AllocatePrivateVirtualInterfaceResult executeAllocatePrivateVirtualInterface(
            AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(allocatePrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocatePrivateVirtualInterfaceRequest> request = null;
        Response<AllocatePrivateVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocatePrivateVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(allocatePrivateVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AllocatePrivateVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AllocatePrivateVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AllocatePrivateVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provisions a public virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public virtual interface to be owned by the
     * specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the owner using
     * <a>ConfirmPublicVirtualInterface</a>. Until this step has been completed, the virtual interface is in the
     * <code>confirming</code> state and is not available to handle traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are
     * automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     * @return Result of the AllocatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeAllocatePublicVirtualInterface(request);
    }

    @SdkInternalApi
    final AllocatePublicVirtualInterfaceResult executeAllocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(allocatePublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocatePublicVirtualInterfaceRequest> request = null;
        Response<AllocatePublicVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocatePublicVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(allocatePublicVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AllocatePublicVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AllocatePublicVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AllocatePublicVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and
     * re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the
     * same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
     * re-associate a connection that's currently associated with a different LAG; however, if removing the connection
     * would cause the original LAG to fall below its setting for minimum number of operational connections, the request
     * fails.
     * </p>
     * <p>
     * Any virtual interfaces that are directly associated with the connection are automatically re-associated with the
     * LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated
     * with the original LAG.
     * </p>
     * <p>
     * For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was
     * originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     * </p>
     * 
     * @param associateConnectionWithLagRequest
     * @return Result of the AssociateConnectionWithLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AssociateConnectionWithLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateConnectionWithLag"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateConnectionWithLagResult associateConnectionWithLag(AssociateConnectionWithLagRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateConnectionWithLag(request);
    }

    @SdkInternalApi
    final AssociateConnectionWithLagResult executeAssociateConnectionWithLag(AssociateConnectionWithLagRequest associateConnectionWithLagRequest) {

        ExecutionContext executionContext = createExecutionContext(associateConnectionWithLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateConnectionWithLagRequest> request = null;
        Response<AssociateConnectionWithLagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateConnectionWithLagRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateConnectionWithLagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateConnectionWithLag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateConnectionWithLagResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateConnectionWithLagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If
     * the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address,
     * the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is
     * being migrated.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     * @return Result of the AssociateHostedConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AssociateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateHostedConnectionResult associateHostedConnection(AssociateHostedConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateHostedConnection(request);
    }

    @SdkInternalApi
    final AssociateHostedConnectionResult executeAssociateHostedConnection(AssociateHostedConnectionRequest associateHostedConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(associateHostedConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateHostedConnectionRequest> request = null;
        Response<AssociateHostedConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateHostedConnectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateHostedConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateHostedConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateHostedConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateHostedConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS
     * is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an
     * associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails.
     * </p>
     * <p>
     * Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must
     * be migrated along with their virtual interfaces using <a>AssociateHostedConnection</a>.
     * </p>
     * <p>
     * To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
     * interface itself or the connection to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG for the association.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     * @return Result of the AssociateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AssociateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateVirtualInterfaceResult associateVirtualInterface(AssociateVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateVirtualInterface(request);
    }

    @SdkInternalApi
    final AssociateVirtualInterfaceResult executeAssociateVirtualInterface(AssociateVirtualInterfaceRequest associateVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(associateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateVirtualInterfaceRequest> request = null;
        Response<AssociateVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Confirms the creation of the specified hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the <code>Ordering</code> state, and remains in this state
     * until the owner confirms creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     * @return Result of the ConfirmConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.ConfirmConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmConnection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest request) {
        request = beforeClientExecution(request);
        return executeConfirmConnection(request);
    }

    @SdkInternalApi
    final ConfirmConnectionResult executeConfirmConnection(ConfirmConnectionRequest confirmConnectionRequest) {

        ExecutionContext executionContext = createExecutionContext(confirmConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmConnectionRequest> request = null;
        Response<ConfirmConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmConnectionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(confirmConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfirmConnection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmConnectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ConfirmConnectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts ownership of a private virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the virtual interface is created and attached to the specified
     * virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     * @return Result of the ConfirmPrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.ConfirmPrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeConfirmPrivateVirtualInterface(request);
    }

    @SdkInternalApi
    final ConfirmPrivateVirtualInterfaceResult executeConfirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(confirmPrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmPrivateVirtualInterfaceRequest> request = null;
        Response<ConfirmPrivateVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmPrivateVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(confirmPrivateVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfirmPrivateVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmPrivateVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ConfirmPrivateVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Accepts ownership of a public virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the specified virtual interface is created and made available
     * to handle traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     * @return Result of the ConfirmPublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.ConfirmPublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeConfirmPublicVirtualInterface(request);
    }

    @SdkInternalApi
    final ConfirmPublicVirtualInterfaceResult executeConfirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(confirmPublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConfirmPublicVirtualInterfaceRequest> request = null;
        Response<ConfirmPublicVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConfirmPublicVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(confirmPublicVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ConfirmPublicVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ConfirmPublicVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ConfirmPublicVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a BGP peer on the specified virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that
     * also use that address family.
     * </p>
     * <p>
     * If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the
     * same address family as an existing BGP peer on the virtual interface.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically
     * assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
     * virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     * @return Result of the CreateBGPPeer operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateBGPPeerResult createBGPPeer(CreateBGPPeerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBGPPeer(request);
    }

    @SdkInternalApi
    final CreateBGPPeerResult executeCreateBGPPeer(CreateBGPPeerRequest createBGPPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(createBGPPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBGPPeerRequest> request = null;
        Response<CreateBGPPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBGPPeerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBGPPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBGPPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBGPPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBGPPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a connection between a customer network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * To find the locations for your Region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
     * specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateConnection" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
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
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual
     * interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after
     * it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect
     * gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the
     * Region in which the virtual interfaces are located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     * @return Result of the CreateDirectConnectGateway operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDirectConnectGatewayResult createDirectConnectGateway(CreateDirectConnectGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDirectConnectGateway(request);
    }

    @SdkInternalApi
    final CreateDirectConnectGatewayResult executeCreateDirectConnectGateway(CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(createDirectConnectGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectConnectGatewayRequest> request = null;
        Response<CreateDirectConnectGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectConnectGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDirectConnectGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDirectConnectGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDirectConnectGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDirectConnectGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private
     * gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     * @return Result of the CreateDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDirectConnectGatewayAssociationResult createDirectConnectGatewayAssociation(CreateDirectConnectGatewayAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDirectConnectGatewayAssociation(request);
    }

    @SdkInternalApi
    final CreateDirectConnectGatewayAssociationResult executeCreateDirectConnectGatewayAssociation(
            CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDirectConnectGatewayAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectConnectGatewayAssociationRequest> request = null;
        Response<CreateDirectConnectGatewayAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectConnectGatewayAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDirectConnectGatewayAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDirectConnectGatewayAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDirectConnectGatewayAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDirectConnectGatewayAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a proposal to associate the specified virtual private gateway with the specified Direct Connect gateway.
     * </p>
     * <p>
     * You can only associate a Direct Connect gateway and virtual private gateway when the account that owns the Direct
     * Connect gateway and the account that owns the virtual private gateway have the same payer ID.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationProposalRequest
     * @return Result of the CreateDirectConnectGatewayAssociationProposal operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDirectConnectGatewayAssociationProposalResult createDirectConnectGatewayAssociationProposal(
            CreateDirectConnectGatewayAssociationProposalRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDirectConnectGatewayAssociationProposal(request);
    }

    @SdkInternalApi
    final CreateDirectConnectGatewayAssociationProposalResult executeCreateDirectConnectGatewayAssociationProposal(
            CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest) {

        ExecutionContext executionContext = createExecutionContext(createDirectConnectGatewayAssociationProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectConnectGatewayAssociationProposalRequest> request = null;
        Response<CreateDirectConnectGatewayAssociationProposalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectConnectGatewayAssociationProposalRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDirectConnectGatewayAssociationProposalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDirectConnectGatewayAssociationProposal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDirectConnectGatewayAssociationProposalResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateDirectConnectGatewayAssociationProposalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect
     * location.
     * </p>
     * <p>
     * An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can
     * use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network
     * services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect
     * location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to
     * an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
     * the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is
     * created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling
     * <a>AllocateHostedConnection</a>. The end customer can then connect to AWS resources by creating a virtual
     * interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     * @return Result of the CreateInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInterconnectResult createInterconnect(CreateInterconnectRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInterconnect(request);
    }

    @SdkInternalApi
    final CreateInterconnectResult executeCreateInterconnect(CreateInterconnectRequest createInterconnectRequest) {

        ExecutionContext executionContext = createExecutionContext(createInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInterconnectRequest> request = null;
        Response<CreateInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInterconnectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateInterconnect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInterconnectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInterconnectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the
     * customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
     * Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single
     * interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint.
     * </p>
     * <p>
     * You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG
     * than AWS Direct Connect can allocate on a single endpoint, no LAG is created.
     * </p>
     * <p>
     * You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the
     * total number of connections). Doing so interrupts the current physical connection or hosted connections, and
     * re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to
     * which the connection terminates. Any virtual interfaces associated with the connection are automatically
     * disassociated and re-associated with the LAG. The connection ID does not change.
     * </p>
     * <p>
     * If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically
     * enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
     * directly configured.
     * </p>
     * 
     * @param createLagRequest
     * @return Result of the CreateLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateLag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateLagResult createLag(CreateLagRequest request) {
        request = beforeClientExecution(request);
        return executeCreateLag(request);
    }

    @SdkInternalApi
    final CreateLagResult executeCreateLag(CreateLagRequest createLagRequest) {

        ExecutionContext executionContext = createExecutionContext(createLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateLagRequest> request = null;
        Response<CreateLagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateLagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createLagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateLag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateLagResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateLagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic.
     * A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway
     * (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for
     * connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to
     * a VGW only provides access to a single VPC within the same Region.
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     * @return Result of the CreatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePrivateVirtualInterface(request);
    }

    @SdkInternalApi
    final CreatePrivateVirtualInterfaceResult executeCreatePrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createPrivateVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePrivateVirtualInterfaceRequest> request = null;
        Response<CreatePrivateVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePrivateVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPrivateVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePrivateVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePrivateVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePrivateVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A
     * public virtual interface supports sending traffic to public services of AWS such as Amazon S3.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (<code>addressFamily</code> is <code>ipv6</code>), leave the
     * <code>customer</code> and <code>amazon</code> address fields blank to use auto-assigned IPv6 space. Custom IPv6
     * addresses are not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     * @return Result of the CreatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePublicVirtualInterfaceResult createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePublicVirtualInterface(request);
    }

    @SdkInternalApi
    final CreatePublicVirtualInterfaceResult executeCreatePublicVirtualInterface(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(createPublicVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePublicVirtualInterfaceRequest> request = null;
        Response<CreatePublicVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePublicVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPublicVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePublicVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePublicVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePublicVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN.
     * </p>
     * <p>
     * You cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     * @return Result of the DeleteBGPPeer operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteBGPPeerResult deleteBGPPeer(DeleteBGPPeerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBGPPeer(request);
    }

    @SdkInternalApi
    final DeleteBGPPeerResult executeDeleteBGPPeer(DeleteBGPPeerRequest deleteBGPPeerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBGPPeerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBGPPeerRequest> request = null;
        Response<DeleteBGPPeerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBGPPeerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBGPPeerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBGPPeer");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBGPPeerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBGPPeerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are
     * partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service
     * with them separately.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteConnection" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
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
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to
     * the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct
     * Connect gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     * @return Result of the DeleteDirectConnectGateway operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDirectConnectGatewayResult deleteDirectConnectGateway(DeleteDirectConnectGatewayRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDirectConnectGateway(request);
    }

    @SdkInternalApi
    final DeleteDirectConnectGatewayResult executeDeleteDirectConnectGateway(DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDirectConnectGatewayRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectConnectGatewayRequest> request = null;
        Response<DeleteDirectConnectGatewayResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectConnectGatewayRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDirectConnectGatewayRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDirectConnectGateway");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDirectConnectGatewayResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDirectConnectGatewayResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     * @return Result of the DeleteDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDirectConnectGatewayAssociationResult deleteDirectConnectGatewayAssociation(DeleteDirectConnectGatewayAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDirectConnectGatewayAssociation(request);
    }

    @SdkInternalApi
    final DeleteDirectConnectGatewayAssociationResult executeDeleteDirectConnectGatewayAssociation(
            DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDirectConnectGatewayAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectConnectGatewayAssociationRequest> request = null;
        Response<DeleteDirectConnectGatewayAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectConnectGatewayAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDirectConnectGatewayAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDirectConnectGatewayAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDirectConnectGatewayAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDirectConnectGatewayAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the association proposal request between the specified Direct Connect gateway and virtual private
     * gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationProposalRequest
     * @return Result of the DeleteDirectConnectGatewayAssociationProposal operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDirectConnectGatewayAssociationProposalResult deleteDirectConnectGatewayAssociationProposal(
            DeleteDirectConnectGatewayAssociationProposalRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDirectConnectGatewayAssociationProposal(request);
    }

    @SdkInternalApi
    final DeleteDirectConnectGatewayAssociationProposalResult executeDeleteDirectConnectGatewayAssociationProposal(
            DeleteDirectConnectGatewayAssociationProposalRequest deleteDirectConnectGatewayAssociationProposalRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDirectConnectGatewayAssociationProposalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectConnectGatewayAssociationProposalRequest> request = null;
        Response<DeleteDirectConnectGatewayAssociationProposalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectConnectGatewayAssociationProposalRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDirectConnectGatewayAssociationProposalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDirectConnectGatewayAssociationProposal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDirectConnectGatewayAssociationProposalResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DeleteDirectConnectGatewayAssociationProposalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     * @return Result of the DeleteInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInterconnect(request);
    }

    @SdkInternalApi
    final DeleteInterconnectResult executeDeleteInterconnect(DeleteInterconnectRequest deleteInterconnectRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInterconnectRequest> request = null;
        Response<DeleteInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInterconnectRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInterconnect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInterconnectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInterconnectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces
     * or hosted connections.
     * </p>
     * 
     * @param deleteLagRequest
     * @return Result of the DeleteLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteLag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteLagResult deleteLag(DeleteLagRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteLag(request);
    }

    @SdkInternalApi
    final DeleteLagResult executeDeleteLag(DeleteLagRequest deleteLagRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteLagRequest> request = null;
        Response<DeleteLagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteLagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteLagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteLag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteLagResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteLagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     * @return Result of the DeleteVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVirtualInterface(request);
    }

    @SdkInternalApi
    final DeleteVirtualInterfaceResult executeDeleteVirtualInterface(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVirtualInterfaceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualInterfaceRequest> request = null;
        Response<DeleteVirtualInterfaceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualInterfaceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVirtualInterfaceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVirtualInterface");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVirtualInterfaceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteVirtualInterfaceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for a connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or
     * service provider uses when establishing your cross connect to AWS at the colocation facility. For more
     * information, see <a href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting
     * Cross Connects at AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     * @return Result of the DescribeConnectionLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeConnectionLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public DescribeConnectionLoaResult describeConnectionLoa(DescribeConnectionLoaRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnectionLoa(request);
    }

    @SdkInternalApi
    final DescribeConnectionLoaResult executeDescribeConnectionLoa(DescribeConnectionLoaRequest describeConnectionLoaRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectionLoaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionLoaRequest> request = null;
        Response<DescribeConnectionLoaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionLoaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConnectionLoaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnectionLoa");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectionLoaResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeConnectionLoaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Displays the specified connection or all connections in this Region.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @return Result of the DescribeConnections operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeConnectionsResult describeConnections(DescribeConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnections(request);
    }

    @SdkInternalApi
    final DescribeConnectionsResult executeDescribeConnections(DescribeConnectionsRequest describeConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsRequest> request = null;
        Response<DescribeConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeConnectionsResult describeConnections() {
        return describeConnections(new DescribeConnectionsRequest());
    }

    /**
     * <p>
     * Deprecated. Use <a>DescribeHostedConnections</a> instead.
     * </p>
     * <p>
     * Lists the connections that have been provisioned on the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     * @return Result of the DescribeConnectionsOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeConnectionsOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionsOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeConnectionsOnInterconnect(request);
    }

    @SdkInternalApi
    final DescribeConnectionsOnInterconnectResult executeDescribeConnectionsOnInterconnect(
            DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest) {

        ExecutionContext executionContext = createExecutionContext(describeConnectionsOnInterconnectRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsOnInterconnectRequest> request = null;
        Response<DescribeConnectionsOnInterconnectResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsOnInterconnectRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeConnectionsOnInterconnectRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeConnectionsOnInterconnect");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeConnectionsOnInterconnectResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeConnectionsOnInterconnectResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more association proposals for connection between a virtual private gateway and a Direct Connect
     * gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationProposalsRequest
     * @return Result of the DescribeDirectConnectGatewayAssociationProposals operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAssociationProposals
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociationProposals"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDirectConnectGatewayAssociationProposalsResult describeDirectConnectGatewayAssociationProposals(
            DescribeDirectConnectGatewayAssociationProposalsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDirectConnectGatewayAssociationProposals(request);
    }

    @SdkInternalApi
    final DescribeDirectConnectGatewayAssociationProposalsResult executeDescribeDirectConnectGatewayAssociationProposals(
            DescribeDirectConnectGatewayAssociationProposalsRequest describeDirectConnectGatewayAssociationProposalsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewayAssociationProposalsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewayAssociationProposalsRequest> request = null;
        Response<DescribeDirectConnectGatewayAssociationProposalsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewayAssociationProposalsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDirectConnectGatewayAssociationProposalsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDirectConnectGatewayAssociationProposals");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDirectConnectGatewayAssociationProposalsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDirectConnectGatewayAssociationProposalsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a
     * Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response
     * contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual
     * private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway.
     * If you specify both, the response contains the association between the Direct Connect gateway and the virtual
     * private gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     * @return Result of the DescribeDirectConnectGatewayAssociations operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDirectConnectGatewayAssociationsResult describeDirectConnectGatewayAssociations(DescribeDirectConnectGatewayAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDirectConnectGatewayAssociations(request);
    }

    @SdkInternalApi
    final DescribeDirectConnectGatewayAssociationsResult executeDescribeDirectConnectGatewayAssociations(
            DescribeDirectConnectGatewayAssociationsRequest describeDirectConnectGatewayAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewayAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewayAssociationsRequest> request = null;
        Response<DescribeDirectConnectGatewayAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewayAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDirectConnectGatewayAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDirectConnectGatewayAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDirectConnectGatewayAssociationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDirectConnectGatewayAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct
     * Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all
     * virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response
     * contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response
     * contains the attachment between the Direct Connect gateway and the virtual interface.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     * @return Result of the DescribeDirectConnectGatewayAttachments operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDirectConnectGatewayAttachmentsResult describeDirectConnectGatewayAttachments(DescribeDirectConnectGatewayAttachmentsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDirectConnectGatewayAttachments(request);
    }

    @SdkInternalApi
    final DescribeDirectConnectGatewayAttachmentsResult executeDescribeDirectConnectGatewayAttachments(
            DescribeDirectConnectGatewayAttachmentsRequest describeDirectConnectGatewayAttachmentsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewayAttachmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewayAttachmentsRequest> request = null;
        Response<DescribeDirectConnectGatewayAttachmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewayAttachmentsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDirectConnectGatewayAttachmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDirectConnectGatewayAttachments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDirectConnectGatewayAttachmentsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeDirectConnectGatewayAttachmentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect
     * gateways are not returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     * @return Result of the DescribeDirectConnectGateways operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGateways"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDirectConnectGatewaysResult describeDirectConnectGateways(DescribeDirectConnectGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDirectConnectGateways(request);
    }

    @SdkInternalApi
    final DescribeDirectConnectGatewaysResult executeDescribeDirectConnectGateways(DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDirectConnectGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectConnectGatewaysRequest> request = null;
        Response<DescribeDirectConnectGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectConnectGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDirectConnectGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDirectConnectGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDirectConnectGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDirectConnectGatewaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group
     * (LAG).
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     * @return Result of the DescribeHostedConnections operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeHostedConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeHostedConnections"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeHostedConnectionsResult describeHostedConnections(DescribeHostedConnectionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeHostedConnections(request);
    }

    @SdkInternalApi
    final DescribeHostedConnectionsResult executeDescribeHostedConnections(DescribeHostedConnectionsRequest describeHostedConnectionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeHostedConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeHostedConnectionsRequest> request = null;
        Response<DescribeHostedConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeHostedConnectionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeHostedConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeHostedConnections");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeHostedConnectionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeHostedConnectionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for the specified interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     * @return Result of the DescribeInterconnectLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeInterconnectLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnectLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    @Deprecated
    public DescribeInterconnectLoaResult describeInterconnectLoa(DescribeInterconnectLoaRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInterconnectLoa(request);
    }

    @SdkInternalApi
    final DescribeInterconnectLoaResult executeDescribeInterconnectLoa(DescribeInterconnectLoaRequest describeInterconnectLoaRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInterconnectLoaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInterconnectLoaRequest> request = null;
        Response<DescribeInterconnectLoaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInterconnectLoaRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInterconnectLoaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInterconnectLoa");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInterconnectLoaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInterconnectLoaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     * @return Result of the DescribeInterconnects operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeInterconnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnects"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInterconnectsResult describeInterconnects(DescribeInterconnectsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInterconnects(request);
    }

    @SdkInternalApi
    final DescribeInterconnectsResult executeDescribeInterconnects(DescribeInterconnectsRequest describeInterconnectsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInterconnectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInterconnectsRequest> request = null;
        Response<DescribeInterconnectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInterconnectsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeInterconnectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInterconnects");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInterconnectsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeInterconnectsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeInterconnectsResult describeInterconnects() {
        return describeInterconnects(new DescribeInterconnectsRequest());
    }

    /**
     * <p>
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     * </p>
     * 
     * @param describeLagsRequest
     * @return Result of the DescribeLags operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeLags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeLagsResult describeLags(DescribeLagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLags(request);
    }

    @SdkInternalApi
    final DescribeLagsResult executeDescribeLags(DescribeLagsRequest describeLagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLagsRequest> request = null;
        Response<DescribeLagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeLoaRequest
     * @return Result of the DescribeLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeLoaResult describeLoa(DescribeLoaRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoa(request);
    }

    @SdkInternalApi
    final DescribeLoaResult executeDescribeLoa(DescribeLoaRequest describeLoaRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoaRequest> request = null;
        Response<DescribeLoaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLoaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoa");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLoaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLoaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected
     * when calling <a>CreateConnection</a> or <a>CreateInterconnect</a>.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return Result of the DescribeLocations operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLocations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLocationsResult describeLocations(DescribeLocationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLocations(request);
    }

    @SdkInternalApi
    final DescribeLocationsResult executeDescribeLocations(DescribeLocationsRequest describeLocationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLocationsRequest> request = null;
        Response<DescribeLocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLocationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeLocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLocations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLocationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeLocationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeLocationsResult describeLocations() {
        return describeLocations(new DescribeLocationsRequest());
    }

    /**
     * <p>
     * Describes the tags associated with the specified AWS Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeTagsResult describeTags(DescribeTagsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeTags(request);
    }

    @SdkInternalApi
    final DescribeTagsResult executeDescribeTags(DescribeTagsRequest describeTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTagsRequest> request = null;
        Response<DescribeTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeTags");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeTagsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
     * </p>
     * 
     * @param describeVirtualGatewaysRequest
     * @return Result of the DescribeVirtualGateways operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeVirtualGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualGateways"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways(DescribeVirtualGatewaysRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVirtualGateways(request);
    }

    @SdkInternalApi
    final DescribeVirtualGatewaysResult executeDescribeVirtualGateways(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVirtualGatewaysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualGatewaysRequest> request = null;
        Response<DescribeVirtualGatewaysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualGatewaysRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeVirtualGatewaysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVirtualGateways");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVirtualGatewaysResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeVirtualGatewaysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeVirtualGatewaysResult describeVirtualGateways() {
        return describeVirtualGateways(new DescribeVirtualGatewaysRequest());
    }

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you
     * make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with
     * the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is
     * returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer
     * network.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     * @return Result of the DescribeVirtualInterfaces operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeVirtualInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces(DescribeVirtualInterfacesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVirtualInterfaces(request);
    }

    @SdkInternalApi
    final DescribeVirtualInterfacesResult executeDescribeVirtualInterfaces(DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVirtualInterfacesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualInterfacesRequest> request = null;
        Response<DescribeVirtualInterfacesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualInterfacesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeVirtualInterfacesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVirtualInterfaces");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVirtualInterfacesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeVirtualInterfacesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeVirtualInterfacesResult describeVirtualInterfaces() {
        return describeVirtualInterfaces(new DescribeVirtualInterfacesRequest());
    }

    /**
     * <p>
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established
     * as a standalone connection (the connection is not deleted; to delete the connection, use the
     * <a>DeleteConnection</a> request). If the LAG has associated virtual interfaces or hosted connections, they remain
     * associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically
     * converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational
     * connections, the request fails, except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     * @return Result of the DisassociateConnectionFromLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DisassociateConnectionFromLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DisassociateConnectionFromLag"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateConnectionFromLag(request);
    }

    @SdkInternalApi
    final DisassociateConnectionFromLagResult executeDisassociateConnectionFromLag(DisassociateConnectionFromLagRequest disassociateConnectionFromLagRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateConnectionFromLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateConnectionFromLagRequest> request = null;
        Response<DisassociateConnectionFromLagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateConnectionFromLagRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateConnectionFromLagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateConnectionFromLag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateConnectionFromLagResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateConnectionFromLagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50
     * tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @throws TooManyTagsException
     *         You have reached the limit on the number of tags that can be assigned.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
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
     * Removes one or more tags from the specified AWS Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
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
     * Updates the specified attributes of the Direct Connect gateway association.
     * </p>
     * <p>
     * Add or remove prefixes from the association.
     * </p>
     * 
     * @param updateDirectConnectGatewayAssociationRequest
     * @return Result of the UpdateDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UpdateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDirectConnectGatewayAssociationResult updateDirectConnectGatewayAssociation(UpdateDirectConnectGatewayAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDirectConnectGatewayAssociation(request);
    }

    @SdkInternalApi
    final UpdateDirectConnectGatewayAssociationResult executeUpdateDirectConnectGatewayAssociation(
            UpdateDirectConnectGatewayAssociationRequest updateDirectConnectGatewayAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDirectConnectGatewayAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDirectConnectGatewayAssociationRequest> request = null;
        Response<UpdateDirectConnectGatewayAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDirectConnectGatewayAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDirectConnectGatewayAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDirectConnectGatewayAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDirectConnectGatewayAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDirectConnectGatewayAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the attributes of the specified link aggregation group (LAG).
     * </p>
     * <p>
     * You can update the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value for the minimum number of connections that must be operational for the LAG itself to be operational.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you
     * update this value and the number of operational connections falls below the specified value, the LAG
     * automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as
     * it could force the LAG down if it is set higher than the current number of operational connections.
     * </p>
     * 
     * @param updateLagRequest
     * @return Result of the UpdateLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UpdateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateLagResult updateLag(UpdateLagRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLag(request);
    }

    @SdkInternalApi
    final UpdateLagResult executeUpdateLag(UpdateLagRequest updateLagRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLagRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLagRequest> request = null;
        Response<UpdateLagResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLagRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateLagRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLag");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLagResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateLagResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the specified attributes of the specified virtual private interface.
     * </p>
     * <p>
     * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical
     * connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity
     * for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection
     * supports jumbo frames, call <a>DescribeConnections</a>. To check whether your virtual interface supports jumbo
     * frames, call <a>DescribeVirtualInterfaces</a>.
     * </p>
     * 
     * @param updateVirtualInterfaceAttributesRequest
     * @return Result of the UpdateVirtualInterfaceAttributes operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UpdateVirtualInterfaceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateVirtualInterfaceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateVirtualInterfaceAttributesResult updateVirtualInterfaceAttributes(UpdateVirtualInterfaceAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVirtualInterfaceAttributes(request);
    }

    @SdkInternalApi
    final UpdateVirtualInterfaceAttributesResult executeUpdateVirtualInterfaceAttributes(
            UpdateVirtualInterfaceAttributesRequest updateVirtualInterfaceAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVirtualInterfaceAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualInterfaceAttributesRequest> request = null;
        Response<UpdateVirtualInterfaceAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualInterfaceAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateVirtualInterfaceAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Direct Connect");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVirtualInterfaceAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVirtualInterfaceAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateVirtualInterfaceAttributesResultJsonUnmarshaller());
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

}
