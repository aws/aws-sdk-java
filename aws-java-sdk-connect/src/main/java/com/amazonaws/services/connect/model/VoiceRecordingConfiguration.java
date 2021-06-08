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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the recording configuration settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/VoiceRecordingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceRecordingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     */
    private String voiceRecordingTrack;

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * 
     * @param voiceRecordingTrack
     *        Identifies which track is being recorded.
     * @see VoiceRecordingTrack
     */

    public void setVoiceRecordingTrack(String voiceRecordingTrack) {
        this.voiceRecordingTrack = voiceRecordingTrack;
    }

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * 
     * @return Identifies which track is being recorded.
     * @see VoiceRecordingTrack
     */

    public String getVoiceRecordingTrack() {
        return this.voiceRecordingTrack;
    }

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * 
     * @param voiceRecordingTrack
     *        Identifies which track is being recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceRecordingTrack
     */

    public VoiceRecordingConfiguration withVoiceRecordingTrack(String voiceRecordingTrack) {
        setVoiceRecordingTrack(voiceRecordingTrack);
        return this;
    }

    /**
     * <p>
     * Identifies which track is being recorded.
     * </p>
     * 
     * @param voiceRecordingTrack
     *        Identifies which track is being recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceRecordingTrack
     */

    public VoiceRecordingConfiguration withVoiceRecordingTrack(VoiceRecordingTrack voiceRecordingTrack) {
        this.voiceRecordingTrack = voiceRecordingTrack.toString();
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
        if (getVoiceRecordingTrack() != null)
            sb.append("VoiceRecordingTrack: ").append(getVoiceRecordingTrack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceRecordingConfiguration == false)
            return false;
        VoiceRecordingConfiguration other = (VoiceRecordingConfiguration) obj;
        if (other.getVoiceRecordingTrack() == null ^ this.getVoiceRecordingTrack() == null)
            return false;
        if (other.getVoiceRecordingTrack() != null && other.getVoiceRecordingTrack().equals(this.getVoiceRecordingTrack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceRecordingTrack() == null) ? 0 : getVoiceRecordingTrack().hashCode());
        return hashCode;
    }

    @Override
    public VoiceRecordingConfiguration clone() {
        try {
            return (VoiceRecordingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.VoiceRecordingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
