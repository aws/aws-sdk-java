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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.services.appstream.waiters.AmazonAppStreamWaiters;

/**
 * Interface for accessing Amazon AppStream.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appstream.AbstractAmazonAppStream} instead.
 * </p>
 * <p>
 * <fullname>Amazon AppStream 2.0</fullname>
 * <p>
 * API documentation for Amazon AppStream 2.0.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppStream {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "appstream2";

    /**
     * Overrides the default endpoint for this client ("appstream2.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "appstream2.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "appstream2.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol
     * from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "appstream2.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "appstream2.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonAppStream#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Associate a fleet to a stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @return Result of the AssociateFleet operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateFleetResult associateFleet(AssociateFleetRequest associateFleetRequest);

    /**
     * <p>
     * Creates a new fleet.
     * </p>
     * 
     * @param createFleetRequest
     *        Contains the parameters for the new fleet to create.
     * @return Result of the CreateFleet operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @sample AmazonAppStream.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Create a new stack.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @sample AmazonAppStream.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStackResult createStack(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a URL to start an AppStream 2.0 streaming session for a user. By default, the URL is valid only for 1
     * minute from the time that it is generated.
     * </p>
     * 
     * @param createStreamingURLRequest
     * @return Result of the CreateStreamingURL operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    CreateStreamingURLResult createStreamingURL(CreateStreamingURLRequest createStreamingURLRequest);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes the stack. After this operation completes, the environment can no longer be activated, and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @return Result of the DeleteStack operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStackResult deleteStack(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * If fleet names are provided, this operation describes the specified fleets; otherwise, all the fleets in the
     * account are described.
     * </p>
     * 
     * @param describeFleetsRequest
     * @return Result of the DescribeFleets operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeFleets" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFleetsResult describeFleets(DescribeFleetsRequest describeFleetsRequest);

    /**
     * <p>
     * Describes the images. If a list of names is not provided, all images in your account are returned. This operation
     * does not return a paginated result.
     * </p>
     * 
     * @param describeImagesRequest
     * @return Result of the DescribeImages operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeImages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImages" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest);

    /**
     * <p>
     * Describes the streaming sessions for a stack and a fleet. If a user ID is provided, this operation returns
     * streaming sessions for only that user. Pass this value for the <code>nextToken</code> parameter in a subsequent
     * call to this operation to retrieve the next set of items.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return Result of the DescribeSessions operation returned by the service.
     * @sample AmazonAppStream.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSessionsResult describeSessions(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * If stack names are not provided, this operation describes the specified stacks; otherwise, all stacks in the
     * account are described. Pass the <code>nextToken</code> value in a subsequent call to this operation to retrieve
     * the next set of items.
     * </p>
     * 
     * @param describeStacksRequest
     * @return Result of the DescribeStacks operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * Disassociates a fleet from a stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @return Result of the DisassociateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateFleetResult disassociateFleet(DisassociateFleetRequest disassociateFleetRequest);

    /**
     * <p>
     * This operation immediately stops a streaming session.
     * </p>
     * 
     * @param expireSessionRequest
     * @return Result of the ExpireSession operation returned by the service.
     * @sample AmazonAppStream.ExpireSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ExpireSession" target="_top">AWS API
     *      Documentation</a>
     */
    ExpireSessionResult expireSession(ExpireSessionRequest expireSessionRequest);

    /**
     * <p>
     * Lists all fleets associated with the stack.
     * </p>
     * 
     * @param listAssociatedFleetsRequest
     * @return Result of the ListAssociatedFleets operation returned by the service.
     * @sample AmazonAppStream.ListAssociatedFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedFleets" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssociatedFleetsResult listAssociatedFleets(ListAssociatedFleetsRequest listAssociatedFleetsRequest);

    /**
     * <p>
     * Lists all stacks to which the specified fleet is associated.
     * </p>
     * 
     * @param listAssociatedStacksRequest
     * @return Result of the ListAssociatedStacks operation returned by the service.
     * @sample AmazonAppStream.ListAssociatedStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListAssociatedStacks" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssociatedStacksResult listAssociatedStacks(ListAssociatedStacksRequest listAssociatedStacksRequest);

    /**
     * <p>
     * Starts a fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @return Result of the StartFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @sample AmazonAppStream.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    StartFleetResult startFleet(StartFleetRequest startFleetRequest);

    /**
     * <p>
     * Stops a fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @return Result of the StopFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    StopFleetResult stopFleet(StopFleetRequest stopFleetRequest);

    /**
     * <p>
     * Updates an existing fleet. All the attributes except the fleet name can be updated in the <b>STOPPED</b> state.
     * Only <b>ComputeCapacity</b> and <b>ImageName</b> can be updated in any other state.
     * </p>
     * 
     * @param updateFleetRequest
     * @return Result of the UpdateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFleetResult updateFleet(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates the specified fields in the stack with the specified name.
     * </p>
     * 
     * @param updateStackRequest
     * @return Result of the UpdateStack operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonAppStream.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStackResult updateStack(UpdateStackRequest updateStackRequest);

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

    AmazonAppStreamWaiters waiters();

}
