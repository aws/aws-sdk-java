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
package com.amazonaws.services.appmesh;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appmesh.model.*;

/**
 * Interface for accessing AWS App Mesh.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appmesh.AbstractAWSAppMesh} instead.
 * </p>
 * <p>
 * <p>
 * App Mesh is a service mesh based on the Envoy proxy that makes it easy to monitor and control microservices. App Mesh
 * standardizes how your microservices communicate, giving you end-to-end visibility and helping to ensure high
 * availability for your applications.
 * </p>
 * <p>
 * App Mesh gives you consistent visibility and network traffic controls for every microservice in an application. You
 * can use App Mesh with Amazon Web Services Fargate, Amazon ECS, Amazon EKS, Kubernetes on Amazon Web Services, and
 * Amazon EC2.
 * </p>
 * <note>
 * <p>
 * App Mesh supports microservice applications that use service discovery naming for their components. For more
 * information about service discovery on Amazon ECS, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a> in
 * the <i>Amazon Elastic Container Service Developer Guide</i>. Kubernetes <code>kube-dns</code> and
 * <code>coredns</code> are supported. For more information, see <a
 * href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/">DNS for Services and Pods</a> in the
 * Kubernetes documentation.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppMesh {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appmesh";

    /**
     * <p>
     * Creates a gateway route.
     * </p>
     * <p>
     * A gateway route is attached to a virtual gateway and routes traffic to an existing virtual service. If a route
     * matches a request, it can distribute traffic to a target virtual service.
     * </p>
     * <p>
     * For more information about gateway routes, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/gateway-routes.html">Gateway routes</a>.
     * </p>
     * 
     * @param createGatewayRouteRequest
     * @return Result of the CreateGatewayRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.CreateGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateGatewayRoute" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGatewayRouteResult createGatewayRoute(CreateGatewayRouteRequest createGatewayRouteRequest);

    /**
     * <p>
     * Creates a service mesh.
     * </p>
     * <p>
     * A service mesh is a logical boundary for network traffic between services that are represented by resources
     * within the mesh. After you create your service mesh, you can create virtual services, virtual nodes, virtual
     * routers, and routes to distribute traffic between the applications in your mesh.
     * </p>
     * <p>
     * For more information about service meshes, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/meshes.html">Service meshes</a>.
     * </p>
     * 
     * @param createMeshRequest
     * @return Result of the CreateMesh operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.CreateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMeshResult createMesh(CreateMeshRequest createMeshRequest);

    /**
     * <p>
     * Creates a route that is associated with a virtual router.
     * </p>
     * <p>
     * You can route several different protocols and define a retry policy for a route. Traffic can be routed to one or
     * more virtual nodes.
     * </p>
     * <p>
     * For more information about routes, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/routes.html">Routes</a>.
     * </p>
     * 
     * @param createRouteRequest
     * @return Result of the CreateRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest);

    /**
     * <p>
     * Creates a virtual gateway.
     * </p>
     * <p>
     * A virtual gateway allows resources outside your mesh to communicate to resources that are inside your mesh. The
     * virtual gateway represents an Envoy proxy running in an Amazon ECS task, in a Kubernetes service, or on an Amazon
     * EC2 instance. Unlike a virtual node, which represents an Envoy running with an application, a virtual gateway
     * represents Envoy deployed by itself.
     * </p>
     * <p>
     * For more information about virtual gateways, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_gateways.html">Virtual gateways</a>.
     * </p>
     * 
     * @param createVirtualGatewayRequest
     * @return Result of the CreateVirtualGateway operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.CreateVirtualGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualGateway" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVirtualGatewayResult createVirtualGateway(CreateVirtualGatewayRequest createVirtualGatewayRequest);

    /**
     * <p>
     * Creates a virtual node within a service mesh.
     * </p>
     * <p>
     * A virtual node acts as a logical pointer to a particular task group, such as an Amazon ECS service or a
     * Kubernetes deployment. When you create a virtual node, you can specify the service discovery information for your
     * task group, and whether the proxy running in a task group will communicate with other proxies using Transport
     * Layer Security (TLS).
     * </p>
     * <p>
     * You define a <code>listener</code> for any inbound traffic that your virtual node expects. Any virtual service
     * that your virtual node expects to communicate to is specified as a <code>backend</code>.
     * </p>
     * <p>
     * The response metadata for your new virtual node contains the <code>arn</code> that is associated with the virtual
     * node. Set this value to the full ARN; for example,
     * <code>arn:aws:appmesh:us-west-2:123456789012:myMesh/default/virtualNode/myApp</code>) as the
     * <code>APPMESH_RESOURCE_ARN</code> environment variable for your task group's Envoy proxy container in your task
     * definition or pod spec. This is then mapped to the <code>node.id</code> and <code>node.cluster</code> Envoy
     * parameters.
     * </p>
     * <note>
     * <p>
     * By default, App Mesh uses the name of the resource you specified in <code>APPMESH_RESOURCE_ARN</code> when Envoy
     * is referring to itself in metrics and traces. You can override this behavior by setting the
     * <code>APPMESH_RESOURCE_CLUSTER</code> environment variable with your own name.
     * </p>
     * </note>
     * <p>
     * For more information about virtual nodes, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_nodes.html">Virtual nodes</a>. You must be
     * using <code>1.15.0</code> or later of the Envoy image when setting these variables. For more information aboutApp
     * Mesh Envoy variables, see <a href="https://docs.aws.amazon.com/app-mesh/latest/userguide/envoy.html">Envoy
     * image</a> in the AWS App Mesh User Guide.
     * </p>
     * 
     * @param createVirtualNodeRequest
     * @return Result of the CreateVirtualNode operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.CreateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVirtualNodeResult createVirtualNode(CreateVirtualNodeRequest createVirtualNodeRequest);

    /**
     * <p>
     * Creates a virtual router within a service mesh.
     * </p>
     * <p>
     * Specify a <code>listener</code> for any inbound traffic that your virtual router receives. Create a virtual
     * router for each protocol and port that you need to route. Virtual routers handle traffic for one or more virtual
     * services within your mesh. After you create your virtual router, create and associate routes for your virtual
     * router that direct incoming requests to different virtual nodes.
     * </p>
     * <p>
     * For more information about virtual routers, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_routers.html">Virtual routers</a>.
     * </p>
     * 
     * @param createVirtualRouterRequest
     * @return Result of the CreateVirtualRouter operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.CreateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVirtualRouterResult createVirtualRouter(CreateVirtualRouterRequest createVirtualRouterRequest);

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
     * <p>
     * For more information about virtual services, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_services.html">Virtual services</a>.
     * </p>
     * 
     * @param createVirtualServiceRequest
     * @return Result of the CreateVirtualService operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.CreateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVirtualServiceResult createVirtualService(CreateVirtualServiceRequest createVirtualServiceRequest);

    /**
     * <p>
     * Deletes an existing gateway route.
     * </p>
     * 
     * @param deleteGatewayRouteRequest
     * @return Result of the DeleteGatewayRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DeleteGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteGatewayRoute" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGatewayRouteResult deleteGatewayRoute(DeleteGatewayRouteRequest deleteGatewayRouteRequest);

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
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DeleteMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteMesh" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMeshResult deleteMesh(DeleteMeshRequest deleteMeshRequest);

    /**
     * <p>
     * Deletes an existing route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return Result of the DeleteRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes an existing virtual gateway. You cannot delete a virtual gateway if any gateway routes are associated to
     * it.
     * </p>
     * 
     * @param deleteVirtualGatewayRequest
     * @return Result of the DeleteVirtualGateway operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DeleteVirtualGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualGateway" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVirtualGatewayResult deleteVirtualGateway(DeleteVirtualGatewayRequest deleteVirtualGatewayRequest);

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
     *        Deletes a virtual node input.
     * @return Result of the DeleteVirtualNode operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DeleteVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVirtualNodeResult deleteVirtualNode(DeleteVirtualNodeRequest deleteVirtualNodeRequest);

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
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DeleteVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVirtualRouterResult deleteVirtualRouter(DeleteVirtualRouterRequest deleteVirtualRouterRequest);

    /**
     * <p>
     * Deletes an existing virtual service.
     * </p>
     * 
     * @param deleteVirtualServiceRequest
     * @return Result of the DeleteVirtualService operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ResourceInUseException
     *         You can't delete the specified resource because it's in use or required by another resource.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DeleteVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVirtualServiceResult deleteVirtualService(DeleteVirtualServiceRequest deleteVirtualServiceRequest);

    /**
     * <p>
     * Describes an existing gateway route.
     * </p>
     * 
     * @param describeGatewayRouteRequest
     * @return Result of the DescribeGatewayRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DescribeGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeGatewayRoute" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGatewayRouteResult describeGatewayRoute(DescribeGatewayRouteRequest describeGatewayRouteRequest);

    /**
     * <p>
     * Describes an existing service mesh.
     * </p>
     * 
     * @param describeMeshRequest
     * @return Result of the DescribeMesh operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DescribeMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeMesh" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeMeshResult describeMesh(DescribeMeshRequest describeMeshRequest);

    /**
     * <p>
     * Describes an existing route.
     * </p>
     * 
     * @param describeRouteRequest
     * @return Result of the DescribeRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DescribeRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeRoute" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRouteResult describeRoute(DescribeRouteRequest describeRouteRequest);

    /**
     * <p>
     * Describes an existing virtual gateway.
     * </p>
     * 
     * @param describeVirtualGatewayRequest
     * @return Result of the DescribeVirtualGateway operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DescribeVirtualGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualGateway" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeVirtualGatewayResult describeVirtualGateway(DescribeVirtualGatewayRequest describeVirtualGatewayRequest);

    /**
     * <p>
     * Describes an existing virtual node.
     * </p>
     * 
     * @param describeVirtualNodeRequest
     * @return Result of the DescribeVirtualNode operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DescribeVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualNode" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeVirtualNodeResult describeVirtualNode(DescribeVirtualNodeRequest describeVirtualNodeRequest);

    /**
     * <p>
     * Describes an existing virtual router.
     * </p>
     * 
     * @param describeVirtualRouterRequest
     * @return Result of the DescribeVirtualRouter operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DescribeVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeVirtualRouterResult describeVirtualRouter(DescribeVirtualRouterRequest describeVirtualRouterRequest);

    /**
     * <p>
     * Describes an existing virtual service.
     * </p>
     * 
     * @param describeVirtualServiceRequest
     * @return Result of the DescribeVirtualService operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.DescribeVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeVirtualServiceResult describeVirtualService(DescribeVirtualServiceRequest describeVirtualServiceRequest);

    /**
     * <p>
     * Returns a list of existing gateway routes that are associated to a virtual gateway.
     * </p>
     * 
     * @param listGatewayRoutesRequest
     * @return Result of the ListGatewayRoutes operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListGatewayRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListGatewayRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    ListGatewayRoutesResult listGatewayRoutes(ListGatewayRoutesRequest listGatewayRoutesRequest);

    /**
     * <p>
     * Returns a list of existing service meshes.
     * </p>
     * 
     * @param listMeshesRequest
     * @return Result of the ListMeshes operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListMeshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListMeshes" target="_top">AWS API
     *      Documentation</a>
     */
    ListMeshesResult listMeshes(ListMeshesRequest listMeshesRequest);

    /**
     * <p>
     * Returns a list of existing routes in a service mesh.
     * </p>
     * 
     * @param listRoutesRequest
     * @return Result of the ListRoutes operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    ListRoutesResult listRoutes(ListRoutesRequest listRoutesRequest);

    /**
     * <p>
     * List the tags for an App Mesh resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of existing virtual gateways in a service mesh.
     * </p>
     * 
     * @param listVirtualGatewaysRequest
     * @return Result of the ListVirtualGateways operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListVirtualGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualGateways" target="_top">AWS
     *      API Documentation</a>
     */
    ListVirtualGatewaysResult listVirtualGateways(ListVirtualGatewaysRequest listVirtualGatewaysRequest);

    /**
     * <p>
     * Returns a list of existing virtual nodes.
     * </p>
     * 
     * @param listVirtualNodesRequest
     * @return Result of the ListVirtualNodes operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListVirtualNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualNodes" target="_top">AWS API
     *      Documentation</a>
     */
    ListVirtualNodesResult listVirtualNodes(ListVirtualNodesRequest listVirtualNodesRequest);

    /**
     * <p>
     * Returns a list of existing virtual routers in a service mesh.
     * </p>
     * 
     * @param listVirtualRoutersRequest
     * @return Result of the ListVirtualRouters operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListVirtualRouters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualRouters" target="_top">AWS API
     *      Documentation</a>
     */
    ListVirtualRoutersResult listVirtualRouters(ListVirtualRoutersRequest listVirtualRoutersRequest);

    /**
     * <p>
     * Returns a list of existing virtual services in a service mesh.
     * </p>
     * 
     * @param listVirtualServicesRequest
     * @return Result of the ListVirtualServices operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.ListVirtualServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualServices" target="_top">AWS
     *      API Documentation</a>
     */
    ListVirtualServicesResult listVirtualServices(ListVirtualServicesRequest listVirtualServicesRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyTagsException
     *         The request exceeds the maximum allowed number of tags allowed per resource. The current limit is 50 user
     *         tags per resource. You must reduce the number of tags in the request. None of the tags in this request
     *         were applied.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing gateway route that is associated to a specified virtual gateway in a service mesh.
     * </p>
     * 
     * @param updateGatewayRouteRequest
     * @return Result of the UpdateGatewayRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.UpdateGatewayRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateGatewayRoute" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGatewayRouteResult updateGatewayRoute(UpdateGatewayRouteRequest updateGatewayRouteRequest);

    /**
     * <p>
     * Updates an existing service mesh.
     * </p>
     * 
     * @param updateMeshRequest
     * @return Result of the UpdateMesh operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSAppMesh.UpdateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMeshResult updateMesh(UpdateMeshRequest updateMeshRequest);

    /**
     * <p>
     * Updates an existing route for a specified service mesh and virtual router.
     * </p>
     * 
     * @param updateRouteRequest
     * @return Result of the UpdateRoute operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest);

    /**
     * <p>
     * Updates an existing virtual gateway in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualGatewayRequest
     * @return Result of the UpdateVirtualGateway operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.UpdateVirtualGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualGateway" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVirtualGatewayResult updateVirtualGateway(UpdateVirtualGatewayRequest updateVirtualGatewayRequest);

    /**
     * <p>
     * Updates an existing virtual node in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualNodeRequest
     * @return Result of the UpdateVirtualNode operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.UpdateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateVirtualNodeResult updateVirtualNode(UpdateVirtualNodeRequest updateVirtualNodeRequest);

    /**
     * <p>
     * Updates an existing virtual router in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualRouterRequest
     * @return Result of the UpdateVirtualRouter operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.UpdateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVirtualRouterResult updateVirtualRouter(UpdateVirtualRouterRequest updateVirtualRouterRequest);

    /**
     * <p>
     * Updates an existing virtual service in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualServiceRequest
     * @return Result of the UpdateVirtualService operation returned by the service.
     * @throws NotFoundException
     *         The specified resource doesn't exist. Check your request syntax and try again.
     * @throws BadRequestException
     *         The request syntax was malformed. Check your request syntax and try again.
     * @throws ConflictException
     *         The request contains a client token that was used for a previous update resource call with different
     *         specifications. Try the request again with a new client token.
     * @throws TooManyRequestsException
     *         The maximum request rate permitted by the App Mesh APIs has been exceeded for your account. For best
     *         results, use an increasing or variable sleep interval between requests.
     * @throws ForbiddenException
     *         You don't have permissions to perform this action.
     * @throws ServiceUnavailableException
     *         The request has failed due to a temporary failure of the service.
     * @throws InternalServerErrorException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @throws LimitExceededException
     *         You have exceeded a service limit for your account. For more information, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/service-quotas.html">Service Limits</a> in
     *         the <i>AWS App Mesh User Guide</i>.
     * @sample AWSAppMesh.UpdateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVirtualServiceResult updateVirtualService(UpdateVirtualServiceRequest updateVirtualServiceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
