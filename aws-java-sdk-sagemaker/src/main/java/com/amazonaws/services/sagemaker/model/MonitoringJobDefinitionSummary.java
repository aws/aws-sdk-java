/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Summary information about a monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringJobDefinitionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringJobDefinitionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the monitoring job.
     * </p>
     */
    private String monitoringJobDefinitionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     */
    private String monitoringJobDefinitionArn;
    /**
     * <p>
     * The time that the monitoring job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The name of the endpoint that the job monitors.
     * </p>
     */
    private String endpointName;

    /**
     * <p>
     * The name of the monitoring job.
     * </p>
     * 
     * @param monitoringJobDefinitionName
     *        The name of the monitoring job.
     */

    public void setMonitoringJobDefinitionName(String monitoringJobDefinitionName) {
        this.monitoringJobDefinitionName = monitoringJobDefinitionName;
    }

    /**
     * <p>
     * The name of the monitoring job.
     * </p>
     * 
     * @return The name of the monitoring job.
     */

    public String getMonitoringJobDefinitionName() {
        return this.monitoringJobDefinitionName;
    }

    /**
     * <p>
     * The name of the monitoring job.
     * </p>
     * 
     * @param monitoringJobDefinitionName
     *        The name of the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinitionSummary withMonitoringJobDefinitionName(String monitoringJobDefinitionName) {
        setMonitoringJobDefinitionName(monitoringJobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * 
     * @param monitoringJobDefinitionArn
     *        The Amazon Resource Name (ARN) of the monitoring job.
     */

    public void setMonitoringJobDefinitionArn(String monitoringJobDefinitionArn) {
        this.monitoringJobDefinitionArn = monitoringJobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitoring job.
     */

    public String getMonitoringJobDefinitionArn() {
        return this.monitoringJobDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitoring job.
     * </p>
     * 
     * @param monitoringJobDefinitionArn
     *        The Amazon Resource Name (ARN) of the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinitionSummary withMonitoringJobDefinitionArn(String monitoringJobDefinitionArn) {
        setMonitoringJobDefinitionArn(monitoringJobDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The time that the monitoring job was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the monitoring job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the monitoring job was created.
     * </p>
     * 
     * @return The time that the monitoring job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the monitoring job was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the monitoring job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinitionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint that the job monitors.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that the job monitors.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that the job monitors.
     * </p>
     * 
     * @return The name of the endpoint that the job monitors.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that the job monitors.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint that the job monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJobDefinitionSummary withEndpointName(String endpointName) {
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
        if (getMonitoringJobDefinitionName() != null)
            sb.append("MonitoringJobDefinitionName: ").append(getMonitoringJobDefinitionName()).append(",");
        if (getMonitoringJobDefinitionArn() != null)
            sb.append("MonitoringJobDefinitionArn: ").append(getMonitoringJobDefinitionArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof MonitoringJobDefinitionSummary == false)
            return false;
        MonitoringJobDefinitionSummary other = (MonitoringJobDefinitionSummary) obj;
        if (other.getMonitoringJobDefinitionName() == null ^ this.getMonitoringJobDefinitionName() == null)
            return false;
        if (other.getMonitoringJobDefinitionName() != null && other.getMonitoringJobDefinitionName().equals(this.getMonitoringJobDefinitionName()) == false)
            return false;
        if (other.getMonitoringJobDefinitionArn() == null ^ this.getMonitoringJobDefinitionArn() == null)
            return false;
        if (other.getMonitoringJobDefinitionArn() != null && other.getMonitoringJobDefinitionArn().equals(this.getMonitoringJobDefinitionArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getMonitoringJobDefinitionName() == null) ? 0 : getMonitoringJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringJobDefinitionArn() == null) ? 0 : getMonitoringJobDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringJobDefinitionSummary clone() {
        try {
            return (MonitoringJobDefinitionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringJobDefinitionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
