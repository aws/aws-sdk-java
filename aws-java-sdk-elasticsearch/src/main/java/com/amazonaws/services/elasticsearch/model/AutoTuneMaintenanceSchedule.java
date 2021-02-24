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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies Auto-Tune maitenance schedule. See the <a
 * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
 * target="_blank">Developer Guide</a> for more information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoTuneMaintenanceSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies timestamp at which Auto-Tune maintenance schedule start.
     * </p>
     */
    private java.util.Date startAt;
    /**
     * <p>
     * Specifies maintenance schedule duration: duration value and duration unit. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     */
    private Duration duration;
    /**
     * <p>
     * Specifies cron expression for a recurring maintenance schedule. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     */
    private String cronExpressionForRecurrence;

    /**
     * <p>
     * Specifies timestamp at which Auto-Tune maintenance schedule start.
     * </p>
     * 
     * @param startAt
     *        Specifies timestamp at which Auto-Tune maintenance schedule start.
     */

    public void setStartAt(java.util.Date startAt) {
        this.startAt = startAt;
    }

    /**
     * <p>
     * Specifies timestamp at which Auto-Tune maintenance schedule start.
     * </p>
     * 
     * @return Specifies timestamp at which Auto-Tune maintenance schedule start.
     */

    public java.util.Date getStartAt() {
        return this.startAt;
    }

    /**
     * <p>
     * Specifies timestamp at which Auto-Tune maintenance schedule start.
     * </p>
     * 
     * @param startAt
     *        Specifies timestamp at which Auto-Tune maintenance schedule start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneMaintenanceSchedule withStartAt(java.util.Date startAt) {
        setStartAt(startAt);
        return this;
    }

    /**
     * <p>
     * Specifies maintenance schedule duration: duration value and duration unit. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param duration
     *        Specifies maintenance schedule duration: duration value and duration unit. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
     */

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * Specifies maintenance schedule duration: duration value and duration unit. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @return Specifies maintenance schedule duration: duration value and duration unit. See the <a
     *         href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *         target="_blank">Developer Guide</a> for more information.
     */

    public Duration getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * Specifies maintenance schedule duration: duration value and duration unit. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param duration
     *        Specifies maintenance schedule duration: duration value and duration unit. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoTuneMaintenanceSchedule withDuration(Duration duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * Specifies cron expression for a recurring maintenance schedule. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param cronExpressionForRecurrence
     *        Specifies cron expression for a recurring maintenance schedule. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
     */

    public void setCronExpressionForRecurrence(String cronExpressionForRecurrence) {
        this.cronExpressionForRecurrence = cronExpressionForRecurrence;
    }

    /**
     * <p>
     * Specifies cron expression for a recurring maintenance schedule. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @return Specifies cron expression for a recurring maintenance schedule. See the <a
     *         href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *         target="_blank">Developer Guide</a> for more information.
     */

    public String getCronExpressionForRecurrence() {
        return this.cronExpressionForRecurrence;
    }

    /**
     * <p>
     * Specifies cron expression for a recurring maintenance schedule. See the <a
     * href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     * target="_blank">Developer Guide</a> for more information.
     * </p>
     * 
     * @param cronExpressionForRecurrence
     *        Specifies cron expression for a recurring maintenance schedule. See the <a
     *        href="https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/auto-tune.html"
     *        target="_blank">Developer Guide</a> for more information.
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
        com.amazonaws.services.elasticsearch.model.transform.AutoTuneMaintenanceScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
