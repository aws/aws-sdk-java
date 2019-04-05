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
public interface AWSAppMeshAsync extends AWSAppMesh {

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
     * @return A Java Future containing the result of the CreateMesh operation returned by the service.
     * @sample AWSAppMeshAsync.CreateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeshResult> createMeshAsync(CreateMeshRequest createMeshRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMesh operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeshResult> createMeshAsync(CreateMeshRequest createMeshRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMeshRequest, CreateMeshResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AWSAppMeshAsync.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoute operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest createRouteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsync.CreateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualNodeResult> createVirtualNodeAsync(CreateVirtualNodeRequest createVirtualNodeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualNodeResult> createVirtualNodeAsync(CreateVirtualNodeRequest createVirtualNodeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualNodeRequest, CreateVirtualNodeResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsync.CreateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualRouterResult> createVirtualRouterAsync(CreateVirtualRouterRequest createVirtualRouterRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVirtualRouter operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateVirtualRouter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualRouterResult> createVirtualRouterAsync(CreateVirtualRouterRequest createVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualRouterRequest, CreateVirtualRouterResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateVirtualService operation returned by the service.
     * @sample AWSAppMeshAsync.CreateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualServiceResult> createVirtualServiceAsync(CreateVirtualServiceRequest createVirtualServiceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVirtualService operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.CreateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVirtualServiceResult> createVirtualServiceAsync(CreateVirtualServiceRequest createVirtualServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualServiceRequest, CreateVirtualServiceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteMesh operation returned by the service.
     * @sample AWSAppMeshAsync.DeleteMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeshResult> deleteMeshAsync(DeleteMeshRequest deleteMeshRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMesh operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DeleteMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteMesh" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteRoute" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteRoute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsync.DeleteVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualNodeResult> deleteVirtualNodeAsync(DeleteVirtualNodeRequest deleteVirtualNodeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVirtualNode operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DeleteVirtualNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualNode" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualRouter" target="_top">AWS
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualRouterResult> deleteVirtualRouterAsync(DeleteVirtualRouterRequest deleteVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualRouterRequest, DeleteVirtualRouterResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing virtual service.
     * </p>
     * 
     * @param deleteVirtualServiceRequest
     * @return A Java Future containing the result of the DeleteVirtualService operation returned by the service.
     * @sample AWSAppMeshAsync.DeleteVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualServiceResult> deleteVirtualServiceAsync(DeleteVirtualServiceRequest deleteVirtualServiceRequest);

    /**
     * <p>
     * Deletes an existing virtual service.
     * </p>
     * 
     * @param deleteVirtualServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVirtualService operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DeleteVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVirtualServiceResult> deleteVirtualServiceAsync(DeleteVirtualServiceRequest deleteVirtualServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualServiceRequest, DeleteVirtualServiceResult> asyncHandler);

    /**
     * <p>
     * Describes an existing service mesh.
     * </p>
     * 
     * @param describeMeshRequest
     * @return A Java Future containing the result of the DescribeMesh operation returned by the service.
     * @sample AWSAppMeshAsync.DescribeMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeMesh" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeMesh" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeRoute" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeRoute" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualNode" target="_top">AWS
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualNode" target="_top">AWS
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualRouter" target="_top">AWS
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualRouterResult> describeVirtualRouterAsync(DescribeVirtualRouterRequest describeVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualRouterRequest, DescribeVirtualRouterResult> asyncHandler);

    /**
     * <p>
     * Describes an existing virtual service.
     * </p>
     * 
     * @param describeVirtualServiceRequest
     * @return A Java Future containing the result of the DescribeVirtualService operation returned by the service.
     * @sample AWSAppMeshAsync.DescribeVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualServiceResult> describeVirtualServiceAsync(DescribeVirtualServiceRequest describeVirtualServiceRequest);

    /**
     * <p>
     * Describes an existing virtual service.
     * </p>
     * 
     * @param describeVirtualServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVirtualService operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.DescribeVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DescribeVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVirtualServiceResult> describeVirtualServiceAsync(DescribeVirtualServiceRequest describeVirtualServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualServiceRequest, DescribeVirtualServiceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing service meshes.
     * </p>
     * 
     * @param listMeshesRequest
     * @return A Java Future containing the result of the ListMeshes operation returned by the service.
     * @sample AWSAppMeshAsync.ListMeshes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListMeshes" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListMeshes" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListRoutes" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListRoutes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoutesResult> listRoutesAsync(ListRoutesRequest listRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoutesRequest, ListRoutesResult> asyncHandler);

    /**
     * <p>
     * List the tags for an App Mesh resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppMeshAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List the tags for an App Mesh resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing virtual nodes.
     * </p>
     * 
     * @param listVirtualNodesRequest
     * @return A Java Future containing the result of the ListVirtualNodes operation returned by the service.
     * @sample AWSAppMeshAsync.ListVirtualNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualNodes" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualNodes" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualRouters" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualRouters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualRoutersResult> listVirtualRoutersAsync(ListVirtualRoutersRequest listVirtualRoutersRequest,
            com.amazonaws.handlers.AsyncHandler<ListVirtualRoutersRequest, ListVirtualRoutersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of existing virtual services in a service mesh.
     * </p>
     * 
     * @param listVirtualServicesRequest
     * @return A Java Future containing the result of the ListVirtualServices operation returned by the service.
     * @sample AWSAppMeshAsync.ListVirtualServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualServicesResult> listVirtualServicesAsync(ListVirtualServicesRequest listVirtualServicesRequest);

    /**
     * <p>
     * Returns a list of existing virtual services in a service mesh.
     * </p>
     * 
     * @param listVirtualServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVirtualServices operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.ListVirtualServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListVirtualServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVirtualServicesResult> listVirtualServicesAsync(ListVirtualServicesRequest listVirtualServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVirtualServicesRequest, ListVirtualServicesResult> asyncHandler);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppMeshAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource aren't specified in the request parameters, they aren't changed. When a resource is deleted, the tags
     * associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppMeshAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing service mesh.
     * </p>
     * 
     * @param updateMeshRequest
     * @return A Java Future containing the result of the UpdateMesh operation returned by the service.
     * @sample AWSAppMeshAsync.UpdateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMeshResult> updateMeshAsync(UpdateMeshRequest updateMeshRequest);

    /**
     * <p>
     * Updates an existing service mesh.
     * </p>
     * 
     * @param updateMeshRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMesh operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.UpdateMesh
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateMesh" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMeshResult> updateMeshAsync(UpdateMeshRequest updateMeshRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMeshRequest, UpdateMeshResult> asyncHandler);

    /**
     * <p>
     * Updates an existing route for a specified service mesh and virtual router.
     * </p>
     * 
     * @param updateRouteRequest
     * @return A Java Future containing the result of the UpdateRoute operation returned by the service.
     * @sample AWSAppMeshAsync.UpdateRoute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateRoute" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateRoute" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualNode" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualNode" target="_top">AWS API
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualRouter" target="_top">AWS
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualRouter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualRouterResult> updateVirtualRouterAsync(UpdateVirtualRouterRequest updateVirtualRouterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVirtualRouterRequest, UpdateVirtualRouterResult> asyncHandler);

    /**
     * <p>
     * Updates an existing virtual service in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualServiceRequest
     * @return A Java Future containing the result of the UpdateVirtualService operation returned by the service.
     * @sample AWSAppMeshAsync.UpdateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualServiceResult> updateVirtualServiceAsync(UpdateVirtualServiceRequest updateVirtualServiceRequest);

    /**
     * <p>
     * Updates an existing virtual service in a specified service mesh.
     * </p>
     * 
     * @param updateVirtualServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVirtualService operation returned by the service.
     * @sample AWSAppMeshAsyncHandler.UpdateVirtualService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/UpdateVirtualService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVirtualServiceResult> updateVirtualServiceAsync(UpdateVirtualServiceRequest updateVirtualServiceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVirtualServiceRequest, UpdateVirtualServiceResult> asyncHandler);

}
