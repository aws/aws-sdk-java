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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The logging parameters of a user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/LogConfigurationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * </p>
     */
    private String logLevel;
    /**
     * <p>
     * The source of events that your user pool sends for detailed activity logging.
     * </p>
     */
    private String eventSource;
    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     */
    private CloudWatchLogsConfigurationType cloudWatchLogsConfiguration;

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * </p>
     * 
     * @param logLevel
     *        The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * </p>
     * 
     * @return The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * </p>
     * 
     * @param logLevel
     *        The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public LogConfigurationType withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * </p>
     * 
     * @param logLevel
     *        The <code>errorlevel</code> selection of logs that a user pool sends for detailed activity logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public LogConfigurationType withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity logging.
     * </p>
     * 
     * @param eventSource
     *        The source of events that your user pool sends for detailed activity logging.
     * @see EventSourceName
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity logging.
     * </p>
     * 
     * @return The source of events that your user pool sends for detailed activity logging.
     * @see EventSourceName
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity logging.
     * </p>
     * 
     * @param eventSource
     *        The source of events that your user pool sends for detailed activity logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public LogConfigurationType withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * The source of events that your user pool sends for detailed activity logging.
     * </p>
     * 
     * @param eventSource
     *        The source of events that your user pool sends for detailed activity logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public LogConfigurationType withEventSource(EventSourceName eventSource) {
        this.eventSource = eventSource.toString();
        return this;
    }

    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     * 
     * @param cloudWatchLogsConfiguration
     *        The CloudWatch logging destination of a user pool.
     */

    public void setCloudWatchLogsConfiguration(CloudWatchLogsConfigurationType cloudWatchLogsConfiguration) {
        this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     * 
     * @return The CloudWatch logging destination of a user pool.
     */

    public CloudWatchLogsConfigurationType getCloudWatchLogsConfiguration() {
        return this.cloudWatchLogsConfiguration;
    }

    /**
     * <p>
     * The CloudWatch logging destination of a user pool.
     * </p>
     * 
     * @param cloudWatchLogsConfiguration
     *        The CloudWatch logging destination of a user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogConfigurationType withCloudWatchLogsConfiguration(CloudWatchLogsConfigurationType cloudWatchLogsConfiguration) {
        setCloudWatchLogsConfiguration(cloudWatchLogsConfiguration);
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
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getCloudWatchLogsConfiguration() != null)
            sb.append("CloudWatchLogsConfiguration: ").append(getCloudWatchLogsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogConfigurationType == false)
            return false;
        LogConfigurationType other = (LogConfigurationType) obj;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getCloudWatchLogsConfiguration() == null ^ this.getCloudWatchLogsConfiguration() == null)
            return false;
        if (other.getCloudWatchLogsConfiguration() != null && other.getCloudWatchLogsConfiguration().equals(this.getCloudWatchLogsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsConfiguration() == null) ? 0 : getCloudWatchLogsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public LogConfigurationType clone() {
        try {
            return (LogConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.LogConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
