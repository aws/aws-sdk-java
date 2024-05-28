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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents a topic refresh schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicRefreshSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRefreshSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that controls whether to schedule is enabled.
     * </p>
     */
    private Boolean isEnabled;
    /**
     * <p>
     * A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE dataset.
     * </p>
     */
    private Boolean basedOnSpiceSchedule;
    /**
     * <p>
     * The starting date and time for the refresh schedule.
     * </p>
     */
    private java.util.Date startingAt;
    /**
     * <p>
     * The timezone that you want the refresh schedule to use.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The time of day when the refresh should run, for example, Monday-Sunday.
     * </p>
     */
    private String repeatAt;
    /**
     * <p>
     * The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     * <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * </p>
     */
    private String topicScheduleType;

    /**
     * <p>
     * A Boolean value that controls whether to schedule is enabled.
     * </p>
     * 
     * @param isEnabled
     *        A Boolean value that controls whether to schedule is enabled.
     */

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * A Boolean value that controls whether to schedule is enabled.
     * </p>
     * 
     * @return A Boolean value that controls whether to schedule is enabled.
     */

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * A Boolean value that controls whether to schedule is enabled.
     * </p>
     * 
     * @param isEnabled
     *        A Boolean value that controls whether to schedule is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshSchedule withIsEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value that controls whether to schedule is enabled.
     * </p>
     * 
     * @return A Boolean value that controls whether to schedule is enabled.
     */

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE dataset.
     * </p>
     * 
     * @param basedOnSpiceSchedule
     *        A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE
     *        dataset.
     */

    public void setBasedOnSpiceSchedule(Boolean basedOnSpiceSchedule) {
        this.basedOnSpiceSchedule = basedOnSpiceSchedule;
    }

    /**
     * <p>
     * A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE dataset.
     * </p>
     * 
     * @return A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE
     *         dataset.
     */

    public Boolean getBasedOnSpiceSchedule() {
        return this.basedOnSpiceSchedule;
    }

    /**
     * <p>
     * A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE dataset.
     * </p>
     * 
     * @param basedOnSpiceSchedule
     *        A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE
     *        dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshSchedule withBasedOnSpiceSchedule(Boolean basedOnSpiceSchedule) {
        setBasedOnSpiceSchedule(basedOnSpiceSchedule);
        return this;
    }

    /**
     * <p>
     * A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE dataset.
     * </p>
     * 
     * @return A Boolean value that controls whether to schedule runs at the same schedule that is specified in SPICE
     *         dataset.
     */

    public Boolean isBasedOnSpiceSchedule() {
        return this.basedOnSpiceSchedule;
    }

    /**
     * <p>
     * The starting date and time for the refresh schedule.
     * </p>
     * 
     * @param startingAt
     *        The starting date and time for the refresh schedule.
     */

    public void setStartingAt(java.util.Date startingAt) {
        this.startingAt = startingAt;
    }

    /**
     * <p>
     * The starting date and time for the refresh schedule.
     * </p>
     * 
     * @return The starting date and time for the refresh schedule.
     */

    public java.util.Date getStartingAt() {
        return this.startingAt;
    }

    /**
     * <p>
     * The starting date and time for the refresh schedule.
     * </p>
     * 
     * @param startingAt
     *        The starting date and time for the refresh schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshSchedule withStartingAt(java.util.Date startingAt) {
        setStartingAt(startingAt);
        return this;
    }

    /**
     * <p>
     * The timezone that you want the refresh schedule to use.
     * </p>
     * 
     * @param timezone
     *        The timezone that you want the refresh schedule to use.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The timezone that you want the refresh schedule to use.
     * </p>
     * 
     * @return The timezone that you want the refresh schedule to use.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The timezone that you want the refresh schedule to use.
     * </p>
     * 
     * @param timezone
     *        The timezone that you want the refresh schedule to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshSchedule withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The time of day when the refresh should run, for example, Monday-Sunday.
     * </p>
     * 
     * @param repeatAt
     *        The time of day when the refresh should run, for example, Monday-Sunday.
     */

    public void setRepeatAt(String repeatAt) {
        this.repeatAt = repeatAt;
    }

    /**
     * <p>
     * The time of day when the refresh should run, for example, Monday-Sunday.
     * </p>
     * 
     * @return The time of day when the refresh should run, for example, Monday-Sunday.
     */

    public String getRepeatAt() {
        return this.repeatAt;
    }

    /**
     * <p>
     * The time of day when the refresh should run, for example, Monday-Sunday.
     * </p>
     * 
     * @param repeatAt
     *        The time of day when the refresh should run, for example, Monday-Sunday.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshSchedule withRepeatAt(String repeatAt) {
        setRepeatAt(repeatAt);
        return this;
    }

    /**
     * <p>
     * The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     * <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * </p>
     * 
     * @param topicScheduleType
     *        The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     *        <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * @see TopicScheduleType
     */

    public void setTopicScheduleType(String topicScheduleType) {
        this.topicScheduleType = topicScheduleType;
    }

    /**
     * <p>
     * The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     * <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * </p>
     * 
     * @return The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>
     *         , <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * @see TopicScheduleType
     */

    public String getTopicScheduleType() {
        return this.topicScheduleType;
    }

    /**
     * <p>
     * The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     * <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * </p>
     * 
     * @param topicScheduleType
     *        The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     *        <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicScheduleType
     */

    public TopicRefreshSchedule withTopicScheduleType(String topicScheduleType) {
        setTopicScheduleType(topicScheduleType);
        return this;
    }

    /**
     * <p>
     * The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     * <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * </p>
     * 
     * @param topicScheduleType
     *        The type of refresh schedule. Valid values for this structure are <code>HOURLY</code>, <code>DAILY</code>,
     *        <code>WEEKLY</code>, and <code>MONTHLY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicScheduleType
     */

    public TopicRefreshSchedule withTopicScheduleType(TopicScheduleType topicScheduleType) {
        this.topicScheduleType = topicScheduleType.toString();
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
        if (getIsEnabled() != null)
            sb.append("IsEnabled: ").append(getIsEnabled()).append(",");
        if (getBasedOnSpiceSchedule() != null)
            sb.append("BasedOnSpiceSchedule: ").append(getBasedOnSpiceSchedule()).append(",");
        if (getStartingAt() != null)
            sb.append("StartingAt: ").append(getStartingAt()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getRepeatAt() != null)
            sb.append("RepeatAt: ").append(getRepeatAt()).append(",");
        if (getTopicScheduleType() != null)
            sb.append("TopicScheduleType: ").append(getTopicScheduleType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRefreshSchedule == false)
            return false;
        TopicRefreshSchedule other = (TopicRefreshSchedule) obj;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
        if (other.getBasedOnSpiceSchedule() == null ^ this.getBasedOnSpiceSchedule() == null)
            return false;
        if (other.getBasedOnSpiceSchedule() != null && other.getBasedOnSpiceSchedule().equals(this.getBasedOnSpiceSchedule()) == false)
            return false;
        if (other.getStartingAt() == null ^ this.getStartingAt() == null)
            return false;
        if (other.getStartingAt() != null && other.getStartingAt().equals(this.getStartingAt()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getRepeatAt() == null ^ this.getRepeatAt() == null)
            return false;
        if (other.getRepeatAt() != null && other.getRepeatAt().equals(this.getRepeatAt()) == false)
            return false;
        if (other.getTopicScheduleType() == null ^ this.getTopicScheduleType() == null)
            return false;
        if (other.getTopicScheduleType() != null && other.getTopicScheduleType().equals(this.getTopicScheduleType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        hashCode = prime * hashCode + ((getBasedOnSpiceSchedule() == null) ? 0 : getBasedOnSpiceSchedule().hashCode());
        hashCode = prime * hashCode + ((getStartingAt() == null) ? 0 : getStartingAt().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getRepeatAt() == null) ? 0 : getRepeatAt().hashCode());
        hashCode = prime * hashCode + ((getTopicScheduleType() == null) ? 0 : getTopicScheduleType().hashCode());
        return hashCode;
    }

    @Override
    public TopicRefreshSchedule clone() {
        try {
            return (TopicRefreshSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicRefreshScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
