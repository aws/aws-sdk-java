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
 * Audio Codec Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioCodecSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioCodecSettings implements Serializable, Cloneable, StructuredPojo {

    private AacSettings aacSettings;

    private Ac3Settings ac3Settings;

    private Eac3Settings eac3Settings;

    private Mp2Settings mp2Settings;

    private PassThroughSettings passThroughSettings;

    /**
     * @param aacSettings
     */

    public void setAacSettings(AacSettings aacSettings) {
        this.aacSettings = aacSettings;
    }

    /**
     * @return
     */

    public AacSettings getAacSettings() {
        return this.aacSettings;
    }

    /**
     * @param aacSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withAacSettings(AacSettings aacSettings) {
        setAacSettings(aacSettings);
        return this;
    }

    /**
     * @param ac3Settings
     */

    public void setAc3Settings(Ac3Settings ac3Settings) {
        this.ac3Settings = ac3Settings;
    }

    /**
     * @return
     */

    public Ac3Settings getAc3Settings() {
        return this.ac3Settings;
    }

    /**
     * @param ac3Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withAc3Settings(Ac3Settings ac3Settings) {
        setAc3Settings(ac3Settings);
        return this;
    }

    /**
     * @param eac3Settings
     */

    public void setEac3Settings(Eac3Settings eac3Settings) {
        this.eac3Settings = eac3Settings;
    }

    /**
     * @return
     */

    public Eac3Settings getEac3Settings() {
        return this.eac3Settings;
    }

    /**
     * @param eac3Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withEac3Settings(Eac3Settings eac3Settings) {
        setEac3Settings(eac3Settings);
        return this;
    }

    /**
     * @param mp2Settings
     */

    public void setMp2Settings(Mp2Settings mp2Settings) {
        this.mp2Settings = mp2Settings;
    }

    /**
     * @return
     */

    public Mp2Settings getMp2Settings() {
        return this.mp2Settings;
    }

    /**
     * @param mp2Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withMp2Settings(Mp2Settings mp2Settings) {
        setMp2Settings(mp2Settings);
        return this;
    }

    /**
     * @param passThroughSettings
     */

    public void setPassThroughSettings(PassThroughSettings passThroughSettings) {
        this.passThroughSettings = passThroughSettings;
    }

    /**
     * @return
     */

    public PassThroughSettings getPassThroughSettings() {
        return this.passThroughSettings;
    }

    /**
     * @param passThroughSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioCodecSettings withPassThroughSettings(PassThroughSettings passThroughSettings) {
        setPassThroughSettings(passThroughSettings);
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
        if (getAacSettings() != null)
            sb.append("AacSettings: ").append(getAacSettings()).append(",");
        if (getAc3Settings() != null)
            sb.append("Ac3Settings: ").append(getAc3Settings()).append(",");
        if (getEac3Settings() != null)
            sb.append("Eac3Settings: ").append(getEac3Settings()).append(",");
        if (getMp2Settings() != null)
            sb.append("Mp2Settings: ").append(getMp2Settings()).append(",");
        if (getPassThroughSettings() != null)
            sb.append("PassThroughSettings: ").append(getPassThroughSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioCodecSettings == false)
            return false;
        AudioCodecSettings other = (AudioCodecSettings) obj;
        if (other.getAacSettings() == null ^ this.getAacSettings() == null)
            return false;
        if (other.getAacSettings() != null && other.getAacSettings().equals(this.getAacSettings()) == false)
            return false;
        if (other.getAc3Settings() == null ^ this.getAc3Settings() == null)
            return false;
        if (other.getAc3Settings() != null && other.getAc3Settings().equals(this.getAc3Settings()) == false)
            return false;
        if (other.getEac3Settings() == null ^ this.getEac3Settings() == null)
            return false;
        if (other.getEac3Settings() != null && other.getEac3Settings().equals(this.getEac3Settings()) == false)
            return false;
        if (other.getMp2Settings() == null ^ this.getMp2Settings() == null)
            return false;
        if (other.getMp2Settings() != null && other.getMp2Settings().equals(this.getMp2Settings()) == false)
            return false;
        if (other.getPassThroughSettings() == null ^ this.getPassThroughSettings() == null)
            return false;
        if (other.getPassThroughSettings() != null && other.getPassThroughSettings().equals(this.getPassThroughSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAacSettings() == null) ? 0 : getAacSettings().hashCode());
        hashCode = prime * hashCode + ((getAc3Settings() == null) ? 0 : getAc3Settings().hashCode());
        hashCode = prime * hashCode + ((getEac3Settings() == null) ? 0 : getEac3Settings().hashCode());
        hashCode = prime * hashCode + ((getMp2Settings() == null) ? 0 : getMp2Settings().hashCode());
        hashCode = prime * hashCode + ((getPassThroughSettings() == null) ? 0 : getPassThroughSettings().hashCode());
        return hashCode;
    }

    @Override
    public AudioCodecSettings clone() {
        try {
            return (AudioCodecSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioCodecSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
