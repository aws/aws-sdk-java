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
 * Source settings (SourceSettings) contains the group of settings for captions in the input.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionSourceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionSourceSettings implements Serializable, Cloneable, StructuredPojo {

    private AncillarySourceSettings ancillarySourceSettings;

    private DvbSubSourceSettings dvbSubSourceSettings;

    private EmbeddedSourceSettings embeddedSourceSettings;

    private FileSourceSettings fileSourceSettings;

    private String sourceType;

    private TeletextSourceSettings teletextSourceSettings;

    private TrackSourceSettings trackSourceSettings;

    /**
     * @param ancillarySourceSettings
     */

    public void setAncillarySourceSettings(AncillarySourceSettings ancillarySourceSettings) {
        this.ancillarySourceSettings = ancillarySourceSettings;
    }

    /**
     * @return
     */

    public AncillarySourceSettings getAncillarySourceSettings() {
        return this.ancillarySourceSettings;
    }

    /**
     * @param ancillarySourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withAncillarySourceSettings(AncillarySourceSettings ancillarySourceSettings) {
        setAncillarySourceSettings(ancillarySourceSettings);
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

    public CaptionSourceSettings withDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
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

    public CaptionSourceSettings withEmbeddedSourceSettings(EmbeddedSourceSettings embeddedSourceSettings) {
        setEmbeddedSourceSettings(embeddedSourceSettings);
        return this;
    }

    /**
     * @param fileSourceSettings
     */

    public void setFileSourceSettings(FileSourceSettings fileSourceSettings) {
        this.fileSourceSettings = fileSourceSettings;
    }

    /**
     * @return
     */

    public FileSourceSettings getFileSourceSettings() {
        return this.fileSourceSettings;
    }

    /**
     * @param fileSourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withFileSourceSettings(FileSourceSettings fileSourceSettings) {
        setFileSourceSettings(fileSourceSettings);
        return this;
    }

    /**
     * @param sourceType
     * @see CaptionSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * @return
     * @see CaptionSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @param sourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionSourceType
     */

    public CaptionSourceSettings withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * @param sourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionSourceType
     */

    public CaptionSourceSettings withSourceType(CaptionSourceType sourceType) {
        this.sourceType = sourceType.toString();
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

    public CaptionSourceSettings withTeletextSourceSettings(TeletextSourceSettings teletextSourceSettings) {
        setTeletextSourceSettings(teletextSourceSettings);
        return this;
    }

    /**
     * @param trackSourceSettings
     */

    public void setTrackSourceSettings(TrackSourceSettings trackSourceSettings) {
        this.trackSourceSettings = trackSourceSettings;
    }

    /**
     * @return
     */

    public TrackSourceSettings getTrackSourceSettings() {
        return this.trackSourceSettings;
    }

    /**
     * @param trackSourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withTrackSourceSettings(TrackSourceSettings trackSourceSettings) {
        setTrackSourceSettings(trackSourceSettings);
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
        if (getAncillarySourceSettings() != null)
            sb.append("AncillarySourceSettings: ").append(getAncillarySourceSettings()).append(",");
        if (getDvbSubSourceSettings() != null)
            sb.append("DvbSubSourceSettings: ").append(getDvbSubSourceSettings()).append(",");
        if (getEmbeddedSourceSettings() != null)
            sb.append("EmbeddedSourceSettings: ").append(getEmbeddedSourceSettings()).append(",");
        if (getFileSourceSettings() != null)
            sb.append("FileSourceSettings: ").append(getFileSourceSettings()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getTeletextSourceSettings() != null)
            sb.append("TeletextSourceSettings: ").append(getTeletextSourceSettings()).append(",");
        if (getTrackSourceSettings() != null)
            sb.append("TrackSourceSettings: ").append(getTrackSourceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSourceSettings == false)
            return false;
        CaptionSourceSettings other = (CaptionSourceSettings) obj;
        if (other.getAncillarySourceSettings() == null ^ this.getAncillarySourceSettings() == null)
            return false;
        if (other.getAncillarySourceSettings() != null && other.getAncillarySourceSettings().equals(this.getAncillarySourceSettings()) == false)
            return false;
        if (other.getDvbSubSourceSettings() == null ^ this.getDvbSubSourceSettings() == null)
            return false;
        if (other.getDvbSubSourceSettings() != null && other.getDvbSubSourceSettings().equals(this.getDvbSubSourceSettings()) == false)
            return false;
        if (other.getEmbeddedSourceSettings() == null ^ this.getEmbeddedSourceSettings() == null)
            return false;
        if (other.getEmbeddedSourceSettings() != null && other.getEmbeddedSourceSettings().equals(this.getEmbeddedSourceSettings()) == false)
            return false;
        if (other.getFileSourceSettings() == null ^ this.getFileSourceSettings() == null)
            return false;
        if (other.getFileSourceSettings() != null && other.getFileSourceSettings().equals(this.getFileSourceSettings()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getTeletextSourceSettings() == null ^ this.getTeletextSourceSettings() == null)
            return false;
        if (other.getTeletextSourceSettings() != null && other.getTeletextSourceSettings().equals(this.getTeletextSourceSettings()) == false)
            return false;
        if (other.getTrackSourceSettings() == null ^ this.getTrackSourceSettings() == null)
            return false;
        if (other.getTrackSourceSettings() != null && other.getTrackSourceSettings().equals(this.getTrackSourceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAncillarySourceSettings() == null) ? 0 : getAncillarySourceSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSubSourceSettings() == null) ? 0 : getDvbSubSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getEmbeddedSourceSettings() == null) ? 0 : getEmbeddedSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getFileSourceSettings() == null) ? 0 : getFileSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getTeletextSourceSettings() == null) ? 0 : getTeletextSourceSettings().hashCode());
        hashCode = prime * hashCode + ((getTrackSourceSettings() == null) ? 0 : getTrackSourceSettings().hashCode());
        return hashCode;
    }

    @Override
    public CaptionSourceSettings clone() {
        try {
            return (CaptionSourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionSourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
