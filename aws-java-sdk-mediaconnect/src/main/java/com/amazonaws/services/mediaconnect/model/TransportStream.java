/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The metadata of an elementary transport stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/TransportStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransportStream implements Serializable, Cloneable, StructuredPojo {

    /** The number of channels in the audio stream. */
    private Integer channels;
    /** The codec used by the stream. */
    private String codec;
    /** The frame rate used by the video stream. */
    private String frameRate;

    private FrameResolution frameResolution;
    /** The Packet ID (PID) as it is reported in the Program Map Table. */
    private Integer pid;
    /** The sample rate used by the audio stream. */
    private Integer sampleRate;
    /** The sample bit size used by the audio stream. */
    private Integer sampleSize;
    /** The Stream Type as it is reported in the Program Map Table. */
    private String streamType;

    /**
     * The number of channels in the audio stream.
     * 
     * @param channels
     *        The number of channels in the audio stream.
     */

    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    /**
     * The number of channels in the audio stream.
     * 
     * @return The number of channels in the audio stream.
     */

    public Integer getChannels() {
        return this.channels;
    }

    /**
     * The number of channels in the audio stream.
     * 
     * @param channels
     *        The number of channels in the audio stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withChannels(Integer channels) {
        setChannels(channels);
        return this;
    }

    /**
     * The codec used by the stream.
     * 
     * @param codec
     *        The codec used by the stream.
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * The codec used by the stream.
     * 
     * @return The codec used by the stream.
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * The codec used by the stream.
     * 
     * @param codec
     *        The codec used by the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * The frame rate used by the video stream.
     * 
     * @param frameRate
     *        The frame rate used by the video stream.
     */

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * The frame rate used by the video stream.
     * 
     * @return The frame rate used by the video stream.
     */

    public String getFrameRate() {
        return this.frameRate;
    }

    /**
     * The frame rate used by the video stream.
     * 
     * @param frameRate
     *        The frame rate used by the video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withFrameRate(String frameRate) {
        setFrameRate(frameRate);
        return this;
    }

    /**
     * @param frameResolution
     */

    public void setFrameResolution(FrameResolution frameResolution) {
        this.frameResolution = frameResolution;
    }

    /**
     * @return
     */

    public FrameResolution getFrameResolution() {
        return this.frameResolution;
    }

    /**
     * @param frameResolution
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withFrameResolution(FrameResolution frameResolution) {
        setFrameResolution(frameResolution);
        return this;
    }

    /**
     * The Packet ID (PID) as it is reported in the Program Map Table.
     * 
     * @param pid
     *        The Packet ID (PID) as it is reported in the Program Map Table.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * The Packet ID (PID) as it is reported in the Program Map Table.
     * 
     * @return The Packet ID (PID) as it is reported in the Program Map Table.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * The Packet ID (PID) as it is reported in the Program Map Table.
     * 
     * @param pid
     *        The Packet ID (PID) as it is reported in the Program Map Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withPid(Integer pid) {
        setPid(pid);
        return this;
    }

    /**
     * The sample rate used by the audio stream.
     * 
     * @param sampleRate
     *        The sample rate used by the audio stream.
     */

    public void setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
    }

    /**
     * The sample rate used by the audio stream.
     * 
     * @return The sample rate used by the audio stream.
     */

    public Integer getSampleRate() {
        return this.sampleRate;
    }

    /**
     * The sample rate used by the audio stream.
     * 
     * @param sampleRate
     *        The sample rate used by the audio stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withSampleRate(Integer sampleRate) {
        setSampleRate(sampleRate);
        return this;
    }

    /**
     * The sample bit size used by the audio stream.
     * 
     * @param sampleSize
     *        The sample bit size used by the audio stream.
     */

    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
    }

    /**
     * The sample bit size used by the audio stream.
     * 
     * @return The sample bit size used by the audio stream.
     */

    public Integer getSampleSize() {
        return this.sampleSize;
    }

    /**
     * The sample bit size used by the audio stream.
     * 
     * @param sampleSize
     *        The sample bit size used by the audio stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withSampleSize(Integer sampleSize) {
        setSampleSize(sampleSize);
        return this;
    }

    /**
     * The Stream Type as it is reported in the Program Map Table.
     * 
     * @param streamType
     *        The Stream Type as it is reported in the Program Map Table.
     */

    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    /**
     * The Stream Type as it is reported in the Program Map Table.
     * 
     * @return The Stream Type as it is reported in the Program Map Table.
     */

    public String getStreamType() {
        return this.streamType;
    }

    /**
     * The Stream Type as it is reported in the Program Map Table.
     * 
     * @param streamType
     *        The Stream Type as it is reported in the Program Map Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStream withStreamType(String streamType) {
        setStreamType(streamType);
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
        if (getChannels() != null)
            sb.append("Channels: ").append(getChannels()).append(",");
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getFrameRate() != null)
            sb.append("FrameRate: ").append(getFrameRate()).append(",");
        if (getFrameResolution() != null)
            sb.append("FrameResolution: ").append(getFrameResolution()).append(",");
        if (getPid() != null)
            sb.append("Pid: ").append(getPid()).append(",");
        if (getSampleRate() != null)
            sb.append("SampleRate: ").append(getSampleRate()).append(",");
        if (getSampleSize() != null)
            sb.append("SampleSize: ").append(getSampleSize()).append(",");
        if (getStreamType() != null)
            sb.append("StreamType: ").append(getStreamType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransportStream == false)
            return false;
        TransportStream other = (TransportStream) obj;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getFrameRate() == null ^ this.getFrameRate() == null)
            return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false)
            return false;
        if (other.getFrameResolution() == null ^ this.getFrameResolution() == null)
            return false;
        if (other.getFrameResolution() != null && other.getFrameResolution().equals(this.getFrameResolution()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getSampleRate() == null ^ this.getSampleRate() == null)
            return false;
        if (other.getSampleRate() != null && other.getSampleRate().equals(this.getSampleRate()) == false)
            return false;
        if (other.getSampleSize() == null ^ this.getSampleSize() == null)
            return false;
        if (other.getSampleSize() != null && other.getSampleSize().equals(this.getSampleSize()) == false)
            return false;
        if (other.getStreamType() == null ^ this.getStreamType() == null)
            return false;
        if (other.getStreamType() != null && other.getStreamType().equals(this.getStreamType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode());
        hashCode = prime * hashCode + ((getFrameResolution() == null) ? 0 : getFrameResolution().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getSampleRate() == null) ? 0 : getSampleRate().hashCode());
        hashCode = prime * hashCode + ((getSampleSize() == null) ? 0 : getSampleSize().hashCode());
        hashCode = prime * hashCode + ((getStreamType() == null) ? 0 : getStreamType().hashCode());
        return hashCode;
    }

    @Override
    public TransportStream clone() {
        try {
            return (TransportStream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.TransportStreamMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
