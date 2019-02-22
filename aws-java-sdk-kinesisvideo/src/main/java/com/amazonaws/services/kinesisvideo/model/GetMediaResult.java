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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-media-2017-09-30/GetMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content type of the requested media.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see . The chunks that Kinesis Video Streams returns in the <code>GetMedia</code> call also
     * include the following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your <code>GetMedia</code> call terminates, you
     * can use this continuation token in your next request to get the next chunk where the last request terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to determine how
     * far behind the chunk returned in the response is from the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be present if an error occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The error codes are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 3002 - Error writing to the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4000 - Requested fragment is not found
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access denied for the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - Stream's KMS key is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - Validation error on the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - KMS key specified in the stream is unavailable
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - Invalid state of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - Unable to find the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal error
     * </p>
     * </li>
     * </ul>
     */
    private java.io.InputStream payload;

    /**
     * <p>
     * The content type of the requested media.
     * </p>
     * 
     * @param contentType
     *        The content type of the requested media.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the requested media.
     * </p>
     * 
     * @return The content type of the requested media.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the requested media.
     * </p>
     * 
     * @param contentType
     *        The content type of the requested media.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see . The chunks that Kinesis Video Streams returns in the <code>GetMedia</code> call also
     * include the following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your <code>GetMedia</code> call terminates, you
     * can use this continuation token in your next request to get the next chunk where the last request terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to determine how
     * far behind the chunk returned in the response is from the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be present if an error occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The error codes are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 3002 - Error writing to the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4000 - Requested fragment is not found
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access denied for the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - Stream's KMS key is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - Validation error on the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - KMS key specified in the stream is unavailable
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - Invalid state of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - Unable to find the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal error
     * </p>
     * </li>
     * </ul>
     * 
     * @param payload
     *        The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For
     *        information about the chunks, see . The chunks that Kinesis Video Streams returns in the
     *        <code>GetMedia</code> call also include the following additional Matroska (MKV) tags: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your <code>GetMedia</code> call
     *        terminates, you can use this continuation token in your next request to get the next chunk where the last
     *        request terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to
     *        determine how far behind the chunk returned in the response is from the latest chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following tags will be present if an error occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The error codes are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        3002 - Error writing to the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4000 - Requested fragment is not found
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4500 - Access denied for the stream's KMS key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4501 - Stream's KMS key is disabled
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4502 - Validation error on the stream's KMS key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4503 - KMS key specified in the stream is unavailable
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4504 - Invalid usage of the KMS key specified in the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4505 - Invalid state of the KMS key specified in the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4506 - Unable to find the KMS key specified in the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5000 - Internal error
     *        </p>
     *        </li>
     */

    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see . The chunks that Kinesis Video Streams returns in the <code>GetMedia</code> call also
     * include the following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your <code>GetMedia</code> call terminates, you
     * can use this continuation token in your next request to get the next chunk where the last request terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to determine how
     * far behind the chunk returned in the response is from the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be present if an error occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The error codes are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 3002 - Error writing to the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4000 - Requested fragment is not found
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access denied for the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - Stream's KMS key is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - Validation error on the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - KMS key specified in the stream is unavailable
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - Invalid state of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - Unable to find the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal error
     * </p>
     * </li>
     * </ul>
     * 
     * @return The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For
     *         information about the chunks, see . The chunks that Kinesis Video Streams returns in the
     *         <code>GetMedia</code> call also include the following additional Matroska (MKV) tags: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your <code>GetMedia</code> call
     *         terminates, you can use this continuation token in your next request to get the next chunk where the last
     *         request terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to
     *         determine how far behind the chunk returned in the response is from the latest chunk on the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following tags will be present if an error occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The error codes are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         3002 - Error writing to the stream
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4000 - Requested fragment is not found
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4500 - Access denied for the stream's KMS key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4501 - Stream's KMS key is disabled
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4502 - Validation error on the stream's KMS key
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4503 - KMS key specified in the stream is unavailable
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4504 - Invalid usage of the KMS key specified in the stream
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4505 - Invalid state of the KMS key specified in the stream
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         4506 - Unable to find the KMS key specified in the stream
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         5000 - Internal error
     *         </p>
     *         </li>
     */

    public java.io.InputStream getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see . The chunks that Kinesis Video Streams returns in the <code>GetMedia</code> call also
     * include the following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your <code>GetMedia</code> call terminates, you
     * can use this continuation token in your next request to get the next chunk where the last request terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to determine how
     * far behind the chunk returned in the response is from the latest chunk on the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be present if an error occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The error codes are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 3002 - Error writing to the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4000 - Requested fragment is not found
     * </p>
     * </li>
     * <li>
     * <p>
     * 4500 - Access denied for the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4501 - Stream's KMS key is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * 4502 - Validation error on the stream's KMS key
     * </p>
     * </li>
     * <li>
     * <p>
     * 4503 - KMS key specified in the stream is unavailable
     * </p>
     * </li>
     * <li>
     * <p>
     * 4504 - Invalid usage of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4505 - Invalid state of the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 4506 - Unable to find the KMS key specified in the stream
     * </p>
     * </li>
     * <li>
     * <p>
     * 5000 - Internal error
     * </p>
     * </li>
     * </ul>
     * 
     * @param payload
     *        The payload Kinesis Video Streams returns is a sequence of chunks from the specified stream. For
     *        information about the chunks, see . The chunks that Kinesis Video Streams returns in the
     *        <code>GetMedia</code> call also include the following additional Matroska (MKV) tags: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_CONTINUATION_TOKEN (UTF-8 string) - In the event your <code>GetMedia</code> call
     *        terminates, you can use this continuation token in your next request to get the next chunk where the last
     *        request terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_MILLIS_BEHIND_NOW (UTF-8 string) - Client applications can use this tag value to
     *        determine how far behind the chunk returned in the response is from the latest chunk on the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_SERVER_TIMESTAMP - Server timestamp of the fragment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_PRODUCER_TIMESTAMP - Producer timestamp of the fragment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following tags will be present if an error occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_ERROR_CODE - String description of an error that caused GetMedia to stop.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_ERROR_ID: Integer code of the error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The error codes are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        3002 - Error writing to the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4000 - Requested fragment is not found
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4500 - Access denied for the stream's KMS key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4501 - Stream's KMS key is disabled
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4502 - Validation error on the stream's KMS key
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4503 - KMS key specified in the stream is unavailable
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4504 - Invalid usage of the KMS key specified in the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4505 - Invalid state of the KMS key specified in the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        4506 - Unable to find the KMS key specified in the stream
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        5000 - Internal error
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaResult withPayload(java.io.InputStream payload) {
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
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

        if (obj instanceof GetMediaResult == false)
            return false;
        GetMediaResult other = (GetMediaResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public GetMediaResult clone() {
        try {
            return (GetMediaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
