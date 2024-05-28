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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateProgram" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProgramRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ad break configuration settings.
     * </p>
     */
    private java.util.List<AdBreak> adBreaks;
    /**
     * <p>
     * The list of AudienceMedia defined in program.
     * </p>
     */
    private java.util.List<AudienceMedia> audienceMedia;
    /**
     * <p>
     * The name of the channel for this Program.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The name of the Program.
     * </p>
     */
    private String programName;
    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     */
    private UpdateProgramScheduleConfiguration scheduleConfiguration;

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

    public UpdateProgramRequest withAdBreaks(AdBreak... adBreaks) {
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

    public UpdateProgramRequest withAdBreaks(java.util.Collection<AdBreak> adBreaks) {
        setAdBreaks(adBreaks);
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

    public UpdateProgramRequest withAudienceMedia(AudienceMedia... audienceMedia) {
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

    public UpdateProgramRequest withAudienceMedia(java.util.Collection<AudienceMedia> audienceMedia) {
        setAudienceMedia(audienceMedia);
        return this;
    }

    /**
     * <p>
     * The name of the channel for this Program.
     * </p>
     * 
     * @param channelName
     *        The name of the channel for this Program.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel for this Program.
     * </p>
     * 
     * @return The name of the channel for this Program.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel for this Program.
     * </p>
     * 
     * @param channelName
     *        The name of the channel for this Program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramRequest withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name of the Program.
     * </p>
     * 
     * @param programName
     *        The name of the Program.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * <p>
     * The name of the Program.
     * </p>
     * 
     * @return The name of the Program.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * <p>
     * The name of the Program.
     * </p>
     * 
     * @param programName
     *        The name of the Program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramRequest withProgramName(String programName) {
        setProgramName(programName);
        return this;
    }

    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The schedule configuration settings.
     */

    public void setScheduleConfiguration(UpdateProgramScheduleConfiguration scheduleConfiguration) {
        this.scheduleConfiguration = scheduleConfiguration;
    }

    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     * 
     * @return The schedule configuration settings.
     */

    public UpdateProgramScheduleConfiguration getScheduleConfiguration() {
        return this.scheduleConfiguration;
    }

    /**
     * <p>
     * The schedule configuration settings.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The schedule configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProgramRequest withScheduleConfiguration(UpdateProgramScheduleConfiguration scheduleConfiguration) {
        setScheduleConfiguration(scheduleConfiguration);
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
        if (getAudienceMedia() != null)
            sb.append("AudienceMedia: ").append(getAudienceMedia()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName()).append(",");
        if (getScheduleConfiguration() != null)
            sb.append("ScheduleConfiguration: ").append(getScheduleConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProgramRequest == false)
            return false;
        UpdateProgramRequest other = (UpdateProgramRequest) obj;
        if (other.getAdBreaks() == null ^ this.getAdBreaks() == null)
            return false;
        if (other.getAdBreaks() != null && other.getAdBreaks().equals(this.getAdBreaks()) == false)
            return false;
        if (other.getAudienceMedia() == null ^ this.getAudienceMedia() == null)
            return false;
        if (other.getAudienceMedia() != null && other.getAudienceMedia().equals(this.getAudienceMedia()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        if (other.getScheduleConfiguration() == null ^ this.getScheduleConfiguration() == null)
            return false;
        if (other.getScheduleConfiguration() != null && other.getScheduleConfiguration().equals(this.getScheduleConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdBreaks() == null) ? 0 : getAdBreaks().hashCode());
        hashCode = prime * hashCode + ((getAudienceMedia() == null) ? 0 : getAudienceMedia().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        hashCode = prime * hashCode + ((getScheduleConfiguration() == null) ? 0 : getScheduleConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProgramRequest clone() {
        return (UpdateProgramRequest) super.clone();
    }

}
