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
 * Run summary for the scheduled query
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ScheduledQueryRunSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledQueryRunSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter
     * <code>@scheduled_runtime</code> can be used in the query to get the value.
     * </p>
     */
    private java.util.Date invocationTime;
    /**
     * <p>
     * The actual time when the query was run.
     * </p>
     */
    private java.util.Date triggerTime;
    /**
     * <p>
     * The status of a scheduled query run.
     * </p>
     */
    private String runStatus;
    /**
     * <p>
     * Runtime statistics for a scheduled run.
     * </p>
     */
    private ExecutionStats executionStats;
    /**
     * <p>
     * S3 location for error report.
     * </p>
     */
    private ErrorReportLocation errorReportLocation;
    /**
     * <p>
     * Error message for the scheduled query in case of failure. You might have to look at the error report to get more
     * detailed error reasons.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter
     * <code>@scheduled_runtime</code> can be used in the query to get the value.
     * </p>
     * 
     * @param invocationTime
     *        InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter
     *        <code>@scheduled_runtime</code> can be used in the query to get the value.
     */

    public void setInvocationTime(java.util.Date invocationTime) {
        this.invocationTime = invocationTime;
    }

    /**
     * <p>
     * InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter
     * <code>@scheduled_runtime</code> can be used in the query to get the value.
     * </p>
     * 
     * @return InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter
     *         <code>@scheduled_runtime</code> can be used in the query to get the value.
     */

    public java.util.Date getInvocationTime() {
        return this.invocationTime;
    }

    /**
     * <p>
     * InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter
     * <code>@scheduled_runtime</code> can be used in the query to get the value.
     * </p>
     * 
     * @param invocationTime
     *        InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter
     *        <code>@scheduled_runtime</code> can be used in the query to get the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryRunSummary withInvocationTime(java.util.Date invocationTime) {
        setInvocationTime(invocationTime);
        return this;
    }

    /**
     * <p>
     * The actual time when the query was run.
     * </p>
     * 
     * @param triggerTime
     *        The actual time when the query was run.
     */

    public void setTriggerTime(java.util.Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    /**
     * <p>
     * The actual time when the query was run.
     * </p>
     * 
     * @return The actual time when the query was run.
     */

    public java.util.Date getTriggerTime() {
        return this.triggerTime;
    }

    /**
     * <p>
     * The actual time when the query was run.
     * </p>
     * 
     * @param triggerTime
     *        The actual time when the query was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryRunSummary withTriggerTime(java.util.Date triggerTime) {
        setTriggerTime(triggerTime);
        return this;
    }

    /**
     * <p>
     * The status of a scheduled query run.
     * </p>
     * 
     * @param runStatus
     *        The status of a scheduled query run.
     * @see ScheduledQueryRunStatus
     */

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    /**
     * <p>
     * The status of a scheduled query run.
     * </p>
     * 
     * @return The status of a scheduled query run.
     * @see ScheduledQueryRunStatus
     */

    public String getRunStatus() {
        return this.runStatus;
    }

    /**
     * <p>
     * The status of a scheduled query run.
     * </p>
     * 
     * @param runStatus
     *        The status of a scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryRunStatus
     */

    public ScheduledQueryRunSummary withRunStatus(String runStatus) {
        setRunStatus(runStatus);
        return this;
    }

    /**
     * <p>
     * The status of a scheduled query run.
     * </p>
     * 
     * @param runStatus
     *        The status of a scheduled query run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduledQueryRunStatus
     */

    public ScheduledQueryRunSummary withRunStatus(ScheduledQueryRunStatus runStatus) {
        this.runStatus = runStatus.toString();
        return this;
    }

    /**
     * <p>
     * Runtime statistics for a scheduled run.
     * </p>
     * 
     * @param executionStats
     *        Runtime statistics for a scheduled run.
     */

    public void setExecutionStats(ExecutionStats executionStats) {
        this.executionStats = executionStats;
    }

    /**
     * <p>
     * Runtime statistics for a scheduled run.
     * </p>
     * 
     * @return Runtime statistics for a scheduled run.
     */

    public ExecutionStats getExecutionStats() {
        return this.executionStats;
    }

    /**
     * <p>
     * Runtime statistics for a scheduled run.
     * </p>
     * 
     * @param executionStats
     *        Runtime statistics for a scheduled run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryRunSummary withExecutionStats(ExecutionStats executionStats) {
        setExecutionStats(executionStats);
        return this;
    }

    /**
     * <p>
     * S3 location for error report.
     * </p>
     * 
     * @param errorReportLocation
     *        S3 location for error report.
     */

    public void setErrorReportLocation(ErrorReportLocation errorReportLocation) {
        this.errorReportLocation = errorReportLocation;
    }

    /**
     * <p>
     * S3 location for error report.
     * </p>
     * 
     * @return S3 location for error report.
     */

    public ErrorReportLocation getErrorReportLocation() {
        return this.errorReportLocation;
    }

    /**
     * <p>
     * S3 location for error report.
     * </p>
     * 
     * @param errorReportLocation
     *        S3 location for error report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryRunSummary withErrorReportLocation(ErrorReportLocation errorReportLocation) {
        setErrorReportLocation(errorReportLocation);
        return this;
    }

    /**
     * <p>
     * Error message for the scheduled query in case of failure. You might have to look at the error report to get more
     * detailed error reasons.
     * </p>
     * 
     * @param failureReason
     *        Error message for the scheduled query in case of failure. You might have to look at the error report to
     *        get more detailed error reasons.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Error message for the scheduled query in case of failure. You might have to look at the error report to get more
     * detailed error reasons.
     * </p>
     * 
     * @return Error message for the scheduled query in case of failure. You might have to look at the error report to
     *         get more detailed error reasons.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Error message for the scheduled query in case of failure. You might have to look at the error report to get more
     * detailed error reasons.
     * </p>
     * 
     * @param failureReason
     *        Error message for the scheduled query in case of failure. You might have to look at the error report to
     *        get more detailed error reasons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledQueryRunSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getInvocationTime() != null)
            sb.append("InvocationTime: ").append(getInvocationTime()).append(",");
        if (getTriggerTime() != null)
            sb.append("TriggerTime: ").append(getTriggerTime()).append(",");
        if (getRunStatus() != null)
            sb.append("RunStatus: ").append(getRunStatus()).append(",");
        if (getExecutionStats() != null)
            sb.append("ExecutionStats: ").append(getExecutionStats()).append(",");
        if (getErrorReportLocation() != null)
            sb.append("ErrorReportLocation: ").append(getErrorReportLocation()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledQueryRunSummary == false)
            return false;
        ScheduledQueryRunSummary other = (ScheduledQueryRunSummary) obj;
        if (other.getInvocationTime() == null ^ this.getInvocationTime() == null)
            return false;
        if (other.getInvocationTime() != null && other.getInvocationTime().equals(this.getInvocationTime()) == false)
            return false;
        if (other.getTriggerTime() == null ^ this.getTriggerTime() == null)
            return false;
        if (other.getTriggerTime() != null && other.getTriggerTime().equals(this.getTriggerTime()) == false)
            return false;
        if (other.getRunStatus() == null ^ this.getRunStatus() == null)
            return false;
        if (other.getRunStatus() != null && other.getRunStatus().equals(this.getRunStatus()) == false)
            return false;
        if (other.getExecutionStats() == null ^ this.getExecutionStats() == null)
            return false;
        if (other.getExecutionStats() != null && other.getExecutionStats().equals(this.getExecutionStats()) == false)
            return false;
        if (other.getErrorReportLocation() == null ^ this.getErrorReportLocation() == null)
            return false;
        if (other.getErrorReportLocation() != null && other.getErrorReportLocation().equals(this.getErrorReportLocation()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvocationTime() == null) ? 0 : getInvocationTime().hashCode());
        hashCode = prime * hashCode + ((getTriggerTime() == null) ? 0 : getTriggerTime().hashCode());
        hashCode = prime * hashCode + ((getRunStatus() == null) ? 0 : getRunStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionStats() == null) ? 0 : getExecutionStats().hashCode());
        hashCode = prime * hashCode + ((getErrorReportLocation() == null) ? 0 : getErrorReportLocation().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledQueryRunSummary clone() {
        try {
            return (ScheduledQueryRunSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.ScheduledQueryRunSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
