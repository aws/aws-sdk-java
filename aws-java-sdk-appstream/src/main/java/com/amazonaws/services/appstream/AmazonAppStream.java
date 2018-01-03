/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * You can use Amazon AppStream 2.0 to stream desktop applications to any device running a web browser, without
 * rewriting them.
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
     * Associates the specified fleet with the specified stack.
     * </p>
     * 
     * @param associateFleetRequest
     * @return Result of the AssociateFleet operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.AssociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/AssociateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateFleetResult associateFleet(AssociateFleetRequest associateFleetRequest);

    /**
     * <p>
     * Creates a directory configuration.
     * </p>
     * 
     * @param createDirectoryConfigRequest
     * @return Result of the CreateDirectoryConfig operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @sample AmazonAppStream.CreateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectoryConfigResult createDirectoryConfig(CreateDirectoryConfigRequest createDirectoryConfigRequest);

    /**
     * <p>
     * Creates a fleet.
     * </p>
     * 
     * @param createFleetRequest
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
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates an image builder.
     * </p>
     * <p>
     * The initial state of the builder is <code>PENDING</code>. When it is ready, the state is <code>RUNNING</code>.
     * </p>
     * 
     * @param createImageBuilderRequest
     * @return Result of the CreateImageBuilder operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.CreateImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    CreateImageBuilderResult createImageBuilder(CreateImageBuilderRequest createImageBuilderRequest);

    /**
     * <p>
     * Creates a URL to start an image builder streaming session.
     * </p>
     * 
     * @param createImageBuilderStreamingURLRequest
     * @return Result of the CreateImageBuilderStreamingURL operation returned by the service.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.CreateImageBuilderStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilderStreamingURL"
     *      target="_top">AWS API Documentation</a>
     */
    CreateImageBuilderStreamingURLResult createImageBuilderStreamingURL(CreateImageBuilderStreamingURLRequest createImageBuilderStreamingURLRequest);

    /**
     * <p>
     * Creates a stack.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStackResult createStack(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a URL to start a streaming session for the specified user.
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
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.CreateStreamingURL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateStreamingURL" target="_top">AWS
     *      API Documentation</a>
     */
    CreateStreamingURLResult createStreamingURL(CreateStreamingURLRequest createStreamingURLRequest);

    /**
     * <p>
     * Deletes the specified directory configuration.
     * </p>
     * 
     * @param deleteDirectoryConfigRequest
     * @return Result of the DeleteDirectoryConfig operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DeleteDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectoryConfigResult deleteDirectoryConfig(DeleteDirectoryConfigRequest deleteDirectoryConfigRequest);

    /**
     * <p>
     * Deletes the specified fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes the specified image. You cannot delete an image that is currently in use. After you delete an image, you
     * cannot provision new capacity using the image.
     * </p>
     * 
     * @param deleteImageRequest
     * @return Result of the DeleteImage operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteImage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteImageResult deleteImage(DeleteImageRequest deleteImageRequest);

    /**
     * <p>
     * Deletes the specified image builder and releases the capacity.
     * </p>
     * 
     * @param deleteImageBuilderRequest
     * @return Result of the DeleteImageBuilder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteImageBuilderResult deleteImageBuilder(DeleteImageBuilderRequest deleteImageBuilderRequest);

    /**
     * <p>
     * Deletes the specified stack. After this operation completes, the environment can no longer be activated and any
     * reservations made for the stack are released.
     * </p>
     * 
     * @param deleteStackRequest
     * @return Result of the DeleteStack operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStackResult deleteStack(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Describes the specified directory configurations.
     * </p>
     * 
     * @param describeDirectoryConfigsRequest
     * @return Result of the DescribeDirectoryConfigs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeDirectoryConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeDirectoryConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectoryConfigsResult describeDirectoryConfigs(DescribeDirectoryConfigsRequest describeDirectoryConfigsRequest);

    /**
     * <p>
     * Describes the specified fleets or all fleets in the account.
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
     * Describes the specified image builders or all image builders in the account.
     * </p>
     * 
     * @param describeImageBuildersRequest
     * @return Result of the DescribeImageBuilders operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.DescribeImageBuilders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeImageBuilders"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeImageBuildersResult describeImageBuilders(DescribeImageBuildersRequest describeImageBuildersRequest);

    /**
     * <p>
     * Describes the specified images or all images in the account.
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
     * Describes the streaming sessions for the specified stack and fleet. If a user ID is provided, only the streaming
     * sessions for only that user are returned. If an authentication type is not provided, the default is to
     * authenticate users using a streaming URL.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return Result of the DescribeSessions operation returned by the service.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @sample AmazonAppStream.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSessionsResult describeSessions(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * Describes the specified stacks or all stacks in the account.
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
     * Disassociates the specified fleet from the specified stack.
     * </p>
     * 
     * @param disassociateFleetRequest
     * @return Result of the DisassociateFleet operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.DisassociateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateFleet" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateFleetResult disassociateFleet(DisassociateFleetRequest disassociateFleetRequest);

    /**
     * <p>
     * Stops the specified streaming session.
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
     * Lists the fleets associated with the specified stack.
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
     * Lists the stacks associated with the specified fleet.
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
     * Lists the tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image builders, images,
     * fleets, and stacks.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts the specified fleet.
     * </p>
     * 
     * @param startFleetRequest
     * @return Result of the StartFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StartFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartFleet" target="_top">AWS API
     *      Documentation</a>
     */
    StartFleetResult startFleet(StartFleetRequest startFleetRequest);

    /**
     * <p>
     * Starts the specified image builder.
     * </p>
     * 
     * @param startImageBuilderRequest
     * @return Result of the StartImageBuilder operation returned by the service.
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @sample AmazonAppStream.StartImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StartImageBuilder" target="_top">AWS
     *      API Documentation</a>
     */
    StartImageBuilderResult startImageBuilder(StartImageBuilderRequest startImageBuilderRequest);

    /**
     * <p>
     * Stops the specified fleet.
     * </p>
     * 
     * @param stopFleetRequest
     * @return Result of the StopFleet operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StopFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopFleet" target="_top">AWS API
     *      Documentation</a>
     */
    StopFleetResult stopFleet(StopFleetRequest stopFleetRequest);

    /**
     * <p>
     * Stops the specified image builder.
     * </p>
     * 
     * @param stopImageBuilderRequest
     * @return Result of the StopImageBuilder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.StopImageBuilder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopImageBuilder" target="_top">AWS API
     *      Documentation</a>
     */
    StopImageBuilderResult stopImageBuilder(StopImageBuilderRequest stopImageBuilderRequest);

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified AppStream 2.0 resource. You can tag AppStream 2.0 image
     * builders, images, fleets, and stacks.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a resource already has a tag with the same key, this
     * operation updates its value.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>. To disassociate tags from your
     * resources, use <a>UntagResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Disassociates the specified tags from the specified AppStream 2.0 resource.
     * </p>
     * <p>
     * To list the current tags for your resources, use <a>ListTagsForResource</a>.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic">Tagging Your Resources</a> in
     * the <i>Amazon AppStream 2.0 Developer Guide</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AmazonAppStream.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified directory configuration.
     * </p>
     * 
     * @param updateDirectoryConfigRequest
     * @return Result of the UpdateDirectoryConfig operation returned by the service.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @sample AmazonAppStream.UpdateDirectoryConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateDirectoryConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDirectoryConfigResult updateDirectoryConfig(UpdateDirectoryConfigRequest updateDirectoryConfigRequest);

    /**
     * <p>
     * Updates the specified fleet.
     * </p>
     * <p>
     * If the fleet is in the <code>STOPPED</code> state, you can update any attribute except the fleet name. If the
     * fleet is in the <code>RUNNING</code> state, you can update the <code>DisplayName</code> and
     * <code>ComputeCapacity</code> attributes. If the fleet is in the <code>STARTING</code> or <code>STOPPING</code>
     * state, you can't update it.
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
     * @throws ResourceNotAvailableException
     *         The specified resource exists and is not in use, but isn't available.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws ConcurrentModificationException
     *         An API error occurred. Wait a few minutes and try again.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
     * @throws OperationNotPermittedException
     *         The attempted operation is not permitted.
     * @sample AmazonAppStream.UpdateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UpdateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFleetResult updateFleet(UpdateFleetRequest updateFleetRequest);

    /**
     * <p>
     * Updates the specified stack.
     * </p>
     * 
     * @param updateStackRequest
     * @return Result of the UpdateStack operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws InvalidRoleException
     *         The specified role is invalid.
     * @throws InvalidParameterCombinationException
     *         Indicates an incorrect combination of parameters, or a missing parameter.
     * @throws LimitExceededException
     *         The requested limit exceeds the permitted limit for an account.
     * @throws IncompatibleImageException
     *         The image does not support storage connectors.
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
