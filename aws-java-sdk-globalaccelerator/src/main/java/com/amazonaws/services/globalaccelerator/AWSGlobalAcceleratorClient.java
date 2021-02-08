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
package com.amazonaws.services.globalaccelerator;

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

import com.amazonaws.services.globalaccelerator.AWSGlobalAcceleratorClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.globalaccelerator.model.*;
import com.amazonaws.services.globalaccelerator.model.transform.*;

/**
 * Client for accessing AWS Global Accelerator. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <fullname>AWS Global Accelerator</fullname>
 * <p>
 * This is the <i>AWS Global Accelerator API Reference</i>. This guide is for developers who need detailed information
 * about AWS Global Accelerator API actions, data types, and errors. For more information about Global Accelerator
 * features, see the <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/Welcome.html">AWS Global
 * Accelerator Developer Guide</a>.
 * </p>
 * <p>
 * AWS Global Accelerator is a service in which you create <i>accelerators</i> to improve the performance of your
 * applications for local and global users. Depending on the type of accelerator you choose, you can gain additional
 * benefits.
 * </p>
 * <ul>
 * <li>
 * <p>
 * By using a standard accelerator, you can improve availability of your internet applications that are used by a global
 * audience. With a standard accelerator, Global Accelerator directs traffic to optimal endpoints over the AWS global
 * network.
 * </p>
 * </li>
 * <li>
 * <p>
 * For other scenarios, you might choose a custom routing accelerator. With a custom routing accelerator, you can use
 * application logic to directly map one or more users to a specific endpoint among many endpoints.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the US
 * West (Oregon) Region to create or update accelerators.
 * </p>
 * </important>
 * <p>
 * By default, Global Accelerator provides you with two static IP addresses that you associate with your accelerator.
 * With a standard accelerator, instead of using the IP addresses that Global Accelerator provides, you can configure
 * these entry points to be IPv4 addresses from your own IP address ranges that you bring to Global Accelerator. The
 * static IP addresses are anycast from the AWS edge network. For a standard accelerator, they distribute incoming
 * application traffic across multiple endpoint resources in multiple AWS Regions, which increases the availability of
 * your applications. Endpoints for standard accelerators can be Network Load Balancers, Application Load Balancers,
 * Amazon EC2 instances, or Elastic IP addresses that are located in one AWS Region or multiple Regions. For custom
 * routing accelerators, you map traffic that arrives to the static IP addresses to specific Amazon EC2 servers in
 * endpoints that are virtual private cloud (VPC) subnets.
 * </p>
 * <important>
 * <p>
 * The static IP addresses remain assigned to your accelerator for as long as it exists, even if you disable the
 * accelerator and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the
 * static IP addresses that are assigned to it, so you can no longer route traffic by using them. You can use IAM
 * policies like tag-based permissions with Global Accelerator to limit the users who have permissions to delete an
 * accelerator. For more information, see <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/access-control-manage-access-tag-policies.html"
 * >Tag-based policies</a>.
 * </p>
 * </important>
 * <p>
 * For standard accelerators, Global Accelerator uses the AWS global network to route traffic to the optimal regional
 * endpoint based on health, client location, and policies that you configure. The service reacts instantly to changes
 * in health or configuration to ensure that internet traffic from clients is always directed to healthy endpoints.
 * </p>
 * <p>
 * For a list of the AWS Regions where Global Accelerator and other services are currently supported, see the <a
 * href="https://docs.aws.amazon.com/about-aws/global-infrastructure/regional-product-services/">AWS Region Table</a>.
 * </p>
 * <p>
 * AWS Global Accelerator includes the following components:
 * </p>
 * <dl>
 * <dt>Static IP addresses</dt>
 * <dd>
 * <p>
 * Global Accelerator provides you with a set of two static IP addresses that are anycast from the AWS edge network. If
 * you bring your own IP address range to AWS (BYOIP) to use with a standard accelerator, you can instead assign IP
 * addresses from your own pool to use with your accelerator. For more information, see <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html"> Bring your own IP addresses (BYOIP)
 * in AWS Global Accelerator</a>.
 * </p>
 * <p>
 * The IP addresses serve as single fixed entry points for your clients. If you already have Elastic Load Balancing load
 * balancers, Amazon EC2 instances, or Elastic IP address resources set up for your applications, you can easily add
 * those to a standard accelerator in Global Accelerator. This allows Global Accelerator to use static IP addresses to
 * access the resources.
 * </p>
 * <p>
 * The static IP addresses remain assigned to your accelerator for as long as it exists, even if you disable the
 * accelerator and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the
 * static IP addresses that are assigned to it, so you can no longer route traffic by using them. You can use IAM
 * policies like tag-based permissions with Global Accelerator to delete an accelerator. For more information, see <a
 * href
 * ="https://docs.aws.amazon.com/global-accelerator/latest/dg/access-control-manage-access-tag-policies.html">Tag-based
 * policies</a>.
 * </p>
 * </dd>
 * <dt>Accelerator</dt>
 * <dd>
 * <p>
 * An accelerator directs traffic to endpoints over the AWS global network to improve the performance of your internet
 * applications. Each accelerator includes one or more listeners.
 * </p>
 * <p>
 * There are two types of accelerators:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <i>standard</i> accelerator directs traffic to the optimal AWS endpoint based on several factors, including the
 * user’s location, the health of the endpoint, and the endpoint weights that you configure. This improves the
 * availability and performance of your applications. Endpoints can be Network Load Balancers, Application Load
 * Balancers, Amazon EC2 instances, or Elastic IP addresses.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>custom routing</i> accelerator directs traffic to one of possibly thousands of Amazon EC2 instances running in a
 * single or multiple virtual private clouds (VPCs). With custom routing, listener ports are mapped to statically
 * associate port ranges with VPC subnets, which allows Global Accelerator to determine an EC2 instance IP address at
 * the time of connection. By default, all port mapping destinations in a VPC subnet can't receive traffic. You can
 * choose to configure all destinations in the subnet to receive traffic, or to specify individual port mappings that
 * can receive traffic.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/introduction-accelerator-types.html">Types of
 * accelerators</a>.
 * </p>
 * </dd>
 * <dt>DNS name</dt>
 * <dd>
 * <p>
 * Global Accelerator assigns each accelerator a default Domain Name System (DNS) name, similar to
 * <code>a1234567890abcdef.awsglobalaccelerator.com</code>, that points to the static IP addresses that Global
 * Accelerator assigns to you or that you choose from your own IP address range. Depending on the use case, you can use
 * your accelerator's static IP addresses or DNS name to route traffic to your accelerator, or set up DNS records to
 * route traffic using your own custom domain name.
 * </p>
 * </dd>
 * <dt>Network zone</dt>
 * <dd>
 * <p>
 * A network zone services the static IP addresses for your accelerator from a unique IP subnet. Similar to an AWS
 * Availability Zone, a network zone is an isolated unit with its own set of physical infrastructure. When you configure
 * an accelerator, by default, Global Accelerator allocates two IPv4 addresses for it. If one IP address from a network
 * zone becomes unavailable due to IP address blocking by certain client networks, or network disruptions, then client
 * applications can retry on the healthy static IP address from the other isolated network zone.
 * </p>
 * </dd>
 * <dt>Listener</dt>
 * <dd>
 * <p>
 * A listener processes inbound connections from clients to Global Accelerator, based on the port (or port range) and
 * protocol (or protocols) that you configure. A listener can be configured for TCP, UDP, or both TCP and UDP protocols.
 * Each listener has one or more endpoint groups associated with it, and traffic is forwarded to endpoints in one of the
 * groups. You associate endpoint groups with listeners by specifying the Regions that you want to distribute traffic
 * to. With a standard accelerator, traffic is distributed to optimal endpoints within the endpoint groups associated
 * with a listener.
 * </p>
 * </dd>
 * <dt>Endpoint group</dt>
 * <dd>
 * <p>
 * Each endpoint group is associated with a specific AWS Region. Endpoint groups include one or more endpoints in the
 * Region. With a standard accelerator, you can increase or reduce the percentage of traffic that would be otherwise
 * directed to an endpoint group by adjusting a setting called a <i>traffic dial</i>. The traffic dial lets you easily
 * do performance testing or blue/green deployment testing, for example, for new releases across different AWS Regions.
 * </p>
 * </dd>
 * <dt>Endpoint</dt>
 * <dd>
 * <p>
 * An endpoint is a resource that Global Accelerator directs traffic to.
 * </p>
 * <p>
 * Endpoints for standard accelerators can be Network Load Balancers, Application Load Balancers, Amazon EC2 instances,
 * or Elastic IP addresses. An Application Load Balancer endpoint can be internet-facing or internal. Traffic for
 * standard accelerators is routed to endpoints based on the health of the endpoint along with configuration options
 * that you choose, such as endpoint weights. For each endpoint, you can configure weights, which are numbers that you
 * can use to specify the proportion of traffic to route to each one. This can be useful, for example, to do performance
 * testing within a Region.
 * </p>
 * <p>
 * Endpoints for custom routing accelerators are virtual private cloud (VPC) subnets with one or many EC2 instances.
 * </p>
 * </dd>
 * </dl>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSGlobalAcceleratorClient extends AmazonWebServiceClient implements AWSGlobalAccelerator {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSGlobalAccelerator.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "globalaccelerator";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EndpointNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.EndpointNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociatedListenerFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.AssociatedListenerFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociatedEndpointGroupFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.AssociatedEndpointGroupFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EndpointGroupAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.EndpointGroupAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPortRangeException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.InvalidPortRangeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EndpointAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.EndpointAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.InvalidArgumentExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ListenerNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.ListenerNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AcceleratorNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.AcceleratorNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncorrectCidrStateException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.IncorrectCidrStateExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ByoipCidrNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.ByoipCidrNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.InternalServiceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EndpointGroupNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.EndpointGroupNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AcceleratorNotDisabledException").withExceptionUnmarshaller(
                                    com.amazonaws.services.globalaccelerator.model.transform.AcceleratorNotDisabledExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.globalaccelerator.model.AWSGlobalAcceleratorException.class));

    public static AWSGlobalAcceleratorClientBuilder builder() {
        return AWSGlobalAcceleratorClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Global Accelerator using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGlobalAcceleratorClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Global Accelerator using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSGlobalAcceleratorClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("globalaccelerator.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/globalaccelerator/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/globalaccelerator/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associate a virtual private cloud (VPC) subnet endpoint with your custom routing accelerator.
     * </p>
     * <p>
     * The listener port range must be large enough to support the number of IP addresses that can be specified in your
     * subnet. The number of ports required is: subnet size times the number of ports per destination EC2 instances. For
     * example, a subnet defined as /24 requires a listener port range of at least 255 ports.
     * </p>
     * <p>
     * Note: You must have enough remaining listener ports available to map to the subnet ports, or the call will fail
     * with a LimitExceededException.
     * </p>
     * <p>
     * By default, all destinations in a subnet in a custom routing accelerator cannot receive traffic. To enable all
     * destinations to receive traffic, or to specify individual port mappings that can receive traffic, see the <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_AllowCustomRoutingTraffic.html">
     * AllowCustomRoutingTraffic</a> operation.
     * </p>
     * 
     * @param addCustomRoutingEndpointsRequest
     * @return Result of the AddCustomRoutingEndpoints operation returned by the service.
     * @throws EndpointAlreadyExistsException
     *         The endpoint that you specified doesn't exist.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ConflictException
     *         You can't use both of those options.
     * @sample AWSGlobalAccelerator.AddCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AddCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AddCustomRoutingEndpointsResult addCustomRoutingEndpoints(AddCustomRoutingEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeAddCustomRoutingEndpoints(request);
    }

    @SdkInternalApi
    final AddCustomRoutingEndpointsResult executeAddCustomRoutingEndpoints(AddCustomRoutingEndpointsRequest addCustomRoutingEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(addCustomRoutingEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddCustomRoutingEndpointsRequest> request = null;
        Response<AddCustomRoutingEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddCustomRoutingEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(addCustomRoutingEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddCustomRoutingEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddCustomRoutingEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddCustomRoutingEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP
     * addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to AWS
     * because of propagation delays.
     * </p>
     * <p>
     * To stop advertising the BYOIP address range, use <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/WithdrawByoipCidr.html"> WithdrawByoipCidr</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring Your Own IP Addresses
     * (BYOIP)</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param advertiseByoipCidrRequest
     * @return Result of the AdvertiseByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ByoipCidrNotFoundException
     *         The CIDR that you specified was not found or is incorrect.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.AdvertiseByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AdvertiseByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AdvertiseByoipCidrResult advertiseByoipCidr(AdvertiseByoipCidrRequest request) {
        request = beforeClientExecution(request);
        return executeAdvertiseByoipCidr(request);
    }

    @SdkInternalApi
    final AdvertiseByoipCidrResult executeAdvertiseByoipCidr(AdvertiseByoipCidrRequest advertiseByoipCidrRequest) {

        ExecutionContext executionContext = createExecutionContext(advertiseByoipCidrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AdvertiseByoipCidrRequest> request = null;
        Response<AdvertiseByoipCidrResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AdvertiseByoipCidrRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(advertiseByoipCidrRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AdvertiseByoipCidr");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AdvertiseByoipCidrResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AdvertiseByoipCidrResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that can receive
     * traffic for a custom routing accelerator. You can allow traffic to all destinations in the subnet endpoint, or
     * allow traffic to a specified list of destination IP addresses and ports in the subnet. Note that you cannot
     * specify IP addresses or ports outside of the range that you configured for the endpoint group.
     * </p>
     * <p>
     * After you make changes, you can verify that the updates are complete by checking the status of your accelerator:
     * the status changes from IN_PROGRESS to DEPLOYED.
     * </p>
     * 
     * @param allowCustomRoutingTrafficRequest
     * @return Result of the AllowCustomRoutingTraffic operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.AllowCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AllowCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AllowCustomRoutingTrafficResult allowCustomRoutingTraffic(AllowCustomRoutingTrafficRequest request) {
        request = beforeClientExecution(request);
        return executeAllowCustomRoutingTraffic(request);
    }

    @SdkInternalApi
    final AllowCustomRoutingTrafficResult executeAllowCustomRoutingTraffic(AllowCustomRoutingTrafficRequest allowCustomRoutingTrafficRequest) {

        ExecutionContext executionContext = createExecutionContext(allowCustomRoutingTrafficRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllowCustomRoutingTrafficRequest> request = null;
        Response<AllowCustomRoutingTrafficResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllowCustomRoutingTrafficRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(allowCustomRoutingTrafficRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AllowCustomRoutingTraffic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AllowCustomRoutingTrafficResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AllowCustomRoutingTrafficResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param createAcceleratorRequest
     * @return Result of the CreateAccelerator operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @sample AWSGlobalAccelerator.CreateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAcceleratorResult createAccelerator(CreateAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAccelerator(request);
    }

    @SdkInternalApi
    final CreateAcceleratorResult executeCreateAccelerator(CreateAcceleratorRequest createAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(createAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAcceleratorRequest> request = null;
        Response<CreateAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a custom routing accelerator. A custom routing accelerator directs traffic to one of possibly thousands of
     * Amazon EC2 instance destinations running in a single or multiple virtual private clouds (VPC) subnet endpoints.
     * </p>
     * <p>
     * Be aware that, by default, all destination EC2 instances in a VPC subnet endpoint cannot receive traffic. To
     * enable all destinations to receive traffic, or to specify individual port mappings that can receive traffic, see
     * the <a href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_AllowCustomRoutingTraffic.html">
     * AllowCustomRoutingTraffic</a> operation.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param createCustomRoutingAcceleratorRequest
     * @return Result of the CreateCustomRoutingAccelerator operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.CreateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomRoutingAcceleratorResult createCustomRoutingAccelerator(CreateCustomRoutingAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomRoutingAccelerator(request);
    }

    @SdkInternalApi
    final CreateCustomRoutingAcceleratorResult executeCreateCustomRoutingAccelerator(CreateCustomRoutingAcceleratorRequest createCustomRoutingAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomRoutingAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomRoutingAcceleratorRequest> request = null;
        Response<CreateCustomRoutingAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomRoutingAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCustomRoutingAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomRoutingAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomRoutingAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCustomRoutingAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an endpoint group for the specified listener for a custom routing accelerator. An endpoint group is a
     * collection of endpoints in one AWS Region.
     * </p>
     * 
     * @param createCustomRoutingEndpointGroupRequest
     * @return Result of the CreateCustomRoutingEndpointGroup operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws EndpointGroupAlreadyExistsException
     *         The endpoint group that you specified already exists.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.CreateCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomRoutingEndpointGroupResult createCustomRoutingEndpointGroup(CreateCustomRoutingEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomRoutingEndpointGroup(request);
    }

    @SdkInternalApi
    final CreateCustomRoutingEndpointGroupResult executeCreateCustomRoutingEndpointGroup(
            CreateCustomRoutingEndpointGroupRequest createCustomRoutingEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomRoutingEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomRoutingEndpointGroupRequest> request = null;
        Response<CreateCustomRoutingEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomRoutingEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCustomRoutingEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomRoutingEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomRoutingEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCustomRoutingEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a listener to process inbound connections from clients to a custom routing accelerator. Connections arrive
     * to assigned static IP addresses on the port range that you specify.
     * </p>
     * 
     * @param createCustomRoutingListenerRequest
     * @return Result of the CreateCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @sample AWSGlobalAccelerator.CreateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateCustomRoutingListenerResult createCustomRoutingListener(CreateCustomRoutingListenerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCustomRoutingListener(request);
    }

    @SdkInternalApi
    final CreateCustomRoutingListenerResult executeCreateCustomRoutingListener(CreateCustomRoutingListenerRequest createCustomRoutingListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(createCustomRoutingListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCustomRoutingListenerRequest> request = null;
        Response<CreateCustomRoutingListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCustomRoutingListenerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createCustomRoutingListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCustomRoutingListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCustomRoutingListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateCustomRoutingListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
     * Region. A resource must be valid and active when you add it as an endpoint.
     * </p>
     * 
     * @param createEndpointGroupRequest
     * @return Result of the CreateEndpointGroup operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws EndpointGroupAlreadyExistsException
     *         The endpoint group that you specified already exists.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.CreateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateEndpointGroupResult createEndpointGroup(CreateEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEndpointGroup(request);
    }

    @SdkInternalApi
    final CreateEndpointGroupResult executeCreateEndpointGroup(CreateEndpointGroupRequest createEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointGroupRequest> request = null;
        Response<CreateEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned
     * static IP addresses on a port, port range, or list of port ranges that you specify.
     * </p>
     * 
     * @param createListenerRequest
     * @return Result of the CreateListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @sample AWSGlobalAccelerator.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateListenerResult createListener(CreateListenerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateListener(request);
    }

    @SdkInternalApi
    final CreateListenerResult executeCreateListener(CreateListenerRequest createListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(createListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateListenerRequest> request = null;
        Response<CreateListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an accelerator. Before you can delete an accelerator, you must disable it and remove all dependent
     * resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set
     * <code>Enabled</code> to false.
     * </p>
     * <important>
     * <p>
     * When you create an accelerator, by default, Global Accelerator provides you with a set of two static IP
     * addresses. Alternatively, you can bring your own IP address ranges to Global Accelerator and assign IP addresses
     * from those ranges.
     * </p>
     * <p>
     * The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator
     * and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the static
     * IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best
     * practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM
     * policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/auth-and-access-control.html">Authentication and
     * Access Control</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param deleteAcceleratorRequest
     * @return Result of the DeleteAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws AcceleratorNotDisabledException
     *         The accelerator that you specified could not be disabled.
     * @throws AssociatedListenerFoundException
     *         The accelerator that you specified has a listener associated with it. You must remove all dependent
     *         resources from an accelerator before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DeleteAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAcceleratorResult deleteAccelerator(DeleteAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAccelerator(request);
    }

    @SdkInternalApi
    final DeleteAcceleratorResult executeDeleteAccelerator(DeleteAcceleratorRequest deleteAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAcceleratorRequest> request = null;
        Response<DeleteAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a custom routing accelerator. Before you can delete an accelerator, you must disable it and remove all
     * dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set
     * <code>Enabled</code> to false.
     * </p>
     * <important>
     * <p>
     * When you create a custom routing accelerator, by default, Global Accelerator provides you with a set of two
     * static IP addresses.
     * </p>
     * <p>
     * The IP addresses are assigned to your accelerator for as long as it exists, even if you disable the accelerator
     * and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the static
     * IP addresses that are assigned to the accelerator, so you can no longer route traffic by using them. As a best
     * practice, ensure that you have permissions in place to avoid inadvertently deleting accelerators. You can use IAM
     * policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/auth-and-access-control.html">Authentication and
     * Access Control</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param deleteCustomRoutingAcceleratorRequest
     * @return Result of the DeleteCustomRoutingAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws AcceleratorNotDisabledException
     *         The accelerator that you specified could not be disabled.
     * @throws AssociatedListenerFoundException
     *         The accelerator that you specified has a listener associated with it. You must remove all dependent
     *         resources from an accelerator before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DeleteCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomRoutingAcceleratorResult deleteCustomRoutingAccelerator(DeleteCustomRoutingAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomRoutingAccelerator(request);
    }

    @SdkInternalApi
    final DeleteCustomRoutingAcceleratorResult executeDeleteCustomRoutingAccelerator(DeleteCustomRoutingAcceleratorRequest deleteCustomRoutingAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomRoutingAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomRoutingAcceleratorRequest> request = null;
        Response<DeleteCustomRoutingAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomRoutingAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCustomRoutingAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomRoutingAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomRoutingAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCustomRoutingAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an endpoint group from a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingEndpointGroupRequest
     * @return Result of the DeleteCustomRoutingEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomRoutingEndpointGroupResult deleteCustomRoutingEndpointGroup(DeleteCustomRoutingEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomRoutingEndpointGroup(request);
    }

    @SdkInternalApi
    final DeleteCustomRoutingEndpointGroupResult executeDeleteCustomRoutingEndpointGroup(
            DeleteCustomRoutingEndpointGroupRequest deleteCustomRoutingEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomRoutingEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomRoutingEndpointGroupRequest> request = null;
        Response<DeleteCustomRoutingEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomRoutingEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCustomRoutingEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomRoutingEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomRoutingEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCustomRoutingEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingListenerRequest
     * @return Result of the DeleteCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws AssociatedEndpointGroupFoundException
     *         The listener that you specified has an endpoint group associated with it. You must remove all dependent
     *         resources from a listener before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteCustomRoutingListenerResult deleteCustomRoutingListener(DeleteCustomRoutingListenerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCustomRoutingListener(request);
    }

    @SdkInternalApi
    final DeleteCustomRoutingListenerResult executeDeleteCustomRoutingListener(DeleteCustomRoutingListenerRequest deleteCustomRoutingListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCustomRoutingListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCustomRoutingListenerRequest> request = null;
        Response<DeleteCustomRoutingListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCustomRoutingListenerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteCustomRoutingListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCustomRoutingListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCustomRoutingListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteCustomRoutingListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete an endpoint group from a listener.
     * </p>
     * 
     * @param deleteEndpointGroupRequest
     * @return Result of the DeleteEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteEndpointGroupResult deleteEndpointGroup(DeleteEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEndpointGroup(request);
    }

    @SdkInternalApi
    final DeleteEndpointGroupResult executeDeleteEndpointGroup(DeleteEndpointGroupRequest deleteEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointGroupRequest> request = null;
        Response<DeleteEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a listener from an accelerator.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return Result of the DeleteListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws AssociatedEndpointGroupFoundException
     *         The listener that you specified has an endpoint group associated with it. You must remove all dependent
     *         resources from a listener before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteListenerResult deleteListener(DeleteListenerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteListener(request);
    }

    @SdkInternalApi
    final DeleteListenerResult executeDeleteListener(DeleteListenerRequest deleteListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteListenerRequest> request = null;
        Response<DeleteListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that cannot
     * receive traffic for a custom routing accelerator. You can deny traffic to all destinations in the VPC endpoint,
     * or deny traffic to a specified list of destination IP addresses and ports. Note that you cannot specify IP
     * addresses or ports outside of the range that you configured for the endpoint group.
     * </p>
     * <p>
     * After you make changes, you can verify that the updates are complete by checking the status of your accelerator:
     * the status changes from IN_PROGRESS to DEPLOYED.
     * </p>
     * 
     * @param denyCustomRoutingTrafficRequest
     * @return Result of the DenyCustomRoutingTraffic operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DenyCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DenyCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DenyCustomRoutingTrafficResult denyCustomRoutingTraffic(DenyCustomRoutingTrafficRequest request) {
        request = beforeClientExecution(request);
        return executeDenyCustomRoutingTraffic(request);
    }

    @SdkInternalApi
    final DenyCustomRoutingTrafficResult executeDenyCustomRoutingTraffic(DenyCustomRoutingTrafficRequest denyCustomRoutingTrafficRequest) {

        ExecutionContext executionContext = createExecutionContext(denyCustomRoutingTrafficRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DenyCustomRoutingTrafficRequest> request = null;
        Response<DenyCustomRoutingTrafficResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DenyCustomRoutingTrafficRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(denyCustomRoutingTrafficRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DenyCustomRoutingTraffic");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DenyCustomRoutingTrafficResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DenyCustomRoutingTrafficResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Releases the specified address range that you provisioned to use with your AWS resources through bring your own
     * IP addresses (BYOIP) and deletes the corresponding address pool.
     * </p>
     * <p>
     * Before you can release an address range, you must stop advertising it by using <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/WithdrawByoipCidr.html">WithdrawByoipCidr</a> and
     * you must not have any accelerators that are using static IP addresses allocated from its address range.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring Your Own IP Addresses
     * (BYOIP)</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param deprovisionByoipCidrRequest
     * @return Result of the DeprovisionByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ByoipCidrNotFoundException
     *         The CIDR that you specified was not found or is incorrect.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.DeprovisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeprovisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeprovisionByoipCidrResult deprovisionByoipCidr(DeprovisionByoipCidrRequest request) {
        request = beforeClientExecution(request);
        return executeDeprovisionByoipCidr(request);
    }

    @SdkInternalApi
    final DeprovisionByoipCidrResult executeDeprovisionByoipCidr(DeprovisionByoipCidrRequest deprovisionByoipCidrRequest) {

        ExecutionContext executionContext = createExecutionContext(deprovisionByoipCidrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeprovisionByoipCidrRequest> request = null;
        Response<DeprovisionByoipCidrResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeprovisionByoipCidrRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deprovisionByoipCidrRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeprovisionByoipCidr");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeprovisionByoipCidrResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeprovisionByoipCidrResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe an accelerator.
     * </p>
     * 
     * @param describeAcceleratorRequest
     * @return Result of the DescribeAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAcceleratorResult describeAccelerator(DescribeAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAccelerator(request);
    }

    @SdkInternalApi
    final DescribeAcceleratorResult executeDescribeAccelerator(DescribeAcceleratorRequest describeAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAcceleratorRequest> request = null;
        Response<DescribeAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe the attributes of an accelerator.
     * </p>
     * 
     * @param describeAcceleratorAttributesRequest
     * @return Result of the DescribeAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAcceleratorAttributesResult describeAcceleratorAttributes(DescribeAcceleratorAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAcceleratorAttributes(request);
    }

    @SdkInternalApi
    final DescribeAcceleratorAttributesResult executeDescribeAcceleratorAttributes(DescribeAcceleratorAttributesRequest describeAcceleratorAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAcceleratorAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAcceleratorAttributesRequest> request = null;
        Response<DescribeAcceleratorAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAcceleratorAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAcceleratorAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAcceleratorAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAcceleratorAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAcceleratorAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorRequest
     * @return Result of the DescribeCustomRoutingAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingAccelerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCustomRoutingAcceleratorResult describeCustomRoutingAccelerator(DescribeCustomRoutingAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCustomRoutingAccelerator(request);
    }

    @SdkInternalApi
    final DescribeCustomRoutingAcceleratorResult executeDescribeCustomRoutingAccelerator(
            DescribeCustomRoutingAcceleratorRequest describeCustomRoutingAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCustomRoutingAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomRoutingAcceleratorRequest> request = null;
        Response<DescribeCustomRoutingAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomRoutingAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCustomRoutingAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCustomRoutingAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCustomRoutingAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCustomRoutingAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe the attributes of a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorAttributesRequest
     * @return Result of the DescribeCustomRoutingAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCustomRoutingAcceleratorAttributesResult describeCustomRoutingAcceleratorAttributes(DescribeCustomRoutingAcceleratorAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCustomRoutingAcceleratorAttributes(request);
    }

    @SdkInternalApi
    final DescribeCustomRoutingAcceleratorAttributesResult executeDescribeCustomRoutingAcceleratorAttributes(
            DescribeCustomRoutingAcceleratorAttributesRequest describeCustomRoutingAcceleratorAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCustomRoutingAcceleratorAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomRoutingAcceleratorAttributesRequest> request = null;
        Response<DescribeCustomRoutingAcceleratorAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomRoutingAcceleratorAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCustomRoutingAcceleratorAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCustomRoutingAcceleratorAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCustomRoutingAcceleratorAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeCustomRoutingAcceleratorAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe an endpoint group for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingEndpointGroupRequest
     * @return Result of the DescribeCustomRoutingEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCustomRoutingEndpointGroupResult describeCustomRoutingEndpointGroup(DescribeCustomRoutingEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCustomRoutingEndpointGroup(request);
    }

    @SdkInternalApi
    final DescribeCustomRoutingEndpointGroupResult executeDescribeCustomRoutingEndpointGroup(
            DescribeCustomRoutingEndpointGroupRequest describeCustomRoutingEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCustomRoutingEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomRoutingEndpointGroupRequest> request = null;
        Response<DescribeCustomRoutingEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomRoutingEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCustomRoutingEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCustomRoutingEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCustomRoutingEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCustomRoutingEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The description of a listener for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingListenerRequest
     * @return Result of the DescribeCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeCustomRoutingListenerResult describeCustomRoutingListener(DescribeCustomRoutingListenerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCustomRoutingListener(request);
    }

    @SdkInternalApi
    final DescribeCustomRoutingListenerResult executeDescribeCustomRoutingListener(DescribeCustomRoutingListenerRequest describeCustomRoutingListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCustomRoutingListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCustomRoutingListenerRequest> request = null;
        Response<DescribeCustomRoutingListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCustomRoutingListenerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCustomRoutingListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCustomRoutingListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCustomRoutingListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCustomRoutingListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe an endpoint group.
     * </p>
     * 
     * @param describeEndpointGroupRequest
     * @return Result of the DescribeEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEndpointGroupResult describeEndpointGroup(DescribeEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEndpointGroup(request);
    }

    @SdkInternalApi
    final DescribeEndpointGroupResult executeDescribeEndpointGroup(DescribeEndpointGroupRequest describeEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointGroupRequest> request = null;
        Response<DescribeEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEndpointGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describe a listener.
     * </p>
     * 
     * @param describeListenerRequest
     * @return Result of the DescribeListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeListenerResult describeListener(DescribeListenerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeListener(request);
    }

    @SdkInternalApi
    final DescribeListenerResult executeDescribeListener(DescribeListenerRequest describeListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeListenerRequest> request = null;
        Response<DescribeListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the accelerators for an AWS account.
     * </p>
     * 
     * @param listAcceleratorsRequest
     * @return Result of the ListAccelerators operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListAcceleratorsResult listAccelerators(ListAcceleratorsRequest request) {
        request = beforeClientExecution(request);
        return executeListAccelerators(request);
    }

    @SdkInternalApi
    final ListAcceleratorsResult executeListAccelerators(ListAcceleratorsRequest listAcceleratorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAcceleratorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAcceleratorsRequest> request = null;
        Response<ListAcceleratorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAcceleratorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAcceleratorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAccelerators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAcceleratorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAcceleratorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the IP address ranges that were specified in calls to <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/ProvisionByoipCidr.html">ProvisionByoipCidr</a>,
     * including the current state and a history of state changes.
     * </p>
     * 
     * @param listByoipCidrsRequest
     * @return Result of the ListByoipCidrs operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @sample AWSGlobalAccelerator.ListByoipCidrs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListByoipCidrs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListByoipCidrsResult listByoipCidrs(ListByoipCidrsRequest request) {
        request = beforeClientExecution(request);
        return executeListByoipCidrs(request);
    }

    @SdkInternalApi
    final ListByoipCidrsResult executeListByoipCidrs(ListByoipCidrsRequest listByoipCidrsRequest) {

        ExecutionContext executionContext = createExecutionContext(listByoipCidrsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListByoipCidrsRequest> request = null;
        Response<ListByoipCidrsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListByoipCidrsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listByoipCidrsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListByoipCidrs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListByoipCidrsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListByoipCidrsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the custom routing accelerators for an AWS account.
     * </p>
     * 
     * @param listCustomRoutingAcceleratorsRequest
     * @return Result of the ListCustomRoutingAccelerators operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomRoutingAcceleratorsResult listCustomRoutingAccelerators(ListCustomRoutingAcceleratorsRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomRoutingAccelerators(request);
    }

    @SdkInternalApi
    final ListCustomRoutingAcceleratorsResult executeListCustomRoutingAccelerators(ListCustomRoutingAcceleratorsRequest listCustomRoutingAcceleratorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomRoutingAcceleratorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomRoutingAcceleratorsRequest> request = null;
        Response<ListCustomRoutingAcceleratorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomRoutingAcceleratorsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomRoutingAcceleratorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomRoutingAccelerators");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomRoutingAcceleratorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCustomRoutingAcceleratorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the endpoint groups that are associated with a listener for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingEndpointGroupsRequest
     * @return Result of the ListCustomRoutingEndpointGroups operation returned by the service.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingEndpointGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomRoutingEndpointGroupsResult listCustomRoutingEndpointGroups(ListCustomRoutingEndpointGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomRoutingEndpointGroups(request);
    }

    @SdkInternalApi
    final ListCustomRoutingEndpointGroupsResult executeListCustomRoutingEndpointGroups(
            ListCustomRoutingEndpointGroupsRequest listCustomRoutingEndpointGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomRoutingEndpointGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomRoutingEndpointGroupsRequest> request = null;
        Response<ListCustomRoutingEndpointGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomRoutingEndpointGroupsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomRoutingEndpointGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomRoutingEndpointGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomRoutingEndpointGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCustomRoutingEndpointGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the listeners for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingListenersRequest
     * @return Result of the ListCustomRoutingListeners operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingListeners"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomRoutingListenersResult listCustomRoutingListeners(ListCustomRoutingListenersRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomRoutingListeners(request);
    }

    @SdkInternalApi
    final ListCustomRoutingListenersResult executeListCustomRoutingListeners(ListCustomRoutingListenersRequest listCustomRoutingListenersRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomRoutingListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomRoutingListenersRequest> request = null;
        Response<ListCustomRoutingListenersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomRoutingListenersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomRoutingListenersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomRoutingListeners");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomRoutingListenersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCustomRoutingListenersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides a complete mapping from the public accelerator IP address and port to destination EC2 instance IP
     * addresses and ports in the virtual public cloud (VPC) subnet endpoint for a custom routing accelerator. For each
     * subnet endpoint that you add, Global Accelerator creates a new static port mapping for the accelerator. The port
     * mappings don't change after Global Accelerator generates them, so you can retrieve and cache the full mapping on
     * your servers.
     * </p>
     * <p>
     * If you remove a subnet from your accelerator, Global Accelerator removes (reclaims) the port mappings. If you add
     * a subnet to your accelerator, Global Accelerator creates new port mappings (the existing ones don't change). If
     * you add or remove EC2 instances in your subnet, the port mappings don't change, because the mappings are created
     * when you add the subnet to Global Accelerator.
     * </p>
     * <p>
     * The mappings also include a flag for each destination denoting which destination IP addresses and ports are
     * allowed or denied traffic.
     * </p>
     * 
     * @param listCustomRoutingPortMappingsRequest
     * @return Result of the ListCustomRoutingPortMappings operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingPortMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappings"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomRoutingPortMappingsResult listCustomRoutingPortMappings(ListCustomRoutingPortMappingsRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomRoutingPortMappings(request);
    }

    @SdkInternalApi
    final ListCustomRoutingPortMappingsResult executeListCustomRoutingPortMappings(ListCustomRoutingPortMappingsRequest listCustomRoutingPortMappingsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomRoutingPortMappingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomRoutingPortMappingsRequest> request = null;
        Response<ListCustomRoutingPortMappingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomRoutingPortMappingsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomRoutingPortMappingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomRoutingPortMappings");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomRoutingPortMappingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCustomRoutingPortMappingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the port mappings for a specific EC2 instance (destination) in a VPC subnet endpoint. The response is the
     * mappings for one destination IP address. This is useful when your subnet endpoint has mappings that span multiple
     * custom routing accelerators in your account, or for scenarios where you only want to list the port mappings for a
     * specific destination instance.
     * </p>
     * 
     * @param listCustomRoutingPortMappingsByDestinationRequest
     * @return Result of the ListCustomRoutingPortMappingsByDestination operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws EndpointNotFoundException
     *         The endpoint that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingPortMappingsByDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappingsByDestination"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCustomRoutingPortMappingsByDestinationResult listCustomRoutingPortMappingsByDestination(ListCustomRoutingPortMappingsByDestinationRequest request) {
        request = beforeClientExecution(request);
        return executeListCustomRoutingPortMappingsByDestination(request);
    }

    @SdkInternalApi
    final ListCustomRoutingPortMappingsByDestinationResult executeListCustomRoutingPortMappingsByDestination(
            ListCustomRoutingPortMappingsByDestinationRequest listCustomRoutingPortMappingsByDestinationRequest) {

        ExecutionContext executionContext = createExecutionContext(listCustomRoutingPortMappingsByDestinationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCustomRoutingPortMappingsByDestinationRequest> request = null;
        Response<ListCustomRoutingPortMappingsByDestinationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCustomRoutingPortMappingsByDestinationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listCustomRoutingPortMappingsByDestinationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCustomRoutingPortMappingsByDestination");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCustomRoutingPortMappingsByDestinationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListCustomRoutingPortMappingsByDestinationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the endpoint groups that are associated with a listener.
     * </p>
     * 
     * @param listEndpointGroupsRequest
     * @return Result of the ListEndpointGroups operation returned by the service.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListEndpointGroupsResult listEndpointGroups(ListEndpointGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListEndpointGroups(request);
    }

    @SdkInternalApi
    final ListEndpointGroupsResult executeListEndpointGroups(ListEndpointGroupsRequest listEndpointGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listEndpointGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEndpointGroupsRequest> request = null;
        Response<ListEndpointGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEndpointGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEndpointGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEndpointGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEndpointGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEndpointGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the listeners for an accelerator.
     * </p>
     * 
     * @param listListenersRequest
     * @return Result of the ListListeners operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListListeners"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListListenersResult listListeners(ListListenersRequest request) {
        request = beforeClientExecution(request);
        return executeListListeners(request);
    }

    @SdkInternalApi
    final ListListenersResult executeListListeners(ListListenersRequest listListenersRequest) {

        ExecutionContext executionContext = createExecutionContext(listListenersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListListenersRequest> request = null;
        Response<ListListenersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListListenersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listListenersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListListeners");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListListenersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListListenersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all tags for an accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListTagsForResource"
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
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
     * Provisions an IP address range to use with your AWS resources through bring your own IP addresses (BYOIP) and
     * creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using
     * <a href="https://docs.aws.amazon.com/global-accelerator/latest/api/AdvertiseByoipCidr.html">
     * AdvertiseByoipCidr</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring Your Own IP Addresses
     * (BYOIP)</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param provisionByoipCidrRequest
     * @return Result of the ProvisionByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.ProvisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ProvisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ProvisionByoipCidrResult provisionByoipCidr(ProvisionByoipCidrRequest request) {
        request = beforeClientExecution(request);
        return executeProvisionByoipCidr(request);
    }

    @SdkInternalApi
    final ProvisionByoipCidrResult executeProvisionByoipCidr(ProvisionByoipCidrRequest provisionByoipCidrRequest) {

        ExecutionContext executionContext = createExecutionContext(provisionByoipCidrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ProvisionByoipCidrRequest> request = null;
        Response<ProvisionByoipCidrResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ProvisionByoipCidrRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(provisionByoipCidrRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ProvisionByoipCidr");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ProvisionByoipCidrResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ProvisionByoipCidrResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Remove endpoints from a custom routing accelerator.
     * </p>
     * 
     * @param removeCustomRoutingEndpointsRequest
     * @return Result of the RemoveCustomRoutingEndpoints operation returned by the service.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws EndpointNotFoundException
     *         The endpoint that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ConflictException
     *         You can't use both of those options.
     * @sample AWSGlobalAccelerator.RemoveCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/RemoveCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RemoveCustomRoutingEndpointsResult removeCustomRoutingEndpoints(RemoveCustomRoutingEndpointsRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveCustomRoutingEndpoints(request);
    }

    @SdkInternalApi
    final RemoveCustomRoutingEndpointsResult executeRemoveCustomRoutingEndpoints(RemoveCustomRoutingEndpointsRequest removeCustomRoutingEndpointsRequest) {

        ExecutionContext executionContext = createExecutionContext(removeCustomRoutingEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveCustomRoutingEndpointsRequest> request = null;
        Response<RemoveCustomRoutingEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveCustomRoutingEndpointsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeCustomRoutingEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveCustomRoutingEndpoints");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveCustomRoutingEndpointsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveCustomRoutingEndpointsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add tags to an accelerator resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/TagResource" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
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
     * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and
     * its associated value. The operation succeeds even if you attempt to remove tags from an accelerator that was
     * already removed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UntagResource"
     *      target="_top">AWS API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
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
     * Update an accelerator.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param updateAcceleratorRequest
     * @return Result of the UpdateAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UpdateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAcceleratorResult updateAccelerator(UpdateAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAccelerator(request);
    }

    @SdkInternalApi
    final UpdateAcceleratorResult executeUpdateAccelerator(UpdateAcceleratorRequest updateAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAcceleratorRequest> request = null;
        Response<UpdateAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the attributes for an accelerator.
     * </p>
     * 
     * @param updateAcceleratorAttributesRequest
     * @return Result of the UpdateAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.UpdateAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAcceleratorAttributesResult updateAcceleratorAttributes(UpdateAcceleratorAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAcceleratorAttributes(request);
    }

    @SdkInternalApi
    final UpdateAcceleratorAttributesResult executeUpdateAcceleratorAttributes(UpdateAcceleratorAttributesRequest updateAcceleratorAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAcceleratorAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAcceleratorAttributesRequest> request = null;
        Response<UpdateAcceleratorAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAcceleratorAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAcceleratorAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAcceleratorAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAcceleratorAttributesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAcceleratorAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorRequest
     * @return Result of the UpdateCustomRoutingAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UpdateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCustomRoutingAcceleratorResult updateCustomRoutingAccelerator(UpdateCustomRoutingAcceleratorRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCustomRoutingAccelerator(request);
    }

    @SdkInternalApi
    final UpdateCustomRoutingAcceleratorResult executeUpdateCustomRoutingAccelerator(UpdateCustomRoutingAcceleratorRequest updateCustomRoutingAcceleratorRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCustomRoutingAcceleratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomRoutingAcceleratorRequest> request = null;
        Response<UpdateCustomRoutingAcceleratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomRoutingAcceleratorRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCustomRoutingAcceleratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCustomRoutingAccelerator");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCustomRoutingAcceleratorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCustomRoutingAcceleratorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update the attributes for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorAttributesRequest
     * @return Result of the UpdateCustomRoutingAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.UpdateCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCustomRoutingAcceleratorAttributesResult updateCustomRoutingAcceleratorAttributes(UpdateCustomRoutingAcceleratorAttributesRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCustomRoutingAcceleratorAttributes(request);
    }

    @SdkInternalApi
    final UpdateCustomRoutingAcceleratorAttributesResult executeUpdateCustomRoutingAcceleratorAttributes(
            UpdateCustomRoutingAcceleratorAttributesRequest updateCustomRoutingAcceleratorAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCustomRoutingAcceleratorAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomRoutingAcceleratorAttributesRequest> request = null;
        Response<UpdateCustomRoutingAcceleratorAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomRoutingAcceleratorAttributesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCustomRoutingAcceleratorAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCustomRoutingAcceleratorAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCustomRoutingAcceleratorAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new UpdateCustomRoutingAcceleratorAttributesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a listener for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingListenerRequest
     * @return Result of the UpdateCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @sample AWSGlobalAccelerator.UpdateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateCustomRoutingListenerResult updateCustomRoutingListener(UpdateCustomRoutingListenerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCustomRoutingListener(request);
    }

    @SdkInternalApi
    final UpdateCustomRoutingListenerResult executeUpdateCustomRoutingListener(UpdateCustomRoutingListenerRequest updateCustomRoutingListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCustomRoutingListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCustomRoutingListenerRequest> request = null;
        Response<UpdateCustomRoutingListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCustomRoutingListenerRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateCustomRoutingListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCustomRoutingListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCustomRoutingListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateCustomRoutingListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update an endpoint group. A resource must be valid and active when you add it as an endpoint.
     * </p>
     * 
     * @param updateEndpointGroupRequest
     * @return Result of the UpdateEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.UpdateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateEndpointGroupResult updateEndpointGroup(UpdateEndpointGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateEndpointGroup(request);
    }

    @SdkInternalApi
    final UpdateEndpointGroupResult executeUpdateEndpointGroup(UpdateEndpointGroupRequest updateEndpointGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateEndpointGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEndpointGroupRequest> request = null;
        Response<UpdateEndpointGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEndpointGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateEndpointGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateEndpointGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateEndpointGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateEndpointGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Update a listener.
     * </p>
     * 
     * @param updateListenerRequest
     * @return Result of the UpdateListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @sample AWSGlobalAccelerator.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateListener"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateListenerResult updateListener(UpdateListenerRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateListener(request);
    }

    @SdkInternalApi
    final UpdateListenerResult executeUpdateListener(UpdateListenerRequest updateListenerRequest) {

        ExecutionContext executionContext = createExecutionContext(updateListenerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateListenerRequest> request = null;
        Response<UpdateListenerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateListenerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateListenerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateListener");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateListenerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateListenerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most
     * once every 10 seconds, even if you specify different address ranges each time.
     * </p>
     * <p>
     * It can take a few minutes before traffic to the specified addresses stops routing to AWS because of propagation
     * delays.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring Your Own IP Addresses
     * (BYOIP)</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param withdrawByoipCidrRequest
     * @return Result of the WithdrawByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ByoipCidrNotFoundException
     *         The CIDR that you specified was not found or is incorrect.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.WithdrawByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/WithdrawByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public WithdrawByoipCidrResult withdrawByoipCidr(WithdrawByoipCidrRequest request) {
        request = beforeClientExecution(request);
        return executeWithdrawByoipCidr(request);
    }

    @SdkInternalApi
    final WithdrawByoipCidrResult executeWithdrawByoipCidr(WithdrawByoipCidrRequest withdrawByoipCidrRequest) {

        ExecutionContext executionContext = createExecutionContext(withdrawByoipCidrRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<WithdrawByoipCidrRequest> request = null;
        Response<WithdrawByoipCidrResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new WithdrawByoipCidrRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(withdrawByoipCidrRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Global Accelerator");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "WithdrawByoipCidr");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<WithdrawByoipCidrResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new WithdrawByoipCidrResultJsonUnmarshaller());
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
