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
 * Audio Selector Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioSelectorSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioSelectorSettings implements Serializable, Cloneable, StructuredPojo {

    private AudioLanguageSelection audioLanguageSelection;

    private AudioPidSelection audioPidSelection;

    /**
     * @param audioLanguageSelection
     */

    public void setAudioLanguageSelection(AudioLanguageSelection audioLanguageSelection) {
        this.audioLanguageSelection = audioLanguageSelection;
    }

    /**
     * @return
     */

    public AudioLanguageSelection getAudioLanguageSelection() {
        return this.audioLanguageSelection;
    }

    /**
     * @param audioLanguageSelection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelectorSettings withAudioLanguageSelection(AudioLanguageSelection audioLanguageSelection) {
        setAudioLanguageSelection(audioLanguageSelection);
        return this;
    }

    /**
     * @param audioPidSelection
     */

    public void setAudioPidSelection(AudioPidSelection audioPidSelection) {
        this.audioPidSelection = audioPidSelection;
    }

    /**
     * @return
     */

    public AudioPidSelection getAudioPidSelection() {
        return this.audioPidSelection;
    }

    /**
     * @param audioPidSelection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelectorSettings withAudioPidSelection(AudioPidSelection audioPidSelection) {
        setAudioPidSelection(audioPidSelection);
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
        if (getAudioLanguageSelection() != null)
            sb.append("AudioLanguageSelection: ").append(getAudioLanguageSelection()).append(",");
        if (getAudioPidSelection() != null)
            sb.append("AudioPidSelection: ").append(getAudioPidSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelectorSettings == false)
            return false;
        AudioSelectorSettings other = (AudioSelectorSettings) obj;
        if (other.getAudioLanguageSelection() == null ^ this.getAudioLanguageSelection() == null)
            return false;
        if (other.getAudioLanguageSelection() != null && other.getAudioLanguageSelection().equals(this.getAudioLanguageSelection()) == false)
            return false;
        if (other.getAudioPidSelection() == null ^ this.getAudioPidSelection() == null)
            return false;
        if (other.getAudioPidSelection() != null && other.getAudioPidSelection().equals(this.getAudioPidSelection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioLanguageSelection() == null) ? 0 : getAudioLanguageSelection().hashCode());
        hashCode = prime * hashCode + ((getAudioPidSelection() == null) ? 0 : getAudioPidSelection().hashCode());
        return hashCode;
    }

    @Override
    public AudioSelectorSettings clone() {
        try {
            return (AudioSelectorSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioSelectorSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
