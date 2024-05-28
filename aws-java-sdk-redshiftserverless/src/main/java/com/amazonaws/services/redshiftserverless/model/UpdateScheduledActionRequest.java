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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateScheduledAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduledActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether to enable the scheduled action.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The end time in UTC of the scheduled action to update.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run the
     * Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon Redshift
     * scheduler to schedule creating snapshots (Principal scheduler.redshift.amazonaws.com) to assume permissions on
     * your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The schedule for a one-time (at timestamp format) or recurring (cron format) scheduled action. Schedule
     * invocations must be separated by at least one hour. Times are in UTC.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format of at timestamp is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Format of cron expression is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private Schedule schedule;
    /**
     * <p>
     * The descripion of the scheduled action to update to.
     * </p>
     */
    private String scheduledActionDescription;
    /**
     * <p>
     * The name of the scheduled action to update to.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * The start time in UTC of the scheduled action to update to.
     * </p>
     */
    private java.util.Date startTime;

    private TargetAction targetAction;

    /**
     * <p>
     * Specifies whether to enable the scheduled action.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the scheduled action.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the scheduled action.
     * </p>
     * 
     * @return Specifies whether to enable the scheduled action.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the scheduled action.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the scheduled action.
     * </p>
     * 
     * @return Specifies whether to enable the scheduled action.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action to update.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC of the scheduled action to update.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action to update.
     * </p>
     * 
     * @return The end time in UTC of the scheduled action to update.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time in UTC of the scheduled action to update.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC of the scheduled action to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run the
     * Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon Redshift
     * scheduler to schedule creating snapshots (Principal scheduler.redshift.amazonaws.com) to assume permissions on
     * your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run
     *        the Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon
     *        Redshift scheduler to schedule creating snapshots (Principal scheduler.redshift.amazonaws.com) to assume
     *        permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift
     *        scheduler, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *        >Using Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run the
     * Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon Redshift
     * scheduler to schedule creating snapshots (Principal scheduler.redshift.amazonaws.com) to assume permissions on
     * your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * </p>
     * 
     * @return The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run
     *         the Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon
     *         Redshift scheduler to schedule creating snapshots (Principal scheduler.redshift.amazonaws.com) to assume
     *         permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift
     *         scheduler, see <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *         >Using Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run the
     * Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon Redshift
     * scheduler to schedule creating snapshots (Principal scheduler.redshift.amazonaws.com) to assume permissions on
     * your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run
     *        the Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon
     *        Redshift scheduler to schedule creating snapshots (Principal scheduler.redshift.amazonaws.com) to assume
     *        permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift
     *        scheduler, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *        >Using Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The schedule for a one-time (at timestamp format) or recurring (cron format) scheduled action. Schedule
     * invocations must be separated by at least one hour. Times are in UTC.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format of at timestamp is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Format of cron expression is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schedule
     *        The schedule for a one-time (at timestamp format) or recurring (cron format) scheduled action. Schedule
     *        invocations must be separated by at least one hour. Times are in UTC.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format of at timestamp is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Format of cron expression is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For
     *        example, <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *        >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     *        </p>
     *        </li>
     */

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for a one-time (at timestamp format) or recurring (cron format) scheduled action. Schedule
     * invocations must be separated by at least one hour. Times are in UTC.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format of at timestamp is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Format of cron expression is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The schedule for a one-time (at timestamp format) or recurring (cron format) scheduled action. Schedule
     *         invocations must be separated by at least one hour. Times are in UTC.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format of at timestamp is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Format of cron expression is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For
     *         example, <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *         >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     *         </p>
     *         </li>
     */

    public Schedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for a one-time (at timestamp format) or recurring (cron format) scheduled action. Schedule
     * invocations must be separated by at least one hour. Times are in UTC.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format of at timestamp is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Format of cron expression is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For example,
     * <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron
     * Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schedule
     *        The schedule for a one-time (at timestamp format) or recurring (cron format) scheduled action. Schedule
     *        invocations must be separated by at least one hour. Times are in UTC.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format of at timestamp is <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2016-03-04T17:27:00</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Format of cron expression is <code>(Minutes Hours Day-of-month Month Day-of-week Year)</code>. For
     *        example, <code>"(0 10 ? * MON *)"</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions"
     *        >Cron Expressions</a> in the <i>Amazon CloudWatch Events User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withSchedule(Schedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The descripion of the scheduled action to update to.
     * </p>
     * 
     * @param scheduledActionDescription
     *        The descripion of the scheduled action to update to.
     */

    public void setScheduledActionDescription(String scheduledActionDescription) {
        this.scheduledActionDescription = scheduledActionDescription;
    }

    /**
     * <p>
     * The descripion of the scheduled action to update to.
     * </p>
     * 
     * @return The descripion of the scheduled action to update to.
     */

    public String getScheduledActionDescription() {
        return this.scheduledActionDescription;
    }

    /**
     * <p>
     * The descripion of the scheduled action to update to.
     * </p>
     * 
     * @param scheduledActionDescription
     *        The descripion of the scheduled action to update to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withScheduledActionDescription(String scheduledActionDescription) {
        setScheduledActionDescription(scheduledActionDescription);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled action to update to.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action to update to.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to update to.
     * </p>
     * 
     * @return The name of the scheduled action to update to.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action to update to.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action to update to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled action to update to.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC of the scheduled action to update to.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled action to update to.
     * </p>
     * 
     * @return The start time in UTC of the scheduled action to update to.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time in UTC of the scheduled action to update to.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC of the scheduled action to update to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * @param targetAction
     */

    public void setTargetAction(TargetAction targetAction) {
        this.targetAction = targetAction;
    }

    /**
     * @return
     */

    public TargetAction getTargetAction() {
        return this.targetAction;
    }

    /**
     * @param targetAction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledActionRequest withTargetAction(TargetAction targetAction) {
        setTargetAction(targetAction);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getScheduledActionDescription() != null)
            sb.append("ScheduledActionDescription: ").append(getScheduledActionDescription()).append(",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTargetAction() != null)
            sb.append("TargetAction: ").append(getTargetAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScheduledActionRequest == false)
            return false;
        UpdateScheduledActionRequest other = (UpdateScheduledActionRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getScheduledActionDescription() == null ^ this.getScheduledActionDescription() == null)
            return false;
        if (other.getScheduledActionDescription() != null && other.getScheduledActionDescription().equals(this.getScheduledActionDescription()) == false)
            return false;
        if (other.getScheduledActionName() == null ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null && other.getScheduledActionName().equals(this.getScheduledActionName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTargetAction() == null ^ this.getTargetAction() == null)
            return false;
        if (other.getTargetAction() != null && other.getTargetAction().equals(this.getTargetAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionDescription() == null) ? 0 : getScheduledActionDescription().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTargetAction() == null) ? 0 : getTargetAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduledActionRequest clone() {
        return (UpdateScheduledActionRequest) super.clone();
    }

}
