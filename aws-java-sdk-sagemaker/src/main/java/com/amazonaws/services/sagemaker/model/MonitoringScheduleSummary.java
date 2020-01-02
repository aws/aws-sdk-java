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
 * Summarizes the monitoring schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringScheduleSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringScheduleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleArn;
    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The status of the monitoring schedule.
     * </p>
     */
    private String monitoringScheduleStatus;
    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     */
    private String endpointName;

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

    public MonitoringScheduleSummary withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

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

    public MonitoringScheduleSummary withMonitoringScheduleArn(String monitoringScheduleArn) {
        setMonitoringScheduleArn(monitoringScheduleArn);
        return this;
    }

    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the monitoring schedule.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     * 
     * @return The creation time of the monitoring schedule.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time of the monitoring schedule.
     * </p>
     * 
     * @param creationTime
     *        The creation time of the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringScheduleSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the monitoring schedule was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     * 
     * @return The last time the monitoring schedule was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time the monitoring schedule was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the monitoring schedule was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringScheduleSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public MonitoringScheduleSummary withMonitoringScheduleStatus(String monitoringScheduleStatus) {
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

    public MonitoringScheduleSummary withMonitoringScheduleStatus(ScheduleStatus monitoringScheduleStatus) {
        this.monitoringScheduleStatus = monitoringScheduleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint using the monitoring schedule.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     * 
     * @return The name of the endpoint using the monitoring schedule.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint using the monitoring schedule.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint using the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringScheduleSummary withEndpointName(String endpointName) {
        setEndpointName(endpointName);
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
        if (getMonitoringScheduleArn() != null)
            sb.append("MonitoringScheduleArn: ").append(getMonitoringScheduleArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getMonitoringScheduleStatus() != null)
            sb.append("MonitoringScheduleStatus: ").append(getMonitoringScheduleStatus()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringScheduleSummary == false)
            return false;
        MonitoringScheduleSummary other = (MonitoringScheduleSummary) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringScheduleArn() == null ^ this.getMonitoringScheduleArn() == null)
            return false;
        if (other.getMonitoringScheduleArn() != null && other.getMonitoringScheduleArn().equals(this.getMonitoringScheduleArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMonitoringScheduleStatus() == null ^ this.getMonitoringScheduleStatus() == null)
            return false;
        if (other.getMonitoringScheduleStatus() != null && other.getMonitoringScheduleStatus().equals(this.getMonitoringScheduleStatus()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleArn() == null) ? 0 : getMonitoringScheduleArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleStatus() == null) ? 0 : getMonitoringScheduleStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringScheduleSummary clone() {
        try {
            return (MonitoringScheduleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringScheduleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
