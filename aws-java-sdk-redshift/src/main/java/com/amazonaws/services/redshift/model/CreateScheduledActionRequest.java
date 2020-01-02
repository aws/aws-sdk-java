/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateScheduledAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduledActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scheduled action. The name must be unique within an account. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private ScheduledActionType targetAction;
    /**
     * <p>
     * The schedule in <code>at( )</code> or <code>cron( )</code> format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     */
    private String scheduledActionDescription;
    /**
     * <p>
     * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about
     * <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     * </p>
     */
    private Boolean enable;

    /**
     * <p>
     * The name of the scheduled action. The name must be unique within an account. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action. The name must be unique within an account. For more information about
     *        this parameter, see <a>ScheduledAction</a>.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action. The name must be unique within an account. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @return The name of the scheduled action. The name must be unique within an account. For more information about
     *         this parameter, see <a>ScheduledAction</a>.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action. The name must be unique within an account. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action. The name must be unique within an account. For more information about
     *        this parameter, see <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param targetAction
     *        A JSON format string of the Amazon Redshift API operation with input parameters. For more information
     *        about this parameter, see <a>ScheduledAction</a>.
     */

    public void setTargetAction(ScheduledActionType targetAction) {
        this.targetAction = targetAction;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @return A JSON format string of the Amazon Redshift API operation with input parameters. For more information
     *         about this parameter, see <a>ScheduledAction</a>.
     */

    public ScheduledActionType getTargetAction() {
        return this.targetAction;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param targetAction
     *        A JSON format string of the Amazon Redshift API operation with input parameters. For more information
     *        about this parameter, see <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withTargetAction(ScheduledActionType targetAction) {
        setTargetAction(targetAction);
        return this;
    }

    /**
     * <p>
     * The schedule in <code>at( )</code> or <code>cron( )</code> format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param schedule
     *        The schedule in <code>at( )</code> or <code>cron( )</code> format. For more information about this
     *        parameter, see <a>ScheduledAction</a>.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule in <code>at( )</code> or <code>cron( )</code> format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @return The schedule in <code>at( )</code> or <code>cron( )</code> format. For more information about this
     *         parameter, see <a>ScheduledAction</a>.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule in <code>at( )</code> or <code>cron( )</code> format. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param schedule
     *        The schedule in <code>at( )</code> or <code>cron( )</code> format. For more information about this
     *        parameter, see <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param iamRole
     *        The IAM role to assume to run the target action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @return The IAM role to assume to run the target action. For more information about this parameter, see
     *         <a>ScheduledAction</a>.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param iamRole
     *        The IAM role to assume to run the target action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     * 
     * @param scheduledActionDescription
     *        The description of the scheduled action.
     */

    public void setScheduledActionDescription(String scheduledActionDescription) {
        this.scheduledActionDescription = scheduledActionDescription;
    }

    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     * 
     * @return The description of the scheduled action.
     */

    public String getScheduledActionDescription() {
        return this.scheduledActionDescription;
    }

    /**
     * <p>
     * The description of the scheduled action.
     * </p>
     * 
     * @param scheduledActionDescription
     *        The description of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withScheduledActionDescription(String scheduledActionDescription) {
        setScheduledActionDescription(scheduledActionDescription);
        return this;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger.
     *        For more information about this parameter, see <a>ScheduledAction</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @return The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger.
     *         For more information about this parameter, see <a>ScheduledAction</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger.
     *        For more information about this parameter, see <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For
     *        more information about this parameter, see <a>ScheduledAction</a>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @return The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For
     *         more information about this parameter, see <a>ScheduledAction</a>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more
     * information about this parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For
     *        more information about this parameter, see <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about
     * <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param enable
     *        If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information
     *        about <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about
     * <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @return If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information
     *         about <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about
     * <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param enable
     *        If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information
     *        about <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionRequest withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about
     * <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @return If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information
     *         about <code>state</code> of the scheduled action, see <a>ScheduledAction</a>.
     */

    public Boolean isEnable() {
        return this.enable;
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
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName()).append(",");
        if (getTargetAction() != null)
            sb.append("TargetAction: ").append(getTargetAction()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getScheduledActionDescription() != null)
            sb.append("ScheduledActionDescription: ").append(getScheduledActionDescription()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScheduledActionRequest == false)
            return false;
        CreateScheduledActionRequest other = (CreateScheduledActionRequest) obj;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getTargetAction() == null ^ this.getTargetAction() == null)
            return false;
        if (other.getTargetAction() != null && other.getTargetAction().equals(this.getTargetAction()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getScheduledActionDescription() == null ^ this.getScheduledActionDescription() == null)
            return false;
        if (other.getScheduledActionDescription() != null && other.getScheduledActionDescription().equals(this.getScheduledActionDescription()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getTargetAction() == null) ? 0 : getTargetAction().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionDescription() == null) ? 0 : getScheduledActionDescription().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        return hashCode;
    }

    @Override
    public CreateScheduledActionRequest clone() {
        return (CreateScheduledActionRequest) super.clone();
    }

}
