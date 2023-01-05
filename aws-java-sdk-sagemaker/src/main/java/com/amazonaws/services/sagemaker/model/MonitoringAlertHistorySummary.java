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
 * Provides summary information of an alert's history.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringAlertHistorySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringAlertHistorySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a monitoring schedule.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     */
    private String monitoringAlertName;
    /**
     * <p>
     * A timestamp that indicates when the first alert transition occurred in an alert history. An alert transition can
     * be from status <code>InAlert</code> to <code>OK</code>, or from <code>OK</code> to <code>InAlert</code>.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The current alert status of an alert.
     * </p>
     */
    private String alertStatus;

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

    public MonitoringAlertHistorySummary withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
        return this;
    }

    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertName
     *        The name of a monitoring alert.
     */

    public void setMonitoringAlertName(String monitoringAlertName) {
        this.monitoringAlertName = monitoringAlertName;
    }

    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     * 
     * @return The name of a monitoring alert.
     */

    public String getMonitoringAlertName() {
        return this.monitoringAlertName;
    }

    /**
     * <p>
     * The name of a monitoring alert.
     * </p>
     * 
     * @param monitoringAlertName
     *        The name of a monitoring alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertHistorySummary withMonitoringAlertName(String monitoringAlertName) {
        setMonitoringAlertName(monitoringAlertName);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the first alert transition occurred in an alert history. An alert transition can
     * be from status <code>InAlert</code> to <code>OK</code>, or from <code>OK</code> to <code>InAlert</code>.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the first alert transition occurred in an alert history. An alert
     *        transition can be from status <code>InAlert</code> to <code>OK</code>, or from <code>OK</code> to
     *        <code>InAlert</code>.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the first alert transition occurred in an alert history. An alert transition can
     * be from status <code>InAlert</code> to <code>OK</code>, or from <code>OK</code> to <code>InAlert</code>.
     * </p>
     * 
     * @return A timestamp that indicates when the first alert transition occurred in an alert history. An alert
     *         transition can be from status <code>InAlert</code> to <code>OK</code>, or from <code>OK</code> to
     *         <code>InAlert</code>.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the first alert transition occurred in an alert history. An alert transition can
     * be from status <code>InAlert</code> to <code>OK</code>, or from <code>OK</code> to <code>InAlert</code>.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the first alert transition occurred in an alert history. An alert
     *        transition can be from status <code>InAlert</code> to <code>OK</code>, or from <code>OK</code> to
     *        <code>InAlert</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertHistorySummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The current alert status of an alert.
     * </p>
     * 
     * @param alertStatus
     *        The current alert status of an alert.
     * @see MonitoringAlertStatus
     */

    public void setAlertStatus(String alertStatus) {
        this.alertStatus = alertStatus;
    }

    /**
     * <p>
     * The current alert status of an alert.
     * </p>
     * 
     * @return The current alert status of an alert.
     * @see MonitoringAlertStatus
     */

    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * <p>
     * The current alert status of an alert.
     * </p>
     * 
     * @param alertStatus
     *        The current alert status of an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringAlertStatus
     */

    public MonitoringAlertHistorySummary withAlertStatus(String alertStatus) {
        setAlertStatus(alertStatus);
        return this;
    }

    /**
     * <p>
     * The current alert status of an alert.
     * </p>
     * 
     * @param alertStatus
     *        The current alert status of an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringAlertStatus
     */

    public MonitoringAlertHistorySummary withAlertStatus(MonitoringAlertStatus alertStatus) {
        this.alertStatus = alertStatus.toString();
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
        if (getMonitoringAlertName() != null)
            sb.append("MonitoringAlertName: ").append(getMonitoringAlertName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getAlertStatus() != null)
            sb.append("AlertStatus: ").append(getAlertStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringAlertHistorySummary == false)
            return false;
        MonitoringAlertHistorySummary other = (MonitoringAlertHistorySummary) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringAlertName() == null ^ this.getMonitoringAlertName() == null)
            return false;
        if (other.getMonitoringAlertName() != null && other.getMonitoringAlertName().equals(this.getMonitoringAlertName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getAlertStatus() == null ^ this.getAlertStatus() == null)
            return false;
        if (other.getAlertStatus() != null && other.getAlertStatus().equals(this.getAlertStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringAlertName() == null) ? 0 : getMonitoringAlertName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getAlertStatus() == null) ? 0 : getAlertStatus().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringAlertHistorySummary clone() {
        try {
            return (MonitoringAlertHistorySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringAlertHistorySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
