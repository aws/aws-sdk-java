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
 * A single track or stream of media that contains video, audio, or ancillary data. After you add a media stream to a
 * flow, you can associate it with sources and outputs on that flow, as long as they use the CDI protocol or the ST 2110
 * JPEG XS protocol. Each source or output can consist of one or many media streams.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/MediaStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaStream implements Serializable, Cloneable, StructuredPojo {

    /** Attributes that are related to the media stream. */
    private MediaStreamAttributes attributes;
    /** The sample rate for the stream. This value is measured in Hz. */
    private Integer clockRate;
    /** A description that can help you quickly identify what your media stream is used for. */
    private String description;
    /**
     * The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect assigns this
     * value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to the receiver.
     */
    private Integer fmt;
    /** A unique identifier for the media stream. */
    private Integer mediaStreamId;
    /** A name that helps you distinguish one media stream from another. */
    private String mediaStreamName;
    /** The type of media stream. */
    private String mediaStreamType;
    /** The resolution of the video. */
    private String videoFormat;

    /**
     * Attributes that are related to the media stream.
     * 
     * @param attributes
     *        Attributes that are related to the media stream.
     */

    public void setAttributes(MediaStreamAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Attributes that are related to the media stream.
     * 
     * @return Attributes that are related to the media stream.
     */

    public MediaStreamAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * Attributes that are related to the media stream.
     * 
     * @param attributes
     *        Attributes that are related to the media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStream withAttributes(MediaStreamAttributes attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * The sample rate for the stream. This value is measured in Hz.
     * 
     * @param clockRate
     *        The sample rate for the stream. This value is measured in Hz.
     */

    public void setClockRate(Integer clockRate) {
        this.clockRate = clockRate;
    }

    /**
     * The sample rate for the stream. This value is measured in Hz.
     * 
     * @return The sample rate for the stream. This value is measured in Hz.
     */

    public Integer getClockRate() {
        return this.clockRate;
    }

    /**
     * The sample rate for the stream. This value is measured in Hz.
     * 
     * @param clockRate
     *        The sample rate for the stream. This value is measured in Hz.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStream withClockRate(Integer clockRate) {
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

    public MediaStream withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect assigns this
     * value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to the receiver.
     * 
     * @param fmt
     *        The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect
     *        assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to the
     *        receiver.
     */

    public void setFmt(Integer fmt) {
        this.fmt = fmt;
    }

    /**
     * The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect assigns this
     * value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to the receiver.
     * 
     * @return The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect
     *         assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to
     *         the receiver.
     */

    public Integer getFmt() {
        return this.fmt;
    }

    /**
     * The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect assigns this
     * value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to the receiver.
     * 
     * @param fmt
     *        The format type number (sometimes referred to as RTP payload type) of the media stream. MediaConnect
     *        assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need to provide this value to the
     *        receiver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStream withFmt(Integer fmt) {
        setFmt(fmt);
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

    public MediaStream withMediaStreamId(Integer mediaStreamId) {
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

    public MediaStream withMediaStreamName(String mediaStreamName) {
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

    public MediaStream withMediaStreamType(String mediaStreamType) {
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

    public MediaStream withMediaStreamType(MediaStreamType mediaStreamType) {
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

    public MediaStream withVideoFormat(String videoFormat) {
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
        if (getFmt() != null)
            sb.append("Fmt: ").append(getFmt()).append(",");
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

        if (obj instanceof MediaStream == false)
            return false;
        MediaStream other = (MediaStream) obj;
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
        if (other.getFmt() == null ^ this.getFmt() == null)
            return false;
        if (other.getFmt() != null && other.getFmt().equals(this.getFmt()) == false)
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
        hashCode = prime * hashCode + ((getFmt() == null) ? 0 : getFmt().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamId() == null) ? 0 : getMediaStreamId().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamName() == null) ? 0 : getMediaStreamName().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamType() == null) ? 0 : getMediaStreamType().hashCode());
        hashCode = prime * hashCode + ((getVideoFormat() == null) ? 0 : getVideoFormat().hashCode());
        return hashCode;
    }

    @Override
    public MediaStream clone() {
        try {
            return (MediaStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.MediaStreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
