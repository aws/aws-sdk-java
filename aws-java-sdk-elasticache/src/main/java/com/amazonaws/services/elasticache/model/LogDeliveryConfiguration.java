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
 * Returns the destination, format and type of the logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/LogDeliveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogDeliveryConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Refers to <a href="https://redis.io/commands/slowlog">slow-log</a>.
     * </p>
     */
    private String logType;
    /**
     * <p>
     * Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
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
     * Returns the log format, either JSON or TEXT.
     * </p>
     */
    private String logFormat;
    /**
     * <p>
     * Returns the log delivery configuration status. Values are one of <code>enabling</code> | <code>disabling</code> |
     * <code>modifying</code> | <code>active</code> | <code>error</code>
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returns an error message for the log delivery configuration.
     * </p>
     */
    private String message;

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

    public LogDeliveryConfiguration withLogType(String logType) {
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

    public LogDeliveryConfiguration withLogType(LogType logType) {
        this.logType = logType.toString();
        return this;
    }

    /**
     * <p>
     * Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * </p>
     * 
     * @param destinationType
     *        Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * @see DestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * </p>
     * 
     * @return Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * @see DestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * </p>
     * 
     * @param destinationType
     *        Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public LogDeliveryConfiguration withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * </p>
     * 
     * @param destinationType
     *        Returns the destination type, either <code>cloudwatch-logs</code> or <code>kinesis-firehose</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DestinationType
     */

    public LogDeliveryConfiguration withDestinationType(DestinationType destinationType) {
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

    public LogDeliveryConfiguration withDestinationDetails(DestinationDetails destinationDetails) {
        setDestinationDetails(destinationDetails);
        return this;
    }

    /**
     * <p>
     * Returns the log format, either JSON or TEXT.
     * </p>
     * 
     * @param logFormat
     *        Returns the log format, either JSON or TEXT.
     * @see LogFormat
     */

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * <p>
     * Returns the log format, either JSON or TEXT.
     * </p>
     * 
     * @return Returns the log format, either JSON or TEXT.
     * @see LogFormat
     */

    public String getLogFormat() {
        return this.logFormat;
    }

    /**
     * <p>
     * Returns the log format, either JSON or TEXT.
     * </p>
     * 
     * @param logFormat
     *        Returns the log format, either JSON or TEXT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFormat
     */

    public LogDeliveryConfiguration withLogFormat(String logFormat) {
        setLogFormat(logFormat);
        return this;
    }

    /**
     * <p>
     * Returns the log format, either JSON or TEXT.
     * </p>
     * 
     * @param logFormat
     *        Returns the log format, either JSON or TEXT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFormat
     */

    public LogDeliveryConfiguration withLogFormat(LogFormat logFormat) {
        this.logFormat = logFormat.toString();
        return this;
    }

    /**
     * <p>
     * Returns the log delivery configuration status. Values are one of <code>enabling</code> | <code>disabling</code> |
     * <code>modifying</code> | <code>active</code> | <code>error</code>
     * </p>
     * 
     * @param status
     *        Returns the log delivery configuration status. Values are one of <code>enabling</code> |
     *        <code>disabling</code> | <code>modifying</code> | <code>active</code> | <code>error</code>
     * @see LogDeliveryConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Returns the log delivery configuration status. Values are one of <code>enabling</code> | <code>disabling</code> |
     * <code>modifying</code> | <code>active</code> | <code>error</code>
     * </p>
     * 
     * @return Returns the log delivery configuration status. Values are one of <code>enabling</code> |
     *         <code>disabling</code> | <code>modifying</code> | <code>active</code> | <code>error</code>
     * @see LogDeliveryConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Returns the log delivery configuration status. Values are one of <code>enabling</code> | <code>disabling</code> |
     * <code>modifying</code> | <code>active</code> | <code>error</code>
     * </p>
     * 
     * @param status
     *        Returns the log delivery configuration status. Values are one of <code>enabling</code> |
     *        <code>disabling</code> | <code>modifying</code> | <code>active</code> | <code>error</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDeliveryConfigurationStatus
     */

    public LogDeliveryConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Returns the log delivery configuration status. Values are one of <code>enabling</code> | <code>disabling</code> |
     * <code>modifying</code> | <code>active</code> | <code>error</code>
     * </p>
     * 
     * @param status
     *        Returns the log delivery configuration status. Values are one of <code>enabling</code> |
     *        <code>disabling</code> | <code>modifying</code> | <code>active</code> | <code>error</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogDeliveryConfigurationStatus
     */

    public LogDeliveryConfiguration withStatus(LogDeliveryConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Returns an error message for the log delivery configuration.
     * </p>
     * 
     * @param message
     *        Returns an error message for the log delivery configuration.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Returns an error message for the log delivery configuration.
     * </p>
     * 
     * @return Returns an error message for the log delivery configuration.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Returns an error message for the log delivery configuration.
     * </p>
     * 
     * @param message
     *        Returns an error message for the log delivery configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogDeliveryConfiguration withMessage(String message) {
        setMessage(message);
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
        if (getLogType() != null)
            sb.append("LogType: ").append(getLogType()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getDestinationDetails() != null)
            sb.append("DestinationDetails: ").append(getDestinationDetails()).append(",");
        if (getLogFormat() != null)
            sb.append("LogFormat: ").append(getLogFormat()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogDeliveryConfiguration == false)
            return false;
        LogDeliveryConfiguration other = (LogDeliveryConfiguration) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public LogDeliveryConfiguration clone() {
        try {
            return (LogDeliveryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
