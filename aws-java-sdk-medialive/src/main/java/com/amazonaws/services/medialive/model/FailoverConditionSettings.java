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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for one failover condition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FailoverConditionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverConditionSettings implements Serializable, Cloneable, StructuredPojo {

    /** MediaLive will perform a failover if the specified audio selector is silent for the specified period. */
    private AudioSilenceFailoverSettings audioSilenceSettings;
    /** MediaLive will perform a failover if content is not detected in this input for the specified period. */
    private InputLossFailoverSettings inputLossSettings;
    /** MediaLive will perform a failover if content is considered black for the specified period. */
    private VideoBlackFailoverSettings videoBlackSettings;

    /**
     * MediaLive will perform a failover if the specified audio selector is silent for the specified period.
     * 
     * @param audioSilenceSettings
     *        MediaLive will perform a failover if the specified audio selector is silent for the specified period.
     */

    public void setAudioSilenceSettings(AudioSilenceFailoverSettings audioSilenceSettings) {
        this.audioSilenceSettings = audioSilenceSettings;
    }

    /**
     * MediaLive will perform a failover if the specified audio selector is silent for the specified period.
     * 
     * @return MediaLive will perform a failover if the specified audio selector is silent for the specified period.
     */

    public AudioSilenceFailoverSettings getAudioSilenceSettings() {
        return this.audioSilenceSettings;
    }

    /**
     * MediaLive will perform a failover if the specified audio selector is silent for the specified period.
     * 
     * @param audioSilenceSettings
     *        MediaLive will perform a failover if the specified audio selector is silent for the specified period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverConditionSettings withAudioSilenceSettings(AudioSilenceFailoverSettings audioSilenceSettings) {
        setAudioSilenceSettings(audioSilenceSettings);
        return this;
    }

    /**
     * MediaLive will perform a failover if content is not detected in this input for the specified period.
     * 
     * @param inputLossSettings
     *        MediaLive will perform a failover if content is not detected in this input for the specified period.
     */

    public void setInputLossSettings(InputLossFailoverSettings inputLossSettings) {
        this.inputLossSettings = inputLossSettings;
    }

    /**
     * MediaLive will perform a failover if content is not detected in this input for the specified period.
     * 
     * @return MediaLive will perform a failover if content is not detected in this input for the specified period.
     */

    public InputLossFailoverSettings getInputLossSettings() {
        return this.inputLossSettings;
    }

    /**
     * MediaLive will perform a failover if content is not detected in this input for the specified period.
     * 
     * @param inputLossSettings
     *        MediaLive will perform a failover if content is not detected in this input for the specified period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverConditionSettings withInputLossSettings(InputLossFailoverSettings inputLossSettings) {
        setInputLossSettings(inputLossSettings);
        return this;
    }

    /**
     * MediaLive will perform a failover if content is considered black for the specified period.
     * 
     * @param videoBlackSettings
     *        MediaLive will perform a failover if content is considered black for the specified period.
     */

    public void setVideoBlackSettings(VideoBlackFailoverSettings videoBlackSettings) {
        this.videoBlackSettings = videoBlackSettings;
    }

    /**
     * MediaLive will perform a failover if content is considered black for the specified period.
     * 
     * @return MediaLive will perform a failover if content is considered black for the specified period.
     */

    public VideoBlackFailoverSettings getVideoBlackSettings() {
        return this.videoBlackSettings;
    }

    /**
     * MediaLive will perform a failover if content is considered black for the specified period.
     * 
     * @param videoBlackSettings
     *        MediaLive will perform a failover if content is considered black for the specified period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverConditionSettings withVideoBlackSettings(VideoBlackFailoverSettings videoBlackSettings) {
        setVideoBlackSettings(videoBlackSettings);
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
        if (getAudioSilenceSettings() != null)
            sb.append("AudioSilenceSettings: ").append(getAudioSilenceSettings()).append(",");
        if (getInputLossSettings() != null)
            sb.append("InputLossSettings: ").append(getInputLossSettings()).append(",");
        if (getVideoBlackSettings() != null)
            sb.append("VideoBlackSettings: ").append(getVideoBlackSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverConditionSettings == false)
            return false;
        FailoverConditionSettings other = (FailoverConditionSettings) obj;
        if (other.getAudioSilenceSettings() == null ^ this.getAudioSilenceSettings() == null)
            return false;
        if (other.getAudioSilenceSettings() != null && other.getAudioSilenceSettings().equals(this.getAudioSilenceSettings()) == false)
            return false;
        if (other.getInputLossSettings() == null ^ this.getInputLossSettings() == null)
            return false;
        if (other.getInputLossSettings() != null && other.getInputLossSettings().equals(this.getInputLossSettings()) == false)
            return false;
        if (other.getVideoBlackSettings() == null ^ this.getVideoBlackSettings() == null)
            return false;
        if (other.getVideoBlackSettings() != null && other.getVideoBlackSettings().equals(this.getVideoBlackSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioSilenceSettings() == null) ? 0 : getAudioSilenceSettings().hashCode());
        hashCode = prime * hashCode + ((getInputLossSettings() == null) ? 0 : getInputLossSettings().hashCode());
        hashCode = prime * hashCode + ((getVideoBlackSettings() == null) ? 0 : getVideoBlackSettings().hashCode());
        return hashCode;
    }

    @Override
    public FailoverConditionSettings clone() {
        try {
            return (FailoverConditionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FailoverConditionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
