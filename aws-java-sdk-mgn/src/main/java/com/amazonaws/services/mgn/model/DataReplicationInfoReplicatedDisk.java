/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Request to query disks replicated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DataReplicationInfoReplicatedDisk"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReplicationInfoReplicatedDisk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request to query data replication backlog size in bytes.
     * </p>
     */
    private Long backloggedStorageBytes;
    /**
     * <p>
     * Request to query device name.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * Request to query amount of data replicated in bytes.
     * </p>
     */
    private Long replicatedStorageBytes;
    /**
     * <p>
     * Request to query amount of data rescanned in bytes.
     * </p>
     */
    private Long rescannedStorageBytes;
    /**
     * <p>
     * Request to query total amount of data replicated in bytes.
     * </p>
     */
    private Long totalStorageBytes;

    /**
     * <p>
     * Request to query data replication backlog size in bytes.
     * </p>
     * 
     * @param backloggedStorageBytes
     *        Request to query data replication backlog size in bytes.
     */

    public void setBackloggedStorageBytes(Long backloggedStorageBytes) {
        this.backloggedStorageBytes = backloggedStorageBytes;
    }

    /**
     * <p>
     * Request to query data replication backlog size in bytes.
     * </p>
     * 
     * @return Request to query data replication backlog size in bytes.
     */

    public Long getBackloggedStorageBytes() {
        return this.backloggedStorageBytes;
    }

    /**
     * <p>
     * Request to query data replication backlog size in bytes.
     * </p>
     * 
     * @param backloggedStorageBytes
     *        Request to query data replication backlog size in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfoReplicatedDisk withBackloggedStorageBytes(Long backloggedStorageBytes) {
        setBackloggedStorageBytes(backloggedStorageBytes);
        return this;
    }

    /**
     * <p>
     * Request to query device name.
     * </p>
     * 
     * @param deviceName
     *        Request to query device name.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * Request to query device name.
     * </p>
     * 
     * @return Request to query device name.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * Request to query device name.
     * </p>
     * 
     * @param deviceName
     *        Request to query device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfoReplicatedDisk withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * Request to query amount of data replicated in bytes.
     * </p>
     * 
     * @param replicatedStorageBytes
     *        Request to query amount of data replicated in bytes.
     */

    public void setReplicatedStorageBytes(Long replicatedStorageBytes) {
        this.replicatedStorageBytes = replicatedStorageBytes;
    }

    /**
     * <p>
     * Request to query amount of data replicated in bytes.
     * </p>
     * 
     * @return Request to query amount of data replicated in bytes.
     */

    public Long getReplicatedStorageBytes() {
        return this.replicatedStorageBytes;
    }

    /**
     * <p>
     * Request to query amount of data replicated in bytes.
     * </p>
     * 
     * @param replicatedStorageBytes
     *        Request to query amount of data replicated in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfoReplicatedDisk withReplicatedStorageBytes(Long replicatedStorageBytes) {
        setReplicatedStorageBytes(replicatedStorageBytes);
        return this;
    }

    /**
     * <p>
     * Request to query amount of data rescanned in bytes.
     * </p>
     * 
     * @param rescannedStorageBytes
     *        Request to query amount of data rescanned in bytes.
     */

    public void setRescannedStorageBytes(Long rescannedStorageBytes) {
        this.rescannedStorageBytes = rescannedStorageBytes;
    }

    /**
     * <p>
     * Request to query amount of data rescanned in bytes.
     * </p>
     * 
     * @return Request to query amount of data rescanned in bytes.
     */

    public Long getRescannedStorageBytes() {
        return this.rescannedStorageBytes;
    }

    /**
     * <p>
     * Request to query amount of data rescanned in bytes.
     * </p>
     * 
     * @param rescannedStorageBytes
     *        Request to query amount of data rescanned in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfoReplicatedDisk withRescannedStorageBytes(Long rescannedStorageBytes) {
        setRescannedStorageBytes(rescannedStorageBytes);
        return this;
    }

    /**
     * <p>
     * Request to query total amount of data replicated in bytes.
     * </p>
     * 
     * @param totalStorageBytes
     *        Request to query total amount of data replicated in bytes.
     */

    public void setTotalStorageBytes(Long totalStorageBytes) {
        this.totalStorageBytes = totalStorageBytes;
    }

    /**
     * <p>
     * Request to query total amount of data replicated in bytes.
     * </p>
     * 
     * @return Request to query total amount of data replicated in bytes.
     */

    public Long getTotalStorageBytes() {
        return this.totalStorageBytes;
    }

    /**
     * <p>
     * Request to query total amount of data replicated in bytes.
     * </p>
     * 
     * @param totalStorageBytes
     *        Request to query total amount of data replicated in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReplicationInfoReplicatedDisk withTotalStorageBytes(Long totalStorageBytes) {
        setTotalStorageBytes(totalStorageBytes);
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
        if (getBackloggedStorageBytes() != null)
            sb.append("BackloggedStorageBytes: ").append(getBackloggedStorageBytes()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getReplicatedStorageBytes() != null)
            sb.append("ReplicatedStorageBytes: ").append(getReplicatedStorageBytes()).append(",");
        if (getRescannedStorageBytes() != null)
            sb.append("RescannedStorageBytes: ").append(getRescannedStorageBytes()).append(",");
        if (getTotalStorageBytes() != null)
            sb.append("TotalStorageBytes: ").append(getTotalStorageBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataReplicationInfoReplicatedDisk == false)
            return false;
        DataReplicationInfoReplicatedDisk other = (DataReplicationInfoReplicatedDisk) obj;
        if (other.getBackloggedStorageBytes() == null ^ this.getBackloggedStorageBytes() == null)
            return false;
        if (other.getBackloggedStorageBytes() != null && other.getBackloggedStorageBytes().equals(this.getBackloggedStorageBytes()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getReplicatedStorageBytes() == null ^ this.getReplicatedStorageBytes() == null)
            return false;
        if (other.getReplicatedStorageBytes() != null && other.getReplicatedStorageBytes().equals(this.getReplicatedStorageBytes()) == false)
            return false;
        if (other.getRescannedStorageBytes() == null ^ this.getRescannedStorageBytes() == null)
            return false;
        if (other.getRescannedStorageBytes() != null && other.getRescannedStorageBytes().equals(this.getRescannedStorageBytes()) == false)
            return false;
        if (other.getTotalStorageBytes() == null ^ this.getTotalStorageBytes() == null)
            return false;
        if (other.getTotalStorageBytes() != null && other.getTotalStorageBytes().equals(this.getTotalStorageBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackloggedStorageBytes() == null) ? 0 : getBackloggedStorageBytes().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getReplicatedStorageBytes() == null) ? 0 : getReplicatedStorageBytes().hashCode());
        hashCode = prime * hashCode + ((getRescannedStorageBytes() == null) ? 0 : getRescannedStorageBytes().hashCode());
        hashCode = prime * hashCode + ((getTotalStorageBytes() == null) ? 0 : getTotalStorageBytes().hashCode());
        return hashCode;
    }

    @Override
    public DataReplicationInfoReplicatedDisk clone() {
        try {
            return (DataReplicationInfoReplicatedDisk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.DataReplicationInfoReplicatedDiskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
