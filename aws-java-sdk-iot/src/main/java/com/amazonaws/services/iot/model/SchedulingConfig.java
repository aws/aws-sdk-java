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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the date and time that a job will begin the rollout of the job document to all devices in the target group.
 * Additionally, you can specify the end behavior for each job execution when it reaches the scheduled end time.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchedulingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in the target group for a job. The
     * <code>startTime</code> can be scheduled up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time. The date and time format for the <code>startTime</code> is YYYY-MM-DD for the date and
     * HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>startTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in the target group for a job. The
     * <code>endTime</code> must take place no later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between <code>startTime</code> and
     * <code>endTime</code> is thirty minutes. The maximum duration between <code>startTime</code> and
     * <code>endTime</code> is two years. The date and time format for the <code>endTime</code> is YYYY-MM-DD for the
     * date and HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>endTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>. If
     * <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     */
    private String endBehavior;
    /**
     * <p>
     * An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window with a
     * predetermined start time and duration for the rollout of a job document to all devices in a target group for a
     * job.
     * </p>
     */
    private java.util.List<MaintenanceWindow> maintenanceWindows;

    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in the target group for a job. The
     * <code>startTime</code> can be scheduled up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time. The date and time format for the <code>startTime</code> is YYYY-MM-DD for the date and
     * HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>startTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The time a job will begin rollout of the job document to all devices in the target group for a job. The
     *        <code>startTime</code> can be scheduled up to a year in advance and must be scheduled a minimum of thirty
     *        minutes from the current time. The date and time format for the <code>startTime</code> is YYYY-MM-DD for
     *        the date and HH:MM for the time.</p>
     *        <p>
     *        For more information on the syntax for <code>startTime</code> when using an API command or the Command
     *        Line Interface, see <a href=
     *        "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     *        >Timestamp</a>.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in the target group for a job. The
     * <code>startTime</code> can be scheduled up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time. The date and time format for the <code>startTime</code> is YYYY-MM-DD for the date and
     * HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>startTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     * 
     * @return The time a job will begin rollout of the job document to all devices in the target group for a job. The
     *         <code>startTime</code> can be scheduled up to a year in advance and must be scheduled a minimum of thirty
     *         minutes from the current time. The date and time format for the <code>startTime</code> is YYYY-MM-DD for
     *         the date and HH:MM for the time.</p>
     *         <p>
     *         For more information on the syntax for <code>startTime</code> when using an API command or the Command
     *         Line Interface, see <a href=
     *         "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     *         >Timestamp</a>.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time a job will begin rollout of the job document to all devices in the target group for a job. The
     * <code>startTime</code> can be scheduled up to a year in advance and must be scheduled a minimum of thirty minutes
     * from the current time. The date and time format for the <code>startTime</code> is YYYY-MM-DD for the date and
     * HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>startTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     * 
     * @param startTime
     *        The time a job will begin rollout of the job document to all devices in the target group for a job. The
     *        <code>startTime</code> can be scheduled up to a year in advance and must be scheduled a minimum of thirty
     *        minutes from the current time. The date and time format for the <code>startTime</code> is YYYY-MM-DD for
     *        the date and HH:MM for the time.</p>
     *        <p>
     *        For more information on the syntax for <code>startTime</code> when using an API command or the Command
     *        Line Interface, see <a href=
     *        "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     *        >Timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingConfig withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in the target group for a job. The
     * <code>endTime</code> must take place no later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between <code>startTime</code> and
     * <code>endTime</code> is thirty minutes. The maximum duration between <code>startTime</code> and
     * <code>endTime</code> is two years. The date and time format for the <code>endTime</code> is YYYY-MM-DD for the
     * date and HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>endTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     * 
     * @param endTime
     *        The time a job will stop rollout of the job document to all devices in the target group for a job. The
     *        <code>endTime</code> must take place no later than two years from the current time and be scheduled a
     *        minimum of thirty minutes from the current time. The minimum duration between <code>startTime</code> and
     *        <code>endTime</code> is thirty minutes. The maximum duration between <code>startTime</code> and
     *        <code>endTime</code> is two years. The date and time format for the <code>endTime</code> is YYYY-MM-DD for
     *        the date and HH:MM for the time.</p>
     *        <p>
     *        For more information on the syntax for <code>endTime</code> when using an API command or the Command Line
     *        Interface, see <a href=
     *        "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     *        >Timestamp</a>.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in the target group for a job. The
     * <code>endTime</code> must take place no later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between <code>startTime</code> and
     * <code>endTime</code> is thirty minutes. The maximum duration between <code>startTime</code> and
     * <code>endTime</code> is two years. The date and time format for the <code>endTime</code> is YYYY-MM-DD for the
     * date and HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>endTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     * 
     * @return The time a job will stop rollout of the job document to all devices in the target group for a job. The
     *         <code>endTime</code> must take place no later than two years from the current time and be scheduled a
     *         minimum of thirty minutes from the current time. The minimum duration between <code>startTime</code> and
     *         <code>endTime</code> is thirty minutes. The maximum duration between <code>startTime</code> and
     *         <code>endTime</code> is two years. The date and time format for the <code>endTime</code> is YYYY-MM-DD
     *         for the date and HH:MM for the time.</p>
     *         <p>
     *         For more information on the syntax for <code>endTime</code> when using an API command or the Command Line
     *         Interface, see <a href=
     *         "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     *         >Timestamp</a>.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time a job will stop rollout of the job document to all devices in the target group for a job. The
     * <code>endTime</code> must take place no later than two years from the current time and be scheduled a minimum of
     * thirty minutes from the current time. The minimum duration between <code>startTime</code> and
     * <code>endTime</code> is thirty minutes. The maximum duration between <code>startTime</code> and
     * <code>endTime</code> is two years. The date and time format for the <code>endTime</code> is YYYY-MM-DD for the
     * date and HH:MM for the time.
     * </p>
     * <p>
     * For more information on the syntax for <code>endTime</code> when using an API command or the Command Line
     * Interface, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     * >Timestamp</a>.
     * </p>
     * 
     * @param endTime
     *        The time a job will stop rollout of the job document to all devices in the target group for a job. The
     *        <code>endTime</code> must take place no later than two years from the current time and be scheduled a
     *        minimum of thirty minutes from the current time. The minimum duration between <code>startTime</code> and
     *        <code>endTime</code> is thirty minutes. The maximum duration between <code>startTime</code> and
     *        <code>endTime</code> is two years. The date and time format for the <code>endTime</code> is YYYY-MM-DD for
     *        the date and HH:MM for the time.</p>
     *        <p>
     *        For more information on the syntax for <code>endTime</code> when using an API command or the Command Line
     *        Interface, see <a href=
     *        "https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-parameters-types.html#parameter-type-timestamp"
     *        >Timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingConfig withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>. If
     * <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * 
     * @param endBehavior
     *        Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>.
     *        If <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not
     *        apply.
     * @see JobEndBehavior
     */

    public void setEndBehavior(String endBehavior) {
        this.endBehavior = endBehavior;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>. If
     * <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * 
     * @return Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>.
     *         If <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not
     *         apply.
     * @see JobEndBehavior
     */

    public String getEndBehavior() {
        return this.endBehavior;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>. If
     * <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * 
     * @param endBehavior
     *        Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>.
     *        If <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not
     *        apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobEndBehavior
     */

    public SchedulingConfig withEndBehavior(String endBehavior) {
        setEndBehavior(endBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>. If
     * <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not apply.
     * </p>
     * 
     * @param endBehavior
     *        Specifies the end behavior for all job executions after a job reaches the selected <code>endTime</code>.
     *        If <code>endTime</code> is not selected when creating the job, then <code>endBehavior</code> does not
     *        apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobEndBehavior
     */

    public SchedulingConfig withEndBehavior(JobEndBehavior endBehavior) {
        this.endBehavior = endBehavior.toString();
        return this;
    }

    /**
     * <p>
     * An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window with a
     * predetermined start time and duration for the rollout of a job document to all devices in a target group for a
     * job.
     * </p>
     * 
     * @return An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance
     *         window with a predetermined start time and duration for the rollout of a job document to all devices in a
     *         target group for a job.
     */

    public java.util.List<MaintenanceWindow> getMaintenanceWindows() {
        return maintenanceWindows;
    }

    /**
     * <p>
     * An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window with a
     * predetermined start time and duration for the rollout of a job document to all devices in a target group for a
     * job.
     * </p>
     * 
     * @param maintenanceWindows
     *        An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window
     *        with a predetermined start time and duration for the rollout of a job document to all devices in a target
     *        group for a job.
     */

    public void setMaintenanceWindows(java.util.Collection<MaintenanceWindow> maintenanceWindows) {
        if (maintenanceWindows == null) {
            this.maintenanceWindows = null;
            return;
        }

        this.maintenanceWindows = new java.util.ArrayList<MaintenanceWindow>(maintenanceWindows);
    }

    /**
     * <p>
     * An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window with a
     * predetermined start time and duration for the rollout of a job document to all devices in a target group for a
     * job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMaintenanceWindows(java.util.Collection)} or {@link #withMaintenanceWindows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param maintenanceWindows
     *        An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window
     *        with a predetermined start time and duration for the rollout of a job document to all devices in a target
     *        group for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingConfig withMaintenanceWindows(MaintenanceWindow... maintenanceWindows) {
        if (this.maintenanceWindows == null) {
            setMaintenanceWindows(new java.util.ArrayList<MaintenanceWindow>(maintenanceWindows.length));
        }
        for (MaintenanceWindow ele : maintenanceWindows) {
            this.maintenanceWindows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window with a
     * predetermined start time and duration for the rollout of a job document to all devices in a target group for a
     * job.
     * </p>
     * 
     * @param maintenanceWindows
     *        An optional configuration within the <code>SchedulingConfig</code> to setup a recurring maintenance window
     *        with a predetermined start time and duration for the rollout of a job document to all devices in a target
     *        group for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchedulingConfig withMaintenanceWindows(java.util.Collection<MaintenanceWindow> maintenanceWindows) {
        setMaintenanceWindows(maintenanceWindows);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getEndBehavior() != null)
            sb.append("EndBehavior: ").append(getEndBehavior()).append(",");
        if (getMaintenanceWindows() != null)
            sb.append("MaintenanceWindows: ").append(getMaintenanceWindows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchedulingConfig == false)
            return false;
        SchedulingConfig other = (SchedulingConfig) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEndBehavior() == null ^ this.getEndBehavior() == null)
            return false;
        if (other.getEndBehavior() != null && other.getEndBehavior().equals(this.getEndBehavior()) == false)
            return false;
        if (other.getMaintenanceWindows() == null ^ this.getMaintenanceWindows() == null)
            return false;
        if (other.getMaintenanceWindows() != null && other.getMaintenanceWindows().equals(this.getMaintenanceWindows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEndBehavior() == null) ? 0 : getEndBehavior().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindows() == null) ? 0 : getMaintenanceWindows().hashCode());
        return hashCode;
    }

    @Override
    public SchedulingConfig clone() {
        try {
            return (SchedulingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.SchedulingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
