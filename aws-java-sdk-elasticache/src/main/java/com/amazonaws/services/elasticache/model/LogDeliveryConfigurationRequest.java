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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies the destination, format and type of the logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/LogDeliveryConfigurationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDeliveryConfigurationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * </p>
     */
    private String logType;
    /**
     * <p>
     * Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
     * </p>
     */
    private DestinationDetails destinationDetails;
    /**
     * <p>
     * Specifies either JSON or TEXT
     * </p>
     */
    private String logFormat;
    /**
     * <p>
     * Specify if log delivery is enabled. Default <code>true</code>.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * </p>
     * 
     * @param logType
     *        Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * @see LogType
     */

    public void setLogType(String logType) {
        this.logType = logType;
    }

    /**
     * <p>
     * Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * </p>
     * 
     * @return Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * @see LogType
     */

    public String getLogType() {
        return this.logType;
    }

    /**
     * <p>
     * Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * </p>
     * 
     * @param logType
     *        Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogDeliveryConfigurationRequest withLogType(String logType) {
        setLogType(logType);
        return this;
    }

    /**
     * <p>
     * Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * </p>
     * 
     * @param logType
     *        Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogType
     */

    public LogDeliveryConfigurationRequest withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * </p>
     * 
     * @param destinationType
     *        Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * @see DestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * </p>
     * 
     * @return Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * @see DestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * </p>
     * 
     * @param destinationType
     *        Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public LogDeliveryConfigurationRequest withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * </p>
     * 
     * @param destinationType
     *        Specify either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code> as the destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public LogDeliveryConfigurationRequest withDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
     * </p>
     * 
     * @param destinationDetails
     *        Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
     */

    public void setDestinationDetails(DestinationDetails destinationDetails) {
        this.destinationDetails = destinationDetails;
    }

    /**
     * <p>
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
     * </p>
     * 
     * @return Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
     */

    public DestinationDetails getDestinationDetails() {
        return this.destinationDetails;
    }

    /**
     * <p>
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
     * </p>
     * 
     * @param destinationDetails
     *        Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDeliveryConfigurationRequest withDestinationDetails(DestinationDetails destinationDetails) {
        setDestinationDetails(destinationDetails);
        return this;
    }

    /**
     * <p>
     * Specifies either JSON or TEXT
     * </p>
     * 
     * @param logFormat
     *        Specifies either JSON or TEXT
     * @see LogFormat
     */

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * <p>
     * Specifies either JSON or TEXT
     * </p>
     * 
     * @return Specifies either JSON or TEXT
     * @see LogFormat
     */

    public String getLogFormat() {
        return this.logFormat;
    }

    /**
     * <p>
     * Specifies either JSON or TEXT
     * </p>
     * 
     * @param logFormat
     *        Specifies either JSON or TEXT
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFormat
     */

    public LogDeliveryConfigurationRequest withLogFormat(String logFormat) {
        setLogFormat(logFormat);
        return this;
    }

    /**
     * <p>
     * Specifies either JSON or TEXT
     * </p>
     * 
     * @param logFormat
     *        Specifies either JSON or TEXT
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFormat
     */

    public LogDeliveryConfigurationRequest withLogFormat(LogFormat logFormat) {
        this.logFormat = logFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specify if log delivery is enabled. Default <code>true</code>.
     * </p>
     * 
     * @param enabled
     *        Specify if log delivery is enabled. Default <code>true</code>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specify if log delivery is enabled. Default <code>true</code>.
     * </p>
     * 
     * @return Specify if log delivery is enabled. Default <code>true</code>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specify if log delivery is enabled. Default <code>true</code>.
     * </p>
     * 
     * @param enabled
     *        Specify if log delivery is enabled. Default <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDeliveryConfigurationRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specify if log delivery is enabled. Default <code>true</code>.
     * </p>
     * 
     * @return Specify if log delivery is enabled. Default <code>true</code>.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getDestinationDetails() != null)
            sb.append("DestinationDetails: ").append(getDestinationDetails()).append(",");
        if (getLogFormat() != null)
            sb.append("LogFormat: ").append(getLogFormat()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogDeliveryConfigurationRequest == false)
            return false;
        LogDeliveryConfigurationRequest other = (LogDeliveryConfigurationRequest) obj;
        if (other.getLogType() == null ^ this.getLogType() == null)
            return false;
        if (other.getLogType() != null && other.getLogType().equals(this.getLogType()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getDestinationDetails() == null ^ this.getDestinationDetails() == null)
            return false;
        if (other.getDestinationDetails() != null && other.getDestinationDetails().equals(this.getDestinationDetails()) == false)
            return false;
        if (other.getLogFormat() == null ^ this.getLogFormat() == null)
            return false;
        if (other.getLogFormat() != null && other.getLogFormat().equals(this.getLogFormat()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogType() == null) ? 0 : getLogType().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getDestinationDetails() == null) ? 0 : getDestinationDetails().hashCode());
        hashCode = prime * hashCode + ((getLogFormat() == null) ? 0 : getLogFormat().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public LogDeliveryConfigurationRequest clone() {
        try {
            return (LogDeliveryConfigurationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
