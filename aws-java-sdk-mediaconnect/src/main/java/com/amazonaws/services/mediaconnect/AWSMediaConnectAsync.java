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
package com.amazonaws.services.mediaconnect;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;

/**
 * Interface for accessing AWS MediaConnect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediaconnect.AbstractAWSMediaConnectAsync} instead.
 * </p>
 * <p>
 * API for AWS Elemental MediaConnect
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaConnectAsync extends AWSMediaConnect {

    /**
     * Adds media streams to an existing flow. After you add a media stream to a flow, you can associate it with a
     * source and/or an output that uses the ST 2110 JPEG XS or CDI protocol.
     * 
     * @param addFlowMediaStreamsRequest
     *        A request to add media streams to the flow.
     * @return A Java Future containing the result of the AddFlowMediaStreams operation returned by the service.
     * @sample AWSMediaConnectAsync.AddFlowMediaStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowMediaStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowMediaStreamsResult> addFlowMediaStreamsAsync(AddFlowMediaStreamsRequest addFlowMediaStreamsRequest);

    /**
     * Adds media streams to an existing flow. After you add a media stream to a flow, you can associate it with a
     * source and/or an output that uses the ST 2110 JPEG XS or CDI protocol.
     * 
     * @param addFlowMediaStreamsRequest
     *        A request to add media streams to the flow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddFlowMediaStreams operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.AddFlowMediaStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowMediaStreams"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowMediaStreamsResult> addFlowMediaStreamsAsync(AddFlowMediaStreamsRequest addFlowMediaStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<AddFlowMediaStreamsRequest, AddFlowMediaStreamsResult> asyncHandler);

    /**
     * Adds outputs to an existing flow. You can create up to 50 outputs per flow.
     * 
     * @param addFlowOutputsRequest
     *        A request to add outputs to the specified flow.
     * @return A Java Future containing the result of the AddFlowOutputs operation returned by the service.
     * @sample AWSMediaConnectAsync.AddFlowOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(AddFlowOutputsRequest addFlowOutputsRequest);

    /**
     * Adds outputs to an existing flow. You can create up to 50 outputs per flow.
     * 
     * @param addFlowOutputsRequest
     *        A request to add outputs to the specified flow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddFlowOutputs operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.AddFlowOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(AddFlowOutputsRequest addFlowOutputsRequest,
            com.amazonaws.handlers.AsyncHandler<AddFlowOutputsRequest, AddFlowOutputsResult> asyncHandler);

    /**
     * Adds Sources to flow
     * 
     * @param addFlowSourcesRequest
     *        A request to add sources to the flow.
     * @return A Java Future containing the result of the AddFlowSources operation returned by the service.
     * @sample AWSMediaConnectAsync.AddFlowSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowSourcesResult> addFlowSourcesAsync(AddFlowSourcesRequest addFlowSourcesRequest);

    /**
     * Adds Sources to flow
     * 
     * @param addFlowSourcesRequest
     *        A request to add sources to the flow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddFlowSources operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.AddFlowSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowSourcesResult> addFlowSourcesAsync(AddFlowSourcesRequest addFlowSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<AddFlowSourcesRequest, AddFlowSourcesResult> asyncHandler);

    /**
     * Adds VPC interfaces to flow
     * 
     * @param addFlowVpcInterfacesRequest
     *        A request to add VPC interfaces to the flow.
     * @return A Java Future containing the result of the AddFlowVpcInterfaces operation returned by the service.
     * @sample AWSMediaConnectAsync.AddFlowVpcInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowVpcInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowVpcInterfacesResult> addFlowVpcInterfacesAsync(AddFlowVpcInterfacesRequest addFlowVpcInterfacesRequest);

    /**
     * Adds VPC interfaces to flow
     * 
     * @param addFlowVpcInterfacesRequest
     *        A request to add VPC interfaces to the flow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddFlowVpcInterfaces operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.AddFlowVpcInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowVpcInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddFlowVpcInterfacesResult> addFlowVpcInterfacesAsync(AddFlowVpcInterfacesRequest addFlowVpcInterfacesRequest,
            com.amazonaws.handlers.AsyncHandler<AddFlowVpcInterfacesRequest, AddFlowVpcInterfacesResult> asyncHandler);

    /**
     * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50)
     * and entitlements (up to 50).
     * 
     * @param createFlowRequest
     *        Creates a new flow. The request must include one source. The request optionally can include outputs (up to
     *        50) and entitlements (up to 50).
     * @return A Java Future containing the result of the CreateFlow operation returned by the service.
     * @sample AWSMediaConnectAsync.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest createFlowRequest);

    /**
     * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50)
     * and entitlements (up to 50).
     * 
     * @param createFlowRequest
     *        Creates a new flow. The request must include one source. The request optionally can include outputs (up to
     *        50) and entitlements (up to 50).
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlow operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest createFlowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowRequest, CreateFlowResult> asyncHandler);

    /**
     * Deletes a flow. Before you can delete a flow, you must stop the flow.
     * 
     * @param deleteFlowRequest
     * @return A Java Future containing the result of the DeleteFlow operation returned by the service.
     * @sample AWSMediaConnectAsync.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest deleteFlowRequest);

    /**
     * Deletes a flow. Before you can delete a flow, you must stop the flow.
     * 
     * @param deleteFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlow operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest deleteFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler);

    /**
     * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as
     * details about the source, outputs, and entitlements.
     * 
     * @param describeFlowRequest
     * @return A Java Future containing the result of the DescribeFlow operation returned by the service.
     * @sample AWSMediaConnectAsync.DescribeFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest describeFlowRequest);

    /**
     * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as
     * details about the source, outputs, and entitlements.
     * 
     * @param describeFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFlow operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.DescribeFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest describeFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFlowRequest, DescribeFlowResult> asyncHandler);

    /**
     * Displays the details of an offering. The response includes the offering description, duration, outbound
     * bandwidth, price, and Amazon Resource Name (ARN).
     * 
     * @param describeOfferingRequest
     * @return A Java Future containing the result of the DescribeOffering operation returned by the service.
     * @sample AWSMediaConnectAsync.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeOffering" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(DescribeOfferingRequest describeOfferingRequest);

    /**
     * Displays the details of an offering. The response includes the offering description, duration, outbound
     * bandwidth, price, and Amazon Resource Name (ARN).
     * 
     * @param describeOfferingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOffering operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeOffering" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(DescribeOfferingRequest describeOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOfferingRequest, DescribeOfferingResult> asyncHandler);

    /**
     * Displays the details of a reservation. The response includes the reservation name, state, start date and time,
     * and the details of the offering that make up the rest of the reservation (such as price, duration, and outbound
     * bandwidth).
     * 
     * @param describeReservationRequest
     * @return A Java Future containing the result of the DescribeReservation operation returned by the service.
     * @sample AWSMediaConnectAsync.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeReservation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(DescribeReservationRequest describeReservationRequest);

    /**
     * Displays the details of a reservation. The response includes the reservation name, state, start date and time,
     * and the details of the offering that make up the rest of the reservation (such as price, duration, and outbound
     * bandwidth).
     * 
     * @param describeReservationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReservation operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeReservation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(DescribeReservationRequest describeReservationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReservationRequest, DescribeReservationResult> asyncHandler);

    /**
     * Grants entitlements to an existing flow.
     * 
     * @param grantFlowEntitlementsRequest
     *        A request to grant entitlements on a flow.
     * @return A Java Future containing the result of the GrantFlowEntitlements operation returned by the service.
     * @sample AWSMediaConnectAsync.GrantFlowEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GrantFlowEntitlements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(GrantFlowEntitlementsRequest grantFlowEntitlementsRequest);

    /**
     * Grants entitlements to an existing flow.
     * 
     * @param grantFlowEntitlementsRequest
     *        A request to grant entitlements on a flow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GrantFlowEntitlements operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.GrantFlowEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GrantFlowEntitlements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(GrantFlowEntitlementsRequest grantFlowEntitlementsRequest,
            com.amazonaws.handlers.AsyncHandler<GrantFlowEntitlementsRequest, GrantFlowEntitlementsResult> asyncHandler);

    /**
     * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per
     * page.
     * 
     * @param listEntitlementsRequest
     * @return A Java Future containing the result of the ListEntitlements operation returned by the service.
     * @sample AWSMediaConnectAsync.ListEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListEntitlements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(ListEntitlementsRequest listEntitlementsRequest);

    /**
     * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per
     * page.
     * 
     * @param listEntitlementsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEntitlements operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.ListEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListEntitlements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(ListEntitlementsRequest listEntitlementsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEntitlementsRequest, ListEntitlementsResult> asyncHandler);

    /**
     * Displays a list of flows that are associated with this account. This request returns a paginated result.
     * 
     * @param listFlowsRequest
     * @return A Java Future containing the result of the ListFlows operation returned by the service.
     * @sample AWSMediaConnectAsync.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest listFlowsRequest);

    /**
     * Displays a list of flows that are associated with this account. This request returns a paginated result.
     * 
     * @param listFlowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFlows operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest listFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFlowsRequest, ListFlowsResult> asyncHandler);

    /**
     * Displays a list of all offerings that are available to this account in the current AWS Region. If you have an
     * active reservation (which means you've purchased an offering that has already started and hasn't expired yet),
     * your account isn't eligible for other offerings.
     * 
     * @param listOfferingsRequest
     * @return A Java Future containing the result of the ListOfferings operation returned by the service.
     * @sample AWSMediaConnectAsync.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest listOfferingsRequest);

    /**
     * Displays a list of all offerings that are available to this account in the current AWS Region. If you have an
     * active reservation (which means you've purchased an offering that has already started and hasn't expired yet),
     * your account isn't eligible for other offerings.
     * 
     * @param listOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOfferings operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest listOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler);

    /**
     * Displays a list of all reservations that have been purchased by this account in the current AWS Region. This list
     * includes all reservations in all states (such as active and expired).
     * 
     * @param listReservationsRequest
     * @return A Java Future containing the result of the ListReservations operation returned by the service.
     * @sample AWSMediaConnectAsync.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListReservations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(ListReservationsRequest listReservationsRequest);

    /**
     * Displays a list of all reservations that have been purchased by this account in the current AWS Region. This list
     * includes all reservations in all states (such as active and expired).
     * 
     * @param listReservationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReservations operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListReservations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(ListReservationsRequest listReservationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReservationsRequest, ListReservationsResult> asyncHandler);

    /**
     * List all tags on an AWS Elemental MediaConnect resource
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaConnectAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * List all tags on an AWS Elemental MediaConnect resource
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * Submits a request to purchase an offering. If you already have an active reservation, you can't purchase another
     * offering.
     * 
     * @param purchaseOfferingRequest
     *        A request to purchase a offering.
     * @return A Java Future containing the result of the PurchaseOffering operation returned by the service.
     * @sample AWSMediaConnectAsync.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest purchaseOfferingRequest);

    /**
     * Submits a request to purchase an offering. If you already have an active reservation, you can't purchase another
     * offering.
     * 
     * @param purchaseOfferingRequest
     *        A request to purchase a offering.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseOffering operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest purchaseOfferingRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler);

    /**
     * Removes a media stream from a flow. This action is only available if the media stream is not associated with a
     * source or output.
     * 
     * @param removeFlowMediaStreamRequest
     * @return A Java Future containing the result of the RemoveFlowMediaStream operation returned by the service.
     * @sample AWSMediaConnectAsync.RemoveFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowMediaStreamResult> removeFlowMediaStreamAsync(RemoveFlowMediaStreamRequest removeFlowMediaStreamRequest);

    /**
     * Removes a media stream from a flow. This action is only available if the media stream is not associated with a
     * source or output.
     * 
     * @param removeFlowMediaStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveFlowMediaStream operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.RemoveFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowMediaStreamResult> removeFlowMediaStreamAsync(RemoveFlowMediaStreamRequest removeFlowMediaStreamRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveFlowMediaStreamRequest, RemoveFlowMediaStreamResult> asyncHandler);

    /**
     * Removes an output from an existing flow. This request can be made only on an output that does not have an
     * entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When
     * an entitlement is revoked from a flow, the service automatically removes the associated output.
     * 
     * @param removeFlowOutputRequest
     * @return A Java Future containing the result of the RemoveFlowOutput operation returned by the service.
     * @sample AWSMediaConnectAsync.RemoveFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(RemoveFlowOutputRequest removeFlowOutputRequest);

    /**
     * Removes an output from an existing flow. This request can be made only on an output that does not have an
     * entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When
     * an entitlement is revoked from a flow, the service automatically removes the associated output.
     * 
     * @param removeFlowOutputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveFlowOutput operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.RemoveFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(RemoveFlowOutputRequest removeFlowOutputRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveFlowOutputRequest, RemoveFlowOutputResult> asyncHandler);

    /**
     * Removes a source from an existing flow. This request can be made only if there is more than one source on the
     * flow.
     * 
     * @param removeFlowSourceRequest
     * @return A Java Future containing the result of the RemoveFlowSource operation returned by the service.
     * @sample AWSMediaConnectAsync.RemoveFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowSourceResult> removeFlowSourceAsync(RemoveFlowSourceRequest removeFlowSourceRequest);

    /**
     * Removes a source from an existing flow. This request can be made only if there is more than one source on the
     * flow.
     * 
     * @param removeFlowSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveFlowSource operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.RemoveFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowSourceResult> removeFlowSourceAsync(RemoveFlowSourceRequest removeFlowSourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveFlowSourceRequest, RemoveFlowSourceResult> asyncHandler);

    /**
     * Removes a VPC Interface from an existing flow. This request can be made only on a VPC interface that does not
     * have a Source or Output associated with it. If the VPC interface is referenced by a Source or Output, you must
     * first delete or update the Source or Output to no longer reference the VPC interface.
     * 
     * @param removeFlowVpcInterfaceRequest
     * @return A Java Future containing the result of the RemoveFlowVpcInterface operation returned by the service.
     * @sample AWSMediaConnectAsync.RemoveFlowVpcInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowVpcInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowVpcInterfaceResult> removeFlowVpcInterfaceAsync(RemoveFlowVpcInterfaceRequest removeFlowVpcInterfaceRequest);

    /**
     * Removes a VPC Interface from an existing flow. This request can be made only on a VPC interface that does not
     * have a Source or Output associated with it. If the VPC interface is referenced by a Source or Output, you must
     * first delete or update the Source or Output to no longer reference the VPC interface.
     * 
     * @param removeFlowVpcInterfaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveFlowVpcInterface operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.RemoveFlowVpcInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowVpcInterface"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveFlowVpcInterfaceResult> removeFlowVpcInterfaceAsync(RemoveFlowVpcInterfaceRequest removeFlowVpcInterfaceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveFlowVpcInterfaceRequest, RemoveFlowVpcInterfaceResult> asyncHandler);

    /**
     * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the
     * subscriber and the associated output is removed.
     * 
     * @param revokeFlowEntitlementRequest
     * @return A Java Future containing the result of the RevokeFlowEntitlement operation returned by the service.
     * @sample AWSMediaConnectAsync.RevokeFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RevokeFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(RevokeFlowEntitlementRequest revokeFlowEntitlementRequest);

    /**
     * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the
     * subscriber and the associated output is removed.
     * 
     * @param revokeFlowEntitlementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokeFlowEntitlement operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.RevokeFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RevokeFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(RevokeFlowEntitlementRequest revokeFlowEntitlementRequest,
            com.amazonaws.handlers.AsyncHandler<RevokeFlowEntitlementRequest, RevokeFlowEntitlementResult> asyncHandler);

    /**
     * Starts a flow.
     * 
     * @param startFlowRequest
     * @return A Java Future containing the result of the StartFlow operation returned by the service.
     * @sample AWSMediaConnectAsync.StartFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StartFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest startFlowRequest);

    /**
     * Starts a flow.
     * 
     * @param startFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFlow operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.StartFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StartFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest startFlowRequest,
            com.amazonaws.handlers.AsyncHandler<StartFlowRequest, StartFlowResult> asyncHandler);

    /**
     * Stops a flow.
     * 
     * @param stopFlowRequest
     * @return A Java Future containing the result of the StopFlow operation returned by the service.
     * @sample AWSMediaConnectAsync.StopFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StopFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest stopFlowRequest);

    /**
     * Stops a flow.
     * 
     * @param stopFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopFlow operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.StopFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StopFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest stopFlowRequest,
            com.amazonaws.handlers.AsyncHandler<StopFlowRequest, StopFlowResult> asyncHandler);

    /**
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * 
     * @param tagResourceRequest
     *        The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaConnectAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * 
     * @param tagResourceRequest
     *        The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * Deletes specified tags from a resource.
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaConnectAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * Deletes specified tags from a resource.
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * Updates flow
     * 
     * @param updateFlowRequest
     *        A request to update flow.
     * @return A Java Future containing the result of the UpdateFlow operation returned by the service.
     * @sample AWSMediaConnectAsync.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest updateFlowRequest);

    /**
     * Updates flow
     * 
     * @param updateFlowRequest
     *        A request to update flow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlow operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest updateFlowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowRequest, UpdateFlowResult> asyncHandler);

    /**
     * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the
     * service will remove the outputs that are are used by the subscribers that are removed.
     * 
     * @param updateFlowEntitlementRequest
     *        The entitlement fields that you want to update.
     * @return A Java Future containing the result of the UpdateFlowEntitlement operation returned by the service.
     * @sample AWSMediaConnectAsync.UpdateFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(UpdateFlowEntitlementRequest updateFlowEntitlementRequest);

    /**
     * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the
     * service will remove the outputs that are are used by the subscribers that are removed.
     * 
     * @param updateFlowEntitlementRequest
     *        The entitlement fields that you want to update.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlowEntitlement operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.UpdateFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(UpdateFlowEntitlementRequest updateFlowEntitlementRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowEntitlementRequest, UpdateFlowEntitlementResult> asyncHandler);

    /**
     * Updates an existing media stream.
     * 
     * @param updateFlowMediaStreamRequest
     *        The fields that you want to update in the media stream.
     * @return A Java Future containing the result of the UpdateFlowMediaStream operation returned by the service.
     * @sample AWSMediaConnectAsync.UpdateFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowMediaStreamResult> updateFlowMediaStreamAsync(UpdateFlowMediaStreamRequest updateFlowMediaStreamRequest);

    /**
     * Updates an existing media stream.
     * 
     * @param updateFlowMediaStreamRequest
     *        The fields that you want to update in the media stream.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlowMediaStream operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.UpdateFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowMediaStreamResult> updateFlowMediaStreamAsync(UpdateFlowMediaStreamRequest updateFlowMediaStreamRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowMediaStreamRequest, UpdateFlowMediaStreamResult> asyncHandler);

    /**
     * Updates an existing flow output.
     * 
     * @param updateFlowOutputRequest
     *        The fields that you want to update in the output.
     * @return A Java Future containing the result of the UpdateFlowOutput operation returned by the service.
     * @sample AWSMediaConnectAsync.UpdateFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(UpdateFlowOutputRequest updateFlowOutputRequest);

    /**
     * Updates an existing flow output.
     * 
     * @param updateFlowOutputRequest
     *        The fields that you want to update in the output.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlowOutput operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.UpdateFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(UpdateFlowOutputRequest updateFlowOutputRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowOutputRequest, UpdateFlowOutputResult> asyncHandler);

    /**
     * Updates the source of a flow.
     * 
     * @param updateFlowSourceRequest
     *        A request to update the source of a flow.
     * @return A Java Future containing the result of the UpdateFlowSource operation returned by the service.
     * @sample AWSMediaConnectAsync.UpdateFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(UpdateFlowSourceRequest updateFlowSourceRequest);

    /**
     * Updates the source of a flow.
     * 
     * @param updateFlowSourceRequest
     *        A request to update the source of a flow.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlowSource operation returned by the service.
     * @sample AWSMediaConnectAsyncHandler.UpdateFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(UpdateFlowSourceRequest updateFlowSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowSourceRequest, UpdateFlowSourceResult> asyncHandler);

}
