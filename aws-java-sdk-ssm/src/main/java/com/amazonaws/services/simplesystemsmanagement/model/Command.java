/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a command request.
 * </p>
 */
public class Command implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for this command.
     * </p>
     */
    private String commandId;
    /**
     * <p>
     * The name of the SSM document requested for execution.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute. Calculated based
     * on the ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     */
    private java.util.Date expiresAfter;
    /**
     * <p>
     * The parameter values to be inserted in the SSM document when executing the command.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     */
    private java.util.Date requestedDateTime;
    /**
     * <p>
     * The status of the command.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     */
    private String outputS3KeyPrefix;
    /**
     * <p>
     * The IAM service role that SSM uses to act on your behalf when sending notifications about command status changes.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Configurations for sending notifications about command status changes.
     * </p>
     */
    private NotificationConfig notificationConfig;

    /**
     * <p>
     * A unique identifier for this command.
     * </p>
     * 
     * @param commandId
     *        A unique identifier for this command.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * A unique identifier for this command.
     * </p>
     * 
     * @return A unique identifier for this command.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * <p>
     * A unique identifier for this command.
     * </p>
     * 
     * @param commandId
     *        A unique identifier for this command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * <p>
     * The name of the SSM document requested for execution.
     * </p>
     * 
     * @param documentName
     *        The name of the SSM document requested for execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the SSM document requested for execution.
     * </p>
     * 
     * @return The name of the SSM document requested for execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the SSM document requested for execution.
     * </p>
     * 
     * @param documentName
     *        The name of the SSM document requested for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @return User-specified information about the command, such as a brief description of what the command should do.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * User-specified information about the command, such as a brief description of what the command should do.
     * </p>
     * 
     * @param comment
     *        User-specified information about the command, such as a brief description of what the command should do.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute. Calculated based
     * on the ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     * 
     * @param expiresAfter
     *        If this time is reached and the command has not already started executing, it will not execute. Calculated
     *        based on the ExpiresAfter user input provided as part of the SendCommand API.
     */

    public void setExpiresAfter(java.util.Date expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute. Calculated based
     * on the ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     * 
     * @return If this time is reached and the command has not already started executing, it will not execute.
     *         Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.
     */

    public java.util.Date getExpiresAfter() {
        return this.expiresAfter;
    }

    /**
     * <p>
     * If this time is reached and the command has not already started executing, it will not execute. Calculated based
     * on the ExpiresAfter user input provided as part of the SendCommand API.
     * </p>
     * 
     * @param expiresAfter
     *        If this time is reached and the command has not already started executing, it will not execute. Calculated
     *        based on the ExpiresAfter user input provided as part of the SendCommand API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withExpiresAfter(java.util.Date expiresAfter) {
        setExpiresAfter(expiresAfter);
        return this;
    }

    /**
     * <p>
     * The parameter values to be inserted in the SSM document when executing the command.
     * </p>
     * 
     * @return The parameter values to be inserted in the SSM document when executing the command.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameter values to be inserted in the SSM document when executing the command.
     * </p>
     * 
     * @param parameters
     *        The parameter values to be inserted in the SSM document when executing the command.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameter values to be inserted in the SSM document when executing the command.
     * </p>
     * 
     * @param parameters
     *        The parameter values to be inserted in the SSM document when executing the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public Command addParametersEntry(String key, java.util.List<String> value) {
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

    public Command clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * 
     * @return The instance IDs against which this command was requested.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs against which this command was requested.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs against which this command was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance IDs against which this command was requested.
     * </p>
     * 
     * @param instanceIds
     *        The instance IDs against which this command was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     * 
     * @param requestedDateTime
     *        The date and time the command was requested.
     */

    public void setRequestedDateTime(java.util.Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     * 
     * @return The date and time the command was requested.
     */

    public java.util.Date getRequestedDateTime() {
        return this.requestedDateTime;
    }

    /**
     * <p>
     * The date and time the command was requested.
     * </p>
     * 
     * @param requestedDateTime
     *        The date and time the command was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withRequestedDateTime(java.util.Date requestedDateTime) {
        setRequestedDateTime(requestedDateTime);
        return this;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @see CommandStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @return The status of the command.
     * @see CommandStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandStatus
     */

    public Command withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @see CommandStatus
     */

    public void setStatus(CommandStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the command.
     * </p>
     * 
     * @param status
     *        The status of the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommandStatus
     */

    public Command withStatus(CommandStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should be stored. This was requested when
     *        issuing the command.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     * 
     * @return The S3 bucket where the responses to the command executions should be stored. This was requested when
     *         issuing the command.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the
     * command.
     * </p>
     * 
     * @param outputS3BucketName
     *        The S3 bucket where the responses to the command executions should be stored. This was requested when
     *        issuing the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *        This was requested when issuing the command.
     */

    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     * 
     * @return The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *         This was requested when issuing the command.
     */

    public String getOutputS3KeyPrefix() {
        return this.outputS3KeyPrefix;
    }

    /**
     * <p>
     * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was
     * requested when issuing the command.
     * </p>
     * 
     * @param outputS3KeyPrefix
     *        The S3 directory path inside the bucket where the responses to the command executions should be stored.
     *        This was requested when issuing the command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        setOutputS3KeyPrefix(outputS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The IAM service role that SSM uses to act on your behalf when sending notifications about command status changes.
     * </p>
     * 
     * @param serviceRole
     *        The IAM service role that SSM uses to act on your behalf when sending notifications about command status
     *        changes.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The IAM service role that SSM uses to act on your behalf when sending notifications about command status changes.
     * </p>
     * 
     * @return The IAM service role that SSM uses to act on your behalf when sending notifications about command status
     *         changes.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The IAM service role that SSM uses to act on your behalf when sending notifications about command status changes.
     * </p>
     * 
     * @param serviceRole
     *        The IAM service role that SSM uses to act on your behalf when sending notifications about command status
     *        changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes.
     */

    public void setNotificationConfig(NotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes.
     * </p>
     * 
     * @return Configurations for sending notifications about command status changes.
     */

    public NotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    /**
     * <p>
     * Configurations for sending notifications about command status changes.
     * </p>
     * 
     * @param notificationConfig
     *        Configurations for sending notifications about command status changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Command withNotificationConfig(NotificationConfig notificationConfig) {
        setNotificationConfig(notificationConfig);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCommandId() != null)
            sb.append("CommandId: " + getCommandId() + ",");
        if (getDocumentName() != null)
            sb.append("DocumentName: " + getDocumentName() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getExpiresAfter() != null)
            sb.append("ExpiresAfter: " + getExpiresAfter() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getRequestedDateTime() != null)
            sb.append("RequestedDateTime: " + getRequestedDateTime() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: " + getNotificationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Command == false)
            return false;
        Command other = (Command) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getExpiresAfter() == null ^ this.getExpiresAfter() == null)
            return false;
        if (other.getExpiresAfter() != null && other.getExpiresAfter().equals(this.getExpiresAfter()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getRequestedDateTime() == null ^ this.getRequestedDateTime() == null)
            return false;
        if (other.getRequestedDateTime() != null && other.getRequestedDateTime().equals(this.getRequestedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getExpiresAfter() == null) ? 0 : getExpiresAfter().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getRequestedDateTime() == null) ? 0 : getRequestedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        return hashCode;
    }

    @Override
    public Command clone() {
        try {
            return (Command) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
