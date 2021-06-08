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
 * Placeholder documentation for AudioSilenceFailoverSettings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioSilenceFailoverSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioSilenceFailoverSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your most
     * important rendition. If you didn't create an audio selector in this input, leave blank.
     */
    private String audioSelectorName;
    /**
     * The amount of time (in milliseconds) that the active input must be silent before automatic input failover occurs.
     * Silence is defined as audio loss or audio quieter than -50 dBFS.
     */
    private Integer audioSilenceThresholdMsec;

    /**
     * The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your most
     * important rendition. If you didn't create an audio selector in this input, leave blank.
     * 
     * @param audioSelectorName
     *        The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your
     *        most important rendition. If you didn't create an audio selector in this input, leave blank.
     */

    public void setAudioSelectorName(String audioSelectorName) {
        this.audioSelectorName = audioSelectorName;
    }

    /**
     * The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your most
     * important rendition. If you didn't create an audio selector in this input, leave blank.
     * 
     * @return The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your
     *         most important rendition. If you didn't create an audio selector in this input, leave blank.
     */

    public String getAudioSelectorName() {
        return this.audioSelectorName;
    }

    /**
     * The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your most
     * important rendition. If you didn't create an audio selector in this input, leave blank.
     * 
     * @param audioSelectorName
     *        The name of the audio selector in the input that MediaLive should monitor to detect silence. Select your
     *        most important rendition. If you didn't create an audio selector in this input, leave blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSilenceFailoverSettings withAudioSelectorName(String audioSelectorName) {
        setAudioSelectorName(audioSelectorName);
        return this;
    }

    /**
     * The amount of time (in milliseconds) that the active input must be silent before automatic input failover occurs.
     * Silence is defined as audio loss or audio quieter than -50 dBFS.
     * 
     * @param audioSilenceThresholdMsec
     *        The amount of time (in milliseconds) that the active input must be silent before automatic input failover
     *        occurs. Silence is defined as audio loss or audio quieter than -50 dBFS.
     */

    public void setAudioSilenceThresholdMsec(Integer audioSilenceThresholdMsec) {
        this.audioSilenceThresholdMsec = audioSilenceThresholdMsec;
    }

    /**
     * The amount of time (in milliseconds) that the active input must be silent before automatic input failover occurs.
     * Silence is defined as audio loss or audio quieter than -50 dBFS.
     * 
     * @return The amount of time (in milliseconds) that the active input must be silent before automatic input failover
     *         occurs. Silence is defined as audio loss or audio quieter than -50 dBFS.
     */

    public Integer getAudioSilenceThresholdMsec() {
        return this.audioSilenceThresholdMsec;
    }

    /**
     * The amount of time (in milliseconds) that the active input must be silent before automatic input failover occurs.
     * Silence is defined as audio loss or audio quieter than -50 dBFS.
     * 
     * @param audioSilenceThresholdMsec
     *        The amount of time (in milliseconds) that the active input must be silent before automatic input failover
     *        occurs. Silence is defined as audio loss or audio quieter than -50 dBFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSilenceFailoverSettings withAudioSilenceThresholdMsec(Integer audioSilenceThresholdMsec) {
        setAudioSilenceThresholdMsec(audioSilenceThresholdMsec);
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
        if (getAudioSelectorName() != null)
            sb.append("AudioSelectorName: ").append(getAudioSelectorName()).append(",");
        if (getAudioSilenceThresholdMsec() != null)
            sb.append("AudioSilenceThresholdMsec: ").append(getAudioSilenceThresholdMsec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSilenceFailoverSettings == false)
            return false;
        AudioSilenceFailoverSettings other = (AudioSilenceFailoverSettings) obj;
        if (other.getAudioSelectorName() == null ^ this.getAudioSelectorName() == null)
            return false;
        if (other.getAudioSelectorName() != null && other.getAudioSelectorName().equals(this.getAudioSelectorName()) == false)
            return false;
        if (other.getAudioSilenceThresholdMsec() == null ^ this.getAudioSilenceThresholdMsec() == null)
            return false;
        if (other.getAudioSilenceThresholdMsec() != null && other.getAudioSilenceThresholdMsec().equals(this.getAudioSilenceThresholdMsec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioSelectorName() == null) ? 0 : getAudioSelectorName().hashCode());
        hashCode = prime * hashCode + ((getAudioSilenceThresholdMsec() == null) ? 0 : getAudioSilenceThresholdMsec().hashCode());
        return hashCode;
    }

    @Override
    public AudioSilenceFailoverSettings clone() {
        try {
            return (AudioSilenceFailoverSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioSilenceFailoverSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
