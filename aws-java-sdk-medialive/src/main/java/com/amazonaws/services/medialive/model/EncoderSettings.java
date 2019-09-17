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
 * Encoder Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/EncoderSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncoderSettings implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<AudioDescription> audioDescriptions;
    /** Settings for ad avail blanking. */
    private AvailBlanking availBlanking;
    /** Event-wide configuration settings for ad avail insertion. */
    private AvailConfiguration availConfiguration;
    /** Settings for blackout slate. */
    private BlackoutSlate blackoutSlate;
    /** Settings for caption decriptions */
    private java.util.List<CaptionDescription> captionDescriptions;
    /** Configuration settings that apply to the event as a whole. */
    private GlobalConfiguration globalConfiguration;

    private java.util.List<OutputGroup> outputGroups;
    /** Contains settings used to acquire and adjust timecode information from inputs. */
    private TimecodeConfig timecodeConfig;

    private java.util.List<VideoDescription> videoDescriptions;

    /**
     * @return
     */

    public java.util.List<AudioDescription> getAudioDescriptions() {
        return audioDescriptions;
    }

    /**
     * @param audioDescriptions
     */

    public void setAudioDescriptions(java.util.Collection<AudioDescription> audioDescriptions) {
        if (audioDescriptions == null) {
            this.audioDescriptions = null;
            return;
        }

        this.audioDescriptions = new java.util.ArrayList<AudioDescription>(audioDescriptions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioDescriptions(java.util.Collection)} or {@link #withAudioDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param audioDescriptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withAudioDescriptions(AudioDescription... audioDescriptions) {
        if (this.audioDescriptions == null) {
            setAudioDescriptions(new java.util.ArrayList<AudioDescription>(audioDescriptions.length));
        }
        for (AudioDescription ele : audioDescriptions) {
            this.audioDescriptions.add(ele);
        }
        return this;
    }

    /**
     * @param audioDescriptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withAudioDescriptions(java.util.Collection<AudioDescription> audioDescriptions) {
        setAudioDescriptions(audioDescriptions);
        return this;
    }

    /**
     * Settings for ad avail blanking.
     * 
     * @param availBlanking
     *        Settings for ad avail blanking.
     */

    public void setAvailBlanking(AvailBlanking availBlanking) {
        this.availBlanking = availBlanking;
    }

    /**
     * Settings for ad avail blanking.
     * 
     * @return Settings for ad avail blanking.
     */

    public AvailBlanking getAvailBlanking() {
        return this.availBlanking;
    }

    /**
     * Settings for ad avail blanking.
     * 
     * @param availBlanking
     *        Settings for ad avail blanking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withAvailBlanking(AvailBlanking availBlanking) {
        setAvailBlanking(availBlanking);
        return this;
    }

    /**
     * Event-wide configuration settings for ad avail insertion.
     * 
     * @param availConfiguration
     *        Event-wide configuration settings for ad avail insertion.
     */

    public void setAvailConfiguration(AvailConfiguration availConfiguration) {
        this.availConfiguration = availConfiguration;
    }

    /**
     * Event-wide configuration settings for ad avail insertion.
     * 
     * @return Event-wide configuration settings for ad avail insertion.
     */

    public AvailConfiguration getAvailConfiguration() {
        return this.availConfiguration;
    }

    /**
     * Event-wide configuration settings for ad avail insertion.
     * 
     * @param availConfiguration
     *        Event-wide configuration settings for ad avail insertion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withAvailConfiguration(AvailConfiguration availConfiguration) {
        setAvailConfiguration(availConfiguration);
        return this;
    }

    /**
     * Settings for blackout slate.
     * 
     * @param blackoutSlate
     *        Settings for blackout slate.
     */

    public void setBlackoutSlate(BlackoutSlate blackoutSlate) {
        this.blackoutSlate = blackoutSlate;
    }

    /**
     * Settings for blackout slate.
     * 
     * @return Settings for blackout slate.
     */

    public BlackoutSlate getBlackoutSlate() {
        return this.blackoutSlate;
    }

    /**
     * Settings for blackout slate.
     * 
     * @param blackoutSlate
     *        Settings for blackout slate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withBlackoutSlate(BlackoutSlate blackoutSlate) {
        setBlackoutSlate(blackoutSlate);
        return this;
    }

    /**
     * Settings for caption decriptions
     * 
     * @return Settings for caption decriptions
     */

    public java.util.List<CaptionDescription> getCaptionDescriptions() {
        return captionDescriptions;
    }

    /**
     * Settings for caption decriptions
     * 
     * @param captionDescriptions
     *        Settings for caption decriptions
     */

    public void setCaptionDescriptions(java.util.Collection<CaptionDescription> captionDescriptions) {
        if (captionDescriptions == null) {
            this.captionDescriptions = null;
            return;
        }

        this.captionDescriptions = new java.util.ArrayList<CaptionDescription>(captionDescriptions);
    }

    /**
     * Settings for caption decriptions
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionDescriptions(java.util.Collection)} or {@link #withCaptionDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param captionDescriptions
     *        Settings for caption decriptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withCaptionDescriptions(CaptionDescription... captionDescriptions) {
        if (this.captionDescriptions == null) {
            setCaptionDescriptions(new java.util.ArrayList<CaptionDescription>(captionDescriptions.length));
        }
        for (CaptionDescription ele : captionDescriptions) {
            this.captionDescriptions.add(ele);
        }
        return this;
    }

    /**
     * Settings for caption decriptions
     * 
     * @param captionDescriptions
     *        Settings for caption decriptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withCaptionDescriptions(java.util.Collection<CaptionDescription> captionDescriptions) {
        setCaptionDescriptions(captionDescriptions);
        return this;
    }

    /**
     * Configuration settings that apply to the event as a whole.
     * 
     * @param globalConfiguration
     *        Configuration settings that apply to the event as a whole.
     */

    public void setGlobalConfiguration(GlobalConfiguration globalConfiguration) {
        this.globalConfiguration = globalConfiguration;
    }

    /**
     * Configuration settings that apply to the event as a whole.
     * 
     * @return Configuration settings that apply to the event as a whole.
     */

    public GlobalConfiguration getGlobalConfiguration() {
        return this.globalConfiguration;
    }

    /**
     * Configuration settings that apply to the event as a whole.
     * 
     * @param globalConfiguration
     *        Configuration settings that apply to the event as a whole.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withGlobalConfiguration(GlobalConfiguration globalConfiguration) {
        setGlobalConfiguration(globalConfiguration);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<OutputGroup> getOutputGroups() {
        return outputGroups;
    }

    /**
     * @param outputGroups
     */

    public void setOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        if (outputGroups == null) {
            this.outputGroups = null;
            return;
        }

        this.outputGroups = new java.util.ArrayList<OutputGroup>(outputGroups);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputGroups(java.util.Collection)} or {@link #withOutputGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param outputGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withOutputGroups(OutputGroup... outputGroups) {
        if (this.outputGroups == null) {
            setOutputGroups(new java.util.ArrayList<OutputGroup>(outputGroups.length));
        }
        for (OutputGroup ele : outputGroups) {
            this.outputGroups.add(ele);
        }
        return this;
    }

    /**
     * @param outputGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        setOutputGroups(outputGroups);
        return this;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from inputs.
     * 
     * @param timecodeConfig
     *        Contains settings used to acquire and adjust timecode information from inputs.
     */

    public void setTimecodeConfig(TimecodeConfig timecodeConfig) {
        this.timecodeConfig = timecodeConfig;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from inputs.
     * 
     * @return Contains settings used to acquire and adjust timecode information from inputs.
     */

    public TimecodeConfig getTimecodeConfig() {
        return this.timecodeConfig;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from inputs.
     * 
     * @param timecodeConfig
     *        Contains settings used to acquire and adjust timecode information from inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withTimecodeConfig(TimecodeConfig timecodeConfig) {
        setTimecodeConfig(timecodeConfig);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<VideoDescription> getVideoDescriptions() {
        return videoDescriptions;
    }

    /**
     * @param videoDescriptions
     */

    public void setVideoDescriptions(java.util.Collection<VideoDescription> videoDescriptions) {
        if (videoDescriptions == null) {
            this.videoDescriptions = null;
            return;
        }

        this.videoDescriptions = new java.util.ArrayList<VideoDescription>(videoDescriptions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVideoDescriptions(java.util.Collection)} or {@link #withVideoDescriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param videoDescriptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withVideoDescriptions(VideoDescription... videoDescriptions) {
        if (this.videoDescriptions == null) {
            setVideoDescriptions(new java.util.ArrayList<VideoDescription>(videoDescriptions.length));
        }
        for (VideoDescription ele : videoDescriptions) {
            this.videoDescriptions.add(ele);
        }
        return this;
    }

    /**
     * @param videoDescriptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncoderSettings withVideoDescriptions(java.util.Collection<VideoDescription> videoDescriptions) {
        setVideoDescriptions(videoDescriptions);
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
        if (getAvailBlanking() != null)
            sb.append("AvailBlanking: ").append(getAvailBlanking()).append(",");
        if (getAvailConfiguration() != null)
            sb.append("AvailConfiguration: ").append(getAvailConfiguration()).append(",");
        if (getBlackoutSlate() != null)
            sb.append("BlackoutSlate: ").append(getBlackoutSlate()).append(",");
        if (getCaptionDescriptions() != null)
            sb.append("CaptionDescriptions: ").append(getCaptionDescriptions()).append(",");
        if (getGlobalConfiguration() != null)
            sb.append("GlobalConfiguration: ").append(getGlobalConfiguration()).append(",");
        if (getOutputGroups() != null)
            sb.append("OutputGroups: ").append(getOutputGroups()).append(",");
        if (getTimecodeConfig() != null)
            sb.append("TimecodeConfig: ").append(getTimecodeConfig()).append(",");
        if (getVideoDescriptions() != null)
            sb.append("VideoDescriptions: ").append(getVideoDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncoderSettings == false)
            return false;
        EncoderSettings other = (EncoderSettings) obj;
        if (other.getAudioDescriptions() == null ^ this.getAudioDescriptions() == null)
            return false;
        if (other.getAudioDescriptions() != null && other.getAudioDescriptions().equals(this.getAudioDescriptions()) == false)
            return false;
        if (other.getAvailBlanking() == null ^ this.getAvailBlanking() == null)
            return false;
        if (other.getAvailBlanking() != null && other.getAvailBlanking().equals(this.getAvailBlanking()) == false)
            return false;
        if (other.getAvailConfiguration() == null ^ this.getAvailConfiguration() == null)
            return false;
        if (other.getAvailConfiguration() != null && other.getAvailConfiguration().equals(this.getAvailConfiguration()) == false)
            return false;
        if (other.getBlackoutSlate() == null ^ this.getBlackoutSlate() == null)
            return false;
        if (other.getBlackoutSlate() != null && other.getBlackoutSlate().equals(this.getBlackoutSlate()) == false)
            return false;
        if (other.getCaptionDescriptions() == null ^ this.getCaptionDescriptions() == null)
            return false;
        if (other.getCaptionDescriptions() != null && other.getCaptionDescriptions().equals(this.getCaptionDescriptions()) == false)
            return false;
        if (other.getGlobalConfiguration() == null ^ this.getGlobalConfiguration() == null)
            return false;
        if (other.getGlobalConfiguration() != null && other.getGlobalConfiguration().equals(this.getGlobalConfiguration()) == false)
            return false;
        if (other.getOutputGroups() == null ^ this.getOutputGroups() == null)
            return false;
        if (other.getOutputGroups() != null && other.getOutputGroups().equals(this.getOutputGroups()) == false)
            return false;
        if (other.getTimecodeConfig() == null ^ this.getTimecodeConfig() == null)
            return false;
        if (other.getTimecodeConfig() != null && other.getTimecodeConfig().equals(this.getTimecodeConfig()) == false)
            return false;
        if (other.getVideoDescriptions() == null ^ this.getVideoDescriptions() == null)
            return false;
        if (other.getVideoDescriptions() != null && other.getVideoDescriptions().equals(this.getVideoDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDescriptions() == null) ? 0 : getAudioDescriptions().hashCode());
        hashCode = prime * hashCode + ((getAvailBlanking() == null) ? 0 : getAvailBlanking().hashCode());
        hashCode = prime * hashCode + ((getAvailConfiguration() == null) ? 0 : getAvailConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBlackoutSlate() == null) ? 0 : getBlackoutSlate().hashCode());
        hashCode = prime * hashCode + ((getCaptionDescriptions() == null) ? 0 : getCaptionDescriptions().hashCode());
        hashCode = prime * hashCode + ((getGlobalConfiguration() == null) ? 0 : getGlobalConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOutputGroups() == null) ? 0 : getOutputGroups().hashCode());
        hashCode = prime * hashCode + ((getTimecodeConfig() == null) ? 0 : getTimecodeConfig().hashCode());
        hashCode = prime * hashCode + ((getVideoDescriptions() == null) ? 0 : getVideoDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public EncoderSettings clone() {
        try {
            return (EncoderSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.EncoderSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
