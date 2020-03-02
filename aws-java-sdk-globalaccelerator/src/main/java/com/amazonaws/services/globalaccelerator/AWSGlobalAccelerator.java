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
     * @return Result of the AdvertiseByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
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
     * @return Result of the CreateAccelerator operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @sample AWSGlobalAccelerator.CreateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CreateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAcceleratorResult createAccelerator(CreateAcceleratorRequest createAcceleratorRequest);

    /**
     * <p>
     * Create an endpoint group for the specified listener. An endpoint group is a collection of endpoints in one AWS
     * Region. To see an AWS CLI example of creating an endpoint group, scroll down to <b>Example</b>.
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
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
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
     * static IP addresses on a port, port range, or list of port ranges that you specify. To see an AWS CLI example of
     * creating a listener, scroll down to <b>Example</b>.
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
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
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
     * href="https://docs.aws.amazon.com/global-accelerator/latest/dg/auth-and-access-control.html">Authentication and
     * Access Control</a> in the <i>AWS Global Accelerator Developer Guide</i>.
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
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DeleteAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAcceleratorResult deleteAccelerator(DeleteAcceleratorRequest deleteAcceleratorRequest);

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
     *         There was an internal error for AWS Global Accelerator.
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
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DeleteListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DeleteListener"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteListenerResult deleteListener(DeleteListenerRequest deleteListenerRequest);

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
     * @return Result of the DeprovisionByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
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
     * Describe an accelerator. To see an AWS CLI example of describing an accelerator, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeAcceleratorRequest
     * @return Result of the DescribeAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAcceleratorResult describeAccelerator(DescribeAcceleratorRequest describeAcceleratorRequest);

    /**
     * <p>
     * Describe the attributes of an accelerator. To see an AWS CLI example of describing the attributes of an
     * accelerator, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeAcceleratorAttributesRequest
     * @return Result of the DescribeAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.DescribeAcceleratorAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeAcceleratorAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAcceleratorAttributesResult describeAcceleratorAttributes(DescribeAcceleratorAttributesRequest describeAcceleratorAttributesRequest);

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
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEndpointGroupResult describeEndpointGroup(DescribeEndpointGroupRequest describeEndpointGroupRequest);

    /**
     * <p>
     * Describe a listener. To see an AWS CLI example of describing a listener, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param describeListenerRequest
     * @return Result of the DescribeListener operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws ListenerNotFoundException
     *         The listener that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.DescribeListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/DescribeListener"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeListenerResult describeListener(DescribeListenerRequest describeListenerRequest);

    /**
     * <p>
     * List the accelerators for an AWS account. To see an AWS CLI example of listing the accelerators for an AWS
     * account, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param listAcceleratorsRequest
     * @return Result of the ListAccelerators operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws InvalidNextTokenException
     *         There isn't another item to return.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    ListAcceleratorsResult listAccelerators(ListAcceleratorsRequest listAcceleratorsRequest);

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
     * @return Result of the ListByoipCidrs operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
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
     * List the endpoint groups that are associated with a listener. To see an AWS CLI example of listing the endpoint
     * groups for listener, scroll down to <b>Example</b>.
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
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListEndpointGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListEndpointGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListEndpointGroupsResult listEndpointGroups(ListEndpointGroupsRequest listEndpointGroupsRequest);

    /**
     * <p>
     * List the listeners for an accelerator. To see an AWS CLI example of listing the listeners for an accelerator,
     * scroll down to <b>Example</b>.
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
     *         There was an internal error for AWS Global Accelerator.
     * @sample AWSGlobalAccelerator.ListListeners
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListListeners"
     *      target="_top">AWS API Documentation</a>
     */
    ListListenersResult listListeners(ListListenersRequest listListenersRequest);

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
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the ProvisionByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
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
     * @return Result of the TagResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
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
     * @return Result of the UntagResource operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateAccelerator operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @sample AWSGlobalAccelerator.UpdateAccelerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateAccelerator"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAcceleratorResult updateAccelerator(UpdateAcceleratorRequest updateAcceleratorRequest);

    /**
     * <p>
     * Update the attributes for an accelerator. To see an AWS CLI example of updating an accelerator to enable flow
     * logs, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateAcceleratorAttributesRequest
     * @return Result of the UpdateAcceleratorAttributes operation returned by the service.
     * @throws AcceleratorNotFoundException
     *         The accelerator that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
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
     * Update an endpoint group. To see an AWS CLI example of updating an endpoint group, scroll down to <b>Example</b>.
     * </p>
     * 
     * @param updateEndpointGroupRequest
     * @return Result of the UpdateEndpointGroup operation returned by the service.
     * @throws InvalidArgumentException
     *         An argument that you specified is invalid.
     * @throws EndpointGroupNotFoundException
     *         The endpoint group that you specified doesn't exist.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @throws AccessDeniedException
     *         You don't have access permission.
     * @sample AWSGlobalAccelerator.UpdateEndpointGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateEndpointGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEndpointGroupResult updateEndpointGroup(UpdateEndpointGroupRequest updateEndpointGroupRequest);

    /**
     * <p>
     * Update a listener. To see an AWS CLI example of updating listener, scroll down to <b>Example</b>.
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
     *         There was an internal error for AWS Global Accelerator.
     * @throws LimitExceededException
     *         Processing your request would cause you to exceed an AWS Global Accelerator limit.
     * @sample AWSGlobalAccelerator.UpdateListener
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateListener"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateListenerResult updateListener(UpdateListenerRequest updateListenerRequest);

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
     * @return Result of the WithdrawByoipCidr operation returned by the service.
     * @throws InternalServiceErrorException
     *         There was an internal error for AWS Global Accelerator.
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
