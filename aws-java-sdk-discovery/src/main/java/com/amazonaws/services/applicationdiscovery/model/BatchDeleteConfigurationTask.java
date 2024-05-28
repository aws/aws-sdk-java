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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A metadata object that represents the deletion task being executed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteConfigurationTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deletion task's unique identifier.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING |
     * COMPLETED | FAILED.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was completed or failed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * The list of configuration IDs that were originally requested to be deleted by the deletion task.
     * </p>
     */
    private java.util.List<String> requestedConfigurations;
    /**
     * <p>
     * The list of configuration IDs that were successfully deleted by the deletion task.
     * </p>
     */
    private java.util.List<String> deletedConfigurations;
    /**
     * <p>
     * A list of configuration IDs that failed to delete during the deletion task, each paired with an error message.
     * </p>
     */
    private java.util.List<FailedConfiguration> failedConfigurations;
    /**
     * <p>
     * A list of configuration IDs that produced warnings regarding their deletion, paired with a warning message.
     * </p>
     */
    private java.util.List<DeletionWarning> deletionWarnings;

    /**
     * <p>
     * The deletion task's unique identifier.
     * </p>
     * 
     * @param taskId
     *        The deletion task's unique identifier.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The deletion task's unique identifier.
     * </p>
     * 
     * @return The deletion task's unique identifier.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The deletion task's unique identifier.
     * </p>
     * 
     * @param taskId
     *        The deletion task's unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING |
     * COMPLETED | FAILED.
     * </p>
     * 
     * @param status
     *        The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING
     *        | COMPLETED | FAILED.
     * @see BatchDeleteConfigurationTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING |
     * COMPLETED | FAILED.
     * </p>
     * 
     * @return The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING
     *         | COMPLETED | FAILED.
     * @see BatchDeleteConfigurationTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING |
     * COMPLETED | FAILED.
     * </p>
     * 
     * @param status
     *        The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING
     *        | COMPLETED | FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchDeleteConfigurationTaskStatus
     */

    public BatchDeleteConfigurationTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING |
     * COMPLETED | FAILED.
     * </p>
     * 
     * @param status
     *        The current execution status of the deletion task. Valid status are: INITIALIZING | VALIDATING | DELETING
     *        | COMPLETED | FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchDeleteConfigurationTaskStatus
     */

    public BatchDeleteConfigurationTask withStatus(BatchDeleteConfigurationTaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was started.
     * </p>
     * 
     * @param startTime
     *        An epoch seconds timestamp (UTC) of when the deletion task was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was started.
     * </p>
     * 
     * @return An epoch seconds timestamp (UTC) of when the deletion task was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was started.
     * </p>
     * 
     * @param startTime
     *        An epoch seconds timestamp (UTC) of when the deletion task was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was completed or failed.
     * </p>
     * 
     * @param endTime
     *        An epoch seconds timestamp (UTC) of when the deletion task was completed or failed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was completed or failed.
     * </p>
     * 
     * @return An epoch seconds timestamp (UTC) of when the deletion task was completed or failed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * An epoch seconds timestamp (UTC) of when the deletion task was completed or failed.
     * </p>
     * 
     * @param endTime
     *        An epoch seconds timestamp (UTC) of when the deletion task was completed or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @param configurationType
     *        The type of configuration item to delete. Supported types are: SERVER.
     * @see DeletionConfigurationItemType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @return The type of configuration item to delete. Supported types are: SERVER.
     * @see DeletionConfigurationItemType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @param configurationType
     *        The type of configuration item to delete. Supported types are: SERVER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionConfigurationItemType
     */

    public BatchDeleteConfigurationTask withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * The type of configuration item to delete. Supported types are: SERVER.
     * </p>
     * 
     * @param configurationType
     *        The type of configuration item to delete. Supported types are: SERVER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeletionConfigurationItemType
     */

    public BatchDeleteConfigurationTask withConfigurationType(DeletionConfigurationItemType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * The list of configuration IDs that were originally requested to be deleted by the deletion task.
     * </p>
     * 
     * @return The list of configuration IDs that were originally requested to be deleted by the deletion task.
     */

    public java.util.List<String> getRequestedConfigurations() {
        return requestedConfigurations;
    }

    /**
     * <p>
     * The list of configuration IDs that were originally requested to be deleted by the deletion task.
     * </p>
     * 
     * @param requestedConfigurations
     *        The list of configuration IDs that were originally requested to be deleted by the deletion task.
     */

    public void setRequestedConfigurations(java.util.Collection<String> requestedConfigurations) {
        if (requestedConfigurations == null) {
            this.requestedConfigurations = null;
            return;
        }

        this.requestedConfigurations = new java.util.ArrayList<String>(requestedConfigurations);
    }

    /**
     * <p>
     * The list of configuration IDs that were originally requested to be deleted by the deletion task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedConfigurations(java.util.Collection)} or
     * {@link #withRequestedConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requestedConfigurations
     *        The list of configuration IDs that were originally requested to be deleted by the deletion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withRequestedConfigurations(String... requestedConfigurations) {
        if (this.requestedConfigurations == null) {
            setRequestedConfigurations(new java.util.ArrayList<String>(requestedConfigurations.length));
        }
        for (String ele : requestedConfigurations) {
            this.requestedConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of configuration IDs that were originally requested to be deleted by the deletion task.
     * </p>
     * 
     * @param requestedConfigurations
     *        The list of configuration IDs that were originally requested to be deleted by the deletion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withRequestedConfigurations(java.util.Collection<String> requestedConfigurations) {
        setRequestedConfigurations(requestedConfigurations);
        return this;
    }

    /**
     * <p>
     * The list of configuration IDs that were successfully deleted by the deletion task.
     * </p>
     * 
     * @return The list of configuration IDs that were successfully deleted by the deletion task.
     */

    public java.util.List<String> getDeletedConfigurations() {
        return deletedConfigurations;
    }

    /**
     * <p>
     * The list of configuration IDs that were successfully deleted by the deletion task.
     * </p>
     * 
     * @param deletedConfigurations
     *        The list of configuration IDs that were successfully deleted by the deletion task.
     */

    public void setDeletedConfigurations(java.util.Collection<String> deletedConfigurations) {
        if (deletedConfigurations == null) {
            this.deletedConfigurations = null;
            return;
        }

        this.deletedConfigurations = new java.util.ArrayList<String>(deletedConfigurations);
    }

    /**
     * <p>
     * The list of configuration IDs that were successfully deleted by the deletion task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletedConfigurations(java.util.Collection)} or
     * {@link #withDeletedConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deletedConfigurations
     *        The list of configuration IDs that were successfully deleted by the deletion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withDeletedConfigurations(String... deletedConfigurations) {
        if (this.deletedConfigurations == null) {
            setDeletedConfigurations(new java.util.ArrayList<String>(deletedConfigurations.length));
        }
        for (String ele : deletedConfigurations) {
            this.deletedConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of configuration IDs that were successfully deleted by the deletion task.
     * </p>
     * 
     * @param deletedConfigurations
     *        The list of configuration IDs that were successfully deleted by the deletion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withDeletedConfigurations(java.util.Collection<String> deletedConfigurations) {
        setDeletedConfigurations(deletedConfigurations);
        return this;
    }

    /**
     * <p>
     * A list of configuration IDs that failed to delete during the deletion task, each paired with an error message.
     * </p>
     * 
     * @return A list of configuration IDs that failed to delete during the deletion task, each paired with an error
     *         message.
     */

    public java.util.List<FailedConfiguration> getFailedConfigurations() {
        return failedConfigurations;
    }

    /**
     * <p>
     * A list of configuration IDs that failed to delete during the deletion task, each paired with an error message.
     * </p>
     * 
     * @param failedConfigurations
     *        A list of configuration IDs that failed to delete during the deletion task, each paired with an error
     *        message.
     */

    public void setFailedConfigurations(java.util.Collection<FailedConfiguration> failedConfigurations) {
        if (failedConfigurations == null) {
            this.failedConfigurations = null;
            return;
        }

        this.failedConfigurations = new java.util.ArrayList<FailedConfiguration>(failedConfigurations);
    }

    /**
     * <p>
     * A list of configuration IDs that failed to delete during the deletion task, each paired with an error message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedConfigurations(java.util.Collection)} or {@link #withFailedConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param failedConfigurations
     *        A list of configuration IDs that failed to delete during the deletion task, each paired with an error
     *        message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withFailedConfigurations(FailedConfiguration... failedConfigurations) {
        if (this.failedConfigurations == null) {
            setFailedConfigurations(new java.util.ArrayList<FailedConfiguration>(failedConfigurations.length));
        }
        for (FailedConfiguration ele : failedConfigurations) {
            this.failedConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration IDs that failed to delete during the deletion task, each paired with an error message.
     * </p>
     * 
     * @param failedConfigurations
     *        A list of configuration IDs that failed to delete during the deletion task, each paired with an error
     *        message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withFailedConfigurations(java.util.Collection<FailedConfiguration> failedConfigurations) {
        setFailedConfigurations(failedConfigurations);
        return this;
    }

    /**
     * <p>
     * A list of configuration IDs that produced warnings regarding their deletion, paired with a warning message.
     * </p>
     * 
     * @return A list of configuration IDs that produced warnings regarding their deletion, paired with a warning
     *         message.
     */

    public java.util.List<DeletionWarning> getDeletionWarnings() {
        return deletionWarnings;
    }

    /**
     * <p>
     * A list of configuration IDs that produced warnings regarding their deletion, paired with a warning message.
     * </p>
     * 
     * @param deletionWarnings
     *        A list of configuration IDs that produced warnings regarding their deletion, paired with a warning
     *        message.
     */

    public void setDeletionWarnings(java.util.Collection<DeletionWarning> deletionWarnings) {
        if (deletionWarnings == null) {
            this.deletionWarnings = null;
            return;
        }

        this.deletionWarnings = new java.util.ArrayList<DeletionWarning>(deletionWarnings);
    }

    /**
     * <p>
     * A list of configuration IDs that produced warnings regarding their deletion, paired with a warning message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletionWarnings(java.util.Collection)} or {@link #withDeletionWarnings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deletionWarnings
     *        A list of configuration IDs that produced warnings regarding their deletion, paired with a warning
     *        message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withDeletionWarnings(DeletionWarning... deletionWarnings) {
        if (this.deletionWarnings == null) {
            setDeletionWarnings(new java.util.ArrayList<DeletionWarning>(deletionWarnings.length));
        }
        for (DeletionWarning ele : deletionWarnings) {
            this.deletionWarnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration IDs that produced warnings regarding their deletion, paired with a warning message.
     * </p>
     * 
     * @param deletionWarnings
     *        A list of configuration IDs that produced warnings regarding their deletion, paired with a warning
     *        message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConfigurationTask withDeletionWarnings(java.util.Collection<DeletionWarning> deletionWarnings) {
        setDeletionWarnings(deletionWarnings);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getConfigurationType() != null)
            sb.append("ConfigurationType: ").append(getConfigurationType()).append(",");
        if (getRequestedConfigurations() != null)
            sb.append("RequestedConfigurations: ").append(getRequestedConfigurations()).append(",");
        if (getDeletedConfigurations() != null)
            sb.append("DeletedConfigurations: ").append(getDeletedConfigurations()).append(",");
        if (getFailedConfigurations() != null)
            sb.append("FailedConfigurations: ").append(getFailedConfigurations()).append(",");
        if (getDeletionWarnings() != null)
            sb.append("DeletionWarnings: ").append(getDeletionWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteConfigurationTask == false)
            return false;
        BatchDeleteConfigurationTask other = (BatchDeleteConfigurationTask) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
            return false;
        if (other.getRequestedConfigurations() == null ^ this.getRequestedConfigurations() == null)
            return false;
        if (other.getRequestedConfigurations() != null && other.getRequestedConfigurations().equals(this.getRequestedConfigurations()) == false)
            return false;
        if (other.getDeletedConfigurations() == null ^ this.getDeletedConfigurations() == null)
            return false;
        if (other.getDeletedConfigurations() != null && other.getDeletedConfigurations().equals(this.getDeletedConfigurations()) == false)
            return false;
        if (other.getFailedConfigurations() == null ^ this.getFailedConfigurations() == null)
            return false;
        if (other.getFailedConfigurations() != null && other.getFailedConfigurations().equals(this.getFailedConfigurations()) == false)
            return false;
        if (other.getDeletionWarnings() == null ^ this.getDeletionWarnings() == null)
            return false;
        if (other.getDeletionWarnings() != null && other.getDeletionWarnings().equals(this.getDeletionWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getRequestedConfigurations() == null) ? 0 : getRequestedConfigurations().hashCode());
        hashCode = prime * hashCode + ((getDeletedConfigurations() == null) ? 0 : getDeletedConfigurations().hashCode());
        hashCode = prime * hashCode + ((getFailedConfigurations() == null) ? 0 : getFailedConfigurations().hashCode());
        hashCode = prime * hashCode + ((getDeletionWarnings() == null) ? 0 : getDeletionWarnings().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteConfigurationTask clone() {
        try {
            return (BatchDeleteConfigurationTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.BatchDeleteConfigurationTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
