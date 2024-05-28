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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The returned scheduled action object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ScheduledActionResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledActionResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end time of
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     * trigger.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * An array of timestamps of when the next scheduled actions will trigger.
     * </p>
     */
    private java.util.List<java.util.Date> nextInvocations;
    /**
     * <p>
     * The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run the
     * Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon Redshift
     * scheduler to schedule creating snapshots. (Principal scheduler.redshift.amazonaws.com) to assume permissions on
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
     * The description of the scheduled action.
     * </p>
     */
    private String scheduledActionDescription;
    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * The uuid of the scheduled action.
     * </p>
     */
    private String scheduledActionUuid;
    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The state of the scheduled action.
     * </p>
     */
    private String state;

    private TargetAction targetAction;

    /**
     * <p>
     * The end time of
     * </p>
     * 
     * @param endTime
     *        The end time of
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of
     * </p>
     * 
     * @return The end time of
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of
     * </p>
     * 
     * @param endTime
     *        The end time of
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     * trigger.
     * </p>
     * 
     * @param namespaceName
     *        The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     *        trigger.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     * trigger.
     * </p>
     * 
     * @return The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     *         trigger.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     * trigger.
     * </p>
     * 
     * @param namespaceName
     *        The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     *        trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * An array of timestamps of when the next scheduled actions will trigger.
     * </p>
     * 
     * @return An array of timestamps of when the next scheduled actions will trigger.
     */

    public java.util.List<java.util.Date> getNextInvocations() {
        return nextInvocations;
    }

    /**
     * <p>
     * An array of timestamps of when the next scheduled actions will trigger.
     * </p>
     * 
     * @param nextInvocations
     *        An array of timestamps of when the next scheduled actions will trigger.
     */

    public void setNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        if (nextInvocations == null) {
            this.nextInvocations = null;
            return;
        }

        this.nextInvocations = new java.util.ArrayList<java.util.Date>(nextInvocations);
    }

    /**
     * <p>
     * An array of timestamps of when the next scheduled actions will trigger.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNextInvocations(java.util.Collection)} or {@link #withNextInvocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nextInvocations
     *        An array of timestamps of when the next scheduled actions will trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withNextInvocations(java.util.Date... nextInvocations) {
        if (this.nextInvocations == null) {
            setNextInvocations(new java.util.ArrayList<java.util.Date>(nextInvocations.length));
        }
        for (java.util.Date ele : nextInvocations) {
            this.nextInvocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of timestamps of when the next scheduled actions will trigger.
     * </p>
     * 
     * @param nextInvocations
     *        An array of timestamps of when the next scheduled actions will trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        setNextInvocations(nextInvocations);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run the
     * Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon Redshift
     * scheduler to schedule creating snapshots. (Principal scheduler.redshift.amazonaws.com) to assume permissions on
     * your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run
     *        the Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon
     *        Redshift scheduler to schedule creating snapshots. (Principal scheduler.redshift.amazonaws.com) to assume
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
     * scheduler to schedule creating snapshots. (Principal scheduler.redshift.amazonaws.com) to assume permissions on
     * your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * </p>
     * 
     * @return The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run
     *         the Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon
     *         Redshift scheduler to schedule creating snapshots. (Principal scheduler.redshift.amazonaws.com) to assume
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
     * scheduler to schedule creating snapshots. (Principal scheduler.redshift.amazonaws.com) to assume permissions on
     * your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to assume to run the scheduled action. This IAM role must have permission to run
     *        the Amazon Redshift Serverless API operation in the scheduled action. This IAM role must allow the Amazon
     *        Redshift scheduler to schedule creating snapshots. (Principal scheduler.redshift.amazonaws.com) to assume
     *        permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift
     *        scheduler, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *        >Using Identity-Based Policies for Amazon Redshift</a> in the Amazon Redshift Cluster Management Guide
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withRoleArn(String roleArn) {
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

    public ScheduledActionResponse withSchedule(Schedule schedule) {
        setSchedule(schedule);
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

    public ScheduledActionResponse withScheduledActionDescription(String scheduledActionDescription) {
        setScheduledActionDescription(scheduledActionDescription);
        return this;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @return The name of the scheduled action.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * The uuid of the scheduled action.
     * </p>
     * 
     * @param scheduledActionUuid
     *        The uuid of the scheduled action.
     */

    public void setScheduledActionUuid(String scheduledActionUuid) {
        this.scheduledActionUuid = scheduledActionUuid;
    }

    /**
     * <p>
     * The uuid of the scheduled action.
     * </p>
     * 
     * @return The uuid of the scheduled action.
     */

    public String getScheduledActionUuid() {
        return this.scheduledActionUuid;
    }

    /**
     * <p>
     * The uuid of the scheduled action.
     * </p>
     * 
     * @param scheduledActionUuid
     *        The uuid of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withScheduledActionUuid(String scheduledActionUuid) {
        setScheduledActionUuid(scheduledActionUuid);
        return this;
    }

    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC when the schedule is active. Before this time, the scheduled action does not
     *        trigger.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger.
     * </p>
     * 
     * @return The start time in UTC when the schedule is active. Before this time, the scheduled action does not
     *         trigger.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger.
     * </p>
     * 
     * @param startTime
     *        The start time in UTC when the schedule is active. Before this time, the scheduled action does not
     *        trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionResponse withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The state of the scheduled action.
     * </p>
     * 
     * @param state
     *        The state of the scheduled action.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the scheduled action.
     * </p>
     * 
     * @return The state of the scheduled action.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the scheduled action.
     * </p>
     * 
     * @param state
     *        The state of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public ScheduledActionResponse withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the scheduled action.
     * </p>
     * 
     * @param state
     *        The state of the scheduled action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public ScheduledActionResponse withState(State state) {
        this.state = state.toString();
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

    public ScheduledActionResponse withTargetAction(TargetAction targetAction) {
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getNextInvocations() != null)
            sb.append("NextInvocations: ").append(getNextInvocations()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getScheduledActionDescription() != null)
            sb.append("ScheduledActionDescription: ").append(getScheduledActionDescription()).append(",");
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: ").append(getScheduledActionName()).append(",");
        if (getScheduledActionUuid() != null)
            sb.append("ScheduledActionUuid: ").append(getScheduledActionUuid()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof ScheduledActionResponse == false)
            return false;
        ScheduledActionResponse other = (ScheduledActionResponse) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getNextInvocations() == null ^ this.getNextInvocations() == null)
            return false;
        if (other.getNextInvocations() != null && other.getNextInvocations().equals(this.getNextInvocations()) == false)
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
        if (other.getScheduledActionUuid() == null ^ this.getScheduledActionUuid() == null)
            return false;
        if (other.getScheduledActionUuid() != null && other.getScheduledActionUuid().equals(this.getScheduledActionUuid()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getNextInvocations() == null) ? 0 : getNextInvocations().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionDescription() == null) ? 0 : getScheduledActionDescription().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionName() == null) ? 0 : getScheduledActionName().hashCode());
        hashCode = prime * hashCode + ((getScheduledActionUuid() == null) ? 0 : getScheduledActionUuid().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTargetAction() == null) ? 0 : getTargetAction().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledActionResponse clone() {
        try {
            return (ScheduledActionResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.ScheduledActionResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
