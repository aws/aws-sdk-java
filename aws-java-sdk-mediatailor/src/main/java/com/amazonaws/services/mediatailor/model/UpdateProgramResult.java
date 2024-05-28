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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateProgram" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProgramResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     */
    private java.util.List<AdBreak> adBreaks;
    /**
     * <p>
     * The ARN to assign to the program.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The list of AudienceMedia defined in program.
     * </p>
     */
    private java.util.List<AudienceMedia> audienceMedia;
    /**
     * <p>
     * The name to assign to the channel for this program.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The clip range configuration settings.
     * </p>
     */
    private ClipRange clipRange;
    /**
     * <p>
     * The time the program was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The duration of the live program in milliseconds.
     * </p>
     */
    private Long durationMillis;
    /**
     * <p>
     * The name of the LiveSource for this Program.
     * </p>
     */
    private String liveSourceName;
    /**
     * <p>
     * The name to assign to this program.
     * </p>
     */
    private String programName;
    /**
     * <p>
     * The scheduled start time for this Program.
     * </p>
     */
    private java.util.Date scheduledStartTime;
    /**
     * <p>
     * The name to assign to the source location for this program.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @return The ad break configuration settings.
     */

    public java.util.List<AdBreak> getAdBreaks() {
        return adBreaks;
    }

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
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
     * The ad break configuration settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdBreaks(java.util.Collection)} or {@link #withAdBreaks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withAdBreaks(AdBreak... adBreaks) {
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
     * The ad break configuration settings.
     * </p>
     * 
     * @param adBreaks
     *        The ad break configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        setAdBreaks(adBreaks);
        return this;
    }

    /**
     * <p>
     * The ARN to assign to the program.
     * </p>
     * 
     * @param arn
     *        The ARN to assign to the program.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN to assign to the program.
     * </p>
     * 
     * @return The ARN to assign to the program.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN to assign to the program.
     * </p>
     * 
     * @param arn
     *        The ARN to assign to the program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The list of AudienceMedia defined in program.
     * </p>
     * 
     * @return The list of AudienceMedia defined in program.
     */

    public java.util.List<AudienceMedia> getAudienceMedia() {
        return audienceMedia;
    }

    /**
     * <p>
     * The list of AudienceMedia defined in program.
     * </p>
     * 
     * @param audienceMedia
     *        The list of AudienceMedia defined in program.
     */

    public void setAudienceMedia(java.util.Collection<AudienceMedia> audienceMedia) {
        if (audienceMedia == null) {
            this.audienceMedia = null;
            return;
        }

        this.audienceMedia = new java.util.ArrayList<AudienceMedia>(audienceMedia);
    }

    /**
     * <p>
     * The list of AudienceMedia defined in program.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudienceMedia(java.util.Collection)} or {@link #withAudienceMedia(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param audienceMedia
     *        The list of AudienceMedia defined in program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withAudienceMedia(AudienceMedia... audienceMedia) {
        if (this.audienceMedia == null) {
            setAudienceMedia(new java.util.ArrayList<AudienceMedia>(audienceMedia.length));
        }
        for (AudienceMedia ele : audienceMedia) {
            this.audienceMedia.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of AudienceMedia defined in program.
     * </p>
     * 
     * @param audienceMedia
     *        The list of AudienceMedia defined in program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withAudienceMedia(java.util.Collection<AudienceMedia> audienceMedia) {
        setAudienceMedia(audienceMedia);
        return this;
    }

    /**
     * <p>
     * The name to assign to the channel for this program.
     * </p>
     * 
     * @param channelName
     *        The name to assign to the channel for this program.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name to assign to the channel for this program.
     * </p>
     * 
     * @return The name to assign to the channel for this program.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name to assign to the channel for this program.
     * </p>
     * 
     * @param channelName
     *        The name to assign to the channel for this program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The clip range configuration settings.
     * </p>
     * 
     * @param clipRange
     *        The clip range configuration settings.
     */

    public void setClipRange(ClipRange clipRange) {
        this.clipRange = clipRange;
    }

    /**
     * <p>
     * The clip range configuration settings.
     * </p>
     * 
     * @return The clip range configuration settings.
     */

    public ClipRange getClipRange() {
        return this.clipRange;
    }

    /**
     * <p>
     * The clip range configuration settings.
     * </p>
     * 
     * @param clipRange
     *        The clip range configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withClipRange(ClipRange clipRange) {
        setClipRange(clipRange);
        return this;
    }

    /**
     * <p>
     * The time the program was created.
     * </p>
     * 
     * @param creationTime
     *        The time the program was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the program was created.
     * </p>
     * 
     * @return The time the program was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the program was created.
     * </p>
     * 
     * @param creationTime
     *        The time the program was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The duration of the live program in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the live program in milliseconds.
     */

    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }

    /**
     * <p>
     * The duration of the live program in milliseconds.
     * </p>
     * 
     * @return The duration of the live program in milliseconds.
     */

    public Long getDurationMillis() {
        return this.durationMillis;
    }

    /**
     * <p>
     * The duration of the live program in milliseconds.
     * </p>
     * 
     * @param durationMillis
     *        The duration of the live program in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withDurationMillis(Long durationMillis) {
        setDurationMillis(durationMillis);
        return this;
    }

    /**
     * <p>
     * The name of the LiveSource for this Program.
     * </p>
     * 
     * @param liveSourceName
     *        The name of the LiveSource for this Program.
     */

    public void setLiveSourceName(String liveSourceName) {
        this.liveSourceName = liveSourceName;
    }

    /**
     * <p>
     * The name of the LiveSource for this Program.
     * </p>
     * 
     * @return The name of the LiveSource for this Program.
     */

    public String getLiveSourceName() {
        return this.liveSourceName;
    }

    /**
     * <p>
     * The name of the LiveSource for this Program.
     * </p>
     * 
     * @param liveSourceName
     *        The name of the LiveSource for this Program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withLiveSourceName(String liveSourceName) {
        setLiveSourceName(liveSourceName);
        return this;
    }

    /**
     * <p>
     * The name to assign to this program.
     * </p>
     * 
     * @param programName
     *        The name to assign to this program.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * <p>
     * The name to assign to this program.
     * </p>
     * 
     * @return The name to assign to this program.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * <p>
     * The name to assign to this program.
     * </p>
     * 
     * @param programName
     *        The name to assign to this program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withProgramName(String programName) {
        setProgramName(programName);
        return this;
    }

    /**
     * <p>
     * The scheduled start time for this Program.
     * </p>
     * 
     * @param scheduledStartTime
     *        The scheduled start time for this Program.
     */

    public void setScheduledStartTime(java.util.Date scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
    }

    /**
     * <p>
     * The scheduled start time for this Program.
     * </p>
     * 
     * @return The scheduled start time for this Program.
     */

    public java.util.Date getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /**
     * <p>
     * The scheduled start time for this Program.
     * </p>
     * 
     * @param scheduledStartTime
     *        The scheduled start time for this Program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withScheduledStartTime(java.util.Date scheduledStartTime) {
        setScheduledStartTime(scheduledStartTime);
        return this;
    }

    /**
     * <p>
     * The name to assign to the source location for this program.
     * </p>
     * 
     * @param sourceLocationName
     *        The name to assign to the source location for this program.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name to assign to the source location for this program.
     * </p>
     * 
     * @return The name to assign to the source location for this program.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name to assign to the source location for this program.
     * </p>
     * 
     * @param sourceLocationName
     *        The name to assign to the source location for this program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name that's used to refer to a VOD source.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @return The name that's used to refer to a VOD source.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The name that's used to refer to a VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name that's used to refer to a VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramResult withVodSourceName(String vodSourceName) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAudienceMedia() != null)
            sb.append("AudienceMedia: ").append(getAudienceMedia()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getClipRange() != null)
            sb.append("ClipRange: ").append(getClipRange()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDurationMillis() != null)
            sb.append("DurationMillis: ").append(getDurationMillis()).append(",");
        if (getLiveSourceName() != null)
            sb.append("LiveSourceName: ").append(getLiveSourceName()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName()).append(",");
        if (getScheduledStartTime() != null)
            sb.append("ScheduledStartTime: ").append(getScheduledStartTime()).append(",");
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

        if (obj instanceof UpdateProgramResult == false)
            return false;
        UpdateProgramResult other = (UpdateProgramResult) obj;
        if (other.getAdBreaks() == null ^ this.getAdBreaks() == null)
            return false;
        if (other.getAdBreaks() != null && other.getAdBreaks().equals(this.getAdBreaks()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAudienceMedia() == null ^ this.getAudienceMedia() == null)
            return false;
        if (other.getAudienceMedia() != null && other.getAudienceMedia().equals(this.getAudienceMedia()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getClipRange() == null ^ this.getClipRange() == null)
            return false;
        if (other.getClipRange() != null && other.getClipRange().equals(this.getClipRange()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null)
            return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false)
            return false;
        if (other.getLiveSourceName() == null ^ this.getLiveSourceName() == null)
            return false;
        if (other.getLiveSourceName() != null && other.getLiveSourceName().equals(this.getLiveSourceName()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        if (other.getScheduledStartTime() == null ^ this.getScheduledStartTime() == null)
            return false;
        if (other.getScheduledStartTime() != null && other.getScheduledStartTime().equals(this.getScheduledStartTime()) == false)
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
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAudienceMedia() == null) ? 0 : getAudienceMedia().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getClipRange() == null) ? 0 : getClipRange().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode());
        hashCode = prime * hashCode + ((getLiveSourceName() == null) ? 0 : getLiveSourceName().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        hashCode = prime * hashCode + ((getScheduledStartTime() == null) ? 0 : getScheduledStartTime().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProgramResult clone() {
        try {
            return (UpdateProgramResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
