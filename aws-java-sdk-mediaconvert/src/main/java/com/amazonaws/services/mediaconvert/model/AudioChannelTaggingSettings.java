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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. When you don't specify a
 * value, MediaConvert labels your track as Center (C) by default. To use Audio layout tagging, your output must be in a
 * QuickTime (MOV) container and your audio codec must be AAC, WAV, or AIFF.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AudioChannelTaggingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioChannelTaggingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     */
    private String channelTag;
    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     */
    private java.util.List<String> channelTags;

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @param channelTag
     *        Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *        layout tags in the same order as your output's audio channel order. For example, if your output audio
     *        track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *        If your output has multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * @see AudioChannelTag
     */

    public void setChannelTag(String channelTag) {
        this.channelTag = channelTag;
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @return Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *         layout tags in the same order as your output's audio channel order. For example, if your output audio
     *         track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *         If your output has multiple single-channel audio tracks, enter a single channel layout tag for each
     *         track.
     * @see AudioChannelTag
     */

    public String getChannelTag() {
        return this.channelTag;
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @param channelTag
     *        Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *        layout tags in the same order as your output's audio channel order. For example, if your output audio
     *        track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *        If your output has multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelTag
     */

    public AudioChannelTaggingSettings withChannelTag(String channelTag) {
        setChannelTag(channelTag);
        return this;
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @param channelTag
     *        Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *        layout tags in the same order as your output's audio channel order. For example, if your output audio
     *        track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *        If your output has multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelTag
     */

    public AudioChannelTaggingSettings withChannelTag(AudioChannelTag channelTag) {
        this.channelTag = channelTag.toString();
        return this;
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @return Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *         layout tags in the same order as your output's audio channel order. For example, if your output audio
     *         track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *         If your output has multiple single-channel audio tracks, enter a single channel layout tag for each
     *         track.
     * @see AudioChannelTag
     */

    public java.util.List<String> getChannelTags() {
        return channelTags;
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @param channelTags
     *        Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *        layout tags in the same order as your output's audio channel order. For example, if your output audio
     *        track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *        If your output has multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * @see AudioChannelTag
     */

    public void setChannelTags(java.util.Collection<String> channelTags) {
        if (channelTags == null) {
            this.channelTags = null;
            return;
        }

        this.channelTags = new java.util.ArrayList<String>(channelTags);
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannelTags(java.util.Collection)} or {@link #withChannelTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param channelTags
     *        Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *        layout tags in the same order as your output's audio channel order. For example, if your output audio
     *        track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *        If your output has multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelTag
     */

    public AudioChannelTaggingSettings withChannelTags(String... channelTags) {
        if (this.channelTags == null) {
            setChannelTags(new java.util.ArrayList<String>(channelTags.length));
        }
        for (String ele : channelTags) {
            this.channelTags.add(ele);
        }
        return this;
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @param channelTags
     *        Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *        layout tags in the same order as your output's audio channel order. For example, if your output audio
     *        track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *        If your output has multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelTag
     */

    public AudioChannelTaggingSettings withChannelTags(java.util.Collection<String> channelTags) {
        setChannelTags(channelTags);
        return this;
    }

    /**
     * Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel layout
     * tags in the same order as your output's audio channel order. For example, if your output audio track has a left
     * and a right channel, enter Left (L) for the first channel and Right (R) for the second. If your output has
     * multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * 
     * @param channelTags
     *        Specify the QuickTime audio channel layout tags for the audio channels in this audio track. Enter channel
     *        layout tags in the same order as your output's audio channel order. For example, if your output audio
     *        track has a left and a right channel, enter Left (L) for the first channel and Right (R) for the second.
     *        If your output has multiple single-channel audio tracks, enter a single channel layout tag for each track.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelTag
     */

    public AudioChannelTaggingSettings withChannelTags(AudioChannelTag... channelTags) {
        java.util.ArrayList<String> channelTagsCopy = new java.util.ArrayList<String>(channelTags.length);
        for (AudioChannelTag value : channelTags) {
            channelTagsCopy.add(value.toString());
        }
        if (getChannelTags() == null) {
            setChannelTags(channelTagsCopy);
        } else {
            getChannelTags().addAll(channelTagsCopy);
        }
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
            sb.append("ChannelTag: ").append(getChannelTag()).append(",");
        if (getChannelTags() != null)
            sb.append("ChannelTags: ").append(getChannelTags());
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
        if (other.getChannelTags() == null ^ this.getChannelTags() == null)
            return false;
        if (other.getChannelTags() != null && other.getChannelTags().equals(this.getChannelTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelTag() == null) ? 0 : getChannelTag().hashCode());
        hashCode = prime * hashCode + ((getChannelTags() == null) ? 0 : getChannelTags().hashCode());
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
