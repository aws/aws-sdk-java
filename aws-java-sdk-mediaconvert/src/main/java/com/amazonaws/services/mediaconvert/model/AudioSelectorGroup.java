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
 * Group of Audio Selectors
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AudioSelectorGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioSelectorGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * Name of an Audio Selector within the same input to include in the group. Audio selector names are standardized,
     * based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be
     * repeated to add any number of audio selectors to the group.
     */
    private java.util.List<String> audioSelectorNames;

    /**
     * Name of an Audio Selector within the same input to include in the group. Audio selector names are standardized,
     * based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be
     * repeated to add any number of audio selectors to the group.
     * 
     * @return Name of an Audio Selector within the same input to include in the group. Audio selector names are
     *         standardized, based on their order within the input (e.g., "Audio Selector 1"). The audio selector name
     *         parameter can be repeated to add any number of audio selectors to the group.
     */

    public java.util.List<String> getAudioSelectorNames() {
        return audioSelectorNames;
    }

    /**
     * Name of an Audio Selector within the same input to include in the group. Audio selector names are standardized,
     * based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be
     * repeated to add any number of audio selectors to the group.
     * 
     * @param audioSelectorNames
     *        Name of an Audio Selector within the same input to include in the group. Audio selector names are
     *        standardized, based on their order within the input (e.g., "Audio Selector 1"). The audio selector name
     *        parameter can be repeated to add any number of audio selectors to the group.
     */

    public void setAudioSelectorNames(java.util.Collection<String> audioSelectorNames) {
        if (audioSelectorNames == null) {
            this.audioSelectorNames = null;
            return;
        }

        this.audioSelectorNames = new java.util.ArrayList<String>(audioSelectorNames);
    }

    /**
     * Name of an Audio Selector within the same input to include in the group. Audio selector names are standardized,
     * based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be
     * repeated to add any number of audio selectors to the group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioSelectorNames(java.util.Collection)} or {@link #withAudioSelectorNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param audioSelectorNames
     *        Name of an Audio Selector within the same input to include in the group. Audio selector names are
     *        standardized, based on their order within the input (e.g., "Audio Selector 1"). The audio selector name
     *        parameter can be repeated to add any number of audio selectors to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelectorGroup withAudioSelectorNames(String... audioSelectorNames) {
        if (this.audioSelectorNames == null) {
            setAudioSelectorNames(new java.util.ArrayList<String>(audioSelectorNames.length));
        }
        for (String ele : audioSelectorNames) {
            this.audioSelectorNames.add(ele);
        }
        return this;
    }

    /**
     * Name of an Audio Selector within the same input to include in the group. Audio selector names are standardized,
     * based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be
     * repeated to add any number of audio selectors to the group.
     * 
     * @param audioSelectorNames
     *        Name of an Audio Selector within the same input to include in the group. Audio selector names are
     *        standardized, based on their order within the input (e.g., "Audio Selector 1"). The audio selector name
     *        parameter can be repeated to add any number of audio selectors to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSelectorGroup withAudioSelectorNames(java.util.Collection<String> audioSelectorNames) {
        setAudioSelectorNames(audioSelectorNames);
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
        if (getAudioSelectorNames() != null)
            sb.append("AudioSelectorNames: ").append(getAudioSelectorNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSelectorGroup == false)
            return false;
        AudioSelectorGroup other = (AudioSelectorGroup) obj;
        if (other.getAudioSelectorNames() == null ^ this.getAudioSelectorNames() == null)
            return false;
        if (other.getAudioSelectorNames() != null && other.getAudioSelectorNames().equals(this.getAudioSelectorNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioSelectorNames() == null) ? 0 : getAudioSelectorNames().hashCode());
        return hashCode;
    }

    @Override
    public AudioSelectorGroup clone() {
        try {
            return (AudioSelectorGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AudioSelectorGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
