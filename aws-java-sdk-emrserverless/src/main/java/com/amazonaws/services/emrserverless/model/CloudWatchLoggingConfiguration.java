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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon CloudWatch configuration for monitoring logs. You can configure your jobs to send log information to
 * CloudWatch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CloudWatchLoggingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLoggingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables CloudWatch logging.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Prefix for the CloudWatch log stream name.
     * </p>
     */
    private String logStreamNamePrefix;
    /**
     * <p>
     * The Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch Logs.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The types of logs that you want to publish to CloudWatch. If you don't specify any log types, driver STDOUT and
     * STDERR logs will be published to CloudWatch Logs by default. For more information including the supported worker
     * types for Hive and Spark, see <a
     * href="https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/logging.html#jobs-log-storage-cw">Logging
     * for EMR Serverless with CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key Valid Values</b>: <code>SPARK_DRIVER</code>, <code>SPARK_EXECUTOR</code>, <code>HIVE_DRIVER</code>,
     * <code>TEZ_TASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Array Members Valid Values</b>: <code>STDOUT</code>, <code>STDERR</code>, <code>HIVE_LOG</code>,
     * <code>TEZ_AM</code>, <code>SYSTEM_LOGS</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<String>> logTypes;

    /**
     * <p>
     * Enables CloudWatch logging.
     * </p>
     * 
     * @param enabled
     *        Enables CloudWatch logging.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables CloudWatch logging.
     * </p>
     * 
     * @return Enables CloudWatch logging.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables CloudWatch logging.
     * </p>
     * 
     * @param enabled
     *        Enables CloudWatch logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables CloudWatch logging.
     * </p>
     * 
     * @return Enables CloudWatch logging.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     * </p>
     * 
     * @return The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group in Amazon CloudWatch Logs where you want to publish your logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingConfiguration withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Prefix for the CloudWatch log stream name.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Prefix for the CloudWatch log stream name.
     */

    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * Prefix for the CloudWatch log stream name.
     * </p>
     * 
     * @return Prefix for the CloudWatch log stream name.
     */

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    /**
     * <p>
     * Prefix for the CloudWatch log stream name.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Prefix for the CloudWatch log stream name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingConfiguration withLogStreamNamePrefix(String logStreamNamePrefix) {
        setLogStreamNamePrefix(logStreamNamePrefix);
        return this;
    }

    /**
     * <p>
     * The Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch Logs.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch Logs.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch Logs.
     * </p>
     * 
     * @return The Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch Logs.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch Logs.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Key Management Service (KMS) key ARN to encrypt the logs that you store in CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingConfiguration withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The types of logs that you want to publish to CloudWatch. If you don't specify any log types, driver STDOUT and
     * STDERR logs will be published to CloudWatch Logs by default. For more information including the supported worker
     * types for Hive and Spark, see <a
     * href="https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/logging.html#jobs-log-storage-cw">Logging
     * for EMR Serverless with CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key Valid Values</b>: <code>SPARK_DRIVER</code>, <code>SPARK_EXECUTOR</code>, <code>HIVE_DRIVER</code>,
     * <code>TEZ_TASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Array Members Valid Values</b>: <code>STDOUT</code>, <code>STDERR</code>, <code>HIVE_LOG</code>,
     * <code>TEZ_AM</code>, <code>SYSTEM_LOGS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The types of logs that you want to publish to CloudWatch. If you don't specify any log types, driver
     *         STDOUT and STDERR logs will be published to CloudWatch Logs by default. For more information including
     *         the supported worker types for Hive and Spark, see <a
     *         href="https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/logging.html#jobs-log-storage-cw"
     *         >Logging for EMR Serverless with CloudWatch</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Key Valid Values</b>: <code>SPARK_DRIVER</code>, <code>SPARK_EXECUTOR</code>, <code>HIVE_DRIVER</code>, <code>TEZ_TASK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Array Members Valid Values</b>: <code>STDOUT</code>, <code>STDERR</code>, <code>HIVE_LOG</code>,
     *         <code>TEZ_AM</code>, <code>SYSTEM_LOGS</code>
     *         </p>
     *         </li>
     */

    public java.util.Map<String, java.util.List<String>> getLogTypes() {
        return logTypes;
    }

    /**
     * <p>
     * The types of logs that you want to publish to CloudWatch. If you don't specify any log types, driver STDOUT and
     * STDERR logs will be published to CloudWatch Logs by default. For more information including the supported worker
     * types for Hive and Spark, see <a
     * href="https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/logging.html#jobs-log-storage-cw">Logging
     * for EMR Serverless with CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key Valid Values</b>: <code>SPARK_DRIVER</code>, <code>SPARK_EXECUTOR</code>, <code>HIVE_DRIVER</code>,
     * <code>TEZ_TASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Array Members Valid Values</b>: <code>STDOUT</code>, <code>STDERR</code>, <code>HIVE_LOG</code>,
     * <code>TEZ_AM</code>, <code>SYSTEM_LOGS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logTypes
     *        The types of logs that you want to publish to CloudWatch. If you don't specify any log types, driver
     *        STDOUT and STDERR logs will be published to CloudWatch Logs by default. For more information including the
     *        supported worker types for Hive and Spark, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/logging.html#jobs-log-storage-cw"
     *        >Logging for EMR Serverless with CloudWatch</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Key Valid Values</b>: <code>SPARK_DRIVER</code>, <code>SPARK_EXECUTOR</code>, <code>HIVE_DRIVER</code>,
     *        <code>TEZ_TASK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Array Members Valid Values</b>: <code>STDOUT</code>, <code>STDERR</code>, <code>HIVE_LOG</code>,
     *        <code>TEZ_AM</code>, <code>SYSTEM_LOGS</code>
     *        </p>
     *        </li>
     */

    public void setLogTypes(java.util.Map<String, java.util.List<String>> logTypes) {
        this.logTypes = logTypes;
    }

    /**
     * <p>
     * The types of logs that you want to publish to CloudWatch. If you don't specify any log types, driver STDOUT and
     * STDERR logs will be published to CloudWatch Logs by default. For more information including the supported worker
     * types for Hive and Spark, see <a
     * href="https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/logging.html#jobs-log-storage-cw">Logging
     * for EMR Serverless with CloudWatch</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key Valid Values</b>: <code>SPARK_DRIVER</code>, <code>SPARK_EXECUTOR</code>, <code>HIVE_DRIVER</code>,
     * <code>TEZ_TASK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Array Members Valid Values</b>: <code>STDOUT</code>, <code>STDERR</code>, <code>HIVE_LOG</code>,
     * <code>TEZ_AM</code>, <code>SYSTEM_LOGS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param logTypes
     *        The types of logs that you want to publish to CloudWatch. If you don't specify any log types, driver
     *        STDOUT and STDERR logs will be published to CloudWatch Logs by default. For more information including the
     *        supported worker types for Hive and Spark, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/EMR-Serverless-UserGuide/logging.html#jobs-log-storage-cw"
     *        >Logging for EMR Serverless with CloudWatch</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Key Valid Values</b>: <code>SPARK_DRIVER</code>, <code>SPARK_EXECUTOR</code>, <code>HIVE_DRIVER</code>,
     *        <code>TEZ_TASK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Array Members Valid Values</b>: <code>STDOUT</code>, <code>STDERR</code>, <code>HIVE_LOG</code>,
     *        <code>TEZ_AM</code>, <code>SYSTEM_LOGS</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingConfiguration withLogTypes(java.util.Map<String, java.util.List<String>> logTypes) {
        setLogTypes(logTypes);
        return this;
    }

    /**
     * Add a single LogTypes entry
     *
     * @see CloudWatchLoggingConfiguration#withLogTypes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingConfiguration addLogTypesEntry(String key, java.util.List<String> value) {
        if (null == this.logTypes) {
            this.logTypes = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.logTypes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logTypes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogTypes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchLoggingConfiguration clearLogTypesEntries() {
        this.logTypes = null;
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getLogStreamNamePrefix() != null)
            sb.append("LogStreamNamePrefix: ").append(getLogStreamNamePrefix()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getLogTypes() != null)
            sb.append("LogTypes: ").append(getLogTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchLoggingConfiguration == false)
            return false;
        CloudWatchLoggingConfiguration other = (CloudWatchLoggingConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getLogTypes() == null ^ this.getLogTypes() == null)
            return false;
        if (other.getLogTypes() != null && other.getLogTypes().equals(this.getLogTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getLogTypes() == null) ? 0 : getLogTypes().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchLoggingConfiguration clone() {
        try {
            return (CloudWatchLoggingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.CloudWatchLoggingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
