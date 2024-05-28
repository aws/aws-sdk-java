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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/UpdateFileSystemProtection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemProtectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the file system to update.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The status of the file system's replication overwrite protection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     * configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     * configuration. The file system is read-only and can only be modified by EFS replication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     * configuration. The file system is read-only and is only modified only by EFS replication.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the replication configuration is deleted, the file system's replication overwrite protection is re-enabled,
     * the file system becomes writeable.
     * </p>
     */
    private String replicationOverwriteProtection;

    /**
     * <p>
     * The ID of the file system to update.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system to update.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to update.
     * </p>
     * 
     * @return The ID of the file system to update.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to update.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemProtectionRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The status of the file system's replication overwrite protection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     * configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     * configuration. The file system is read-only and can only be modified by EFS replication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     * configuration. The file system is read-only and is only modified only by EFS replication.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the replication configuration is deleted, the file system's replication overwrite protection is re-enabled,
     * the file system becomes writeable.
     * </p>
     * 
     * @param replicationOverwriteProtection
     *        The status of the file system's replication overwrite protection.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     *        configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by
     *        default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     *        configuration. The file system is read-only and can only be modified by EFS replication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     *        configuration. The file system is read-only and is only modified only by EFS replication.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the replication configuration is deleted, the file system's replication overwrite protection is
     *        re-enabled, the file system becomes writeable.
     * @see ReplicationOverwriteProtection
     */

    public void setReplicationOverwriteProtection(String replicationOverwriteProtection) {
        this.replicationOverwriteProtection = replicationOverwriteProtection;
    }

    /**
     * <p>
     * The status of the file system's replication overwrite protection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     * configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     * configuration. The file system is read-only and can only be modified by EFS replication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     * configuration. The file system is read-only and is only modified only by EFS replication.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the replication configuration is deleted, the file system's replication overwrite protection is re-enabled,
     * the file system becomes writeable.
     * </p>
     * 
     * @return The status of the file system's replication overwrite protection.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     *         configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by
     *         default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     *         configuration. The file system is read-only and can only be modified by EFS replication.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     *         configuration. The file system is read-only and is only modified only by EFS replication.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the replication configuration is deleted, the file system's replication overwrite protection is
     *         re-enabled, the file system becomes writeable.
     * @see ReplicationOverwriteProtection
     */

    public String getReplicationOverwriteProtection() {
        return this.replicationOverwriteProtection;
    }

    /**
     * <p>
     * The status of the file system's replication overwrite protection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     * configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     * configuration. The file system is read-only and can only be modified by EFS replication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     * configuration. The file system is read-only and is only modified only by EFS replication.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the replication configuration is deleted, the file system's replication overwrite protection is re-enabled,
     * the file system becomes writeable.
     * </p>
     * 
     * @param replicationOverwriteProtection
     *        The status of the file system's replication overwrite protection.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     *        configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by
     *        default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     *        configuration. The file system is read-only and can only be modified by EFS replication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     *        configuration. The file system is read-only and is only modified only by EFS replication.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the replication configuration is deleted, the file system's replication overwrite protection is
     *        re-enabled, the file system becomes writeable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationOverwriteProtection
     */

    public UpdateFileSystemProtectionRequest withReplicationOverwriteProtection(String replicationOverwriteProtection) {
        setReplicationOverwriteProtection(replicationOverwriteProtection);
        return this;
    }

    /**
     * <p>
     * The status of the file system's replication overwrite protection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     * configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     * configuration. The file system is read-only and can only be modified by EFS replication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     * configuration. The file system is read-only and is only modified only by EFS replication.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the replication configuration is deleted, the file system's replication overwrite protection is re-enabled,
     * the file system becomes writeable.
     * </p>
     * 
     * @param replicationOverwriteProtection
     *        The status of the file system's replication overwrite protection.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The file system cannot be used as the destination file system in a replication
     *        configuration. The file system is writeable. Replication overwrite protection is <code>ENABLED</code> by
     *        default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The file system can be used as the destination file system in a replication
     *        configuration. The file system is read-only and can only be modified by EFS replication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REPLICATING</code> – The file system is being used as the destination file system in a replication
     *        configuration. The file system is read-only and is only modified only by EFS replication.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the replication configuration is deleted, the file system's replication overwrite protection is
     *        re-enabled, the file system becomes writeable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationOverwriteProtection
     */

    public UpdateFileSystemProtectionRequest withReplicationOverwriteProtection(ReplicationOverwriteProtection replicationOverwriteProtection) {
        this.replicationOverwriteProtection = replicationOverwriteProtection.toString();
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getReplicationOverwriteProtection() != null)
            sb.append("ReplicationOverwriteProtection: ").append(getReplicationOverwriteProtection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemProtectionRequest == false)
            return false;
        UpdateFileSystemProtectionRequest other = (UpdateFileSystemProtectionRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getReplicationOverwriteProtection() == null ^ this.getReplicationOverwriteProtection() == null)
            return false;
        if (other.getReplicationOverwriteProtection() != null
                && other.getReplicationOverwriteProtection().equals(this.getReplicationOverwriteProtection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getReplicationOverwriteProtection() == null) ? 0 : getReplicationOverwriteProtection().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemProtectionRequest clone() {
        return (UpdateFileSystemProtectionRequest) super.clone();
    }

}
