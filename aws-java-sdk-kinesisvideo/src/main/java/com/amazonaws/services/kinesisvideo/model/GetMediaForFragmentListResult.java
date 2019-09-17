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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetMediaForFragmentList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMediaForFragmentListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content type of the requested media.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see <a
     * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>. The
     * chunks that Kinesis Video Streams returns in the <code>GetMediaForFragmentList</code> call also include the
     * following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
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

    public GetMediaForFragmentListResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see <a
     * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>. The
     * chunks that Kinesis Video Streams returns in the <code>GetMediaForFragmentList</code> call also include the
     * following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     * </p>
     * </li>
     * </ul>
     * 
     * @param payload
     *        The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For
     *        information about the chunks, see <a
     *        href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>.
     *        The chunks that Kinesis Video Streams returns in the <code>GetMediaForFragmentList</code> call also
     *        include the following additional Matroska (MKV) tags: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following tags will be included if an exception occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     *        </p>
     *        </li>
     */

    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see <a
     * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>. The
     * chunks that Kinesis Video Streams returns in the <code>GetMediaForFragmentList</code> call also include the
     * following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     * </p>
     * </li>
     * </ul>
     * 
     * @return The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For
     *         information about the chunks, see <a
     *         href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>.
     *         The chunks that Kinesis Video Streams returns in the <code>GetMediaForFragmentList</code> call also
     *         include the following additional Matroska (MKV) tags: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following tags will be included if an exception occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     *         </p>
     *         </li>
     */

    public java.io.InputStream getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information
     * about the chunks, see <a
     * href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>. The
     * chunks that Kinesis Video Streams returns in the <code>GetMediaForFragmentList</code> call also include the
     * following additional Matroska (MKV) tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following tags will be included if an exception occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     * </p>
     * </li>
     * </ul>
     * 
     * @param payload
     *        The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For
     *        information about the chunks, see <a
     *        href="http://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_dataplane_PutMedia.html">PutMedia</a>.
     *        The chunks that Kinesis Video Streams returns in the <code>GetMediaForFragmentList</code> call also
     *        include the following additional Matroska (MKV) tags: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following tags will be included if an exception occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMediaForFragmentListResult withPayload(java.io.InputStream payload) {
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

        if (obj instanceof GetMediaForFragmentListResult == false)
            return false;
        GetMediaForFragmentListResult other = (GetMediaForFragmentListResult) obj;
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
    public GetMediaForFragmentListResult clone() {
        try {
            return (GetMediaForFragmentListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
