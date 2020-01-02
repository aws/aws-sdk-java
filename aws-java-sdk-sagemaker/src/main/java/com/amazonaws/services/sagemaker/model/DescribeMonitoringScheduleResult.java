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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeMonitoringSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMonitoringScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleArn;
    /**
     * <p>
     * Name of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     */
    private String monitoringScheduleStatus;
    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The time at which the monitoring job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and defines the monitoring job.
     * </p>
     */
    private MonitoringScheduleConfig monitoringScheduleConfig;
    /**
     * <p>
     * The name of the endpoint for the monitoring job.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     */
    private MonitoringExecutionSummary lastMonitoringExecutionSummary;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The Amazon Resource Name (ARN) of the monitoring schedule.
     */

    public void setMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitoring schedule.
     */

    public String getMonitoringScheduleArn() {
        return this.monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The Amazon Resource Name (ARN) of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitoringScheduleResult withMonitoringScheduleArn(String monitoringScheduleArn) {
        setMonitoringScheduleArn(monitoringScheduleArn);
        return this;
    }

    /**
     * <p>
     * Name of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        Name of the monitoring schedule.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * Name of the monitoring schedule.
     * </p>
     * 
     * @return Name of the monitoring schedule.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * Name of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        Name of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitoringScheduleResult withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * 
     * @param monitoringScheduleStatus
     *        The status of an monitoring job.
     * @see ScheduleStatus
     */

    public void setMonitoringScheduleStatus(String monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * 
     * @return The status of an monitoring job.
     * @see ScheduleStatus
     */

    public String getMonitoringScheduleStatus() {
        return this.monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * 
     * @param monitoringScheduleStatus
     *        The status of an monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public DescribeMonitoringScheduleResult withMonitoringScheduleStatus(String monitoringScheduleStatus) {
        setMonitoringScheduleStatus(monitoringScheduleStatus);
        return this;
    }

    /**
     * <p>
     * The status of an monitoring job.
     * </p>
     * 
     * @param monitoringScheduleStatus
     *        The status of an monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public DescribeMonitoringScheduleResult withMonitoringScheduleStatus(ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
     * </p>
     * 
     * @return A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A string, up to one KB in size, that contains the reason a monitoring job failed, if it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitoringScheduleResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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

    public DescribeMonitoringScheduleResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the monitoring job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     * 
     * @return The time at which the monitoring job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the monitoring job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the monitoring job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitoringScheduleResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and defines the monitoring job.
     * </p>
     * 
     * @param monitoringScheduleConfig
     *        The configuration object that specifies the monitoring schedule and defines the monitoring job.
     */

    public void setMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        this.monitoringScheduleConfig = monitoringScheduleConfig;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and defines the monitoring job.
     * </p>
     * 
     * @return The configuration object that specifies the monitoring schedule and defines the monitoring job.
     */

    public MonitoringScheduleConfig getMonitoringScheduleConfig() {
        return this.monitoringScheduleConfig;
    }

    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and defines the monitoring job.
     * </p>
     * 
     * @param monitoringScheduleConfig
     *        The configuration object that specifies the monitoring schedule and defines the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitoringScheduleResult withMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        setMonitoringScheduleConfig(monitoringScheduleConfig);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint for the monitoring job.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint for the monitoring job.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint for the monitoring job.
     * </p>
     * 
     * @return The name of the endpoint for the monitoring job.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint for the monitoring job.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint for the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitoringScheduleResult withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     * 
     * @param lastMonitoringExecutionSummary
     *        Describes metadata on the last execution to run, if there was one.
     */

    public void setLastMonitoringExecutionSummary(MonitoringExecutionSummary lastMonitoringExecutionSummary) {
        this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
    }

    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     * 
     * @return Describes metadata on the last execution to run, if there was one.
     */

    public MonitoringExecutionSummary getLastMonitoringExecutionSummary() {
        return this.lastMonitoringExecutionSummary;
    }

    /**
     * <p>
     * Describes metadata on the last execution to run, if there was one.
     * </p>
     * 
     * @param lastMonitoringExecutionSummary
     *        Describes metadata on the last execution to run, if there was one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitoringScheduleResult withLastMonitoringExecutionSummary(MonitoringExecutionSummary lastMonitoringExecutionSummary) {
        setLastMonitoringExecutionSummary(lastMonitoringExecutionSummary);
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
        if (getMonitoringScheduleArn() != null)
            sb.append("MonitoringScheduleArn: ").append(getMonitoringScheduleArn()).append(",");
        if (getMonitoringScheduleName() != null)
            sb.append("MonitoringScheduleName: ").append(getMonitoringScheduleName()).append(",");
        if (getMonitoringScheduleStatus() != null)
            sb.append("MonitoringScheduleStatus: ").append(getMonitoringScheduleStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getMonitoringScheduleConfig() != null)
            sb.append("MonitoringScheduleConfig: ").append(getMonitoringScheduleConfig()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getLastMonitoringExecutionSummary() != null)
            sb.append("LastMonitoringExecutionSummary: ").append(getLastMonitoringExecutionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMonitoringScheduleResult == false)
            return false;
        DescribeMonitoringScheduleResult other = (DescribeMonitoringScheduleResult) obj;
        if (other.getMonitoringScheduleArn() == null ^ this.getMonitoringScheduleArn() == null)
            return false;
        if (other.getMonitoringScheduleArn() != null && other.getMonitoringScheduleArn().equals(this.getMonitoringScheduleArn()) == false)
            return false;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringScheduleStatus() == null ^ this.getMonitoringScheduleStatus() == null)
            return false;
        if (other.getMonitoringScheduleStatus() != null && other.getMonitoringScheduleStatus().equals(this.getMonitoringScheduleStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMonitoringScheduleConfig() == null ^ this.getMonitoringScheduleConfig() == null)
            return false;
        if (other.getMonitoringScheduleConfig() != null && other.getMonitoringScheduleConfig().equals(this.getMonitoringScheduleConfig()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getLastMonitoringExecutionSummary() == null ^ this.getLastMonitoringExecutionSummary() == null)
            return false;
        if (other.getLastMonitoringExecutionSummary() != null
                && other.getLastMonitoringExecutionSummary().equals(this.getLastMonitoringExecutionSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleArn() == null) ? 0 : getMonitoringScheduleArn().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleStatus() == null) ? 0 : getMonitoringScheduleStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleConfig() == null) ? 0 : getMonitoringScheduleConfig().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getLastMonitoringExecutionSummary() == null) ? 0 : getLastMonitoringExecutionSummary().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMonitoringScheduleResult clone() {
        try {
            return (DescribeMonitoringScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
