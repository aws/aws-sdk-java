/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A playlist of media (VOD and/or live) to be played instead of the default media on a particular program.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AlternateMedia" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlternateMedia implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Ad break configuration parameters defined in AlternateMedia.
     * </p>
     */
    private java.util.List<AdBreak> adBreaks;

    private ClipRange clipRange;
    /**
     * <p>
     * The duration of the alternateMedia in milliseconds.
     * </p>
     */
    private Long durationMillis;
    /**
     * <p>
     * The name of the live source for alternateMedia.
     * </p>
     */
    private String liveSourceName;
    /**
     * <p>
     * The date and time that the alternateMedia is scheduled to start, in epoch milliseconds.
     * </p>
     */
    private Long scheduledStartTimeMillis;
    /**
     * <p>
     * The name of the source location for alternateMedia.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The name of the VOD source for alternateMedia.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * Ad break configuration parameters defined in AlternateMedia.
     * </p>
     * 
     * @return Ad break configuration parameters defined in AlternateMedia.
     */

    public java.util.List<AdBreak> getAdBreaks() {
        return adBreaks;
    }

    /**
     * <p>
     * Ad break configuration parameters defined in AlternateMedia.
     * </p>
     * 
     * @param adBreaks
     *        Ad break configuration parameters defined in AlternateMedia.
     */

    public void setAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        if (adBreaks == null) {
            this.adBreaks = null;
            return;
        }

        this.adBreaks = new java.util.ArrayList<AdBreak>(adBreaks);
    }

    /**
     * <p>
     * Ad break configuration parameters defined in AlternateMedia.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdBreaks(java.util.Collection)} or {@link #withAdBreaks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param adBreaks
     *        Ad break configuration parameters defined in AlternateMedia.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withAdBreaks(AdBreak... adBreaks) {
        if (this.adBreaks == null) {
            setAdBreaks(new java.util.ArrayList<AdBreak>(adBreaks.length));
        }
        for (AdBreak ele : adBreaks) {
            this.adBreaks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Ad break configuration parameters defined in AlternateMedia.
     * </p>
     * 
     * @param adBreaks
     *        Ad break configuration parameters defined in AlternateMedia.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        setAdBreaks(adBreaks);
        return this;
    }

    /**
     * @param clipRange
     */

    public void setClipRange(ClipRange clipRange) {
        this.clipRange = clipRange;
    }

    /**
     * @return
     */

    public ClipRange getClipRange() {
        return this.clipRange;
    }

    /**
     * @param clipRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withClipRange(ClipRange clipRange) {
        setClipRange(clipRange);
        return this;
    }

    /**
     * <p>
     * The duration of the alternateMedia in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the alternateMedia in milliseconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The duration of the alternateMedia in milliseconds.
     * </p>
     * 
     * @return The duration of the alternateMedia in milliseconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * The duration of the alternateMedia in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the alternateMedia in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * The name of the live source for alternateMedia.
     * </p>
     * 
     * @param liveSourceName
     *        The name of the live source for alternateMedia.
     */

    public void setLiveSourceName(String liveSourceName) {
        this.liveSourceName = liveSourceName;
    }

    /**
     * <p>
     * The name of the live source for alternateMedia.
     * </p>
     * 
     * @return The name of the live source for alternateMedia.
     */

    public String getLiveSourceName() {
        return this.liveSourceName;
    }

    /**
     * <p>
     * The name of the live source for alternateMedia.
     * </p>
     * 
     * @param liveSourceName
     *        The name of the live source for alternateMedia.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withLiveSourceName(String liveSourceName) {
        setLiveSourceName(liveSourceName);
        return this;
    }

    /**
     * <p>
     * The date and time that the alternateMedia is scheduled to start, in epoch milliseconds.
     * </p>
     * 
     * @param scheduledStartTimeMillis
     *        The date and time that the alternateMedia is scheduled to start, in epoch milliseconds.
     */

    public void setScheduledStartTimeMillis(Long scheduledStartTimeMillis) {
        this.scheduledStartTimeMillis = scheduledStartTimeMillis;
    }

    /**
     * <p>
     * The date and time that the alternateMedia is scheduled to start, in epoch milliseconds.
     * </p>
     * 
     * @return The date and time that the alternateMedia is scheduled to start, in epoch milliseconds.
     */

    public Long getScheduledStartTimeMillis() {
        return this.scheduledStartTimeMillis;
    }

    /**
     * <p>
     * The date and time that the alternateMedia is scheduled to start, in epoch milliseconds.
     * </p>
     * 
     * @param scheduledStartTimeMillis
     *        The date and time that the alternateMedia is scheduled to start, in epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withScheduledStartTimeMillis(Long scheduledStartTimeMillis) {
        setScheduledStartTimeMillis(scheduledStartTimeMillis);
        return this;
    }

    /**
     * <p>
     * The name of the source location for alternateMedia.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location for alternateMedia.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location for alternateMedia.
     * </p>
     * 
     * @return The name of the source location for alternateMedia.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location for alternateMedia.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location for alternateMedia.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The name of the VOD source for alternateMedia.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source for alternateMedia.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source for alternateMedia.
     * </p>
     * 
     * @return The name of the VOD source for alternateMedia.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source for alternateMedia.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source for alternateMedia.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateMedia withVodSourceName(String vodSourceName) {
        setVodSourceName(vodSourceName);
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
        if (getAdBreaks() != null)
            sb.append("AdBreaks: ").append(getAdBreaks()).append(",");
        if (getClipRange() != null)
            sb.append("ClipRange: ").append(getClipRange()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getLiveSourceName() != null)
            sb.append("LiveSourceName: ").append(getLiveSourceName()).append(",");
        if (getScheduledStartTimeMillis() != null)
            sb.append("ScheduledStartTimeMillis: ").append(getScheduledStartTimeMillis()).append(",");
        if (getSourceLocationName() != null)
            sb.append("SourceLocationName: ").append(getSourceLocationName()).append(",");
        if (getVodSourceName() != null)
            sb.append("VodSourceName: ").append(getVodSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlternateMedia == false)
            return false;
        AlternateMedia other = (AlternateMedia) obj;
        if (other.getAdBreaks() == null ^ this.getAdBreaks() == null)
            return false;
        if (other.getAdBreaks() != null && other.getAdBreaks().equals(this.getAdBreaks()) == false)
            return false;
        if (other.getClipRange() == null ^ this.getClipRange() == null)
            return false;
        if (other.getClipRange() != null && other.getClipRange().equals(this.getClipRange()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getLiveSourceName() == null ^ this.getLiveSourceName() == null)
            return false;
        if (other.getLiveSourceName() != null && other.getLiveSourceName().equals(this.getLiveSourceName()) == false)
            return false;
        if (other.getScheduledStartTimeMillis() == null ^ this.getScheduledStartTimeMillis() == null)
            return false;
        if (other.getScheduledStartTimeMillis() != null && other.getScheduledStartTimeMillis().equals(this.getScheduledStartTimeMillis()) == false)
            return false;
        if (other.getSourceLocationName() == null ^ this.getSourceLocationName() == null)
            return false;
        if (other.getSourceLocationName() != null && other.getSourceLocationName().equals(this.getSourceLocationName()) == false)
            return false;
        if (other.getVodSourceName() == null ^ this.getVodSourceName() == null)
            return false;
        if (other.getVodSourceName() != null && other.getVodSourceName().equals(this.getVodSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdBreaks() == null) ? 0 : getAdBreaks().hashCode());
        hashCode = prime * hashCode + ((getClipRange() == null) ? 0 : getClipRange().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getLiveSourceName() == null) ? 0 : getLiveSourceName().hashCode());
        hashCode = prime * hashCode + ((getScheduledStartTimeMillis() == null) ? 0 : getScheduledStartTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public AlternateMedia clone() {
        try {
            return (AlternateMedia) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AlternateMediaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
