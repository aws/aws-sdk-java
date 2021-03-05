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
package com.amazonaws.services.networkfirewall;

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

import com.amazonaws.services.networkfirewall.AWSNetworkFirewallClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.services.networkfirewall.model.transform.*;

/**
 * Client for accessing Network Firewall. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * This is the API Reference for AWS Network Firewall. This guide is for developers who need detailed information about
 * the Network Firewall API actions, data types, and errors.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The REST API requires you to handle connection details, such as calculating signatures, handling request retries, and
 * error handling. For general information about using the AWS REST APIs, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws-apis.html">AWS APIs</a>.
 * </p>
 * <p>
 * To access Network Firewall using the REST API endpoint:
 * <code>https://network-firewall.&lt;region&gt;.amazonaws.com </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of Network Firewall features, including and step-by-step instructions on how to use them through the
 * Network Firewall console, see the <a
 * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/">Network Firewall Developer Guide</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Network Firewall is a stateful, managed, network firewall and intrusion detection and prevention service for Amazon
 * Virtual Private Cloud (Amazon VPC). With Network Firewall, you can filter traffic at the perimeter of your VPC. This
 * includes filtering traffic going to and coming from an internet gateway, NAT gateway, or over VPN or AWS Direct
 * Connect. Network Firewall uses rules that are compatible with Suricata, a free, open source intrusion detection
 * system (IDS) engine. For information about Suricata, see the <a href="https://suricata-ids.org/">Suricata
 * website</a>.
 * </p>
 * <p>
 * You can use Network Firewall to monitor and protect your VPC traffic in a number of ways. The following are just a
 * few examples:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Allow domains or IP addresses for known AWS service endpoints, such as Amazon S3, and block all other forms of
 * traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use custom lists of known bad domains to limit the types of domain names that your applications can access.
 * </p>
 * </li>
 * <li>
 * <p>
 * Perform deep packet inspection on traffic entering or leaving your VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use stateful protocol detection to filter protocols like HTTPS, regardless of the port used.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To enable Network Firewall for your VPCs, you perform steps in both Amazon VPC and in Network Firewall. For
 * information about using Amazon VPC, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/">Amazon VPC User
 * Guide</a>.
 * </p>
 * <p>
 * To start using Network Firewall, do the following:
 * </p>
 * <ol>
 * <li>
 * <p>
 * (Optional) If you don't already have a VPC that you want to protect, create it in Amazon VPC.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, in each Availability Zone where you want to have a firewall endpoint, create a subnet for the sole use
 * of Network Firewall.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create stateless and stateful rule groups, to define the components of the network traffic
 * filtering behavior that you want your firewall to have.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall policy that uses your rule groups and specifies additional default traffic
 * filtering behavior.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Network Firewall, create a firewall and specify your new firewall policy and VPC subnets. Network Firewall creates
 * a firewall endpoint in each subnet that you specify, with the behavior that's defined in the firewall policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * In Amazon VPC, use ingress routing enhancements to route traffic through the new firewall endpoints.
 * </p>
 * </li>
 * </ol>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSNetworkFirewallClient extends AmazonWebServiceClient implements AWSNetworkFirewall {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSNetworkFirewall.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "network-firewall";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.0")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.InvalidOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRequestException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.InvalidRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LogDestinationPermissionException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.LogDestinationPermissionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ThrottlingException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.ThrottlingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InsufficientCapacityException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.InsufficientCapacityExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourcePolicyException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.InvalidResourcePolicyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.InvalidTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceOwnerCheckException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.ResourceOwnerCheckExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withExceptionUnmarshaller(
                                    com.amazonaws.services.networkfirewall.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.networkfirewall.model.AWSNetworkFirewallException.class));

    public static AWSNetworkFirewallClientBuilder builder() {
        return AWSNetworkFirewallClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Network Firewall using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSNetworkFirewallClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Network Firewall using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSNetworkFirewallClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("network-firewall.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/networkfirewall/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/networkfirewall/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a <a>FirewallPolicy</a> to a <a>Firewall</a>.
     * </p>
     * <p>
     * A firewall policy defines how to monitor and manage your VPC network traffic, using a collection of inspection
     * rule groups and other settings. Each firewall requires one firewall policy association, and you can use the same
     * firewall policy for multiple firewalls.
     * </p>
     * 
     * @param associateFirewallPolicyRequest
     * @return Result of the AssociateFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.AssociateFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/AssociateFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateFirewallPolicyResult associateFirewallPolicy(AssociateFirewallPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateFirewallPolicy(request);
    }

    @SdkInternalApi
    final AssociateFirewallPolicyResult executeAssociateFirewallPolicy(AssociateFirewallPolicyRequest associateFirewallPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(associateFirewallPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateFirewallPolicyRequest> request = null;
        Response<AssociateFirewallPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateFirewallPolicyRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateFirewallPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateFirewallPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateFirewallPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateFirewallPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified subnets in the Amazon VPC to the firewall. You can specify one subnet for each of the
     * Availability Zones that the VPC spans.
     * </p>
     * <p>
     * This request creates an AWS Network Firewall firewall endpoint in each of the subnets. To enable the firewall's
     * protections, you must also modify the VPC's route tables for each subnet's Availability Zone, to redirect the
     * traffic that's coming into and going out of the zone through the firewall endpoint.
     * </p>
     * 
     * @param associateSubnetsRequest
     * @return Result of the AssociateSubnets operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @sample AWSNetworkFirewall.AssociateSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/AssociateSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateSubnetsResult associateSubnets(AssociateSubnetsRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSubnets(request);
    }

    @SdkInternalApi
    final AssociateSubnetsResult executeAssociateSubnets(AssociateSubnetsRequest associateSubnetsRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSubnetsRequest> request = null;
        Response<AssociateSubnetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSubnetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(associateSubnetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSubnets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSubnetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AssociateSubnetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an AWS Network Firewall <a>Firewall</a> and accompanying <a>FirewallStatus</a> for a VPC.
     * </p>
     * <p>
     * The firewall defines the configuration settings for an AWS Network Firewall firewall. The settings that you can
     * define at creation include the firewall policy, the subnets in your VPC to use for the firewall endpoints, and
     * any tags that are attached to the firewall AWS resource.
     * </p>
     * <p>
     * After you create a firewall, you can provide additional settings, like the logging configuration.
     * </p>
     * <p>
     * To update the settings for a firewall, you use the operations that apply to the settings themselves, for example
     * <a>UpdateLoggingConfiguration</a>, <a>AssociateSubnets</a>, and <a>UpdateFirewallDeleteProtection</a>.
     * </p>
     * <p>
     * To manage a firewall's tags, use the standard AWS resource tagging operations, <a>ListTagsForResource</a>,
     * <a>TagResource</a>, and <a>UntagResource</a>.
     * </p>
     * <p>
     * To retrieve information about firewalls, use <a>ListFirewalls</a> and <a>DescribeFirewall</a>.
     * </p>
     * 
     * @param createFirewallRequest
     * @return Result of the CreateFirewall operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws LimitExceededException
     *         Unable to perform the operation because doing so would violate a limit setting.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.CreateFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFirewallResult createFirewall(CreateFirewallRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFirewall(request);
    }

    @SdkInternalApi
    final CreateFirewallResult executeCreateFirewall(CreateFirewallRequest createFirewallRequest) {

        ExecutionContext executionContext = createExecutionContext(createFirewallRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFirewallRequest> request = null;
        Response<CreateFirewallResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFirewallRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFirewallRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFirewall");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFirewallResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFirewallResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the firewall policy for the firewall according to the specifications.
     * </p>
     * <p>
     * An AWS Network Firewall firewall policy defines the behavior of a firewall, in a collection of stateless and
     * stateful rule groups and other settings. You can use one firewall policy for multiple firewalls.
     * </p>
     * 
     * @param createFirewallPolicyRequest
     * @return Result of the CreateFirewallPolicy operation returned by the service.
     * @throws LimitExceededException
     *         Unable to perform the operation because doing so would violate a limit setting.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @sample AWSNetworkFirewall.CreateFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateFirewallPolicyResult createFirewallPolicy(CreateFirewallPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFirewallPolicy(request);
    }

    @SdkInternalApi
    final CreateFirewallPolicyResult executeCreateFirewallPolicy(CreateFirewallPolicyRequest createFirewallPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(createFirewallPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFirewallPolicyRequest> request = null;
        Response<CreateFirewallPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFirewallPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFirewallPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFirewallPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFirewallPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFirewallPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the specified stateless or stateful rule group, which includes the rules for network traffic inspection,
     * a capacity setting, and tags.
     * </p>
     * <p>
     * You provide your rule group specification in your request using either <code>RuleGroup</code> or
     * <code>Rules</code>.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return Result of the CreateRuleGroup operation returned by the service.
     * @throws LimitExceededException
     *         Unable to perform the operation because doing so would violate a limit setting.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InsufficientCapacityException
     *         AWS doesn't currently have enough available capacity to fulfill your request. Try your request later.
     * @sample AWSNetworkFirewall.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateRuleGroupResult createRuleGroup(CreateRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRuleGroup(request);
    }

    @SdkInternalApi
    final CreateRuleGroupResult executeCreateRuleGroup(CreateRuleGroupRequest createRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRuleGroupRequest> request = null;
        Response<CreateRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified <a>Firewall</a> and its <a>FirewallStatus</a>. This operation requires the firewall's
     * <code>DeleteProtection</code> flag to be <code>FALSE</code>. You can't revert this operation.
     * </p>
     * <p>
     * You can check whether a firewall is in use by reviewing the route tables for the Availability Zones where you
     * have firewall subnet mappings. Retrieve the subnet mappings by calling <a>DescribeFirewall</a>. You define and
     * update the route tables through Amazon VPC. As needed, update the route tables for the zones to remove the
     * firewall endpoints. When the route tables no longer use the firewall endpoints, you can remove the firewall
     * safely.
     * </p>
     * <p>
     * To delete a firewall, remove the delete protection if you need to using <a>UpdateFirewallDeleteProtection</a>,
     * then delete the firewall by calling <a>DeleteFirewall</a>.
     * </p>
     * 
     * @param deleteFirewallRequest
     * @return Result of the DeleteFirewall operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws UnsupportedOperationException
     *         The operation you requested isn't supported by Network Firewall.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DeleteFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFirewallResult deleteFirewall(DeleteFirewallRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFirewall(request);
    }

    @SdkInternalApi
    final DeleteFirewallResult executeDeleteFirewall(DeleteFirewallRequest deleteFirewallRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFirewallRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFirewallRequest> request = null;
        Response<DeleteFirewallResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFirewallRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFirewallRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFirewall");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFirewallResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFirewallResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified <a>FirewallPolicy</a>.
     * </p>
     * 
     * @param deleteFirewallPolicyRequest
     * @return Result of the DeleteFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws UnsupportedOperationException
     *         The operation you requested isn't supported by Network Firewall.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DeleteFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteFirewallPolicyResult deleteFirewallPolicy(DeleteFirewallPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFirewallPolicy(request);
    }

    @SdkInternalApi
    final DeleteFirewallPolicyResult executeDeleteFirewallPolicy(DeleteFirewallPolicyRequest deleteFirewallPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFirewallPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFirewallPolicyRequest> request = null;
        Response<DeleteFirewallPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFirewallPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFirewallPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFirewallPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFirewallPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFirewallPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a resource policy that you created in a <a>PutResourcePolicy</a> request.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteResourcePolicy"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
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
     * Deletes the specified <a>RuleGroup</a>.
     * </p>
     * 
     * @param deleteRuleGroupRequest
     * @return Result of the DeleteRuleGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws UnsupportedOperationException
     *         The operation you requested isn't supported by Network Firewall.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRuleGroupResult deleteRuleGroup(DeleteRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRuleGroup(request);
    }

    @SdkInternalApi
    final DeleteRuleGroupResult executeDeleteRuleGroup(DeleteRuleGroupRequest deleteRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRuleGroupRequest> request = null;
        Response<DeleteRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data objects for the specified firewall.
     * </p>
     * 
     * @param describeFirewallRequest
     * @return Result of the DescribeFirewall operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DescribeFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFirewallResult describeFirewall(DescribeFirewallRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFirewall(request);
    }

    @SdkInternalApi
    final DescribeFirewallResult executeDescribeFirewall(DescribeFirewallRequest describeFirewallRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFirewallRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFirewallRequest> request = null;
        Response<DescribeFirewallResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFirewallRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFirewallRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFirewall");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFirewallResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFirewallResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data objects for the specified firewall policy.
     * </p>
     * 
     * @param describeFirewallPolicyRequest
     * @return Result of the DescribeFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.DescribeFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFirewallPolicyResult describeFirewallPolicy(DescribeFirewallPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFirewallPolicy(request);
    }

    @SdkInternalApi
    final DescribeFirewallPolicyResult executeDescribeFirewallPolicy(DescribeFirewallPolicyRequest describeFirewallPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFirewallPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFirewallPolicyRequest> request = null;
        Response<DescribeFirewallPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFirewallPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFirewallPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFirewallPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFirewallPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFirewallPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the logging configuration for the specified firewall.
     * </p>
     * 
     * @param describeLoggingConfigurationRequest
     * @return Result of the DescribeLoggingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DescribeLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeLoggingConfigurationResult describeLoggingConfiguration(DescribeLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeLoggingConfiguration(request);
    }

    @SdkInternalApi
    final DescribeLoggingConfigurationResult executeDescribeLoggingConfiguration(DescribeLoggingConfigurationRequest describeLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLoggingConfigurationRequest> request = null;
        Response<DescribeLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a resource policy that you created in a <a>PutResourcePolicy</a> request.
     * </p>
     * 
     * @param describeResourcePolicyRequest
     * @return Result of the DescribeResourcePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.DescribeResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeResourcePolicyResult describeResourcePolicy(DescribeResourcePolicyRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeResourcePolicy(request);
    }

    @SdkInternalApi
    final DescribeResourcePolicyResult executeDescribeResourcePolicy(DescribeResourcePolicyRequest describeResourcePolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(describeResourcePolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourcePolicyRequest> request = null;
        Response<DescribeResourcePolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourcePolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeResourcePolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeResourcePolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourcePolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourcePolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data objects for the specified rule group.
     * </p>
     * 
     * @param describeRuleGroupRequest
     * @return Result of the DescribeRuleGroup operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.DescribeRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeRuleGroupResult describeRuleGroup(DescribeRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRuleGroup(request);
    }

    @SdkInternalApi
    final DescribeRuleGroupResult executeDescribeRuleGroup(DescribeRuleGroupRequest describeRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRuleGroupRequest> request = null;
        Response<DescribeRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified subnet associations from the firewall. This removes the firewall endpoints from the subnets
     * and removes any network filtering protections that the endpoints were providing.
     * </p>
     * 
     * @param disassociateSubnetsRequest
     * @return Result of the DisassociateSubnets operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws InvalidOperationException
     *         The operation failed because it's not valid. For example, you might have tried to delete a rule group or
     *         firewall policy that's in use.
     * @sample AWSNetworkFirewall.DisassociateSubnets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DisassociateSubnets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateSubnetsResult disassociateSubnets(DisassociateSubnetsRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSubnets(request);
    }

    @SdkInternalApi
    final DisassociateSubnetsResult executeDisassociateSubnets(DisassociateSubnetsRequest disassociateSubnetsRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSubnetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSubnetsRequest> request = null;
        Response<DisassociateSubnetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSubnetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(disassociateSubnetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSubnets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSubnetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DisassociateSubnetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the metadata for the firewall policies that you have defined. Depending on your setting for max results
     * and the number of firewall policies, a single call might not return the full list.
     * </p>
     * 
     * @param listFirewallPoliciesRequest
     * @return Result of the ListFirewallPolicies operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.ListFirewallPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListFirewallPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListFirewallPoliciesResult listFirewallPolicies(ListFirewallPoliciesRequest request) {
        request = beforeClientExecution(request);
        return executeListFirewallPolicies(request);
    }

    @SdkInternalApi
    final ListFirewallPoliciesResult executeListFirewallPolicies(ListFirewallPoliciesRequest listFirewallPoliciesRequest) {

        ExecutionContext executionContext = createExecutionContext(listFirewallPoliciesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFirewallPoliciesRequest> request = null;
        Response<ListFirewallPoliciesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFirewallPoliciesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFirewallPoliciesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFirewallPolicies");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFirewallPoliciesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFirewallPoliciesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the metadata for the firewalls that you have defined. If you provide VPC identifiers in your request,
     * this returns only the firewalls for those VPCs.
     * </p>
     * <p>
     * Depending on your setting for max results and the number of firewalls, a single call might not return the full
     * list.
     * </p>
     * 
     * @param listFirewallsRequest
     * @return Result of the ListFirewalls operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @sample AWSNetworkFirewall.ListFirewalls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListFirewalls" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListFirewallsResult listFirewalls(ListFirewallsRequest request) {
        request = beforeClientExecution(request);
        return executeListFirewalls(request);
    }

    @SdkInternalApi
    final ListFirewallsResult executeListFirewalls(ListFirewallsRequest listFirewallsRequest) {

        ExecutionContext executionContext = createExecutionContext(listFirewallsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFirewallsRequest> request = null;
        Response<ListFirewallsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFirewallsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFirewallsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListFirewalls");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFirewallsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFirewallsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the metadata for the rule groups that you have defined. Depending on your setting for max results and
     * the number of rule groups, a single call might not return the full list.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return Result of the ListRuleGroups operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @sample AWSNetworkFirewall.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListRuleGroupsResult listRuleGroups(ListRuleGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListRuleGroups(request);
    }

    @SdkInternalApi
    final ListRuleGroupsResult executeListRuleGroups(ListRuleGroupsRequest listRuleGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listRuleGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRuleGroupsRequest> request = null;
        Response<ListRuleGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRuleGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRuleGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRuleGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRuleGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRuleGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the tags associated with the specified resource. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS
     * resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and
     * rule groups.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @sample AWSNetworkFirewall.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
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
     * Creates or updates an AWS Identity and Access Management policy for your rule group or firewall policy. Use this
     * to share rule groups and firewall policies between accounts. This operation works in conjunction with the AWS
     * Resource Access Manager (RAM) service to manage resource sharing for Network Firewall.
     * </p>
     * <p>
     * Use this operation to create or update a resource policy for your rule group or firewall policy. In the policy,
     * you specify the accounts that you want to share the resource with and the operations that you want the accounts
     * to be able to perform.
     * </p>
     * <p>
     * When you add an account in the resource policy, you then run the following Resource Access Manager (RAM)
     * operations to access and accept the shared rule group or firewall policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_GetResourceShareInvitations.html">
     * GetResourceShareInvitations</a> - Returns the Amazon Resource Names (ARNs) of the resource share invitations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/ram/latest/APIReference/API_AcceptResourceShareInvitation.html">
     * AcceptResourceShareInvitation</a> - Accepts the share invitation for a specified resource share.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional information about resource sharing using RAM, see <a
     * href="https://docs.aws.amazon.com/ram/latest/userguide/what-is.html">AWS Resource Access Manager User Guide</a>.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidResourcePolicyException
     * @sample AWSNetworkFirewall.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PutResourcePolicy"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
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
     * Adds the specified tags to the specified resource. Tags are key:value pairs that you can use to categorize and
     * manage your resources, for purposes like billing. For example, you might set the tag key to "customer" and the
     * value to the customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for
     * a resource.
     * </p>
     * <p>
     * You can tag the AWS resources that you manage through AWS Network Firewall: firewalls, firewall policies, and
     * rule groups.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @sample AWSNetworkFirewall.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
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
     * Removes the tags with the specified keys from the specified resource. Tags are key:value pairs that you can use
     * to categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each AWS
     * resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * You can manage tags for the AWS resources that you manage through AWS Network Firewall: firewalls, firewall
     * policies, and rule groups.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @sample AWSNetworkFirewall.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UntagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
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
     * Modifies the flag, <code>DeleteProtection</code>, which indicates whether it is possible to delete the firewall.
     * If the flag is set to <code>TRUE</code>, the firewall is protected against deletion. This setting helps protect
     * against accidentally deleting a firewall that's in use.
     * </p>
     * 
     * @param updateFirewallDeleteProtectionRequest
     * @return Result of the UpdateFirewallDeleteProtection operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws ResourceOwnerCheckException
     * @sample AWSNetworkFirewall.UpdateFirewallDeleteProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallDeleteProtection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFirewallDeleteProtectionResult updateFirewallDeleteProtection(UpdateFirewallDeleteProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFirewallDeleteProtection(request);
    }

    @SdkInternalApi
    final UpdateFirewallDeleteProtectionResult executeUpdateFirewallDeleteProtection(UpdateFirewallDeleteProtectionRequest updateFirewallDeleteProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFirewallDeleteProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFirewallDeleteProtectionRequest> request = null;
        Response<UpdateFirewallDeleteProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFirewallDeleteProtectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFirewallDeleteProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFirewallDeleteProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFirewallDeleteProtectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFirewallDeleteProtectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the description for the specified firewall. Use the description to help you identify the firewall when
     * you're working with it.
     * </p>
     * 
     * @param updateFirewallDescriptionRequest
     * @return Result of the UpdateFirewallDescription operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @sample AWSNetworkFirewall.UpdateFirewallDescription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallDescription"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFirewallDescriptionResult updateFirewallDescription(UpdateFirewallDescriptionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFirewallDescription(request);
    }

    @SdkInternalApi
    final UpdateFirewallDescriptionResult executeUpdateFirewallDescription(UpdateFirewallDescriptionRequest updateFirewallDescriptionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFirewallDescriptionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFirewallDescriptionRequest> request = null;
        Response<UpdateFirewallDescriptionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFirewallDescriptionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFirewallDescriptionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFirewallDescription");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFirewallDescriptionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFirewallDescriptionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the properties of the specified firewall policy.
     * </p>
     * 
     * @param updateFirewallPolicyRequest
     * @return Result of the UpdateFirewallPolicy operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @sample AWSNetworkFirewall.UpdateFirewallPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFirewallPolicyResult updateFirewallPolicy(UpdateFirewallPolicyRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFirewallPolicy(request);
    }

    @SdkInternalApi
    final UpdateFirewallPolicyResult executeUpdateFirewallPolicy(UpdateFirewallPolicyRequest updateFirewallPolicyRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFirewallPolicyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFirewallPolicyRequest> request = null;
        Response<UpdateFirewallPolicyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFirewallPolicyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFirewallPolicyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFirewallPolicy");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFirewallPolicyResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFirewallPolicyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p/>
     * 
     * @param updateFirewallPolicyChangeProtectionRequest
     * @return Result of the UpdateFirewallPolicyChangeProtection operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws ResourceOwnerCheckException
     * @sample AWSNetworkFirewall.UpdateFirewallPolicyChangeProtection
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateFirewallPolicyChangeProtection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateFirewallPolicyChangeProtectionResult updateFirewallPolicyChangeProtection(UpdateFirewallPolicyChangeProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFirewallPolicyChangeProtection(request);
    }

    @SdkInternalApi
    final UpdateFirewallPolicyChangeProtectionResult executeUpdateFirewallPolicyChangeProtection(
            UpdateFirewallPolicyChangeProtectionRequest updateFirewallPolicyChangeProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFirewallPolicyChangeProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFirewallPolicyChangeProtectionRequest> request = null;
        Response<UpdateFirewallPolicyChangeProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFirewallPolicyChangeProtectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateFirewallPolicyChangeProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFirewallPolicyChangeProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFirewallPolicyChangeProtectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateFirewallPolicyChangeProtectionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the logging configuration for the specified firewall.
     * </p>
     * <p>
     * To change the logging configuration, retrieve the <a>LoggingConfiguration</a> by calling
     * <a>DescribeLoggingConfiguration</a>, then change it and provide the modified object to this update call. You must
     * change the logging configuration one <a>LogDestinationConfig</a> at a time inside the retrieved
     * <a>LoggingConfiguration</a> object.
     * </p>
     * <p>
     * You can perform only one of the following actions in any call to <code>UpdateLoggingConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a new log destination object by adding a single <code>LogDestinationConfig</code> array element to
     * <code>LogDestinationConfigs</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Delete a log destination object by removing a single <code>LogDestinationConfig</code> array element from
     * <code>LogDestinationConfigs</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the <code>LogDestination</code> setting in a single <code>LogDestinationConfig</code> array element.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can't change the <code>LogDestinationType</code> or <code>LogType</code> in a
     * <code>LogDestinationConfig</code>. To change these settings, delete the existing
     * <code>LogDestinationConfig</code> object and create a new one, using two separate calls to this update operation.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     * @return Result of the UpdateLoggingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws LogDestinationPermissionException
     *         Unable to send logs to a configured logging destination.
     * @sample AWSNetworkFirewall.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateLoggingConfigurationResult updateLoggingConfiguration(UpdateLoggingConfigurationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateLoggingConfiguration(request);
    }

    @SdkInternalApi
    final UpdateLoggingConfigurationResult executeUpdateLoggingConfiguration(UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateLoggingConfigurationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateLoggingConfigurationRequest> request = null;
        Response<UpdateLoggingConfigurationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateLoggingConfigurationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateLoggingConfigurationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateLoggingConfiguration");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateLoggingConfigurationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateLoggingConfigurationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the rule settings for the specified rule group. You use a rule group by reference in one or more firewall
     * policies. When you modify a rule group, you modify all firewall policies that use the rule group.
     * </p>
     * <p>
     * To update a rule group, first call <a>DescribeRuleGroup</a> to retrieve the current <a>RuleGroup</a> object,
     * update the object as needed, and then provide the updated object to this call.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return Result of the UpdateRuleGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @sample AWSNetworkFirewall.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateRuleGroupResult updateRuleGroup(UpdateRuleGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRuleGroup(request);
    }

    @SdkInternalApi
    final UpdateRuleGroupResult executeUpdateRuleGroup(UpdateRuleGroupRequest updateRuleGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRuleGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRuleGroupRequest> request = null;
        Response<UpdateRuleGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRuleGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRuleGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRuleGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRuleGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRuleGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p/>
     * 
     * @param updateSubnetChangeProtectionRequest
     * @return Result of the UpdateSubnetChangeProtection operation returned by the service.
     * @throws InvalidRequestException
     *         The operation failed because of a problem with your request. Examples include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an unsupported parameter name or value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a property with a value that isn't among the available types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource that isn't valid in the
     *         context of the request.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         Your request is valid, but Network Firewall couldn’t perform the operation because of a system problem.
     *         Retry your request.
     * @throws ResourceNotFoundException
     *         Unable to locate a resource using the parameters that you provided.
     * @throws ThrottlingException
     *         Unable to process the request due to throttling limitations.
     * @throws InvalidTokenException
     *         The token you provided is stale or isn't valid for the operation.
     * @throws ResourceOwnerCheckException
     * @sample AWSNetworkFirewall.UpdateSubnetChangeProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateSubnetChangeProtection"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSubnetChangeProtectionResult updateSubnetChangeProtection(UpdateSubnetChangeProtectionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSubnetChangeProtection(request);
    }

    @SdkInternalApi
    final UpdateSubnetChangeProtectionResult executeUpdateSubnetChangeProtection(UpdateSubnetChangeProtectionRequest updateSubnetChangeProtectionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSubnetChangeProtectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSubnetChangeProtectionRequest> request = null;
        Response<UpdateSubnetChangeProtectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSubnetChangeProtectionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateSubnetChangeProtectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Network Firewall");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSubnetChangeProtection");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSubnetChangeProtectionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateSubnetChangeProtectionResultJsonUnmarshaller());
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
