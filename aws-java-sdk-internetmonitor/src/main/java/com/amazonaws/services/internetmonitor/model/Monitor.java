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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of and information about a monitor in Amazon CloudWatch Internet Monitor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/Monitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Monitor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The status of a monitor.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The health of data processing for the monitor.
     * </p>
     */
    private String processingStatus;

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @return The name of the monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Monitor withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitor.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Monitor withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The status of a monitor.
     * </p>
     * 
     * @param status
     *        The status of a monitor.
     * @see MonitorConfigState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a monitor.
     * </p>
     * 
     * @return The status of a monitor.
     * @see MonitorConfigState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a monitor.
     * </p>
     * 
     * @param status
     *        The status of a monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorConfigState
     */

    public Monitor withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a monitor.
     * </p>
     * 
     * @param status
     *        The status of a monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorConfigState
     */

    public Monitor withStatus(MonitorConfigState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The health of data processing for the monitor.
     * </p>
     * 
     * @param processingStatus
     *        The health of data processing for the monitor.
     * @see MonitorProcessingStatusCode
     */

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    /**
     * <p>
     * The health of data processing for the monitor.
     * </p>
     * 
     * @return The health of data processing for the monitor.
     * @see MonitorProcessingStatusCode
     */

    public String getProcessingStatus() {
        return this.processingStatus;
    }

    /**
     * <p>
     * The health of data processing for the monitor.
     * </p>
     * 
     * @param processingStatus
     *        The health of data processing for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorProcessingStatusCode
     */

    public Monitor withProcessingStatus(String processingStatus) {
        setProcessingStatus(processingStatus);
        return this;
    }

    /**
     * <p>
     * The health of data processing for the monitor.
     * </p>
     * 
     * @param processingStatus
     *        The health of data processing for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitorProcessingStatusCode
     */

    public Monitor withProcessingStatus(MonitorProcessingStatusCode processingStatus) {
        this.processingStatus = processingStatus.toString();
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProcessingStatus() != null)
            sb.append("ProcessingStatus: ").append(getProcessingStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Monitor == false)
            return false;
        Monitor other = (Monitor) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProcessingStatus() == null ^ this.getProcessingStatus() == null)
            return false;
        if (other.getProcessingStatus() != null && other.getProcessingStatus().equals(this.getProcessingStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProcessingStatus() == null) ? 0 : getProcessingStatus().hashCode());
        return hashCode;
    }

    @Override
    public Monitor clone() {
        try {
            return (Monitor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.MonitorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
