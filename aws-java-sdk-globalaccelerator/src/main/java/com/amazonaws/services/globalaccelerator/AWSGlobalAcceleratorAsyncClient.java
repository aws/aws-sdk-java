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

import javax.annotation.Generated;

import com.amazonaws.services.globalaccelerator.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Global Accelerator asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public class AWSGlobalAcceleratorAsyncClient extends AWSGlobalAcceleratorClient implements AWSGlobalAcceleratorAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSGlobalAcceleratorAsyncClientBuilder asyncBuilder() {
        return AWSGlobalAcceleratorAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Global Accelerator using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSGlobalAcceleratorAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateAcceleratorResult> createAcceleratorAsync(CreateAcceleratorRequest request) {

        return createAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAcceleratorResult> createAcceleratorAsync(final CreateAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAcceleratorRequest, CreateAcceleratorResult> asyncHandler) {
        final CreateAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAcceleratorResult>() {
            @Override
            public CreateAcceleratorResult call() throws Exception {
                CreateAcceleratorResult result = null;

                try {
                    result = executeCreateAccelerator(finalRequest);
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
    public java.util.concurrent.Future<CreateEndpointGroupResult> createEndpointGroupAsync(CreateEndpointGroupRequest request) {

        return createEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointGroupResult> createEndpointGroupAsync(final CreateEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEndpointGroupRequest, CreateEndpointGroupResult> asyncHandler) {
        final CreateEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEndpointGroupResult>() {
            @Override
            public CreateEndpointGroupResult call() throws Exception {
                CreateEndpointGroupResult result = null;

                try {
                    result = executeCreateEndpointGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest request) {

        return createListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateListenerResult> createListenerAsync(final CreateListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateListenerRequest, CreateListenerResult> asyncHandler) {
        final CreateListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateListenerResult>() {
            @Override
            public CreateListenerResult call() throws Exception {
                CreateListenerResult result = null;

                try {
                    result = executeCreateListener(finalRequest);
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
    public java.util.concurrent.Future<DeleteAcceleratorResult> deleteAcceleratorAsync(DeleteAcceleratorRequest request) {

        return deleteAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAcceleratorResult> deleteAcceleratorAsync(final DeleteAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAcceleratorRequest, DeleteAcceleratorResult> asyncHandler) {
        final DeleteAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAcceleratorResult>() {
            @Override
            public DeleteAcceleratorResult call() throws Exception {
                DeleteAcceleratorResult result = null;

                try {
                    result = executeDeleteAccelerator(finalRequest);
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
    public java.util.concurrent.Future<DeleteEndpointGroupResult> deleteEndpointGroupAsync(DeleteEndpointGroupRequest request) {

        return deleteEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointGroupResult> deleteEndpointGroupAsync(final DeleteEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointGroupRequest, DeleteEndpointGroupResult> asyncHandler) {
        final DeleteEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEndpointGroupResult>() {
            @Override
            public DeleteEndpointGroupResult call() throws Exception {
                DeleteEndpointGroupResult result = null;

                try {
                    result = executeDeleteEndpointGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest request) {

        return deleteListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(final DeleteListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteListenerRequest, DeleteListenerResult> asyncHandler) {
        final DeleteListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteListenerResult>() {
            @Override
            public DeleteListenerResult call() throws Exception {
                DeleteListenerResult result = null;

                try {
                    result = executeDeleteListener(finalRequest);
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
    public java.util.concurrent.Future<DescribeAcceleratorResult> describeAcceleratorAsync(DescribeAcceleratorRequest request) {

        return describeAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorResult> describeAcceleratorAsync(final DescribeAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorRequest, DescribeAcceleratorResult> asyncHandler) {
        final DescribeAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAcceleratorResult>() {
            @Override
            public DescribeAcceleratorResult call() throws Exception {
                DescribeAcceleratorResult result = null;

                try {
                    result = executeDescribeAccelerator(finalRequest);
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
    public java.util.concurrent.Future<DescribeAcceleratorAttributesResult> describeAcceleratorAttributesAsync(DescribeAcceleratorAttributesRequest request) {

        return describeAcceleratorAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorAttributesResult> describeAcceleratorAttributesAsync(
            final DescribeAcceleratorAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorAttributesRequest, DescribeAcceleratorAttributesResult> asyncHandler) {
        final DescribeAcceleratorAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAcceleratorAttributesResult>() {
            @Override
            public DescribeAcceleratorAttributesResult call() throws Exception {
                DescribeAcceleratorAttributesResult result = null;

                try {
                    result = executeDescribeAcceleratorAttributes(finalRequest);
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
    public java.util.concurrent.Future<DescribeEndpointGroupResult> describeEndpointGroupAsync(DescribeEndpointGroupRequest request) {

        return describeEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointGroupResult> describeEndpointGroupAsync(final DescribeEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEndpointGroupRequest, DescribeEndpointGroupResult> asyncHandler) {
        final DescribeEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEndpointGroupResult>() {
            @Override
            public DescribeEndpointGroupResult call() throws Exception {
                DescribeEndpointGroupResult result = null;

                try {
                    result = executeDescribeEndpointGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeListenerResult> describeListenerAsync(DescribeListenerRequest request) {

        return describeListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeListenerResult> describeListenerAsync(final DescribeListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeListenerRequest, DescribeListenerResult> asyncHandler) {
        final DescribeListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeListenerResult>() {
            @Override
            public DescribeListenerResult call() throws Exception {
                DescribeListenerResult result = null;

                try {
                    result = executeDescribeListener(finalRequest);
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
    public java.util.concurrent.Future<ListAcceleratorsResult> listAcceleratorsAsync(ListAcceleratorsRequest request) {

        return listAcceleratorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAcceleratorsResult> listAcceleratorsAsync(final ListAcceleratorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAcceleratorsRequest, ListAcceleratorsResult> asyncHandler) {
        final ListAcceleratorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAcceleratorsResult>() {
            @Override
            public ListAcceleratorsResult call() throws Exception {
                ListAcceleratorsResult result = null;

                try {
                    result = executeListAccelerators(finalRequest);
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
    public java.util.concurrent.Future<ListEndpointGroupsResult> listEndpointGroupsAsync(ListEndpointGroupsRequest request) {

        return listEndpointGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointGroupsResult> listEndpointGroupsAsync(final ListEndpointGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointGroupsRequest, ListEndpointGroupsResult> asyncHandler) {
        final ListEndpointGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEndpointGroupsResult>() {
            @Override
            public ListEndpointGroupsResult call() throws Exception {
                ListEndpointGroupsResult result = null;

                try {
                    result = executeListEndpointGroups(finalRequest);
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
    public java.util.concurrent.Future<ListListenersResult> listListenersAsync(ListListenersRequest request) {

        return listListenersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListListenersResult> listListenersAsync(final ListListenersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListListenersRequest, ListListenersResult> asyncHandler) {
        final ListListenersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListListenersResult>() {
            @Override
            public ListListenersResult call() throws Exception {
                ListListenersResult result = null;

                try {
                    result = executeListListeners(finalRequest);
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
    public java.util.concurrent.Future<UpdateAcceleratorResult> updateAcceleratorAsync(UpdateAcceleratorRequest request) {

        return updateAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAcceleratorResult> updateAcceleratorAsync(final UpdateAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAcceleratorRequest, UpdateAcceleratorResult> asyncHandler) {
        final UpdateAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAcceleratorResult>() {
            @Override
            public UpdateAcceleratorResult call() throws Exception {
                UpdateAcceleratorResult result = null;

                try {
                    result = executeUpdateAccelerator(finalRequest);
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
    public java.util.concurrent.Future<UpdateAcceleratorAttributesResult> updateAcceleratorAttributesAsync(UpdateAcceleratorAttributesRequest request) {

        return updateAcceleratorAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAcceleratorAttributesResult> updateAcceleratorAttributesAsync(final UpdateAcceleratorAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAcceleratorAttributesRequest, UpdateAcceleratorAttributesResult> asyncHandler) {
        final UpdateAcceleratorAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAcceleratorAttributesResult>() {
            @Override
            public UpdateAcceleratorAttributesResult call() throws Exception {
                UpdateAcceleratorAttributesResult result = null;

                try {
                    result = executeUpdateAcceleratorAttributes(finalRequest);
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
    public java.util.concurrent.Future<UpdateEndpointGroupResult> updateEndpointGroupAsync(UpdateEndpointGroupRequest request) {

        return updateEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEndpointGroupResult> updateEndpointGroupAsync(final UpdateEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEndpointGroupRequest, UpdateEndpointGroupResult> asyncHandler) {
        final UpdateEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEndpointGroupResult>() {
            @Override
            public UpdateEndpointGroupResult call() throws Exception {
                UpdateEndpointGroupResult result = null;

                try {
                    result = executeUpdateEndpointGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(UpdateListenerRequest request) {

        return updateListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(final UpdateListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateListenerRequest, UpdateListenerResult> asyncHandler) {
        final UpdateListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateListenerResult>() {
            @Override
            public UpdateListenerResult call() throws Exception {
                UpdateListenerResult result = null;

                try {
                    result = executeUpdateListener(finalRequest);
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
