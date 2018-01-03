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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Interface for accessing Kinesis Video Archived Media.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoArchivedMedia} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoArchivedMedia {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kinesisvideo";

    /**
     * <p>
     * Gets media for a list of fragments (specified by fragment number) from the archived data in a Kinesis video
     * stream.
     * </p>
     * <note>
     * <p>
     * This operation is only available for the AWS SDK for Java. It is not supported in AWS SDKs for other languages.
     * </p>
     * </note>
     * <p>
     * The following limits apply when using the <code>GetMediaForFragmentList</code> API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A client can call <code>GetMediaForFragmentList</code> up to five times per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second)
     * during a <code>GetMediaForFragmentList</code> session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMediaForFragmentListRequest
     * @return Result of the GetMediaForFragmentList operation returned by the service.
     * @throws ResourceNotFoundException
     *         Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token
     *         has expired.
     * @sample AmazonKinesisVideoArchivedMedia.GetMediaForFragmentList
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetMediaForFragmentList"
     *      target="_top">AWS API Documentation</a>
     */
    GetMediaForFragmentListResult getMediaForFragmentList(GetMediaForFragmentListRequest getMediaForFragmentListRequest);

    /**
     * <p>
     * Returns a list of <a>Fragment</a> objects from the specified stream and start location within the archived data.
     * </p>
     * 
     * @param listFragmentsRequest
     * @return Result of the ListFragments operation returned by the service.
     * @throws ResourceNotFoundException
     *         Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         A specified parameter exceeds its restrictions, is not supported, or can't be used.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token
     *         has expired.
     * @sample AmazonKinesisVideoArchivedMedia.ListFragments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/ListFragments"
     *      target="_top">AWS API Documentation</a>
     */
    ListFragmentsResult listFragments(ListFragmentsRequest listFragmentsRequest);

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
