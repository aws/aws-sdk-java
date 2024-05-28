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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The function's Amazon CloudWatch Logs configuration settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/LoggingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format in which Lambda sends your function's application and system logs to CloudWatch. Select between plain
     * text and structured JSON.
     * </p>
     */
    private String logFormat;
    /**
     * <p>
     * Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda only
     * sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the highest level
     * and <code>FATAL</code> is the lowest.
     * </p>
     */
    private String applicationLogLevel;
    /**
     * <p>
     * Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only sends
     * system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level and
     * <code>WARN</code> is the lowest.
     * </p>
     */
    private String systemLogLevel;
    /**
     * <p>
     * The name of the Amazon CloudWatch log group the function sends logs to. By default, Lambda functions send logs to
     * a default log group named <code>/aws/lambda/&lt;function name&gt;</code>. To use a different log group, enter an
     * existing log group or enter a new log group name.
     * </p>
     */
    private String logGroup;

    /**
     * <p>
     * The format in which Lambda sends your function's application and system logs to CloudWatch. Select between plain
     * text and structured JSON.
     * </p>
     * 
     * @param logFormat
     *        The format in which Lambda sends your function's application and system logs to CloudWatch. Select between
     *        plain text and structured JSON.
     * @see LogFormat
     */

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }

    /**
     * <p>
     * The format in which Lambda sends your function's application and system logs to CloudWatch. Select between plain
     * text and structured JSON.
     * </p>
     * 
     * @return The format in which Lambda sends your function's application and system logs to CloudWatch. Select
     *         between plain text and structured JSON.
     * @see LogFormat
     */

    public String getLogFormat() {
        return this.logFormat;
    }

    /**
     * <p>
     * The format in which Lambda sends your function's application and system logs to CloudWatch. Select between plain
     * text and structured JSON.
     * </p>
     * 
     * @param logFormat
     *        The format in which Lambda sends your function's application and system logs to CloudWatch. Select between
     *        plain text and structured JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFormat
     */

    public LoggingConfig withLogFormat(String logFormat) {
        setLogFormat(logFormat);
        return this;
    }

    /**
     * <p>
     * The format in which Lambda sends your function's application and system logs to CloudWatch. Select between plain
     * text and structured JSON.
     * </p>
     * 
     * @param logFormat
     *        The format in which Lambda sends your function's application and system logs to CloudWatch. Select between
     *        plain text and structured JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogFormat
     */

    public LoggingConfig withLogFormat(LogFormat logFormat) {
        this.logFormat = logFormat.toString();
        return this;
    }

    /**
     * <p>
     * Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda only
     * sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the highest level
     * and <code>FATAL</code> is the lowest.
     * </p>
     * 
     * @param applicationLogLevel
     *        Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda
     *        only sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the
     *        highest level and <code>FATAL</code> is the lowest.
     * @see ApplicationLogLevel
     */

    public void setApplicationLogLevel(String applicationLogLevel) {
        this.applicationLogLevel = applicationLogLevel;
    }

    /**
     * <p>
     * Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda only
     * sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the highest level
     * and <code>FATAL</code> is the lowest.
     * </p>
     * 
     * @return Set this property to filter the application logs for your function that Lambda sends to CloudWatch.
     *         Lambda only sends application logs at the selected level of detail and lower, where <code>TRACE</code> is
     *         the highest level and <code>FATAL</code> is the lowest.
     * @see ApplicationLogLevel
     */

    public String getApplicationLogLevel() {
        return this.applicationLogLevel;
    }

    /**
     * <p>
     * Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda only
     * sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the highest level
     * and <code>FATAL</code> is the lowest.
     * </p>
     * 
     * @param applicationLogLevel
     *        Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda
     *        only sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the
     *        highest level and <code>FATAL</code> is the lowest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationLogLevel
     */

    public LoggingConfig withApplicationLogLevel(String applicationLogLevel) {
        setApplicationLogLevel(applicationLogLevel);
        return this;
    }

    /**
     * <p>
     * Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda only
     * sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the highest level
     * and <code>FATAL</code> is the lowest.
     * </p>
     * 
     * @param applicationLogLevel
     *        Set this property to filter the application logs for your function that Lambda sends to CloudWatch. Lambda
     *        only sends application logs at the selected level of detail and lower, where <code>TRACE</code> is the
     *        highest level and <code>FATAL</code> is the lowest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationLogLevel
     */

    public LoggingConfig withApplicationLogLevel(ApplicationLogLevel applicationLogLevel) {
        this.applicationLogLevel = applicationLogLevel.toString();
        return this;
    }

    /**
     * <p>
     * Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only sends
     * system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level and
     * <code>WARN</code> is the lowest.
     * </p>
     * 
     * @param systemLogLevel
     *        Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only
     *        sends system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level
     *        and <code>WARN</code> is the lowest.
     * @see SystemLogLevel
     */

    public void setSystemLogLevel(String systemLogLevel) {
        this.systemLogLevel = systemLogLevel;
    }

    /**
     * <p>
     * Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only sends
     * system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level and
     * <code>WARN</code> is the lowest.
     * </p>
     * 
     * @return Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda
     *         only sends system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest
     *         level and <code>WARN</code> is the lowest.
     * @see SystemLogLevel
     */

    public String getSystemLogLevel() {
        return this.systemLogLevel;
    }

    /**
     * <p>
     * Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only sends
     * system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level and
     * <code>WARN</code> is the lowest.
     * </p>
     * 
     * @param systemLogLevel
     *        Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only
     *        sends system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level
     *        and <code>WARN</code> is the lowest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SystemLogLevel
     */

    public LoggingConfig withSystemLogLevel(String systemLogLevel) {
        setSystemLogLevel(systemLogLevel);
        return this;
    }

    /**
     * <p>
     * Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only sends
     * system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level and
     * <code>WARN</code> is the lowest.
     * </p>
     * 
     * @param systemLogLevel
     *        Set this property to filter the system logs for your function that Lambda sends to CloudWatch. Lambda only
     *        sends system logs at the selected level of detail and lower, where <code>DEBUG</code> is the highest level
     *        and <code>WARN</code> is the lowest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SystemLogLevel
     */

    public LoggingConfig withSystemLogLevel(SystemLogLevel systemLogLevel) {
        this.systemLogLevel = systemLogLevel.toString();
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch log group the function sends logs to. By default, Lambda functions send logs to
     * a default log group named <code>/aws/lambda/&lt;function name&gt;</code>. To use a different log group, enter an
     * existing log group or enter a new log group name.
     * </p>
     * 
     * @param logGroup
     *        The name of the Amazon CloudWatch log group the function sends logs to. By default, Lambda functions send
     *        logs to a default log group named <code>/aws/lambda/&lt;function name&gt;</code>. To use a different log
     *        group, enter an existing log group or enter a new log group name.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch log group the function sends logs to. By default, Lambda functions send logs to
     * a default log group named <code>/aws/lambda/&lt;function name&gt;</code>. To use a different log group, enter an
     * existing log group or enter a new log group name.
     * </p>
     * 
     * @return The name of the Amazon CloudWatch log group the function sends logs to. By default, Lambda functions send
     *         logs to a default log group named <code>/aws/lambda/&lt;function name&gt;</code>. To use a different log
     *         group, enter an existing log group or enter a new log group name.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch log group the function sends logs to. By default, Lambda functions send logs to
     * a default log group named <code>/aws/lambda/&lt;function name&gt;</code>. To use a different log group, enter an
     * existing log group or enter a new log group name.
     * </p>
     * 
     * @param logGroup
     *        The name of the Amazon CloudWatch log group the function sends logs to. By default, Lambda functions send
     *        logs to a default log group named <code>/aws/lambda/&lt;function name&gt;</code>. To use a different log
     *        group, enter an existing log group or enter a new log group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withLogGroup(String logGroup) {
        setLogGroup(logGroup);
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
        if (getLogFormat() != null)
            sb.append("LogFormat: ").append(getLogFormat()).append(",");
        if (getApplicationLogLevel() != null)
            sb.append("ApplicationLogLevel: ").append(getApplicationLogLevel()).append(",");
        if (getSystemLogLevel() != null)
            sb.append("SystemLogLevel: ").append(getSystemLogLevel()).append(",");
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;
        if (other.getLogFormat() == null ^ this.getLogFormat() == null)
            return false;
        if (other.getLogFormat() != null && other.getLogFormat().equals(this.getLogFormat()) == false)
            return false;
        if (other.getApplicationLogLevel() == null ^ this.getApplicationLogLevel() == null)
            return false;
        if (other.getApplicationLogLevel() != null && other.getApplicationLogLevel().equals(this.getApplicationLogLevel()) == false)
            return false;
        if (other.getSystemLogLevel() == null ^ this.getSystemLogLevel() == null)
            return false;
        if (other.getSystemLogLevel() != null && other.getSystemLogLevel().equals(this.getSystemLogLevel()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogFormat() == null) ? 0 : getLogFormat().hashCode());
        hashCode = prime * hashCode + ((getApplicationLogLevel() == null) ? 0 : getApplicationLogLevel().hashCode());
        hashCode = prime * hashCode + ((getSystemLogLevel() == null) ? 0 : getSystemLogLevel().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfig clone() {
        try {
            return (LoggingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.LoggingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
