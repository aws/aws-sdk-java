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
 * Provides information about your DataSync <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">task schedule</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/TaskScheduleDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskScheduleDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the last time the status of your task schedule changed. For example, if DataSync automatically disables
     * your schedule because of a repeated error, you can see when the schedule was disabled.
     * </p>
     */
    private java.util.Date statusUpdateTime;
    /**
     * <p>
     * Provides a reason if the task schedule is disabled.
     * </p>
     * <p>
     * If your schedule is disabled by <code>USER</code>, you see a <code>Manually disabled by user.</code> message.
     * </p>
     * <p>
     * If your schedule is disabled by <code>SERVICE</code>, you see an error message to help you understand why the
     * task keeps failing. For information on resolving DataSync errors, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     */
    private String disabledReason;
    /**
     * <p>
     * Indicates how your task schedule was disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - Your schedule was manually disabled by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation or
     * DataSync console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed repeatedly
     * with the same error.
     * </p>
     * </li>
     * </ul>
     */
    private String disabledBy;

    /**
     * <p>
     * Indicates the last time the status of your task schedule changed. For example, if DataSync automatically disables
     * your schedule because of a repeated error, you can see when the schedule was disabled.
     * </p>
     * 
     * @param statusUpdateTime
     *        Indicates the last time the status of your task schedule changed. For example, if DataSync automatically
     *        disables your schedule because of a repeated error, you can see when the schedule was disabled.
     */

    public void setStatusUpdateTime(java.util.Date statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    /**
     * <p>
     * Indicates the last time the status of your task schedule changed. For example, if DataSync automatically disables
     * your schedule because of a repeated error, you can see when the schedule was disabled.
     * </p>
     * 
     * @return Indicates the last time the status of your task schedule changed. For example, if DataSync automatically
     *         disables your schedule because of a repeated error, you can see when the schedule was disabled.
     */

    public java.util.Date getStatusUpdateTime() {
        return this.statusUpdateTime;
    }

    /**
     * <p>
     * Indicates the last time the status of your task schedule changed. For example, if DataSync automatically disables
     * your schedule because of a repeated error, you can see when the schedule was disabled.
     * </p>
     * 
     * @param statusUpdateTime
     *        Indicates the last time the status of your task schedule changed. For example, if DataSync automatically
     *        disables your schedule because of a repeated error, you can see when the schedule was disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskScheduleDetails withStatusUpdateTime(java.util.Date statusUpdateTime) {
        setStatusUpdateTime(statusUpdateTime);
        return this;
    }

    /**
     * <p>
     * Provides a reason if the task schedule is disabled.
     * </p>
     * <p>
     * If your schedule is disabled by <code>USER</code>, you see a <code>Manually disabled by user.</code> message.
     * </p>
     * <p>
     * If your schedule is disabled by <code>SERVICE</code>, you see an error message to help you understand why the
     * task keeps failing. For information on resolving DataSync errors, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @param disabledReason
     *        Provides a reason if the task schedule is disabled.</p>
     *        <p>
     *        If your schedule is disabled by <code>USER</code>, you see a <code>Manually disabled by user.</code>
     *        message.
     *        </p>
     *        <p>
     *        If your schedule is disabled by <code>SERVICE</code>, you see an error message to help you understand why
     *        the task keeps failing. For information on resolving DataSync errors, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *        >Troubleshooting issues with DataSync transfers</a>.
     */

    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
    }

    /**
     * <p>
     * Provides a reason if the task schedule is disabled.
     * </p>
     * <p>
     * If your schedule is disabled by <code>USER</code>, you see a <code>Manually disabled by user.</code> message.
     * </p>
     * <p>
     * If your schedule is disabled by <code>SERVICE</code>, you see an error message to help you understand why the
     * task keeps failing. For information on resolving DataSync errors, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @return Provides a reason if the task schedule is disabled.</p>
     *         <p>
     *         If your schedule is disabled by <code>USER</code>, you see a <code>Manually disabled by user.</code>
     *         message.
     *         </p>
     *         <p>
     *         If your schedule is disabled by <code>SERVICE</code>, you see an error message to help you understand why
     *         the task keeps failing. For information on resolving DataSync errors, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *         >Troubleshooting issues with DataSync transfers</a>.
     */

    public String getDisabledReason() {
        return this.disabledReason;
    }

    /**
     * <p>
     * Provides a reason if the task schedule is disabled.
     * </p>
     * <p>
     * If your schedule is disabled by <code>USER</code>, you see a <code>Manually disabled by user.</code> message.
     * </p>
     * <p>
     * If your schedule is disabled by <code>SERVICE</code>, you see an error message to help you understand why the
     * task keeps failing. For information on resolving DataSync errors, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     * >Troubleshooting issues with DataSync transfers</a>.
     * </p>
     * 
     * @param disabledReason
     *        Provides a reason if the task schedule is disabled.</p>
     *        <p>
     *        If your schedule is disabled by <code>USER</code>, you see a <code>Manually disabled by user.</code>
     *        message.
     *        </p>
     *        <p>
     *        If your schedule is disabled by <code>SERVICE</code>, you see an error message to help you understand why
     *        the task keeps failing. For information on resolving DataSync errors, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/troubleshooting-datasync-locations-tasks.html"
     *        >Troubleshooting issues with DataSync transfers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskScheduleDetails withDisabledReason(String disabledReason) {
        setDisabledReason(disabledReason);
        return this;
    }

    /**
     * <p>
     * Indicates how your task schedule was disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - Your schedule was manually disabled by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation or
     * DataSync console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed repeatedly
     * with the same error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disabledBy
     *        Indicates how your task schedule was disabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - Your schedule was manually disabled by using the <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation
     *        or DataSync console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed
     *        repeatedly with the same error.
     *        </p>
     *        </li>
     * @see ScheduleDisabledBy
     */

    public void setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy;
    }

    /**
     * <p>
     * Indicates how your task schedule was disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - Your schedule was manually disabled by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation or
     * DataSync console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed repeatedly
     * with the same error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates how your task schedule was disabled.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>USER</code> - Your schedule was manually disabled by using the <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation
     *         or DataSync console.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed
     *         repeatedly with the same error.
     *         </p>
     *         </li>
     * @see ScheduleDisabledBy
     */

    public String getDisabledBy() {
        return this.disabledBy;
    }

    /**
     * <p>
     * Indicates how your task schedule was disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - Your schedule was manually disabled by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation or
     * DataSync console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed repeatedly
     * with the same error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disabledBy
     *        Indicates how your task schedule was disabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - Your schedule was manually disabled by using the <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation
     *        or DataSync console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed
     *        repeatedly with the same error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleDisabledBy
     */

    public TaskScheduleDetails withDisabledBy(String disabledBy) {
        setDisabledBy(disabledBy);
        return this;
    }

    /**
     * <p>
     * Indicates how your task schedule was disabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - Your schedule was manually disabled by using the <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation or
     * DataSync console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed repeatedly
     * with the same error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disabledBy
     *        Indicates how your task schedule was disabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - Your schedule was manually disabled by using the <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/API_UpdateTask.html">UpdateTask</a> operation
     *        or DataSync console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE</code> - Your schedule was automatically disabled by DataSync because the task failed
     *        repeatedly with the same error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleDisabledBy
     */

    public TaskScheduleDetails withDisabledBy(ScheduleDisabledBy disabledBy) {
        this.disabledBy = disabledBy.toString();
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
        if (getStatusUpdateTime() != null)
            sb.append("StatusUpdateTime: ").append(getStatusUpdateTime()).append(",");
        if (getDisabledReason() != null)
            sb.append("DisabledReason: ").append(getDisabledReason()).append(",");
        if (getDisabledBy() != null)
            sb.append("DisabledBy: ").append(getDisabledBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskScheduleDetails == false)
            return false;
        TaskScheduleDetails other = (TaskScheduleDetails) obj;
        if (other.getStatusUpdateTime() == null ^ this.getStatusUpdateTime() == null)
            return false;
        if (other.getStatusUpdateTime() != null && other.getStatusUpdateTime().equals(this.getStatusUpdateTime()) == false)
            return false;
        if (other.getDisabledReason() == null ^ this.getDisabledReason() == null)
            return false;
        if (other.getDisabledReason() != null && other.getDisabledReason().equals(this.getDisabledReason()) == false)
            return false;
        if (other.getDisabledBy() == null ^ this.getDisabledBy() == null)
            return false;
        if (other.getDisabledBy() != null && other.getDisabledBy().equals(this.getDisabledBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusUpdateTime() == null) ? 0 : getStatusUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getDisabledReason() == null) ? 0 : getDisabledReason().hashCode());
        hashCode = prime * hashCode + ((getDisabledBy() == null) ? 0 : getDisabledBy().hashCode());
        return hashCode;
    }

    @Override
    public TaskScheduleDetails clone() {
        try {
            return (TaskScheduleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.TaskScheduleDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
