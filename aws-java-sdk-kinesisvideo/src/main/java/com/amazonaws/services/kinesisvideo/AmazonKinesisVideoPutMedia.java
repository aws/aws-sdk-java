/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.kinesisvideo.model.ClientLimitExceededException;
import com.amazonaws.services.kinesisvideo.model.ConnectionLimitExceededException;
import com.amazonaws.services.kinesisvideo.model.InvalidArgumentException;
import com.amazonaws.services.kinesisvideo.model.InvalidEndpointException;
import com.amazonaws.services.kinesisvideo.model.NotAuthorizedException;
import com.amazonaws.services.kinesisvideo.model.PutMediaRequest;
import com.amazonaws.services.kinesisvideo.model.ResourceNotFoundException;
import java.io.Closeable;

/**
 * Interface for accessing Amazon Kinesis Video's PutMedia operation. This is a special, asynchronous operation that is not supported
 * in the normal client ({@link AWSKinesisVideoMediaClient}.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link AbstractAmazonKinesisVideoPutMedia} instead.
 * </p>
 */
// TODO service docs when available.
public interface AmazonKinesisVideoPutMedia extends Closeable {

    /**
     * <p>
     * Use this API to send media data to a Kinesis video stream.
     * </p>
     * <note>
     * <p>
     * Before using this API, you must call the <code>GetDataEndpoint</code> API to get an endpoint. You then specify
     * the endpoint in your <code>PutMedia</code> request.
     * </p>
     * </note>
     * <p>
     * In the request, you use the HTTP headers to provide parameter information, for example, stream name, time stamp,
     * and whether the time stamp value is absolute or relative to when the producer started recording. You use the
     * request body to send the media data. Kinesis Video Streams supports only the Matroska (MKV) container format for
     * sending media data using this API.
     * </p>
     * <p>
     * You have the following options for sending data using this API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Send media data in real time: For example, a security camera can send frames in real time as it generates them.
     * This approach minimizes the latency between the video recording and data sent on the wire. This is referred to as
     * a continuous producer. In this case, a consumer application can read the stream in real time or when needed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Send media data offline (in batches): For example, a body camera might record video for hours and store it on the
     * device. Later, when you connect the camera to the docking port, the camera can start a <code>PutMedia</code>
     * session to send data to a Kinesis video stream. In this scenario, latency is not an issue.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When using this API, note the following considerations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must specify either <code>streamName</code> or <code>streamARN</code>, but not both.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might find it easier to use a single long-running <code>PutMedia</code> session and send a large number of
     * media data fragments in the payload. Note that for each fragment received, Kinesis Video Streams sends one or
     * more acknowledgements. Potential network considerations might cause you to not get all these acknowledgements as
     * they are generated.
     * </p>
     * </li>
     * <li>
     * <p>
     * You might choose multiple consecutive <code>PutMedia</code> sessions, each with fewer fragments to ensure that
     * you get all acknowledgements from the service in real time.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If you send data to the same stream on multiple simultaneous <code>PutMedia</code> sessions, the media fragments
     * get interleaved on the stream. You should make sure that this is OK in your application scenario.
     * </p>
     * </note>
     * <p>
     * The following limits apply when using the <code>PutMedia</code> API:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A client can call <code>PutMedia</code> up to five times per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * A client can send up to five fragments per second per stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * Kinesis Video Streams reads media data at a rate of up to 12.5 MB/second, or 100 Mbps during a
     * <code>PutMedia</code> session.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following constraints. In these cases, Kinesis Video Streams sends the Error acknowledgement in the
     * response.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fragments that have time codes spanning longer than 10 seconds and that contain more than 50 megabytes of data
     * are not allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * An MKV stream containing more than one MKV segment or containing disallowed MKV elements (like
     * <code>track*</code>) also results in the Error acknowledgement.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Kinesis Video Streams stores each incoming fragment and related metadata in what is called a "chunk." The
     * fragment metadata includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The MKV headers provided at the start of the <code>PutMedia</code> request
     * </p>
     * </li>
     * <li>
     * <p>
     * The following Kinesis Video Streams-specific metadata for the fragment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>server_timestamp</code> - Time stamp when Kinesis Video Streams started receiving the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>producer_timestamp</code> - Time stamp, when the producer started recording the fragment. Kinesis Video
     * Streams uses three pieces of information received in the request to calculate this value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The fragment timecode value received in the request body along with the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * Two request headers: <code>producerStartTimestamp</code> (when the producer started recording) and
     * <code>fragmentTimeCodeType</code> (whether the fragment timecode in the payload is absolute or relative).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Kinesis Video Streams then computes the <code>producer_timestamp</code> for the fragment as follows:
     * </p>
     * <p>
     * If <code>fragmentTimeCodeType</code> is relative, then
     * </p>
     * <p>
     * <code>producer_timestamp</code> = <code>producerStartTimeSamp</code> + fragment timecode
     * </p>
     * <p>
     * If <code>fragmentTimeCodeType</code> is absolute, then
     * </p>
     * <p>
     * <code>producer_timestamp</code> = fragment timecode (converted to milliseconds)
     * </p>
     * </li>
     * <li>
     * <p>
     * Unique fragment number assigned by Kinesis Video Streams.
     * </p>
     * </li>
     * </ul>
     * <p/></li>
     * </ul>
     * <note>
     * <p>
     * When you make the <code>GetMedia</code> request, Kinesis Video Streams returns a stream of these chunks. The
     * client can process the metadata as needed.
     * </p>
     * </note> <note>
     * <p>
     * This operation is only available for the AWS SDK for Java. It is not supported in AWS SDKs for other languages.
     * </p>
     * </note>
     *
     * @param request         Represents the input of a <code>PutMedia</code> operation
     * @param responseHandler Handler to asynchronously process the {@link com.amazonaws.services.kinesisvideo.model.AckEvent} that
     *                        are received by the service.
     * @return Result of the PutMedia operation returned by the service.
     * @throws ResourceNotFoundException
     *         Status Code: 404, The stream with the given name does not exist.
     * @throws NotAuthorizedException
     *         Status Code: 403, The caller is not authorized to perform an operation on the given stream, or the token
     *         has expired.
     * @throws InvalidEndpointException
     *         Status Code: 400, Caller used wrong endpoint to write data to a stream. On receiving such an exception,
     *         the user must call <code>GetDataEndpoint</code> with <code>AccessMode</code> set to "READ" and use the
     *         endpoint Kinesis Video returns in the next <code>GetMedia</code> call.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ConnectionLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         connections.
     * @sample AmazonKinesisVideoMedia.PutMedia
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/PutMedia" target="_top">AWS
     *      API Documentation</a>
     */
    void putMedia(PutMediaRequest request, PutMediaAckResponseHandler responseHandler);

    /**
     * Closes the client and releases all resources like connection pools and threads.
     */
    @Override
    void close();

}
