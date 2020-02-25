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

/**
 * <p>
 * Describes a scheduled action. You can use a scheduled action to trigger some Amazon Redshift API operations on a
 * schedule. For information about which API operations can be scheduled, see <a>ScheduledActionType</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateScheduledAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScheduledActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scheduled action.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     */
    private ScheduledActionType targetAction;
    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be
     * separated by at least one hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     * <code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "<code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="https://docs.aws.amazon.com
     * /AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a> in the <i>Amazon
     * CloudWatch Events User Guide</i>.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift
     * API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role
     * to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
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
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Date> nextInvocations;
    /**
     * <p>
     * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     * trigger.
     * </p>
     */
    private java.util.Date endTime;

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

    public CreateScheduledActionResult withScheduledActionName(String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     * 
     * @param targetAction
     *        A JSON format string of the Amazon Redshift API operation with input parameters. </p>
     *        <p>
     *        "
     *        <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     *        ".
     */

    public void setTargetAction(ScheduledActionType targetAction) {
        this.targetAction = targetAction;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     * 
     * @return A JSON format string of the Amazon Redshift API operation with input parameters. </p>
     *         <p>
     *         "
     *         <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     *         ".
     */

    public ScheduledActionType getTargetAction() {
        return this.targetAction;
    }

    /**
     * <p>
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     * </p>
     * <p>
     * "
     * <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     * ".
     * </p>
     * 
     * @param targetAction
     *        A JSON format string of the Amazon Redshift API operation with input parameters. </p>
     *        <p>
     *        "
     *        <code>{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}</code>
     *        ".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionResult withTargetAction(ScheduledActionType targetAction) {
        setTargetAction(targetAction);
        return this;
    }

    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be
     * separated by at least one hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     * <code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "<code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="https://docs.aws.amazon.com
     * /AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a> in the <i>Amazon
     * CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param schedule
     *        The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations
     *        must be separated by at least one hour.</p>
     *        <p>
     *        Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     *        <code>at(2016-03-04T17:27:00)</code>".
     *        </p>
     *        <p>
     *        Format of cron expressions is "<code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     *        ". For example, "<code>cron(0 10 ? * MON *)</code>
     *        ". For more information, see <a href="https://docs.aws.amazon
     *        .com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a> in the
     *        <i>Amazon CloudWatch Events User Guide</i>.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be
     * separated by at least one hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     * <code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "<code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="https://docs.aws.amazon.com
     * /AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a> in the <i>Amazon
     * CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @return The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations
     *         must be separated by at least one hour.</p>
     *         <p>
     *         Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     *         <code>at(2016-03-04T17:27:00)</code>".
     *         </p>
     *         <p>
     *         Format of cron expressions is "<code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     *         ". For example, "<code>cron(0 10 ? * MON *)</code>
     *         ". For more information, see <a href="https://docs.aws.amazon
     *         .com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a> in the
     *         <i>Amazon CloudWatch Events User Guide</i>.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be
     * separated by at least one hour.
     * </p>
     * <p>
     * Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     * <code>at(2016-03-04T17:27:00)</code>".
     * </p>
     * <p>
     * Format of cron expressions is "<code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     * ". For example, "<code>cron(0 10 ? * MON *)</code>
     * ". For more information, see <a href="https://docs.aws.amazon.com
     * /AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a> in the <i>Amazon
     * CloudWatch Events User Guide</i>.
     * </p>
     * 
     * @param schedule
     *        The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations
     *        must be separated by at least one hour.</p>
     *        <p>
     *        Format of at expressions is "<code>at(yyyy-mm-ddThh:mm:ss)</code>". For example, "
     *        <code>at(2016-03-04T17:27:00)</code>".
     *        </p>
     *        <p>
     *        Format of cron expressions is "<code>cron(Minutes Hours Day-of-month Month Day-of-week Year)</code>
     *        ". For example, "<code>cron(0 10 ? * MON *)</code>
     *        ". For more information, see <a href="https://docs.aws.amazon
     *        .com/AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions">Cron Expressions</a> in the
     *        <i>Amazon CloudWatch Events User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionResult withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift
     * API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role
     * to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param iamRole
     *        The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon
     *        Redshift API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler
     *        (Principal scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information
     *        about the IAM role to use with the Amazon Redshift scheduler, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *        >Using Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management
     *        Guide</i>.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift
     * API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role
     * to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @return The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon
     *         Redshift API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler
     *         (Principal scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information
     *         about the IAM role to use with the Amazon Redshift scheduler, see <a
     *         href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *         >Using Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management
     *         Guide</i>.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift
     * API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role
     * to use with the Amazon Redshift scheduler, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html">Using
     * Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management Guide</i>.
     * </p>
     * 
     * @param iamRole
     *        The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon
     *        Redshift API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler
     *        (Principal scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information
     *        about the IAM role to use with the Amazon Redshift scheduler, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html"
     *        >Using Identity-Based Policies for Amazon Redshift</a> in the <i>Amazon Redshift Cluster Management
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionResult withIamRole(String iamRole) {
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

    public CreateScheduledActionResult withScheduledActionDescription(String scheduledActionDescription) {
        setScheduledActionDescription(scheduledActionDescription);
        return this;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * 
     * @param state
     *        The state of the scheduled action. For example, <code>DISABLED</code>.
     * @see ScheduledActionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * 
     * @return The state of the scheduled action. For example, <code>DISABLED</code>.
     * @see ScheduledActionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * 
     * @param state
     *        The state of the scheduled action. For example, <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledActionState
     */

    public CreateScheduledActionResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the scheduled action. For example, <code>DISABLED</code>.
     * </p>
     * 
     * @param state
     *        The state of the scheduled action. For example, <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledActionState
     */

    public CreateScheduledActionResult withState(ScheduledActionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     * 
     * @return List of times when the scheduled action will run.
     */

    public java.util.List<java.util.Date> getNextInvocations() {
        if (nextInvocations == null) {
            nextInvocations = new com.amazonaws.internal.SdkInternalList<java.util.Date>();
        }
        return nextInvocations;
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     * 
     * @param nextInvocations
     *        List of times when the scheduled action will run.
     */

    public void setNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        if (nextInvocations == null) {
            this.nextInvocations = null;
            return;
        }

        this.nextInvocations = new com.amazonaws.internal.SdkInternalList<java.util.Date>(nextInvocations);
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNextInvocations(java.util.Collection)} or {@link #withNextInvocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nextInvocations
     *        List of times when the scheduled action will run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionResult withNextInvocations(java.util.Date... nextInvocations) {
        if (this.nextInvocations == null) {
            setNextInvocations(new com.amazonaws.internal.SdkInternalList<java.util.Date>(nextInvocations.length));
        }
        for (java.util.Date ele : nextInvocations) {
            this.nextInvocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of times when the scheduled action will run.
     * </p>
     * 
     * @param nextInvocations
     *        List of times when the scheduled action will run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionResult withNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        setNextInvocations(nextInvocations);
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

    public CreateScheduledActionResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     * trigger.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     *        trigger.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     * trigger.
     * </p>
     * 
     * @param endTime
     *        The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not
     *        trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScheduledActionResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getNextInvocations() != null)
            sb.append("NextInvocations: ").append(getNextInvocations()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateScheduledActionResult == false)
            return false;
        CreateScheduledActionResult other = (CreateScheduledActionResult) obj;
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getNextInvocations() == null ^ this.getNextInvocations() == null)
            return false;
        if (other.getNextInvocations() != null && other.getNextInvocations().equals(this.getNextInvocations()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getNextInvocations() == null) ? 0 : getNextInvocations().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateScheduledActionResult clone() {
        try {
            return (CreateScheduledActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
