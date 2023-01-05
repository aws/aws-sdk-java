/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing failback related information of the Recovery Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RecoveryInstanceFailback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceFailback implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the agent on the Recovery Instance was last seen by the service.
     * </p>
     */
    private String agentLastSeenByServiceDateTime;
    /**
     * <p>
     * The amount of time that the Recovery Instance has been replicating for.
     * </p>
     */
    private String elapsedReplicationDuration;
    /**
     * <p>
     * The ID of the failback client that this Recovery Instance is associated with.
     * </p>
     */
    private String failbackClientID;
    /**
     * <p>
     * The date and time that the failback client was last seen by the service.
     * </p>
     */
    private String failbackClientLastSeenByServiceDateTime;
    /**
     * <p>
     * The date and time that the failback initiation started.
     * </p>
     */
    private String failbackInitiationTime;
    /**
     * <p>
     * The Job ID of the last failback log for this Recovery Instance.
     * </p>
     */
    private String failbackJobID;
    /**
     * <p>
     * The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery instance.
     * </p>
     */
    private String failbackLaunchType;
    /**
     * <p>
     * Whether we are failing back to the original Source Server for this Recovery Instance.
     * </p>
     */
    private Boolean failbackToOriginalServer;
    /**
     * <p>
     * The date and time of the first byte that was replicated from the Recovery Instance.
     * </p>
     */
    private String firstByteDateTime;
    /**
     * <p>
     * The state of the failback process that this Recovery Instance is in.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The date and time the agent on the Recovery Instance was last seen by the service.
     * </p>
     * 
     * @param agentLastSeenByServiceDateTime
     *        The date and time the agent on the Recovery Instance was last seen by the service.
     */

    public void setAgentLastSeenByServiceDateTime(String agentLastSeenByServiceDateTime) {
        this.agentLastSeenByServiceDateTime = agentLastSeenByServiceDateTime;
    }

    /**
     * <p>
     * The date and time the agent on the Recovery Instance was last seen by the service.
     * </p>
     * 
     * @return The date and time the agent on the Recovery Instance was last seen by the service.
     */

    public String getAgentLastSeenByServiceDateTime() {
        return this.agentLastSeenByServiceDateTime;
    }

    /**
     * <p>
     * The date and time the agent on the Recovery Instance was last seen by the service.
     * </p>
     * 
     * @param agentLastSeenByServiceDateTime
     *        The date and time the agent on the Recovery Instance was last seen by the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withAgentLastSeenByServiceDateTime(String agentLastSeenByServiceDateTime) {
        setAgentLastSeenByServiceDateTime(agentLastSeenByServiceDateTime);
        return this;
    }

    /**
     * <p>
     * The amount of time that the Recovery Instance has been replicating for.
     * </p>
     * 
     * @param elapsedReplicationDuration
     *        The amount of time that the Recovery Instance has been replicating for.
     */

    public void setElapsedReplicationDuration(String elapsedReplicationDuration) {
        this.elapsedReplicationDuration = elapsedReplicationDuration;
    }

    /**
     * <p>
     * The amount of time that the Recovery Instance has been replicating for.
     * </p>
     * 
     * @return The amount of time that the Recovery Instance has been replicating for.
     */

    public String getElapsedReplicationDuration() {
        return this.elapsedReplicationDuration;
    }

    /**
     * <p>
     * The amount of time that the Recovery Instance has been replicating for.
     * </p>
     * 
     * @param elapsedReplicationDuration
     *        The amount of time that the Recovery Instance has been replicating for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withElapsedReplicationDuration(String elapsedReplicationDuration) {
        setElapsedReplicationDuration(elapsedReplicationDuration);
        return this;
    }

    /**
     * <p>
     * The ID of the failback client that this Recovery Instance is associated with.
     * </p>
     * 
     * @param failbackClientID
     *        The ID of the failback client that this Recovery Instance is associated with.
     */

    public void setFailbackClientID(String failbackClientID) {
        this.failbackClientID = failbackClientID;
    }

    /**
     * <p>
     * The ID of the failback client that this Recovery Instance is associated with.
     * </p>
     * 
     * @return The ID of the failback client that this Recovery Instance is associated with.
     */

    public String getFailbackClientID() {
        return this.failbackClientID;
    }

    /**
     * <p>
     * The ID of the failback client that this Recovery Instance is associated with.
     * </p>
     * 
     * @param failbackClientID
     *        The ID of the failback client that this Recovery Instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withFailbackClientID(String failbackClientID) {
        setFailbackClientID(failbackClientID);
        return this;
    }

    /**
     * <p>
     * The date and time that the failback client was last seen by the service.
     * </p>
     * 
     * @param failbackClientLastSeenByServiceDateTime
     *        The date and time that the failback client was last seen by the service.
     */

    public void setFailbackClientLastSeenByServiceDateTime(String failbackClientLastSeenByServiceDateTime) {
        this.failbackClientLastSeenByServiceDateTime = failbackClientLastSeenByServiceDateTime;
    }

    /**
     * <p>
     * The date and time that the failback client was last seen by the service.
     * </p>
     * 
     * @return The date and time that the failback client was last seen by the service.
     */

    public String getFailbackClientLastSeenByServiceDateTime() {
        return this.failbackClientLastSeenByServiceDateTime;
    }

    /**
     * <p>
     * The date and time that the failback client was last seen by the service.
     * </p>
     * 
     * @param failbackClientLastSeenByServiceDateTime
     *        The date and time that the failback client was last seen by the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withFailbackClientLastSeenByServiceDateTime(String failbackClientLastSeenByServiceDateTime) {
        setFailbackClientLastSeenByServiceDateTime(failbackClientLastSeenByServiceDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the failback initiation started.
     * </p>
     * 
     * @param failbackInitiationTime
     *        The date and time that the failback initiation started.
     */

    public void setFailbackInitiationTime(String failbackInitiationTime) {
        this.failbackInitiationTime = failbackInitiationTime;
    }

    /**
     * <p>
     * The date and time that the failback initiation started.
     * </p>
     * 
     * @return The date and time that the failback initiation started.
     */

    public String getFailbackInitiationTime() {
        return this.failbackInitiationTime;
    }

    /**
     * <p>
     * The date and time that the failback initiation started.
     * </p>
     * 
     * @param failbackInitiationTime
     *        The date and time that the failback initiation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withFailbackInitiationTime(String failbackInitiationTime) {
        setFailbackInitiationTime(failbackInitiationTime);
        return this;
    }

    /**
     * <p>
     * The Job ID of the last failback log for this Recovery Instance.
     * </p>
     * 
     * @param failbackJobID
     *        The Job ID of the last failback log for this Recovery Instance.
     */

    public void setFailbackJobID(String failbackJobID) {
        this.failbackJobID = failbackJobID;
    }

    /**
     * <p>
     * The Job ID of the last failback log for this Recovery Instance.
     * </p>
     * 
     * @return The Job ID of the last failback log for this Recovery Instance.
     */

    public String getFailbackJobID() {
        return this.failbackJobID;
    }

    /**
     * <p>
     * The Job ID of the last failback log for this Recovery Instance.
     * </p>
     * 
     * @param failbackJobID
     *        The Job ID of the last failback log for this Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withFailbackJobID(String failbackJobID) {
        setFailbackJobID(failbackJobID);
        return this;
    }

    /**
     * <p>
     * The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery instance.
     * </p>
     * 
     * @param failbackLaunchType
     *        The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery
     *        instance.
     * @see FailbackLaunchType
     */

    public void setFailbackLaunchType(String failbackLaunchType) {
        this.failbackLaunchType = failbackLaunchType;
    }

    /**
     * <p>
     * The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery instance.
     * </p>
     * 
     * @return The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery
     *         instance.
     * @see FailbackLaunchType
     */

    public String getFailbackLaunchType() {
        return this.failbackLaunchType;
    }

    /**
     * <p>
     * The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery instance.
     * </p>
     * 
     * @param failbackLaunchType
     *        The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailbackLaunchType
     */

    public RecoveryInstanceFailback withFailbackLaunchType(String failbackLaunchType) {
        setFailbackLaunchType(failbackLaunchType);
        return this;
    }

    /**
     * <p>
     * The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery instance.
     * </p>
     * 
     * @param failbackLaunchType
     *        The launch type (Recovery / Drill) of the last launch for the failback replication of this recovery
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailbackLaunchType
     */

    public RecoveryInstanceFailback withFailbackLaunchType(FailbackLaunchType failbackLaunchType) {
        this.failbackLaunchType = failbackLaunchType.toString();
        return this;
    }

    /**
     * <p>
     * Whether we are failing back to the original Source Server for this Recovery Instance.
     * </p>
     * 
     * @param failbackToOriginalServer
     *        Whether we are failing back to the original Source Server for this Recovery Instance.
     */

    public void setFailbackToOriginalServer(Boolean failbackToOriginalServer) {
        this.failbackToOriginalServer = failbackToOriginalServer;
    }

    /**
     * <p>
     * Whether we are failing back to the original Source Server for this Recovery Instance.
     * </p>
     * 
     * @return Whether we are failing back to the original Source Server for this Recovery Instance.
     */

    public Boolean getFailbackToOriginalServer() {
        return this.failbackToOriginalServer;
    }

    /**
     * <p>
     * Whether we are failing back to the original Source Server for this Recovery Instance.
     * </p>
     * 
     * @param failbackToOriginalServer
     *        Whether we are failing back to the original Source Server for this Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withFailbackToOriginalServer(Boolean failbackToOriginalServer) {
        setFailbackToOriginalServer(failbackToOriginalServer);
        return this;
    }

    /**
     * <p>
     * Whether we are failing back to the original Source Server for this Recovery Instance.
     * </p>
     * 
     * @return Whether we are failing back to the original Source Server for this Recovery Instance.
     */

    public Boolean isFailbackToOriginalServer() {
        return this.failbackToOriginalServer;
    }

    /**
     * <p>
     * The date and time of the first byte that was replicated from the Recovery Instance.
     * </p>
     * 
     * @param firstByteDateTime
     *        The date and time of the first byte that was replicated from the Recovery Instance.
     */

    public void setFirstByteDateTime(String firstByteDateTime) {
        this.firstByteDateTime = firstByteDateTime;
    }

    /**
     * <p>
     * The date and time of the first byte that was replicated from the Recovery Instance.
     * </p>
     * 
     * @return The date and time of the first byte that was replicated from the Recovery Instance.
     */

    public String getFirstByteDateTime() {
        return this.firstByteDateTime;
    }

    /**
     * <p>
     * The date and time of the first byte that was replicated from the Recovery Instance.
     * </p>
     * 
     * @param firstByteDateTime
     *        The date and time of the first byte that was replicated from the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstanceFailback withFirstByteDateTime(String firstByteDateTime) {
        setFirstByteDateTime(firstByteDateTime);
        return this;
    }

    /**
     * <p>
     * The state of the failback process that this Recovery Instance is in.
     * </p>
     * 
     * @param state
     *        The state of the failback process that this Recovery Instance is in.
     * @see FailbackState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the failback process that this Recovery Instance is in.
     * </p>
     * 
     * @return The state of the failback process that this Recovery Instance is in.
     * @see FailbackState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the failback process that this Recovery Instance is in.
     * </p>
     * 
     * @param state
     *        The state of the failback process that this Recovery Instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailbackState
     */

    public RecoveryInstanceFailback withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the failback process that this Recovery Instance is in.
     * </p>
     * 
     * @param state
     *        The state of the failback process that this Recovery Instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailbackState
     */

    public RecoveryInstanceFailback withState(FailbackState state) {
        this.state = state.toString();
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
        if (getAgentLastSeenByServiceDateTime() != null)
            sb.append("AgentLastSeenByServiceDateTime: ").append(getAgentLastSeenByServiceDateTime()).append(",");
        if (getElapsedReplicationDuration() != null)
            sb.append("ElapsedReplicationDuration: ").append(getElapsedReplicationDuration()).append(",");
        if (getFailbackClientID() != null)
            sb.append("FailbackClientID: ").append(getFailbackClientID()).append(",");
        if (getFailbackClientLastSeenByServiceDateTime() != null)
            sb.append("FailbackClientLastSeenByServiceDateTime: ").append(getFailbackClientLastSeenByServiceDateTime()).append(",");
        if (getFailbackInitiationTime() != null)
            sb.append("FailbackInitiationTime: ").append(getFailbackInitiationTime()).append(",");
        if (getFailbackJobID() != null)
            sb.append("FailbackJobID: ").append(getFailbackJobID()).append(",");
        if (getFailbackLaunchType() != null)
            sb.append("FailbackLaunchType: ").append(getFailbackLaunchType()).append(",");
        if (getFailbackToOriginalServer() != null)
            sb.append("FailbackToOriginalServer: ").append(getFailbackToOriginalServer()).append(",");
        if (getFirstByteDateTime() != null)
            sb.append("FirstByteDateTime: ").append(getFirstByteDateTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryInstanceFailback == false)
            return false;
        RecoveryInstanceFailback other = (RecoveryInstanceFailback) obj;
        if (other.getAgentLastSeenByServiceDateTime() == null ^ this.getAgentLastSeenByServiceDateTime() == null)
            return false;
        if (other.getAgentLastSeenByServiceDateTime() != null
                && other.getAgentLastSeenByServiceDateTime().equals(this.getAgentLastSeenByServiceDateTime()) == false)
            return false;
        if (other.getElapsedReplicationDuration() == null ^ this.getElapsedReplicationDuration() == null)
            return false;
        if (other.getElapsedReplicationDuration() != null && other.getElapsedReplicationDuration().equals(this.getElapsedReplicationDuration()) == false)
            return false;
        if (other.getFailbackClientID() == null ^ this.getFailbackClientID() == null)
            return false;
        if (other.getFailbackClientID() != null && other.getFailbackClientID().equals(this.getFailbackClientID()) == false)
            return false;
        if (other.getFailbackClientLastSeenByServiceDateTime() == null ^ this.getFailbackClientLastSeenByServiceDateTime() == null)
            return false;
        if (other.getFailbackClientLastSeenByServiceDateTime() != null
                && other.getFailbackClientLastSeenByServiceDateTime().equals(this.getFailbackClientLastSeenByServiceDateTime()) == false)
            return false;
        if (other.getFailbackInitiationTime() == null ^ this.getFailbackInitiationTime() == null)
            return false;
        if (other.getFailbackInitiationTime() != null && other.getFailbackInitiationTime().equals(this.getFailbackInitiationTime()) == false)
            return false;
        if (other.getFailbackJobID() == null ^ this.getFailbackJobID() == null)
            return false;
        if (other.getFailbackJobID() != null && other.getFailbackJobID().equals(this.getFailbackJobID()) == false)
            return false;
        if (other.getFailbackLaunchType() == null ^ this.getFailbackLaunchType() == null)
            return false;
        if (other.getFailbackLaunchType() != null && other.getFailbackLaunchType().equals(this.getFailbackLaunchType()) == false)
            return false;
        if (other.getFailbackToOriginalServer() == null ^ this.getFailbackToOriginalServer() == null)
            return false;
        if (other.getFailbackToOriginalServer() != null && other.getFailbackToOriginalServer().equals(this.getFailbackToOriginalServer()) == false)
            return false;
        if (other.getFirstByteDateTime() == null ^ this.getFirstByteDateTime() == null)
            return false;
        if (other.getFirstByteDateTime() != null && other.getFirstByteDateTime().equals(this.getFirstByteDateTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentLastSeenByServiceDateTime() == null) ? 0 : getAgentLastSeenByServiceDateTime().hashCode());
        hashCode = prime * hashCode + ((getElapsedReplicationDuration() == null) ? 0 : getElapsedReplicationDuration().hashCode());
        hashCode = prime * hashCode + ((getFailbackClientID() == null) ? 0 : getFailbackClientID().hashCode());
        hashCode = prime * hashCode + ((getFailbackClientLastSeenByServiceDateTime() == null) ? 0 : getFailbackClientLastSeenByServiceDateTime().hashCode());
        hashCode = prime * hashCode + ((getFailbackInitiationTime() == null) ? 0 : getFailbackInitiationTime().hashCode());
        hashCode = prime * hashCode + ((getFailbackJobID() == null) ? 0 : getFailbackJobID().hashCode());
        hashCode = prime * hashCode + ((getFailbackLaunchType() == null) ? 0 : getFailbackLaunchType().hashCode());
        hashCode = prime * hashCode + ((getFailbackToOriginalServer() == null) ? 0 : getFailbackToOriginalServer().hashCode());
        hashCode = prime * hashCode + ((getFirstByteDateTime() == null) ? 0 : getFirstByteDateTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryInstanceFailback clone() {
        try {
            return (RecoveryInstanceFailback) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.RecoveryInstanceFailbackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
