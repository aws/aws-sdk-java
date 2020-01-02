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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateMonitoringSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMonitoringScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
     * </p>
     */
    private String monitoringScheduleName;
    /**
     * <p>
     * The configuration object that specifies the monitoring schedule and defines the monitoring job.
     * </p>
     */
    private MonitoringScheduleConfig monitoringScheduleConfig;

    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
     */

    public void setMonitoringScheduleName(String monitoringScheduleName) {
        this.monitoringScheduleName = monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
     * </p>
     * 
     * @return The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
     */

    public String getMonitoringScheduleName() {
        return this.monitoringScheduleName;
    }

    /**
     * <p>
     * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
     * </p>
     * 
     * @param monitoringScheduleName
     *        The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMonitoringScheduleRequest withMonitoringScheduleName(String monitoringScheduleName) {
        setMonitoringScheduleName(monitoringScheduleName);
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

    public UpdateMonitoringScheduleRequest withMonitoringScheduleConfig(MonitoringScheduleConfig monitoringScheduleConfig) {
        setMonitoringScheduleConfig(monitoringScheduleConfig);
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
        if (getMonitoringScheduleConfig() != null)
            sb.append("MonitoringScheduleConfig: ").append(getMonitoringScheduleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMonitoringScheduleRequest == false)
            return false;
        UpdateMonitoringScheduleRequest other = (UpdateMonitoringScheduleRequest) obj;
        if (other.getMonitoringScheduleName() == null ^ this.getMonitoringScheduleName() == null)
            return false;
        if (other.getMonitoringScheduleName() != null && other.getMonitoringScheduleName().equals(this.getMonitoringScheduleName()) == false)
            return false;
        if (other.getMonitoringScheduleConfig() == null ^ this.getMonitoringScheduleConfig() == null)
            return false;
        if (other.getMonitoringScheduleConfig() != null && other.getMonitoringScheduleConfig().equals(this.getMonitoringScheduleConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitoringScheduleName() == null) ? 0 : getMonitoringScheduleName().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleConfig() == null) ? 0 : getMonitoringScheduleConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMonitoringScheduleRequest clone() {
        return (UpdateMonitoringScheduleRequest) super.clone();
    }

}
