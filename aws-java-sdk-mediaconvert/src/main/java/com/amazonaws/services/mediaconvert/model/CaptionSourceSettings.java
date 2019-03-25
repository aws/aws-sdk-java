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

    /** Settings for ancillary captions source. */
    private AncillarySourceSettings ancillarySourceSettings;
    /** DVB Sub Source Settings */
    private DvbSubSourceSettings dvbSubSourceSettings;
    /** Settings for embedded captions Source */
    private EmbeddedSourceSettings embeddedSourceSettings;
    /** Settings for File-based Captions in Source */
    private FileSourceSettings fileSourceSettings;
    /**
     * Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption
     * format.
     */
    private String sourceType;
    /** Settings specific to Teletext caption sources, including Page number. */
    private TeletextSourceSettings teletextSourceSettings;
    /** Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF. */
    private TrackSourceSettings trackSourceSettings;

    /**
     * Settings for ancillary captions source.
     * 
     * @param ancillarySourceSettings
     *        Settings for ancillary captions source.
     */

    public void setAncillarySourceSettings(AncillarySourceSettings ancillarySourceSettings) {
        this.ancillarySourceSettings = ancillarySourceSettings;
    }

    /**
     * Settings for ancillary captions source.
     * 
     * @return Settings for ancillary captions source.
     */

    public AncillarySourceSettings getAncillarySourceSettings() {
        return this.ancillarySourceSettings;
    }

    /**
     * Settings for ancillary captions source.
     * 
     * @param ancillarySourceSettings
     *        Settings for ancillary captions source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withAncillarySourceSettings(AncillarySourceSettings ancillarySourceSettings) {
        setAncillarySourceSettings(ancillarySourceSettings);
        return this;
    }

    /**
     * DVB Sub Source Settings
     * 
     * @param dvbSubSourceSettings
     *        DVB Sub Source Settings
     */

    public void setDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
        this.dvbSubSourceSettings = dvbSubSourceSettings;
    }

    /**
     * DVB Sub Source Settings
     * 
     * @return DVB Sub Source Settings
     */

    public DvbSubSourceSettings getDvbSubSourceSettings() {
        return this.dvbSubSourceSettings;
    }

    /**
     * DVB Sub Source Settings
     * 
     * @param dvbSubSourceSettings
     *        DVB Sub Source Settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withDvbSubSourceSettings(DvbSubSourceSettings dvbSubSourceSettings) {
        setDvbSubSourceSettings(dvbSubSourceSettings);
        return this;
    }

    /**
     * Settings for embedded captions Source
     * 
     * @param embeddedSourceSettings
     *        Settings for embedded captions Source
     */

    public void setEmbeddedSourceSettings(EmbeddedSourceSettings embeddedSourceSettings) {
        this.embeddedSourceSettings = embeddedSourceSettings;
    }

    /**
     * Settings for embedded captions Source
     * 
     * @return Settings for embedded captions Source
     */

    public EmbeddedSourceSettings getEmbeddedSourceSettings() {
        return this.embeddedSourceSettings;
    }

    /**
     * Settings for embedded captions Source
     * 
     * @param embeddedSourceSettings
     *        Settings for embedded captions Source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withEmbeddedSourceSettings(EmbeddedSourceSettings embeddedSourceSettings) {
        setEmbeddedSourceSettings(embeddedSourceSettings);
        return this;
    }

    /**
     * Settings for File-based Captions in Source
     * 
     * @param fileSourceSettings
     *        Settings for File-based Captions in Source
     */

    public void setFileSourceSettings(FileSourceSettings fileSourceSettings) {
        this.fileSourceSettings = fileSourceSettings;
    }

    /**
     * Settings for File-based Captions in Source
     * 
     * @return Settings for File-based Captions in Source
     */

    public FileSourceSettings getFileSourceSettings() {
        return this.fileSourceSettings;
    }

    /**
     * Settings for File-based Captions in Source
     * 
     * @param fileSourceSettings
     *        Settings for File-based Captions in Source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withFileSourceSettings(FileSourceSettings fileSourceSettings) {
        setFileSourceSettings(fileSourceSettings);
        return this;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption
     * format.
     * 
     * @param sourceType
     *        Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect
     *        caption format.
     * @see CaptionSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption
     * format.
     * 
     * @return Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect
     *         caption format.
     * @see CaptionSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption
     * format.
     * 
     * @param sourceType
     *        Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect
     *        caption format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionSourceType
     */

    public CaptionSourceSettings withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect caption
     * format.
     * 
     * @param sourceType
     *        Use Source (SourceType) to identify the format of your input captions. The service cannot auto-detect
     *        caption format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionSourceType
     */

    public CaptionSourceSettings withSourceType(CaptionSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * Settings specific to Teletext caption sources, including Page number.
     * 
     * @param teletextSourceSettings
     *        Settings specific to Teletext caption sources, including Page number.
     */

    public void setTeletextSourceSettings(TeletextSourceSettings teletextSourceSettings) {
        this.teletextSourceSettings = teletextSourceSettings;
    }

    /**
     * Settings specific to Teletext caption sources, including Page number.
     * 
     * @return Settings specific to Teletext caption sources, including Page number.
     */

    public TeletextSourceSettings getTeletextSourceSettings() {
        return this.teletextSourceSettings;
    }

    /**
     * Settings specific to Teletext caption sources, including Page number.
     * 
     * @param teletextSourceSettings
     *        Settings specific to Teletext caption sources, including Page number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSourceSettings withTeletextSourceSettings(TeletextSourceSettings teletextSourceSettings) {
        setTeletextSourceSettings(teletextSourceSettings);
        return this;
    }

    /**
     * Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
     * 
     * @param trackSourceSettings
     *        Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
     */

    public void setTrackSourceSettings(TrackSourceSettings trackSourceSettings) {
        this.trackSourceSettings = trackSourceSettings;
    }

    /**
     * Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
     * 
     * @return Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
     */

    public TrackSourceSettings getTrackSourceSettings() {
        return this.trackSourceSettings;
    }

    /**
     * Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
     * 
     * @param trackSourceSettings
     *        Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
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
