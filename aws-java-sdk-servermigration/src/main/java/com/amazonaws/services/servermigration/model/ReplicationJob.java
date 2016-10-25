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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;

/**
 * Object representing a Replication Job
 */
public class ReplicationJob implements Serializable, Cloneable {

    private String replicationJobId;

    private String serverId;

    private String serverType;

    private VmServer vmServer;

    private java.util.Date seedReplicationTime;

    private Integer frequency;

    private java.util.Date nextReplicationRunStartTime;

    private String licenseType;

    private String roleName;

    private String latestAmiId;

    private String state;

    private String statusMessage;

    private String description;

    private java.util.List<ReplicationRun> replicationRunList;

    /**
     * @param replicationJobId
     */

    public void setReplicationJobId(String replicationJobId) {
        this.replicationJobId = replicationJobId;
    }

    /**
     * @return
     */

    public String getReplicationJobId() {
        return this.replicationJobId;
    }

    /**
     * @param replicationJobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withReplicationJobId(String replicationJobId) {
        setReplicationJobId(replicationJobId);
        return this;
    }

    /**
     * @param serverId
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * @return
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * @param serverId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * @param serverType
     * @see ServerType
     */

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * @return
     * @see ServerType
     */

    public String getServerType() {
        return this.serverType;
    }

    /**
     * @param serverType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public ReplicationJob withServerType(String serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * @param serverType
     * @see ServerType
     */

    public void setServerType(ServerType serverType) {
        this.serverType = serverType.toString();
    }

    /**
     * @param serverType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public ReplicationJob withServerType(ServerType serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * @param vmServer
     */

    public void setVmServer(VmServer vmServer) {
        this.vmServer = vmServer;
    }

    /**
     * @return
     */

    public VmServer getVmServer() {
        return this.vmServer;
    }

    /**
     * @param vmServer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withVmServer(VmServer vmServer) {
        setVmServer(vmServer);
        return this;
    }

    /**
     * @param seedReplicationTime
     */

    public void setSeedReplicationTime(java.util.Date seedReplicationTime) {
        this.seedReplicationTime = seedReplicationTime;
    }

    /**
     * @return
     */

    public java.util.Date getSeedReplicationTime() {
        return this.seedReplicationTime;
    }

    /**
     * @param seedReplicationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withSeedReplicationTime(java.util.Date seedReplicationTime) {
        setSeedReplicationTime(seedReplicationTime);
        return this;
    }

    /**
     * @param frequency
     */

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * @return
     */

    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * @param frequency
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withFrequency(Integer frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * @param nextReplicationRunStartTime
     */

    public void setNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        this.nextReplicationRunStartTime = nextReplicationRunStartTime;
    }

    /**
     * @return
     */

    public java.util.Date getNextReplicationRunStartTime() {
        return this.nextReplicationRunStartTime;
    }

    /**
     * @param nextReplicationRunStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        setNextReplicationRunStartTime(nextReplicationRunStartTime);
        return this;
    }

    /**
     * @param licenseType
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * @return
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * @param licenseType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public ReplicationJob withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * @param licenseType
     * @see LicenseType
     */

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
    }

    /**
     * @param licenseType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public ReplicationJob withLicenseType(LicenseType licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * @param roleName
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @param roleName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * @param latestAmiId
     */

    public void setLatestAmiId(String latestAmiId) {
        this.latestAmiId = latestAmiId;
    }

    /**
     * @return
     */

    public String getLatestAmiId() {
        return this.latestAmiId;
    }

    /**
     * @param latestAmiId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withLatestAmiId(String latestAmiId) {
        setLatestAmiId(latestAmiId);
        return this;
    }

    /**
     * @param state
     * @see ReplicationJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see ReplicationJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationJobState
     */

    public ReplicationJob withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @see ReplicationJobState
     */

    public void setState(ReplicationJobState state) {
        this.state = state.toString();
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationJobState
     */

    public ReplicationJob withState(ReplicationJobState state) {
        setState(state);
        return this;
    }

    /**
     * @param statusMessage
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * @return
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * @param statusMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ReplicationRun> getReplicationRunList() {
        return replicationRunList;
    }

    /**
     * @param replicationRunList
     */

    public void setReplicationRunList(java.util.Collection<ReplicationRun> replicationRunList) {
        if (replicationRunList == null) {
            this.replicationRunList = null;
            return;
        }

        this.replicationRunList = new java.util.ArrayList<ReplicationRun>(replicationRunList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationRunList(java.util.Collection)} or {@link #withReplicationRunList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationRunList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withReplicationRunList(ReplicationRun... replicationRunList) {
        if (this.replicationRunList == null) {
            setReplicationRunList(new java.util.ArrayList<ReplicationRun>(replicationRunList.length));
        }
        for (ReplicationRun ele : replicationRunList) {
            this.replicationRunList.add(ele);
        }
        return this;
    }

    /**
     * @param replicationRunList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withReplicationRunList(java.util.Collection<ReplicationRun> replicationRunList) {
        setReplicationRunList(replicationRunList);
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
        if (getReplicationJobId() != null)
            sb.append("ReplicationJobId: " + getReplicationJobId() + ",");
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getServerType() != null)
            sb.append("ServerType: " + getServerType() + ",");
        if (getVmServer() != null)
            sb.append("VmServer: " + getVmServer() + ",");
        if (getSeedReplicationTime() != null)
            sb.append("SeedReplicationTime: " + getSeedReplicationTime() + ",");
        if (getFrequency() != null)
            sb.append("Frequency: " + getFrequency() + ",");
        if (getNextReplicationRunStartTime() != null)
            sb.append("NextReplicationRunStartTime: " + getNextReplicationRunStartTime() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getLatestAmiId() != null)
            sb.append("LatestAmiId: " + getLatestAmiId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getReplicationRunList() != null)
            sb.append("ReplicationRunList: " + getReplicationRunList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationJob == false)
            return false;
        ReplicationJob other = (ReplicationJob) obj;
        if (other.getReplicationJobId() == null ^ this.getReplicationJobId() == null)
            return false;
        if (other.getReplicationJobId() != null && other.getReplicationJobId().equals(this.getReplicationJobId()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getServerType() == null ^ this.getServerType() == null)
            return false;
        if (other.getServerType() != null && other.getServerType().equals(this.getServerType()) == false)
            return false;
        if (other.getVmServer() == null ^ this.getVmServer() == null)
            return false;
        if (other.getVmServer() != null && other.getVmServer().equals(this.getVmServer()) == false)
            return false;
        if (other.getSeedReplicationTime() == null ^ this.getSeedReplicationTime() == null)
            return false;
        if (other.getSeedReplicationTime() != null && other.getSeedReplicationTime().equals(this.getSeedReplicationTime()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getNextReplicationRunStartTime() == null ^ this.getNextReplicationRunStartTime() == null)
            return false;
        if (other.getNextReplicationRunStartTime() != null && other.getNextReplicationRunStartTime().equals(this.getNextReplicationRunStartTime()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getLatestAmiId() == null ^ this.getLatestAmiId() == null)
            return false;
        if (other.getLatestAmiId() != null && other.getLatestAmiId().equals(this.getLatestAmiId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReplicationRunList() == null ^ this.getReplicationRunList() == null)
            return false;
        if (other.getReplicationRunList() != null && other.getReplicationRunList().equals(this.getReplicationRunList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationJobId() == null) ? 0 : getReplicationJobId().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getVmServer() == null) ? 0 : getVmServer().hashCode());
        hashCode = prime * hashCode + ((getSeedReplicationTime() == null) ? 0 : getSeedReplicationTime().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getNextReplicationRunStartTime() == null) ? 0 : getNextReplicationRunStartTime().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getLatestAmiId() == null) ? 0 : getLatestAmiId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReplicationRunList() == null) ? 0 : getReplicationRunList().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationJob clone() {
        try {
            return (ReplicationJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
