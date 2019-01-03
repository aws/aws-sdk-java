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
 * Describes configuration parameters for Amazon CloudWatch logging for a Java-based Kinesis Data Analytics application.
 * For more information about CloudWatch logging, see <a
 * href="https://docs.aws.amazon.com/kinesisanalytics/latest/Java/monitoring-overview.html">Monitoring</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/MonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether to use the default CloudWatch logging configuration for an application.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * Describes the granularity of the CloudWatch Logs for an application.
     * </p>
     */
    private String metricsLevel;
    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     */
    private String logLevel;

    /**
     * <p>
     * Describes whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @param configurationType
     *        Describes whether to use the default CloudWatch logging configuration for an application.
     * @see ConfigurationType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * Describes whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @return Describes whether to use the default CloudWatch logging configuration for an application.
     * @see ConfigurationType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * Describes whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @param configurationType
     *        Describes whether to use the default CloudWatch logging configuration for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public MonitoringConfiguration withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * Describes whether to use the default CloudWatch logging configuration for an application.
     * </p>
     * 
     * @param configurationType
     *        Describes whether to use the default CloudWatch logging configuration for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public MonitoringConfiguration withConfigurationType(ConfigurationType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * Describes the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param metricsLevel
     *        Describes the granularity of the CloudWatch Logs for an application.
     * @see MetricsLevel
     */

    public void setMetricsLevel(String metricsLevel) {
        this.metricsLevel = metricsLevel;
    }

    /**
     * <p>
     * Describes the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @return Describes the granularity of the CloudWatch Logs for an application.
     * @see MetricsLevel
     */

    public String getMetricsLevel() {
        return this.metricsLevel;
    }

    /**
     * <p>
     * Describes the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param metricsLevel
     *        Describes the granularity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsLevel
     */

    public MonitoringConfiguration withMetricsLevel(String metricsLevel) {
        setMetricsLevel(metricsLevel);
        return this;
    }

    /**
     * <p>
     * Describes the granularity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param metricsLevel
     *        Describes the granularity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsLevel
     */

    public MonitoringConfiguration withMetricsLevel(MetricsLevel metricsLevel) {
        this.metricsLevel = metricsLevel.toString();
        return this;
    }

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevel
     *        Describes the verbosity of the CloudWatch Logs for an application.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @return Describes the verbosity of the CloudWatch Logs for an application.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevel
     *        Describes the verbosity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public MonitoringConfiguration withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * Describes the verbosity of the CloudWatch Logs for an application.
     * </p>
     * 
     * @param logLevel
     *        Describes the verbosity of the CloudWatch Logs for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public MonitoringConfiguration withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
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
        if (getConfigurationType() != null)
            sb.append("ConfigurationType: ").append(getConfigurationType()).append(",");
        if (getMetricsLevel() != null)
            sb.append("MetricsLevel: ").append(getMetricsLevel()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringConfiguration == false)
            return false;
        MonitoringConfiguration other = (MonitoringConfiguration) obj;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
            return false;
        if (other.getMetricsLevel() == null ^ this.getMetricsLevel() == null)
            return false;
        if (other.getMetricsLevel() != null && other.getMetricsLevel().equals(this.getMetricsLevel()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getMetricsLevel() == null) ? 0 : getMetricsLevel().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringConfiguration clone() {
        try {
            return (MonitoringConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.MonitoringConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
