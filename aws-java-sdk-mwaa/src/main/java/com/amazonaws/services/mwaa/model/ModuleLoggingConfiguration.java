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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/ModuleLoggingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModuleLoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g.
     * <code>DagProcessingLogs</code>) is published. For example,
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*</code>
     * .
     * </p>
     */
    private String cloudWatchLogGroupArn;
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
     * The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g.
     * <code>DagProcessingLogs</code>) is published. For example,
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*</code>
     * .
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g.
     *        <code>DagProcessingLogs</code>) is published. For example,
     *        <code>arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*</code>
     *        .
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g.
     * <code>DagProcessingLogs</code>) is published. For example,
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*</code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g.
     *         <code>DagProcessingLogs</code>) is published. For example,
     *         <code>arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*</code>
     *         .
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g.
     * <code>DagProcessingLogs</code>) is published. For example,
     * <code>arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*</code>
     * .
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) for the CloudWatch Logs group where the Apache Airflow log type (e.g.
     *        <code>DagProcessingLogs</code>) is published. For example,
     *        <code>arn:aws:logs:us-east-1:123456789012:log-group:airflow-MyMWAAEnvironment-MwaaEnvironment-DAGProcessing:*</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModuleLoggingConfiguration withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

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

    public ModuleLoggingConfiguration withEnabled(Boolean enabled) {
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

    public ModuleLoggingConfiguration withLogLevel(String logLevel) {
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

    public ModuleLoggingConfiguration withLogLevel(LoggingLevel logLevel) {
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
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
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

        if (obj instanceof ModuleLoggingConfiguration == false)
            return false;
        ModuleLoggingConfiguration other = (ModuleLoggingConfiguration) obj;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        return hashCode;
    }

    @Override
    public ModuleLoggingConfiguration clone() {
        try {
            return (ModuleLoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.ModuleLoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
