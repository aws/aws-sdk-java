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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * When you mimic a multi-channel audio layout with multiple mono-channel tracks, you can tag each channel layout
 * manually. For example, you would tag the tracks that contain your left, right, and center audio with Left (L), Right
 * (R), and Center (C), respectively. When you don't specify a value, MediaConvert labels your track as Center (C) by
 * default. To use audio layout tagging, your output must be in a QuickTime (.mov) container; your audio codec must be
 * AAC, WAV, or AIFF; and you must set up your audio track to have only one channel.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AudioChannelTaggingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioChannelTaggingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     * example, if this track is the left surround channel, choose Left surround (LS).
     */
    private String channelTag;

    /**
     * You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     * example, if this track is the left surround channel, choose Left surround (LS).
     * 
     * @param channelTag
     *        You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     *        example, if this track is the left surround channel, choose Left surround (LS).
     * @see AudioChannelTag
     */

    public void setChannelTag(String channelTag) {
        this.channelTag = channelTag;
    }

    /**
     * You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     * example, if this track is the left surround channel, choose Left surround (LS).
     * 
     * @return You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     *         example, if this track is the left surround channel, choose Left surround (LS).
     * @see AudioChannelTag
     */

    public String getChannelTag() {
        return this.channelTag;
    }

    /**
     * You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     * example, if this track is the left surround channel, choose Left surround (LS).
     * 
     * @param channelTag
     *        You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     *        example, if this track is the left surround channel, choose Left surround (LS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelTag
     */

    public AudioChannelTaggingSettings withChannelTag(String channelTag) {
        setChannelTag(channelTag);
        return this;
    }

    /**
     * You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     * example, if this track is the left surround channel, choose Left surround (LS).
     * 
     * @param channelTag
     *        You can add a tag for this mono-channel audio track to mimic its placement in a multi-channel layout. For
     *        example, if this track is the left surround channel, choose Left surround (LS).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelTag
     */

    public AudioChannelTaggingSettings withChannelTag(AudioChannelTag channelTag) {
        this.channelTag = channelTag.toString();
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
        if (getChannelTag() != null)
            sb.append("ChannelTag: ").append(getChannelTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioChannelTaggingSettings == false)
            return false;
        AudioChannelTaggingSettings other = (AudioChannelTaggingSettings) obj;
        if (other.getChannelTag() == null ^ this.getChannelTag() == null)
            return false;
        if (other.getChannelTag() != null && other.getChannelTag().equals(this.getChannelTag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelTag() == null) ? 0 : getChannelTag().hashCode());
        return hashCode;
    }

    @Override
    public AudioChannelTaggingSettings clone() {
        try {
            return (AudioChannelTaggingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AudioChannelTaggingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
