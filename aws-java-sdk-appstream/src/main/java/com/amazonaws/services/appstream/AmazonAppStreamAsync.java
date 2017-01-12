/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;

/**
 * Interface for accessing Amazon AppStream asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appstream.AbstractAmazonAppStreamAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon AppStream 2.0</fullname>
 * <p>
 * API documentation for Amazon AppStream 2.0.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppStreamAsync extends AmazonAppStream {

    /**
     * <p>
     * Associate a fleet to a stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @return A Java Future containing the result of the AssociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(AssociateFleetRequest associateFleetRequest);

    /**
     * <p>
     * Associate a fleet to a stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateFleetResult> associateFleetAsync(AssociateFleetRequest associateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateFleetRequest, AssociateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a new fleet.
     * </p>
     * 
     * @param createFleetRequest
     *        Contains the parameters for the new fleet to create.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a new fleet.
     * </p>
     * 
     * @param createFleetRequest
     *        Contains the parameters for the new fleet to create.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Create a new stack.
     * </p>
     * 
     * @param createStackRequest
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Create a new stack.
     * </p>
     * 
     * @param createStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler);

    /**
     * <p>
     * Creates a URL to start an AppStream 2.0 streaming session for a user. By default, the URL is valid only for 1
     * minute from the time that it is generated.
     * </p>
     * 
     * @param createStreamingURLRequest
     * @return A Java Future containing the result of the CreateStreamingURL operation returned by the service.
     * @sample AmazonAppStreamAsync.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(CreateStreamingURLRequest createStreamingURLRequest);

    /**
     * <p>
     * Creates a URL to start an AppStream 2.0 streaming session for a user. By default, the URL is valid only for 1
     * minute from the time that it is generated.
     * </p>
     * 
     * @param createStreamingURLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamingURL operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamingURLResult> createStreamingURLAsync(CreateStreamingURLRequest createStreamingURLRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamingURLRequest, CreateStreamingURLResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes the stack. After this operation completes, the environment can no longer be activated, and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AmazonAppStreamAsync.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes the stack. After this operation completes, the environment can no longer be activated, and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler);

    /**
     * <p>
     * If fleet names are provided, this operation describes the specified fleets; otherwise, all the fleets in the
     * account are described.
     * </p>
     * 
     * @param describeFleetsRequest
     * @return A Java Future containing the result of the DescribeFleets operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest describeFleetsRequest);

    /**
     * <p>
     * If fleet names are provided, this operation describes the specified fleets; otherwise, all the fleets in the
     * account are described.
     * </p>
     * 
     * @param describeFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleets operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetsResult> describeFleetsAsync(DescribeFleetsRequest describeFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetsRequest, DescribeFleetsResult> asyncHandler);

    /**
     * <p>
     * Describes the images. If a list of names is not provided, all images in your account are returned. This operation
     * does not return a paginated result.
     * </p>
     * 
     * @param describeImagesRequest
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest);

    /**
     * <p>
     * Describes the images. If a list of names is not provided, all images in your account are returned. This operation
     * does not return a paginated result.
     * </p>
     * 
     * @param describeImagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImages operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler);

    /**
     * <p>
     * Describes the streaming sessions for a stack and a fleet. If a user ID is provided, this operation returns
     * streaming sessions for only that user. Pass this value for the <code>nextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return A Java Future containing the result of the DescribeSessions operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * Describes the streaming sessions for a stack and a fleet. If a user ID is provided, this operation returns
     * streaming sessions for only that user. Pass this value for the <code>nextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items.
     * </p>
     * 
     * @param describeSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSessions operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSessionsResult> describeSessionsAsync(DescribeSessionsRequest describeSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSessionsRequest, DescribeSessionsResult> asyncHandler);

    /**
     * <p>
     * If stack names are not provided, this operation describes the specified stacks; otherwise, all stacks in the
     * account are described. Pass the <code>nextToken</code> value in a subsequent call to this operation to retrieve
     * the next set of items.
     * </p>
     * 
     * @param describeStacksRequest
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AmazonAppStreamAsync.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * If stack names are not provided, this operation describes the specified stacks; otherwise, all stacks in the
     * account are described. Pass the <code>nextToken</code> value in a subsequent call to this operation to retrieve
     * the next set of items.
     * </p>
     * 
     * @param describeStacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler);

    /**
     * <p>
     * Disassociates a fleet from a stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @return A Java Future containing the result of the DisassociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(DisassociateFleetRequest disassociateFleetRequest);

    /**
     * <p>
     * Disassociates a fleet from a stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFleetResult> disassociateFleetAsync(DisassociateFleetRequest disassociateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFleetRequest, DisassociateFleetResult> asyncHandler);

    /**
     * <p>
     * This operation immediately stops a streaming session.
     * </p>
     * 
     * @param expireSessionRequest
     * @return A Java Future containing the result of the ExpireSession operation returned by the service.
     * @sample AmazonAppStreamAsync.ExpireSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ExpireSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(ExpireSessionRequest expireSessionRequest);

    /**
     * <p>
     * This operation immediately stops a streaming session.
     * </p>
     * 
     * @param expireSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExpireSession operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.ExpireSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ExpireSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExpireSessionResult> expireSessionAsync(ExpireSessionRequest expireSessionRequest,
            com.amazonaws.handlers.AsyncHandler<ExpireSessionRequest, ExpireSessionResult> asyncHandler);

    /**
     * <p>
     * Lists all fleets associated with the stack.
     * </p>
     * 
     * @param listAssociatedFleetsRequest
     * @return A Java Future containing the result of the ListAssociatedFleets operation returned by the service.
     * @sample AmazonAppStreamAsync.ListAssociatedFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedFleets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(ListAssociatedFleetsRequest listAssociatedFleetsRequest);

    /**
     * <p>
     * Lists all fleets associated with the stack.
     * </p>
     * 
     * @param listAssociatedFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedFleets operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.ListAssociatedFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedFleets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedFleetsResult> listAssociatedFleetsAsync(ListAssociatedFleetsRequest listAssociatedFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedFleetsRequest, ListAssociatedFleetsResult> asyncHandler);

    /**
     * <p>
     * Lists all stacks to which the specified fleet is associated.
     * </p>
     * 
     * @param listAssociatedStacksRequest
     * @return A Java Future containing the result of the ListAssociatedStacks operation returned by the service.
     * @sample AmazonAppStreamAsync.ListAssociatedStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedStacks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(ListAssociatedStacksRequest listAssociatedStacksRequest);

    /**
     * <p>
     * Lists all stacks to which the specified fleet is associated.
     * </p>
     * 
     * @param listAssociatedStacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssociatedStacks operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.ListAssociatedStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedStacks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAssociatedStacksResult> listAssociatedStacksAsync(ListAssociatedStacksRequest listAssociatedStacksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssociatedStacksRequest, ListAssociatedStacksResult> asyncHandler);

    /**
     * <p>
     * Starts a fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @return A Java Future containing the result of the StartFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFleetResult> startFleetAsync(StartFleetRequest startFleetRequest);

    /**
     * <p>
     * Starts a fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFleetResult> startFleetAsync(StartFleetRequest startFleetRequest,
            com.amazonaws.handlers.AsyncHandler<StartFleetRequest, StartFleetResult> asyncHandler);

    /**
     * <p>
     * Stops a fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @return A Java Future containing the result of the StopFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFleetResult> stopFleetAsync(StopFleetRequest stopFleetRequest);

    /**
     * <p>
     * Stops a fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFleetResult> stopFleetAsync(StopFleetRequest stopFleetRequest,
            com.amazonaws.handlers.AsyncHandler<StopFleetRequest, StopFleetResult> asyncHandler);

    /**
     * <p>
     * Updates an existing fleet. All the attributes except the fleet name can be updated in the <b>STOPPED</b> state.
     * Only <b>ComputeCapacity</b> and <b>ImageName</b> can be updated in any other state.
     * </p>
     * 
     * @param updateFleetRequest
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AmazonAppStreamAsync.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates an existing fleet. All the attributes except the fleet name can be updated in the <b>STOPPED</b> state.
     * Only <b>ComputeCapacity</b> and <b>ImageName</b> can be updated in any other state.
     * </p>
     * 
     * @param updateFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleet operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetResult> updateFleetAsync(UpdateFleetRequest updateFleetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetRequest, UpdateFleetResult> asyncHandler);

    /**
     * <p>
     * Updates the specified fields in the stack with the specified name.
     * </p>
     * 
     * @param updateStackRequest
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AmazonAppStreamAsync.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest);

    /**
     * <p>
     * Updates the specified fields in the stack with the specified name.
     * </p>
     * 
     * @param updateStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AmazonAppStreamAsyncHandler.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler);

}
