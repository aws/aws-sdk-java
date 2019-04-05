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
package com.amazonaws.services.appmesh;

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

import com.amazonaws.services.appmesh.AWSAppMeshClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.services.appmesh.model.transform.*;

/**
 * Client for accessing AWS App Mesh. All service calls made using this client are blocking, and will not return until
 * the service call completes.
 * <p>
 * <p>
 * AWS App Mesh is a service mesh based on the Envoy proxy that makes it easy to monitor and control microservices. App
 * Mesh standardizes how your microservices communicate, giving you end-to-end visibility and helping to ensure high
 * availability for your applications.
 * </p>
 * <p>
 * App Mesh gives you consistent visibility and network traffic controls for every microservice in an application. You
 * can use App Mesh with AWS Fargate, Amazon ECS, Amazon EKS, and Kubernetes on AWS.
 * </p>
 * <note>
 * <p>
 * App Mesh supports microservice applications that use service discovery naming for their components. To use App Mesh,
 * you must have an application running on Amazon EC2 instances, hosted in either Amazon ECS, Amazon EKS, or Kubernetes
 * on AWS. For more information about service discovery on Amazon ECS, see <a
 * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a> in the
 * <i>Amazon Elastic Container Service Developer Guide</i>. Kubernetes <code>kube-dns</code> and <code>coredns</code>
 * are supported. For more information, see <a
 * href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/">DNS for Services and Pods</a> in the
 * Kubernetes documentation.
 * </p>
 * </note>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAppMeshClient extends AmazonWebServiceClient implements AWSAppMesh {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSAppMesh.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "appmesh";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.ConflictException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.TooManyTagsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ForbiddenException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.ForbiddenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyRequestsException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.TooManyRequestsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerErrorException").withModeledClass(
                                    com.amazonaws.services.appmesh.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.appmesh.model.AWSAppMeshException.class));

    public static AWSAppMeshClientBuilder builder() {
        return AWSAppMeshClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS App Mesh using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppMeshClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS App Mesh using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSAppMeshClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("appmesh.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/appmesh/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/appmesh/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a service mesh. A service mesh is a logical boundary for network traffic between the services that reside
     * within it.
     * </p>
     * <p>
     * After you create your service mesh, you can create virtual services, virtual nodes, virtual routers, and routes
     * to distribute traffic between the applications in your mesh.
     * </p>
     * 
     * @param createMeshRequest
     * @return Result of the CreateMesh operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.CreateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMeshResult createMesh(CreateMeshRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMesh(request);
    }

    @SdkInternalApi
    final CreateMeshResult executeCreateMesh(CreateMeshRequest createMeshRequest) {

        ExecutionContext executionContext = createExecutionContext(createMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMeshRequest> request = null;
        Response<CreateMeshResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMeshRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMeshRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMesh");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMeshResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMeshResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a route that is associated with a virtual router.
     * </p>
     * <p>
     * You can use the <code>prefix</code> parameter in your route specification for path-based routing of requests. For
     * example, if your virtual service name is <code>my-service.local</code> and you want the route to match requests
     * to <code>my-service.local/metrics</code>, your prefix should be <code>/metrics</code>.
     * </p>
     * <p>
     * If your route matches a request, you can distribute traffic to one or more target virtual nodes with relative
     * weighting.
     * </p>
     * 
     * @param createRouteRequest
     * @return Result of the CreateRoute operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateRouteResult createRoute(CreateRouteRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoute(request);
    }

    @SdkInternalApi
    final CreateRouteResult executeCreateRoute(CreateRouteRequest createRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(createRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRouteRequest> request = null;
        Response<CreateRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a virtual node within a service mesh.
     * </p>
     * <p>
     * A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS service or a
     * Kubernetes deployment. When you create a virtual node, you must specify the DNS service discovery hostname for
     * your task group.
     * </p>
     * <p>
     * Any inbound traffic that your virtual node expects should be specified as a <code>listener</code>. Any outbound
     * traffic that your virtual node expects to reach should be specified as a <code>backend</code>.
     * </p>
     * <p>
     * The response metadata for your new virtual node contains the <code>arn</code> that is associated with the virtual
     * node. Set this value (either the full ARN or the truncated resource name: for example,
     * <code>mesh/default/virtualNode/simpleapp</code>) as the <code>APPMESH_VIRTUAL_NODE_NAME</code> environment
     * variable for your task group's Envoy proxy container in your task definition or pod spec. This is then mapped to
     * the <code>node.id</code> and <code>node.cluster</code> Envoy parameters.
     * </p>
     * <note>
     * <p>
     * If you require your Envoy stats or tracing to use a different name, you can override the
     * <code>node.cluster</code> value that is set by <code>APPMESH_VIRTUAL_NODE_NAME</code> with the
     * <code>APPMESH_VIRTUAL_NODE_CLUSTER</code> environment variable.
     * </p>
     * </note>
     * 
     * @param createVirtualNodeRequest
     * @return Result of the CreateVirtualNode operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.CreateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVirtualNodeResult createVirtualNode(CreateVirtualNodeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVirtualNode(request);
    }

    @SdkInternalApi
    final CreateVirtualNodeResult executeCreateVirtualNode(CreateVirtualNodeRequest createVirtualNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(createVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualNodeRequest> request = null;
        Response<CreateVirtualNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVirtualNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVirtualNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVirtualNodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVirtualNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a virtual router within a service mesh.
     * </p>
     * <p>
     * Any inbound traffic that your virtual router expects should be specified as a <code>listener</code>.
     * </p>
     * <p>
     * Virtual routers handle traffic for one or more virtual services within your mesh. After you create your virtual
     * router, create and associate routes for your virtual router that direct incoming requests to different virtual
     * nodes.
     * </p>
     * 
     * @param createVirtualRouterRequest
     * @return Result of the CreateVirtualRouter operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.CreateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVirtualRouterResult createVirtualRouter(CreateVirtualRouterRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVirtualRouter(request);
    }

    @SdkInternalApi
    final CreateVirtualRouterResult executeCreateVirtualRouter(CreateVirtualRouterRequest createVirtualRouterRequest) {

        ExecutionContext executionContext = createExecutionContext(createVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualRouterRequest> request = null;
        Response<CreateVirtualRouterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualRouterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVirtualRouterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVirtualRouter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVirtualRouterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVirtualRouterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a virtual service within a service mesh.
     * </p>
     * <p>
     * A virtual service is an abstraction of a real service that is provided by a virtual node directly or indirectly
     * by means of a virtual router. Dependent services call your virtual service by its <code>virtualServiceName</code>
     * , and those requests are routed to the virtual node or virtual router that is specified as the provider for the
     * virtual service.
     * </p>
     * 
     * @param createVirtualServiceRequest
     * @return Result of the CreateVirtualService operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.CreateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateVirtualServiceResult createVirtualService(CreateVirtualServiceRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVirtualService(request);
    }

    @SdkInternalApi
    final CreateVirtualServiceResult executeCreateVirtualService(CreateVirtualServiceRequest createVirtualServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(createVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVirtualServiceRequest> request = null;
        Response<CreateVirtualServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVirtualServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVirtualServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVirtualService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVirtualServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVirtualServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing service mesh.
     * </p>
     * <p>
     * You must delete all resources (virtual services, routes, virtual routers, and virtual nodes) in the service mesh
     * before you can delete the mesh itself.
     * </p>
     * 
     * @param deleteMeshRequest
     * @return Result of the DeleteMesh operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DeleteMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteMesh" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMeshResult deleteMesh(DeleteMeshRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMesh(request);
    }

    @SdkInternalApi
    final DeleteMeshResult executeDeleteMesh(DeleteMeshRequest deleteMeshRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMeshRequest> request = null;
        Response<DeleteMeshResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMeshRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMeshRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMesh");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMeshResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMeshResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return Result of the DeleteRoute operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteRouteResult deleteRoute(DeleteRouteRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoute(request);
    }

    @SdkInternalApi
    final DeleteRouteResult executeDeleteRoute(DeleteRouteRequest deleteRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRouteRequest> request = null;
        Response<DeleteRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing virtual node.
     * </p>
     * <p>
     * You must delete any virtual services that list a virtual node as a service provider before you can delete the
     * virtual node itself.
     * </p>
     * 
     * @param deleteVirtualNodeRequest
     * @return Result of the DeleteVirtualNode operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DeleteVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVirtualNodeResult deleteVirtualNode(DeleteVirtualNodeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVirtualNode(request);
    }

    @SdkInternalApi
    final DeleteVirtualNodeResult executeDeleteVirtualNode(DeleteVirtualNodeRequest deleteVirtualNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualNodeRequest> request = null;
        Response<DeleteVirtualNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVirtualNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVirtualNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVirtualNodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVirtualNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing virtual router.
     * </p>
     * <p>
     * You must delete any routes associated with the virtual router before you can delete the router itself.
     * </p>
     * 
     * @param deleteVirtualRouterRequest
     * @return Result of the DeleteVirtualRouter operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DeleteVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVirtualRouterResult deleteVirtualRouter(DeleteVirtualRouterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVirtualRouter(request);
    }

    @SdkInternalApi
    final DeleteVirtualRouterResult executeDeleteVirtualRouter(DeleteVirtualRouterRequest deleteVirtualRouterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualRouterRequest> request = null;
        Response<DeleteVirtualRouterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualRouterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVirtualRouterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVirtualRouter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVirtualRouterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVirtualRouterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing virtual service.
     * </p>
     * 
     * @param deleteVirtualServiceRequest
     * @return Result of the DeleteVirtualService operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DeleteVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteVirtualServiceResult deleteVirtualService(DeleteVirtualServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVirtualService(request);
    }

    @SdkInternalApi
    final DeleteVirtualServiceResult executeDeleteVirtualService(DeleteVirtualServiceRequest deleteVirtualServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVirtualServiceRequest> request = null;
        Response<DeleteVirtualServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVirtualServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVirtualServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVirtualService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVirtualServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVirtualServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing service mesh.
     * </p>
     * 
     * @param describeMeshRequest
     * @return Result of the DescribeMesh operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DescribeMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeMesh" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeMeshResult describeMesh(DescribeMeshRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMesh(request);
    }

    @SdkInternalApi
    final DescribeMeshResult executeDescribeMesh(DescribeMeshRequest describeMeshRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMeshRequest> request = null;
        Response<DescribeMeshResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMeshRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMeshRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMesh");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMeshResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMeshResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing route.
     * </p>
     * 
     * @param describeRouteRequest
     * @return Result of the DescribeRoute operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DescribeRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeRoute" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRouteResult describeRoute(DescribeRouteRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRoute(request);
    }

    @SdkInternalApi
    final DescribeRouteResult executeDescribeRoute(DescribeRouteRequest describeRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRouteRequest> request = null;
        Response<DescribeRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing virtual node.
     * </p>
     * 
     * @param describeVirtualNodeRequest
     * @return Result of the DescribeVirtualNode operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DescribeVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualNode" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeVirtualNodeResult describeVirtualNode(DescribeVirtualNodeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVirtualNode(request);
    }

    @SdkInternalApi
    final DescribeVirtualNodeResult executeDescribeVirtualNode(DescribeVirtualNodeRequest describeVirtualNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualNodeRequest> request = null;
        Response<DescribeVirtualNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVirtualNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVirtualNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVirtualNodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVirtualNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing virtual router.
     * </p>
     * 
     * @param describeVirtualRouterRequest
     * @return Result of the DescribeVirtualRouter operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DescribeVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeVirtualRouterResult describeVirtualRouter(DescribeVirtualRouterRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVirtualRouter(request);
    }

    @SdkInternalApi
    final DescribeVirtualRouterResult executeDescribeVirtualRouter(DescribeVirtualRouterRequest describeVirtualRouterRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualRouterRequest> request = null;
        Response<DescribeVirtualRouterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualRouterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVirtualRouterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVirtualRouter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVirtualRouterResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeVirtualRouterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an existing virtual service.
     * </p>
     * 
     * @param describeVirtualServiceRequest
     * @return Result of the DescribeVirtualService operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.DescribeVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeVirtualServiceResult describeVirtualService(DescribeVirtualServiceRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVirtualService(request);
    }

    @SdkInternalApi
    final DescribeVirtualServiceResult executeDescribeVirtualService(DescribeVirtualServiceRequest describeVirtualServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVirtualServiceRequest> request = null;
        Response<DescribeVirtualServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVirtualServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVirtualServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVirtualService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVirtualServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeVirtualServiceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of existing service meshes.
     * </p>
     * 
     * @param listMeshesRequest
     * @return Result of the ListMeshes operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.ListMeshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListMeshes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMeshesResult listMeshes(ListMeshesRequest request) {
        request = beforeClientExecution(request);
        return executeListMeshes(request);
    }

    @SdkInternalApi
    final ListMeshesResult executeListMeshes(ListMeshesRequest listMeshesRequest) {

        ExecutionContext executionContext = createExecutionContext(listMeshesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMeshesRequest> request = null;
        Response<ListMeshesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMeshesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMeshesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMeshes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMeshesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMeshesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of existing routes in a service mesh.
     * </p>
     * 
     * @param listRoutesRequest
     * @return Result of the ListRoutes operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRoutesResult listRoutes(ListRoutesRequest request) {
        request = beforeClientExecution(request);
        return executeListRoutes(request);
    }

    @SdkInternalApi
    final ListRoutesResult executeListRoutes(ListRoutesRequest listRoutesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRoutesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRoutesRequest> request = null;
        Response<ListRoutesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRoutesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRoutesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRoutes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRoutesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRoutesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List the tags for an App Mesh resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @sample AWSAppMesh.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
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
     * Returns a list of existing virtual nodes.
     * </p>
     * 
     * @param listVirtualNodesRequest
     * @return Result of the ListVirtualNodes operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.ListVirtualNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualNodes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVirtualNodesResult listVirtualNodes(ListVirtualNodesRequest request) {
        request = beforeClientExecution(request);
        return executeListVirtualNodes(request);
    }

    @SdkInternalApi
    final ListVirtualNodesResult executeListVirtualNodes(ListVirtualNodesRequest listVirtualNodesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVirtualNodesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualNodesRequest> request = null;
        Response<ListVirtualNodesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualNodesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVirtualNodesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVirtualNodes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVirtualNodesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVirtualNodesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of existing virtual routers in a service mesh.
     * </p>
     * 
     * @param listVirtualRoutersRequest
     * @return Result of the ListVirtualRouters operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.ListVirtualRouters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualRouters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListVirtualRoutersResult listVirtualRouters(ListVirtualRoutersRequest request) {
        request = beforeClientExecution(request);
        return executeListVirtualRouters(request);
    }

    @SdkInternalApi
    final ListVirtualRoutersResult executeListVirtualRouters(ListVirtualRoutersRequest listVirtualRoutersRequest) {

        ExecutionContext executionContext = createExecutionContext(listVirtualRoutersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualRoutersRequest> request = null;
        Response<ListVirtualRoutersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualRoutersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVirtualRoutersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVirtualRouters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVirtualRoutersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVirtualRoutersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of existing virtual services in a service mesh.
     * </p>
     * 
     * @param listVirtualServicesRequest
     * @return Result of the ListVirtualServices operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.ListVirtualServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualServices" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListVirtualServicesResult listVirtualServices(ListVirtualServicesRequest request) {
        request = beforeClientExecution(request);
        return executeListVirtualServices(request);
    }

    @SdkInternalApi
    final ListVirtualServicesResult executeListVirtualServices(ListVirtualServicesRequest listVirtualServicesRequest) {

        ExecutionContext executionContext = createExecutionContext(listVirtualServicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListVirtualServicesRequest> request = null;
        Response<ListVirtualServicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListVirtualServicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listVirtualServicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListVirtualServices");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListVirtualServicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListVirtualServicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyTagsException
     *         The request exceeds the maximum allowed number of tags allowed per resource. The current limit is 50 user
     *         tags per resource. You must reduce the number of tags in the request. None of the tags in this request
     *         were applied.
     * @sample AWSAppMesh.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
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
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @sample AWSAppMesh.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
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
     * Updates an existing service mesh.
     * </p>
     * 
     * @param updateMeshRequest
     * @return Result of the UpdateMesh operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.UpdateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateMeshResult updateMesh(UpdateMeshRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMesh(request);
    }

    @SdkInternalApi
    final UpdateMeshResult executeUpdateMesh(UpdateMeshRequest updateMeshRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMeshRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMeshRequest> request = null;
        Response<UpdateMeshResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMeshRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateMeshRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMesh");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMeshResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateMeshResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing route for a specified service mesh and virtual router.
     * </p>
     * 
     * @param updateRouteRequest
     * @return Result of the UpdateRoute operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateRouteResult updateRoute(UpdateRouteRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoute(request);
    }

    @SdkInternalApi
    final UpdateRouteResult executeUpdateRoute(UpdateRouteRequest updateRouteRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRouteRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRouteRequest> request = null;
        Response<UpdateRouteResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRouteRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRouteRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoute");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRouteResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRouteResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing virtual node in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualNodeRequest
     * @return Result of the UpdateVirtualNode operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.UpdateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateVirtualNodeResult updateVirtualNode(UpdateVirtualNodeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVirtualNode(request);
    }

    @SdkInternalApi
    final UpdateVirtualNodeResult executeUpdateVirtualNode(UpdateVirtualNodeRequest updateVirtualNodeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVirtualNodeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualNodeRequest> request = null;
        Response<UpdateVirtualNodeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualNodeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVirtualNodeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVirtualNode");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVirtualNodeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVirtualNodeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing virtual router in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualRouterRequest
     * @return Result of the UpdateVirtualRouter operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.UpdateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVirtualRouterResult updateVirtualRouter(UpdateVirtualRouterRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVirtualRouter(request);
    }

    @SdkInternalApi
    final UpdateVirtualRouterResult executeUpdateVirtualRouter(UpdateVirtualRouterRequest updateVirtualRouterRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVirtualRouterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualRouterRequest> request = null;
        Response<UpdateVirtualRouterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualRouterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVirtualRouterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVirtualRouter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVirtualRouterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVirtualRouterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing virtual service in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualServiceRequest
     * @return Result of the UpdateVirtualService operation returned by the service.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service_limits.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @sample AWSAppMesh.UpdateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateVirtualServiceResult updateVirtualService(UpdateVirtualServiceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVirtualService(request);
    }

    @SdkInternalApi
    final UpdateVirtualServiceResult executeUpdateVirtualService(UpdateVirtualServiceRequest updateVirtualServiceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVirtualServiceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVirtualServiceRequest> request = null;
        Response<UpdateVirtualServiceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVirtualServiceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVirtualServiceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "App Mesh");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVirtualService");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVirtualServiceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVirtualServiceResultJsonUnmarshaller());
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
