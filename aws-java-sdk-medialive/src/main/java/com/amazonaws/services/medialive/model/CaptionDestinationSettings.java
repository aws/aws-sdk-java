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
 * Caption Destination Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CaptionDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    private AribDestinationSettings aribDestinationSettings;

    private BurnInDestinationSettings burnInDestinationSettings;

    private DvbSubDestinationSettings dvbSubDestinationSettings;

    private EmbeddedDestinationSettings embeddedDestinationSettings;

    private EmbeddedPlusScte20DestinationSettings embeddedPlusScte20DestinationSettings;

    private RtmpCaptionInfoDestinationSettings rtmpCaptionInfoDestinationSettings;

    private Scte20PlusEmbeddedDestinationSettings scte20PlusEmbeddedDestinationSettings;

    private Scte27DestinationSettings scte27DestinationSettings;

    private SmpteTtDestinationSettings smpteTtDestinationSettings;

    private TeletextDestinationSettings teletextDestinationSettings;

    private TtmlDestinationSettings ttmlDestinationSettings;

    private WebvttDestinationSettings webvttDestinationSettings;

    /**
     * @param aribDestinationSettings
     */

    public void setAribDestinationSettings(AribDestinationSettings aribDestinationSettings) {
        this.aribDestinationSettings = aribDestinationSettings;
    }

    /**
     * @return
     */

    public AribDestinationSettings getAribDestinationSettings() {
        return this.aribDestinationSettings;
    }

    /**
     * @param aribDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withAribDestinationSettings(AribDestinationSettings aribDestinationSettings) {
        setAribDestinationSettings(aribDestinationSettings);
        return this;
    }

    /**
     * @param burnInDestinationSettings
     */

    public void setBurnInDestinationSettings(BurnInDestinationSettings burnInDestinationSettings) {
        this.burnInDestinationSettings = burnInDestinationSettings;
    }

    /**
     * @return
     */

    public BurnInDestinationSettings getBurnInDestinationSettings() {
        return this.burnInDestinationSettings;
    }

    /**
     * @param burnInDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withBurnInDestinationSettings(BurnInDestinationSettings burnInDestinationSettings) {
        setBurnInDestinationSettings(burnInDestinationSettings);
        return this;
    }

    /**
     * @param dvbSubDestinationSettings
     */

    public void setDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        this.dvbSubDestinationSettings = dvbSubDestinationSettings;
    }

    /**
     * @return
     */

    public DvbSubDestinationSettings getDvbSubDestinationSettings() {
        return this.dvbSubDestinationSettings;
    }

    /**
     * @param dvbSubDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        setDvbSubDestinationSettings(dvbSubDestinationSettings);
        return this;
    }

    /**
     * @param embeddedDestinationSettings
     */

    public void setEmbeddedDestinationSettings(EmbeddedDestinationSettings embeddedDestinationSettings) {
        this.embeddedDestinationSettings = embeddedDestinationSettings;
    }

    /**
     * @return
     */

    public EmbeddedDestinationSettings getEmbeddedDestinationSettings() {
        return this.embeddedDestinationSettings;
    }

    /**
     * @param embeddedDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withEmbeddedDestinationSettings(EmbeddedDestinationSettings embeddedDestinationSettings) {
        setEmbeddedDestinationSettings(embeddedDestinationSettings);
        return this;
    }

    /**
     * @param embeddedPlusScte20DestinationSettings
     */

    public void setEmbeddedPlusScte20DestinationSettings(EmbeddedPlusScte20DestinationSettings embeddedPlusScte20DestinationSettings) {
        this.embeddedPlusScte20DestinationSettings = embeddedPlusScte20DestinationSettings;
    }

    /**
     * @return
     */

    public EmbeddedPlusScte20DestinationSettings getEmbeddedPlusScte20DestinationSettings() {
        return this.embeddedPlusScte20DestinationSettings;
    }

    /**
     * @param embeddedPlusScte20DestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withEmbeddedPlusScte20DestinationSettings(EmbeddedPlusScte20DestinationSettings embeddedPlusScte20DestinationSettings) {
        setEmbeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings);
        return this;
    }

    /**
     * @param rtmpCaptionInfoDestinationSettings
     */

    public void setRtmpCaptionInfoDestinationSettings(RtmpCaptionInfoDestinationSettings rtmpCaptionInfoDestinationSettings) {
        this.rtmpCaptionInfoDestinationSettings = rtmpCaptionInfoDestinationSettings;
    }

    /**
     * @return
     */

    public RtmpCaptionInfoDestinationSettings getRtmpCaptionInfoDestinationSettings() {
        return this.rtmpCaptionInfoDestinationSettings;
    }

    /**
     * @param rtmpCaptionInfoDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withRtmpCaptionInfoDestinationSettings(RtmpCaptionInfoDestinationSettings rtmpCaptionInfoDestinationSettings) {
        setRtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings);
        return this;
    }

    /**
     * @param scte20PlusEmbeddedDestinationSettings
     */

    public void setScte20PlusEmbeddedDestinationSettings(Scte20PlusEmbeddedDestinationSettings scte20PlusEmbeddedDestinationSettings) {
        this.scte20PlusEmbeddedDestinationSettings = scte20PlusEmbeddedDestinationSettings;
    }

    /**
     * @return
     */

    public Scte20PlusEmbeddedDestinationSettings getScte20PlusEmbeddedDestinationSettings() {
        return this.scte20PlusEmbeddedDestinationSettings;
    }

    /**
     * @param scte20PlusEmbeddedDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withScte20PlusEmbeddedDestinationSettings(Scte20PlusEmbeddedDestinationSettings scte20PlusEmbeddedDestinationSettings) {
        setScte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings);
        return this;
    }

    /**
     * @param scte27DestinationSettings
     */

    public void setScte27DestinationSettings(Scte27DestinationSettings scte27DestinationSettings) {
        this.scte27DestinationSettings = scte27DestinationSettings;
    }

    /**
     * @return
     */

    public Scte27DestinationSettings getScte27DestinationSettings() {
        return this.scte27DestinationSettings;
    }

    /**
     * @param scte27DestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withScte27DestinationSettings(Scte27DestinationSettings scte27DestinationSettings) {
        setScte27DestinationSettings(scte27DestinationSettings);
        return this;
    }

    /**
     * @param smpteTtDestinationSettings
     */

    public void setSmpteTtDestinationSettings(SmpteTtDestinationSettings smpteTtDestinationSettings) {
        this.smpteTtDestinationSettings = smpteTtDestinationSettings;
    }

    /**
     * @return
     */

    public SmpteTtDestinationSettings getSmpteTtDestinationSettings() {
        return this.smpteTtDestinationSettings;
    }

    /**
     * @param smpteTtDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withSmpteTtDestinationSettings(SmpteTtDestinationSettings smpteTtDestinationSettings) {
        setSmpteTtDestinationSettings(smpteTtDestinationSettings);
        return this;
    }

    /**
     * @param teletextDestinationSettings
     */

    public void setTeletextDestinationSettings(TeletextDestinationSettings teletextDestinationSettings) {
        this.teletextDestinationSettings = teletextDestinationSettings;
    }

    /**
     * @return
     */

    public TeletextDestinationSettings getTeletextDestinationSettings() {
        return this.teletextDestinationSettings;
    }

    /**
     * @param teletextDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withTeletextDestinationSettings(TeletextDestinationSettings teletextDestinationSettings) {
        setTeletextDestinationSettings(teletextDestinationSettings);
        return this;
    }

    /**
     * @param ttmlDestinationSettings
     */

    public void setTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        this.ttmlDestinationSettings = ttmlDestinationSettings;
    }

    /**
     * @return
     */

    public TtmlDestinationSettings getTtmlDestinationSettings() {
        return this.ttmlDestinationSettings;
    }

    /**
     * @param ttmlDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        setTtmlDestinationSettings(ttmlDestinationSettings);
        return this;
    }

    /**
     * @param webvttDestinationSettings
     */

    public void setWebvttDestinationSettings(WebvttDestinationSettings webvttDestinationSettings) {
        this.webvttDestinationSettings = webvttDestinationSettings;
    }

    /**
     * @return
     */

    public WebvttDestinationSettings getWebvttDestinationSettings() {
        return this.webvttDestinationSettings;
    }

    /**
     * @param webvttDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withWebvttDestinationSettings(WebvttDestinationSettings webvttDestinationSettings) {
        setWebvttDestinationSettings(webvttDestinationSettings);
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
        if (getAribDestinationSettings() != null)
            sb.append("AribDestinationSettings: ").append(getAribDestinationSettings()).append(",");
        if (getBurnInDestinationSettings() != null)
            sb.append("BurnInDestinationSettings: ").append(getBurnInDestinationSettings()).append(",");
        if (getDvbSubDestinationSettings() != null)
            sb.append("DvbSubDestinationSettings: ").append(getDvbSubDestinationSettings()).append(",");
        if (getEmbeddedDestinationSettings() != null)
            sb.append("EmbeddedDestinationSettings: ").append(getEmbeddedDestinationSettings()).append(",");
        if (getEmbeddedPlusScte20DestinationSettings() != null)
            sb.append("EmbeddedPlusScte20DestinationSettings: ").append(getEmbeddedPlusScte20DestinationSettings()).append(",");
        if (getRtmpCaptionInfoDestinationSettings() != null)
            sb.append("RtmpCaptionInfoDestinationSettings: ").append(getRtmpCaptionInfoDestinationSettings()).append(",");
        if (getScte20PlusEmbeddedDestinationSettings() != null)
            sb.append("Scte20PlusEmbeddedDestinationSettings: ").append(getScte20PlusEmbeddedDestinationSettings()).append(",");
        if (getScte27DestinationSettings() != null)
            sb.append("Scte27DestinationSettings: ").append(getScte27DestinationSettings()).append(",");
        if (getSmpteTtDestinationSettings() != null)
            sb.append("SmpteTtDestinationSettings: ").append(getSmpteTtDestinationSettings()).append(",");
        if (getTeletextDestinationSettings() != null)
            sb.append("TeletextDestinationSettings: ").append(getTeletextDestinationSettings()).append(",");
        if (getTtmlDestinationSettings() != null)
            sb.append("TtmlDestinationSettings: ").append(getTtmlDestinationSettings()).append(",");
        if (getWebvttDestinationSettings() != null)
            sb.append("WebvttDestinationSettings: ").append(getWebvttDestinationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDestinationSettings == false)
            return false;
        CaptionDestinationSettings other = (CaptionDestinationSettings) obj;
        if (other.getAribDestinationSettings() == null ^ this.getAribDestinationSettings() == null)
            return false;
        if (other.getAribDestinationSettings() != null && other.getAribDestinationSettings().equals(this.getAribDestinationSettings()) == false)
            return false;
        if (other.getBurnInDestinationSettings() == null ^ this.getBurnInDestinationSettings() == null)
            return false;
        if (other.getBurnInDestinationSettings() != null && other.getBurnInDestinationSettings().equals(this.getBurnInDestinationSettings()) == false)
            return false;
        if (other.getDvbSubDestinationSettings() == null ^ this.getDvbSubDestinationSettings() == null)
            return false;
        if (other.getDvbSubDestinationSettings() != null && other.getDvbSubDestinationSettings().equals(this.getDvbSubDestinationSettings()) == false)
            return false;
        if (other.getEmbeddedDestinationSettings() == null ^ this.getEmbeddedDestinationSettings() == null)
            return false;
        if (other.getEmbeddedDestinationSettings() != null && other.getEmbeddedDestinationSettings().equals(this.getEmbeddedDestinationSettings()) == false)
            return false;
        if (other.getEmbeddedPlusScte20DestinationSettings() == null ^ this.getEmbeddedPlusScte20DestinationSettings() == null)
            return false;
        if (other.getEmbeddedPlusScte20DestinationSettings() != null
                && other.getEmbeddedPlusScte20DestinationSettings().equals(this.getEmbeddedPlusScte20DestinationSettings()) == false)
            return false;
        if (other.getRtmpCaptionInfoDestinationSettings() == null ^ this.getRtmpCaptionInfoDestinationSettings() == null)
            return false;
        if (other.getRtmpCaptionInfoDestinationSettings() != null
                && other.getRtmpCaptionInfoDestinationSettings().equals(this.getRtmpCaptionInfoDestinationSettings()) == false)
            return false;
        if (other.getScte20PlusEmbeddedDestinationSettings() == null ^ this.getScte20PlusEmbeddedDestinationSettings() == null)
            return false;
        if (other.getScte20PlusEmbeddedDestinationSettings() != null
                && other.getScte20PlusEmbeddedDestinationSettings().equals(this.getScte20PlusEmbeddedDestinationSettings()) == false)
            return false;
        if (other.getScte27DestinationSettings() == null ^ this.getScte27DestinationSettings() == null)
            return false;
        if (other.getScte27DestinationSettings() != null && other.getScte27DestinationSettings().equals(this.getScte27DestinationSettings()) == false)
            return false;
        if (other.getSmpteTtDestinationSettings() == null ^ this.getSmpteTtDestinationSettings() == null)
            return false;
        if (other.getSmpteTtDestinationSettings() != null && other.getSmpteTtDestinationSettings().equals(this.getSmpteTtDestinationSettings()) == false)
            return false;
        if (other.getTeletextDestinationSettings() == null ^ this.getTeletextDestinationSettings() == null)
            return false;
        if (other.getTeletextDestinationSettings() != null && other.getTeletextDestinationSettings().equals(this.getTeletextDestinationSettings()) == false)
            return false;
        if (other.getTtmlDestinationSettings() == null ^ this.getTtmlDestinationSettings() == null)
            return false;
        if (other.getTtmlDestinationSettings() != null && other.getTtmlDestinationSettings().equals(this.getTtmlDestinationSettings()) == false)
            return false;
        if (other.getWebvttDestinationSettings() == null ^ this.getWebvttDestinationSettings() == null)
            return false;
        if (other.getWebvttDestinationSettings() != null && other.getWebvttDestinationSettings().equals(this.getWebvttDestinationSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAribDestinationSettings() == null) ? 0 : getAribDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getBurnInDestinationSettings() == null) ? 0 : getBurnInDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSubDestinationSettings() == null) ? 0 : getDvbSubDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEmbeddedDestinationSettings() == null) ? 0 : getEmbeddedDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getEmbeddedPlusScte20DestinationSettings() == null) ? 0 : getEmbeddedPlusScte20DestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getRtmpCaptionInfoDestinationSettings() == null) ? 0 : getRtmpCaptionInfoDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getScte20PlusEmbeddedDestinationSettings() == null) ? 0 : getScte20PlusEmbeddedDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getScte27DestinationSettings() == null) ? 0 : getScte27DestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getSmpteTtDestinationSettings() == null) ? 0 : getSmpteTtDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getTeletextDestinationSettings() == null) ? 0 : getTeletextDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getTtmlDestinationSettings() == null) ? 0 : getTtmlDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getWebvttDestinationSettings() == null) ? 0 : getWebvttDestinationSettings().hashCode());
        return hashCode;
    }

    @Override
    public CaptionDestinationSettings clone() {
        try {
            return (CaptionDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.CaptionDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
