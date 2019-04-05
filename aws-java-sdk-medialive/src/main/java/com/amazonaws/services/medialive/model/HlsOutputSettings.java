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
 * Hls Output Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/HlsOutputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsOutputSettings implements Serializable, Cloneable, StructuredPojo {

    /** Settings regarding the underlying stream. These settings are different for audio-only outputs. */
    private HlsSettings hlsSettings;
    /**
     * String concatenated to the end of the destination filename. Accepts \"Format
     * Identifiers\":#formatIdentifierParameters.
     */
    private String nameModifier;
    /** String concatenated to end of segment filenames. */
    private String segmentModifier;

    /**
     * Settings regarding the underlying stream. These settings are different for audio-only outputs.
     * 
     * @param hlsSettings
     *        Settings regarding the underlying stream. These settings are different for audio-only outputs.
     */

    public void setHlsSettings(HlsSettings hlsSettings) {
        this.hlsSettings = hlsSettings;
    }

    /**
     * Settings regarding the underlying stream. These settings are different for audio-only outputs.
     * 
     * @return Settings regarding the underlying stream. These settings are different for audio-only outputs.
     */

    public HlsSettings getHlsSettings() {
        return this.hlsSettings;
    }

    /**
     * Settings regarding the underlying stream. These settings are different for audio-only outputs.
     * 
     * @param hlsSettings
     *        Settings regarding the underlying stream. These settings are different for audio-only outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsOutputSettings withHlsSettings(HlsSettings hlsSettings) {
        setHlsSettings(hlsSettings);
        return this;
    }

    /**
     * String concatenated to the end of the destination filename. Accepts \"Format
     * Identifiers\":#formatIdentifierParameters.
     * 
     * @param nameModifier
     *        String concatenated to the end of the destination filename. Accepts \"Format
     *        Identifiers\":#formatIdentifierParameters.
     */

    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    /**
     * String concatenated to the end of the destination filename. Accepts \"Format
     * Identifiers\":#formatIdentifierParameters.
     * 
     * @return String concatenated to the end of the destination filename. Accepts \"Format
     *         Identifiers\":#formatIdentifierParameters.
     */

    public String getNameModifier() {
        return this.nameModifier;
    }

    /**
     * String concatenated to the end of the destination filename. Accepts \"Format
     * Identifiers\":#formatIdentifierParameters.
     * 
     * @param nameModifier
     *        String concatenated to the end of the destination filename. Accepts \"Format
     *        Identifiers\":#formatIdentifierParameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsOutputSettings withNameModifier(String nameModifier) {
        setNameModifier(nameModifier);
        return this;
    }

    /**
     * String concatenated to end of segment filenames.
     * 
     * @param segmentModifier
     *        String concatenated to end of segment filenames.
     */

    public void setSegmentModifier(String segmentModifier) {
        this.segmentModifier = segmentModifier;
    }

    /**
     * String concatenated to end of segment filenames.
     * 
     * @return String concatenated to end of segment filenames.
     */

    public String getSegmentModifier() {
        return this.segmentModifier;
    }

    /**
     * String concatenated to end of segment filenames.
     * 
     * @param segmentModifier
     *        String concatenated to end of segment filenames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsOutputSettings withSegmentModifier(String segmentModifier) {
        setSegmentModifier(segmentModifier);
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
        if (getHlsSettings() != null)
            sb.append("HlsSettings: ").append(getHlsSettings()).append(",");
        if (getNameModifier() != null)
            sb.append("NameModifier: ").append(getNameModifier()).append(",");
        if (getSegmentModifier() != null)
            sb.append("SegmentModifier: ").append(getSegmentModifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsOutputSettings == false)
            return false;
        HlsOutputSettings other = (HlsOutputSettings) obj;
        if (other.getHlsSettings() == null ^ this.getHlsSettings() == null)
            return false;
        if (other.getHlsSettings() != null && other.getHlsSettings().equals(this.getHlsSettings()) == false)
            return false;
        if (other.getNameModifier() == null ^ this.getNameModifier() == null)
            return false;
        if (other.getNameModifier() != null && other.getNameModifier().equals(this.getNameModifier()) == false)
            return false;
        if (other.getSegmentModifier() == null ^ this.getSegmentModifier() == null)
            return false;
        if (other.getSegmentModifier() != null && other.getSegmentModifier().equals(this.getSegmentModifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHlsSettings() == null) ? 0 : getHlsSettings().hashCode());
        hashCode = prime * hashCode + ((getNameModifier() == null) ? 0 : getNameModifier().hashCode());
        hashCode = prime * hashCode + ((getSegmentModifier() == null) ? 0 : getSegmentModifier().hashCode());
        return hashCode;
    }

    @Override
    public HlsOutputSettings clone() {
        try {
            return (HlsOutputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.HlsOutputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
