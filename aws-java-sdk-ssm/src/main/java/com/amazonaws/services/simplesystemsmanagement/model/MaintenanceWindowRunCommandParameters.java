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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for a RUN_COMMAND task type.
 * </p>
 * <p>
 * For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and
 * <a>UpdateMaintenanceWindowTask</a>.
 * </p>
 * <note>
 * <p>
 * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
 * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
 * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for
 * the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use
 * the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how
 * Systems Manager handles these options for the supported Maintenance Window task types, see
 * <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * For Run Command tasks, Systems Manager uses specified values for <code>TaskParameters</code> and
 * <code>LoggingInfo</code> only if no values are specified for <code>TaskInvocationParameters</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowRunCommandParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowRunCommandParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the command(s) to run.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * </p>
     */
    private String documentHash;
    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     */
    private String documentHashType;
    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per-instance basis.
     * </p>
     */
    private NotificationConfig notificationConfig;
    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     */
    private String outputS3KeyPrefix;
    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The IAM service role to assume during task execution.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * If this time is reached and the command has not already started running, it doesn't run.
     * </p>
     */
    private Integer timeoutSeconds;

    /**
     * <p>
     * Information about the command(s) to run.
     * </p>
     * 
     * @param comment
     *        Information about the command(s) to run.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Information about the command(s) to run.
     * </p>
     * 
     * @return Information about the command(s) to run.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Information about the command(s) to run.
     * </p>
     * 
     * @param comment
     *        Information about the command(s) to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * </p>
     * 
     * @param documentHash
     *        The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been
     *        deprecated.
     */

    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * </p>
     * 
     * @return The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been
     *         deprecated.
     */

    public String getDocumentHash() {
        return this.documentHash;
    }

    /**
     * <p>
     * The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been deprecated.
     * </p>
     * 
     * @param documentHash
     *        The SHA-256 or SHA-1 hash created by the system when the document was created. SHA-1 hashes have been
     *        deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withDocumentHash(String documentHash) {
        setDocumentHash(documentHash);
        return this;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * 
     * @param documentHashType
     *        SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * @see DocumentHashType
     */

    public void setDocumentHashType(String documentHashType) {
        this.documentHashType = documentHashType;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * 
     * @return SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * @see DocumentHashType
     */

    public String getDocumentHashType() {
        return this.documentHashType;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * 
     * @param documentHashType
     *        SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public MaintenanceWindowRunCommandParameters withDocumentHashType(String documentHashType) {
        setDocumentHashType(documentHashType);
        return this;
    }

    /**
     * <p>
     * SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * </p>
     * 
     * @param documentHashType
     *        SHA-256 or SHA-1. SHA-1 hashes have been deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentHashType
     */

    public MaintenanceWindowRunCommandParameters withDocumentHashType(DocumentHashType documentHashType) {
        this.documentHashType = documentHashType.toString();
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per-instance basis.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes on a per-instance basis.
     */

    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per-instance basis.
     * </p>
     * 
     * @return Configurations for sending notifications about command status changes on a per-instance basis.
     */

    public NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes on a per-instance basis.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes on a per-instance basis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withNotificationConfig(NotificationConfig notificationConfig) {
        setNotificationConfig(notificationConfig);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the Amazon S3 bucket.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The Amazon S3 bucket subfolder.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * 
     * @return The Amazon S3 bucket subfolder.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The Amazon S3 bucket subfolder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     * 
     * @return The parameters for the RUN_COMMAND task execution.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     * 
     * @param parameters
     *        The parameters for the RUN_COMMAND task execution.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the RUN_COMMAND task execution.
     * </p>
     * 
     * @param parameters
     *        The parameters for the RUN_COMMAND task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public MaintenanceWindowRunCommandParameters addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The IAM service role to assume during task execution.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM service role to assume during task execution.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The IAM service role to assume during task execution.
     * </p>
     * 
     * @return The IAM service role to assume during task execution.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The IAM service role to assume during task execution.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM service role to assume during task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it doesn't run.
     * </p>
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started running, it doesn't run.
     */

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it doesn't run.
     * </p>
     * 
     * @return If this time is reached and the command has not already started running, it doesn't run.
     */

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started running, it doesn't run.
     * </p>
     * 
     * @param timeoutSeconds
     *        If this time is reached and the command has not already started running, it doesn't run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowRunCommandParameters withTimeoutSeconds(Integer timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getDocumentHash() != null)
            sb.append("DocumentHash: ").append(getDocumentHash()).append(",");
        if (getDocumentHashType() != null)
            sb.append("DocumentHashType: ").append(getDocumentHashType()).append(",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: ").append(getNotificationConfig()).append(",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: ").append(getOutputS3BucketName()).append(",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: ").append(getOutputS3KeyPrefix()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: ").append(getTimeoutSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowRunCommandParameters == false)
            return false;
        MaintenanceWindowRunCommandParameters other = (MaintenanceWindowRunCommandParameters) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getDocumentHash() == null ^ this.getDocumentHash() == null)
            return false;
        if (other.getDocumentHash() != null && other.getDocumentHash().equals(this.getDocumentHash()) == false)
            return false;
        if (other.getDocumentHashType() == null ^ this.getDocumentHashType() == null)
            return false;
        if (other.getDocumentHashType() != null && other.getDocumentHashType().equals(this.getDocumentHashType()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDocumentHash() == null) ? 0 : getDocumentHash().hashCode());
        hashCode = prime * hashCode + ((getDocumentHashType() == null) ? 0 : getDocumentHashType().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowRunCommandParameters clone() {
        try {
            return (MaintenanceWindowRunCommandParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowRunCommandParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
