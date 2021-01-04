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
 * A JSON blob that provides configuration to use for logging with respect to the various Apache Airflow services:
 * DagProcessingLogs, SchedulerLogs, TaskLogs, WebserverLogs, and WorkerLogs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ModuleLoggingConfigurationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModuleLoggingConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines that the logging module is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * </p>
     */
    private String logLevel;

    /**
     * <p>
     * Defines that the logging module is enabled.
     * </p>
     * 
     * @param enabled
     *        Defines that the logging module is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Defines that the logging module is enabled.
     * </p>
     * 
     * @return Defines that the logging module is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Defines that the logging module is enabled.
     * </p>
     * 
     * @param enabled
     *        Defines that the logging module is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModuleLoggingConfigurationInput withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Defines that the logging module is enabled.
     * </p>
     * 
     * @return Defines that the logging module is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * </p>
     * 
     * @param logLevel
     *        Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * @see LoggingLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * </p>
     * 
     * @return Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * @see LoggingLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * </p>
     * 
     * @param logLevel
     *        Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public ModuleLoggingConfigurationInput withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
     * </p>
     * 
     * @param logLevel
     *        Defines the log level, which can be CRITICAL, ERROR, WARNING, or INFO.
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
