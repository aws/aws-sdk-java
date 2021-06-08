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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The media stream that you want to add to the flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/AddMediaStreamRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddMediaStreamRequest implements Serializable, Cloneable, StructuredPojo {

    /** The attributes that you want to assign to the new media stream. */
    private MediaStreamAttributesRequest attributes;
    /**
     * The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this value to
     * 90000. If the media stream type is audio, set this value to either 48000 or 96000.
     */
    private Integer clockRate;
    /** A description that can help you quickly identify what your media stream is used for. */
    private String description;
    /** A unique identifier for the media stream. */
    private Integer mediaStreamId;
    /** A name that helps you distinguish one media stream from another. */
    private String mediaStreamName;
    /** The type of media stream. */
    private String mediaStreamType;
    /** The resolution of the video. */
    private String videoFormat;

    /**
     * The attributes that you want to assign to the new media stream.
     * 
     * @param attributes
     *        The attributes that you want to assign to the new media stream.
     */

    public void setAttributes(MediaStreamAttributesRequest attributes) {
        this.attributes = attributes;
    }

    /**
     * The attributes that you want to assign to the new media stream.
     * 
     * @return The attributes that you want to assign to the new media stream.
     */

    public MediaStreamAttributesRequest getAttributes() {
        return this.attributes;
    }

    /**
     * The attributes that you want to assign to the new media stream.
     * 
     * @param attributes
     *        The attributes that you want to assign to the new media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddMediaStreamRequest withAttributes(MediaStreamAttributesRequest attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this value to
     * 90000. If the media stream type is audio, set this value to either 48000 or 96000.
     * 
     * @param clockRate
     *        The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this
     *        value to 90000. If the media stream type is audio, set this value to either 48000 or 96000.
     */

    public void setClockRate(Integer clockRate) {
        this.clockRate = clockRate;
    }

    /**
     * The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this value to
     * 90000. If the media stream type is audio, set this value to either 48000 or 96000.
     * 
     * @return The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this
     *         value to 90000. If the media stream type is audio, set this value to either 48000 or 96000.
     */

    public Integer getClockRate() {
        return this.clockRate;
    }

    /**
     * The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this value to
     * 90000. If the media stream type is audio, set this value to either 48000 or 96000.
     * 
     * @param clockRate
     *        The sample rate (in Hz) for the stream. If the media stream type is video or ancillary data, set this
     *        value to 90000. If the media stream type is audio, set this value to either 48000 or 96000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddMediaStreamRequest withClockRate(Integer clockRate) {
        setClockRate(clockRate);
        return this;
    }

    /**
     * A description that can help you quickly identify what your media stream is used for.
     * 
     * @param description
     *        A description that can help you quickly identify what your media stream is used for.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description that can help you quickly identify what your media stream is used for.
     * 
     * @return A description that can help you quickly identify what your media stream is used for.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description that can help you quickly identify what your media stream is used for.
     * 
     * @param description
     *        A description that can help you quickly identify what your media stream is used for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddMediaStreamRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * A unique identifier for the media stream.
     * 
     * @param mediaStreamId
     *        A unique identifier for the media stream.
     */

    public void setMediaStreamId(Integer mediaStreamId) {
        this.mediaStreamId = mediaStreamId;
    }

    /**
     * A unique identifier for the media stream.
     * 
     * @return A unique identifier for the media stream.
     */

    public Integer getMediaStreamId() {
        return this.mediaStreamId;
    }

    /**
     * A unique identifier for the media stream.
     * 
     * @param mediaStreamId
     *        A unique identifier for the media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddMediaStreamRequest withMediaStreamId(Integer mediaStreamId) {
        setMediaStreamId(mediaStreamId);
        return this;
    }

    /**
     * A name that helps you distinguish one media stream from another.
     * 
     * @param mediaStreamName
     *        A name that helps you distinguish one media stream from another.
     */

    public void setMediaStreamName(String mediaStreamName) {
        this.mediaStreamName = mediaStreamName;
    }

    /**
     * A name that helps you distinguish one media stream from another.
     * 
     * @return A name that helps you distinguish one media stream from another.
     */

    public String getMediaStreamName() {
        return this.mediaStreamName;
    }

    /**
     * A name that helps you distinguish one media stream from another.
     * 
     * @param mediaStreamName
     *        A name that helps you distinguish one media stream from another.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddMediaStreamRequest withMediaStreamName(String mediaStreamName) {
        setMediaStreamName(mediaStreamName);
        return this;
    }

    /**
     * The type of media stream.
     * 
     * @param mediaStreamType
     *        The type of media stream.
     * @see MediaStreamType
     */

    public void setMediaStreamType(String mediaStreamType) {
        this.mediaStreamType = mediaStreamType;
    }

    /**
     * The type of media stream.
     * 
     * @return The type of media stream.
     * @see MediaStreamType
     */

    public String getMediaStreamType() {
        return this.mediaStreamType;
    }

    /**
     * The type of media stream.
     * 
     * @param mediaStreamType
     *        The type of media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStreamType
     */

    public AddMediaStreamRequest withMediaStreamType(String mediaStreamType) {
        setMediaStreamType(mediaStreamType);
        return this;
    }

    /**
     * The type of media stream.
     * 
     * @param mediaStreamType
     *        The type of media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStreamType
     */

    public AddMediaStreamRequest withMediaStreamType(MediaStreamType mediaStreamType) {
        this.mediaStreamType = mediaStreamType.toString();
        return this;
    }

    /**
     * The resolution of the video.
     * 
     * @param videoFormat
     *        The resolution of the video.
     */

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    /**
     * The resolution of the video.
     * 
     * @return The resolution of the video.
     */

    public String getVideoFormat() {
        return this.videoFormat;
    }

    /**
     * The resolution of the video.
     * 
     * @param videoFormat
     *        The resolution of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddMediaStreamRequest withVideoFormat(String videoFormat) {
        setVideoFormat(videoFormat);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getClockRate() != null)
            sb.append("ClockRate: ").append(getClockRate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMediaStreamId() != null)
            sb.append("MediaStreamId: ").append(getMediaStreamId()).append(",");
        if (getMediaStreamName() != null)
            sb.append("MediaStreamName: ").append(getMediaStreamName()).append(",");
        if (getMediaStreamType() != null)
            sb.append("MediaStreamType: ").append(getMediaStreamType()).append(",");
        if (getVideoFormat() != null)
            sb.append("VideoFormat: ").append(getVideoFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddMediaStreamRequest == false)
            return false;
        AddMediaStreamRequest other = (AddMediaStreamRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getClockRate() == null ^ this.getClockRate() == null)
            return false;
        if (other.getClockRate() != null && other.getClockRate().equals(this.getClockRate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMediaStreamId() == null ^ this.getMediaStreamId() == null)
            return false;
        if (other.getMediaStreamId() != null && other.getMediaStreamId().equals(this.getMediaStreamId()) == false)
            return false;
        if (other.getMediaStreamName() == null ^ this.getMediaStreamName() == null)
            return false;
        if (other.getMediaStreamName() != null && other.getMediaStreamName().equals(this.getMediaStreamName()) == false)
            return false;
        if (other.getMediaStreamType() == null ^ this.getMediaStreamType() == null)
            return false;
        if (other.getMediaStreamType() != null && other.getMediaStreamType().equals(this.getMediaStreamType()) == false)
            return false;
        if (other.getVideoFormat() == null ^ this.getVideoFormat() == null)
            return false;
        if (other.getVideoFormat() != null && other.getVideoFormat().equals(this.getVideoFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getClockRate() == null) ? 0 : getClockRate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamId() == null) ? 0 : getMediaStreamId().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamName() == null) ? 0 : getMediaStreamName().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamType() == null) ? 0 : getMediaStreamType().hashCode());
        hashCode = prime * hashCode + ((getVideoFormat() == null) ? 0 : getVideoFormat().hashCode());
        return hashCode;
    }

    @Override
    public AddMediaStreamRequest clone() {
        try {
            return (AddMediaStreamRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.AddMediaStreamRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
