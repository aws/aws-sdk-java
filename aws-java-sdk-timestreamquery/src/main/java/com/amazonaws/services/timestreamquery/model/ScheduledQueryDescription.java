/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure that describes scheduled query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ScheduledQueryDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledQueryDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Scheduled query ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The query to be run.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * Creation time of the scheduled query.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * State of the scheduled query.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Last time the query was run.
     * </p>
     */
    private java.util.Date previousInvocationTime;
    /**
     * <p>
     * The next time the scheduled query is scheduled to run.
     * </p>
     */
    private java.util.Date nextInvocationTime;
    /**
     * <p>
     * Schedule configuration.
     * </p>
     */
    private ScheduleConfiguration scheduleConfiguration;
    /**
     * <p>
     * Notification configuration.
     * </p>
     */
    private NotificationConfiguration notificationConfiguration;
    /**
     * <p>
     * Scheduled query target store configuration.
     * </p>
     */
    private TargetConfiguration targetConfiguration;
    /**
     * <p>
     * IAM role that Timestream uses to run the schedule query.
     * </p>
     */
    private String scheduledQueryExecutionRoleArn;
    /**
     * <p>
     * A customer provided KMS key used to encrypt the scheduled query resource.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Error-reporting configuration for the scheduled query.
     * </p>
     */
    private ErrorReportConfiguration errorReportConfiguration;
    /**
     * <p>
     * Runtime summary for the last scheduled query run.
     * </p>
     */
    private ScheduledQueryRunSummary lastRunSummary;
    /**
     * <p>
     * Runtime summary for the last five failed scheduled query runs.
     * </p>
     */
    private java.util.List<ScheduledQueryRunSummary> recentlyFailedRuns;

    /**
     * <p>
     * Scheduled query ARN.
     * </p>
     * 
     * @param arn
     *        Scheduled query ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Scheduled query ARN.
     * </p>
     * 
     * @return Scheduled query ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Scheduled query ARN.
     * </p>
     * 
     * @param arn
     *        Scheduled query ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     * 
     * @param name
     *        Name of the scheduled query.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     * 
     * @return Name of the scheduled query.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the scheduled query.
     * </p>
     * 
     * @param name
     *        Name of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The query to be run.
     * </p>
     * 
     * @param queryString
     *        The query to be run.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query to be run.
     * </p>
     * 
     * @return The query to be run.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query to be run.
     * </p>
     * 
     * @param queryString
     *        The query to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * Creation time of the scheduled query.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the scheduled query.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the scheduled query.
     * </p>
     * 
     * @return Creation time of the scheduled query.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the scheduled query.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @param state
     *        State of the scheduled query.
     * @see ScheduledQueryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @return State of the scheduled query.
     * @see ScheduledQueryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @param state
     *        State of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryState
     */

    public ScheduledQueryDescription withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * State of the scheduled query.
     * </p>
     * 
     * @param state
     *        State of the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryState
     */

    public ScheduledQueryDescription withState(ScheduledQueryState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Last time the query was run.
     * </p>
     * 
     * @param previousInvocationTime
     *        Last time the query was run.
     */

    public void setPreviousInvocationTime(java.util.Date previousInvocationTime) {
        this.previousInvocationTime = previousInvocationTime;
    }

    /**
     * <p>
     * Last time the query was run.
     * </p>
     * 
     * @return Last time the query was run.
     */

    public java.util.Date getPreviousInvocationTime() {
        return this.previousInvocationTime;
    }

    /**
     * <p>
     * Last time the query was run.
     * </p>
     * 
     * @param previousInvocationTime
     *        Last time the query was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withPreviousInvocationTime(java.util.Date previousInvocationTime) {
        setPreviousInvocationTime(previousInvocationTime);
        return this;
    }

    /**
     * <p>
     * The next time the scheduled query is scheduled to run.
     * </p>
     * 
     * @param nextInvocationTime
     *        The next time the scheduled query is scheduled to run.
     */

    public void setNextInvocationTime(java.util.Date nextInvocationTime) {
        this.nextInvocationTime = nextInvocationTime;
    }

    /**
     * <p>
     * The next time the scheduled query is scheduled to run.
     * </p>
     * 
     * @return The next time the scheduled query is scheduled to run.
     */

    public java.util.Date getNextInvocationTime() {
        return this.nextInvocationTime;
    }

    /**
     * <p>
     * The next time the scheduled query is scheduled to run.
     * </p>
     * 
     * @param nextInvocationTime
     *        The next time the scheduled query is scheduled to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withNextInvocationTime(java.util.Date nextInvocationTime) {
        setNextInvocationTime(nextInvocationTime);
        return this;
    }

    /**
     * <p>
     * Schedule configuration.
     * </p>
     * 
     * @param scheduleConfiguration
     *        Schedule configuration.
     */

    public void setScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        this.scheduleConfiguration = scheduleConfiguration;
    }

    /**
     * <p>
     * Schedule configuration.
     * </p>
     * 
     * @return Schedule configuration.
     */

    public ScheduleConfiguration getScheduleConfiguration() {
        return this.scheduleConfiguration;
    }

    /**
     * <p>
     * Schedule configuration.
     * </p>
     * 
     * @param scheduleConfiguration
     *        Schedule configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        setScheduleConfiguration(scheduleConfiguration);
        return this;
    }

    /**
     * <p>
     * Notification configuration.
     * </p>
     * 
     * @param notificationConfiguration
     *        Notification configuration.
     */

    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }

    /**
     * <p>
     * Notification configuration.
     * </p>
     * 
     * @return Notification configuration.
     */

    public NotificationConfiguration getNotificationConfiguration() {
        return this.notificationConfiguration;
    }

    /**
     * <p>
     * Notification configuration.
     * </p>
     * 
     * @param notificationConfiguration
     *        Notification configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        setNotificationConfiguration(notificationConfiguration);
        return this;
    }

    /**
     * <p>
     * Scheduled query target store configuration.
     * </p>
     * 
     * @param targetConfiguration
     *        Scheduled query target store configuration.
     */

    public void setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * Scheduled query target store configuration.
     * </p>
     * 
     * @return Scheduled query target store configuration.
     */

    public TargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * <p>
     * Scheduled query target store configuration.
     * </p>
     * 
     * @param targetConfiguration
     *        Scheduled query target store configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withTargetConfiguration(TargetConfiguration targetConfiguration) {
        setTargetConfiguration(targetConfiguration);
        return this;
    }

    /**
     * <p>
     * IAM role that Timestream uses to run the schedule query.
     * </p>
     * 
     * @param scheduledQueryExecutionRoleArn
     *        IAM role that Timestream uses to run the schedule query.
     */

    public void setScheduledQueryExecutionRoleArn(String scheduledQueryExecutionRoleArn) {
        this.scheduledQueryExecutionRoleArn = scheduledQueryExecutionRoleArn;
    }

    /**
     * <p>
     * IAM role that Timestream uses to run the schedule query.
     * </p>
     * 
     * @return IAM role that Timestream uses to run the schedule query.
     */

    public String getScheduledQueryExecutionRoleArn() {
        return this.scheduledQueryExecutionRoleArn;
    }

    /**
     * <p>
     * IAM role that Timestream uses to run the schedule query.
     * </p>
     * 
     * @param scheduledQueryExecutionRoleArn
     *        IAM role that Timestream uses to run the schedule query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withScheduledQueryExecutionRoleArn(String scheduledQueryExecutionRoleArn) {
        setScheduledQueryExecutionRoleArn(scheduledQueryExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * A customer provided KMS key used to encrypt the scheduled query resource.
     * </p>
     * 
     * @param kmsKeyId
     *        A customer provided KMS key used to encrypt the scheduled query resource.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * A customer provided KMS key used to encrypt the scheduled query resource.
     * </p>
     * 
     * @return A customer provided KMS key used to encrypt the scheduled query resource.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * A customer provided KMS key used to encrypt the scheduled query resource.
     * </p>
     * 
     * @param kmsKeyId
     *        A customer provided KMS key used to encrypt the scheduled query resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Error-reporting configuration for the scheduled query.
     * </p>
     * 
     * @param errorReportConfiguration
     *        Error-reporting configuration for the scheduled query.
     */

    public void setErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        this.errorReportConfiguration = errorReportConfiguration;
    }

    /**
     * <p>
     * Error-reporting configuration for the scheduled query.
     * </p>
     * 
     * @return Error-reporting configuration for the scheduled query.
     */

    public ErrorReportConfiguration getErrorReportConfiguration() {
        return this.errorReportConfiguration;
    }

    /**
     * <p>
     * Error-reporting configuration for the scheduled query.
     * </p>
     * 
     * @param errorReportConfiguration
     *        Error-reporting configuration for the scheduled query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withErrorReportConfiguration(ErrorReportConfiguration errorReportConfiguration) {
        setErrorReportConfiguration(errorReportConfiguration);
        return this;
    }

    /**
     * <p>
     * Runtime summary for the last scheduled query run.
     * </p>
     * 
     * @param lastRunSummary
     *        Runtime summary for the last scheduled query run.
     */

    public void setLastRunSummary(ScheduledQueryRunSummary lastRunSummary) {
        this.lastRunSummary = lastRunSummary;
    }

    /**
     * <p>
     * Runtime summary for the last scheduled query run.
     * </p>
     * 
     * @return Runtime summary for the last scheduled query run.
     */

    public ScheduledQueryRunSummary getLastRunSummary() {
        return this.lastRunSummary;
    }

    /**
     * <p>
     * Runtime summary for the last scheduled query run.
     * </p>
     * 
     * @param lastRunSummary
     *        Runtime summary for the last scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withLastRunSummary(ScheduledQueryRunSummary lastRunSummary) {
        setLastRunSummary(lastRunSummary);
        return this;
    }

    /**
     * <p>
     * Runtime summary for the last five failed scheduled query runs.
     * </p>
     * 
     * @return Runtime summary for the last five failed scheduled query runs.
     */

    public java.util.List<ScheduledQueryRunSummary> getRecentlyFailedRuns() {
        return recentlyFailedRuns;
    }

    /**
     * <p>
     * Runtime summary for the last five failed scheduled query runs.
     * </p>
     * 
     * @param recentlyFailedRuns
     *        Runtime summary for the last five failed scheduled query runs.
     */

    public void setRecentlyFailedRuns(java.util.Collection<ScheduledQueryRunSummary> recentlyFailedRuns) {
        if (recentlyFailedRuns == null) {
            this.recentlyFailedRuns = null;
            return;
        }

        this.recentlyFailedRuns = new java.util.ArrayList<ScheduledQueryRunSummary>(recentlyFailedRuns);
    }

    /**
     * <p>
     * Runtime summary for the last five failed scheduled query runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecentlyFailedRuns(java.util.Collection)} or {@link #withRecentlyFailedRuns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recentlyFailedRuns
     *        Runtime summary for the last five failed scheduled query runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withRecentlyFailedRuns(ScheduledQueryRunSummary... recentlyFailedRuns) {
        if (this.recentlyFailedRuns == null) {
            setRecentlyFailedRuns(new java.util.ArrayList<ScheduledQueryRunSummary>(recentlyFailedRuns.length));
        }
        for (ScheduledQueryRunSummary ele : recentlyFailedRuns) {
            this.recentlyFailedRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Runtime summary for the last five failed scheduled query runs.
     * </p>
     * 
     * @param recentlyFailedRuns
     *        Runtime summary for the last five failed scheduled query runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryDescription withRecentlyFailedRuns(java.util.Collection<ScheduledQueryRunSummary> recentlyFailedRuns) {
        setRecentlyFailedRuns(recentlyFailedRuns);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPreviousInvocationTime() != null)
            sb.append("PreviousInvocationTime: ").append(getPreviousInvocationTime()).append(",");
        if (getNextInvocationTime() != null)
            sb.append("NextInvocationTime: ").append(getNextInvocationTime()).append(",");
        if (getScheduleConfiguration() != null)
            sb.append("ScheduleConfiguration: ").append(getScheduleConfiguration()).append(",");
        if (getNotificationConfiguration() != null)
            sb.append("NotificationConfiguration: ").append(getNotificationConfiguration()).append(",");
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: ").append(getTargetConfiguration()).append(",");
        if (getScheduledQueryExecutionRoleArn() != null)
            sb.append("ScheduledQueryExecutionRoleArn: ").append(getScheduledQueryExecutionRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getErrorReportConfiguration() != null)
            sb.append("ErrorReportConfiguration: ").append(getErrorReportConfiguration()).append(",");
        if (getLastRunSummary() != null)
            sb.append("LastRunSummary: ").append(getLastRunSummary()).append(",");
        if (getRecentlyFailedRuns() != null)
            sb.append("RecentlyFailedRuns: ").append(getRecentlyFailedRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledQueryDescription == false)
            return false;
        ScheduledQueryDescription other = (ScheduledQueryDescription) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPreviousInvocationTime() == null ^ this.getPreviousInvocationTime() == null)
            return false;
        if (other.getPreviousInvocationTime() != null && other.getPreviousInvocationTime().equals(this.getPreviousInvocationTime()) == false)
            return false;
        if (other.getNextInvocationTime() == null ^ this.getNextInvocationTime() == null)
            return false;
        if (other.getNextInvocationTime() != null && other.getNextInvocationTime().equals(this.getNextInvocationTime()) == false)
            return false;
        if (other.getScheduleConfiguration() == null ^ this.getScheduleConfiguration() == null)
            return false;
        if (other.getScheduleConfiguration() != null && other.getScheduleConfiguration().equals(this.getScheduleConfiguration()) == false)
            return false;
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null)
            return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
            return false;
        if (other.getScheduledQueryExecutionRoleArn() == null ^ this.getScheduledQueryExecutionRoleArn() == null)
            return false;
        if (other.getScheduledQueryExecutionRoleArn() != null
                && other.getScheduledQueryExecutionRoleArn().equals(this.getScheduledQueryExecutionRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getErrorReportConfiguration() == null ^ this.getErrorReportConfiguration() == null)
            return false;
        if (other.getErrorReportConfiguration() != null && other.getErrorReportConfiguration().equals(this.getErrorReportConfiguration()) == false)
            return false;
        if (other.getLastRunSummary() == null ^ this.getLastRunSummary() == null)
            return false;
        if (other.getLastRunSummary() != null && other.getLastRunSummary().equals(this.getLastRunSummary()) == false)
            return false;
        if (other.getRecentlyFailedRuns() == null ^ this.getRecentlyFailedRuns() == null)
            return false;
        if (other.getRecentlyFailedRuns() != null && other.getRecentlyFailedRuns().equals(this.getRecentlyFailedRuns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPreviousInvocationTime() == null) ? 0 : getPreviousInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getNextInvocationTime() == null) ? 0 : getNextInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getScheduleConfiguration() == null) ? 0 : getScheduleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        hashCode = prime * hashCode + ((getScheduledQueryExecutionRoleArn() == null) ? 0 : getScheduledQueryExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getErrorReportConfiguration() == null) ? 0 : getErrorReportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLastRunSummary() == null) ? 0 : getLastRunSummary().hashCode());
        hashCode = prime * hashCode + ((getRecentlyFailedRuns() == null) ? 0 : getRecentlyFailedRuns().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledQueryDescription clone() {
        try {
            return (ScheduledQueryDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.ScheduledQueryDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
