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
            sb.append("MonitoringJobDefinition: ").append(getMonitoringJobDefinition());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleConfig() == null) ? 0 : getScheduleConfig().hashCode());
        hashCode = prime * hashCode + ((getMonitoringJobDefinition() == null) ? 0 : getMonitoringJobDefinition().hashCode());
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
