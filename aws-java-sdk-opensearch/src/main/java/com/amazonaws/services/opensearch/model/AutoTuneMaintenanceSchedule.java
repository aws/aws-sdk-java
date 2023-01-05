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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Auto-Tune maintenance schedule. For more information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/auto-tune.html">Auto-Tune for Amazon
 * OpenSearch Service</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneMaintenanceSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Epoch timestamp at which the Auto-Tune maintenance schedule starts.
     * </p>
     */
    private java.util.Date startAt;
    /**
     * <p>
     * The duration of the maintenance schedule. For example, <code>"Duration": {"Value": 2, "Unit": "HOURS"}</code>.
     * </p>
     */
    private Duration duration;
    /**
     * <p>
     * A cron expression for a recurring maintenance schedule during which Auto-Tune can deploy changes.
     * </p>
     */
    private String cronExpressionForRecurrence;

    /**
     * <p>
     * The Epoch timestamp at which the Auto-Tune maintenance schedule starts.
     * </p>
     * 
     * @param startAt
     *        The Epoch timestamp at which the Auto-Tune maintenance schedule starts.
     */

    public void setStartAt(java.util.Date startAt) {
        this.startAt = startAt;
    }

    /**
     * <p>
     * The Epoch timestamp at which the Auto-Tune maintenance schedule starts.
     * </p>
     * 
     * @return The Epoch timestamp at which the Auto-Tune maintenance schedule starts.
     */

    public java.util.Date getStartAt() {
        return this.startAt;
    }

    /**
     * <p>
     * The Epoch timestamp at which the Auto-Tune maintenance schedule starts.
     * </p>
     * 
     * @param startAt
     *        The Epoch timestamp at which the Auto-Tune maintenance schedule starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneMaintenanceSchedule withStartAt(java.util.Date startAt) {
        setStartAt(startAt);
        return this;
    }

    /**
     * <p>
     * The duration of the maintenance schedule. For example, <code>"Duration": {"Value": 2, "Unit": "HOURS"}</code>.
     * </p>
     * 
     * @param duration
     *        The duration of the maintenance schedule. For example,
     *        <code>"Duration": {"Value": 2, "Unit": "HOURS"}</code>.
     */

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the maintenance schedule. For example, <code>"Duration": {"Value": 2, "Unit": "HOURS"}</code>.
     * </p>
     * 
     * @return The duration of the maintenance schedule. For example,
     *         <code>"Duration": {"Value": 2, "Unit": "HOURS"}</code>.
     */

    public Duration getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the maintenance schedule. For example, <code>"Duration": {"Value": 2, "Unit": "HOURS"}</code>.
     * </p>
     * 
     * @param duration
     *        The duration of the maintenance schedule. For example,
     *        <code>"Duration": {"Value": 2, "Unit": "HOURS"}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneMaintenanceSchedule withDuration(Duration duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * A cron expression for a recurring maintenance schedule during which Auto-Tune can deploy changes.
     * </p>
     * 
     * @param cronExpressionForRecurrence
     *        A cron expression for a recurring maintenance schedule during which Auto-Tune can deploy changes.
     */

    public void setCronExpressionForRecurrence(String cronExpressionForRecurrence) {
        this.cronExpressionForRecurrence = cronExpressionForRecurrence;
    }

    /**
     * <p>
     * A cron expression for a recurring maintenance schedule during which Auto-Tune can deploy changes.
     * </p>
     * 
     * @return A cron expression for a recurring maintenance schedule during which Auto-Tune can deploy changes.
     */

    public String getCronExpressionForRecurrence() {
        return this.cronExpressionForRecurrence;
    }

    /**
     * <p>
     * A cron expression for a recurring maintenance schedule during which Auto-Tune can deploy changes.
     * </p>
     * 
     * @param cronExpressionForRecurrence
     *        A cron expression for a recurring maintenance schedule during which Auto-Tune can deploy changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneMaintenanceSchedule withCronExpressionForRecurrence(String cronExpressionForRecurrence) {
        setCronExpressionForRecurrence(cronExpressionForRecurrence);
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
        if (getStartAt() != null)
            sb.append("StartAt: ").append(getStartAt()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getCronExpressionForRecurrence() != null)
            sb.append("CronExpressionForRecurrence: ").append(getCronExpressionForRecurrence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoTuneMaintenanceSchedule == false)
            return false;
        AutoTuneMaintenanceSchedule other = (AutoTuneMaintenanceSchedule) obj;
        if (other.getStartAt() == null ^ this.getStartAt() == null)
            return false;
        if (other.getStartAt() != null && other.getStartAt().equals(this.getStartAt()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getCronExpressionForRecurrence() == null ^ this.getCronExpressionForRecurrence() == null)
            return false;
        if (other.getCronExpressionForRecurrence() != null && other.getCronExpressionForRecurrence().equals(this.getCronExpressionForRecurrence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartAt() == null) ? 0 : getStartAt().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getCronExpressionForRecurrence() == null) ? 0 : getCronExpressionForRecurrence().hashCode());
        return hashCode;
    }

    @Override
    public AutoTuneMaintenanceSchedule clone() {
        try {
            return (AutoTuneMaintenanceSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AutoTuneMaintenanceScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
