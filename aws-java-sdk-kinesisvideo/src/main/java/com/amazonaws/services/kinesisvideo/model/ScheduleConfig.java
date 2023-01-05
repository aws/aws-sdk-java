/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This API enables you to specify the duration that the camera, or local media file, should record onto the Edge Agent.
 * The <code>ScheduleConfig</code> consists of the <code>ScheduleExpression</code> and the
 * <code>DurationInMinutes</code> attributes.
 * </p>
 * <p>
 * If the <code>ScheduleExpression</code> is not provided, then the Edge Agent will always be set to recording mode.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ScheduleConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media file,
     * onto the Edge Agent. If the <code>ScheduleExpression</code> is not provided for the <code>RecorderConfig</code>,
     * then the Edge Agent will always be set to recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a
     * href="http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"> <i>Cron Trigger
     * Tutorial</i> </a> page to understand the valid expressions and its use.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The total duration to record the media. If the <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media file,
     * onto the Edge Agent. If the <code>ScheduleExpression</code> is not provided for the <code>RecorderConfig</code>,
     * then the Edge Agent will always be set to recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a
     * href="http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"> <i>Cron Trigger
     * Tutorial</i> </a> page to understand the valid expressions and its use.
     * </p>
     * 
     * @param scheduleExpression
     *        The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media
     *        file, onto the Edge Agent. If the <code>ScheduleExpression</code> is not provided for the
     *        <code>RecorderConfig</code>, then the Edge Agent will always be set to recording mode.</p>
     *        <p>
     *        For more information about Quartz, refer to the <a
     *        href="http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"> <i>Cron
     *        Trigger Tutorial</i> </a> page to understand the valid expressions and its use.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media file,
     * onto the Edge Agent. If the <code>ScheduleExpression</code> is not provided for the <code>RecorderConfig</code>,
     * then the Edge Agent will always be set to recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a
     * href="http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"> <i>Cron Trigger
     * Tutorial</i> </a> page to understand the valid expressions and its use.
     * </p>
     * 
     * @return The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media
     *         file, onto the Edge Agent. If the <code>ScheduleExpression</code> is not provided for the
     *         <code>RecorderConfig</code>, then the Edge Agent will always be set to recording mode.</p>
     *         <p>
     *         For more information about Quartz, refer to the <a
     *         href="http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"> <i>Cron
     *         Trigger Tutorial</i> </a> page to understand the valid expressions and its use.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media file,
     * onto the Edge Agent. If the <code>ScheduleExpression</code> is not provided for the <code>RecorderConfig</code>,
     * then the Edge Agent will always be set to recording mode.
     * </p>
     * <p>
     * For more information about Quartz, refer to the <a
     * href="http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"> <i>Cron Trigger
     * Tutorial</i> </a> page to understand the valid expressions and its use.
     * </p>
     * 
     * @param scheduleExpression
     *        The Quartz cron expression that takes care of scheduling jobs to record from the camera, or local media
     *        file, onto the Edge Agent. If the <code>ScheduleExpression</code> is not provided for the
     *        <code>RecorderConfig</code>, then the Edge Agent will always be set to recording mode.</p>
     *        <p>
     *        For more information about Quartz, refer to the <a
     *        href="http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html"> <i>Cron
     *        Trigger Tutorial</i> </a> page to understand the valid expressions and its use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleConfig withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The total duration to record the media. If the <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     * 
     * @param durationInSeconds
     *        The total duration to record the media. If the <code>ScheduleExpression</code> attribute is provided, then
     *        the <code>DurationInSeconds</code> attribute should also be specified.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The total duration to record the media. If the <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     * 
     * @return The total duration to record the media. If the <code>ScheduleExpression</code> attribute is provided,
     *         then the <code>DurationInSeconds</code> attribute should also be specified.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The total duration to record the media. If the <code>ScheduleExpression</code> attribute is provided, then the
     * <code>DurationInSeconds</code> attribute should also be specified.
     * </p>
     * 
     * @param durationInSeconds
     *        The total duration to record the media. If the <code>ScheduleExpression</code> attribute is provided, then
     *        the <code>DurationInSeconds</code> attribute should also be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleConfig withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
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
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleConfig == false)
            return false;
        ScheduleConfig other = (ScheduleConfig) obj;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleConfig clone() {
        try {
            return (ScheduleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.ScheduleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
