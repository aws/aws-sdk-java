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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the type of logs to send for the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>). Valid values:
 * <code>CloudWatchLogGroupArn</code>, <code>Enabled</code>, <code>LogLevel</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ModuleLoggingConfigurationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModuleLoggingConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in CloudWatch Logs.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to CloudWatch
     * Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>, <code>INFO</code>.
     * </p>
     */
    private String logLevel;

    /**
     * <p>
     * Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in CloudWatch Logs.
     * </p>
     * 
     * @param enabled
     *        Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in
     *        CloudWatch Logs.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in CloudWatch Logs.
     * </p>
     * 
     * @return Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in
     *         CloudWatch Logs.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in CloudWatch Logs.
     * </p>
     * 
     * @param enabled
     *        Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in
     *        CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModuleLoggingConfigurationInput withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in CloudWatch Logs.
     * </p>
     * 
     * @return Indicates whether to enable the Apache Airflow log type (e.g. <code>DagProcessingLogs</code>) in
     *         CloudWatch Logs.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to CloudWatch
     * Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>, <code>INFO</code>.
     * </p>
     * 
     * @param logLevel
     *        Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to
     *        CloudWatch Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>,
     *        <code>INFO</code>.
     * @see LoggingLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to CloudWatch
     * Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>, <code>INFO</code>.
     * </p>
     * 
     * @return Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to
     *         CloudWatch Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>,
     *         <code>INFO</code>.
     * @see LoggingLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to CloudWatch
     * Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>, <code>INFO</code>.
     * </p>
     * 
     * @param logLevel
     *        Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to
     *        CloudWatch Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>,
     *        <code>INFO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public ModuleLoggingConfigurationInput withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to CloudWatch
     * Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>, <code>INFO</code>.
     * </p>
     * 
     * @param logLevel
     *        Defines the Apache Airflow logs to send for the log type (e.g. <code>DagProcessingLogs</code>) to
     *        CloudWatch Logs. Valid values: <code>CRITICAL</code>, <code>ERROR</code>, <code>WARNING</code>,
     *        <code>INFO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public ModuleLoggingConfigurationInput withLogLevel(LoggingLevel logLevel) {
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
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

        if (obj instanceof ModuleLoggingConfigurationInput == false)
            return false;
        ModuleLoggingConfigurationInput other = (ModuleLoggingConfigurationInput) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
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

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public ModuleLoggingConfigurationInput clone() {
        try {
            return (ModuleLoggingConfigurationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.ModuleLoggingConfigurationInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
