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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The updated session action information as it relates to completion and progress of the session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdatedSessionActionInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatedSessionActionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the session upon completion.
     * </p>
     */
    private String completedStatus;
    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The process exit code.
     * </p>
     */
    private Integer processExitCode;
    /**
     * <p>
     * A message to indicate the progress of the updated session action.
     * </p>
     */
    private String progressMessage;
    /**
     * <p>
     * The percentage completed.
     * </p>
     */
    private Float progressPercent;
    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The updated time.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The status of the session upon completion.
     * </p>
     * 
     * @param completedStatus
     *        The status of the session upon completion.
     * @see CompletedStatus
     */

    public void setCompletedStatus(String completedStatus) {
        this.completedStatus = completedStatus;
    }

    /**
     * <p>
     * The status of the session upon completion.
     * </p>
     * 
     * @return The status of the session upon completion.
     * @see CompletedStatus
     */

    public String getCompletedStatus() {
        return this.completedStatus;
    }

    /**
     * <p>
     * The status of the session upon completion.
     * </p>
     * 
     * @param completedStatus
     *        The status of the session upon completion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompletedStatus
     */

    public UpdatedSessionActionInfo withCompletedStatus(String completedStatus) {
        setCompletedStatus(completedStatus);
        return this;
    }

    /**
     * <p>
     * The status of the session upon completion.
     * </p>
     * 
     * @param completedStatus
     *        The status of the session upon completion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompletedStatus
     */

    public UpdatedSessionActionInfo withCompletedStatus(CompletedStatus completedStatus) {
        this.completedStatus = completedStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @param endedAt
     *        The date and time the resource ended running.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @return The date and time the resource ended running.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @param endedAt
     *        The date and time the resource ended running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatedSessionActionInfo withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The process exit code.
     * </p>
     * 
     * @param processExitCode
     *        The process exit code.
     */

    public void setProcessExitCode(Integer processExitCode) {
        this.processExitCode = processExitCode;
    }

    /**
     * <p>
     * The process exit code.
     * </p>
     * 
     * @return The process exit code.
     */

    public Integer getProcessExitCode() {
        return this.processExitCode;
    }

    /**
     * <p>
     * The process exit code.
     * </p>
     * 
     * @param processExitCode
     *        The process exit code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatedSessionActionInfo withProcessExitCode(Integer processExitCode) {
        setProcessExitCode(processExitCode);
        return this;
    }

    /**
     * <p>
     * A message to indicate the progress of the updated session action.
     * </p>
     * 
     * @param progressMessage
     *        A message to indicate the progress of the updated session action.
     */

    public void setProgressMessage(String progressMessage) {
        this.progressMessage = progressMessage;
    }

    /**
     * <p>
     * A message to indicate the progress of the updated session action.
     * </p>
     * 
     * @return A message to indicate the progress of the updated session action.
     */

    public String getProgressMessage() {
        return this.progressMessage;
    }

    /**
     * <p>
     * A message to indicate the progress of the updated session action.
     * </p>
     * 
     * @param progressMessage
     *        A message to indicate the progress of the updated session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatedSessionActionInfo withProgressMessage(String progressMessage) {
        setProgressMessage(progressMessage);
        return this;
    }

    /**
     * <p>
     * The percentage completed.
     * </p>
     * 
     * @param progressPercent
     *        The percentage completed.
     */

    public void setProgressPercent(Float progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * The percentage completed.
     * </p>
     * 
     * @return The percentage completed.
     */

    public Float getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * <p>
     * The percentage completed.
     * </p>
     * 
     * @param progressPercent
     *        The percentage completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatedSessionActionInfo withProgressPercent(Float progressPercent) {
        setProgressPercent(progressPercent);
        return this;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @param startedAt
     *        The date and time the resource started running.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @return The date and time the resource started running.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @param startedAt
     *        The date and time the resource started running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatedSessionActionInfo withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The updated time.
     * </p>
     * 
     * @param updatedAt
     *        The updated time.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The updated time.
     * </p>
     * 
     * @return The updated time.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The updated time.
     * </p>
     * 
     * @param updatedAt
     *        The updated time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatedSessionActionInfo withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCompletedStatus() != null)
            sb.append("CompletedStatus: ").append(getCompletedStatus()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getProcessExitCode() != null)
            sb.append("ProcessExitCode: ").append(getProcessExitCode()).append(",");
        if (getProgressMessage() != null)
            sb.append("ProgressMessage: ").append("***Sensitive Data Redacted***").append(",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: ").append(getProgressPercent()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatedSessionActionInfo == false)
            return false;
        UpdatedSessionActionInfo other = (UpdatedSessionActionInfo) obj;
        if (other.getCompletedStatus() == null ^ this.getCompletedStatus() == null)
            return false;
        if (other.getCompletedStatus() != null && other.getCompletedStatus().equals(this.getCompletedStatus()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getProcessExitCode() == null ^ this.getProcessExitCode() == null)
            return false;
        if (other.getProcessExitCode() != null && other.getProcessExitCode().equals(this.getProcessExitCode()) == false)
            return false;
        if (other.getProgressMessage() == null ^ this.getProgressMessage() == null)
            return false;
        if (other.getProgressMessage() != null && other.getProgressMessage().equals(this.getProgressMessage()) == false)
            return false;
        if (other.getProgressPercent() == null ^ this.getProgressPercent() == null)
            return false;
        if (other.getProgressPercent() != null && other.getProgressPercent().equals(this.getProgressPercent()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletedStatus() == null) ? 0 : getCompletedStatus().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getProcessExitCode() == null) ? 0 : getProcessExitCode().hashCode());
        hashCode = prime * hashCode + ((getProgressMessage() == null) ? 0 : getProgressMessage().hashCode());
        hashCode = prime * hashCode + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdatedSessionActionInfo clone() {
        try {
            return (UpdatedSessionActionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.UpdatedSessionActionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
