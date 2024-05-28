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
 * Summarizes the session for a particular worker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/WorkerSessionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerSessionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The job ID for the job associated with the worker's session.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The life cycle status for the worker's session.
     * </p>
     */
    private String lifecycleStatus;
    /**
     * <p>
     * The queue ID for the queue associated to the worker.
     * </p>
     */
    private String queueId;
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
     * The life cycle status
     * </p>
     */
    private String targetLifecycleStatus;

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

    public WorkerSessionSummary withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The job ID for the job associated with the worker's session.
     * </p>
     * 
     * @param jobId
     *        The job ID for the job associated with the worker's session.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the job associated with the worker's session.
     * </p>
     * 
     * @return The job ID for the job associated with the worker's session.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for the job associated with the worker's session.
     * </p>
     * 
     * @param jobId
     *        The job ID for the job associated with the worker's session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerSessionSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The life cycle status for the worker's session.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status for the worker's session.
     * @see SessionLifecycleStatus
     */

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status for the worker's session.
     * </p>
     * 
     * @return The life cycle status for the worker's session.
     * @see SessionLifecycleStatus
     */

    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status for the worker's session.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status for the worker's session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleStatus
     */

    public WorkerSessionSummary withLifecycleStatus(String lifecycleStatus) {
        setLifecycleStatus(lifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status for the worker's session.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status for the worker's session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleStatus
     */

    public WorkerSessionSummary withLifecycleStatus(SessionLifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The queue ID for the queue associated to the worker.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the queue associated to the worker.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID for the queue associated to the worker.
     * </p>
     * 
     * @return The queue ID for the queue associated to the worker.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID for the queue associated to the worker.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the queue associated to the worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerSessionSummary withQueueId(String queueId) {
        setQueueId(queueId);
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

    public WorkerSessionSummary withSessionId(String sessionId) {
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

    public WorkerSessionSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The life cycle status
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status
     * @see SessionLifecycleTargetStatus
     */

    public void setTargetLifecycleStatus(String targetLifecycleStatus) {
        this.targetLifecycleStatus = targetLifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status
     * </p>
     * 
     * @return The life cycle status
     * @see SessionLifecycleTargetStatus
     */

    public String getTargetLifecycleStatus() {
        return this.targetLifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleTargetStatus
     */

    public WorkerSessionSummary withTargetLifecycleStatus(String targetLifecycleStatus) {
        setTargetLifecycleStatus(targetLifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleTargetStatus
     */

    public WorkerSessionSummary withTargetLifecycleStatus(SessionLifecycleTargetStatus targetLifecycleStatus) {
        this.targetLifecycleStatus = targetLifecycleStatus.toString();
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
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getLifecycleStatus() != null)
            sb.append("LifecycleStatus: ").append(getLifecycleStatus()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getTargetLifecycleStatus() != null)
            sb.append("TargetLifecycleStatus: ").append(getTargetLifecycleStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerSessionSummary == false)
            return false;
        WorkerSessionSummary other = (WorkerSessionSummary) obj;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getLifecycleStatus() == null ^ this.getLifecycleStatus() == null)
            return false;
        if (other.getLifecycleStatus() != null && other.getLifecycleStatus().equals(this.getLifecycleStatus()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getTargetLifecycleStatus() == null ^ this.getTargetLifecycleStatus() == null)
            return false;
        if (other.getTargetLifecycleStatus() != null && other.getTargetLifecycleStatus().equals(this.getTargetLifecycleStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatus() == null) ? 0 : getLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getTargetLifecycleStatus() == null) ? 0 : getTargetLifecycleStatus().hashCode());
        return hashCode;
    }

    @Override
    public WorkerSessionSummary clone() {
        try {
            return (WorkerSessionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.WorkerSessionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
