/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Object representing a Replication Run
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ReplicationRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationRun implements Serializable, Cloneable, StructuredPojo {

    private String replicationRunId;

    private String state;

    private String type;

    private String statusMessage;

    private String amiId;

    private java.util.Date scheduledStartTime;

    private java.util.Date completedTime;

    private String description;

    /**
     * @param replicationRunId
     */

    public void setReplicationRunId(String replicationRunId) {
        this.replicationRunId = replicationRunId;
    }

    /**
     * @return
     */

    public String getReplicationRunId() {
        return this.replicationRunId;
    }

    /**
     * @param replicationRunId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withReplicationRunId(String replicationRunId) {
        setReplicationRunId(replicationRunId);
        return this;
    }

    /**
     * @param state
     * @see ReplicationRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see ReplicationRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunState
     */

    public ReplicationRun withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @see ReplicationRunState
     */

    public void setState(ReplicationRunState state) {
        withState(state);
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunState
     */

    public ReplicationRun withState(ReplicationRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * @param type
     * @see ReplicationRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     * @see ReplicationRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunType
     */

    public ReplicationRun withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param type
     * @see ReplicationRunType
     */

    public void setType(ReplicationRunType type) {
        withType(type);
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunType
     */

    public ReplicationRun withType(ReplicationRunType type) {
        this.type = type.toString();
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

    public ReplicationRun withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * @param amiId
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * @return
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * @param amiId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * @param scheduledStartTime
     */

    public void setScheduledStartTime(java.util.Date scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
    }

    /**
     * @return
     */

    public java.util.Date getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /**
     * @param scheduledStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withScheduledStartTime(java.util.Date scheduledStartTime) {
        setScheduledStartTime(scheduledStartTime);
        return this;
    }

    /**
     * @param completedTime
     */

    public void setCompletedTime(java.util.Date completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * @return
     */

    public java.util.Date getCompletedTime() {
        return this.completedTime;
    }

    /**
     * @param completedTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withCompletedTime(java.util.Date completedTime) {
        setCompletedTime(completedTime);
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

    public ReplicationRun withDescription(String description) {
        setDescription(description);
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
        if (getReplicationRunId() != null)
            sb.append("ReplicationRunId: ").append(getReplicationRunId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getScheduledStartTime() != null)
            sb.append("ScheduledStartTime: ").append(getScheduledStartTime()).append(",");
        if (getCompletedTime() != null)
            sb.append("CompletedTime: ").append(getCompletedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRun == false)
            return false;
        ReplicationRun other = (ReplicationRun) obj;
        if (other.getReplicationRunId() == null ^ this.getReplicationRunId() == null)
            return false;
        if (other.getReplicationRunId() != null && other.getReplicationRunId().equals(this.getReplicationRunId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getScheduledStartTime() == null ^ this.getScheduledStartTime() == null)
            return false;
        if (other.getScheduledStartTime() != null && other.getScheduledStartTime().equals(this.getScheduledStartTime()) == false)
            return false;
        if (other.getCompletedTime() == null ^ this.getCompletedTime() == null)
            return false;
        if (other.getCompletedTime() != null && other.getCompletedTime().equals(this.getCompletedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationRunId() == null) ? 0 : getReplicationRunId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getScheduledStartTime() == null) ? 0 : getScheduledStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletedTime() == null) ? 0 : getCompletedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationRun clone() {
        try {
            return (ReplicationRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ReplicationRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
