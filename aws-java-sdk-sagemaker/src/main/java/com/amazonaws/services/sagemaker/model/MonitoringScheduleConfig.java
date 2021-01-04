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
 * Configures the monitoring schedule and defines the monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringScheduleConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringScheduleConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     */
    private ScheduleConfig scheduleConfig;
    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     */
    private MonitoringJobDefinition monitoringJobDefinition;
    /**
     * <p>
     * The name of the monitoring job definition to schedule.
     * </p>
     */
    private String monitoringJobDefinitionName;
    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     */
    private String monitoringType;

    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     * 
     * @param scheduleConfig
     *        Configures the monitoring schedule.
     */

    public void setScheduleConfig(ScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
    }

    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     * 
     * @return Configures the monitoring schedule.
     */

    public ScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * <p>
     * Configures the monitoring schedule.
     * </p>
     * 
     * @param scheduleConfig
     *        Configures the monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringScheduleConfig withScheduleConfig(ScheduleConfig scheduleConfig) {
        setScheduleConfig(scheduleConfig);
        return this;
    }

    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     * 
     * @param monitoringJobDefinition
     *        Defines the monitoring job.
     */

    public void setMonitoringJobDefinition(MonitoringJobDefinition monitoringJobDefinition) {
        this.monitoringJobDefinition = monitoringJobDefinition;
    }

    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     * 
     * @return Defines the monitoring job.
     */

    public MonitoringJobDefinition getMonitoringJobDefinition() {
        return this.monitoringJobDefinition;
    }

    /**
     * <p>
     * Defines the monitoring job.
     * </p>
     * 
     * @param monitoringJobDefinition
     *        Defines the monitoring job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringScheduleConfig withMonitoringJobDefinition(MonitoringJobDefinition monitoringJobDefinition) {
        setMonitoringJobDefinition(monitoringJobDefinition);
        return this;
    }

    /**
     * <p>
     * The name of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringJobDefinitionName
     *        The name of the monitoring job definition to schedule.
     */

    public void setMonitoringJobDefinitionName(String monitoringJobDefinitionName) {
        this.monitoringJobDefinitionName = monitoringJobDefinitionName;
    }

    /**
     * <p>
     * The name of the monitoring job definition to schedule.
     * </p>
     * 
     * @return The name of the monitoring job definition to schedule.
     */

    public String getMonitoringJobDefinitionName() {
        return this.monitoringJobDefinitionName;
    }

    /**
     * <p>
     * The name of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringJobDefinitionName
     *        The name of the monitoring job definition to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringScheduleConfig withMonitoringJobDefinitionName(String monitoringJobDefinitionName) {
        setMonitoringJobDefinitionName(monitoringJobDefinitionName);
        return this;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringType
     *        The type of the monitoring job definition to schedule.
     * @see MonitoringType
     */

    public void setMonitoringType(String monitoringType) {
        this.monitoringType = monitoringType;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @return The type of the monitoring job definition to schedule.
     * @see MonitoringType
     */

    public String getMonitoringType() {
        return this.monitoringType;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringType
     *        The type of the monitoring job definition to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringType
     */

    public MonitoringScheduleConfig withMonitoringType(String monitoringType) {
        setMonitoringType(monitoringType);
        return this;
    }

    /**
     * <p>
     * The type of the monitoring job definition to schedule.
     * </p>
     * 
     * @param monitoringType
     *        The type of the monitoring job definition to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MonitoringType
     */

    public MonitoringScheduleConfig withMonitoringType(MonitoringType monitoringType) {
        this.monitoringType = monitoringType.toString();
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
        if (getScheduleConfig() != null)
            sb.append("ScheduleConfig: ").append(getScheduleConfig()).append(",");
        if (getMonitoringJobDefinition() != null)
            sb.append("MonitoringJobDefinition: ").append(getMonitoringJobDefinition()).append(",");
        if (getMonitoringJobDefinitionName() != null)
            sb.append("MonitoringJobDefinitionName: ").append(getMonitoringJobDefinitionName()).append(",");
        if (getMonitoringType() != null)
            sb.append("MonitoringType: ").append(getMonitoringType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringScheduleConfig == false)
            return false;
        MonitoringScheduleConfig other = (MonitoringScheduleConfig) obj;
        if (other.getScheduleConfig() == null ^ this.getScheduleConfig() == null)
            return false;
        if (other.getScheduleConfig() != null && other.getScheduleConfig().equals(this.getScheduleConfig()) == false)
            return false;
        if (other.getMonitoringJobDefinition() == null ^ this.getMonitoringJobDefinition() == null)
            return false;
        if (other.getMonitoringJobDefinition() != null && other.getMonitoringJobDefinition().equals(this.getMonitoringJobDefinition()) == false)
            return false;
        if (other.getMonitoringJobDefinitionName() == null ^ this.getMonitoringJobDefinitionName() == null)
            return false;
        if (other.getMonitoringJobDefinitionName() != null && other.getMonitoringJobDefinitionName().equals(this.getMonitoringJobDefinitionName()) == false)
            return false;
        if (other.getMonitoringType() == null ^ this.getMonitoringType() == null)
            return false;
        if (other.getMonitoringType() != null && other.getMonitoringType().equals(this.getMonitoringType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleConfig() == null) ? 0 : getScheduleConfig().hashCode());
        hashCode = prime * hashCode + ((getMonitoringJobDefinition() == null) ? 0 : getMonitoringJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getMonitoringJobDefinitionName() == null) ? 0 : getMonitoringJobDefinitionName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringType() == null) ? 0 : getMonitoringType().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringScheduleConfig clone() {
        try {
            return (MonitoringScheduleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringScheduleConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
