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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Use encryptionContractConfiguration to configure one or more content encryption keys for your endpoints that use
 * SPEKE 2.0. The encryption contract defines which content keys are used to encrypt the audio and video tracks in your
 * stream. To configure the encryption contract, specify which audio and video encryption presets to use. Note the
 * following considerations when using encryptionContractConfiguration: encryptionContractConfiguration can be used for
 * DASH endpoints that use SPEKE 2.0. SPEKE 2.0 relies on the CPIX 2.3 specification. You must disable key rotation for
 * this endpoint by setting keyRotationIntervalSeconds to 0.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/EncryptionContractConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionContractConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** A collection of audio encryption presets. */
    private String presetSpeke20Audio;
    /** A collection of video encryption presets. */
    private String presetSpeke20Video;

    /**
     * A collection of audio encryption presets.
     * 
     * @param presetSpeke20Audio
     *        A collection of audio encryption presets.
     * @see PresetSpeke20Audio
     */

    public void setPresetSpeke20Audio(String presetSpeke20Audio) {
        this.presetSpeke20Audio = presetSpeke20Audio;
    }

    /**
     * A collection of audio encryption presets.
     * 
     * @return A collection of audio encryption presets.
     * @see PresetSpeke20Audio
     */

    public String getPresetSpeke20Audio() {
        return this.presetSpeke20Audio;
    }

    /**
     * A collection of audio encryption presets.
     * 
     * @param presetSpeke20Audio
     *        A collection of audio encryption presets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Audio
     */

    public EncryptionContractConfiguration withPresetSpeke20Audio(String presetSpeke20Audio) {
        setPresetSpeke20Audio(presetSpeke20Audio);
        return this;
    }

    /**
     * A collection of audio encryption presets.
     * 
     * @param presetSpeke20Audio
     *        A collection of audio encryption presets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Audio
     */

    public EncryptionContractConfiguration withPresetSpeke20Audio(PresetSpeke20Audio presetSpeke20Audio) {
        this.presetSpeke20Audio = presetSpeke20Audio.toString();
        return this;
    }

    /**
     * A collection of video encryption presets.
     * 
     * @param presetSpeke20Video
     *        A collection of video encryption presets.
     * @see PresetSpeke20Video
     */

    public void setPresetSpeke20Video(String presetSpeke20Video) {
        this.presetSpeke20Video = presetSpeke20Video;
    }

    /**
     * A collection of video encryption presets.
     * 
     * @return A collection of video encryption presets.
     * @see PresetSpeke20Video
     */

    public String getPresetSpeke20Video() {
        return this.presetSpeke20Video;
    }

    /**
     * A collection of video encryption presets.
     * 
     * @param presetSpeke20Video
     *        A collection of video encryption presets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Video
     */

    public EncryptionContractConfiguration withPresetSpeke20Video(String presetSpeke20Video) {
        setPresetSpeke20Video(presetSpeke20Video);
        return this;
    }

    /**
     * A collection of video encryption presets.
     * 
     * @param presetSpeke20Video
     *        A collection of video encryption presets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PresetSpeke20Video
     */

    public EncryptionContractConfiguration withPresetSpeke20Video(PresetSpeke20Video presetSpeke20Video) {
        this.presetSpeke20Video = presetSpeke20Video.toString();
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
        if (getPresetSpeke20Audio() != null)
            sb.append("PresetSpeke20Audio: ").append(getPresetSpeke20Audio()).append(",");
        if (getPresetSpeke20Video() != null)
            sb.append("PresetSpeke20Video: ").append(getPresetSpeke20Video());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionContractConfiguration == false)
            return false;
        EncryptionContractConfiguration other = (EncryptionContractConfiguration) obj;
        if (other.getPresetSpeke20Audio() == null ^ this.getPresetSpeke20Audio() == null)
            return false;
        if (other.getPresetSpeke20Audio() != null && other.getPresetSpeke20Audio().equals(this.getPresetSpeke20Audio()) == false)
            return false;
        if (other.getPresetSpeke20Video() == null ^ this.getPresetSpeke20Video() == null)
            return false;
        if (other.getPresetSpeke20Video() != null && other.getPresetSpeke20Video().equals(this.getPresetSpeke20Video()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPresetSpeke20Audio() == null) ? 0 : getPresetSpeke20Audio().hashCode());
        hashCode = prime * hashCode + ((getPresetSpeke20Video() == null) ? 0 : getPresetSpeke20Video().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionContractConfiguration clone() {
        try {
            return (EncryptionContractConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.EncryptionContractConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
