/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A scheduling object using a <code>cron</code> statement to schedule an event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Schedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * The state of the schedule.
     * </p>
     */
    private String state;

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @param scheduleExpression
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @return A <code>cron</code> expression used to specify the schedule (see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based
     *         Schedules for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would
     *         specify: <code>cron(15 12 * * ? *)</code>.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @param scheduleExpression
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * 
     * @param state
     *        The state of the schedule.
     * @see ScheduleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * 
     * @return The state of the schedule.
     * @see ScheduleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * 
     * @param state
     *        The state of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public Schedule withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the schedule.
     * </p>
     * 
     * @param state
     *        The state of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public Schedule withState(ScheduleState state) {
        this.state = state.toString();
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
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Schedule clone() {
        try {
            return (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
