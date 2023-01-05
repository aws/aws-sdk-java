/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration settings of the features available to a meeting.&gt;
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/MeetingFeaturesConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeetingFeaturesConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     */
    private AudioFeatures audio;

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     * 
     * @param audio
     *        The configuration settings for the audio features available to a meeting.
     */

    public void setAudio(AudioFeatures audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     * 
     * @return The configuration settings for the audio features available to a meeting.
     */

    public AudioFeatures getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * The configuration settings for the audio features available to a meeting.
     * </p>
     * 
     * @param audio
     *        The configuration settings for the audio features available to a meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeetingFeaturesConfiguration withAudio(AudioFeatures audio) {
        setAudio(audio);
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
        if (getAudio() != null)
            sb.append("Audio: ").append(getAudio());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeetingFeaturesConfiguration == false)
            return false;
        MeetingFeaturesConfiguration other = (MeetingFeaturesConfiguration) obj;
        if (other.getAudio() == null ^ this.getAudio() == null)
            return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        return hashCode;
    }

    @Override
    public MeetingFeaturesConfiguration clone() {
        try {
            return (MeetingFeaturesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.MeetingFeaturesConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
