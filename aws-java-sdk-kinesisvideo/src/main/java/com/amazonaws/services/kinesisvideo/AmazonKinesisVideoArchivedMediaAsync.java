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

import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Interface for accessing Kinesis Video Archived Media asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoArchivedMediaAsync} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoArchivedMediaAsync extends AmazonKinesisVideoArchivedMedia {

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
     * @return A Java Future containing the result of the GetMediaForFragmentList operation returned by the service.
     * @sample AmazonKinesisVideoArchivedMediaAsync.GetMediaForFragmentList
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetMediaForFragmentList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaForFragmentListResult> getMediaForFragmentListAsync(GetMediaForFragmentListRequest getMediaForFragmentListRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaForFragmentList operation returned by the service.
     * @sample AmazonKinesisVideoArchivedMediaAsyncHandler.GetMediaForFragmentList
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetMediaForFragmentList"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaForFragmentListResult> getMediaForFragmentListAsync(GetMediaForFragmentListRequest getMediaForFragmentListRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaForFragmentListRequest, GetMediaForFragmentListResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <a>Fragment</a> objects from the specified stream and start location within the archived data.
     * </p>
     * 
     * @param listFragmentsRequest
     * @return A Java Future containing the result of the ListFragments operation returned by the service.
     * @sample AmazonKinesisVideoArchivedMediaAsync.ListFragments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/ListFragments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFragmentsResult> listFragmentsAsync(ListFragmentsRequest listFragmentsRequest);

    /**
     * <p>
     * Returns a list of <a>Fragment</a> objects from the specified stream and start location within the archived data.
     * </p>
     * 
     * @param listFragmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFragments operation returned by the service.
     * @sample AmazonKinesisVideoArchivedMediaAsyncHandler.ListFragments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/ListFragments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFragmentsResult> listFragmentsAsync(ListFragmentsRequest listFragmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFragmentsRequest, ListFragmentsResult> asyncHandler);

}
