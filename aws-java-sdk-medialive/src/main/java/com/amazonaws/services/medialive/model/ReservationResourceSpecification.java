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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Resource configuration (codec, resolution, bitrate, ...)
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ReservationResourceSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationResourceSpecification implements Serializable, Cloneable, StructuredPojo {

    /** Channel class, e.g. 'STANDARD' */
    private String channelClass;
    /** Codec, e.g. 'AVC' */
    private String codec;
    /** Maximum bitrate, e.g. 'MAX_20_MBPS' */
    private String maximumBitrate;
    /** Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only) */
    private String maximumFramerate;
    /** Resolution, e.g. 'HD' */
    private String resolution;
    /** Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL' */
    private String resourceType;
    /** Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only) */
    private String specialFeature;
    /** Video quality, e.g. 'STANDARD' (Outputs only) */
    private String videoQuality;

    /**
     * Channel class, e.g. 'STANDARD'
     * 
     * @param channelClass
     *        Channel class, e.g. 'STANDARD'
     * @see ChannelClass
     */

    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * Channel class, e.g. 'STANDARD'
     * 
     * @return Channel class, e.g. 'STANDARD'
     * @see ChannelClass
     */

    public String getChannelClass() {
        return this.channelClass;
    }

    /**
     * Channel class, e.g. 'STANDARD'
     * 
     * @param channelClass
     *        Channel class, e.g. 'STANDARD'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelClass
     */

    public ReservationResourceSpecification withChannelClass(String channelClass) {
        setChannelClass(channelClass);
        return this;
    }

    /**
     * Channel class, e.g. 'STANDARD'
     * 
     * @param channelClass
     *        Channel class, e.g. 'STANDARD'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelClass
     */

    public ReservationResourceSpecification withChannelClass(ChannelClass channelClass) {
        this.channelClass = channelClass.toString();
        return this;
    }

    /**
     * Codec, e.g. 'AVC'
     * 
     * @param codec
     *        Codec, e.g. 'AVC'
     * @see ReservationCodec
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Codec, e.g. 'AVC'
     * 
     * @return Codec, e.g. 'AVC'
     * @see ReservationCodec
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * Codec, e.g. 'AVC'
     * 
     * @param codec
     *        Codec, e.g. 'AVC'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationCodec
     */

    public ReservationResourceSpecification withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * Codec, e.g. 'AVC'
     * 
     * @param codec
     *        Codec, e.g. 'AVC'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationCodec
     */

    public ReservationResourceSpecification withCodec(ReservationCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * 
     * @param maximumBitrate
     *        Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @see ReservationMaximumBitrate
     */

    public void setMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * 
     * @return Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @see ReservationMaximumBitrate
     */

    public String getMaximumBitrate() {
        return this.maximumBitrate;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * 
     * @param maximumBitrate
     *        Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationMaximumBitrate
     */

    public ReservationResourceSpecification withMaximumBitrate(String maximumBitrate) {
        setMaximumBitrate(maximumBitrate);
        return this;
    }

    /**
     * Maximum bitrate, e.g. 'MAX_20_MBPS'
     * 
     * @param maximumBitrate
     *        Maximum bitrate, e.g. 'MAX_20_MBPS'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationMaximumBitrate
     */

    public ReservationResourceSpecification withMaximumBitrate(ReservationMaximumBitrate maximumBitrate) {
        this.maximumBitrate = maximumBitrate.toString();
        return this;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * 
     * @param maximumFramerate
     *        Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * @see ReservationMaximumFramerate
     */

    public void setMaximumFramerate(String maximumFramerate) {
        this.maximumFramerate = maximumFramerate;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * 
     * @return Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * @see ReservationMaximumFramerate
     */

    public String getMaximumFramerate() {
        return this.maximumFramerate;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * 
     * @param maximumFramerate
     *        Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationMaximumFramerate
     */

    public ReservationResourceSpecification withMaximumFramerate(String maximumFramerate) {
        setMaximumFramerate(maximumFramerate);
        return this;
    }

    /**
     * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * 
     * @param maximumFramerate
     *        Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationMaximumFramerate
     */

    public ReservationResourceSpecification withMaximumFramerate(ReservationMaximumFramerate maximumFramerate) {
        this.maximumFramerate = maximumFramerate.toString();
        return this;
    }

    /**
     * Resolution, e.g. 'HD'
     * 
     * @param resolution
     *        Resolution, e.g. 'HD'
     * @see ReservationResolution
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Resolution, e.g. 'HD'
     * 
     * @return Resolution, e.g. 'HD'
     * @see ReservationResolution
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * Resolution, e.g. 'HD'
     * 
     * @param resolution
     *        Resolution, e.g. 'HD'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationResolution
     */

    public ReservationResourceSpecification withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * Resolution, e.g. 'HD'
     * 
     * @param resolution
     *        Resolution, e.g. 'HD'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationResolution
     */

    public ReservationResourceSpecification withResolution(ReservationResolution resolution) {
        this.resolution = resolution.toString();
        return this;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * 
     * @param resourceType
     *        Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * @see ReservationResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * 
     * @return Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * @see ReservationResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * 
     * @param resourceType
     *        Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationResourceType
     */

    public ReservationResourceSpecification withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * 
     * @param resourceType
     *        Resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationResourceType
     */

    public ReservationResourceSpecification withResourceType(ReservationResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * 
     * @param specialFeature
     *        Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * @see ReservationSpecialFeature
     */

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * 
     * @return Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * @see ReservationSpecialFeature
     */

    public String getSpecialFeature() {
        return this.specialFeature;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * 
     * @param specialFeature
     *        Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationSpecialFeature
     */

    public ReservationResourceSpecification withSpecialFeature(String specialFeature) {
        setSpecialFeature(specialFeature);
        return this;
    }

    /**
     * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * 
     * @param specialFeature
     *        Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationSpecialFeature
     */

    public ReservationResourceSpecification withSpecialFeature(ReservationSpecialFeature specialFeature) {
        this.specialFeature = specialFeature.toString();
        return this;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * 
     * @param videoQuality
     *        Video quality, e.g. 'STANDARD' (Outputs only)
     * @see ReservationVideoQuality
     */

    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * 
     * @return Video quality, e.g. 'STANDARD' (Outputs only)
     * @see ReservationVideoQuality
     */

    public String getVideoQuality() {
        return this.videoQuality;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * 
     * @param videoQuality
     *        Video quality, e.g. 'STANDARD' (Outputs only)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationVideoQuality
     */

    public ReservationResourceSpecification withVideoQuality(String videoQuality) {
        setVideoQuality(videoQuality);
        return this;
    }

    /**
     * Video quality, e.g. 'STANDARD' (Outputs only)
     * 
     * @param videoQuality
     *        Video quality, e.g. 'STANDARD' (Outputs only)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReservationVideoQuality
     */

    public ReservationResourceSpecification withVideoQuality(ReservationVideoQuality videoQuality) {
        this.videoQuality = videoQuality.toString();
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: ").append(getChannelClass()).append(",");
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: ").append(getMaximumBitrate()).append(",");
        if (getMaximumFramerate() != null)
            sb.append("MaximumFramerate: ").append(getMaximumFramerate()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSpecialFeature() != null)
            sb.append("SpecialFeature: ").append(getSpecialFeature()).append(",");
        if (getVideoQuality() != null)
            sb.append("VideoQuality: ").append(getVideoQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationResourceSpecification == false)
            return false;
        ReservationResourceSpecification other = (ReservationResourceSpecification) obj;
        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getMaximumBitrate() == null ^ this.getMaximumBitrate() == null)
            return false;
        if (other.getMaximumBitrate() != null && other.getMaximumBitrate().equals(this.getMaximumBitrate()) == false)
            return false;
        if (other.getMaximumFramerate() == null ^ this.getMaximumFramerate() == null)
            return false;
        if (other.getMaximumFramerate() != null && other.getMaximumFramerate().equals(this.getMaximumFramerate()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSpecialFeature() == null ^ this.getSpecialFeature() == null)
            return false;
        if (other.getSpecialFeature() != null && other.getSpecialFeature().equals(this.getSpecialFeature()) == false)
            return false;
        if (other.getVideoQuality() == null ^ this.getVideoQuality() == null)
            return false;
        if (other.getVideoQuality() != null && other.getVideoQuality().equals(this.getVideoQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode + ((getMaximumFramerate() == null) ? 0 : getMaximumFramerate().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSpecialFeature() == null) ? 0 : getSpecialFeature().hashCode());
        hashCode = prime * hashCode + ((getVideoQuality() == null) ? 0 : getVideoQuality().hashCode());
        return hashCode;
    }

    @Override
    public ReservationResourceSpecification clone() {
        try {
            return (ReservationResourceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ReservationResourceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
