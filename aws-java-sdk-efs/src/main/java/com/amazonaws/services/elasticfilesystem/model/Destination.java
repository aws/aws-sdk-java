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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the destination file system in the replication configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     * destination file system in the replication configuration is in a failed state and is unrecoverable. To access the
     * file system data, restore a backup of the failed file system to a new file system.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of the destination Amazon EFS file system.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The Amazon Web Services Region in which the destination file system is located.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The time when the most recent sync was successfully completed on the destination file system. Any changes to data
     * on the source file system that occurred before this time have been successfully replicated to the destination
     * file system. Any changes that occurred after this time might not be fully replicated.
     * </p>
     */
    private java.util.Date lastReplicatedTimestamp;

    /**
     * <p>
     * Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     * destination file system in the replication configuration is in a failed state and is unrecoverable. To access the
     * file system data, restore a backup of the failed file system to a new file system.
     * </p>
     * 
     * @param status
     *        Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     *        destination file system in the replication configuration is in a failed state and is unrecoverable. To
     *        access the file system data, restore a backup of the failed file system to a new file system.
     * @see ReplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     * destination file system in the replication configuration is in a failed state and is unrecoverable. To access the
     * file system data, restore a backup of the failed file system to a new file system.
     * </p>
     * 
     * @return Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     *         destination file system in the replication configuration is in a failed state and is unrecoverable. To
     *         access the file system data, restore a backup of the failed file system to a new file system.
     * @see ReplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     * destination file system in the replication configuration is in a failed state and is unrecoverable. To access the
     * file system data, restore a backup of the failed file system to a new file system.
     * </p>
     * 
     * @param status
     *        Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     *        destination file system in the replication configuration is in a failed state and is unrecoverable. To
     *        access the file system data, restore a backup of the failed file system to a new file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public Destination withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     * destination file system in the replication configuration is in a failed state and is unrecoverable. To access the
     * file system data, restore a backup of the failed file system to a new file system.
     * </p>
     * 
     * @param status
     *        Describes the status of the destination Amazon EFS file system. If the status is <code>ERROR</code>, the
     *        destination file system in the replication configuration is in a failed state and is unrecoverable. To
     *        access the file system data, restore a backup of the failed file system to a new file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public Destination withStatus(ReplicationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the destination Amazon EFS file system.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the destination Amazon EFS file system.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the destination Amazon EFS file system.
     * </p>
     * 
     * @return The ID of the destination Amazon EFS file system.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the destination Amazon EFS file system.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the destination Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the destination file system is located.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the destination file system is located.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the destination file system is located.
     * </p>
     * 
     * @return The Amazon Web Services Region in which the destination file system is located.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the destination file system is located.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region in which the destination file system is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The time when the most recent sync was successfully completed on the destination file system. Any changes to data
     * on the source file system that occurred before this time have been successfully replicated to the destination
     * file system. Any changes that occurred after this time might not be fully replicated.
     * </p>
     * 
     * @param lastReplicatedTimestamp
     *        The time when the most recent sync was successfully completed on the destination file system. Any changes
     *        to data on the source file system that occurred before this time have been successfully replicated to the
     *        destination file system. Any changes that occurred after this time might not be fully replicated.
     */

    public void setLastReplicatedTimestamp(java.util.Date lastReplicatedTimestamp) {
        this.lastReplicatedTimestamp = lastReplicatedTimestamp;
    }

    /**
     * <p>
     * The time when the most recent sync was successfully completed on the destination file system. Any changes to data
     * on the source file system that occurred before this time have been successfully replicated to the destination
     * file system. Any changes that occurred after this time might not be fully replicated.
     * </p>
     * 
     * @return The time when the most recent sync was successfully completed on the destination file system. Any changes
     *         to data on the source file system that occurred before this time have been successfully replicated to the
     *         destination file system. Any changes that occurred after this time might not be fully replicated.
     */

    public java.util.Date getLastReplicatedTimestamp() {
        return this.lastReplicatedTimestamp;
    }

    /**
     * <p>
     * The time when the most recent sync was successfully completed on the destination file system. Any changes to data
     * on the source file system that occurred before this time have been successfully replicated to the destination
     * file system. Any changes that occurred after this time might not be fully replicated.
     * </p>
     * 
     * @param lastReplicatedTimestamp
     *        The time when the most recent sync was successfully completed on the destination file system. Any changes
     *        to data on the source file system that occurred before this time have been successfully replicated to the
     *        destination file system. Any changes that occurred after this time might not be fully replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withLastReplicatedTimestamp(java.util.Date lastReplicatedTimestamp) {
        setLastReplicatedTimestamp(lastReplicatedTimestamp);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getLastReplicatedTimestamp() != null)
            sb.append("LastReplicatedTimestamp: ").append(getLastReplicatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLastReplicatedTimestamp() == null ^ this.getLastReplicatedTimestamp() == null)
            return false;
        if (other.getLastReplicatedTimestamp() != null && other.getLastReplicatedTimestamp().equals(this.getLastReplicatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLastReplicatedTimestamp() == null) ? 0 : getLastReplicatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
