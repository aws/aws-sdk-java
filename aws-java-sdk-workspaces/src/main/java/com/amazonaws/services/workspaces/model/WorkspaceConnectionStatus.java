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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the connection status of a WorkSpace.
 * </p>
 */
public class WorkspaceConnectionStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * </p>
     */
    private String connectionState;
    /**
     * <p>
     * The timestamp of the connection state check.
     * </p>
     */
    private java.util.Date connectionStateCheckTimestamp;
    /**
     * <p>
     * The timestamp of the last known user connection.
     * </p>
     */
    private java.util.Date lastKnownUserConnectionTimestamp;

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @return The ID of the WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceConnectionStatus withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * </p>
     * 
     * @param connectionState
     *        The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * @see ConnectionState
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * </p>
     * 
     * @return The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * @see ConnectionState
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * <p>
     * The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * </p>
     * 
     * @param connectionState
     *        The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public WorkspaceConnectionStatus withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * </p>
     * 
     * @param connectionState
     *        The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * @see ConnectionState
     */

    public void setConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
    }

    /**
     * <p>
     * The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * </p>
     * 
     * @param connectionState
     *        The connection state of the WorkSpace. Returns UNKOWN if the WorkSpace is in a Stopped state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public WorkspaceConnectionStatus withConnectionState(ConnectionState connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * The timestamp of the connection state check.
     * </p>
     * 
     * @param connectionStateCheckTimestamp
     *        The timestamp of the connection state check.
     */

    public void setConnectionStateCheckTimestamp(java.util.Date connectionStateCheckTimestamp) {
        this.connectionStateCheckTimestamp = connectionStateCheckTimestamp;
    }

    /**
     * <p>
     * The timestamp of the connection state check.
     * </p>
     * 
     * @return The timestamp of the connection state check.
     */

    public java.util.Date getConnectionStateCheckTimestamp() {
        return this.connectionStateCheckTimestamp;
    }

    /**
     * <p>
     * The timestamp of the connection state check.
     * </p>
     * 
     * @param connectionStateCheckTimestamp
     *        The timestamp of the connection state check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceConnectionStatus withConnectionStateCheckTimestamp(java.util.Date connectionStateCheckTimestamp) {
        setConnectionStateCheckTimestamp(connectionStateCheckTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last known user connection.
     * </p>
     * 
     * @param lastKnownUserConnectionTimestamp
     *        The timestamp of the last known user connection.
     */

    public void setLastKnownUserConnectionTimestamp(java.util.Date lastKnownUserConnectionTimestamp) {
        this.lastKnownUserConnectionTimestamp = lastKnownUserConnectionTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last known user connection.
     * </p>
     * 
     * @return The timestamp of the last known user connection.
     */

    public java.util.Date getLastKnownUserConnectionTimestamp() {
        return this.lastKnownUserConnectionTimestamp;
    }

    /**
     * <p>
     * The timestamp of the last known user connection.
     * </p>
     * 
     * @param lastKnownUserConnectionTimestamp
     *        The timestamp of the last known user connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceConnectionStatus withLastKnownUserConnectionTimestamp(java.util.Date lastKnownUserConnectionTimestamp) {
        setLastKnownUserConnectionTimestamp(lastKnownUserConnectionTimestamp);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: " + getWorkspaceId() + ",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: " + getConnectionState() + ",");
        if (getConnectionStateCheckTimestamp() != null)
            sb.append("ConnectionStateCheckTimestamp: " + getConnectionStateCheckTimestamp() + ",");
        if (getLastKnownUserConnectionTimestamp() != null)
            sb.append("LastKnownUserConnectionTimestamp: " + getLastKnownUserConnectionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceConnectionStatus == false)
            return false;
        WorkspaceConnectionStatus other = (WorkspaceConnectionStatus) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getConnectionStateCheckTimestamp() == null ^ this.getConnectionStateCheckTimestamp() == null)
            return false;
        if (other.getConnectionStateCheckTimestamp() != null
                && other.getConnectionStateCheckTimestamp().equals(this.getConnectionStateCheckTimestamp()) == false)
            return false;
        if (other.getLastKnownUserConnectionTimestamp() == null ^ this.getLastKnownUserConnectionTimestamp() == null)
            return false;
        if (other.getLastKnownUserConnectionTimestamp() != null
                && other.getLastKnownUserConnectionTimestamp().equals(this.getLastKnownUserConnectionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getConnectionStateCheckTimestamp() == null) ? 0 : getConnectionStateCheckTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastKnownUserConnectionTimestamp() == null) ? 0 : getLastKnownUserConnectionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceConnectionStatus clone() {
        try {
            return (WorkspaceConnectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
