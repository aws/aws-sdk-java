/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a backup of an AWS CloudHSM cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/Backup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Backup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * The state of the backup.
     * </p>
     */
    private String backupState;
    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     */
    private java.util.Date createTimestamp;

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     * 
     * @param backupId
     *        The identifier (ID) of the backup.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     * 
     * @return The identifier (ID) of the backup.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup.
     * </p>
     * 
     * @param backupId
     *        The identifier (ID) of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @param backupState
     *        The state of the backup.
     * @see BackupState
     */

    public void setBackupState(String backupState) {
        this.backupState = backupState;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @return The state of the backup.
     * @see BackupState
     */

    public String getBackupState() {
        return this.backupState;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @param backupState
     *        The state of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupState
     */

    public Backup withBackupState(String backupState) {
        setBackupState(backupState);
        return this;
    }

    /**
     * <p>
     * The state of the backup.
     * </p>
     * 
     * @param backupState
     *        The state of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupState
     */

    public Backup withBackupState(BackupState backupState) {
        this.backupState = backupState.toString();
        return this;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that was backed up.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     * 
     * @return The identifier (ID) of the cluster that was backed up.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The identifier (ID) of the cluster that was backed up.
     * </p>
     * 
     * @param clusterId
     *        The identifier (ID) of the cluster that was backed up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the backup was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     * 
     * @return The date and time when the backup was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The date and time when the backup was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Backup withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getBackupState() != null)
            sb.append("BackupState: ").append(getBackupState()).append(",");
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Backup == false)
            return false;
        Backup other = (Backup) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getBackupState() == null ^ this.getBackupState() == null)
            return false;
        if (other.getBackupState() != null && other.getBackupState().equals(this.getBackupState()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getBackupState() == null) ? 0 : getBackupState().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Backup clone() {
        try {
            return (Backup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudhsmv2.model.transform.BackupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
