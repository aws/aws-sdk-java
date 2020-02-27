/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Interface for accessing AWS Global Accelerator asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.globalaccelerator.AbstractAWSGlobalAcceleratorAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Global Accelerator</fullname>
 * <p>
 * This is the <i>AWS Global Accelerator API Reference</i>. This guide is for developers who need detailed information
 * about AWS Global Accelerator API actions, data types, and errors. For more information about Global Accelerator
 * features, see the <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/Welcome.html">AWS Global
 * Accelerator Developer Guide</a>.
 * </p>
 * <p>
 * AWS Global Accelerator is a service in which you create accelerators to improve availability and performance of your
 * applications for local and global users.
 * </p>
 * <important>
 * <p>
 * You must specify the US West (Oregon) Region to create or update accelerators.
 * </p>
 * </important>
 * <p>
 * By default, Global Accelerator provides you with static IP addresses that you associate with your accelerator.
 * (Instead of using the IP addresses that Global Accelerator provides, you can configure these entry points to be IPv4
 * addresses from your own IP address ranges that you bring to Global Accelerator.) The static IP addresses are anycast
 * from the AWS edge network and distribute incoming application traffic across multiple endpoint resources in multiple
 * AWS Regions, which increases the availability of your applications. Endpoints can be Network Load Balancers,
 * Application Load Balancers, EC2 instances, or Elastic IP addresses that are located in one AWS Region or multiple
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
 * By default, AWS Global Accelerator provides you with a set of static IP addresses that are anycast from the AWS edge
 * network and serve as the single fixed entry points for your clients. Or you can configure these entry points to be
 * IPv4 addresses from your own IP address ranges that you bring to Global Accelerator (BYOIP). For more information,
 * see <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring Your Own IP Addresses
 * (BYOIP)</a> in the <i>AWS Global Accelerator Developer Guide</i>. If you already have load balancers, EC2 instances,
 * or Elastic IP addresses set up for your applications, you can easily add those to Global Accelerator to allow the
 * resources to be accessed by the static IP addresses.
 * </p>
 * <important>
 * <p>
 * The static IP addresses remain assigned to your accelerator for as long as it exists, even if you disable the
 * accelerator and it no longer accepts or routes traffic. However, when you <i>delete</i> an accelerator, you lose the
 * static IP addresses that are assigned to it, so you can no longer route traffic by using them. You can use IAM
 * policies with Global Accelerator to limit the users who have permissions to delete an accelerator. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/auth-and-access-control.html">Authentication and
 * Access Control</a> in the <i>AWS Global Accelerator Developer Guide</i>.
 * </p>
 * </important></dd>
 * <dt>Accelerator</dt>
 * <dd>
 * <p>
 * An accelerator directs traffic to optimal endpoints over the AWS global network to improve availability and
 * performance for your internet applications that have a global audience. Each accelerator includes one or more
 * listeners.
 * </p>
 * </dd>
 * <dt>DNS name</dt>
 * <dd>
 * <p>
 * Global Accelerator assigns each accelerator a default Domain Name System (DNS) name, similar to
 * <code>a1234567890abcdef.awsglobalaccelerator.com</code>, that points to your Global Accelerator static IP addresses.
 * Depending on the use case, you can use your accelerator's static IP addresses or DNS name to route traffic to your
 * accelerator, or set up DNS records to route traffic using your own custom domain name.
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
 * An endpoint is a Network Load Balancer, Application Load Balancer, EC2 instance, or Elastic IP address. Traffic is
 * routed to endpoints based on several factors, including the geo-proximity to the user, the health of the endpoint,
 * and the configuration options that you choose, such as endpoint weights. For each endpoint, you can configure
 * weights, which are numbers that you can use to specify the proportion of traffic to route to each one. This can be
 * useful, for example, to do performance testing within a Region.
 * </p>
 * </dd>
 * </dl>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlobalAcceleratorAsync extends AWSGlobalAccelerator {

    /**
     * <p>
     * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP
     * addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to AWS
     * because of propagation delays. To see an AWS CLI example of advertising an address range, scroll down to
     * <b>Example</b>.
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
     * @return A Java Future containing the result of the AdvertiseByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.AdvertiseByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AdvertiseByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(AdvertiseByoipCidrRequest advertiseByoipCidrRequest);

    /**
     * <p>
     * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP
     * addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to AWS
     * because of propagation delays. To see an AWS CLI example of advertising an address range, scroll down to
     * <b>Example</b>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdvertiseByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.AdvertiseByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AdvertiseByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdvertiseByoipCidrResult> advertiseByoipCidrAsync(AdvertiseByoipCidrRequest advertiseByoipCidrRequest,
            com.amazonaws.handlers.AsyncHandler<AdvertiseByoipCidrRequest, AdvertiseByoipCidrResult> asyncHandler);

    /**
     * <p>
     * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see
     * an AWS CLI example of creating an accelerator, scroll down to <b>Example</b>.
     * </p>
     * <p>
     * If you bring your own IP address ranges to AWS Global Accelerator (BYOIP), you can assign IP addresses from your
     * own pool to your accelerator as the static IP address entry points. Only one IP address from each of your IP
     * address ranges can be used for each accelerator.
     * </p>
     * <important>
     * <p>
     * You must specify the US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param createAcceleratorRequest
     * @return A Java Future containing the result of the CreateAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.CreateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAcceleratorResult> createAcceleratorAsync(CreateAcceleratorRequest createAcceleratorRequest);

    /**
     * <p>
     * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see
     * an AWS CLI example of creating an accelerator, scroll down to <b>Example</b>.
     * </p>
     * <p>
     * If you bring your own IP address ranges to AWS Global Accelerator (BYOIP), you can assign IP addresses from your
     * own pool to your accelerator as the static IP address entry points. Only one IP address from each of your IP
     * address ranges can be used for each accelerator.
     * </p>
     * <important>
     * <p>
     * You must specify the US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param createAcceleratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.CreateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAcceleratorResult> createAcceleratorAsync(CreateAcceleratorRequest createAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAcceleratorRequest, CreateAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
     * Region. To see an AWS CLI example of creating an endpoint group, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param createEndpointGroupRequest
     * @return A Java Future containing the result of the CreateEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.CreateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointGroupResult> createEndpointGroupAsync(CreateEndpointGroupRequest createEndpointGroupRequest);

    /**
     * <p>
     * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
     * Region. To see an AWS CLI example of creating an endpoint group, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param createEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.CreateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointGroupResult> createEndpointGroupAsync(CreateEndpointGroupRequest createEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointGroupRequest, CreateEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned
     * static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of
     * creating a listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param createListenerRequest
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest);

    /**
     * <p>
     * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned
     * static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of
     * creating a listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param createListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateListenerResult> createListenerAsync(CreateListenerRequest createListenerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateListenerRequest, CreateListenerResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DeleteAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAcceleratorResult> deleteAcceleratorAsync(DeleteAcceleratorRequest deleteAcceleratorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DeleteAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAcceleratorResult> deleteAcceleratorAsync(DeleteAcceleratorRequest deleteAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAcceleratorRequest, DeleteAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Delete an endpoint group from a listener.
     * </p>
     * 
     * @param deleteEndpointGroupRequest
     * @return A Java Future containing the result of the DeleteEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DeleteEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointGroupResult> deleteEndpointGroupAsync(DeleteEndpointGroupRequest deleteEndpointGroupRequest);

    /**
     * <p>
     * Delete an endpoint group from a listener.
     * </p>
     * 
     * @param deleteEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DeleteEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointGroupResult> deleteEndpointGroupAsync(DeleteEndpointGroupRequest deleteEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointGroupRequest, DeleteEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Delete a listener from an accelerator.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest);

    /**
     * <p>
     * Delete a listener from an accelerator.
     * </p>
     * 
     * @param deleteListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteListenerResult> deleteListenerAsync(DeleteListenerRequest deleteListenerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteListenerRequest, DeleteListenerResult> asyncHandler);

    /**
     * <p>
     * Releases the specified address range that you provisioned to use with your AWS resources through bring your own
     * IP addresses (BYOIP) and deletes the corresponding address pool. To see an AWS CLI example of deprovisioning an
     * address range, scroll down to <b>Example</b>.
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
     * @return A Java Future containing the result of the DeprovisionByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DeprovisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeprovisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(DeprovisionByoipCidrRequest deprovisionByoipCidrRequest);

    /**
     * <p>
     * Releases the specified address range that you provisioned to use with your AWS resources through bring your own
     * IP addresses (BYOIP) and deletes the corresponding address pool. To see an AWS CLI example of deprovisioning an
     * address range, scroll down to <b>Example</b>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeprovisionByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DeprovisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeprovisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeprovisionByoipCidrResult> deprovisionByoipCidrAsync(DeprovisionByoipCidrRequest deprovisionByoipCidrRequest,
            com.amazonaws.handlers.AsyncHandler<DeprovisionByoipCidrRequest, DeprovisionByoipCidrResult> asyncHandler);

    /**
     * <p>
     * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeAcceleratorRequest
     * @return A Java Future containing the result of the DescribeAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DescribeAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorResult> describeAcceleratorAsync(DescribeAcceleratorRequest describeAcceleratorRequest);

    /**
     * <p>
     * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeAcceleratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorResult> describeAcceleratorAsync(DescribeAcceleratorRequest describeAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorRequest, DescribeAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Describe the attributes of an accelerator. To see an AWS CLI example of describing the attributes of an
     * accelerator, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeAcceleratorAttributesRequest
     * @return A Java Future containing the result of the DescribeAcceleratorAttributes operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.DescribeAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorAttributesResult> describeAcceleratorAttributesAsync(
            DescribeAcceleratorAttributesRequest describeAcceleratorAttributesRequest);

    /**
     * <p>
     * Describe the attributes of an accelerator. To see an AWS CLI example of describing the attributes of an
     * accelerator, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeAcceleratorAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAcceleratorAttributes operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorAttributesResult> describeAcceleratorAttributesAsync(
            DescribeAcceleratorAttributesRequest describeAcceleratorAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorAttributesRequest, DescribeAcceleratorAttributesResult> asyncHandler);

    /**
     * <p>
     * Describe an endpoint group.
     * </p>
     * 
     * @param describeEndpointGroupRequest
     * @return A Java Future containing the result of the DescribeEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DescribeEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointGroupResult> describeEndpointGroupAsync(DescribeEndpointGroupRequest describeEndpointGroupRequest);

    /**
     * <p>
     * Describe an endpoint group.
     * </p>
     * 
     * @param describeEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointGroupResult> describeEndpointGroupAsync(DescribeEndpointGroupRequest describeEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointGroupRequest, DescribeEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Describe a listener. To see an AWS CLI example of describing a listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeListenerRequest
     * @return A Java Future containing the result of the DescribeListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DescribeListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeListenerResult> describeListenerAsync(DescribeListenerRequest describeListenerRequest);

    /**
     * <p>
     * Describe a listener. To see an AWS CLI example of describing a listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeListenerResult> describeListenerAsync(DescribeListenerRequest describeListenerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeListenerRequest, DescribeListenerResult> asyncHandler);

    /**
     * <p>
     * List the accelerators for an AWS account. To see an AWS CLI example of listing the accelerators for an AWS
     * account, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listAcceleratorsRequest
     * @return A Java Future containing the result of the ListAccelerators operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.ListAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAcceleratorsResult> listAcceleratorsAsync(ListAcceleratorsRequest listAcceleratorsRequest);

    /**
     * <p>
     * List the accelerators for an AWS account. To see an AWS CLI example of listing the accelerators for an AWS
     * account, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listAcceleratorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccelerators operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAcceleratorsResult> listAcceleratorsAsync(ListAcceleratorsRequest listAcceleratorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAcceleratorsRequest, ListAcceleratorsResult> asyncHandler);

    /**
     * <p>
     * Lists the IP address ranges that were specified in calls to <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/ProvisionByoipCidr.html">ProvisionByoipCidr</a>.
     * </p>
     * <p>
     * To see an AWS CLI example of listing BYOIP CIDR addresses, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listByoipCidrsRequest
     * @return A Java Future containing the result of the ListByoipCidrs operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.ListByoipCidrs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListByoipCidrs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListByoipCidrsResult> listByoipCidrsAsync(ListByoipCidrsRequest listByoipCidrsRequest);

    /**
     * <p>
     * Lists the IP address ranges that were specified in calls to <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/ProvisionByoipCidr.html">ProvisionByoipCidr</a>.
     * </p>
     * <p>
     * To see an AWS CLI example of listing BYOIP CIDR addresses, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listByoipCidrsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListByoipCidrs operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListByoipCidrs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListByoipCidrs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListByoipCidrsResult> listByoipCidrsAsync(ListByoipCidrsRequest listByoipCidrsRequest,
            com.amazonaws.handlers.AsyncHandler<ListByoipCidrsRequest, ListByoipCidrsResult> asyncHandler);

    /**
     * <p>
     * List the endpoint groups that are associated with a listener. To see an AWS CLI example of listing the endpoint
     * groups for listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listEndpointGroupsRequest
     * @return A Java Future containing the result of the ListEndpointGroups operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.ListEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointGroupsResult> listEndpointGroupsAsync(ListEndpointGroupsRequest listEndpointGroupsRequest);

    /**
     * <p>
     * List the endpoint groups that are associated with a listener. To see an AWS CLI example of listing the endpoint
     * groups for listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listEndpointGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEndpointGroups operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEndpointGroupsResult> listEndpointGroupsAsync(ListEndpointGroupsRequest listEndpointGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEndpointGroupsRequest, ListEndpointGroupsResult> asyncHandler);

    /**
     * <p>
     * List the listeners for an accelerator. To see an AWS CLI example of listing the listeners for an accelerator,
     * scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listListenersRequest
     * @return A Java Future containing the result of the ListListeners operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListListenersResult> listListenersAsync(ListListenersRequest listListenersRequest);

    /**
     * <p>
     * List the listeners for an accelerator. To see an AWS CLI example of listing the listeners for an accelerator,
     * scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listListenersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListListeners operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListListenersResult> listListenersAsync(ListListenersRequest listListenersRequest,
            com.amazonaws.handlers.AsyncHandler<ListListenersRequest, ListListenersResult> asyncHandler);

    /**
     * <p>
     * List all tags for an accelerator. To see an AWS CLI example of listing tags for an accelerator, scroll down to
     * <b>Example</b>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List all tags for an accelerator. To see an AWS CLI example of listing tags for an accelerator, scroll down to
     * <b>Example</b>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Provisions an IP address range to use with your AWS resources through bring your own IP addresses (BYOIP) and
     * creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using
     * <a href="https://docs.aws.amazon.com/global-accelerator/latest/api/AdvertiseByoipCidr.html">
     * AdvertiseByoipCidr</a>.
     * </p>
     * <p>
     * To see an AWS CLI example of provisioning an address range for BYOIP, scroll down to <b>Example</b>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring Your Own IP Addresses
     * (BYOIP)</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param provisionByoipCidrRequest
     * @return A Java Future containing the result of the ProvisionByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.ProvisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ProvisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(ProvisionByoipCidrRequest provisionByoipCidrRequest);

    /**
     * <p>
     * Provisions an IP address range to use with your AWS resources through bring your own IP addresses (BYOIP) and
     * creates a corresponding address pool. After the address range is provisioned, it is ready to be advertised using
     * <a href="https://docs.aws.amazon.com/global-accelerator/latest/api/AdvertiseByoipCidr.html">
     * AdvertiseByoipCidr</a>.
     * </p>
     * <p>
     * To see an AWS CLI example of provisioning an address range for BYOIP, scroll down to <b>Example</b>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring Your Own IP Addresses
     * (BYOIP)</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param provisionByoipCidrRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ProvisionByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ProvisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ProvisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ProvisionByoipCidrResult> provisionByoipCidrAsync(ProvisionByoipCidrRequest provisionByoipCidrRequest,
            com.amazonaws.handlers.AsyncHandler<ProvisionByoipCidrRequest, ProvisionByoipCidrResult> asyncHandler);

    /**
     * <p>
     * Add tags to an accelerator resource. To see an AWS CLI example of adding tags to an accelerator, scroll down to
     * <b>Example</b>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add tags to an accelerator resource. To see an AWS CLI example of adding tags to an accelerator, scroll down to
     * <b>Example</b>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and
     * its associated value. To see an AWS CLI example of removing tags from an accelerator, scroll down to
     * <b>Example</b>. The operation succeeds even if you attempt to remove tags from an accelerator that was already
     * removed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and
     * its associated value. To see an AWS CLI example of removing tags from an accelerator, scroll down to
     * <b>Example</b>. The operation succeeds even if you attempt to remove tags from an accelerator that was already
     * removed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in AWS
     * Global Accelerator</a> in the <i>AWS Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update an accelerator. To see an AWS CLI example of updating an accelerator, scroll down to <b>Example</b>.
     * </p>
     * <important>
     * <p>
     * You must specify the US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param updateAcceleratorRequest
     * @return A Java Future containing the result of the UpdateAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.UpdateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAcceleratorResult> updateAcceleratorAsync(UpdateAcceleratorRequest updateAcceleratorRequest);

    /**
     * <p>
     * Update an accelerator. To see an AWS CLI example of updating an accelerator, scroll down to <b>Example</b>.
     * </p>
     * <important>
     * <p>
     * You must specify the US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param updateAcceleratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccelerator operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UpdateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAcceleratorResult> updateAcceleratorAsync(UpdateAcceleratorRequest updateAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAcceleratorRequest, UpdateAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow
     * logs, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateAcceleratorAttributesRequest
     * @return A Java Future containing the result of the UpdateAcceleratorAttributes operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.UpdateAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAcceleratorAttributesResult> updateAcceleratorAttributesAsync(
            UpdateAcceleratorAttributesRequest updateAcceleratorAttributesRequest);

    /**
     * <p>
     * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow
     * logs, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateAcceleratorAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAcceleratorAttributes operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UpdateAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAcceleratorAttributesResult> updateAcceleratorAttributesAsync(
            UpdateAcceleratorAttributesRequest updateAcceleratorAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAcceleratorAttributesRequest, UpdateAcceleratorAttributesResult> asyncHandler);

    /**
     * <p>
     * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateEndpointGroupRequest
     * @return A Java Future containing the result of the UpdateEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.UpdateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointGroupResult> updateEndpointGroupAsync(UpdateEndpointGroupRequest updateEndpointGroupRequest);

    /**
     * <p>
     * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpointGroup operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UpdateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointGroupResult> updateEndpointGroupAsync(UpdateEndpointGroupRequest updateEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointGroupRequest, UpdateEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Update a listener. To see an AWS CLI example of updating listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateListenerRequest
     * @return A Java Future containing the result of the UpdateListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(UpdateListenerRequest updateListenerRequest);

    /**
     * <p>
     * Update a listener. To see an AWS CLI example of updating listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateListenerResult> updateListenerAsync(UpdateListenerRequest updateListenerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateListenerRequest, UpdateListenerResult> asyncHandler);

    /**
     * <p>
     * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most
     * once every 10 seconds, even if you specify different address ranges each time. To see an AWS CLI example of
     * withdrawing an address range for BYOIP so it will no longer be advertised by AWS, scroll down to <b>Example</b>.
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
     * @return A Java Future containing the result of the WithdrawByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.WithdrawByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/WithdrawByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(WithdrawByoipCidrRequest withdrawByoipCidrRequest);

    /**
     * <p>
     * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most
     * once every 10 seconds, even if you specify different address ranges each time. To see an AWS CLI example of
     * withdrawing an address range for BYOIP so it will no longer be advertised by AWS, scroll down to <b>Example</b>.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the WithdrawByoipCidr operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.WithdrawByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/WithdrawByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WithdrawByoipCidrResult> withdrawByoipCidrAsync(WithdrawByoipCidrRequest withdrawByoipCidrRequest,
            com.amazonaws.handlers.AsyncHandler<WithdrawByoipCidrRequest, WithdrawByoipCidrResult> asyncHandler);

}
