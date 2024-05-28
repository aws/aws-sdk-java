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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of the related standby WorkSpaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StandbyWorkspacesProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StandbyWorkspacesProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the standby WorkSpace
     * </p>
     */
    private String standbyWorkspaceId;
    /**
     * <p>
     * Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * </p>
     */
    private String dataReplication;
    /**
     * <p>
     * The date and time at which the last successful snapshot was taken of the primary WorkSpace used for replicating
     * data.
     * </p>
     */
    private java.util.Date recoverySnapshotTime;

    /**
     * <p>
     * The identifier of the standby WorkSpace
     * </p>
     * 
     * @param standbyWorkspaceId
     *        The identifier of the standby WorkSpace
     */

    public void setStandbyWorkspaceId(String standbyWorkspaceId) {
        this.standbyWorkspaceId = standbyWorkspaceId;
    }

    /**
     * <p>
     * The identifier of the standby WorkSpace
     * </p>
     * 
     * @return The identifier of the standby WorkSpace
     */

    public String getStandbyWorkspaceId() {
        return this.standbyWorkspaceId;
    }

    /**
     * <p>
     * The identifier of the standby WorkSpace
     * </p>
     * 
     * @param standbyWorkspaceId
     *        The identifier of the standby WorkSpace
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandbyWorkspacesProperties withStandbyWorkspaceId(String standbyWorkspaceId) {
        setStandbyWorkspaceId(standbyWorkspaceId);
        return this;
    }

    /**
     * <p>
     * Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * </p>
     * 
     * @param dataReplication
     *        Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * @see DataReplication
     */

    public void setDataReplication(String dataReplication) {
        this.dataReplication = dataReplication;
    }

    /**
     * <p>
     * Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * </p>
     * 
     * @return Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * @see DataReplication
     */

    public String getDataReplication() {
        return this.dataReplication;
    }

    /**
     * <p>
     * Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * </p>
     * 
     * @param dataReplication
     *        Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplication
     */

    public StandbyWorkspacesProperties withDataReplication(String dataReplication) {
        setDataReplication(dataReplication);
        return this;
    }

    /**
     * <p>
     * Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * </p>
     * 
     * @param dataReplication
     *        Indicates whether data replication is enabled, and if enabled, the type of data replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplication
     */

    public StandbyWorkspacesProperties withDataReplication(DataReplication dataReplication) {
        this.dataReplication = dataReplication.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the last successful snapshot was taken of the primary WorkSpace used for replicating
     * data.
     * </p>
     * 
     * @param recoverySnapshotTime
     *        The date and time at which the last successful snapshot was taken of the primary WorkSpace used for
     *        replicating data.
     */

    public void setRecoverySnapshotTime(java.util.Date recoverySnapshotTime) {
        this.recoverySnapshotTime = recoverySnapshotTime;
    }

    /**
     * <p>
     * The date and time at which the last successful snapshot was taken of the primary WorkSpace used for replicating
     * data.
     * </p>
     * 
     * @return The date and time at which the last successful snapshot was taken of the primary WorkSpace used for
     *         replicating data.
     */

    public java.util.Date getRecoverySnapshotTime() {
        return this.recoverySnapshotTime;
    }

    /**
     * <p>
     * The date and time at which the last successful snapshot was taken of the primary WorkSpace used for replicating
     * data.
     * </p>
     * 
     * @param recoverySnapshotTime
     *        The date and time at which the last successful snapshot was taken of the primary WorkSpace used for
     *        replicating data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StandbyWorkspacesProperties withRecoverySnapshotTime(java.util.Date recoverySnapshotTime) {
        setRecoverySnapshotTime(recoverySnapshotTime);
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
        if (getStandbyWorkspaceId() != null)
            sb.append("StandbyWorkspaceId: ").append(getStandbyWorkspaceId()).append(",");
        if (getDataReplication() != null)
            sb.append("DataReplication: ").append(getDataReplication()).append(",");
        if (getRecoverySnapshotTime() != null)
            sb.append("RecoverySnapshotTime: ").append(getRecoverySnapshotTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StandbyWorkspacesProperties == false)
            return false;
        StandbyWorkspacesProperties other = (StandbyWorkspacesProperties) obj;
        if (other.getStandbyWorkspaceId() == null ^ this.getStandbyWorkspaceId() == null)
            return false;
        if (other.getStandbyWorkspaceId() != null && other.getStandbyWorkspaceId().equals(this.getStandbyWorkspaceId()) == false)
            return false;
        if (other.getDataReplication() == null ^ this.getDataReplication() == null)
            return false;
        if (other.getDataReplication() != null && other.getDataReplication().equals(this.getDataReplication()) == false)
            return false;
        if (other.getRecoverySnapshotTime() == null ^ this.getRecoverySnapshotTime() == null)
            return false;
        if (other.getRecoverySnapshotTime() != null && other.getRecoverySnapshotTime().equals(this.getRecoverySnapshotTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStandbyWorkspaceId() == null) ? 0 : getStandbyWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getDataReplication() == null) ? 0 : getDataReplication().hashCode());
        hashCode = prime * hashCode + ((getRecoverySnapshotTime() == null) ? 0 : getRecoverySnapshotTime().hashCode());
        return hashCode;
    }

    @Override
    public StandbyWorkspacesProperties clone() {
        try {
            return (StandbyWorkspacesProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.StandbyWorkspacesPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
