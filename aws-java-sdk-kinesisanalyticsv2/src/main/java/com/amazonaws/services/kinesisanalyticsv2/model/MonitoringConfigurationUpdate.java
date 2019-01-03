/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes updates to configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics
 * application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/MonitoringConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * </p>
     */
    private String configurationTypeUpdate;
    /**
     * <p>
     * Describes updates to the granularity of the CloudWatch Logs for an application.
     * </p>
     */
    private String metricsLevelUpdate;
    /**
     * <p>
     * Describes updates to the verbosity of the CloudWatch Logs for an application.
     * </p>
     */
    private String logLevelUpdate;

    /**
     * <p>
     * Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * @see ConfigurationType
     */

    public void setConfigurationTypeUpdate(String configurationTypeUpdate) {
        this.configurationTypeUpdate = configurationTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @return Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * @see ConfigurationType
     */

    public String getConfigurationTypeUpdate() {
        return this.configurationTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public MonitoringConfigurationUpdate withConfigurationTypeUpdate(String configurationTypeUpdate) {
        setConfigurationTypeUpdate(configurationTypeUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether to use the default CloudWatch logging configuration for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public MonitoringConfigurationUpdate withConfigurationTypeUpdate(ConfigurationType configurationTypeUpdate) {
        this.configurationTypeUpdate = configurationTypeUpdate.toString();
        return this;
    }

    /**
     * <p>
     * Describes updates to the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param metricsLevelUpdate
     *        Describes updates to the granularity of the CloudWatch Logs for an application.
     * @see MetricsLevel
     */

    public void setMetricsLevelUpdate(String metricsLevelUpdate) {
        this.metricsLevelUpdate = metricsLevelUpdate;
    }

    /**
     * <p>
     * Describes updates to the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @return Describes updates to the granularity of the CloudWatch Logs for an application.
     * @see MetricsLevel
     */

    public String getMetricsLevelUpdate() {
        return this.metricsLevelUpdate;
    }

    /**
     * <p>
     * Describes updates to the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param metricsLevelUpdate
     *        Describes updates to the granularity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsLevel
     */

    public MonitoringConfigurationUpdate withMetricsLevelUpdate(String metricsLevelUpdate) {
        setMetricsLevelUpdate(metricsLevelUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param metricsLevelUpdate
     *        Describes updates to the granularity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsLevel
     */

    public MonitoringConfigurationUpdate withMetricsLevelUpdate(MetricsLevel metricsLevelUpdate) {
        this.metricsLevelUpdate = metricsLevelUpdate.toString();
        return this;
    }

    /**
     * <p>
     * Describes updates to the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevelUpdate
     *        Describes updates to the verbosity of the CloudWatch Logs for an application.
     * @see LogLevel
     */

    public void setLogLevelUpdate(String logLevelUpdate) {
        this.logLevelUpdate = logLevelUpdate;
    }

    /**
     * <p>
     * Describes updates to the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @return Describes updates to the verbosity of the CloudWatch Logs for an application.
     * @see LogLevel
     */

    public String getLogLevelUpdate() {
        return this.logLevelUpdate;
    }

    /**
     * <p>
     * Describes updates to the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevelUpdate
     *        Describes updates to the verbosity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public MonitoringConfigurationUpdate withLogLevelUpdate(String logLevelUpdate) {
        setLogLevelUpdate(logLevelUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevelUpdate
     *        Describes updates to the verbosity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public MonitoringConfigurationUpdate withLogLevelUpdate(LogLevel logLevelUpdate) {
        this.logLevelUpdate = logLevelUpdate.toString();
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
        if (getConfigurationTypeUpdate() != null)
            sb.append("ConfigurationTypeUpdate: ").append(getConfigurationTypeUpdate()).append(",");
        if (getMetricsLevelUpdate() != null)
            sb.append("MetricsLevelUpdate: ").append(getMetricsLevelUpdate()).append(",");
        if (getLogLevelUpdate() != null)
            sb.append("LogLevelUpdate: ").append(getLogLevelUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringConfigurationUpdate == false)
            return false;
        MonitoringConfigurationUpdate other = (MonitoringConfigurationUpdate) obj;
        if (other.getConfigurationTypeUpdate() == null ^ this.getConfigurationTypeUpdate() == null)
            return false;
        if (other.getConfigurationTypeUpdate() != null && other.getConfigurationTypeUpdate().equals(this.getConfigurationTypeUpdate()) == false)
            return false;
        if (other.getMetricsLevelUpdate() == null ^ this.getMetricsLevelUpdate() == null)
            return false;
        if (other.getMetricsLevelUpdate() != null && other.getMetricsLevelUpdate().equals(this.getMetricsLevelUpdate()) == false)
            return false;
        if (other.getLogLevelUpdate() == null ^ this.getLogLevelUpdate() == null)
            return false;
        if (other.getLogLevelUpdate() != null && other.getLogLevelUpdate().equals(this.getLogLevelUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationTypeUpdate() == null) ? 0 : getConfigurationTypeUpdate().hashCode());
        hashCode = prime * hashCode + ((getMetricsLevelUpdate() == null) ? 0 : getMetricsLevelUpdate().hashCode());
        hashCode = prime * hashCode + ((getLogLevelUpdate() == null) ? 0 : getLogLevelUpdate().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringConfigurationUpdate clone() {
        try {
            return (MonitoringConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.MonitoringConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
