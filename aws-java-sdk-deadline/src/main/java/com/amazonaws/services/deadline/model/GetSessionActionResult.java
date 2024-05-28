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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSessionAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The session action definition.
     * </p>
     */
    private SessionActionDefinition definition;
    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The exit code to exit the session.
     * </p>
     */
    private Integer processExitCode;
    /**
     * <p>
     * The message that communicates the progress of the session action.
     * </p>
     */
    private String progressMessage;
    /**
     * <p>
     * The percentage completed for a session action.
     * </p>
     */
    private Float progressPercent;
    /**
     * <p>
     * The session action ID.
     * </p>
     */
    private String sessionActionId;
    /**
     * <p>
     * The session ID for the session action.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status of the session action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Linux timestamp of the date and time the session action was last updated.
     * </p>
     */
    private java.util.Date workerUpdatedAt;

    /**
     * <p>
     * The session action definition.
     * </p>
     * 
     * @param definition
     *        The session action definition.
     */

    public void setDefinition(SessionActionDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The session action definition.
     * </p>
     * 
     * @return The session action definition.
     */

    public SessionActionDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The session action definition.
     * </p>
     * 
     * @param definition
     *        The session action definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionResult withDefinition(SessionActionDefinition definition) {
        setDefinition(definition);
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

    public GetSessionActionResult withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The exit code to exit the session.
     * </p>
     * 
     * @param processExitCode
     *        The exit code to exit the session.
     */

    public void setProcessExitCode(Integer processExitCode) {
        this.processExitCode = processExitCode;
    }

    /**
     * <p>
     * The exit code to exit the session.
     * </p>
     * 
     * @return The exit code to exit the session.
     */

    public Integer getProcessExitCode() {
        return this.processExitCode;
    }

    /**
     * <p>
     * The exit code to exit the session.
     * </p>
     * 
     * @param processExitCode
     *        The exit code to exit the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionResult withProcessExitCode(Integer processExitCode) {
        setProcessExitCode(processExitCode);
        return this;
    }

    /**
     * <p>
     * The message that communicates the progress of the session action.
     * </p>
     * 
     * @param progressMessage
     *        The message that communicates the progress of the session action.
     */

    public void setProgressMessage(String progressMessage) {
        this.progressMessage = progressMessage;
    }

    /**
     * <p>
     * The message that communicates the progress of the session action.
     * </p>
     * 
     * @return The message that communicates the progress of the session action.
     */

    public String getProgressMessage() {
        return this.progressMessage;
    }

    /**
     * <p>
     * The message that communicates the progress of the session action.
     * </p>
     * 
     * @param progressMessage
     *        The message that communicates the progress of the session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionResult withProgressMessage(String progressMessage) {
        setProgressMessage(progressMessage);
        return this;
    }

    /**
     * <p>
     * The percentage completed for a session action.
     * </p>
     * 
     * @param progressPercent
     *        The percentage completed for a session action.
     */

    public void setProgressPercent(Float progressPercent) {
        this.progressPercent = progressPercent;
    }

    /**
     * <p>
     * The percentage completed for a session action.
     * </p>
     * 
     * @return The percentage completed for a session action.
     */

    public Float getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * <p>
     * The percentage completed for a session action.
     * </p>
     * 
     * @param progressPercent
     *        The percentage completed for a session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionResult withProgressPercent(Float progressPercent) {
        setProgressPercent(progressPercent);
        return this;
    }

    /**
     * <p>
     * The session action ID.
     * </p>
     * 
     * @param sessionActionId
     *        The session action ID.
     */

    public void setSessionActionId(String sessionActionId) {
        this.sessionActionId = sessionActionId;
    }

    /**
     * <p>
     * The session action ID.
     * </p>
     * 
     * @return The session action ID.
     */

    public String getSessionActionId() {
        return this.sessionActionId;
    }

    /**
     * <p>
     * The session action ID.
     * </p>
     * 
     * @param sessionActionId
     *        The session action ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionResult withSessionActionId(String sessionActionId) {
        setSessionActionId(sessionActionId);
        return this;
    }

    /**
     * <p>
     * The session ID for the session action.
     * </p>
     * 
     * @param sessionId
     *        The session ID for the session action.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The session ID for the session action.
     * </p>
     * 
     * @return The session ID for the session action.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The session ID for the session action.
     * </p>
     * 
     * @param sessionId
     *        The session ID for the session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
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

    public GetSessionActionResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status of the session action.
     * </p>
     * 
     * @param status
     *        The status of the session action.
     * @see SessionActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the session action.
     * </p>
     * 
     * @return The status of the session action.
     * @see SessionActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the session action.
     * </p>
     * 
     * @param status
     *        The status of the session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionActionStatus
     */

    public GetSessionActionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the session action.
     * </p>
     * 
     * @param status
     *        The status of the session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionActionStatus
     */

    public GetSessionActionResult withStatus(SessionActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time the session action was last updated.
     * </p>
     * 
     * @param workerUpdatedAt
     *        The Linux timestamp of the date and time the session action was last updated.
     */

    public void setWorkerUpdatedAt(java.util.Date workerUpdatedAt) {
        this.workerUpdatedAt = workerUpdatedAt;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time the session action was last updated.
     * </p>
     * 
     * @return The Linux timestamp of the date and time the session action was last updated.
     */

    public java.util.Date getWorkerUpdatedAt() {
        return this.workerUpdatedAt;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time the session action was last updated.
     * </p>
     * 
     * @param workerUpdatedAt
     *        The Linux timestamp of the date and time the session action was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionActionResult withWorkerUpdatedAt(java.util.Date workerUpdatedAt) {
        setWorkerUpdatedAt(workerUpdatedAt);
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getProcessExitCode() != null)
            sb.append("ProcessExitCode: ").append(getProcessExitCode()).append(",");
        if (getProgressMessage() != null)
            sb.append("ProgressMessage: ").append("***Sensitive Data Redacted***").append(",");
        if (getProgressPercent() != null)
            sb.append("ProgressPercent: ").append(getProgressPercent()).append(",");
        if (getSessionActionId() != null)
            sb.append("SessionActionId: ").append(getSessionActionId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getWorkerUpdatedAt() != null)
            sb.append("WorkerUpdatedAt: ").append(getWorkerUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionActionResult == false)
            return false;
        GetSessionActionResult other = (GetSessionActionResult) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
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
        if (other.getSessionActionId() == null ^ this.getSessionActionId() == null)
            return false;
        if (other.getSessionActionId() != null && other.getSessionActionId().equals(this.getSessionActionId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getWorkerUpdatedAt() == null ^ this.getWorkerUpdatedAt() == null)
            return false;
        if (other.getWorkerUpdatedAt() != null && other.getWorkerUpdatedAt().equals(this.getWorkerUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getProcessExitCode() == null) ? 0 : getProcessExitCode().hashCode());
        hashCode = prime * hashCode + ((getProgressMessage() == null) ? 0 : getProgressMessage().hashCode());
        hashCode = prime * hashCode + ((getProgressPercent() == null) ? 0 : getProgressPercent().hashCode());
        hashCode = prime * hashCode + ((getSessionActionId() == null) ? 0 : getSessionActionId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkerUpdatedAt() == null) ? 0 : getWorkerUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionActionResult clone() {
        try {
            return (GetSessionActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
