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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures your DataSync task to run on a <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">schedule</a> (at a minimum interval
 * of 1 hour).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TaskSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies your task schedule by using a cron expression in UTC time. For information about cron expression
     * syntax, see the <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html">
     * <i>Amazon EventBridge User Guide</i> </a>.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there can be
     * situations where you need to disable it. For example, you might need to pause a recurring transfer to fix an
     * issue with your task or perform maintenance on your storage system.
     * </p>
     * <p>
     * DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html">TaskScheduleDetails
     * </a>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies your task schedule by using a cron expression in UTC time. For information about cron expression
     * syntax, see the <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html">
     * <i>Amazon EventBridge User Guide</i> </a>.
     * </p>
     * 
     * @param scheduleExpression
     *        Specifies your task schedule by using a cron expression in UTC time. For information about cron expression
     *        syntax, see the <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html"> <i>Amazon
     *        EventBridge User Guide</i> </a>.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * Specifies your task schedule by using a cron expression in UTC time. For information about cron expression
     * syntax, see the <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html">
     * <i>Amazon EventBridge User Guide</i> </a>.
     * </p>
     * 
     * @return Specifies your task schedule by using a cron expression in UTC time. For information about cron
     *         expression syntax, see the <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html"> <i>Amazon
     *         EventBridge User Guide</i> </a>.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * Specifies your task schedule by using a cron expression in UTC time. For information about cron expression
     * syntax, see the <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html">
     * <i>Amazon EventBridge User Guide</i> </a>.
     * </p>
     * 
     * @param scheduleExpression
     *        Specifies your task schedule by using a cron expression in UTC time. For information about cron expression
     *        syntax, see the <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-cron-expressions.html"> <i>Amazon
     *        EventBridge User Guide</i> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSchedule withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there can be
     * situations where you need to disable it. For example, you might need to pause a recurring transfer to fix an
     * issue with your task or perform maintenance on your storage system.
     * </p>
     * <p>
     * DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html">TaskScheduleDetails
     * </a>.
     * </p>
     * 
     * @param status
     *        Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there
     *        can be situations where you need to disable it. For example, you might need to pause a recurring transfer
     *        to fix an issue with your task or perform maintenance on your storage system.</p>
     *        <p>
     *        DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html"
     *        >TaskScheduleDetails</a>.
     * @see ScheduleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there can be
     * situations where you need to disable it. For example, you might need to pause a recurring transfer to fix an
     * issue with your task or perform maintenance on your storage system.
     * </p>
     * <p>
     * DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html">TaskScheduleDetails
     * </a>.
     * </p>
     * 
     * @return Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there
     *         can be situations where you need to disable it. For example, you might need to pause a recurring transfer
     *         to fix an issue with your task or perform maintenance on your storage system.</p>
     *         <p>
     *         DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html"
     *         >TaskScheduleDetails</a>.
     * @see ScheduleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there can be
     * situations where you need to disable it. For example, you might need to pause a recurring transfer to fix an
     * issue with your task or perform maintenance on your storage system.
     * </p>
     * <p>
     * DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html">TaskScheduleDetails
     * </a>.
     * </p>
     * 
     * @param status
     *        Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there
     *        can be situations where you need to disable it. For example, you might need to pause a recurring transfer
     *        to fix an issue with your task or perform maintenance on your storage system.</p>
     *        <p>
     *        DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html"
     *        >TaskScheduleDetails</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public TaskSchedule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there can be
     * situations where you need to disable it. For example, you might need to pause a recurring transfer to fix an
     * issue with your task or perform maintenance on your storage system.
     * </p>
     * <p>
     * DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html">TaskScheduleDetails
     * </a>.
     * </p>
     * 
     * @param status
     *        Specifies whether to enable or disable your task schedule. Your schedule is enabled by default, but there
     *        can be situations where you need to disable it. For example, you might need to pause a recurring transfer
     *        to fix an issue with your task or perform maintenance on your storage system.</p>
     *        <p>
     *        DataSync might disable your schedule automatically if your task fails repeatedly with the same error. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_TaskScheduleDetails.html"
     *        >TaskScheduleDetails</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public TaskSchedule withStatus(ScheduleStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskSchedule == false)
            return false;
        TaskSchedule other = (TaskSchedule) obj;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public TaskSchedule clone() {
        try {
            return (TaskSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.TaskScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
