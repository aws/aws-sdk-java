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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyScheduledAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyScheduledActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     */
    private ScheduledActionType targetAction;
    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code> format. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * A different IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     */
    private String scheduledActionDescription;
    /**
     * <p>
     * A modified start time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A modified end time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled
     * action is disabled.
     * </p>
     */
    private Boolean enable;

    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action to modify.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     * 
     * @return The name of the scheduled action to modify.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to modify.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param targetAction
     *        A modified JSON format of the scheduled action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     */

    public void setTargetAction(ScheduledActionType targetAction) {
        this.targetAction = targetAction;
    }

    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @return A modified JSON format of the scheduled action. For more information about this parameter, see
     *         <a>ScheduledAction</a>.
     */

    public ScheduledActionType getTargetAction() {
        return this.targetAction;
    }

    /**
     * <p>
     * A modified JSON format of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param targetAction
     *        A modified JSON format of the scheduled action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withTargetAction(ScheduledActionType targetAction) {
        setTargetAction(targetAction);
        return this;
    }

    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code> format. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param schedule
     *        A modified schedule in either <code>at( )</code> or <code>cron( )</code> format. For more information
     *        about this parameter, see <a>ScheduledAction</a>.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code> format. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @return A modified schedule in either <code>at( )</code> or <code>cron( )</code> format. For more information
     *         about this parameter, see <a>ScheduledAction</a>.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * A modified schedule in either <code>at( )</code> or <code>cron( )</code> format. For more information about this
     * parameter, see <a>ScheduledAction</a>.
     * </p>
     * 
     * @param schedule
     *        A modified schedule in either <code>at( )</code> or <code>cron( )</code> format. For more information
     *        about this parameter, see <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * A different IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param iamRole
     *        A different IAM role to assume to run the target action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * A different IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @return A different IAM role to assume to run the target action. For more information about this parameter, see
     *         <a>ScheduledAction</a>.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * A different IAM role to assume to run the target action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param iamRole
     *        A different IAM role to assume to run the target action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     * 
     * @param scheduledActionDescription
     *        A modified description of the scheduled action.
     */

    public void setScheduledActionDescription(String scheduledActionDescription) {
        this.scheduledActionDescription = scheduledActionDescription;
    }

    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     * 
     * @return A modified description of the scheduled action.
     */

    public String getScheduledActionDescription() {
        return this.scheduledActionDescription;
    }

    /**
     * <p>
     * A modified description of the scheduled action.
     * </p>
     * 
     * @param scheduledActionDescription
     *        A modified description of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withScheduledActionDescription(String scheduledActionDescription) {
        setScheduledActionDescription(scheduledActionDescription);
        return this;
    }

    /**
     * <p>
     * A modified start time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param startTime
     *        A modified start time of the scheduled action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A modified start time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @return A modified start time of the scheduled action. For more information about this parameter, see
     *         <a>ScheduledAction</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A modified start time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param startTime
     *        A modified start time of the scheduled action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A modified end time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param endTime
     *        A modified end time of the scheduled action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A modified end time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @return A modified end time of the scheduled action. For more information about this parameter, see
     *         <a>ScheduledAction</a>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * A modified end time of the scheduled action. For more information about this parameter, see
     * <a>ScheduledAction</a>.
     * </p>
     * 
     * @param endTime
     *        A modified end time of the scheduled action. For more information about this parameter, see
     *        <a>ScheduledAction</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled
     * action is disabled.
     * </p>
     * 
     * @param enable
     *        A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the
     *        scheduled action is disabled.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled
     * action is disabled.
     * </p>
     * 
     * @return A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the
     *         scheduled action is disabled.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled
     * action is disabled.
     * </p>
     * 
     * @param enable
     *        A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the
     *        scheduled action is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyScheduledActionRequest withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled
     * action is disabled.
     * </p>
     * 
     * @return A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the
     *         scheduled action is disabled.
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

        if (obj instanceof ModifyScheduledActionRequest == false)
            return false;
        ModifyScheduledActionRequest other = (ModifyScheduledActionRequest) obj;
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
    public ModifyScheduledActionRequest clone() {
        return (ModifyScheduledActionRequest) super.clone();
    }

}
