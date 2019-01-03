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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/PutMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMediaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * After Kinesis Video Streams successfully receives a <code>PutMedia</code> request, the service validates the
     * request headers. The service then starts reading the payload and first sends an HTTP 200 response.
     * </p>
     * <p>
     * The service then returns a stream containing a series of JSON objects (<code>Acknowledgement</code> objects)
     * separated by newlines. The acknowledgements are received on the same connection on which the media data is sent.
     * There can be many acknowledgements for a <code>PutMedia</code> request. Each <code>Acknowledgement</code>
     * consists of the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AckEventType</code> - Event type the acknowledgement represents.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Buffering:</b> Kinesis Video Streams has started receiving the fragment. Kinesis Video Streams sends the first
     * Buffering acknowledgement when the first byte of fragment data is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Received:</b> Kinesis Video Streams received the entire fragment. If you did not configure the stream to
     * persist the data, the producer can stop buffering the fragment upon receiving this acknowledgement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Persisted:</b> Kinesis Video Streams has persisted the fragment (for example, to Amazon S3). You get this
     * acknowledgement if you configured the stream to persist the data. After you receive this acknowledgement, the
     * producer can stop buffering the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error:</b> Kinesis Video Streams ran into an error while processing the fragment. You can review the error
     * code and determine the next course of action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Idle:</b> The <code>PutMedia</code> session is in-progress. However, Kinesis Video Streams is currently not
     * receiving data. Kinesis Video Streams sends this acknowledgement periodically for up to 30 seconds after the last
     * received data. If no data is received within the 30 seconds, Kinesis Video Streams closes the request.
     * </p>
     * <note>
     * <p>
     * This acknowledgement can help a producer determine if the <code>PutMedia</code> connection is alive, even if it
     * is not sending any data.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FragmentTimeCode</code> - Fragment timecode for which acknowledgement is sent.
     * </p>
     * <p>
     * The element can be missing if the <code>AckEventType</code> is <b>Idle</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FragmentNumber</code> - Kinesis Video Streams-generated fragment number for which the acknowledgement is
     * sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ErrorId</code> and <code>ErrorCode</code> - If the <code>AckEventType</code> is ErrorId, this field
     * provides corresponding error code. The following is the list of error codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 4000 - Error reading the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4001 - Fragment size is greater than maximum limit, 50 MB, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4002 - Fragment duration is greater than maximum limit, 10 seconds, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4003 - Connection duration is greater than maximum allowed threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4004 - Fragment timecode is less than the timecode previous time code (within a <code>PutMedia</code> call, you
     * cannot send fragments out of order).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4005 - More than one track is found in MKV.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4006 - Failed to parse the input stream as valid MKV format.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4007 - Invalid producer timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4008 - Stream no longer exists (deleted).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access to the stream's specified KMS key is denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - The stream's specified KMS key is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - The stream's specified KMS key failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - The stream's specified KMS key is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the stream's specified KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - The stream's specified KMS key is in an invalid state.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - The stream's specified KMS key is not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal service error
     * </p>
     * </li>
     * <li>
     * <p>
     * 5001 - Kinesis Video Streams failed to persist fragments to the data store.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The producer, while sending the payload for a long running <code>PutMedia</code> request, should read the
     * response for acknowledgements. A producer might receive chunks of acknowledgements at the same time, due to
     * buffering on an intermediate proxy server. A producer that wants to receive timely acknowledgements can send
     * fewer fragments in each <code>PutMedia</code> request.
     * </p>
     * </note>
     */
    private java.io.InputStream payload;

    /**
     * <p>
     * After Kinesis Video Streams successfully receives a <code>PutMedia</code> request, the service validates the
     * request headers. The service then starts reading the payload and first sends an HTTP 200 response.
     * </p>
     * <p>
     * The service then returns a stream containing a series of JSON objects (<code>Acknowledgement</code> objects)
     * separated by newlines. The acknowledgements are received on the same connection on which the media data is sent.
     * There can be many acknowledgements for a <code>PutMedia</code> request. Each <code>Acknowledgement</code>
     * consists of the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AckEventType</code> - Event type the acknowledgement represents.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Buffering:</b> Kinesis Video Streams has started receiving the fragment. Kinesis Video Streams sends the first
     * Buffering acknowledgement when the first byte of fragment data is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Received:</b> Kinesis Video Streams received the entire fragment. If you did not configure the stream to
     * persist the data, the producer can stop buffering the fragment upon receiving this acknowledgement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Persisted:</b> Kinesis Video Streams has persisted the fragment (for example, to Amazon S3). You get this
     * acknowledgement if you configured the stream to persist the data. After you receive this acknowledgement, the
     * producer can stop buffering the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error:</b> Kinesis Video Streams ran into an error while processing the fragment. You can review the error
     * code and determine the next course of action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Idle:</b> The <code>PutMedia</code> session is in-progress. However, Kinesis Video Streams is currently not
     * receiving data. Kinesis Video Streams sends this acknowledgement periodically for up to 30 seconds after the last
     * received data. If no data is received within the 30 seconds, Kinesis Video Streams closes the request.
     * </p>
     * <note>
     * <p>
     * This acknowledgement can help a producer determine if the <code>PutMedia</code> connection is alive, even if it
     * is not sending any data.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FragmentTimeCode</code> - Fragment timecode for which acknowledgement is sent.
     * </p>
     * <p>
     * The element can be missing if the <code>AckEventType</code> is <b>Idle</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FragmentNumber</code> - Kinesis Video Streams-generated fragment number for which the acknowledgement is
     * sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ErrorId</code> and <code>ErrorCode</code> - If the <code>AckEventType</code> is ErrorId, this field
     * provides corresponding error code. The following is the list of error codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 4000 - Error reading the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4001 - Fragment size is greater than maximum limit, 50 MB, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4002 - Fragment duration is greater than maximum limit, 10 seconds, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4003 - Connection duration is greater than maximum allowed threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4004 - Fragment timecode is less than the timecode previous time code (within a <code>PutMedia</code> call, you
     * cannot send fragments out of order).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4005 - More than one track is found in MKV.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4006 - Failed to parse the input stream as valid MKV format.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4007 - Invalid producer timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4008 - Stream no longer exists (deleted).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access to the stream's specified KMS key is denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - The stream's specified KMS key is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - The stream's specified KMS key failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - The stream's specified KMS key is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the stream's specified KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - The stream's specified KMS key is in an invalid state.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - The stream's specified KMS key is not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal service error
     * </p>
     * </li>
     * <li>
     * <p>
     * 5001 - Kinesis Video Streams failed to persist fragments to the data store.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The producer, while sending the payload for a long running <code>PutMedia</code> request, should read the
     * response for acknowledgements. A producer might receive chunks of acknowledgements at the same time, due to
     * buffering on an intermediate proxy server. A producer that wants to receive timely acknowledgements can send
     * fewer fragments in each <code>PutMedia</code> request.
     * </p>
     * </note>
     * 
     * @param payload
     *        After Kinesis Video Streams successfully receives a <code>PutMedia</code> request, the service validates
     *        the request headers. The service then starts reading the payload and first sends an HTTP 200 response.
     *        </p>
     *        <p>
     *        The service then returns a stream containing a series of JSON objects (<code>Acknowledgement</code>
     *        objects) separated by newlines. The acknowledgements are received on the same connection on which the
     *        media data is sent. There can be many acknowledgements for a <code>PutMedia</code> request. Each
     *        <code>Acknowledgement</code> consists of the following key-value pairs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AckEventType</code> - Event type the acknowledgement represents.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Buffering:</b> Kinesis Video Streams has started receiving the fragment. Kinesis Video Streams sends
     *        the first Buffering acknowledgement when the first byte of fragment data is received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Received:</b> Kinesis Video Streams received the entire fragment. If you did not configure the stream
     *        to persist the data, the producer can stop buffering the fragment upon receiving this acknowledgement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Persisted:</b> Kinesis Video Streams has persisted the fragment (for example, to Amazon S3). You get
     *        this acknowledgement if you configured the stream to persist the data. After you receive this
     *        acknowledgement, the producer can stop buffering the fragment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Error:</b> Kinesis Video Streams ran into an error while processing the fragment. You can review the
     *        error code and determine the next course of action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Idle:</b> The <code>PutMedia</code> session is in-progress. However, Kinesis Video Streams is currently
     *        not receiving data. Kinesis Video Streams sends this acknowledgement periodically for up to 30 seconds
     *        after the last received data. If no data is received within the 30 seconds, Kinesis Video Streams closes
     *        the request.
     *        </p>
     *        <note>
     *        <p>
     *        This acknowledgement can help a producer determine if the <code>PutMedia</code> connection is alive, even
     *        if it is not sending any data.
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FragmentTimeCode</code> - Fragment timecode for which acknowledgement is sent.
     *        </p>
     *        <p>
     *        The element can be missing if the <code>AckEventType</code> is <b>Idle</b>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FragmentNumber</code> - Kinesis Video Streams-generated fragment number for which the
     *        acknowledgement is sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ErrorId</code> and <code>ErrorCode</code> - If the <code>AckEventType</code> is ErrorId, this field
     *        provides corresponding error code. The following is the list of error codes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        4000 - Error reading the data stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4001 - Fragment size is greater than maximum limit, 50 MB, allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4002 - Fragment duration is greater than maximum limit, 10 seconds, allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4003 - Connection duration is greater than maximum allowed threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4004 - Fragment timecode is less than the timecode previous time code (within a <code>PutMedia</code>
     *        call, you cannot send fragments out of order).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4005 - More than one track is found in MKV.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4006 - Failed to parse the input stream as valid MKV format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4007 - Invalid producer timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4008 - Stream no longer exists (deleted).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4500 - Access to the stream's specified KMS key is denied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4501 - The stream's specified KMS key is disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4502 - The stream's specified KMS key failed validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4503 - The stream's specified KMS key is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4504 - Invalid usage of the stream's specified KMS key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4505 - The stream's specified KMS key is in an invalid state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4506 - The stream's specified KMS key is not found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5000 - Internal service error
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5001 - Kinesis Video Streams failed to persist fragments to the data store.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The producer, while sending the payload for a long running <code>PutMedia</code> request, should read the
     *        response for acknowledgements. A producer might receive chunks of acknowledgements at the same time, due
     *        to buffering on an intermediate proxy server. A producer that wants to receive timely acknowledgements can
     *        send fewer fragments in each <code>PutMedia</code> request.
     *        </p>
     */

    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * After Kinesis Video Streams successfully receives a <code>PutMedia</code> request, the service validates the
     * request headers. The service then starts reading the payload and first sends an HTTP 200 response.
     * </p>
     * <p>
     * The service then returns a stream containing a series of JSON objects (<code>Acknowledgement</code> objects)
     * separated by newlines. The acknowledgements are received on the same connection on which the media data is sent.
     * There can be many acknowledgements for a <code>PutMedia</code> request. Each <code>Acknowledgement</code>
     * consists of the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AckEventType</code> - Event type the acknowledgement represents.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Buffering:</b> Kinesis Video Streams has started receiving the fragment. Kinesis Video Streams sends the first
     * Buffering acknowledgement when the first byte of fragment data is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Received:</b> Kinesis Video Streams received the entire fragment. If you did not configure the stream to
     * persist the data, the producer can stop buffering the fragment upon receiving this acknowledgement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Persisted:</b> Kinesis Video Streams has persisted the fragment (for example, to Amazon S3). You get this
     * acknowledgement if you configured the stream to persist the data. After you receive this acknowledgement, the
     * producer can stop buffering the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error:</b> Kinesis Video Streams ran into an error while processing the fragment. You can review the error
     * code and determine the next course of action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Idle:</b> The <code>PutMedia</code> session is in-progress. However, Kinesis Video Streams is currently not
     * receiving data. Kinesis Video Streams sends this acknowledgement periodically for up to 30 seconds after the last
     * received data. If no data is received within the 30 seconds, Kinesis Video Streams closes the request.
     * </p>
     * <note>
     * <p>
     * This acknowledgement can help a producer determine if the <code>PutMedia</code> connection is alive, even if it
     * is not sending any data.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FragmentTimeCode</code> - Fragment timecode for which acknowledgement is sent.
     * </p>
     * <p>
     * The element can be missing if the <code>AckEventType</code> is <b>Idle</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FragmentNumber</code> - Kinesis Video Streams-generated fragment number for which the acknowledgement is
     * sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ErrorId</code> and <code>ErrorCode</code> - If the <code>AckEventType</code> is ErrorId, this field
     * provides corresponding error code. The following is the list of error codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 4000 - Error reading the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4001 - Fragment size is greater than maximum limit, 50 MB, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4002 - Fragment duration is greater than maximum limit, 10 seconds, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4003 - Connection duration is greater than maximum allowed threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4004 - Fragment timecode is less than the timecode previous time code (within a <code>PutMedia</code> call, you
     * cannot send fragments out of order).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4005 - More than one track is found in MKV.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4006 - Failed to parse the input stream as valid MKV format.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4007 - Invalid producer timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4008 - Stream no longer exists (deleted).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access to the stream's specified KMS key is denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - The stream's specified KMS key is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - The stream's specified KMS key failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - The stream's specified KMS key is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the stream's specified KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - The stream's specified KMS key is in an invalid state.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - The stream's specified KMS key is not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal service error
     * </p>
     * </li>
     * <li>
     * <p>
     * 5001 - Kinesis Video Streams failed to persist fragments to the data store.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The producer, while sending the payload for a long running <code>PutMedia</code> request, should read the
     * response for acknowledgements. A producer might receive chunks of acknowledgements at the same time, due to
     * buffering on an intermediate proxy server. A producer that wants to receive timely acknowledgements can send
     * fewer fragments in each <code>PutMedia</code> request.
     * </p>
     * </note>
     * 
     * @return After Kinesis Video Streams successfully receives a <code>PutMedia</code> request, the service validates
     *         the request headers. The service then starts reading the payload and first sends an HTTP 200 response.
     *         </p>
     *         <p>
     *         The service then returns a stream containing a series of JSON objects (<code>Acknowledgement</code>
     *         objects) separated by newlines. The acknowledgements are received on the same connection on which the
     *         media data is sent. There can be many acknowledgements for a <code>PutMedia</code> request. Each
     *         <code>Acknowledgement</code> consists of the following key-value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AckEventType</code> - Event type the acknowledgement represents.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Buffering:</b> Kinesis Video Streams has started receiving the fragment. Kinesis Video Streams sends
     *         the first Buffering acknowledgement when the first byte of fragment data is received.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Received:</b> Kinesis Video Streams received the entire fragment. If you did not configure the stream
     *         to persist the data, the producer can stop buffering the fragment upon receiving this acknowledgement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Persisted:</b> Kinesis Video Streams has persisted the fragment (for example, to Amazon S3). You get
     *         this acknowledgement if you configured the stream to persist the data. After you receive this
     *         acknowledgement, the producer can stop buffering the fragment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Error:</b> Kinesis Video Streams ran into an error while processing the fragment. You can review the
     *         error code and determine the next course of action.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Idle:</b> The <code>PutMedia</code> session is in-progress. However, Kinesis Video Streams is
     *         currently not receiving data. Kinesis Video Streams sends this acknowledgement periodically for up to 30
     *         seconds after the last received data. If no data is received within the 30 seconds, Kinesis Video Streams
     *         closes the request.
     *         </p>
     *         <note>
     *         <p>
     *         This acknowledgement can help a producer determine if the <code>PutMedia</code> connection is alive, even
     *         if it is not sending any data.
     *         </p>
     *         </note></li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FragmentTimeCode</code> - Fragment timecode for which acknowledgement is sent.
     *         </p>
     *         <p>
     *         The element can be missing if the <code>AckEventType</code> is <b>Idle</b>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FragmentNumber</code> - Kinesis Video Streams-generated fragment number for which the
     *         acknowledgement is sent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ErrorId</code> and <code>ErrorCode</code> - If the <code>AckEventType</code> is ErrorId, this field
     *         provides corresponding error code. The following is the list of error codes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         4000 - Error reading the data stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4001 - Fragment size is greater than maximum limit, 50 MB, allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4002 - Fragment duration is greater than maximum limit, 10 seconds, allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4003 - Connection duration is greater than maximum allowed threshold.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4004 - Fragment timecode is less than the timecode previous time code (within a <code>PutMedia</code>
     *         call, you cannot send fragments out of order).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4005 - More than one track is found in MKV.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4006 - Failed to parse the input stream as valid MKV format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4007 - Invalid producer timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4008 - Stream no longer exists (deleted).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4500 - Access to the stream's specified KMS key is denied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4501 - The stream's specified KMS key is disabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4502 - The stream's specified KMS key failed validation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4503 - The stream's specified KMS key is unavailable.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4504 - Invalid usage of the stream's specified KMS key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4505 - The stream's specified KMS key is in an invalid state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4506 - The stream's specified KMS key is not found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         5000 - Internal service error
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         5001 - Kinesis Video Streams failed to persist fragments to the data store.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The producer, while sending the payload for a long running <code>PutMedia</code> request, should read the
     *         response for acknowledgements. A producer might receive chunks of acknowledgements at the same time, due
     *         to buffering on an intermediate proxy server. A producer that wants to receive timely acknowledgements
     *         can send fewer fragments in each <code>PutMedia</code> request.
     *         </p>
     */

    public java.io.InputStream getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * After Kinesis Video Streams successfully receives a <code>PutMedia</code> request, the service validates the
     * request headers. The service then starts reading the payload and first sends an HTTP 200 response.
     * </p>
     * <p>
     * The service then returns a stream containing a series of JSON objects (<code>Acknowledgement</code> objects)
     * separated by newlines. The acknowledgements are received on the same connection on which the media data is sent.
     * There can be many acknowledgements for a <code>PutMedia</code> request. Each <code>Acknowledgement</code>
     * consists of the following key-value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AckEventType</code> - Event type the acknowledgement represents.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Buffering:</b> Kinesis Video Streams has started receiving the fragment. Kinesis Video Streams sends the first
     * Buffering acknowledgement when the first byte of fragment data is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Received:</b> Kinesis Video Streams received the entire fragment. If you did not configure the stream to
     * persist the data, the producer can stop buffering the fragment upon receiving this acknowledgement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Persisted:</b> Kinesis Video Streams has persisted the fragment (for example, to Amazon S3). You get this
     * acknowledgement if you configured the stream to persist the data. After you receive this acknowledgement, the
     * producer can stop buffering the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Error:</b> Kinesis Video Streams ran into an error while processing the fragment. You can review the error
     * code and determine the next course of action.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Idle:</b> The <code>PutMedia</code> session is in-progress. However, Kinesis Video Streams is currently not
     * receiving data. Kinesis Video Streams sends this acknowledgement periodically for up to 30 seconds after the last
     * received data. If no data is received within the 30 seconds, Kinesis Video Streams closes the request.
     * </p>
     * <note>
     * <p>
     * This acknowledgement can help a producer determine if the <code>PutMedia</code> connection is alive, even if it
     * is not sending any data.
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>FragmentTimeCode</code> - Fragment timecode for which acknowledgement is sent.
     * </p>
     * <p>
     * The element can be missing if the <code>AckEventType</code> is <b>Idle</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FragmentNumber</code> - Kinesis Video Streams-generated fragment number for which the acknowledgement is
     * sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ErrorId</code> and <code>ErrorCode</code> - If the <code>AckEventType</code> is ErrorId, this field
     * provides corresponding error code. The following is the list of error codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 4000 - Error reading the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4001 - Fragment size is greater than maximum limit, 50 MB, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4002 - Fragment duration is greater than maximum limit, 10 seconds, allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4003 - Connection duration is greater than maximum allowed threshold.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4004 - Fragment timecode is less than the timecode previous time code (within a <code>PutMedia</code> call, you
     * cannot send fragments out of order).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4005 - More than one track is found in MKV.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4006 - Failed to parse the input stream as valid MKV format.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4007 - Invalid producer timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4008 - Stream no longer exists (deleted).
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access to the stream's specified KMS key is denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - The stream's specified KMS key is disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - The stream's specified KMS key failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - The stream's specified KMS key is unavailable.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the stream's specified KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - The stream's specified KMS key is in an invalid state.
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - The stream's specified KMS key is not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal service error
     * </p>
     * </li>
     * <li>
     * <p>
     * 5001 - Kinesis Video Streams failed to persist fragments to the data store.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The producer, while sending the payload for a long running <code>PutMedia</code> request, should read the
     * response for acknowledgements. A producer might receive chunks of acknowledgements at the same time, due to
     * buffering on an intermediate proxy server. A producer that wants to receive timely acknowledgements can send
     * fewer fragments in each <code>PutMedia</code> request.
     * </p>
     * </note>
     * 
     * @param payload
     *        After Kinesis Video Streams successfully receives a <code>PutMedia</code> request, the service validates
     *        the request headers. The service then starts reading the payload and first sends an HTTP 200 response.
     *        </p>
     *        <p>
     *        The service then returns a stream containing a series of JSON objects (<code>Acknowledgement</code>
     *        objects) separated by newlines. The acknowledgements are received on the same connection on which the
     *        media data is sent. There can be many acknowledgements for a <code>PutMedia</code> request. Each
     *        <code>Acknowledgement</code> consists of the following key-value pairs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AckEventType</code> - Event type the acknowledgement represents.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Buffering:</b> Kinesis Video Streams has started receiving the fragment. Kinesis Video Streams sends
     *        the first Buffering acknowledgement when the first byte of fragment data is received.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Received:</b> Kinesis Video Streams received the entire fragment. If you did not configure the stream
     *        to persist the data, the producer can stop buffering the fragment upon receiving this acknowledgement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Persisted:</b> Kinesis Video Streams has persisted the fragment (for example, to Amazon S3). You get
     *        this acknowledgement if you configured the stream to persist the data. After you receive this
     *        acknowledgement, the producer can stop buffering the fragment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Error:</b> Kinesis Video Streams ran into an error while processing the fragment. You can review the
     *        error code and determine the next course of action.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Idle:</b> The <code>PutMedia</code> session is in-progress. However, Kinesis Video Streams is currently
     *        not receiving data. Kinesis Video Streams sends this acknowledgement periodically for up to 30 seconds
     *        after the last received data. If no data is received within the 30 seconds, Kinesis Video Streams closes
     *        the request.
     *        </p>
     *        <note>
     *        <p>
     *        This acknowledgement can help a producer determine if the <code>PutMedia</code> connection is alive, even
     *        if it is not sending any data.
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FragmentTimeCode</code> - Fragment timecode for which acknowledgement is sent.
     *        </p>
     *        <p>
     *        The element can be missing if the <code>AckEventType</code> is <b>Idle</b>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FragmentNumber</code> - Kinesis Video Streams-generated fragment number for which the
     *        acknowledgement is sent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ErrorId</code> and <code>ErrorCode</code> - If the <code>AckEventType</code> is ErrorId, this field
     *        provides corresponding error code. The following is the list of error codes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        4000 - Error reading the data stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4001 - Fragment size is greater than maximum limit, 50 MB, allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4002 - Fragment duration is greater than maximum limit, 10 seconds, allowed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4003 - Connection duration is greater than maximum allowed threshold.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4004 - Fragment timecode is less than the timecode previous time code (within a <code>PutMedia</code>
     *        call, you cannot send fragments out of order).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4005 - More than one track is found in MKV.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4006 - Failed to parse the input stream as valid MKV format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4007 - Invalid producer timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4008 - Stream no longer exists (deleted).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4500 - Access to the stream's specified KMS key is denied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4501 - The stream's specified KMS key is disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4502 - The stream's specified KMS key failed validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4503 - The stream's specified KMS key is unavailable.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4504 - Invalid usage of the stream's specified KMS key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4505 - The stream's specified KMS key is in an invalid state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4506 - The stream's specified KMS key is not found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5000 - Internal service error
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5001 - Kinesis Video Streams failed to persist fragments to the data store.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The producer, while sending the payload for a long running <code>PutMedia</code> request, should read the
     *        response for acknowledgements. A producer might receive chunks of acknowledgements at the same time, due
     *        to buffering on an intermediate proxy server. A producer that wants to receive timely acknowledgements can
     *        send fewer fragments in each <code>PutMedia</code> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMediaResult withPayload(java.io.InputStream payload) {
        setPayload(payload);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMediaResult == false)
            return false;
        PutMediaResult other = (PutMediaResult) obj;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public PutMediaResult clone() {
        try {
            return (PutMediaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
