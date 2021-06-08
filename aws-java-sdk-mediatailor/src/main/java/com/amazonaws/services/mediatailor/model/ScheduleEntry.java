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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties for a schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ScheduleEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The approximate duration of this program, in seconds.
     * </p>
     */
    private Long approximateDurationSeconds;
    /**
     * <p>
     * The approximate time that the program will start playing.
     * </p>
     */
    private java.util.Date approximateStartTime;
    /**
     * <p>
     * The ARN of the program.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the channel that uses this schedule.
     * </p>
     */
    private String channelName;
    /**
     * <p>
     * The name of the program.
     * </p>
     */
    private String programName;
    /**
     * <p>
     * The name of the source location.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The name of the VOD source.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * The approximate duration of this program, in seconds.
     * </p>
     * 
     * @param approximateDurationSeconds
     *        The approximate duration of this program, in seconds.
     */

    public void setApproximateDurationSeconds(Long approximateDurationSeconds) {
        this.approximateDurationSeconds = approximateDurationSeconds;
    }

    /**
     * <p>
     * The approximate duration of this program, in seconds.
     * </p>
     * 
     * @return The approximate duration of this program, in seconds.
     */

    public Long getApproximateDurationSeconds() {
        return this.approximateDurationSeconds;
    }

    /**
     * <p>
     * The approximate duration of this program, in seconds.
     * </p>
     * 
     * @param approximateDurationSeconds
     *        The approximate duration of this program, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleEntry withApproximateDurationSeconds(Long approximateDurationSeconds) {
        setApproximateDurationSeconds(approximateDurationSeconds);
        return this;
    }

    /**
     * <p>
     * The approximate time that the program will start playing.
     * </p>
     * 
     * @param approximateStartTime
     *        The approximate time that the program will start playing.
     */

    public void setApproximateStartTime(java.util.Date approximateStartTime) {
        this.approximateStartTime = approximateStartTime;
    }

    /**
     * <p>
     * The approximate time that the program will start playing.
     * </p>
     * 
     * @return The approximate time that the program will start playing.
     */

    public java.util.Date getApproximateStartTime() {
        return this.approximateStartTime;
    }

    /**
     * <p>
     * The approximate time that the program will start playing.
     * </p>
     * 
     * @param approximateStartTime
     *        The approximate time that the program will start playing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleEntry withApproximateStartTime(java.util.Date approximateStartTime) {
        setApproximateStartTime(approximateStartTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the program.
     * </p>
     * 
     * @param arn
     *        The ARN of the program.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the program.
     * </p>
     * 
     * @return The ARN of the program.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the program.
     * </p>
     * 
     * @param arn
     *        The ARN of the program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleEntry withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the channel that uses this schedule.
     * </p>
     * 
     * @param channelName
     *        The name of the channel that uses this schedule.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * <p>
     * The name of the channel that uses this schedule.
     * </p>
     * 
     * @return The name of the channel that uses this schedule.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * <p>
     * The name of the channel that uses this schedule.
     * </p>
     * 
     * @param channelName
     *        The name of the channel that uses this schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleEntry withChannelName(String channelName) {
        setChannelName(channelName);
        return this;
    }

    /**
     * <p>
     * The name of the program.
     * </p>
     * 
     * @param programName
     *        The name of the program.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * <p>
     * The name of the program.
     * </p>
     * 
     * @return The name of the program.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * <p>
     * The name of the program.
     * </p>
     * 
     * @param programName
     *        The name of the program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleEntry withProgramName(String programName) {
        setProgramName(programName);
        return this;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @return The name of the source location.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleEntry withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The name of the VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source.
     * </p>
     * 
     * @return The name of the VOD source.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleEntry withVodSourceName(String vodSourceName) {
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
        if (getApproximateDurationSeconds() != null)
            sb.append("ApproximateDurationSeconds: ").append(getApproximateDurationSeconds()).append(",");
        if (getApproximateStartTime() != null)
            sb.append("ApproximateStartTime: ").append(getApproximateStartTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName()).append(",");
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

        if (obj instanceof ScheduleEntry == false)
            return false;
        ScheduleEntry other = (ScheduleEntry) obj;
        if (other.getApproximateDurationSeconds() == null ^ this.getApproximateDurationSeconds() == null)
            return false;
        if (other.getApproximateDurationSeconds() != null && other.getApproximateDurationSeconds().equals(this.getApproximateDurationSeconds()) == false)
            return false;
        if (other.getApproximateStartTime() == null ^ this.getApproximateStartTime() == null)
            return false;
        if (other.getApproximateStartTime() != null && other.getApproximateStartTime().equals(this.getApproximateStartTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
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

        hashCode = prime * hashCode + ((getApproximateDurationSeconds() == null) ? 0 : getApproximateDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getApproximateStartTime() == null) ? 0 : getApproximateStartTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleEntry clone() {
        try {
            return (ScheduleEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.ScheduleEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
