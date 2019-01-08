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

import com.amazonaws.services.appmesh.model.*;

/**
 * Interface for accessing AWS App Mesh asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appmesh.AbstractAWSAppMeshAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS App Mesh is a service mesh based on the Envoy proxy that makes it easy to monitor and control containerized
 * microservices. App Mesh standardizes how your microservices communicate, giving you end-to-end visibility and helping
 * to ensure high-availability for your applications.
 * </p>
 * <p>
 * App Mesh gives you consistent visibility and network traffic controls for every microservice in an application. You
 * can use App Mesh with Amazon ECS (using the Amazon EC2 launch type), Amazon EKS, and Kubernetes on AWS.
 * </p>
 * <note>
 * <p>
 * App Mesh supports containerized microservice applications that use service discovery naming for their components. To
 * use App Mesh, you must have a containerized application running on Amazon EC2 instances, hosted in either Amazon ECS,
 * Amazon EKS, or Kubernetes on AWS. For more information about service discovery on Amazon ECS, see <a
 * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a> in the
 * <i>Amazon Elastic Container Service Developer Guide</i>. Kubernetes <code>kube-dns</code> is supported. For more
 * information, see <a href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/">DNS for Services
 * and Pods</a> in the Kubernetes documentation.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppMeshAsync extends AWSAppMesh {

    /**
     * <p>
     * Creates a new service mesh. A service mesh is a logical boundary for network traffic between the services that
     * reside within it.
     * </p>
     * <p>
     * After you create your service mesh, you can create virtual nodes, virtual routers, and routes to distribute
     * traffic between the applications in your mesh.
     * </p>
     * 
     * @param createMeshRequest
     * @return A Java Future containing the result of the CreateMesh operation returned by the service.
     * @sample AWSAppMeshAsync.CreateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeshResult> createMeshAsync(CreateMeshRequest createMeshRequest);

    /**
     * <p>
     * Creates a new service mesh. A service mesh is a logical boundary for network traffic between the services that
     * reside within it.
     * </p>
     * <p>
     * After you create your service mesh, you can create virtual nodes, virtual routers, and routes to distribute
     * traffic between the applications in your mesh.
     * </p>
     * 
     * @param createMeshRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMesh operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeshResult> createMeshAsync(CreateMeshRequest createMeshRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMeshRequest, CreateMeshResult> asyncHandler);

    /**
     * <p>
     * Creates a new route that is associated with a virtual router.
     * </p>
     * <p>
     * You can use the <code>prefix</code> parameter in your route specification for path-based routing of requests. For
     * example, if your virtual router service name is <code>my-service.local</code>, and you want the route to match
     * requests to <code>my-service.local/metrics</code>, then your prefix should be <code>/metrics</code>.
     * </p>
     * <p>
     * If your route matches a request, you can distribute traffic to one or more target virtual nodes with relative
     * weighting.
     * </p>
     * 
     * @param createRouteRequest
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AWSAppMeshAsync.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest);

    /**
     * <p>
     * Creates a new route that is associated with a virtual router.
     * </p>
     * <p>
     * You can use the <code>prefix</code> parameter in your route specification for path-based routing of requests. For
     * example, if your virtual router service name is <code>my-service.local</code>, and you want the route to match
     * requests to <code>my-service.local/metrics</code>, then your prefix should be <code>/metrics</code>.
     * </p>
     * <p>
     * If your route matches a request, you can distribute traffic to one or more target virtual nodes with relative
     * weighting.
     * </p>
     * 
     * @param createRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler);

    /**
     * <p>
     * Creates a new virtual node within a service mesh.
     * </p>
     * <p>
     * A virtual node acts as logical pointer to a particular task group, such as an Amazon ECS service or a Kubernetes
     * deployment. When you create a virtual node, you must specify the DNS service discovery name for your task group.
     * </p>
     * <p>
     * Any inbound traffic that your virtual node expects should be specified as a <code>listener</code>. Any outbound
     * traffic that your virtual node expects to reach should be specified as a <code>backend</code>.
     * </p>
     * <p>
     * The response metadata for your new virtual node contains the <code>arn</code> that is associated with the virtual
     * node. Set this value (either the full ARN or the truncated resource name, for example,
     * <code>mesh/default/virtualNode/simpleapp</code>, as the <code>APPMESH_VIRTUAL_NODE_NAME</code> environment
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
     * @return A Java Future containing the result of the CreateVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsync.CreateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualNodeResult> createVirtualNodeAsync(CreateVirtualNodeRequest createVirtualNodeRequest);

    /**
     * <p>
     * Creates a new virtual node within a service mesh.
     * </p>
     * <p>
     * A virtual node acts as logical pointer to a particular task group, such as an Amazon ECS service or a Kubernetes
     * deployment. When you create a virtual node, you must specify the DNS service discovery name for your task group.
     * </p>
     * <p>
     * Any inbound traffic that your virtual node expects should be specified as a <code>listener</code>. Any outbound
     * traffic that your virtual node expects to reach should be specified as a <code>backend</code>.
     * </p>
     * <p>
     * The response metadata for your new virtual node contains the <code>arn</code> that is associated with the virtual
     * node. Set this value (either the full ARN or the truncated resource name, for example,
     * <code>mesh/default/virtualNode/simpleapp</code>, as the <code>APPMESH_VIRTUAL_NODE_NAME</code> environment
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualNodeResult> createVirtualNodeAsync(CreateVirtualNodeRequest createVirtualNodeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualNodeRequest, CreateVirtualNodeResult> asyncHandler);

    /**
     * <p>
     * Creates a new virtual router within a service mesh.
     * </p>
     * <p>
     * Virtual routers handle traffic for one or more service names within your mesh. After you create your virtual
     * router, create and associate routes for your virtual router that direct incoming requests to different virtual
     * nodes.
     * </p>
     * 
     * @param createVirtualRouterRequest
     * @return A Java Future containing the result of the CreateVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsync.CreateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualRouterResult> createVirtualRouterAsync(CreateVirtualRouterRequest createVirtualRouterRequest);

    /**
     * <p>
     * Creates a new virtual router within a service mesh.
     * </p>
     * <p>
     * Virtual routers handle traffic for one or more service names within your mesh. After you create your virtual
     * router, create and associate routes for your virtual router that direct incoming requests to different virtual
     * nodes.
     * </p>
     * 
     * @param createVirtualRouterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/CreateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualRouterResult> createVirtualRouterAsync(CreateVirtualRouterRequest createVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualRouterRequest, CreateVirtualRouterResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing service mesh.
     * </p>
     * <p>
     * You must delete all resources (routes, virtual routers, virtual nodes) in the service mesh before you can delete
     * the mesh itself.
     * </p>
     * 
     * @param deleteMeshRequest
     * @return A Java Future containing the result of the DeleteMesh operation returned by the service.
     * @sample AWSAppMeshAsync.DeleteMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeshResult> deleteMeshAsync(DeleteMeshRequest deleteMeshRequest);

    /**
     * <p>
     * Deletes an existing service mesh.
     * </p>
     * <p>
     * You must delete all resources (routes, virtual routers, virtual nodes) in the service mesh before you can delete
     * the mesh itself.
     * </p>
     * 
     * @param deleteMeshRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMesh operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DeleteMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeshResult> deleteMeshAsync(DeleteMeshRequest deleteMeshRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMeshRequest, DeleteMeshResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AWSAppMeshAsync.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest);

    /**
     * <p>
     * Deletes an existing route.
     * </p>
     * 
     * @param deleteRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoute operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DeleteRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing virtual node.
     * </p>
     * 
     * @param deleteVirtualNodeRequest
     * @return A Java Future containing the result of the DeleteVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsync.DeleteVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualNodeResult> deleteVirtualNodeAsync(DeleteVirtualNodeRequest deleteVirtualNodeRequest);

    /**
     * <p>
     * Deletes an existing virtual node.
     * </p>
     * 
     * @param deleteVirtualNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DeleteVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualNodeResult> deleteVirtualNodeAsync(DeleteVirtualNodeRequest deleteVirtualNodeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualNodeRequest, DeleteVirtualNodeResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing virtual router.
     * </p>
     * <p>
     * You must delete any routes associated with the virtual router before you can delete the router itself.
     * </p>
     * 
     * @param deleteVirtualRouterRequest
     * @return A Java Future containing the result of the DeleteVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsync.DeleteVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualRouterResult> deleteVirtualRouterAsync(DeleteVirtualRouterRequest deleteVirtualRouterRequest);

    /**
     * <p>
     * Deletes an existing virtual router.
     * </p>
     * <p>
     * You must delete any routes associated with the virtual router before you can delete the router itself.
     * </p>
     * 
     * @param deleteVirtualRouterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DeleteVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DeleteVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualRouterResult> deleteVirtualRouterAsync(DeleteVirtualRouterRequest deleteVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualRouterRequest, DeleteVirtualRouterResult> asyncHandler);

    /**
     * <p>
     * Describes an existing service mesh.
     * </p>
     * 
     * @param describeMeshRequest
     * @return A Java Future containing the result of the DescribeMesh operation returned by the service.
     * @sample AWSAppMeshAsync.DescribeMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeMeshResult> describeMeshAsync(DescribeMeshRequest describeMeshRequest);

    /**
     * <p>
     * Describes an existing service mesh.
     * </p>
     * 
     * @param describeMeshRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMesh operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DescribeMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeMeshResult> describeMeshAsync(DescribeMeshRequest describeMeshRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMeshRequest, DescribeMeshResult> asyncHandler);

    /**
     * <p>
     * Describes an existing route.
     * </p>
     * 
     * @param describeRouteRequest
     * @return A Java Future containing the result of the DescribeRoute operation returned by the service.
     * @sample AWSAppMeshAsync.DescribeRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRouteResult> describeRouteAsync(DescribeRouteRequest describeRouteRequest);

    /**
     * <p>
     * Describes an existing route.
     * </p>
     * 
     * @param describeRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRoute operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DescribeRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRouteResult> describeRouteAsync(DescribeRouteRequest describeRouteRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRouteRequest, DescribeRouteResult> asyncHandler);

    /**
     * <p>
     * Describes an existing virtual node.
     * </p>
     * 
     * @param describeVirtualNodeRequest
     * @return A Java Future containing the result of the DescribeVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsync.DescribeVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeVirtualNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualNodeResult> describeVirtualNodeAsync(DescribeVirtualNodeRequest describeVirtualNodeRequest);

    /**
     * <p>
     * Describes an existing virtual node.
     * </p>
     * 
     * @param describeVirtualNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DescribeVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeVirtualNode" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualNodeResult> describeVirtualNodeAsync(DescribeVirtualNodeRequest describeVirtualNodeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualNodeRequest, DescribeVirtualNodeResult> asyncHandler);

    /**
     * <p>
     * Describes an existing virtual router.
     * </p>
     * 
     * @param describeVirtualRouterRequest
     * @return A Java Future containing the result of the DescribeVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsync.DescribeVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualRouterResult> describeVirtualRouterAsync(DescribeVirtualRouterRequest describeVirtualRouterRequest);

    /**
     * <p>
     * Describes an existing virtual router.
     * </p>
     * 
     * @param describeVirtualRouterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DescribeVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/DescribeVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualRouterResult> describeVirtualRouterAsync(DescribeVirtualRouterRequest describeVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualRouterRequest, DescribeVirtualRouterResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing service meshes.
     * </p>
     * 
     * @param listMeshesRequest
     * @return A Java Future containing the result of the ListMeshes operation returned by the service.
     * @sample AWSAppMeshAsync.ListMeshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListMeshes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMeshesResult> listMeshesAsync(ListMeshesRequest listMeshesRequest);

    /**
     * <p>
     * Returns a list of existing service meshes.
     * </p>
     * 
     * @param listMeshesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMeshes operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.ListMeshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListMeshes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMeshesResult> listMeshesAsync(ListMeshesRequest listMeshesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMeshesRequest, ListMeshesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing routes in a service mesh.
     * </p>
     * 
     * @param listRoutesRequest
     * @return A Java Future containing the result of the ListRoutes operation returned by the service.
     * @sample AWSAppMeshAsync.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoutesResult> listRoutesAsync(ListRoutesRequest listRoutesRequest);

    /**
     * <p>
     * Returns a list of existing routes in a service mesh.
     * </p>
     * 
     * @param listRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoutes operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.ListRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoutesResult> listRoutesAsync(ListRoutesRequest listRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoutesRequest, ListRoutesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing virtual nodes.
     * </p>
     * 
     * @param listVirtualNodesRequest
     * @return A Java Future containing the result of the ListVirtualNodes operation returned by the service.
     * @sample AWSAppMeshAsync.ListVirtualNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListVirtualNodes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualNodesResult> listVirtualNodesAsync(ListVirtualNodesRequest listVirtualNodesRequest);

    /**
     * <p>
     * Returns a list of existing virtual nodes.
     * </p>
     * 
     * @param listVirtualNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVirtualNodes operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.ListVirtualNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListVirtualNodes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualNodesResult> listVirtualNodesAsync(ListVirtualNodesRequest listVirtualNodesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVirtualNodesRequest, ListVirtualNodesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing virtual routers in a service mesh.
     * </p>
     * 
     * @param listVirtualRoutersRequest
     * @return A Java Future containing the result of the ListVirtualRouters operation returned by the service.
     * @sample AWSAppMeshAsync.ListVirtualRouters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListVirtualRouters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualRoutersResult> listVirtualRoutersAsync(ListVirtualRoutersRequest listVirtualRoutersRequest);

    /**
     * <p>
     * Returns a list of existing virtual routers in a service mesh.
     * </p>
     * 
     * @param listVirtualRoutersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVirtualRouters operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.ListVirtualRouters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/ListVirtualRouters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualRoutersResult> listVirtualRoutersAsync(ListVirtualRoutersRequest listVirtualRoutersRequest,
            com.amazonaws.handlers.AsyncHandler<ListVirtualRoutersRequest, ListVirtualRoutersResult> asyncHandler);

    /**
     * <p>
     * Updates an existing route for a specified service mesh and virtual router.
     * </p>
     * 
     * @param updateRouteRequest
     * @return A Java Future containing the result of the UpdateRoute operation returned by the service.
     * @sample AWSAppMeshAsync.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/UpdateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest updateRouteRequest);

    /**
     * <p>
     * Updates an existing route for a specified service mesh and virtual router.
     * </p>
     * 
     * @param updateRouteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoute operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/UpdateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest updateRouteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRouteRequest, UpdateRouteResult> asyncHandler);

    /**
     * <p>
     * Updates an existing virtual node in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualNodeRequest
     * @return A Java Future containing the result of the UpdateVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsync.UpdateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/UpdateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualNodeResult> updateVirtualNodeAsync(UpdateVirtualNodeRequest updateVirtualNodeRequest);

    /**
     * <p>
     * Updates an existing virtual node in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.UpdateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/UpdateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualNodeResult> updateVirtualNodeAsync(UpdateVirtualNodeRequest updateVirtualNodeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVirtualNodeRequest, UpdateVirtualNodeResult> asyncHandler);

    /**
     * <p>
     * Updates an existing virtual router in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualRouterRequest
     * @return A Java Future containing the result of the UpdateVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsync.UpdateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/UpdateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualRouterResult> updateVirtualRouterAsync(UpdateVirtualRouterRequest updateVirtualRouterRequest);

    /**
     * <p>
     * Updates an existing virtual router in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualRouterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.UpdateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2018-10-01/UpdateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualRouterResult> updateVirtualRouterAsync(UpdateVirtualRouterRequest updateVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVirtualRouterRequest, UpdateVirtualRouterResult> asyncHandler);

}
