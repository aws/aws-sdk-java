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
    CreateMeshResult createMesh(CreateMeshRequest createMeshRequest);

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
    CreateRouteResult createRoute(CreateRouteRequest createRouteRequest);

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
    CreateVirtualNodeResult createVirtualNode(CreateVirtualNodeRequest createVirtualNodeRequest);

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
    CreateVirtualServiceResult createVirtualService(CreateVirtualServiceRequest createVirtualServiceRequest);

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
    DeleteMeshResult deleteMesh(DeleteMeshRequest deleteMeshRequest);

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
    DeleteRouteResult deleteRoute(DeleteRouteRequest deleteRouteRequest);

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
    DeleteVirtualRouterResult deleteVirtualRouter(DeleteVirtualRouterRequest deleteVirtualRouterRequest);

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
    DeleteVirtualServiceResult deleteVirtualService(DeleteVirtualServiceRequest deleteVirtualServiceRequest);

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
    DescribeMeshResult describeMesh(DescribeMeshRequest describeMeshRequest);

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
    DescribeRouteResult describeRoute(DescribeRouteRequest describeRouteRequest);

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
    DescribeVirtualNodeResult describeVirtualNode(DescribeVirtualNodeRequest describeVirtualNodeRequest);

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
    DescribeVirtualRouterResult describeVirtualRouter(DescribeVirtualRouterRequest describeVirtualRouterRequest);

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
    DescribeVirtualServiceResult describeVirtualService(DescribeVirtualServiceRequest describeVirtualServiceRequest);

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
    ListMeshesResult listMeshes(ListMeshesRequest listMeshesRequest);

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
    ListRoutesResult listRoutes(ListRoutesRequest listRoutesRequest);

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
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
    ListVirtualNodesResult listVirtualNodes(ListVirtualNodesRequest listVirtualNodesRequest);

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
    ListVirtualRoutersResult listVirtualRouters(ListVirtualRoutersRequest listVirtualRoutersRequest);

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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
    UpdateMeshResult updateMesh(UpdateMeshRequest updateMeshRequest);

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
    UpdateRouteResult updateRoute(UpdateRouteRequest updateRouteRequest);

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
    UpdateVirtualNodeResult updateVirtualNode(UpdateVirtualNodeRequest updateVirtualNodeRequest);

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
    UpdateVirtualRouterResult updateVirtualRouter(UpdateVirtualRouterRequest updateVirtualRouterRequest);

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
