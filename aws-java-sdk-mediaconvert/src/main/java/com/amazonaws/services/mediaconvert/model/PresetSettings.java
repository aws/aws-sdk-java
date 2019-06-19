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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for preset
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/PresetSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PresetSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of
     * (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
     */
    private java.util.List<AudioDescription> audioDescriptions;
    /** Caption settings for this preset. There can be multiple caption settings in a single output. */
    private java.util.List<CaptionDescriptionPreset> captionDescriptions;
    /** Container specific settings. */
    private ContainerSettings containerSettings;
    /**
     * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video
     * codec you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per
     * output.
     */
    private VideoDescription videoDescription;

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of
     * (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
     * 
     * @return (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one
     *         instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding
     *         settings.
     */

    public java.util.List<AudioDescription> getAudioDescriptions() {
        return audioDescriptions;
    }

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of
     * (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
     * 
     * @param audioDescriptions
     *        (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one
     *        instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding
     *        settings.
     */

    public void setAudioDescriptions(java.util.Collection<AudioDescription> audioDescriptions) {
        if (audioDescriptions == null) {
            this.audioDescriptions = null;
            return;
        }

        this.audioDescriptions = new java.util.ArrayList<AudioDescription>(audioDescriptions);
    }

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of
     * (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioDescriptions(java.util.Collection)} or {@link #withAudioDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param audioDescriptions
     *        (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one
     *        instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetSettings withAudioDescriptions(AudioDescription... audioDescriptions) {
        if (this.audioDescriptions == null) {
            setAudioDescriptions(new java.util.ArrayList<AudioDescription>(audioDescriptions.length));
        }
        for (AudioDescription ele : audioDescriptions) {
            this.audioDescriptions.add(ele);
        }
        return this;
    }

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of
     * (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
     * 
     * @param audioDescriptions
     *        (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one
     *        instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetSettings withAudioDescriptions(java.util.Collection<AudioDescription> audioDescriptions) {
        setAudioDescriptions(audioDescriptions);
        return this;
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings in a single output.
     * 
     * @return Caption settings for this preset. There can be multiple caption settings in a single output.
     */

    public java.util.List<CaptionDescriptionPreset> getCaptionDescriptions() {
        return captionDescriptions;
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings in a single output.
     * 
     * @param captionDescriptions
     *        Caption settings for this preset. There can be multiple caption settings in a single output.
     */

    public void setCaptionDescriptions(java.util.Collection<CaptionDescriptionPreset> captionDescriptions) {
        if (captionDescriptions == null) {
            this.captionDescriptions = null;
            return;
        }

        this.captionDescriptions = new java.util.ArrayList<CaptionDescriptionPreset>(captionDescriptions);
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings in a single output.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionDescriptions(java.util.Collection)} or {@link #withCaptionDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param captionDescriptions
     *        Caption settings for this preset. There can be multiple caption settings in a single output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetSettings withCaptionDescriptions(CaptionDescriptionPreset... captionDescriptions) {
        if (this.captionDescriptions == null) {
            setCaptionDescriptions(new java.util.ArrayList<CaptionDescriptionPreset>(captionDescriptions.length));
        }
        for (CaptionDescriptionPreset ele : captionDescriptions) {
            this.captionDescriptions.add(ele);
        }
        return this;
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings in a single output.
     * 
     * @param captionDescriptions
     *        Caption settings for this preset. There can be multiple caption settings in a single output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetSettings withCaptionDescriptions(java.util.Collection<CaptionDescriptionPreset> captionDescriptions) {
        setCaptionDescriptions(captionDescriptions);
        return this;
    }

    /**
     * Container specific settings.
     * 
     * @param containerSettings
     *        Container specific settings.
     */

    public void setContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
    }

    /**
     * Container specific settings.
     * 
     * @return Container specific settings.
     */

    public ContainerSettings getContainerSettings() {
        return this.containerSettings;
    }

    /**
     * Container specific settings.
     * 
     * @param containerSettings
     *        Container specific settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetSettings withContainerSettings(ContainerSettings containerSettings) {
        setContainerSettings(containerSettings);
        return this;
    }

    /**
     * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video
     * codec you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per
     * output.
     * 
     * @param videoDescription
     *        (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the
     *        video codec you choose when you specify a value for Video codec (codec). Include one instance of
     *        (VideoDescription) per output.
     */

    public void setVideoDescription(VideoDescription videoDescription) {
        this.videoDescription = videoDescription;
    }

    /**
     * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video
     * codec you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per
     * output.
     * 
     * @return (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the
     *         video codec you choose when you specify a value for Video codec (codec). Include one instance of
     *         (VideoDescription) per output.
     */

    public VideoDescription getVideoDescription() {
        return this.videoDescription;
    }

    /**
     * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video
     * codec you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per
     * output.
     * 
     * @param videoDescription
     *        (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the
     *        video codec you choose when you specify a value for Video codec (codec). Include one instance of
     *        (VideoDescription) per output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PresetSettings withVideoDescription(VideoDescription videoDescription) {
        setVideoDescription(videoDescription);
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
        if (getAudioDescriptions() != null)
            sb.append("AudioDescriptions: ").append(getAudioDescriptions()).append(",");
        if (getCaptionDescriptions() != null)
            sb.append("CaptionDescriptions: ").append(getCaptionDescriptions()).append(",");
        if (getContainerSettings() != null)
            sb.append("ContainerSettings: ").append(getContainerSettings()).append(",");
        if (getVideoDescription() != null)
            sb.append("VideoDescription: ").append(getVideoDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PresetSettings == false)
            return false;
        PresetSettings other = (PresetSettings) obj;
        if (other.getAudioDescriptions() == null ^ this.getAudioDescriptions() == null)
            return false;
        if (other.getAudioDescriptions() != null && other.getAudioDescriptions().equals(this.getAudioDescriptions()) == false)
            return false;
        if (other.getCaptionDescriptions() == null ^ this.getCaptionDescriptions() == null)
            return false;
        if (other.getCaptionDescriptions() != null && other.getCaptionDescriptions().equals(this.getCaptionDescriptions()) == false)
            return false;
        if (other.getContainerSettings() == null ^ this.getContainerSettings() == null)
            return false;
        if (other.getContainerSettings() != null && other.getContainerSettings().equals(this.getContainerSettings()) == false)
            return false;
        if (other.getVideoDescription() == null ^ this.getVideoDescription() == null)
            return false;
        if (other.getVideoDescription() != null && other.getVideoDescription().equals(this.getVideoDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDescriptions() == null) ? 0 : getAudioDescriptions().hashCode());
        hashCode = prime * hashCode + ((getCaptionDescriptions() == null) ? 0 : getCaptionDescriptions().hashCode());
        hashCode = prime * hashCode + ((getContainerSettings() == null) ? 0 : getContainerSettings().hashCode());
        hashCode = prime * hashCode + ((getVideoDescription() == null) ? 0 : getVideoDescription().hashCode());
        return hashCode;
    }

    @Override
    public PresetSettings clone() {
        try {
            return (PresetSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.PresetSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
