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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.services.mediaconnect.waiters.AWSMediaConnectWaiters;

/**
 * Interface for accessing AWS MediaConnect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediaconnect.AbstractAWSMediaConnect} instead.
 * </p>
 * <p>
 * API for AWS Elemental MediaConnect
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mediaconnect";

    /**
     * Adds media streams to an existing flow. After you add a media stream to a flow, you can associate it with a
     * source and/or an output that uses the ST 2110 JPEG XS or CDI protocol.
     * 
     * @param addFlowMediaStreamsRequest
     *        A request to add media streams to the flow.
     * @return Result of the AddFlowMediaStreams operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowMediaStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowMediaStreams"
     *      target="_top">AWS API Documentation</a>
     */
    AddFlowMediaStreamsResult addFlowMediaStreams(AddFlowMediaStreamsRequest addFlowMediaStreamsRequest);

    /**
     * Adds outputs to an existing flow. You can create up to 50 outputs per flow.
     * 
     * @param addFlowOutputsRequest
     *        A request to add outputs to the specified flow.
     * @return Result of the AddFlowOutputs operation returned by the service.
     * @throws AddFlowOutputs420Exception
     *         AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number
     *         of allowed outputs (50). For more information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowOutputs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowOutputs" target="_top">AWS
     *      API Documentation</a>
     */
    AddFlowOutputsResult addFlowOutputs(AddFlowOutputsRequest addFlowOutputsRequest);

    /**
     * Adds Sources to flow
     * 
     * @param addFlowSourcesRequest
     *        A request to add sources to the flow.
     * @return Result of the AddFlowSources operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowSources" target="_top">AWS
     *      API Documentation</a>
     */
    AddFlowSourcesResult addFlowSources(AddFlowSourcesRequest addFlowSourcesRequest);

    /**
     * Adds VPC interfaces to flow
     * 
     * @param addFlowVpcInterfacesRequest
     *        A request to add VPC interfaces to the flow.
     * @return Result of the AddFlowVpcInterfaces operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.AddFlowVpcInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddFlowVpcInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    AddFlowVpcInterfacesResult addFlowVpcInterfaces(AddFlowVpcInterfacesRequest addFlowVpcInterfacesRequest);

    /**
     * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50)
     * and entitlements (up to 50).
     * 
     * @param createFlowRequest
     *        Creates a new flow. The request must include one source. The request optionally can include outputs (up to
     *        50) and entitlements (up to 50).
     * @return Result of the CreateFlow operation returned by the service.
     * @throws CreateFlow420Exception
     *         Your account already contains the maximum number of 20 flows per account, per Region. For more
     *         information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.CreateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFlowResult createFlow(CreateFlowRequest createFlowRequest);

    /**
     * Deletes a flow. Before you can delete a flow, you must stop the flow.
     * 
     * @param deleteFlowRequest
     * @return Result of the DeleteFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.DeleteFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeleteFlow" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFlowResult deleteFlow(DeleteFlowRequest deleteFlowRequest);

    /**
     * Displays the details of a flow. The response includes the flow ARN, name, and Availability Zone, as well as
     * details about the source, outputs, and entitlements.
     * 
     * @param describeFlowRequest
     * @return Result of the DescribeFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.DescribeFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeFlow" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFlowResult describeFlow(DescribeFlowRequest describeFlowRequest);

    /**
     * Displays the details of an offering. The response includes the offering description, duration, outbound
     * bandwidth, price, and Amazon Resource Name (ARN).
     * 
     * @param describeOfferingRequest
     * @return Result of the DescribeOffering operation returned by the service.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.DescribeOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeOffering" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeOfferingResult describeOffering(DescribeOfferingRequest describeOfferingRequest);

    /**
     * Displays the details of a reservation. The response includes the reservation name, state, start date and time,
     * and the details of the offering that make up the rest of the reservation (such as price, duration, and outbound
     * bandwidth).
     * 
     * @param describeReservationRequest
     * @return Result of the DescribeReservation operation returned by the service.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.DescribeReservation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeReservation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReservationResult describeReservation(DescribeReservationRequest describeReservationRequest);

    /**
     * Grants entitlements to an existing flow.
     * 
     * @param grantFlowEntitlementsRequest
     *        A request to grant entitlements on a flow.
     * @return Result of the GrantFlowEntitlements operation returned by the service.
     * @throws GrantFlowEntitlements420Exception
     *         AWS Elemental MediaConnect can't complete this request because this flow already has the maximum number
     *         of allowed entitlements (50). For more information, contact AWS Customer Support.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.GrantFlowEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GrantFlowEntitlements"
     *      target="_top">AWS API Documentation</a>
     */
    GrantFlowEntitlementsResult grantFlowEntitlements(GrantFlowEntitlementsRequest grantFlowEntitlementsRequest);

    /**
     * Displays a list of all entitlements that have been granted to this account. This request returns 20 results per
     * page.
     * 
     * @param listEntitlementsRequest
     * @return Result of the ListEntitlements operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListEntitlements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListEntitlements" target="_top">AWS
     *      API Documentation</a>
     */
    ListEntitlementsResult listEntitlements(ListEntitlementsRequest listEntitlementsRequest);

    /**
     * Displays a list of flows that are associated with this account. This request returns a paginated result.
     * 
     * @param listFlowsRequest
     * @return Result of the ListFlows operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListFlows" target="_top">AWS API
     *      Documentation</a>
     */
    ListFlowsResult listFlows(ListFlowsRequest listFlowsRequest);

    /**
     * Displays a list of all offerings that are available to this account in the current AWS Region. If you have an
     * active reservation (which means you've purchased an offering that has already started and hasn't expired yet),
     * your account isn't eligible for other offerings.
     * 
     * @param listOfferingsRequest
     * @return Result of the ListOfferings operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListOfferings" target="_top">AWS API
     *      Documentation</a>
     */
    ListOfferingsResult listOfferings(ListOfferingsRequest listOfferingsRequest);

    /**
     * Displays a list of all reservations that have been purchased by this account in the current AWS Region. This list
     * includes all reservations in all states (such as active and expired).
     * 
     * @param listReservationsRequest
     * @return Result of the ListReservations operation returned by the service.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @sample AWSMediaConnect.ListReservations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListReservations" target="_top">AWS
     *      API Documentation</a>
     */
    ListReservationsResult listReservations(ListReservationsRequest listReservationsRequest);

    /**
     * List all tags on an AWS Elemental MediaConnect resource
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         The requested resource was not found
     * @throws BadRequestException
     *         The client performed an invalid request
     * @throws InternalServerErrorException
     *         Internal service error
     * @sample AWSMediaConnect.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Submits a request to purchase an offering. If you already have an active reservation, you can't purchase another
     * offering.
     * 
     * @param purchaseOfferingRequest
     *        A request to purchase a offering.
     * @return Result of the PurchaseOffering operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.PurchaseOffering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/PurchaseOffering" target="_top">AWS
     *      API Documentation</a>
     */
    PurchaseOfferingResult purchaseOffering(PurchaseOfferingRequest purchaseOfferingRequest);

    /**
     * Removes a media stream from a flow. This action is only available if the media stream is not associated with a
     * source or output.
     * 
     * @param removeFlowMediaStreamRequest
     * @return Result of the RemoveFlowMediaStream operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveFlowMediaStreamResult removeFlowMediaStream(RemoveFlowMediaStreamRequest removeFlowMediaStreamRequest);

    /**
     * Removes an output from an existing flow. This request can be made only on an output that does not have an
     * entitlement associated with it. If the output has an entitlement, you must revoke the entitlement instead. When
     * an entitlement is revoked from a flow, the service automatically removes the associated output.
     * 
     * @param removeFlowOutputRequest
     * @return Result of the RemoveFlowOutput operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveFlowOutputResult removeFlowOutput(RemoveFlowOutputRequest removeFlowOutputRequest);

    /**
     * Removes a source from an existing flow. This request can be made only if there is more than one source on the
     * flow.
     * 
     * @param removeFlowSourceRequest
     * @return Result of the RemoveFlowSource operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveFlowSourceResult removeFlowSource(RemoveFlowSourceRequest removeFlowSourceRequest);

    /**
     * Removes a VPC Interface from an existing flow. This request can be made only on a VPC interface that does not
     * have a Source or Output associated with it. If the VPC interface is referenced by a Source or Output, you must
     * first delete or update the Source or Output to no longer reference the VPC interface.
     * 
     * @param removeFlowVpcInterfaceRequest
     * @return Result of the RemoveFlowVpcInterface operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RemoveFlowVpcInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowVpcInterface"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveFlowVpcInterfaceResult removeFlowVpcInterface(RemoveFlowVpcInterfaceRequest removeFlowVpcInterfaceRequest);

    /**
     * Revokes an entitlement from a flow. Once an entitlement is revoked, the content becomes unavailable to the
     * subscriber and the associated output is removed.
     * 
     * @param revokeFlowEntitlementRequest
     * @return Result of the RevokeFlowEntitlement operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.RevokeFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RevokeFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    RevokeFlowEntitlementResult revokeFlowEntitlement(RevokeFlowEntitlementRequest revokeFlowEntitlementRequest);

    /**
     * Starts a flow.
     * 
     * @param startFlowRequest
     * @return Result of the StartFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.StartFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StartFlow" target="_top">AWS API
     *      Documentation</a>
     */
    StartFlowResult startFlow(StartFlowRequest startFlowRequest);

    /**
     * Stops a flow.
     * 
     * @param stopFlowRequest
     * @return Result of the StopFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.StopFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/StopFlow" target="_top">AWS API
     *      Documentation</a>
     */
    StopFlowResult stopFlow(StopFlowRequest stopFlowRequest);

    /**
     * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are
     * not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated
     * with that resource are deleted as well.
     * 
     * @param tagResourceRequest
     *        The tags to add to the resource. A tag is an array of key-value pairs. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The requested resource was not found
     * @throws BadRequestException
     *         The client performed an invalid request
     * @throws InternalServerErrorException
     *         Internal service error
     * @sample AWSMediaConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * Deletes specified tags from a resource.
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The requested resource was not found
     * @throws BadRequestException
     *         The client performed an invalid request
     * @throws InternalServerErrorException
     *         Internal service error
     * @sample AWSMediaConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Updates flow
     * 
     * @param updateFlowRequest
     *        A request to update flow.
     * @return Result of the UpdateFlow operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlow" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFlowResult updateFlow(UpdateFlowRequest updateFlowRequest);

    /**
     * You can change an entitlement's description, subscribers, and encryption. If you change the subscribers, the
     * service will remove the outputs that are are used by the subscribers that are removed.
     * 
     * @param updateFlowEntitlementRequest
     *        The entitlement fields that you want to update.
     * @return Result of the UpdateFlowEntitlement operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowEntitlement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowEntitlement"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFlowEntitlementResult updateFlowEntitlement(UpdateFlowEntitlementRequest updateFlowEntitlementRequest);

    /**
     * Updates an existing media stream.
     * 
     * @param updateFlowMediaStreamRequest
     *        The fields that you want to update in the media stream.
     * @return Result of the UpdateFlowMediaStream operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowMediaStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowMediaStream"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFlowMediaStreamResult updateFlowMediaStream(UpdateFlowMediaStreamRequest updateFlowMediaStreamRequest);

    /**
     * Updates an existing flow output.
     * 
     * @param updateFlowOutputRequest
     *        The fields that you want to update in the output.
     * @return Result of the UpdateFlowOutput operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowOutput" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFlowOutputResult updateFlowOutput(UpdateFlowOutputRequest updateFlowOutputRequest);

    /**
     * Updates the source of a flow.
     * 
     * @param updateFlowSourceRequest
     *        A request to update the source of a flow.
     * @return Result of the UpdateFlowSource operation returned by the service.
     * @throws BadRequestException
     *         The request that you submitted is not valid.
     * @throws InternalServerErrorException
     *         AWS Elemental MediaConnect can't fulfill your request because it encountered an unexpected condition.
     * @throws ForbiddenException
     *         You don't have the required permissions to perform this operation.
     * @throws NotFoundException
     *         AWS Elemental MediaConnect did not find the resource that you specified in the request.
     * @throws ServiceUnavailableException
     *         AWS Elemental MediaConnect is currently unavailable. Try again later.
     * @throws TooManyRequestsException
     *         You have exceeded the service request rate limit for your AWS Elemental MediaConnect account.
     * @sample AWSMediaConnect.UpdateFlowSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowSource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFlowSourceResult updateFlowSource(UpdateFlowSourceRequest updateFlowSourceRequest);

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

    AWSMediaConnectWaiters waiters();

}
