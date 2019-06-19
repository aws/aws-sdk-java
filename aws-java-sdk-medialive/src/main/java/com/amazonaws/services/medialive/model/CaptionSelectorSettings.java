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
 * Caption Selector Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CaptionSelectorSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionSelectorSettings implements Serializable, Cloneable, StructuredPojo {

    private AribSourceSettings aribSourceSettings;

    private DvbSubSourceSettings dvbSubSourceSettings;

    private EmbeddedSourceSettings embeddedSourceSettings;

    private Scte20SourceSettings scte20SourceSettings;

    private Scte27SourceSettings scte27SourceSettings;

    private TeletextSourceSettings teletextSourceSettings;

    /**
     * @param aribSourceSettings
     */

    public void setAribSourceSettings(AribSourceSettings aribSourceSettings) {
        this.aribSourceSettings = aribSourceSettings;
    }

    /**
     * @return
     */

    public AribSourceSettings getAribSourceSettings() {
        return this.aribSourceSettings;
    }

    /**
     * @param aribSourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelectorSettings withAribSourceSettings(AribSourceSettings aribSourceSettings) {
        setAribSourceSettings(aribSourceSettings);
        return this;
    }

    /**
     * @param dvbSubSourceSettings
     */

    public void setDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
    }

    /**
     * @return
     */

    public DvbSubSourceSettings getDvbSubSourceSettings() {
        return this.dvbSubSourceSettings;
    }

    /**
     * @param dvbSubSourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelectorSettings withDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
        setDvbSubSourceSettings(dvbSubSourceSettings);
        return this;
    }

    /**
     * @param embeddedSourceSettings
     */

    public void setEmbeddedSourceSettings(EmbeddedSourceSettings embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
    }

    /**
     * @return
     */

    public EmbeddedSourceSettings getEmbeddedSourceSettings() {
        return this.embeddedSourceSettings;
    }

    /**
     * @param embeddedSourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelectorSettings withEmbeddedSourceSettings(EmbeddedSourceSettings embeddedSourceSettings) {
        setEmbeddedSourceSettings(embeddedSourceSettings);
        return this;
    }

    /**
     * @param scte20SourceSettings
     */

    public void setScte20SourceSettings(Scte20SourceSettings scte20SourceSettings) {
        this.scte20SourceSettings = scte20SourceSettings;
    }

    /**
     * @return
     */

    public Scte20SourceSettings getScte20SourceSettings() {
        return this.scte20SourceSettings;
    }

    /**
     * @param scte20SourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelectorSettings withScte20SourceSettings(Scte20SourceSettings scte20SourceSettings) {
        setScte20SourceSettings(scte20SourceSettings);
        return this;
    }

    /**
     * @param scte27SourceSettings
     */

    public void setScte27SourceSettings(Scte27SourceSettings scte27SourceSettings) {
        this.scte27SourceSettings = scte27SourceSettings;
    }

    /**
     * @return
     */

    public Scte27SourceSettings getScte27SourceSettings() {
        return this.scte27SourceSettings;
    }

    /**
     * @param scte27SourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelectorSettings withScte27SourceSettings(Scte27SourceSettings scte27SourceSettings) {
        setScte27SourceSettings(scte27SourceSettings);
        return this;
    }

    /**
     * @param teletextSourceSettings
     */

    public void setTeletextSourceSettings(TeletextSourceSettings teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
    }

    /**
     * @return
     */

    public TeletextSourceSettings getTeletextSourceSettings() {
        return this.teletextSourceSettings;
    }

    /**
     * @param teletextSourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelectorSettings withTeletextSourceSettings(TeletextSourceSettings teletextSourceSettings) {
        setTeletextSourceSettings(teletextSourceSettings);
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
        if (getAribSourceSettings() != null)
            sb.append("AribSourceSettings: ").append(getAribSourceSettings()).append(",");
        if (getDvbSubSourceSettings() != null)
            sb.append("DvbSubSourceSettings: ").append(getDvbSubSourceSettings()).append(",");
        if (getEmbeddedSourceSettings() != null)
            sb.append("EmbeddedSourceSettings: ").append(getEmbeddedSourceSettings()).append(",");
        if (getScte20SourceSettings() != null)
            sb.append("Scte20SourceSettings: ").append(getScte20SourceSettings()).append(",");
        if (getScte27SourceSettings() != null)
            sb.append("Scte27SourceSettings: ").append(getScte27SourceSettings()).append(",");
        if (getTeletextSourceSettings() != null)
            sb.append("TeletextSourceSettings: ").append(getTeletextSourceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSelectorSettings == false)
            return false;
        CaptionSelectorSettings other = (CaptionSelectorSettings) obj;
        if (other.getAribSourceSettings() == null ^ this.getAribSourceSettings() == null)
            return false;
        if (other.getAribSourceSettings() != null && other.getAribSourceSettings().equals(this.getAribSourceSettings()) == false)
            return false;
        if (other.getDvbSubSourceSettings() == null ^ this.getDvbSubSourceSettings() == null)
            return false;
        if (other.getDvbSubSourceSettings() != null && other.getDvbSubSourceSettings().equals(this.getDvbSubSourceSettings()) == false)
            return false;
        if (other.getEmbeddedSourceSettings() == null ^ this.getEmbeddedSourceSettings() == null)
            return false;
        if (other.getEmbeddedSourceSettings() != null && other.getEmbeddedSourceSettings().equals(this.getEmbeddedSourceSettings()) == false)
            return false;
        if (other.getScte20SourceSettings() == null ^ this.getScte20SourceSettings() == null)
            return false;
        if (other.getScte20SourceSettings() != null && other.getScte20SourceSettings().equals(this.getScte20SourceSettings()) == false)
            return false;
        if (other.getScte27SourceSettings() == null ^ this.getScte27SourceSettings() == null)
            return false;
        if (other.getScte27SourceSettings() != null && other.getScte27SourceSettings().equals(this.getScte27SourceSettings()) == false)
            return false;
        if (other.getTeletextSourceSettings() == null ^ this.getTeletextSourceSettings() == null)
            return false;
        if (other.getTeletextSourceSettings() != null && other.getTeletextSourceSettings().equals(this.getTeletextSourceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAribSourceSettings() == null) ? 0 : getAribSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSubSourceSettings() == null) ? 0 : getDvbSubSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getEmbeddedSourceSettings() == null) ? 0 : getEmbeddedSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getScte20SourceSettings() == null) ? 0 : getScte20SourceSettings().hashCode());
        hashCode = prime * hashCode + ((getScte27SourceSettings() == null) ? 0 : getScte27SourceSettings().hashCode());
        hashCode = prime * hashCode + ((getTeletextSourceSettings() == null) ? 0 : getTeletextSourceSettings().hashCode());
        return hashCode;
    }

    @Override
    public CaptionSelectorSettings clone() {
        try {
            return (CaptionSelectorSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.CaptionSelectorSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
