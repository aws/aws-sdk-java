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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A monitoring schedule for a model displayed in the Amazon SageMaker Model Dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDashboardMonitoringSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDashboardMonitoringSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a monitoring schedule.
     * </p>
     */
    private String monitoringScheduleArn;
    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleStatus;
    /**
     * <p>
     * The monitor type of a model monitor.
     * </p>
     */
    private String monitoringType;
    /**
     * <p>
     * If a monitoring job failed, provides the reason.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private MonitoringScheduleConfig monitoringScheduleConfig;
    /**
     * <p>
     * The endpoint which is monitored.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     */
    private java.util.List<MonitoringAlertSummary> monitoringAlertSummaries;

    private MonitoringExecutionSummary lastMonitoringExecutionSummary;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The Amazon Resource Name (ARN) of a monitoring schedule.
     */

    public void setMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a monitoring schedule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a monitoring schedule.
     */

    public String getMonitoringScheduleArn() {
        return this.monitoringScheduleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The Amazon Resource Name (ARN) of a monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withMonitoringScheduleArn(String monitoringScheduleArn) {
        setMonitoringScheduleArn(monitoringScheduleArn);
        return this;
    }

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of a monitoring schedule.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @return The name of a monitoring schedule.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of a monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleStatus
     *        The status of the monitoring schedule.
     * @see ScheduleStatus
     */

    public void setMonitoringScheduleStatus(String monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * 
     * @return The status of the monitoring schedule.
     * @see ScheduleStatus
     */

    public String getMonitoringScheduleStatus() {
        return this.monitoringScheduleStatus;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleStatus
     *        The status of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public ModelDashboardMonitoringSchedule withMonitoringScheduleStatus(String monitoringScheduleStatus) {
        setMonitoringScheduleStatus(monitoringScheduleStatus);
        return this;
    }

    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleStatus
     *        The status of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleStatus
     */

    public ModelDashboardMonitoringSchedule withMonitoringScheduleStatus(ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The monitor type of a model monitor.
     * </p>
     * 
     * @param monitoringType
     *        The monitor type of a model monitor.
     * @see MonitoringType
     */

    public void setMonitoringType(String monitoringType) {
        this.monitoringType = monitoringType;
    }

    /**
     * <p>
     * The monitor type of a model monitor.
     * </p>
     * 
     * @return The monitor type of a model monitor.
     * @see MonitoringType
     */

    public String getMonitoringType() {
        return this.monitoringType;
    }

    /**
     * <p>
     * The monitor type of a model monitor.
     * </p>
     * 
     * @param monitoringType
     *        The monitor type of a model monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringType
     */

    public ModelDashboardMonitoringSchedule withMonitoringType(String monitoringType) {
        setMonitoringType(monitoringType);
        return this;
    }

    /**
     * <p>
     * The monitor type of a model monitor.
     * </p>
     * 
     * @param monitoringType
     *        The monitor type of a model monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringType
     */

    public ModelDashboardMonitoringSchedule withMonitoringType(MonitoringType monitoringType) {
        this.monitoringType = monitoringType.toString();
        return this;
    }

    /**
     * <p>
     * If a monitoring job failed, provides the reason.
     * </p>
     * 
     * @param failureReason
     *        If a monitoring job failed, provides the reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a monitoring job failed, provides the reason.
     * </p>
     * 
     * @return If a monitoring job failed, provides the reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a monitoring job failed, provides the reason.
     * </p>
     * 
     * @param failureReason
     *        If a monitoring job failed, provides the reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the monitoring schedule was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was created.
     * </p>
     * 
     * @return A timestamp that indicates when the monitoring schedule was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the monitoring schedule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the monitoring schedule was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the monitoring schedule was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the monitoring schedule was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that indicates when the monitoring schedule was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param monitoringScheduleConfig
     */

    public void setMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        this.monitoringScheduleConfig = monitoringScheduleConfig;
    }

    /**
     * @return
     */

    public MonitoringScheduleConfig getMonitoringScheduleConfig() {
        return this.monitoringScheduleConfig;
    }

    /**
     * @param monitoringScheduleConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        setMonitoringScheduleConfig(monitoringScheduleConfig);
        return this;
    }

    /**
     * <p>
     * The endpoint which is monitored.
     * </p>
     * 
     * @param endpointName
     *        The endpoint which is monitored.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The endpoint which is monitored.
     * </p>
     * 
     * @return The endpoint which is monitored.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The endpoint which is monitored.
     * </p>
     * 
     * @param endpointName
     *        The endpoint which is monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * 
     * @return A JSON array where each element is a summary for a monitoring alert.
     */

    public java.util.List<MonitoringAlertSummary> getMonitoringAlertSummaries() {
        return monitoringAlertSummaries;
    }

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertSummaries
     *        A JSON array where each element is a summary for a monitoring alert.
     */

    public void setMonitoringAlertSummaries(java.util.Collection<MonitoringAlertSummary> monitoringAlertSummaries) {
        if (monitoringAlertSummaries == null) {
            this.monitoringAlertSummaries = null;
            return;
        }

        this.monitoringAlertSummaries = new java.util.ArrayList<MonitoringAlertSummary>(monitoringAlertSummaries);
    }

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringAlertSummaries(java.util.Collection)} or
     * {@link #withMonitoringAlertSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param monitoringAlertSummaries
     *        A JSON array where each element is a summary for a monitoring alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withMonitoringAlertSummaries(MonitoringAlertSummary... monitoringAlertSummaries) {
        if (this.monitoringAlertSummaries == null) {
            setMonitoringAlertSummaries(new java.util.ArrayList<MonitoringAlertSummary>(monitoringAlertSummaries.length));
        }
        for (MonitoringAlertSummary ele : monitoringAlertSummaries) {
            this.monitoringAlertSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON array where each element is a summary for a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertSummaries
     *        A JSON array where each element is a summary for a monitoring alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withMonitoringAlertSummaries(java.util.Collection<MonitoringAlertSummary> monitoringAlertSummaries) {
        setMonitoringAlertSummaries(monitoringAlertSummaries);
        return this;
    }

    /**
     * @param lastMonitoringExecutionSummary
     */

    public void setLastMonitoringExecutionSummary(MonitoringExecutionSummary lastMonitoringExecutionSummary) {
        this.lastMonitoringExecutionSummary = lastMonitoringExecutionSummary;
    }

    /**
     * @return
     */

    public MonitoringExecutionSummary getLastMonitoringExecutionSummary() {
        return this.lastMonitoringExecutionSummary;
    }

    /**
     * @param lastMonitoringExecutionSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardMonitoringSchedule withLastMonitoringExecutionSummary(MonitoringExecutionSummary lastMonitoringExecutionSummary) {
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
        if (getMonitoringType() != null)
            sb.append("MonitoringType: ").append(getMonitoringType()).append(",");
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
        if (getMonitoringAlertSummaries() != null)
            sb.append("MonitoringAlertSummaries: ").append(getMonitoringAlertSummaries()).append(",");
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

        if (obj instanceof ModelDashboardMonitoringSchedule == false)
            return false;
        ModelDashboardMonitoringSchedule other = (ModelDashboardMonitoringSchedule) obj;
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
        if (other.getMonitoringType() == null ^ this.getMonitoringType() == null)
            return false;
        if (other.getMonitoringType() != null && other.getMonitoringType().equals(this.getMonitoringType()) == false)
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
        if (other.getMonitoringAlertSummaries() == null ^ this.getMonitoringAlertSummaries() == null)
            return false;
        if (other.getMonitoringAlertSummaries() != null && other.getMonitoringAlertSummaries().equals(this.getMonitoringAlertSummaries()) == false)
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
        hashCode = prime * hashCode + ((getMonitoringType() == null) ? 0 : getMonitoringType().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleConfig() == null) ? 0 : getMonitoringScheduleConfig().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringAlertSummaries() == null) ? 0 : getMonitoringAlertSummaries().hashCode());
        hashCode = prime * hashCode + ((getLastMonitoringExecutionSummary() == null) ? 0 : getLastMonitoringExecutionSummary().hashCode());
        return hashCode;
    }

    @Override
    public ModelDashboardMonitoringSchedule clone() {
        try {
            return (ModelDashboardMonitoringSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDashboardMonitoringScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
