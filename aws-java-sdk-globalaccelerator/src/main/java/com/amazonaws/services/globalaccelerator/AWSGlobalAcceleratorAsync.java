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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGlobalAcceleratorAsync extends AWSGlobalAccelerator {

    /**
     * <p>
     * Create an accelerator. An accelerator includes one or more listeners that process inbound connections and direct
     * traffic to one or more endpoint groups, each of which includes endpoints, such as Network Load Balancers. To see
     * an AWS CLI example of creating an accelerator, scroll down to <b>Example</b>.
     * </p>
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
     * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent
     * resources (listeners and endpoint groups).
     * </p>
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
     * Delete an accelerator. Note: before you can delete an accelerator, you must disable it and remove all dependent
     * resources (listeners and endpoint groups).
     * </p>
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
     * Update an accelerator.
     * </p>
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

}
