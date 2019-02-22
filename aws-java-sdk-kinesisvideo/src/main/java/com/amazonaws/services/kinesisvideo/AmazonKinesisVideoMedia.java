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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Interface for accessing Kinesis Video Media.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoMedia} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoMedia {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kinesisvideo";

    /**
     * <p>
     * Use this API to retrieve media content from a Kinesis video stream. In the request, you identify the stream name
     * or stream Amazon Resource Name (ARN), and the starting chunk. Kinesis Video Streams then returns a stream of
     * chunks in order by fragment number.
     * </p>
     * <note>
     * <p>
     * You must first call the <code>GetDataEndpoint</code> API to get an endpoint. Then send the <code>GetMedia</code>
     * requests to this endpoint using the <a href="https://docs.aws.amazon.com/cli/latest/reference/">--endpoint-url
     * parameter</a>.
     * </p>
     * </note>
     * <p>
     * When you put media data (fragments) on a stream, Kinesis Video Streams stores each incoming fragment and related
     * metadata in what is called a "chunk." For more information, see . The <code>GetMedia</code> API returns a stream
     * of these chunks starting from the chunk that you specify in the request.
     * </p>
     * <p>
     * The following limits apply when using the <code>GetMedia</code> API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A client can call <code>GetMedia</code> up to five times per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * Kinesis Video Streams sends media data at a rate of up to 25 megabytes per second (or 200 megabits per second)
     * during a <code>GetMedia</code> session.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMediaRequest
     * @return Result of the GetMedia operation returned by the service.
     * @throws ResourceNotFoundException
     *         Status Code: 404, The stream with the given name does not exist.
     * @throws NotAuthorizedException
     *         Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token
     *         has expired.
     * @throws InvalidEndpointException
     *         Status Code: 400, Caller used wrong endpoint to write data to a stream. On receiving such an exception,
     *         the user must call <code>GetDataEndpoint</code> with <code>AccessMode</code> set to "READ" and use the
     *         endpoint Kinesis Video returns in the next <code>GetMedia</code> call.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ConnectionLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         connections.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @sample AmazonKinesisVideoMedia.GetMedia
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/GetMedia" target="_top">AWS
     *      API Documentation</a>
     */
    GetMediaResult getMedia(GetMediaRequest getMediaRequest);

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
