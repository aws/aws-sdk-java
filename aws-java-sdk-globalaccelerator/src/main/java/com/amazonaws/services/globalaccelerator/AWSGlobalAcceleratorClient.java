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
 * AWS Global Accelerator is a network layer service in which you create accelerators to improve availability and
 * performance for internet applications used by a global audience.
 * </p>
 * <p>
 * Global Accelerator provides you with static IP addresses that you associate with your accelerator. These IP addresses
 * are anycast from the AWS edge network and distribute incoming application traffic across multiple endpoint resources
 * in multiple AWS Regions, which increases the availability of your applications. Endpoints can be Elastic IP
 * addresses, Network Load Balancers, and Application Load Balancers that are located in one AWS Region or multiple
 * Regions.
 * </p>
 * <p>
 * Global Accelerator uses the AWS global network to route traffic to the optimal regional endpoint based on health,
 * client location, and policies that you configure. The service reacts instantly to changes in health or configuration
 * to ensure that internet traffic from clients is directed to only healthy endpoints.
 * </p>
 * <p>
 * Global Accelerator includes components that work together to help you improve performance and availability for your
 * applications:
 * </p>
 * <dl>
 * <dt>Static IP address</dt>
 * <dd>
 * <p>
 * AWS Global Accelerator provides you with a set of static IP addresses which are anycast from the AWS edge network and
 * serve as the single fixed entry points for your clients. If you already have Elastic Load Balancing or Elastic IP
 * address resources set up for your applications, you can easily add those to Global Accelerator to allow the resources
 * to be accessed by a Global Accelerator static IP address.
 * </p>
 * </dd>
 * <dt>Accelerator</dt>
 * <dd>
 * <p>
 * An accelerator directs traffic to optimal endpoints over the AWS global network to improve availability and
 * performance for your internet applications that have a global audience. Each accelerator includes one or more
 * listeners.
 * </p>
 * </dd>
 * <dt>Network zone</dt>
 * <dd>
 * <p>
 * A network zone services the static IP addresses for your accelerator from a unique IP subnet. Similar to an AWS
 * Availability Zone, a network zone is an isolated unit with its own set of physical infrastructure. When you configure
 * an accelerator, Global Accelerator allocates two IPv4 addresses for it. If one IP address from a network zone becomes
 * unavailable due to IP address blocking by certain client networks, or network disruptions, then client applications
 * can retry on the healthy static IP address from the other isolated network zone.
 * </p>
 * </dd>
 * <dt>Listener</dt>
 * <dd>
 * <p>
 * A listener processes inbound connections from clients to Global Accelerator, based on the protocol and port that you
 * configure. Each listener has one or more endpoint groups associated with it, and traffic is forwarded to endpoints in
 * one of the groups. You associate endpoint groups with listeners by specifying the Regions that you want to distribute
 * traffic to. Traffic is distributed to optimal endpoints within the endpoint groups associated with a listener.
 * </p>
 * </dd>
 * <dt>Endpoint group</dt>
 * <dd>
 * <p>
 * Each endpoint group is associated with a specific AWS Region. Endpoint groups include one or more endpoints in the
 * Region. You can increase or reduce the percentage of traffic that would be otherwise directed to an endpoint group by
 * adjusting a setting called a <i>traffic dial</i>. The traffic dial lets you easily do performance testing or
 * blue/green deployment testing for new releases across different AWS Regions, for example.
 * </p>
 * </dd>
 * <dt>Endpoint</dt>
 * <dd>
 * <p>
 * An endpoint is an Elastic IP address, Network Load Balancer, or Application Load Balancer. Traffic is routed to
 * endpoints based on several factors, including the geo-proximity to the user, the health of the endpoint, and the
 * configuration options that you choose, such as endpoint weights. For each endpoint, you can configure weights, which
 * are numbers that you can use to specify the proportion of traffic to route to each one. This can be useful, for
 * example, to do performance testing within a Region.
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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidArgumentException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.InvalidArgumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ListenerNotFoundException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.ListenerNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AcceleratorNotFoundException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.AcceleratorNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociatedListenerFoundException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.AssociatedListenerFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServiceErrorException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.InternalServiceErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociatedEndpointGroupFoundException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.AssociatedEndpointGroupFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EndpointGroupNotFoundException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.EndpointGroupNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AcceleratorNotDisabledException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.AcceleratorNotDisabledException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("EndpointGroupAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.EndpointGroupAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPortRangeException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.InvalidPortRangeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.globalaccelerator.model.LimitExceededException.class))
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
     * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see
     * an AWS CLI example of creating an accelerator, scroll down to <b>Example</b>.
     * </p>
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
     * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
     * Region. To see an AWS CLI example of creating an endpoint group, scroll down to <b>Example</b>.
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
     * static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of
     * creating a listener, scroll down to <b>Example</b>.
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
     * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent
     * resources (listeners and endpoint groups).
     * </p>
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
     * Delete an endpoint group from a listener.
     * </p>
     * 
     * @param deleteEndpointGroupRequest
     * @return Result of the DeleteEndpointGroup operation returned by the service.
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
     * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to <b>Example</b>.
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
     * Describe an endpoint group.
     * </p>
     * 
     * @param describeEndpointGroupRequest
     * @return Result of the DescribeEndpointGroup operation returned by the service.
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
     * Update an accelerator.
     * </p>
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
     * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow
     * logs, scroll down to <b>Example</b>.
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
     * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to <b>Example</b>.
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
