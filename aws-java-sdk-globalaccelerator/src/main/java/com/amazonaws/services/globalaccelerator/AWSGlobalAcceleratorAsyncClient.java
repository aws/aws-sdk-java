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
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Global Accelerator using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSGlobalAcceleratorAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
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
    public java.util.concurrent.Future<AddCustomRoutingEndpointsResult> addCustomRoutingEndpointsAsync(AddCustomRoutingEndpointsRequest request) {

        return addCustomRoutingEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddCustomRoutingEndpointsResult> addCustomRoutingEndpointsAsync(final AddCustomRoutingEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddCustomRoutingEndpointsRequest, AddCustomRoutingEndpointsResult> asyncHandler) {
        final AddCustomRoutingEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddCustomRoutingEndpointsResult>() {
            @Override
            public AddCustomRoutingEndpointsResult call() throws Exception {
                AddCustomRoutingEndpointsResult result = null;

                try {
                    result = executeAddCustomRoutingEndpoints(finalRequest);
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
    public java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(AdvertiseByoipCidrRequest request) {

        return advertiseByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(final AdvertiseByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<AdvertiseByoipCidrRequest, AdvertiseByoipCidrResult> asyncHandler) {
        final AdvertiseByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AdvertiseByoipCidrResult>() {
            @Override
            public AdvertiseByoipCidrResult call() throws Exception {
                AdvertiseByoipCidrResult result = null;

                try {
                    result = executeAdvertiseByoipCidr(finalRequest);
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
    public java.util.concurrent.Future<AllowCustomRoutingTrafficResult> allowCustomRoutingTrafficAsync(AllowCustomRoutingTrafficRequest request) {

        return allowCustomRoutingTrafficAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AllowCustomRoutingTrafficResult> allowCustomRoutingTrafficAsync(final AllowCustomRoutingTrafficRequest request,
            final com.amazonaws.handlers.AsyncHandler<AllowCustomRoutingTrafficRequest, AllowCustomRoutingTrafficResult> asyncHandler) {
        final AllowCustomRoutingTrafficRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AllowCustomRoutingTrafficResult>() {
            @Override
            public AllowCustomRoutingTrafficResult call() throws Exception {
                AllowCustomRoutingTrafficResult result = null;

                try {
                    result = executeAllowCustomRoutingTraffic(finalRequest);
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
    public java.util.concurrent.Future<CreateCustomRoutingAcceleratorResult> createCustomRoutingAcceleratorAsync(CreateCustomRoutingAcceleratorRequest request) {

        return createCustomRoutingAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomRoutingAcceleratorResult> createCustomRoutingAcceleratorAsync(
            final CreateCustomRoutingAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomRoutingAcceleratorRequest, CreateCustomRoutingAcceleratorResult> asyncHandler) {
        final CreateCustomRoutingAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomRoutingAcceleratorResult>() {
            @Override
            public CreateCustomRoutingAcceleratorResult call() throws Exception {
                CreateCustomRoutingAcceleratorResult result = null;

                try {
                    result = executeCreateCustomRoutingAccelerator(finalRequest);
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
    public java.util.concurrent.Future<CreateCustomRoutingEndpointGroupResult> createCustomRoutingEndpointGroupAsync(
            CreateCustomRoutingEndpointGroupRequest request) {

        return createCustomRoutingEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomRoutingEndpointGroupResult> createCustomRoutingEndpointGroupAsync(
            final CreateCustomRoutingEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomRoutingEndpointGroupRequest, CreateCustomRoutingEndpointGroupResult> asyncHandler) {
        final CreateCustomRoutingEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomRoutingEndpointGroupResult>() {
            @Override
            public CreateCustomRoutingEndpointGroupResult call() throws Exception {
                CreateCustomRoutingEndpointGroupResult result = null;

                try {
                    result = executeCreateCustomRoutingEndpointGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateCustomRoutingListenerResult> createCustomRoutingListenerAsync(CreateCustomRoutingListenerRequest request) {

        return createCustomRoutingListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomRoutingListenerResult> createCustomRoutingListenerAsync(final CreateCustomRoutingListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateCustomRoutingListenerRequest, CreateCustomRoutingListenerResult> asyncHandler) {
        final CreateCustomRoutingListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateCustomRoutingListenerResult>() {
            @Override
            public CreateCustomRoutingListenerResult call() throws Exception {
                CreateCustomRoutingListenerResult result = null;

                try {
                    result = executeCreateCustomRoutingListener(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomRoutingAcceleratorResult> deleteCustomRoutingAcceleratorAsync(DeleteCustomRoutingAcceleratorRequest request) {

        return deleteCustomRoutingAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomRoutingAcceleratorResult> deleteCustomRoutingAcceleratorAsync(
            final DeleteCustomRoutingAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomRoutingAcceleratorRequest, DeleteCustomRoutingAcceleratorResult> asyncHandler) {
        final DeleteCustomRoutingAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomRoutingAcceleratorResult>() {
            @Override
            public DeleteCustomRoutingAcceleratorResult call() throws Exception {
                DeleteCustomRoutingAcceleratorResult result = null;

                try {
                    result = executeDeleteCustomRoutingAccelerator(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomRoutingEndpointGroupResult> deleteCustomRoutingEndpointGroupAsync(
            DeleteCustomRoutingEndpointGroupRequest request) {

        return deleteCustomRoutingEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomRoutingEndpointGroupResult> deleteCustomRoutingEndpointGroupAsync(
            final DeleteCustomRoutingEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomRoutingEndpointGroupRequest, DeleteCustomRoutingEndpointGroupResult> asyncHandler) {
        final DeleteCustomRoutingEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomRoutingEndpointGroupResult>() {
            @Override
            public DeleteCustomRoutingEndpointGroupResult call() throws Exception {
                DeleteCustomRoutingEndpointGroupResult result = null;

                try {
                    result = executeDeleteCustomRoutingEndpointGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteCustomRoutingListenerResult> deleteCustomRoutingListenerAsync(DeleteCustomRoutingListenerRequest request) {

        return deleteCustomRoutingListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomRoutingListenerResult> deleteCustomRoutingListenerAsync(final DeleteCustomRoutingListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteCustomRoutingListenerRequest, DeleteCustomRoutingListenerResult> asyncHandler) {
        final DeleteCustomRoutingListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteCustomRoutingListenerResult>() {
            @Override
            public DeleteCustomRoutingListenerResult call() throws Exception {
                DeleteCustomRoutingListenerResult result = null;

                try {
                    result = executeDeleteCustomRoutingListener(finalRequest);
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
    public java.util.concurrent.Future<DenyCustomRoutingTrafficResult> denyCustomRoutingTrafficAsync(DenyCustomRoutingTrafficRequest request) {

        return denyCustomRoutingTrafficAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DenyCustomRoutingTrafficResult> denyCustomRoutingTrafficAsync(final DenyCustomRoutingTrafficRequest request,
            final com.amazonaws.handlers.AsyncHandler<DenyCustomRoutingTrafficRequest, DenyCustomRoutingTrafficResult> asyncHandler) {
        final DenyCustomRoutingTrafficRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DenyCustomRoutingTrafficResult>() {
            @Override
            public DenyCustomRoutingTrafficResult call() throws Exception {
                DenyCustomRoutingTrafficResult result = null;

                try {
                    result = executeDenyCustomRoutingTraffic(finalRequest);
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
    public java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(DeprovisionByoipCidrRequest request) {

        return deprovisionByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(final DeprovisionByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeprovisionByoipCidrRequest, DeprovisionByoipCidrResult> asyncHandler) {
        final DeprovisionByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeprovisionByoipCidrResult>() {
            @Override
            public DeprovisionByoipCidrResult call() throws Exception {
                DeprovisionByoipCidrResult result = null;

                try {
                    result = executeDeprovisionByoipCidr(finalRequest);
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
    public java.util.concurrent.Future<DescribeCustomRoutingAcceleratorResult> describeCustomRoutingAcceleratorAsync(
            DescribeCustomRoutingAcceleratorRequest request) {

        return describeCustomRoutingAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomRoutingAcceleratorResult> describeCustomRoutingAcceleratorAsync(
            final DescribeCustomRoutingAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingAcceleratorRequest, DescribeCustomRoutingAcceleratorResult> asyncHandler) {
        final DescribeCustomRoutingAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomRoutingAcceleratorResult>() {
            @Override
            public DescribeCustomRoutingAcceleratorResult call() throws Exception {
                DescribeCustomRoutingAcceleratorResult result = null;

                try {
                    result = executeDescribeCustomRoutingAccelerator(finalRequest);
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
    public java.util.concurrent.Future<DescribeCustomRoutingAcceleratorAttributesResult> describeCustomRoutingAcceleratorAttributesAsync(
            DescribeCustomRoutingAcceleratorAttributesRequest request) {

        return describeCustomRoutingAcceleratorAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomRoutingAcceleratorAttributesResult> describeCustomRoutingAcceleratorAttributesAsync(
            final DescribeCustomRoutingAcceleratorAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingAcceleratorAttributesRequest, DescribeCustomRoutingAcceleratorAttributesResult> asyncHandler) {
        final DescribeCustomRoutingAcceleratorAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomRoutingAcceleratorAttributesResult>() {
            @Override
            public DescribeCustomRoutingAcceleratorAttributesResult call() throws Exception {
                DescribeCustomRoutingAcceleratorAttributesResult result = null;

                try {
                    result = executeDescribeCustomRoutingAcceleratorAttributes(finalRequest);
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
    public java.util.concurrent.Future<DescribeCustomRoutingEndpointGroupResult> describeCustomRoutingEndpointGroupAsync(
            DescribeCustomRoutingEndpointGroupRequest request) {

        return describeCustomRoutingEndpointGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomRoutingEndpointGroupResult> describeCustomRoutingEndpointGroupAsync(
            final DescribeCustomRoutingEndpointGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingEndpointGroupRequest, DescribeCustomRoutingEndpointGroupResult> asyncHandler) {
        final DescribeCustomRoutingEndpointGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomRoutingEndpointGroupResult>() {
            @Override
            public DescribeCustomRoutingEndpointGroupResult call() throws Exception {
                DescribeCustomRoutingEndpointGroupResult result = null;

                try {
                    result = executeDescribeCustomRoutingEndpointGroup(finalRequest);
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
    public java.util.concurrent.Future<DescribeCustomRoutingListenerResult> describeCustomRoutingListenerAsync(DescribeCustomRoutingListenerRequest request) {

        return describeCustomRoutingListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCustomRoutingListenerResult> describeCustomRoutingListenerAsync(
            final DescribeCustomRoutingListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingListenerRequest, DescribeCustomRoutingListenerResult> asyncHandler) {
        final DescribeCustomRoutingListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCustomRoutingListenerResult>() {
            @Override
            public DescribeCustomRoutingListenerResult call() throws Exception {
                DescribeCustomRoutingListenerResult result = null;

                try {
                    result = executeDescribeCustomRoutingListener(finalRequest);
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
    public java.util.concurrent.Future<ListByoipCidrsResult> listByoipCidrsAsync(ListByoipCidrsRequest request) {

        return listByoipCidrsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListByoipCidrsResult> listByoipCidrsAsync(final ListByoipCidrsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListByoipCidrsRequest, ListByoipCidrsResult> asyncHandler) {
        final ListByoipCidrsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListByoipCidrsResult>() {
            @Override
            public ListByoipCidrsResult call() throws Exception {
                ListByoipCidrsResult result = null;

                try {
                    result = executeListByoipCidrs(finalRequest);
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
    public java.util.concurrent.Future<ListCustomRoutingAcceleratorsResult> listCustomRoutingAcceleratorsAsync(ListCustomRoutingAcceleratorsRequest request) {

        return listCustomRoutingAcceleratorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomRoutingAcceleratorsResult> listCustomRoutingAcceleratorsAsync(
            final ListCustomRoutingAcceleratorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomRoutingAcceleratorsRequest, ListCustomRoutingAcceleratorsResult> asyncHandler) {
        final ListCustomRoutingAcceleratorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomRoutingAcceleratorsResult>() {
            @Override
            public ListCustomRoutingAcceleratorsResult call() throws Exception {
                ListCustomRoutingAcceleratorsResult result = null;

                try {
                    result = executeListCustomRoutingAccelerators(finalRequest);
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
    public java.util.concurrent.Future<ListCustomRoutingEndpointGroupsResult> listCustomRoutingEndpointGroupsAsync(
            ListCustomRoutingEndpointGroupsRequest request) {

        return listCustomRoutingEndpointGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomRoutingEndpointGroupsResult> listCustomRoutingEndpointGroupsAsync(
            final ListCustomRoutingEndpointGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomRoutingEndpointGroupsRequest, ListCustomRoutingEndpointGroupsResult> asyncHandler) {
        final ListCustomRoutingEndpointGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomRoutingEndpointGroupsResult>() {
            @Override
            public ListCustomRoutingEndpointGroupsResult call() throws Exception {
                ListCustomRoutingEndpointGroupsResult result = null;

                try {
                    result = executeListCustomRoutingEndpointGroups(finalRequest);
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
    public java.util.concurrent.Future<ListCustomRoutingListenersResult> listCustomRoutingListenersAsync(ListCustomRoutingListenersRequest request) {

        return listCustomRoutingListenersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomRoutingListenersResult> listCustomRoutingListenersAsync(final ListCustomRoutingListenersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomRoutingListenersRequest, ListCustomRoutingListenersResult> asyncHandler) {
        final ListCustomRoutingListenersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomRoutingListenersResult>() {
            @Override
            public ListCustomRoutingListenersResult call() throws Exception {
                ListCustomRoutingListenersResult result = null;

                try {
                    result = executeListCustomRoutingListeners(finalRequest);
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
    public java.util.concurrent.Future<ListCustomRoutingPortMappingsResult> listCustomRoutingPortMappingsAsync(ListCustomRoutingPortMappingsRequest request) {

        return listCustomRoutingPortMappingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomRoutingPortMappingsResult> listCustomRoutingPortMappingsAsync(
            final ListCustomRoutingPortMappingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomRoutingPortMappingsRequest, ListCustomRoutingPortMappingsResult> asyncHandler) {
        final ListCustomRoutingPortMappingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomRoutingPortMappingsResult>() {
            @Override
            public ListCustomRoutingPortMappingsResult call() throws Exception {
                ListCustomRoutingPortMappingsResult result = null;

                try {
                    result = executeListCustomRoutingPortMappings(finalRequest);
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
    public java.util.concurrent.Future<ListCustomRoutingPortMappingsByDestinationResult> listCustomRoutingPortMappingsByDestinationAsync(
            ListCustomRoutingPortMappingsByDestinationRequest request) {

        return listCustomRoutingPortMappingsByDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCustomRoutingPortMappingsByDestinationResult> listCustomRoutingPortMappingsByDestinationAsync(
            final ListCustomRoutingPortMappingsByDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCustomRoutingPortMappingsByDestinationRequest, ListCustomRoutingPortMappingsByDestinationResult> asyncHandler) {
        final ListCustomRoutingPortMappingsByDestinationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCustomRoutingPortMappingsByDestinationResult>() {
            @Override
            public ListCustomRoutingPortMappingsByDestinationResult call() throws Exception {
                ListCustomRoutingPortMappingsByDestinationResult result = null;

                try {
                    result = executeListCustomRoutingPortMappingsByDestination(finalRequest);
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
    public java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(ProvisionByoipCidrRequest request) {

        return provisionByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(final ProvisionByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<ProvisionByoipCidrRequest, ProvisionByoipCidrResult> asyncHandler) {
        final ProvisionByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ProvisionByoipCidrResult>() {
            @Override
            public ProvisionByoipCidrResult call() throws Exception {
                ProvisionByoipCidrResult result = null;

                try {
                    result = executeProvisionByoipCidr(finalRequest);
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
    public java.util.concurrent.Future<RemoveCustomRoutingEndpointsResult> removeCustomRoutingEndpointsAsync(RemoveCustomRoutingEndpointsRequest request) {

        return removeCustomRoutingEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveCustomRoutingEndpointsResult> removeCustomRoutingEndpointsAsync(final RemoveCustomRoutingEndpointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveCustomRoutingEndpointsRequest, RemoveCustomRoutingEndpointsResult> asyncHandler) {
        final RemoveCustomRoutingEndpointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveCustomRoutingEndpointsResult>() {
            @Override
            public RemoveCustomRoutingEndpointsResult call() throws Exception {
                RemoveCustomRoutingEndpointsResult result = null;

                try {
                    result = executeRemoveCustomRoutingEndpoints(finalRequest);
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
    public java.util.concurrent.Future<UpdateCustomRoutingAcceleratorResult> updateCustomRoutingAcceleratorAsync(UpdateCustomRoutingAcceleratorRequest request) {

        return updateCustomRoutingAcceleratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomRoutingAcceleratorResult> updateCustomRoutingAcceleratorAsync(
            final UpdateCustomRoutingAcceleratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCustomRoutingAcceleratorRequest, UpdateCustomRoutingAcceleratorResult> asyncHandler) {
        final UpdateCustomRoutingAcceleratorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCustomRoutingAcceleratorResult>() {
            @Override
            public UpdateCustomRoutingAcceleratorResult call() throws Exception {
                UpdateCustomRoutingAcceleratorResult result = null;

                try {
                    result = executeUpdateCustomRoutingAccelerator(finalRequest);
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
    public java.util.concurrent.Future<UpdateCustomRoutingAcceleratorAttributesResult> updateCustomRoutingAcceleratorAttributesAsync(
            UpdateCustomRoutingAcceleratorAttributesRequest request) {

        return updateCustomRoutingAcceleratorAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomRoutingAcceleratorAttributesResult> updateCustomRoutingAcceleratorAttributesAsync(
            final UpdateCustomRoutingAcceleratorAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCustomRoutingAcceleratorAttributesRequest, UpdateCustomRoutingAcceleratorAttributesResult> asyncHandler) {
        final UpdateCustomRoutingAcceleratorAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCustomRoutingAcceleratorAttributesResult>() {
            @Override
            public UpdateCustomRoutingAcceleratorAttributesResult call() throws Exception {
                UpdateCustomRoutingAcceleratorAttributesResult result = null;

                try {
                    result = executeUpdateCustomRoutingAcceleratorAttributes(finalRequest);
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
    public java.util.concurrent.Future<UpdateCustomRoutingListenerResult> updateCustomRoutingListenerAsync(UpdateCustomRoutingListenerRequest request) {

        return updateCustomRoutingListenerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomRoutingListenerResult> updateCustomRoutingListenerAsync(final UpdateCustomRoutingListenerRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateCustomRoutingListenerRequest, UpdateCustomRoutingListenerResult> asyncHandler) {
        final UpdateCustomRoutingListenerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateCustomRoutingListenerResult>() {
            @Override
            public UpdateCustomRoutingListenerResult call() throws Exception {
                UpdateCustomRoutingListenerResult result = null;

                try {
                    result = executeUpdateCustomRoutingListener(finalRequest);
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

    @Override
    public java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(WithdrawByoipCidrRequest request) {

        return withdrawByoipCidrAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(final WithdrawByoipCidrRequest request,
            final com.amazonaws.handlers.AsyncHandler<WithdrawByoipCidrRequest, WithdrawByoipCidrResult> asyncHandler) {
        final WithdrawByoipCidrRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<WithdrawByoipCidrResult>() {
            @Override
            public WithdrawByoipCidrResult call() throws Exception {
                WithdrawByoipCidrResult result = null;

                try {
                    result = executeWithdrawByoipCidr(finalRequest);
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
