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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the monitor properties used in the <a>ListMonitors</a> operation. To get a complete set of
 * properties, call the <a>DescribeMonitor</a> operation, and provide the listed <code>MonitorArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/MonitorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor being monitored.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The status of the monitor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE_STOPPING</code>, <code>ACTIVE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * When the monitor resource was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the monitor resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - When the resource stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the monitor creation finished or failed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor resource.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitor resource.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor resource.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     * 
     * @return The name of the monitor resource.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor resource.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor being monitored.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the predictor being monitored.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor being monitored.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the predictor being monitored.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the predictor being monitored.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the predictor being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The status of the monitor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE_STOPPING</code>, <code>ACTIVE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the monitor. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE_STOPPING</code>, <code>ACTIVE_STOPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the monitor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE_STOPPING</code>, <code>ACTIVE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the monitor. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE_STOPPING</code>, <code>ACTIVE_STOPPED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the monitor. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE_STOPPING</code>, <code>ACTIVE_STOPPED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the monitor. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE_STOPPING</code>, <code>ACTIVE_STOPPED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the monitor resource was created.
     * </p>
     * 
     * @param creationTime
     *        When the monitor resource was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the monitor resource was created.
     * </p>
     * 
     * @return When the monitor resource was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the monitor resource was created.
     * </p>
     * 
     * @param creationTime
     *        When the monitor resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the monitor resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - When the resource stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the monitor creation finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time the monitor resource was modified. The timestamp depends on the status of the job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - When the resource stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the monitor creation finished or failed.
     *        </p>
     *        </li>
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The last time the monitor resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - When the resource stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the monitor creation finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The last time the monitor resource was modified. The timestamp depends on the status of the job:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code> - When the resource stopped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the monitor creation finished or failed.
     *         </p>
     *         </li>
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The last time the monitor resource was modified. The timestamp depends on the status of the job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> - When the resource stopped.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the monitor creation finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time the monitor resource was modified. The timestamp depends on the status of the job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> - When the resource stopped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the monitor creation finished or failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitorSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitorSummary == false)
            return false;
        MonitorSummary other = (MonitorSummary) obj;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public MonitorSummary clone() {
        try {
            return (MonitorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.MonitorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
