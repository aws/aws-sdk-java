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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of information about the last monitoring job to run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringExecutionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     */
    private java.util.Date scheduledTime;
    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     */
    private String monitoringExecutionStatus;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     */
    private String processingJobArn;
    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * 
     * @return The name of the monitoring schedule.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringExecutionSummary withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     * 
     * @param scheduledTime
     *        The time the monitoring job was scheduled.
     */

    public void setScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     * 
     * @return The time the monitoring job was scheduled.
     */

    public java.util.Date getScheduledTime() {
        return this.scheduledTime;
    }

    /**
     * <p>
     * The time the monitoring job was scheduled.
     * </p>
     * 
     * @param scheduledTime
     *        The time the monitoring job was scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringExecutionSummary withScheduledTime(java.util.Date scheduledTime) {
        setScheduledTime(scheduledTime);
        return this;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the monitoring job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     * 
     * @return The time at which the monitoring job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the monitoring job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringExecutionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates the last time the monitoring job was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     * 
     * @return A timestamp that indicates the last time the monitoring job was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates the last time the monitoring job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates the last time the monitoring job was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringExecutionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * 
     * @param monitoringExecutionStatus
     *        The status of the monitoring job.
     * @see ExecutionStatus
     */

    public void setMonitoringExecutionStatus(String monitoringExecutionStatus) {
        this.monitoringExecutionStatus = monitoringExecutionStatus;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * 
     * @return The status of the monitoring job.
     * @see ExecutionStatus
     */

    public String getMonitoringExecutionStatus() {
        return this.monitoringExecutionStatus;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * 
     * @param monitoringExecutionStatus
     *        The status of the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public MonitoringExecutionSummary withMonitoringExecutionStatus(String monitoringExecutionStatus) {
        setMonitoringExecutionStatus(monitoringExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The status of the monitoring job.
     * </p>
     * 
     * @param monitoringExecutionStatus
     *        The status of the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public MonitoringExecutionSummary withMonitoringExecutionStatus(ExecutionStatus monitoringExecutionStatus) {
        this.monitoringExecutionStatus = monitoringExecutionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the monitoring job.
     */

    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitoring job.
     */

    public String getProcessingJobArn() {
        return this.processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringExecutionSummary withProcessingJobArn(String processingJobArn) {
        setProcessingJobArn(processingJobArn);
        return this;
    }

    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     * 
     * @param endpointName
     *        The name of teh endpoint used to run the monitoring job.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     * 
     * @return The name of teh endpoint used to run the monitoring job.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of teh endpoint used to run the monitoring job.
     * </p>
     * 
     * @param endpointName
     *        The name of teh endpoint used to run the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringExecutionSummary withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        Contains the reason a monitoring job failed, if it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     * 
     * @return Contains the reason a monitoring job failed, if it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * Contains the reason a monitoring job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        Contains the reason a monitoring job failed, if it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringExecutionSummary withFailureReason(String failureReason) {
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
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: ").append(getMonitoringScheduleName()).append(",");
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: ").append(getScheduledTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getMonitoringExecutionStatus() != null)
            sb.append("MonitoringExecutionStatus: ").append(getMonitoringExecutionStatus()).append(",");
        if (getProcessingJobArn() != null)
            sb.append("ProcessingJobArn: ").append(getProcessingJobArn()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
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

        if (obj instanceof MonitoringExecutionSummary == false)
            return false;
        MonitoringExecutionSummary other = (MonitoringExecutionSummary) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null && other.getScheduledTime().equals(this.getScheduledTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMonitoringExecutionStatus() == null ^ this.getMonitoringExecutionStatus() == null)
            return false;
        if (other.getMonitoringExecutionStatus() != null && other.getMonitoringExecutionStatus().equals(this.getMonitoringExecutionStatus()) == false)
            return false;
        if (other.getProcessingJobArn() == null ^ this.getProcessingJobArn() == null)
            return false;
        if (other.getProcessingJobArn() != null && other.getProcessingJobArn().equals(this.getProcessingJobArn()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
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

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoringExecutionStatus() == null) ? 0 : getMonitoringExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getProcessingJobArn() == null) ? 0 : getProcessingJobArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringExecutionSummary clone() {
        try {
            return (MonitoringExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
