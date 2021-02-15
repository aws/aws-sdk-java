/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetClip"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClipResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified video stream. The output will contain the
     * first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html">Kinesis Video Streams Limits</a>.
     * </p>
     */
    private java.io.InputStream payload;

    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     * 
     * @param contentType
     *        The content type of the media in the requested clip.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     * 
     * @return The content type of the media in the requested clip.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the media in the requested clip.
     * </p>
     * 
     * @param contentType
     *        The content type of the media in the requested clip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClipResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified video stream. The output will contain the
     * first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html">Kinesis Video Streams Limits</a>.
     * </p>
     * 
     * @param payload
     *        Traditional MP4 file that contains the media clip from the specified video stream. The output will contain
     *        the first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see
     *        <a href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html">Kinesis Video Streams
     *        Limits</a>.
     */

    public void setPayload(java.io.InputStream payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified video stream. The output will contain the
     * first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html">Kinesis Video Streams Limits</a>.
     * </p>
     * 
     * @return Traditional MP4 file that contains the media clip from the specified video stream. The output will
     *         contain the first 100 MB or the first 200 fragments from the specified start timestamp. For more
     *         information, see <a href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html">Kinesis
     *         Video Streams Limits</a>.
     */

    public java.io.InputStream getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * Traditional MP4 file that contains the media clip from the specified video stream. The output will contain the
     * first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html">Kinesis Video Streams Limits</a>.
     * </p>
     * 
     * @param payload
     *        Traditional MP4 file that contains the media clip from the specified video stream. The output will contain
     *        the first 100 MB or the first 200 fragments from the specified start timestamp. For more information, see
     *        <a href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/limits.html">Kinesis Video Streams
     *        Limits</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClipResult withPayload(java.io.InputStream payload) {
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

        if (obj instanceof GetClipResult == false)
            return false;
        GetClipResult other = (GetClipResult) obj;
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
    public GetClipResult clone() {
        try {
            return (GetClipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
