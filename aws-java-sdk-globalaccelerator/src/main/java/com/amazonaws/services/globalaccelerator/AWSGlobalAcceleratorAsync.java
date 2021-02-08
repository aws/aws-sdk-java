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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlobalAcceleratorAsync extends AWSGlobalAccelerator {

    /**
     * <p>
     * Associate a virtual private cloud (VPC) subnet endpoint with your custom routing accelerator.
     * </p>
     * <p>
     * The listener port range must be large enough to support the number of IP addresses that can be specified in your
     * subnet. The number of ports required is: subnet size times the number of ports per destination EC2 instances. For
     * example, a subnet defined as /24 requires a listener port range of at least 255 ports.
     * </p>
     * <p>
     * Note: You must have enough remaining listener ports available to map to the subnet ports, or the call will fail
     * with a LimitExceededException.
     * </p>
     * <p>
     * By default, all destinations in a subnet in a custom routing accelerator cannot receive traffic. To enable all
     * destinations to receive traffic, or to specify individual port mappings that can receive traffic, see the <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_AllowCustomRoutingTraffic.html">
     * AllowCustomRoutingTraffic</a> operation.
     * </p>
     * 
     * @param addCustomRoutingEndpointsRequest
     * @return A Java Future containing the result of the AddCustomRoutingEndpoints operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.AddCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AddCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddCustomRoutingEndpointsResult> addCustomRoutingEndpointsAsync(
            AddCustomRoutingEndpointsRequest addCustomRoutingEndpointsRequest);

    /**
     * <p>
     * Associate a virtual private cloud (VPC) subnet endpoint with your custom routing accelerator.
     * </p>
     * <p>
     * The listener port range must be large enough to support the number of IP addresses that can be specified in your
     * subnet. The number of ports required is: subnet size times the number of ports per destination EC2 instances. For
     * example, a subnet defined as /24 requires a listener port range of at least 255 ports.
     * </p>
     * <p>
     * Note: You must have enough remaining listener ports available to map to the subnet ports, or the call will fail
     * with a LimitExceededException.
     * </p>
     * <p>
     * By default, all destinations in a subnet in a custom routing accelerator cannot receive traffic. To enable all
     * destinations to receive traffic, or to specify individual port mappings that can receive traffic, see the <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_AllowCustomRoutingTraffic.html">
     * AllowCustomRoutingTraffic</a> operation.
     * </p>
     * 
     * @param addCustomRoutingEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddCustomRoutingEndpoints operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.AddCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AddCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddCustomRoutingEndpointsResult> addCustomRoutingEndpointsAsync(
            AddCustomRoutingEndpointsRequest addCustomRoutingEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<AddCustomRoutingEndpointsRequest, AddCustomRoutingEndpointsResult> asyncHandler);

    /**
     * <p>
     * Advertises an IPv4 address range that is provisioned for use with your AWS resources through bring your own IP
     * addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts routing to AWS
     * because of propagation delays.
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
     * because of propagation delays.
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
     * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that can receive
     * traffic for a custom routing accelerator. You can allow traffic to all destinations in the subnet endpoint, or
     * allow traffic to a specified list of destination IP addresses and ports in the subnet. Note that you cannot
     * specify IP addresses or ports outside of the range that you configured for the endpoint group.
     * </p>
     * <p>
     * After you make changes, you can verify that the updates are complete by checking the status of your accelerator:
     * the status changes from IN_PROGRESS to DEPLOYED.
     * </p>
     * 
     * @param allowCustomRoutingTrafficRequest
     * @return A Java Future containing the result of the AllowCustomRoutingTraffic operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.AllowCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AllowCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllowCustomRoutingTrafficResult> allowCustomRoutingTrafficAsync(
            AllowCustomRoutingTrafficRequest allowCustomRoutingTrafficRequest);

    /**
     * <p>
     * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that can receive
     * traffic for a custom routing accelerator. You can allow traffic to all destinations in the subnet endpoint, or
     * allow traffic to a specified list of destination IP addresses and ports in the subnet. Note that you cannot
     * specify IP addresses or ports outside of the range that you configured for the endpoint group.
     * </p>
     * <p>
     * After you make changes, you can verify that the updates are complete by checking the status of your accelerator:
     * the status changes from IN_PROGRESS to DEPLOYED.
     * </p>
     * 
     * @param allowCustomRoutingTrafficRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllowCustomRoutingTraffic operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.AllowCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AllowCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AllowCustomRoutingTrafficResult> allowCustomRoutingTrafficAsync(
            AllowCustomRoutingTrafficRequest allowCustomRoutingTrafficRequest,
            com.amazonaws.handlers.AsyncHandler<AllowCustomRoutingTrafficRequest, AllowCustomRoutingTrafficResult> asyncHandler);

    /**
     * <p>
     * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
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
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
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
     * Create a custom routing accelerator. A custom routing accelerator directs traffic to one of possibly thousands of
     * Amazon EC2 instance destinations running in a single or multiple virtual private clouds (VPC) subnet endpoints.
     * </p>
     * <p>
     * Be aware that, by default, all destination EC2 instances in a VPC subnet endpoint cannot receive traffic. To
     * enable all destinations to receive traffic, or to specify individual port mappings that can receive traffic, see
     * the <a href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_AllowCustomRoutingTraffic.html">
     * AllowCustomRoutingTraffic</a> operation.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param createCustomRoutingAcceleratorRequest
     * @return A Java Future containing the result of the CreateCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.CreateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomRoutingAcceleratorResult> createCustomRoutingAcceleratorAsync(
            CreateCustomRoutingAcceleratorRequest createCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Create a custom routing accelerator. A custom routing accelerator directs traffic to one of possibly thousands of
     * Amazon EC2 instance destinations running in a single or multiple virtual private clouds (VPC) subnet endpoints.
     * </p>
     * <p>
     * Be aware that, by default, all destination EC2 instances in a VPC subnet endpoint cannot receive traffic. To
     * enable all destinations to receive traffic, or to specify individual port mappings that can receive traffic, see
     * the <a href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_AllowCustomRoutingTraffic.html">
     * AllowCustomRoutingTraffic</a> operation.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
     * </p>
     * </important>
     * 
     * @param createCustomRoutingAcceleratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.CreateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomRoutingAcceleratorResult> createCustomRoutingAcceleratorAsync(
            CreateCustomRoutingAcceleratorRequest createCustomRoutingAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomRoutingAcceleratorRequest, CreateCustomRoutingAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Create an endpoint group for the specified listener for a custom routing accelerator. An endpoint group is a
     * collection of endpoints in one AWS Region.
     * </p>
     * 
     * @param createCustomRoutingEndpointGroupRequest
     * @return A Java Future containing the result of the CreateCustomRoutingEndpointGroup operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.CreateCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomRoutingEndpointGroupResult> createCustomRoutingEndpointGroupAsync(
            CreateCustomRoutingEndpointGroupRequest createCustomRoutingEndpointGroupRequest);

    /**
     * <p>
     * Create an endpoint group for the specified listener for a custom routing accelerator. An endpoint group is a
     * collection of endpoints in one AWS Region.
     * </p>
     * 
     * @param createCustomRoutingEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomRoutingEndpointGroup operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.CreateCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomRoutingEndpointGroupResult> createCustomRoutingEndpointGroupAsync(
            CreateCustomRoutingEndpointGroupRequest createCustomRoutingEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomRoutingEndpointGroupRequest, CreateCustomRoutingEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Create a listener to process inbound connections from clients to a custom routing accelerator. Connections arrive
     * to assigned static IP addresses on the port range that you specify.
     * </p>
     * 
     * @param createCustomRoutingListenerRequest
     * @return A Java Future containing the result of the CreateCustomRoutingListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.CreateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomRoutingListenerResult> createCustomRoutingListenerAsync(
            CreateCustomRoutingListenerRequest createCustomRoutingListenerRequest);

    /**
     * <p>
     * Create a listener to process inbound connections from clients to a custom routing accelerator. Connections arrive
     * to assigned static IP addresses on the port range that you specify.
     * </p>
     * 
     * @param createCustomRoutingListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomRoutingListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.CreateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomRoutingListenerResult> createCustomRoutingListenerAsync(
            CreateCustomRoutingListenerRequest createCustomRoutingListenerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomRoutingListenerRequest, CreateCustomRoutingListenerResult> asyncHandler);

    /**
     * <p>
     * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
     * Region. A resource must be valid and active when you add it as an endpoint.
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
     * Region. A resource must be valid and active when you add it as an endpoint.
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
     * static IP addresses on a port, port range, or list of port ranges that you specify.
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
     * static IP addresses on a port, port range, or list of port ranges that you specify.
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
     * Delete a custom routing accelerator. Before you can delete an accelerator, you must disable it and remove all
     * dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set
     * <code>Enabled</code> to false.
     * </p>
     * <important>
     * <p>
     * When you create a custom routing accelerator, by default, Global Accelerator provides you with a set of two
     * static IP addresses.
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
     * @param deleteCustomRoutingAcceleratorRequest
     * @return A Java Future containing the result of the DeleteCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.DeleteCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomRoutingAcceleratorResult> deleteCustomRoutingAcceleratorAsync(
            DeleteCustomRoutingAcceleratorRequest deleteCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Delete a custom routing accelerator. Before you can delete an accelerator, you must disable it and remove all
     * dependent resources (listeners and endpoint groups). To disable the accelerator, update the accelerator to set
     * <code>Enabled</code> to false.
     * </p>
     * <important>
     * <p>
     * When you create a custom routing accelerator, by default, Global Accelerator provides you with a set of two
     * static IP addresses.
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
     * @param deleteCustomRoutingAcceleratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DeleteCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomRoutingAcceleratorResult> deleteCustomRoutingAcceleratorAsync(
            DeleteCustomRoutingAcceleratorRequest deleteCustomRoutingAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomRoutingAcceleratorRequest, DeleteCustomRoutingAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Delete an endpoint group from a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingEndpointGroupRequest
     * @return A Java Future containing the result of the DeleteCustomRoutingEndpointGroup operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.DeleteCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomRoutingEndpointGroupResult> deleteCustomRoutingEndpointGroupAsync(
            DeleteCustomRoutingEndpointGroupRequest deleteCustomRoutingEndpointGroupRequest);

    /**
     * <p>
     * Delete an endpoint group from a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomRoutingEndpointGroup operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DeleteCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomRoutingEndpointGroupResult> deleteCustomRoutingEndpointGroupAsync(
            DeleteCustomRoutingEndpointGroupRequest deleteCustomRoutingEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomRoutingEndpointGroupRequest, DeleteCustomRoutingEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * Delete a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingListenerRequest
     * @return A Java Future containing the result of the DeleteCustomRoutingListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DeleteCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomRoutingListenerResult> deleteCustomRoutingListenerAsync(
            DeleteCustomRoutingListenerRequest deleteCustomRoutingListenerRequest);

    /**
     * <p>
     * Delete a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomRoutingListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DeleteCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomRoutingListenerResult> deleteCustomRoutingListenerAsync(
            DeleteCustomRoutingListenerRequest deleteCustomRoutingListenerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomRoutingListenerRequest, DeleteCustomRoutingListenerResult> asyncHandler);

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
     * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that cannot
     * receive traffic for a custom routing accelerator. You can deny traffic to all destinations in the VPC endpoint,
     * or deny traffic to a specified list of destination IP addresses and ports. Note that you cannot specify IP
     * addresses or ports outside of the range that you configured for the endpoint group.
     * </p>
     * <p>
     * After you make changes, you can verify that the updates are complete by checking the status of your accelerator:
     * the status changes from IN_PROGRESS to DEPLOYED.
     * </p>
     * 
     * @param denyCustomRoutingTrafficRequest
     * @return A Java Future containing the result of the DenyCustomRoutingTraffic operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.DenyCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DenyCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DenyCustomRoutingTrafficResult> denyCustomRoutingTrafficAsync(DenyCustomRoutingTrafficRequest denyCustomRoutingTrafficRequest);

    /**
     * <p>
     * Specify the Amazon EC2 instance (destination) IP addresses and ports for a VPC subnet endpoint that cannot
     * receive traffic for a custom routing accelerator. You can deny traffic to all destinations in the VPC endpoint,
     * or deny traffic to a specified list of destination IP addresses and ports. Note that you cannot specify IP
     * addresses or ports outside of the range that you configured for the endpoint group.
     * </p>
     * <p>
     * After you make changes, you can verify that the updates are complete by checking the status of your accelerator:
     * the status changes from IN_PROGRESS to DEPLOYED.
     * </p>
     * 
     * @param denyCustomRoutingTrafficRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DenyCustomRoutingTraffic operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DenyCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DenyCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DenyCustomRoutingTrafficResult> denyCustomRoutingTrafficAsync(DenyCustomRoutingTrafficRequest denyCustomRoutingTrafficRequest,
            com.amazonaws.handlers.AsyncHandler<DenyCustomRoutingTrafficRequest, DenyCustomRoutingTrafficResult> asyncHandler);

    /**
     * <p>
     * Releases the specified address range that you provisioned to use with your AWS resources through bring your own
     * IP addresses (BYOIP) and deletes the corresponding address pool.
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
     * IP addresses (BYOIP) and deletes the corresponding address pool.
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
     * Describe an accelerator.
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
     * Describe an accelerator.
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
     * Describe the attributes of an accelerator.
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
     * Describe the attributes of an accelerator.
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
     * Describe a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorRequest
     * @return A Java Future containing the result of the DescribeCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.DescribeCustomRoutingAccelerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingAcceleratorResult> describeCustomRoutingAcceleratorAsync(
            DescribeCustomRoutingAcceleratorRequest describeCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Describe a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeCustomRoutingAccelerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingAcceleratorResult> describeCustomRoutingAcceleratorAsync(
            DescribeCustomRoutingAcceleratorRequest describeCustomRoutingAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingAcceleratorRequest, DescribeCustomRoutingAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Describe the attributes of a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorAttributesRequest
     * @return A Java Future containing the result of the DescribeCustomRoutingAcceleratorAttributes operation returned
     *         by the service.
     * @sample AWSGlobalAcceleratorAsync.DescribeCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingAcceleratorAttributesResult> describeCustomRoutingAcceleratorAttributesAsync(
            DescribeCustomRoutingAcceleratorAttributesRequest describeCustomRoutingAcceleratorAttributesRequest);

    /**
     * <p>
     * Describe the attributes of a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomRoutingAcceleratorAttributes operation returned
     *         by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingAcceleratorAttributesResult> describeCustomRoutingAcceleratorAttributesAsync(
            DescribeCustomRoutingAcceleratorAttributesRequest describeCustomRoutingAcceleratorAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingAcceleratorAttributesRequest, DescribeCustomRoutingAcceleratorAttributesResult> asyncHandler);

    /**
     * <p>
     * Describe an endpoint group for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingEndpointGroupRequest
     * @return A Java Future containing the result of the DescribeCustomRoutingEndpointGroup operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.DescribeCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingEndpointGroupResult> describeCustomRoutingEndpointGroupAsync(
            DescribeCustomRoutingEndpointGroupRequest describeCustomRoutingEndpointGroupRequest);

    /**
     * <p>
     * Describe an endpoint group for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingEndpointGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomRoutingEndpointGroup operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingEndpointGroupResult> describeCustomRoutingEndpointGroupAsync(
            DescribeCustomRoutingEndpointGroupRequest describeCustomRoutingEndpointGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingEndpointGroupRequest, DescribeCustomRoutingEndpointGroupResult> asyncHandler);

    /**
     * <p>
     * The description of a listener for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingListenerRequest
     * @return A Java Future containing the result of the DescribeCustomRoutingListener operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.DescribeCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingListenerResult> describeCustomRoutingListenerAsync(
            DescribeCustomRoutingListenerRequest describeCustomRoutingListenerRequest);

    /**
     * <p>
     * The description of a listener for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomRoutingListener operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.DescribeCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomRoutingListenerResult> describeCustomRoutingListenerAsync(
            DescribeCustomRoutingListenerRequest describeCustomRoutingListenerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomRoutingListenerRequest, DescribeCustomRoutingListenerResult> asyncHandler);

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
     * Describe a listener.
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
     * Describe a listener.
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
     * List the accelerators for an AWS account.
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
     * List the accelerators for an AWS account.
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
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/ProvisionByoipCidr.html">ProvisionByoipCidr</a>,
     * including the current state and a history of state changes.
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
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/ProvisionByoipCidr.html">ProvisionByoipCidr</a>,
     * including the current state and a history of state changes.
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
     * List the custom routing accelerators for an AWS account.
     * </p>
     * 
     * @param listCustomRoutingAcceleratorsRequest
     * @return A Java Future containing the result of the ListCustomRoutingAccelerators operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.ListCustomRoutingAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingAcceleratorsResult> listCustomRoutingAcceleratorsAsync(
            ListCustomRoutingAcceleratorsRequest listCustomRoutingAcceleratorsRequest);

    /**
     * <p>
     * List the custom routing accelerators for an AWS account.
     * </p>
     * 
     * @param listCustomRoutingAcceleratorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomRoutingAccelerators operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListCustomRoutingAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingAcceleratorsResult> listCustomRoutingAcceleratorsAsync(
            ListCustomRoutingAcceleratorsRequest listCustomRoutingAcceleratorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomRoutingAcceleratorsRequest, ListCustomRoutingAcceleratorsResult> asyncHandler);

    /**
     * <p>
     * List the endpoint groups that are associated with a listener for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingEndpointGroupsRequest
     * @return A Java Future containing the result of the ListCustomRoutingEndpointGroups operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.ListCustomRoutingEndpointGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingEndpointGroupsResult> listCustomRoutingEndpointGroupsAsync(
            ListCustomRoutingEndpointGroupsRequest listCustomRoutingEndpointGroupsRequest);

    /**
     * <p>
     * List the endpoint groups that are associated with a listener for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingEndpointGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomRoutingEndpointGroups operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListCustomRoutingEndpointGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingEndpointGroupsResult> listCustomRoutingEndpointGroupsAsync(
            ListCustomRoutingEndpointGroupsRequest listCustomRoutingEndpointGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomRoutingEndpointGroupsRequest, ListCustomRoutingEndpointGroupsResult> asyncHandler);

    /**
     * <p>
     * List the listeners for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingListenersRequest
     * @return A Java Future containing the result of the ListCustomRoutingListeners operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.ListCustomRoutingListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingListenersResult> listCustomRoutingListenersAsync(
            ListCustomRoutingListenersRequest listCustomRoutingListenersRequest);

    /**
     * <p>
     * List the listeners for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingListenersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomRoutingListeners operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListCustomRoutingListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingListeners"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingListenersResult> listCustomRoutingListenersAsync(
            ListCustomRoutingListenersRequest listCustomRoutingListenersRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomRoutingListenersRequest, ListCustomRoutingListenersResult> asyncHandler);

    /**
     * <p>
     * Provides a complete mapping from the public accelerator IP address and port to destination EC2 instance IP
     * addresses and ports in the virtual public cloud (VPC) subnet endpoint for a custom routing accelerator. For each
     * subnet endpoint that you add, Global Accelerator creates a new static port mapping for the accelerator. The port
     * mappings don't change after Global Accelerator generates them, so you can retrieve and cache the full mapping on
     * your servers.
     * </p>
     * <p>
     * If you remove a subnet from your accelerator, Global Accelerator removes (reclaims) the port mappings. If you add
     * a subnet to your accelerator, Global Accelerator creates new port mappings (the existing ones don't change). If
     * you add or remove EC2 instances in your subnet, the port mappings don't change, because the mappings are created
     * when you add the subnet to Global Accelerator.
     * </p>
     * <p>
     * The mappings also include a flag for each destination denoting which destination IP addresses and ports are
     * allowed or denied traffic.
     * </p>
     * 
     * @param listCustomRoutingPortMappingsRequest
     * @return A Java Future containing the result of the ListCustomRoutingPortMappings operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.ListCustomRoutingPortMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingPortMappingsResult> listCustomRoutingPortMappingsAsync(
            ListCustomRoutingPortMappingsRequest listCustomRoutingPortMappingsRequest);

    /**
     * <p>
     * Provides a complete mapping from the public accelerator IP address and port to destination EC2 instance IP
     * addresses and ports in the virtual public cloud (VPC) subnet endpoint for a custom routing accelerator. For each
     * subnet endpoint that you add, Global Accelerator creates a new static port mapping for the accelerator. The port
     * mappings don't change after Global Accelerator generates them, so you can retrieve and cache the full mapping on
     * your servers.
     * </p>
     * <p>
     * If you remove a subnet from your accelerator, Global Accelerator removes (reclaims) the port mappings. If you add
     * a subnet to your accelerator, Global Accelerator creates new port mappings (the existing ones don't change). If
     * you add or remove EC2 instances in your subnet, the port mappings don't change, because the mappings are created
     * when you add the subnet to Global Accelerator.
     * </p>
     * <p>
     * The mappings also include a flag for each destination denoting which destination IP addresses and ports are
     * allowed or denied traffic.
     * </p>
     * 
     * @param listCustomRoutingPortMappingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomRoutingPortMappings operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListCustomRoutingPortMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingPortMappingsResult> listCustomRoutingPortMappingsAsync(
            ListCustomRoutingPortMappingsRequest listCustomRoutingPortMappingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomRoutingPortMappingsRequest, ListCustomRoutingPortMappingsResult> asyncHandler);

    /**
     * <p>
     * List the port mappings for a specific EC2 instance (destination) in a VPC subnet endpoint. The response is the
     * mappings for one destination IP address. This is useful when your subnet endpoint has mappings that span multiple
     * custom routing accelerators in your account, or for scenarios where you only want to list the port mappings for a
     * specific destination instance.
     * </p>
     * 
     * @param listCustomRoutingPortMappingsByDestinationRequest
     * @return A Java Future containing the result of the ListCustomRoutingPortMappingsByDestination operation returned
     *         by the service.
     * @sample AWSGlobalAcceleratorAsync.ListCustomRoutingPortMappingsByDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappingsByDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingPortMappingsByDestinationResult> listCustomRoutingPortMappingsByDestinationAsync(
            ListCustomRoutingPortMappingsByDestinationRequest listCustomRoutingPortMappingsByDestinationRequest);

    /**
     * <p>
     * List the port mappings for a specific EC2 instance (destination) in a VPC subnet endpoint. The response is the
     * mappings for one destination IP address. This is useful when your subnet endpoint has mappings that span multiple
     * custom routing accelerators in your account, or for scenarios where you only want to list the port mappings for a
     * specific destination instance.
     * </p>
     * 
     * @param listCustomRoutingPortMappingsByDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomRoutingPortMappingsByDestination operation returned
     *         by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.ListCustomRoutingPortMappingsByDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappingsByDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomRoutingPortMappingsByDestinationResult> listCustomRoutingPortMappingsByDestinationAsync(
            ListCustomRoutingPortMappingsByDestinationRequest listCustomRoutingPortMappingsByDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomRoutingPortMappingsByDestinationRequest, ListCustomRoutingPortMappingsByDestinationResult> asyncHandler);

    /**
     * <p>
     * List the endpoint groups that are associated with a listener.
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
     * List the endpoint groups that are associated with a listener.
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
     * List the listeners for an accelerator.
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
     * List the listeners for an accelerator.
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
     * List all tags for an accelerator.
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
     * List all tags for an accelerator.
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
     * Remove endpoints from a custom routing accelerator.
     * </p>
     * 
     * @param removeCustomRoutingEndpointsRequest
     * @return A Java Future containing the result of the RemoveCustomRoutingEndpoints operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.RemoveCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/RemoveCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveCustomRoutingEndpointsResult> removeCustomRoutingEndpointsAsync(
            RemoveCustomRoutingEndpointsRequest removeCustomRoutingEndpointsRequest);

    /**
     * <p>
     * Remove endpoints from a custom routing accelerator.
     * </p>
     * 
     * @param removeCustomRoutingEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveCustomRoutingEndpoints operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.RemoveCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/RemoveCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveCustomRoutingEndpointsResult> removeCustomRoutingEndpointsAsync(
            RemoveCustomRoutingEndpointsRequest removeCustomRoutingEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveCustomRoutingEndpointsRequest, RemoveCustomRoutingEndpointsResult> asyncHandler);

    /**
     * <p>
     * Add tags to an accelerator resource.
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
     * Add tags to an accelerator resource.
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
     * its associated value. The operation succeeds even if you attempt to remove tags from an accelerator that was
     * already removed.
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
     * its associated value. The operation succeeds even if you attempt to remove tags from an accelerator that was
     * already removed.
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
     * Update an accelerator.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
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
     * Update an accelerator.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple AWS Regions but you must specify the
     * US West (Oregon) Region to create or update accelerators.
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
     * Update the attributes for an accelerator.
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
     * Update the attributes for an accelerator.
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
     * Update a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorRequest
     * @return A Java Future containing the result of the UpdateCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsync.UpdateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomRoutingAcceleratorResult> updateCustomRoutingAcceleratorAsync(
            UpdateCustomRoutingAcceleratorRequest updateCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Update a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCustomRoutingAccelerator operation returned by the
     *         service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UpdateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomRoutingAcceleratorResult> updateCustomRoutingAcceleratorAsync(
            UpdateCustomRoutingAcceleratorRequest updateCustomRoutingAcceleratorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCustomRoutingAcceleratorRequest, UpdateCustomRoutingAcceleratorResult> asyncHandler);

    /**
     * <p>
     * Update the attributes for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorAttributesRequest
     * @return A Java Future containing the result of the UpdateCustomRoutingAcceleratorAttributes operation returned by
     *         the service.
     * @sample AWSGlobalAcceleratorAsync.UpdateCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomRoutingAcceleratorAttributesResult> updateCustomRoutingAcceleratorAttributesAsync(
            UpdateCustomRoutingAcceleratorAttributesRequest updateCustomRoutingAcceleratorAttributesRequest);

    /**
     * <p>
     * Update the attributes for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCustomRoutingAcceleratorAttributes operation returned by
     *         the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UpdateCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomRoutingAcceleratorAttributesResult> updateCustomRoutingAcceleratorAttributesAsync(
            UpdateCustomRoutingAcceleratorAttributesRequest updateCustomRoutingAcceleratorAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCustomRoutingAcceleratorAttributesRequest, UpdateCustomRoutingAcceleratorAttributesResult> asyncHandler);

    /**
     * <p>
     * Update a listener for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingListenerRequest
     * @return A Java Future containing the result of the UpdateCustomRoutingListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsync.UpdateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomRoutingListenerResult> updateCustomRoutingListenerAsync(
            UpdateCustomRoutingListenerRequest updateCustomRoutingListenerRequest);

    /**
     * <p>
     * Update a listener for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingListenerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCustomRoutingListener operation returned by the service.
     * @sample AWSGlobalAcceleratorAsyncHandler.UpdateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCustomRoutingListenerResult> updateCustomRoutingListenerAsync(
            UpdateCustomRoutingListenerRequest updateCustomRoutingListenerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCustomRoutingListenerRequest, UpdateCustomRoutingListenerResult> asyncHandler);

    /**
     * <p>
     * Update an endpoint group. A resource must be valid and active when you add it as an endpoint.
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
     * Update an endpoint group. A resource must be valid and active when you add it as an endpoint.
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
     * Update a listener.
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
     * Update a listener.
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
     * once every 10 seconds, even if you specify different address ranges each time.
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
     * once every 10 seconds, even if you specify different address ranges each time.
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
