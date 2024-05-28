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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The fleet ID for the session.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Provides the Amazon EC2 properties of the host.
     * </p>
     */
    private HostPropertiesResponse hostProperties;
    /**
     * <p>
     * The life cycle status of the session.
     * </p>
     */
    private String lifecycleStatus;
    /**
     * <p>
     * The session log.
     * </p>
     */
    private LogConfiguration log;
    /**
     * <p>
     * The session ID.
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
     * The life cycle status with which the session started.
     * </p>
     */
    private String targetLifecycleStatus;
    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;
    /**
     * <p>
     * The worker ID for the session.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * The worker log for the session.
     * </p>
     */
    private LogConfiguration workerLog;

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

    public GetSessionResult withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The fleet ID for the session.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID for the session.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID for the session.
     * </p>
     * 
     * @return The fleet ID for the session.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID for the session.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Provides the Amazon EC2 properties of the host.
     * </p>
     * 
     * @param hostProperties
     *        Provides the Amazon EC2 properties of the host.
     */

    public void setHostProperties(HostPropertiesResponse hostProperties) {
        this.hostProperties = hostProperties;
    }

    /**
     * <p>
     * Provides the Amazon EC2 properties of the host.
     * </p>
     * 
     * @return Provides the Amazon EC2 properties of the host.
     */

    public HostPropertiesResponse getHostProperties() {
        return this.hostProperties;
    }

    /**
     * <p>
     * Provides the Amazon EC2 properties of the host.
     * </p>
     * 
     * @param hostProperties
     *        Provides the Amazon EC2 properties of the host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withHostProperties(HostPropertiesResponse hostProperties) {
        setHostProperties(hostProperties);
        return this;
    }

    /**
     * <p>
     * The life cycle status of the session.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status of the session.
     * @see SessionLifecycleStatus
     */

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status of the session.
     * </p>
     * 
     * @return The life cycle status of the session.
     * @see SessionLifecycleStatus
     */

    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status of the session.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleStatus
     */

    public GetSessionResult withLifecycleStatus(String lifecycleStatus) {
        setLifecycleStatus(lifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status of the session.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleStatus
     */

    public GetSessionResult withLifecycleStatus(SessionLifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The session log.
     * </p>
     * 
     * @param log
     *        The session log.
     */

    public void setLog(LogConfiguration log) {
        this.log = log;
    }

    /**
     * <p>
     * The session log.
     * </p>
     * 
     * @return The session log.
     */

    public LogConfiguration getLog() {
        return this.log;
    }

    /**
     * <p>
     * The session log.
     * </p>
     * 
     * @param log
     *        The session log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withLog(LogConfiguration log) {
        setLog(log);
        return this;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @return The session ID.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The session ID.
     * </p>
     * 
     * @param sessionId
     *        The session ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withSessionId(String sessionId) {
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

    public GetSessionResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The life cycle status with which the session started.
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status with which the session started.
     * @see SessionLifecycleTargetStatus
     */

    public void setTargetLifecycleStatus(String targetLifecycleStatus) {
        this.targetLifecycleStatus = targetLifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status with which the session started.
     * </p>
     * 
     * @return The life cycle status with which the session started.
     * @see SessionLifecycleTargetStatus
     */

    public String getTargetLifecycleStatus() {
        return this.targetLifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status with which the session started.
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status with which the session started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleTargetStatus
     */

    public GetSessionResult withTargetLifecycleStatus(String targetLifecycleStatus) {
        setTargetLifecycleStatus(targetLifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status with which the session started.
     * </p>
     * 
     * @param targetLifecycleStatus
     *        The life cycle status with which the session started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SessionLifecycleTargetStatus
     */

    public GetSessionResult withTargetLifecycleStatus(SessionLifecycleTargetStatus targetLifecycleStatus) {
        this.targetLifecycleStatus = targetLifecycleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    /**
     * <p>
     * The worker ID for the session.
     * </p>
     * 
     * @param workerId
     *        The worker ID for the session.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The worker ID for the session.
     * </p>
     * 
     * @return The worker ID for the session.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The worker ID for the session.
     * </p>
     * 
     * @param workerId
     *        The worker ID for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * The worker log for the session.
     * </p>
     * 
     * @param workerLog
     *        The worker log for the session.
     */

    public void setWorkerLog(LogConfiguration workerLog) {
        this.workerLog = workerLog;
    }

    /**
     * <p>
     * The worker log for the session.
     * </p>
     * 
     * @return The worker log for the session.
     */

    public LogConfiguration getWorkerLog() {
        return this.workerLog;
    }

    /**
     * <p>
     * The worker log for the session.
     * </p>
     * 
     * @param workerLog
     *        The worker log for the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSessionResult withWorkerLog(LogConfiguration workerLog) {
        setWorkerLog(workerLog);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getHostProperties() != null)
            sb.append("HostProperties: ").append(getHostProperties()).append(",");
        if (getLifecycleStatus() != null)
            sb.append("LifecycleStatus: ").append(getLifecycleStatus()).append(",");
        if (getLog() != null)
            sb.append("Log: ").append(getLog()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getTargetLifecycleStatus() != null)
            sb.append("TargetLifecycleStatus: ").append(getTargetLifecycleStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getWorkerLog() != null)
            sb.append("WorkerLog: ").append(getWorkerLog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSessionResult == false)
            return false;
        GetSessionResult other = (GetSessionResult) obj;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getHostProperties() == null ^ this.getHostProperties() == null)
            return false;
        if (other.getHostProperties() != null && other.getHostProperties().equals(this.getHostProperties()) == false)
            return false;
        if (other.getLifecycleStatus() == null ^ this.getLifecycleStatus() == null)
            return false;
        if (other.getLifecycleStatus() != null && other.getLifecycleStatus().equals(this.getLifecycleStatus()) == false)
            return false;
        if (other.getLog() == null ^ this.getLog() == null)
            return false;
        if (other.getLog() != null && other.getLog().equals(this.getLog()) == false)
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
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getWorkerLog() == null ^ this.getWorkerLog() == null)
            return false;
        if (other.getWorkerLog() != null && other.getWorkerLog().equals(this.getWorkerLog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getHostProperties() == null) ? 0 : getHostProperties().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatus() == null) ? 0 : getLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getLog() == null) ? 0 : getLog().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getTargetLifecycleStatus() == null) ? 0 : getTargetLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getWorkerLog() == null) ? 0 : getWorkerLog().hashCode());
        return hashCode;
    }

    @Override
    public GetSessionResult clone() {
        try {
            return (GetSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
