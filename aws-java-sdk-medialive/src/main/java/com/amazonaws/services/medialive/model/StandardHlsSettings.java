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
 * Standard Hls Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StandardHlsSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandardHlsSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     */
    private String audioRenditionSets;

    private M3u8Settings m3u8Settings;

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     * 
     * @param audioRenditionSets
     *        List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that
     *        are associated to the video, separate by ','.
     */

    public void setAudioRenditionSets(String audioRenditionSets) {
        this.audioRenditionSets = audioRenditionSets;
    }

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     * 
     * @return List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that
     *         are associated to the video, separate by ','.
     */

    public String getAudioRenditionSets() {
        return this.audioRenditionSets;
    }

    /**
     * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are
     * associated to the video, separate by ','.
     * 
     * @param audioRenditionSets
     *        List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that
     *        are associated to the video, separate by ','.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardHlsSettings withAudioRenditionSets(String audioRenditionSets) {
        setAudioRenditionSets(audioRenditionSets);
        return this;
    }

    /**
     * @param m3u8Settings
     */

    public void setM3u8Settings(M3u8Settings m3u8Settings) {
        this.m3u8Settings = m3u8Settings;
    }

    /**
     * @return
     */

    public M3u8Settings getM3u8Settings() {
        return this.m3u8Settings;
    }

    /**
     * @param m3u8Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandardHlsSettings withM3u8Settings(M3u8Settings m3u8Settings) {
        setM3u8Settings(m3u8Settings);
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
        if (getAudioRenditionSets() != null)
            sb.append("AudioRenditionSets: ").append(getAudioRenditionSets()).append(",");
        if (getM3u8Settings() != null)
            sb.append("M3u8Settings: ").append(getM3u8Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandardHlsSettings == false)
            return false;
        StandardHlsSettings other = (StandardHlsSettings) obj;
        if (other.getAudioRenditionSets() == null ^ this.getAudioRenditionSets() == null)
            return false;
        if (other.getAudioRenditionSets() != null && other.getAudioRenditionSets().equals(this.getAudioRenditionSets()) == false)
            return false;
        if (other.getM3u8Settings() == null ^ this.getM3u8Settings() == null)
            return false;
        if (other.getM3u8Settings() != null && other.getM3u8Settings().equals(this.getM3u8Settings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioRenditionSets() == null) ? 0 : getAudioRenditionSets().hashCode());
        hashCode = prime * hashCode + ((getM3u8Settings() == null) ? 0 : getM3u8Settings().hashCode());
        return hashCode;
    }

    @Override
    public StandardHlsSettings clone() {
        try {
            return (StandardHlsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.StandardHlsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
