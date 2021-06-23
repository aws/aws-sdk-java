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
 * The schedule's ad break properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ScheduleAdBreak" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleAdBreak implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The approximate duration of the ad break, in seconds.
     * </p>
     */
    private Long approximateDurationSeconds;
    /**
     * <p>
     * The approximate time that the ad will start playing.
     * </p>
     */
    private java.util.Date approximateStartTime;
    /**
     * <p>
     * The name of the source location containing the VOD source used for the ad break.
     * </p>
     */
    private String sourceLocationName;
    /**
     * <p>
     * The name of the VOD source used for the ad break.
     * </p>
     */
    private String vodSourceName;

    /**
     * <p>
     * The approximate duration of the ad break, in seconds.
     * </p>
     * 
     * @param approximateDurationSeconds
     *        The approximate duration of the ad break, in seconds.
     */

    public void setApproximateDurationSeconds(Long approximateDurationSeconds) {
        this.approximateDurationSeconds = approximateDurationSeconds;
    }

    /**
     * <p>
     * The approximate duration of the ad break, in seconds.
     * </p>
     * 
     * @return The approximate duration of the ad break, in seconds.
     */

    public Long getApproximateDurationSeconds() {
        return this.approximateDurationSeconds;
    }

    /**
     * <p>
     * The approximate duration of the ad break, in seconds.
     * </p>
     * 
     * @param approximateDurationSeconds
     *        The approximate duration of the ad break, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleAdBreak withApproximateDurationSeconds(Long approximateDurationSeconds) {
        setApproximateDurationSeconds(approximateDurationSeconds);
        return this;
    }

    /**
     * <p>
     * The approximate time that the ad will start playing.
     * </p>
     * 
     * @param approximateStartTime
     *        The approximate time that the ad will start playing.
     */

    public void setApproximateStartTime(java.util.Date approximateStartTime) {
        this.approximateStartTime = approximateStartTime;
    }

    /**
     * <p>
     * The approximate time that the ad will start playing.
     * </p>
     * 
     * @return The approximate time that the ad will start playing.
     */

    public java.util.Date getApproximateStartTime() {
        return this.approximateStartTime;
    }

    /**
     * <p>
     * The approximate time that the ad will start playing.
     * </p>
     * 
     * @param approximateStartTime
     *        The approximate time that the ad will start playing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleAdBreak withApproximateStartTime(java.util.Date approximateStartTime) {
        setApproximateStartTime(approximateStartTime);
        return this;
    }

    /**
     * <p>
     * The name of the source location containing the VOD source used for the ad break.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location containing the VOD source used for the ad break.
     */

    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location containing the VOD source used for the ad break.
     * </p>
     * 
     * @return The name of the source location containing the VOD source used for the ad break.
     */

    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    /**
     * <p>
     * The name of the source location containing the VOD source used for the ad break.
     * </p>
     * 
     * @param sourceLocationName
     *        The name of the source location containing the VOD source used for the ad break.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleAdBreak withSourceLocationName(String sourceLocationName) {
        setSourceLocationName(sourceLocationName);
        return this;
    }

    /**
     * <p>
     * The name of the VOD source used for the ad break.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source used for the ad break.
     */

    public void setVodSourceName(String vodSourceName) {
        this.vodSourceName = vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source used for the ad break.
     * </p>
     * 
     * @return The name of the VOD source used for the ad break.
     */

    public String getVodSourceName() {
        return this.vodSourceName;
    }

    /**
     * <p>
     * The name of the VOD source used for the ad break.
     * </p>
     * 
     * @param vodSourceName
     *        The name of the VOD source used for the ad break.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleAdBreak withVodSourceName(String vodSourceName) {
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

        if (obj instanceof ScheduleAdBreak == false)
            return false;
        ScheduleAdBreak other = (ScheduleAdBreak) obj;
        if (other.getApproximateDurationSeconds() == null ^ this.getApproximateDurationSeconds() == null)
            return false;
        if (other.getApproximateDurationSeconds() != null && other.getApproximateDurationSeconds().equals(this.getApproximateDurationSeconds()) == false)
            return false;
        if (other.getApproximateStartTime() == null ^ this.getApproximateStartTime() == null)
            return false;
        if (other.getApproximateStartTime() != null && other.getApproximateStartTime().equals(this.getApproximateStartTime()) == false)
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
        hashCode = prime * hashCode + ((getSourceLocationName() == null) ? 0 : getSourceLocationName().hashCode());
        hashCode = prime * hashCode + ((getVodSourceName() == null) ? 0 : getVodSourceName().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleAdBreak clone() {
        try {
            return (ScheduleAdBreak) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.ScheduleAdBreakMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
