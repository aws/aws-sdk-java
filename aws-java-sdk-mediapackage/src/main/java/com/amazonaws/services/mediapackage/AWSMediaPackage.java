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
package com.amazonaws.services.mediapackage;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediapackage.model.*;

/**
 * Interface for accessing MediaPackage.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediapackage.AbstractAWSMediaPackage} instead.
 * </p>
 * <p>
 * AWS Elemental MediaPackage
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaPackage {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "mediapackage";

    /**
     * Creates a new Channel.
     * 
     * @param createChannelRequest
     *        A new Channel configuration.
     * @return Result of the CreateChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

    /**
     * Creates a new OriginEndpoint record.
     * 
     * @param createOriginEndpointRequest
     *        Configuration parameters used to create a new OriginEndpoint.
     * @return Result of the CreateOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.CreateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CreateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    CreateOriginEndpointResult createOriginEndpoint(CreateOriginEndpointRequest createOriginEndpointRequest);

    /**
     * Deletes an existing Channel.
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * Deletes an existing OriginEndpoint.
     * 
     * @param deleteOriginEndpointRequest
     * @return Result of the DeleteOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DeleteOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DeleteOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteOriginEndpointResult deleteOriginEndpoint(DeleteOriginEndpointRequest deleteOriginEndpointRequest);

    /**
     * Gets details about a Channel.
     * 
     * @param describeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest);

    /**
     * Gets details about an existing OriginEndpoint.
     * 
     * @param describeOriginEndpointRequest
     * @return Result of the DescribeOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.DescribeOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/DescribeOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOriginEndpointResult describeOriginEndpoint(DescribeOriginEndpointRequest describeOriginEndpointRequest);

    /**
     * Returns a collection of Channels.
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * Returns a collection of OriginEndpoint records.
     * 
     * @param listOriginEndpointsRequest
     * @return Result of the ListOriginEndpoints operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.ListOriginEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListOriginEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListOriginEndpointsResult listOriginEndpoints(ListOriginEndpointsRequest listOriginEndpointsRequest);

    /**
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaPackage.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * Changes the Channel's first IngestEndpoint's username and password. WARNING - This API is deprecated. Please use
     * RotateIngestEndpointCredentials instead
     * 
     * @param rotateChannelCredentialsRequest
     * @return Result of the RotateChannelCredentials operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.RotateChannelCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateChannelCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    RotateChannelCredentialsResult rotateChannelCredentials(RotateChannelCredentialsRequest rotateChannelCredentialsRequest);

    /**
     * Rotate the IngestEndpoint's username and password, as specified by the IngestEndpoint's id.
     * 
     * @param rotateIngestEndpointCredentialsRequest
     * @return Result of the RotateIngestEndpointCredentials operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.RotateIngestEndpointCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/RotateIngestEndpointCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    RotateIngestEndpointCredentialsResult rotateIngestEndpointCredentials(RotateIngestEndpointCredentialsRequest rotateIngestEndpointCredentialsRequest);

    /**
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AWSMediaPackage.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AWSMediaPackage.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Updates an existing Channel.
     * 
     * @param updateChannelRequest
     *        Configuration parameters used to update the Channel.
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * Updates an existing OriginEndpoint.
     * 
     * @param updateOriginEndpointRequest
     *        Configuration parameters used to update an existing OriginEndpoint.
     * @return Result of the UpdateOriginEndpoint operation returned by the service.
     * @throws UnprocessableEntityException
     *         The parameters sent in the request are not valid.
     * @throws InternalServerErrorException
     *         An unexpected error occurred.
     * @throws ForbiddenException
     *         The client is not authorized to access the requested resource.
     * @throws NotFoundException
     *         The requested resource does not exist.
     * @throws ServiceUnavailableException
     *         An unexpected error occurred.
     * @throws TooManyRequestsException
     *         The client has exceeded their resource or throttling limits.
     * @sample AWSMediaPackage.UpdateOriginEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateOriginEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOriginEndpointResult updateOriginEndpoint(UpdateOriginEndpointRequest updateOriginEndpointRequest);

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
