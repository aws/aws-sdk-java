/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.globalaccelerator.model.*;

/**
 * Interface for accessing AWS Global Accelerator.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.globalaccelerator.AbstractAWSGlobalAccelerator} instead.
 * </p>
 * <p>
 * <fullname>Global Accelerator</fullname>
 * <p>
 * This is the <i>Global Accelerator API Reference</i>. This guide is for developers who need detailed information about
 * Global Accelerator API actions, data types, and errors. For more information about Global Accelerator features, see
 * the <a href="https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html">Global
 * Accelerator Developer Guide</a>.
 * </p>
 * <p>
 * Global Accelerator is a service in which you create <i>accelerators</i> to improve the performance of your
 * applications for local and global users. Depending on the type of accelerator you choose, you can gain additional
 * benefits.
 * </p>
 * <ul>
 * <li>
 * <p>
 * By using a standard accelerator, you can improve availability of your internet applications that are used by a global
 * audience. With a standard accelerator, Global Accelerator directs traffic to optimal endpoints over the Amazon Web
 * Services global network.
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
 * Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you must
 * specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for example,
 * specify <code>--region us-west-2</code> on AWS CLI commands.
 * </p>
 * </important>
 * <p>
 * By default, Global Accelerator provides you with static IP addresses that you associate with your accelerator. The
 * static IP addresses are anycast from the Amazon Web Services edge network. For IPv4, Global Accelerator provides two
 * static IPv4 addresses. For dual-stack, Global Accelerator provides a total of four addresses: two static IPv4
 * addresses and two static IPv6 addresses. With a standard accelerator for IPv4, instead of using the addresses that
 * Global Accelerator provides, you can configure these entry points to be IPv4 addresses from your own IP address
 * ranges that you bring toGlobal Accelerator (BYOIP).
 * </p>
 * <p>
 * For a standard accelerator, they distribute incoming application traffic across multiple endpoint resources in
 * multiple Amazon Web Services Regions , which increases the availability of your applications. Endpoints for standard
 * accelerators can be Network Load Balancers, Application Load Balancers, Amazon EC2 instances, or Elastic IP addresses
 * that are located in one Amazon Web Services Region or multiple Amazon Web Services Regions. For custom routing
 * accelerators, you map traffic that arrives to the static IP addresses to specific Amazon EC2 servers in endpoints
 * that are virtual private cloud (VPC) subnets.
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
 * For standard accelerators, Global Accelerator uses the Amazon Web Services global network to route traffic to the
 * optimal regional endpoint based on health, client location, and policies that you configure. The service reacts
 * instantly to changes in health or configuration to ensure that internet traffic from clients is always directed to
 * healthy endpoints.
 * </p>
 * <p>
 * For more information about understanding and using Global Accelerator, see the <a
 * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/what-is-global-accelerator.html">Global Accelerator
 * Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlobalAccelerator {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "globalaccelerator";

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
     * @return Result of the AddCustomRoutingEndpoints operation returned by the service.
     * @throws EndpointAlreadyExistsException
     *         The endpoint that you specified doesn't exist.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ConflictException
     *         You can't use both of those options.
     * @sample AWSGlobalAccelerator.AddCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AddCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    AddCustomRoutingEndpointsResult addCustomRoutingEndpoints(AddCustomRoutingEndpointsRequest addCustomRoutingEndpointsRequest);

    /**
     * <p>
     * Add endpoints to an endpoint group. The <code>AddEndpoints</code> API operation is the recommended option for
     * adding endpoints. The alternative options are to add endpoints when you create an endpoint group (with the <a
     * href
     * ="https://docs.aws.amazon.com/global-accelerator/latest/api/API_CreateEndpointGroup.html">CreateEndpointGroup</a>
     * API) or when you update an endpoint group (with the <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_UpdateEndpointGroup.html"
     * >UpdateEndpointGroup</a> API).
     * </p>
     * <p>
     * There are two advantages to using <code>AddEndpoints</code> to add endpoints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It's faster, because Global Accelerator only has to resolve the new endpoints that you're adding.
     * </p>
     * </li>
     * <li>
     * <p>
     * It's more convenient, because you don't need to specify all of the current endpoints that are already in the
     * endpoint group in addition to the new endpoints that you want to add.
     * </p>
     * </li>
     * </ul>
     * 
     * @param addEndpointsRequest
     * @return Result of the AddEndpoints operation returned by the service.
     * @throws TransactionInProgressException
     *         There's already a transaction in progress. Another transaction can't be processed.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.AddEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AddEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    AddEndpointsResult addEndpoints(AddEndpointsRequest addEndpointsRequest);

    /**
     * <p>
     * Advertises an IPv4 address range that is provisioned for use with your Amazon Web Services resources through
     * bring your own IP addresses (BYOIP). It can take a few minutes before traffic to the specified addresses starts
     * routing to Amazon Web Services because of propagation delays.
     * </p>
     * <p>
     * To stop advertising the BYOIP address range, use <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/WithdrawByoipCidr.html"> WithdrawByoipCidr</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param advertiseByoipCidrRequest
     * @return Result of the AdvertiseByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ByoipCidrNotFoundException
     *         The CIDR that you specified was not found or is incorrect.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.AdvertiseByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AdvertiseByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    AdvertiseByoipCidrResult advertiseByoipCidr(AdvertiseByoipCidrRequest advertiseByoipCidrRequest);

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
     * @return Result of the AllowCustomRoutingTraffic operation returned by the service.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.AllowCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/AllowCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    AllowCustomRoutingTrafficResult allowCustomRoutingTraffic(AllowCustomRoutingTrafficRequest allowCustomRoutingTrafficRequest);

    /**
     * <p>
     * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you
     * must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for
     * example, specify <code>--region us-west-2</code> on AWS CLI commands.
     * </p>
     * </important>
     * 
     * @param createAcceleratorRequest
     * @return Result of the CreateAccelerator operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @sample AWSGlobalAccelerator.CreateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAcceleratorResult createAccelerator(CreateAcceleratorRequest createAcceleratorRequest);

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
     * Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you
     * must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for
     * example, specify <code>--region us-west-2</code> on AWS CLI commands.
     * </p>
     * </important>
     * 
     * @param createCustomRoutingAcceleratorRequest
     * @return Result of the CreateCustomRoutingAccelerator operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.CreateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomRoutingAcceleratorResult createCustomRoutingAccelerator(CreateCustomRoutingAcceleratorRequest createCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Create an endpoint group for the specified listener for a custom routing accelerator. An endpoint group is a
     * collection of endpoints in one Amazon Web Services Region.
     * </p>
     * 
     * @param createCustomRoutingEndpointGroupRequest
     * @return Result of the CreateCustomRoutingEndpointGroup operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws EndpointGroupAlreadyExistsException
     *         The endpoint group that you specified already exists.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.CreateCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomRoutingEndpointGroupResult createCustomRoutingEndpointGroup(CreateCustomRoutingEndpointGroupRequest createCustomRoutingEndpointGroupRequest);

    /**
     * <p>
     * Create a listener to process inbound connections from clients to a custom routing accelerator. Connections arrive
     * to assigned static IP addresses on the port range that you specify.
     * </p>
     * 
     * @param createCustomRoutingListenerRequest
     * @return Result of the CreateCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @sample AWSGlobalAccelerator.CreateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomRoutingListenerResult createCustomRoutingListener(CreateCustomRoutingListenerRequest createCustomRoutingListenerRequest);

    /**
     * <p>
     * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one Amazon
     * Web Services Region. A resource must be valid and active when you add it as an endpoint.
     * </p>
     * 
     * @param createEndpointGroupRequest
     * @return Result of the CreateEndpointGroup operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws EndpointGroupAlreadyExistsException
     *         The endpoint group that you specified already exists.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.CreateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEndpointGroupResult createEndpointGroup(CreateEndpointGroupRequest createEndpointGroupRequest);

    /**
     * <p>
     * Create a listener to process inbound connections from clients to an accelerator. Connections arrive to assigned
     * static IP addresses on a port, port range, or list of port ranges that you specify.
     * </p>
     * 
     * @param createListenerRequest
     * @return Result of the CreateListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @sample AWSGlobalAccelerator.CreateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateListener"
     *      target="_top">AWS API Documentation</a>
     */
    CreateListenerResult createListener(CreateListenerRequest createListenerRequest);

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
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/auth-and-access-control.html">Identity and access
     * management</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param deleteAcceleratorRequest
     * @return Result of the DeleteAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws AcceleratorNotDisabledException
     *         The accelerator that you specified could not be disabled.
     * @throws AssociatedListenerFoundException
     *         The accelerator that you specified has a listener associated with it. You must remove all dependent
     *         resources from an accelerator before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DeleteAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAcceleratorResult deleteAccelerator(DeleteAcceleratorRequest deleteAcceleratorRequest);

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
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/auth-and-access-control.html">Identity and access
     * management</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param deleteCustomRoutingAcceleratorRequest
     * @return Result of the DeleteCustomRoutingAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws AcceleratorNotDisabledException
     *         The accelerator that you specified could not be disabled.
     * @throws AssociatedListenerFoundException
     *         The accelerator that you specified has a listener associated with it. You must remove all dependent
     *         resources from an accelerator before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DeleteCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomRoutingAcceleratorResult deleteCustomRoutingAccelerator(DeleteCustomRoutingAcceleratorRequest deleteCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Delete an endpoint group from a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingEndpointGroupRequest
     * @return Result of the DeleteCustomRoutingEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomRoutingEndpointGroupResult deleteCustomRoutingEndpointGroup(DeleteCustomRoutingEndpointGroupRequest deleteCustomRoutingEndpointGroupRequest);

    /**
     * <p>
     * Delete a listener for a custom routing accelerator.
     * </p>
     * 
     * @param deleteCustomRoutingListenerRequest
     * @return Result of the DeleteCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws AssociatedEndpointGroupFoundException
     *         The listener that you specified has an endpoint group associated with it. You must remove all dependent
     *         resources from a listener before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomRoutingListenerResult deleteCustomRoutingListener(DeleteCustomRoutingListenerRequest deleteCustomRoutingListenerRequest);

    /**
     * <p>
     * Delete an endpoint group from a listener.
     * </p>
     * 
     * @param deleteEndpointGroupRequest
     * @return Result of the DeleteEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEndpointGroupResult deleteEndpointGroup(DeleteEndpointGroupRequest deleteEndpointGroupRequest);

    /**
     * <p>
     * Delete a listener from an accelerator.
     * </p>
     * 
     * @param deleteListenerRequest
     * @return Result of the DeleteListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws AssociatedEndpointGroupFoundException
     *         The listener that you specified has an endpoint group associated with it. You must remove all dependent
     *         resources from a listener before you can delete it.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteListenerResult deleteListener(DeleteListenerRequest deleteListenerRequest);

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
     * @return Result of the DenyCustomRoutingTraffic operation returned by the service.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DenyCustomRoutingTraffic
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DenyCustomRoutingTraffic"
     *      target="_top">AWS API Documentation</a>
     */
    DenyCustomRoutingTrafficResult denyCustomRoutingTraffic(DenyCustomRoutingTrafficRequest denyCustomRoutingTrafficRequest);

    /**
     * <p>
     * Releases the specified address range that you provisioned to use with your Amazon Web Services resources through
     * bring your own IP addresses (BYOIP) and deletes the corresponding address pool.
     * </p>
     * <p>
     * Before you can release an address range, you must stop advertising it by using <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/WithdrawByoipCidr.html">WithdrawByoipCidr</a> and
     * you must not have any accelerators that are using static IP addresses allocated from its address range.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param deprovisionByoipCidrRequest
     * @return Result of the DeprovisionByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ByoipCidrNotFoundException
     *         The CIDR that you specified was not found or is incorrect.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.DeprovisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeprovisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    DeprovisionByoipCidrResult deprovisionByoipCidr(DeprovisionByoipCidrRequest deprovisionByoipCidrRequest);

    /**
     * <p>
     * Describe an accelerator.
     * </p>
     * 
     * @param describeAcceleratorRequest
     * @return Result of the DescribeAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAcceleratorResult describeAccelerator(DescribeAcceleratorRequest describeAcceleratorRequest);

    /**
     * <p>
     * Describe the attributes of an accelerator.
     * </p>
     * 
     * @param describeAcceleratorAttributesRequest
     * @return Result of the DescribeAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAcceleratorAttributesResult describeAcceleratorAttributes(DescribeAcceleratorAttributesRequest describeAcceleratorAttributesRequest);

    /**
     * <p>
     * Describe a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorRequest
     * @return Result of the DescribeCustomRoutingAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingAccelerator
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomRoutingAcceleratorResult describeCustomRoutingAccelerator(DescribeCustomRoutingAcceleratorRequest describeCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Describe the attributes of a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingAcceleratorAttributesRequest
     * @return Result of the DescribeCustomRoutingAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomRoutingAcceleratorAttributesResult describeCustomRoutingAcceleratorAttributes(
            DescribeCustomRoutingAcceleratorAttributesRequest describeCustomRoutingAcceleratorAttributesRequest);

    /**
     * <p>
     * Describe an endpoint group for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingEndpointGroupRequest
     * @return Result of the DescribeCustomRoutingEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingEndpointGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomRoutingEndpointGroupResult describeCustomRoutingEndpointGroup(
            DescribeCustomRoutingEndpointGroupRequest describeCustomRoutingEndpointGroupRequest);

    /**
     * <p>
     * The description of a listener for a custom routing accelerator.
     * </p>
     * 
     * @param describeCustomRoutingListenerRequest
     * @return Result of the DescribeCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCustomRoutingListenerResult describeCustomRoutingListener(DescribeCustomRoutingListenerRequest describeCustomRoutingListenerRequest);

    /**
     * <p>
     * Describe an endpoint group.
     * </p>
     * 
     * @param describeEndpointGroupRequest
     * @return Result of the DescribeEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEndpointGroupResult describeEndpointGroup(DescribeEndpointGroupRequest describeEndpointGroupRequest);

    /**
     * <p>
     * Describe a listener.
     * </p>
     * 
     * @param describeListenerRequest
     * @return Result of the DescribeListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeListener"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeListenerResult describeListener(DescribeListenerRequest describeListenerRequest);

    /**
     * <p>
     * List the accelerators for an Amazon Web Services account.
     * </p>
     * 
     * @param listAcceleratorsRequest
     * @return Result of the ListAccelerators operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    ListAcceleratorsResult listAccelerators(ListAcceleratorsRequest listAcceleratorsRequest);

    /**
     * <p>
     * Lists the IP address ranges that were specified in calls to <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/ProvisionByoipCidr.html">ProvisionByoipCidr</a>,
     * including the current state and a history of state changes.
     * </p>
     * 
     * @param listByoipCidrsRequest
     * @return Result of the ListByoipCidrs operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @sample AWSGlobalAccelerator.ListByoipCidrs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListByoipCidrs"
     *      target="_top">AWS API Documentation</a>
     */
    ListByoipCidrsResult listByoipCidrs(ListByoipCidrsRequest listByoipCidrsRequest);

    /**
     * <p>
     * List the custom routing accelerators for an Amazon Web Services account.
     * </p>
     * 
     * @param listCustomRoutingAcceleratorsRequest
     * @return Result of the ListCustomRoutingAccelerators operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomRoutingAcceleratorsResult listCustomRoutingAccelerators(ListCustomRoutingAcceleratorsRequest listCustomRoutingAcceleratorsRequest);

    /**
     * <p>
     * List the endpoint groups that are associated with a listener for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingEndpointGroupsRequest
     * @return Result of the ListCustomRoutingEndpointGroups operation returned by the service.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingEndpointGroups
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomRoutingEndpointGroupsResult listCustomRoutingEndpointGroups(ListCustomRoutingEndpointGroupsRequest listCustomRoutingEndpointGroupsRequest);

    /**
     * <p>
     * List the listeners for a custom routing accelerator.
     * </p>
     * 
     * @param listCustomRoutingListenersRequest
     * @return Result of the ListCustomRoutingListeners operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingListeners"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomRoutingListenersResult listCustomRoutingListeners(ListCustomRoutingListenersRequest listCustomRoutingListenersRequest);

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
     * @return Result of the ListCustomRoutingPortMappings operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingPortMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappings"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomRoutingPortMappingsResult listCustomRoutingPortMappings(ListCustomRoutingPortMappingsRequest listCustomRoutingPortMappingsRequest);

    /**
     * <p>
     * List the port mappings for a specific EC2 instance (destination) in a VPC subnet endpoint. The response is the
     * mappings for one destination IP address. This is useful when your subnet endpoint has mappings that span multiple
     * custom routing accelerators in your account, or for scenarios where you only want to list the port mappings for a
     * specific destination instance.
     * </p>
     * 
     * @param listCustomRoutingPortMappingsByDestinationRequest
     * @return Result of the ListCustomRoutingPortMappingsByDestination operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws EndpointNotFoundException
     *         The endpoint that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListCustomRoutingPortMappingsByDestination
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCustomRoutingPortMappingsByDestination"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomRoutingPortMappingsByDestinationResult listCustomRoutingPortMappingsByDestination(
            ListCustomRoutingPortMappingsByDestinationRequest listCustomRoutingPortMappingsByDestinationRequest);

    /**
     * <p>
     * List the endpoint groups that are associated with a listener.
     * </p>
     * 
     * @param listEndpointGroupsRequest
     * @return Result of the ListEndpointGroups operation returned by the service.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListEndpointGroupsResult listEndpointGroups(ListEndpointGroupsRequest listEndpointGroupsRequest);

    /**
     * <p>
     * List the listeners for an accelerator.
     * </p>
     * 
     * @param listListenersRequest
     * @return Result of the ListListeners operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @sample AWSGlobalAccelerator.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListListeners"
     *      target="_top">AWS API Documentation</a>
     */
    ListListenersResult listListeners(ListListenersRequest listListenersRequest);

    /**
     * <p>
     * List all tags for an accelerator.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Provisions an IP address range to use with your Amazon Web Services resources through bring your own IP addresses
     * (BYOIP) and creates a corresponding address pool. After the address range is provisioned, it is ready to be
     * advertised using <a href="https://docs.aws.amazon.com/global-accelerator/latest/api/AdvertiseByoipCidr.html">
     * AdvertiseByoipCidr</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param provisionByoipCidrRequest
     * @return Result of the ProvisionByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.ProvisionByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ProvisionByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    ProvisionByoipCidrResult provisionByoipCidr(ProvisionByoipCidrRequest provisionByoipCidrRequest);

    /**
     * <p>
     * Remove endpoints from a custom routing accelerator.
     * </p>
     * 
     * @param removeCustomRoutingEndpointsRequest
     * @return Result of the RemoveCustomRoutingEndpoints operation returned by the service.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws EndpointNotFoundException
     *         The endpoint that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ConflictException
     *         You can't use both of those options.
     * @sample AWSGlobalAccelerator.RemoveCustomRoutingEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/RemoveCustomRoutingEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveCustomRoutingEndpointsResult removeCustomRoutingEndpoints(RemoveCustomRoutingEndpointsRequest removeCustomRoutingEndpointsRequest);

    /**
     * <p>
     * Remove endpoints from an endpoint group.
     * </p>
     * <p>
     * The <code>RemoveEndpoints</code> API operation is the recommended option for removing endpoints. The alternative
     * is to remove endpoints by updating an endpoint group by using the <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/api/API_UpdateEndpointGroup.html"
     * >UpdateEndpointGroup</a> API operation. There are two advantages to using <code>AddEndpoints</code> to remove
     * endpoints instead:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It's more convenient, because you only need to specify the endpoints that you want to remove. With the
     * <code>UpdateEndpointGroup</code> API operation, you must specify all of the endpoints in the endpoint group
     * except the ones that you want to remove from the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * It's faster, because Global Accelerator doesn't need to resolve any endpoints. With the
     * <code>UpdateEndpointGroup</code> API operation, Global Accelerator must resolve all of the endpoints that remain
     * in the group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param removeEndpointsRequest
     * @return Result of the RemoveEndpoints operation returned by the service.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws TransactionInProgressException
     *         There's already a transaction in progress. Another transaction can't be processed.
     * @sample AWSGlobalAccelerator.RemoveEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/RemoveEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveEndpointsResult removeEndpoints(RemoveEndpointsRequest removeEndpointsRequest);

    /**
     * <p>
     * Add tags to an accelerator resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove tags from a Global Accelerator resource. When you specify a tag key, the action removes both that key and
     * its associated value. The operation succeeds even if you attempt to remove tags from an accelerator that was
     * already removed.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html">Tagging in
     * Global Accelerator</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update an accelerator.
     * </p>
     * <important>
     * <p>
     * Global Accelerator is a global service that supports endpoints in multiple Amazon Web Services Regions but you
     * must specify the US West (Oregon) Region to create, update, or otherwise work with accelerators. That is, for
     * example, specify <code>--region us-west-2</code> on AWS CLI commands.
     * </p>
     * </important>
     * 
     * @param updateAcceleratorRequest
     * @return Result of the UpdateAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UpdateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAcceleratorResult updateAccelerator(UpdateAcceleratorRequest updateAcceleratorRequest);

    /**
     * <p>
     * Update the attributes for an accelerator.
     * </p>
     * 
     * @param updateAcceleratorAttributesRequest
     * @return Result of the UpdateAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.UpdateAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAcceleratorAttributesResult updateAcceleratorAttributes(UpdateAcceleratorAttributesRequest updateAcceleratorAttributesRequest);

    /**
     * <p>
     * Update a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorRequest
     * @return Result of the UpdateCustomRoutingAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UpdateCustomRoutingAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCustomRoutingAcceleratorResult updateCustomRoutingAccelerator(UpdateCustomRoutingAcceleratorRequest updateCustomRoutingAcceleratorRequest);

    /**
     * <p>
     * Update the attributes for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingAcceleratorAttributesRequest
     * @return Result of the UpdateCustomRoutingAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.UpdateCustomRoutingAcceleratorAttributes
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCustomRoutingAcceleratorAttributesResult updateCustomRoutingAcceleratorAttributes(
            UpdateCustomRoutingAcceleratorAttributesRequest updateCustomRoutingAcceleratorAttributesRequest);

    /**
     * <p>
     * Update a listener for a custom routing accelerator.
     * </p>
     * 
     * @param updateCustomRoutingListenerRequest
     * @return Result of the UpdateCustomRoutingListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @sample AWSGlobalAccelerator.UpdateCustomRoutingListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateCustomRoutingListener"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCustomRoutingListenerResult updateCustomRoutingListener(UpdateCustomRoutingListenerRequest updateCustomRoutingListenerRequest);

    /**
     * <p>
     * Update an endpoint group. A resource must be valid and active when you add it as an endpoint.
     * </p>
     * 
     * @param updateEndpointGroupRequest
     * @return Result of the UpdateEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.UpdateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEndpointGroupResult updateEndpointGroup(UpdateEndpointGroupRequest updateEndpointGroupRequest);

    /**
     * <p>
     * Update a listener.
     * </p>
     * 
     * @param updateListenerRequest
     * @return Result of the UpdateListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidPortRangeException
     *         The port numbers that you specified are not valid numbers or are not unique for this accelerator.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an Global Accelerator limit.
     * @sample AWSGlobalAccelerator.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateListener"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateListenerResult updateListener(UpdateListenerRequest updateListenerRequest);

    /**
     * <p>
     * Stops advertising an address range that is provisioned as an address pool. You can perform this operation at most
     * once every 10 seconds, even if you specify different address ranges each time.
     * </p>
     * <p>
     * It can take a few minutes before traffic to the specified addresses stops routing to Amazon Web Services because
     * of propagation delays.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html">Bring your own IP addresses
     * (BYOIP)</a> in the <i>Global Accelerator Developer Guide</i>.
     * </p>
     * 
     * @param withdrawByoipCidrRequest
     * @return Result of the WithdrawByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @throws ByoipCidrNotFoundException
     *         The CIDR that you specified was not found or is incorrect.
     * @throws IncorrectCidrStateException
     *         The CIDR that you specified is not valid for this action. For example, the state of the CIDR might be
     *         incorrect for this action.
     * @sample AWSGlobalAccelerator.WithdrawByoipCidr
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/WithdrawByoipCidr"
     *      target="_top">AWS API Documentation</a>
     */
    WithdrawByoipCidrResult withdrawByoipCidr(WithdrawByoipCidrRequest withdrawByoipCidrRequest);

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
