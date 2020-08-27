/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver;

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

import com.amazonaws.services.route53resolver.AmazonRoute53ResolverClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.route53resolver.model.*;
import com.amazonaws.services.route53resolver.model.transform.*;

/**
 * Client for accessing Route53Resolver. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * When you create a VPC using Amazon VPC, you automatically get DNS resolution within the VPC from Route 53 Resolver.
 * By default, Resolver answers DNS queries for VPC domain names such as domain names for EC2 instances or ELB load
 * balancers. Resolver performs recursive lookups against public name servers for all other domain names.
 * </p>
 * <p>
 * You can also configure DNS resolution between your VPC and your network over a Direct Connect or VPN connection:
 * </p>
 * <p>
 * <b>Forward DNS queries from resolvers on your network to Route 53 Resolver</b>
 * </p>
 * <p>
 * DNS resolvers on your network can forward DNS queries to Resolver in a specified VPC. This allows your DNS resolvers
 * to easily resolve domain names for AWS resources such as EC2 instances or records in a Route 53 private hosted zone.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-network-to-vpc"
 * >How DNS Resolvers on Your Network Forward DNS Queries to Route 53 Resolver</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 * <p>
 * <b>Conditionally forward queries from a VPC to resolvers on your network</b>
 * </p>
 * <p>
 * You can configure Resolver to forward queries that it receives from EC2 instances in your VPCs to DNS resolvers on
 * your network. To forward selected queries, you create Resolver rules that specify the domain names for the DNS
 * queries that you want to forward (such as example.com), and the IP addresses of the DNS resolvers on your network
 * that you want to forward the queries to. If a query matches multiple rules (example.com, acme.example.com), Resolver
 * chooses the rule with the most specific match (acme.example.com) and forwards the query to the IP addresses that you
 * specified in that rule. For more information, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resolver.html#resolver-overview-forward-vpc-to-network"
 * >How Route 53 Resolver Forwards DNS Queries from Your VPCs to Your Network</a> in the <i>Amazon Route 53 Developer
 * Guide</i>.
 * </p>
 * <p>
 * Like Amazon VPC, Resolver is regional. In each region where you have VPCs, you can choose whether to forward queries
 * from your VPCs to your network (outbound queries), from your network to your VPCs (inbound queries), or both.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRoute53ResolverClient extends AmazonWebServiceClient implements AmazonRoute53Resolver {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonRoute53Resolver.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "route53resolver";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameterException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.InvalidParameterExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPolicyDocument").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.InvalidPolicyDocumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTagException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.InvalidTagExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnknownResourceException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.UnknownResourceExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceUnavailableException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.ResourceUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.route53resolver.model.transform.ResourceExistsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.route53resolver.model.AmazonRoute53ResolverException.class));

    public static AmazonRoute53ResolverClientBuilder builder() {
        return AmazonRoute53ResolverClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Route53Resolver using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRoute53ResolverClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Route53Resolver using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonRoute53ResolverClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("route53resolver.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/route53resolver/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/route53resolver/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds IP addresses to an inbound or an outbound Resolver endpoint. If you want to add more than one IP address,
     * submit one <code>AssociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To remove an IP address from an endpoint, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverEndpointIpAddress.html"
     * >DisassociateResolverEndpointIpAddress</a>.
     * </p>
     * 
     * @param associateResolverEndpointIpAddressRequest
     * @return Result of the AssociateResolverEndpointIpAddress operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.AssociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateResolverEndpointIpAddressResult associateResolverEndpointIpAddress(AssociateResolverEndpointIpAddressRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResolverEndpointIpAddress(request);
    }

    @SdkInternalApi
    final AssociateResolverEndpointIpAddressResult executeAssociateResolverEndpointIpAddress(
            AssociateResolverEndpointIpAddressRequest associateResolverEndpointIpAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResolverEndpointIpAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResolverEndpointIpAddressRequest> request = null;
        Response<AssociateResolverEndpointIpAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResolverEndpointIpAddressRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateResolverEndpointIpAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResolverEndpointIpAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResolverEndpointIpAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateResolverEndpointIpAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates an Amazon VPC with a specified query logging configuration. Route 53 Resolver logs DNS queries that
     * originate in all of the Amazon VPCs that are associated with a specified query logging configuration. To
     * associate more than one VPC with a configuration, submit one <code>AssociateResolverQueryLogConfig</code> request
     * for each VPC.
     * </p>
     * <note>
     * <p>
     * The VPCs that you associate with a query logging configuration must be in the same Region as the configuration.
     * </p>
     * </note>
     * <p>
     * To remove a VPC from a query logging configuration, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html"
     * >DisassociateResolverQueryLogConfig</a>.
     * </p>
     * 
     * @param associateResolverQueryLogConfigRequest
     * @return Result of the AssociateResolverQueryLogConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.AssociateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateResolverQueryLogConfigResult associateResolverQueryLogConfig(AssociateResolverQueryLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResolverQueryLogConfig(request);
    }

    @SdkInternalApi
    final AssociateResolverQueryLogConfigResult executeAssociateResolverQueryLogConfig(
            AssociateResolverQueryLogConfigRequest associateResolverQueryLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResolverQueryLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResolverQueryLogConfigRequest> request = null;
        Response<AssociateResolverQueryLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResolverQueryLogConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateResolverQueryLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResolverQueryLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResolverQueryLogConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateResolverQueryLogConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a Resolver rule with a VPC. When you associate a rule with a VPC, Resolver forwards all DNS queries
     * for the domain name that is specified in the rule and that originate in the VPC. The queries are forwarded to the
     * IP addresses for the DNS resolvers that are specified in the rule. For more information about rules, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_CreateResolverRule.html"
     * >CreateResolverRule</a>.
     * </p>
     * 
     * @param associateResolverRuleRequest
     * @return Result of the AssociateResolverRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceUnavailableException
     *         The specified resource isn't available.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.AssociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/AssociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateResolverRuleResult associateResolverRule(AssociateResolverRuleRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateResolverRule(request);
    }

    @SdkInternalApi
    final AssociateResolverRuleResult executeAssociateResolverRule(AssociateResolverRuleRequest associateResolverRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(associateResolverRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateResolverRuleRequest> request = null;
        Response<AssociateResolverRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateResolverRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateResolverRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateResolverRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateResolverRuleResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new AssociateResolverRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Resolver endpoint. There are two types of Resolver endpoints, inbound and outbound:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <i>inbound Resolver endpoint</i> forwards DNS queries to the DNS service for a VPC from your network.
     * </p>
     * </li>
     * <li>
     * <p>
     * An <i>outbound Resolver endpoint</i> forwards DNS queries from the DNS service for a VPC to your network.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createResolverEndpointRequest
     * @return Result of the CreateResolverEndpoint operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.CreateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResolverEndpointResult createResolverEndpoint(CreateResolverEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResolverEndpoint(request);
    }

    @SdkInternalApi
    final CreateResolverEndpointResult executeCreateResolverEndpoint(CreateResolverEndpointRequest createResolverEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(createResolverEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResolverEndpointRequest> request = null;
        Response<CreateResolverEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResolverEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResolverEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResolverEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResolverEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateResolverEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Resolver query logging configuration, which defines where you want Resolver to save DNS query logs that
     * originate in your VPCs. Resolver can log queries only for VPCs that are in the same Region as the query logging
     * configuration.
     * </p>
     * <p>
     * To specify which VPCs you want to log queries for, you use <code>AssociateResolverQueryLogConfig</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverQueryLogConfig.html"
     * >AssociateResolverQueryLogConfig</a>.
     * </p>
     * <p>
     * You can optionally use AWS Resource Access Manager (AWS RAM) to share a query logging configuration with other
     * AWS accounts. The other accounts can then associate VPCs with the configuration. The query logs that Resolver
     * creates for a configuration include all DNS queries that originate in all VPCs that are associated with the
     * configuration.
     * </p>
     * 
     * @param createResolverQueryLogConfigRequest
     * @return Result of the CreateResolverQueryLogConfig operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.CreateResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResolverQueryLogConfigResult createResolverQueryLogConfig(CreateResolverQueryLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResolverQueryLogConfig(request);
    }

    @SdkInternalApi
    final CreateResolverQueryLogConfigResult executeCreateResolverQueryLogConfig(CreateResolverQueryLogConfigRequest createResolverQueryLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(createResolverQueryLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResolverQueryLogConfigRequest> request = null;
        Response<CreateResolverQueryLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResolverQueryLogConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createResolverQueryLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResolverQueryLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResolverQueryLogConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateResolverQueryLogConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For DNS queries that originate in your VPCs, specifies which Resolver endpoint the queries pass through, one
     * domain name that you want to forward to your network, and the IP addresses of the DNS resolvers in your network.
     * </p>
     * 
     * @param createResolverRuleRequest
     * @return Result of the CreateResolverRule operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws ResourceUnavailableException
     *         The specified resource isn't available.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.CreateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/CreateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateResolverRuleResult createResolverRule(CreateResolverRuleRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResolverRule(request);
    }

    @SdkInternalApi
    final CreateResolverRuleResult executeCreateResolverRule(CreateResolverRuleRequest createResolverRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(createResolverRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResolverRuleRequest> request = null;
        Response<CreateResolverRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResolverRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResolverRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResolverRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResolverRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResolverRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Resolver endpoint. The effect of deleting a Resolver endpoint depends on whether it's an inbound or an
     * outbound Resolver endpoint:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Inbound</b>: DNS queries from your network are no longer routed to the DNS service for the specified VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Outbound</b>: DNS queries from a VPC are no longer routed to your network.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteResolverEndpointRequest
     * @return Result of the DeleteResolverEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DeleteResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResolverEndpointResult deleteResolverEndpoint(DeleteResolverEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResolverEndpoint(request);
    }

    @SdkInternalApi
    final DeleteResolverEndpointResult executeDeleteResolverEndpoint(DeleteResolverEndpointRequest deleteResolverEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResolverEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResolverEndpointRequest> request = null;
        Response<DeleteResolverEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResolverEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResolverEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResolverEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResolverEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteResolverEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a query logging configuration. When you delete a configuration, Resolver stops logging DNS queries for
     * all of the Amazon VPCs that are associated with the configuration. This also applies if the query logging
     * configuration is shared with other AWS accounts, and the other accounts have associated VPCs with the shared
     * configuration.
     * </p>
     * <p>
     * Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration.
     * See <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverQueryLogConfig.html"
     * >DisassociateResolverQueryLogConfig</a>.
     * </p>
     * <p>
     * If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, you must
     * stop sharing the configuration before you can delete a configuration. The accounts that you shared the
     * configuration with can first disassociate VPCs that they associated with the configuration, but that's not
     * necessary. If you stop sharing the configuration, those VPCs are automatically disassociated from the
     * configuration.
     * </p>
     * 
     * @param deleteResolverQueryLogConfigRequest
     * @return Result of the DeleteResolverQueryLogConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.DeleteResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResolverQueryLogConfigResult deleteResolverQueryLogConfig(DeleteResolverQueryLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResolverQueryLogConfig(request);
    }

    @SdkInternalApi
    final DeleteResolverQueryLogConfigResult executeDeleteResolverQueryLogConfig(DeleteResolverQueryLogConfigRequest deleteResolverQueryLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResolverQueryLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResolverQueryLogConfigRequest> request = null;
        Response<DeleteResolverQueryLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResolverQueryLogConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteResolverQueryLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResolverQueryLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResolverQueryLogConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteResolverQueryLogConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Resolver rule. Before you can delete a Resolver rule, you must disassociate it from all the VPCs that
     * you associated the Resolver rule with. For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_DisassociateResolverRule.html"
     * >DisassociateResolverRule</a>.
     * </p>
     * 
     * @param deleteResolverRuleRequest
     * @return Result of the DeleteResolverRule operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceInUseException
     *         The resource that you tried to update or delete is currently in use.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DeleteResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteResolverRuleResult deleteResolverRule(DeleteResolverRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResolverRule(request);
    }

    @SdkInternalApi
    final DeleteResolverRuleResult executeDeleteResolverRule(DeleteResolverRuleRequest deleteResolverRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResolverRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResolverRuleRequest> request = null;
        Response<DeleteResolverRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResolverRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResolverRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResolverRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResolverRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResolverRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes IP addresses from an inbound or an outbound Resolver endpoint. If you want to remove more than one IP
     * address, submit one <code>DisassociateResolverEndpointIpAddress</code> request for each IP address.
     * </p>
     * <p>
     * To add an IP address to an endpoint, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverEndpointIpAddress.html"
     * >AssociateResolverEndpointIpAddress</a>.
     * </p>
     * 
     * @param disassociateResolverEndpointIpAddressRequest
     * @return Result of the DisassociateResolverEndpointIpAddress operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceExistsException
     *         The resource that you tried to create already exists.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DisassociateResolverEndpointIpAddress
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverEndpointIpAddress"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateResolverEndpointIpAddressResult disassociateResolverEndpointIpAddress(DisassociateResolverEndpointIpAddressRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResolverEndpointIpAddress(request);
    }

    @SdkInternalApi
    final DisassociateResolverEndpointIpAddressResult executeDisassociateResolverEndpointIpAddress(
            DisassociateResolverEndpointIpAddressRequest disassociateResolverEndpointIpAddressRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResolverEndpointIpAddressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResolverEndpointIpAddressRequest> request = null;
        Response<DisassociateResolverEndpointIpAddressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResolverEndpointIpAddressRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateResolverEndpointIpAddressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResolverEndpointIpAddress");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResolverEndpointIpAddressResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateResolverEndpointIpAddressResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a VPC from a query logging configuration.
     * </p>
     * <note>
     * <p>
     * Before you can delete a query logging configuration, you must first disassociate all VPCs from the configuration.
     * If you used Resource Access Manager (RAM) to share a query logging configuration with other accounts, VPCs can be
     * disassociated from the configuration in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The accounts that you shared the configuration with can disassociate VPCs from the configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can stop sharing the configuration.
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param disassociateResolverQueryLogConfigRequest
     * @return Result of the DisassociateResolverQueryLogConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.DisassociateResolverQueryLogConfig
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateResolverQueryLogConfigResult disassociateResolverQueryLogConfig(DisassociateResolverQueryLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResolverQueryLogConfig(request);
    }

    @SdkInternalApi
    final DisassociateResolverQueryLogConfigResult executeDisassociateResolverQueryLogConfig(
            DisassociateResolverQueryLogConfigRequest disassociateResolverQueryLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResolverQueryLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResolverQueryLogConfigRequest> request = null;
        Response<DisassociateResolverQueryLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResolverQueryLogConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateResolverQueryLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResolverQueryLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResolverQueryLogConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateResolverQueryLogConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the association between a specified Resolver rule and a specified VPC.
     * </p>
     * <important>
     * <p>
     * If you disassociate a Resolver rule from a VPC, Resolver stops forwarding DNS queries for the domain name that
     * you specified in the Resolver rule.
     * </p>
     * </important>
     * 
     * @param disassociateResolverRuleRequest
     * @return Result of the DisassociateResolverRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.DisassociateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DisassociateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateResolverRuleResult disassociateResolverRule(DisassociateResolverRuleRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateResolverRule(request);
    }

    @SdkInternalApi
    final DisassociateResolverRuleResult executeDisassociateResolverRule(DisassociateResolverRuleRequest disassociateResolverRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateResolverRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateResolverRuleRequest> request = null;
        Response<DisassociateResolverRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateResolverRuleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateResolverRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateResolverRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateResolverRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateResolverRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified Resolver endpoint, such as whether it's an inbound or an outbound Resolver
     * endpoint, and the current status of the endpoint.
     * </p>
     * 
     * @param getResolverEndpointRequest
     * @return Result of the GetResolverEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResolverEndpointResult getResolverEndpoint(GetResolverEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolverEndpoint(request);
    }

    @SdkInternalApi
    final GetResolverEndpointResult executeGetResolverEndpoint(GetResolverEndpointRequest getResolverEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverEndpointRequest> request = null;
        Response<GetResolverEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResolverEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolverEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResolverEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified Resolver query logging configuration, such as the number of VPCs that the
     * configuration is logging queries for and the location that logs are sent to.
     * </p>
     * 
     * @param getResolverQueryLogConfigRequest
     * @return Result of the GetResolverQueryLogConfig operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.GetResolverQueryLogConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfig"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResolverQueryLogConfigResult getResolverQueryLogConfig(GetResolverQueryLogConfigRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolverQueryLogConfig(request);
    }

    @SdkInternalApi
    final GetResolverQueryLogConfigResult executeGetResolverQueryLogConfig(GetResolverQueryLogConfigRequest getResolverQueryLogConfigRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverQueryLogConfigRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverQueryLogConfigRequest> request = null;
        Response<GetResolverQueryLogConfigResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverQueryLogConfigRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResolverQueryLogConfigRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolverQueryLogConfig");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverQueryLogConfigResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResolverQueryLogConfigResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified association between a Resolver query logging configuration and an Amazon VPC.
     * When you associate a VPC with a query logging configuration, Resolver logs DNS queries that originate in that
     * VPC.
     * </p>
     * 
     * @param getResolverQueryLogConfigAssociationRequest
     * @return Result of the GetResolverQueryLogConfigAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.GetResolverQueryLogConfigAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResolverQueryLogConfigAssociationResult getResolverQueryLogConfigAssociation(GetResolverQueryLogConfigAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolverQueryLogConfigAssociation(request);
    }

    @SdkInternalApi
    final GetResolverQueryLogConfigAssociationResult executeGetResolverQueryLogConfigAssociation(
            GetResolverQueryLogConfigAssociationRequest getResolverQueryLogConfigAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverQueryLogConfigAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverQueryLogConfigAssociationRequest> request = null;
        Response<GetResolverQueryLogConfigAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverQueryLogConfigAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResolverQueryLogConfigAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolverQueryLogConfigAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverQueryLogConfigAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResolverQueryLogConfigAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a query logging policy. A query logging policy specifies the Resolver query logging
     * operations and resources that you want to allow another AWS account to be able to use.
     * </p>
     * 
     * @param getResolverQueryLogConfigPolicyRequest
     * @return Result of the GetResolverQueryLogConfigPolicy operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.GetResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResolverQueryLogConfigPolicyResult getResolverQueryLogConfigPolicy(GetResolverQueryLogConfigPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolverQueryLogConfigPolicy(request);
    }

    @SdkInternalApi
    final GetResolverQueryLogConfigPolicyResult executeGetResolverQueryLogConfigPolicy(
            GetResolverQueryLogConfigPolicyRequest getResolverQueryLogConfigPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverQueryLogConfigPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverQueryLogConfigPolicyRequest> request = null;
        Response<GetResolverQueryLogConfigPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverQueryLogConfigPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResolverQueryLogConfigPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolverQueryLogConfigPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverQueryLogConfigPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResolverQueryLogConfigPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a specified Resolver rule, such as the domain name that the rule forwards DNS queries for
     * and the ID of the outbound Resolver endpoint that the rule is associated with.
     * </p>
     * 
     * @param getResolverRuleRequest
     * @return Result of the GetResolverRule operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResolverRuleResult getResolverRule(GetResolverRuleRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolverRule(request);
    }

    @SdkInternalApi
    final GetResolverRuleResult executeGetResolverRule(GetResolverRuleRequest getResolverRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverRuleRequest> request = null;
        Response<GetResolverRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResolverRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolverRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetResolverRuleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about an association between a specified Resolver rule and a VPC. You associate a Resolver rule
     * and a VPC using <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_route53resolver_AssociateResolverRule.html"
     * >AssociateResolverRule</a>.
     * </p>
     * 
     * @param getResolverRuleAssociationRequest
     * @return Result of the GetResolverRuleAssociation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverRuleAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRuleAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResolverRuleAssociationResult getResolverRuleAssociation(GetResolverRuleAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolverRuleAssociation(request);
    }

    @SdkInternalApi
    final GetResolverRuleAssociationResult executeGetResolverRuleAssociation(GetResolverRuleAssociationRequest getResolverRuleAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverRuleAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverRuleAssociationRequest> request = null;
        Response<GetResolverRuleAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverRuleAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getResolverRuleAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolverRuleAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverRuleAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetResolverRuleAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets information about a Resolver rule policy. A Resolver rule policy specifies the Resolver operations and
     * resources that you want to allow another AWS account to be able to use.
     * </p>
     * 
     * @param getResolverRulePolicyRequest
     * @return Result of the GetResolverRulePolicy operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.GetResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetResolverRulePolicyResult getResolverRulePolicy(GetResolverRulePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeGetResolverRulePolicy(request);
    }

    @SdkInternalApi
    final GetResolverRulePolicyResult executeGetResolverRulePolicy(GetResolverRulePolicyRequest getResolverRulePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(getResolverRulePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetResolverRulePolicyRequest> request = null;
        Response<GetResolverRulePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetResolverRulePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getResolverRulePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetResolverRulePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetResolverRulePolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetResolverRulePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the IP addresses for a specified Resolver endpoint.
     * </p>
     * 
     * @param listResolverEndpointIpAddressesRequest
     * @return Result of the ListResolverEndpointIpAddresses operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverEndpointIpAddresses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpointIpAddresses"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResolverEndpointIpAddressesResult listResolverEndpointIpAddresses(ListResolverEndpointIpAddressesRequest request) {
        request = beforeClientExecution(request);
        return executeListResolverEndpointIpAddresses(request);
    }

    @SdkInternalApi
    final ListResolverEndpointIpAddressesResult executeListResolverEndpointIpAddresses(
            ListResolverEndpointIpAddressesRequest listResolverEndpointIpAddressesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolverEndpointIpAddressesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolverEndpointIpAddressesRequest> request = null;
        Response<ListResolverEndpointIpAddressesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolverEndpointIpAddressesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResolverEndpointIpAddressesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolverEndpointIpAddresses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolverEndpointIpAddressesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResolverEndpointIpAddressesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the Resolver endpoints that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverEndpointsRequest
     * @return Result of the ListResolverEndpoints operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResolverEndpointsResult listResolverEndpoints(ListResolverEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeListResolverEndpoints(request);
    }

    @SdkInternalApi
    final ListResolverEndpointsResult executeListResolverEndpoints(ListResolverEndpointsRequest listResolverEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolverEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolverEndpointsRequest> request = null;
        Response<ListResolverEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolverEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResolverEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolverEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolverEndpointsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListResolverEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about associations between Amazon VPCs and query logging configurations.
     * </p>
     * 
     * @param listResolverQueryLogConfigAssociationsRequest
     * @return Result of the ListResolverQueryLogConfigAssociations operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.ListResolverQueryLogConfigAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResolverQueryLogConfigAssociationsResult listResolverQueryLogConfigAssociations(ListResolverQueryLogConfigAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListResolverQueryLogConfigAssociations(request);
    }

    @SdkInternalApi
    final ListResolverQueryLogConfigAssociationsResult executeListResolverQueryLogConfigAssociations(
            ListResolverQueryLogConfigAssociationsRequest listResolverQueryLogConfigAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolverQueryLogConfigAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolverQueryLogConfigAssociationsRequest> request = null;
        Response<ListResolverQueryLogConfigAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolverQueryLogConfigAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResolverQueryLogConfigAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolverQueryLogConfigAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolverQueryLogConfigAssociationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListResolverQueryLogConfigAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists information about the specified query logging configurations. Each configuration defines where you want
     * Resolver to save DNS query logs and specifies the VPCs that you want to log queries for.
     * </p>
     * 
     * @param listResolverQueryLogConfigsRequest
     * @return Result of the ListResolverQueryLogConfigs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.ListResolverQueryLogConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverQueryLogConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResolverQueryLogConfigsResult listResolverQueryLogConfigs(ListResolverQueryLogConfigsRequest request) {
        request = beforeClientExecution(request);
        return executeListResolverQueryLogConfigs(request);
    }

    @SdkInternalApi
    final ListResolverQueryLogConfigsResult executeListResolverQueryLogConfigs(ListResolverQueryLogConfigsRequest listResolverQueryLogConfigsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolverQueryLogConfigsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolverQueryLogConfigsRequest> request = null;
        Response<ListResolverQueryLogConfigsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolverQueryLogConfigsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResolverQueryLogConfigsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolverQueryLogConfigs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolverQueryLogConfigsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResolverQueryLogConfigsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the associations that were created between Resolver rules and VPCs using the current AWS account.
     * </p>
     * 
     * @param listResolverRuleAssociationsRequest
     * @return Result of the ListResolverRuleAssociations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverRuleAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRuleAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResolverRuleAssociationsResult listResolverRuleAssociations(ListResolverRuleAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListResolverRuleAssociations(request);
    }

    @SdkInternalApi
    final ListResolverRuleAssociationsResult executeListResolverRuleAssociations(ListResolverRuleAssociationsRequest listResolverRuleAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolverRuleAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolverRuleAssociationsRequest> request = null;
        Response<ListResolverRuleAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolverRuleAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResolverRuleAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolverRuleAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolverRuleAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResolverRuleAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the Resolver rules that were created using the current AWS account.
     * </p>
     * 
     * @param listResolverRulesRequest
     * @return Result of the ListResolverRules operation returned by the service.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListResolverRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverRules"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResolverRulesResult listResolverRules(ListResolverRulesRequest request) {
        request = beforeClientExecution(request);
        return executeListResolverRules(request);
    }

    @SdkInternalApi
    final ListResolverRulesResult executeListResolverRules(ListResolverRulesRequest listResolverRulesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResolverRulesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResolverRulesRequest> request = null;
        Response<ListResolverRulesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResolverRulesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResolverRulesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResolverRules");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResolverRulesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResolverRulesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags that you associated with the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidNextTokenException
     *         The value that you specified for <code>NextToken</code> in a <code>List</code> request isn't valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
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
     * Specifies an AWS account that you want to share a query logging configuration with, the query logging
     * configuration that you want to share, and the operations that you want the account to be able to perform on the
     * configuration.
     * </p>
     * 
     * @param putResolverQueryLogConfigPolicyRequest
     * @return Result of the PutResolverQueryLogConfigPolicy operation returned by the service.
     * @throws InvalidPolicyDocumentException
     *         The specified Resolver rule policy is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws AccessDeniedException
     *         The current account doesn't have the IAM permissions required to perform the specified Resolver
     *         operation.
     * @sample AmazonRoute53Resolver.PutResolverQueryLogConfigPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverQueryLogConfigPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResolverQueryLogConfigPolicyResult putResolverQueryLogConfigPolicy(PutResolverQueryLogConfigPolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResolverQueryLogConfigPolicy(request);
    }

    @SdkInternalApi
    final PutResolverQueryLogConfigPolicyResult executePutResolverQueryLogConfigPolicy(
            PutResolverQueryLogConfigPolicyRequest putResolverQueryLogConfigPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResolverQueryLogConfigPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResolverQueryLogConfigPolicyRequest> request = null;
        Response<PutResolverQueryLogConfigPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResolverQueryLogConfigPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putResolverQueryLogConfigPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResolverQueryLogConfigPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResolverQueryLogConfigPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutResolverQueryLogConfigPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specifies an AWS account that you want to share rules with, the Resolver rules that you want to share, and the
     * operations that you want the account to be able to perform on those rules.
     * </p>
     * 
     * @param putResolverRulePolicyRequest
     * @return Result of the PutResolverRulePolicy operation returned by the service.
     * @throws InvalidPolicyDocumentException
     *         The specified Resolver rule policy is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws UnknownResourceException
     *         The specified resource doesn't exist.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.PutResolverRulePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverRulePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResolverRulePolicyResult putResolverRulePolicy(PutResolverRulePolicyRequest request) {
        request = beforeClientExecution(request);
        return executePutResolverRulePolicy(request);
    }

    @SdkInternalApi
    final PutResolverRulePolicyResult executePutResolverRulePolicy(PutResolverRulePolicyRequest putResolverRulePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(putResolverRulePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResolverRulePolicyRequest> request = null;
        Response<PutResolverRulePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResolverRulePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResolverRulePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResolverRulePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResolverRulePolicyResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutResolverRulePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds one or more tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidTagException
     *         The specified tag is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/TagResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
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
     * Removes one or more tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
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
     * Updates the name of an inbound or an outbound Resolver endpoint.
     * </p>
     * 
     * @param updateResolverEndpointRequest
     * @return Result of the UpdateResolverEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateResolverEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResolverEndpointResult updateResolverEndpoint(UpdateResolverEndpointRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResolverEndpoint(request);
    }

    @SdkInternalApi
    final UpdateResolverEndpointResult executeUpdateResolverEndpoint(UpdateResolverEndpointRequest updateResolverEndpointRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResolverEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResolverEndpointRequest> request = null;
        Response<UpdateResolverEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResolverEndpointRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResolverEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResolverEndpoint");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResolverEndpointResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateResolverEndpointResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates settings for a specified Resolver rule. <code>ResolverRuleId</code> is required, and all other parameters
     * are optional. If you don't specify a parameter, it retains its current value.
     * </p>
     * 
     * @param updateResolverRuleRequest
     * @return Result of the UpdateResolverRule operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws InvalidParameterException
     *         One or more parameters in this request are not valid.
     * @throws ResourceNotFoundException
     *         The specified resource doesn't exist.
     * @throws ResourceUnavailableException
     *         The specified resource isn't available.
     * @throws LimitExceededException
     *         The request caused one or more limits to be exceeded.
     * @throws InternalServiceErrorException
     *         We encountered an unknown error. Try again in a few minutes.
     * @throws ThrottlingException
     *         The request was throttled. Try again in a few minutes.
     * @sample AmazonRoute53Resolver.UpdateResolverRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverRule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateResolverRuleResult updateResolverRule(UpdateResolverRuleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateResolverRule(request);
    }

    @SdkInternalApi
    final UpdateResolverRuleResult executeUpdateResolverRule(UpdateResolverRuleRequest updateResolverRuleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateResolverRuleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateResolverRuleRequest> request = null;
        Response<UpdateResolverRuleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateResolverRuleRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateResolverRuleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Route53Resolver");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateResolverRule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateResolverRuleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateResolverRuleResultJsonUnmarshaller());
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
