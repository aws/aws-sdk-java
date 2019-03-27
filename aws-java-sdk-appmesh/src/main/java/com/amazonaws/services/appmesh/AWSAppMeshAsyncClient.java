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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS App Mesh asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public class AWSAppMeshAsyncClient extends AWSAppMeshClient implements AWSAppMeshAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAppMeshAsyncClientBuilder asyncBuilder() {
        return AWSAppMeshAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS App Mesh using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAppMeshAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateMeshResult> createMeshAsync(CreateMeshRequest request) {

        return createMeshAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMeshResult> createMeshAsync(final CreateMeshRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMeshRequest, CreateMeshResult> asyncHandler) {
        final CreateMeshRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMeshResult>() {
            @Override
            public CreateMeshResult call() throws Exception {
                CreateMeshResult result = null;

                try {
                    result = executeCreateMesh(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(CreateRouteRequest request) {

        return createRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRouteResult> createRouteAsync(final CreateRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRouteRequest, CreateRouteResult> asyncHandler) {
        final CreateRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRouteResult>() {
            @Override
            public CreateRouteResult call() throws Exception {
                CreateRouteResult result = null;

                try {
                    result = executeCreateRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualNodeResult> createVirtualNodeAsync(CreateVirtualNodeRequest request) {

        return createVirtualNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualNodeResult> createVirtualNodeAsync(final CreateVirtualNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVirtualNodeRequest, CreateVirtualNodeResult> asyncHandler) {
        final CreateVirtualNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVirtualNodeResult>() {
            @Override
            public CreateVirtualNodeResult call() throws Exception {
                CreateVirtualNodeResult result = null;

                try {
                    result = executeCreateVirtualNode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualRouterResult> createVirtualRouterAsync(CreateVirtualRouterRequest request) {

        return createVirtualRouterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualRouterResult> createVirtualRouterAsync(final CreateVirtualRouterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVirtualRouterRequest, CreateVirtualRouterResult> asyncHandler) {
        final CreateVirtualRouterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVirtualRouterResult>() {
            @Override
            public CreateVirtualRouterResult call() throws Exception {
                CreateVirtualRouterResult result = null;

                try {
                    result = executeCreateVirtualRouter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualServiceResult> createVirtualServiceAsync(CreateVirtualServiceRequest request) {

        return createVirtualServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualServiceResult> createVirtualServiceAsync(final CreateVirtualServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVirtualServiceRequest, CreateVirtualServiceResult> asyncHandler) {
        final CreateVirtualServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVirtualServiceResult>() {
            @Override
            public CreateVirtualServiceResult call() throws Exception {
                CreateVirtualServiceResult result = null;

                try {
                    result = executeCreateVirtualService(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMeshResult> deleteMeshAsync(DeleteMeshRequest request) {

        return deleteMeshAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMeshResult> deleteMeshAsync(final DeleteMeshRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMeshRequest, DeleteMeshResult> asyncHandler) {
        final DeleteMeshRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMeshResult>() {
            @Override
            public DeleteMeshResult call() throws Exception {
                DeleteMeshResult result = null;

                try {
                    result = executeDeleteMesh(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(DeleteRouteRequest request) {

        return deleteRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRouteResult> deleteRouteAsync(final DeleteRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRouteRequest, DeleteRouteResult> asyncHandler) {
        final DeleteRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRouteResult>() {
            @Override
            public DeleteRouteResult call() throws Exception {
                DeleteRouteResult result = null;

                try {
                    result = executeDeleteRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualNodeResult> deleteVirtualNodeAsync(DeleteVirtualNodeRequest request) {

        return deleteVirtualNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualNodeResult> deleteVirtualNodeAsync(final DeleteVirtualNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVirtualNodeRequest, DeleteVirtualNodeResult> asyncHandler) {
        final DeleteVirtualNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVirtualNodeResult>() {
            @Override
            public DeleteVirtualNodeResult call() throws Exception {
                DeleteVirtualNodeResult result = null;

                try {
                    result = executeDeleteVirtualNode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualRouterResult> deleteVirtualRouterAsync(DeleteVirtualRouterRequest request) {

        return deleteVirtualRouterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualRouterResult> deleteVirtualRouterAsync(final DeleteVirtualRouterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVirtualRouterRequest, DeleteVirtualRouterResult> asyncHandler) {
        final DeleteVirtualRouterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVirtualRouterResult>() {
            @Override
            public DeleteVirtualRouterResult call() throws Exception {
                DeleteVirtualRouterResult result = null;

                try {
                    result = executeDeleteVirtualRouter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualServiceResult> deleteVirtualServiceAsync(DeleteVirtualServiceRequest request) {

        return deleteVirtualServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualServiceResult> deleteVirtualServiceAsync(final DeleteVirtualServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVirtualServiceRequest, DeleteVirtualServiceResult> asyncHandler) {
        final DeleteVirtualServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVirtualServiceResult>() {
            @Override
            public DeleteVirtualServiceResult call() throws Exception {
                DeleteVirtualServiceResult result = null;

                try {
                    result = executeDeleteVirtualService(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeMeshResult> describeMeshAsync(DescribeMeshRequest request) {

        return describeMeshAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMeshResult> describeMeshAsync(final DescribeMeshRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMeshRequest, DescribeMeshResult> asyncHandler) {
        final DescribeMeshRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMeshResult>() {
            @Override
            public DescribeMeshResult call() throws Exception {
                DescribeMeshResult result = null;

                try {
                    result = executeDescribeMesh(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRouteResult> describeRouteAsync(DescribeRouteRequest request) {

        return describeRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRouteResult> describeRouteAsync(final DescribeRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRouteRequest, DescribeRouteResult> asyncHandler) {
        final DescribeRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRouteResult>() {
            @Override
            public DescribeRouteResult call() throws Exception {
                DescribeRouteResult result = null;

                try {
                    result = executeDescribeRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualNodeResult> describeVirtualNodeAsync(DescribeVirtualNodeRequest request) {

        return describeVirtualNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualNodeResult> describeVirtualNodeAsync(final DescribeVirtualNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualNodeRequest, DescribeVirtualNodeResult> asyncHandler) {
        final DescribeVirtualNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVirtualNodeResult>() {
            @Override
            public DescribeVirtualNodeResult call() throws Exception {
                DescribeVirtualNodeResult result = null;

                try {
                    result = executeDescribeVirtualNode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualRouterResult> describeVirtualRouterAsync(DescribeVirtualRouterRequest request) {

        return describeVirtualRouterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualRouterResult> describeVirtualRouterAsync(final DescribeVirtualRouterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualRouterRequest, DescribeVirtualRouterResult> asyncHandler) {
        final DescribeVirtualRouterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVirtualRouterResult>() {
            @Override
            public DescribeVirtualRouterResult call() throws Exception {
                DescribeVirtualRouterResult result = null;

                try {
                    result = executeDescribeVirtualRouter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualServiceResult> describeVirtualServiceAsync(DescribeVirtualServiceRequest request) {

        return describeVirtualServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualServiceResult> describeVirtualServiceAsync(final DescribeVirtualServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVirtualServiceRequest, DescribeVirtualServiceResult> asyncHandler) {
        final DescribeVirtualServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVirtualServiceResult>() {
            @Override
            public DescribeVirtualServiceResult call() throws Exception {
                DescribeVirtualServiceResult result = null;

                try {
                    result = executeDescribeVirtualService(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMeshesResult> listMeshesAsync(ListMeshesRequest request) {

        return listMeshesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMeshesResult> listMeshesAsync(final ListMeshesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMeshesRequest, ListMeshesResult> asyncHandler) {
        final ListMeshesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMeshesResult>() {
            @Override
            public ListMeshesResult call() throws Exception {
                ListMeshesResult result = null;

                try {
                    result = executeListMeshes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRoutesResult> listRoutesAsync(ListRoutesRequest request) {

        return listRoutesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutesResult> listRoutesAsync(final ListRoutesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutesRequest, ListRoutesResult> asyncHandler) {
        final ListRoutesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutesResult>() {
            @Override
            public ListRoutesResult call() throws Exception {
                ListRoutesResult result = null;

                try {
                    result = executeListRoutes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVirtualNodesResult> listVirtualNodesAsync(ListVirtualNodesRequest request) {

        return listVirtualNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualNodesResult> listVirtualNodesAsync(final ListVirtualNodesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVirtualNodesRequest, ListVirtualNodesResult> asyncHandler) {
        final ListVirtualNodesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVirtualNodesResult>() {
            @Override
            public ListVirtualNodesResult call() throws Exception {
                ListVirtualNodesResult result = null;

                try {
                    result = executeListVirtualNodes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVirtualRoutersResult> listVirtualRoutersAsync(ListVirtualRoutersRequest request) {

        return listVirtualRoutersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualRoutersResult> listVirtualRoutersAsync(final ListVirtualRoutersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVirtualRoutersRequest, ListVirtualRoutersResult> asyncHandler) {
        final ListVirtualRoutersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVirtualRoutersResult>() {
            @Override
            public ListVirtualRoutersResult call() throws Exception {
                ListVirtualRoutersResult result = null;

                try {
                    result = executeListVirtualRouters(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListVirtualServicesResult> listVirtualServicesAsync(ListVirtualServicesRequest request) {

        return listVirtualServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualServicesResult> listVirtualServicesAsync(final ListVirtualServicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVirtualServicesRequest, ListVirtualServicesResult> asyncHandler) {
        final ListVirtualServicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVirtualServicesResult>() {
            @Override
            public ListVirtualServicesResult call() throws Exception {
                ListVirtualServicesResult result = null;

                try {
                    result = executeListVirtualServices(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMeshResult> updateMeshAsync(UpdateMeshRequest request) {

        return updateMeshAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMeshResult> updateMeshAsync(final UpdateMeshRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMeshRequest, UpdateMeshResult> asyncHandler) {
        final UpdateMeshRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMeshResult>() {
            @Override
            public UpdateMeshResult call() throws Exception {
                UpdateMeshResult result = null;

                try {
                    result = executeUpdateMesh(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(UpdateRouteRequest request) {

        return updateRouteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRouteResult> updateRouteAsync(final UpdateRouteRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRouteRequest, UpdateRouteResult> asyncHandler) {
        final UpdateRouteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRouteResult>() {
            @Override
            public UpdateRouteResult call() throws Exception {
                UpdateRouteResult result = null;

                try {
                    result = executeUpdateRoute(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualNodeResult> updateVirtualNodeAsync(UpdateVirtualNodeRequest request) {

        return updateVirtualNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualNodeResult> updateVirtualNodeAsync(final UpdateVirtualNodeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVirtualNodeRequest, UpdateVirtualNodeResult> asyncHandler) {
        final UpdateVirtualNodeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVirtualNodeResult>() {
            @Override
            public UpdateVirtualNodeResult call() throws Exception {
                UpdateVirtualNodeResult result = null;

                try {
                    result = executeUpdateVirtualNode(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualRouterResult> updateVirtualRouterAsync(UpdateVirtualRouterRequest request) {

        return updateVirtualRouterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualRouterResult> updateVirtualRouterAsync(final UpdateVirtualRouterRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVirtualRouterRequest, UpdateVirtualRouterResult> asyncHandler) {
        final UpdateVirtualRouterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVirtualRouterResult>() {
            @Override
            public UpdateVirtualRouterResult call() throws Exception {
                UpdateVirtualRouterResult result = null;

                try {
                    result = executeUpdateVirtualRouter(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualServiceResult> updateVirtualServiceAsync(UpdateVirtualServiceRequest request) {

        return updateVirtualServiceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateVirtualServiceResult> updateVirtualServiceAsync(final UpdateVirtualServiceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateVirtualServiceRequest, UpdateVirtualServiceResult> asyncHandler) {
        final UpdateVirtualServiceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateVirtualServiceResult>() {
            @Override
            public UpdateVirtualServiceResult call() throws Exception {
                UpdateVirtualServiceResult result = null;

                try {
                    result = executeUpdateVirtualService(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
